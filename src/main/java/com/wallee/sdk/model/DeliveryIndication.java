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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class DeliveryIndication extends TransactionAwareEntity {
	@SerializedName("automaticDecisionReason")
	private DeliveryIndicationDecisionReason automaticDecisionReason = null;

	@SerializedName("automaticallyDecidedOn")
	private DateTime automaticallyDecidedOn = null;

	@SerializedName("createdOn")
	private DateTime createdOn = null;

	@SerializedName("manualDecisionTimeoutOn")
	private DateTime manualDecisionTimeoutOn = null;

	@SerializedName("manuallyDecidedBy")
	private Long manuallyDecidedBy = null;

	@SerializedName("manuallyDecidedOn")
	private DateTime manuallyDecidedOn = null;

	@SerializedName("plannedPurgeDate")
	private DateTime plannedPurgeDate = null;

	@SerializedName("state")
	private DeliveryIndicationState state = null;

	@SerializedName("timeoutOn")
	private DateTime timeoutOn = null;

	@SerializedName("transaction")
	private Transaction transaction = null;

	public DeliveryIndication automaticDecisionReason(DeliveryIndicationDecisionReason automaticDecisionReason) {
		this.automaticDecisionReason = automaticDecisionReason;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DeliveryIndicationDecisionReason getAutomaticDecisionReason() {
		return automaticDecisionReason;
	}

	public void setAutomaticDecisionReason(DeliveryIndicationDecisionReason automaticDecisionReason) {
		this.automaticDecisionReason = automaticDecisionReason;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getAutomaticallyDecidedOn() {
		return automaticallyDecidedOn;
	}

	/**
	 * The created on date indicates the date on which the entity was stored into the database.
	 *
	 * @return The created on date indicates the date on which the entity was stored into the database.
	 */
	@ApiModelProperty(example = "null", value = "The created on date indicates the date on which the entity was stored into the database.")
	public DateTime getCreatedOn() {
		return createdOn;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getManualDecisionTimeoutOn() {
		return manualDecisionTimeoutOn;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Long getManuallyDecidedBy() {
		return manuallyDecidedBy;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getManuallyDecidedOn() {
		return manuallyDecidedOn;
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

	public DeliveryIndication state(DeliveryIndicationState state) {
		this.state = state;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DeliveryIndicationState getState() {
		return state;
	}

	public void setState(DeliveryIndicationState state) {
		this.state = state;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getTimeoutOn() {
		return timeoutOn;
	}

	public DeliveryIndication transaction(Transaction transaction) {
		this.transaction = transaction;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
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

