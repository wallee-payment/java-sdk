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
import com.wallee.sdk.model.DocumentTemplate;
import com.wallee.sdk.model.DunningFlow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class DunningFlowLevel {
  
  @JsonProperty("documentText")
  protected Map<String, String> documentText = null;

  
  @JsonProperty("flow")
  protected DunningFlow flow = null;

  
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

  
  @JsonProperty("processor")
  protected Long processor = null;

  
  @JsonProperty("reminderTemplate")
  protected DocumentTemplate reminderTemplate = null;

  
  @JsonProperty("state")
  protected CreationEntityState state = null;

  
  @JsonProperty("title")
  protected Map<String, String> title = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * This text is put in the reminder document of this dunning flow level.
   * @return documentText
  **/
  @ApiModelProperty(value = "This text is put in the reminder document of this dunning flow level.")
  public Map<String, String> getDocumentText() {
    return documentText;
  }

  
   /**
   * 
   * @return flow
  **/
  @ApiModelProperty(value = "")
  public DunningFlow getFlow() {
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
   * The dunning flow level name is used internally to identify the dunning flow level. For example the name is used within search fields and hence it should be distinct and descriptive.
   * @return name
  **/
  @ApiModelProperty(value = "The dunning flow level name is used internally to identify the dunning flow level. For example the name is used within search fields and hence it should be distinct and descriptive.")
  public String getName() {
    return name;
  }

  
   /**
   * The duration of the level before switching to the next one.
   * @return period
  **/
  @ApiModelProperty(value = "The duration of the level before switching to the next one.")
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
   * The priority indicates the sort order of the level. A low value indicates that the level is executed before any level with a higher value. Any change to this value affects future level selections. The value has to pe unique per dunning flow.
   * @return priority
  **/
  @ApiModelProperty(value = "The priority indicates the sort order of the level. A low value indicates that the level is executed before any level with a higher value. Any change to this value affects future level selections. The value has to pe unique per dunning flow.")
  public Integer getPriority() {
    return priority;
  }

  
   /**
   * 
   * @return processor
  **/
  @ApiModelProperty(value = "")
  public Long getProcessor() {
    return processor;
  }

  
   /**
   * 
   * @return reminderTemplate
  **/
  @ApiModelProperty(value = "")
  public DocumentTemplate getReminderTemplate() {
    return reminderTemplate;
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
   * The title is used to communicate the dunning level to the customer within the reminder.
   * @return title
  **/
  @ApiModelProperty(value = "The title is used to communicate the dunning level to the customer within the reminder.")
  public Map<String, String> getTitle() {
    return title;
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
    DunningFlowLevel dunningFlowLevel = (DunningFlowLevel) o;
    return Objects.equals(this.documentText, dunningFlowLevel.documentText) &&
        Objects.equals(this.flow, dunningFlowLevel.flow) &&
        Objects.equals(this.id, dunningFlowLevel.id) &&
        Objects.equals(this.linkedSpaceId, dunningFlowLevel.linkedSpaceId) &&
        Objects.equals(this.name, dunningFlowLevel.name) &&
        Objects.equals(this.period, dunningFlowLevel.period) &&
        Objects.equals(this.plannedPurgeDate, dunningFlowLevel.plannedPurgeDate) &&
        Objects.equals(this.priority, dunningFlowLevel.priority) &&
        Objects.equals(this.processor, dunningFlowLevel.processor) &&
        Objects.equals(this.reminderTemplate, dunningFlowLevel.reminderTemplate) &&
        Objects.equals(this.state, dunningFlowLevel.state) &&
        Objects.equals(this.title, dunningFlowLevel.title) &&
        Objects.equals(this.version, dunningFlowLevel.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentText, flow, id, linkedSpaceId, name, period, plannedPurgeDate, priority, processor, reminderTemplate, state, title, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DunningFlowLevel {\n");
    
    sb.append("    documentText: ").append(toIndentedString(documentText)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    reminderTemplate: ").append(toIndentedString(reminderTemplate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

