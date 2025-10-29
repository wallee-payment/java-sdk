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
import com.wallee.sdk.model.Address;
import com.wallee.sdk.model.DebtCollectionCaseSource;
import com.wallee.sdk.model.DebtCollectionCaseState;
import com.wallee.sdk.model.DebtCollectionEnvironment;
import com.wallee.sdk.model.DebtCollectorConfiguration;
import com.wallee.sdk.model.FailureReason;
import com.wallee.sdk.model.Label;
import com.wallee.sdk.model.LineItem;
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
 * The debt collection case represents a try to collect the money from the debtor.
 */
@JsonPropertyOrder({
  DebtCollectionCase.JSON_PROPERTY_CONTRACT_DATE,
  DebtCollectionCase.JSON_PROPERTY_DUE_DATE,
  DebtCollectionCase.JSON_PROPERTY_CLOSED_ON,
  DebtCollectionCase.JSON_PROPERTY_LANGUAGE,
  DebtCollectionCase.JSON_PROPERTY_SOURCE,
  DebtCollectionCase.JSON_PROPERTY_CREATED_ON,
  DebtCollectionCase.JSON_PROPERTY_LINE_ITEMS,
  DebtCollectionCase.JSON_PROPERTY_REFERENCE,
  DebtCollectionCase.JSON_PROPERTY_CURRENCY,
  DebtCollectionCase.JSON_PROPERTY_ID,
  DebtCollectionCase.JSON_PROPERTY_STATE,
  DebtCollectionCase.JSON_PROPERTY_PROCESSING_TIMEOUT_ON,
  DebtCollectionCase.JSON_PROPERTY_AMOUNT,
  DebtCollectionCase.JSON_PROPERTY_CREATOR,
  DebtCollectionCase.JSON_PROPERTY_PLANNED_PURGE_DATE,
  DebtCollectionCase.JSON_PROPERTY_EXTERNAL_ID,
  DebtCollectionCase.JSON_PROPERTY_COLLECTOR_CONFIGURATION,
  DebtCollectionCase.JSON_PROPERTY_REVIEWER,
  DebtCollectionCase.JSON_PROPERTY_SPACE_VIEW_ID,
  DebtCollectionCase.JSON_PROPERTY_REVIEW_STARTED_ON,
  DebtCollectionCase.JSON_PROPERTY_VERSION,
  DebtCollectionCase.JSON_PROPERTY_LABELS,
  DebtCollectionCase.JSON_PROPERTY_PROCESSING_STARTED_ON,
  DebtCollectionCase.JSON_PROPERTY_LINKED_SPACE_ID,
  DebtCollectionCase.JSON_PROPERTY_ENVIRONMENT,
  DebtCollectionCase.JSON_PROPERTY_REVIEWED_ON,
  DebtCollectionCase.JSON_PROPERTY_SOURCE_ENTITY_ID,
  DebtCollectionCase.JSON_PROPERTY_FAILURE_REASON,
  DebtCollectionCase.JSON_PROPERTY_BILLING_ADDRESS,
  DebtCollectionCase.JSON_PROPERTY_FAILED_ON,
  DebtCollectionCase.JSON_PROPERTY_NEXT_ATTEMPT_ON
})

public class DebtCollectionCase {
  public static final String JSON_PROPERTY_CONTRACT_DATE = "contractDate";
  private OffsetDateTime contractDate;

  public static final String JSON_PROPERTY_DUE_DATE = "dueDate";
  private OffsetDateTime dueDate;

  public static final String JSON_PROPERTY_CLOSED_ON = "closedOn";
  private OffsetDateTime closedOn;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private DebtCollectionCaseSource source;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_LINE_ITEMS = "lineItems";
  private List<LineItem> lineItems = new ArrayList<>();

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  private DebtCollectionCaseState state;

  public static final String JSON_PROPERTY_PROCESSING_TIMEOUT_ON = "processingTimeoutOn";
  private OffsetDateTime processingTimeoutOn;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private BigDecimal amount;

