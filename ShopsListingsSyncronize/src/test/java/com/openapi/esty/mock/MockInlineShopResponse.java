package com.openapi.esty.mock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.openapi.esty.models.Listing;
import com.openapi.esty.models.ShopResponse;

public class MockInlineShopResponse {

	public static ResponseEntity<ShopResponse> buildShopsResponse() {

		ResponseEntity<ShopResponse> responseEntity = null;

		ShopResponse response = new ShopResponse();

		response.setCount(9);

		List<Listing> listings = new ArrayList<>();
		Listing listing = new Listing();
		listing.setListing_id(667868043);
		listing.setCategory_id(69150433);
		listing.setShop_section_id(25342184);
		listing.setTitle("2 sheets A4 21x29.7cm Japanese Yuzen Washi Chiyogami Papers P25");
		listings.add(listing);

		response.setResults(listings);

		responseEntity = new ResponseEntity<ShopResponse>(response, HttpStatus.OK);

		return responseEntity;

	}

}
