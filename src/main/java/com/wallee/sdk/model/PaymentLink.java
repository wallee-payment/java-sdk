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
 * The payment link defines an URL to automatically create transactions.
 */
@ApiModel(description = "The payment link defines an URL to automatically create transactions.")

public class PaymentLink {
  
  @JsonProperty("allowedPaymentMethodConfigurations")
  protected List<PaymentMethodConfiguration> allowedPaymentMethodConfigurations = null;

  
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
   * The allowed payment method configurations restrict the payment methods which can be used with this payment link.
   * @return allowedPaymentMethodConfigurations
  **/
  @ApiModelProperty(value = "The allowed payment method configurations restrict the payment methods which can be used with this payment link.")
  public List<PaymentMethodConfiguration> getAllowedPaymentMethodConfigurations() {
    return allowedPaymentMethodConfigurations;
  }

  
   /**
   * The payment link can be conducted in a specific space view. The space view may apply a specific design to the payment page.
   * @return appliedSpaceView
  **/
  @ApiModelProperty(value = "The payment link can be conducted in a specific space view. The space view may apply a specific design to the payment page.")
  public Long getAppliedSpaceView() {
    return appliedSpaceView;
  }

  
   /**
   * The available from date defines the earliest date on which the payment link can be used. When no date is specified there will be no restriction.
   * @return availableFrom
  **/
  @ApiModelProperty(value = "The available from date defines the earliest date on which the payment link can be used. When no date is specified there will be no restriction.")
  public OffsetDateTime getAvailableFrom() {
    return availableFrom;
  }

  
   /**
   * The available from date defines the latest date on which the payment link can be used to initialize a transaction. When no date is specified there will be no restriction.
   * @return availableUntil
  **/
  @ApiModelProperty(value = "The available from date defines the latest date on which the payment link can be used to initialize a transaction. When no date is specified there will be no restriction.")
  public OffsetDateTime getAvailableUntil() {
    return availableUntil;
  }

  
   /**
   * The billing address handling mode controls if the address is collected or not and how it is collected.
   * @return billingAddressHandlingMode
  **/
  @ApiModelProperty(value = "The billing address handling mode controls if the address is collected or not and how it is collected.")
  public PaymentLinkAddressHandlingMode getBillingAddressHandlingMode() {
    return billingAddressHandlingMode;
  }

  
   /**
   * The currency defines in which currency the payment is executed in. If no currency is defined it has to be specified within the request parameter &#39;currency&#39;.
   * @return currency
  **/
  @ApiModelProperty(value = "The currency defines in which currency the payment is executed in. If no currency is defined it has to be specified within the request parameter 'currency'.")
  public String getCurrency() {
    return currency;
  }

  
   /**
   * A client generated nonce which identifies the entity to be created. Subsequent creation requests with the same external ID will not create new entities but return the initially created entity instead.
   * @return externalId
  **/
  @ApiModelProperty(value = "A client generated nonce which identifies the entity to be created. Subsequent creation requests with the same external ID will not create new entities but return the initially created entity instead.")
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
   * The language defines the language of the payment page. If no language is provided it can be provided through the request parameter.
   * @return language
  **/
  @ApiModelProperty(value = "The language defines the language of the payment page. If no language is provided it can be provided through the request parameter.")
  public String getLanguage() {
    return language;
  }

  
   /**
   * The line items allows to define the line items for this payment link. When the line items are defined they cannot be overridden through the request parameters.
   * @return lineItems
  **/
  @ApiModelProperty(value = "The line items allows to define the line items for this payment link. When the line items are defined they cannot be overridden through the request parameters.")
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
   * The maximal number of transactions limits the number of transactions which can be created with this payment link.
   * @return maximalNumberOfTransactions
  **/
  @ApiModelProperty(value = "The maximal number of transactions limits the number of transactions which can be created with this payment link.")
  public Integer getMaximalNumberOfTransactions() {
    return maximalNumberOfTransactions;
  }

  
   /**
   * The payment link name is used internally to identify the payment link. For example the name is used within search fields and hence it should be distinct and descriptive.
   * @return name
  **/
  @ApiModelProperty(value = "The payment link name is used internally to identify the payment link. For example the name is used within search fields and hence it should be distinct and descriptive.")
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
   * The protection mode determines if the payment link is protected against tampering and in what way.
   * @return protectionMode
  **/
  @ApiModelProperty(value = "The protection mode determines if the payment link is protected against tampering and in what way.")
  public PaymentLinkProtectionMode getProtectionMode() {
    return protectionMode;
  }

  
   /**
   * The shipping address handling mode controls if the address is collected or not and how it is collected.
   * @return shippingAddressHandlingMode
  **/
  @ApiModelProperty(value = "The shipping address handling mode controls if the address is collected or not and how it is collected.")
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
   * The URL defines the URL to which the user has to be forwarded to initialize the payment.
   * @return url
  **/
  @ApiModelProperty(value = "The URL defines the URL to which the user has to be forwarded to initialize the payment.")
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
    return Objects.hash(allowedPaymentMethodConfigurations, appliedSpaceView, availableFrom, availableUntil, billingAddressHandlingMode, currency, externalId, id, language, lineItems, linkedSpaceId, maximalNumberOfTransactions, name, plannedPurgeDate, protectionMode, shippingAddressHandlingMode, state, url, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentLink {\n");
    
    sb.append("    allowedPaymentMethodConfigurations: ").append(toIndentedString(allowedPaymentMethodConfigurations)).append("\n");
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

