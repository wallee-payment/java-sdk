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
import com.wallee.sdk.model.SalesChannel;
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

public class SalesChannel {
  
  @JsonProperty("description")
  protected Map<String, String> description = null;

  
  @JsonProperty("icon")
  protected String icon = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("name")
  protected Map<String, String> name = null;

  
  @JsonProperty("parent")
  protected SalesChannel parent = null;

  
  @JsonProperty("sortOrder")
  protected Integer sortOrder = null;

  
  
   /**
   * The description of the object translated into different languages.
   * @return description
  **/
  @ApiModelProperty(value = "The description of the object translated into different languages.")
  public Map<String, String> getDescription() {
    return description;
  }

  
   /**
   * 
   * @return icon
  **/
  @ApiModelProperty(value = "")
  public String getIcon() {
    return icon;
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
   * The name of the object translated into different languages.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the object translated into different languages.")
  public Map<String, String> getName() {
    return name;
  }

  
   /**
   * 
   * @return parent
  **/
  @ApiModelProperty(value = "")
  public SalesChannel getParent() {
    return parent;
  }

  
   /**
   * 
   * @return sortOrder
  **/
  @ApiModelProperty(value = "")
  public Integer getSortOrder() {
    return sortOrder;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesChannel salesChannel = (SalesChannel) o;
    return Objects.equals(this.description, salesChannel.description) &&
        Objects.equals(this.icon, salesChannel.icon) &&
        Objects.equals(this.id, salesChannel.id) &&
        Objects.equals(this.name, salesChannel.name) &&
        Objects.equals(this.parent, salesChannel.parent) &&
        Objects.equals(this.sortOrder, salesChannel.sortOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, icon, id, name, parent, sortOrder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesChannel {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
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

