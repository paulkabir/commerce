package com.openapi.etsy.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.openapi.esty.models.InlineResponse200;

@Component
public interface ShopsListingsSyncronizeService {

	public ResponseEntity<InlineResponse200> synShopsListingDetails(List<String> shopIds) throws Exception;
}
