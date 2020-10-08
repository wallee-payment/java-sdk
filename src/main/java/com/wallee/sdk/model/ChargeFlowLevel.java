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
import com.wallee.sdk.model.enums.ChargeFlowLevelState;

@ApiModel(description = "")

public class ChargeFlowLevel extends TransactionAwareEntity {

    @JsonProperty("asynchronousCharge")
    protected Long asynchronousCharge;


    @JsonProperty("configuration")
    protected ChargeFlowLevelConfiguration _configuration;


    @JsonProperty("createdOn")
    protected OffsetDateTime createdOn;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("state")
    protected ChargeFlowLevelState state;


    @JsonProperty("synchronousCharge")
    protected Long synchronousCharge;


    @JsonProperty("timeoutOn")
    protected OffsetDateTime timeoutOn;


    @JsonProperty("tokenCharge")
    protected Long tokenCharge;


    @JsonProperty("transaction")
    protected Transaction transaction;


    @JsonProperty("version")
    protected Integer version;


    /**
     * @return asynchronousCharge
     **/
    @ApiModelProperty(value = "")
    public Long getAsynchronousCharge() {
        return asynchronousCharge;
    }


    /**
     * @return _configuration
     **/
    @ApiModelProperty(value = "")
    public ChargeFlowLevelConfiguration getConfiguration() {
        return _configuration;
    }


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
    public ChargeFlowLevelState getState() {
        return state;
    }


    /**
     * @return synchronousCharge
     **/
    @ApiModelProperty(value = "")
    public Long getSynchronousCharge() {
        return synchronousCharge;
    }


    /**
     * @return timeoutOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getTimeoutOn() {
        return timeoutOn;
    }


    /**
     * @return tokenCharge
     **/
    @ApiModelProperty(value = "")
    public Long getTokenCharge() {
        return tokenCharge;
    }


    /**
     * @return transaction
     **/
    @ApiModelProperty(value = "")
    public Transaction getTransaction() {
        return transaction;
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
        ChargeFlowLevel chargeFlowLevel = (ChargeFlowLevel) o;
        return Objects.equals(this.id, chargeFlowLevel.id) &&
                Objects.equals(this.linkedSpaceId, chargeFlowLevel.linkedSpaceId) &&
                Objects.equals(this.linkedTransaction, chargeFlowLevel.linkedTransaction) &&
                Objects.equals(this.asynchronousCharge, chargeFlowLevel.asynchronousCharge) &&
                Objects.equals(this._configuration, chargeFlowLevel._configuration) &&
                Objects.equals(this.createdOn, chargeFlowLevel.createdOn) &&
                Objects.equals(this.plannedPurgeDate, chargeFlowLevel.plannedPurgeDate) && this.state == chargeFlowLevel.state
                &&
                Objects.equals(this.synchronousCharge, chargeFlowLevel.synchronousCharge) &&
                Objects.equals(this.timeoutOn, chargeFlowLevel.timeoutOn) &&
                Objects.equals(this.tokenCharge, chargeFlowLevel.tokenCharge) &&
                Objects.equals(this.transaction, chargeFlowLevel.transaction) &&
                Objects.equals(this.version, chargeFlowLevel.version) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, linkedSpaceId, linkedTransaction, asynchronousCharge, _configuration, createdOn, plannedPurgeDate, state, synchronousCharge, timeoutOn, tokenCharge, transaction, version, super.hashCode());
    }


    @Override
    public String toString() {
        return "class ChargeFlowLevel {\n" +
            "    " + toIndentedString(super.toString()) + "\n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) +  "\n" +
            "    linkedTransaction: " + toIndentedString(linkedTransaction) + "\n" +
            "    asynchronousCharge: " + toIndentedString(asynchronousCharge) + "\n" +
            "    _configuration: " + toIndentedString(_configuration) + "\n" +
            "    createdOn: " + toIndentedString(createdOn) + "\n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) + "\n" +
            "    state: " + toIndentedString(state) +  "\n" +
            "    synchronousCharge: " + toIndentedString(synchronousCharge) + "\n" +
            "    timeoutOn: " + toIndentedString(timeoutOn) + "\n" +
            "    tokenCharge: " + toIndentedString(tokenCharge) +  "\n" +
            "    transaction: " + toIndentedString(transaction) + "\n" +
            "    version: " + toIndentedString(version) + "\n" +
            "}";
        }


}

