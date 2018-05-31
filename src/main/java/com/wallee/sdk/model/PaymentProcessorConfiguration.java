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

/**
 * PaymentProcessorConfiguration
 */
public class PaymentProcessorConfiguration {

	@SerializedName("contractId")
	private Long contractId = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("plannedPurgeDate")
	private OffsetDateTime plannedPurgeDate = null;

	@SerializedName("processor")
	private Long processor = null;

	@SerializedName("state")
	private CreationEntityState state = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * The contract links the processor configuration with the contract that is used to process payments.
	 *
	 * @return The contract links the processor configuration with the contract that is used to process payments.
	 */
	public Long getContractId() {
		return contractId;
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
	 * The processor configuration name is used internally to identify a specific processor configuration. For example the name is used within search fields and hence it should be distinct and descriptive.
	 *
	 * @return The processor configuration name is used internally to identify a specific processor configuration. For example the name is used within search fields and hence it should be distinct and descriptive.
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
	 * A processor handles the connection to a third part company (a Payment Service Provider) that technically manages the transaction and therefore processes the payment. For the same processor multiple processor configuration can be setup.
	 *
	 * @return A processor handles the connection to a third part company (a Payment Service Provider) that technically manages the transaction and therefore processes the payment. For the same processor multiple processor configuration can be setup.
	 */
	public Long getProcessor() {
		return processor;
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
		PaymentProcessorConfiguration paymentProcessorConfiguration = (PaymentProcessorConfiguration) o;
		return Objects.equals(this.contractId, paymentProcessorConfiguration.contractId) &&
				Objects.equals(this.id, paymentProcessorConfiguration.id) &&
				Objects.equals(this.linkedSpaceId, paymentProcessorConfiguration.linkedSpaceId) &&
				Objects.equals(this.name, paymentProcessorConfiguration.name) &&
				Objects.equals(this.plannedPurgeDate, paymentProcessorConfiguration.plannedPurgeDate) &&
				Objects.equals(this.processor, paymentProcessorConfiguration.processor) &&
				Objects.equals(this.state, paymentProcessorConfiguration.state) &&
				Objects.equals(this.version, paymentProcessorConfiguration.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(contractId, id, linkedSpaceId, name, plannedPurgeDate, processor, state, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PaymentProcessorConfiguration {\n");
		
		sb.append("		contractId: ").append(toIndentedString(contractId)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		processor: ").append(toIndentedString(processor)).append("\n");
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

