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
import com.wallee.sdk.model.DatabaseTranslatedStringCreate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
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
  protected DatabaseTranslatedStringCreate description = null;

  
  @JsonProperty("maximalQuantity")
  protected BigDecimal maximalQuantity = null;

  
  @JsonProperty("minimalQuantity")
  protected BigDecimal minimalQuantity = null;

  
  @JsonProperty("name")
  protected DatabaseTranslatedStringCreate name = null;

  
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
   * The change weight determines whether if a component change is considered as upgrade or downgrade. If product component with a weight 10 is changed to a product component with a weight 20, the change is considered as upgrade. On the other hand a change from 20 to 10 is considered as a downgrade.
   * @return componentChangeWeight
  **/
  @ApiModelProperty(value = "The change weight determines whether if a component change is considered as upgrade or downgrade. If product component with a weight 10 is changed to a product component with a weight 20, the change is considered as upgrade. On the other hand a change from 20 to 10 is considered as a downgrade.")
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
   * 
   * @return componentGroup
  **/
  @ApiModelProperty(value = "")
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
   * When a component is marked as a &#39;default&#39; component it is used when no other component is selected by the user.
   * @return defaultComponent
  **/
  @ApiModelProperty(value = "When a component is marked as a 'default' component it is used when no other component is selected by the user.")
  public Boolean isDefaultComponent() {
    return defaultComponent;
  }

  public void setDefaultComponent(Boolean defaultComponent) {
    this.defaultComponent = defaultComponent;
  }

  
  public SubscriptionProductComponentUpdate description(DatabaseTranslatedStringCreate description) {
    this.description = description;
    return this;
  }

   /**
   * The component description may contain a longer description which gives the subscriber a better understanding of what the component contains.
   * @return description
  **/
  @ApiModelProperty(value = "The component description may contain a longer description which gives the subscriber a better understanding of what the component contains.")
  public DatabaseTranslatedStringCreate getDescription() {
    return description;
  }

  public void setDescription(DatabaseTranslatedStringCreate description) {
    this.description = description;
  }

  
  public SubscriptionProductComponentUpdate maximalQuantity(BigDecimal maximalQuantity) {
    this.maximalQuantity = maximalQuantity;
    return this;
  }

   /**
   * The maximum quantity defines the maximum value which must be entered for the quantity.
   * @return maximalQuantity
  **/
  @ApiModelProperty(value = "The maximum quantity defines the maximum value which must be entered for the quantity.")
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
   * The minimal quantity defines the minimum value which must be entered for the quantity.
   * @return minimalQuantity
  **/
  @ApiModelProperty(value = "The minimal quantity defines the minimum value which must be entered for the quantity.")
  public BigDecimal getMinimalQuantity() {
    return minimalQuantity;
  }

  public void setMinimalQuantity(BigDecimal minimalQuantity) {
    this.minimalQuantity = minimalQuantity;
  }

  
  public SubscriptionProductComponentUpdate name(DatabaseTranslatedStringCreate name) {
    this.name = name;
    return this;
  }

   /**
   * The component name is shown to the subscriber. It should describe in few words what the component does contain.
   * @return name
  **/
  @ApiModelProperty(value = "The component name is shown to the subscriber. It should describe in few words what the component does contain.")
  public DatabaseTranslatedStringCreate getName() {
    return name;
  }

  public void setName(DatabaseTranslatedStringCreate name) {
    this.name = name;
  }

  
  public SubscriptionProductComponentUpdate quantityStep(BigDecimal quantityStep) {
    this.quantityStep = quantityStep;
    return this;
  }

   /**
   * The quantity step defines at which interval the quantity can be increased.
   * @return quantityStep
  **/
  @ApiModelProperty(value = "The quantity step defines at which interval the quantity can be increased.")
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
   * The component reference is used to identify the component by external systems and it marks components to represent the same component within different product versions.
   * @return reference
  **/
  @ApiModelProperty(value = "The component reference is used to identify the component by external systems and it marks components to represent the same component within different product versions.")
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
   * The sort order controls in which order the component is listed. The sort order is used to order the components in ascending order.
   * @return sortOrder
  **/
  @ApiModelProperty(value = "The sort order controls in which order the component is listed. The sort order is used to order the components in ascending order.")
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
   * The tax class of the component determines the taxes which are applicable on all fees linked with the component.
   * @return taxClass
  **/
  @ApiModelProperty(value = "The tax class of the component determines the taxes which are applicable on all fees linked with the component.")
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