  public static final String JSON_PROPERTY_CREATOR = "creator";
  private Long creator;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_COLLECTOR_CONFIGURATION = "collectorConfiguration";
  private DebtCollectorConfiguration collectorConfiguration;

  public static final String JSON_PROPERTY_REVIEWER = "reviewer";
  private Long reviewer;

  public static final String JSON_PROPERTY_SPACE_VIEW_ID = "spaceViewId";
  private Long spaceViewId;

  public static final String JSON_PROPERTY_REVIEW_STARTED_ON = "reviewStartedOn";
  private OffsetDateTime reviewStartedOn;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private Set<Label> labels = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_PROCESSING_STARTED_ON = "processingStartedOn";
  private OffsetDateTime processingStartedOn;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_ENVIRONMENT = "environment";
  private DebtCollectionEnvironment environment;

  public static final String JSON_PROPERTY_REVIEWED_ON = "reviewedOn";
  private OffsetDateTime reviewedOn;

  public static final String JSON_PROPERTY_SOURCE_ENTITY_ID = "sourceEntityId";
  private Long sourceEntityId;

  public static final String JSON_PROPERTY_FAILURE_REASON = "failureReason";
  private FailureReason failureReason;

  public static final String JSON_PROPERTY_BILLING_ADDRESS = "billingAddress";
  private Address billingAddress;

  public static final String JSON_PROPERTY_FAILED_ON = "failedOn";
  private OffsetDateTime failedOn;

  public static final String JSON_PROPERTY_NEXT_ATTEMPT_ON = "nextAttemptOn";
  private OffsetDateTime nextAttemptOn;

