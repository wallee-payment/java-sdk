/**
* wallee SDK
*
* This library allows to interact with the wallee payment service.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/


package com.wallee.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wallee.sdk.model.CreationEntityState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * The debt collector configuration defines the behavior of the collection process for a particular collector.
 */
@ApiModel(description = "The debt collector configuration defines the behavior of the collection process for a particular collector.")

public class DebtCollectorConfiguration {
  
  @JsonProperty("collector")
  protected Long collector = null;

  
  @JsonProperty("conditions")
  protected List<Long> conditions = null;

  
  @JsonProperty("enabledSpaceViews")
  protected List<Long> enabledSpaceViews = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("priority")
  protected Integer priority = null;

  
  @JsonProperty("skipReviewEnabled")
  protected Boolean skipReviewEnabled = null;

  
  @JsonProperty("state")
  protected CreationEntityState state = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The debt collector that the configuration is for.
   * @return collector
  **/
  @ApiModelProperty(value = "The debt collector that the configuration is for.")
  public Long getCollector() {
    return collector;
  }

  
   /**
   * Conditions allow to define criteria that a debt collection case must fulfill in order for the debt collector configuration to be considered for processing the case.
   * @return conditions
  **/
  @ApiModelProperty(value = "Conditions allow to define criteria that a debt collection case must fulfill in order for the debt collector configuration to be considered for processing the case.")
  public List<Long> getConditions() {
    return conditions;
  }

  
   /**
   * The space views for which the debt collector configuration is enabled. If empty, it is enabled for all space views.
   * @return enabledSpaceViews
  **/
  @ApiModelProperty(value = "The space views for which the debt collector configuration is enabled. If empty, it is enabled for all space views.")
  public List<Long> getEnabledSpaceViews() {
    return enabledSpaceViews;
  }

  
   /**
   * A unique identifier for the object.
   * @return id
  **/
  @ApiModelProperty(value = "A unique identifier for the object.")
  public Long getId() {
    return id;
  }

  
   /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The ID of the space this object belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The name used to identify the debt collector configuration.
   * @return name
  **/
  @ApiModelProperty(value = "The name used to identify the debt collector configuration.")
  public String getName() {
    return name;
  }

  
   /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * The priority that determines the order in which debt collector configurations are taken into account when processing a case. Low values are considered first.
   * @return priority
  **/
  @ApiModelProperty(value = "The priority that determines the order in which debt collector configurations are taken into account when processing a case. Low values are considered first.")
  public Integer getPriority() {
    return priority;
  }

  
   /**
   * Whether the review of debt collection cases is skipped.
   * @return skipReviewEnabled
  **/
  @ApiModelProperty(value = "Whether the review of debt collection cases is skipped.")
  public Boolean isSkipReviewEnabled() {
    return skipReviewEnabled;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public CreationEntityState getState() {
    return state;
  }

  
   /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @ApiModelProperty(value = "The version is used for optimistic locking and incremented whenever the object is updated.")
  public Integer getVersion() {
    return version;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
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
        Objects.equals(this.skipReviewEnabled, debtCollectorConfiguration.skipReviewEnabled) &&
        Objects.equals(this.state, debtCollectorConfiguration.state) &&
        Objects.equals(this.version, debtCollectorConfiguration.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collector, conditions, enabledSpaceViews, id, linkedSpaceId, name, plannedPurgeDate, priority, skipReviewEnabled, state, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebtCollectorConfiguration {\n");
    
    sb.append("    collector: ").append(toIndentedString(collector)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    enabledSpaceViews: ").append(toIndentedString(enabledSpaceViews)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    skipReviewEnabled: ").append(toIndentedString(skipReviewEnabled)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

