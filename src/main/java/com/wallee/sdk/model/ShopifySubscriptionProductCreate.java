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

public class ShopifySubscriptionProductCreate extends AbstractShopifySubscriptionProductActive {
  
  @JsonProperty("productId")
  protected String productId = null;

  
  @JsonProperty("productVariantId")
  protected String productVariantId = null;

  
  @JsonProperty("shop")
  protected Long shop = null;

  
  
  public ShopifySubscriptionProductCreate productId(String productId) {
    this.productId = productId;
    return this;
  }

   /**
   * The ID of the Shopify product that is enabled to be ordered as subscription.
   * @return productId
  **/
  @ApiModelProperty(value = "The ID of the Shopify product that is enabled to be ordered as subscription.")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  
  public ShopifySubscriptionProductCreate productVariantId(String productVariantId) {
    this.productVariantId = productVariantId;
    return this;
  }

   /**
   * 
   * @return productVariantId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getProductVariantId() {
    return productVariantId;
  }

  public void setProductVariantId(String productVariantId) {
    this.productVariantId = productVariantId;
  }

  
  public ShopifySubscriptionProductCreate shop(Long shop) {
    this.shop = shop;
    return this;
  }

   /**
   * 
   * @return shop
  **/
  @ApiModelProperty(value = "")
  public Long getShop() {
    return shop;
  }

  public void setShop(Long shop) {
    this.shop = shop;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopifySubscriptionProductCreate shopifySubscriptionProductCreate = (ShopifySubscriptionProductCreate) o;
    return Objects.equals(this.absolutePriceAdjustment, shopifySubscriptionProductCreate.absolutePriceAdjustment) &&
        Objects.equals(this.billingDayOfMonth, shopifySubscriptionProductCreate.billingDayOfMonth) &&
        Objects.equals(this.billingIntervalAmount, shopifySubscriptionProductCreate.billingIntervalAmount) &&
        Objects.equals(this.billingIntervalUnit, shopifySubscriptionProductCreate.billingIntervalUnit) &&
        Objects.equals(this.billingWeekday, shopifySubscriptionProductCreate.billingWeekday) &&
        Objects.equals(this.fixedPrice, shopifySubscriptionProductCreate.fixedPrice) &&
        Objects.equals(this.maximalBillingCycles, shopifySubscriptionProductCreate.maximalBillingCycles) &&
        Objects.equals(this.maximalSuspendableCycles, shopifySubscriptionProductCreate.maximalSuspendableCycles) &&
        Objects.equals(this.minimalBillingCycles, shopifySubscriptionProductCreate.minimalBillingCycles) &&
        Objects.equals(this.pricingOption, shopifySubscriptionProductCreate.pricingOption) &&
        Objects.equals(this.relativePriceAdjustment, shopifySubscriptionProductCreate.relativePriceAdjustment) &&
        Objects.equals(this.state, shopifySubscriptionProductCreate.state) &&
        Objects.equals(this.storeOrderConfirmationEmailEnabled, shopifySubscriptionProductCreate.storeOrderConfirmationEmailEnabled) &&
        Objects.equals(this.subscriberSuspensionAllowed, shopifySubscriptionProductCreate.subscriberSuspensionAllowed) &&
        Objects.equals(this.terminationBillingCycles, shopifySubscriptionProductCreate.terminationBillingCycles) &&
        Objects.equals(this.productId, shopifySubscriptionProductCreate.productId) &&
        Objects.equals(this.productVariantId, shopifySubscriptionProductCreate.productVariantId) &&
        Objects.equals(this.shop, shopifySubscriptionProductCreate.shop) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absolutePriceAdjustment, billingDayOfMonth, billingIntervalAmount, billingIntervalUnit, billingWeekday, fixedPrice, maximalBillingCycles, maximalSuspendableCycles, minimalBillingCycles, pricingOption, relativePriceAdjustment, state, storeOrderConfirmationEmailEnabled, subscriberSuspensionAllowed, terminationBillingCycles, productId, productVariantId, shop, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopifySubscriptionProductCreate {\n");
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
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productVariantId: ").append(toIndentedString(productVariantId)).append("\n");
    sb.append("    shop: ").append(toIndentedString(shop)).append("\n");
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

