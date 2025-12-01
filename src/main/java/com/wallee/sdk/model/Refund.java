/**
 * Wallee AG Java SDK
 *
 * This library allows to interact with the Wallee AG payment service.
 *
 * Copyright owner: Wallee AG
 * Website: https://en.wallee.com
 * Developer email: ecosystem-team@wallee.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.wallee.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.wallee.sdk.model.Environment;
import com.wallee.sdk.model.FailureReason;
import com.wallee.sdk.model.Label;
import com.wallee.sdk.model.LineItem;
import com.wallee.sdk.model.LineItemReduction;
import com.wallee.sdk.model.RefundState;
import com.wallee.sdk.model.RefundType;
import com.wallee.sdk.model.Tax;
import com.wallee.sdk.model.Transaction;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * A refund is a credit issued to the customer, which can be initiated either by the merchant or by the customer as a reversal.
 */
@JsonPropertyOrder({
  Refund.JSON_PROPERTY_TOTAL_SETTLED_AMOUNT,
  Refund.JSON_PROPERTY_REDUCTIONS,
  Refund.JSON_PROPERTY_BASE_LINE_ITEMS,
  Refund.JSON_PROPERTY_PROCESSING_ON,
  Refund.JSON_PROPERTY_TAXES,
  Refund.JSON_PROPERTY_LANGUAGE,
  Refund.JSON_PROPERTY_TYPE,
  Refund.JSON_PROPERTY_CREATED_ON,
  Refund.JSON_PROPERTY_LINE_ITEMS,
  Refund.JSON_PROPERTY_SUCCEEDED_ON,
  Refund.JSON_PROPERTY_REDUCED_LINE_ITEMS,
  Refund.JSON_PROPERTY_ID,
  Refund.JSON_PROPERTY_STATE,
  Refund.JSON_PROPERTY_MERCHANT_REFERENCE,
  Refund.JSON_PROPERTY_COMPLETION,
  Refund.JSON_PROPERTY_AMOUNT,
  Refund.JSON_PROPERTY_PLANNED_PURGE_DATE,
  Refund.JSON_PROPERTY_EXTERNAL_ID,
  Refund.JSON_PROPERTY_TIME_ZONE,
  Refund.JSON_PROPERTY_VERSION,
  Refund.JSON_PROPERTY_LABELS,
  Refund.JSON_PROPERTY_LINKED_SPACE_ID,
  Refund.JSON_PROPERTY_TIMEOUT_ON,
  Refund.JSON_PROPERTY_ENVIRONMENT,
  Refund.JSON_PROPERTY_CREATED_BY,
  Refund.JSON_PROPERTY_NEXT_UPDATE_ON,
  Refund.JSON_PROPERTY_UPDATED_INVOICE,
  Refund.JSON_PROPERTY_FAILURE_REASON,
  Refund.JSON_PROPERTY_TOTAL_APPLIED_FEES,
  Refund.JSON_PROPERTY_FAILED_ON,
  Refund.JSON_PROPERTY_TRANSACTION,
  Refund.JSON_PROPERTY_PROCESSOR_REFERENCE
})

public class Refund {
  public static final String JSON_PROPERTY_TOTAL_SETTLED_AMOUNT = "totalSettledAmount";
  @javax.annotation.Nullable
  private BigDecimal totalSettledAmount;

  public static final String JSON_PROPERTY_REDUCTIONS = "reductions";
  @javax.annotation.Nullable
  private List<LineItemReduction> reductions = new ArrayList<>();

  public static final String JSON_PROPERTY_BASE_LINE_ITEMS = "baseLineItems";
  @javax.annotation.Nullable
  private List<LineItem> baseLineItems = new ArrayList<>();

  public static final String JSON_PROPERTY_PROCESSING_ON = "processingOn";
  @javax.annotation.Nullable
  private OffsetDateTime processingOn;

