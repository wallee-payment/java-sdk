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
import com.wallee.sdk.model.TokenVersionType;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * TokenVersion
 */
public class TokenVersion {

	@SerializedName("activatedOn")
	private OffsetDateTime activatedOn = null;

	@SerializedName("billingAddress")
	private Address billingAddress = null;

	@SerializedName("createdOn")
	private OffsetDateTime createdOn = null;

	@SerializedName("environment")
	private ChargeAttemptEnvironment environment = null;

	@SerializedName("expiresOn")
	private OffsetDateTime expiresOn = null;

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
	private OffsetDateTime obsoletedOn = null;

	@SerializedName("paymentConnectorConfiguration")
	private PaymentConnectorConfiguration paymentConnectorConfiguration = null;

	@SerializedName("plannedPurgeDate")
	private OffsetDateTime plannedPurgeDate = null;

	@SerializedName("processorToken")
	private String processorToken = null;

	@SerializedName("shippingAddress")
	private Address shippingAddress = null;

	@SerializedName("state")
	private TokenVersionState state = null;

	@SerializedName("token")
	private Token token = null;

	@SerializedName("type")
	private TokenVersionType type = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * activatedOn
	 *
	 * @return activatedOn
	 */
	public OffsetDateTime getActivatedOn() {
		return activatedOn;
	}

	/**
	 * billingAddress
	 *
	 * @return billingAddress
	 */
	public Address getBillingAddress() {
		return billingAddress;
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
	 * environment
	 *
	 * @return environment
	 */
	public ChargeAttemptEnvironment getEnvironment() {
		return environment;
	}

	/**
	 * The expires on date indicates when token version expires. Once this date is reached the token version is marked as obsolete.
	 *
	 * @return The expires on date indicates when token version expires. Once this date is reached the token version is marked as obsolete.
	 */
	public OffsetDateTime getExpiresOn() {
		return expiresOn;
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
	 * The linked space id holds the ID of the space to which the entity belongs to.
	 *
	 * @return The linked space id holds the ID of the space to which the entity belongs to.
	 */
	public Long getLinkedSpaceId() {
		return linkedSpaceId;
	}

	/**
	 * name
	 *
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * obsoletedOn
	 *
	 * @return obsoletedOn
	 */
	public OffsetDateTime getObsoletedOn() {
		return obsoletedOn;
	}

	/**
	 * paymentConnectorConfiguration
	 *
	 * @return paymentConnectorConfiguration
	 */
	public PaymentConnectorConfiguration getPaymentConnectorConfiguration() {
		return paymentConnectorConfiguration;
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
	 * processorToken
	 *
	 * @return processorToken
	 */
	public String getProcessorToken() {
		return processorToken;
	}

	/**
	 * shippingAddress
	 *
	 * @return shippingAddress
	 */
	public Address getShippingAddress() {
		return shippingAddress;
	}

	/**
	 * state
	 *
	 * @return state
	 */
	public TokenVersionState getState() {
		return state;
	}

	/**
	 * token
	 *
	 * @return token
	 */
	public Token getToken() {
		return token;
	}

	/**
	 * The token version type determines what kind of token it is and by which payment connector the token can be processed by.
	 *
	 * @return The token version type determines what kind of token it is and by which payment connector the token can be processed by.
	 */
	public TokenVersionType getType() {
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
		TokenVersion tokenVersion = (TokenVersion) o;
		return Objects.equals(this.activatedOn, tokenVersion.activatedOn) &&
				Objects.equals(this.billingAddress, tokenVersion.billingAddress) &&
				Objects.equals(this.createdOn, tokenVersion.createdOn) &&
				Objects.equals(this.environment, tokenVersion.environment) &&
				Objects.equals(this.expiresOn, tokenVersion.expiresOn) &&
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
				Objects.equals(this.type, tokenVersion.type) &&
				Objects.equals(this.version, tokenVersion.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(activatedOn, billingAddress, createdOn, environment, expiresOn, id, labels, language, linkedSpaceId, name, obsoletedOn, paymentConnectorConfiguration, plannedPurgeDate, processorToken, shippingAddress, state, token, type, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TokenVersion {\n");
		
		sb.append("		activatedOn: ").append(toIndentedString(activatedOn)).append("\n");
		sb.append("		billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
		sb.append("		createdOn: ").append(toIndentedString(createdOn)).append("\n");
		sb.append("		environment: ").append(toIndentedString(environment)).append("\n");
		sb.append("		expiresOn: ").append(toIndentedString(expiresOn)).append("\n");
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

