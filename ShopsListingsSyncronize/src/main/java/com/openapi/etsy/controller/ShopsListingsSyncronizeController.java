package com.openapi.etsy.controller;

import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.openapi.esty.exception.handler.GlobalExceptionHandler;
import com.openapi.esty.models.InlineResponse200;
import com.openapi.etsy.service.ShopsListingsSyncronizeService;

@RestController
public class ShopsListingsSyncronizeController {

	private static Logger log = LoggerFactory.getLogger(ShopsListingsSyncronizeController.class);

	@Autowired
	ShopsListingsSyncronizeService ctService;

	@Autowired
	GlobalExceptionHandler exceptionHanlder;

	@GetMapping("/shops/listings/syncronize")
	public ResponseEntity<InlineResponse200> syncronizeShopsListing(
			@RequestParam(name = "shopIds", required = true) List<String> shopIds,
			@RequestHeader(name = "X-Correlation-ID", required = false) String xCorrelationID) {

		ResponseEntity<InlineResponse200> responseEntity = null;

		try {

			if (xCorrelationID == null)
				xCorrelationID = UUID.randomUUID().toString();

			MDC.put("X-Correlation-ID", xCorrelationID);

			log.debug("shopIds:{}", shopIds);

			responseEntity = ctService.synShopsListingDetails(shopIds);

			log.debug("responseEntity:{}", responseEntity);

		} catch (Exception ex) {
			exceptionHanlder.handle(ex);
		}

		return responseEntity;
	}

}
