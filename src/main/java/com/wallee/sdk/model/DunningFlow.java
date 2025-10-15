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
import com.wallee.sdk.model.DunningFlowType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class DunningFlow {
  
  @JsonProperty("conditions")
  protected List<Long> conditions = null;

  
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

  
  @JsonProperty("state")
  protected CreationEntityState state = null;

  
  @JsonProperty("type")
  protected DunningFlowType type = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * If a dunning flow meets all selected conditions, the dunning flow will be used to process the dunning case. If the conditions are not met the next dunning flow in line will be chosen according to the priorities.
   * @return conditions
  **/
  @ApiModelProperty(value = "If a dunning flow meets all selected conditions, the dunning flow will be used to process the dunning case. If the conditions are not met the next dunning flow in line will be chosen according to the priorities.")
  public List<Long> getConditions() {
    return conditions;
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
   * The dunning flow name is used internally to identify the configuration in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.
   * @return name
  **/
  @ApiModelProperty(value = "The dunning flow name is used internally to identify the configuration in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.")
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
   * The priority orders the dunning flows. As such the priority determines together with the conditions the dunning flow the selection mechanism for a particular invoice. A change of the priority affects all future selections.
   * @return priority
  **/
  @ApiModelProperty(value = "The priority orders the dunning flows. As such the priority determines together with the conditions the dunning flow the selection mechanism for a particular invoice. A change of the priority affects all future selections.")
  public Integer getPriority() {
    return priority;
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
   * The type of the flow controls the way fees and interest rates are calculated. You can choose from predefined fees for some jurisdictions.
   * @return type
  **/
  @ApiModelProperty(value = "The type of the flow controls the way fees and interest rates are calculated. You can choose from predefined fees for some jurisdictions.")
  public DunningFlowType getType() {
    return type;
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
    DunningFlow dunningFlow = (DunningFlow) o;
    return Objects.equals(this.conditions, dunningFlow.conditions) &&
        Objects.equals(this.id, dunningFlow.id) &&
        Objects.equals(this.linkedSpaceId, dunningFlow.linkedSpaceId) &&
        Objects.equals(this.name, dunningFlow.name) &&
        Objects.equals(this.plannedPurgeDate, dunningFlow.plannedPurgeDate) &&
        Objects.equals(this.priority, dunningFlow.priority) &&
        Objects.equals(this.state, dunningFlow.state) &&
        Objects.equals(this.type, dunningFlow.type) &&
        Objects.equals(this.version, dunningFlow.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, id, linkedSpaceId, name, plannedPurgeDate, priority, state, type, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DunningFlow {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

