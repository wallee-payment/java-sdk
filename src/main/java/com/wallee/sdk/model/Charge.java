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
import com.wallee.sdk.model.ChargeState;
import com.wallee.sdk.model.ChargeType;
import com.wallee.sdk.model.FailureReason;
import com.wallee.sdk.model.Transaction;
import com.wallee.sdk.model.TransactionAwareEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class Charge extends TransactionAwareEntity {
	@SerializedName("createdOn")
	private DateTime createdOn = null;

	@SerializedName("failureReason")
	private FailureReason failureReason = null;

	@SerializedName("language")
	private String language = null;

	@SerializedName("plannedPurgeDate")
	private DateTime plannedPurgeDate = null;

	@SerializedName("spaceViewId")
	private Long spaceViewId = null;

	@SerializedName("state")
	private ChargeState state = null;

	@SerializedName("timeoutOn")
	private DateTime timeoutOn = null;

	@SerializedName("transaction")
	private Transaction transaction = null;

	@SerializedName("type")
	private ChargeType type = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * The date on which the charge was created on.
	 *
	 * @return The date on which the charge was created on.
	 */
	@ApiModelProperty(example = "null", value = "The date on which the charge was created on.")
	public DateTime getCreatedOn() {
		return createdOn;
	}

	public Charge failureReason(FailureReason failureReason) {
		this.failureReason = failureReason;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public FailureReason getFailureReason() {
		return failureReason;
	}

	public void setFailureReason(FailureReason failureReason) {
		this.failureReason = failureReason;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getLanguage() {
		return language;
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
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Long getSpaceViewId() {
		return spaceViewId;
	}

	public Charge state(ChargeState state) {
		this.state = state;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public ChargeState getState() {
		return state;
	}

	public void setState(ChargeState state) {
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

	public Charge transaction(Transaction transaction) {
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

	public Charge type(ChargeType type) {
		this.type = type;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public ChargeType getType() {
		return type;
	}

	public void setType(ChargeType type) {
		this.type = type;
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
				Objects.equals(this.timeoutOn, charge.timeoutOn) &&
				Objects.equals(this.transaction, charge.transaction) &&
				Objects.equals(this.type, charge.type) &&
				Objects.equals(this.version, charge.version) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdOn, failureReason, language, plannedPurgeDate, spaceViewId, state, timeoutOn, transaction, type, version, super.hashCode());
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
		sb.append("		timeoutOn: ").append(toIndentedString(timeoutOn)).append("\n");
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

