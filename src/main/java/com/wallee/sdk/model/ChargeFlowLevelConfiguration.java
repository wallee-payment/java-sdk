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
import com.wallee.sdk.model.ChargeFlow;
import com.wallee.sdk.model.CreationEntityState;
import java.time.OffsetDateTime;

/**
 * ChargeFlowLevelConfiguration
 */
public class ChargeFlowLevelConfiguration {

	@SerializedName("flow")
	private ChargeFlow flow = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("period")
	private String period = null;

	@SerializedName("plannedPurgeDate")
	private OffsetDateTime plannedPurgeDate = null;

	@SerializedName("priority")
	private Integer priority = null;

	@SerializedName("state")
	private CreationEntityState state = null;

	@SerializedName("type")
	private Long type = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * The charge flow level configuration to which the flow is associated.
	 *
	 * @return The charge flow level configuration to which the flow is associated.
	 */
	public ChargeFlow getFlow() {
		return flow;
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
	 * The charge flow level configuration name is used internally to identify the charge flow level configuration. For example the name is used within search fields and hence it should be distinct and descriptive.
	 *
	 * @return The charge flow level configuration name is used internally to identify the charge flow level configuration. For example the name is used within search fields and hence it should be distinct and descriptive.
	 */
	public String getName() {
		return name;
	}

	/**
	 * The duration of the level before switching to the next one.
	 *
	 * @return The duration of the level before switching to the next one.
	 */
	public String getPeriod() {
		return period;
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
	 * The priority indicates the sort order of the level configurations. A low value indicates that the level configuration is executed before any level with a higher value. Any change to this value affects future level configuration selections.
	 *
	 * @return The priority indicates the sort order of the level configurations. A low value indicates that the level configuration is executed before any level with a higher value. Any change to this value affects future level configuration selections.
	 */
	public Integer getPriority() {
		return priority;
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
	 * The type determines how the payment link is delivered to the customer. Once the type is defined it cannot be changed anymore.
	 *
	 * @return The type determines how the payment link is delivered to the customer. Once the type is defined it cannot be changed anymore.
	 */
	public Long getType() {
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
		ChargeFlowLevelConfiguration chargeFlowLevelConfiguration = (ChargeFlowLevelConfiguration) o;
		return Objects.equals(this.flow, chargeFlowLevelConfiguration.flow) &&
				Objects.equals(this.id, chargeFlowLevelConfiguration.id) &&
				Objects.equals(this.linkedSpaceId, chargeFlowLevelConfiguration.linkedSpaceId) &&
				Objects.equals(this.name, chargeFlowLevelConfiguration.name) &&
				Objects.equals(this.period, chargeFlowLevelConfiguration.period) &&
				Objects.equals(this.plannedPurgeDate, chargeFlowLevelConfiguration.plannedPurgeDate) &&
				Objects.equals(this.priority, chargeFlowLevelConfiguration.priority) &&
				Objects.equals(this.state, chargeFlowLevelConfiguration.state) &&
				Objects.equals(this.type, chargeFlowLevelConfiguration.type) &&
				Objects.equals(this.version, chargeFlowLevelConfiguration.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(flow, id, linkedSpaceId, name, period, plannedPurgeDate, priority, state, type, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ChargeFlowLevelConfiguration {\n");
		
		sb.append("		flow: ").append(toIndentedString(flow)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		period: ").append(toIndentedString(period)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		priority: ").append(toIndentedString(priority)).append("\n");
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

