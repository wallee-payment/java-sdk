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
import com.wallee.sdk.model.enums.ShopifyTransactionState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

@ApiModel(description = "")

public class ShopifyTransaction extends TransactionAwareEntity {

    @JsonProperty("checkoutId")
    protected String checkoutId;


    @JsonProperty("createdOn")
    protected OffsetDateTime createdOn;


    @JsonProperty("integration")
    protected ShopifyIntegration integration;


    @JsonProperty("orderId")
    protected String orderId;


    @JsonProperty("orderName")
    protected String orderName;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("state")
    protected ShopifyTransactionState state;


    @JsonProperty("transaction")
    protected Transaction transaction;


    @JsonProperty("version")
    protected Integer version;


    /**
     *
     * @return checkoutId
     **/
    @ApiModelProperty(value = "")
    public String getCheckoutId() {
        return checkoutId;
    }


    /**
     * The created on date indicates the date on which the entity was stored into the database.
     * @return createdOn
     **/
    @ApiModelProperty(value = "The created on date indicates the date on which the entity was stored into the database.")
    public OffsetDateTime getCreatedOn() {
        return createdOn;
    }


    /**
     *
     * @return integration
     **/
    @ApiModelProperty(value = "")
    public ShopifyIntegration getIntegration() {
        return integration;
    }


    /**
     *
     * @return orderId
     **/
    @ApiModelProperty(value = "")
    public String getOrderId() {
        return orderId;
    }


    /**
     *
     * @return orderName
     **/
    @ApiModelProperty(value = "")
    public String getOrderName() {
        return orderName;
    }


    /**
     * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
     * @return plannedPurgeDate
     **/
    @ApiModelProperty(value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
    public OffsetDateTime getPlannedPurgeDate() {
        return plannedPurgeDate;
    }


    /**
     *
     * @return state
     **/
    @ApiModelProperty(value = "")
    public ShopifyTransactionState getState() {
        return state;
    }


    /**
     *
     * @return transaction
     **/
    @ApiModelProperty(value = "")
    public Transaction getTransaction() {
        return transaction;
    }


    /**
     * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
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
        ShopifyTransaction shopifyTransaction = (ShopifyTransaction) o;
        return Objects.equals(this.id, shopifyTransaction.id) &&
                Objects.equals(this.linkedSpaceId, shopifyTransaction.linkedSpaceId) &&
                Objects.equals(this.linkedTransaction, shopifyTransaction.linkedTransaction) &&
                Objects.equals(this.checkoutId, shopifyTransaction.checkoutId) &&
                Objects.equals(this.createdOn, shopifyTransaction.createdOn) &&
                Objects.equals(this.integration, shopifyTransaction.integration) &&
                Objects.equals(this.orderId, shopifyTransaction.orderId) &&
                Objects.equals(this.orderName, shopifyTransaction.orderName) &&
                Objects.equals(this.plannedPurgeDate, shopifyTransaction.plannedPurgeDate) && this.state
                == shopifyTransaction.state &&
                Objects.equals(this.transaction, shopifyTransaction.transaction) &&
                Objects.equals(this.version, shopifyTransaction.version) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, linkedSpaceId, linkedTransaction, checkoutId, createdOn, integration, orderId, orderName, plannedPurgeDate, state, transaction, version, super.hashCode());
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShopifyTransaction {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
        sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
        sb.append("    checkoutId: ").append(toIndentedString(checkoutId)).append("\n");
        sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
        sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    orderName: ").append(toIndentedString(orderName)).append("\n");
        sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("}");
        return sb.toString();
    }


}

