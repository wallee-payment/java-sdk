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
import com.wallee.sdk.model.TransactionGroupState;
import java.time.OffsetDateTime;

/**
 * TransactionGroup
 */
public class TransactionGroup {

	@SerializedName("beginDate")
	private OffsetDateTime beginDate = null;

	@SerializedName("customerId")
	private String customerId = null;

	@SerializedName("endDate")
	private OffsetDateTime endDate = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("plannedPurgeDate")
	private OffsetDateTime plannedPurgeDate = null;

	@SerializedName("state")
	private TransactionGroupState state = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * beginDate
	 *
	 * @return beginDate
	 */
	public OffsetDateTime getBeginDate() {
		return beginDate;
	}

	/**
	 * customerId
	 *
	 * @return customerId
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * endDate
	 *
	 * @return endDate
	 */
	public OffsetDateTime getEndDate() {
		return endDate;
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
	public TransactionGroupState getState() {
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
		TransactionGroup transactionGroup = (TransactionGroup) o;
		return Objects.equals(this.beginDate, transactionGroup.beginDate) &&
				Objects.equals(this.customerId, transactionGroup.customerId) &&
				Objects.equals(this.endDate, transactionGroup.endDate) &&
				Objects.equals(this.id, transactionGroup.id) &&
				Objects.equals(this.linkedSpaceId, transactionGroup.linkedSpaceId) &&
				Objects.equals(this.plannedPurgeDate, transactionGroup.plannedPurgeDate) &&
				Objects.equals(this.state, transactionGroup.state) &&
				Objects.equals(this.version, transactionGroup.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(beginDate, customerId, endDate, id, linkedSpaceId, plannedPurgeDate, state, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TransactionGroup {\n");
		
		sb.append("		beginDate: ").append(toIndentedString(beginDate)).append("\n");
		sb.append("		customerId: ").append(toIndentedString(customerId)).append("\n");
		sb.append("		endDate: ").append(toIndentedString(endDate)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
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

