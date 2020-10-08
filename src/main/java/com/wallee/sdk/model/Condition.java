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
import com.wallee.sdk.model.enums.CreationEntityState;

/**
 * A condition configuration controls under which condition a payment connector is applied to a transaction.
 */
@ApiModel(description = "A condition configuration controls under which condition a payment connector is applied to a transaction.")

public class Condition extends Indentable {

    @JsonProperty("conditionType")
    protected Long conditionType;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("linkedSpaceId")
    protected Long linkedSpaceId;


    @JsonProperty("name")
    protected String name;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("state")
    protected CreationEntityState state;


    @JsonProperty("version")
    protected Integer version;


    /**
     * The selected condition type defines how the configuration is applied to the transactions.
     *
     * @return conditionType
     **/
    @ApiModelProperty(value = "The selected condition type defines how the configuration is applied to the transactions.")
    public Long getConditionType() {
        return conditionType;
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
     * The linked space id holds the ID of the space to which the entity belongs to.
     *
     * @return linkedSpaceId
     **/
    @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
    public Long getLinkedSpaceId() {
        return linkedSpaceId;
    }


    /**
     * The condition name is used internally to identify the condition. For example the name is used within search fields and hence it should be distinct and descriptive.
     *
     * @return name
     **/
    @ApiModelProperty(value = "The condition name is used internally to identify the condition. For example the name is used within search fields and hence it should be distinct and descriptive.")
    public String getName() {
        return name;
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
    public CreationEntityState getState() {
        return state;
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
        Condition condition = (Condition) o;
        return Objects.equals(this.conditionType, condition.conditionType) &&
                Objects.equals(this.id, condition.id) &&
                Objects.equals(this.linkedSpaceId, condition.linkedSpaceId) &&
                Objects.equals(this.name, condition.name) &&
                Objects.equals(this.plannedPurgeDate, condition.plannedPurgeDate) && this.state == condition.state &&
                Objects.equals(this.version, condition.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conditionType, id, linkedSpaceId, name, plannedPurgeDate, state, version);
    }


    @Override
    public String toString() {

        return "class Condition { \n" +
            "    conditionType: " + toIndentedString(conditionType) + " \n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) + " \n" +
            "    name: " + toIndentedString(name) + " \n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) +  " \n" +
            "    state: " + toIndentedString(state) + " \n" +
            "    version: " + toIndentedString(version) + " \n" +
            "}";
        }


}

