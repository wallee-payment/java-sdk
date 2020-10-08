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
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wallee.sdk.model.enums.SubscriptionSuspensionAction;
import com.wallee.sdk.model.enums.SubscriptionSuspensionReason;
import com.wallee.sdk.model.enums.SubscriptionSuspensionState;

@ApiModel(description = "")

public class SubscriptionSuspension extends Indentable {

    @JsonProperty("createdOn")
    protected OffsetDateTime createdOn;


    @JsonProperty("effectiveEndDate")
    protected OffsetDateTime effectiveEndDate;


    @JsonProperty("endAction")
    protected SubscriptionSuspensionAction endAction;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("language")
    protected String language;


    @JsonProperty("linkedSpaceId")
    protected Long linkedSpaceId;


    @JsonProperty("note")
    protected String note;


    @JsonProperty("periodBill")
    protected Long periodBill;


    @JsonProperty("plannedEndDate")
    protected OffsetDateTime plannedEndDate;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("reason")
    protected SubscriptionSuspensionReason reason;


    @JsonProperty("state")
    protected SubscriptionSuspensionState state;


    @JsonProperty("subscription")
    protected Long subscription;


    @JsonProperty("version")
    protected Integer version;


    /**
     * The created on date indicates the date on which the entity was stored into the database.
     *
     * @return createdOn
     **/
    @ApiModelProperty(value = "The created on date indicates the date on which the entity was stored into the database.")
    public OffsetDateTime getCreatedOn() {
        return createdOn;
    }


    /**
     * @return effectiveEndDate
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getEffectiveEndDate() {
        return effectiveEndDate;
    }


    /**
     * When the suspension reaches the planned end date the end action will be carried out. This action is only executed when the suspension is ended automatically based on the end date.
     *
     * @return endAction
     **/
    @ApiModelProperty(value = "When the suspension reaches the planned end date the end action will be carried out. This action is only executed when the suspension is ended automatically based on the end date.")
    public SubscriptionSuspensionAction getEndAction() {
        return endAction;
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
     * The linked space id holds the ID of the space to which the entity belongs to.
     *
     * @return linkedSpaceId
     **/
    @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
    public Long getLinkedSpaceId() {
        return linkedSpaceId;
    }


    /**
     * The note may contain some internal information for the suspension. The note will not be disclosed to the subscriber.
     *
     * @return note
     **/
    @ApiModelProperty(value = "The note may contain some internal information for the suspension. The note will not be disclosed to the subscriber.")
    public String getNote() {
        return note;
    }


    /**
     * @return periodBill
     **/
    @ApiModelProperty(value = "")
    public Long getPeriodBill() {
        return periodBill;
    }


    /**
     * The planned end date of the suspension identifies the date on which the suspension will be ended automatically.
     *
     * @return plannedEndDate
     **/
    @ApiModelProperty(value = "The planned end date of the suspension identifies the date on which the suspension will be ended automatically.")
    public OffsetDateTime getPlannedEndDate() {
        return plannedEndDate;
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
     * The suspension reason indicates why a suspension has been created.
     *
     * @return reason
     **/
    @ApiModelProperty(value = "The suspension reason indicates why a suspension has been created.")
    public SubscriptionSuspensionReason getReason() {
        return reason;
    }


    /**
     * @return state
     **/
    @ApiModelProperty(value = "")
    public SubscriptionSuspensionState getState() {
        return state;
    }


    /**
     * @return subscription
     **/
    @ApiModelProperty(value = "")
    public Long getSubscription() {
        return subscription;
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
        SubscriptionSuspension subscriptionSuspension = (SubscriptionSuspension) o;
        return Objects.equals(this.createdOn, subscriptionSuspension.createdOn) &&
                Objects.equals(this.effectiveEndDate, subscriptionSuspension.effectiveEndDate) && this.endAction
                == subscriptionSuspension.endAction &&
                Objects.equals(this.id, subscriptionSuspension.id) &&
                Objects.equals(this.language, subscriptionSuspension.language) &&
                Objects.equals(this.linkedSpaceId, subscriptionSuspension.linkedSpaceId) &&
                Objects.equals(this.note, subscriptionSuspension.note) &&
                Objects.equals(this.periodBill, subscriptionSuspension.periodBill) &&
                Objects.equals(this.plannedEndDate, subscriptionSuspension.plannedEndDate) &&
                Objects.equals(this.plannedPurgeDate, subscriptionSuspension.plannedPurgeDate) && this.reason
                == subscriptionSuspension.reason && this.state == subscriptionSuspension.state &&
                Objects.equals(this.subscription, subscriptionSuspension.subscription) &&
                Objects.equals(this.version, subscriptionSuspension.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdOn, effectiveEndDate, endAction, id, language, linkedSpaceId, note, periodBill, plannedEndDate, plannedPurgeDate, reason, state, subscription, version);
    }


    @Override
    public String toString() {

        return "class SubscriptionSuspension { \n" +
            "    createdOn: " + toIndentedString(createdOn) +  "\n" +
            "    effectiveEndDate: " + toIndentedString(effectiveEndDate) + " \n" +
            "    endAction: " + toIndentedString(endAction) + " \n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    language: " + toIndentedString(language) + " \n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) +  "\n" +
            "    note: " + toIndentedString(note) + " \n" +
            "    periodBill: " + toIndentedString(periodBill) +  "\n" +
            "    plannedEndDate: " + toIndentedString(plannedEndDate) + " \n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) + " \n" +
            "    reason: " + toIndentedString(reason) +  "\n" +
            "    state: " + toIndentedString(state) + " \n" +
            "    subscription: " + toIndentedString(subscription) + "\n" +
            "    version: " + toIndentedString(version) + " \n" +
            "}";
        }


}

