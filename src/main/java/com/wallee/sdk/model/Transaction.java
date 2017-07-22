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
import com.wallee.sdk.model.LineItem;
import com.wallee.sdk.model.PaymentConnectorConfiguration;
import com.wallee.sdk.model.PaymentMethodBrand;
import com.wallee.sdk.model.Token;
import com.wallee.sdk.model.TransactionGroup;
import com.wallee.sdk.model.TransactionState;
import com.wallee.sdk.model.TransactionUserInterfaceType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
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
	private DateTime authorizedOn = null;

	@SerializedName("billingAddress")
	private Address billingAddress = null;

	@SerializedName("chargeRetryEnabled")
	private Boolean chargeRetryEnabled = null;

	@SerializedName("completedOn")
	private DateTime completedOn = null;

	@SerializedName("completionTimeoutOn")
	private DateTime completionTimeoutOn = null;

	@SerializedName("confirmedBy")
	private Long confirmedBy = null;

	@SerializedName("confirmedOn")
	private DateTime confirmedOn = null;

	@SerializedName("createdBy")
	private Long createdBy = null;

	@SerializedName("createdOn")
	private DateTime createdOn = null;

	@SerializedName("currency")
	private String currency = null;

	@SerializedName("customerEmailAddress")
	private String customerEmailAddress = null;

	@SerializedName("customerId")
	private String customerId = null;

	@SerializedName("customersPresence")
	private CustomersPresence customersPresence = null;

	@SerializedName("endOfLife")
	private DateTime endOfLife = null;

	@SerializedName("failedOn")
	private DateTime failedOn = null;

	@SerializedName("failedUrl")
	private String failedUrl = null;

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
	private DateTime plannedPurgeDate = null;

	@SerializedName("processingOn")
	private DateTime processingOn = null;

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

	@SerializedName("userInterfaceType")
	private TransactionUserInterfaceType userInterfaceType = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getAcceptHeader() {
		return acceptHeader;
	}

	public Transaction allowedPaymentMethodBrands(List<PaymentMethodBrand> allowedPaymentMethodBrands) {
		this.allowedPaymentMethodBrands = allowedPaymentMethodBrands;
		return this;
	}

	public Transaction addAllowedPaymentMethodBrandsItem(PaymentMethodBrand allowedPaymentMethodBrandsItem) {
		this.allowedPaymentMethodBrands.add(allowedPaymentMethodBrandsItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public List<PaymentMethodBrand> getAllowedPaymentMethodBrands() {
		return allowedPaymentMethodBrands;
	}

	public void setAllowedPaymentMethodBrands(List<PaymentMethodBrand> allowedPaymentMethodBrands) {
		this.allowedPaymentMethodBrands = allowedPaymentMethodBrands;
	}

	public Transaction allowedPaymentMethodConfigurations(List<Long> allowedPaymentMethodConfigurations) {
		this.allowedPaymentMethodConfigurations = allowedPaymentMethodConfigurations;
		return this;
	}

	public Transaction addAllowedPaymentMethodConfigurationsItem(Long allowedPaymentMethodConfigurationsItem) {
		this.allowedPaymentMethodConfigurations.add(allowedPaymentMethodConfigurationsItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public List<Long> getAllowedPaymentMethodConfigurations() {
		return allowedPaymentMethodConfigurations;
	}

	public void setAllowedPaymentMethodConfigurations(List<Long> allowedPaymentMethodConfigurations) {
		this.allowedPaymentMethodConfigurations = allowedPaymentMethodConfigurations;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public BigDecimal getAuthorizationAmount() {
		return authorizationAmount;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getAuthorizedOn() {
		return authorizedOn;
	}

	public Transaction billingAddress(Address billingAddress) {
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
	 * When the charging of the customer fails we can retry the charging. This implies that we redirect the user back to the payment page which allows the customer to retry. By default we will retry.
	 *
	 * @return When the charging of the customer fails we can retry the charging. This implies that we redirect the user back to the payment page which allows the customer to retry. By default we will retry.
	 */
	@ApiModelProperty(example = "null", value = "When the charging of the customer fails we can retry the charging. This implies that we redirect the user back to the payment page which allows the customer to retry. By default we will retry.")
	public Boolean getChargeRetryEnabled() {
		return chargeRetryEnabled;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getCompletedOn() {
		return completedOn;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getCompletionTimeoutOn() {
		return completionTimeoutOn;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Long getConfirmedBy() {
		return confirmedBy;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getConfirmedOn() {
		return confirmedOn;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Long getCreatedBy() {
		return createdBy;
	}

	/**
	 * The created on date indicates the date on which the entity was stored into the database.
	 *
	 * @return The created on date indicates the date on which the entity was stored into the database.
	 */
	@ApiModelProperty(example = "null", value = "The created on date indicates the date on which the entity was stored into the database.")
	public DateTime getCreatedOn() {
		return createdOn;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getCurrency() {
		return currency;
	}

	/**
	 * The customer email address is the email address of the customer. If no email address is used provided on the shipping or billing address this address is used.
	 *
	 * @return The customer email address is the email address of the customer. If no email address is used provided on the shipping or billing address this address is used.
	 */
	@ApiModelProperty(example = "null", value = "The customer email address is the email address of the customer. If no email address is used provided on the shipping or billing address this address is used.")
	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getCustomerId() {
		return customerId;
	}

	public Transaction customersPresence(CustomersPresence customersPresence) {
		this.customersPresence = customersPresence;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public CustomersPresence getCustomersPresence() {
		return customersPresence;
	}

	public void setCustomersPresence(CustomersPresence customersPresence) {
		this.customersPresence = customersPresence;
	}

	/**
	 * The transaction's end of life indicates the date from which on no operation can be carried out anymore.
	 *
	 * @return The transaction's end of life indicates the date from which on no operation can be carried out anymore.
	 */
	@ApiModelProperty(example = "null", value = "The transaction's end of life indicates the date from which on no operation can be carried out anymore.")
	public DateTime getEndOfLife() {
		return endOfLife;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getFailedOn() {
		return failedOn;
	}

	/**
	 * The user will be redirected to failed URL when the transaction could not be authorized or completed. In case no failed URL is specified a default failed page will be displayed.
	 *
	 * @return The user will be redirected to failed URL when the transaction could not be authorized or completed. In case no failed URL is specified a default failed page will be displayed.
	 */
	@ApiModelProperty(example = "null", value = "The user will be redirected to failed URL when the transaction could not be authorized or completed. In case no failed URL is specified a default failed page will be displayed.")
	public String getFailedUrl() {
		return failedUrl;
	}

	public Transaction group(TransactionGroup group) {
		this.group = group;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public TransactionGroup getGroup() {
		return group;
	}

	public void setGroup(TransactionGroup group) {
		this.group = group;
	}

	public Transaction id(Long id) {
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
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getInternetProtocolAddress() {
		return internetProtocolAddress;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getInternetProtocolAddressCountry() {
		return internetProtocolAddressCountry;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getInvoiceMerchantReference() {
		return invoiceMerchantReference;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getLanguage() {
		return language;
	}

	public Transaction lineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
		return this;
	}

	public Transaction addLineItemsItem(LineItem lineItemsItem) {
		this.lineItems.add(lineItemsItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public List<LineItem> getLineItems() {
		return lineItems;
	}

	public void setLineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
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
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getMerchantReference() {
		return merchantReference;
	}

	public Transaction metaData(Map<String, String> metaData) {
		this.metaData = metaData;
		return this;
	}

	public Transaction putMetaDataItem(String key, String metaDataItem) {
		this.metaData.put(key, metaDataItem);
		return this;
	}

	/**
	 * Meta data allow to store additional data along the object.
	 *
	 * @return Meta data allow to store additional data along the object.
	 */
	@ApiModelProperty(example = "null", value = "Meta data allow to store additional data along the object.")
	public Map<String, String> getMetaData() {
		return metaData;
	}

	public void setMetaData(Map<String, String> metaData) {
		this.metaData = metaData;
	}

	public Transaction paymentConnectorConfiguration(PaymentConnectorConfiguration paymentConnectorConfiguration) {
		this.paymentConnectorConfiguration = paymentConnectorConfiguration;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public PaymentConnectorConfiguration getPaymentConnectorConfiguration() {
		return paymentConnectorConfiguration;
	}

	public void setPaymentConnectorConfiguration(PaymentConnectorConfiguration paymentConnectorConfiguration) {
		this.paymentConnectorConfiguration = paymentConnectorConfiguration;
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
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getProcessingOn() {
		return processingOn;
	}

	/**
	 * The refunded amount is the total amount which has been refunded so far.
	 *
	 * @return The refunded amount is the total amount which has been refunded so far.
	 */
	@ApiModelProperty(example = "null", value = "The refunded amount is the total amount which has been refunded so far.")
	public BigDecimal getRefundedAmount() {
		return refundedAmount;
	}

	public Transaction shippingAddress(Address shippingAddress) {
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

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getShippingMethod() {
		return shippingMethod;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Long getSpaceViewId() {
		return spaceViewId;
	}

	public Transaction state(TransactionState state) {
		this.state = state;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public TransactionState getState() {
		return state;
	}

	public void setState(TransactionState state) {
		this.state = state;
	}

	/**
	 * The user will be redirected to success URL when the transaction could be authorized or completed. In case no success URL is specified a default success page will be displayed.
	 *
	 * @return The user will be redirected to success URL when the transaction could be authorized or completed. In case no success URL is specified a default success page will be displayed.
	 */
	@ApiModelProperty(example = "null", value = "The user will be redirected to success URL when the transaction could be authorized or completed. In case no success URL is specified a default success page will be displayed.")
	public String getSuccessUrl() {
		return successUrl;
	}

	public Transaction token(Token token) {
		this.token = token;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Token getToken() {
		return token;
	}

	public void setToken(Token token) {
		this.token = token;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getUserAgentHeader() {
		return userAgentHeader;
	}

	public Transaction userInterfaceType(TransactionUserInterfaceType userInterfaceType) {
		this.userInterfaceType = userInterfaceType;
		return this;
	}

	/**
	 * The user interface type defines through which user interface the transaction has been processed resp. created.
	 *
	 * @return The user interface type defines through which user interface the transaction has been processed resp. created.
	 */
	@ApiModelProperty(example = "null", value = "The user interface type defines through which user interface the transaction has been processed resp. created.")
	public TransactionUserInterfaceType getUserInterfaceType() {
		return userInterfaceType;
	}

	public void setUserInterfaceType(TransactionUserInterfaceType userInterfaceType) {
		this.userInterfaceType = userInterfaceType;
	}

	public Transaction version(Integer version) {
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
				Objects.equals(this.userInterfaceType, transaction.userInterfaceType) &&
				Objects.equals(this.version, transaction.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(acceptHeader, allowedPaymentMethodBrands, allowedPaymentMethodConfigurations, authorizationAmount, authorizedOn, billingAddress, chargeRetryEnabled, completedOn, completionTimeoutOn, confirmedBy, confirmedOn, createdBy, createdOn, currency, customerEmailAddress, customerId, customersPresence, endOfLife, failedOn, failedUrl, group, id, internetProtocolAddress, internetProtocolAddressCountry, invoiceMerchantReference, language, lineItems, linkedSpaceId, merchantReference, metaData, paymentConnectorConfiguration, plannedPurgeDate, processingOn, refundedAmount, shippingAddress, shippingMethod, spaceViewId, state, successUrl, token, userAgentHeader, userInterfaceType, version);
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

