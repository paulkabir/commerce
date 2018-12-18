package com.openapi.etsy.service.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.openapi.esty.models.InlineResponse200;
import com.openapi.esty.models.InlineResponse200Result;
import com.openapi.esty.models.Listing;
import com.openapi.esty.models.ShopResponse;
import com.openapi.etsy.service.ShopsListingsSyncronizeService;

@Component
public class ShopsListingsSyncronizeServiceImpl implements ShopsListingsSyncronizeService {

	private static final Logger log = LoggerFactory.getLogger(ShopsListingsSyncronizeServiceImpl.class);

	@Value("${shop.listing.url}")
	private String shopListingsUrl = null;

	@Value("${file.path}")
	private String filePath = null;

	public ResponseEntity<InlineResponse200> synShopsListingDetails(List<String> shopIds) throws Exception {

		RestTemplate restTemplate = new RestTemplate();

		return synShopsListingDetails(shopIds, restTemplate);
	}

	public ResponseEntity<InlineResponse200> synShopsListingDetails(List<String> shopIds, RestTemplate restTemplate)
			throws Exception {

		log.info("Syncing process started for shopIds:{}", shopIds);

		ResponseEntity<InlineResponse200> responseEntity = null;

		try {

			HttpHeaders headers = new HttpHeaders();
			headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
			InlineResponse200 inlineResponse200 = new InlineResponse200();
			for (String shopId : shopIds) {
				ShopResponse response = restTemplate.exchange(String.format(shopListingsUrl, shopId), HttpMethod.GET, requestEntity, ShopResponse.class).getBody();
				InlineResponse200Result response200Result = syncShopsDetails(response.getResults(), shopId);
				inlineResponse200.addResult(response200Result);

				responseEntity = new ResponseEntity<InlineResponse200>(inlineResponse200, HttpStatus.OK);
			}
		} catch (Exception e) {
			log.error("Error occured while syncing shops {}", e);
			throw e;
		} finally {
			log.info("Syncing process end");
		}

		return responseEntity;
	}

	private InlineResponse200Result syncShopsDetails(List<Listing> listings, String shopId) throws IOException {

		InlineResponse200Result result = new InlineResponse200Result();

		result.setShopId(shopId);
		String fileName = filePath + shopId + ".txt";

		Path path = Paths.get(fileName);

		List<String> presentListings = listings.stream()
				.map(listing -> listing.getListing_id().toString() + " " + listing.getTitle())
				.collect(Collectors.toList());

		boolean isfileExisted = Files.exists(path);
		if (!isfileExisted) {
			try {
				Files.createDirectories(path.getParent());
				Files.createFile(path);
			} catch (IOException e) {
				e.printStackTrace();
			}
			result.setAddedLisitngs(presentListings);

		} else {
			List<String> existingListings = Files.readAllLines(Paths.get(fileName));
			List<String> newlyAdded = new ArrayList<>(presentListings);
			newlyAdded.removeAll(existingListings);
			List<String> removedListings = new ArrayList<>(existingListings);
			removedListings.removeAll(presentListings);
			result.setAddedLisitngs(newlyAdded);
			result.setRemovedListings(removedListings);

		}
		Files.write(path, presentListings);

		return result;
	}
}
