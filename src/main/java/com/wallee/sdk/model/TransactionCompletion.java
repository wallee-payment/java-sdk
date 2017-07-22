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
import com.wallee.sdk.model.TransactionAwareEntity;
import com.wallee.sdk.model.TransactionCompletionMode;
import com.wallee.sdk.model.TransactionCompletionState;
import com.wallee.sdk.model.TransactionLineItemVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class TransactionCompletion extends TransactionAwareEntity {
	@SerializedName("createdBy")
	private Long createdBy = null;

	@SerializedName("createdOn")
	private DateTime createdOn = null;

	@SerializedName("failedOn")
	private DateTime failedOn = null;

	@SerializedName("failureReason")
	private FailureReason failureReason = null;

	@SerializedName("labels")
	private List<Label> labels = new ArrayList<Label>();

	@SerializedName("language")
	private String language = null;

	@SerializedName("lineItemVersion")
	private TransactionLineItemVersion lineItemVersion = null;

	@SerializedName("mode")
	private TransactionCompletionMode mode = null;

	@SerializedName("nextUpdateOn")
	private DateTime nextUpdateOn = null;

	@SerializedName("paymentInformation")
	private String paymentInformation = null;

	@SerializedName("plannedPurgeDate")
	private DateTime plannedPurgeDate = null;

	@SerializedName("processorReference")
	private String processorReference = null;

	@SerializedName("spaceViewId")
	private Long spaceViewId = null;

	@SerializedName("state")
	private TransactionCompletionState state = null;

	@SerializedName("succeededOn")
	private DateTime succeededOn = null;

	@SerializedName("timeoutOn")
	private DateTime timeoutOn = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Long getCreatedBy() {
		return createdBy;
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
	public DateTime getFailedOn() {
		return failedOn;
	}

	public TransactionCompletion failureReason(FailureReason failureReason) {
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

	public TransactionCompletion labels(List<Label> labels) {
		this.labels = labels;
		return this;
	}

	public TransactionCompletion addLabelsItem(Label labelsItem) {
		this.labels.add(labelsItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public List<Label> getLabels() {
		return labels;
	}

	public void setLabels(List<Label> labels) {
		this.labels = labels;
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

	public TransactionCompletion lineItemVersion(TransactionLineItemVersion lineItemVersion) {
		this.lineItemVersion = lineItemVersion;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public TransactionLineItemVersion getLineItemVersion() {
		return lineItemVersion;
	}

	public void setLineItemVersion(TransactionLineItemVersion lineItemVersion) {
		this.lineItemVersion = lineItemVersion;
	}

	public TransactionCompletion mode(TransactionCompletionMode mode) {
		this.mode = mode;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public TransactionCompletionMode getMode() {
		return mode;
	}

	public void setMode(TransactionCompletionMode mode) {
		this.mode = mode;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getNextUpdateOn() {
		return nextUpdateOn;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getPaymentInformation() {
		return paymentInformation;
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
	public String getProcessorReference() {
		return processorReference;
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

	public TransactionCompletion state(TransactionCompletionState state) {
		this.state = state;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public TransactionCompletionState getState() {
		return state;
	}

	public void setState(TransactionCompletionState state) {
		this.state = state;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getSucceededOn() {
		return succeededOn;
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
		TransactionCompletion transactionCompletion = (TransactionCompletion) o;
		return Objects.equals(this.createdBy, transactionCompletion.createdBy) &&
				Objects.equals(this.createdOn, transactionCompletion.createdOn) &&
				Objects.equals(this.failedOn, transactionCompletion.failedOn) &&
				Objects.equals(this.failureReason, transactionCompletion.failureReason) &&
				Objects.equals(this.labels, transactionCompletion.labels) &&
				Objects.equals(this.language, transactionCompletion.language) &&
				Objects.equals(this.lineItemVersion, transactionCompletion.lineItemVersion) &&
				Objects.equals(this.mode, transactionCompletion.mode) &&
				Objects.equals(this.nextUpdateOn, transactionCompletion.nextUpdateOn) &&
				Objects.equals(this.paymentInformation, transactionCompletion.paymentInformation) &&
				Objects.equals(this.plannedPurgeDate, transactionCompletion.plannedPurgeDate) &&
				Objects.equals(this.processorReference, transactionCompletion.processorReference) &&
				Objects.equals(this.spaceViewId, transactionCompletion.spaceViewId) &&
				Objects.equals(this.state, transactionCompletion.state) &&
				Objects.equals(this.succeededOn, transactionCompletion.succeededOn) &&
				Objects.equals(this.timeoutOn, transactionCompletion.timeoutOn) &&
				Objects.equals(this.version, transactionCompletion.version) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdBy, createdOn, failedOn, failureReason, labels, language, lineItemVersion, mode, nextUpdateOn, paymentInformation, plannedPurgeDate, processorReference, spaceViewId, state, succeededOn, timeoutOn, version, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TransactionCompletion {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
		sb.append("		createdBy: ").append(toIndentedString(createdBy)).append("\n");
		sb.append("		createdOn: ").append(toIndentedString(createdOn)).append("\n");
		sb.append("		failedOn: ").append(toIndentedString(failedOn)).append("\n");
		sb.append("		failureReason: ").append(toIndentedString(failureReason)).append("\n");
		sb.append("		labels: ").append(toIndentedString(labels)).append("\n");
		sb.append("		language: ").append(toIndentedString(language)).append("\n");
		sb.append("		lineItemVersion: ").append(toIndentedString(lineItemVersion)).append("\n");
		sb.append("		mode: ").append(toIndentedString(mode)).append("\n");
		sb.append("		nextUpdateOn: ").append(toIndentedString(nextUpdateOn)).append("\n");
		sb.append("		paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		processorReference: ").append(toIndentedString(processorReference)).append("\n");
		sb.append("		spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("		succeededOn: ").append(toIndentedString(succeededOn)).append("\n");
		sb.append("		timeoutOn: ").append(toIndentedString(timeoutOn)).append("\n");
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

