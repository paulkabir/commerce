
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
    "limit",
    "offset",
    "page",
    "shop_id",
    "keywords",
    "sort_on",
    "sort_order",
    "min_price",
    "max_price",
    "color",
    "color_accuracy",
    "tags",
    "category",
    "translate_keywords",
    "include_private"
})
public class Params {

    @JsonProperty("limit")
    private Integer limit;
    @JsonProperty("offset")
    private Integer offset;
    @JsonProperty("page")
    private Object page;
    @JsonProperty("shop_id")
    private String shop_id;
    @JsonProperty("keywords")
    private Object keywords;
    @JsonProperty("sort_on")
    private String sort_on;
    @JsonProperty("sort_order")
    private String sort_order;
    @JsonProperty("min_price")
    private Object min_price;
    @JsonProperty("max_price")
    private Object max_price;
    @JsonProperty("color")
    private Object color;
    @JsonProperty("color_accuracy")
    private Integer color_accuracy;
    @JsonProperty("tags")
    private Object tags;
    @JsonProperty("category")
    private Object category;
    @JsonProperty("translate_keywords")
    private String translate_keywords;
    @JsonProperty("include_private")
    private Integer include_private;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("limit")
    public Integer getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @JsonProperty("offset")
    public Integer getOffset() {
        return offset;
    }

    @JsonProperty("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @JsonProperty("page")
    public Object getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(Object page) {
        this.page = page;
    }

    @JsonProperty("shop_id")
    public String getShop_id() {
        return shop_id;
    }

    @JsonProperty("shop_id")
    public void setShop_id(String shop_id) {
        this.shop_id = shop_id;
    }

    @JsonProperty("keywords")
    public Object getKeywords() {
        return keywords;
    }

    @JsonProperty("keywords")
    public void setKeywords(Object keywords) {
        this.keywords = keywords;
    }

    @JsonProperty("sort_on")
    public String getSort_on() {
        return sort_on;
    }

    @JsonProperty("sort_on")
    public void setSort_on(String sort_on) {
        this.sort_on = sort_on;
    }

    @JsonProperty("sort_order")
    public String getSort_order() {
        return sort_order;
    }

    @JsonProperty("sort_order")
    public void setSort_order(String sort_order) {
        this.sort_order = sort_order;
    }

    @JsonProperty("min_price")
    public Object getMin_price() {
        return min_price;
    }

    @JsonProperty("min_price")
    public void setMin_price(Object min_price) {
        this.min_price = min_price;
    }

    @JsonProperty("max_price")
    public Object getMax_price() {
        return max_price;
    }

    @JsonProperty("max_price")
    public void setMax_price(Object max_price) {
        this.max_price = max_price;
    }

    @JsonProperty("color")
    public Object getColor() {
        return color;
    }

    @JsonProperty("color")
    public void setColor(Object color) {
        this.color = color;
    }

    @JsonProperty("color_accuracy")
    public Integer getColor_accuracy() {
        return color_accuracy;
    }

    @JsonProperty("color_accuracy")
    public void setColor_accuracy(Integer color_accuracy) {
        this.color_accuracy = color_accuracy;
    }

    @JsonProperty("tags")
    public Object getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(Object tags) {
        this.tags = tags;
    }

    @JsonProperty("category")
    public Object getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(Object category) {
        this.category = category;
    }

    @JsonProperty("translate_keywords")
    public String getTranslate_keywords() {
        return translate_keywords;
    }

    @JsonProperty("translate_keywords")
    public void setTranslate_keywords(String translate_keywords) {
        this.translate_keywords = translate_keywords;
    }

    @JsonProperty("include_private")
    public Integer getInclude_private() {
        return include_private;
    }

    @JsonProperty("include_private")
    public void setInclude_private(Integer include_private) {
        this.include_private = include_private;
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
