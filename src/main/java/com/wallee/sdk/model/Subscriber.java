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
import com.wallee.sdk.model.CreationEntityState;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A subscriber represents everyone who is subscribed to a product.
 */
public class Subscriber {

	@SerializedName("additionalAllowedPaymentMethodConfigurations")
	private List<Long> additionalAllowedPaymentMethodConfigurations = new ArrayList<Long>();

	@SerializedName("billingAddress")
	private Address billingAddress = null;

	@SerializedName("description")
	private String description = null;

	@SerializedName("disallowedPaymentMethodConfigurations")
	private List<Long> disallowedPaymentMethodConfigurations = new ArrayList<Long>();

	@SerializedName("emailAddress")
	private String emailAddress = null;

	@SerializedName("externalId")
	private String externalId = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("language")
	private String language = null;

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("metaData")
	private Map<String, String> metaData = new HashMap<String, String>();

	@SerializedName("plannedPurgeDate")
	private OffsetDateTime plannedPurgeDate = null;

	@SerializedName("reference")
	private String reference = null;

	@SerializedName("shippingAddress")
	private Address shippingAddress = null;

	@SerializedName("state")
	private CreationEntityState state = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * Those payment methods which are allowed additionally will be available even when the product does not allow those methods.
	 *
	 * @return Those payment methods which are allowed additionally will be available even when the product does not allow those methods.
	 */
	public List<Long> getAdditionalAllowedPaymentMethodConfigurations() {
		return additionalAllowedPaymentMethodConfigurations;
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
	 * The subscriber description can be used to add a description to the subscriber. This is used in the back office to identify the subscriber.
	 *
	 * @return The subscriber description can be used to add a description to the subscriber. This is used in the back office to identify the subscriber.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Those payment methods which are disallowed will not be available to the subscriber even if the product allows those methods.
	 *
	 * @return Those payment methods which are disallowed will not be available to the subscriber even if the product allows those methods.
	 */
	public List<Long> getDisallowedPaymentMethodConfigurations() {
		return disallowedPaymentMethodConfigurations;
	}

	/**
	 * The email address is used to communicate with the subscriber. There can be only one subscriber per space with the same email address.
	 *
	 * @return The email address is used to communicate with the subscriber. There can be only one subscriber per space with the same email address.
	 */
	public String getEmailAddress() {
		return emailAddress;
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
	 * The subscriber language determines the language which is used to communicate with the subscriber in emails and documents (e.g. invoices).
	 *
	 * @return The subscriber language determines the language which is used to communicate with the subscriber in emails and documents (e.g. invoices).
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
	 * Meta data allow to store additional data along the object.
	 *
	 * @return Meta data allow to store additional data along the object.
	 */
	public Map<String, String> getMetaData() {
		return metaData;
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
	 * The subscriber reference identifies the subscriber in administrative interfaces (e.g. customer id).
	 *
	 * @return The subscriber reference identifies the subscriber in administrative interfaces (e.g. customer id).
	 */
	public String getReference() {
		return reference;
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
	public CreationEntityState getState() {
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
		Subscriber subscriber = (Subscriber) o;
		return Objects.equals(this.additionalAllowedPaymentMethodConfigurations, subscriber.additionalAllowedPaymentMethodConfigurations) &&
				Objects.equals(this.billingAddress, subscriber.billingAddress) &&
				Objects.equals(this.description, subscriber.description) &&
				Objects.equals(this.disallowedPaymentMethodConfigurations, subscriber.disallowedPaymentMethodConfigurations) &&
				Objects.equals(this.emailAddress, subscriber.emailAddress) &&
				Objects.equals(this.externalId, subscriber.externalId) &&
				Objects.equals(this.id, subscriber.id) &&
				Objects.equals(this.language, subscriber.language) &&
				Objects.equals(this.linkedSpaceId, subscriber.linkedSpaceId) &&
				Objects.equals(this.metaData, subscriber.metaData) &&
				Objects.equals(this.plannedPurgeDate, subscriber.plannedPurgeDate) &&
				Objects.equals(this.reference, subscriber.reference) &&
				Objects.equals(this.shippingAddress, subscriber.shippingAddress) &&
				Objects.equals(this.state, subscriber.state) &&
				Objects.equals(this.version, subscriber.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(additionalAllowedPaymentMethodConfigurations, billingAddress, description, disallowedPaymentMethodConfigurations, emailAddress, externalId, id, language, linkedSpaceId, metaData, plannedPurgeDate, reference, shippingAddress, state, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Subscriber {\n");
		
		sb.append("		additionalAllowedPaymentMethodConfigurations: ").append(toIndentedString(additionalAllowedPaymentMethodConfigurations)).append("\n");
		sb.append("		billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
		sb.append("		description: ").append(toIndentedString(description)).append("\n");
		sb.append("		disallowedPaymentMethodConfigurations: ").append(toIndentedString(disallowedPaymentMethodConfigurations)).append("\n");
		sb.append("		emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
		sb.append("		externalId: ").append(toIndentedString(externalId)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		language: ").append(toIndentedString(language)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		metaData: ").append(toIndentedString(metaData)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		reference: ").append(toIndentedString(reference)).append("\n");
		sb.append("		shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
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

