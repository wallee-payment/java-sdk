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
import com.wallee.sdk.model.LineItemCreate;
import com.wallee.sdk.model.PaymentMethodConfiguration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * AbstractPaymentLinkUpdate
 */
public class AbstractPaymentLinkUpdate {

	@SerializedName("allowedPaymentMethodConfigurations")
	private List<PaymentMethodConfiguration> allowedPaymentMethodConfigurations = new ArrayList<PaymentMethodConfiguration>();

	@SerializedName("appliedSpaceView")
	private Long appliedSpaceView = null;

	@SerializedName("availableFrom")
	private OffsetDateTime availableFrom = null;

	@SerializedName("availableUntil")
	private OffsetDateTime availableUntil = null;

	@SerializedName("billingAddressRequired")
	private Boolean billingAddressRequired = null;

	@SerializedName("currency")
	private String currency = null;

	@SerializedName("language")
	private String language = null;

	@SerializedName("lineItems")
	private List<LineItemCreate> lineItems = new ArrayList<LineItemCreate>();

	@SerializedName("maximalNumberOfTransactions")
	private Integer maximalNumberOfTransactions = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("shippingAddressRequired")
	private Boolean shippingAddressRequired = null;

	public AbstractPaymentLinkUpdate allowedPaymentMethodConfigurations(List<PaymentMethodConfiguration> allowedPaymentMethodConfigurations) {
		this.allowedPaymentMethodConfigurations = allowedPaymentMethodConfigurations;
		return this;
	}

	public AbstractPaymentLinkUpdate addAllowedPaymentMethodConfigurationsItem(PaymentMethodConfiguration allowedPaymentMethodConfigurationsItem) {
		this.allowedPaymentMethodConfigurations.add(allowedPaymentMethodConfigurationsItem);
		return this;
	}

	/**
	 * The allowed payment method configurations restrict the payment methods which can be used with this payment link.
	 *
	 * @return The allowed payment method configurations restrict the payment methods which can be used with this payment link.
	 */
	public List<PaymentMethodConfiguration> getAllowedPaymentMethodConfigurations() {
		return allowedPaymentMethodConfigurations;
	}

	public void setAllowedPaymentMethodConfigurations(List<PaymentMethodConfiguration> allowedPaymentMethodConfigurations) {
		this.allowedPaymentMethodConfigurations = allowedPaymentMethodConfigurations;
	}

	public AbstractPaymentLinkUpdate appliedSpaceView(Long appliedSpaceView) {
		this.appliedSpaceView = appliedSpaceView;
		return this;
	}

	/**
	 * The payment link can be conducted in a specific space view. The space view may apply a specific design to the payment page.
	 *
	 * @return The payment link can be conducted in a specific space view. The space view may apply a specific design to the payment page.
	 */
	public Long getAppliedSpaceView() {
		return appliedSpaceView;
	}

	public void setAppliedSpaceView(Long appliedSpaceView) {
		this.appliedSpaceView = appliedSpaceView;
	}

	public AbstractPaymentLinkUpdate availableFrom(OffsetDateTime availableFrom) {
		this.availableFrom = availableFrom;
		return this;
	}

	/**
	 * The available from date defines the earliest date on which the payment link can be used. When no date is specified there will be no restriction.
	 *
	 * @return The available from date defines the earliest date on which the payment link can be used. When no date is specified there will be no restriction.
	 */
	public OffsetDateTime getAvailableFrom() {
		return availableFrom;
	}

	public void setAvailableFrom(OffsetDateTime availableFrom) {
		this.availableFrom = availableFrom;
	}

	public AbstractPaymentLinkUpdate availableUntil(OffsetDateTime availableUntil) {
		this.availableUntil = availableUntil;
		return this;
	}

	/**
	 * The available from date defines the latest date on which the payment link can be used to initialize a transaction. When no date is specified there will be no restriction.
	 *
	 * @return The available from date defines the latest date on which the payment link can be used to initialize a transaction. When no date is specified there will be no restriction.
	 */
	public OffsetDateTime getAvailableUntil() {
		return availableUntil;
	}

	public void setAvailableUntil(OffsetDateTime availableUntil) {
		this.availableUntil = availableUntil;
	}

	public AbstractPaymentLinkUpdate billingAddressRequired(Boolean billingAddressRequired) {
		this.billingAddressRequired = billingAddressRequired;
		return this;
	}

	/**
	 * By making the billing address required the transaction can only be created when a billing address is provided within the request.
	 *
	 * @return By making the billing address required the transaction can only be created when a billing address is provided within the request.
	 */
	public Boolean getBillingAddressRequired() {
		return billingAddressRequired;
	}

	public void setBillingAddressRequired(Boolean billingAddressRequired) {
		this.billingAddressRequired = billingAddressRequired;
	}

	public AbstractPaymentLinkUpdate currency(String currency) {
		this.currency = currency;
		return this;
	}

	/**
	 * The currency defines in which currency the payment is executed in. If no currency is defined it has to be specified within the request parameter 'currency'.
	 *
	 * @return The currency defines in which currency the payment is executed in. If no currency is defined it has to be specified within the request parameter 'currency'.
	 */
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public AbstractPaymentLinkUpdate language(String language) {
		this.language = language;
		return this;
	}

