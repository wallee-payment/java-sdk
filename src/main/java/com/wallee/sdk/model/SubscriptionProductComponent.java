/**
 * SDK
 * <p>
 * This library allows to interact with the  payment service.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.wallee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Objects;


@ApiModel(description = "")

public class SubscriptionProductComponent extends Indentable {

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
     *
     * @return componentChangeWeight
     **/
    @ApiModelProperty(value = "The change weight determines whether if a component change is considered as upgrade or downgrade. If product component with a weight 10 is changed to a product component with a weight 20, the change is considered as upgrade. On the other hand a change from 20 to 10 is considered as a downgrade.")
    public Integer getComponentChangeWeight() {
        return componentChangeWeight;
    }


    /**
     * @return componentGroup
     **/
    @ApiModelProperty(value = "")
    public SubscriptionProductComponentGroup getComponentGroup() {
        return componentGroup;
    }


    /**
     * When a component is marked as a &#39;default&#39; component it is used when no other component is selected by the user.
     *
     * @return defaultComponent
     **/
    @ApiModelProperty(value = "When a component is marked as a 'default' component it is used when no other component is selected by the user.")
    public Boolean isDefaultComponent() {
        return defaultComponent;
    }


    /**
     * The component description may contain a longer description which gives the subscriber a better understanding of what the component contains.
     *
     * @return description
     **/
    @ApiModelProperty(value = "The component description may contain a longer description which gives the subscriber a better understanding of what the component contains.")
    public DatabaseTranslatedString getDescription() {
        return description;
    }


    /**
     * The ID is the primary key of the entity. The ID identifies the entity uniquely.
     *
     * @return id
     **/
    @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
    public Long getId() {
        return id;
    }


    /**
     * The linked space id holds the ID of the space to which the entity belongs to.
     *
     * @return linkedSpaceId
     **/
    @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
    public Long getLinkedSpaceId() {
        return linkedSpaceId;
    }


    /**
     * The maximum quantity defines the maximum value which must be entered for the quantity.
     *
     * @return maximalQuantity
     **/
    @ApiModelProperty(value = "The maximum quantity defines the maximum value which must be entered for the quantity.")
    public BigDecimal getMaximalQuantity() {
        return maximalQuantity;
    }


    /**
     * The minimal quantity defines the minimum value which must be entered for the quantity.
     *
     * @return minimalQuantity
     **/
    @ApiModelProperty(value = "The minimal quantity defines the minimum value which must be entered for the quantity.")
    public BigDecimal getMinimalQuantity() {
        return minimalQuantity;
    }


    /**
     * The component name is shown to the subscriber. It should describe in few words what the component does contain.
     *
     * @return name
     **/
    @ApiModelProperty(value = "The component name is shown to the subscriber. It should describe in few words what the component does contain.")
    public DatabaseTranslatedString getName() {
        return name;
    }


    /**
     * The quantity step defines at which interval the quantity can be increased.
     *
     * @return quantityStep
     **/
    @ApiModelProperty(value = "The quantity step defines at which interval the quantity can be increased.")
    public BigDecimal getQuantityStep() {
        return quantityStep;
    }


    /**
     * The component reference is used to identify the component by external systems and it marks components to represent the same component within different product versions.
     *
     * @return reference
     **/
    @ApiModelProperty(value = "The component reference is used to identify the component by external systems and it marks components to represent the same component within different product versions.")
    public SubscriptionProductComponentReference getReference() {
        return reference;
    }


    /**
     * The sort order controls in which order the component is listed. The sort order is used to order the components in ascending order.
     *
     * @return sortOrder
     **/
    @ApiModelProperty(value = "The sort order controls in which order the component is listed. The sort order is used to order the components in ascending order.")
    public Integer getSortOrder() {
        return sortOrder;
    }


    /**
     * The tax class of the component determines the taxes which are applicable on all fees linked with the component.
     *
     * @return taxClass
     **/
    @ApiModelProperty(value = "The tax class of the component determines the taxes which are applicable on all fees linked with the component.")
    public TaxClass getTaxClass() {
        return taxClass;
    }


    /**
     * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
     *
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

        return "class SubscriptionProductComponent { \n" +
            "    componentChangeWeight: " +  toIndentedString(componentChangeWeight) + " \n" +
            "    componentGroup: " + toIndentedString(componentGroup) +  "\n" +
            "    defaultComponent: " + toIndentedString(defaultComponent) + " \n" +
            "    description: " + toIndentedString(description) + " \n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) + " \n" +
            "    maximalQuantity: " + toIndentedString(maximalQuantity) +  "\n" +
            "    minimalQuantity: " + toIndentedString(minimalQuantity) + " \n" +
            "    name: " + toIndentedString(name) + "\n" +
            "    quantityStep: " + toIndentedString(quantityStep) + " \n" +
            "    reference: " +  toIndentedString(reference) + " \n" +
            "    sortOrder: " + toIndentedString(sortOrder) + " \n" +
            "    taxClass: " + toIndentedString(taxClass) + " \n" +
            "    version: " + toIndentedString(version) + " \n" +
            "}";
        }


}

