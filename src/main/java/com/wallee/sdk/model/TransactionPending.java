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
import com.wallee.sdk.model.AbstractTransactionPending;
import com.wallee.sdk.model.AddressCreate;
import com.wallee.sdk.model.LineItemCreate;
import com.wallee.sdk.model.PaymentMethodBrand;
import com.wallee.sdk.model.TokenizationnMode;
import java.util.List;
import java.util.Map;

/**
 * TransactionPending
 */
public class TransactionPending extends AbstractTransactionPending {

	@SerializedName("id")
	private Long id = null;

	@SerializedName("version")
	private Long version = null;

	public TransactionPending id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 *
	 * @return The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TransactionPending version(Long version) {
		this.version = version;
		return this;
	}

	/**
	 * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 *
	 * @return The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 */
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	@Override
	public TransactionPending allowedPaymentMethodBrands(List<PaymentMethodBrand> allowedPaymentMethodBrands) {
		super.allowedPaymentMethodBrands(allowedPaymentMethodBrands);
		return this;
	}

	@Override
	public TransactionPending addAllowedPaymentMethodBrandsItem(PaymentMethodBrand allowedPaymentMethodBrandsItem) {
		super.addAllowedPaymentMethodBrandsItem(allowedPaymentMethodBrandsItem);
		return this;
	}

	@Override
	public TransactionPending allowedPaymentMethodConfigurations(List<Long> allowedPaymentMethodConfigurations) {
		super.allowedPaymentMethodConfigurations(allowedPaymentMethodConfigurations);
		return this;
	}

	@Override
	public TransactionPending addAllowedPaymentMethodConfigurationsItem(Long allowedPaymentMethodConfigurationsItem) {
		super.addAllowedPaymentMethodConfigurationsItem(allowedPaymentMethodConfigurationsItem);
		return this;
	}

	@Override
	public TransactionPending billingAddress(AddressCreate billingAddress) {
		super.billingAddress(billingAddress);
		return this;
	}

	@Override
	public TransactionPending currency(String currency) {
		super.currency(currency);
		return this;
	}

	@Override
	public TransactionPending customerEmailAddress(String customerEmailAddress) {
		super.customerEmailAddress(customerEmailAddress);
		return this;
	}

	@Override
	public TransactionPending customerId(String customerId) {
		super.customerId(customerId);
		return this;
	}

	@Override
	public TransactionPending failedUrl(String failedUrl) {
		super.failedUrl(failedUrl);
		return this;
	}

	@Override
	public TransactionPending invoiceMerchantReference(String invoiceMerchantReference) {
		super.invoiceMerchantReference(invoiceMerchantReference);
		return this;
	}

	@Override
	public TransactionPending language(String language) {
		super.language(language);
		return this;
	}

	@Override
	public TransactionPending lineItems(List<LineItemCreate> lineItems) {
		super.lineItems(lineItems);
		return this;
	}

	@Override
	public TransactionPending addLineItemsItem(LineItemCreate lineItemsItem) {
		super.addLineItemsItem(lineItemsItem);
		return this;
	}

	@Override
	public TransactionPending merchantReference(String merchantReference) {
		super.merchantReference(merchantReference);
		return this;
	}

	@Override
	public TransactionPending metaData(Map<String, String> metaData) {
		super.metaData(metaData);
		return this;
	}

	@Override
	public TransactionPending putMetaDataItem(String key, String metaDataItem) {
		super.putMetaDataItem(key, metaDataItem);
		return this;
	}

	@Override
	public TransactionPending shippingAddress(AddressCreate shippingAddress) {
		super.shippingAddress(shippingAddress);
		return this;
	}

	@Override
	public TransactionPending shippingMethod(String shippingMethod) {
		super.shippingMethod(shippingMethod);
		return this;
	}

	@Override
	public TransactionPending successUrl(String successUrl) {
		super.successUrl(successUrl);
		return this;
	}

	@Override
	public TransactionPending timeZone(String timeZone) {
		super.timeZone(timeZone);
		return this;
	}

	@Override
	public TransactionPending token(Long token) {
		super.token(token);
		return this;
	}

	@Override
	public TransactionPending tokenizationMode(TokenizationnMode tokenizationMode) {
		super.tokenizationMode(tokenizationMode);
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
		TransactionPending transactionPending = (TransactionPending) o;
		return Objects.equals(this.id, transactionPending.id) &&
				Objects.equals(this.version, transactionPending.version) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, version, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TransactionPending {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
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

