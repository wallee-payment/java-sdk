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
import com.wallee.sdk.model.DatabaseTranslatedStringCreate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class SubscriptionProductComponentUpdate {
	@SerializedName("id")
	private Long id = null;

	@SerializedName("version")
	private Long version = null;

	@SerializedName("componentChangeWeight")
	private Integer componentChangeWeight = null;

	@SerializedName("componentGroup")
	private Long componentGroup = null;

	@SerializedName("defaultComponent")
	private Boolean defaultComponent = null;

	@SerializedName("description")
	private DatabaseTranslatedStringCreate description = null;

	@SerializedName("name")
	private DatabaseTranslatedStringCreate name = null;

	@SerializedName("reference")
	private Long reference = null;

	@SerializedName("sortOrder")
	private Integer sortOrder = null;

	@SerializedName("taxClass")
	private Long taxClass = null;

	public SubscriptionProductComponentUpdate id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 *
	 * @return The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 */
	@ApiModelProperty(example = "null", required = true, value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
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
	 *
	 * @return The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 */
	@ApiModelProperty(example = "null", required = true, value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
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
	 *
	 * @return The change weight determines whether if a component change is considered as upgrade or downgrade. If product component with a weight 10 is changed to a product component with a weight 20, the change is considered as upgrade. On the other hand a change from 20 to 10 is considered as a downgrade.
	 */
	@ApiModelProperty(example = "null", value = "The change weight determines whether if a component change is considered as upgrade or downgrade. If product component with a weight 10 is changed to a product component with a weight 20, the change is considered as upgrade. On the other hand a change from 20 to 10 is considered as a downgrade.")
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
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
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
	 * When a component is marked as a 'default' component it is used when no other component is selected by the user.
	 *
	 * @return When a component is marked as a 'default' component it is used when no other component is selected by the user.
	 */
	@ApiModelProperty(example = "null", value = "When a component is marked as a 'default' component it is used when no other component is selected by the user.")
	public Boolean getDefaultComponent() {
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
	 *
	 * @return The component description may contain a longer description which gives the subscriber a better understanding of what the component contains.
	 */
	@ApiModelProperty(example = "null", value = "The component description may contain a longer description which gives the subscriber a better understanding of what the component contains.")
	public DatabaseTranslatedStringCreate getDescription() {
		return description;
	}

	public void setDescription(DatabaseTranslatedStringCreate description) {
		this.description = description;
	}

	public SubscriptionProductComponentUpdate name(DatabaseTranslatedStringCreate name) {
		this.name = name;
		return this;
	}

	/**
	 * The component name is shown to the subscriber. It should describe in few words what the component does contain.
	 *
	 * @return The component name is shown to the subscriber. It should describe in few words what the component does contain.
	 */
	@ApiModelProperty(example = "null", value = "The component name is shown to the subscriber. It should describe in few words what the component does contain.")
	public DatabaseTranslatedStringCreate getName() {
		return name;
	}

	public void setName(DatabaseTranslatedStringCreate name) {
		this.name = name;
	}

	public SubscriptionProductComponentUpdate reference(Long reference) {
		this.reference = reference;
		return this;
	}

	/**
	 * The component reference is used to identify the component by external systems and it marks components to represent the same component within different product versions.
	 *
	 * @return The component reference is used to identify the component by external systems and it marks components to represent the same component within different product versions.
	 */
	@ApiModelProperty(example = "null", value = "The component reference is used to identify the component by external systems and it marks components to represent the same component within different product versions.")
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
	 *
	 * @return The sort order controls in which order the component is listed. The sort order is used to order the components in ascending order.
	 */
	@ApiModelProperty(example = "null", value = "The sort order controls in which order the component is listed. The sort order is used to order the components in ascending order.")
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
	 *
	 * @return The tax class of the component determines the taxes which are applicable on all fees linked with the component.
	 */
	@ApiModelProperty(example = "null", value = "The tax class of the component determines the taxes which are applicable on all fees linked with the component.")
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
				Objects.equals(this.name, subscriptionProductComponentUpdate.name) &&
				Objects.equals(this.reference, subscriptionProductComponentUpdate.reference) &&
				Objects.equals(this.sortOrder, subscriptionProductComponentUpdate.sortOrder) &&
				Objects.equals(this.taxClass, subscriptionProductComponentUpdate.taxClass);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, version, componentChangeWeight, componentGroup, defaultComponent, description, name, reference, sortOrder, taxClass);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SubscriptionProductComponentUpdate {\n");
		
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		version: ").append(toIndentedString(version)).append("\n");
		sb.append("		componentChangeWeight: ").append(toIndentedString(componentChangeWeight)).append("\n");
		sb.append("		componentGroup: ").append(toIndentedString(componentGroup)).append("\n");
		sb.append("		defaultComponent: ").append(toIndentedString(defaultComponent)).append("\n");
		sb.append("		description: ").append(toIndentedString(description)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		reference: ").append(toIndentedString(reference)).append("\n");
		sb.append("		sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
		sb.append("		taxClass: ").append(toIndentedString(taxClass)).append("\n");
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

