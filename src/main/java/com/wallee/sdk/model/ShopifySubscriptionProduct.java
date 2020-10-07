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
import com.wallee.sdk.model.enums.ShopifySubscriptionBillingIntervalUnit;
import com.wallee.sdk.model.enums.ShopifySubscriptionProductPricingOption;
import com.wallee.sdk.model.enums.ShopifySubscriptionProductState;
import com.wallee.sdk.model.enums.ShopifySubscriptionWeekday;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Objects;

@ApiModel(description = "")

public class ShopifySubscriptionProduct extends Indentable {

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


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("linkedSpaceId")
    protected Long linkedSpaceId;


    @JsonProperty("maximalBillingCycles")
    protected Integer maximalBillingCycles;


    @JsonProperty("maximalSuspendableCycles")
    protected Integer maximalSuspendableCycles;


    @JsonProperty("minimalBillingCycles")
    protected Integer minimalBillingCycles;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("pricingOption")
    protected ShopifySubscriptionProductPricingOption pricingOption;


    @JsonProperty("productId")
    protected String productId;


    @JsonProperty("productName")
    protected String productName;


    @JsonProperty("productPrice")
    protected BigDecimal productPrice;


    @JsonProperty("productSku")
    protected String productSku;


    @JsonProperty("productVariantId")
    protected String productVariantId;


    @JsonProperty("productVariantName")
    protected String productVariantName;


    @JsonProperty("relativePriceAdjustment")
    protected BigDecimal relativePriceAdjustment;


    @JsonProperty("shippingRequired")
    protected Boolean shippingRequired;


    @JsonProperty("shop")
    protected Long shop;


    @JsonProperty("state")
    protected ShopifySubscriptionProductState state;


    @JsonProperty("stockCheckRequired")
    protected Boolean stockCheckRequired;


    @JsonProperty("storeOrderConfirmationEmailEnabled")
    protected Boolean storeOrderConfirmationEmailEnabled;


    @JsonProperty("subscriberSuspensionAllowed")
    protected Boolean subscriberSuspensionAllowed;


    @JsonProperty("terminationBillingCycles")
    protected Integer terminationBillingCycles;


    @JsonProperty("updatedAt")
    protected OffsetDateTime updatedAt;


    @JsonProperty("version")
    protected Integer version;