  public static final String JSON_PROPERTY_TAXES = "taxes";
  @javax.annotation.Nullable
  private Set<Tax> taxes = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  @javax.annotation.Nullable
  private String language;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private RefundType type;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  @javax.annotation.Nullable
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_LINE_ITEMS = "lineItems";
  @javax.annotation.Nullable
  private List<LineItem> lineItems = new ArrayList<>();

  public static final String JSON_PROPERTY_SUCCEEDED_ON = "succeededOn";
  @javax.annotation.Nullable
  private OffsetDateTime succeededOn;

  public static final String JSON_PROPERTY_REDUCED_LINE_ITEMS = "reducedLineItems";
  @javax.annotation.Nullable
  private List<LineItem> reducedLineItems = new ArrayList<>();

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private RefundState state;

  public static final String JSON_PROPERTY_MERCHANT_REFERENCE = "merchantReference";
  @javax.annotation.Nullable
  private String merchantReference;

  public static final String JSON_PROPERTY_COMPLETION = "completion";
  @javax.annotation.Nullable
  private Long completion;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  @javax.annotation.Nullable
  private BigDecimal amount;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  @javax.annotation.Nullable
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  @javax.annotation.Nullable
  private String externalId;

  public static final String JSON_PROPERTY_TIME_ZONE = "timeZone";
  @javax.annotation.Nullable
  private String timeZone;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_LABELS = "labels";
  @javax.annotation.Nullable
  private Set<Label> labels = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_TIMEOUT_ON = "timeoutOn";
  @javax.annotation.Nullable
  private OffsetDateTime timeoutOn;

  public static final String JSON_PROPERTY_ENVIRONMENT = "environment";
  @javax.annotation.Nullable
  private Environment environment;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  @javax.annotation.Nullable
  private Long createdBy;

  public static final String JSON_PROPERTY_NEXT_UPDATE_ON = "nextUpdateOn";
  @javax.annotation.Nullable
  private OffsetDateTime nextUpdateOn;

  public static final String JSON_PROPERTY_UPDATED_INVOICE = "updatedInvoice";
  @javax.annotation.Nullable
  private Long updatedInvoice;

  public static final String JSON_PROPERTY_FAILURE_REASON = "failureReason";
  @javax.annotation.Nullable
  private FailureReason failureReason;

  public static final String JSON_PROPERTY_TOTAL_APPLIED_FEES = "totalAppliedFees";
  @javax.annotation.Nullable
  private BigDecimal totalAppliedFees;

  public static final String JSON_PROPERTY_FAILED_ON = "failedOn";
  @javax.annotation.Nullable
  private OffsetDateTime failedOn;

  public static final String JSON_PROPERTY_TRANSACTION = "transaction";
  @javax.annotation.Nullable
  private Transaction transaction;

  public static final String JSON_PROPERTY_PROCESSOR_REFERENCE = "processorReference";
  @javax.annotation.Nullable
  private String processorReference;

