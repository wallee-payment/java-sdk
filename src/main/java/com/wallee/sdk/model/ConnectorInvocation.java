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
import com.wallee.sdk.model.enums.ConnectorInvocationStage;

@ApiModel(description = "")

public class ConnectorInvocation extends TransactionAwareEntity {

    @JsonProperty("createdOn")
    protected OffsetDateTime createdOn;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("stage")
    protected ConnectorInvocationStage stage;


    @JsonProperty("timeTookInMilliseconds")
    protected Long timeTookInMilliseconds;


    @JsonProperty("transaction")
    protected Long transaction;


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
     * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
     *
     * @return plannedPurgeDate
     **/
    @ApiModelProperty(value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
    public OffsetDateTime getPlannedPurgeDate() {
        return plannedPurgeDate;
    }


    /**
     * @return stage
     **/
    @ApiModelProperty(value = "")
    public ConnectorInvocationStage getStage() {
        return stage;
    }


    /**
     * @return timeTookInMilliseconds
     **/
    @ApiModelProperty(value = "")
    public Long getTimeTookInMilliseconds() {
        return timeTookInMilliseconds;
    }


    /**
     * @return transaction
     **/
    @ApiModelProperty(value = "")
    public Long getTransaction() {
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
        ConnectorInvocation connectorInvocation = (ConnectorInvocation) o;
        return Objects.equals(this.id, connectorInvocation.id) &&
                Objects.equals(this.linkedSpaceId, connectorInvocation.linkedSpaceId) &&
                Objects.equals(this.linkedTransaction, connectorInvocation.linkedTransaction) &&
                Objects.equals(this.createdOn, connectorInvocation.createdOn) &&
                Objects.equals(this.plannedPurgeDate, connectorInvocation.plannedPurgeDate) && this.stage
                == connectorInvocation.stage &&
                Objects.equals(this.timeTookInMilliseconds, connectorInvocation.timeTookInMilliseconds) &&
                Objects.equals(this.transaction, connectorInvocation.transaction) &&
                Objects.equals(this.version, connectorInvocation.version) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, linkedSpaceId, linkedTransaction, createdOn, plannedPurgeDate, stage, timeTookInMilliseconds, transaction, version, super.hashCode());
    }


    @Override
    public String toString() {
        return "class ConnectorInvocation { \n" +
            "    " + toIndentedString(super.toString()) + "\n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) +  " \n" +
            "    linkedTransaction: " + toIndentedString(linkedTransaction) + " \n" +
            "    createdOn: " + toIndentedString(createdOn) + " \n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) +  " \n" +
            "    stage: " + toIndentedString(stage) + " \n" +
            "    timeTookInMilliseconds: " +  toIndentedString(timeTookInMilliseconds) + "\n" +
            "    transaction: " + toIndentedString(transaction) + "\n" +
            "    version: " + toIndentedString(version) + " \n" +
            "}";
        }


}

