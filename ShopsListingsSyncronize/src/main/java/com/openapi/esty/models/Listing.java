
package com.openapi.esty.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "listing_id",
    "state",
    "user_id",
    "category_id",
    "title",
    "description",
    "creation_tsz",
    "ending_tsz",
    "original_creation_tsz",
    "last_modified_tsz",
    "price",
    "currency_code",
    "quantity",
    "sku",
    "tags",
    "category_path",
    "category_path_ids",
    "materials",
    "shop_section_id",
    "featured_rank",
    "state_tsz",
    "url",
    "views",
    "num_favorers",
    "shipping_template_id",
    "processing_min",
    "processing_max",
    "who_made",
    "is_supply",
    "when_made",
    "item_weight",
    "item_weight_unit",
    "item_length",
    "item_width",
    "item_height",
    "item_dimensions_unit",
    "is_private",
    "recipient",
    "occasion",
    "style",
    "non_taxable",
    "is_customizable",
    "is_digital",
    "file_data",
    "should_auto_renew",
    "language",
    "has_variations",
    "taxonomy_id",
    "taxonomy_path",
    "used_manufacturer"
})
public class Listing {

    @JsonProperty("listing_id")
    private Integer listing_id;
    @JsonProperty("state")
    private String state;
    @JsonProperty("user_id")
    private Integer user_id;
    @JsonProperty("category_id")
    private Integer category_id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("creation_tsz")
    private Integer creation_tsz;
    @JsonProperty("ending_tsz")
    private Integer ending_tsz;
    @JsonProperty("original_creation_tsz")
    private Integer original_creation_tsz;
    @JsonProperty("last_modified_tsz")
    private Integer last_modified_tsz;
    @JsonProperty("price")
    private String price;
    @JsonProperty("currency_code")
    private String currency_code;
    @JsonProperty("quantity")
    private Integer quantity;
    @JsonProperty("sku")
    private List<Object> sku = null;
    @JsonProperty("tags")
    private List<String> tags = null;
    @JsonProperty("category_path")
    private List<String> category_path = null;
    @JsonProperty("category_path_ids")
    private List<Integer> category_path_ids = null;
    @JsonProperty("materials")
    private List<String> materials = null;
    @JsonProperty("shop_section_id")
    private Object shop_section_id;
    @JsonProperty("featured_rank")
    private Object featured_rank;
    @JsonProperty("state_tsz")
    private Integer state_tsz;
    @JsonProperty("url")
    private String url;
    @JsonProperty("views")
    private Integer views;
    @JsonProperty("num_favorers")
    private Integer num_favorers;
    @JsonProperty("shipping_template_id")
    private Object shipping_template_id;
    @JsonProperty("processing_min")
    private Integer processing_min;
    @JsonProperty("processing_max")
    private Integer processing_max;
    @JsonProperty("who_made")
    private String who_made;
    @JsonProperty("is_supply")
    private String is_supply;
    @JsonProperty("when_made")
    private String when_made;
    @JsonProperty("item_weight")
    private Object item_weight;
    @JsonProperty("item_weight_unit")
    private String item_weight_unit;
    @JsonProperty("item_length")
    private Object item_length;
    @JsonProperty("item_width")
    private Object item_width;
    @JsonProperty("item_height")
    private Object item_height;
    @JsonProperty("item_dimensions_unit")
    private String item_dimensions_unit;
    @JsonProperty("is_private")
    private Boolean is_private;
    @JsonProperty("recipient")
    private Object recipient;
    @JsonProperty("occasion")
    private Object occasion;
    @JsonProperty("style")
    private Object style;
    @JsonProperty("non_taxable")
    private Boolean non_taxable;
    @JsonProperty("is_customizable")
    private Boolean is_customizable;
    @JsonProperty("is_digital")
    private Boolean is_digital;
    @JsonProperty("file_data")
    private String file_data;
    @JsonProperty("should_auto_renew")
    private Boolean should_auto_renew;
    @JsonProperty("language")
    private String language;
    @JsonProperty("has_variations")
    private Boolean has_variations;
    @JsonProperty("taxonomy_id")
    private Integer taxonomy_id;
    @JsonProperty("taxonomy_path")
    private List<String> taxonomy_path = null;
    @JsonProperty("used_manufacturer")
    private Boolean used_manufacturer;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("listing_id")
    public Integer getListing_id() {
        return listing_id;
    }

