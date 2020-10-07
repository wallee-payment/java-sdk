/**
 * SDK
 * <p>
 * This library allows to interact with the  payment service.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.wallee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wallee.sdk.model.enums.SubscriptionState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

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
     * @return activatedOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getActivatedOn() {
        return activatedOn;
    }


    /**
     * @return affiliate
     **/
    @ApiModelProperty(value = "")
    public SubscriptionAffiliate getAffiliate() {
        return affiliate;
    }


    /**
     * @return createdOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getCreatedOn() {
        return createdOn;
    }


    /**
     * @return description
     **/
    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }


    /**
     * The ID is the primary key of the entity. The ID identifies the entity uniquely.
     *
     * @return id
     **/
    @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
    public Long getId() {
        return id;
    }


    /**
     * @return initializedOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getInitializedOn() {
        return initializedOn;
    }


    /**
     * @return language
     **/
    @ApiModelProperty(value = "")
    public String getLanguage() {
        return language;
    }


    /**
     * The linked space id holds the ID of the space to which the entity belongs to.
     *
     * @return linkedSpaceId
     **/
    @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
    public Long getLinkedSpaceId() {
        return linkedSpaceId;
    }


    /**
     * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
     *
     * @return plannedPurgeDate
     **/
    @ApiModelProperty(value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
    public OffsetDateTime getPlannedPurgeDate() {
        return plannedPurgeDate;
    }


    /**
     * @return plannedTerminationDate
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getPlannedTerminationDate() {
        return plannedTerminationDate;
    }


    /**
     * @return reference
     **/
    @ApiModelProperty(value = "")
    public String getReference() {
        return reference;
    }


    /**
     * @return state
     **/
    @ApiModelProperty(value = "")
    public SubscriptionState getState() {
        return state;
    }


    /**
     * @return subscriber
     **/
    @ApiModelProperty(value = "")
    public Subscriber getSubscriber() {
        return subscriber;
    }


    /**
     * @return terminatedBy
     **/
    @ApiModelProperty(value = "")
    public Long getTerminatedBy() {
        return terminatedBy;
    }


    /**
     * @return terminatedOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getTerminatedOn() {
        return terminatedOn;
    }


    /**
     * @return terminatingOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getTerminatingOn() {
        return terminatingOn;
    }


    /**
     * @return terminationScheduledOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getTerminationScheduledOn() {
        return terminationScheduledOn;
    }


    /**
     * @return token
     **/
    @ApiModelProperty(value = "")
    public Token getToken() {
        return token;
    }


    /**
     * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
     *
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

        return "class Subscription { \n" +
            "    activatedOn: " + toIndentedString(activatedOn) +  "\n" +
            "    affiliate: " + toIndentedString(affiliate) + " \n" +
            "    createdOn: " + toIndentedString(createdOn) + "\n" +
            "    description: " + toIndentedString(description) + " \n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    initializedOn: " + toIndentedString(initializedOn) + " \n" +
            "    language: " + toIndentedString(language) + " \n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) +  "\n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) + " \n" +
            "    plannedTerminationDate: " + toIndentedString(plannedTerminationDate) + " \n" +
            "    reference: " + toIndentedString(reference) +  "\n" +
            "    state: " + toIndentedString(state) + " \n" +
            "    subscriber: " + toIndentedString(subscriber) +  "\n" +
            "    terminatedBy: " + toIndentedString(terminatedBy) + " \n" +
            "    terminatedOn: " +  toIndentedString(terminatedOn) + " \n" +
            "    terminatingOn: " + toIndentedString(terminatingOn) +  "\n" +
            "    terminationScheduledOn: " + toIndentedString(terminationScheduledOn) + " \n" +
            "    token: " + toIndentedString(token) + " \n" +
            "    version: " + toIndentedString(version) + " \n" +
            "}";
        }


}

