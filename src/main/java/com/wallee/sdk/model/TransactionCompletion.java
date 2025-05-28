/**
* wallee SDK
*
* This library allows to interact with the wallee payment service.
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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wallee.sdk.model.FailureReason;
import com.wallee.sdk.model.Label;
import com.wallee.sdk.model.LineItem;
import com.wallee.sdk.model.TransactionCompletionMode;
import com.wallee.sdk.model.TransactionCompletionState;
import com.wallee.sdk.model.TransactionLineItemVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class TransactionCompletion {
  
  @JsonProperty("amount")
  protected BigDecimal amount = null;

  
  @JsonProperty("baseLineItems")
  protected List<LineItem> baseLineItems = null;

  
  @JsonProperty("createdBy")
  protected Long createdBy = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("externalId")
  protected String externalId = null;

  
  @JsonProperty("failedOn")
  protected OffsetDateTime failedOn = null;

  
  @JsonProperty("failureReason")
  protected FailureReason failureReason = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("invoiceMerchantReference")
  protected String invoiceMerchantReference = null;

  
  @JsonProperty("labels")
  protected List<Label> labels = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("lastCompletion")
  protected Boolean lastCompletion = null;

  
  @JsonProperty("lineItemVersion")
  protected TransactionLineItemVersion lineItemVersion = null;

  
  @JsonProperty("lineItems")
  protected List<LineItem> lineItems = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("linkedTransaction")
  protected Long linkedTransaction = null;

  
  @JsonProperty("mode")
  protected TransactionCompletionMode mode = null;

  
  @JsonProperty("nextUpdateOn")
  protected OffsetDateTime nextUpdateOn = null;

  
  @JsonProperty("paymentInformation")
  protected String paymentInformation = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("processingOn")
  protected OffsetDateTime processingOn = null;

  
  @JsonProperty("processorReference")
  protected String processorReference = null;

  
  @JsonProperty("remainingLineItems")
  protected List<LineItem> remainingLineItems = null;

  
  @JsonProperty("spaceViewId")
  protected Long spaceViewId = null;

  
  @JsonProperty("state")
  protected TransactionCompletionState state = null;

  
  @JsonProperty("statementDescriptor")
  protected String statementDescriptor = null;

  
  @JsonProperty("succeededOn")
  protected OffsetDateTime succeededOn = null;

  
  @JsonProperty("taxAmount")
  protected BigDecimal taxAmount = null;

  
  @JsonProperty("timeZone")
  protected String timeZone = null;

  
  @JsonProperty("timeoutOn")
  protected OffsetDateTime timeoutOn = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The total amount to be captured in this completion, including taxes.
   * @return amount
  **/
  @ApiModelProperty(value = "The total amount to be captured in this completion, including taxes.")
  public BigDecimal getAmount() {
    return amount;
  }

  
   /**
   * The original line items from the transaction that serve as the baseline for this completion.
   * @return baseLineItems
  **/
  @ApiModelProperty(value = "The original line items from the transaction that serve as the baseline for this completion.")
  public List<LineItem> getBaseLineItems() {
    return baseLineItems;
  }

  
   /**
   * The ID of the user the transaction completion was created by.
   * @return createdBy
  **/
  @ApiModelProperty(value = "The ID of the user the transaction completion was created by.")
  public Long getCreatedBy() {
    return createdBy;
  }

  
   /**
   * The date and time when the object was created.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The date and time when the object was created.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.
   * @return externalId
  **/
  @ApiModelProperty(value = "A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.")
  public String getExternalId() {
    return externalId;
  }

  
   /**
   * The date and time when the transaction completion failed.
   * @return failedOn
  **/
  @ApiModelProperty(value = "The date and time when the transaction completion failed.")
  public OffsetDateTime getFailedOn() {
    return failedOn;
  }

  
   /**
   * The reason for the failure of the transaction completion.
   * @return failureReason
  **/
  @ApiModelProperty(value = "The reason for the failure of the transaction completion.")
  public FailureReason getFailureReason() {
    return failureReason;
  }

  
   /**
   * A unique identifier for the object.
   * @return id
  **/
  @ApiModelProperty(value = "A unique identifier for the object.")
  public Long getId() {
    return id;
  }

  
   /**
   * The merchant&#39;s reference used to identify the invoice.
   * @return invoiceMerchantReference
  **/
  @ApiModelProperty(value = "The merchant's reference used to identify the invoice.")
  public String getInvoiceMerchantReference() {
    return invoiceMerchantReference;
  }

  
   /**
   * The labels providing additional information about the object.
   * @return labels
  **/
  @ApiModelProperty(value = "The labels providing additional information about the object.")
  public List<Label> getLabels() {
    return labels;
  }

  
   /**
   * The language that is linked to the object.
   * @return language
  **/
  @ApiModelProperty(value = "The language that is linked to the object.")
  public String getLanguage() {
    return language;
  }

  
   /**
   * Whether this is the final completion for the transaction. After the last completion is successfully created, the transaction enters its final state, and no further completions can occur.
   * @return lastCompletion
  **/
  @ApiModelProperty(value = "Whether this is the final completion for the transaction. After the last completion is successfully created, the transaction enters its final state, and no further completions can occur.")
  public Boolean isLastCompletion() {
    return lastCompletion;
  }

  
   /**
   * The specific version of the line items that are being used for this completion.
   * @return lineItemVersion
  **/
  @ApiModelProperty(value = "The specific version of the line items that are being used for this completion.")
  public TransactionLineItemVersion getLineItemVersion() {
    return lineItemVersion;
  }

  
   /**
   * The line items captured in this transaction completion.
   * @return lineItems
  **/
  @ApiModelProperty(value = "The line items captured in this transaction completion.")
  public List<LineItem> getLineItems() {
    return lineItems;
  }

  
   /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The ID of the space this object belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The payment transaction this object is linked to.
   * @return linkedTransaction
  **/
  @ApiModelProperty(value = "The payment transaction this object is linked to.")
  public Long getLinkedTransaction() {
    return linkedTransaction;
  }

  
   /**
   * The mode of transaction completion, such as online or offline, determining how the completion process is executed.
   * @return mode
  **/
  @ApiModelProperty(value = "The mode of transaction completion, such as online or offline, determining how the completion process is executed.")
  public TransactionCompletionMode getMode() {
    return mode;
  }

  
   /**
   * The date and time when the next update of the object&#39;s state is planned.
   * @return nextUpdateOn
  **/
  @ApiModelProperty(value = "The date and time when the next update of the object's state is planned.")
  public OffsetDateTime getNextUpdateOn() {
    return nextUpdateOn;
  }

  
   /**
   * Payment-specific details related to this transaction completion such as payment instructions or references needed for processing.
   * @return paymentInformation
  **/
  @ApiModelProperty(value = "Payment-specific details related to this transaction completion such as payment instructions or references needed for processing.")
  public String getPaymentInformation() {
    return paymentInformation;
  }

  
   /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * The date and time when the processing of the transaction completion was started.
   * @return processingOn
  **/
  @ApiModelProperty(value = "The date and time when the processing of the transaction completion was started.")
  public OffsetDateTime getProcessingOn() {
    return processingOn;
  }

  
   /**
   * The reference ID provided by the payment processor, used to trace the completion through the external payment system.
   * @return processorReference
  **/
  @ApiModelProperty(value = "The reference ID provided by the payment processor, used to trace the completion through the external payment system.")
  public String getProcessorReference() {
    return processorReference;
  }

  
   /**
   * The line items yet to be captured in the transaction.
   * @return remainingLineItems
  **/
  @ApiModelProperty(value = "The line items yet to be captured in the transaction.")
  public List<LineItem> getRemainingLineItems() {
    return remainingLineItems;
  }

  
   /**
   * The ID of the space view this object is linked to.
   * @return spaceViewId
  **/
  @ApiModelProperty(value = "The ID of the space view this object is linked to.")
  public Long getSpaceViewId() {
    return spaceViewId;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public TransactionCompletionState getState() {
    return state;
  }

  
   /**
   * The statement descriptor that appears on a customer&#39;s bank statement, providing an explanation for charges or payments, helping customers identify the transaction.
   * @return statementDescriptor
  **/
  @ApiModelProperty(value = "The statement descriptor that appears on a customer's bank statement, providing an explanation for charges or payments, helping customers identify the transaction.")
  public String getStatementDescriptor() {
    return statementDescriptor;
  }

  
   /**
   * The date and time when the transaction completion succeeded.
   * @return succeededOn
  **/
  @ApiModelProperty(value = "The date and time when the transaction completion succeeded.")
  public OffsetDateTime getSucceededOn() {
    return succeededOn;
  }

  
   /**
   * The portion of the captured amount that corresponds to taxes.
   * @return taxAmount
  **/
  @ApiModelProperty(value = "The portion of the captured amount that corresponds to taxes.")
  public BigDecimal getTaxAmount() {
    return taxAmount;
  }

  
   /**
   * The time zone that this object is associated with.
   * @return timeZone
  **/
  @ApiModelProperty(value = "The time zone that this object is associated with.")
  public String getTimeZone() {
    return timeZone;
  }

  
   /**
   * The date and time when the object will expire.
   * @return timeoutOn
  **/
  @ApiModelProperty(value = "The date and time when the object will expire.")
  public OffsetDateTime getTimeoutOn() {
    return timeoutOn;
  }

  
   /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @ApiModelProperty(value = "The version is used for optimistic locking and incremented whenever the object is updated.")
  public Integer getVersion() {
    return version;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionCompletion transactionCompletion = (TransactionCompletion) o;
    return Objects.equals(this.amount, transactionCompletion.amount) &&
        Objects.equals(this.baseLineItems, transactionCompletion.baseLineItems) &&
        Objects.equals(this.createdBy, transactionCompletion.createdBy) &&
        Objects.equals(this.createdOn, transactionCompletion.createdOn) &&
        Objects.equals(this.externalId, transactionCompletion.externalId) &&
        Objects.equals(this.failedOn, transactionCompletion.failedOn) &&
        Objects.equals(this.failureReason, transactionCompletion.failureReason) &&
        Objects.equals(this.id, transactionCompletion.id) &&
        Objects.equals(this.invoiceMerchantReference, transactionCompletion.invoiceMerchantReference) &&
        Objects.equals(this.labels, transactionCompletion.labels) &&
        Objects.equals(this.language, transactionCompletion.language) &&
        Objects.equals(this.lastCompletion, transactionCompletion.lastCompletion) &&
        Objects.equals(this.lineItemVersion, transactionCompletion.lineItemVersion) &&
        Objects.equals(this.lineItems, transactionCompletion.lineItems) &&
        Objects.equals(this.linkedSpaceId, transactionCompletion.linkedSpaceId) &&
        Objects.equals(this.linkedTransaction, transactionCompletion.linkedTransaction) &&
        Objects.equals(this.mode, transactionCompletion.mode) &&
        Objects.equals(this.nextUpdateOn, transactionCompletion.nextUpdateOn) &&
        Objects.equals(this.paymentInformation, transactionCompletion.paymentInformation) &&
        Objects.equals(this.plannedPurgeDate, transactionCompletion.plannedPurgeDate) &&
        Objects.equals(this.processingOn, transactionCompletion.processingOn) &&
        Objects.equals(this.processorReference, transactionCompletion.processorReference) &&
        Objects.equals(this.remainingLineItems, transactionCompletion.remainingLineItems) &&
        Objects.equals(this.spaceViewId, transactionCompletion.spaceViewId) &&
        Objects.equals(this.state, transactionCompletion.state) &&
        Objects.equals(this.statementDescriptor, transactionCompletion.statementDescriptor) &&
        Objects.equals(this.succeededOn, transactionCompletion.succeededOn) &&
        Objects.equals(this.taxAmount, transactionCompletion.taxAmount) &&
        Objects.equals(this.timeZone, transactionCompletion.timeZone) &&
        Objects.equals(this.timeoutOn, transactionCompletion.timeoutOn) &&
        Objects.equals(this.version, transactionCompletion.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, baseLineItems, createdBy, createdOn, externalId, failedOn, failureReason, id, invoiceMerchantReference, labels, language, lastCompletion, lineItemVersion, lineItems, linkedSpaceId, linkedTransaction, mode, nextUpdateOn, paymentInformation, plannedPurgeDate, processingOn, processorReference, remainingLineItems, spaceViewId, state, statementDescriptor, succeededOn, taxAmount, timeZone, timeoutOn, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionCompletion {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    baseLineItems: ").append(toIndentedString(baseLineItems)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    failedOn: ").append(toIndentedString(failedOn)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoiceMerchantReference: ").append(toIndentedString(invoiceMerchantReference)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lastCompletion: ").append(toIndentedString(lastCompletion)).append("\n");
    sb.append("    lineItemVersion: ").append(toIndentedString(lineItemVersion)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    nextUpdateOn: ").append(toIndentedString(nextUpdateOn)).append("\n");
    sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    processingOn: ").append(toIndentedString(processingOn)).append("\n");
    sb.append("    processorReference: ").append(toIndentedString(processorReference)).append("\n");
    sb.append("    remainingLineItems: ").append(toIndentedString(remainingLineItems)).append("\n");
    sb.append("    spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    statementDescriptor: ").append(toIndentedString(statementDescriptor)).append("\n");
    sb.append("    succeededOn: ").append(toIndentedString(succeededOn)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    timeoutOn: ").append(toIndentedString(timeoutOn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