    @JsonProperty("listing_id")
    public void setListing_id(Integer listing_id) {
        this.listing_id = listing_id;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("user_id")
    public Integer getUser_id() {
        return user_id;
    }

    @JsonProperty("user_id")
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    @JsonProperty("category_id")
    public Integer getCategory_id() {
        return category_id;
    }

    @JsonProperty("category_id")
    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("creation_tsz")
    public Integer getCreation_tsz() {
        return creation_tsz;
    }

    @JsonProperty("creation_tsz")
    public void setCreation_tsz(Integer creation_tsz) {
        this.creation_tsz = creation_tsz;
    }

    @JsonProperty("ending_tsz")
    public Integer getEnding_tsz() {
        return ending_tsz;
    }

    @JsonProperty("ending_tsz")
    public void setEnding_tsz(Integer ending_tsz) {
        this.ending_tsz = ending_tsz;
    }

    @JsonProperty("original_creation_tsz")
    public Integer getOriginal_creation_tsz() {
        return original_creation_tsz;
    }

    @JsonProperty("original_creation_tsz")
    public void setOriginal_creation_tsz(Integer original_creation_tsz) {
        this.original_creation_tsz = original_creation_tsz;
    }

    @JsonProperty("last_modified_tsz")
    public Integer getLast_modified_tsz() {
        return last_modified_tsz;
    }

    @JsonProperty("last_modified_tsz")
    public void setLast_modified_tsz(Integer last_modified_tsz) {
        this.last_modified_tsz = last_modified_tsz;
    }

    @JsonProperty("price")
    public String getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(String price) {
        this.price = price;
    }

    @JsonProperty("currency_code")
    public String getCurrency_code() {
        return currency_code;
    }

    @JsonProperty("currency_code")
    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }

    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("sku")
    public List<Object> getSku() {
        return sku;
    }

    @JsonProperty("sku")
    public void setSku(List<Object> sku) {
        this.sku = sku;
    }

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @JsonProperty("category_path")
    public List<String> getCategory_path() {
        return category_path;
    }

    @JsonProperty("category_path")
    public void setCategory_path(List<String> category_path) {
        this.category_path = category_path;
    }

    @JsonProperty("category_path_ids")
    public List<Integer> getCategory_path_ids() {
        return category_path_ids;
    }

    @JsonProperty("category_path_ids")
    public void setCategory_path_ids(List<Integer> category_path_ids) {
        this.category_path_ids = category_path_ids;
    }

    @JsonProperty("materials")
    public List<String> getMaterials() {
        return materials;
    }

    @JsonProperty("materials")
    public void setMaterials(List<String> materials) {
        this.materials = materials;
    }

    @JsonProperty("shop_section_id")
    public Object getShop_section_id() {
        return shop_section_id;
    }

    @JsonProperty("shop_section_id")
    public void setShop_section_id(Object shop_section_id) {
        this.shop_section_id = shop_section_id;
    }

    @JsonProperty("featured_rank")
    public Object getFeatured_rank() {
        return featured_rank;
    }

    @JsonProperty("featured_rank")
    public void setFeatured_rank(Object featured_rank) {
        this.featured_rank = featured_rank;
    }

    @JsonProperty("state_tsz")
    public Integer getState_tsz() {
        return state_tsz;
    }

