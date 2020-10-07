/**
*  SDK
*
* This library allows to interact with the  payment service.
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

import java.time.OffsetDateTime;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wallee.sdk.model.enums.SubscriptionState;

@ApiModel(description = "")

public class Subscription extends Indentable {
  
  @JsonProperty("activatedOn")
  protected OffsetDateTime activatedOn;

  
  @JsonProperty("affiliate")
  protected SubscriptionAffiliate affiliate;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn;

  
  @JsonProperty("description")
  protected String description;

  
  @JsonProperty("id")
  protected Long id;

  
  @JsonProperty("initializedOn")
  protected OffsetDateTime initializedOn;

  
  @JsonProperty("language")
  protected String language;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate;

  
  @JsonProperty("plannedTerminationDate")
  protected OffsetDateTime plannedTerminationDate;

  
  @JsonProperty("reference")
  protected String reference;

  
  @JsonProperty("state")
  protected SubscriptionState state;

  
  @JsonProperty("subscriber")
  protected Subscriber subscriber;

  
  @JsonProperty("terminatedBy")
  protected Long terminatedBy;

  
  @JsonProperty("terminatedOn")
  protected OffsetDateTime terminatedOn;

  
  @JsonProperty("terminatingOn")
  protected OffsetDateTime terminatingOn;

  
  @JsonProperty("terminationScheduledOn")
  protected OffsetDateTime terminationScheduledOn;

  
  @JsonProperty("token")
  protected Token token;

  
  @JsonProperty("version")
  protected Integer version;

  
  
   /**
   * 
   * @return activatedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getActivatedOn() {
    return activatedOn;
  }

  
   /**
   * 
   * @return affiliate
  **/
  @ApiModelProperty(value = "")
  public SubscriptionAffiliate getAffiliate() {
    return affiliate;
  }

  
   /**
   * 
   * @return createdOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * 
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  
   /**
   * The ID is the primary key of the entity. The ID identifies the entity uniquely.
   * @return id
  **/
  @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
  public Long getId() {
    return id;
  }

  
   /**
   * 
   * @return initializedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getInitializedOn() {
    return initializedOn;
  }

  
   /**
   * 
   * @return language
  **/
  @ApiModelProperty(value = "")
  public String getLanguage() {
    return language;
  }

  
   /**
   * The linked space id holds the ID of the space to which the entity belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * 
   * @return plannedTerminationDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getPlannedTerminationDate() {
    return plannedTerminationDate;
  }

  
   /**
   * 
   * @return reference
  **/
  @ApiModelProperty(value = "")
  public String getReference() {
    return reference;
  }

  
   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public SubscriptionState getState() {
    return state;
  }

  
   /**
   * 
   * @return subscriber
  **/
  @ApiModelProperty(value = "")
  public Subscriber getSubscriber() {
    return subscriber;
  }

  
   /**
   * 
   * @return terminatedBy
  **/
  @ApiModelProperty(value = "")
  public Long getTerminatedBy() {
    return terminatedBy;
  }

  
   /**
   * 
   * @return terminatedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTerminatedOn() {
    return terminatedOn;
  }

  
   /**
   * 
   * @return terminatingOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTerminatingOn() {
    return terminatingOn;
  }

  
   /**
   * 
   * @return terminationScheduledOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTerminationScheduledOn() {
    return terminationScheduledOn;
  }

  
   /**
   * 
   * @return token
  **/
  @ApiModelProperty(value = "")
  public Token getToken() {
    return token;
  }

  
   /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
  **/
  @ApiModelProperty(value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
  public Integer getVersion() {
    return version;
  }

  

  @Override
  public boolean equals(Object o) {
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
        Objects.equals(this.description, subscription.description) &&
        Objects.equals(this.id, subscription.id) &&
        Objects.equals(this.initializedOn, subscription.initializedOn) &&
        Objects.equals(this.language, subscription.language) &&
        Objects.equals(this.linkedSpaceId, subscription.linkedSpaceId) &&
        Objects.equals(this.plannedPurgeDate, subscription.plannedPurgeDate) &&
        Objects.equals(this.plannedTerminationDate, subscription.plannedTerminationDate) &&
        Objects.equals(this.reference, subscription.reference) && this.state == subscription.state &&
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
    return Objects.hash(activatedOn, affiliate, createdOn, description, id, initializedOn, language, linkedSpaceId, plannedPurgeDate, plannedTerminationDate, reference, state, subscriber, terminatedBy, terminatedOn, terminatingOn, terminationScheduledOn, token, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    
    sb.append("    activatedOn: ").append(toIndentedString(activatedOn)).append("\n");
    sb.append("    affiliate: ").append(toIndentedString(affiliate)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
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



}

