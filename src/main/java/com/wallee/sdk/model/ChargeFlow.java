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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class ChargeFlow {
	@SerializedName("conditions")
	private List<Long> conditions = new ArrayList<Long>();

	@SerializedName("id")
	private Long id = null;

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("plannedPurgeDate")
	private DateTime plannedPurgeDate = null;

	@SerializedName("priority")
	private Integer priority = null;

	@SerializedName("state")
	private CreationEntityState state = null;

	@SerializedName("version")
	private Integer version = null;

	public ChargeFlow conditions(List<Long> conditions) {
		this.conditions = conditions;
		return this;
	}

	public ChargeFlow addConditionsItem(Long conditionsItem) {
		this.conditions.add(conditionsItem);
		return this;
	}

	/**
	 * If a transaction meets all selected conditions, the charge flow will be used to process the transaction. If the conditions are not met the next charge flow in line will be chosen according to the priorities.
	 *
	 * @return If a transaction meets all selected conditions, the charge flow will be used to process the transaction. If the conditions are not met the next charge flow in line will be chosen according to the priorities.
	 */
	@ApiModelProperty(example = "null", value = "If a transaction meets all selected conditions, the charge flow will be used to process the transaction. If the conditions are not met the next charge flow in line will be chosen according to the priorities.")
	public List<Long> getConditions() {
		return conditions;
	}

	public void setConditions(List<Long> conditions) {
		this.conditions = conditions;
	}

	public ChargeFlow id(Long id) {
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

	/**
	 * The charge flow name is used internally to identify the configuration in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.
	 *
	 * @return The charge flow name is used internally to identify the configuration in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.
	 */
	@ApiModelProperty(example = "null", value = "The charge flow name is used internally to identify the configuration in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.")
	public String getName() {
		return name;
	}

	/**
	 * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 *
	 * @return The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 */
	@ApiModelProperty(example = "null", value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
	public DateTime getPlannedPurgeDate() {
		return plannedPurgeDate;
	}

	/**
	 * The priority orders the charge flows. As such the priority determines together with the conditions the charge flow the selection mechanism for a particular transaction. A change of the priority affects all future selections.
	 *
	 * @return The priority orders the charge flows. As such the priority determines together with the conditions the charge flow the selection mechanism for a particular transaction. A change of the priority affects all future selections.
	 */
	@ApiModelProperty(example = "null", value = "The priority orders the charge flows. As such the priority determines together with the conditions the charge flow the selection mechanism for a particular transaction. A change of the priority affects all future selections.")
	public Integer getPriority() {
		return priority;
	}

	public ChargeFlow state(CreationEntityState state) {
		this.state = state;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public CreationEntityState getState() {
		return state;
	}

	public void setState(CreationEntityState state) {
		this.state = state;
	}

	public ChargeFlow version(Integer version) {
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
		ChargeFlow chargeFlow = (ChargeFlow) o;
		return Objects.equals(this.conditions, chargeFlow.conditions) &&
				Objects.equals(this.id, chargeFlow.id) &&
				Objects.equals(this.linkedSpaceId, chargeFlow.linkedSpaceId) &&
				Objects.equals(this.name, chargeFlow.name) &&
				Objects.equals(this.plannedPurgeDate, chargeFlow.plannedPurgeDate) &&
				Objects.equals(this.priority, chargeFlow.priority) &&
				Objects.equals(this.state, chargeFlow.state) &&
				Objects.equals(this.version, chargeFlow.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(conditions, id, linkedSpaceId, name, plannedPurgeDate, priority, state, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ChargeFlow {\n");
		
		sb.append("		conditions: ").append(toIndentedString(conditions)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		priority: ").append(toIndentedString(priority)).append("\n");
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

