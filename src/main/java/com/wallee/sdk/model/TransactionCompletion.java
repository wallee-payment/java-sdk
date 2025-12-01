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
import com.wallee.sdk.model.FailureReason;
import com.wallee.sdk.model.Label;
import com.wallee.sdk.model.LineItem;
import com.wallee.sdk.model.TransactionCompletionMode;
import com.wallee.sdk.model.TransactionCompletionState;
import com.wallee.sdk.model.TransactionLineItemVersion;
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
 * TransactionCompletion
 */
@JsonPropertyOrder({
  TransactionCompletion.JSON_PROPERTY_LINE_ITEM_VERSION,
  TransactionCompletion.JSON_PROPERTY_STATEMENT_DESCRIPTOR,
  TransactionCompletion.JSON_PROPERTY_BASE_LINE_ITEMS,
  TransactionCompletion.JSON_PROPERTY_PROCESSING_ON,
  TransactionCompletion.JSON_PROPERTY_INVOICE_MERCHANT_REFERENCE,
  TransactionCompletion.JSON_PROPERTY_LANGUAGE,
  TransactionCompletion.JSON_PROPERTY_REMAINING_LINE_ITEMS,
  TransactionCompletion.JSON_PROPERTY_CREATED_ON,
  TransactionCompletion.JSON_PROPERTY_LINE_ITEMS,
  TransactionCompletion.JSON_PROPERTY_MODE,
  TransactionCompletion.JSON_PROPERTY_SUCCEEDED_ON,
  TransactionCompletion.JSON_PROPERTY_ID,
  TransactionCompletion.JSON_PROPERTY_STATE,
  TransactionCompletion.JSON_PROPERTY_LINKED_TRANSACTION,
  TransactionCompletion.JSON_PROPERTY_PAYMENT_INFORMATION,
  TransactionCompletion.JSON_PROPERTY_AMOUNT,
  TransactionCompletion.JSON_PROPERTY_LAST_COMPLETION,
  TransactionCompletion.JSON_PROPERTY_PLANNED_PURGE_DATE,
  TransactionCompletion.JSON_PROPERTY_EXTERNAL_ID,
  TransactionCompletion.JSON_PROPERTY_TIME_ZONE,
  TransactionCompletion.JSON_PROPERTY_SPACE_VIEW_ID,
  TransactionCompletion.JSON_PROPERTY_VERSION,
  TransactionCompletion.JSON_PROPERTY_LABELS,
  TransactionCompletion.JSON_PROPERTY_LINKED_SPACE_ID,
  TransactionCompletion.JSON_PROPERTY_TIMEOUT_ON,
  TransactionCompletion.JSON_PROPERTY_CREATED_BY,
  TransactionCompletion.JSON_PROPERTY_NEXT_UPDATE_ON,
  TransactionCompletion.JSON_PROPERTY_FAILURE_REASON,
  TransactionCompletion.JSON_PROPERTY_TAX_AMOUNT,
  TransactionCompletion.JSON_PROPERTY_FAILED_ON,
  TransactionCompletion.JSON_PROPERTY_PROCESSOR_REFERENCE
})

public class TransactionCompletion {
  public static final String JSON_PROPERTY_LINE_ITEM_VERSION = "lineItemVersion";
  @javax.annotation.Nullable
  private TransactionLineItemVersion lineItemVersion;

  public static final String JSON_PROPERTY_STATEMENT_DESCRIPTOR = "statementDescriptor";
  @javax.annotation.Nullable
  private String statementDescriptor;

  public static final String JSON_PROPERTY_BASE_LINE_ITEMS = "baseLineItems";
  @javax.annotation.Nullable
  private List<LineItem> baseLineItems = new ArrayList<>();

  public static final String JSON_PROPERTY_PROCESSING_ON = "processingOn";
  @javax.annotation.Nullable
  private OffsetDateTime processingOn;

  public static final String JSON_PROPERTY_INVOICE_MERCHANT_REFERENCE = "invoiceMerchantReference";
  @javax.annotation.Nullable
  private String invoiceMerchantReference;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  @javax.annotation.Nullable
  private String language;