  public Refund() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public Refund(
    @JsonProperty(JSON_PROPERTY_TOTAL_SETTLED_AMOUNT) BigDecimal totalSettledAmount, 
    @JsonProperty(JSON_PROPERTY_REDUCTIONS) List<LineItemReduction> reductions, 
    @JsonProperty(JSON_PROPERTY_BASE_LINE_ITEMS) List<LineItem> baseLineItems, 
    @JsonProperty(JSON_PROPERTY_PROCESSING_ON) OffsetDateTime processingOn, 
    @JsonProperty(JSON_PROPERTY_TAXES) Set<Tax> taxes, 
    @JsonProperty(JSON_PROPERTY_LANGUAGE) String language, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_LINE_ITEMS) List<LineItem> lineItems, 
    @JsonProperty(JSON_PROPERTY_SUCCEEDED_ON) OffsetDateTime succeededOn, 
    @JsonProperty(JSON_PROPERTY_REDUCED_LINE_ITEMS) List<LineItem> reducedLineItems, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_MERCHANT_REFERENCE) String merchantReference, 
    @JsonProperty(JSON_PROPERTY_COMPLETION) Long completion, 
    @JsonProperty(JSON_PROPERTY_AMOUNT) BigDecimal amount, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_EXTERNAL_ID) String externalId, 
    @JsonProperty(JSON_PROPERTY_TIME_ZONE) String timeZone, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_LABELS) Set<Label> labels, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_TIMEOUT_ON) OffsetDateTime timeoutOn, 
    @JsonProperty(JSON_PROPERTY_CREATED_BY) Long createdBy, 
    @JsonProperty(JSON_PROPERTY_NEXT_UPDATE_ON) OffsetDateTime nextUpdateOn, 
    @JsonProperty(JSON_PROPERTY_UPDATED_INVOICE) Long updatedInvoice, 
    @JsonProperty(JSON_PROPERTY_TOTAL_APPLIED_FEES) BigDecimal totalAppliedFees, 
    @JsonProperty(JSON_PROPERTY_FAILED_ON) OffsetDateTime failedOn, 
    @JsonProperty(JSON_PROPERTY_PROCESSOR_REFERENCE) String processorReference
  ) {
    this();
    this.totalSettledAmount = totalSettledAmount;
    this.reductions = reductions;
    this.baseLineItems = baseLineItems;
    this.processingOn = processingOn;
    this.taxes = taxes;
    this.language = language;
    this.createdOn = createdOn;
    this.lineItems = lineItems;
    this.succeededOn = succeededOn;
    this.reducedLineItems = reducedLineItems;
    this.id = id;
    this.merchantReference = merchantReference;
    this.completion = completion;
    this.amount = amount;
    this.plannedPurgeDate = plannedPurgeDate;
    this.externalId = externalId;
    this.timeZone = timeZone;
    this.version = version;
    this.labels = labels;
    this.linkedSpaceId = linkedSpaceId;
    this.timeoutOn = timeoutOn;
    this.createdBy = createdBy;
    this.nextUpdateOn = nextUpdateOn;
    this.updatedInvoice = updatedInvoice;
    this.totalAppliedFees = totalAppliedFees;
    this.failedOn = failedOn;
    this.processorReference = processorReference;
  }

  /**
   * The total amount settled for the refund, factoring in reductions, taxes, and any additional applied fees.
   * @return totalSettledAmount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_SETTLED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTotalSettledAmount() {
    return totalSettledAmount;
  }



  /**
   * The reductions applied on the original transaction items, detailing specific adjustments associated with the refund.
   * @return reductions
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REDUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LineItemReduction> getReductions() {
    return reductions;
  }



  /**
   * The original base line items from the transaction prior to the refund, serving as a reference for the refunded amounts.
   * @return baseLineItems
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BASE_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LineItem> getBaseLineItems() {
    return baseLineItems;
  }



  /**
   * The date and time when the processing of the refund was started.
   * @return processingOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROCESSING_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getProcessingOn() {
    return processingOn;
  }



  /**
   * The tax breakdown applied to the refund amount, helping with tax calculations or reporting.
   * @return taxes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Tax> getTaxes() {
    return taxes;
  }



  /**
   * The language that is linked to the object.
   * @return language
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }



  public Refund type(@javax.annotation.Nullable RefundType type) {
    
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RefundType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable RefundType type) {
    this.type = type;
  }

  /**
   * The date and time when the object was created.
   * @return createdOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }



  /**
   * The line items included in the refund, representing the reductions.
   * @return lineItems
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LineItem> getLineItems() {
    return lineItems;
  }



  /**
   * The date and time when the refund succeeded.
   * @return succeededOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUCCEEDED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getSucceededOn() {
    return succeededOn;
  }



  /**
   * The line items from the original transaction, adjusted to reflect any reductions applied during the refund process.
   * @return reducedLineItems
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REDUCED_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LineItem> getReducedLineItems() {
    return reducedLineItems;
  }



  /**
   * A unique identifier for the object.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }



  public Refund state(@javax.annotation.Nullable RefundState state) {
    
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RefundState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable RefundState state) {
    this.state = state;
  }

  /**
   * The merchant&#39;s reference used to identify the refund.
   * @return merchantReference
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantReference() {
    return merchantReference;
  }



  /**
   * The transaction completion that the refund belongs to.
   * @return completion
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCompletion() {
    return completion;
  }



  /**
   * The total monetary amount of the refund, representing the exact credit issued to the customer.
   * @return amount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAmount() {
    return amount;
  }



  /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }



  /**
   * A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.
   * @return externalId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalId() {
    return externalId;
  }



  /**
   * The time zone that this object is associated with.
   * @return timeZone
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeZone() {
    return timeZone;
  }



  /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }



  /**
   * The labels providing additional information about the object.
   * @return labels
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Label> getLabels() {
    return labels;
  }



  /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }



  /**
   * The date and time when the object will expire.
   * @return timeoutOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEOUT_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTimeoutOn() {
    return timeoutOn;
  }



  public Refund environment(@javax.annotation.Nullable Environment environment) {
    
    this.environment = environment;
    return this;
  }

  /**
   * Get environment
   * @return environment
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Environment getEnvironment() {
    return environment;
  }


  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnvironment(@javax.annotation.Nullable Environment environment) {
    this.environment = environment;
  }

  /**
   * The ID of the user the refund was created by.
   * @return createdBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreatedBy() {
    return createdBy;
  }



  /**
   * The date and time when the next update of the object&#39;s state is planned.
   * @return nextUpdateOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_UPDATE_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getNextUpdateOn() {
    return nextUpdateOn;
  }



  /**
   * An updated invoice reflecting adjustments made by the refund.
   * @return updatedInvoice
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_INVOICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUpdatedInvoice() {
    return updatedInvoice;
  }



  public Refund failureReason(@javax.annotation.Nullable FailureReason failureReason) {
    
    this.failureReason = failureReason;
    return this;
  }

  /**
   * Get failureReason
   * @return failureReason
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILURE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FailureReason getFailureReason() {
    return failureReason;
  }


  @JsonProperty(JSON_PROPERTY_FAILURE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailureReason(@javax.annotation.Nullable FailureReason failureReason) {
    this.failureReason = failureReason;
  }

  /**
   * The sum of fees applied to the refund transaction, such as processing or service charges.
   * @return totalAppliedFees
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_APPLIED_FEES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTotalAppliedFees() {
    return totalAppliedFees;
  }



  /**
   * The date and time when the refund failed.
   * @return failedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getFailedOn() {
    return failedOn;
  }



  public Refund transaction(@javax.annotation.Nullable Transaction transaction) {
    
    this.transaction = transaction;
    return this;
  }

  /**
   * Get transaction
   * @return transaction
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Transaction getTransaction() {
    return transaction;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransaction(@javax.annotation.Nullable Transaction transaction) {
    this.transaction = transaction;
  }

  /**
   * The reference ID provided by the payment processor, used to trace the refund through the external payment system.
   * @return processorReference
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROCESSOR_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProcessorReference() {
    return processorReference;
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
    return Objects.equals(this.totalSettledAmount, refund.totalSettledAmount) &&
        Objects.equals(this.reductions, refund.reductions) &&
        Objects.equals(this.baseLineItems, refund.baseLineItems) &&
        Objects.equals(this.processingOn, refund.processingOn) &&
        Objects.equals(this.taxes, refund.taxes) &&
        Objects.equals(this.language, refund.language) &&
        Objects.equals(this.type, refund.type) &&
        Objects.equals(this.createdOn, refund.createdOn) &&
        Objects.equals(this.lineItems, refund.lineItems) &&
        Objects.equals(this.succeededOn, refund.succeededOn) &&
        Objects.equals(this.reducedLineItems, refund.reducedLineItems) &&
        Objects.equals(this.id, refund.id) &&
        Objects.equals(this.state, refund.state) &&
        Objects.equals(this.merchantReference, refund.merchantReference) &&
        Objects.equals(this.completion, refund.completion) &&
        Objects.equals(this.amount, refund.amount) &&
        Objects.equals(this.plannedPurgeDate, refund.plannedPurgeDate) &&
        Objects.equals(this.externalId, refund.externalId) &&
        Objects.equals(this.timeZone, refund.timeZone) &&
        Objects.equals(this.version, refund.version) &&
        Objects.equals(this.labels, refund.labels) &&
        Objects.equals(this.linkedSpaceId, refund.linkedSpaceId) &&
        Objects.equals(this.timeoutOn, refund.timeoutOn) &&
        Objects.equals(this.environment, refund.environment) &&
        Objects.equals(this.createdBy, refund.createdBy) &&
        Objects.equals(this.nextUpdateOn, refund.nextUpdateOn) &&
        Objects.equals(this.updatedInvoice, refund.updatedInvoice) &&
        Objects.equals(this.failureReason, refund.failureReason) &&
        Objects.equals(this.totalAppliedFees, refund.totalAppliedFees) &&
        Objects.equals(this.failedOn, refund.failedOn) &&
        Objects.equals(this.transaction, refund.transaction) &&
        Objects.equals(this.processorReference, refund.processorReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalSettledAmount, reductions, baseLineItems, processingOn, taxes, language, type, createdOn, lineItems, succeededOn, reducedLineItems, id, state, merchantReference, completion, amount, plannedPurgeDate, externalId, timeZone, version, labels, linkedSpaceId, timeoutOn, environment, createdBy, nextUpdateOn, updatedInvoice, failureReason, totalAppliedFees, failedOn, transaction, processorReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Refund {\n");
    sb.append("    totalSettledAmount: ").append(toIndentedString(totalSettledAmount)).append("\n");
    sb.append("    reductions: ").append(toIndentedString(reductions)).append("\n");
    sb.append("    baseLineItems: ").append(toIndentedString(baseLineItems)).append("\n");
    sb.append("    processingOn: ").append(toIndentedString(processingOn)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    succeededOn: ").append(toIndentedString(succeededOn)).append("\n");
    sb.append("    reducedLineItems: ").append(toIndentedString(reducedLineItems)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
    sb.append("    completion: ").append(toIndentedString(completion)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    timeoutOn: ").append(toIndentedString(timeoutOn)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    nextUpdateOn: ").append(toIndentedString(nextUpdateOn)).append("\n");
    sb.append("    updatedInvoice: ").append(toIndentedString(updatedInvoice)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    totalAppliedFees: ").append(toIndentedString(totalAppliedFees)).append("\n");
    sb.append("    failedOn: ").append(toIndentedString(failedOn)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    processorReference: ").append(toIndentedString(processorReference)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `totalSettledAmount` to the URL query string
    if (getTotalSettledAmount() != null) {
      try {
        joiner.add(String.format("%stotalSettledAmount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalSettledAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `reductions` to the URL query string
    if (getReductions() != null) {
      for (int i = 0; i < getReductions().size(); i++) {
        if (getReductions().get(i) != null) {
          joiner.add(getReductions().get(i).toUrlQueryString(String.format("%sreductions%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `baseLineItems` to the URL query string
    if (getBaseLineItems() != null) {
      for (int i = 0; i < getBaseLineItems().size(); i++) {
        if (getBaseLineItems().get(i) != null) {
          joiner.add(getBaseLineItems().get(i).toUrlQueryString(String.format("%sbaseLineItems%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `processingOn` to the URL query string
    if (getProcessingOn() != null) {
      try {
        joiner.add(String.format("%sprocessingOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProcessingOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `taxes` to the URL query string
    if (getTaxes() != null) {
      int i = 0;
      for (Tax _item : getTaxes()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%staxes%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `language` to the URL query string
    if (getLanguage() != null) {
      try {
        joiner.add(String.format("%slanguage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLanguage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createdOn` to the URL query string
    if (getCreatedOn() != null) {
      try {
        joiner.add(String.format("%screatedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `lineItems` to the URL query string
    if (getLineItems() != null) {
      for (int i = 0; i < getLineItems().size(); i++) {
        if (getLineItems().get(i) != null) {
          joiner.add(getLineItems().get(i).toUrlQueryString(String.format("%slineItems%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `succeededOn` to the URL query string
    if (getSucceededOn() != null) {
      try {
        joiner.add(String.format("%ssucceededOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSucceededOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `reducedLineItems` to the URL query string
    if (getReducedLineItems() != null) {
      for (int i = 0; i < getReducedLineItems().size(); i++) {
        if (getReducedLineItems().get(i) != null) {
          joiner.add(getReducedLineItems().get(i).toUrlQueryString(String.format("%sreducedLineItems%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `state` to the URL query string
    if (getState() != null) {
      try {
        joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `merchantReference` to the URL query string
    if (getMerchantReference() != null) {
      try {
        joiner.add(String.format("%smerchantReference%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMerchantReference()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `completion` to the URL query string
    if (getCompletion() != null) {
      try {
        joiner.add(String.format("%scompletion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCompletion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `amount` to the URL query string
    if (getAmount() != null) {
      try {
        joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `plannedPurgeDate` to the URL query string
    if (getPlannedPurgeDate() != null) {
      try {
        joiner.add(String.format("%splannedPurgeDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlannedPurgeDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `externalId` to the URL query string
    if (getExternalId() != null) {
      try {
        joiner.add(String.format("%sexternalId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExternalId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `timeZone` to the URL query string
    if (getTimeZone() != null) {
      try {
        joiner.add(String.format("%stimeZone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimeZone()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `labels` to the URL query string
    if (getLabels() != null) {
      int i = 0;
      for (Label _item : getLabels()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%slabels%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `linkedSpaceId` to the URL query string
    if (getLinkedSpaceId() != null) {
      try {
        joiner.add(String.format("%slinkedSpaceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedSpaceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `timeoutOn` to the URL query string
    if (getTimeoutOn() != null) {
      try {
        joiner.add(String.format("%stimeoutOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimeoutOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `environment` to the URL query string
    if (getEnvironment() != null) {
      try {
        joiner.add(String.format("%senvironment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnvironment()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createdBy` to the URL query string
    if (getCreatedBy() != null) {
      try {
        joiner.add(String.format("%screatedBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedBy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `nextUpdateOn` to the URL query string
    if (getNextUpdateOn() != null) {
      try {
        joiner.add(String.format("%snextUpdateOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNextUpdateOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `updatedInvoice` to the URL query string
    if (getUpdatedInvoice() != null) {
      try {
        joiner.add(String.format("%supdatedInvoice%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUpdatedInvoice()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `failureReason` to the URL query string
    if (getFailureReason() != null) {
      joiner.add(getFailureReason().toUrlQueryString(prefix + "failureReason" + suffix));
    }

    // add `totalAppliedFees` to the URL query string
    if (getTotalAppliedFees() != null) {
      try {
        joiner.add(String.format("%stotalAppliedFees%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalAppliedFees()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `failedOn` to the URL query string
    if (getFailedOn() != null) {
      try {
        joiner.add(String.format("%sfailedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFailedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `transaction` to the URL query string
    if (getTransaction() != null) {
      joiner.add(getTransaction().toUrlQueryString(prefix + "transaction" + suffix));
    }

    // add `processorReference` to the URL query string
    if (getProcessorReference() != null) {
      try {
        joiner.add(String.format("%sprocessorReference%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProcessorReference()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

