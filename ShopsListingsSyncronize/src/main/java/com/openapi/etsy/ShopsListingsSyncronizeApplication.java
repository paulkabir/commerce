package com.openapi.etsy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.openapi.*")
public class ShopsListingsSyncronizeApplication {

	private static Logger log = LoggerFactory.getLogger(ShopsListingsSyncronizeApplication.class);

	public static void main(String[] args) {
		log.debug("Starting the application.");
		SpringApplication.run(ShopsListingsSyncronizeApplication.class, args);
	}
}
