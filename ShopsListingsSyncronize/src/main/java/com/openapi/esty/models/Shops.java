
package com.openapi.esty.models;

import java.io.Serializable;
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
    "shop_id",
    "shop_name",
    "user_id",
    "creation_tsz",
    "title",
    "announcement",
    "currency_code",
    "is_vacation",
    "vacation_message",
    "sale_message",
    "digital_sale_message",
    "last_updated_tsz",
    "listing_active_count",
    "digital_listing_count",
    "login_name",
    "accepts_custom_requests",
    "policy_welcome",
    "policy_payment",
    "policy_shipping",
    "policy_refunds",
    "policy_additional",
    "policy_seller_info",
    "policy_updated_tsz",
    "policy_has_private_receipt_info",
    "vacation_autoreply",
    "url",
    "image_url_760x100",
    "num_favorers",
    "languages",
    "upcoming_local_event_id",
    "icon_url_fullxfull",
    "is_using_structured_policies",
    "has_onboarded_structured_policies",
    "has_unstructured_policies",
    "include_dispute_form_link",
    "is_direct_checkout_onboarded",
    "policy_privacy",
    "is_calculated_eligible"
})
public class Shops implements Serializable
{

    @JsonProperty("shop_id")
    private Integer shop_id;
    @JsonProperty("shop_name")
    private String shop_name;
    @JsonProperty("user_id")
    private Integer user_id;
    @JsonProperty("creation_tsz")
    private Integer creation_tsz;
    @JsonProperty("title")
    private Object title;
    @JsonProperty("announcement")
    private Object announcement;
    @JsonProperty("currency_code")
    private String currency_code;
    @JsonProperty("is_vacation")
    private Boolean is_vacation;
    @JsonProperty("vacation_message")
    private Object vacation_message;
    @JsonProperty("sale_message")
    private Object sale_message;
    @JsonProperty("digital_sale_message")
    private Object digital_sale_message;
    @JsonProperty("last_updated_tsz")
    private Integer last_updated_tsz;
    @JsonProperty("listing_active_count")
    private Integer listing_active_count;
    @JsonProperty("digital_listing_count")
    private Integer digital_listing_count;
    @JsonProperty("login_name")
    private String login_name;
    @JsonProperty("accepts_custom_requests")
    private Boolean accepts_custom_requests;
    @JsonProperty("policy_welcome")
    private Object policy_welcome;
    @JsonProperty("policy_payment")
    private Object policy_payment;
    @JsonProperty("policy_shipping")
    private Object policy_shipping;
    @JsonProperty("policy_refunds")
    private Object policy_refunds;
    @JsonProperty("policy_additional")
    private Object policy_additional;
    @JsonProperty("policy_seller_info")
    private Object policy_seller_info;
    @JsonProperty("policy_updated_tsz")
    private Integer policy_updated_tsz;
    @JsonProperty("policy_has_private_receipt_info")
    private Boolean policy_has_private_receipt_info;
    @JsonProperty("vacation_autoreply")
    private Object vacation_autoreply;
    @JsonProperty("url")
    private String url;
    @JsonProperty("image_url_760x100")
    private Object image_url_760x100;
    @JsonProperty("num_favorers")
    private Integer num_favorers;
    @JsonProperty("languages")
    private List<String> languages = null;
    @JsonProperty("upcoming_local_event_id")
    private Object upcoming_local_event_id;
    @JsonProperty("icon_url_fullxfull")
    private Object icon_url_fullxfull;
    @JsonProperty("is_using_structured_policies")
    private Boolean is_using_structured_policies;
    @JsonProperty("has_onboarded_structured_policies")
    private Boolean has_onboarded_structured_policies;
    @JsonProperty("has_unstructured_policies")
    private Boolean has_unstructured_policies;
    @JsonProperty("include_dispute_form_link")
    private Boolean include_dispute_form_link;
    @JsonProperty("is_direct_checkout_onboarded")
    private Boolean is_direct_checkout_onboarded;
    @JsonProperty("policy_privacy")
    private Object policy_privacy;
    @JsonProperty("is_calculated_eligible")
    private Boolean is_calculated_eligible;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1872125796515835930L;

    @JsonProperty("shop_id")
    public Integer getShop_id() {
        return shop_id;
    }

    @JsonProperty("shop_id")
    public void setShop_id(Integer shop_id) {
        this.shop_id = shop_id;
    }

    @JsonProperty("shop_name")
    public String getShop_name() {
        return shop_name;
    }

    @JsonProperty("shop_name")
    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    @JsonProperty("user_id")
    public Integer getUser_id() {
        return user_id;
    }

    @JsonProperty("user_id")
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    @JsonProperty("creation_tsz")
    public Integer getCreation_tsz() {
        return creation_tsz;
    }

