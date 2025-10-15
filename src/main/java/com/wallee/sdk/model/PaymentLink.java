/**
* wallee SDK
*
* This library allows to interact with the wallee payment service.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/


package com.wallee.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.LineItem;
import com.wallee.sdk.model.PaymentLinkAddressHandlingMode;
import com.wallee.sdk.model.PaymentLinkProtectionMode;
import com.wallee.sdk.model.PaymentMethodConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class PaymentLink {
  
  @JsonProperty("allowedPaymentMethodConfigurations")
  protected List<PaymentMethodConfiguration> allowedPaymentMethodConfigurations = null;

  
  @JsonProperty("allowedRedirectionDomains")
  protected List<String> allowedRedirectionDomains = null;

  
  @JsonProperty("appliedSpaceView")
  protected Long appliedSpaceView = null;

  
  @JsonProperty("availableFrom")
  protected OffsetDateTime availableFrom = null;

  
  @JsonProperty("availableUntil")
  protected OffsetDateTime availableUntil = null;

  
  @JsonProperty("billingAddressHandlingMode")
  protected PaymentLinkAddressHandlingMode billingAddressHandlingMode = null;

  
  @JsonProperty("currency")
  protected String currency = null;

  
  @JsonProperty("externalId")
  protected String externalId = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("lineItems")
  protected List<LineItem> lineItems = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("maximalNumberOfTransactions")
  protected Integer maximalNumberOfTransactions = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("protectionMode")
  protected PaymentLinkProtectionMode protectionMode = null;

  
  @JsonProperty("shippingAddressHandlingMode")
  protected PaymentLinkAddressHandlingMode shippingAddressHandlingMode = null;

  
  @JsonProperty("state")
  protected CreationEntityState state = null;

  
  @JsonProperty("url")
  protected String url = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The payment method configurations that customers can use for making payments.
   * @return allowedPaymentMethodConfigurations
  **/
  @ApiModelProperty(value = "The payment method configurations that customers can use for making payments.")
  public List<PaymentMethodConfiguration> getAllowedPaymentMethodConfigurations() {
    return allowedPaymentMethodConfigurations;
  }

  
   /**
   * The domains to which the user is allowed to be redirected after the payment is completed. The following options can be configured: Exact domain: enter a full domain, e.g. (https://example.com). Wildcard domain: use to allow subdomains, e.g. (https://_*.example.com). All domains: use (ALL) to allow redirection to any domain (not recommended for security reasons). No domains : use (NONE) to disallow any redirection. Only one option per line is allowed. Invalid entries will be rejected. 
   * @return allowedRedirectionDomains
  **/
  @ApiModelProperty(value = "The domains to which the user is allowed to be redirected after the payment is completed. The following options can be configured: Exact domain: enter a full domain, e.g. (https://example.com). Wildcard domain: use to allow subdomains, e.g. (https://_*.example.com). All domains: use (ALL) to allow redirection to any domain (not recommended for security reasons). No domains : use (NONE) to disallow any redirection. Only one option per line is allowed. Invalid entries will be rejected. ")
  public List<String> getAllowedRedirectionDomains() {
    return allowedRedirectionDomains;
  }

  
   /**
   * The payment link can be used within a specific space view, which may apply a customized design to the payment page.
   * @return appliedSpaceView
  **/
  @ApiModelProperty(value = "The payment link can be used within a specific space view, which may apply a customized design to the payment page.")
  public Long getAppliedSpaceView() {
    return appliedSpaceView;
  }

  
   /**
   * The earliest date the payment link can be used to initiate a transaction. If no date is provided, the link will be available immediately.
   * @return availableFrom
  **/
  @ApiModelProperty(value = "The earliest date the payment link can be used to initiate a transaction. If no date is provided, the link will be available immediately.")
  public OffsetDateTime getAvailableFrom() {
    return availableFrom;
  }

  
   /**
   * The latest date the payment link can be used to initiate a transaction. If no date is provided, the link will remain available indefinitely.
   * @return availableUntil
  **/
  @ApiModelProperty(value = "The latest date the payment link can be used to initiate a transaction. If no date is provided, the link will remain available indefinitely.")
  public OffsetDateTime getAvailableUntil() {
    return availableUntil;
  }

  
   /**
   * The handling mode defines whether a billing address is required and specifies how it should be provided.
   * @return billingAddressHandlingMode
  **/
  @ApiModelProperty(value = "The handling mode defines whether a billing address is required and specifies how it should be provided.")
  public PaymentLinkAddressHandlingMode getBillingAddressHandlingMode() {
    return billingAddressHandlingMode;
  }

  
   /**
   * The three-letter currency code (ISO 4217). If not specified, it must be provided in the &#39;currency&#39; request parameter.
   * @return currency
  **/
  @ApiModelProperty(value = "The three-letter currency code (ISO 4217). If not specified, it must be provided in the 'currency' request parameter.")
  public String getCurrency() {
    return currency;
  }

  
   /**
   * A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.
   * @return externalId
  **/
  @ApiModelProperty(value = "A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.")
  public String getExternalId() {
    return externalId;
  }

  
   /**
   * A unique identifier for the object.
   * @return id
  **/
  @ApiModelProperty(value = "A unique identifier for the object.")
  public Long getId() {
    return id;
  }

  
   /**
   * The language for displaying the payment page. If not specified, it can be supplied via the &#39;language&#39; request parameter.
   * @return language
  **/
  @ApiModelProperty(value = "The language for displaying the payment page. If not specified, it can be supplied via the 'language' request parameter.")
  public String getLanguage() {
    return language;
  }

  
   /**
   * The line items representing what is being sold. If not specified, they can be supplied via request parameters.
   * @return lineItems
  **/
  @ApiModelProperty(value = "The line items representing what is being sold. If not specified, they can be supplied via request parameters.")
  public List<LineItem> getLineItems() {
    return lineItems;
  }

  
   /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The ID of the space this object belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The maximum number of transactions that can be initiated using the payment link.
   * @return maximalNumberOfTransactions
  **/
  @ApiModelProperty(value = "The maximum number of transactions that can be initiated using the payment link.")
  public Integer getMaximalNumberOfTransactions() {
    return maximalNumberOfTransactions;
  }

  
   /**
   * The name used to identify the payment link.
   * @return name
  **/
  @ApiModelProperty(value = "The name used to identify the payment link.")
  public String getName() {
    return name;
  }

  
   /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * The protection mode defines whether the payment link is protected against tampering and specifies the protection method.
   * @return protectionMode
  **/
  @ApiModelProperty(value = "The protection mode defines whether the payment link is protected against tampering and specifies the protection method.")
  public PaymentLinkProtectionMode getProtectionMode() {
    return protectionMode;
  }

  
   /**
   * The handling mode defines whether a shipping address is required and specifies how it should be provided.
   * @return shippingAddressHandlingMode
  **/
  @ApiModelProperty(value = "The handling mode defines whether a shipping address is required and specifies how it should be provided.")
  public PaymentLinkAddressHandlingMode getShippingAddressHandlingMode() {
    return shippingAddressHandlingMode;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public CreationEntityState getState() {
    return state;
  }

  
   /**
   * The public URL to share with customers for making payments.
   * @return url
  **/
  @ApiModelProperty(value = "The public URL to share with customers for making payments.")
  public String getUrl() {
    return url;
  }

  
   /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @ApiModelProperty(value = "The version is used for optimistic locking and incremented whenever the object is updated.")
  public Integer getVersion() {
    return version;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentLink paymentLink = (PaymentLink) o;
    return Objects.equals(this.allowedPaymentMethodConfigurations, paymentLink.allowedPaymentMethodConfigurations) &&
        Objects.equals(this.allowedRedirectionDomains, paymentLink.allowedRedirectionDomains) &&
        Objects.equals(this.appliedSpaceView, paymentLink.appliedSpaceView) &&
        Objects.equals(this.availableFrom, paymentLink.availableFrom) &&
        Objects.equals(this.availableUntil, paymentLink.availableUntil) &&
        Objects.equals(this.billingAddressHandlingMode, paymentLink.billingAddressHandlingMode) &&
        Objects.equals(this.currency, paymentLink.currency) &&
        Objects.equals(this.externalId, paymentLink.externalId) &&
        Objects.equals(this.id, paymentLink.id) &&
        Objects.equals(this.language, paymentLink.language) &&
        Objects.equals(this.lineItems, paymentLink.lineItems) &&
        Objects.equals(this.linkedSpaceId, paymentLink.linkedSpaceId) &&
        Objects.equals(this.maximalNumberOfTransactions, paymentLink.maximalNumberOfTransactions) &&
        Objects.equals(this.name, paymentLink.name) &&
        Objects.equals(this.plannedPurgeDate, paymentLink.plannedPurgeDate) &&
        Objects.equals(this.protectionMode, paymentLink.protectionMode) &&
        Objects.equals(this.shippingAddressHandlingMode, paymentLink.shippingAddressHandlingMode) &&
        Objects.equals(this.state, paymentLink.state) &&
        Objects.equals(this.url, paymentLink.url) &&
        Objects.equals(this.version, paymentLink.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedPaymentMethodConfigurations, allowedRedirectionDomains, appliedSpaceView, availableFrom, availableUntil, billingAddressHandlingMode, currency, externalId, id, language, lineItems, linkedSpaceId, maximalNumberOfTransactions, name, plannedPurgeDate, protectionMode, shippingAddressHandlingMode, state, url, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentLink {\n");
    
    sb.append("    allowedPaymentMethodConfigurations: ").append(toIndentedString(allowedPaymentMethodConfigurations)).append("\n");
    sb.append("    allowedRedirectionDomains: ").append(toIndentedString(allowedRedirectionDomains)).append("\n");
    sb.append("    appliedSpaceView: ").append(toIndentedString(appliedSpaceView)).append("\n");
    sb.append("    availableFrom: ").append(toIndentedString(availableFrom)).append("\n");
    sb.append("    availableUntil: ").append(toIndentedString(availableUntil)).append("\n");
    sb.append("    billingAddressHandlingMode: ").append(toIndentedString(billingAddressHandlingMode)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    maximalNumberOfTransactions: ").append(toIndentedString(maximalNumberOfTransactions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    protectionMode: ").append(toIndentedString(protectionMode)).append("\n");
    sb.append("    shippingAddressHandlingMode: ").append(toIndentedString(shippingAddressHandlingMode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

