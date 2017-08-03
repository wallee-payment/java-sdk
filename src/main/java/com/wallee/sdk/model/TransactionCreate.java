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
import com.wallee.sdk.model.CustomersPresence;
import com.wallee.sdk.model.LineItemCreate;
import com.wallee.sdk.model.PaymentMethodBrand;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * TransactionCreate
 */
public class TransactionCreate extends AbstractTransactionPending {

	@SerializedName("chargeRetryEnabled")
	private Boolean chargeRetryEnabled = null;

	@SerializedName("customersPresence")
	private CustomersPresence customersPresence = null;

	@SerializedName("spaceViewId")
	private Long spaceViewId = null;

	public TransactionCreate chargeRetryEnabled(Boolean chargeRetryEnabled) {
		this.chargeRetryEnabled = chargeRetryEnabled;
		return this;
	}

	/**
	 * When the charging of the customer fails we can retry the charging. This implies that we redirect the user back to the payment page which allows the customer to retry. By default we will retry.
	 *
	 * @return When the charging of the customer fails we can retry the charging. This implies that we redirect the user back to the payment page which allows the customer to retry. By default we will retry.
	 */
	public Boolean getChargeRetryEnabled() {
		return chargeRetryEnabled;
	}

	public void setChargeRetryEnabled(Boolean chargeRetryEnabled) {
		this.chargeRetryEnabled = chargeRetryEnabled;
	}

	public TransactionCreate customersPresence(CustomersPresence customersPresence) {
		this.customersPresence = customersPresence;
		return this;
	}

	/**
	 * customersPresence
	 *
	 * @return customersPresence
	 */
	public CustomersPresence getCustomersPresence() {
		return customersPresence;
	}

	public void setCustomersPresence(CustomersPresence customersPresence) {
		this.customersPresence = customersPresence;
	}

	public TransactionCreate spaceViewId(Long spaceViewId) {
		this.spaceViewId = spaceViewId;
		return this;
	}

	/**
	 * spaceViewId
	 *
	 * @return spaceViewId
	 */
	public Long getSpaceViewId() {
		return spaceViewId;
	}

	public void setSpaceViewId(Long spaceViewId) {
		this.spaceViewId = spaceViewId;
	}

	@Override
	public TransactionCreate allowedPaymentMethodBrands(List<PaymentMethodBrand> allowedPaymentMethodBrands) {
		super.allowedPaymentMethodBrands(allowedPaymentMethodBrands);
		return this;
	}

	@Override
	public TransactionCreate addAllowedPaymentMethodBrandsItem(PaymentMethodBrand allowedPaymentMethodBrandsItem) {
		super.addAllowedPaymentMethodBrandsItem(allowedPaymentMethodBrandsItem);
		return this;
	}

	@Override
	public TransactionCreate allowedPaymentMethodConfigurations(List<Long> allowedPaymentMethodConfigurations) {
		super.allowedPaymentMethodConfigurations(allowedPaymentMethodConfigurations);
		return this;
	}

	@Override
	public TransactionCreate addAllowedPaymentMethodConfigurationsItem(Long allowedPaymentMethodConfigurationsItem) {
		super.addAllowedPaymentMethodConfigurationsItem(allowedPaymentMethodConfigurationsItem);
		return this;
	}

	@Override
	public TransactionCreate billingAddress(AddressCreate billingAddress) {
		super.billingAddress(billingAddress);
		return this;
	}

	@Override
	public TransactionCreate currency(String currency) {
		super.currency(currency);
		return this;
	}

	@Override
	public TransactionCreate customerEmailAddress(String customerEmailAddress) {
		super.customerEmailAddress(customerEmailAddress);
		return this;
	}

	@Override
	public TransactionCreate customerId(String customerId) {
		super.customerId(customerId);
		return this;
	}

	@Override
	public TransactionCreate failedUrl(String failedUrl) {
		super.failedUrl(failedUrl);
		return this;
	}

	@Override
	public TransactionCreate invoiceMerchantReference(String invoiceMerchantReference) {
		super.invoiceMerchantReference(invoiceMerchantReference);
		return this;
	}

	@Override
	public TransactionCreate language(String language) {
		super.language(language);
		return this;
	}

	@Override
	public TransactionCreate lineItems(List<LineItemCreate> lineItems) {
		super.lineItems(lineItems);
		return this;
	}

	@Override
	public TransactionCreate addLineItemsItem(LineItemCreate lineItemsItem) {
		super.addLineItemsItem(lineItemsItem);
		return this;
	}

	@Override
	public TransactionCreate merchantReference(String merchantReference) {
		super.merchantReference(merchantReference);
		return this;
	}

	@Override
	public TransactionCreate metaData(Map<String, String> metaData) {
		super.metaData(metaData);
		return this;
	}

	@Override
	public TransactionCreate putMetaDataItem(String key, String metaDataItem) {
		super.putMetaDataItem(key, metaDataItem);
		return this;
	}

	@Override
	public TransactionCreate shippingAddress(AddressCreate shippingAddress) {
		super.shippingAddress(shippingAddress);
		return this;
	}

	@Override
	public TransactionCreate shippingMethod(String shippingMethod) {
		super.shippingMethod(shippingMethod);
		return this;
	}

	@Override
	public TransactionCreate successUrl(String successUrl) {
		super.successUrl(successUrl);
		return this;
	}

	@Override
	public TransactionCreate token(Long token) {
		super.token(token);
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
		TransactionCreate transactionCreate = (TransactionCreate) o;
		return Objects.equals(this.chargeRetryEnabled, transactionCreate.chargeRetryEnabled) &&
				Objects.equals(this.customersPresence, transactionCreate.customersPresence) &&
				Objects.equals(this.spaceViewId, transactionCreate.spaceViewId) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(chargeRetryEnabled, customersPresence, spaceViewId, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TransactionCreate {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
		sb.append("		chargeRetryEnabled: ").append(toIndentedString(chargeRetryEnabled)).append("\n");
		sb.append("		customersPresence: ").append(toIndentedString(customersPresence)).append("\n");
		sb.append("		spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
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

