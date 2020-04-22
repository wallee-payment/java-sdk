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
import com.wallee.sdk.model.AbstractShopifySubscriptionProductActive;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.wallee.sdk.java.WalleeJavaClientCodegen", date = "2020-04-22T16:32:44.639+02:00")
public class ShopifySubscriptionProductActive extends AbstractShopifySubscriptionProductActive {
  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("version")
  protected Long version = null;

  
  
  public ShopifySubscriptionProductActive id(Long id) {
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

  
  public ShopifySubscriptionProductActive version(Long version) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopifySubscriptionProductActive shopifySubscriptionProductActive = (ShopifySubscriptionProductActive) o;
    return Objects.equals(this.absolutePriceAdjustment, shopifySubscriptionProductActive.absolutePriceAdjustment) &&
        Objects.equals(this.billingDayOfMonth, shopifySubscriptionProductActive.billingDayOfMonth) &&
        Objects.equals(this.billingIntervalAmount, shopifySubscriptionProductActive.billingIntervalAmount) &&
        Objects.equals(this.billingIntervalUnit, shopifySubscriptionProductActive.billingIntervalUnit) &&
        Objects.equals(this.billingWeekday, shopifySubscriptionProductActive.billingWeekday) &&
        Objects.equals(this.fixedPrice, shopifySubscriptionProductActive.fixedPrice) &&
        Objects.equals(this.maximalBillingCycles, shopifySubscriptionProductActive.maximalBillingCycles) &&
        Objects.equals(this.maximalSuspendableCycles, shopifySubscriptionProductActive.maximalSuspendableCycles) &&
        Objects.equals(this.minimalBillingCycles, shopifySubscriptionProductActive.minimalBillingCycles) &&
        Objects.equals(this.pricingOption, shopifySubscriptionProductActive.pricingOption) &&
        Objects.equals(this.relativePriceAdjustment, shopifySubscriptionProductActive.relativePriceAdjustment) &&
        Objects.equals(this.state, shopifySubscriptionProductActive.state) &&
        Objects.equals(this.storeOrderConfirmationEmailEnabled, shopifySubscriptionProductActive.storeOrderConfirmationEmailEnabled) &&
        Objects.equals(this.subscriberSuspensionAllowed, shopifySubscriptionProductActive.subscriberSuspensionAllowed) &&
        Objects.equals(this.terminationBillingCycles, shopifySubscriptionProductActive.terminationBillingCycles) &&
        Objects.equals(this.id, shopifySubscriptionProductActive.id) &&
        Objects.equals(this.version, shopifySubscriptionProductActive.version) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absolutePriceAdjustment, billingDayOfMonth, billingIntervalAmount, billingIntervalUnit, billingWeekday, fixedPrice, maximalBillingCycles, maximalSuspendableCycles, minimalBillingCycles, pricingOption, relativePriceAdjustment, state, storeOrderConfirmationEmailEnabled, subscriberSuspensionAllowed, terminationBillingCycles, id, version, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopifySubscriptionProductActive {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    absolutePriceAdjustment: ").append(toIndentedString(absolutePriceAdjustment)).append("\n");
    sb.append("    billingDayOfMonth: ").append(toIndentedString(billingDayOfMonth)).append("\n");
    sb.append("    billingIntervalAmount: ").append(toIndentedString(billingIntervalAmount)).append("\n");
    sb.append("    billingIntervalUnit: ").append(toIndentedString(billingIntervalUnit)).append("\n");
    sb.append("    billingWeekday: ").append(toIndentedString(billingWeekday)).append("\n");
    sb.append("    fixedPrice: ").append(toIndentedString(fixedPrice)).append("\n");
    sb.append("    maximalBillingCycles: ").append(toIndentedString(maximalBillingCycles)).append("\n");
    sb.append("    maximalSuspendableCycles: ").append(toIndentedString(maximalSuspendableCycles)).append("\n");
    sb.append("    minimalBillingCycles: ").append(toIndentedString(minimalBillingCycles)).append("\n");
    sb.append("    pricingOption: ").append(toIndentedString(pricingOption)).append("\n");
    sb.append("    relativePriceAdjustment: ").append(toIndentedString(relativePriceAdjustment)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    storeOrderConfirmationEmailEnabled: ").append(toIndentedString(storeOrderConfirmationEmailEnabled)).append("\n");
    sb.append("    subscriberSuspensionAllowed: ").append(toIndentedString(subscriberSuspensionAllowed)).append("\n");
    sb.append("    terminationBillingCycles: ").append(toIndentedString(terminationBillingCycles)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

