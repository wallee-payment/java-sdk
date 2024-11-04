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
import com.wallee.sdk.model.ProductMeteredTierPricing;
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

public class ProductMeteredFeeUpdate {
  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("version")
  protected Long version = null;

  
  @JsonProperty("component")
  protected Long component = null;

  
  @JsonProperty("description")
  protected Map<String, String> description = null;

  
  @JsonProperty("metric")
  protected Long metric = null;

  
  @JsonProperty("name")
  protected Map<String, String> name = null;

  
  @JsonProperty("tierPricing")
  protected ProductMeteredTierPricing tierPricing = null;

  
  
  public ProductMeteredFeeUpdate id(Long id) {
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

  
  public ProductMeteredFeeUpdate version(Long version) {
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

  
  public ProductMeteredFeeUpdate component(Long component) {
    this.component = component;
    return this;
  }

   /**
   * The product component that the fee belongs to.
   * @return component
  **/
  @ApiModelProperty(value = "The product component that the fee belongs to.")
  public Long getComponent() {
    return component;
  }

  public void setComponent(Long component) {
    this.component = component;
  }

  
  public ProductMeteredFeeUpdate description(Map<String, String> description) {
    this.description = description;
    return this;
  }

  public ProductMeteredFeeUpdate putDescriptionItem(String key, String descriptionItem) {
    if (this.description == null) {
      this.description = new HashMap<>();
    }
    this.description.put(key, descriptionItem);
    return this;
  }

   /**
   * The localized description of the fee that is displayed to the customer.
   * @return description
  **/
  @ApiModelProperty(value = "The localized description of the fee that is displayed to the customer.")
  public Map<String, String> getDescription() {
    return description;
  }

  public void setDescription(Map<String, String> description) {
    this.description = description;
  }

  
  public ProductMeteredFeeUpdate metric(Long metric) {
    this.metric = metric;
    return this;
  }

   /**
   * The metric used to determine the resource consumption billed to the customer.
   * @return metric
  **/
  @ApiModelProperty(value = "The metric used to determine the resource consumption billed to the customer.")
  public Long getMetric() {
    return metric;
  }

  public void setMetric(Long metric) {
    this.metric = metric;
  }

  
  public ProductMeteredFeeUpdate name(Map<String, String> name) {
    this.name = name;
    return this;
  }

  public ProductMeteredFeeUpdate putNameItem(String key, String nameItem) {
    if (this.name == null) {
      this.name = new HashMap<>();
    }
    this.name.put(key, nameItem);
    return this;
  }

   /**
   * The localized name of the fee that is displayed to the customer.
   * @return name
  **/
  @ApiModelProperty(value = "The localized name of the fee that is displayed to the customer.")
  public Map<String, String> getName() {
    return name;
  }

  public void setName(Map<String, String> name) {
    this.name = name;
  }

  
  public ProductMeteredFeeUpdate tierPricing(ProductMeteredTierPricing tierPricing) {
    this.tierPricing = tierPricing;
    return this;
  }

   /**
   * The method used to calculate the tier price.
   * @return tierPricing
  **/
  @ApiModelProperty(value = "The method used to calculate the tier price.")
  public ProductMeteredTierPricing getTierPricing() {
    return tierPricing;
  }

  public void setTierPricing(ProductMeteredTierPricing tierPricing) {
    this.tierPricing = tierPricing;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductMeteredFeeUpdate productMeteredFeeUpdate = (ProductMeteredFeeUpdate) o;
    return Objects.equals(this.id, productMeteredFeeUpdate.id) &&
        Objects.equals(this.version, productMeteredFeeUpdate.version) &&
        Objects.equals(this.component, productMeteredFeeUpdate.component) &&
        Objects.equals(this.description, productMeteredFeeUpdate.description) &&
        Objects.equals(this.metric, productMeteredFeeUpdate.metric) &&
        Objects.equals(this.name, productMeteredFeeUpdate.name) &&
        Objects.equals(this.tierPricing, productMeteredFeeUpdate.tierPricing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, component, description, metric, name, tierPricing);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductMeteredFeeUpdate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tierPricing: ").append(toIndentedString(tierPricing)).append("\n");
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

