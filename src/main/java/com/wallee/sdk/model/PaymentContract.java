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
import com.wallee.sdk.model.Account;
import com.wallee.sdk.model.FailureReason;
import com.wallee.sdk.model.PaymentContractState;
import com.wallee.sdk.model.PaymentContractType;
import com.wallee.sdk.model.User;
import java.time.OffsetDateTime;

/**
 * PaymentContract
 */
public class PaymentContract {

	@SerializedName("account")
	private Account account = null;

	@SerializedName("activatedOn")
	private OffsetDateTime activatedOn = null;

	@SerializedName("contractIdentifier")
	private String contractIdentifier = null;

	@SerializedName("contractType")
	private PaymentContractType contractType = null;

	@SerializedName("createdBy")
	private User createdBy = null;

	@SerializedName("createdOn")
	private OffsetDateTime createdOn = null;

	@SerializedName("externalId")
	private String externalId = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("rejectedOn")
	private OffsetDateTime rejectedOn = null;

	@SerializedName("rejectionReason")
	private FailureReason rejectionReason = null;

	@SerializedName("startTerminatingOn")
	private OffsetDateTime startTerminatingOn = null;

	@SerializedName("state")
	private PaymentContractState state = null;

	@SerializedName("terminatedBy")
	private User terminatedBy = null;

	@SerializedName("terminatedOn")
	private OffsetDateTime terminatedOn = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * account
	 *
	 * @return account
	 */
	public Account getAccount() {
		return account;
	}

	/**
	 * activatedOn
	 *
	 * @return activatedOn
	 */
	public OffsetDateTime getActivatedOn() {
		return activatedOn;
	}

	/**
	 * contractIdentifier
	 *
	 * @return contractIdentifier
	 */
	public String getContractIdentifier() {
		return contractIdentifier;
	}

	/**
	 * contractType
	 *
	 * @return contractType
	 */
	public PaymentContractType getContractType() {
		return contractType;
	}

	/**
	 * createdBy
	 *
	 * @return createdBy
	 */
	public User getCreatedBy() {
		return createdBy;
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
	 * rejectedOn
	 *
	 * @return rejectedOn
	 */
	public OffsetDateTime getRejectedOn() {
		return rejectedOn;
	}

	/**
	 * rejectionReason
	 *
	 * @return rejectionReason
	 */
	public FailureReason getRejectionReason() {
		return rejectionReason;
	}

	/**
	 * startTerminatingOn
	 *
	 * @return startTerminatingOn
	 */
	public OffsetDateTime getStartTerminatingOn() {
		return startTerminatingOn;
	}

	/**
	 * state
	 *
	 * @return state
	 */
	public PaymentContractState getState() {
		return state;
	}

	/**
	 * terminatedBy
	 *
	 * @return terminatedBy
	 */
	public User getTerminatedBy() {
		return terminatedBy;
	}

	/**
	 * terminatedOn
	 *
	 * @return terminatedOn
	 */
	public OffsetDateTime getTerminatedOn() {
		return terminatedOn;
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
		PaymentContract paymentContract = (PaymentContract) o;
		return Objects.equals(this.account, paymentContract.account) &&
				Objects.equals(this.activatedOn, paymentContract.activatedOn) &&
				Objects.equals(this.contractIdentifier, paymentContract.contractIdentifier) &&
				Objects.equals(this.contractType, paymentContract.contractType) &&
				Objects.equals(this.createdBy, paymentContract.createdBy) &&
				Objects.equals(this.createdOn, paymentContract.createdOn) &&
				Objects.equals(this.externalId, paymentContract.externalId) &&
				Objects.equals(this.id, paymentContract.id) &&
				Objects.equals(this.rejectedOn, paymentContract.rejectedOn) &&
				Objects.equals(this.rejectionReason, paymentContract.rejectionReason) &&
				Objects.equals(this.startTerminatingOn, paymentContract.startTerminatingOn) &&
				Objects.equals(this.state, paymentContract.state) &&
				Objects.equals(this.terminatedBy, paymentContract.terminatedBy) &&
				Objects.equals(this.terminatedOn, paymentContract.terminatedOn) &&
				Objects.equals(this.version, paymentContract.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(account, activatedOn, contractIdentifier, contractType, createdBy, createdOn, externalId, id, rejectedOn, rejectionReason, startTerminatingOn, state, terminatedBy, terminatedOn, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PaymentContract {\n");
		
		sb.append("		account: ").append(toIndentedString(account)).append("\n");
		sb.append("		activatedOn: ").append(toIndentedString(activatedOn)).append("\n");
		sb.append("		contractIdentifier: ").append(toIndentedString(contractIdentifier)).append("\n");
		sb.append("		contractType: ").append(toIndentedString(contractType)).append("\n");
		sb.append("		createdBy: ").append(toIndentedString(createdBy)).append("\n");
		sb.append("		createdOn: ").append(toIndentedString(createdOn)).append("\n");
		sb.append("		externalId: ").append(toIndentedString(externalId)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		rejectedOn: ").append(toIndentedString(rejectedOn)).append("\n");
		sb.append("		rejectionReason: ").append(toIndentedString(rejectionReason)).append("\n");
		sb.append("		startTerminatingOn: ").append(toIndentedString(startTerminatingOn)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("		terminatedBy: ").append(toIndentedString(terminatedBy)).append("\n");
		sb.append("		terminatedOn: ").append(toIndentedString(terminatedOn)).append("\n");
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