  public static final String JSON_PROPERTY_REMAINING_LINE_ITEMS = "remainingLineItems";
  @javax.annotation.Nullable
  private List<LineItem> remainingLineItems = new ArrayList<>();

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  @javax.annotation.Nullable
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_LINE_ITEMS = "lineItems";
  @javax.annotation.Nullable
  private List<LineItem> lineItems = new ArrayList<>();

  public static final String JSON_PROPERTY_MODE = "mode";
  @javax.annotation.Nullable
  private TransactionCompletionMode mode;

  public static final String JSON_PROPERTY_SUCCEEDED_ON = "succeededOn";
  @javax.annotation.Nullable
  private OffsetDateTime succeededOn;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private TransactionCompletionState state;

  public static final String JSON_PROPERTY_LINKED_TRANSACTION = "linkedTransaction";
  @javax.annotation.Nullable
  private Long linkedTransaction;

  public static final String JSON_PROPERTY_PAYMENT_INFORMATION = "paymentInformation";
  @javax.annotation.Nullable
  private String paymentInformation;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  @javax.annotation.Nullable
  private BigDecimal amount;

  public static final String JSON_PROPERTY_LAST_COMPLETION = "lastCompletion";
  @javax.annotation.Nullable
  private Boolean lastCompletion;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  @javax.annotation.Nullable
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  @javax.annotation.Nullable
  private String externalId;

  public static final String JSON_PROPERTY_TIME_ZONE = "timeZone";
  @javax.annotation.Nullable
  private String timeZone;

  public static final String JSON_PROPERTY_SPACE_VIEW_ID = "spaceViewId";
  @javax.annotation.Nullable
  private Long spaceViewId;

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

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  @javax.annotation.Nullable
  private Long createdBy;

  public static final String JSON_PROPERTY_NEXT_UPDATE_ON = "nextUpdateOn";
  @javax.annotation.Nullable
  private OffsetDateTime nextUpdateOn;

  public static final String JSON_PROPERTY_FAILURE_REASON = "failureReason";
  @javax.annotation.Nullable
  private FailureReason failureReason;

  public static final String JSON_PROPERTY_TAX_AMOUNT = "taxAmount";
  @javax.annotation.Nullable
  private BigDecimal taxAmount;

  public static final String JSON_PROPERTY_FAILED_ON = "failedOn";
  @javax.annotation.Nullable
  private OffsetDateTime failedOn;

  public static final String JSON_PROPERTY_PROCESSOR_REFERENCE = "processorReference";
  @javax.annotation.Nullable
  private String processorReference;

