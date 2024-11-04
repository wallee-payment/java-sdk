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
import com.wallee.sdk.model.Subscriber;
import com.wallee.sdk.model.SubscriptionAffiliate;
import com.wallee.sdk.model.SubscriptionProductVersion;
import com.wallee.sdk.model.SubscriptionState;
import com.wallee.sdk.model.Token;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class Subscription {
  
  @JsonProperty("activatedOn")
  protected OffsetDateTime activatedOn = null;

  
  @JsonProperty("affiliate")
  protected SubscriptionAffiliate affiliate = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("currentProductVersion")
  protected SubscriptionProductVersion currentProductVersion = null;

  
  @JsonProperty("description")
  protected String description = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("initializedOn")
  protected OffsetDateTime initializedOn = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("plannedTerminationDate")
  protected OffsetDateTime plannedTerminationDate = null;

  
  @JsonProperty("reference")
  protected String reference = null;

  
  @JsonProperty("state")
  protected SubscriptionState state = null;

  
  @JsonProperty("subscriber")
  protected Subscriber subscriber = null;

  
  @JsonProperty("terminatedBy")
  protected Long terminatedBy = null;

  
  @JsonProperty("terminatedOn")
  protected OffsetDateTime terminatedOn = null;

  
  @JsonProperty("terminatingOn")
  protected OffsetDateTime terminatingOn = null;

  
  @JsonProperty("terminationScheduledOn")
  protected OffsetDateTime terminationScheduledOn = null;

  
  @JsonProperty("token")
  protected Token token = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The date and time when the subscription was activate.
   * @return activatedOn
  **/
  @ApiModelProperty(value = "The date and time when the subscription was activate.")
  public OffsetDateTime getActivatedOn() {
    return activatedOn;
  }

  
   /**
   * The affiliate that led to the creation of the subscription.
   * @return affiliate
  **/
  @ApiModelProperty(value = "The affiliate that led to the creation of the subscription.")
  public SubscriptionAffiliate getAffiliate() {
    return affiliate;
  }

  
   /**
   * The date and time when the subscription was created.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The date and time when the subscription was created.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * The version of the product that the subscription is currently linked to.
   * @return currentProductVersion
  **/
  @ApiModelProperty(value = "The version of the product that the subscription is currently linked to.")
  public SubscriptionProductVersion getCurrentProductVersion() {
    return currentProductVersion;
  }

  
   /**
   * A description used to identify the subscription.
   * @return description
  **/
  @ApiModelProperty(value = "A description used to identify the subscription.")
  public String getDescription() {
    return description;
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
   * The date and time when the subscription was initialized.
   * @return initializedOn
  **/
  @ApiModelProperty(value = "The date and time when the subscription was initialized.")
  public OffsetDateTime getInitializedOn() {
    return initializedOn;
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
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * The date and time when the subscription is planned to be terminated.
   * @return plannedTerminationDate
  **/
  @ApiModelProperty(value = "The date and time when the subscription is planned to be terminated.")
  public OffsetDateTime getPlannedTerminationDate() {
    return plannedTerminationDate;
  }

  
   /**
   * The merchant&#39;s reference used to identify the subscription.
   * @return reference
  **/
  @ApiModelProperty(value = "The merchant's reference used to identify the subscription.")
  public String getReference() {
    return reference;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public SubscriptionState getState() {
    return state;
  }

  
   /**
   * The subscriber that the subscription belongs to.
   * @return subscriber
  **/
  @ApiModelProperty(value = "The subscriber that the subscription belongs to.")
  public Subscriber getSubscriber() {
    return subscriber;
  }

  
   /**
   * The ID of the user the subscription was terminated by.
   * @return terminatedBy
  **/
  @ApiModelProperty(value = "The ID of the user the subscription was terminated by.")
  public Long getTerminatedBy() {
    return terminatedBy;
  }

  
   /**
   * The date and time when the subscription was terminated.
   * @return terminatedOn
  **/
  @ApiModelProperty(value = "The date and time when the subscription was terminated.")
  public OffsetDateTime getTerminatedOn() {
    return terminatedOn;
  }

  
   /**
   * The date and time when the termination of the subscription started.
   * @return terminatingOn
  **/
  @ApiModelProperty(value = "The date and time when the termination of the subscription started.")
  public OffsetDateTime getTerminatingOn() {
    return terminatingOn;
  }

  
   /**
   * The date and time when the subscription was scheduled to be terminated.
   * @return terminationScheduledOn
  **/
  @ApiModelProperty(value = "The date and time when the subscription was scheduled to be terminated.")
  public OffsetDateTime getTerminationScheduledOn() {
    return terminationScheduledOn;
  }

  
   /**
   * The payment token that is used to charge the customer.
   * @return token
  **/
  @ApiModelProperty(value = "The payment token that is used to charge the customer.")
  public Token getToken() {
    return token;
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
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.activatedOn, subscription.activatedOn) &&
        Objects.equals(this.affiliate, subscription.affiliate) &&
        Objects.equals(this.createdOn, subscription.createdOn) &&
        Objects.equals(this.currentProductVersion, subscription.currentProductVersion) &&
        Objects.equals(this.description, subscription.description) &&
        Objects.equals(this.id, subscription.id) &&
        Objects.equals(this.initializedOn, subscription.initializedOn) &&
        Objects.equals(this.language, subscription.language) &&
        Objects.equals(this.linkedSpaceId, subscription.linkedSpaceId) &&
        Objects.equals(this.plannedPurgeDate, subscription.plannedPurgeDate) &&
        Objects.equals(this.plannedTerminationDate, subscription.plannedTerminationDate) &&
        Objects.equals(this.reference, subscription.reference) &&
        Objects.equals(this.state, subscription.state) &&
        Objects.equals(this.subscriber, subscription.subscriber) &&
        Objects.equals(this.terminatedBy, subscription.terminatedBy) &&
        Objects.equals(this.terminatedOn, subscription.terminatedOn) &&
        Objects.equals(this.terminatingOn, subscription.terminatingOn) &&
        Objects.equals(this.terminationScheduledOn, subscription.terminationScheduledOn) &&
        Objects.equals(this.token, subscription.token) &&
        Objects.equals(this.version, subscription.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activatedOn, affiliate, createdOn, currentProductVersion, description, id, initializedOn, language, linkedSpaceId, plannedPurgeDate, plannedTerminationDate, reference, state, subscriber, terminatedBy, terminatedOn, terminatingOn, terminationScheduledOn, token, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    
    sb.append("    activatedOn: ").append(toIndentedString(activatedOn)).append("\n");
    sb.append("    affiliate: ").append(toIndentedString(affiliate)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    currentProductVersion: ").append(toIndentedString(currentProductVersion)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    initializedOn: ").append(toIndentedString(initializedOn)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    plannedTerminationDate: ").append(toIndentedString(plannedTerminationDate)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    subscriber: ").append(toIndentedString(subscriber)).append("\n");
    sb.append("    terminatedBy: ").append(toIndentedString(terminatedBy)).append("\n");
    sb.append("    terminatedOn: ").append(toIndentedString(terminatedOn)).append("\n");
    sb.append("    terminatingOn: ").append(toIndentedString(terminatingOn)).append("\n");
    sb.append("    terminationScheduledOn: ").append(toIndentedString(terminationScheduledOn)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

