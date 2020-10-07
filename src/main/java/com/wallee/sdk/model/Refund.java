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
import com.wallee.sdk.model.enums.Environment;
import com.wallee.sdk.model.enums.RefundState;
import com.wallee.sdk.model.enums.RefundType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * The refund represents a credit back to the customer. It can be issued by the merchant or by the customer (reversal).
 */
@ApiModel(description = "The refund represents a credit back to the customer. It can be issued by the merchant or by the customer (reversal).")

public class Refund extends Indentable {

    @JsonProperty("amount")
    protected BigDecimal amount;


    @JsonProperty("baseLineItems")
    protected List<LineItem> baseLineItems;


    @JsonProperty("completion")
    protected Long completion;


    @JsonProperty("createdBy")
    protected Long createdBy;


    @JsonProperty("createdOn")
    protected OffsetDateTime createdOn;


    @JsonProperty("environment")
    protected Environment environment;


    @JsonProperty("externalId")
    protected String externalId;


    @JsonProperty("failedOn")
    protected OffsetDateTime failedOn;


    @JsonProperty("failureReason")
    protected FailureReason failureReason;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("labels")
    protected List<Label> labels;


    @JsonProperty("language")
    protected String language;


    @JsonProperty("lineItems")
    protected List<LineItem> lineItems;


    @JsonProperty("linkedSpaceId")
    protected Long linkedSpaceId;


    @JsonProperty("merchantReference")
    protected String merchantReference;


    @JsonProperty("nextUpdateOn")
    protected OffsetDateTime nextUpdateOn;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("processingOn")
    protected OffsetDateTime processingOn;


    @JsonProperty("processorReference")
    protected String processorReference;


    @JsonProperty("reducedLineItems")
    protected List<LineItem> reducedLineItems;


    @JsonProperty("reductions")
    protected List<LineItemReduction> reductions;


    @JsonProperty("state")
    protected RefundState state;


    @JsonProperty("succeededOn")
    protected OffsetDateTime succeededOn;


    @JsonProperty("taxes")
    protected List<Tax> taxes;


    @JsonProperty("timeZone")
    protected String timeZone;


    @JsonProperty("timeoutOn")
    protected OffsetDateTime timeoutOn;


    @JsonProperty("totalAppliedFees")
    protected BigDecimal totalAppliedFees;


    @JsonProperty("totalSettledAmount")
    protected BigDecimal totalSettledAmount;


    @JsonProperty("transaction")
    protected Transaction transaction;


    @JsonProperty("type")
    protected RefundType type;


    @JsonProperty("updatedInvoice")
    protected Long updatedInvoice;


    @JsonProperty("version")
    protected Integer version;


    /**
     * @return amount
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getAmount() {
        return amount;
    }


    /**
     * @return baseLineItems
     **/
    @ApiModelProperty(value = "")
    public List<LineItem> getBaseLineItems() {
        return baseLineItems;
    }


