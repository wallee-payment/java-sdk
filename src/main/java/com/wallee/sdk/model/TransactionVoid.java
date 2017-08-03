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
import com.wallee.sdk.model.FailureReason;
import com.wallee.sdk.model.Label;
import com.wallee.sdk.model.Transaction;
import com.wallee.sdk.model.TransactionAwareEntity;
import com.wallee.sdk.model.TransactionVoidMode;
import com.wallee.sdk.model.TransactionVoidState;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * TransactionVoid
 */
public class TransactionVoid extends TransactionAwareEntity {

	@SerializedName("createdBy")
	private Long createdBy = null;

	@SerializedName("createdOn")
	private OffsetDateTime createdOn = null;

	@SerializedName("failedOn")
	private OffsetDateTime failedOn = null;

	@SerializedName("failureReason")
	private FailureReason failureReason = null;

	@SerializedName("labels")
	private List<Label> labels = new ArrayList<Label>();

	@SerializedName("language")
	private String language = null;

	@SerializedName("mode")
	private TransactionVoidMode mode = null;

	@SerializedName("nextUpdateOn")
	private OffsetDateTime nextUpdateOn = null;

	@SerializedName("plannedPurgeDate")
	private OffsetDateTime plannedPurgeDate = null;

	@SerializedName("processorReference")
	private String processorReference = null;

	@SerializedName("spaceViewId")
	private Long spaceViewId = null;

	@SerializedName("state")
	private TransactionVoidState state = null;

	@SerializedName("succeededOn")
	private OffsetDateTime succeededOn = null;

	@SerializedName("timeoutOn")
	private OffsetDateTime timeoutOn = null;

	@SerializedName("transaction")
	private Transaction transaction = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * createdBy
	 *
	 * @return createdBy
	 */
	public Long getCreatedBy() {
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
	 * failedOn
	 *
	 * @return failedOn
	 */
	public OffsetDateTime getFailedOn() {
		return failedOn;
	}

	/**
	 * failureReason
	 *
	 * @return failureReason
	 */
	public FailureReason getFailureReason() {
		return failureReason;
	}

	/**
	 * labels
	 *
	 * @return labels
	 */
	public List<Label> getLabels() {
		return labels;
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
	 * mode
	 *
	 * @return mode
	 */
	public TransactionVoidMode getMode() {
		return mode;
	}

	/**
	 * nextUpdateOn
	 *
	 * @return nextUpdateOn
	 */
	public OffsetDateTime getNextUpdateOn() {
		return nextUpdateOn;
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
	 * processorReference
	 *
	 * @return processorReference
	 */
	public String getProcessorReference() {
		return processorReference;
	}

	/**
	 * spaceViewId
	 *
	 * @return spaceViewId
	 */
	public Long getSpaceViewId() {
		return spaceViewId;
	}

	/**
	 * state
	 *
	 * @return state
	 */
	public TransactionVoidState getState() {
		return state;
	}

	/**
	 * succeededOn
	 *
	 * @return succeededOn
	 */
	public OffsetDateTime getSucceededOn() {
		return succeededOn;
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
		TransactionVoid transactionVoid = (TransactionVoid) o;
		return Objects.equals(this.createdBy, transactionVoid.createdBy) &&
				Objects.equals(this.createdOn, transactionVoid.createdOn) &&
				Objects.equals(this.failedOn, transactionVoid.failedOn) &&
				Objects.equals(this.failureReason, transactionVoid.failureReason) &&
				Objects.equals(this.labels, transactionVoid.labels) &&
				Objects.equals(this.language, transactionVoid.language) &&
				Objects.equals(this.mode, transactionVoid.mode) &&
				Objects.equals(this.nextUpdateOn, transactionVoid.nextUpdateOn) &&
				Objects.equals(this.plannedPurgeDate, transactionVoid.plannedPurgeDate) &&
				Objects.equals(this.processorReference, transactionVoid.processorReference) &&
				Objects.equals(this.spaceViewId, transactionVoid.spaceViewId) &&
				Objects.equals(this.state, transactionVoid.state) &&
				Objects.equals(this.succeededOn, transactionVoid.succeededOn) &&
				Objects.equals(this.timeoutOn, transactionVoid.timeoutOn) &&
				Objects.equals(this.transaction, transactionVoid.transaction) &&
				Objects.equals(this.version, transactionVoid.version) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdBy, createdOn, failedOn, failureReason, labels, language, mode, nextUpdateOn, plannedPurgeDate, processorReference, spaceViewId, state, succeededOn, timeoutOn, transaction, version, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TransactionVoid {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
		sb.append("		createdBy: ").append(toIndentedString(createdBy)).append("\n");
		sb.append("		createdOn: ").append(toIndentedString(createdOn)).append("\n");
		sb.append("		failedOn: ").append(toIndentedString(failedOn)).append("\n");
		sb.append("		failureReason: ").append(toIndentedString(failureReason)).append("\n");
		sb.append("		labels: ").append(toIndentedString(labels)).append("\n");
		sb.append("		language: ").append(toIndentedString(language)).append("\n");
		sb.append("		mode: ").append(toIndentedString(mode)).append("\n");
		sb.append("		nextUpdateOn: ").append(toIndentedString(nextUpdateOn)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		processorReference: ").append(toIndentedString(processorReference)).append("\n");
		sb.append("		spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("		succeededOn: ").append(toIndentedString(succeededOn)).append("\n");
		sb.append("		timeoutOn: ").append(toIndentedString(timeoutOn)).append("\n");
		sb.append("		transaction: ").append(toIndentedString(transaction)).append("\n");
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

