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
import com.wallee.sdk.model.Environment;
import com.wallee.sdk.model.FailureReason;
import com.wallee.sdk.model.Label;
import com.wallee.sdk.model.LineItem;
import com.wallee.sdk.model.LineItemReduction;
import com.wallee.sdk.model.RefundState;
import com.wallee.sdk.model.RefundType;
import com.wallee.sdk.model.Tax;
import com.wallee.sdk.model.Transaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * A refund is a credit issued to the customer, which can be initiated either by the merchant or by the customer as a reversal.
 */
@ApiModel(description = "A refund is a credit issued to the customer, which can be initiated either by the merchant or by the customer as a reversal.")

public class Refund {
  
  @JsonProperty("amount")
  protected BigDecimal amount = null;

  
  @JsonProperty("baseLineItems")
  protected List<LineItem> baseLineItems = null;

  
  @JsonProperty("completion")
  protected Long completion = null;

  
  @JsonProperty("createdBy")
  protected Long createdBy = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("environment")
  protected Environment environment = null;

  
  @JsonProperty("externalId")
  protected String externalId = null;

  
  @JsonProperty("failedOn")
  protected OffsetDateTime failedOn = null;

  
  @JsonProperty("failureReason")
  protected FailureReason failureReason = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("labels")
  protected List<Label> labels = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("lineItems")
  protected List<LineItem> lineItems = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("merchantReference")
  protected String merchantReference = null;

  
  @JsonProperty("nextUpdateOn")
  protected OffsetDateTime nextUpdateOn = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("processingOn")
  protected OffsetDateTime processingOn = null;

  
  @JsonProperty("processorReference")
  protected String processorReference = null;

  
  @JsonProperty("reducedLineItems")
  protected List<LineItem> reducedLineItems = null;

  
  @JsonProperty("reductions")
  protected List<LineItemReduction> reductions = null;

  
  @JsonProperty("state")
  protected RefundState state = null;

  
  @JsonProperty("succeededOn")
  protected OffsetDateTime succeededOn = null;

  
  @JsonProperty("taxes")
  protected List<Tax> taxes = null;

  
  @JsonProperty("timeZone")
  protected String timeZone = null;

  
  @JsonProperty("timeoutOn")
  protected OffsetDateTime timeoutOn = null;

  
  @JsonProperty("totalAppliedFees")
  protected BigDecimal totalAppliedFees = null;

  
  @JsonProperty("totalSettledAmount")
  protected BigDecimal totalSettledAmount = null;

  
  @JsonProperty("transaction")
  protected Transaction transaction = null;

  
  @JsonProperty("type")
  protected RefundType type = null;

  
  @JsonProperty("updatedInvoice")
  protected Long updatedInvoice = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The total monetary amount of the refund, representing the exact credit issued to the customer.
   * @return amount
  **/
  @ApiModelProperty(value = "The total monetary amount of the refund, representing the exact credit issued to the customer.")
  public BigDecimal getAmount() {
    return amount;
  }

  
   /**
   * The original base line items from the transaction prior to the refund, serving as a reference for the refunded amounts.
   * @return baseLineItems
  **/
  @ApiModelProperty(value = "The original base line items from the transaction prior to the refund, serving as a reference for the refunded amounts.")
  public List<LineItem> getBaseLineItems() {
    return baseLineItems;
  }

  
   /**
   * The transaction completion that the refund belongs to.
   * @return completion
  **/
  @ApiModelProperty(value = "The transaction completion that the refund belongs to.")
  public Long getCompletion() {
    return completion;
  }

  
   /**
   * The ID of the user the refund was created by.
   * @return createdBy
  **/
  @ApiModelProperty(value = "The ID of the user the refund was created by.")
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
   * The environment used when rendering resources.
   * @return environment
  **/
  @ApiModelProperty(value = "The environment used when rendering resources.")
  public Environment getEnvironment() {
    return environment;
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
   * The date and time when the refund failed.
   * @return failedOn
  **/
  @ApiModelProperty(value = "The date and time when the refund failed.")
  public OffsetDateTime getFailedOn() {
    return failedOn;
  }

  
   /**
   * The reason for the failure of the refund.
   * @return failureReason
  **/
  @ApiModelProperty(value = "The reason for the failure of the refund.")
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
   * The line items included in the refund, representing the reductions.
   * @return lineItems
  **/
  @ApiModelProperty(value = "The line items included in the refund, representing the reductions.")
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
   * The merchant&#39;s reference used to identify the refund.
   * @return merchantReference
  **/
  @ApiModelProperty(value = "The merchant's reference used to identify the refund.")
  public String getMerchantReference() {
    return merchantReference;
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
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * The date and time when the processing of the refund was started.
   * @return processingOn
  **/
  @ApiModelProperty(value = "The date and time when the processing of the refund was started.")
  public OffsetDateTime getProcessingOn() {
    return processingOn;
  }

  
   /**
   * The reference ID provided by the payment processor, used to trace the refund through the external payment system.
   * @return processorReference
  **/
  @ApiModelProperty(value = "The reference ID provided by the payment processor, used to trace the refund through the external payment system.")
  public String getProcessorReference() {
    return processorReference;
  }

  
   /**
   * The line items from the original transaction, adjusted to reflect any reductions applied during the refund process.
   * @return reducedLineItems
  **/
  @ApiModelProperty(value = "The line items from the original transaction, adjusted to reflect any reductions applied during the refund process.")
  public List<LineItem> getReducedLineItems() {
    return reducedLineItems;
  }

  
   /**
   * The reductions applied on the original transaction items, detailing specific adjustments associated with the refund.
   * @return reductions
  **/
  @ApiModelProperty(value = "The reductions applied on the original transaction items, detailing specific adjustments associated with the refund.")
  public List<LineItemReduction> getReductions() {
    return reductions;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public RefundState getState() {
    return state;
  }

  
   /**
   * The date and time when the refund succeeded.
   * @return succeededOn
  **/
  @ApiModelProperty(value = "The date and time when the refund succeeded.")
  public OffsetDateTime getSucceededOn() {
    return succeededOn;
  }

  
   /**
   * The tax breakdown applied to the refund amount, helping with tax calculations or reporting.
   * @return taxes
  **/
  @ApiModelProperty(value = "The tax breakdown applied to the refund amount, helping with tax calculations or reporting.")
  public List<Tax> getTaxes() {
    return taxes;
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
   * The sum of fees applied to the refund transaction, such as processing or service charges.
   * @return totalAppliedFees
  **/
  @ApiModelProperty(value = "The sum of fees applied to the refund transaction, such as processing or service charges.")
  public BigDecimal getTotalAppliedFees() {
    return totalAppliedFees;
  }

  
   /**
   * The total amount settled for the refund, factoring in reductions, taxes, and any additional applied fees.
   * @return totalSettledAmount
  **/
  @ApiModelProperty(value = "The total amount settled for the refund, factoring in reductions, taxes, and any additional applied fees.")
  public BigDecimal getTotalSettledAmount() {
    return totalSettledAmount;
  }

  
   /**
   * The transaction that the refund belongs to.
   * @return transaction
  **/
  @ApiModelProperty(value = "The transaction that the refund belongs to.")
  public Transaction getTransaction() {
    return transaction;
  }

  
   /**
   * The type specifying the method and origin of the refund (e.g., initiated by the customer or merchant).
   * @return type
  **/
  @ApiModelProperty(value = "The type specifying the method and origin of the refund (e.g., initiated by the customer or merchant).")
  public RefundType getType() {
    return type;
  }

  
   /**
   * An updated invoice reflecting adjustments made by the refund.
   * @return updatedInvoice
  **/
  @ApiModelProperty(value = "An updated invoice reflecting adjustments made by the refund.")
  public Long getUpdatedInvoice() {
    return updatedInvoice;
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
    Refund refund = (Refund) o;
    return Objects.equals(this.amount, refund.amount) &&
        Objects.equals(this.baseLineItems, refund.baseLineItems) &&
        Objects.equals(this.completion, refund.completion) &&
        Objects.equals(this.createdBy, refund.createdBy) &&
        Objects.equals(this.createdOn, refund.createdOn) &&
        Objects.equals(this.environment, refund.environment) &&
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
        Objects.equals(this.reductions, refund.reductions) &&
        Objects.equals(this.state, refund.state) &&
        Objects.equals(this.succeededOn, refund.succeededOn) &&
        Objects.equals(this.taxes, refund.taxes) &&
        Objects.equals(this.timeZone, refund.timeZone) &&
        Objects.equals(this.timeoutOn, refund.timeoutOn) &&
        Objects.equals(this.totalAppliedFees, refund.totalAppliedFees) &&
        Objects.equals(this.totalSettledAmount, refund.totalSettledAmount) &&
        Objects.equals(this.transaction, refund.transaction) &&
        Objects.equals(this.type, refund.type) &&
        Objects.equals(this.updatedInvoice, refund.updatedInvoice) &&
        Objects.equals(this.version, refund.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, baseLineItems, completion, createdBy, createdOn, environment, externalId, failedOn, failureReason, id, labels, language, lineItems, linkedSpaceId, merchantReference, nextUpdateOn, plannedPurgeDate, processingOn, processorReference, reducedLineItems, reductions, state, succeededOn, taxes, timeZone, timeoutOn, totalAppliedFees, totalSettledAmount, transaction, type, updatedInvoice, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Refund {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    baseLineItems: ").append(toIndentedString(baseLineItems)).append("\n");
    sb.append("    completion: ").append(toIndentedString(completion)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    failedOn: ").append(toIndentedString(failedOn)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
    sb.append("    nextUpdateOn: ").append(toIndentedString(nextUpdateOn)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    processingOn: ").append(toIndentedString(processingOn)).append("\n");
    sb.append("    processorReference: ").append(toIndentedString(processorReference)).append("\n");
    sb.append("    reducedLineItems: ").append(toIndentedString(reducedLineItems)).append("\n");
    sb.append("    reductions: ").append(toIndentedString(reductions)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    succeededOn: ").append(toIndentedString(succeededOn)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    timeoutOn: ").append(toIndentedString(timeoutOn)).append("\n");
    sb.append("    totalAppliedFees: ").append(toIndentedString(totalAppliedFees)).append("\n");
    sb.append("    totalSettledAmount: ").append(toIndentedString(totalSettledAmount)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedInvoice: ").append(toIndentedString(updatedInvoice)).append("\n");
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