    @JsonProperty("creation_tsz")
    public void setCreation_tsz(Integer creation_tsz) {
        this.creation_tsz = creation_tsz;
    }

    @JsonProperty("title")
    public Object getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(Object title) {
        this.title = title;
    }

    @JsonProperty("announcement")
    public Object getAnnouncement() {
        return announcement;
    }

    @JsonProperty("announcement")
    public void setAnnouncement(Object announcement) {
        this.announcement = announcement;
    }

    @JsonProperty("currency_code")
    public String getCurrency_code() {
        return currency_code;
    }

    @JsonProperty("currency_code")
    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }

    @JsonProperty("is_vacation")
    public Boolean getIs_vacation() {
        return is_vacation;
    }

    @JsonProperty("is_vacation")
    public void setIs_vacation(Boolean is_vacation) {
        this.is_vacation = is_vacation;
    }

    @JsonProperty("vacation_message")
    public Object getVacation_message() {
        return vacation_message;
    }

    @JsonProperty("vacation_message")
    public void setVacation_message(Object vacation_message) {
        this.vacation_message = vacation_message;
    }

    @JsonProperty("sale_message")
    public Object getSale_message() {
        return sale_message;
    }

    @JsonProperty("sale_message")
    public void setSale_message(Object sale_message) {
        this.sale_message = sale_message;
    }

    @JsonProperty("digital_sale_message")
    public Object getDigital_sale_message() {
        return digital_sale_message;
    }

    @JsonProperty("digital_sale_message")
    public void setDigital_sale_message(Object digital_sale_message) {
        this.digital_sale_message = digital_sale_message;
    }

    @JsonProperty("last_updated_tsz")
    public Integer getLast_updated_tsz() {
        return last_updated_tsz;
    }

    @JsonProperty("last_updated_tsz")
    public void setLast_updated_tsz(Integer last_updated_tsz) {
        this.last_updated_tsz = last_updated_tsz;
    }

    @JsonProperty("listing_active_count")
    public Integer getListing_active_count() {
        return listing_active_count;
    }

    @JsonProperty("listing_active_count")
    public void setListing_active_count(Integer listing_active_count) {
        this.listing_active_count = listing_active_count;
    }

    @JsonProperty("digital_listing_count")
    public Integer getDigital_listing_count() {
        return digital_listing_count;
    }

    @JsonProperty("digital_listing_count")
    public void setDigital_listing_count(Integer digital_listing_count) {
        this.digital_listing_count = digital_listing_count;
    }

    @JsonProperty("login_name")
    public String getLogin_name() {
        return login_name;
    }

    @JsonProperty("login_name")
    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    @JsonProperty("accepts_custom_requests")
    public Boolean getAccepts_custom_requests() {
        return accepts_custom_requests;
    }

    @JsonProperty("accepts_custom_requests")
    public void setAccepts_custom_requests(Boolean accepts_custom_requests) {
        this.accepts_custom_requests = accepts_custom_requests;
    }

    @JsonProperty("policy_welcome")
    public Object getPolicy_welcome() {
        return policy_welcome;
    }

    @JsonProperty("policy_welcome")
    public void setPolicy_welcome(Object policy_welcome) {
        this.policy_welcome = policy_welcome;
    }

    @JsonProperty("policy_payment")
    public Object getPolicy_payment() {
        return policy_payment;
    }

    @JsonProperty("policy_payment")
    public void setPolicy_payment(Object policy_payment) {
        this.policy_payment = policy_payment;
    }

    @JsonProperty("policy_shipping")
    public Object getPolicy_shipping() {
        return policy_shipping;
    }

    @JsonProperty("policy_shipping")
    public void setPolicy_shipping(Object policy_shipping) {
        this.policy_shipping = policy_shipping;
    }

    @JsonProperty("policy_refunds")
    public Object getPolicy_refunds() {
        return policy_refunds;
    }

    @JsonProperty("policy_refunds")
    public void setPolicy_refunds(Object policy_refunds) {
        this.policy_refunds = policy_refunds;
    }

    @JsonProperty("policy_additional")
    public Object getPolicy_additional() {
        return policy_additional;
    }

    @JsonProperty("policy_additional")
    public void setPolicy_additional(Object policy_additional) {
        this.policy_additional = policy_additional;
    }

    @JsonProperty("policy_seller_info")
    public Object getPolicy_seller_info() {
        return policy_seller_info;
    }

    @JsonProperty("policy_seller_info")
    public void setPolicy_seller_info(Object policy_seller_info) {
        this.policy_seller_info = policy_seller_info;
    }

    @JsonProperty("policy_updated_tsz")
    public Integer getPolicy_updated_tsz() {
        return policy_updated_tsz;
    }

    @JsonProperty("policy_updated_tsz")
    public void setPolicy_updated_tsz(Integer policy_updated_tsz) {
        this.policy_updated_tsz = policy_updated_tsz;
    }

    @JsonProperty("policy_has_private_receipt_info")
    public Boolean getPolicy_has_private_receipt_info() {
        return policy_has_private_receipt_info;
    }

    @JsonProperty("policy_has_private_receipt_info")
    public void setPolicy_has_private_receipt_info(Boolean policy_has_private_receipt_info) {
        this.policy_has_private_receipt_info = policy_has_private_receipt_info;
    }

    @JsonProperty("vacation_autoreply")
    public Object getVacation_autoreply() {
        return vacation_autoreply;
    }

    @JsonProperty("vacation_autoreply")
    public void setVacation_autoreply(Object vacation_autoreply) {
        this.vacation_autoreply = vacation_autoreply;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("image_url_760x100")
    public Object getImage_url_760x100() {
        return image_url_760x100;
    }

    @JsonProperty("image_url_760x100")
    public void setImage_url_760x100(Object image_url_760x100) {
        this.image_url_760x100 = image_url_760x100;
    }

    @JsonProperty("num_favorers")
    public Integer getNum_favorers() {
        return num_favorers;
    }

    @JsonProperty("num_favorers")
    public void setNum_favorers(Integer num_favorers) {
        this.num_favorers = num_favorers;
    }

    @JsonProperty("languages")
    public List<String> getLanguages() {
        return languages;
    }

    @JsonProperty("languages")
    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    @JsonProperty("upcoming_local_event_id")
    public Object getUpcoming_local_event_id() {
        return upcoming_local_event_id;
    }

    @JsonProperty("upcoming_local_event_id")
    public void setUpcoming_local_event_id(Object upcoming_local_event_id) {
        this.upcoming_local_event_id = upcoming_local_event_id;
    }

    @JsonProperty("icon_url_fullxfull")
    public Object getIcon_url_fullxfull() {
        return icon_url_fullxfull;
    }

    @JsonProperty("icon_url_fullxfull")
    public void setIcon_url_fullxfull(Object icon_url_fullxfull) {
        this.icon_url_fullxfull = icon_url_fullxfull;
    }

    @JsonProperty("is_using_structured_policies")
    public Boolean getIs_using_structured_policies() {
        return is_using_structured_policies;
    }

    @JsonProperty("is_using_structured_policies")
    public void setIs_using_structured_policies(Boolean is_using_structured_policies) {
        this.is_using_structured_policies = is_using_structured_policies;
    }

    @JsonProperty("has_onboarded_structured_policies")
    public Boolean getHas_onboarded_structured_policies() {
        return has_onboarded_structured_policies;
    }

    @JsonProperty("has_onboarded_structured_policies")
    public void setHas_onboarded_structured_policies(Boolean has_onboarded_structured_policies) {
        this.has_onboarded_structured_policies = has_onboarded_structured_policies;
    }

    @JsonProperty("has_unstructured_policies")
    public Boolean getHas_unstructured_policies() {
        return has_unstructured_policies;
    }

    @JsonProperty("has_unstructured_policies")
    public void setHas_unstructured_policies(Boolean has_unstructured_policies) {
        this.has_unstructured_policies = has_unstructured_policies;
    }

    @JsonProperty("include_dispute_form_link")
    public Boolean getInclude_dispute_form_link() {
        return include_dispute_form_link;
    }

    @JsonProperty("include_dispute_form_link")
    public void setInclude_dispute_form_link(Boolean include_dispute_form_link) {
        this.include_dispute_form_link = include_dispute_form_link;
    }

    @JsonProperty("is_direct_checkout_onboarded")
    public Boolean getIs_direct_checkout_onboarded() {
        return is_direct_checkout_onboarded;
    }

    @JsonProperty("is_direct_checkout_onboarded")
    public void setIs_direct_checkout_onboarded(Boolean is_direct_checkout_onboarded) {
        this.is_direct_checkout_onboarded = is_direct_checkout_onboarded;
    }

    @JsonProperty("policy_privacy")
    public Object getPolicy_privacy() {
        return policy_privacy;
    }

    @JsonProperty("policy_privacy")
    public void setPolicy_privacy(Object policy_privacy) {
        this.policy_privacy = policy_privacy;
    }

    @JsonProperty("is_calculated_eligible")
    public Boolean getIs_calculated_eligible() {
        return is_calculated_eligible;
    }

    @JsonProperty("is_calculated_eligible")
    public void setIs_calculated_eligible(Boolean is_calculated_eligible) {
        this.is_calculated_eligible = is_calculated_eligible;
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
