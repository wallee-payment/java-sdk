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
import com.wallee.sdk.model.Subscription;
import com.wallee.sdk.model.SubscriptionChargeProcessingType;
import com.wallee.sdk.model.SubscriptionChargeState;
import com.wallee.sdk.model.SubscriptionChargeType;
import com.wallee.sdk.model.SubscriptionLedgerEntry;
import com.wallee.sdk.model.Transaction;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * The subscription charge represents a single charge carried out for a particular subscription.
 */
public class SubscriptionCharge {

	@SerializedName("createdOn")
	private OffsetDateTime createdOn = null;

	@SerializedName("discardedBy")
	private Long discardedBy = null;

	@SerializedName("discardedOn")
	private OffsetDateTime discardedOn = null;

	@SerializedName("externalId")
	private String externalId = null;

	@SerializedName("failedOn")
	private OffsetDateTime failedOn = null;

	@SerializedName("failedUrl")
	private String failedUrl = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("ledgerEntries")
	private List<SubscriptionLedgerEntry> ledgerEntries = new ArrayList<SubscriptionLedgerEntry>();

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("plannedExecutionDate")
	private OffsetDateTime plannedExecutionDate = null;

	@SerializedName("plannedPurgeDate")
	private OffsetDateTime plannedPurgeDate = null;

	@SerializedName("processingType")
	private SubscriptionChargeProcessingType processingType = null;

	@SerializedName("reference")
	private String reference = null;

	@SerializedName("state")
	private SubscriptionChargeState state = null;

	@SerializedName("subscription")
	private Subscription subscription = null;

	@SerializedName("succeedOn")
	private OffsetDateTime succeedOn = null;

	@SerializedName("successUrl")
	private String successUrl = null;

	@SerializedName("transaction")
	private Transaction transaction = null;

	@SerializedName("type")
	private SubscriptionChargeType type = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * createdOn
	 *
	 * @return createdOn
	 */
	public OffsetDateTime getCreatedOn() {
		return createdOn;
	}

	/**
	 * discardedBy
	 *
	 * @return discardedBy
	 */
	public Long getDiscardedBy() {
		return discardedBy;
	}

	/**
	 * discardedOn
	 *
	 * @return discardedOn
	 */
	public OffsetDateTime getDiscardedOn() {
		return discardedOn;
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
	 * failedOn
	 *
	 * @return failedOn
	 */
	public OffsetDateTime getFailedOn() {
		return failedOn;
	}

	/**
	 * The user will be redirected to failed URL when the transaction could not be authorized or completed. In case no failed URL is specified a default failed page will be displayed.
	 *
	 * @return The user will be redirected to failed URL when the transaction could not be authorized or completed. In case no failed URL is specified a default failed page will be displayed.
	 */
	public String getFailedUrl() {
		return failedUrl;
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
	 * ledgerEntries
	 *
	 * @return ledgerEntries
	 */
	public List<SubscriptionLedgerEntry> getLedgerEntries() {
		return ledgerEntries;
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
	 * plannedExecutionDate
	 *
	 * @return plannedExecutionDate
	 */
	public OffsetDateTime getPlannedExecutionDate() {
		return plannedExecutionDate;
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
	 * processingType
	 *
	 * @return processingType
	 */
	public SubscriptionChargeProcessingType getProcessingType() {
		return processingType;
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
	public SubscriptionChargeState getState() {
		return state;
	}

	/**
	 * The field subscription indicates the subscription to which the charge belongs to.
	 *
	 * @return The field subscription indicates the subscription to which the charge belongs to.
	 */
	public Subscription getSubscription() {
		return subscription;
	}

	/**
	 * succeedOn
	 *
	 * @return succeedOn
	 */
	public OffsetDateTime getSucceedOn() {
		return succeedOn;
	}

	/**
	 * The user will be redirected to success URL when the transaction could be authorized or completed. In case no success URL is specified a default success page will be displayed.
	 *
	 * @return The user will be redirected to success URL when the transaction could be authorized or completed. In case no success URL is specified a default success page will be displayed.
	 */
	public String getSuccessUrl() {
		return successUrl;
	}

	/**
	 * transaction
	 *
	 * @return transaction
	 */
	public Transaction getTransaction() {
		return transaction;
	}

	/**
	 * type
	 *
	 * @return type
	 */
	public SubscriptionChargeType getType() {
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
		SubscriptionCharge subscriptionCharge = (SubscriptionCharge) o;
		return Objects.equals(this.createdOn, subscriptionCharge.createdOn) &&
				Objects.equals(this.discardedBy, subscriptionCharge.discardedBy) &&
				Objects.equals(this.discardedOn, subscriptionCharge.discardedOn) &&
				Objects.equals(this.externalId, subscriptionCharge.externalId) &&
				Objects.equals(this.failedOn, subscriptionCharge.failedOn) &&
				Objects.equals(this.failedUrl, subscriptionCharge.failedUrl) &&
				Objects.equals(this.id, subscriptionCharge.id) &&
				Objects.equals(this.ledgerEntries, subscriptionCharge.ledgerEntries) &&
				Objects.equals(this.linkedSpaceId, subscriptionCharge.linkedSpaceId) &&
				Objects.equals(this.plannedExecutionDate, subscriptionCharge.plannedExecutionDate) &&
				Objects.equals(this.plannedPurgeDate, subscriptionCharge.plannedPurgeDate) &&
				Objects.equals(this.processingType, subscriptionCharge.processingType) &&
				Objects.equals(this.reference, subscriptionCharge.reference) &&
				Objects.equals(this.state, subscriptionCharge.state) &&
				Objects.equals(this.subscription, subscriptionCharge.subscription) &&
				Objects.equals(this.succeedOn, subscriptionCharge.succeedOn) &&
				Objects.equals(this.successUrl, subscriptionCharge.successUrl) &&
				Objects.equals(this.transaction, subscriptionCharge.transaction) &&
				Objects.equals(this.type, subscriptionCharge.type) &&
				Objects.equals(this.version, subscriptionCharge.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdOn, discardedBy, discardedOn, externalId, failedOn, failedUrl, id, ledgerEntries, linkedSpaceId, plannedExecutionDate, plannedPurgeDate, processingType, reference, state, subscription, succeedOn, successUrl, transaction, type, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SubscriptionCharge {\n");
		
		sb.append("		createdOn: ").append(toIndentedString(createdOn)).append("\n");
		sb.append("		discardedBy: ").append(toIndentedString(discardedBy)).append("\n");
		sb.append("		discardedOn: ").append(toIndentedString(discardedOn)).append("\n");
		sb.append("		externalId: ").append(toIndentedString(externalId)).append("\n");
		sb.append("		failedOn: ").append(toIndentedString(failedOn)).append("\n");
		sb.append("		failedUrl: ").append(toIndentedString(failedUrl)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		ledgerEntries: ").append(toIndentedString(ledgerEntries)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		plannedExecutionDate: ").append(toIndentedString(plannedExecutionDate)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		processingType: ").append(toIndentedString(processingType)).append("\n");
		sb.append("		reference: ").append(toIndentedString(reference)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("		subscription: ").append(toIndentedString(subscription)).append("\n");
		sb.append("		succeedOn: ").append(toIndentedString(succeedOn)).append("\n");
		sb.append("		successUrl: ").append(toIndentedString(successUrl)).append("\n");
		sb.append("		transaction: ").append(toIndentedString(transaction)).append("\n");
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

