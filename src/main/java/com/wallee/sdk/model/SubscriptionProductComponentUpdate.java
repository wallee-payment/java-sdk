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
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class SubscriptionProductComponentUpdate {
  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("version")
  protected Long version = null;

  
  @JsonProperty("componentChangeWeight")
  protected Integer componentChangeWeight = null;

  
  @JsonProperty("componentGroup")
  protected Long componentGroup = null;

  
  @JsonProperty("defaultComponent")
  protected Boolean defaultComponent = null;

  
  @JsonProperty("description")
  protected Map<String, String> description = null;

  
  @JsonProperty("maximalQuantity")
  protected BigDecimal maximalQuantity = null;

  
  @JsonProperty("minimalQuantity")
  protected BigDecimal minimalQuantity = null;

  
  @JsonProperty("name")
  protected Map<String, String> name = null;

  
  @JsonProperty("quantityStep")
  protected BigDecimal quantityStep = null;

  
  @JsonProperty("reference")
  protected Long reference = null;

  
  @JsonProperty("sortOrder")
  protected Integer sortOrder = null;

  
  @JsonProperty("taxClass")
  protected Long taxClass = null;

  
  
  public SubscriptionProductComponentUpdate id(Long id) {
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

  
  public SubscriptionProductComponentUpdate version(Long version) {
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

  
  public SubscriptionProductComponentUpdate componentChangeWeight(Integer componentChangeWeight) {
    this.componentChangeWeight = componentChangeWeight;
    return this;
  }

   /**
   * If switching from a component with a lower tier to a component with a higher one, this is considered an upgrade and a fee may be applied.
   * @return componentChangeWeight
  **/
  @ApiModelProperty(value = "If switching from a component with a lower tier to a component with a higher one, this is considered an upgrade and a fee may be applied.")
  public Integer getComponentChangeWeight() {
    return componentChangeWeight;
  }

  public void setComponentChangeWeight(Integer componentChangeWeight) {
    this.componentChangeWeight = componentChangeWeight;
  }

  
  public SubscriptionProductComponentUpdate componentGroup(Long componentGroup) {
    this.componentGroup = componentGroup;
    return this;
  }

   /**
   * The group that the component belongs to.
   * @return componentGroup
  **/
  @ApiModelProperty(value = "The group that the component belongs to.")
  public Long getComponentGroup() {
    return componentGroup;
  }

  public void setComponentGroup(Long componentGroup) {
    this.componentGroup = componentGroup;
  }

  
  public SubscriptionProductComponentUpdate defaultComponent(Boolean defaultComponent) {
    this.defaultComponent = defaultComponent;
    return this;
  }

   /**
   * Whether this is the default component in its group and preselected.
   * @return defaultComponent
  **/
  @ApiModelProperty(value = "Whether this is the default component in its group and preselected.")
  public Boolean isDefaultComponent() {
    return defaultComponent;
  }

  public void setDefaultComponent(Boolean defaultComponent) {
    this.defaultComponent = defaultComponent;
  }

  
  public SubscriptionProductComponentUpdate description(Map<String, String> description) {
    this.description = description;
    return this;
  }

  public SubscriptionProductComponentUpdate putDescriptionItem(String key, String descriptionItem) {
    if (this.description == null) {
      this.description = new HashMap<>();
    }
    this.description.put(key, descriptionItem);
    return this;
  }

   /**
   * The localized description of the component that is displayed to the customer.
   * @return description
  **/
  @ApiModelProperty(value = "The localized description of the component that is displayed to the customer.")
  public Map<String, String> getDescription() {
    return description;
  }

  public void setDescription(Map<String, String> description) {
    this.description = description;
  }

  
  public SubscriptionProductComponentUpdate maximalQuantity(BigDecimal maximalQuantity) {
    this.maximalQuantity = maximalQuantity;
    return this;
  }

   /**
   * A maximum of the defined quantity can be selected for this component.
   * @return maximalQuantity
  **/
  @ApiModelProperty(value = "A maximum of the defined quantity can be selected for this component.")
  public BigDecimal getMaximalQuantity() {
    return maximalQuantity;
  }

  public void setMaximalQuantity(BigDecimal maximalQuantity) {
    this.maximalQuantity = maximalQuantity;
  }

  
  public SubscriptionProductComponentUpdate minimalQuantity(BigDecimal minimalQuantity) {
    this.minimalQuantity = minimalQuantity;
    return this;
  }

   /**
   * A minimum of the defined quantity must be selected for this component.
   * @return minimalQuantity
  **/
  @ApiModelProperty(value = "A minimum of the defined quantity must be selected for this component.")
  public BigDecimal getMinimalQuantity() {
    return minimalQuantity;
  }

  public void setMinimalQuantity(BigDecimal minimalQuantity) {
    this.minimalQuantity = minimalQuantity;
  }

  
  public SubscriptionProductComponentUpdate name(Map<String, String> name) {
    this.name = name;
    return this;
  }

  public SubscriptionProductComponentUpdate putNameItem(String key, String nameItem) {
    if (this.name == null) {
      this.name = new HashMap<>();
    }
    this.name.put(key, nameItem);
    return this;
  }

   /**
   * The localized name of the component that is displayed to the customer.
   * @return name
  **/
  @ApiModelProperty(value = "The localized name of the component that is displayed to the customer.")
  public Map<String, String> getName() {
    return name;
  }

  public void setName(Map<String, String> name) {
    this.name = name;
  }

  
  public SubscriptionProductComponentUpdate quantityStep(BigDecimal quantityStep) {
    this.quantityStep = quantityStep;
    return this;
  }

   /**
   * The quantity step determines the interval in which the quantity can be increased.
   * @return quantityStep
  **/
  @ApiModelProperty(value = "The quantity step determines the interval in which the quantity can be increased.")
  public BigDecimal getQuantityStep() {
    return quantityStep;
  }

  public void setQuantityStep(BigDecimal quantityStep) {
    this.quantityStep = quantityStep;
  }

  
  public SubscriptionProductComponentUpdate reference(Long reference) {
    this.reference = reference;
    return this;
  }

   /**
   * The reference is used to link components across different product versions.
   * @return reference
  **/
  @ApiModelProperty(value = "The reference is used to link components across different product versions.")
  public Long getReference() {
    return reference;
  }

  public void setReference(Long reference) {
    this.reference = reference;
  }

  
  public SubscriptionProductComponentUpdate sortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * When listing components, they can be sorted by this number.
   * @return sortOrder
  **/
  @ApiModelProperty(value = "When listing components, they can be sorted by this number.")
  public Integer getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

  
  public SubscriptionProductComponentUpdate taxClass(Long taxClass) {
    this.taxClass = taxClass;
    return this;
  }

   /**
   * The tax class to be applied to fees.
   * @return taxClass
  **/
  @ApiModelProperty(value = "The tax class to be applied to fees.")
  public Long getTaxClass() {
    return taxClass;
  }

  public void setTaxClass(Long taxClass) {
    this.taxClass = taxClass;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionProductComponentUpdate subscriptionProductComponentUpdate = (SubscriptionProductComponentUpdate) o;
    return Objects.equals(this.id, subscriptionProductComponentUpdate.id) &&
        Objects.equals(this.version, subscriptionProductComponentUpdate.version) &&
        Objects.equals(this.componentChangeWeight, subscriptionProductComponentUpdate.componentChangeWeight) &&
        Objects.equals(this.componentGroup, subscriptionProductComponentUpdate.componentGroup) &&
        Objects.equals(this.defaultComponent, subscriptionProductComponentUpdate.defaultComponent) &&
        Objects.equals(this.description, subscriptionProductComponentUpdate.description) &&
        Objects.equals(this.maximalQuantity, subscriptionProductComponentUpdate.maximalQuantity) &&
        Objects.equals(this.minimalQuantity, subscriptionProductComponentUpdate.minimalQuantity) &&
        Objects.equals(this.name, subscriptionProductComponentUpdate.name) &&
        Objects.equals(this.quantityStep, subscriptionProductComponentUpdate.quantityStep) &&
        Objects.equals(this.reference, subscriptionProductComponentUpdate.reference) &&
        Objects.equals(this.sortOrder, subscriptionProductComponentUpdate.sortOrder) &&
        Objects.equals(this.taxClass, subscriptionProductComponentUpdate.taxClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, componentChangeWeight, componentGroup, defaultComponent, description, maximalQuantity, minimalQuantity, name, quantityStep, reference, sortOrder, taxClass);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProductComponentUpdate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    componentChangeWeight: ").append(toIndentedString(componentChangeWeight)).append("\n");
    sb.append("    componentGroup: ").append(toIndentedString(componentGroup)).append("\n");
    sb.append("    defaultComponent: ").append(toIndentedString(defaultComponent)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    maximalQuantity: ").append(toIndentedString(maximalQuantity)).append("\n");
    sb.append("    minimalQuantity: ").append(toIndentedString(minimalQuantity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quantityStep: ").append(toIndentedString(quantityStep)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    taxClass: ").append(toIndentedString(taxClass)).append("\n");
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

