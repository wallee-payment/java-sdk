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
import com.wallee.sdk.model.enums.TransactionVoidMode;
import com.wallee.sdk.model.enums.TransactionVoidState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

@ApiModel(description = "")

public class TransactionVoid extends TransactionAwareEntity {

    @JsonProperty("createdBy")
    protected Long createdBy;


    @JsonProperty("createdOn")
    protected OffsetDateTime createdOn;


    @JsonProperty("failedOn")
    protected OffsetDateTime failedOn;


    @JsonProperty("failureReason")
    protected FailureReason failureReason;


    @JsonProperty("labels")
    protected List<Label> labels;


    @JsonProperty("language")
    protected String language;


    @JsonProperty("mode")
    protected TransactionVoidMode mode;


    @JsonProperty("nextUpdateOn")
    protected OffsetDateTime nextUpdateOn;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("processorReference")
    protected String processorReference;


    @JsonProperty("spaceViewId")
    protected Long spaceViewId;


    @JsonProperty("state")
    protected TransactionVoidState state;


    @JsonProperty("succeededOn")
    protected OffsetDateTime succeededOn;


    @JsonProperty("timeoutOn")
    protected OffsetDateTime timeoutOn;


    @JsonProperty("transaction")
    protected Transaction transaction;


    @JsonProperty("version")
    protected Integer version;


    /**
     * @return createdBy
     **/
    @ApiModelProperty(value = "")
    public Long getCreatedBy() {
        return createdBy;
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
     * @return failedOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getFailedOn() {
        return failedOn;
    }


    /**
     * @return failureReason
     **/
    @ApiModelProperty(value = "")
    public FailureReason getFailureReason() {
        return failureReason;
    }


    /**
     * @return labels
     **/
    @ApiModelProperty(value = "")
    public List<Label> getLabels() {
        return labels;
    }


    /**
     * @return language
     **/
    @ApiModelProperty(value = "")
    public String getLanguage() {
        return language;
    }


    /**
     * @return mode
     **/
    @ApiModelProperty(value = "")
    public TransactionVoidMode getMode() {
        return mode;
    }


    /**
     * @return nextUpdateOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getNextUpdateOn() {
        return nextUpdateOn;
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
     * @return processorReference
     **/
    @ApiModelProperty(value = "")
    public String getProcessorReference() {
        return processorReference;
    }


    /**
     * @return spaceViewId
     **/
    @ApiModelProperty(value = "")
    public Long getSpaceViewId() {
        return spaceViewId;
    }


    /**
     * @return state
     **/
    @ApiModelProperty(value = "")
    public TransactionVoidState getState() {
        return state;
    }


    /**
     * @return succeededOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getSucceededOn() {
        return succeededOn;
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
        TransactionVoid transactionVoid = (TransactionVoid) o;
        return Objects.equals(this.id, transactionVoid.id) &&
                Objects.equals(this.linkedSpaceId, transactionVoid.linkedSpaceId) &&
                Objects.equals(this.linkedTransaction, transactionVoid.linkedTransaction) &&
                Objects.equals(this.createdBy, transactionVoid.createdBy) &&
                Objects.equals(this.createdOn, transactionVoid.createdOn) &&
                Objects.equals(this.failedOn, transactionVoid.failedOn) &&
                Objects.equals(this.failureReason, transactionVoid.failureReason) &&
                Objects.equals(this.labels, transactionVoid.labels) &&
                Objects.equals(this.language, transactionVoid.language) && this.mode == transactionVoid.mode &&
                Objects.equals(this.nextUpdateOn, transactionVoid.nextUpdateOn) &&
                Objects.equals(this.plannedPurgeDate, transactionVoid.plannedPurgeDate) &&
                Objects.equals(this.processorReference, transactionVoid.processorReference) &&
                Objects.equals(this.spaceViewId, transactionVoid.spaceViewId) && this.state == transactionVoid.state &&
                Objects.equals(this.succeededOn, transactionVoid.succeededOn) &&
                Objects.equals(this.timeoutOn, transactionVoid.timeoutOn) &&
                Objects.equals(this.transaction, transactionVoid.transaction) &&
                Objects.equals(this.version, transactionVoid.version) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, linkedSpaceId, linkedTransaction, createdBy, createdOn, failedOn, failureReason, labels, language, mode, nextUpdateOn, plannedPurgeDate, processorReference, spaceViewId, state, succeededOn, timeoutOn, transaction, version, super.hashCode());
    }


    @Override
    public String toString() {
        return "class TransactionVoid { \n" +
            "    " + toIndentedString(super.toString()) + " \n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) +  " \n" +
            "    linkedTransaction: " + toIndentedString(linkedTransaction) + " \n" +
            "    createdBy: " + toIndentedString(createdBy) + " \n" +
            "    createdOn: " + toIndentedString(createdOn) +  " \n" +
            "    failedOn: " + toIndentedString(failedOn) + " \n" +
            "    failureReason: " +  toIndentedString(failureReason) + " \n" +
            "    labels: " + toIndentedString(labels) + " \n" +
            "    language: " + toIndentedString(language) + " \n" +
            "    mode: " + toIndentedString(mode) + " \n" +
            "    nextUpdateOn: " + toIndentedString(nextUpdateOn) + " \n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) + "\n" +
            "    processorReference: " + toIndentedString(processorReference) + " \n" +
            "    spaceViewId: " + toIndentedString(spaceViewId) + " \n" +
            "    state: " + toIndentedString(state) + " \n" +
            "    succeededOn: " + toIndentedString(succeededOn) + " \n" +
            "    timeoutOn: " + toIndentedString(timeoutOn) +  " \n" +
            "    transaction: " + toIndentedString(transaction) + " \n" +
            "    version: " + toIndentedString(version) + "\n" +
            "}";
        }


}

