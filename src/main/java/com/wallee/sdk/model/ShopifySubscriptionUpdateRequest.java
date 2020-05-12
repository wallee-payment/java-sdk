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
import com.wallee.sdk.model.ShopifySubscriptionBillingIntervalUnit;
import com.wallee.sdk.model.ShopifySubscriptionEditModelItem;
import com.wallee.sdk.model.ShopifySubscriptionWeekday;
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

public class ShopifySubscriptionUpdateRequest {
  
  @JsonProperty("billingDayOfMonth")
  protected Integer billingDayOfMonth = null;

  
  @JsonProperty("billingIntervalAmount")
  protected Integer billingIntervalAmount = null;

  
  @JsonProperty("billingIntervalUnit")
  protected ShopifySubscriptionBillingIntervalUnit billingIntervalUnit = null;

  
  @JsonProperty("billingWeekday")
  protected ShopifySubscriptionWeekday billingWeekday = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("items")
  protected List<ShopifySubscriptionEditModelItem> items = null;

  
  @JsonProperty("maximalBillingCycles")
  protected Integer maximalBillingCycles = null;

  
  @JsonProperty("maximalSuspendableCycles")
  protected Integer maximalSuspendableCycles = null;

  
  @JsonProperty("minimalBillingCycles")
  protected Integer minimalBillingCycles = null;

  
  @JsonProperty("storeOrderConfirmationEmailEnabled")
  protected Boolean storeOrderConfirmationEmailEnabled = null;

  
  @JsonProperty("subscriberSuspensionAllowed")
  protected Boolean subscriberSuspensionAllowed = null;

  
  @JsonProperty("terminationBillingCycles")
  protected Integer terminationBillingCycles = null;

  
  
  public ShopifySubscriptionUpdateRequest billingDayOfMonth(Integer billingDayOfMonth) {
    this.billingDayOfMonth = billingDayOfMonth;
    return this;
  }

   /**
   * Define the day of the month on which the recurring orders should be created.
   * @return billingDayOfMonth
  **/
  @ApiModelProperty(value = "Define the day of the month on which the recurring orders should be created.")
  public Integer getBillingDayOfMonth() {
    return billingDayOfMonth;
  }

  public void setBillingDayOfMonth(Integer billingDayOfMonth) {
    this.billingDayOfMonth = billingDayOfMonth;
  }

  
  public ShopifySubscriptionUpdateRequest billingIntervalAmount(Integer billingIntervalAmount) {
    this.billingIntervalAmount = billingIntervalAmount;
    return this;
  }

   /**
   * 
   * @return billingIntervalAmount
  **/
  @ApiModelProperty(value = "")
  public Integer getBillingIntervalAmount() {
    return billingIntervalAmount;
  }

  public void setBillingIntervalAmount(Integer billingIntervalAmount) {
    this.billingIntervalAmount = billingIntervalAmount;
  }

  
  public ShopifySubscriptionUpdateRequest billingIntervalUnit(ShopifySubscriptionBillingIntervalUnit billingIntervalUnit) {
    this.billingIntervalUnit = billingIntervalUnit;
    return this;
  }

   /**
   * Define how frequently recurring orders should be created.
   * @return billingIntervalUnit
  **/
  @ApiModelProperty(value = "Define how frequently recurring orders should be created.")
  public ShopifySubscriptionBillingIntervalUnit getBillingIntervalUnit() {
    return billingIntervalUnit;
  }

  public void setBillingIntervalUnit(ShopifySubscriptionBillingIntervalUnit billingIntervalUnit) {
    this.billingIntervalUnit = billingIntervalUnit;
  }

  
  public ShopifySubscriptionUpdateRequest billingWeekday(ShopifySubscriptionWeekday billingWeekday) {
    this.billingWeekday = billingWeekday;
    return this;
  }

   /**
   * Define the weekday on which the recurring orders should be created.
   * @return billingWeekday
  **/
  @ApiModelProperty(value = "Define the weekday on which the recurring orders should be created.")
  public ShopifySubscriptionWeekday getBillingWeekday() {
    return billingWeekday;
  }

  public void setBillingWeekday(ShopifySubscriptionWeekday billingWeekday) {
    this.billingWeekday = billingWeekday;
  }

  
  public ShopifySubscriptionUpdateRequest id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  
  public ShopifySubscriptionUpdateRequest items(List<ShopifySubscriptionEditModelItem> items) {
    this.items = items;
    return this;
  }

