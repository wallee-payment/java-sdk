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
import com.wallee.sdk.model.Transaction;
import com.wallee.sdk.model.TransactionVoidMode;
import com.wallee.sdk.model.TransactionVoidState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class TransactionVoid {
  
  @JsonProperty("createdBy")
  protected Long createdBy = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
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

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("linkedTransaction")
  protected Long linkedTransaction = null;

  
  @JsonProperty("mode")
  protected TransactionVoidMode mode = null;

  
  @JsonProperty("nextUpdateOn")
  protected OffsetDateTime nextUpdateOn = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("processorReference")
  protected String processorReference = null;

  
  @JsonProperty("spaceViewId")
  protected Long spaceViewId = null;

  
  @JsonProperty("state")
  protected TransactionVoidState state = null;

  
  @JsonProperty("succeededOn")
  protected OffsetDateTime succeededOn = null;

  
  @JsonProperty("timeoutOn")
  protected OffsetDateTime timeoutOn = null;

  
  @JsonProperty("transaction")
  protected Transaction transaction = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The ID of the user the transaction void was created by.
   * @return createdBy
  **/
  @ApiModelProperty(value = "The ID of the user the transaction void was created by.")
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
   * The date and time when the transaction void failed.
   * @return failedOn
  **/
  @ApiModelProperty(value = "The date and time when the transaction void failed.")
  public OffsetDateTime getFailedOn() {
    return failedOn;
  }

  
   /**
   * The reason for the failure of the transaction void.
   * @return failureReason
  **/
  @ApiModelProperty(value = "The reason for the failure of the transaction void.")
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
   * The mode of transaction void, such as online or offline, determining how the void process is executed.
   * @return mode
  **/
  @ApiModelProperty(value = "The mode of transaction void, such as online or offline, determining how the void process is executed.")
  public TransactionVoidMode getMode() {
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
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * The reference ID provided by the payment processor, used to trace the void through the external payment system.
   * @return processorReference
  **/
  @ApiModelProperty(value = "The reference ID provided by the payment processor, used to trace the void through the external payment system.")
  public String getProcessorReference() {
    return processorReference;
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
  public TransactionVoidState getState() {
    return state;
  }

  
   /**
   * The date and time when the transaction void succeeded.
   * @return succeededOn
  **/
  @ApiModelProperty(value = "The date and time when the transaction void succeeded.")
  public OffsetDateTime getSucceededOn() {
    return succeededOn;
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
   * The transaction that the void belongs to.
   * @return transaction
  **/
  @ApiModelProperty(value = "The transaction that the void belongs to.")
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
    TransactionVoid transactionVoid = (TransactionVoid) o;
    return Objects.equals(this.createdBy, transactionVoid.createdBy) &&
        Objects.equals(this.createdOn, transactionVoid.createdOn) &&
        Objects.equals(this.failedOn, transactionVoid.failedOn) &&
        Objects.equals(this.failureReason, transactionVoid.failureReason) &&
        Objects.equals(this.id, transactionVoid.id) &&
        Objects.equals(this.labels, transactionVoid.labels) &&
        Objects.equals(this.language, transactionVoid.language) &&
        Objects.equals(this.linkedSpaceId, transactionVoid.linkedSpaceId) &&
        Objects.equals(this.linkedTransaction, transactionVoid.linkedTransaction) &&
        Objects.equals(this.mode, transactionVoid.mode) &&
        Objects.equals(this.nextUpdateOn, transactionVoid.nextUpdateOn) &&
        Objects.equals(this.plannedPurgeDate, transactionVoid.plannedPurgeDate) &&
        Objects.equals(this.processorReference, transactionVoid.processorReference) &&
        Objects.equals(this.spaceViewId, transactionVoid.spaceViewId) &&
        Objects.equals(this.state, transactionVoid.state) &&
        Objects.equals(this.succeededOn, transactionVoid.succeededOn) &&
        Objects.equals(this.timeoutOn, transactionVoid.timeoutOn) &&
        Objects.equals(this.transaction, transactionVoid.transaction) &&
        Objects.equals(this.version, transactionVoid.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdOn, failedOn, failureReason, id, labels, language, linkedSpaceId, linkedTransaction, mode, nextUpdateOn, plannedPurgeDate, processorReference, spaceViewId, state, succeededOn, timeoutOn, transaction, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionVoid {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    failedOn: ").append(toIndentedString(failedOn)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    nextUpdateOn: ").append(toIndentedString(nextUpdateOn)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    processorReference: ").append(toIndentedString(processorReference)).append("\n");
    sb.append("    spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    succeededOn: ").append(toIndentedString(succeededOn)).append("\n");
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

