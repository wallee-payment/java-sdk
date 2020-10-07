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

import java.util.List;
import java.util.Map;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
@ApiModel(description = "")

public class FailureReason {
  
  @JsonProperty("category")
  protected FailureCategory category;

  
  @JsonProperty("description")
  protected Map<String, String> description;

  
  @JsonProperty("features")
  protected List<Long> features;

  
  @JsonProperty("id")
  protected Long id;

  
  @JsonProperty("name")
  protected Map<String, String> name;

  
  
   /**
   * 
   * @return category
  **/
  @ApiModelProperty(value = "")
  public FailureCategory getCategory() {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailureReason failureReason = (FailureReason) o;
    return this.category == failureReason.category &&
        Objects.equals(this.description, failureReason.description) &&
        Objects.equals(this.features, failureReason.features) &&
        Objects.equals(this.id, failureReason.id) &&
        Objects.equals(this.name, failureReason.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, description, features, id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailureReason {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