    @JsonProperty("state_tsz")
    public void setState_tsz(Integer state_tsz) {
        this.state_tsz = state_tsz;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("views")
    public Integer getViews() {
        return views;
    }

    @JsonProperty("views")
    public void setViews(Integer views) {
        this.views = views;
    }

    @JsonProperty("num_favorers")
    public Integer getNum_favorers() {
        return num_favorers;
    }

    @JsonProperty("num_favorers")
    public void setNum_favorers(Integer num_favorers) {
        this.num_favorers = num_favorers;
    }

    @JsonProperty("shipping_template_id")
    public Object getShipping_template_id() {
        return shipping_template_id;
    }

    @JsonProperty("shipping_template_id")
    public void setShipping_template_id(Object shipping_template_id) {
        this.shipping_template_id = shipping_template_id;
    }

    @JsonProperty("processing_min")
    public Integer getProcessing_min() {
        return processing_min;
    }

    @JsonProperty("processing_min")
    public void setProcessing_min(Integer processing_min) {
        this.processing_min = processing_min;
    }

    @JsonProperty("processing_max")
    public Integer getProcessing_max() {
        return processing_max;
    }

    @JsonProperty("processing_max")
    public void setProcessing_max(Integer processing_max) {
        this.processing_max = processing_max;
    }

    @JsonProperty("who_made")
    public String getWho_made() {
        return who_made;
    }

    @JsonProperty("who_made")
    public void setWho_made(String who_made) {
        this.who_made = who_made;
    }

    @JsonProperty("is_supply")
    public String getIs_supply() {
        return is_supply;
    }

    @JsonProperty("is_supply")
    public void setIs_supply(String is_supply) {
        this.is_supply = is_supply;
    }

    @JsonProperty("when_made")
    public String getWhen_made() {
        return when_made;
    }

    @JsonProperty("when_made")
    public void setWhen_made(String when_made) {
        this.when_made = when_made;
    }

    @JsonProperty("item_weight")
    public Object getItem_weight() {
        return item_weight;
    }

    @JsonProperty("item_weight")
    public void setItem_weight(Object item_weight) {
        this.item_weight = item_weight;
    }

    @JsonProperty("item_weight_unit")
    public String getItem_weight_unit() {
        return item_weight_unit;
    }

    @JsonProperty("item_weight_unit")
    public void setItem_weight_unit(String item_weight_unit) {
        this.item_weight_unit = item_weight_unit;
    }

    @JsonProperty("item_length")
    public Object getItem_length() {
        return item_length;
    }

    @JsonProperty("item_length")
    public void setItem_length(Object item_length) {
        this.item_length = item_length;
    }

    @JsonProperty("item_width")
    public Object getItem_width() {
        return item_width;
    }

    @JsonProperty("item_width")
    public void setItem_width(Object item_width) {
        this.item_width = item_width;
    }

    @JsonProperty("item_height")
    public Object getItem_height() {
        return item_height;
    }

    @JsonProperty("item_height")
    public void setItem_height(Object item_height) {
        this.item_height = item_height;
    }

    @JsonProperty("item_dimensions_unit")
    public String getItem_dimensions_unit() {
        return item_dimensions_unit;
    }

    @JsonProperty("item_dimensions_unit")
    public void setItem_dimensions_unit(String item_dimensions_unit) {
        this.item_dimensions_unit = item_dimensions_unit;
    }

    @JsonProperty("is_private")
    public Boolean getIs_private() {
        return is_private;
    }

    @JsonProperty("is_private")
    public void setIs_private(Boolean is_private) {
        this.is_private = is_private;
    }

    @JsonProperty("recipient")
    public Object getRecipient() {
        return recipient;
    }

    @JsonProperty("recipient")
    public void setRecipient(Object recipient) {
        this.recipient = recipient;
    }

    @JsonProperty("occasion")
    public Object getOccasion() {
        return occasion;
    }

    @JsonProperty("occasion")
    public void setOccasion(Object occasion) {
        this.occasion = occasion;
    }

    @JsonProperty("style")
    public Object getStyle() {
        return style;
    }

    @JsonProperty("style")
    public void setStyle(Object style) {
        this.style = style;
    }

    @JsonProperty("non_taxable")
    public Boolean getNon_taxable() {
        return non_taxable;
    }

    @JsonProperty("non_taxable")
    public void setNon_taxable(Boolean non_taxable) {
        this.non_taxable = non_taxable;
    }

    @JsonProperty("is_customizable")
    public Boolean getIs_customizable() {
        return is_customizable;
    }

    @JsonProperty("is_customizable")
    public void setIs_customizable(Boolean is_customizable) {
        this.is_customizable = is_customizable;
    }

    @JsonProperty("is_digital")
    public Boolean getIs_digital() {
        return is_digital;
    }

    @JsonProperty("is_digital")
    public void setIs_digital(Boolean is_digital) {
        this.is_digital = is_digital;
    }

    @JsonProperty("file_data")
    public String getFile_data() {
        return file_data;
    }

    @JsonProperty("file_data")
    public void setFile_data(String file_data) {
        this.file_data = file_data;
    }

    @JsonProperty("should_auto_renew")
    public Boolean getShould_auto_renew() {
        return should_auto_renew;
    }

    @JsonProperty("should_auto_renew")
    public void setShould_auto_renew(Boolean should_auto_renew) {
        this.should_auto_renew = should_auto_renew;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("has_variations")
    public Boolean getHas_variations() {
        return has_variations;
    }

    @JsonProperty("has_variations")
    public void setHas_variations(Boolean has_variations) {
        this.has_variations = has_variations;
    }

    @JsonProperty("taxonomy_id")
    public Integer getTaxonomy_id() {
        return taxonomy_id;
    }

    @JsonProperty("taxonomy_id")
    public void setTaxonomy_id(Integer taxonomy_id) {
        this.taxonomy_id = taxonomy_id;
    }

    @JsonProperty("taxonomy_path")
    public List<String> getTaxonomy_path() {
        return taxonomy_path;
    }

    @JsonProperty("taxonomy_path")
    public void setTaxonomy_path(List<String> taxonomy_path) {
        this.taxonomy_path = taxonomy_path;
    }

    @JsonProperty("used_manufacturer")
    public Boolean getUsed_manufacturer() {
        return used_manufacturer;
    }

    @JsonProperty("used_manufacturer")
    public void setUsed_manufacturer(Boolean used_manufacturer) {
        this.used_manufacturer = used_manufacturer;
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
