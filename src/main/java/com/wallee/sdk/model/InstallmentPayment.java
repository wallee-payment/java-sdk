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
import com.wallee.sdk.model.InstallmentPaymentState;
import com.wallee.sdk.model.LineItem;
import com.wallee.sdk.model.Transaction;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * An installment payment represents a payment paid in multiple slices.
 */
public class InstallmentPayment {

	@SerializedName("createdOn")
	private OffsetDateTime createdOn = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("initialTransaction")
	private Transaction initialTransaction = null;

	@SerializedName("lineItems")
	private List<LineItem> lineItems = new ArrayList<LineItem>();

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("planConfiguration")
	private Long planConfiguration = null;

	@SerializedName("plannedPurgeDate")
	private OffsetDateTime plannedPurgeDate = null;

	@SerializedName("state")
	private InstallmentPaymentState state = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * The created on date indicates the date on which the entity was stored into the database.
	 *
	 * @return The created on date indicates the date on which the entity was stored into the database.
	 */
	public OffsetDateTime getCreatedOn() {
		return createdOn;
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
	 * initialTransaction
	 *
	 * @return initialTransaction
	 */
	public Transaction getInitialTransaction() {
		return initialTransaction;
	}

	/**
	 * lineItems
	 *
	 * @return lineItems
	 */
	public List<LineItem> getLineItems() {
		return lineItems;
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
	 * planConfiguration
	 *
	 * @return planConfiguration
	 */
	public Long getPlanConfiguration() {
		return planConfiguration;
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
	public InstallmentPaymentState getState() {
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
		InstallmentPayment installmentPayment = (InstallmentPayment) o;
		return Objects.equals(this.createdOn, installmentPayment.createdOn) &&
				Objects.equals(this.id, installmentPayment.id) &&
				Objects.equals(this.initialTransaction, installmentPayment.initialTransaction) &&
				Objects.equals(this.lineItems, installmentPayment.lineItems) &&
				Objects.equals(this.linkedSpaceId, installmentPayment.linkedSpaceId) &&
				Objects.equals(this.planConfiguration, installmentPayment.planConfiguration) &&
				Objects.equals(this.plannedPurgeDate, installmentPayment.plannedPurgeDate) &&
				Objects.equals(this.state, installmentPayment.state) &&
				Objects.equals(this.version, installmentPayment.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdOn, id, initialTransaction, lineItems, linkedSpaceId, planConfiguration, plannedPurgeDate, state, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InstallmentPayment {\n");
		
		sb.append("		createdOn: ").append(toIndentedString(createdOn)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		initialTransaction: ").append(toIndentedString(initialTransaction)).append("\n");
		sb.append("		lineItems: ").append(toIndentedString(lineItems)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		planConfiguration: ").append(toIndentedString(planConfiguration)).append("\n");
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

