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

import java.time.OffsetDateTime;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wallee.sdk.model.enums.ShopifyRecurringOrderState;

@ApiModel(description = "")

public class ShopifyRecurringOrder extends TransactionAwareEntity {

    @JsonProperty("billedOn")
    protected OffsetDateTime billedOn;


    @JsonProperty("checkoutToken")
    protected String checkoutToken;


    @JsonProperty("createdOn")
    protected OffsetDateTime createdOn;


    @JsonProperty("failureReason")
    protected FailureReason failureReason;


    @JsonProperty("orderId")
    protected String orderId;


    @JsonProperty("orderName")
    protected String orderName;


    @JsonProperty("plannedExecutionDate")
    protected OffsetDateTime plannedExecutionDate;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("recurrenceNumber")
    protected Integer recurrenceNumber;


    @JsonProperty("shop")
    protected Long shop;


    @JsonProperty("startedProcessingOn")
    protected OffsetDateTime startedProcessingOn;


    @JsonProperty("state")
    protected ShopifyRecurringOrderState state;


    @JsonProperty("subscriptionVersion")
    protected ShopifySubscriptionVersion subscriptionVersion;


    @JsonProperty("transaction")
    protected ShopifyTransaction transaction;


    /**
     * @return billedOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getBilledOn() {
        return billedOn;
    }


    /**
     * @return checkoutToken
     **/
    @ApiModelProperty(value = "")
    public String getCheckoutToken() {
        return checkoutToken;
    }


    /**
     * @return createdOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getCreatedOn() {
        return createdOn;
    }


    /**
     * @return failureReason
     **/
    @ApiModelProperty(value = "")
    public FailureReason getFailureReason() {
        return failureReason;
    }


    /**
     * @return orderId
     **/
    @ApiModelProperty(value = "")
    public String getOrderId() {
        return orderId;
    }


    /**
     * @return orderName
     **/
    @ApiModelProperty(value = "")
    public String getOrderName() {
        return orderName;
    }


    /**
     * @return plannedExecutionDate
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getPlannedExecutionDate() {
        return plannedExecutionDate;
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
     * @return recurrenceNumber
     **/
    @ApiModelProperty(value = "")
    public Integer getRecurrenceNumber() {
        return recurrenceNumber;
    }


    /**
     * @return shop
     **/
    @ApiModelProperty(value = "")
    public Long getShop() {
        return shop;
    }


    /**
     * @return startedProcessingOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getStartedProcessingOn() {
        return startedProcessingOn;
    }


    /**
     * @return state
     **/
    @ApiModelProperty(value = "")
    public ShopifyRecurringOrderState getState() {
        return state;
    }


    /**
     * @return subscriptionVersion
     **/
    @ApiModelProperty(value = "")
    public ShopifySubscriptionVersion getSubscriptionVersion() {
        return subscriptionVersion;
    }


    /**
     * @return transaction
     **/
    @ApiModelProperty(value = "")
    public ShopifyTransaction getTransaction() {
        return transaction;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShopifyRecurringOrder shopifyRecurringOrder = (ShopifyRecurringOrder) o;
        return Objects.equals(this.id, shopifyRecurringOrder.id) &&
                Objects.equals(this.linkedSpaceId, shopifyRecurringOrder.linkedSpaceId) &&
                Objects.equals(this.linkedTransaction, shopifyRecurringOrder.linkedTransaction) &&
                Objects.equals(this.billedOn, shopifyRecurringOrder.billedOn) &&
                Objects.equals(this.checkoutToken, shopifyRecurringOrder.checkoutToken) &&
                Objects.equals(this.createdOn, shopifyRecurringOrder.createdOn) &&
                Objects.equals(this.failureReason, shopifyRecurringOrder.failureReason) &&
                Objects.equals(this.orderId, shopifyRecurringOrder.orderId) &&
                Objects.equals(this.orderName, shopifyRecurringOrder.orderName) &&
                Objects.equals(this.plannedExecutionDate, shopifyRecurringOrder.plannedExecutionDate) &&
                Objects.equals(this.plannedPurgeDate, shopifyRecurringOrder.plannedPurgeDate) &&
                Objects.equals(this.recurrenceNumber, shopifyRecurringOrder.recurrenceNumber) &&
                Objects.equals(this.shop, shopifyRecurringOrder.shop) &&
                Objects.equals(this.startedProcessingOn, shopifyRecurringOrder.startedProcessingOn) && this.state
                == shopifyRecurringOrder.state &&
                Objects.equals(this.subscriptionVersion, shopifyRecurringOrder.subscriptionVersion) &&
                Objects.equals(this.transaction, shopifyRecurringOrder.transaction) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, linkedSpaceId, linkedTransaction, billedOn, checkoutToken, createdOn, failureReason, orderId, orderName, plannedExecutionDate, plannedPurgeDate, recurrenceNumber, shop, startedProcessingOn, state, subscriptionVersion, transaction, super.hashCode());
    }


    @Override
    public String toString() {
        return "class ShopifyRecurringOrder {\n" +
            "    " + toIndentedString(super.toString()) + "\n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) +  "\n" +
            "    linkedTransaction: " + toIndentedString(linkedTransaction) + "\n" +
            "    billedOn: " + toIndentedString(billedOn) + "\n" +
            "    checkoutToken: " + toIndentedString(checkoutToken) +  "\n" +
            "    createdOn: " + toIndentedString(createdOn) + "\n" +
            "    failureReason: " +  toIndentedString(failureReason) + "\n" +
            "    orderId: " + toIndentedString(orderId) + "\n" +
            "    orderName: " + toIndentedString(orderName) + "\n" +
            "    plannedExecutionDate: " + toIndentedString(plannedExecutionDate) + "\n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) + "\n" +
            "    recurrenceNumber: " + toIndentedString(recurrenceNumber) + "\n" +
            "    shop: " + toIndentedString(shop) +  "\n" +
            "    startedProcessingOn: " + toIndentedString(startedProcessingOn) + "\n" +
            "    state: " + toIndentedString(state) + "\n" +
            "    subscriptionVersion: " + toIndentedString(subscriptionVersion) +  "\n" +
            "    transaction: " + toIndentedString(transaction) + "\n" +
            "}";
        }


}

