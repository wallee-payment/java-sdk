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

public class Permission {
  
  @JsonProperty("description")
  protected Map<String, String> description = null;

  
  @JsonProperty("feature")
  protected Long feature = null;

  
  @JsonProperty("group")
  protected Boolean group = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("leaf")
  protected Boolean leaf = null;

  
  @JsonProperty("name")
  protected Map<String, String> name = null;

  
  @JsonProperty("parent")
  protected Long parent = null;

  
  @JsonProperty("pathToRoot")
  protected List<Long> pathToRoot = null;

  
  @JsonProperty("title")
  protected Map<String, String> title = null;

  
  @JsonProperty("twoFactorRequired")
  protected Boolean twoFactorRequired = null;

  
  @JsonProperty("webAppEnabled")
  protected Boolean webAppEnabled = null;

  
  
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
  public Long getFeature() {
    return feature;
  }

  
   /**
   * 
   * @return group
  **/
  @ApiModelProperty(value = "")
  public Boolean isGroup() {
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
   * @return leaf
  **/
  @ApiModelProperty(value = "")
  public Boolean isLeaf() {
    return leaf;
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
   * @return parent
  **/
  @ApiModelProperty(value = "")
  public Long getParent() {
    return parent;
  }

  
   /**
   * 
   * @return pathToRoot
  **/
  @ApiModelProperty(value = "")
  public List<Long> getPathToRoot() {
    return pathToRoot;
  }

  
   /**
   * 
   * @return title
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getTitle() {
    return title;
  }

  
   /**
   * 
   * @return twoFactorRequired
  **/
  @ApiModelProperty(value = "")
  public Boolean isTwoFactorRequired() {
    return twoFactorRequired;
  }

  
   /**
   * 
   * @return webAppEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isWebAppEnabled() {
    return webAppEnabled;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Permission permission = (Permission) o;
    return Objects.equals(this.description, permission.description) &&
        Objects.equals(this.feature, permission.feature) &&
        Objects.equals(this.group, permission.group) &&
        Objects.equals(this.id, permission.id) &&
        Objects.equals(this.leaf, permission.leaf) &&
        Objects.equals(this.name, permission.name) &&
        Objects.equals(this.parent, permission.parent) &&
        Objects.equals(this.pathToRoot, permission.pathToRoot) &&
        Objects.equals(this.title, permission.title) &&
        Objects.equals(this.twoFactorRequired, permission.twoFactorRequired) &&
        Objects.equals(this.webAppEnabled, permission.webAppEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, feature, group, id, leaf, name, parent, pathToRoot, title, twoFactorRequired, webAppEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Permission {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    leaf: ").append(toIndentedString(leaf)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    pathToRoot: ").append(toIndentedString(pathToRoot)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    twoFactorRequired: ").append(toIndentedString(twoFactorRequired)).append("\n");
    sb.append("    webAppEnabled: ").append(toIndentedString(webAppEnabled)).append("\n");
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

