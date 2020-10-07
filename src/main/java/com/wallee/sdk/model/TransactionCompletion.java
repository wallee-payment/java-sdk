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
import com.wallee.sdk.model.enums.TransactionCompletionMode;
import com.wallee.sdk.model.enums.TransactionCompletionState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

@ApiModel(description = "")

public class TransactionCompletion extends TransactionAwareEntity {

    @JsonProperty("amount")
    protected BigDecimal amount;


    @JsonProperty("baseLineItems")
    protected List<LineItem> baseLineItems;


    @JsonProperty("createdBy")
    protected Long createdBy;


    @JsonProperty("createdOn")
    protected OffsetDateTime createdOn;


    @JsonProperty("externalId")
    protected String externalId;


    @JsonProperty("failedOn")
    protected OffsetDateTime failedOn;


    @JsonProperty("failureReason")
    protected FailureReason failureReason;


    @JsonProperty("labels")
    protected List<Label> labels;


    @JsonProperty("language")
    protected String language;


    @JsonProperty("lastCompletion")
    protected Boolean lastCompletion;


    @JsonProperty("lineItemVersion")
    protected TransactionLineItemVersion lineItemVersion;


    @JsonProperty("lineItems")
    protected List<LineItem> lineItems;


    @JsonProperty("mode")
    protected TransactionCompletionMode mode;


    @JsonProperty("nextUpdateOn")
    protected OffsetDateTime nextUpdateOn;


    @JsonProperty("paymentInformation")
    protected String paymentInformation;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("processingOn")
    protected OffsetDateTime processingOn;


    @JsonProperty("processorReference")
    protected String processorReference;


    @JsonProperty("remainingLineItems")
    protected List<LineItem> remainingLineItems;


    @JsonProperty("spaceViewId")
    protected Long spaceViewId;


    @JsonProperty("state")
    protected TransactionCompletionState state;


    @JsonProperty("succeededOn")
    protected OffsetDateTime succeededOn;


    @JsonProperty("taxAmount")
    protected BigDecimal taxAmount;


    @JsonProperty("timeZone")
    protected String timeZone;


    @JsonProperty("timeoutOn")
    protected OffsetDateTime timeoutOn;


    @JsonProperty("version")
    protected Integer version;


    /**
     * The amount which is captured. The amount represents sum of line items including taxes.
     *
     * @return amount
     **/
    @ApiModelProperty(value = "The amount which is captured. The amount represents sum of line items including taxes.")
    public BigDecimal getAmount() {
        return amount;
    }


