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
import com.wallee.sdk.model.enums.InstallmentPaymentSliceState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * An installment payment slice represents a single transaction of money from the buyer to the merchant.
 */
@ApiModel(description = "An installment payment slice represents a single transaction of money from the buyer to the merchant.")

public class InstallmentPaymentSlice extends TransactionAwareEntity {

    @JsonProperty("chargeOn")
    protected OffsetDateTime chargeOn;


    @JsonProperty("createdOn")
    protected OffsetDateTime createdOn;


    @JsonProperty("installmentPayment")
    protected InstallmentPayment installmentPayment;


    @JsonProperty("lineItems")
    protected List<LineItem> lineItems;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("state")
    protected InstallmentPaymentSliceState state;


    @JsonProperty("transaction")
    protected Transaction transaction;


    @JsonProperty("version")
    protected Integer version;


    /**
     * @return chargeOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getChargeOn() {
        return chargeOn;
    }


    /**
     * The created on date indicates the date on which the entity was stored into the database.
     *
     * @return createdOn
     **/
    @ApiModelProperty(value = "The created on date indicates the date on which the entity was stored into the database.")
    public OffsetDateTime getCreatedOn() {
        return createdOn;
    }


    /**
     * @return installmentPayment
     **/
    @ApiModelProperty(value = "")
    public InstallmentPayment getInstallmentPayment() {
        return installmentPayment;
    }


    /**
     * @return lineItems
     **/
    @ApiModelProperty(value = "")
    public List<LineItem> getLineItems() {
        return lineItems;
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
     * @return state
     **/
    @ApiModelProperty(value = "")
    public InstallmentPaymentSliceState getState() {
        return state;
    }


    /**
     * @return transaction
     **/
    @ApiModelProperty(value = "")
    public Transaction getTransaction() {
        return transaction;
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
        InstallmentPaymentSlice installmentPaymentSlice = (InstallmentPaymentSlice) o;
        return Objects.equals(this.id, installmentPaymentSlice.id) &&
                Objects.equals(this.linkedSpaceId, installmentPaymentSlice.linkedSpaceId) &&
                Objects.equals(this.linkedTransaction, installmentPaymentSlice.linkedTransaction) &&
                Objects.equals(this.chargeOn, installmentPaymentSlice.chargeOn) &&
                Objects.equals(this.createdOn, installmentPaymentSlice.createdOn) &&
                Objects.equals(this.installmentPayment, installmentPaymentSlice.installmentPayment) &&
                Objects.equals(this.lineItems, installmentPaymentSlice.lineItems) &&
                Objects.equals(this.plannedPurgeDate, installmentPaymentSlice.plannedPurgeDate) && this.state
                == installmentPaymentSlice.state &&
                Objects.equals(this.transaction, installmentPaymentSlice.transaction) &&
                Objects.equals(this.version, installmentPaymentSlice.version) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, linkedSpaceId, linkedTransaction, chargeOn, createdOn, installmentPayment, lineItems, plannedPurgeDate, state, transaction, version, super.hashCode());
    }


    @Override
    public String toString() {
        return "class InstallmentPaymentSlice { \n" +
            "    " + toIndentedString(super.toString()) +  "\n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) +  "\n" +
            "    linkedTransaction: " + toIndentedString(linkedTransaction) + " \n" +
            "    chargeOn: " + toIndentedString(chargeOn) + " \n" +
            "    createdOn: " + toIndentedString(createdOn) +  "\n" +
            "    installmentPayment: " + toIndentedString(installmentPayment) + " \n" +
            "    lineItems: " + toIndentedString(lineItems) + " \n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) +  "\n" +
            "    state: " + toIndentedString(state) + " \n" +
            "    transaction: " + toIndentedString(transaction) +  "\n" +
            "    version: " + toIndentedString(version) + " \n" +
            "}";
        }


}

