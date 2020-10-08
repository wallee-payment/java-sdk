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

import java.math.BigDecimal;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wallee.sdk.model.enums.ShopifySubscriptionBillingIntervalUnit;
import com.wallee.sdk.model.enums.ShopifySubscriptionProductPricingOption;
import com.wallee.sdk.model.enums.ShopifySubscriptionProductState;
import com.wallee.sdk.model.enums.ShopifySubscriptionWeekday;

/**
 * AbstractShopifySubscriptionProductActive
 */

public class AbstractShopifySubscriptionProductActive extends Indentable {

    @JsonProperty("absolutePriceAdjustment")
    protected BigDecimal absolutePriceAdjustment;


    @JsonProperty("billingDayOfMonth")
    protected Integer billingDayOfMonth;


    @JsonProperty("billingIntervalAmount")
    protected Integer billingIntervalAmount;


    @JsonProperty("billingIntervalUnit")
    protected ShopifySubscriptionBillingIntervalUnit billingIntervalUnit;


    @JsonProperty("billingWeekday")
    protected ShopifySubscriptionWeekday billingWeekday;


    @JsonProperty("fixedPrice")
    protected BigDecimal fixedPrice;


    @JsonProperty("maximalBillingCycles")
    protected Integer maximalBillingCycles;


    @JsonProperty("maximalSuspendableCycles")
    protected Integer maximalSuspendableCycles;


    @JsonProperty("minimalBillingCycles")
    protected Integer minimalBillingCycles;


    @JsonProperty("pricingOption")
    protected ShopifySubscriptionProductPricingOption pricingOption;


    @JsonProperty("relativePriceAdjustment")
    protected BigDecimal relativePriceAdjustment;


    @JsonProperty("state")
    protected ShopifySubscriptionProductState state;


    @JsonProperty("storeOrderConfirmationEmailEnabled")
    protected Boolean storeOrderConfirmationEmailEnabled;


    @JsonProperty("subscriberSuspensionAllowed")
    protected Boolean subscriberSuspensionAllowed;


    @JsonProperty("terminationBillingCycles")
    protected Integer terminationBillingCycles;


    public AbstractShopifySubscriptionProductActive absolutePriceAdjustment(BigDecimal absolutePriceAdjustment) {
        this.absolutePriceAdjustment = absolutePriceAdjustment;
        return this;
    }

    /**
     * @return absolutePriceAdjustment
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getAbsolutePriceAdjustment() {
        return absolutePriceAdjustment;
    }

    public void setAbsolutePriceAdjustment(BigDecimal absolutePriceAdjustment) {
        this.absolutePriceAdjustment = absolutePriceAdjustment;
    }


    public AbstractShopifySubscriptionProductActive billingDayOfMonth(Integer billingDayOfMonth) {
        this.billingDayOfMonth = billingDayOfMonth;
        return this;
    }

    /**
     * Define the day of the month on which the recurring orders should be created.
     *
     * @return billingDayOfMonth
     **/
    @ApiModelProperty(value = "Define the day of the month on which the recurring orders should be created.")
    public Integer getBillingDayOfMonth() {
        return billingDayOfMonth;
    }

    public void setBillingDayOfMonth(Integer billingDayOfMonth) {
        this.billingDayOfMonth = billingDayOfMonth;
    }


    public AbstractShopifySubscriptionProductActive billingIntervalAmount(Integer billingIntervalAmount) {
        this.billingIntervalAmount = billingIntervalAmount;
        return this;
    }

    /**
     * @return billingIntervalAmount
     **/
    @ApiModelProperty(value = "")
    public Integer getBillingIntervalAmount() {
        return billingIntervalAmount;
    }

    public void setBillingIntervalAmount(Integer billingIntervalAmount) {
        this.billingIntervalAmount = billingIntervalAmount;
    }


    public AbstractShopifySubscriptionProductActive billingIntervalUnit(ShopifySubscriptionBillingIntervalUnit billingIntervalUnit) {
        this.billingIntervalUnit = billingIntervalUnit;
        return this;
    }

    /**
     * Define how frequently recurring orders should be created.
     *
     * @return billingIntervalUnit
     **/
    @ApiModelProperty(value = "Define how frequently recurring orders should be created.")
    public ShopifySubscriptionBillingIntervalUnit getBillingIntervalUnit() {
        return billingIntervalUnit;
    }

    public void setBillingIntervalUnit(ShopifySubscriptionBillingIntervalUnit billingIntervalUnit) {
        this.billingIntervalUnit = billingIntervalUnit;
    }


    public AbstractShopifySubscriptionProductActive billingWeekday(ShopifySubscriptionWeekday billingWeekday) {
        this.billingWeekday = billingWeekday;
        return this;
    }

    /**
     * Define the weekday on which the recurring orders should be created.
     *
     * @return billingWeekday
     **/
    @ApiModelProperty(value = "Define the weekday on which the recurring orders should be created.")
    public ShopifySubscriptionWeekday getBillingWeekday() {
        return billingWeekday;
    }

