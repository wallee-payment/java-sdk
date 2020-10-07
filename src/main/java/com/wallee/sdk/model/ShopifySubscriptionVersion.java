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
import com.wallee.sdk.model.enums.ShopifySubscriptionVersionState;
import com.wallee.sdk.model.enums.ShopifySubscriptionWeekday;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

@ApiModel(description = "")

public class ShopifySubscriptionVersion extends Indentable {

    @JsonProperty("billingAddress")
    protected ShopifySubscriptionAddress billingAddress;


    @JsonProperty("billingDayOfMonth")
    protected Integer billingDayOfMonth;


    @JsonProperty("billingIntervalAmount")
    protected Integer billingIntervalAmount;


    @JsonProperty("billingIntervalUnit")
    protected ShopifySubscriptionBillingIntervalUnit billingIntervalUnit;


    @JsonProperty("billingWeekday")
    protected ShopifySubscriptionWeekday billingWeekday;


    @JsonProperty("createdBy")
    protected Long createdBy;


    @JsonProperty("createdOn")
    protected OffsetDateTime createdOn;


    @JsonProperty("currency")
    protected String currency;


    @JsonProperty("dischargedBy")
    protected Long dischargedBy;


    @JsonProperty("dischargedOn")
    protected OffsetDateTime dischargedOn;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("items")
    protected List<ShopifySubscriptionVersionItem> items;


    @JsonProperty("linkedSpaceId")
    protected Long linkedSpaceId;


    @JsonProperty("maximalBillingCycles")
    protected Integer maximalBillingCycles;


    @JsonProperty("maximalSuspendableCycles")
    protected Integer maximalSuspendableCycles;


    @JsonProperty("minimalBillingCycles")
    protected Integer minimalBillingCycles;


    @JsonProperty("paymentGateway")
    protected String paymentGateway;


    @JsonProperty("shippingAddress")
    protected ShopifySubscriptionAddress shippingAddress;


    @JsonProperty("shippingRate")
    protected String shippingRate;


    @JsonProperty("shop")
    protected Long shop;


    @JsonProperty("state")
    protected ShopifySubscriptionVersionState state;


    @JsonProperty("storeOrderConfirmationEmailEnabled")
    protected Boolean storeOrderConfirmationEmailEnabled;


    @JsonProperty("subscriberSuspensionAllowed")
    protected Boolean subscriberSuspensionAllowed;


    @JsonProperty("subscription")
    protected ShopifySubscription subscription;


    @JsonProperty("terminationBillingCycles")
    protected Integer terminationBillingCycles;


    @JsonProperty("token")
    protected Long token;


    @JsonProperty("version")
    protected Integer version;


    /**
     * @return billingAddress
     **/
    @ApiModelProperty(value = "")
    public ShopifySubscriptionAddress getBillingAddress() {
        return billingAddress;
    }


    /**
     * @return billingDayOfMonth
     **/
    @ApiModelProperty(value = "")
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
     * @return billingIntervalUnit
     **/
    @ApiModelProperty(value = "")
    public ShopifySubscriptionBillingIntervalUnit getBillingIntervalUnit() {
        return billingIntervalUnit;
    }


    /**
     * @return billingWeekday
     **/
    @ApiModelProperty(value = "")
    public ShopifySubscriptionWeekday getBillingWeekday() {
        return billingWeekday;
    }


    /**
     * @return createdBy
     **/
    @ApiModelProperty(value = "")
    public Long getCreatedBy() {
        return createdBy;
    }


    /**
     * @return createdOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getCreatedOn() {
        return createdOn;
    }


    /**
     * @return currency
     **/
    @ApiModelProperty(value = "")
    public String getCurrency() {
        return currency;
    }


    /**
     * @return dischargedBy
     **/
    @ApiModelProperty(value = "")
    public Long getDischargedBy() {
        return dischargedBy;
    }


