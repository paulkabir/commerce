
package com.openapi.esty.models;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "effective_limit",
    "effective_offset",
    "next_offset",
    "effective_page",
    "next_page"
})
public class Pagination {

    @JsonProperty("effective_limit")
    private Integer effective_limit;
    @JsonProperty("effective_offset")
    private Integer effective_offset;
    @JsonProperty("next_offset")
    private Object next_offset;
    @JsonProperty("effective_page")
    private Integer effective_page;
    @JsonProperty("next_page")
    private Object next_page;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("effective_limit")
    public Integer getEffective_limit() {
        return effective_limit;
    }

    @JsonProperty("effective_limit")
    public void setEffective_limit(Integer effective_limit) {
        this.effective_limit = effective_limit;
    }

    @JsonProperty("effective_offset")
    public Integer getEffective_offset() {
        return effective_offset;
    }

    @JsonProperty("effective_offset")
    public void setEffective_offset(Integer effective_offset) {
        this.effective_offset = effective_offset;
    }

    @JsonProperty("next_offset")
    public Object getNext_offset() {
        return next_offset;
    }

    @JsonProperty("next_offset")
    public void setNext_offset(Object next_offset) {
        this.next_offset = next_offset;
    }

    @JsonProperty("effective_page")
    public Integer getEffective_page() {
        return effective_page;
    }

    @JsonProperty("effective_page")
    public void setEffective_page(Integer effective_page) {
        this.effective_page = effective_page;
    }

    @JsonProperty("next_page")
    public Object getNext_page() {
        return next_page;
    }

    @JsonProperty("next_page")
    public void setNext_page(Object next_page) {
        this.next_page = next_page;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
