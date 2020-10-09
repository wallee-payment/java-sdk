/**
 * SDK
 * <p>
 * This library allows to interact with the  payment service.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.wallee.sdk.model;

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")

public class ShopifySubscriptionProductCreate extends AbstractShopifySubscriptionProductActive implements
  UpsertableEntity {

    @JsonProperty("productId")
    protected String productId;


    @JsonProperty("productVariantId")
    protected String productVariantId;


    @JsonProperty("shop")
    protected Long shop;


    public ShopifySubscriptionProductCreate productId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * The ID of the Shopify product that is enabled to be ordered as subscription.
     *
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
    public boolean equals(Object o) {
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
                this.billingIntervalUnit == shopifySubscriptionProductCreate.billingIntervalUnit
                && this.billingWeekday == shopifySubscriptionProductCreate.billingWeekday &&
                Objects.equals(this.fixedPrice, shopifySubscriptionProductCreate.fixedPrice) &&
                Objects.equals(this.maximalBillingCycles, shopifySubscriptionProductCreate.maximalBillingCycles) &&
                Objects.equals(this.maximalSuspendableCycles, shopifySubscriptionProductCreate.maximalSuspendableCycles) &&
                Objects.equals(this.minimalBillingCycles, shopifySubscriptionProductCreate.minimalBillingCycles) &&
                this.pricingOption == shopifySubscriptionProductCreate.pricingOption &&
                Objects.equals(this.relativePriceAdjustment, shopifySubscriptionProductCreate.relativePriceAdjustment) &&
                this.state == shopifySubscriptionProductCreate.state &&
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
        return "class ShopifySubscriptionProductCreate { \n" +
            "    " + toIndentedString(super.toString()) +  "\n" +
            "    absolutePriceAdjustment: " + toIndentedString(absolutePriceAdjustment) +  "\n" +
            "    billingDayOfMonth: " + toIndentedString(billingDayOfMonth) + " \n" +
            "    billingIntervalAmount: " + toIndentedString(billingIntervalAmount) + " \n" +
            "    billingIntervalUnit: " +  toIndentedString(billingIntervalUnit) + " \n" +
            "    billingWeekday: " + toIndentedString(billingWeekday) +  "\n" +
            "    fixedPrice: " + toIndentedString(fixedPrice) + " \n" +
            "    maximalBillingCycles: " +  toIndentedString(maximalBillingCycles) + " \n" +
            "    maximalSuspendableCycles: " + toIndentedString(maximalSuspendableCycles) + "\n" +
            "    minimalBillingCycles: " + toIndentedString(minimalBillingCycles) + " \n" +
            "    pricingOption: " + toIndentedString(pricingOption) + " \n" +
            "    relativePriceAdjustment: " +  toIndentedString(relativePriceAdjustment) + " \n" +
            "    state: " + toIndentedString(state) +  "\n" +
            "    storeOrderConfirmationEmailEnabled: " + toIndentedString(storeOrderConfirmationEmailEnabled) +  "\n" +
            "    subscriberSuspensionAllowed: " + toIndentedString(subscriberSuspensionAllowed) +  "\n" +
            "    terminationBillingCycles: " + toIndentedString(terminationBillingCycles) + " \n" +
            "    productId: " + toIndentedString(productId) + " \n" +
            "    productVariantId: " + toIndentedString(productVariantId) +  "\n" +
            "    shop: " + toIndentedString(shop) + " \n" +
            "}";
        }


}

