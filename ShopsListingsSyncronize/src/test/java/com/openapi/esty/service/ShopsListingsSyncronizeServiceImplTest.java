package com.openapi.esty.service;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.openapi.esty.ShopsListingsSyncronizeApplicationTest;
import com.openapi.esty.mock.MockInlineShopResponse;
import com.openapi.esty.models.InlineResponse200;
import com.openapi.esty.models.ShopResponse;
import com.openapi.etsy.service.impl.ShopsListingsSyncronizeServiceImpl;

public class ShopsListingsSyncronizeServiceImplTest extends ShopsListingsSyncronizeApplicationTest {

	@Autowired
	ShopsListingsSyncronizeServiceImpl synCservice;

	@MockBean
	RestTemplate restTemplate;

	@Test
	public void synShopsListingDetailsTest() throws Exception {

		List<String> shopIds = Arrays.asList("19147615");

		Mockito.when(restTemplate.exchange(Matchers.anyString(), Matchers.any(HttpMethod.class),
				Matchers.<HttpEntity<?>>any(), Matchers.<Class<ShopResponse>>any()))
				.thenReturn(MockInlineShopResponse.buildShopsResponse());

		ResponseEntity<InlineResponse200> result = synCservice.synShopsListingDetails(shopIds, restTemplate);


		assertEquals(HttpStatus.OK, result.getStatusCode());
	}

}
