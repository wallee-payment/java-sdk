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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class SubscriptionProductComponentGroupUpdate {
  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("version")
  protected Long version = null;

  
  @JsonProperty("name")
  protected Map<String, String> name = null;

  
  @JsonProperty("optional")
  protected Boolean optional = null;

  
  @JsonProperty("productVersion")
  protected Long productVersion = null;

  
  @JsonProperty("sortOrder")
  protected Integer sortOrder = null;

  
  
  public SubscriptionProductComponentGroupUpdate id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The ID is the primary key of the entity. The ID identifies the entity uniquely.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  
  public SubscriptionProductComponentGroupUpdate version(Long version) {
    this.version = version;
    return this;
  }

   /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
  **/
  @ApiModelProperty(required = true, value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  
  public SubscriptionProductComponentGroupUpdate name(Map<String, String> name) {
    this.name = name;
    return this;
  }

  public SubscriptionProductComponentGroupUpdate putNameItem(String key, String nameItem) {
    if (this.name == null) {
      this.name = new HashMap<>();
    }
    this.name.put(key, nameItem);
    return this;
  }

   /**
   * The localized name of the component group that is displayed to the customer.
   * @return name
  **/
  @ApiModelProperty(value = "The localized name of the component group that is displayed to the customer.")
  public Map<String, String> getName() {
    return name;
  }

  public void setName(Map<String, String> name) {
    this.name = name;
  }

  
  public SubscriptionProductComponentGroupUpdate optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

   /**
   * Whether the component group is optional, i.e. the customer does not have to select any component.
   * @return optional
  **/
  @ApiModelProperty(value = "Whether the component group is optional, i.e. the customer does not have to select any component.")
  public Boolean isOptional() {
    return optional;
  }

  public void setOptional(Boolean optional) {
    this.optional = optional;
  }

  
  public SubscriptionProductComponentGroupUpdate productVersion(Long productVersion) {
    this.productVersion = productVersion;
    return this;
  }

   /**
   * The product version that the component group belongs to.
   * @return productVersion
  **/
  @ApiModelProperty(value = "The product version that the component group belongs to.")
  public Long getProductVersion() {
    return productVersion;
  }

  public void setProductVersion(Long productVersion) {
    this.productVersion = productVersion;
  }

  
  public SubscriptionProductComponentGroupUpdate sortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * When listing component groups, they can be sorted by this number.
   * @return sortOrder
  **/
  @ApiModelProperty(value = "When listing component groups, they can be sorted by this number.")
  public Integer getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionProductComponentGroupUpdate subscriptionProductComponentGroupUpdate = (SubscriptionProductComponentGroupUpdate) o;
    return Objects.equals(this.id, subscriptionProductComponentGroupUpdate.id) &&
        Objects.equals(this.version, subscriptionProductComponentGroupUpdate.version) &&
        Objects.equals(this.name, subscriptionProductComponentGroupUpdate.name) &&
        Objects.equals(this.optional, subscriptionProductComponentGroupUpdate.optional) &&
        Objects.equals(this.productVersion, subscriptionProductComponentGroupUpdate.productVersion) &&
        Objects.equals(this.sortOrder, subscriptionProductComponentGroupUpdate.sortOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, name, optional, productVersion, sortOrder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProductComponentGroupUpdate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    productVersion: ").append(toIndentedString(productVersion)).append("\n");
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