    public void setBillingWeekday(ShopifySubscriptionWeekday billingWeekday) {
        this.billingWeekday = billingWeekday;
    }


    public AbstractShopifySubscriptionProductActive fixedPrice(BigDecimal fixedPrice) {
        this.fixedPrice = fixedPrice;
        return this;
    }

    /**
     * @return fixedPrice
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getFixedPrice() {
        return fixedPrice;
    }

    public void setFixedPrice(BigDecimal fixedPrice) {
        this.fixedPrice = fixedPrice;
    }


    public AbstractShopifySubscriptionProductActive maximalBillingCycles(Integer maximalBillingCycles) {
        this.maximalBillingCycles = maximalBillingCycles;
        return this;
    }

    /**
     * Define the maximum number of orders the subscription will run for.
     *
     * @return maximalBillingCycles
     **/
    @ApiModelProperty(value = "Define the maximum number of orders the subscription will run for.")
    public Integer getMaximalBillingCycles() {
        return maximalBillingCycles;
    }

    public void setMaximalBillingCycles(Integer maximalBillingCycles) {
        this.maximalBillingCycles = maximalBillingCycles;
    }


    public AbstractShopifySubscriptionProductActive maximalSuspendableCycles(Integer maximalSuspendableCycles) {
        this.maximalSuspendableCycles = maximalSuspendableCycles;
        return this;
    }

    /**
     * Define the maximum number of orders the subscription can be suspended for at a time.
     *
     * @return maximalSuspendableCycles
     **/
    @ApiModelProperty(value = "Define the maximum number of orders the subscription can be suspended for at a time.")
    public Integer getMaximalSuspendableCycles() {
        return maximalSuspendableCycles;
    }

    public void setMaximalSuspendableCycles(Integer maximalSuspendableCycles) {
        this.maximalSuspendableCycles = maximalSuspendableCycles;
    }


    public AbstractShopifySubscriptionProductActive minimalBillingCycles(Integer minimalBillingCycles) {
        this.minimalBillingCycles = minimalBillingCycles;
        return this;
    }

    /**
     * Define the minimal number of orders the subscription will run for.
     *
     * @return minimalBillingCycles
     **/
    @ApiModelProperty(value = "Define the minimal number of orders the subscription will run for.")
    public Integer getMinimalBillingCycles() {
        return minimalBillingCycles;
    }

    public void setMinimalBillingCycles(Integer minimalBillingCycles) {
        this.minimalBillingCycles = minimalBillingCycles;
    }


    public AbstractShopifySubscriptionProductActive pricingOption(ShopifySubscriptionProductPricingOption pricingOption) {
        this.pricingOption = pricingOption;
        return this;
    }

    /**
     * @return pricingOption
     **/
    @ApiModelProperty(value = "")
    public ShopifySubscriptionProductPricingOption getPricingOption() {
        return pricingOption;
    }

    public void setPricingOption(ShopifySubscriptionProductPricingOption pricingOption) {
        this.pricingOption = pricingOption;
    }


    public AbstractShopifySubscriptionProductActive relativePriceAdjustment(BigDecimal relativePriceAdjustment) {
        this.relativePriceAdjustment = relativePriceAdjustment;
        return this;
    }

    /**
     * @return relativePriceAdjustment
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getRelativePriceAdjustment() {
        return relativePriceAdjustment;
    }

    public void setRelativePriceAdjustment(BigDecimal relativePriceAdjustment) {
        this.relativePriceAdjustment = relativePriceAdjustment;
    }


    public AbstractShopifySubscriptionProductActive state(ShopifySubscriptionProductState state) {
        this.state = state;
        return this;
    }

    /**
     * @return state
     **/
    @ApiModelProperty(value = "")
    public ShopifySubscriptionProductState getState() {
        return state;
    }

    public void setState(ShopifySubscriptionProductState state) {
        this.state = state;
    }


    public AbstractShopifySubscriptionProductActive storeOrderConfirmationEmailEnabled(Boolean storeOrderConfirmationEmailEnabled) {
        this.storeOrderConfirmationEmailEnabled = storeOrderConfirmationEmailEnabled;
        return this;
    }

    /**
     * Define whether the order confirmation email of the Shopify shop is sent to the customer for recurring orders.
     *
     * @return storeOrderConfirmationEmailEnabled
     **/
    @ApiModelProperty(value = "Define whether the order confirmation email of the Shopify shop is sent to the customer for recurring orders.")
    public Boolean isStoreOrderConfirmationEmailEnabled() {
        return storeOrderConfirmationEmailEnabled;
    }

    public void setStoreOrderConfirmationEmailEnabled(Boolean storeOrderConfirmationEmailEnabled) {
        this.storeOrderConfirmationEmailEnabled = storeOrderConfirmationEmailEnabled;
    }


