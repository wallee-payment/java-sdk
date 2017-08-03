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
import com.wallee.sdk.model.CustomersPresence;
import com.wallee.sdk.model.FailureReason;
import com.wallee.sdk.model.LineItem;
import com.wallee.sdk.model.PaymentConnectorConfiguration;
import com.wallee.sdk.model.PaymentMethodBrand;
import com.wallee.sdk.model.Token;
import com.wallee.sdk.model.TransactionGroup;
import com.wallee.sdk.model.TransactionState;
import com.wallee.sdk.model.TransactionUserInterfaceType;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Transaction
 */
public class Transaction {

	@SerializedName("acceptHeader")
	private String acceptHeader = null;

	@SerializedName("allowedPaymentMethodBrands")
	private List<PaymentMethodBrand> allowedPaymentMethodBrands = new ArrayList<PaymentMethodBrand>();

	@SerializedName("allowedPaymentMethodConfigurations")
	private List<Long> allowedPaymentMethodConfigurations = new ArrayList<Long>();

	@SerializedName("authorizationAmount")
	private BigDecimal authorizationAmount = null;

	@SerializedName("authorizedOn")
	private OffsetDateTime authorizedOn = null;

	@SerializedName("billingAddress")
	private Address billingAddress = null;

	@SerializedName("chargeRetryEnabled")
	private Boolean chargeRetryEnabled = null;

	@SerializedName("completedOn")
	private OffsetDateTime completedOn = null;

	@SerializedName("completionTimeoutOn")
	private OffsetDateTime completionTimeoutOn = null;

	@SerializedName("confirmedBy")
	private Long confirmedBy = null;

	@SerializedName("confirmedOn")
	private OffsetDateTime confirmedOn = null;

	@SerializedName("createdBy")
	private Long createdBy = null;

	@SerializedName("createdOn")
	private OffsetDateTime createdOn = null;

	@SerializedName("currency")
	private String currency = null;

	@SerializedName("customerEmailAddress")
	private String customerEmailAddress = null;

	@SerializedName("customerId")
	private String customerId = null;

	@SerializedName("customersPresence")
	private CustomersPresence customersPresence = null;

	@SerializedName("endOfLife")
	private OffsetDateTime endOfLife = null;

	@SerializedName("failedOn")
	private OffsetDateTime failedOn = null;

	@SerializedName("failedUrl")
	private String failedUrl = null;

	@SerializedName("failureReason")
	private FailureReason failureReason = null;

	@SerializedName("group")
	private TransactionGroup group = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("internetProtocolAddress")
	private String internetProtocolAddress = null;

	@SerializedName("internetProtocolAddressCountry")
	private String internetProtocolAddressCountry = null;

	@SerializedName("invoiceMerchantReference")
	private String invoiceMerchantReference = null;

	@SerializedName("language")
	private String language = null;

	@SerializedName("lineItems")
	private List<LineItem> lineItems = new ArrayList<LineItem>();

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("merchantReference")
	private String merchantReference = null;

	@SerializedName("metaData")
	private Map<String, String> metaData = new HashMap<String, String>();

	@SerializedName("paymentConnectorConfiguration")
	private PaymentConnectorConfiguration paymentConnectorConfiguration = null;

	@SerializedName("plannedPurgeDate")
	private OffsetDateTime plannedPurgeDate = null;

	@SerializedName("processingOn")
	private OffsetDateTime processingOn = null;

	@SerializedName("refundedAmount")
	private BigDecimal refundedAmount = null;

	@SerializedName("shippingAddress")
	private Address shippingAddress = null;

	@SerializedName("shippingMethod")
	private String shippingMethod = null;

	@SerializedName("spaceViewId")
	private Long spaceViewId = null;

	@SerializedName("state")
	private TransactionState state = null;

	@SerializedName("successUrl")
	private String successUrl = null;

	@SerializedName("token")
	private Token token = null;

	@SerializedName("userAgentHeader")
	private String userAgentHeader = null;

	@SerializedName("userFailureMessage")
	private String userFailureMessage = null;

	@SerializedName("userInterfaceType")
	private TransactionUserInterfaceType userInterfaceType = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * acceptHeader
	 *
	 * @return acceptHeader
	 */
	public String getAcceptHeader() {
		return acceptHeader;
	}

	/**
	 * allowedPaymentMethodBrands
	 *
	 * @return allowedPaymentMethodBrands
	 */
	public List<PaymentMethodBrand> getAllowedPaymentMethodBrands() {
		return allowedPaymentMethodBrands;
	}

	/**
	 * allowedPaymentMethodConfigurations
	 *
	 * @return allowedPaymentMethodConfigurations
	 */
	public List<Long> getAllowedPaymentMethodConfigurations() {
		return allowedPaymentMethodConfigurations;
	}