  public ShopifySubscriptionUpdateRequest addItemsItem(ShopifySubscriptionEditModelItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * 
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<ShopifySubscriptionEditModelItem> getItems() {
    return items;
  }

  public void setItems(List<ShopifySubscriptionEditModelItem> items) {
    this.items = items;
  }

  
  public ShopifySubscriptionUpdateRequest maximalBillingCycles(Integer maximalBillingCycles) {
    this.maximalBillingCycles = maximalBillingCycles;
    return this;
  }

   /**
   * Define the maximum number of orders the subscription will run for.
   * @return maximalBillingCycles
  **/
  @ApiModelProperty(value = "Define the maximum number of orders the subscription will run for.")
  public Integer getMaximalBillingCycles() {
    return maximalBillingCycles;
  }

  public void setMaximalBillingCycles(Integer maximalBillingCycles) {
    this.maximalBillingCycles = maximalBillingCycles;
  }

  
  public ShopifySubscriptionUpdateRequest maximalSuspendableCycles(Integer maximalSuspendableCycles) {
    this.maximalSuspendableCycles = maximalSuspendableCycles;
    return this;
  }

   /**
   * Define the maximum number of orders the subscription can be suspended for at a time.
   * @return maximalSuspendableCycles
  **/
  @ApiModelProperty(value = "Define the maximum number of orders the subscription can be suspended for at a time.")
  public Integer getMaximalSuspendableCycles() {
    return maximalSuspendableCycles;
  }

  public void setMaximalSuspendableCycles(Integer maximalSuspendableCycles) {
    this.maximalSuspendableCycles = maximalSuspendableCycles;
  }

  
  public ShopifySubscriptionUpdateRequest minimalBillingCycles(Integer minimalBillingCycles) {
    this.minimalBillingCycles = minimalBillingCycles;
    return this;
  }

   /**
   * Define the minimal number of orders the subscription will run for.
   * @return minimalBillingCycles
  **/
  @ApiModelProperty(value = "Define the minimal number of orders the subscription will run for.")
  public Integer getMinimalBillingCycles() {
    return minimalBillingCycles;
  }

  public void setMinimalBillingCycles(Integer minimalBillingCycles) {
    this.minimalBillingCycles = minimalBillingCycles;
  }

  
  public ShopifySubscriptionUpdateRequest storeOrderConfirmationEmailEnabled(Boolean storeOrderConfirmationEmailEnabled) {
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

  
  public ShopifySubscriptionUpdateRequest subscriberSuspensionAllowed(Boolean subscriberSuspensionAllowed) {
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

  
  public ShopifySubscriptionUpdateRequest terminationBillingCycles(Integer terminationBillingCycles) {
    this.terminationBillingCycles = terminationBillingCycles;
    return this;
  }

   /**
   * Define the number of orders the subscription will keep running for after its termination has been requested.
   * @return terminationBillingCycles
  **/
  @ApiModelProperty(value = "Define the number of orders the subscription will keep running for after its termination has been requested.")
  public Integer getTerminationBillingCycles() {
    return terminationBillingCycles;
  }

  public void setTerminationBillingCycles(Integer terminationBillingCycles) {
    this.terminationBillingCycles = terminationBillingCycles;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopifySubscriptionUpdateRequest shopifySubscriptionUpdateRequest = (ShopifySubscriptionUpdateRequest) o;
    return Objects.equals(this.billingDayOfMonth, shopifySubscriptionUpdateRequest.billingDayOfMonth) &&
        Objects.equals(this.billingIntervalAmount, shopifySubscriptionUpdateRequest.billingIntervalAmount) &&
        Objects.equals(this.billingIntervalUnit, shopifySubscriptionUpdateRequest.billingIntervalUnit) &&
        Objects.equals(this.billingWeekday, shopifySubscriptionUpdateRequest.billingWeekday) &&
        Objects.equals(this.id, shopifySubscriptionUpdateRequest.id) &&
        Objects.equals(this.items, shopifySubscriptionUpdateRequest.items) &&
        Objects.equals(this.maximalBillingCycles, shopifySubscriptionUpdateRequest.maximalBillingCycles) &&
        Objects.equals(this.maximalSuspendableCycles, shopifySubscriptionUpdateRequest.maximalSuspendableCycles) &&
        Objects.equals(this.minimalBillingCycles, shopifySubscriptionUpdateRequest.minimalBillingCycles) &&
        Objects.equals(this.storeOrderConfirmationEmailEnabled, shopifySubscriptionUpdateRequest.storeOrderConfirmationEmailEnabled) &&
        Objects.equals(this.subscriberSuspensionAllowed, shopifySubscriptionUpdateRequest.subscriberSuspensionAllowed) &&
        Objects.equals(this.terminationBillingCycles, shopifySubscriptionUpdateRequest.terminationBillingCycles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingDayOfMonth, billingIntervalAmount, billingIntervalUnit, billingWeekday, id, items, maximalBillingCycles, maximalSuspendableCycles, minimalBillingCycles, storeOrderConfirmationEmailEnabled, subscriberSuspensionAllowed, terminationBillingCycles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopifySubscriptionUpdateRequest {\n");
    
    sb.append("    billingDayOfMonth: ").append(toIndentedString(billingDayOfMonth)).append("\n");
    sb.append("    billingIntervalAmount: ").append(toIndentedString(billingIntervalAmount)).append("\n");
    sb.append("    billingIntervalUnit: ").append(toIndentedString(billingIntervalUnit)).append("\n");
    sb.append("    billingWeekday: ").append(toIndentedString(billingWeekday)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    maximalBillingCycles: ").append(toIndentedString(maximalBillingCycles)).append("\n");
    sb.append("    maximalSuspendableCycles: ").append(toIndentedString(maximalSuspendableCycles)).append("\n");
    sb.append("    minimalBillingCycles: ").append(toIndentedString(minimalBillingCycles)).append("\n");
    sb.append("    storeOrderConfirmationEmailEnabled: ").append(toIndentedString(storeOrderConfirmationEmailEnabled)).append("\n");
    sb.append("    subscriberSuspensionAllowed: ").append(toIndentedString(subscriberSuspensionAllowed)).append("\n");
    sb.append("    terminationBillingCycles: ").append(toIndentedString(terminationBillingCycles)).append("\n");
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

