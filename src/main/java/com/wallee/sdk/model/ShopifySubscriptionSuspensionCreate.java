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

import java.time.OffsetDateTime;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")

public class ShopifySubscriptionSuspensionCreate extends Indentable {
  
  @JsonProperty("plannedEndDate")
  protected OffsetDateTime plannedEndDate;

  
  @JsonProperty("subscription")
  protected Long subscription;

  
  @JsonProperty("type")
  protected ShopifySubscriptionSuspensionType type;

  
  
  public ShopifySubscriptionSuspensionCreate plannedEndDate(OffsetDateTime plannedEndDate) {
    this.plannedEndDate = plannedEndDate;
    return this;
  }

   /**
   * 
   * @return plannedEndDate
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getPlannedEndDate() {
    return plannedEndDate;
  }

  public void setPlannedEndDate(OffsetDateTime plannedEndDate) {
    this.plannedEndDate = plannedEndDate;
  }

  
  public ShopifySubscriptionSuspensionCreate subscription(Long subscription) {
    this.subscription = subscription;
    return this;
  }

   /**
   * 
   * @return subscription
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getSubscription() {
    return subscription;
  }

  public void setSubscription(Long subscription) {
    this.subscription = subscription;
  }

  
  public ShopifySubscriptionSuspensionCreate type(ShopifySubscriptionSuspensionType type) {
    this.type = type;
    return this;
  }

   /**
   * 
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public ShopifySubscriptionSuspensionType getType() {
    return type;
  }

  public void setType(ShopifySubscriptionSuspensionType type) {
    this.type = type;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopifySubscriptionSuspensionCreate shopifySubscriptionSuspensionCreate = (ShopifySubscriptionSuspensionCreate) o;
    return Objects.equals(this.plannedEndDate, shopifySubscriptionSuspensionCreate.plannedEndDate) &&
        Objects.equals(this.subscription, shopifySubscriptionSuspensionCreate.subscription) && this.type
      == shopifySubscriptionSuspensionCreate.type;
  }

  @Override
  public int hashCode() {
    return Objects.hash(plannedEndDate, subscription, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopifySubscriptionSuspensionCreate {\n");
    
    sb.append("    plannedEndDate: ").append(toIndentedString(plannedEndDate)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }



}

