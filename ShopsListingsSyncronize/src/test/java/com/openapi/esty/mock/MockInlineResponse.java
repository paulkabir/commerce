package com.openapi.esty.mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.openapi.esty.models.InlineResponse200;
import com.openapi.esty.models.InlineResponse200Result;

public class MockInlineResponse {

	public static ResponseEntity<InlineResponse200> buildInline200() {

		ResponseEntity<InlineResponse200> responseEntity = null;

		InlineResponse200 response200 = new InlineResponse200();
		List<InlineResponse200Result> results = new ArrayList<>();
		InlineResponse200Result response200Result = new InlineResponse200Result();
		response200Result.setShopId("19147615");

		List<String> addedLisitng = Arrays.asList("");
		List<String> removedListings = Arrays.asList("");
		response200Result.setAddedLisitngs(addedLisitng);
		response200Result.setRemovedListings(removedListings);
		results.add(response200Result);
		response200.setResults(results);

		responseEntity = new ResponseEntity<InlineResponse200>(response200, HttpStatus.OK);
		return responseEntity;
	}

}
