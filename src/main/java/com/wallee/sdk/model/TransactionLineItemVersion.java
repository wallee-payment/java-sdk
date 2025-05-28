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
import com.wallee.sdk.model.Transaction;
import com.wallee.sdk.model.TransactionLineItemVersionState;
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

public class TransactionLineItemVersion {
  
  @JsonProperty("amount")
  protected BigDecimal amount = null;

  
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

  
  @JsonProperty("labels")
  protected List<Label> labels = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("lineItems")
  protected List<LineItem> lineItems = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("linkedTransaction")
  protected Long linkedTransaction = null;

  
  @JsonProperty("nextUpdateOn")
  protected OffsetDateTime nextUpdateOn = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("processingOn")
  protected OffsetDateTime processingOn = null;

  
  @JsonProperty("spaceViewId")
  protected Long spaceViewId = null;

  
  @JsonProperty("state")
  protected TransactionLineItemVersionState state = null;

  
  @JsonProperty("succeededOn")
  protected OffsetDateTime succeededOn = null;

  
  @JsonProperty("taxAmount")
  protected BigDecimal taxAmount = null;

  
  @JsonProperty("timeoutOn")
  protected OffsetDateTime timeoutOn = null;

  
  @JsonProperty("transaction")
  protected Transaction transaction = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The total amount of the updated line items, including taxes.
   * @return amount
  **/
  @ApiModelProperty(value = "The total amount of the updated line items, including taxes.")
  public BigDecimal getAmount() {
    return amount;
  }

  
   /**
   * The ID of the user the line item version was created by.
   * @return createdBy
  **/
  @ApiModelProperty(value = "The ID of the user the line item version was created by.")
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
   * The date and time when the processing of the line item version failed.
   * @return failedOn
  **/
  @ApiModelProperty(value = "The date and time when the processing of the line item version failed.")
  public OffsetDateTime getFailedOn() {
    return failedOn;
  }

  
   /**
   * 
   * @return failureReason
  **/
  @ApiModelProperty(value = "")
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
   * The line items that replace the original line items in the transaction.
   * @return lineItems
  **/
  @ApiModelProperty(value = "The line items that replace the original line items in the transaction.")
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
   * The date and time when the next update of the line item version&#39;s state is planned.
   * @return nextUpdateOn
  **/
  @ApiModelProperty(value = "The date and time when the next update of the line item version's state is planned.")
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
   * The date and time when the processing of the line item version was started.
   * @return processingOn
  **/
  @ApiModelProperty(value = "The date and time when the processing of the line item version was started.")
  public OffsetDateTime getProcessingOn() {
    return processingOn;
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
  public TransactionLineItemVersionState getState() {
    return state;
  }

  
   /**
   * The date and time when the line item version was processed successfully.
   * @return succeededOn
  **/
  @ApiModelProperty(value = "The date and time when the line item version was processed successfully.")
  public OffsetDateTime getSucceededOn() {
    return succeededOn;
  }

  
   /**
   * The portion of the total amount that corresponds to taxes.
   * @return taxAmount
  **/
  @ApiModelProperty(value = "The portion of the total amount that corresponds to taxes.")
  public BigDecimal getTaxAmount() {
    return taxAmount;
  }

  
   /**
   * The date and time by when the line item version is expected to be processed.
   * @return timeoutOn
  **/
  @ApiModelProperty(value = "The date and time by when the line item version is expected to be processed.")
  public OffsetDateTime getTimeoutOn() {
    return timeoutOn;
  }

  
   /**
   * The transaction that the line item version belongs to.
   * @return transaction
  **/
  @ApiModelProperty(value = "The transaction that the line item version belongs to.")
  public Transaction getTransaction() {
    return transaction;
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
    TransactionLineItemVersion transactionLineItemVersion = (TransactionLineItemVersion) o;
    return Objects.equals(this.amount, transactionLineItemVersion.amount) &&
        Objects.equals(this.createdBy, transactionLineItemVersion.createdBy) &&
        Objects.equals(this.createdOn, transactionLineItemVersion.createdOn) &&
        Objects.equals(this.externalId, transactionLineItemVersion.externalId) &&
        Objects.equals(this.failedOn, transactionLineItemVersion.failedOn) &&
        Objects.equals(this.failureReason, transactionLineItemVersion.failureReason) &&
        Objects.equals(this.id, transactionLineItemVersion.id) &&
        Objects.equals(this.labels, transactionLineItemVersion.labels) &&
        Objects.equals(this.language, transactionLineItemVersion.language) &&
        Objects.equals(this.lineItems, transactionLineItemVersion.lineItems) &&
        Objects.equals(this.linkedSpaceId, transactionLineItemVersion.linkedSpaceId) &&
        Objects.equals(this.linkedTransaction, transactionLineItemVersion.linkedTransaction) &&
        Objects.equals(this.nextUpdateOn, transactionLineItemVersion.nextUpdateOn) &&
        Objects.equals(this.plannedPurgeDate, transactionLineItemVersion.plannedPurgeDate) &&
        Objects.equals(this.processingOn, transactionLineItemVersion.processingOn) &&
        Objects.equals(this.spaceViewId, transactionLineItemVersion.spaceViewId) &&
        Objects.equals(this.state, transactionLineItemVersion.state) &&
        Objects.equals(this.succeededOn, transactionLineItemVersion.succeededOn) &&
        Objects.equals(this.taxAmount, transactionLineItemVersion.taxAmount) &&
        Objects.equals(this.timeoutOn, transactionLineItemVersion.timeoutOn) &&
        Objects.equals(this.transaction, transactionLineItemVersion.transaction) &&
        Objects.equals(this.version, transactionLineItemVersion.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, createdBy, createdOn, externalId, failedOn, failureReason, id, labels, language, lineItems, linkedSpaceId, linkedTransaction, nextUpdateOn, plannedPurgeDate, processingOn, spaceViewId, state, succeededOn, taxAmount, timeoutOn, transaction, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionLineItemVersion {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    failedOn: ").append(toIndentedString(failedOn)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    nextUpdateOn: ").append(toIndentedString(nextUpdateOn)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    processingOn: ").append(toIndentedString(processingOn)).append("\n");
    sb.append("    spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    succeededOn: ").append(toIndentedString(succeededOn)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    timeoutOn: ").append(toIndentedString(timeoutOn)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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

