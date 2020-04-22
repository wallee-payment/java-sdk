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
import com.wallee.sdk.model.FeatureCategory;
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
@javax.annotation.Generated(value = "io.wallee.sdk.java.WalleeJavaClientCodegen", date = "2020-04-22T16:32:44.639+02:00")
public class Feature {
  
  @JsonProperty("beta")
  protected Boolean beta = null;

  
  @JsonProperty("category")
  protected FeatureCategory category = null;

  
  @JsonProperty("description")
  protected Map<String, String> description = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("logoPath")
  protected String logoPath = null;

  
  @JsonProperty("name")
  protected Map<String, String> name = null;

  
  @JsonProperty("requiredFeatures")
  protected List<Long> requiredFeatures = null;

  
  @JsonProperty("sortOrder")
  protected Integer sortOrder = null;

  
  @JsonProperty("visible")
  protected Boolean visible = null;

  
  
   /**
   * 
   * @return beta
  **/
  @ApiModelProperty(value = "")
  public Boolean isBeta() {
    return beta;
  }

  
   /**
   * 
   * @return category
  **/
  @ApiModelProperty(value = "")
  public FeatureCategory getCategory() {
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
   * The ID is the primary key of the entity. The ID identifies the entity uniquely.
   * @return id
  **/
  @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
  public Long getId() {
    return id;
  }

  
   /**
   * 
   * @return logoPath
  **/
  @ApiModelProperty(value = "")
  public String getLogoPath() {
    return logoPath;
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
   * @return requiredFeatures
  **/
  @ApiModelProperty(value = "")
  public List<Long> getRequiredFeatures() {
    return requiredFeatures;
  }

  
   /**
   * 
   * @return sortOrder
  **/
  @ApiModelProperty(value = "")
  public Integer getSortOrder() {
    return sortOrder;
  }

  
   /**
   * 
   * @return visible
  **/
  @ApiModelProperty(value = "")
  public Boolean isVisible() {
    return visible;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Feature feature = (Feature) o;
    return Objects.equals(this.beta, feature.beta) &&
        Objects.equals(this.category, feature.category) &&
        Objects.equals(this.description, feature.description) &&
        Objects.equals(this.id, feature.id) &&
        Objects.equals(this.logoPath, feature.logoPath) &&
        Objects.equals(this.name, feature.name) &&
        Objects.equals(this.requiredFeatures, feature.requiredFeatures) &&
        Objects.equals(this.sortOrder, feature.sortOrder) &&
        Objects.equals(this.visible, feature.visible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beta, category, description, id, logoPath, name, requiredFeatures, sortOrder, visible);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feature {\n");
    
    sb.append("    beta: ").append(toIndentedString(beta)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    logoPath: ").append(toIndentedString(logoPath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    requiredFeatures: ").append(toIndentedString(requiredFeatures)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
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