    public AbstractShopifySubscriptionProductActive subscriberSuspensionAllowed(Boolean subscriberSuspensionAllowed) {
        this.subscriberSuspensionAllowed = subscriberSuspensionAllowed;
        return this;
    }

    /**
     * Define whether the customer is allowed to suspend subscriptions.
     *
     * @return subscriberSuspensionAllowed
     **/
    @ApiModelProperty(value = "Define whether the customer is allowed to suspend subscriptions.")
    public Boolean isSubscriberSuspensionAllowed() {
        return subscriberSuspensionAllowed;
    }

    public void setSubscriberSuspensionAllowed(Boolean subscriberSuspensionAllowed) {
        this.subscriberSuspensionAllowed = subscriberSuspensionAllowed;
    }


    public AbstractShopifySubscriptionProductActive terminationBillingCycles(Integer terminationBillingCycles) {
        this.terminationBillingCycles = terminationBillingCycles;
        return this;
    }

    /**
     * Define the number of orders the subscription will keep running for after its termination has been requested.
     *
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbstractShopifySubscriptionProductActive abstractShopifySubscriptionProductActive = (AbstractShopifySubscriptionProductActive) o;
        return Objects.equals(this.absolutePriceAdjustment, abstractShopifySubscriptionProductActive.absolutePriceAdjustment) &&
                Objects.equals(this.billingDayOfMonth, abstractShopifySubscriptionProductActive.billingDayOfMonth) &&
                Objects.equals(this.billingIntervalAmount, abstractShopifySubscriptionProductActive.billingIntervalAmount) &&
                this.billingIntervalUnit == abstractShopifySubscriptionProductActive.billingIntervalUnit
                && this.billingWeekday == abstractShopifySubscriptionProductActive.billingWeekday &&
                Objects.equals(this.fixedPrice, abstractShopifySubscriptionProductActive.fixedPrice) &&
                Objects.equals(this.maximalBillingCycles, abstractShopifySubscriptionProductActive.maximalBillingCycles) &&
                Objects.equals(this.maximalSuspendableCycles, abstractShopifySubscriptionProductActive.maximalSuspendableCycles) &&
                Objects.equals(this.minimalBillingCycles, abstractShopifySubscriptionProductActive.minimalBillingCycles) &&
                this.pricingOption == abstractShopifySubscriptionProductActive.pricingOption &&
                Objects.equals(this.relativePriceAdjustment, abstractShopifySubscriptionProductActive.relativePriceAdjustment) &&
                this.state == abstractShopifySubscriptionProductActive.state &&
                Objects.equals(this.storeOrderConfirmationEmailEnabled, abstractShopifySubscriptionProductActive.storeOrderConfirmationEmailEnabled) &&
                Objects.equals(this.subscriberSuspensionAllowed, abstractShopifySubscriptionProductActive.subscriberSuspensionAllowed) &&
                Objects.equals(this.terminationBillingCycles, abstractShopifySubscriptionProductActive.terminationBillingCycles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(absolutePriceAdjustment, billingDayOfMonth, billingIntervalAmount, billingIntervalUnit, billingWeekday, fixedPrice, maximalBillingCycles, maximalSuspendableCycles, minimalBillingCycles, pricingOption, relativePriceAdjustment, state, storeOrderConfirmationEmailEnabled, subscriberSuspensionAllowed, terminationBillingCycles);
    }


    @Override
    public String toString() {

        return "class AbstractShopifySubscriptionProductActive { \n" +
            "    absolutePriceAdjustment: " + toIndentedString(absolutePriceAdjustment) + " \n" +
            "    billingDayOfMonth: " + toIndentedString(billingDayOfMonth) + " \n" +
            "    billingIntervalAmount: " + toIndentedString(billingIntervalAmount) + " \n" +
            "    billingIntervalUnit: " + toIndentedString(billingIntervalUnit) + " \n" +
            "    billingWeekday: " + toIndentedString(billingWeekday) + " \n" +
            "    fixedPrice: " + toIndentedString(fixedPrice) + " \n" +
            "    maximalBillingCycles: " + toIndentedString(maximalBillingCycles) + " \n" +
            "    maximalSuspendableCycles: " + toIndentedString(maximalSuspendableCycles) + " \n" +
            "    minimalBillingCycles: " + toIndentedString(minimalBillingCycles) + " \n" +
            "    pricingOption: " + toIndentedString(pricingOption) + " \n" +
            "    relativePriceAdjustment: " + toIndentedString(relativePriceAdjustment) + " \n" +
            "    state: " + toIndentedString(state) + " \n" +
            "    storeOrderConfirmationEmailEnabled: " + toIndentedString(storeOrderConfirmationEmailEnabled) + " \n" +
            "    subscriberSuspensionAllowed: " + toIndentedString(subscriberSuspensionAllowed) + " \n" +
            "    terminationBillingCycles: " + toIndentedString(terminationBillingCycles) + " \n" +
            "}";
    }

}

