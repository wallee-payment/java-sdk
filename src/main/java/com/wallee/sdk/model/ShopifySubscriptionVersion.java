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
import com.wallee.sdk.model.ShopifySubscription;
import com.wallee.sdk.model.ShopifySubscriptionAddress;
import com.wallee.sdk.model.ShopifySubscriptionBillingIntervalUnit;
import com.wallee.sdk.model.ShopifySubscriptionVersionItem;
import com.wallee.sdk.model.ShopifySubscriptionVersionState;
import com.wallee.sdk.model.ShopifySubscriptionWeekday;
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

public class ShopifySubscriptionVersion {
  
  @JsonProperty("billingAddress")
  protected ShopifySubscriptionAddress billingAddress = null;

  
  @JsonProperty("billingDayOfMonth")
  protected Integer billingDayOfMonth = null;

  
  @JsonProperty("billingIntervalAmount")
  protected Integer billingIntervalAmount = null;

  
  @JsonProperty("billingIntervalUnit")
  protected ShopifySubscriptionBillingIntervalUnit billingIntervalUnit = null;

  
  @JsonProperty("billingReferenceDate")
  protected OffsetDateTime billingReferenceDate = null;

  
  @JsonProperty("billingWeekday")
  protected ShopifySubscriptionWeekday billingWeekday = null;

  
  @JsonProperty("createdBy")
  protected Long createdBy = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("currency")
  protected String currency = null;

  
  @JsonProperty("dischargedBy")
  protected Long dischargedBy = null;

  
  @JsonProperty("dischargedOn")
  protected OffsetDateTime dischargedOn = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("items")
  protected List<ShopifySubscriptionVersionItem> items = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("maximalBillingCycles")
  protected Integer maximalBillingCycles = null;

  
  @JsonProperty("maximalSuspendableCycles")
  protected Integer maximalSuspendableCycles = null;

  
  @JsonProperty("minimalBillingCycles")
  protected Integer minimalBillingCycles = null;

  
  @JsonProperty("paymentGateway")
  protected String paymentGateway = null;

  
  @JsonProperty("shippingAddress")
  protected ShopifySubscriptionAddress shippingAddress = null;

  
  @JsonProperty("shippingRate")
  protected String shippingRate = null;

  
  @JsonProperty("shop")
  protected Long shop = null;

  
  @JsonProperty("state")
  protected ShopifySubscriptionVersionState state = null;

  
  @JsonProperty("storeOrderConfirmationEmailEnabled")
  protected Boolean storeOrderConfirmationEmailEnabled = null;

  
  @JsonProperty("subscriberSuspensionAllowed")
  protected Boolean subscriberSuspensionAllowed = null;

  
  @JsonProperty("subscription")
  protected ShopifySubscription subscription = null;

  
  @JsonProperty("terminationBillingCycles")
  protected Integer terminationBillingCycles = null;

  
  @JsonProperty("token")
  protected Long token = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * 
   * @return billingAddress
  **/
  @ApiModelProperty(value = "")
  public ShopifySubscriptionAddress getBillingAddress() {
    return billingAddress;
  }

  
   /**
   * 
   * @return billingDayOfMonth
  **/
  @ApiModelProperty(value = "")
  public Integer getBillingDayOfMonth() {
    return billingDayOfMonth;
  }

  
   /**
   * 
   * @return billingIntervalAmount
  **/
  @ApiModelProperty(value = "")
  public Integer getBillingIntervalAmount() {
    return billingIntervalAmount;
  }

  
   /**
   * 
   * @return billingIntervalUnit
  **/
  @ApiModelProperty(value = "")
  public ShopifySubscriptionBillingIntervalUnit getBillingIntervalUnit() {
    return billingIntervalUnit;
  }

  
   /**
   * 
   * @return billingReferenceDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getBillingReferenceDate() {
    return billingReferenceDate;
  }

  
   /**
   * 
   * @return billingWeekday
  **/
  @ApiModelProperty(value = "")
  public ShopifySubscriptionWeekday getBillingWeekday() {
    return billingWeekday;
  }

  
   /**
   * 
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public Long getCreatedBy() {
    return createdBy;
  }

  
   /**
   * 
   * @return createdOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * 
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }

  
   /**
   * 
   * @return dischargedBy
  **/
  @ApiModelProperty(value = "")
  public Long getDischargedBy() {
    return dischargedBy;
  }

  
   /**
   * 
   * @return dischargedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDischargedOn() {
    return dischargedOn;
  }

  
   /**
   * The ID is the primary key of the entity. The ID identifies the entity uniquely.
   * @return id
  **/
  @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
  public Long getId() {
    return id;
  }

  
   /**
   * 
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<ShopifySubscriptionVersionItem> getItems() {
    return items;
  }

  
   /**
   * The linked space id holds the ID of the space to which the entity belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * 
   * @return maximalBillingCycles
  **/
  @ApiModelProperty(value = "")
  public Integer getMaximalBillingCycles() {
    return maximalBillingCycles;
  }

  
   /**
   * 
   * @return maximalSuspendableCycles
  **/
  @ApiModelProperty(value = "")
  public Integer getMaximalSuspendableCycles() {
    return maximalSuspendableCycles;
  }

  
   /**
   * 
   * @return minimalBillingCycles
  **/
  @ApiModelProperty(value = "")
  public Integer getMinimalBillingCycles() {
    return minimalBillingCycles;
  }

  
   /**
   * 
   * @return paymentGateway
  **/
  @ApiModelProperty(value = "")
  public String getPaymentGateway() {
    return paymentGateway;
  }

  
   /**
   * 
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "")
  public ShopifySubscriptionAddress getShippingAddress() {
    return shippingAddress;
  }

  
   /**
   * 
   * @return shippingRate
  **/
  @ApiModelProperty(value = "")
  public String getShippingRate() {
    return shippingRate;
  }

  
   /**
   * 
   * @return shop
  **/
  @ApiModelProperty(value = "")
  public Long getShop() {
    return shop;
  }

  
   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public ShopifySubscriptionVersionState getState() {
    return state;
  }

  
   /**
   * 
   * @return storeOrderConfirmationEmailEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isStoreOrderConfirmationEmailEnabled() {
    return storeOrderConfirmationEmailEnabled;
  }

  
   /**
   * 
   * @return subscriberSuspensionAllowed
  **/
  @ApiModelProperty(value = "")
  public Boolean isSubscriberSuspensionAllowed() {
    return subscriberSuspensionAllowed;
  }

  
   /**
   * 
   * @return subscription
  **/
  @ApiModelProperty(value = "")
  public ShopifySubscription getSubscription() {
    return subscription;
  }

  
   /**
   * 
   * @return terminationBillingCycles
  **/
  @ApiModelProperty(value = "")
  public Integer getTerminationBillingCycles() {
    return terminationBillingCycles;
  }

  
   /**
   * 
   * @return token
  **/
  @ApiModelProperty(value = "")
  public Long getToken() {
    return token;
  }

  
   /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
  **/
  @ApiModelProperty(value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
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
    ShopifySubscriptionVersion shopifySubscriptionVersion = (ShopifySubscriptionVersion) o;
    return Objects.equals(this.billingAddress, shopifySubscriptionVersion.billingAddress) &&
        Objects.equals(this.billingDayOfMonth, shopifySubscriptionVersion.billingDayOfMonth) &&
        Objects.equals(this.billingIntervalAmount, shopifySubscriptionVersion.billingIntervalAmount) &&
        Objects.equals(this.billingIntervalUnit, shopifySubscriptionVersion.billingIntervalUnit) &&
        Objects.equals(this.billingReferenceDate, shopifySubscriptionVersion.billingReferenceDate) &&
        Objects.equals(this.billingWeekday, shopifySubscriptionVersion.billingWeekday) &&
        Objects.equals(this.createdBy, shopifySubscriptionVersion.createdBy) &&
        Objects.equals(this.createdOn, shopifySubscriptionVersion.createdOn) &&
        Objects.equals(this.currency, shopifySubscriptionVersion.currency) &&
        Objects.equals(this.dischargedBy, shopifySubscriptionVersion.dischargedBy) &&
        Objects.equals(this.dischargedOn, shopifySubscriptionVersion.dischargedOn) &&
        Objects.equals(this.id, shopifySubscriptionVersion.id) &&
        Objects.equals(this.items, shopifySubscriptionVersion.items) &&
        Objects.equals(this.linkedSpaceId, shopifySubscriptionVersion.linkedSpaceId) &&
        Objects.equals(this.maximalBillingCycles, shopifySubscriptionVersion.maximalBillingCycles) &&
        Objects.equals(this.maximalSuspendableCycles, shopifySubscriptionVersion.maximalSuspendableCycles) &&
        Objects.equals(this.minimalBillingCycles, shopifySubscriptionVersion.minimalBillingCycles) &&
        Objects.equals(this.paymentGateway, shopifySubscriptionVersion.paymentGateway) &&
        Objects.equals(this.shippingAddress, shopifySubscriptionVersion.shippingAddress) &&
        Objects.equals(this.shippingRate, shopifySubscriptionVersion.shippingRate) &&
        Objects.equals(this.shop, shopifySubscriptionVersion.shop) &&
        Objects.equals(this.state, shopifySubscriptionVersion.state) &&
        Objects.equals(this.storeOrderConfirmationEmailEnabled, shopifySubscriptionVersion.storeOrderConfirmationEmailEnabled) &&
        Objects.equals(this.subscriberSuspensionAllowed, shopifySubscriptionVersion.subscriberSuspensionAllowed) &&
        Objects.equals(this.subscription, shopifySubscriptionVersion.subscription) &&
        Objects.equals(this.terminationBillingCycles, shopifySubscriptionVersion.terminationBillingCycles) &&
        Objects.equals(this.token, shopifySubscriptionVersion.token) &&
        Objects.equals(this.version, shopifySubscriptionVersion.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, billingDayOfMonth, billingIntervalAmount, billingIntervalUnit, billingReferenceDate, billingWeekday, createdBy, createdOn, currency, dischargedBy, dischargedOn, id, items, linkedSpaceId, maximalBillingCycles, maximalSuspendableCycles, minimalBillingCycles, paymentGateway, shippingAddress, shippingRate, shop, state, storeOrderConfirmationEmailEnabled, subscriberSuspensionAllowed, subscription, terminationBillingCycles, token, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopifySubscriptionVersion {\n");
    
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    billingDayOfMonth: ").append(toIndentedString(billingDayOfMonth)).append("\n");
    sb.append("    billingIntervalAmount: ").append(toIndentedString(billingIntervalAmount)).append("\n");
    sb.append("    billingIntervalUnit: ").append(toIndentedString(billingIntervalUnit)).append("\n");
    sb.append("    billingReferenceDate: ").append(toIndentedString(billingReferenceDate)).append("\n");
    sb.append("    billingWeekday: ").append(toIndentedString(billingWeekday)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    dischargedBy: ").append(toIndentedString(dischargedBy)).append("\n");
    sb.append("    dischargedOn: ").append(toIndentedString(dischargedOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    maximalBillingCycles: ").append(toIndentedString(maximalBillingCycles)).append("\n");
    sb.append("    maximalSuspendableCycles: ").append(toIndentedString(maximalSuspendableCycles)).append("\n");
    sb.append("    minimalBillingCycles: ").append(toIndentedString(minimalBillingCycles)).append("\n");
    sb.append("    paymentGateway: ").append(toIndentedString(paymentGateway)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    shippingRate: ").append(toIndentedString(shippingRate)).append("\n");
    sb.append("    shop: ").append(toIndentedString(shop)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    storeOrderConfirmationEmailEnabled: ").append(toIndentedString(storeOrderConfirmationEmailEnabled)).append("\n");
    sb.append("    subscriberSuspensionAllowed: ").append(toIndentedString(subscriberSuspensionAllowed)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    terminationBillingCycles: ").append(toIndentedString(terminationBillingCycles)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

