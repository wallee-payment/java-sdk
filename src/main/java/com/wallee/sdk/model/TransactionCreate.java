/**
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
 *
 * @author   customweb GmbH (www.customweb.com)
 */
package com.wallee.sdk.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.wallee.sdk.model.AbstractTransactionPending;
import com.wallee.sdk.model.AddressCreate;
import com.wallee.sdk.model.CustomersPresence;
import com.wallee.sdk.model.Environment;
import com.wallee.sdk.model.LineItemCreate;
import com.wallee.sdk.model.PaymentMethodBrand;
import com.wallee.sdk.model.TokenizationnMode;
import com.wallee.sdk.model.TransactionEnvironmentSelectionStrategy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * TransactionCreate
 */
public class TransactionCreate extends AbstractTransactionPending {

	@SerializedName("autoConfirmationEnabled")
	private Boolean autoConfirmationEnabled = null;

	@SerializedName("chargeRetryEnabled")
	private Boolean chargeRetryEnabled = null;

	@SerializedName("customersPresence")
	private CustomersPresence customersPresence = null;

	@SerializedName("deviceSessionIdentifier")
	private String deviceSessionIdentifier = null;

	@SerializedName("environment")
	private Environment environment = null;

	@SerializedName("environmentSelectionStrategy")
	private TransactionEnvironmentSelectionStrategy environmentSelectionStrategy = null;

	@SerializedName("spaceViewId")
	private Long spaceViewId = null;

	public TransactionCreate autoConfirmationEnabled(Boolean autoConfirmationEnabled) {
		this.autoConfirmationEnabled = autoConfirmationEnabled;
		return this;
	}

	/**
	 * When auto confirmation is enabled the transaction can be confirmed by the user and does not require an explicit confirmation through the web service API.
	 *
	 * @return When auto confirmation is enabled the transaction can be confirmed by the user and does not require an explicit confirmation through the web service API.
	 */
	public Boolean getAutoConfirmationEnabled() {
		return autoConfirmationEnabled;
	}

	public void setAutoConfirmationEnabled(Boolean autoConfirmationEnabled) {
		this.autoConfirmationEnabled = autoConfirmationEnabled;
	}

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
	 * The customer's presence indicates what kind of authentication methods can be used during the authorization of the transaction. If no value is provided, 'Virtually Present' is used by default.
	 *
	 * @return The customer's presence indicates what kind of authentication methods can be used during the authorization of the transaction. If no value is provided, 'Virtually Present' is used by default.
	 */
	public CustomersPresence getCustomersPresence() {
		return customersPresence;
	}

	public void setCustomersPresence(CustomersPresence customersPresence) {
		this.customersPresence = customersPresence;
	}

	public TransactionCreate deviceSessionIdentifier(String deviceSessionIdentifier) {
		this.deviceSessionIdentifier = deviceSessionIdentifier;
		return this;
	}

	/**
	 * The device session identifier links the transaction with the session identifier provided in the URL of the device data JavaScript. This allows to link the transaction with the collected device data of the buyer.
	 *
	 * @return The device session identifier links the transaction with the session identifier provided in the URL of the device data JavaScript. This allows to link the transaction with the collected device data of the buyer.
	 */
	public String getDeviceSessionIdentifier() {
		return deviceSessionIdentifier;
	}

	public void setDeviceSessionIdentifier(String deviceSessionIdentifier) {
		this.deviceSessionIdentifier = deviceSessionIdentifier;
	}

	public TransactionCreate environment(Environment environment) {
		this.environment = environment;
		return this;
	}

	/**
	 * environment
	 *
	 * @return environment
	 */
	public Environment getEnvironment() {
		return environment;
	}

	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

	public TransactionCreate environmentSelectionStrategy(TransactionEnvironmentSelectionStrategy environmentSelectionStrategy) {
		this.environmentSelectionStrategy = environmentSelectionStrategy;
		return this;
	}

	/**
	 * The environment selection strategy determines how the environment (test or production) for processing the transaction is selected.
	 *
	 * @return The environment selection strategy determines how the environment (test or production) for processing the transaction is selected.
	 */
	public TransactionEnvironmentSelectionStrategy getEnvironmentSelectionStrategy() {
		return environmentSelectionStrategy;
	}

	public void setEnvironmentSelectionStrategy(TransactionEnvironmentSelectionStrategy environmentSelectionStrategy) {
		this.environmentSelectionStrategy = environmentSelectionStrategy;
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
	public TransactionCreate timeZone(String timeZone) {
		super.timeZone(timeZone);
		return this;
	}

	@Override
	public TransactionCreate token(Long token) {
		super.token(token);
		return this;
	}

	@Override
	public TransactionCreate tokenizationMode(TokenizationnMode tokenizationMode) {
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
		TransactionCreate transactionCreate = (TransactionCreate) o;
		return Objects.equals(this.autoConfirmationEnabled, transactionCreate.autoConfirmationEnabled) &&
				Objects.equals(this.chargeRetryEnabled, transactionCreate.chargeRetryEnabled) &&
				Objects.equals(this.customersPresence, transactionCreate.customersPresence) &&
				Objects.equals(this.deviceSessionIdentifier, transactionCreate.deviceSessionIdentifier) &&
				Objects.equals(this.environment, transactionCreate.environment) &&
				Objects.equals(this.environmentSelectionStrategy, transactionCreate.environmentSelectionStrategy) &&
				Objects.equals(this.spaceViewId, transactionCreate.spaceViewId) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(autoConfirmationEnabled, chargeRetryEnabled, customersPresence, deviceSessionIdentifier, environment, environmentSelectionStrategy, spaceViewId, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TransactionCreate {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
		sb.append("		autoConfirmationEnabled: ").append(toIndentedString(autoConfirmationEnabled)).append("\n");
		sb.append("		chargeRetryEnabled: ").append(toIndentedString(chargeRetryEnabled)).append("\n");
		sb.append("		customersPresence: ").append(toIndentedString(customersPresence)).append("\n");
		sb.append("		deviceSessionIdentifier: ").append(toIndentedString(deviceSessionIdentifier)).append("\n");
		sb.append("		environment: ").append(toIndentedString(environment)).append("\n");
		sb.append("		environmentSelectionStrategy: ").append(toIndentedString(environmentSelectionStrategy)).append("\n");
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

