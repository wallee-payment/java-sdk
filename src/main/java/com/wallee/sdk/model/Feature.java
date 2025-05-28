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
   * Whether the feature is in beta stage and there may still be some issues.
   * @return beta
  **/
  @ApiModelProperty(value = "Whether the feature is in beta stage and there may still be some issues.")
  public Boolean isBeta() {
    return beta;
  }

  
   /**
   * The category that the feature belongs to.
   * @return category
  **/
  @ApiModelProperty(value = "The category that the feature belongs to.")
  public FeatureCategory getCategory() {
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
   * A unique identifier for the object.
   * @return id
  **/
  @ApiModelProperty(value = "A unique identifier for the object.")
  public Long getId() {
    return id;
  }

  
   /**
   * The path to the feature&#39;s logo image.
   * @return logoPath
  **/
  @ApiModelProperty(value = "The path to the feature's logo image.")
  public String getLogoPath() {
    return logoPath;
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
   * The features that must be enabled for this feature to work properly.
   * @return requiredFeatures
  **/
  @ApiModelProperty(value = "The features that must be enabled for this feature to work properly.")
  public List<Long> getRequiredFeatures() {
    return requiredFeatures;
  }

  
   /**
   * When listing features, they can be sorted by this number.
   * @return sortOrder
  **/
  @ApiModelProperty(value = "When listing features, they can be sorted by this number.")
  public Integer getSortOrder() {
    return sortOrder;
  }

  
   /**
   * Whether the feature is visible to the user.
   * @return visible
  **/
  @ApiModelProperty(value = "Whether the feature is visible to the user.")
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