    /**
     * @return completion
     **/
    @ApiModelProperty(value = "")
    public Long getCompletion() {
        return completion;
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
     * @return environment
     **/
    @ApiModelProperty(value = "")
    public Environment getEnvironment() {
        return environment;
    }


    /**
     * The external id helps to identify duplicate calls to the refund service. As such the external ID has to be unique per transaction.
     *
     * @return externalId
     **/
    @ApiModelProperty(value = "The external id helps to identify duplicate calls to the refund service. As such the external ID has to be unique per transaction.")
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
     * The ID is the primary key of the entity. The ID identifies the entity uniquely.
     *
     * @return id
     **/
    @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
    public Long getId() {
        return id;
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
     * @return lineItems
     **/
    @ApiModelProperty(value = "")
    public List<LineItem> getLineItems() {
        return lineItems;
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
     * @return merchantReference
     **/
    @ApiModelProperty(value = "")
    public String getMerchantReference() {
        return merchantReference;
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
     * @return reducedLineItems
     **/
    @ApiModelProperty(value = "")
    public List<LineItem> getReducedLineItems() {
        return reducedLineItems;
    }


    /**
     * @return reductions
     **/
    @ApiModelProperty(value = "")
    public List<LineItemReduction> getReductions() {
        return reductions;
    }


    /**
     * @return state
     **/
    @ApiModelProperty(value = "")
    public RefundState getState() {
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
     * @return taxes
     **/
    @ApiModelProperty(value = "")
    public List<Tax> getTaxes() {
        return taxes;
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
     * The total applied fees is the sum of all fees that have been applied so far.
     *
     * @return totalAppliedFees
     **/
    @ApiModelProperty(value = "The total applied fees is the sum of all fees that have been applied so far.")
    public BigDecimal getTotalAppliedFees() {
        return totalAppliedFees;
    }


    /**
     * The total settled amount is the total amount which has been settled so far.
     *
     * @return totalSettledAmount
     **/
    @ApiModelProperty(value = "The total settled amount is the total amount which has been settled so far.")
    public BigDecimal getTotalSettledAmount() {
        return totalSettledAmount;
    }


    /**
     * @return transaction
     **/
    @ApiModelProperty(value = "")
    public Transaction getTransaction() {
        return transaction;
    }


    /**
     * @return type
     **/
    @ApiModelProperty(value = "")
    public RefundType getType() {
        return type;
    }


    /**
     * @return updatedInvoice
     **/
    @ApiModelProperty(value = "")
    public Long getUpdatedInvoice() {
        return updatedInvoice;
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
        Refund refund = (Refund) o;
        return Objects.equals(this.amount, refund.amount) &&
                Objects.equals(this.baseLineItems, refund.baseLineItems) &&
                Objects.equals(this.completion, refund.completion) &&
                Objects.equals(this.createdBy, refund.createdBy) &&
                Objects.equals(this.createdOn, refund.createdOn) && this.environment == refund.environment &&
                Objects.equals(this.externalId, refund.externalId) &&
                Objects.equals(this.failedOn, refund.failedOn) &&
                Objects.equals(this.failureReason, refund.failureReason) &&
                Objects.equals(this.id, refund.id) &&
                Objects.equals(this.labels, refund.labels) &&
                Objects.equals(this.language, refund.language) &&
                Objects.equals(this.lineItems, refund.lineItems) &&
                Objects.equals(this.linkedSpaceId, refund.linkedSpaceId) &&
                Objects.equals(this.merchantReference, refund.merchantReference) &&
                Objects.equals(this.nextUpdateOn, refund.nextUpdateOn) &&
                Objects.equals(this.plannedPurgeDate, refund.plannedPurgeDate) &&
                Objects.equals(this.processingOn, refund.processingOn) &&
                Objects.equals(this.processorReference, refund.processorReference) &&
                Objects.equals(this.reducedLineItems, refund.reducedLineItems) &&
                Objects.equals(this.reductions, refund.reductions) && this.state == refund.state &&
                Objects.equals(this.succeededOn, refund.succeededOn) &&
                Objects.equals(this.taxes, refund.taxes) &&
                Objects.equals(this.timeZone, refund.timeZone) &&
                Objects.equals(this.timeoutOn, refund.timeoutOn) &&
                Objects.equals(this.totalAppliedFees, refund.totalAppliedFees) &&
                Objects.equals(this.totalSettledAmount, refund.totalSettledAmount) &&
                Objects.equals(this.transaction, refund.transaction) && this.type == refund.type &&
                Objects.equals(this.updatedInvoice, refund.updatedInvoice) &&
                Objects.equals(this.version, refund.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, baseLineItems, completion, createdBy, createdOn, environment, externalId, failedOn, failureReason, id, labels, language, lineItems, linkedSpaceId, merchantReference, nextUpdateOn, plannedPurgeDate, processingOn, processorReference, reducedLineItems, reductions, state, succeededOn, taxes, timeZone, timeoutOn, totalAppliedFees, totalSettledAmount, transaction, type, updatedInvoice, version);
    }


    @Override
    public String toString() {

        return "class Refund { \n" +
            "    amount: " + toIndentedString(amount) + "\n" +
            "    baseLineItems: " + toIndentedString(baseLineItems) + " \n" +
            "    completion: " + toIndentedString(completion) +  " \n" +
            "    createdBy: " + toIndentedString(createdBy) + " \n" +
            "    createdOn: " + toIndentedString(createdOn) + "\n" +
            "    environment: " + toIndentedString(environment) + "\n" +
            "    externalId: " +  toIndentedString(externalId) + "\n" +
            "    failedOn: " + toIndentedString(failedOn) + "\n" +
            "    failureReason: " + toIndentedString(failureReason) + " \n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    labels: " + toIndentedString(labels) + " \n" +
            "    language: " + toIndentedString(language) + "\n" +
            "    lineItems: " + toIndentedString(lineItems) + " \n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) +  " \n" +
            "    merchantReference: " + toIndentedString(merchantReference) + " \n" +
            "    nextUpdateOn: " + toIndentedString(nextUpdateOn) + " \n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) + "\n" +
            "    processingOn: " + toIndentedString(processingOn) + "\n" +
            "    processorReference: " + toIndentedString(processorReference) + " \n" +
            "    reducedLineItems: " + toIndentedString(reducedLineItems) + "\n" +
            "    reductions: " + toIndentedString(reductions) + "\n" +
            "    state: " + toIndentedString(state) + "\n" +
            "    succeededOn: " + toIndentedString(succeededOn) + "\n" +
            "    taxes: " + toIndentedString(taxes) + "\n" +
            "    timeZone: " + toIndentedString(timeZone) + "\n" +
            "    timeoutOn: " +  toIndentedString(timeoutOn) + "\n" +
            "    totalAppliedFees: " + toIndentedString(totalAppliedFees) +  " \n" +
            "    totalSettledAmount: " + toIndentedString(totalSettledAmount) + " \n" +
            "    transaction: " + toIndentedString(transaction) + " \n" +
            "    type: " + toIndentedString(type) +  " \n" +
            "    updatedInvoice: " + toIndentedString(updatedInvoice) + " \n" +
            "    version: " +  toIndentedString(version) + "\n" +
            "}";
        }


}

