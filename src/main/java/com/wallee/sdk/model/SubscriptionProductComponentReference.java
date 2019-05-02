/**
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
 *
 * @author   customweb GmbH (www.customweb.com)
 */
package com.wallee.sdk.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.wallee.sdk.model.SubscriptionProductComponentReferenceState;
import java.time.OffsetDateTime;

/**
 * The product component reference binds components from different product versions together. By binding them together the product version migration can be realized.
 */
public class SubscriptionProductComponentReference {

	@SerializedName("id")
	private Long id = null;

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("plannedPurgeDate")
	private OffsetDateTime plannedPurgeDate = null;

	@SerializedName("spaceId")
	private Long spaceId = null;

	@SerializedName("state")
	private SubscriptionProductComponentReferenceState state = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 *
	 * @return The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * The linked space id holds the ID of the space to which the entity belongs to.
	 *
	 * @return The linked space id holds the ID of the space to which the entity belongs to.
	 */
	public Long getLinkedSpaceId() {
		return linkedSpaceId;
	}

	/**
	 * The component reference name is used internally to identify the reference. For example the name is used within search fields and hence it should be distinct and descriptive.
	 *
	 * @return The component reference name is used internally to identify the reference. For example the name is used within search fields and hence it should be distinct and descriptive.
	 */
	public String getName() {
		return name;
	}

	/**
	 * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 *
	 * @return The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 */
	public OffsetDateTime getPlannedPurgeDate() {
		return plannedPurgeDate;
	}

	/**
	 * spaceId
	 *
	 * @return spaceId
	 */
	public Long getSpaceId() {
		return spaceId;
	}

	/**
	 * state
	 *
	 * @return state
	 */
	public SubscriptionProductComponentReferenceState getState() {
		return state;
	}

	/**
	 * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 *
	 * @return The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 */
	public Integer getVersion() {
		return version;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SubscriptionProductComponentReference subscriptionProductComponentReference = (SubscriptionProductComponentReference) o;
		return Objects.equals(this.id, subscriptionProductComponentReference.id) &&
				Objects.equals(this.linkedSpaceId, subscriptionProductComponentReference.linkedSpaceId) &&
				Objects.equals(this.name, subscriptionProductComponentReference.name) &&
				Objects.equals(this.plannedPurgeDate, subscriptionProductComponentReference.plannedPurgeDate) &&
				Objects.equals(this.spaceId, subscriptionProductComponentReference.spaceId) &&
				Objects.equals(this.state, subscriptionProductComponentReference.state) &&
				Objects.equals(this.version, subscriptionProductComponentReference.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, linkedSpaceId, name, plannedPurgeDate, spaceId, state, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SubscriptionProductComponentReference {\n");
		
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		spaceId: ").append(toIndentedString(spaceId)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
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

