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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;


@ApiModel(description = "")

public class ShopifySubscriptionProductActive extends AbstractShopifySubscriptionProductActive {

    @JsonProperty("id")
    protected Long id;


    @JsonProperty("version")
    protected Long version;


    public ShopifySubscriptionProductActive id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The ID is the primary key of the entity. The ID identifies the entity uniquely.
     *
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
     *
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
    public boolean equals(Object o) {
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
                this.billingIntervalUnit == shopifySubscriptionProductActive.billingIntervalUnit
                && this.billingWeekday == shopifySubscriptionProductActive.billingWeekday &&
                Objects.equals(this.fixedPrice, shopifySubscriptionProductActive.fixedPrice) &&
                Objects.equals(this.maximalBillingCycles, shopifySubscriptionProductActive.maximalBillingCycles) &&
                Objects.equals(this.maximalSuspendableCycles, shopifySubscriptionProductActive.maximalSuspendableCycles) &&
                Objects.equals(this.minimalBillingCycles, shopifySubscriptionProductActive.minimalBillingCycles) &&
                this.pricingOption == shopifySubscriptionProductActive.pricingOption &&
                Objects.equals(this.relativePriceAdjustment, shopifySubscriptionProductActive.relativePriceAdjustment) &&
                this.state == shopifySubscriptionProductActive.state &&
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
        return "class ShopifySubscriptionProductActive { \n" +
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
            "    id: " + toIndentedString(id) + " \n" +
            "    version: " + toIndentedString(version) + " \n" +
            "}";
        }


}

