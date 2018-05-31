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
import com.wallee.sdk.model.AbstractPaymentLinkUpdate;
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.LineItemCreate;
import com.wallee.sdk.model.PaymentLinkProtectionMode;
import com.wallee.sdk.model.PaymentMethodConfiguration;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * The payment link defines an URL to automatically create transactions.
 */
public class PaymentLinkCreate extends AbstractPaymentLinkUpdate {

	@SerializedName("state")
	private CreationEntityState state = null;

	@SerializedName("externalId")
	private String externalId = null;

	@SerializedName("protectionMode")
	private PaymentLinkProtectionMode protectionMode = null;

	public PaymentLinkCreate state(CreationEntityState state) {
		this.state = state;
		return this;
	}

	/**
	 * state
	 *
	 * @return state
	 */
	public CreationEntityState getState() {
		return state;
	}

	public void setState(CreationEntityState state) {
		this.state = state;
	}

	public PaymentLinkCreate externalId(String externalId) {
		this.externalId = externalId;
		return this;
	}

	/**
	 * The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
	 *
	 * @return The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
	 */
	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public PaymentLinkCreate protectionMode(PaymentLinkProtectionMode protectionMode) {
		this.protectionMode = protectionMode;
		return this;
	}

	/**
	 * The protection mode determines if the payment link is protected against tampering and in what way.
	 *
	 * @return The protection mode determines if the payment link is protected against tampering and in what way.
	 */
	public PaymentLinkProtectionMode getProtectionMode() {
		return protectionMode;
	}

	public void setProtectionMode(PaymentLinkProtectionMode protectionMode) {
		this.protectionMode = protectionMode;
	}

	@Override
	public PaymentLinkCreate allowedPaymentMethodConfigurations(List<PaymentMethodConfiguration> allowedPaymentMethodConfigurations) {
		super.allowedPaymentMethodConfigurations(allowedPaymentMethodConfigurations);
		return this;
	}

	@Override
	public PaymentLinkCreate addAllowedPaymentMethodConfigurationsItem(PaymentMethodConfiguration allowedPaymentMethodConfigurationsItem) {
		super.addAllowedPaymentMethodConfigurationsItem(allowedPaymentMethodConfigurationsItem);
		return this;
	}

	@Override
	public PaymentLinkCreate appliedSpaceView(Long appliedSpaceView) {
		super.appliedSpaceView(appliedSpaceView);
		return this;
	}

	@Override
	public PaymentLinkCreate availableFrom(OffsetDateTime availableFrom) {
		super.availableFrom(availableFrom);
		return this;
	}

	@Override
	public PaymentLinkCreate availableUntil(OffsetDateTime availableUntil) {
		super.availableUntil(availableUntil);
		return this;
	}

	@Override
	public PaymentLinkCreate billingAddressRequired(Boolean billingAddressRequired) {
		super.billingAddressRequired(billingAddressRequired);
		return this;
	}

	@Override
	public PaymentLinkCreate currency(String currency) {
		super.currency(currency);
		return this;
	}

	@Override
	public PaymentLinkCreate language(String language) {
		super.language(language);
		return this;
	}

	@Override
	public PaymentLinkCreate lineItems(List<LineItemCreate> lineItems) {
		super.lineItems(lineItems);
		return this;
	}

	@Override
	public PaymentLinkCreate addLineItemsItem(LineItemCreate lineItemsItem) {
		super.addLineItemsItem(lineItemsItem);
		return this;
	}

	@Override
	public PaymentLinkCreate maximalNumberOfTransactions(Integer maximalNumberOfTransactions) {
		super.maximalNumberOfTransactions(maximalNumberOfTransactions);
		return this;
	}

	@Override
	public PaymentLinkCreate name(String name) {
		super.name(name);
		return this;
	}

	@Override
	public PaymentLinkCreate shippingAddressRequired(Boolean shippingAddressRequired) {
		super.shippingAddressRequired(shippingAddressRequired);
		return this;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PaymentLinkCreate paymentLinkCreate = (PaymentLinkCreate) o;
		return Objects.equals(this.state, paymentLinkCreate.state) &&
				Objects.equals(this.externalId, paymentLinkCreate.externalId) &&
				Objects.equals(this.protectionMode, paymentLinkCreate.protectionMode) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(state, externalId, protectionMode, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PaymentLinkCreate {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("		externalId: ").append(toIndentedString(externalId)).append("\n");
		sb.append("		protectionMode: ").append(toIndentedString(protectionMode)).append("\n");
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

