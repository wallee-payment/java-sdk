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

import java.math.BigDecimal;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
@ApiModel(description = "")

public class SubscriptionProductComponent {
  
  @JsonProperty("componentChangeWeight")
  protected Integer componentChangeWeight;

  
  @JsonProperty("componentGroup")
  protected SubscriptionProductComponentGroup componentGroup;

  
  @JsonProperty("defaultComponent")
  protected Boolean defaultComponent;

  
  @JsonProperty("description")
  protected DatabaseTranslatedString description;

  
  @JsonProperty("id")
  protected Long id;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId;

  
  @JsonProperty("maximalQuantity")
  protected BigDecimal maximalQuantity;

  
  @JsonProperty("minimalQuantity")
  protected BigDecimal minimalQuantity;

  
  @JsonProperty("name")
  protected DatabaseTranslatedString name;

  
  @JsonProperty("quantityStep")
  protected BigDecimal quantityStep;

  
  @JsonProperty("reference")
  protected SubscriptionProductComponentReference reference;

  
  @JsonProperty("sortOrder")
  protected Integer sortOrder;

  
  @JsonProperty("taxClass")
  protected TaxClass taxClass;

  
  @JsonProperty("version")
  protected Integer version;

  
  
   /**
   * The change weight determines whether if a component change is considered as upgrade or downgrade. If product component with a weight 10 is changed to a product component with a weight 20, the change is considered as upgrade. On the other hand a change from 20 to 10 is considered as a downgrade.
   * @return componentChangeWeight
  **/
  @ApiModelProperty(value = "The change weight determines whether if a component change is considered as upgrade or downgrade. If product component with a weight 10 is changed to a product component with a weight 20, the change is considered as upgrade. On the other hand a change from 20 to 10 is considered as a downgrade.")
  public Integer getComponentChangeWeight() {
    return componentChangeWeight;
  }

  
   /**
   * 
   * @return componentGroup
  **/
  @ApiModelProperty(value = "")
  public SubscriptionProductComponentGroup getComponentGroup() {
    return componentGroup;
  }

  
   /**
   * When a component is marked as a &#39;default&#39; component it is used when no other component is selected by the user.
   * @return defaultComponent
  **/
  @ApiModelProperty(value = "When a component is marked as a 'default' component it is used when no other component is selected by the user.")
  public Boolean isDefaultComponent() {
    return defaultComponent;
  }

  
   /**
   * The component description may contain a longer description which gives the subscriber a better understanding of what the component contains.
   * @return description
  **/
  @ApiModelProperty(value = "The component description may contain a longer description which gives the subscriber a better understanding of what the component contains.")
  public DatabaseTranslatedString getDescription() {
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
   * The linked space id holds the ID of the space to which the entity belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The maximum quantity defines the maximum value which must be entered for the quantity.
   * @return maximalQuantity
  **/
  @ApiModelProperty(value = "The maximum quantity defines the maximum value which must be entered for the quantity.")
  public BigDecimal getMaximalQuantity() {
    return maximalQuantity;
  }

  
   /**
   * The minimal quantity defines the minimum value which must be entered for the quantity.
   * @return minimalQuantity
  **/
  @ApiModelProperty(value = "The minimal quantity defines the minimum value which must be entered for the quantity.")
  public BigDecimal getMinimalQuantity() {
    return minimalQuantity;
  }

  
   /**
   * The component name is shown to the subscriber. It should describe in few words what the component does contain.
   * @return name
  **/
  @ApiModelProperty(value = "The component name is shown to the subscriber. It should describe in few words what the component does contain.")
  public DatabaseTranslatedString getName() {
    return name;
  }

  
   /**
   * The quantity step defines at which interval the quantity can be increased.
   * @return quantityStep
  **/
  @ApiModelProperty(value = "The quantity step defines at which interval the quantity can be increased.")
  public BigDecimal getQuantityStep() {
    return quantityStep;
  }

  
   /**
   * The component reference is used to identify the component by external systems and it marks components to represent the same component within different product versions.
   * @return reference
  **/
  @ApiModelProperty(value = "The component reference is used to identify the component by external systems and it marks components to represent the same component within different product versions.")
  public SubscriptionProductComponentReference getReference() {
    return reference;
  }

  
   /**
   * The sort order controls in which order the component is listed. The sort order is used to order the components in ascending order.
   * @return sortOrder
  **/
  @ApiModelProperty(value = "The sort order controls in which order the component is listed. The sort order is used to order the components in ascending order.")
  public Integer getSortOrder() {
    return sortOrder;
  }

  
   /**
   * The tax class of the component determines the taxes which are applicable on all fees linked with the component.
   * @return taxClass
  **/
  @ApiModelProperty(value = "The tax class of the component determines the taxes which are applicable on all fees linked with the component.")
  public TaxClass getTaxClass() {
    return taxClass;
  }

  
   /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
  **/
  @ApiModelProperty(value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
  public Integer getVersion() {
    return version;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionProductComponent subscriptionProductComponent = (SubscriptionProductComponent) o;
    return Objects.equals(this.componentChangeWeight, subscriptionProductComponent.componentChangeWeight) &&
        Objects.equals(this.componentGroup, subscriptionProductComponent.componentGroup) &&
        Objects.equals(this.defaultComponent, subscriptionProductComponent.defaultComponent) &&
        Objects.equals(this.description, subscriptionProductComponent.description) &&
        Objects.equals(this.id, subscriptionProductComponent.id) &&
        Objects.equals(this.linkedSpaceId, subscriptionProductComponent.linkedSpaceId) &&
        Objects.equals(this.maximalQuantity, subscriptionProductComponent.maximalQuantity) &&
        Objects.equals(this.minimalQuantity, subscriptionProductComponent.minimalQuantity) &&
        Objects.equals(this.name, subscriptionProductComponent.name) &&
        Objects.equals(this.quantityStep, subscriptionProductComponent.quantityStep) &&
        Objects.equals(this.reference, subscriptionProductComponent.reference) &&
        Objects.equals(this.sortOrder, subscriptionProductComponent.sortOrder) &&
        Objects.equals(this.taxClass, subscriptionProductComponent.taxClass) &&
        Objects.equals(this.version, subscriptionProductComponent.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentChangeWeight, componentGroup, defaultComponent, description, id, linkedSpaceId, maximalQuantity, minimalQuantity, name, quantityStep, reference, sortOrder, taxClass, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProductComponent {\n");
    
    sb.append("    componentChangeWeight: ").append(toIndentedString(componentChangeWeight)).append("\n");
    sb.append("    componentGroup: ").append(toIndentedString(componentGroup)).append("\n");
    sb.append("    defaultComponent: ").append(toIndentedString(defaultComponent)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    maximalQuantity: ").append(toIndentedString(maximalQuantity)).append("\n");
    sb.append("    minimalQuantity: ").append(toIndentedString(minimalQuantity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quantityStep: ").append(toIndentedString(quantityStep)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    taxClass: ").append(toIndentedString(taxClass)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

