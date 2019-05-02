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
import com.wallee.sdk.model.ChargeState;
import com.wallee.sdk.model.ChargeType;
import com.wallee.sdk.model.FailureReason;
import com.wallee.sdk.model.Transaction;
import com.wallee.sdk.model.TransactionAwareEntity;
import java.time.OffsetDateTime;

/**
 * Charge
 */
public class Charge extends TransactionAwareEntity {

	@SerializedName("createdOn")
	private OffsetDateTime createdOn = null;

	@SerializedName("failureReason")
	private FailureReason failureReason = null;

	@SerializedName("language")
	private String language = null;

	@SerializedName("plannedPurgeDate")
	private OffsetDateTime plannedPurgeDate = null;

	@SerializedName("spaceViewId")
	private Long spaceViewId = null;

	@SerializedName("state")
	private ChargeState state = null;

	@SerializedName("timeZone")
	private String timeZone = null;

	@SerializedName("timeoutOn")
	private OffsetDateTime timeoutOn = null;

	@SerializedName("transaction")
	private Transaction transaction = null;

	@SerializedName("type")
	private ChargeType type = null;

	@SerializedName("userFailureMessage")
	private String userFailureMessage = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * The date on which the charge was created on.
	 *
	 * @return The date on which the charge was created on.
	 */
	public OffsetDateTime getCreatedOn() {
		return createdOn;
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
	 * language
	 *
	 * @return language
	 */
	public String getLanguage() {
		return language;
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
	public ChargeState getState() {
		return state;
	}

	/**
	 * timeZone
	 *
	 * @return timeZone
	 */
	public String getTimeZone() {
		return timeZone;
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
	 * type
	 *
	 * @return type
	 */
	public ChargeType getType() {
		return type;
	}

	/**
	 * The failure message describes for an end user why the charge is failed in the language of the user. This is only provided when the charge is marked as failed.
	 *
	 * @return The failure message describes for an end user why the charge is failed in the language of the user. This is only provided when the charge is marked as failed.
	 */
	public String getUserFailureMessage() {
		return userFailureMessage;
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
		Charge charge = (Charge) o;
		return Objects.equals(this.createdOn, charge.createdOn) &&
				Objects.equals(this.failureReason, charge.failureReason) &&
				Objects.equals(this.language, charge.language) &&
				Objects.equals(this.plannedPurgeDate, charge.plannedPurgeDate) &&
				Objects.equals(this.spaceViewId, charge.spaceViewId) &&
				Objects.equals(this.state, charge.state) &&
				Objects.equals(this.timeZone, charge.timeZone) &&
				Objects.equals(this.timeoutOn, charge.timeoutOn) &&
				Objects.equals(this.transaction, charge.transaction) &&
				Objects.equals(this.type, charge.type) &&
				Objects.equals(this.userFailureMessage, charge.userFailureMessage) &&
				Objects.equals(this.version, charge.version) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdOn, failureReason, language, plannedPurgeDate, spaceViewId, state, timeZone, timeoutOn, transaction, type, userFailureMessage, version, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Charge {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
		sb.append("		createdOn: ").append(toIndentedString(createdOn)).append("\n");
		sb.append("		failureReason: ").append(toIndentedString(failureReason)).append("\n");
		sb.append("		language: ").append(toIndentedString(language)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("		timeZone: ").append(toIndentedString(timeZone)).append("\n");
		sb.append("		timeoutOn: ").append(toIndentedString(timeoutOn)).append("\n");
		sb.append("		transaction: ").append(toIndentedString(transaction)).append("\n");
		sb.append("		type: ").append(toIndentedString(type)).append("\n");
		sb.append("		userFailureMessage: ").append(toIndentedString(userFailureMessage)).append("\n");
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

