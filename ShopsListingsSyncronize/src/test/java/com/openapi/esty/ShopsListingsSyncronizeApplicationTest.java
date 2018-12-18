package com.openapi.esty;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.openapi.etsy.ShopsListingsSyncronizeApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ShopsListingsSyncronizeApplication.class)
@WebAppConfiguration
@ActiveProfiles("test")
@TestPropertySource(locations = "classpath:application-test.properties")
public class ShopsListingsSyncronizeApplicationTest {


	@Test
	public void contextLoads() {
	}

}
