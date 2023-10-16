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
import com.wallee.sdk.model.LineItemCreate;
import com.wallee.sdk.model.PaymentLinkAddressHandlingMode;
import com.wallee.sdk.model.PaymentMethodConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * AbstractPaymentLinkUpdate
 */

public class AbstractPaymentLinkUpdate {
  
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

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("lineItems")
  protected List<LineItemCreate> lineItems = null;

  
  @JsonProperty("maximalNumberOfTransactions")
  protected Integer maximalNumberOfTransactions = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("shippingAddressHandlingMode")
  protected PaymentLinkAddressHandlingMode shippingAddressHandlingMode = null;

  
  
  public AbstractPaymentLinkUpdate allowedPaymentMethodConfigurations(List<PaymentMethodConfiguration> allowedPaymentMethodConfigurations) {
    this.allowedPaymentMethodConfigurations = allowedPaymentMethodConfigurations;
    return this;
  }

  public AbstractPaymentLinkUpdate addAllowedPaymentMethodConfigurationsItem(PaymentMethodConfiguration allowedPaymentMethodConfigurationsItem) {
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

  
  public AbstractPaymentLinkUpdate appliedSpaceView(Long appliedSpaceView) {
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

  
  public AbstractPaymentLinkUpdate availableFrom(OffsetDateTime availableFrom) {
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

  
  public AbstractPaymentLinkUpdate availableUntil(OffsetDateTime availableUntil) {
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

  
  public AbstractPaymentLinkUpdate billingAddressHandlingMode(PaymentLinkAddressHandlingMode billingAddressHandlingMode) {
    this.billingAddressHandlingMode = billingAddressHandlingMode;
    return this;
  }

   /**
   * The billing address handling mode controls if the address is collected or not and how it is collected.
   * @return billingAddressHandlingMode
  **/
  @ApiModelProperty(value = "The billing address handling mode controls if the address is collected or not and how it is collected.")
  public PaymentLinkAddressHandlingMode getBillingAddressHandlingMode() {
    return billingAddressHandlingMode;
  }

  public void setBillingAddressHandlingMode(PaymentLinkAddressHandlingMode billingAddressHandlingMode) {
    this.billingAddressHandlingMode = billingAddressHandlingMode;
  }

  
  public AbstractPaymentLinkUpdate currency(String currency) {
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

  
  public AbstractPaymentLinkUpdate language(String language) {
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

  
  public AbstractPaymentLinkUpdate lineItems(List<LineItemCreate> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public AbstractPaymentLinkUpdate addLineItemsItem(LineItemCreate lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * The line items allows to define the line items for this payment link. When the line items are defined they cannot be overridden through the request parameters. If no amount for the payment link is defined, the additional checkout page to enter the amount is shown to the consumer.
   * @return lineItems
  **/
  @ApiModelProperty(value = "The line items allows to define the line items for this payment link. When the line items are defined they cannot be overridden through the request parameters. If no amount for the payment link is defined, the additional checkout page to enter the amount is shown to the consumer.")
  public List<LineItemCreate> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<LineItemCreate> lineItems) {
    this.lineItems = lineItems;
  }

  
  public AbstractPaymentLinkUpdate maximalNumberOfTransactions(Integer maximalNumberOfTransactions) {
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

  
  public AbstractPaymentLinkUpdate name(String name) {
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

  
  public AbstractPaymentLinkUpdate shippingAddressHandlingMode(PaymentLinkAddressHandlingMode shippingAddressHandlingMode) {
    this.shippingAddressHandlingMode = shippingAddressHandlingMode;
    return this;
  }

   /**
   * The shipping address handling mode controls if the address is collected or not and how it is collected.
   * @return shippingAddressHandlingMode
  **/
  @ApiModelProperty(value = "The shipping address handling mode controls if the address is collected or not and how it is collected.")
  public PaymentLinkAddressHandlingMode getShippingAddressHandlingMode() {
    return shippingAddressHandlingMode;
  }

  public void setShippingAddressHandlingMode(PaymentLinkAddressHandlingMode shippingAddressHandlingMode) {
    this.shippingAddressHandlingMode = shippingAddressHandlingMode;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractPaymentLinkUpdate abstractPaymentLinkUpdate = (AbstractPaymentLinkUpdate) o;
    return Objects.equals(this.allowedPaymentMethodConfigurations, abstractPaymentLinkUpdate.allowedPaymentMethodConfigurations) &&
        Objects.equals(this.appliedSpaceView, abstractPaymentLinkUpdate.appliedSpaceView) &&
        Objects.equals(this.availableFrom, abstractPaymentLinkUpdate.availableFrom) &&
        Objects.equals(this.availableUntil, abstractPaymentLinkUpdate.availableUntil) &&
        Objects.equals(this.billingAddressHandlingMode, abstractPaymentLinkUpdate.billingAddressHandlingMode) &&
        Objects.equals(this.currency, abstractPaymentLinkUpdate.currency) &&
        Objects.equals(this.language, abstractPaymentLinkUpdate.language) &&
        Objects.equals(this.lineItems, abstractPaymentLinkUpdate.lineItems) &&
        Objects.equals(this.maximalNumberOfTransactions, abstractPaymentLinkUpdate.maximalNumberOfTransactions) &&
        Objects.equals(this.name, abstractPaymentLinkUpdate.name) &&
        Objects.equals(this.shippingAddressHandlingMode, abstractPaymentLinkUpdate.shippingAddressHandlingMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedPaymentMethodConfigurations, appliedSpaceView, availableFrom, availableUntil, billingAddressHandlingMode, currency, language, lineItems, maximalNumberOfTransactions, name, shippingAddressHandlingMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractPaymentLinkUpdate {\n");
    
    sb.append("    allowedPaymentMethodConfigurations: ").append(toIndentedString(allowedPaymentMethodConfigurations)).append("\n");
    sb.append("    appliedSpaceView: ").append(toIndentedString(appliedSpaceView)).append("\n");
    sb.append("    availableFrom: ").append(toIndentedString(availableFrom)).append("\n");
    sb.append("    availableUntil: ").append(toIndentedString(availableUntil)).append("\n");
    sb.append("    billingAddressHandlingMode: ").append(toIndentedString(billingAddressHandlingMode)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    maximalNumberOfTransactions: ").append(toIndentedString(maximalNumberOfTransactions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shippingAddressHandlingMode: ").append(toIndentedString(shippingAddressHandlingMode)).append("\n");
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

