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
import com.wallee.sdk.model.ManualTaskState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * A manual task requires a manual intervention by a human.
 */
@ApiModel(description = "A manual task requires a manual intervention by a human.")

public class ManualTask {
  
  @JsonProperty("actions")
  protected List<Long> actions = null;

  
  @JsonProperty("contextEntityId")
  protected Long contextEntityId = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("expiresOn")
  protected OffsetDateTime expiresOn = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("spaceId")
  protected Long spaceId = null;

  
  @JsonProperty("state")
  protected ManualTaskState state = null;

  
  @JsonProperty("type")
  protected Long type = null;

  
  
   /**
   * 
   * @return actions
  **/
  @ApiModelProperty(value = "")
  public List<Long> getActions() {
    return actions;
  }

  
   /**
   * The context entity ID links the manual task to the entity which caused its creation.
   * @return contextEntityId
  **/
  @ApiModelProperty(value = "The context entity ID links the manual task to the entity which caused its creation.")
  public Long getContextEntityId() {
    return contextEntityId;
  }

  
   /**
   * The date and time when the object was created.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The date and time when the object was created.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * The expiry date indicates until when the manual task has to be executed.
   * @return expiresOn
  **/
  @ApiModelProperty(value = "The expiry date indicates until when the manual task has to be executed.")
  public OffsetDateTime getExpiresOn() {
    return expiresOn;
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
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * 
   * @return spaceId
  **/
  @ApiModelProperty(value = "")
  public Long getSpaceId() {
    return spaceId;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public ManualTaskState getState() {
    return state;
  }

  
   /**
   * The type categorizes the manual task.
   * @return type
  **/
  @ApiModelProperty(value = "The type categorizes the manual task.")
  public Long getType() {
    return type;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManualTask manualTask = (ManualTask) o;
    return Objects.equals(this.actions, manualTask.actions) &&
        Objects.equals(this.contextEntityId, manualTask.contextEntityId) &&
        Objects.equals(this.createdOn, manualTask.createdOn) &&
        Objects.equals(this.expiresOn, manualTask.expiresOn) &&
        Objects.equals(this.id, manualTask.id) &&
        Objects.equals(this.linkedSpaceId, manualTask.linkedSpaceId) &&
        Objects.equals(this.plannedPurgeDate, manualTask.plannedPurgeDate) &&
        Objects.equals(this.spaceId, manualTask.spaceId) &&
        Objects.equals(this.state, manualTask.state) &&
        Objects.equals(this.type, manualTask.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, contextEntityId, createdOn, expiresOn, id, linkedSpaceId, plannedPurgeDate, spaceId, state, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManualTask {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    contextEntityId: ").append(toIndentedString(contextEntityId)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    expiresOn: ").append(toIndentedString(expiresOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

