package com.openapi.esty.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InlineResponse200 {

	@JsonProperty("results")
	private List<InlineResponse200Result> results;

	public List<InlineResponse200Result> getResults() {
		return results;
	}

	public void setResults(List<InlineResponse200Result> results) {
		this.results = results;
	}

	public void addResult(InlineResponse200Result result) {
		if(this.results==null) {
			results=new ArrayList<>();
		}
		results.add(result);
	}
	

}
