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
import com.wallee.sdk.model.SubscriptionProductVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class SubscriptionProductComponentGroup {
	@SerializedName("id")
	private Long id = null;

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("name")
	private DatabaseTranslatedString name = null;

	@SerializedName("optional")
	private Boolean optional = null;

	@SerializedName("productVersion")
	private SubscriptionProductVersion productVersion = null;

	@SerializedName("sortOrder")
	private Integer sortOrder = null;

	@SerializedName("version")
	private Integer version = null;

	public SubscriptionProductComponentGroup id(Long id) {
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

	public SubscriptionProductComponentGroup name(DatabaseTranslatedString name) {
		this.name = name;
		return this;
	}

	/**
	 * The component group name will be shown when the components are selected. This can be visible to the subscriber.
	 *
	 * @return The component group name will be shown when the components are selected. This can be visible to the subscriber.
	 */
	@ApiModelProperty(example = "null", value = "The component group name will be shown when the components are selected. This can be visible to the subscriber.")
	public DatabaseTranslatedString getName() {
		return name;
	}

	public void setName(DatabaseTranslatedString name) {
		this.name = name;
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

	public SubscriptionProductComponentGroup productVersion(SubscriptionProductVersion productVersion) {
		this.productVersion = productVersion;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public SubscriptionProductVersion getProductVersion() {
		return productVersion;
	}

	public void setProductVersion(SubscriptionProductVersion productVersion) {
		this.productVersion = productVersion;
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

	public SubscriptionProductComponentGroup version(Integer version) {
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
		SubscriptionProductComponentGroup subscriptionProductComponentGroup = (SubscriptionProductComponentGroup) o;
		return Objects.equals(this.id, subscriptionProductComponentGroup.id) &&
				Objects.equals(this.linkedSpaceId, subscriptionProductComponentGroup.linkedSpaceId) &&
				Objects.equals(this.name, subscriptionProductComponentGroup.name) &&
				Objects.equals(this.optional, subscriptionProductComponentGroup.optional) &&
				Objects.equals(this.productVersion, subscriptionProductComponentGroup.productVersion) &&
				Objects.equals(this.sortOrder, subscriptionProductComponentGroup.sortOrder) &&
				Objects.equals(this.version, subscriptionProductComponentGroup.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, linkedSpaceId, name, optional, productVersion, sortOrder, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SubscriptionProductComponentGroup {\n");
		
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		optional: ").append(toIndentedString(optional)).append("\n");
		sb.append("		productVersion: ").append(toIndentedString(productVersion)).append("\n");
		sb.append("		sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
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