	/**
	 * authorizationAmount
	 *
	 * @return authorizationAmount
	 */
	public BigDecimal getAuthorizationAmount() {
		return authorizationAmount;
	}

	/**
	 * authorizedOn
	 *
	 * @return authorizedOn
	 */
	public OffsetDateTime getAuthorizedOn() {
		return authorizedOn;
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
	 * When the charging of the customer fails we can retry the charging. This implies that we redirect the user back to the payment page which allows the customer to retry. By default we will retry.
	 *
	 * @return When the charging of the customer fails we can retry the charging. This implies that we redirect the user back to the payment page which allows the customer to retry. By default we will retry.
	 */
	public Boolean getChargeRetryEnabled() {
		return chargeRetryEnabled;
	}

	/**
	 * completedOn
	 *
	 * @return completedOn
	 */
	public OffsetDateTime getCompletedOn() {
		return completedOn;
	}

	/**
	 * completionTimeoutOn
	 *
	 * @return completionTimeoutOn
	 */
	public OffsetDateTime getCompletionTimeoutOn() {
		return completionTimeoutOn;
	}

	/**
	 * confirmedBy
	 *
	 * @return confirmedBy
	 */
	public Long getConfirmedBy() {
		return confirmedBy;
	}

	/**
	 * confirmedOn
	 *
	 * @return confirmedOn
	 */
	public OffsetDateTime getConfirmedOn() {
		return confirmedOn;
	}

	/**
	 * createdBy
	 *
	 * @return createdBy
	 */
	public Long getCreatedBy() {
		return createdBy;
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
	 * currency
	 *
	 * @return currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * The customer email address is the email address of the customer. If no email address is used provided on the shipping or billing address this address is used.
	 *
	 * @return The customer email address is the email address of the customer. If no email address is used provided on the shipping or billing address this address is used.
	 */
	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}

	/**
	 * customerId
	 *
	 * @return customerId
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * customersPresence
	 *
	 * @return customersPresence
	 */
	public CustomersPresence getCustomersPresence() {
		return customersPresence;
	}

	/**
	 * The transaction's end of life indicates the date from which on no operation can be carried out anymore.
	 *
	 * @return The transaction's end of life indicates the date from which on no operation can be carried out anymore.
	 */
	public OffsetDateTime getEndOfLife() {
		return endOfLife;
	}

	/**
	 * failedOn
	 *
	 * @return failedOn
	 */
	public OffsetDateTime getFailedOn() {
		return failedOn;
	}

	/**
	 * The user will be redirected to failed URL when the transaction could not be authorized or completed. In case no failed URL is specified a default failed page will be displayed.
	 *
	 * @return The user will be redirected to failed URL when the transaction could not be authorized or completed. In case no failed URL is specified a default failed page will be displayed.
	 */
	public String getFailedUrl() {
		return failedUrl;
	}

	/**
	 * The failure reason describes why the transaction failed. This is only provided when the transaction is marked as failed.
	 *
	 * @return The failure reason describes why the transaction failed. This is only provided when the transaction is marked as failed.
	 */
	public FailureReason getFailureReason() {
		return failureReason;
	}

	/**
	 * group
	 *
	 * @return group
	 */
	public TransactionGroup getGroup() {
		return group;
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
	 * internetProtocolAddress
	 *
	 * @return internetProtocolAddress
	 */
	public String getInternetProtocolAddress() {
		return internetProtocolAddress;
	}

	/**
	 * internetProtocolAddressCountry
	 *
	 * @return internetProtocolAddressCountry
	 */
	public String getInternetProtocolAddressCountry() {
		return internetProtocolAddressCountry;
	}

	/**
	 * invoiceMerchantReference
	 *
	 * @return invoiceMerchantReference
	 */
	public String getInvoiceMerchantReference() {
		return invoiceMerchantReference;
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
	 * lineItems
	 *
	 * @return lineItems
	 */
	public List<LineItem> getLineItems() {
		return lineItems;
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
	 * merchantReference
	 *
	 * @return merchantReference
	 */
	public String getMerchantReference() {
		return merchantReference;
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
	 * processingOn
	 *
	 * @return processingOn
	 */
	public OffsetDateTime getProcessingOn() {
		return processingOn;
	}

	/**
	 * The refunded amount is the total amount which has been refunded so far.
	 *
	 * @return The refunded amount is the total amount which has been refunded so far.
	 */
	public BigDecimal getRefundedAmount() {
		return refundedAmount;
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
	 * shippingMethod
	 *
	 * @return shippingMethod
	 */
	public String getShippingMethod() {
		return shippingMethod;
	}

	/**
	 * spaceViewId
	 *
	 * @return spaceViewId
	 */
	public Long getSpaceViewId() {
		return spaceViewId;
	}

	/**
	 * state
	 *
	 * @return state
	 */
	public TransactionState getState() {
		return state;
	}

	/**
	 * The user will be redirected to success URL when the transaction could be authorized or completed. In case no success URL is specified a default success page will be displayed.
	 *
	 * @return The user will be redirected to success URL when the transaction could be authorized or completed. In case no success URL is specified a default success page will be displayed.
	 */
	public String getSuccessUrl() {
		return successUrl;
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
	 * userAgentHeader
	 *
	 * @return userAgentHeader
	 */
	public String getUserAgentHeader() {
		return userAgentHeader;
	}

	/**
	 * The failure message describes for an end user why the transaction is failed in the language of the user. This is only provided when the transaction is marked as failed.
	 *
	 * @return The failure message describes for an end user why the transaction is failed in the language of the user. This is only provided when the transaction is marked as failed.
	 */
	public String getUserFailureMessage() {
		return userFailureMessage;
	}

	/**
	 * The user interface type defines through which user interface the transaction has been processed resp. created.
	 *
	 * @return The user interface type defines through which user interface the transaction has been processed resp. created.
	 */
	public TransactionUserInterfaceType getUserInterfaceType() {
		return userInterfaceType;
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
		Transaction transaction = (Transaction) o;
		return Objects.equals(this.acceptHeader, transaction.acceptHeader) &&
				Objects.equals(this.allowedPaymentMethodBrands, transaction.allowedPaymentMethodBrands) &&
				Objects.equals(this.allowedPaymentMethodConfigurations, transaction.allowedPaymentMethodConfigurations) &&
				Objects.equals(this.authorizationAmount, transaction.authorizationAmount) &&
				Objects.equals(this.authorizedOn, transaction.authorizedOn) &&
				Objects.equals(this.billingAddress, transaction.billingAddress) &&
				Objects.equals(this.chargeRetryEnabled, transaction.chargeRetryEnabled) &&
				Objects.equals(this.completedOn, transaction.completedOn) &&
				Objects.equals(this.completionTimeoutOn, transaction.completionTimeoutOn) &&
				Objects.equals(this.confirmedBy, transaction.confirmedBy) &&
				Objects.equals(this.confirmedOn, transaction.confirmedOn) &&
				Objects.equals(this.createdBy, transaction.createdBy) &&
				Objects.equals(this.createdOn, transaction.createdOn) &&
				Objects.equals(this.currency, transaction.currency) &&
				Objects.equals(this.customerEmailAddress, transaction.customerEmailAddress) &&
				Objects.equals(this.customerId, transaction.customerId) &&
				Objects.equals(this.customersPresence, transaction.customersPresence) &&
				Objects.equals(this.endOfLife, transaction.endOfLife) &&
				Objects.equals(this.failedOn, transaction.failedOn) &&
				Objects.equals(this.failedUrl, transaction.failedUrl) &&
				Objects.equals(this.failureReason, transaction.failureReason) &&
				Objects.equals(this.group, transaction.group) &&
				Objects.equals(this.id, transaction.id) &&
				Objects.equals(this.internetProtocolAddress, transaction.internetProtocolAddress) &&
				Objects.equals(this.internetProtocolAddressCountry, transaction.internetProtocolAddressCountry) &&
				Objects.equals(this.invoiceMerchantReference, transaction.invoiceMerchantReference) &&
				Objects.equals(this.language, transaction.language) &&
				Objects.equals(this.lineItems, transaction.lineItems) &&
				Objects.equals(this.linkedSpaceId, transaction.linkedSpaceId) &&
				Objects.equals(this.merchantReference, transaction.merchantReference) &&
				Objects.equals(this.metaData, transaction.metaData) &&
				Objects.equals(this.paymentConnectorConfiguration, transaction.paymentConnectorConfiguration) &&
				Objects.equals(this.plannedPurgeDate, transaction.plannedPurgeDate) &&
				Objects.equals(this.processingOn, transaction.processingOn) &&
				Objects.equals(this.refundedAmount, transaction.refundedAmount) &&
				Objects.equals(this.shippingAddress, transaction.shippingAddress) &&
				Objects.equals(this.shippingMethod, transaction.shippingMethod) &&
				Objects.equals(this.spaceViewId, transaction.spaceViewId) &&
				Objects.equals(this.state, transaction.state) &&
				Objects.equals(this.successUrl, transaction.successUrl) &&
				Objects.equals(this.token, transaction.token) &&
				Objects.equals(this.userAgentHeader, transaction.userAgentHeader) &&
				Objects.equals(this.userFailureMessage, transaction.userFailureMessage) &&
				Objects.equals(this.userInterfaceType, transaction.userInterfaceType) &&
				Objects.equals(this.version, transaction.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(acceptHeader, allowedPaymentMethodBrands, allowedPaymentMethodConfigurations, authorizationAmount, authorizedOn, billingAddress, chargeRetryEnabled, completedOn, completionTimeoutOn, confirmedBy, confirmedOn, createdBy, createdOn, currency, customerEmailAddress, customerId, customersPresence, endOfLife, failedOn, failedUrl, failureReason, group, id, internetProtocolAddress, internetProtocolAddressCountry, invoiceMerchantReference, language, lineItems, linkedSpaceId, merchantReference, metaData, paymentConnectorConfiguration, plannedPurgeDate, processingOn, refundedAmount, shippingAddress, shippingMethod, spaceViewId, state, successUrl, token, userAgentHeader, userFailureMessage, userInterfaceType, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Transaction {\n");
		
		sb.append("		acceptHeader: ").append(toIndentedString(acceptHeader)).append("\n");
		sb.append("		allowedPaymentMethodBrands: ").append(toIndentedString(allowedPaymentMethodBrands)).append("\n");
		sb.append("		allowedPaymentMethodConfigurations: ").append(toIndentedString(allowedPaymentMethodConfigurations)).append("\n");
		sb.append("		authorizationAmount: ").append(toIndentedString(authorizationAmount)).append("\n");
		sb.append("		authorizedOn: ").append(toIndentedString(authorizedOn)).append("\n");
		sb.append("		billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
		sb.append("		chargeRetryEnabled: ").append(toIndentedString(chargeRetryEnabled)).append("\n");
		sb.append("		completedOn: ").append(toIndentedString(completedOn)).append("\n");
		sb.append("		completionTimeoutOn: ").append(toIndentedString(completionTimeoutOn)).append("\n");
		sb.append("		confirmedBy: ").append(toIndentedString(confirmedBy)).append("\n");
		sb.append("		confirmedOn: ").append(toIndentedString(confirmedOn)).append("\n");
		sb.append("		createdBy: ").append(toIndentedString(createdBy)).append("\n");
		sb.append("		createdOn: ").append(toIndentedString(createdOn)).append("\n");
		sb.append("		currency: ").append(toIndentedString(currency)).append("\n");
		sb.append("		customerEmailAddress: ").append(toIndentedString(customerEmailAddress)).append("\n");
		sb.append("		customerId: ").append(toIndentedString(customerId)).append("\n");
		sb.append("		customersPresence: ").append(toIndentedString(customersPresence)).append("\n");
		sb.append("		endOfLife: ").append(toIndentedString(endOfLife)).append("\n");
		sb.append("		failedOn: ").append(toIndentedString(failedOn)).append("\n");
		sb.append("		failedUrl: ").append(toIndentedString(failedUrl)).append("\n");
		sb.append("		failureReason: ").append(toIndentedString(failureReason)).append("\n");
		sb.append("		group: ").append(toIndentedString(group)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		internetProtocolAddress: ").append(toIndentedString(internetProtocolAddress)).append("\n");
		sb.append("		internetProtocolAddressCountry: ").append(toIndentedString(internetProtocolAddressCountry)).append("\n");
		sb.append("		invoiceMerchantReference: ").append(toIndentedString(invoiceMerchantReference)).append("\n");
		sb.append("		language: ").append(toIndentedString(language)).append("\n");
		sb.append("		lineItems: ").append(toIndentedString(lineItems)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
		sb.append("		metaData: ").append(toIndentedString(metaData)).append("\n");
		sb.append("		paymentConnectorConfiguration: ").append(toIndentedString(paymentConnectorConfiguration)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		processingOn: ").append(toIndentedString(processingOn)).append("\n");
		sb.append("		refundedAmount: ").append(toIndentedString(refundedAmount)).append("\n");
		sb.append("		shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
		sb.append("		shippingMethod: ").append(toIndentedString(shippingMethod)).append("\n");
		sb.append("		spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("		successUrl: ").append(toIndentedString(successUrl)).append("\n");
		sb.append("		token: ").append(toIndentedString(token)).append("\n");
		sb.append("		userAgentHeader: ").append(toIndentedString(userAgentHeader)).append("\n");
		sb.append("		userFailureMessage: ").append(toIndentedString(userFailureMessage)).append("\n");
		sb.append("		userInterfaceType: ").append(toIndentedString(userInterfaceType)).append("\n");
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

