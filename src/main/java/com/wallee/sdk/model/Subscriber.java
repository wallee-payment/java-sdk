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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * A subscriber represents everyone who is subscribed to a product.
 */
@io.swagger.annotations.ApiModel(description = "A subscriber represents everyone who is subscribed to a product.")
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

	@SerializedName("plannedPurgeDate")
	private DateTime plannedPurgeDate = null;

	@SerializedName("reference")
	private String reference = null;

	@SerializedName("shippingAddress")
	private Address shippingAddress = null;

	@SerializedName("state")
	private CreationEntityState state = null;

	@SerializedName("version")
	private Integer version = null;

	public Subscriber additionalAllowedPaymentMethodConfigurations(List<Long> additionalAllowedPaymentMethodConfigurations) {
		this.additionalAllowedPaymentMethodConfigurations = additionalAllowedPaymentMethodConfigurations;
		return this;
	}

	public Subscriber addAdditionalAllowedPaymentMethodConfigurationsItem(Long additionalAllowedPaymentMethodConfigurationsItem) {
		this.additionalAllowedPaymentMethodConfigurations.add(additionalAllowedPaymentMethodConfigurationsItem);
		return this;
	}

	/**
	 * Those payment methods which are allowed additionally will be available even when the product does not allow those methods.
	 *
	 * @return Those payment methods which are allowed additionally will be available even when the product does not allow those methods.
	 */
	@ApiModelProperty(example = "null", value = "Those payment methods which are allowed additionally will be available even when the product does not allow those methods.")
	public List<Long> getAdditionalAllowedPaymentMethodConfigurations() {
		return additionalAllowedPaymentMethodConfigurations;
	}

	public void setAdditionalAllowedPaymentMethodConfigurations(List<Long> additionalAllowedPaymentMethodConfigurations) {
		this.additionalAllowedPaymentMethodConfigurations = additionalAllowedPaymentMethodConfigurations;
	}

	public Subscriber billingAddress(Address billingAddress) {
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
	 * The subscriber description can be used to add a description to the subscriber. This is used in the back office to identify the subscriber.
	 *
	 * @return The subscriber description can be used to add a description to the subscriber. This is used in the back office to identify the subscriber.
	 */
	@ApiModelProperty(example = "null", value = "The subscriber description can be used to add a description to the subscriber. This is used in the back office to identify the subscriber.")
	public String getDescription() {
		return description;
	}

	public Subscriber disallowedPaymentMethodConfigurations(List<Long> disallowedPaymentMethodConfigurations) {
		this.disallowedPaymentMethodConfigurations = disallowedPaymentMethodConfigurations;
		return this;
	}

	public Subscriber addDisallowedPaymentMethodConfigurationsItem(Long disallowedPaymentMethodConfigurationsItem) {
		this.disallowedPaymentMethodConfigurations.add(disallowedPaymentMethodConfigurationsItem);
		return this;
	}

	/**
	 * Those payment methods which are disallowed will not be available to the subscriber even if the product allows those methods.
	 *
	 * @return Those payment methods which are disallowed will not be available to the subscriber even if the product allows those methods.
	 */
	@ApiModelProperty(example = "null", value = "Those payment methods which are disallowed will not be available to the subscriber even if the product allows those methods.")
	public List<Long> getDisallowedPaymentMethodConfigurations() {
		return disallowedPaymentMethodConfigurations;
	}

	public void setDisallowedPaymentMethodConfigurations(List<Long> disallowedPaymentMethodConfigurations) {
		this.disallowedPaymentMethodConfigurations = disallowedPaymentMethodConfigurations;
	}

	/**
	 * The email address is used to communicate with the subscriber. There can be only one subscriber per space with the same email address.
	 *
	 * @return The email address is used to communicate with the subscriber. There can be only one subscriber per space with the same email address.
	 */
	@ApiModelProperty(example = "null", value = "The email address is used to communicate with the subscriber. There can be only one subscriber per space with the same email address.")
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
	 *
	 * @return The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
	 */
	@ApiModelProperty(example = "null", value = "The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.")
	public String getExternalId() {
		return externalId;
	}

	public Subscriber id(Long id) {
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

	/**
	 * The subscriber language determines the language which is used to communicate with the subscriber in emails and documents (e.g. invoices).
	 *
	 * @return The subscriber language determines the language which is used to communicate with the subscriber in emails and documents (e.g. invoices).
	 */
	@ApiModelProperty(example = "null", value = "The subscriber language determines the language which is used to communicate with the subscriber in emails and documents (e.g. invoices).")
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
	 * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 *
	 * @return The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 */
	@ApiModelProperty(example = "null", value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
	public DateTime getPlannedPurgeDate() {
		return plannedPurgeDate;
	}

	/**
	 * The subscriber reference identifies the subscriber in administrative interfaces (e.g. customer id).
	 *
	 * @return The subscriber reference identifies the subscriber in administrative interfaces (e.g. customer id).
	 */
	@ApiModelProperty(example = "null", value = "The subscriber reference identifies the subscriber in administrative interfaces (e.g. customer id).")
	public String getReference() {
		return reference;
	}

	public Subscriber shippingAddress(Address shippingAddress) {
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

	public Subscriber state(CreationEntityState state) {
		this.state = state;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public CreationEntityState getState() {
		return state;
	}

	public void setState(CreationEntityState state) {
		this.state = state;
	}

	public Subscriber version(Integer version) {
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
				Objects.equals(this.plannedPurgeDate, subscriber.plannedPurgeDate) &&
				Objects.equals(this.reference, subscriber.reference) &&
				Objects.equals(this.shippingAddress, subscriber.shippingAddress) &&
				Objects.equals(this.state, subscriber.state) &&
				Objects.equals(this.version, subscriber.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(additionalAllowedPaymentMethodConfigurations, billingAddress, description, disallowedPaymentMethodConfigurations, emailAddress, externalId, id, language, linkedSpaceId, plannedPurgeDate, reference, shippingAddress, state, version);
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

