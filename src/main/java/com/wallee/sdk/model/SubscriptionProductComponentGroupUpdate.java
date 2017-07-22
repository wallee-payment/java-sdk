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
public class SubscriptionProductComponentGroupUpdate {
	@SerializedName("id")
	private Long id = null;

	@SerializedName("version")
	private Long version = null;

	@SerializedName("name")
	private DatabaseTranslatedStringCreate name = null;

	@SerializedName("optional")
	private Boolean optional = null;

	@SerializedName("productVersion")
	private Long productVersion = null;

	@SerializedName("sortOrder")
	private Integer sortOrder = null;

	public SubscriptionProductComponentGroupUpdate id(Long id) {
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

	public SubscriptionProductComponentGroupUpdate version(Long version) {
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

	public SubscriptionProductComponentGroupUpdate name(DatabaseTranslatedStringCreate name) {
		this.name = name;
		return this;
	}

	/**
	 * The component group name will be shown when the components are selected. This can be visible to the subscriber.
	 *
	 * @return The component group name will be shown when the components are selected. This can be visible to the subscriber.
	 */
	@ApiModelProperty(example = "null", value = "The component group name will be shown when the components are selected. This can be visible to the subscriber.")
	public DatabaseTranslatedStringCreate getName() {
		return name;
	}

	public void setName(DatabaseTranslatedStringCreate name) {
		this.name = name;
	}

	public SubscriptionProductComponentGroupUpdate optional(Boolean optional) {
		this.optional = optional;
		return this;
	}

	/**
	 * The component group can be optional. This means no component has to be selected by the subscriber.
	 *
	 * @return The component group can be optional. This means no component has to be selected by the subscriber.
	 */
	@ApiModelProperty(example = "null", value = "The component group can be optional. This means no component has to be selected by the subscriber.")
	public Boolean getOptional() {
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
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
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
	 * The sort order controls in which order the component group is listed. The sort order is used to order the component groups in ascending order.
	 *
	 * @return The sort order controls in which order the component group is listed. The sort order is used to order the component groups in ascending order.
	 */
	@ApiModelProperty(example = "null", value = "The sort order controls in which order the component group is listed. The sort order is used to order the component groups in ascending order.")
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
		
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		version: ").append(toIndentedString(version)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		optional: ").append(toIndentedString(optional)).append("\n");
		sb.append("		productVersion: ").append(toIndentedString(productVersion)).append("\n");
		sb.append("		sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
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