    /**
     * @return absolutePriceAdjustment
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getAbsolutePriceAdjustment() {
        return absolutePriceAdjustment;
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


    /**
     * @return billingIntervalAmount
     **/
    @ApiModelProperty(value = "")
    public Integer getBillingIntervalAmount() {
        return billingIntervalAmount;
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


    /**
     * Define the weekday on which the recurring orders should be created.
     *
     * @return billingWeekday
     **/
    @ApiModelProperty(value = "Define the weekday on which the recurring orders should be created.")
    public ShopifySubscriptionWeekday getBillingWeekday() {
        return billingWeekday;
    }


    /**
     * @return fixedPrice
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getFixedPrice() {
        return fixedPrice;
    }


    /**
     * The ID is the primary key of the entity. The ID identifies the entity uniquely.
     *
     * @return id
     **/
    @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
    public Long getId() {
        return id;
    }


    /**
     * The linked space id holds the ID of the space to which the entity belongs to.
     *
     * @return linkedSpaceId
     **/
    @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
    public Long getLinkedSpaceId() {
        return linkedSpaceId;
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


    /**
     * Define the maximum number of orders the subscription can be suspended for at a time.
     *
     * @return maximalSuspendableCycles
     **/
    @ApiModelProperty(value = "Define the maximum number of orders the subscription can be suspended for at a time.")
    public Integer getMaximalSuspendableCycles() {
        return maximalSuspendableCycles;
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


    /**
     * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
     *
     * @return plannedPurgeDate
     **/
    @ApiModelProperty(value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
    public OffsetDateTime getPlannedPurgeDate() {
        return plannedPurgeDate;
    }


    /**
     * @return pricingOption
     **/
    @ApiModelProperty(value = "")
    public ShopifySubscriptionProductPricingOption getPricingOption() {
        return pricingOption;
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


    /**
     * @return productName
     **/
    @ApiModelProperty(value = "")
    public String getProductName() {
        return productName;
    }


    /**
     * @return productPrice
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getProductPrice() {
        return productPrice;
    }


    /**
     * @return productSku
     **/
    @ApiModelProperty(value = "")
    public String getProductSku() {
        return productSku;
    }


    /**
     * @return productVariantId
     **/
    @ApiModelProperty(value = "")
    public String getProductVariantId() {
        return productVariantId;
    }


    /**
     * @return productVariantName
     **/
    @ApiModelProperty(value = "")
    public String getProductVariantName() {
        return productVariantName;
    }


    /**
     * @return relativePriceAdjustment
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getRelativePriceAdjustment() {
        return relativePriceAdjustment;
    }


    /**
     * @return shippingRequired
     **/
    @ApiModelProperty(value = "")
    public Boolean isShippingRequired() {
        return shippingRequired;
    }


    /**
     * @return shop
     **/
    @ApiModelProperty(value = "")
    public Long getShop() {
        return shop;
    }


    /**
     * @return state
     **/
    @ApiModelProperty(value = "")
    public ShopifySubscriptionProductState getState() {
        return state;
    }


    /**
     * @return stockCheckRequired
     **/
    @ApiModelProperty(value = "")
    public Boolean isStockCheckRequired() {
        return stockCheckRequired;
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


    /**
     * Define whether the customer is allowed to suspend subscriptions.
     *
     * @return subscriberSuspensionAllowed
     **/
    @ApiModelProperty(value = "Define whether the customer is allowed to suspend subscriptions.")
    public Boolean isSubscriberSuspensionAllowed() {
        return subscriberSuspensionAllowed;
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


    /**
     * @return updatedAt
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }


    /**
     * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
     *
     * @return version
     **/
    @ApiModelProperty(value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
    public Integer getVersion() {
        return version;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShopifySubscriptionProduct shopifySubscriptionProduct = (ShopifySubscriptionProduct) o;
        return Objects.equals(this.absolutePriceAdjustment, shopifySubscriptionProduct.absolutePriceAdjustment) &&
                Objects.equals(this.billingDayOfMonth, shopifySubscriptionProduct.billingDayOfMonth) &&
                Objects.equals(this.billingIntervalAmount, shopifySubscriptionProduct.billingIntervalAmount) &&
                this.billingIntervalUnit == shopifySubscriptionProduct.billingIntervalUnit
                && this.billingWeekday == shopifySubscriptionProduct.billingWeekday &&
                Objects.equals(this.fixedPrice, shopifySubscriptionProduct.fixedPrice) &&
                Objects.equals(this.id, shopifySubscriptionProduct.id) &&
                Objects.equals(this.linkedSpaceId, shopifySubscriptionProduct.linkedSpaceId) &&
                Objects.equals(this.maximalBillingCycles, shopifySubscriptionProduct.maximalBillingCycles) &&
                Objects.equals(this.maximalSuspendableCycles, shopifySubscriptionProduct.maximalSuspendableCycles) &&
                Objects.equals(this.minimalBillingCycles, shopifySubscriptionProduct.minimalBillingCycles) &&
                Objects.equals(this.plannedPurgeDate, shopifySubscriptionProduct.plannedPurgeDate) && this.pricingOption
                == shopifySubscriptionProduct.pricingOption &&
                Objects.equals(this.productId, shopifySubscriptionProduct.productId) &&
                Objects.equals(this.productName, shopifySubscriptionProduct.productName) &&
                Objects.equals(this.productPrice, shopifySubscriptionProduct.productPrice) &&
                Objects.equals(this.productSku, shopifySubscriptionProduct.productSku) &&
                Objects.equals(this.productVariantId, shopifySubscriptionProduct.productVariantId) &&
                Objects.equals(this.productVariantName, shopifySubscriptionProduct.productVariantName) &&
                Objects.equals(this.relativePriceAdjustment, shopifySubscriptionProduct.relativePriceAdjustment) &&
                Objects.equals(this.shippingRequired, shopifySubscriptionProduct.shippingRequired) &&
                Objects.equals(this.shop, shopifySubscriptionProduct.shop) && this.state == shopifySubscriptionProduct.state &&
                Objects.equals(this.stockCheckRequired, shopifySubscriptionProduct.stockCheckRequired) &&
                Objects.equals(this.storeOrderConfirmationEmailEnabled, shopifySubscriptionProduct.storeOrderConfirmationEmailEnabled) &&
                Objects.equals(this.subscriberSuspensionAllowed, shopifySubscriptionProduct.subscriberSuspensionAllowed) &&
                Objects.equals(this.terminationBillingCycles, shopifySubscriptionProduct.terminationBillingCycles) &&
                Objects.equals(this.updatedAt, shopifySubscriptionProduct.updatedAt) &&
                Objects.equals(this.version, shopifySubscriptionProduct.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(absolutePriceAdjustment, billingDayOfMonth, billingIntervalAmount, billingIntervalUnit, billingWeekday, fixedPrice, id, linkedSpaceId, maximalBillingCycles, maximalSuspendableCycles, minimalBillingCycles, plannedPurgeDate, pricingOption, productId, productName, productPrice, productSku, productVariantId, productVariantName, relativePriceAdjustment, shippingRequired, shop, state, stockCheckRequired, storeOrderConfirmationEmailEnabled, subscriberSuspensionAllowed, terminationBillingCycles, updatedAt, version);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShopifySubscriptionProduct {\n");

        sb.append("    absolutePriceAdjustment: ").append(toIndentedString(absolutePriceAdjustment)).append("\n");
        sb.append("    billingDayOfMonth: ").append(toIndentedString(billingDayOfMonth)).append("\n");
        sb.append("    billingIntervalAmount: ").append(toIndentedString(billingIntervalAmount)).append("\n");
        sb.append("    billingIntervalUnit: ").append(toIndentedString(billingIntervalUnit)).append("\n");
        sb.append("    billingWeekday: ").append(toIndentedString(billingWeekday)).append("\n");
        sb.append("    fixedPrice: ").append(toIndentedString(fixedPrice)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
        sb.append("    maximalBillingCycles: ").append(toIndentedString(maximalBillingCycles)).append("\n");
        sb.append("    maximalSuspendableCycles: ").append(toIndentedString(maximalSuspendableCycles)).append("\n");
        sb.append("    minimalBillingCycles: ").append(toIndentedString(minimalBillingCycles)).append("\n");
        sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
        sb.append("    pricingOption: ").append(toIndentedString(pricingOption)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    productPrice: ").append(toIndentedString(productPrice)).append("\n");
        sb.append("    productSku: ").append(toIndentedString(productSku)).append("\n");
        sb.append("    productVariantId: ").append(toIndentedString(productVariantId)).append("\n");
        sb.append("    productVariantName: ").append(toIndentedString(productVariantName)).append("\n");
        sb.append("    relativePriceAdjustment: ").append(toIndentedString(relativePriceAdjustment)).append("\n");
        sb.append("    shippingRequired: ").append(toIndentedString(shippingRequired)).append("\n");
        sb.append("    shop: ").append(toIndentedString(shop)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    stockCheckRequired: ").append(toIndentedString(stockCheckRequired)).append("\n");
        sb.append("    storeOrderConfirmationEmailEnabled: ").append(toIndentedString(storeOrderConfirmationEmailEnabled)).append("\n");
        sb.append("    subscriberSuspensionAllowed: ").append(toIndentedString(subscriberSuspensionAllowed)).append("\n");
        sb.append("    terminationBillingCycles: ").append(toIndentedString(terminationBillingCycles)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("}");
        return sb.toString();
    }


}

