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
import com.wallee.sdk.model.enums.SubscriptionPeriodBillState;

@ApiModel(description = "")

public class SubscriptionPeriodBill extends Indentable {

    @JsonProperty("createdOn")
    protected OffsetDateTime createdOn;


    @JsonProperty("effectivePeriodEndDate")
    protected OffsetDateTime effectivePeriodEndDate;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("language")
    protected String language;


    @JsonProperty("linkedSpaceId")
    protected Long linkedSpaceId;


    @JsonProperty("periodStartDate")
    protected OffsetDateTime periodStartDate;


    @JsonProperty("plannedPeriodEndDate")
    protected OffsetDateTime plannedPeriodEndDate;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("state")
    protected SubscriptionPeriodBillState state;


    @JsonProperty("subscriptionVersion")
    protected SubscriptionVersion subscriptionVersion;


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
     * @return effectivePeriodEndDate
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getEffectivePeriodEndDate() {
        return effectivePeriodEndDate;
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
     * @return periodStartDate
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getPeriodStartDate() {
        return periodStartDate;
    }


    /**
     * @return plannedPeriodEndDate
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getPlannedPeriodEndDate() {
        return plannedPeriodEndDate;
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
     * @return state
     **/
    @ApiModelProperty(value = "")
    public SubscriptionPeriodBillState getState() {
        return state;
    }


    /**
     * @return subscriptionVersion
     **/
    @ApiModelProperty(value = "")
    public SubscriptionVersion getSubscriptionVersion() {
        return subscriptionVersion;
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
        SubscriptionPeriodBill subscriptionPeriodBill = (SubscriptionPeriodBill) o;
        return Objects.equals(this.createdOn, subscriptionPeriodBill.createdOn) &&
                Objects.equals(this.effectivePeriodEndDate, subscriptionPeriodBill.effectivePeriodEndDate) &&
                Objects.equals(this.id, subscriptionPeriodBill.id) &&
                Objects.equals(this.language, subscriptionPeriodBill.language) &&
                Objects.equals(this.linkedSpaceId, subscriptionPeriodBill.linkedSpaceId) &&
                Objects.equals(this.periodStartDate, subscriptionPeriodBill.periodStartDate) &&
                Objects.equals(this.plannedPeriodEndDate, subscriptionPeriodBill.plannedPeriodEndDate) &&
                Objects.equals(this.plannedPurgeDate, subscriptionPeriodBill.plannedPurgeDate) && this.state
                == subscriptionPeriodBill.state &&
                Objects.equals(this.subscriptionVersion, subscriptionPeriodBill.subscriptionVersion) &&
                Objects.equals(this.version, subscriptionPeriodBill.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdOn, effectivePeriodEndDate, id, language, linkedSpaceId, periodStartDate, plannedPeriodEndDate, plannedPurgeDate, state, subscriptionVersion, version);
    }


    @Override
    public String toString() {

        return "class SubscriptionPeriodBill { \n" +
            "    createdOn: " + toIndentedString(createdOn) +  "\n" +
            "    effectivePeriodEndDate: " + toIndentedString(effectivePeriodEndDate) + " \n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    language: " + toIndentedString(language) + " \n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) + " \n" +
            "    periodStartDate: " + toIndentedString(periodStartDate) +  "\n" +
            "    plannedPeriodEndDate: " + toIndentedString(plannedPeriodEndDate) + " \n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) + " \n" +
            "    state: " + toIndentedString(state) +  "\n" +
            "    subscriptionVersion: " + toIndentedString(subscriptionVersion) + " \n" +
            "    version: " + toIndentedString(version) + " \n" +
            "}";
        }


}

