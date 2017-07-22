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
import com.wallee.sdk.model.Charge;
import com.wallee.sdk.model.ChargeAttemptEnvironment;
import com.wallee.sdk.model.ChargeAttemptState;
import com.wallee.sdk.model.ConnectorInvocation;
import com.wallee.sdk.model.FailureReason;
import com.wallee.sdk.model.Label;
import com.wallee.sdk.model.PaymentConnectorConfiguration;
import com.wallee.sdk.model.TokenVersion;
import com.wallee.sdk.model.TransactionAwareEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class ChargeAttempt extends TransactionAwareEntity {
	@SerializedName("charge")
	private Charge charge = null;

	@SerializedName("connectorConfiguration")
	private PaymentConnectorConfiguration connectorConfiguration = null;

	@SerializedName("createdOn")
	private DateTime createdOn = null;

	@SerializedName("environment")
	private ChargeAttemptEnvironment environment = null;

	@SerializedName("failedOn")
	private DateTime failedOn = null;

	@SerializedName("failureReason")
	private FailureReason failureReason = null;

	@SerializedName("initializingTokenVersion")
	private Boolean initializingTokenVersion = null;

	@SerializedName("invocation")
	private ConnectorInvocation invocation = null;

	@SerializedName("labels")
	private List<Label> labels = new ArrayList<Label>();

	@SerializedName("language")
	private String language = null;

	@SerializedName("nextUpdateOn")
	private DateTime nextUpdateOn = null;

	@SerializedName("plannedPurgeDate")
	private DateTime plannedPurgeDate = null;

	@SerializedName("redirectionUrl")
	private String redirectionUrl = null;

	@SerializedName("spaceViewId")
	private Long spaceViewId = null;

	@SerializedName("state")
	private ChargeAttemptState state = null;

	@SerializedName("succeededOn")
	private DateTime succeededOn = null;

	@SerializedName("timeoutOn")
	private DateTime timeoutOn = null;

	@SerializedName("tokenVersion")
	private TokenVersion tokenVersion = null;

	@SerializedName("userFailureMessage")
	private String userFailureMessage = null;

	@SerializedName("version")
	private Integer version = null;

	public ChargeAttempt charge(Charge charge) {
		this.charge = charge;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Charge getCharge() {
		return charge;
	}

	public void setCharge(Charge charge) {
		this.charge = charge;
	}

	public ChargeAttempt connectorConfiguration(PaymentConnectorConfiguration connectorConfiguration) {
		this.connectorConfiguration = connectorConfiguration;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public PaymentConnectorConfiguration getConnectorConfiguration() {
		return connectorConfiguration;
	}

	public void setConnectorConfiguration(PaymentConnectorConfiguration connectorConfiguration) {
		this.connectorConfiguration = connectorConfiguration;
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

	public ChargeAttempt environment(ChargeAttemptEnvironment environment) {
		this.environment = environment;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public ChargeAttemptEnvironment getEnvironment() {
		return environment;
	}

	public void setEnvironment(ChargeAttemptEnvironment environment) {
		this.environment = environment;
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

	public ChargeAttempt failureReason(FailureReason failureReason) {
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
	public Boolean getInitializingTokenVersion() {
		return initializingTokenVersion;
	}

	public ChargeAttempt invocation(ConnectorInvocation invocation) {
		this.invocation = invocation;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public ConnectorInvocation getInvocation() {
		return invocation;
	}

	public void setInvocation(ConnectorInvocation invocation) {
		this.invocation = invocation;
	}

	public ChargeAttempt labels(List<Label> labels) {
		this.labels = labels;
		return this;
	}

	public ChargeAttempt addLabelsItem(Label labelsItem) {
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
	public String getRedirectionUrl() {
		return redirectionUrl;
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

	public ChargeAttempt state(ChargeAttemptState state) {
		this.state = state;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public ChargeAttemptState getState() {
		return state;
	}

	public void setState(ChargeAttemptState state) {
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

	public ChargeAttempt tokenVersion(TokenVersion tokenVersion) {
		this.tokenVersion = tokenVersion;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public TokenVersion getTokenVersion() {
		return tokenVersion;
	}

	public void setTokenVersion(TokenVersion tokenVersion) {
		this.tokenVersion = tokenVersion;
	}

	/**
	 * The user failure message contains the message for the user in case the attempt failed. The message is localized into the language specified on the transaction.
	 *
	 * @return The user failure message contains the message for the user in case the attempt failed. The message is localized into the language specified on the transaction.
	 */
	@ApiModelProperty(example = "null", value = "The user failure message contains the message for the user in case the attempt failed. The message is localized into the language specified on the transaction.")
	public String getUserFailureMessage() {
		return userFailureMessage;
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
		ChargeAttempt chargeAttempt = (ChargeAttempt) o;
		return Objects.equals(this.charge, chargeAttempt.charge) &&
				Objects.equals(this.connectorConfiguration, chargeAttempt.connectorConfiguration) &&
				Objects.equals(this.createdOn, chargeAttempt.createdOn) &&
				Objects.equals(this.environment, chargeAttempt.environment) &&
				Objects.equals(this.failedOn, chargeAttempt.failedOn) &&
				Objects.equals(this.failureReason, chargeAttempt.failureReason) &&
				Objects.equals(this.initializingTokenVersion, chargeAttempt.initializingTokenVersion) &&
				Objects.equals(this.invocation, chargeAttempt.invocation) &&
				Objects.equals(this.labels, chargeAttempt.labels) &&
				Objects.equals(this.language, chargeAttempt.language) &&
				Objects.equals(this.nextUpdateOn, chargeAttempt.nextUpdateOn) &&
				Objects.equals(this.plannedPurgeDate, chargeAttempt.plannedPurgeDate) &&
				Objects.equals(this.redirectionUrl, chargeAttempt.redirectionUrl) &&
				Objects.equals(this.spaceViewId, chargeAttempt.spaceViewId) &&
				Objects.equals(this.state, chargeAttempt.state) &&
				Objects.equals(this.succeededOn, chargeAttempt.succeededOn) &&
				Objects.equals(this.timeoutOn, chargeAttempt.timeoutOn) &&
				Objects.equals(this.tokenVersion, chargeAttempt.tokenVersion) &&
				Objects.equals(this.userFailureMessage, chargeAttempt.userFailureMessage) &&
				Objects.equals(this.version, chargeAttempt.version) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(charge, connectorConfiguration, createdOn, environment, failedOn, failureReason, initializingTokenVersion, invocation, labels, language, nextUpdateOn, plannedPurgeDate, redirectionUrl, spaceViewId, state, succeededOn, timeoutOn, tokenVersion, userFailureMessage, version, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ChargeAttempt {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
		sb.append("		charge: ").append(toIndentedString(charge)).append("\n");
		sb.append("		connectorConfiguration: ").append(toIndentedString(connectorConfiguration)).append("\n");
		sb.append("		createdOn: ").append(toIndentedString(createdOn)).append("\n");
		sb.append("		environment: ").append(toIndentedString(environment)).append("\n");
		sb.append("		failedOn: ").append(toIndentedString(failedOn)).append("\n");
		sb.append("		failureReason: ").append(toIndentedString(failureReason)).append("\n");
		sb.append("		initializingTokenVersion: ").append(toIndentedString(initializingTokenVersion)).append("\n");
		sb.append("		invocation: ").append(toIndentedString(invocation)).append("\n");
		sb.append("		labels: ").append(toIndentedString(labels)).append("\n");
		sb.append("		language: ").append(toIndentedString(language)).append("\n");
		sb.append("		nextUpdateOn: ").append(toIndentedString(nextUpdateOn)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		redirectionUrl: ").append(toIndentedString(redirectionUrl)).append("\n");
		sb.append("		spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("		succeededOn: ").append(toIndentedString(succeededOn)).append("\n");
		sb.append("		timeoutOn: ").append(toIndentedString(timeoutOn)).append("\n");
		sb.append("		tokenVersion: ").append(toIndentedString(tokenVersion)).append("\n");
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

