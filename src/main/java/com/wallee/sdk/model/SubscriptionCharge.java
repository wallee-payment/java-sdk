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

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wallee.sdk.model.enums.SubscriptionChargeProcessingType;
import com.wallee.sdk.model.enums.SubscriptionChargeState;
import com.wallee.sdk.model.enums.SubscriptionChargeType;

/**
 * The subscription charge represents a single charge carried out for a particular subscription.
 */
@ApiModel(description = "The subscription charge represents a single charge carried out for a particular subscription.")

public class SubscriptionCharge extends Indentable {

    @JsonProperty("createdOn")
    protected OffsetDateTime createdOn;


    @JsonProperty("discardedBy")
    protected Long discardedBy;


    @JsonProperty("discardedOn")
    protected OffsetDateTime discardedOn;


    @JsonProperty("externalId")
    protected String externalId;


    @JsonProperty("failedOn")
    protected OffsetDateTime failedOn;


    @JsonProperty("failedUrl")
    protected String failedUrl;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("language")
    protected String language;


    @JsonProperty("ledgerEntries")
    protected List<SubscriptionLedgerEntry> ledgerEntries;


    @JsonProperty("linkedSpaceId")
    protected Long linkedSpaceId;


    @JsonProperty("plannedExecutionDate")
    protected OffsetDateTime plannedExecutionDate;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("processingType")
    protected SubscriptionChargeProcessingType processingType;


    @JsonProperty("reference")
    protected String reference;


    @JsonProperty("state")
    protected SubscriptionChargeState state;


    @JsonProperty("subscription")
    protected Subscription subscription;


    @JsonProperty("succeedOn")
    protected OffsetDateTime succeedOn;


    @JsonProperty("successUrl")
    protected String successUrl;


    @JsonProperty("transaction")
    protected Transaction transaction;


    @JsonProperty("type")
    protected SubscriptionChargeType type;


    @JsonProperty("version")
    protected Integer version;


    /**
     * @return createdOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getCreatedOn() {
        return createdOn;
    }


    /**
     * @return discardedBy
     **/
    @ApiModelProperty(value = "")
    public Long getDiscardedBy() {
        return discardedBy;
    }


    /**
     * @return discardedOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getDiscardedOn() {
        return discardedOn;
    }


    /**
     * The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
     *
     * @return externalId
     **/
    @ApiModelProperty(value = "The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.")
    public String getExternalId() {
        return externalId;
    }


    /**
     * @return failedOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getFailedOn() {
        return failedOn;
    }


    /**
     * The user will be redirected to failed URL when the transaction could not be authorized or completed. In case no failed URL is specified a default failed page will be displayed.
     *
     * @return failedUrl
     **/
    @ApiModelProperty(value = "The user will be redirected to failed URL when the transaction could not be authorized or completed. In case no failed URL is specified a default failed page will be displayed.")
    public String getFailedUrl() {
        return failedUrl;
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
     * @return language
     **/
    @ApiModelProperty(value = "")
    public String getLanguage() {
        return language;
    }


    /**
     * @return ledgerEntries
     **/
    @ApiModelProperty(value = "")
    public List<SubscriptionLedgerEntry> getLedgerEntries() {
        return ledgerEntries;
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
     * @return plannedExecutionDate
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getPlannedExecutionDate() {
        return plannedExecutionDate;
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
     * @return processingType
     **/
    @ApiModelProperty(value = "")
    public SubscriptionChargeProcessingType getProcessingType() {
        return processingType;
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
    public SubscriptionChargeState getState() {
        return state;
    }


    /**
     * The field subscription indicates the subscription to which the charge belongs to.
     *
     * @return subscription
     **/
    @ApiModelProperty(value = "The field subscription indicates the subscription to which the charge belongs to.")
    public Subscription getSubscription() {
        return subscription;
    }


    /**
     * @return succeedOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getSucceedOn() {
        return succeedOn;
    }


    /**
     * The user will be redirected to success URL when the transaction could be authorized or completed. In case no success URL is specified a default success page will be displayed.
     *
     * @return successUrl
     **/
    @ApiModelProperty(value = "The user will be redirected to success URL when the transaction could be authorized or completed. In case no success URL is specified a default success page will be displayed.")
    public String getSuccessUrl() {
        return successUrl;
    }


    /**
     * @return transaction
     **/
    @ApiModelProperty(value = "")
    public Transaction getTransaction() {
        return transaction;
    }


    /**
     * @return type
     **/
    @ApiModelProperty(value = "")
    public SubscriptionChargeType getType() {
        return type;
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
                Objects.equals(this.plannedPurgeDate, subscriptionCharge.plannedPurgeDate) && this.processingType
                == subscriptionCharge.processingType &&
                Objects.equals(this.reference, subscriptionCharge.reference) && this.state == subscriptionCharge.state &&
                Objects.equals(this.subscription, subscriptionCharge.subscription) &&
                Objects.equals(this.succeedOn, subscriptionCharge.succeedOn) &&
                Objects.equals(this.successUrl, subscriptionCharge.successUrl) &&
                Objects.equals(this.transaction, subscriptionCharge.transaction) && this.type == subscriptionCharge.type &&
                Objects.equals(this.version, subscriptionCharge.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdOn, discardedBy, discardedOn, externalId, failedOn, failedUrl, id, language, ledgerEntries, linkedSpaceId, plannedExecutionDate, plannedPurgeDate, processingType, reference, state, subscription, succeedOn, successUrl, transaction, type, version);
    }


    @Override
    public String toString() {

        return "class SubscriptionCharge { \n" +
            "    createdOn: " + toIndentedString(createdOn) +  " \n" +
            "    discardedBy: " + toIndentedString(discardedBy) + " \n" +
            "    discardedOn: " +  toIndentedString(discardedOn) + "\n" +
            "    externalId: " + toIndentedString(externalId) + "\n" +
            "    failedOn: " + toIndentedString(failedOn) + "\n" +
            "    failedUrl: " + toIndentedString(failedUrl) + "\n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    language: " + toIndentedString(language) + "\n" +
            "    ledgerEntries: " + toIndentedString(ledgerEntries) + "\n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) +  " \n" +
            "    plannedExecutionDate: " + toIndentedString(plannedExecutionDate) + " \n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) + "\n" +
            "    processingType: " + toIndentedString(processingType) + "\n" +
            "    reference: " + toIndentedString(reference) + "\n" +
            "    state: " + toIndentedString(state) + "\n" +
            "    subscription: " + toIndentedString(subscription) + "\n" +
            "    succeedOn: " +  toIndentedString(succeedOn) + "\n" +
            "    successUrl: " + toIndentedString(successUrl) + "\n" +
            "    transaction: " + toIndentedString(transaction) + "\n" +
            "    type: " + toIndentedString(type) + "\n" +
            "    version: " + toIndentedString(version) + "\n" +
            "}";
        }


}

