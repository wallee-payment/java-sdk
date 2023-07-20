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
import com.wallee.sdk.model.LabelDescriptorCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class LabelDescriptor {
  
  @JsonProperty("category")
  protected LabelDescriptorCategory category = null;

  
  @JsonProperty("description")
  protected Map<String, String> description = null;

  
  @JsonProperty("features")
  protected List<Long> features = null;

  
  @JsonProperty("group")
  protected Long group = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("name")
  protected Map<String, String> name = null;

  
  @JsonProperty("type")
  protected Long type = null;

  
  @JsonProperty("weight")
  protected Integer weight = null;

  
  
   /**
   * The label&#39;s category.
   * @return category
  **/
  @ApiModelProperty(value = "The label's category.")
  public LabelDescriptorCategory getCategory() {
    return category;
  }

  
   /**
   * The localized description of the object.
   * @return description
  **/
  @ApiModelProperty(value = "The localized description of the object.")
  public Map<String, String> getDescription() {
    return description;
  }

  
   /**
   * The features that this label belongs to.
   * @return features
  **/
  @ApiModelProperty(value = "The features that this label belongs to.")
  public List<Long> getFeatures() {
    return features;
  }

  
   /**
   * The group that this label belongs to.
   * @return group
  **/
  @ApiModelProperty(value = "The group that this label belongs to.")
  public Long getGroup() {
    return group;
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
   * The localized name of the object.
   * @return name
  **/
  @ApiModelProperty(value = "The localized name of the object.")
  public Map<String, String> getName() {
    return name;
  }

  
   /**
   * The type of the label&#39;s value.
   * @return type
  **/
  @ApiModelProperty(value = "The type of the label's value.")
  public Long getType() {
    return type;
  }

  
   /**
   * When listing labels, they can be sorted by this number.
   * @return weight
  **/
  @ApiModelProperty(value = "When listing labels, they can be sorted by this number.")
  public Integer getWeight() {
    return weight;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelDescriptor labelDescriptor = (LabelDescriptor) o;
    return Objects.equals(this.category, labelDescriptor.category) &&
        Objects.equals(this.description, labelDescriptor.description) &&
        Objects.equals(this.features, labelDescriptor.features) &&
        Objects.equals(this.group, labelDescriptor.group) &&
        Objects.equals(this.id, labelDescriptor.id) &&
        Objects.equals(this.name, labelDescriptor.name) &&
        Objects.equals(this.type, labelDescriptor.type) &&
        Objects.equals(this.weight, labelDescriptor.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, description, features, group, id, name, type, weight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelDescriptor {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

