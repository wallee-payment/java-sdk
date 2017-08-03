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
import com.wallee.sdk.model.DeliveryIndicationDecisionReason;
import com.wallee.sdk.model.DeliveryIndicationState;
import com.wallee.sdk.model.Transaction;
import com.wallee.sdk.model.TransactionAwareEntity;
import java.time.OffsetDateTime;

/**
 * DeliveryIndication
 */
public class DeliveryIndication extends TransactionAwareEntity {

	@SerializedName("automaticDecisionReason")
	private DeliveryIndicationDecisionReason automaticDecisionReason = null;

	@SerializedName("automaticallyDecidedOn")
	private OffsetDateTime automaticallyDecidedOn = null;

	@SerializedName("createdOn")
	private OffsetDateTime createdOn = null;

	@SerializedName("manualDecisionTimeoutOn")
	private OffsetDateTime manualDecisionTimeoutOn = null;

	@SerializedName("manuallyDecidedBy")
	private Long manuallyDecidedBy = null;

	@SerializedName("manuallyDecidedOn")
	private OffsetDateTime manuallyDecidedOn = null;

	@SerializedName("plannedPurgeDate")
	private OffsetDateTime plannedPurgeDate = null;

	@SerializedName("state")
	private DeliveryIndicationState state = null;

	@SerializedName("timeoutOn")
	private OffsetDateTime timeoutOn = null;

	@SerializedName("transaction")
	private Transaction transaction = null;

	/**
	 * automaticDecisionReason
	 *
	 * @return automaticDecisionReason
	 */
	public DeliveryIndicationDecisionReason getAutomaticDecisionReason() {
		return automaticDecisionReason;
	}

	/**
	 * automaticallyDecidedOn
	 *
	 * @return automaticallyDecidedOn
	 */
	public OffsetDateTime getAutomaticallyDecidedOn() {
		return automaticallyDecidedOn;
	}

	/**
	 * The created on date indicates the date on which the entity was stored into the database.
	 *
	 * @return The created on date indicates the date on which the entity was stored into the database.
	 */
	public OffsetDateTime getCreatedOn() {
		return createdOn;
	}

	/**
	 * manualDecisionTimeoutOn
	 *
	 * @return manualDecisionTimeoutOn
	 */
	public OffsetDateTime getManualDecisionTimeoutOn() {
		return manualDecisionTimeoutOn;
	}

	/**
	 * manuallyDecidedBy
	 *
	 * @return manuallyDecidedBy
	 */
	public Long getManuallyDecidedBy() {
		return manuallyDecidedBy;
	}

	/**
	 * manuallyDecidedOn
	 *
	 * @return manuallyDecidedOn
	 */
	public OffsetDateTime getManuallyDecidedOn() {
		return manuallyDecidedOn;
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
	public DeliveryIndicationState getState() {
		return state;
	}

	/**
	 * timeoutOn
	 *
	 * @return timeoutOn
	 */
	public OffsetDateTime getTimeoutOn() {
		return timeoutOn;
	}

	/**
	 * transaction
	 *
	 * @return transaction
	 */
	public Transaction getTransaction() {
		return transaction;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DeliveryIndication deliveryIndication = (DeliveryIndication) o;
		return Objects.equals(this.automaticDecisionReason, deliveryIndication.automaticDecisionReason) &&
				Objects.equals(this.automaticallyDecidedOn, deliveryIndication.automaticallyDecidedOn) &&
				Objects.equals(this.createdOn, deliveryIndication.createdOn) &&
				Objects.equals(this.manualDecisionTimeoutOn, deliveryIndication.manualDecisionTimeoutOn) &&
				Objects.equals(this.manuallyDecidedBy, deliveryIndication.manuallyDecidedBy) &&
				Objects.equals(this.manuallyDecidedOn, deliveryIndication.manuallyDecidedOn) &&
				Objects.equals(this.plannedPurgeDate, deliveryIndication.plannedPurgeDate) &&
				Objects.equals(this.state, deliveryIndication.state) &&
				Objects.equals(this.timeoutOn, deliveryIndication.timeoutOn) &&
				Objects.equals(this.transaction, deliveryIndication.transaction) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(automaticDecisionReason, automaticallyDecidedOn, createdOn, manualDecisionTimeoutOn, manuallyDecidedBy, manuallyDecidedOn, plannedPurgeDate, state, timeoutOn, transaction, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeliveryIndication {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
		sb.append("		automaticDecisionReason: ").append(toIndentedString(automaticDecisionReason)).append("\n");
		sb.append("		automaticallyDecidedOn: ").append(toIndentedString(automaticallyDecidedOn)).append("\n");
		sb.append("		createdOn: ").append(toIndentedString(createdOn)).append("\n");
		sb.append("		manualDecisionTimeoutOn: ").append(toIndentedString(manualDecisionTimeoutOn)).append("\n");
		sb.append("		manuallyDecidedBy: ").append(toIndentedString(manuallyDecidedBy)).append("\n");
		sb.append("		manuallyDecidedOn: ").append(toIndentedString(manuallyDecidedOn)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("		timeoutOn: ").append(toIndentedString(timeoutOn)).append("\n");
		sb.append("		transaction: ").append(toIndentedString(transaction)).append("\n");
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