	/**
	 * The language defines the language of the payment page. If no language is provided it can be provided through the request parameter.
	 *
	 * @return The language defines the language of the payment page. If no language is provided it can be provided through the request parameter.
	 */
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public AbstractPaymentLinkUpdate lineItems(List<LineItemCreate> lineItems) {
		this.lineItems = lineItems;
		return this;
	}

	public AbstractPaymentLinkUpdate addLineItemsItem(LineItemCreate lineItemsItem) {
		this.lineItems.add(lineItemsItem);
		return this;
	}

	/**
	 * The line items allows to define the line items for this payment link. When the line items are defined they cannot be overridden through the request parameters.
	 *
	 * @return The line items allows to define the line items for this payment link. When the line items are defined they cannot be overridden through the request parameters.
	 */
	public List<LineItemCreate> getLineItems() {
		return lineItems;
	}

	public void setLineItems(List<LineItemCreate> lineItems) {
		this.lineItems = lineItems;
	}

	public AbstractPaymentLinkUpdate maximalNumberOfTransactions(Integer maximalNumberOfTransactions) {
		this.maximalNumberOfTransactions = maximalNumberOfTransactions;
		return this;
	}

	/**
	 * The maximal number of transactions limits the number of transactions which can be created with this payment link.
	 *
	 * @return The maximal number of transactions limits the number of transactions which can be created with this payment link.
	 */
	public Integer getMaximalNumberOfTransactions() {
		return maximalNumberOfTransactions;
	}

	public void setMaximalNumberOfTransactions(Integer maximalNumberOfTransactions) {
		this.maximalNumberOfTransactions = maximalNumberOfTransactions;
	}

	public AbstractPaymentLinkUpdate name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The payment link name is used internally to identify the payment link. For example the name is used within search fields and hence it should be distinct and descriptive.
	 *
	 * @return The payment link name is used internally to identify the payment link. For example the name is used within search fields and hence it should be distinct and descriptive.
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AbstractPaymentLinkUpdate shippingAddressRequired(Boolean shippingAddressRequired) {
		this.shippingAddressRequired = shippingAddressRequired;
		return this;
	}

	/**
	 * By making the shipping address required the transaction can only be created when a shipping address is provided within the request.
	 *
	 * @return By making the shipping address required the transaction can only be created when a shipping address is provided within the request.
	 */
	public Boolean getShippingAddressRequired() {
		return shippingAddressRequired;
	}

	public void setShippingAddressRequired(Boolean shippingAddressRequired) {
		this.shippingAddressRequired = shippingAddressRequired;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AbstractPaymentLinkUpdate abstractPaymentLinkUpdate = (AbstractPaymentLinkUpdate) o;
		return Objects.equals(this.allowedPaymentMethodConfigurations, abstractPaymentLinkUpdate.allowedPaymentMethodConfigurations) &&
				Objects.equals(this.appliedSpaceView, abstractPaymentLinkUpdate.appliedSpaceView) &&
				Objects.equals(this.availableFrom, abstractPaymentLinkUpdate.availableFrom) &&
				Objects.equals(this.availableUntil, abstractPaymentLinkUpdate.availableUntil) &&
				Objects.equals(this.billingAddressRequired, abstractPaymentLinkUpdate.billingAddressRequired) &&
				Objects.equals(this.currency, abstractPaymentLinkUpdate.currency) &&
				Objects.equals(this.language, abstractPaymentLinkUpdate.language) &&
				Objects.equals(this.lineItems, abstractPaymentLinkUpdate.lineItems) &&
				Objects.equals(this.maximalNumberOfTransactions, abstractPaymentLinkUpdate.maximalNumberOfTransactions) &&
				Objects.equals(this.name, abstractPaymentLinkUpdate.name) &&
				Objects.equals(this.shippingAddressRequired, abstractPaymentLinkUpdate.shippingAddressRequired);
	}

	@Override
	public int hashCode() {
		return Objects.hash(allowedPaymentMethodConfigurations, appliedSpaceView, availableFrom, availableUntil, billingAddressRequired, currency, language, lineItems, maximalNumberOfTransactions, name, shippingAddressRequired);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AbstractPaymentLinkUpdate {\n");
		
		sb.append("		allowedPaymentMethodConfigurations: ").append(toIndentedString(allowedPaymentMethodConfigurations)).append("\n");
		sb.append("		appliedSpaceView: ").append(toIndentedString(appliedSpaceView)).append("\n");
		sb.append("		availableFrom: ").append(toIndentedString(availableFrom)).append("\n");
		sb.append("		availableUntil: ").append(toIndentedString(availableUntil)).append("\n");
		sb.append("		billingAddressRequired: ").append(toIndentedString(billingAddressRequired)).append("\n");
		sb.append("		currency: ").append(toIndentedString(currency)).append("\n");
		sb.append("		language: ").append(toIndentedString(language)).append("\n");
		sb.append("		lineItems: ").append(toIndentedString(lineItems)).append("\n");
		sb.append("		maximalNumberOfTransactions: ").append(toIndentedString(maximalNumberOfTransactions)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		shippingAddressRequired: ").append(toIndentedString(shippingAddressRequired)).append("\n");
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

