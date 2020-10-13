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
import com.wallee.sdk.model.ShopifySubscriberCreation;
import com.wallee.sdk.model.ShopifySubscriptionAddressCreate;
import com.wallee.sdk.model.ShopifySubscriptionModelBillingConfiguration;
import com.wallee.sdk.model.ShopifySubscriptionModelItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class ShopifySubscriptionCreationRequest {
  
  @JsonProperty("billingAddress")
  protected ShopifySubscriptionAddressCreate billingAddress = null;

  
  @JsonProperty("billingConfiguration")
  protected ShopifySubscriptionModelBillingConfiguration billingConfiguration = null;

  
  @JsonProperty("currency")
  protected String currency = null;

  
  @JsonProperty("externalId")
  protected String externalId = null;

  
  @JsonProperty("integration")
  protected Long integration = null;

  
  @JsonProperty("items")
  protected List<ShopifySubscriptionModelItem> items = new ArrayList<>();

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("shippingAddress")
  protected ShopifySubscriptionAddressCreate shippingAddress = null;

  
  @JsonProperty("shippingMethodName")
  protected String shippingMethodName = null;

  
  @JsonProperty("spaceViewId")
  protected Long spaceViewId = null;

  
  @JsonProperty("storeOrderConfirmationEmailEnabled")
  protected Boolean storeOrderConfirmationEmailEnabled = null;

  
  @JsonProperty("subscriber")
  protected ShopifySubscriberCreation subscriber = null;

  
  @JsonProperty("subscriberSuspensionAllowed")
  protected Boolean subscriberSuspensionAllowed = null;

  
  
  public ShopifySubscriptionCreationRequest billingAddress(ShopifySubscriptionAddressCreate billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * 
   * @return billingAddress
  **/
  @ApiModelProperty(required = true, value = "")
  public ShopifySubscriptionAddressCreate getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(ShopifySubscriptionAddressCreate billingAddress) {
    this.billingAddress = billingAddress;
  }

  
  public ShopifySubscriptionCreationRequest billingConfiguration(ShopifySubscriptionModelBillingConfiguration billingConfiguration) {
    this.billingConfiguration = billingConfiguration;
    return this;
  }

   /**
   * 
   * @return billingConfiguration
  **/
  @ApiModelProperty(value = "")
  public ShopifySubscriptionModelBillingConfiguration getBillingConfiguration() {
    return billingConfiguration;
  }

  public void setBillingConfiguration(ShopifySubscriptionModelBillingConfiguration billingConfiguration) {
    this.billingConfiguration = billingConfiguration;
  }

  
  public ShopifySubscriptionCreationRequest currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * 
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  
  public ShopifySubscriptionCreationRequest externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
   * @return externalId
  **/
  @ApiModelProperty(required = true, value = "The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  
  public ShopifySubscriptionCreationRequest integration(Long integration) {
    this.integration = integration;
    return this;
  }

   /**
   * 
   * @return integration
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getIntegration() {
    return integration;
  }

  public void setIntegration(Long integration) {
    this.integration = integration;
  }

  
  public ShopifySubscriptionCreationRequest items(List<ShopifySubscriptionModelItem> items) {
    this.items = items;
    return this;
  }

  public ShopifySubscriptionCreationRequest addItemsItem(ShopifySubscriptionModelItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * 
   * @return items
  **/
  @ApiModelProperty(required = true, value = "")
  public List<ShopifySubscriptionModelItem> getItems() {
    return items;
  }

  public void setItems(List<ShopifySubscriptionModelItem> items) {
    this.items = items;
  }

  
  public ShopifySubscriptionCreationRequest language(String language) {
    this.language = language;
    return this;
  }

   /**
   * 
   * @return language
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  
  public ShopifySubscriptionCreationRequest shippingAddress(ShopifySubscriptionAddressCreate shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * 
   * @return shippingAddress
  **/
  @ApiModelProperty(required = true, value = "")
  public ShopifySubscriptionAddressCreate getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(ShopifySubscriptionAddressCreate shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  
  public ShopifySubscriptionCreationRequest shippingMethodName(String shippingMethodName) {
    this.shippingMethodName = shippingMethodName;
    return this;
  }

   /**
   * 
   * @return shippingMethodName
  **/
  @ApiModelProperty(value = "")
  public String getShippingMethodName() {
    return shippingMethodName;
  }

  public void setShippingMethodName(String shippingMethodName) {
    this.shippingMethodName = shippingMethodName;
  }

  
  public ShopifySubscriptionCreationRequest spaceViewId(Long spaceViewId) {
    this.spaceViewId = spaceViewId;
    return this;
  }

   /**
   * 
   * @return spaceViewId
  **/
  @ApiModelProperty(value = "")
  public Long getSpaceViewId() {
    return spaceViewId;
  }

  public void setSpaceViewId(Long spaceViewId) {
    this.spaceViewId = spaceViewId;
  }

  
  public ShopifySubscriptionCreationRequest storeOrderConfirmationEmailEnabled(Boolean storeOrderConfirmationEmailEnabled) {
    this.storeOrderConfirmationEmailEnabled = storeOrderConfirmationEmailEnabled;
    return this;
  }

   /**
   * 
   * @return storeOrderConfirmationEmailEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isStoreOrderConfirmationEmailEnabled() {
    return storeOrderConfirmationEmailEnabled;
  }

  public void setStoreOrderConfirmationEmailEnabled(Boolean storeOrderConfirmationEmailEnabled) {
    this.storeOrderConfirmationEmailEnabled = storeOrderConfirmationEmailEnabled;
  }

  
  public ShopifySubscriptionCreationRequest subscriber(ShopifySubscriberCreation subscriber) {
    this.subscriber = subscriber;
    return this;
  }

   /**
   * 
   * @return subscriber
  **/
  @ApiModelProperty(required = true, value = "")
  public ShopifySubscriberCreation getSubscriber() {
    return subscriber;
  }

  public void setSubscriber(ShopifySubscriberCreation subscriber) {
    this.subscriber = subscriber;
  }

  
  public ShopifySubscriptionCreationRequest subscriberSuspensionAllowed(Boolean subscriberSuspensionAllowed) {
    this.subscriberSuspensionAllowed = subscriberSuspensionAllowed;
    return this;
  }

   /**
   * 
   * @return subscriberSuspensionAllowed
  **/
  @ApiModelProperty(value = "")
  public Boolean isSubscriberSuspensionAllowed() {
    return subscriberSuspensionAllowed;
  }

  public void setSubscriberSuspensionAllowed(Boolean subscriberSuspensionAllowed) {
    this.subscriberSuspensionAllowed = subscriberSuspensionAllowed;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopifySubscriptionCreationRequest shopifySubscriptionCreationRequest = (ShopifySubscriptionCreationRequest) o;
    return Objects.equals(this.billingAddress, shopifySubscriptionCreationRequest.billingAddress) &&
        Objects.equals(this.billingConfiguration, shopifySubscriptionCreationRequest.billingConfiguration) &&
        Objects.equals(this.currency, shopifySubscriptionCreationRequest.currency) &&
        Objects.equals(this.externalId, shopifySubscriptionCreationRequest.externalId) &&
        Objects.equals(this.integration, shopifySubscriptionCreationRequest.integration) &&
        Objects.equals(this.items, shopifySubscriptionCreationRequest.items) &&
        Objects.equals(this.language, shopifySubscriptionCreationRequest.language) &&
        Objects.equals(this.shippingAddress, shopifySubscriptionCreationRequest.shippingAddress) &&
        Objects.equals(this.shippingMethodName, shopifySubscriptionCreationRequest.shippingMethodName) &&
        Objects.equals(this.spaceViewId, shopifySubscriptionCreationRequest.spaceViewId) &&
        Objects.equals(this.storeOrderConfirmationEmailEnabled, shopifySubscriptionCreationRequest.storeOrderConfirmationEmailEnabled) &&
        Objects.equals(this.subscriber, shopifySubscriptionCreationRequest.subscriber) &&
        Objects.equals(this.subscriberSuspensionAllowed, shopifySubscriptionCreationRequest.subscriberSuspensionAllowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, billingConfiguration, currency, externalId, integration, items, language, shippingAddress, shippingMethodName, spaceViewId, storeOrderConfirmationEmailEnabled, subscriber, subscriberSuspensionAllowed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopifySubscriptionCreationRequest {\n");
    
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    billingConfiguration: ").append(toIndentedString(billingConfiguration)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    shippingMethodName: ").append(toIndentedString(shippingMethodName)).append("\n");
    sb.append("    spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
    sb.append("    storeOrderConfirmationEmailEnabled: ").append(toIndentedString(storeOrderConfirmationEmailEnabled)).append("\n");
    sb.append("    subscriber: ").append(toIndentedString(subscriber)).append("\n");
    sb.append("    subscriberSuspensionAllowed: ").append(toIndentedString(subscriberSuspensionAllowed)).append("\n");
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

