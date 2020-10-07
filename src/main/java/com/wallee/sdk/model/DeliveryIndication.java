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
import com.wallee.sdk.model.enums.DeliveryIndicationState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

@ApiModel(description = "")

public class DeliveryIndication extends TransactionAwareEntity {

    @JsonProperty("automaticDecisionReason")
    protected DeliveryIndicationDecisionReason automaticDecisionReason;


    @JsonProperty("automaticallyDecidedOn")
    protected OffsetDateTime automaticallyDecidedOn;


    @JsonProperty("completion")
    protected Long completion;


    @JsonProperty("createdOn")
    protected OffsetDateTime createdOn;


    @JsonProperty("manualDecisionTimeoutOn")
    protected OffsetDateTime manualDecisionTimeoutOn;


    @JsonProperty("manuallyDecidedBy")
    protected Long manuallyDecidedBy;


    @JsonProperty("manuallyDecidedOn")
    protected OffsetDateTime manuallyDecidedOn;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("state")
    protected DeliveryIndicationState state;


    @JsonProperty("timeoutOn")
    protected OffsetDateTime timeoutOn;


    @JsonProperty("transaction")
    protected Transaction transaction;


    /**
     * @return automaticDecisionReason
     **/
    @ApiModelProperty(value = "")
    public DeliveryIndicationDecisionReason getAutomaticDecisionReason() {
        return automaticDecisionReason;
    }


    /**
     * @return automaticallyDecidedOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getAutomaticallyDecidedOn() {
        return automaticallyDecidedOn;
    }


    /**
     * @return completion
     **/
    @ApiModelProperty(value = "")
    public Long getCompletion() {
        return completion;
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
     * @return manualDecisionTimeoutOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getManualDecisionTimeoutOn() {
        return manualDecisionTimeoutOn;
    }


    /**
     * @return manuallyDecidedBy
     **/
    @ApiModelProperty(value = "")
    public Long getManuallyDecidedBy() {
        return manuallyDecidedBy;
    }


    /**
     * @return manuallyDecidedOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getManuallyDecidedOn() {
        return manuallyDecidedOn;
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
    public DeliveryIndicationState getState() {
        return state;
    }


    /**
     * @return timeoutOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getTimeoutOn() {
        return timeoutOn;
    }


    /**
     * @return transaction
     **/
    @ApiModelProperty(value = "")
    public Transaction getTransaction() {
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
        DeliveryIndication deliveryIndication = (DeliveryIndication) o;
        return Objects.equals(this.id, deliveryIndication.id) &&
                Objects.equals(this.linkedSpaceId, deliveryIndication.linkedSpaceId) &&
                Objects.equals(this.linkedTransaction, deliveryIndication.linkedTransaction) &&
                Objects.equals(this.automaticDecisionReason, deliveryIndication.automaticDecisionReason) &&
                Objects.equals(this.automaticallyDecidedOn, deliveryIndication.automaticallyDecidedOn) &&
                Objects.equals(this.completion, deliveryIndication.completion) &&
                Objects.equals(this.createdOn, deliveryIndication.createdOn) &&
                Objects.equals(this.manualDecisionTimeoutOn, deliveryIndication.manualDecisionTimeoutOn) &&
                Objects.equals(this.manuallyDecidedBy, deliveryIndication.manuallyDecidedBy) &&
                Objects.equals(this.manuallyDecidedOn, deliveryIndication.manuallyDecidedOn) &&
                Objects.equals(this.plannedPurgeDate, deliveryIndication.plannedPurgeDate) && this.state
                == deliveryIndication.state &&
                Objects.equals(this.timeoutOn, deliveryIndication.timeoutOn) &&
                Objects.equals(this.transaction, deliveryIndication.transaction) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, linkedSpaceId, linkedTransaction, automaticDecisionReason, automaticallyDecidedOn, completion, createdOn, manualDecisionTimeoutOn, manuallyDecidedBy, manuallyDecidedOn, plannedPurgeDate, state, timeoutOn, transaction, super.hashCode());
    }


    @Override
    public String toString() {
        return "class DeliveryIndication { \n" +
            "    " + toIndentedString(super.toString()) + " \n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) +  " \n" +
            "    linkedTransaction: " + toIndentedString(linkedTransaction) + " \n" +
            "    automaticDecisionReason: " + toIndentedString(automaticDecisionReason) + " \n" +
            "    automaticallyDecidedOn: " +  toIndentedString(automaticallyDecidedOn) + " \n" +
            "    completion: " + toIndentedString(completion) + " \n" +
            "    createdOn: " + toIndentedString(createdOn) + " \n" +
            "    manualDecisionTimeoutOn: " +  toIndentedString(manualDecisionTimeoutOn) + " \n" +
            "    manuallyDecidedBy: " + toIndentedString(manuallyDecidedBy) +  " \n" +
            "    manuallyDecidedOn: " + toIndentedString(manuallyDecidedOn) + " \n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) + " \n" +
            "    state: " + toIndentedString(state) +  " \n" +
            "    timeoutOn: " + toIndentedString(timeoutOn) + " \n" +
            "    transaction: " +  toIndentedString(transaction) + " \n" +
            "}";
        }


}

