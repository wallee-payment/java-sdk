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
import com.wallee.sdk.model.Address;
import com.wallee.sdk.model.ChargeAttemptEnvironment;
import com.wallee.sdk.model.Label;
import com.wallee.sdk.model.PaymentConnectorConfiguration;
import com.wallee.sdk.model.Token;
import com.wallee.sdk.model.TokenVersionState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class TokenVersion {
	@SerializedName("activatedOn")
	private DateTime activatedOn = null;

	@SerializedName("billingAddress")
	private Address billingAddress = null;

	@SerializedName("createdOn")
	private DateTime createdOn = null;

	@SerializedName("environment")
	private ChargeAttemptEnvironment environment = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("labels")
	private List<Label> labels = new ArrayList<Label>();

	@SerializedName("language")
	private String language = null;

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("obsoletedOn")
	private DateTime obsoletedOn = null;

	@SerializedName("paymentConnectorConfiguration")
	private PaymentConnectorConfiguration paymentConnectorConfiguration = null;

	@SerializedName("plannedPurgeDate")
	private DateTime plannedPurgeDate = null;

	@SerializedName("processorToken")
	private String processorToken = null;

	@SerializedName("shippingAddress")
	private Address shippingAddress = null;

	@SerializedName("state")
	private TokenVersionState state = null;

	@SerializedName("token")
	private Token token = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getActivatedOn() {
		return activatedOn;
	}

	public TokenVersion billingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
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

	public TokenVersion environment(ChargeAttemptEnvironment environment) {
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

	public TokenVersion id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 *
	 * @return The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 */
	@ApiModelProperty(example = "null", value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TokenVersion labels(List<Label> labels) {
		this.labels = labels;
		return this;
	}

	public TokenVersion addLabelsItem(Label labelsItem) {
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
	 * The linked space id holds the ID of the space to which the entity belongs to.
	 *
	 * @return The linked space id holds the ID of the space to which the entity belongs to.
	 */
	@ApiModelProperty(example = "null", value = "The linked space id holds the ID of the space to which the entity belongs to.")
	public Long getLinkedSpaceId() {
		return linkedSpaceId;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getName() {
		return name;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getObsoletedOn() {
		return obsoletedOn;
	}

	public TokenVersion paymentConnectorConfiguration(PaymentConnectorConfiguration paymentConnectorConfiguration) {
		this.paymentConnectorConfiguration = paymentConnectorConfiguration;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public PaymentConnectorConfiguration getPaymentConnectorConfiguration() {
		return paymentConnectorConfiguration;
	}

	public void setPaymentConnectorConfiguration(PaymentConnectorConfiguration paymentConnectorConfiguration) {
		this.paymentConnectorConfiguration = paymentConnectorConfiguration;
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
	public String getProcessorToken() {
		return processorToken;
	}

	public TokenVersion shippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public TokenVersion state(TokenVersionState state) {
		this.state = state;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public TokenVersionState getState() {
		return state;
	}

	public void setState(TokenVersionState state) {
		this.state = state;
	}

	public TokenVersion token(Token token) {
		this.token = token;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Token getToken() {
		return token;
	}

	public void setToken(Token token) {
		this.token = token;
	}

	public TokenVersion version(Integer version) {
		this.version = version;
		return this;
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

	public void setVersion(Integer version) {
		this.version = version;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TokenVersion tokenVersion = (TokenVersion) o;
		return Objects.equals(this.activatedOn, tokenVersion.activatedOn) &&
				Objects.equals(this.billingAddress, tokenVersion.billingAddress) &&
				Objects.equals(this.createdOn, tokenVersion.createdOn) &&
				Objects.equals(this.environment, tokenVersion.environment) &&
				Objects.equals(this.id, tokenVersion.id) &&
				Objects.equals(this.labels, tokenVersion.labels) &&
				Objects.equals(this.language, tokenVersion.language) &&
				Objects.equals(this.linkedSpaceId, tokenVersion.linkedSpaceId) &&
				Objects.equals(this.name, tokenVersion.name) &&
				Objects.equals(this.obsoletedOn, tokenVersion.obsoletedOn) &&
				Objects.equals(this.paymentConnectorConfiguration, tokenVersion.paymentConnectorConfiguration) &&
				Objects.equals(this.plannedPurgeDate, tokenVersion.plannedPurgeDate) &&
				Objects.equals(this.processorToken, tokenVersion.processorToken) &&
				Objects.equals(this.shippingAddress, tokenVersion.shippingAddress) &&
				Objects.equals(this.state, tokenVersion.state) &&
				Objects.equals(this.token, tokenVersion.token) &&
				Objects.equals(this.version, tokenVersion.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(activatedOn, billingAddress, createdOn, environment, id, labels, language, linkedSpaceId, name, obsoletedOn, paymentConnectorConfiguration, plannedPurgeDate, processorToken, shippingAddress, state, token, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TokenVersion {\n");
		
		sb.append("		activatedOn: ").append(toIndentedString(activatedOn)).append("\n");
		sb.append("		billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
		sb.append("		createdOn: ").append(toIndentedString(createdOn)).append("\n");
		sb.append("		environment: ").append(toIndentedString(environment)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		labels: ").append(toIndentedString(labels)).append("\n");
		sb.append("		language: ").append(toIndentedString(language)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		obsoletedOn: ").append(toIndentedString(obsoletedOn)).append("\n");
		sb.append("		paymentConnectorConfiguration: ").append(toIndentedString(paymentConnectorConfiguration)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		processorToken: ").append(toIndentedString(processorToken)).append("\n");
		sb.append("		shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("		token: ").append(toIndentedString(token)).append("\n");
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

