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
import com.wallee.sdk.model.CreationEntityState;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SubscriptionAffiliate
 */
public class SubscriptionAffiliate {

	@SerializedName("externalId")
	private String externalId = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("language")
	private String language = null;

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("metaData")
	private Map<String, String> metaData = new HashMap<String, String>();

	@SerializedName("name")
	private String name = null;

	@SerializedName("plannedPurgeDate")
	private OffsetDateTime plannedPurgeDate = null;

	@SerializedName("reference")
	private String reference = null;

	@SerializedName("state")
	private CreationEntityState state = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
	 *
	 * @return The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
	 */
	public String getExternalId() {
		return externalId;
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
	 * language
	 *
	 * @return language
	 */
	public String getLanguage() {
		return language;
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
	 * Meta data allow to store additional data along the object.
	 *
	 * @return Meta data allow to store additional data along the object.
	 */
	public Map<String, String> getMetaData() {
		return metaData;
	}

	/**
	 * name
	 *
	 * @return name
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
	 * reference
	 *
	 * @return reference
	 */
	public String getReference() {
		return reference;
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
		SubscriptionAffiliate subscriptionAffiliate = (SubscriptionAffiliate) o;
		return Objects.equals(this.externalId, subscriptionAffiliate.externalId) &&
				Objects.equals(this.id, subscriptionAffiliate.id) &&
				Objects.equals(this.language, subscriptionAffiliate.language) &&
				Objects.equals(this.linkedSpaceId, subscriptionAffiliate.linkedSpaceId) &&
				Objects.equals(this.metaData, subscriptionAffiliate.metaData) &&
				Objects.equals(this.name, subscriptionAffiliate.name) &&
				Objects.equals(this.plannedPurgeDate, subscriptionAffiliate.plannedPurgeDate) &&
				Objects.equals(this.reference, subscriptionAffiliate.reference) &&
				Objects.equals(this.state, subscriptionAffiliate.state) &&
				Objects.equals(this.version, subscriptionAffiliate.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(externalId, id, language, linkedSpaceId, metaData, name, plannedPurgeDate, reference, state, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SubscriptionAffiliate {\n");
		
		sb.append("		externalId: ").append(toIndentedString(externalId)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		language: ").append(toIndentedString(language)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		metaData: ").append(toIndentedString(metaData)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		reference: ").append(toIndentedString(reference)).append("\n");
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

