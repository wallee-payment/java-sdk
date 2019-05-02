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
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.DatabaseTranslatedString;
import com.wallee.sdk.model.SubscriptionMetricType;
import java.time.OffsetDateTime;

/**
 * A metric represents the usage of a resource that can be measured.
 */
public class SubscriptionMetric {

	@SerializedName("description")
	private DatabaseTranslatedString description = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("name")
	private DatabaseTranslatedString name = null;

	@SerializedName("plannedPurgeDate")
	private OffsetDateTime plannedPurgeDate = null;

	@SerializedName("state")
	private CreationEntityState state = null;

	@SerializedName("type")
	private SubscriptionMetricType type = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * description
	 *
	 * @return description
	 */
	public DatabaseTranslatedString getDescription() {
		return description;
	}

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
	 * name
	 *
	 * @return name
	 */
	public DatabaseTranslatedString getName() {
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
	 * state
	 *
	 * @return state
	 */
	public CreationEntityState getState() {
		return state;
	}

	/**
	 * type
	 *
	 * @return type
	 */
	public SubscriptionMetricType getType() {
		return type;
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
		SubscriptionMetric subscriptionMetric = (SubscriptionMetric) o;
		return Objects.equals(this.description, subscriptionMetric.description) &&
				Objects.equals(this.id, subscriptionMetric.id) &&
				Objects.equals(this.linkedSpaceId, subscriptionMetric.linkedSpaceId) &&
				Objects.equals(this.name, subscriptionMetric.name) &&
				Objects.equals(this.plannedPurgeDate, subscriptionMetric.plannedPurgeDate) &&
				Objects.equals(this.state, subscriptionMetric.state) &&
				Objects.equals(this.type, subscriptionMetric.type) &&
				Objects.equals(this.version, subscriptionMetric.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, id, linkedSpaceId, name, plannedPurgeDate, state, type, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SubscriptionMetric {\n");
		
		sb.append("		description: ").append(toIndentedString(description)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("		type: ").append(toIndentedString(type)).append("\n");
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

