package com.openapi.esty.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InlineResponse200Result {


	@JsonProperty("shop_id")
	private String shopId;
	
	@JsonProperty("added_listings")
	private List<String> addedLisitngs;
	
	@JsonProperty("removed_listings")
	private List<String> removedListings;

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public List<String> getAddedLisitngs() {
		return addedLisitngs;
	}

	public void setAddedLisitngs(List<String> addedLisitngs) {
		this.addedLisitngs = addedLisitngs;
	}

	public List<String> getRemovedListings() {
		return removedListings;
	}

	public void setRemovedListings(List<String> removedListings) {
		this.removedListings = removedListings;
	}

	public void addListing(String listing) {
		if(this.addedLisitngs==null) {
			addedLisitngs=new  ArrayList<>();
		}
		addedLisitngs.add(listing);
	}
	
	public void removeListing(String listing) {
		if(this.removedListings==null) {
			removedListings=new  ArrayList<>();
		}
		removedListings.add(listing);
	}
	
	

}