  public TransactionCompletion() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public TransactionCompletion(
    @JsonProperty(JSON_PROPERTY_STATEMENT_DESCRIPTOR) String statementDescriptor, 
    @JsonProperty(JSON_PROPERTY_BASE_LINE_ITEMS) List<LineItem> baseLineItems, 
    @JsonProperty(JSON_PROPERTY_PROCESSING_ON) OffsetDateTime processingOn, 
    @JsonProperty(JSON_PROPERTY_INVOICE_MERCHANT_REFERENCE) String invoiceMerchantReference, 
    @JsonProperty(JSON_PROPERTY_LANGUAGE) String language, 
    @JsonProperty(JSON_PROPERTY_REMAINING_LINE_ITEMS) List<LineItem> remainingLineItems, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_LINE_ITEMS) List<LineItem> lineItems, 
    @JsonProperty(JSON_PROPERTY_SUCCEEDED_ON) OffsetDateTime succeededOn, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_LINKED_TRANSACTION) Long linkedTransaction, 
    @JsonProperty(JSON_PROPERTY_PAYMENT_INFORMATION) String paymentInformation, 
    @JsonProperty(JSON_PROPERTY_AMOUNT) BigDecimal amount, 
    @JsonProperty(JSON_PROPERTY_LAST_COMPLETION) Boolean lastCompletion, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_EXTERNAL_ID) String externalId, 
    @JsonProperty(JSON_PROPERTY_TIME_ZONE) String timeZone, 
    @JsonProperty(JSON_PROPERTY_SPACE_VIEW_ID) Long spaceViewId, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_LABELS) Set<Label> labels, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_TIMEOUT_ON) OffsetDateTime timeoutOn, 
    @JsonProperty(JSON_PROPERTY_CREATED_BY) Long createdBy, 
    @JsonProperty(JSON_PROPERTY_NEXT_UPDATE_ON) OffsetDateTime nextUpdateOn, 
    @JsonProperty(JSON_PROPERTY_TAX_AMOUNT) BigDecimal taxAmount, 
    @JsonProperty(JSON_PROPERTY_FAILED_ON) OffsetDateTime failedOn, 
    @JsonProperty(JSON_PROPERTY_PROCESSOR_REFERENCE) String processorReference
  ) {
    this();
    this.statementDescriptor = statementDescriptor;
    this.baseLineItems = baseLineItems;
    this.processingOn = processingOn;
    this.invoiceMerchantReference = invoiceMerchantReference;
    this.language = language;
    this.remainingLineItems = remainingLineItems;
    this.createdOn = createdOn;
    this.lineItems = lineItems;
    this.succeededOn = succeededOn;
    this.id = id;
    this.linkedTransaction = linkedTransaction;
    this.paymentInformation = paymentInformation;
    this.amount = amount;
    this.lastCompletion = lastCompletion;
    this.plannedPurgeDate = plannedPurgeDate;
    this.externalId = externalId;
    this.timeZone = timeZone;
    this.spaceViewId = spaceViewId;
    this.version = version;
    this.labels = labels;
    this.linkedSpaceId = linkedSpaceId;
    this.timeoutOn = timeoutOn;
    this.createdBy = createdBy;
    this.nextUpdateOn = nextUpdateOn;
    this.taxAmount = taxAmount;
    this.failedOn = failedOn;
    this.processorReference = processorReference;
  }

  public TransactionCompletion lineItemVersion(@javax.annotation.Nullable TransactionLineItemVersion lineItemVersion) {
    
    this.lineItemVersion = lineItemVersion;
    return this;
  }

  /**
   * Get lineItemVersion
   * @return lineItemVersion
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINE_ITEM_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionLineItemVersion getLineItemVersion() {
    return lineItemVersion;
  }


  @JsonProperty(JSON_PROPERTY_LINE_ITEM_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineItemVersion(@javax.annotation.Nullable TransactionLineItemVersion lineItemVersion) {
    this.lineItemVersion = lineItemVersion;
  }

  /**
   * The statement descriptor that appears on a customer&#39;s bank statement, providing an explanation for charges or payments, helping customers identify the transaction.
   * @return statementDescriptor
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATEMENT_DESCRIPTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatementDescriptor() {
    return statementDescriptor;
  }



  /**
   * The original line items from the transaction that serve as the baseline for this completion.
   * @return baseLineItems
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BASE_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LineItem> getBaseLineItems() {
    return baseLineItems;
  }



  /**
   * The date and time when the processing of the transaction completion was started.
   * @return processingOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROCESSING_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getProcessingOn() {
    return processingOn;
  }



  /**
   * The merchant&#39;s reference used to identify the invoice.
   * @return invoiceMerchantReference
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVOICE_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvoiceMerchantReference() {
    return invoiceMerchantReference;
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



  /**
   * The line items yet to be captured in the transaction.
   * @return remainingLineItems
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMAINING_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LineItem> getRemainingLineItems() {
    return remainingLineItems;
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
   * The line items captured in this transaction completion.
   * @return lineItems
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LineItem> getLineItems() {
    return lineItems;
  }



  public TransactionCompletion mode(@javax.annotation.Nullable TransactionCompletionMode mode) {
    
    this.mode = mode;
    return this;
  }

  /**
   * Get mode
   * @return mode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionCompletionMode getMode() {
    return mode;
  }


  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMode(@javax.annotation.Nullable TransactionCompletionMode mode) {
    this.mode = mode;
  }

  /**
   * The date and time when the transaction completion succeeded.
   * @return succeededOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUCCEEDED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getSucceededOn() {
    return succeededOn;
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



  public TransactionCompletion state(@javax.annotation.Nullable TransactionCompletionState state) {
    
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

  public TransactionCompletionState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable TransactionCompletionState state) {
    this.state = state;
  }

  /**
   * The payment transaction this object is linked to.
   * @return linkedTransaction
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedTransaction() {
    return linkedTransaction;
  }



  /**
   * Payment-specific details related to this transaction completion such as payment instructions or references needed for processing.
   * @return paymentInformation
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentInformation() {
    return paymentInformation;
  }



  /**
   * The total amount to be captured in this completion, including taxes.
   * @return amount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAmount() {
    return amount;
  }



  /**
   * Whether this is the final completion for the transaction. After the last completion is successfully created, the transaction enters its final state, and no further completions can occur.
   * @return lastCompletion
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_COMPLETION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLastCompletion() {
    return lastCompletion;
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
   * The ID of the space view this object is linked to.
   * @return spaceViewId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPACE_VIEW_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSpaceViewId() {
    return spaceViewId;
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



  /**
   * The ID of the user the transaction completion was created by.
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



  public TransactionCompletion failureReason(@javax.annotation.Nullable FailureReason failureReason) {
    
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
   * The portion of the captured amount that corresponds to taxes.
   * @return taxAmount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTaxAmount() {
    return taxAmount;
  }



  /**
   * The date and time when the transaction completion failed.
   * @return failedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getFailedOn() {
    return failedOn;
  }



  /**
   * The reference ID provided by the payment processor, used to trace the completion through the external payment system.
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
    TransactionCompletion transactionCompletion = (TransactionCompletion) o;
    return Objects.equals(this.lineItemVersion, transactionCompletion.lineItemVersion) &&
        Objects.equals(this.statementDescriptor, transactionCompletion.statementDescriptor) &&
        Objects.equals(this.baseLineItems, transactionCompletion.baseLineItems) &&
        Objects.equals(this.processingOn, transactionCompletion.processingOn) &&
        Objects.equals(this.invoiceMerchantReference, transactionCompletion.invoiceMerchantReference) &&
        Objects.equals(this.language, transactionCompletion.language) &&
        Objects.equals(this.remainingLineItems, transactionCompletion.remainingLineItems) &&
        Objects.equals(this.createdOn, transactionCompletion.createdOn) &&
        Objects.equals(this.lineItems, transactionCompletion.lineItems) &&
        Objects.equals(this.mode, transactionCompletion.mode) &&
        Objects.equals(this.succeededOn, transactionCompletion.succeededOn) &&
        Objects.equals(this.id, transactionCompletion.id) &&
        Objects.equals(this.state, transactionCompletion.state) &&
        Objects.equals(this.linkedTransaction, transactionCompletion.linkedTransaction) &&
        Objects.equals(this.paymentInformation, transactionCompletion.paymentInformation) &&
        Objects.equals(this.amount, transactionCompletion.amount) &&
        Objects.equals(this.lastCompletion, transactionCompletion.lastCompletion) &&
        Objects.equals(this.plannedPurgeDate, transactionCompletion.plannedPurgeDate) &&
        Objects.equals(this.externalId, transactionCompletion.externalId) &&
        Objects.equals(this.timeZone, transactionCompletion.timeZone) &&
        Objects.equals(this.spaceViewId, transactionCompletion.spaceViewId) &&
        Objects.equals(this.version, transactionCompletion.version) &&
        Objects.equals(this.labels, transactionCompletion.labels) &&
        Objects.equals(this.linkedSpaceId, transactionCompletion.linkedSpaceId) &&
        Objects.equals(this.timeoutOn, transactionCompletion.timeoutOn) &&
        Objects.equals(this.createdBy, transactionCompletion.createdBy) &&
        Objects.equals(this.nextUpdateOn, transactionCompletion.nextUpdateOn) &&
        Objects.equals(this.failureReason, transactionCompletion.failureReason) &&
        Objects.equals(this.taxAmount, transactionCompletion.taxAmount) &&
        Objects.equals(this.failedOn, transactionCompletion.failedOn) &&
        Objects.equals(this.processorReference, transactionCompletion.processorReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineItemVersion, statementDescriptor, baseLineItems, processingOn, invoiceMerchantReference, language, remainingLineItems, createdOn, lineItems, mode, succeededOn, id, state, linkedTransaction, paymentInformation, amount, lastCompletion, plannedPurgeDate, externalId, timeZone, spaceViewId, version, labels, linkedSpaceId, timeoutOn, createdBy, nextUpdateOn, failureReason, taxAmount, failedOn, processorReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionCompletion {\n");
    sb.append("    lineItemVersion: ").append(toIndentedString(lineItemVersion)).append("\n");
    sb.append("    statementDescriptor: ").append(toIndentedString(statementDescriptor)).append("\n");
    sb.append("    baseLineItems: ").append(toIndentedString(baseLineItems)).append("\n");
    sb.append("    processingOn: ").append(toIndentedString(processingOn)).append("\n");
    sb.append("    invoiceMerchantReference: ").append(toIndentedString(invoiceMerchantReference)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    remainingLineItems: ").append(toIndentedString(remainingLineItems)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    succeededOn: ").append(toIndentedString(succeededOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    lastCompletion: ").append(toIndentedString(lastCompletion)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    timeoutOn: ").append(toIndentedString(timeoutOn)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    nextUpdateOn: ").append(toIndentedString(nextUpdateOn)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    failedOn: ").append(toIndentedString(failedOn)).append("\n");
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

    // add `lineItemVersion` to the URL query string
    if (getLineItemVersion() != null) {
      joiner.add(getLineItemVersion().toUrlQueryString(prefix + "lineItemVersion" + suffix));
    }

    // add `statementDescriptor` to the URL query string
    if (getStatementDescriptor() != null) {
      try {
        joiner.add(String.format("%sstatementDescriptor%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStatementDescriptor()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
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

    // add `invoiceMerchantReference` to the URL query string
    if (getInvoiceMerchantReference() != null) {
      try {
        joiner.add(String.format("%sinvoiceMerchantReference%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInvoiceMerchantReference()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

    // add `remainingLineItems` to the URL query string
    if (getRemainingLineItems() != null) {
      for (int i = 0; i < getRemainingLineItems().size(); i++) {
        if (getRemainingLineItems().get(i) != null) {
          joiner.add(getRemainingLineItems().get(i).toUrlQueryString(String.format("%sremainingLineItems%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
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

    // add `mode` to the URL query string
    if (getMode() != null) {
      try {
        joiner.add(String.format("%smode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
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

    // add `linkedTransaction` to the URL query string
    if (getLinkedTransaction() != null) {
      try {
        joiner.add(String.format("%slinkedTransaction%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedTransaction()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `paymentInformation` to the URL query string
    if (getPaymentInformation() != null) {
      try {
        joiner.add(String.format("%spaymentInformation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentInformation()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `lastCompletion` to the URL query string
    if (getLastCompletion() != null) {
      try {
        joiner.add(String.format("%slastCompletion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLastCompletion()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `spaceViewId` to the URL query string
    if (getSpaceViewId() != null) {
      try {
        joiner.add(String.format("%sspaceViewId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSpaceViewId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `failureReason` to the URL query string
    if (getFailureReason() != null) {
      joiner.add(getFailureReason().toUrlQueryString(prefix + "failureReason" + suffix));
    }

    // add `taxAmount` to the URL query string
    if (getTaxAmount() != null) {
      try {
        joiner.add(String.format("%staxAmount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTaxAmount()), "UTF-8").replaceAll("\\+", "%20")));
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

