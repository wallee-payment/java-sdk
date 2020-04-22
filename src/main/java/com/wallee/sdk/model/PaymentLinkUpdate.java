/**
*  SDK
*
* This library allows to interact with the  payment service.
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
import com.wallee.sdk.model.LineItemCreate;
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
@javax.annotation.Generated(value = "io.wallee.sdk.java.WalleeJavaClientCodegen", date = "2020-04-22T16:20:41.240+02:00")
public class PaymentLinkUpdate {
  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("version")
  protected Long version = null;

  
  @JsonProperty("allowedPaymentMethodConfigurations")
  protected List<PaymentMethodConfiguration> allowedPaymentMethodConfigurations = null;

  
  @JsonProperty("appliedSpaceView")
  protected Long appliedSpaceView = null;

  
  @JsonProperty("availableFrom")
  protected OffsetDateTime availableFrom = null;

  
  @JsonProperty("availableUntil")
  protected OffsetDateTime availableUntil = null;

  
  @JsonProperty("billingAddressRequired")
  protected Boolean billingAddressRequired = null;

  
  @JsonProperty("currency")
  protected String currency = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("lineItems")
  protected List<LineItemCreate> lineItems = null;

  
  @JsonProperty("maximalNumberOfTransactions")
  protected Integer maximalNumberOfTransactions = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("shippingAddressRequired")
  protected Boolean shippingAddressRequired = null;

  
  
  public PaymentLinkUpdate id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The ID is the primary key of the entity. The ID identifies the entity uniquely.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  
  public PaymentLinkUpdate version(Long version) {
    this.version = version;
    return this;
  }

   /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
  **/
  @ApiModelProperty(required = true, value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  
  public PaymentLinkUpdate allowedPaymentMethodConfigurations(List<PaymentMethodConfiguration> allowedPaymentMethodConfigurations) {
    this.allowedPaymentMethodConfigurations = allowedPaymentMethodConfigurations;
    return this;
  }

  public PaymentLinkUpdate addAllowedPaymentMethodConfigurationsItem(PaymentMethodConfiguration allowedPaymentMethodConfigurationsItem) {
    if (this.allowedPaymentMethodConfigurations == null) {
      this.allowedPaymentMethodConfigurations = new ArrayList<>();
    }
    this.allowedPaymentMethodConfigurations.add(allowedPaymentMethodConfigurationsItem);
    return this;
  }

   /**
   * The allowed payment method configurations restrict the payment methods which can be used with this payment link.
   * @return allowedPaymentMethodConfigurations
  **/
  @ApiModelProperty(value = "The allowed payment method configurations restrict the payment methods which can be used with this payment link.")
  public List<PaymentMethodConfiguration> getAllowedPaymentMethodConfigurations() {
    return allowedPaymentMethodConfigurations;
  }

  public void setAllowedPaymentMethodConfigurations(List<PaymentMethodConfiguration> allowedPaymentMethodConfigurations) {
    this.allowedPaymentMethodConfigurations = allowedPaymentMethodConfigurations;
  }

  
  public PaymentLinkUpdate appliedSpaceView(Long appliedSpaceView) {
    this.appliedSpaceView = appliedSpaceView;
    return this;
  }

   /**
   * The payment link can be conducted in a specific space view. The space view may apply a specific design to the payment page.
   * @return appliedSpaceView
  **/
  @ApiModelProperty(value = "The payment link can be conducted in a specific space view. The space view may apply a specific design to the payment page.")
  public Long getAppliedSpaceView() {
    return appliedSpaceView;
  }

  public void setAppliedSpaceView(Long appliedSpaceView) {
    this.appliedSpaceView = appliedSpaceView;
  }

  
  public PaymentLinkUpdate availableFrom(OffsetDateTime availableFrom) {
    this.availableFrom = availableFrom;
    return this;
  }

   /**
   * The available from date defines the earliest date on which the payment link can be used. When no date is specified there will be no restriction.
   * @return availableFrom
  **/
  @ApiModelProperty(value = "The available from date defines the earliest date on which the payment link can be used. When no date is specified there will be no restriction.")
  public OffsetDateTime getAvailableFrom() {
    return availableFrom;
  }

  public void setAvailableFrom(OffsetDateTime availableFrom) {
    this.availableFrom = availableFrom;
  }

  
  public PaymentLinkUpdate availableUntil(OffsetDateTime availableUntil) {
    this.availableUntil = availableUntil;
    return this;
  }

   /**
   * The available from date defines the latest date on which the payment link can be used to initialize a transaction. When no date is specified there will be no restriction.
   * @return availableUntil
  **/
  @ApiModelProperty(value = "The available from date defines the latest date on which the payment link can be used to initialize a transaction. When no date is specified there will be no restriction.")
  public OffsetDateTime getAvailableUntil() {
    return availableUntil;
  }

  public void setAvailableUntil(OffsetDateTime availableUntil) {
    this.availableUntil = availableUntil;
  }

  
  public PaymentLinkUpdate billingAddressRequired(Boolean billingAddressRequired) {
    this.billingAddressRequired = billingAddressRequired;
    return this;
  }

   /**
   * By making the billing address required the transaction can only be created when a billing address is provided within the request.
   * @return billingAddressRequired
  **/
  @ApiModelProperty(value = "By making the billing address required the transaction can only be created when a billing address is provided within the request.")
  public Boolean isBillingAddressRequired() {
    return billingAddressRequired;
  }

  public void setBillingAddressRequired(Boolean billingAddressRequired) {
    this.billingAddressRequired = billingAddressRequired;
  }

  
  public PaymentLinkUpdate currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The currency defines in which currency the payment is executed in. If no currency is defined it has to be specified within the request parameter &#39;currency&#39;.
   * @return currency
  **/
  @ApiModelProperty(value = "The currency defines in which currency the payment is executed in. If no currency is defined it has to be specified within the request parameter 'currency'.")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  
  public PaymentLinkUpdate language(String language) {
    this.language = language;
    return this;
  }

   /**
   * The language defines the language of the payment page. If no language is provided it can be provided through the request parameter.
   * @return language
  **/
  @ApiModelProperty(value = "The language defines the language of the payment page. If no language is provided it can be provided through the request parameter.")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  
  public PaymentLinkUpdate lineItems(List<LineItemCreate> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public PaymentLinkUpdate addLineItemsItem(LineItemCreate lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * The line items allows to define the line items for this payment link. When the line items are defined they cannot be overridden through the request parameters.
   * @return lineItems
  **/
  @ApiModelProperty(value = "The line items allows to define the line items for this payment link. When the line items are defined they cannot be overridden through the request parameters.")
  public List<LineItemCreate> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<LineItemCreate> lineItems) {
    this.lineItems = lineItems;
  }

  
  public PaymentLinkUpdate maximalNumberOfTransactions(Integer maximalNumberOfTransactions) {
    this.maximalNumberOfTransactions = maximalNumberOfTransactions;
    return this;
  }

   /**
   * The maximal number of transactions limits the number of transactions which can be created with this payment link.
   * @return maximalNumberOfTransactions
  **/
  @ApiModelProperty(value = "The maximal number of transactions limits the number of transactions which can be created with this payment link.")
  public Integer getMaximalNumberOfTransactions() {
    return maximalNumberOfTransactions;
  }

  public void setMaximalNumberOfTransactions(Integer maximalNumberOfTransactions) {
    this.maximalNumberOfTransactions = maximalNumberOfTransactions;
  }

  
  public PaymentLinkUpdate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The payment link name is used internally to identify the payment link. For example the name is used within search fields and hence it should be distinct and descriptive.
   * @return name
  **/
  @ApiModelProperty(value = "The payment link name is used internally to identify the payment link. For example the name is used within search fields and hence it should be distinct and descriptive.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public PaymentLinkUpdate shippingAddressRequired(Boolean shippingAddressRequired) {
    this.shippingAddressRequired = shippingAddressRequired;
    return this;
  }

   /**
   * By making the shipping address required the transaction can only be created when a shipping address is provided within the request.
   * @return shippingAddressRequired
  **/
  @ApiModelProperty(value = "By making the shipping address required the transaction can only be created when a shipping address is provided within the request.")
  public Boolean isShippingAddressRequired() {
    return shippingAddressRequired;
  }

  public void setShippingAddressRequired(Boolean shippingAddressRequired) {
    this.shippingAddressRequired = shippingAddressRequired;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentLinkUpdate paymentLinkUpdate = (PaymentLinkUpdate) o;
    return Objects.equals(this.id, paymentLinkUpdate.id) &&
        Objects.equals(this.version, paymentLinkUpdate.version) &&
        Objects.equals(this.allowedPaymentMethodConfigurations, paymentLinkUpdate.allowedPaymentMethodConfigurations) &&
        Objects.equals(this.appliedSpaceView, paymentLinkUpdate.appliedSpaceView) &&
        Objects.equals(this.availableFrom, paymentLinkUpdate.availableFrom) &&
        Objects.equals(this.availableUntil, paymentLinkUpdate.availableUntil) &&
        Objects.equals(this.billingAddressRequired, paymentLinkUpdate.billingAddressRequired) &&
        Objects.equals(this.currency, paymentLinkUpdate.currency) &&
        Objects.equals(this.language, paymentLinkUpdate.language) &&
        Objects.equals(this.lineItems, paymentLinkUpdate.lineItems) &&
        Objects.equals(this.maximalNumberOfTransactions, paymentLinkUpdate.maximalNumberOfTransactions) &&
        Objects.equals(this.name, paymentLinkUpdate.name) &&
        Objects.equals(this.shippingAddressRequired, paymentLinkUpdate.shippingAddressRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, allowedPaymentMethodConfigurations, appliedSpaceView, availableFrom, availableUntil, billingAddressRequired, currency, language, lineItems, maximalNumberOfTransactions, name, shippingAddressRequired);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentLinkUpdate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    allowedPaymentMethodConfigurations: ").append(toIndentedString(allowedPaymentMethodConfigurations)).append("\n");
    sb.append("    appliedSpaceView: ").append(toIndentedString(appliedSpaceView)).append("\n");
    sb.append("    availableFrom: ").append(toIndentedString(availableFrom)).append("\n");
    sb.append("    availableUntil: ").append(toIndentedString(availableUntil)).append("\n");
    sb.append("    billingAddressRequired: ").append(toIndentedString(billingAddressRequired)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    maximalNumberOfTransactions: ").append(toIndentedString(maximalNumberOfTransactions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shippingAddressRequired: ").append(toIndentedString(shippingAddressRequired)).append("\n");
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

