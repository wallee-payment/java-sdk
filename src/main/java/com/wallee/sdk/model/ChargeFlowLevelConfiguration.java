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
import com.wallee.sdk.model.ChargeFlow;
import com.wallee.sdk.model.CreationEntityState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class ChargeFlowLevelConfiguration {
  
  @JsonProperty("flow")
  protected ChargeFlow flow = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("period")
  protected String period = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("priority")
  protected Integer priority = null;

  
  @JsonProperty("state")
  protected CreationEntityState state = null;

  
  @JsonProperty("type")
  protected Long type = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The charge flow that this level configuration belongs to.
   * @return flow
  **/
  @ApiModelProperty(value = "The charge flow that this level configuration belongs to.")
  public ChargeFlow getFlow() {
    return flow;
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
   * The name used to identify the charge flow level configuration.
   * @return name
  **/
  @ApiModelProperty(value = "The name used to identify the charge flow level configuration.")
  public String getName() {
    return name;
  }

  
   /**
   * The duration specifies how long the level remains active before transitioning to the next one.
   * @return period
  **/
  @ApiModelProperty(value = "The duration specifies how long the level remains active before transitioning to the next one.")
  public String getPeriod() {
    return period;
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
   * The priority that determines the order in which level configurations are taken into account when processing a charge flow. Low values are considered first.
   * @return priority
  **/
  @ApiModelProperty(value = "The priority that determines the order in which level configurations are taken into account when processing a charge flow. Low values are considered first.")
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
   * The type defines the method of delivering the payment link to the customer.
   * @return type
  **/
  @ApiModelProperty(value = "The type defines the method of delivering the payment link to the customer.")
  public Long getType() {
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
    ChargeFlowLevelConfiguration chargeFlowLevelConfiguration = (ChargeFlowLevelConfiguration) o;
    return Objects.equals(this.flow, chargeFlowLevelConfiguration.flow) &&
        Objects.equals(this.id, chargeFlowLevelConfiguration.id) &&
        Objects.equals(this.linkedSpaceId, chargeFlowLevelConfiguration.linkedSpaceId) &&
        Objects.equals(this.name, chargeFlowLevelConfiguration.name) &&
        Objects.equals(this.period, chargeFlowLevelConfiguration.period) &&
        Objects.equals(this.plannedPurgeDate, chargeFlowLevelConfiguration.plannedPurgeDate) &&
        Objects.equals(this.priority, chargeFlowLevelConfiguration.priority) &&
        Objects.equals(this.state, chargeFlowLevelConfiguration.state) &&
        Objects.equals(this.type, chargeFlowLevelConfiguration.type) &&
        Objects.equals(this.version, chargeFlowLevelConfiguration.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flow, id, linkedSpaceId, name, period, plannedPurgeDate, priority, state, type, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeFlowLevelConfiguration {\n");
    
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
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

