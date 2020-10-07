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

import java.util.Map;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The subscription metric type identifies the type of the metric.
 */
@ApiModel(description = "The subscription metric type identifies the type of the metric.")

public class SubscriptionMetricType {
  
  @JsonProperty("description")
  protected Map<String, String> description;

  
  @JsonProperty("feature")
  protected Feature feature;

  
  @JsonProperty("id")
  protected Long id;

  
  @JsonProperty("name")
  protected Map<String, String> name;

  
  
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
   * @return feature
  **/
  @ApiModelProperty(value = "")
  public Feature getFeature() {
    return feature;
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
    SubscriptionMetricType subscriptionMetricType = (SubscriptionMetricType) o;
    return Objects.equals(this.description, subscriptionMetricType.description) &&
        Objects.equals(this.feature, subscriptionMetricType.feature) &&
        Objects.equals(this.id, subscriptionMetricType.id) &&
        Objects.equals(this.name, subscriptionMetricType.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, feature, id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionMetricType {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
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

