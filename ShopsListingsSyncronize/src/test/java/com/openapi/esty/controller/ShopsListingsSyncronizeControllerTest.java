package com.openapi.esty.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.openapi.esty.ShopsListingsSyncronizeApplicationTest;
import com.openapi.esty.mock.MockInlineResponse;
import com.openapi.etsy.controller.ShopsListingsSyncronizeController;
import com.openapi.etsy.service.ShopsListingsSyncronizeService;

public class ShopsListingsSyncronizeControllerTest extends ShopsListingsSyncronizeApplicationTest {

	@MockBean
	ShopsListingsSyncronizeService service;

	private MockMvc mockMvc;

	@InjectMocks
	ShopsListingsSyncronizeController synController;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(synController).build();
	}

	@Test
	public void testSyncronizeShopsListing() throws Exception {

		Mockito.when(service.synShopsListingDetails(Mockito.any())).thenReturn(MockInlineResponse.buildInline200());

		MvcResult mvcResult = mockMvc.perform(
				MockMvcRequestBuilders.get("/shops/listings/syncronize").accept(MediaType.APPLICATION_JSON_VALUE)
						.param("shopIds", "19147615").header("X-Correlation-ID", "87876576"))
				.andReturn();

		int status = mvcResult.getResponse().getStatus();

		assertEquals(200, status);

	}

}
