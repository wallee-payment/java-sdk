/**
*  SDK
*
* This library allows to interact with the  payment service.
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
import com.wallee.sdk.model.ManualTaskActionStyle;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class ManualTaskAction {
  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("label")
  protected Map<String, String> label = null;

  
  @JsonProperty("style")
  protected ManualTaskActionStyle style = null;

  
  @JsonProperty("taskType")
  protected Long taskType = null;

  
  
   /**
   * The ID is the primary key of the entity. The ID identifies the entity uniquely.
   * @return id
  **/
  @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
  public Long getId() {
    return id;
  }

  
   /**
   * 
   * @return label
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getLabel() {
    return label;
  }

  
   /**
   * 
   * @return style
  **/
  @ApiModelProperty(value = "")
  public ManualTaskActionStyle getStyle() {
    return style;
  }

  
   /**
   * 
   * @return taskType
  **/
  @ApiModelProperty(value = "")
  public Long getTaskType() {
    return taskType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManualTaskAction manualTaskAction = (ManualTaskAction) o;
    return Objects.equals(this.id, manualTaskAction.id) &&
        Objects.equals(this.label, manualTaskAction.label) &&
        Objects.equals(this.style, manualTaskAction.style) &&
        Objects.equals(this.taskType, manualTaskAction.taskType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, style, taskType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManualTaskAction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
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

