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
import java.util.List;
import java.util.Objects;

/**
 * The debt collector configuration defines the behavior of the collection process for a particular collector.
 */
@ApiModel(description = "The debt collector configuration defines the behavior of the collection process for a particular collector.")

public class DebtCollectorConfiguration extends Indentable {

    @JsonProperty("collector")
    protected Long collector;


    @JsonProperty("conditions")
    protected List<Long> conditions;


    @JsonProperty("enabledSpaceViews")
    protected List<Long> enabledSpaceViews;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("linkedSpaceId")
    protected Long linkedSpaceId;


    @JsonProperty("name")
    protected String name;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("priority")
    protected Integer priority;


    @JsonProperty("skipReviewEnabled")
    protected Boolean skipReviewEnabled;


    @JsonProperty("state")
    protected CreationEntityState state;


    @JsonProperty("version")
    protected Integer version;


    /**
     * The collector handles the debt collection case based on the settings of this configuration.
     *
     * @return collector
     **/
    @ApiModelProperty(value = "The collector handles the debt collection case based on the settings of this configuration.")
    public Long getCollector() {
        return collector;
    }


    /**
     * The conditions applied to the collector configuration restricts the application of this configuration onto a particular debt collection case.
     *
     * @return conditions
     **/
    @ApiModelProperty(value = "The conditions applied to the collector configuration restricts the application of this configuration onto a particular debt collection case.")
    public List<Long> getConditions() {
        return conditions;
    }


    /**
     * The collector configuration is only enabled for the selected space views. In case the set is empty the collector configuration is enabled for all space views.
     *
     * @return enabledSpaceViews
     **/
    @ApiModelProperty(value = "The collector configuration is only enabled for the selected space views. In case the set is empty the collector configuration is enabled for all space views.")
    public List<Long> getEnabledSpaceViews() {
        return enabledSpaceViews;
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
     * The collector configuration name is used internally to identify a specific collector configuration. For example the name is used within search fields and hence it should be distinct and descriptive.
     *
     * @return name
     **/
    @ApiModelProperty(value = "The collector configuration name is used internally to identify a specific collector configuration. For example the name is used within search fields and hence it should be distinct and descriptive.")
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
     * The priority defines the order in which the collector configuration is tried to be applied onto a debt collection case. The higher the value the less likely the configuration is applied on a case.
     *
     * @return priority
     **/
    @ApiModelProperty(value = "The priority defines the order in which the collector configuration is tried to be applied onto a debt collection case. The higher the value the less likely the configuration is applied on a case.")
    public Integer getPriority() {
        return priority;
    }


    /**
     * When the review is skipped there will be no review for cases which use this configuration.
     *
     * @return skipReviewEnabled
     **/
    @ApiModelProperty(value = "When the review is skipped there will be no review for cases which use this configuration.")
    public Boolean isSkipReviewEnabled() {
        return skipReviewEnabled;
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
        DebtCollectorConfiguration debtCollectorConfiguration = (DebtCollectorConfiguration) o;
        return Objects.equals(this.collector, debtCollectorConfiguration.collector) &&
                Objects.equals(this.conditions, debtCollectorConfiguration.conditions) &&
                Objects.equals(this.enabledSpaceViews, debtCollectorConfiguration.enabledSpaceViews) &&
                Objects.equals(this.id, debtCollectorConfiguration.id) &&
                Objects.equals(this.linkedSpaceId, debtCollectorConfiguration.linkedSpaceId) &&
                Objects.equals(this.name, debtCollectorConfiguration.name) &&
                Objects.equals(this.plannedPurgeDate, debtCollectorConfiguration.plannedPurgeDate) &&
                Objects.equals(this.priority, debtCollectorConfiguration.priority) &&
                Objects.equals(this.skipReviewEnabled, debtCollectorConfiguration.skipReviewEnabled) && this.state
                == debtCollectorConfiguration.state &&
                Objects.equals(this.version, debtCollectorConfiguration.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collector, conditions, enabledSpaceViews, id, linkedSpaceId, name, plannedPurgeDate, priority, skipReviewEnabled, state, version);
    }


    @Override
    public String toString() {

        return "class DebtCollectorConfiguration {\n" +
            "    collector: " + toIndentedString(collector) +  "\n" +
            "    conditions: " + toIndentedString(conditions) + "\n" +
            "    enabledSpaceViews: " +  toIndentedString(enabledSpaceViews) + "\n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) + "\n" +
            "    name: " + toIndentedString(name) +  "\n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) + "\n" +
            "    priority: " +  toIndentedString(priority) + "\n" +
            "    skipReviewEnabled: " + toIndentedString(skipReviewEnabled) + "\n" +
            "    state: " + toIndentedString(state) + "\n" +
            "    version: " + toIndentedString(version) + "\n" +
            "}";
        }


}