    /**
     * @return dischargedOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getDischargedOn() {
        return dischargedOn;
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
     * @return items
     **/
    @ApiModelProperty(value = "")
    public List<ShopifySubscriptionVersionItem> getItems() {
        return items;
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
     * @return maximalBillingCycles
     **/
    @ApiModelProperty(value = "")
    public Integer getMaximalBillingCycles() {
        return maximalBillingCycles;
    }


    /**
     * @return maximalSuspendableCycles
     **/
    @ApiModelProperty(value = "")
    public Integer getMaximalSuspendableCycles() {
        return maximalSuspendableCycles;
    }


    /**
     * @return minimalBillingCycles
     **/
    @ApiModelProperty(value = "")
    public Integer getMinimalBillingCycles() {
        return minimalBillingCycles;
    }


    /**
     * @return paymentGateway
     **/
    @ApiModelProperty(value = "")
    public String getPaymentGateway() {
        return paymentGateway;
    }


    /**
     * @return shippingAddress
     **/
    @ApiModelProperty(value = "")
    public ShopifySubscriptionAddress getShippingAddress() {
        return shippingAddress;
    }


    /**
     * @return shippingRate
     **/
    @ApiModelProperty(value = "")
    public String getShippingRate() {
        return shippingRate;
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
    public ShopifySubscriptionVersionState getState() {
        return state;
    }


    /**
     * @return storeOrderConfirmationEmailEnabled
     **/
    @ApiModelProperty(value = "")
    public Boolean isStoreOrderConfirmationEmailEnabled() {
        return storeOrderConfirmationEmailEnabled;
    }


    /**
     * @return subscriberSuspensionAllowed
     **/
    @ApiModelProperty(value = "")
    public Boolean isSubscriberSuspensionAllowed() {
        return subscriberSuspensionAllowed;
    }


    /**
     * @return subscription
     **/
    @ApiModelProperty(value = "")
    public ShopifySubscription getSubscription() {
        return subscription;
    }


    /**
     * @return terminationBillingCycles
     **/
    @ApiModelProperty(value = "")
    public Integer getTerminationBillingCycles() {
        return terminationBillingCycles;
    }


    /**
     * @return token
     **/
    @ApiModelProperty(value = "")
    public Long getToken() {
        return token;
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
        ShopifySubscriptionVersion shopifySubscriptionVersion = (ShopifySubscriptionVersion) o;
        return Objects.equals(this.billingAddress, shopifySubscriptionVersion.billingAddress) &&
                Objects.equals(this.billingDayOfMonth, shopifySubscriptionVersion.billingDayOfMonth) &&
                Objects.equals(this.billingIntervalAmount, shopifySubscriptionVersion.billingIntervalAmount) &&
                this.billingIntervalUnit == shopifySubscriptionVersion.billingIntervalUnit
                && this.billingWeekday == shopifySubscriptionVersion.billingWeekday &&
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
                Objects.equals(this.shop, shopifySubscriptionVersion.shop) && this.state == shopifySubscriptionVersion.state &&
                Objects.equals(this.storeOrderConfirmationEmailEnabled, shopifySubscriptionVersion.storeOrderConfirmationEmailEnabled) &&
                Objects.equals(this.subscriberSuspensionAllowed, shopifySubscriptionVersion.subscriberSuspensionAllowed) &&
                Objects.equals(this.subscription, shopifySubscriptionVersion.subscription) &&
                Objects.equals(this.terminationBillingCycles, shopifySubscriptionVersion.terminationBillingCycles) &&
                Objects.equals(this.token, shopifySubscriptionVersion.token) &&
                Objects.equals(this.version, shopifySubscriptionVersion.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billingAddress, billingDayOfMonth, billingIntervalAmount, billingIntervalUnit, billingWeekday, createdBy, createdOn, currency, dischargedBy, dischargedOn, id, items, linkedSpaceId, maximalBillingCycles, maximalSuspendableCycles, minimalBillingCycles, paymentGateway, shippingAddress, shippingRate, shop, state, storeOrderConfirmationEmailEnabled, subscriberSuspensionAllowed, subscription, terminationBillingCycles, token, version);
    }


    @Override
    public String toString() {

        return "class ShopifySubscriptionVersion { \n" +
            "    billingAddress: " + toIndentedString(billingAddress) + "\n" +
            "    billingDayOfMonth: " + toIndentedString(billingDayOfMonth) +  " \n" +
            "    billingIntervalAmount: " + toIndentedString(billingIntervalAmount) +  " \n" +
            "    billingIntervalUnit: " + toIndentedString(billingIntervalUnit) + " \n" +
            "    billingWeekday: " + toIndentedString(billingWeekday) + " \n" +
            "    createdBy: " + toIndentedString(createdBy) +  " \n" +
            "    createdOn: " + toIndentedString(createdOn) + " \n" +
            "    currency: " + toIndentedString(currency) + "\n" +
            "    dischargedBy: " + toIndentedString(dischargedBy) + " \n" +
            "    dischargedOn: " + toIndentedString(dischargedOn) + " \n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    items: " + toIndentedString(items) + " \n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) +  " \n" +
            "    maximalBillingCycles: " + toIndentedString(maximalBillingCycles) +  " \n" +
            "    maximalSuspendableCycles: " + toIndentedString(maximalSuspendableCycles) +  " \n" +
            "    minimalBillingCycles: " + toIndentedString(minimalBillingCycles) + " \n" +
            "    paymentGateway: " + toIndentedString(paymentGateway) + " \n" +
            "    shippingAddress: " + toIndentedString(shippingAddress) + "\n" +
            "    shippingRate: " + toIndentedString(shippingRate) + " \n" +
            "    shop: " + toIndentedString(shop) + "\n" +
            "    state: " + toIndentedString(state) + " \n" +
            "    storeOrderConfirmationEmailEnabled: " + toIndentedString(storeOrderConfirmationEmailEnabled) + " \n" +
            "    subscriberSuspensionAllowed: " + toIndentedString(subscriberSuspensionAllowed) + " \n" +
            "    subscription: " +  toIndentedString(subscription) + " \n" +
            "    terminationBillingCycles: " + toIndentedString(terminationBillingCycles) +  " \n" +
            "    token: " + toIndentedString(token) + " \n" +
            "    version: " + toIndentedString(version) + " \n" +
            "}";
        }


}

