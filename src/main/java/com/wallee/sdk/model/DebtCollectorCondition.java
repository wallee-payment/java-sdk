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
import com.wallee.sdk.model.enums.CreationEntityState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A condition controls under which circumstances a collector configuration is applied to a debt collection case.
 */
@ApiModel(description = "A condition controls under which circumstances a collector configuration is applied to a debt collection case.")

public class DebtCollectorCondition extends Indentable {

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


    @JsonProperty("type")
    protected Long type;


    @JsonProperty("version")
    protected Integer version;


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
     * The condition type determines the condition realization.
     *
     * @return type
     **/
    @ApiModelProperty(value = "The condition type determines the condition realization.")
    public Long getType() {
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
        DebtCollectorCondition debtCollectorCondition = (DebtCollectorCondition) o;
        return Objects.equals(this.id, debtCollectorCondition.id) &&
                Objects.equals(this.linkedSpaceId, debtCollectorCondition.linkedSpaceId) &&
                Objects.equals(this.name, debtCollectorCondition.name) &&
                Objects.equals(this.plannedPurgeDate, debtCollectorCondition.plannedPurgeDate) && this.state
                == debtCollectorCondition.state &&
                Objects.equals(this.type, debtCollectorCondition.type) &&
                Objects.equals(this.version, debtCollectorCondition.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, linkedSpaceId, name, plannedPurgeDate, state, type, version);
    }


    @Override
    public String toString() {

        return "class DebtCollectorCondition { \n" +
            "    id: " + toIndentedString(id) +  "\n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) + " \n" +
            "    name: " + toIndentedString(name) + "\n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) + " \n" +
            "    state: " + toIndentedString(state) + " \n" +
            "    type: " + toIndentedString(type) + " \n" +
            "    version: " + toIndentedString(version) + " \n" +
            "}";
        }


}

