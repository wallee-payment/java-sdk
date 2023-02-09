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
import com.wallee.sdk.model.Address;
import com.wallee.sdk.model.DebtCollectionCaseSource;
import com.wallee.sdk.model.DebtCollectionCaseState;
import com.wallee.sdk.model.DebtCollectionEnvironment;
import com.wallee.sdk.model.DebtCollectorConfiguration;
import com.wallee.sdk.model.FailureReason;
import com.wallee.sdk.model.Label;
import com.wallee.sdk.model.LineItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * The debt collection case represents a try to collect the money from the debtor.
 */
@ApiModel(description = "The debt collection case represents a try to collect the money from the debtor.")

public class DebtCollectionCase {
  
  @JsonProperty("amount")
  protected BigDecimal amount = null;

  
  @JsonProperty("billingAddress")
  protected Address billingAddress = null;

  
  @JsonProperty("closedOn")
  protected OffsetDateTime closedOn = null;

  
  @JsonProperty("collectorConfiguration")
  protected DebtCollectorConfiguration collectorConfiguration = null;

  
  @JsonProperty("contractDate")
  protected OffsetDateTime contractDate = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("creator")
  protected Long creator = null;

  
  @JsonProperty("currency")
  protected String currency = null;

  
  @JsonProperty("dueDate")
  protected OffsetDateTime dueDate = null;

  
  @JsonProperty("environment")
  protected DebtCollectionEnvironment environment = null;

  
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

  
  @JsonProperty("nextAttemptOn")
  protected OffsetDateTime nextAttemptOn = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("processingStartedOn")
  protected OffsetDateTime processingStartedOn = null;

  
  @JsonProperty("processingTimeoutOn")
  protected OffsetDateTime processingTimeoutOn = null;

  
  @JsonProperty("reference")
  protected String reference = null;

  
  @JsonProperty("reviewStartedOn")
  protected OffsetDateTime reviewStartedOn = null;

  
  @JsonProperty("reviewedOn")
  protected OffsetDateTime reviewedOn = null;

  
  @JsonProperty("reviewer")
  protected Long reviewer = null;

  
  @JsonProperty("source")
  protected DebtCollectionCaseSource source = null;

  
  @JsonProperty("sourceEntityId")
  protected Long sourceEntityId = null;

  
  @JsonProperty("spaceViewId")
  protected Long spaceViewId = null;

  
  @JsonProperty("state")
  protected DebtCollectionCaseState state = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The amount is the total amount of the not paid items. The amount cannot be change once the case is reviewed.
   * @return amount
  **/
  @ApiModelProperty(value = "The amount is the total amount of the not paid items. The amount cannot be change once the case is reviewed.")
  public BigDecimal getAmount() {
    return amount;
  }

  
   /**
   * The billing address of the case identifies the debtor.
   * @return billingAddress
  **/
  @ApiModelProperty(value = "The billing address of the case identifies the debtor.")
  public Address getBillingAddress() {
    return billingAddress;
  }

  
   /**
   * The closed on date indicates when the case is closed on.
   * @return closedOn
  **/
  @ApiModelProperty(value = "The closed on date indicates when the case is closed on.")
  public OffsetDateTime getClosedOn() {
    return closedOn;
  }

  
   /**
   * The collector configuration determines how the debt collection case is processed.
   * @return collectorConfiguration
  **/
  @ApiModelProperty(value = "The collector configuration determines how the debt collection case is processed.")
  public DebtCollectorConfiguration getCollectorConfiguration() {
    return collectorConfiguration;
  }

  
   /**
   * The contract date is the date on which the contract with the debtor was signed on.
   * @return contractDate
  **/
  @ApiModelProperty(value = "The contract date is the date on which the contract with the debtor was signed on.")
  public OffsetDateTime getContractDate() {
    return contractDate;
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
   * The creator references the user which has created the debt collection case.
   * @return creator
  **/
  @ApiModelProperty(value = "The creator references the user which has created the debt collection case.")
  public Long getCreator() {
    return creator;
  }

  
   /**
   * The currency defines the billing currency of the debt collection case.
   * @return currency
  **/
  @ApiModelProperty(value = "The currency defines the billing currency of the debt collection case.")
  public String getCurrency() {
    return currency;
  }

  
   /**
   * The due date indicates the date on which the amount receivable was due. This date has to be always in the past.
   * @return dueDate
  **/
  @ApiModelProperty(value = "The due date indicates the date on which the amount receivable was due. This date has to be always in the past.")
  public OffsetDateTime getDueDate() {
    return dueDate;
  }

  
   /**
   * The environment in which this case will be processed. There must be a debt collector configuration present which supports the chosen environment.
   * @return environment
  **/
  @ApiModelProperty(value = "The environment in which this case will be processed. There must be a debt collector configuration present which supports the chosen environment.")
  public DebtCollectionEnvironment getEnvironment() {
    return environment;
  }

  
   /**
   * A client generated nonce which identifies the entity to be created. Subsequent creation requests with the same external ID will not create new entities but return the initially created entity instead.
   * @return externalId
  **/
  @ApiModelProperty(value = "A client generated nonce which identifies the entity to be created. Subsequent creation requests with the same external ID will not create new entities but return the initially created entity instead.")
  public String getExternalId() {
    return externalId;
  }

  
   /**
   * The failed on date indicates when the case is failed on.
   * @return failedOn
  **/
  @ApiModelProperty(value = "The failed on date indicates when the case is failed on.")
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
   * 
   * @return labels
  **/
  @ApiModelProperty(value = "")
  public List<Label> getLabels() {
    return labels;
  }

  
   /**
   * The language indicates the language to be used in the communication with the debtor.
   * @return language
  **/
  @ApiModelProperty(value = "The language indicates the language to be used in the communication with the debtor.")
  public String getLanguage() {
    return language;
  }

  
   /**
   * The line items of the debt collection case will be shown on documents sent to the debtor and the total of them makes up total amount to collect.
   * @return lineItems
  **/
  @ApiModelProperty(value = "The line items of the debt collection case will be shown on documents sent to the debtor and the total of them makes up total amount to collect.")
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
   * 
   * @return nextAttemptOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getNextAttemptOn() {
    return nextAttemptOn;
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
   * The processing started on date indicates the date on which the processing of the case started on.
   * @return processingStartedOn
  **/
  @ApiModelProperty(value = "The processing started on date indicates the date on which the processing of the case started on.")
  public OffsetDateTime getProcessingStartedOn() {
    return processingStartedOn;
  }

  
   /**
   * 
   * @return processingTimeoutOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getProcessingTimeoutOn() {
    return processingTimeoutOn;
  }

  
   /**
   * The case reference is used in the communication with the debtor. It should be unique and it should be linkable with the source of the debt collection case.
   * @return reference
  **/
  @ApiModelProperty(value = "The case reference is used in the communication with the debtor. It should be unique and it should be linkable with the source of the debt collection case.")
  public String getReference() {
    return reference;
  }

  
   /**
   * 
   * @return reviewStartedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getReviewStartedOn() {
    return reviewStartedOn;
  }

  
   /**
   * The reviewed on date indicates when the review of the case was conducted on.
   * @return reviewedOn
  **/
  @ApiModelProperty(value = "The reviewed on date indicates when the review of the case was conducted on.")
  public OffsetDateTime getReviewedOn() {
    return reviewedOn;
  }

  
   /**
   * The reviewer references the user which has reviewed the case.
   * @return reviewer
  **/
  @ApiModelProperty(value = "The reviewer references the user which has reviewed the case.")
  public Long getReviewer() {
    return reviewer;
  }

  
   /**
   * The source of the debt collection case indicates the origin of the amount receivable.
   * @return source
  **/
  @ApiModelProperty(value = "The source of the debt collection case indicates the origin of the amount receivable.")
  public DebtCollectionCaseSource getSource() {
    return source;
  }

  
   /**
   * The source entity ID points to the object which is the origin of the debt collection case. This ID is only set when the case was triggered by an internal process.
   * @return sourceEntityId
  **/
  @ApiModelProperty(value = "The source entity ID points to the object which is the origin of the debt collection case. This ID is only set when the case was triggered by an internal process.")
  public Long getSourceEntityId() {
    return sourceEntityId;
  }

  
   /**
   * 
   * @return spaceViewId
  **/
  @ApiModelProperty(value = "")
  public Long getSpaceViewId() {
    return spaceViewId;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public DebtCollectionCaseState getState() {
    return state;
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
    DebtCollectionCase debtCollectionCase = (DebtCollectionCase) o;
    return Objects.equals(this.amount, debtCollectionCase.amount) &&
        Objects.equals(this.billingAddress, debtCollectionCase.billingAddress) &&
        Objects.equals(this.closedOn, debtCollectionCase.closedOn) &&
        Objects.equals(this.collectorConfiguration, debtCollectionCase.collectorConfiguration) &&
        Objects.equals(this.contractDate, debtCollectionCase.contractDate) &&
        Objects.equals(this.createdOn, debtCollectionCase.createdOn) &&
        Objects.equals(this.creator, debtCollectionCase.creator) &&
        Objects.equals(this.currency, debtCollectionCase.currency) &&
        Objects.equals(this.dueDate, debtCollectionCase.dueDate) &&
        Objects.equals(this.environment, debtCollectionCase.environment) &&
        Objects.equals(this.externalId, debtCollectionCase.externalId) &&
        Objects.equals(this.failedOn, debtCollectionCase.failedOn) &&
        Objects.equals(this.failureReason, debtCollectionCase.failureReason) &&
        Objects.equals(this.id, debtCollectionCase.id) &&
        Objects.equals(this.labels, debtCollectionCase.labels) &&
        Objects.equals(this.language, debtCollectionCase.language) &&
        Objects.equals(this.lineItems, debtCollectionCase.lineItems) &&
        Objects.equals(this.linkedSpaceId, debtCollectionCase.linkedSpaceId) &&
        Objects.equals(this.nextAttemptOn, debtCollectionCase.nextAttemptOn) &&
        Objects.equals(this.plannedPurgeDate, debtCollectionCase.plannedPurgeDate) &&
        Objects.equals(this.processingStartedOn, debtCollectionCase.processingStartedOn) &&
        Objects.equals(this.processingTimeoutOn, debtCollectionCase.processingTimeoutOn) &&
        Objects.equals(this.reference, debtCollectionCase.reference) &&
        Objects.equals(this.reviewStartedOn, debtCollectionCase.reviewStartedOn) &&
        Objects.equals(this.reviewedOn, debtCollectionCase.reviewedOn) &&
        Objects.equals(this.reviewer, debtCollectionCase.reviewer) &&
        Objects.equals(this.source, debtCollectionCase.source) &&
        Objects.equals(this.sourceEntityId, debtCollectionCase.sourceEntityId) &&
        Objects.equals(this.spaceViewId, debtCollectionCase.spaceViewId) &&
        Objects.equals(this.state, debtCollectionCase.state) &&
        Objects.equals(this.version, debtCollectionCase.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, billingAddress, closedOn, collectorConfiguration, contractDate, createdOn, creator, currency, dueDate, environment, externalId, failedOn, failureReason, id, labels, language, lineItems, linkedSpaceId, nextAttemptOn, plannedPurgeDate, processingStartedOn, processingTimeoutOn, reference, reviewStartedOn, reviewedOn, reviewer, source, sourceEntityId, spaceViewId, state, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebtCollectionCase {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    closedOn: ").append(toIndentedString(closedOn)).append("\n");
    sb.append("    collectorConfiguration: ").append(toIndentedString(collectorConfiguration)).append("\n");
    sb.append("    contractDate: ").append(toIndentedString(contractDate)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    failedOn: ").append(toIndentedString(failedOn)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    nextAttemptOn: ").append(toIndentedString(nextAttemptOn)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    processingStartedOn: ").append(toIndentedString(processingStartedOn)).append("\n");
    sb.append("    processingTimeoutOn: ").append(toIndentedString(processingTimeoutOn)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    reviewStartedOn: ").append(toIndentedString(reviewStartedOn)).append("\n");
    sb.append("    reviewedOn: ").append(toIndentedString(reviewedOn)).append("\n");
    sb.append("    reviewer: ").append(toIndentedString(reviewer)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceEntityId: ").append(toIndentedString(sourceEntityId)).append("\n");
    sb.append("    spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