  public DebtCollectionCase() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public DebtCollectionCase(
    @JsonProperty(JSON_PROPERTY_CONTRACT_DATE) OffsetDateTime contractDate, 
    @JsonProperty(JSON_PROPERTY_DUE_DATE) OffsetDateTime dueDate, 
    @JsonProperty(JSON_PROPERTY_CLOSED_ON) OffsetDateTime closedOn, 
    @JsonProperty(JSON_PROPERTY_LANGUAGE) String language, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_LINE_ITEMS) List<LineItem> lineItems, 
    @JsonProperty(JSON_PROPERTY_REFERENCE) String reference, 
    @JsonProperty(JSON_PROPERTY_CURRENCY) String currency, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_PROCESSING_TIMEOUT_ON) OffsetDateTime processingTimeoutOn, 
    @JsonProperty(JSON_PROPERTY_AMOUNT) BigDecimal amount, 
    @JsonProperty(JSON_PROPERTY_CREATOR) Long creator, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_EXTERNAL_ID) String externalId, 
    @JsonProperty(JSON_PROPERTY_REVIEWER) Long reviewer, 
    @JsonProperty(JSON_PROPERTY_SPACE_VIEW_ID) Long spaceViewId, 
    @JsonProperty(JSON_PROPERTY_REVIEW_STARTED_ON) OffsetDateTime reviewStartedOn, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_LABELS) Set<Label> labels, 
    @JsonProperty(JSON_PROPERTY_PROCESSING_STARTED_ON) OffsetDateTime processingStartedOn, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_REVIEWED_ON) OffsetDateTime reviewedOn, 
    @JsonProperty(JSON_PROPERTY_SOURCE_ENTITY_ID) Long sourceEntityId, 
    @JsonProperty(JSON_PROPERTY_FAILED_ON) OffsetDateTime failedOn, 
    @JsonProperty(JSON_PROPERTY_NEXT_ATTEMPT_ON) OffsetDateTime nextAttemptOn
  ) {
    this();
    this.contractDate = contractDate;
    this.dueDate = dueDate;
    this.closedOn = closedOn;
    this.language = language;
    this.createdOn = createdOn;
    this.lineItems = lineItems;
    this.reference = reference;
    this.currency = currency;
    this.id = id;
    this.processingTimeoutOn = processingTimeoutOn;
    this.amount = amount;
    this.creator = creator;
    this.plannedPurgeDate = plannedPurgeDate;
    this.externalId = externalId;
    this.reviewer = reviewer;
    this.spaceViewId = spaceViewId;
    this.reviewStartedOn = reviewStartedOn;
    this.version = version;
    this.labels = labels;
    this.processingStartedOn = processingStartedOn;
    this.linkedSpaceId = linkedSpaceId;
    this.reviewedOn = reviewedOn;
    this.sourceEntityId = sourceEntityId;
    this.failedOn = failedOn;
    this.nextAttemptOn = nextAttemptOn;
  }

   /**
   * The date and time when the contract with the debtor was signed.
   * @return contractDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTRACT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getContractDate() {
    return contractDate;
  }



   /**
   * The date and time when the claim was due.
   * @return dueDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDueDate() {
    return dueDate;
  }



   /**
   * The date and time when the case was closed.
   * @return closedOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOSED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getClosedOn() {
    return closedOn;
  }



   /**
   * The language that is linked to the object.
   * @return language
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }



  public DebtCollectionCase source(DebtCollectionCaseSource source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DebtCollectionCaseSource getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSource(DebtCollectionCaseSource source) {
    this.source = source;
  }

   /**
   * The date and time when the object was created.
   * @return createdOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }



   /**
   * The line items that are subject of this debt collection case.
   * @return lineItems
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LineItem> getLineItems() {
    return lineItems;
  }



   /**
   * A unique reference to identify the debt collection case in communication with the debtor.
   * @return reference
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }



   /**
   * The three-letter code (ISO 4217 format) of the case&#39;s currency.
   * @return currency
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }



   /**
   * A unique identifier for the object.
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }



  public DebtCollectionCase state(DebtCollectionCaseState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DebtCollectionCaseState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(DebtCollectionCaseState state) {
    this.state = state;
  }

   /**
   * The date and time when the processing of the case times out.
   * @return processingTimeoutOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROCESSING_TIMEOUT_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getProcessingTimeoutOn() {
    return processingTimeoutOn;
  }



   /**
   * The sum of all unpaid item prices in the case&#39;s currency. The amount can no longer be changed once the case has been reviewed.
   * @return amount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAmount() {
    return amount;
  }



   /**
   * The ID of the user the case was created by.
   * @return creator
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreator() {
    return creator;
  }



   /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }



   /**
   * A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.
   * @return externalId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalId() {
    return externalId;
  }



  public DebtCollectionCase collectorConfiguration(DebtCollectorConfiguration collectorConfiguration) {
    
    this.collectorConfiguration = collectorConfiguration;
    return this;
  }

   /**
   * Get collectorConfiguration
   * @return collectorConfiguration
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLLECTOR_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DebtCollectorConfiguration getCollectorConfiguration() {
    return collectorConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_COLLECTOR_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCollectorConfiguration(DebtCollectorConfiguration collectorConfiguration) {
    this.collectorConfiguration = collectorConfiguration;
  }

   /**
   * The ID of the user the case was reviewed by.
   * @return reviewer
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVIEWER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getReviewer() {
    return reviewer;
  }



   /**
   * The ID of the space view this object is linked to.
   * @return spaceViewId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPACE_VIEW_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSpaceViewId() {
    return spaceViewId;
  }



   /**
   * The date and time when the review of the case was started.
   * @return reviewStartedOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVIEW_STARTED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getReviewStartedOn() {
    return reviewStartedOn;
  }



   /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }



   /**
   * The labels providing additional information about the object.
   * @return labels
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Label> getLabels() {
    return labels;
  }



   /**
   * The date and time when the processing of the case was started.
   * @return processingStartedOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROCESSING_STARTED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getProcessingStartedOn() {
    return processingStartedOn;
  }



   /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }



  public DebtCollectionCase environment(DebtCollectionEnvironment environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DebtCollectionEnvironment getEnvironment() {
    return environment;
  }


  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnvironment(DebtCollectionEnvironment environment) {
    this.environment = environment;
  }

   /**
   * The date and time when the case was reviewed.
   * @return reviewedOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVIEWED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getReviewedOn() {
    return reviewedOn;
  }



   /**
   * The ID of the object that is the source of the case. Only defined if the case was created by an internal process.
   * @return sourceEntityId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSourceEntityId() {
    return sourceEntityId;
  }



  public DebtCollectionCase failureReason(FailureReason failureReason) {
    
    this.failureReason = failureReason;
    return this;
  }

   /**
   * Get failureReason
   * @return failureReason
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILURE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FailureReason getFailureReason() {
    return failureReason;
  }


  @JsonProperty(JSON_PROPERTY_FAILURE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailureReason(FailureReason failureReason) {
    this.failureReason = failureReason;
  }

  public DebtCollectionCase billingAddress(Address billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Address getBillingAddress() {
    return billingAddress;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
  }

   /**
   * The date and time when the case failed.
   * @return failedOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getFailedOn() {
    return failedOn;
  }



   /**
   * The date and time when the next attempt at processing the case will be made.
   * @return nextAttemptOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NEXT_ATTEMPT_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getNextAttemptOn() {
    return nextAttemptOn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebtCollectionCase debtCollectionCase = (DebtCollectionCase) o;
    return Objects.equals(this.contractDate, debtCollectionCase.contractDate) &&
        Objects.equals(this.dueDate, debtCollectionCase.dueDate) &&
        Objects.equals(this.closedOn, debtCollectionCase.closedOn) &&
        Objects.equals(this.language, debtCollectionCase.language) &&
        Objects.equals(this.source, debtCollectionCase.source) &&
        Objects.equals(this.createdOn, debtCollectionCase.createdOn) &&
        Objects.equals(this.lineItems, debtCollectionCase.lineItems) &&
        Objects.equals(this.reference, debtCollectionCase.reference) &&
        Objects.equals(this.currency, debtCollectionCase.currency) &&
        Objects.equals(this.id, debtCollectionCase.id) &&
        Objects.equals(this.state, debtCollectionCase.state) &&
        Objects.equals(this.processingTimeoutOn, debtCollectionCase.processingTimeoutOn) &&
        Objects.equals(this.amount, debtCollectionCase.amount) &&
        Objects.equals(this.creator, debtCollectionCase.creator) &&
        Objects.equals(this.plannedPurgeDate, debtCollectionCase.plannedPurgeDate) &&
        Objects.equals(this.externalId, debtCollectionCase.externalId) &&
        Objects.equals(this.collectorConfiguration, debtCollectionCase.collectorConfiguration) &&
        Objects.equals(this.reviewer, debtCollectionCase.reviewer) &&
        Objects.equals(this.spaceViewId, debtCollectionCase.spaceViewId) &&
        Objects.equals(this.reviewStartedOn, debtCollectionCase.reviewStartedOn) &&
        Objects.equals(this.version, debtCollectionCase.version) &&
        Objects.equals(this.labels, debtCollectionCase.labels) &&
        Objects.equals(this.processingStartedOn, debtCollectionCase.processingStartedOn) &&
        Objects.equals(this.linkedSpaceId, debtCollectionCase.linkedSpaceId) &&
        Objects.equals(this.environment, debtCollectionCase.environment) &&
        Objects.equals(this.reviewedOn, debtCollectionCase.reviewedOn) &&
        Objects.equals(this.sourceEntityId, debtCollectionCase.sourceEntityId) &&
        Objects.equals(this.failureReason, debtCollectionCase.failureReason) &&
        Objects.equals(this.billingAddress, debtCollectionCase.billingAddress) &&
        Objects.equals(this.failedOn, debtCollectionCase.failedOn) &&
        Objects.equals(this.nextAttemptOn, debtCollectionCase.nextAttemptOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractDate, dueDate, closedOn, language, source, createdOn, lineItems, reference, currency, id, state, processingTimeoutOn, amount, creator, plannedPurgeDate, externalId, collectorConfiguration, reviewer, spaceViewId, reviewStartedOn, version, labels, processingStartedOn, linkedSpaceId, environment, reviewedOn, sourceEntityId, failureReason, billingAddress, failedOn, nextAttemptOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebtCollectionCase {\n");
    sb.append("    contractDate: ").append(toIndentedString(contractDate)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    closedOn: ").append(toIndentedString(closedOn)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    processingTimeoutOn: ").append(toIndentedString(processingTimeoutOn)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    collectorConfiguration: ").append(toIndentedString(collectorConfiguration)).append("\n");
    sb.append("    reviewer: ").append(toIndentedString(reviewer)).append("\n");
    sb.append("    spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
    sb.append("    reviewStartedOn: ").append(toIndentedString(reviewStartedOn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    processingStartedOn: ").append(toIndentedString(processingStartedOn)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    reviewedOn: ").append(toIndentedString(reviewedOn)).append("\n");
    sb.append("    sourceEntityId: ").append(toIndentedString(sourceEntityId)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    failedOn: ").append(toIndentedString(failedOn)).append("\n");
    sb.append("    nextAttemptOn: ").append(toIndentedString(nextAttemptOn)).append("\n");
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

    // add `contractDate` to the URL query string
    if (getContractDate() != null) {
      try {
        joiner.add(String.format("%scontractDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContractDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `dueDate` to the URL query string
    if (getDueDate() != null) {
      try {
        joiner.add(String.format("%sdueDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDueDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `closedOn` to the URL query string
    if (getClosedOn() != null) {
      try {
        joiner.add(String.format("%sclosedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getClosedOn()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `source` to the URL query string
    if (getSource() != null) {
      joiner.add(getSource().toUrlQueryString(prefix + "source" + suffix));
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

    // add `reference` to the URL query string
    if (getReference() != null) {
      try {
        joiner.add(String.format("%sreference%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReference()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      try {
        joiner.add(String.format("%scurrency%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCurrency()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `processingTimeoutOn` to the URL query string
    if (getProcessingTimeoutOn() != null) {
      try {
        joiner.add(String.format("%sprocessingTimeoutOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProcessingTimeoutOn()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `creator` to the URL query string
    if (getCreator() != null) {
      try {
        joiner.add(String.format("%screator%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreator()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `collectorConfiguration` to the URL query string
    if (getCollectorConfiguration() != null) {
      joiner.add(getCollectorConfiguration().toUrlQueryString(prefix + "collectorConfiguration" + suffix));
    }

    // add `reviewer` to the URL query string
    if (getReviewer() != null) {
      try {
        joiner.add(String.format("%sreviewer%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReviewer()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `reviewStartedOn` to the URL query string
    if (getReviewStartedOn() != null) {
      try {
        joiner.add(String.format("%sreviewStartedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReviewStartedOn()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `processingStartedOn` to the URL query string
    if (getProcessingStartedOn() != null) {
      try {
        joiner.add(String.format("%sprocessingStartedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProcessingStartedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

    // add `environment` to the URL query string
    if (getEnvironment() != null) {
      try {
        joiner.add(String.format("%senvironment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnvironment()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `reviewedOn` to the URL query string
    if (getReviewedOn() != null) {
      try {
        joiner.add(String.format("%sreviewedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReviewedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sourceEntityId` to the URL query string
    if (getSourceEntityId() != null) {
      try {
        joiner.add(String.format("%ssourceEntityId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSourceEntityId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `failureReason` to the URL query string
    if (getFailureReason() != null) {
      joiner.add(getFailureReason().toUrlQueryString(prefix + "failureReason" + suffix));
    }

    // add `billingAddress` to the URL query string
    if (getBillingAddress() != null) {
      joiner.add(getBillingAddress().toUrlQueryString(prefix + "billingAddress" + suffix));
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

    // add `nextAttemptOn` to the URL query string
    if (getNextAttemptOn() != null) {
      try {
        joiner.add(String.format("%snextAttemptOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNextAttemptOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

