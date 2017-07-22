/**
 * Wallee SDK Client
 *
 * This client allows to interact with the Wallee API.
 *
 * Wallee API: 1.0.0
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.wallee.sdk.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.wallee.sdk.model.DatabaseTranslatedString;
import com.wallee.sdk.model.SubscriptionProductComponentGroup;
import com.wallee.sdk.model.SubscriptionProductComponentReference;
import com.wallee.sdk.model.TaxClass;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class SubscriptionProductComponent {
	@SerializedName("componentChangeWeight")
	private Integer componentChangeWeight = null;

	@SerializedName("componentGroup")
	private SubscriptionProductComponentGroup componentGroup = null;

	@SerializedName("defaultComponent")
	private Boolean defaultComponent = null;

	@SerializedName("description")
	private DatabaseTranslatedString description = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("name")
	private DatabaseTranslatedString name = null;

	@SerializedName("reference")
	private SubscriptionProductComponentReference reference = null;

	@SerializedName("sortOrder")
	private Integer sortOrder = null;

	@SerializedName("taxClass")
	private TaxClass taxClass = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * The change weight determines whether if a component change is considered as upgrade or downgrade. If product component with a weight 10 is changed to a product component with a weight 20, the change is considered as upgrade. On the other hand a change from 20 to 10 is considered as a downgrade.
	 *
	 * @return The change weight determines whether if a component change is considered as upgrade or downgrade. If product component with a weight 10 is changed to a product component with a weight 20, the change is considered as upgrade. On the other hand a change from 20 to 10 is considered as a downgrade.
	 */
	@ApiModelProperty(example = "null", value = "The change weight determines whether if a component change is considered as upgrade or downgrade. If product component with a weight 10 is changed to a product component with a weight 20, the change is considered as upgrade. On the other hand a change from 20 to 10 is considered as a downgrade.")
	public Integer getComponentChangeWeight() {
		return componentChangeWeight;
	}

	public SubscriptionProductComponent componentGroup(SubscriptionProductComponentGroup componentGroup) {
		this.componentGroup = componentGroup;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public SubscriptionProductComponentGroup getComponentGroup() {
		return componentGroup;
	}

	public void setComponentGroup(SubscriptionProductComponentGroup componentGroup) {
		this.componentGroup = componentGroup;
	}

	/**
	 * When a component is marked as a 'default' component it is used when no other component is selected by the user.
	 *
	 * @return When a component is marked as a 'default' component it is used when no other component is selected by the user.
	 */
	@ApiModelProperty(example = "null", value = "When a component is marked as a 'default' component it is used when no other component is selected by the user.")
	public Boolean getDefaultComponent() {
		return defaultComponent;
	}

	public SubscriptionProductComponent description(DatabaseTranslatedString description) {
		this.description = description;
		return this;
	}

	/**
	 * The component description may contain a longer description which gives the subscriber a better understanding of what the component contains.
	 *
	 * @return The component description may contain a longer description which gives the subscriber a better understanding of what the component contains.
	 */
	@ApiModelProperty(example = "null", value = "The component description may contain a longer description which gives the subscriber a better understanding of what the component contains.")
	public DatabaseTranslatedString getDescription() {
		return description;
	}

	public void setDescription(DatabaseTranslatedString description) {
		this.description = description;
	}

	public SubscriptionProductComponent id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 *
	 * @return The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 */
	@ApiModelProperty(example = "null", value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * The linked space id holds the ID of the space to which the entity belongs to.
	 *
	 * @return The linked space id holds the ID of the space to which the entity belongs to.
	 */
	@ApiModelProperty(example = "null", value = "The linked space id holds the ID of the space to which the entity belongs to.")
	public Long getLinkedSpaceId() {
		return linkedSpaceId;
	}

	public SubscriptionProductComponent name(DatabaseTranslatedString name) {
		this.name = name;
		return this;
	}

	/**
	 * The component name is shown to the subscriber. It should describe in few words what the component does contain.
	 *
	 * @return The component name is shown to the subscriber. It should describe in few words what the component does contain.
	 */
	@ApiModelProperty(example = "null", value = "The component name is shown to the subscriber. It should describe in few words what the component does contain.")
	public DatabaseTranslatedString getName() {
		return name;
	}

	public void setName(DatabaseTranslatedString name) {
		this.name = name;
	}

	public SubscriptionProductComponent reference(SubscriptionProductComponentReference reference) {
		this.reference = reference;
		return this;
	}

	/**
	 * The component reference is used to identify the component by external systems and it marks components to represent the same component within different product versions.
	 *
	 * @return The component reference is used to identify the component by external systems and it marks components to represent the same component within different product versions.
	 */
	@ApiModelProperty(example = "null", value = "The component reference is used to identify the component by external systems and it marks components to represent the same component within different product versions.")
	public SubscriptionProductComponentReference getReference() {
		return reference;
	}

	public void setReference(SubscriptionProductComponentReference reference) {
		this.reference = reference;
	}

	/**
	 * The sort order controls in which order the component is listed. The sort order is used to order the components in ascending order.
	 *
	 * @return The sort order controls in which order the component is listed. The sort order is used to order the components in ascending order.
	 */
	@ApiModelProperty(example = "null", value = "The sort order controls in which order the component is listed. The sort order is used to order the components in ascending order.")
	public Integer getSortOrder() {
		return sortOrder;
	}

	public SubscriptionProductComponent taxClass(TaxClass taxClass) {
		this.taxClass = taxClass;
		return this;
	}

	/**
	 * The tax class of the component determines the taxes which are applicable on all fees linked with the component.
	 *
	 * @return The tax class of the component determines the taxes which are applicable on all fees linked with the component.
	 */
	@ApiModelProperty(example = "null", value = "The tax class of the component determines the taxes which are applicable on all fees linked with the component.")
	public TaxClass getTaxClass() {
		return taxClass;
	}

	public void setTaxClass(TaxClass taxClass) {
		this.taxClass = taxClass;
	}

	public SubscriptionProductComponent version(Integer version) {
		this.version = version;
		return this;
	}

	/**
	 * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 *
	 * @return The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 */
	@ApiModelProperty(example = "null", value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}


	@Override
	public boolean equals(java.lang.Object o) {
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
				Objects.equals(this.name, subscriptionProductComponent.name) &&
				Objects.equals(this.reference, subscriptionProductComponent.reference) &&
				Objects.equals(this.sortOrder, subscriptionProductComponent.sortOrder) &&
				Objects.equals(this.taxClass, subscriptionProductComponent.taxClass) &&
				Objects.equals(this.version, subscriptionProductComponent.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(componentChangeWeight, componentGroup, defaultComponent, description, id, linkedSpaceId, name, reference, sortOrder, taxClass, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SubscriptionProductComponent {\n");
		
		sb.append("		componentChangeWeight: ").append(toIndentedString(componentChangeWeight)).append("\n");
		sb.append("		componentGroup: ").append(toIndentedString(componentGroup)).append("\n");
		sb.append("		defaultComponent: ").append(toIndentedString(defaultComponent)).append("\n");
		sb.append("		description: ").append(toIndentedString(description)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		reference: ").append(toIndentedString(reference)).append("\n");
		sb.append("		sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
		sb.append("		taxClass: ").append(toIndentedString(taxClass)).append("\n");
		sb.append("		version: ").append(toIndentedString(version)).append("\n");
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
		return o.toString().replace("\n", "\n		");
	}

}