    /**
     * The base line items on which the completion is applied on.
     *
     * @return baseLineItems
     **/
    @ApiModelProperty(value = "The base line items on which the completion is applied on.")
    public List<LineItem> getBaseLineItems() {
        return baseLineItems;
    }


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
     * The external ID helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
     *
     * @return externalId
     **/
    @ApiModelProperty(value = "The external ID helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.")
    public String getExternalId() {
        return externalId;
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
     * Indicates if this is the last completion. After the last completion is created the transaction cannot be completed anymore.
     *
     * @return lastCompletion
     **/
    @ApiModelProperty(value = "Indicates if this is the last completion. After the last completion is created the transaction cannot be completed anymore.")
    public Boolean isLastCompletion() {
        return lastCompletion;
    }


    /**
     * @return lineItemVersion
     **/
    @ApiModelProperty(value = "")
    public TransactionLineItemVersion getLineItemVersion() {
        return lineItemVersion;
    }


    /**
     * The line items which are captured.
     *
     * @return lineItems
     **/
    @ApiModelProperty(value = "The line items which are captured.")
    public List<LineItem> getLineItems() {
        return lineItems;
    }


    /**
     * @return mode
     **/
    @ApiModelProperty(value = "")
    public TransactionCompletionMode getMode() {
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
     * @return paymentInformation
     **/
    @ApiModelProperty(value = "")
    public String getPaymentInformation() {
        return paymentInformation;
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
     * @return processingOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getProcessingOn() {
        return processingOn;
    }


    /**
     * @return processorReference
     **/
    @ApiModelProperty(value = "")
    public String getProcessorReference() {
        return processorReference;
    }


    /**
     * @return remainingLineItems
     **/
    @ApiModelProperty(value = "")
    public List<LineItem> getRemainingLineItems() {
        return remainingLineItems;
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
    public TransactionCompletionState getState() {
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
     * The total sum of all taxes of line items.
     *
     * @return taxAmount
     **/
    @ApiModelProperty(value = "The total sum of all taxes of line items.")
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }


    /**
     * @return timeZone
     **/
    @ApiModelProperty(value = "")
    public String getTimeZone() {
        return timeZone;
    }


    /**
     * @return timeoutOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getTimeoutOn() {
        return timeoutOn;
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
        TransactionCompletion transactionCompletion = (TransactionCompletion) o;
        return Objects.equals(this.id, transactionCompletion.id) &&
                Objects.equals(this.linkedSpaceId, transactionCompletion.linkedSpaceId) &&
                Objects.equals(this.linkedTransaction, transactionCompletion.linkedTransaction) &&
                Objects.equals(this.amount, transactionCompletion.amount) &&
                Objects.equals(this.baseLineItems, transactionCompletion.baseLineItems) &&
                Objects.equals(this.createdBy, transactionCompletion.createdBy) &&
                Objects.equals(this.createdOn, transactionCompletion.createdOn) &&
                Objects.equals(this.externalId, transactionCompletion.externalId) &&
                Objects.equals(this.failedOn, transactionCompletion.failedOn) &&
                Objects.equals(this.failureReason, transactionCompletion.failureReason) &&
                Objects.equals(this.labels, transactionCompletion.labels) &&
                Objects.equals(this.language, transactionCompletion.language) &&
                Objects.equals(this.lastCompletion, transactionCompletion.lastCompletion) &&
                Objects.equals(this.lineItemVersion, transactionCompletion.lineItemVersion) &&
                Objects.equals(this.lineItems, transactionCompletion.lineItems) && this.mode == transactionCompletion.mode &&
                Objects.equals(this.nextUpdateOn, transactionCompletion.nextUpdateOn) &&
                Objects.equals(this.paymentInformation, transactionCompletion.paymentInformation) &&
                Objects.equals(this.plannedPurgeDate, transactionCompletion.plannedPurgeDate) &&
                Objects.equals(this.processingOn, transactionCompletion.processingOn) &&
                Objects.equals(this.processorReference, transactionCompletion.processorReference) &&
                Objects.equals(this.remainingLineItems, transactionCompletion.remainingLineItems) &&
                Objects.equals(this.spaceViewId, transactionCompletion.spaceViewId) && this.state
                == transactionCompletion.state &&
                Objects.equals(this.succeededOn, transactionCompletion.succeededOn) &&
                Objects.equals(this.taxAmount, transactionCompletion.taxAmount) &&
                Objects.equals(this.timeZone, transactionCompletion.timeZone) &&
                Objects.equals(this.timeoutOn, transactionCompletion.timeoutOn) &&
                Objects.equals(this.version, transactionCompletion.version) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, linkedSpaceId, linkedTransaction, amount, baseLineItems, createdBy, createdOn, externalId, failedOn, failureReason, labels, language, lastCompletion, lineItemVersion, lineItems, mode, nextUpdateOn, paymentInformation, plannedPurgeDate, processingOn, processorReference, remainingLineItems, spaceViewId, state, succeededOn, taxAmount, timeZone, timeoutOn, version, super.hashCode());
    }


    @Override
    public String toString() {
        return "class TransactionCompletion { \n" +
            "    " + toIndentedString(super.toString()) + " \n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) +  "\n" +
            "    linkedTransaction: " + toIndentedString(linkedTransaction) + " \n" +
            "    amount: " +  toIndentedString(amount) + " \n" +
            "    baseLineItems: " + toIndentedString(baseLineItems) + " \n" +
            "    createdBy: " + toIndentedString(createdBy) + " \n" +
            "    createdOn: " + toIndentedString(createdOn) +  "\n" +
            "    externalId: " + toIndentedString(externalId) + " \n" +
            "    failedOn: " + toIndentedString(failedOn) + "\n" +
            "    failureReason: " + toIndentedString(failureReason) + " \n" +
            "    labels: " +  toIndentedString(labels) + " \n" +
            "    language: " + toIndentedString(language) + " \n" +
            "    lastCompletion: " + toIndentedString(lastCompletion) + " \n" +
            "    lineItemVersion: " + toIndentedString(lineItemVersion) + "\n" +
            "    lineItems: " + toIndentedString(lineItems) + " \n" +
            "    mode: " + toIndentedString(mode) + "\n" +
            "    nextUpdateOn: " + toIndentedString(nextUpdateOn) + " \n" +
            "    paymentInformation: " + toIndentedString(paymentInformation) + " \n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) + "\n" +
            "    processingOn: " + toIndentedString(processingOn) + " \n" +
            "    processorReference: " + toIndentedString(processorReference) + " \n" +
            "    remainingLineItems: " +  toIndentedString(remainingLineItems) + " \n" +
            "    spaceViewId: " + toIndentedString(spaceViewId) + " \n" +
            "    state: " + toIndentedString(state) + " \n" +
            "    succeededOn: " + toIndentedString(succeededOn) +  "\n" +
            "    taxAmount: " + toIndentedString(taxAmount) + " \n" +
            "    timeZone: " + toIndentedString(timeZone) + "\n" +
            "    timeoutOn: " + toIndentedString(timeoutOn) + " \n" +
            "    version: " + toIndentedString(version) + "\n" +
            "}";
        }


}

