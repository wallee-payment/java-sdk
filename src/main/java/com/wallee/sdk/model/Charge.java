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
import com.wallee.sdk.model.enums.ChargeState;
import com.wallee.sdk.model.enums.ChargeType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

@ApiModel(description = "")

public class Charge extends TransactionAwareEntity {

    @JsonProperty("createdOn")
    protected OffsetDateTime createdOn;


    @JsonProperty("failureReason")
    protected FailureReason failureReason;


    @JsonProperty("language")
    protected String language;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("spaceViewId")
    protected Long spaceViewId;


    @JsonProperty("state")
    protected ChargeState state;


    @JsonProperty("timeZone")
    protected String timeZone;


    @JsonProperty("timeoutOn")
    protected OffsetDateTime timeoutOn;


    @JsonProperty("transaction")
    protected Transaction transaction;


    @JsonProperty("type")
    protected ChargeType type;


    @JsonProperty("userFailureMessage")
    protected String userFailureMessage;


    @JsonProperty("version")
    protected Integer version;


    /**
     * The date on which the charge was created on.
     *
     * @return createdOn
     **/
    @ApiModelProperty(value = "The date on which the charge was created on.")
    public OffsetDateTime getCreatedOn() {
        return createdOn;
    }


    /**
     * @return failureReason
     **/
    @ApiModelProperty(value = "")
    public FailureReason getFailureReason() {
        return failureReason;
    }


    /**
     * @return language
     **/
    @ApiModelProperty(value = "")
    public String getLanguage() {
        return language;
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
     * @return spaceViewId
     **/
    @ApiModelProperty(value = "")
    public Long getSpaceViewId() {
        return spaceViewId;
    }


    /**
     * @return state
     **/
    @ApiModelProperty(value = "")
    public ChargeState getState() {
        return state;
    }


    /**
     * @return timeZone
     **/
    @ApiModelProperty(value = "")
    public String getTimeZone() {
        return timeZone;
    }


    /**
     * @return timeoutOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getTimeoutOn() {
        return timeoutOn;
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
    public ChargeType getType() {
        return type;
    }


    /**
     * The failure message describes for an end user why the charge is failed in the language of the user. This is only provided when the charge is marked as failed.
     *
     * @return userFailureMessage
     **/
    @ApiModelProperty(value = "The failure message describes for an end user why the charge is failed in the language of the user. This is only provided when the charge is marked as failed.")
    public String getUserFailureMessage() {
        return userFailureMessage;
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
        Charge charge = (Charge) o;
        return Objects.equals(this.id, charge.id) &&
                Objects.equals(this.linkedSpaceId, charge.linkedSpaceId) &&
                Objects.equals(this.linkedTransaction, charge.linkedTransaction) &&
                Objects.equals(this.createdOn, charge.createdOn) &&
                Objects.equals(this.failureReason, charge.failureReason) &&
                Objects.equals(this.language, charge.language) &&
                Objects.equals(this.plannedPurgeDate, charge.plannedPurgeDate) &&
                Objects.equals(this.spaceViewId, charge.spaceViewId) && this.state == charge.state &&
                Objects.equals(this.timeZone, charge.timeZone) &&
                Objects.equals(this.timeoutOn, charge.timeoutOn) &&
                Objects.equals(this.transaction, charge.transaction) && this.type == charge.type &&
                Objects.equals(this.userFailureMessage, charge.userFailureMessage) &&
                Objects.equals(this.version, charge.version) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, linkedSpaceId, linkedTransaction, createdOn, failureReason, language, plannedPurgeDate, spaceViewId, state, timeZone, timeoutOn, transaction, type, userFailureMessage, version, super.hashCode());
    }


    @Override
    public String toString() {
        return "class Charge { \n" +
            "    " + toIndentedString(super.toString()) + " \n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) +  "\n" +
            "    linkedTransaction: " + toIndentedString(linkedTransaction) + " \n" +
            "    createdOn: " + toIndentedString(createdOn) + " \n" +
            "    failureReason: " + toIndentedString(failureReason) +  "\n" +
            "    language: " + toIndentedString(language) + " \n" +
            "    plannedPurgeDate: " +  toIndentedString(plannedPurgeDate) + " \n" +
            "    spaceViewId: " + toIndentedString(spaceViewId) + " \n" +
            "    state: " + toIndentedString(state) + " \n" +
            "    timeZone: " + toIndentedString(timeZone) + " \n" +
            "    timeoutOn: " + toIndentedString(timeoutOn) + " \n" +
            "    transaction: " + toIndentedString(transaction) +  "\n" +
            "    type: " + toIndentedString(type) + " \n" +
            "    userFailureMessage: " +  toIndentedString(userFailureMessage) + " \n" +
            "    version: " + toIndentedString(version) + " \n" +
            "}";
        }

}

