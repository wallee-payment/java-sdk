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
import com.wallee.sdk.model.Subscription;
import com.wallee.sdk.model.SubscriptionChargeProcessingType;
import com.wallee.sdk.model.SubscriptionChargeState;
import com.wallee.sdk.model.SubscriptionChargeType;
import com.wallee.sdk.model.SubscriptionLedgerEntry;
import com.wallee.sdk.model.Transaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * The subscription charge represents a single charge carried out for a particular subscription.
 */
@ApiModel(description = "The subscription charge represents a single charge carried out for a particular subscription.")

public class SubscriptionCharge {
  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("discardedBy")
  protected Long discardedBy = null;

  
  @JsonProperty("discardedOn")
  protected OffsetDateTime discardedOn = null;

  
  @JsonProperty("externalId")
  protected String externalId = null;

  
  @JsonProperty("failedOn")
  protected OffsetDateTime failedOn = null;

  
  @JsonProperty("failedUrl")
  protected String failedUrl = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("ledgerEntries")
  protected List<SubscriptionLedgerEntry> ledgerEntries = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("plannedExecutionDate")
  protected OffsetDateTime plannedExecutionDate = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("processingType")
  protected SubscriptionChargeProcessingType processingType = null;

  
  @JsonProperty("reference")
  protected String reference = null;

  
  @JsonProperty("state")
  protected SubscriptionChargeState state = null;

  
  @JsonProperty("subscription")
  protected Subscription subscription = null;

  
  @JsonProperty("succeedOn")
  protected OffsetDateTime succeedOn = null;

  
  @JsonProperty("successUrl")
  protected String successUrl = null;

  
  @JsonProperty("transaction")
  protected Transaction transaction = null;

  
  @JsonProperty("type")
  protected SubscriptionChargeType type = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The date and time when the charge was created.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The date and time when the charge was created.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * The ID of the user the charge was discarded by.
   * @return discardedBy
  **/
  @ApiModelProperty(value = "The ID of the user the charge was discarded by.")
  public Long getDiscardedBy() {
    return discardedBy;
  }

  
   /**
   * The date and time when the charge was discarded.
   * @return discardedOn
  **/
  @ApiModelProperty(value = "The date and time when the charge was discarded.")
  public OffsetDateTime getDiscardedOn() {
    return discardedOn;
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
   * The date and time when the charge failed.
   * @return failedOn
  **/
  @ApiModelProperty(value = "The date and time when the charge failed.")
  public OffsetDateTime getFailedOn() {
    return failedOn;
  }

  
   /**
   * The URL to redirect the customer back to after they canceled or failed to authenticated their payment.
   * @return failedUrl
  **/
  @ApiModelProperty(value = "The URL to redirect the customer back to after they canceled or failed to authenticated their payment.")
  public String getFailedUrl() {
    return failedUrl;
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
   * The language that is linked to the object.
   * @return language
  **/
  @ApiModelProperty(value = "The language that is linked to the object.")
  public String getLanguage() {
    return language;
  }

  
   /**
   * The ledger entries that belong to the charge.
   * @return ledgerEntries
  **/
  @ApiModelProperty(value = "The ledger entries that belong to the charge.")
  public List<SubscriptionLedgerEntry> getLedgerEntries() {
    return ledgerEntries;
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
   * The date and time when the execution of the charge is planned.
   * @return plannedExecutionDate
  **/
  @ApiModelProperty(value = "The date and time when the execution of the charge is planned.")
  public OffsetDateTime getPlannedExecutionDate() {
    return plannedExecutionDate;
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
   * The processing type specifies how the charge is to be processed.
   * @return processingType
  **/
  @ApiModelProperty(value = "The processing type specifies how the charge is to be processed.")
  public SubscriptionChargeProcessingType getProcessingType() {
    return processingType;
  }

  
   /**
   * The merchant&#39;s reference used to identify the charge.
   * @return reference
  **/
  @ApiModelProperty(value = "The merchant's reference used to identify the charge.")
  public String getReference() {
    return reference;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public SubscriptionChargeState getState() {
    return state;
  }

  
   /**
   * The subscription that the charge belongs to.
   * @return subscription
  **/
  @ApiModelProperty(value = "The subscription that the charge belongs to.")
  public Subscription getSubscription() {
    return subscription;
  }

  
   /**
   * The date and time when the charge succeeded.
   * @return succeedOn
  **/
  @ApiModelProperty(value = "The date and time when the charge succeeded.")
  public OffsetDateTime getSucceedOn() {
    return succeedOn;
  }

  
   /**
   * The URL to redirect the customer back to after they successfully authenticated their payment.
   * @return successUrl
  **/
  @ApiModelProperty(value = "The URL to redirect the customer back to after they successfully authenticated their payment.")
  public String getSuccessUrl() {
    return successUrl;
  }

  
   /**
   * The transaction used to process the charge.
   * @return transaction
  **/
  @ApiModelProperty(value = "The transaction used to process the charge.")
  public Transaction getTransaction() {
    return transaction;
  }

  
   /**
   * The type specified how the charge was initiated.
   * @return type
  **/
  @ApiModelProperty(value = "The type specified how the charge was initiated.")
  public SubscriptionChargeType getType() {
    return type;
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
    SubscriptionCharge subscriptionCharge = (SubscriptionCharge) o;
    return Objects.equals(this.createdOn, subscriptionCharge.createdOn) &&
        Objects.equals(this.discardedBy, subscriptionCharge.discardedBy) &&
        Objects.equals(this.discardedOn, subscriptionCharge.discardedOn) &&
        Objects.equals(this.externalId, subscriptionCharge.externalId) &&
        Objects.equals(this.failedOn, subscriptionCharge.failedOn) &&
        Objects.equals(this.failedUrl, subscriptionCharge.failedUrl) &&
        Objects.equals(this.id, subscriptionCharge.id) &&
        Objects.equals(this.language, subscriptionCharge.language) &&
        Objects.equals(this.ledgerEntries, subscriptionCharge.ledgerEntries) &&
        Objects.equals(this.linkedSpaceId, subscriptionCharge.linkedSpaceId) &&
        Objects.equals(this.plannedExecutionDate, subscriptionCharge.plannedExecutionDate) &&
        Objects.equals(this.plannedPurgeDate, subscriptionCharge.plannedPurgeDate) &&
        Objects.equals(this.processingType, subscriptionCharge.processingType) &&
        Objects.equals(this.reference, subscriptionCharge.reference) &&
        Objects.equals(this.state, subscriptionCharge.state) &&
        Objects.equals(this.subscription, subscriptionCharge.subscription) &&
        Objects.equals(this.succeedOn, subscriptionCharge.succeedOn) &&
        Objects.equals(this.successUrl, subscriptionCharge.successUrl) &&
        Objects.equals(this.transaction, subscriptionCharge.transaction) &&
        Objects.equals(this.type, subscriptionCharge.type) &&
        Objects.equals(this.version, subscriptionCharge.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdOn, discardedBy, discardedOn, externalId, failedOn, failedUrl, id, language, ledgerEntries, linkedSpaceId, plannedExecutionDate, plannedPurgeDate, processingType, reference, state, subscription, succeedOn, successUrl, transaction, type, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionCharge {\n");
    
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    discardedBy: ").append(toIndentedString(discardedBy)).append("\n");
    sb.append("    discardedOn: ").append(toIndentedString(discardedOn)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    failedOn: ").append(toIndentedString(failedOn)).append("\n");
    sb.append("    failedUrl: ").append(toIndentedString(failedUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    ledgerEntries: ").append(toIndentedString(ledgerEntries)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    plannedExecutionDate: ").append(toIndentedString(plannedExecutionDate)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    processingType: ").append(toIndentedString(processingType)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    succeedOn: ").append(toIndentedString(succeedOn)).append("\n");
    sb.append("    successUrl: ").append(toIndentedString(successUrl)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

