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
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.LineItemCreate;
import com.wallee.sdk.model.PaymentLinkUpdate;
import com.wallee.sdk.model.PaymentMethodConfiguration;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * The payment link defines an URL to automatically create transactions.
 */
public class PaymentLinkActive extends PaymentLinkUpdate {

	@SerializedName("state")
	private CreationEntityState state = null;

	public PaymentLinkActive state(CreationEntityState state) {
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

	@Override
	public PaymentLinkActive id(Long id) {
		super.id(id);
		return this;
	}

	@Override
	public PaymentLinkActive version(Long version) {
		super.version(version);
		return this;
	}

	@Override
	public PaymentLinkActive allowedPaymentMethodConfigurations(List<PaymentMethodConfiguration> allowedPaymentMethodConfigurations) {
		super.allowedPaymentMethodConfigurations(allowedPaymentMethodConfigurations);
		return this;
	}

	@Override
	public PaymentLinkActive addAllowedPaymentMethodConfigurationsItem(PaymentMethodConfiguration allowedPaymentMethodConfigurationsItem) {
		super.addAllowedPaymentMethodConfigurationsItem(allowedPaymentMethodConfigurationsItem);
		return this;
	}

	@Override
	public PaymentLinkActive appliedSpaceView(Long appliedSpaceView) {
		super.appliedSpaceView(appliedSpaceView);
		return this;
	}

	@Override
	public PaymentLinkActive availableFrom(OffsetDateTime availableFrom) {
		super.availableFrom(availableFrom);
		return this;
	}

	@Override
	public PaymentLinkActive availableUntil(OffsetDateTime availableUntil) {
		super.availableUntil(availableUntil);
		return this;
	}

	@Override
	public PaymentLinkActive billingAddressRequired(Boolean billingAddressRequired) {
		super.billingAddressRequired(billingAddressRequired);
		return this;
	}

	@Override
	public PaymentLinkActive currency(String currency) {
		super.currency(currency);
		return this;
	}

	@Override
	public PaymentLinkActive language(String language) {
		super.language(language);
		return this;
	}

	@Override
	public PaymentLinkActive lineItems(List<LineItemCreate> lineItems) {
		super.lineItems(lineItems);
		return this;
	}

	@Override
	public PaymentLinkActive addLineItemsItem(LineItemCreate lineItemsItem) {
		super.addLineItemsItem(lineItemsItem);
		return this;
	}

	@Override
	public PaymentLinkActive maximalNumberOfTransactions(Integer maximalNumberOfTransactions) {
		super.maximalNumberOfTransactions(maximalNumberOfTransactions);
		return this;
	}

	@Override
	public PaymentLinkActive name(String name) {
		super.name(name);
		return this;
	}

	@Override
	public PaymentLinkActive shippingAddressRequired(Boolean shippingAddressRequired) {
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
		PaymentLinkActive paymentLinkActive = (PaymentLinkActive) o;
		return Objects.equals(this.state, paymentLinkActive.state) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(state, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PaymentLinkActive {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
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

