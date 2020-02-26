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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.wallee.sdk.model.LabelDescriptorCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
public class LabelDescriptor {
  
  @SerializedName("category")
  protected LabelDescriptorCategory category = null;

  
  @SerializedName("description")
  protected Map<String, String> description = null;

  
  @SerializedName("features")
  protected List<Long> features = null;

  
  @SerializedName("group")
  protected Long group = null;

  
  @SerializedName("id")
  protected Long id = null;

  
  @SerializedName("name")
  protected Map<String, String> name = null;

  
  @SerializedName("type")
  protected Long type = null;

  
  @SerializedName("weight")
  protected Integer weight = null;

  
  
   /**
   * 
   * @return category
  **/
  @ApiModelProperty(value = "")
  public LabelDescriptorCategory getCategory() {
    return category;
  }

  
   /**
   * 
   * @return description
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getDescription() {
    return description;
  }

  
   /**
   * 
   * @return features
  **/
  @ApiModelProperty(value = "")
  public List<Long> getFeatures() {
    return features;
  }

  
   /**
   * 
   * @return group
  **/
  @ApiModelProperty(value = "")
  public Long getGroup() {
    return group;
  }

  
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
   * @return name
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getName() {
    return name;
  }

  
   /**
   * 
   * @return type
  **/
  @ApiModelProperty(value = "")
  public Long getType() {
    return type;
  }

  
   /**
   * 
   * @return weight
  **/
  @ApiModelProperty(value = "")
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

