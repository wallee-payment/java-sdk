/**
* wallee SDK
*
* This library allows to interact with the wallee payment service.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/


package com.wallee.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wallee.sdk.model.Address;
import com.wallee.sdk.model.ChargeAttemptEnvironment;
import com.wallee.sdk.model.CustomersPresence;
import com.wallee.sdk.model.Environment;
import com.wallee.sdk.model.FailureReason;
import com.wallee.sdk.model.LineItem;
import com.wallee.sdk.model.PaymentConnectorConfiguration;
import com.wallee.sdk.model.PaymentTerminal;
import com.wallee.sdk.model.Token;
import com.wallee.sdk.model.TokenizationMode;
import com.wallee.sdk.model.TransactionCompletionBehavior;
import com.wallee.sdk.model.TransactionEnvironmentSelectionStrategy;
import com.wallee.sdk.model.TransactionGroup;
import com.wallee.sdk.model.TransactionState;
import com.wallee.sdk.model.TransactionUserInterfaceType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class Transaction {
  
  @JsonProperty("acceptHeader")
  protected String acceptHeader = null;

  
  @JsonProperty("acceptLanguageHeader")
  protected String acceptLanguageHeader = null;

  
  @JsonProperty("allowedPaymentMethodBrands")
  protected List<Long> allowedPaymentMethodBrands = null;

  
  @JsonProperty("allowedPaymentMethodConfigurations")
  protected List<Long> allowedPaymentMethodConfigurations = null;

  
  @JsonProperty("authorizationAmount")
  protected BigDecimal authorizationAmount = null;

  
  @JsonProperty("authorizationEnvironment")
  protected ChargeAttemptEnvironment authorizationEnvironment = null;

  
  @JsonProperty("authorizationSalesChannel")
  protected Long authorizationSalesChannel = null;

  
  @JsonProperty("authorizationTimeoutOn")
  protected OffsetDateTime authorizationTimeoutOn = null;

  
  @JsonProperty("authorizedOn")
  protected OffsetDateTime authorizedOn = null;

  
  @JsonProperty("autoConfirmationEnabled")
  protected Boolean autoConfirmationEnabled = null;

  
  @JsonProperty("billingAddress")
  protected Address billingAddress = null;

  
  @JsonProperty("chargeRetryEnabled")
  protected Boolean chargeRetryEnabled = null;

  
  @JsonProperty("completedAmount")
  protected BigDecimal completedAmount = null;

  
  @JsonProperty("completedOn")
  protected OffsetDateTime completedOn = null;

  
  @JsonProperty("completionBehavior")
  protected TransactionCompletionBehavior completionBehavior = null;

  
  @JsonProperty("completionTimeoutOn")
  protected OffsetDateTime completionTimeoutOn = null;

  
  @JsonProperty("confirmedBy")
  protected Long confirmedBy = null;

  
  @JsonProperty("confirmedOn")
  protected OffsetDateTime confirmedOn = null;

  
  @JsonProperty("createdBy")
  protected Long createdBy = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("currency")
  protected String currency = null;

  
  @JsonProperty("customerEmailAddress")
  protected String customerEmailAddress = null;

  
  @JsonProperty("customerId")
  protected String customerId = null;

  
  @JsonProperty("customersPresence")
  protected CustomersPresence customersPresence = null;

  
  @JsonProperty("deliveryDecisionMadeOn")
  protected OffsetDateTime deliveryDecisionMadeOn = null;

  
  @JsonProperty("deviceSessionIdentifier")
  protected String deviceSessionIdentifier = null;

  
  @JsonProperty("emailsDisabled")
  protected Boolean emailsDisabled = null;

  
  @JsonProperty("endOfLife")
  protected OffsetDateTime endOfLife = null;

  
  @JsonProperty("environment")
  protected Environment environment = null;

  
  @JsonProperty("environmentSelectionStrategy")
  protected TransactionEnvironmentSelectionStrategy environmentSelectionStrategy = null;

  
  @JsonProperty("failedOn")
  protected OffsetDateTime failedOn = null;

  
  @JsonProperty("failedUrl")
  protected String failedUrl = null;

  
  @JsonProperty("failureReason")
  protected FailureReason failureReason = null;

  
  @JsonProperty("group")
  protected TransactionGroup group = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("internetProtocolAddress")
  protected String internetProtocolAddress = null;

  
  @JsonProperty("internetProtocolAddressCountry")
  protected String internetProtocolAddressCountry = null;

  
  @JsonProperty("invoiceMerchantReference")
  protected String invoiceMerchantReference = null;

  
  @JsonProperty("javaEnabled")
  protected Boolean javaEnabled = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("lineItems")
  protected List<LineItem> lineItems = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("merchantReference")
  protected String merchantReference = null;

  
  @JsonProperty("metaData")
  protected Map<String, String> metaData = null;

  
  @JsonProperty("parent")
  protected Long parent = null;

  
  @JsonProperty("paymentConnectorConfiguration")
  protected PaymentConnectorConfiguration paymentConnectorConfiguration = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("processingOn")
  protected OffsetDateTime processingOn = null;

  
  @JsonProperty("refundedAmount")
  protected BigDecimal refundedAmount = null;

  
  @JsonProperty("screenColorDepth")
  protected String screenColorDepth = null;

  
  @JsonProperty("screenHeight")
  protected String screenHeight = null;

  
  @JsonProperty("screenWidth")
  protected String screenWidth = null;

  
  @JsonProperty("shippingAddress")
  protected Address shippingAddress = null;

  
  @JsonProperty("shippingMethod")
  protected String shippingMethod = null;

  
  @JsonProperty("spaceViewId")
  protected Long spaceViewId = null;

  
  @JsonProperty("state")
  protected TransactionState state = null;

  
  @JsonProperty("successUrl")
  protected String successUrl = null;

  
  @JsonProperty("terminal")
  protected PaymentTerminal terminal = null;

  
  @JsonProperty("timeZone")
  protected String timeZone = null;

  
  @JsonProperty("token")
  protected Token token = null;

  
  @JsonProperty("tokenizationMode")
  protected TokenizationMode tokenizationMode = null;

  
  @JsonProperty("totalAppliedFees")
  protected BigDecimal totalAppliedFees = null;

  
  @JsonProperty("totalSettledAmount")
  protected BigDecimal totalSettledAmount = null;

  
  @JsonProperty("userAgentHeader")
  protected String userAgentHeader = null;

  
  @JsonProperty("userFailureMessage")
  protected String userFailureMessage = null;

  
  @JsonProperty("userInterfaceType")
  protected TransactionUserInterfaceType userInterfaceType = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  @JsonProperty("windowHeight")
  protected String windowHeight = null;

  
  @JsonProperty("windowWidth")
  protected String windowWidth = null;

  
  @JsonProperty("yearsToKeep")
  protected Integer yearsToKeep = null;

  
  
   /**
   * The &#39;Accept&#39; header of the customer&#39;s web browser.
   * @return acceptHeader
  **/
  @ApiModelProperty(value = "The 'Accept' header of the customer's web browser.")
  public String getAcceptHeader() {
    return acceptHeader;
  }

  
   /**
   * The &#39;Accept Language&#39; header of the customer&#39;s web browser.
   * @return acceptLanguageHeader
  **/
  @ApiModelProperty(value = "The 'Accept Language' header of the customer's web browser.")
  public String getAcceptLanguageHeader() {
    return acceptLanguageHeader;
  }

  
   /**
   * The payment method brands that can be used to authorize the transaction.
   * @return allowedPaymentMethodBrands
  **/
  @ApiModelProperty(value = "The payment method brands that can be used to authorize the transaction.")
  public List<Long> getAllowedPaymentMethodBrands() {
    return allowedPaymentMethodBrands;
  }

  
   /**
   * The payment method configurations that can be used to authorize the transaction.
   * @return allowedPaymentMethodConfigurations
  **/
  @ApiModelProperty(value = "The payment method configurations that can be used to authorize the transaction.")
  public List<Long> getAllowedPaymentMethodConfigurations() {
    return allowedPaymentMethodConfigurations;
  }

  
   /**
   * The sum of all line item prices including taxes in the transaction&#39;s currency.
   * @return authorizationAmount
  **/
  @ApiModelProperty(value = "The sum of all line item prices including taxes in the transaction's currency.")
  public BigDecimal getAuthorizationAmount() {
    return authorizationAmount;
  }

  
   /**
   * The environment in which the transaction was authorized.
   * @return authorizationEnvironment
  **/
  @ApiModelProperty(value = "The environment in which the transaction was authorized.")
  public ChargeAttemptEnvironment getAuthorizationEnvironment() {
    return authorizationEnvironment;
  }

  
   /**
   * The sales channel through which the transaction was placed.
   * @return authorizationSalesChannel
  **/
  @ApiModelProperty(value = "The sales channel through which the transaction was placed.")
  public Long getAuthorizationSalesChannel() {
    return authorizationSalesChannel;
  }

  
   /**
   * The date and time when the transaction must be authorized, otherwise it will canceled.
   * @return authorizationTimeoutOn
  **/
  @ApiModelProperty(value = "The date and time when the transaction must be authorized, otherwise it will canceled.")
  public OffsetDateTime getAuthorizationTimeoutOn() {
    return authorizationTimeoutOn;
  }

  
   /**
   * The date and time when the transaction was authorized.
   * @return authorizedOn
  **/
  @ApiModelProperty(value = "The date and time when the transaction was authorized.")
  public OffsetDateTime getAuthorizedOn() {
    return authorizedOn;
  }

  
   /**
   * Whether the transaction can be confirmed automatically or whether this must be done explicitly via the API. Default is true.
   * @return autoConfirmationEnabled
  **/
  @ApiModelProperty(value = "Whether the transaction can be confirmed automatically or whether this must be done explicitly via the API. Default is true.")
  public Boolean isAutoConfirmationEnabled() {
    return autoConfirmationEnabled;
  }

  
   /**
   * The address associated with the payment method for invoicing and transaction processing purposes.
   * @return billingAddress
  **/
  @ApiModelProperty(value = "The address associated with the payment method for invoicing and transaction processing purposes.")
  public Address getBillingAddress() {
    return billingAddress;
  }

  
   /**
   * Whether the customer can make further payment attempts if the first one has failed. Default is true.
   * @return chargeRetryEnabled
  **/
  @ApiModelProperty(value = "Whether the customer can make further payment attempts if the first one has failed. Default is true.")
  public Boolean isChargeRetryEnabled() {
    return chargeRetryEnabled;
  }

  
   /**
   * The total amount that was completed, in the transaction&#39;s currency.
   * @return completedAmount
  **/
  @ApiModelProperty(value = "The total amount that was completed, in the transaction's currency.")
  public BigDecimal getCompletedAmount() {
    return completedAmount;
  }

  
   /**
   * The date and time when the transaction was completed.
   * @return completedOn
  **/
  @ApiModelProperty(value = "The date and time when the transaction was completed.")
  public OffsetDateTime getCompletedOn() {
    return completedOn;
  }

  
   /**
   * The behavior that controls when the transaction is completed.
   * @return completionBehavior
  **/
  @ApiModelProperty(value = "The behavior that controls when the transaction is completed.")
  public TransactionCompletionBehavior getCompletionBehavior() {
    return completionBehavior;
  }

  
   /**
   * The date and time when the transaction is completed automatically.
   * @return completionTimeoutOn
  **/
  @ApiModelProperty(value = "The date and time when the transaction is completed automatically.")
  public OffsetDateTime getCompletionTimeoutOn() {
    return completionTimeoutOn;
  }

  
   /**
   * The ID of the user the transaction was confirmed by.
   * @return confirmedBy
  **/
  @ApiModelProperty(value = "The ID of the user the transaction was confirmed by.")
  public Long getConfirmedBy() {
    return confirmedBy;
  }

  
   /**
   * The date and time when the transaction was created.
   * @return confirmedOn
  **/
  @ApiModelProperty(value = "The date and time when the transaction was created.")
  public OffsetDateTime getConfirmedOn() {
    return confirmedOn;
  }

  
   /**
   * The ID of the user the transaction was created by.
   * @return createdBy
  **/
  @ApiModelProperty(value = "The ID of the user the transaction was created by.")
  public Long getCreatedBy() {
    return createdBy;
  }

  
   /**
   * The date and time when the object was created.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The date and time when the object was created.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * The three-letter code (ISO 4217 format) of the transaction&#39;s currency.
   * @return currency
  **/
  @ApiModelProperty(value = "The three-letter code (ISO 4217 format) of the transaction's currency.")
  public String getCurrency() {
    return currency;
  }

  
   /**
   * The customer&#39;s email address.
   * @return customerEmailAddress
  **/
  @ApiModelProperty(value = "The customer's email address.")
  public String getCustomerEmailAddress() {
    return customerEmailAddress;
  }

  
   /**
   * The unique identifier of the customer in the external system.
   * @return customerId
  **/
  @ApiModelProperty(value = "The unique identifier of the customer in the external system.")
  public String getCustomerId() {
    return customerId;
  }

  
   /**
   * The customer&#39;s presence indicates whether and in what way the transaction&#39;s customer is present. Default is VIRTUAL_PRESENT.
   * @return customersPresence
  **/
  @ApiModelProperty(value = "The customer's presence indicates whether and in what way the transaction's customer is present. Default is VIRTUAL_PRESENT.")
  public CustomersPresence getCustomersPresence() {
    return customersPresence;
  }

  
   /**
   * This date and time when the decision was made as to whether the order should be shipped.
   * @return deliveryDecisionMadeOn
  **/
  @ApiModelProperty(value = "This date and time when the decision was made as to whether the order should be shipped.")
  public OffsetDateTime getDeliveryDecisionMadeOn() {
    return deliveryDecisionMadeOn;
  }

  
   /**
   * Allows to link the transaction to the data collected from the customer&#39;s device.
   * @return deviceSessionIdentifier
  **/
  @ApiModelProperty(value = "Allows to link the transaction to the data collected from the customer's device.")
  public String getDeviceSessionIdentifier() {
    return deviceSessionIdentifier;
  }

  
   /**
   * Whether email sending is deactivated for the transaction. Default is false.
   * @return emailsDisabled
  **/
  @ApiModelProperty(value = "Whether email sending is deactivated for the transaction. Default is false.")
  public Boolean isEmailsDisabled() {
    return emailsDisabled;
  }

  
   /**
   * The date and time when the transaction reaches its end of live. No further actions can be carried out at this time.
   * @return endOfLife
  **/
  @ApiModelProperty(value = "The date and time when the transaction reaches its end of live. No further actions can be carried out at this time.")
  public OffsetDateTime getEndOfLife() {
    return endOfLife;
  }

  
   /**
   * 
   * @return environment
  **/
  @ApiModelProperty(value = "")
  public Environment getEnvironment() {
    return environment;
  }

  
   /**
   * The strategy for determining whether the transaction is to be processed in the test or production environment.
   * @return environmentSelectionStrategy
  **/
  @ApiModelProperty(value = "The strategy for determining whether the transaction is to be processed in the test or production environment.")
  public TransactionEnvironmentSelectionStrategy getEnvironmentSelectionStrategy() {
    return environmentSelectionStrategy;
  }

  
   /**
   * The date and time when the transaction failed.
   * @return failedOn
  **/
  @ApiModelProperty(value = "The date and time when the transaction failed.")
  public OffsetDateTime getFailedOn() {
    return failedOn;
  }

  
   /**
   * The URL to redirect the customer back to after they canceled or failed to authenticated their payment.
   * @return failedUrl
  **/
  @ApiModelProperty(value = "The URL to redirect the customer back to after they canceled or failed to authenticated their payment.")
  public String getFailedUrl() {
    return failedUrl;
  }

  
   /**
   * The reason for the failure of the transaction.
   * @return failureReason
  **/
  @ApiModelProperty(value = "The reason for the failure of the transaction.")
  public FailureReason getFailureReason() {
    return failureReason;
  }

  
   /**
   * The group that the transaction belongs to.
   * @return group
  **/
  @ApiModelProperty(value = "The group that the transaction belongs to.")
  public TransactionGroup getGroup() {
    return group;
  }

  
   /**
   * A unique identifier for the object.
   * @return id
  **/
  @ApiModelProperty(value = "A unique identifier for the object.")
  public Long getId() {
    return id;
  }

  
   /**
   * The IP address of the customer&#39;s device.
   * @return internetProtocolAddress
  **/
  @ApiModelProperty(value = "The IP address of the customer's device.")
  public String getInternetProtocolAddress() {
    return internetProtocolAddress;
  }

  
   /**
   * The country determined from the IP address of the customer&#39;s device.
   * @return internetProtocolAddressCountry
  **/
  @ApiModelProperty(value = "The country determined from the IP address of the customer's device.")
  public String getInternetProtocolAddressCountry() {
    return internetProtocolAddressCountry;
  }

  
   /**
   * The merchant&#39;s reference used to identify the invoice.
   * @return invoiceMerchantReference
  **/
  @ApiModelProperty(value = "The merchant's reference used to identify the invoice.")
  public String getInvoiceMerchantReference() {
    return invoiceMerchantReference;
  }

  
   /**
   * Whether Java is enabled on the customer&#39;s web browser.
   * @return javaEnabled
  **/
  @ApiModelProperty(value = "Whether Java is enabled on the customer's web browser.")
  public Boolean isJavaEnabled() {
    return javaEnabled;
  }

  
   /**
   * The language that is linked to the object.
   * @return language
  **/
  @ApiModelProperty(value = "The language that is linked to the object.")
  public String getLanguage() {
    return language;
  }

  
   /**
   * The line items purchased by the customer.
   * @return lineItems
  **/
  @ApiModelProperty(value = "The line items purchased by the customer.")
  public List<LineItem> getLineItems() {
    return lineItems;
  }

  
   /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The ID of the space this object belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The merchant&#39;s reference used to identify the transaction.
   * @return merchantReference
  **/
  @ApiModelProperty(value = "The merchant's reference used to identify the transaction.")
  public String getMerchantReference() {
    return merchantReference;
  }

  
   /**
   * Allow to store additional information about the object.
   * @return metaData
  **/
  @ApiModelProperty(value = "Allow to store additional information about the object.")
  public Map<String, String> getMetaData() {
    return metaData;
  }

  
   /**
   * The parent transaction which was (partially) replaced by this transaction.
   * @return parent
  **/
  @ApiModelProperty(value = "The parent transaction which was (partially) replaced by this transaction.")
  public Long getParent() {
    return parent;
  }

  
   /**
   * The payment connector configuration that was used to authorize the transaction.
   * @return paymentConnectorConfiguration
  **/
  @ApiModelProperty(value = "The payment connector configuration that was used to authorize the transaction.")
  public PaymentConnectorConfiguration getPaymentConnectorConfiguration() {
    return paymentConnectorConfiguration;
  }

  
   /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * The date and time when the processing of the transaction was started.
   * @return processingOn
  **/
  @ApiModelProperty(value = "The date and time when the processing of the transaction was started.")
  public OffsetDateTime getProcessingOn() {
    return processingOn;
  }

  
   /**
   * The total amount that was refunded, in the transaction&#39;s currency.
   * @return refundedAmount
  **/
  @ApiModelProperty(value = "The total amount that was refunded, in the transaction's currency.")
  public BigDecimal getRefundedAmount() {
    return refundedAmount;
  }

  
   /**
   * The screen color depth of the customer&#39;s web browser.
   * @return screenColorDepth
  **/
  @ApiModelProperty(value = "The screen color depth of the customer's web browser.")
  public String getScreenColorDepth() {
    return screenColorDepth;
  }

  
   /**
   * The screen height of the customer&#39;s web browser.
   * @return screenHeight
  **/
  @ApiModelProperty(value = "The screen height of the customer's web browser.")
  public String getScreenHeight() {
    return screenHeight;
  }

  
   /**
   * The screen width of the customer&#39;s web browser.
   * @return screenWidth
  **/
  @ApiModelProperty(value = "The screen width of the customer's web browser.")
  public String getScreenWidth() {
    return screenWidth;
  }

  
   /**
   * The address to where the order will be shipped.
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "The address to where the order will be shipped.")
  public Address getShippingAddress() {
    return shippingAddress;
  }

  
   /**
   * The name of the shipping method used to ship the products.
   * @return shippingMethod
  **/
  @ApiModelProperty(value = "The name of the shipping method used to ship the products.")
  public String getShippingMethod() {
    return shippingMethod;
  }

  
   /**
   * The ID of the space view this object is linked to.
   * @return spaceViewId
  **/
  @ApiModelProperty(value = "The ID of the space view this object is linked to.")
  public Long getSpaceViewId() {
    return spaceViewId;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public TransactionState getState() {
    return state;
  }

  
   /**
   * The URL to redirect the customer back to after they successfully authenticated their payment.
   * @return successUrl
  **/
  @ApiModelProperty(value = "The URL to redirect the customer back to after they successfully authenticated their payment.")
  public String getSuccessUrl() {
    return successUrl;
  }

  
   /**
   * The payment terminal through which the payment was processed.
   * @return terminal
  **/
  @ApiModelProperty(value = "The payment terminal through which the payment was processed.")
  public PaymentTerminal getTerminal() {
    return terminal;
  }

  
   /**
   * The customer&#39;s time zone, which affects how dates and times are formatted when communicating with the customer.
   * @return timeZone
  **/
  @ApiModelProperty(value = "The customer's time zone, which affects how dates and times are formatted when communicating with the customer.")
  public String getTimeZone() {
    return timeZone;
  }

  
   /**
   * The payment token that should be used to charge the customer.
   * @return token
  **/
  @ApiModelProperty(value = "The payment token that should be used to charge the customer.")
  public Token getToken() {
    return token;
  }

  
   /**
   * The tokenization mode specifies whether and how the tokenization of payment information is applied to the transaction.
   * @return tokenizationMode
  **/
  @ApiModelProperty(value = "The tokenization mode specifies whether and how the tokenization of payment information is applied to the transaction.")
  public TokenizationMode getTokenizationMode() {
    return tokenizationMode;
  }

  
   /**
   * The total of all fees charged, in the transaction&#39;s currency.
   * @return totalAppliedFees
  **/
  @ApiModelProperty(value = "The total of all fees charged, in the transaction's currency.")
  public BigDecimal getTotalAppliedFees() {
    return totalAppliedFees;
  }

  
   /**
   * The total amount that was settled, in the transaction&#39;s currency.
   * @return totalSettledAmount
  **/
  @ApiModelProperty(value = "The total amount that was settled, in the transaction's currency.")
  public BigDecimal getTotalSettledAmount() {
    return totalSettledAmount;
  }

  
   /**
   * The &#39;User Agent&#39; header of the customer&#39;s web browser.
   * @return userAgentHeader
  **/
  @ApiModelProperty(value = "The 'User Agent' header of the customer's web browser.")
  public String getUserAgentHeader() {
    return userAgentHeader;
  }

  
   /**
   * The message that can be displayed to the customer explaining why the transaction failed, in the customer&#39;s language.
   * @return userFailureMessage
  **/
  @ApiModelProperty(value = "The message that can be displayed to the customer explaining why the transaction failed, in the customer's language.")
  public String getUserFailureMessage() {
    return userFailureMessage;
  }

  
   /**
   * The type of user interface the customer used to provide the payment information.
   * @return userInterfaceType
  **/
  @ApiModelProperty(value = "The type of user interface the customer used to provide the payment information.")
  public TransactionUserInterfaceType getUserInterfaceType() {
    return userInterfaceType;
  }

  
   /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @ApiModelProperty(value = "The version is used for optimistic locking and incremented whenever the object is updated.")
  public Integer getVersion() {
    return version;
  }

  
   /**
   * The window height of the customer&#39;s web browser.
   * @return windowHeight
  **/
  @ApiModelProperty(value = "The window height of the customer's web browser.")
  public String getWindowHeight() {
    return windowHeight;
  }

  
   /**
   * The window width of the customer&#39;s web browser.
   * @return windowWidth
  **/
  @ApiModelProperty(value = "The window width of the customer's web browser.")
  public String getWindowWidth() {
    return windowWidth;
  }

  
   /**
   * The number of years the transaction is kept after its authorization.
   * @return yearsToKeep
  **/
  @ApiModelProperty(value = "The number of years the transaction is kept after its authorization.")
  public Integer getYearsToKeep() {
    return yearsToKeep;
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
        Objects.equals(this.acceptLanguageHeader, transaction.acceptLanguageHeader) &&
        Objects.equals(this.allowedPaymentMethodBrands, transaction.allowedPaymentMethodBrands) &&
        Objects.equals(this.allowedPaymentMethodConfigurations, transaction.allowedPaymentMethodConfigurations) &&
        Objects.equals(this.authorizationAmount, transaction.authorizationAmount) &&
        Objects.equals(this.authorizationEnvironment, transaction.authorizationEnvironment) &&
        Objects.equals(this.authorizationSalesChannel, transaction.authorizationSalesChannel) &&
        Objects.equals(this.authorizationTimeoutOn, transaction.authorizationTimeoutOn) &&
        Objects.equals(this.authorizedOn, transaction.authorizedOn) &&
        Objects.equals(this.autoConfirmationEnabled, transaction.autoConfirmationEnabled) &&
        Objects.equals(this.billingAddress, transaction.billingAddress) &&
        Objects.equals(this.chargeRetryEnabled, transaction.chargeRetryEnabled) &&
        Objects.equals(this.completedAmount, transaction.completedAmount) &&
        Objects.equals(this.completedOn, transaction.completedOn) &&
        Objects.equals(this.completionBehavior, transaction.completionBehavior) &&
        Objects.equals(this.completionTimeoutOn, transaction.completionTimeoutOn) &&
        Objects.equals(this.confirmedBy, transaction.confirmedBy) &&
        Objects.equals(this.confirmedOn, transaction.confirmedOn) &&
        Objects.equals(this.createdBy, transaction.createdBy) &&
        Objects.equals(this.createdOn, transaction.createdOn) &&
        Objects.equals(this.currency, transaction.currency) &&
        Objects.equals(this.customerEmailAddress, transaction.customerEmailAddress) &&
        Objects.equals(this.customerId, transaction.customerId) &&
        Objects.equals(this.customersPresence, transaction.customersPresence) &&
        Objects.equals(this.deliveryDecisionMadeOn, transaction.deliveryDecisionMadeOn) &&
        Objects.equals(this.deviceSessionIdentifier, transaction.deviceSessionIdentifier) &&
        Objects.equals(this.emailsDisabled, transaction.emailsDisabled) &&
        Objects.equals(this.endOfLife, transaction.endOfLife) &&
        Objects.equals(this.environment, transaction.environment) &&
        Objects.equals(this.environmentSelectionStrategy, transaction.environmentSelectionStrategy) &&
        Objects.equals(this.failedOn, transaction.failedOn) &&
        Objects.equals(this.failedUrl, transaction.failedUrl) &&
        Objects.equals(this.failureReason, transaction.failureReason) &&
        Objects.equals(this.group, transaction.group) &&
        Objects.equals(this.id, transaction.id) &&
        Objects.equals(this.internetProtocolAddress, transaction.internetProtocolAddress) &&
        Objects.equals(this.internetProtocolAddressCountry, transaction.internetProtocolAddressCountry) &&
        Objects.equals(this.invoiceMerchantReference, transaction.invoiceMerchantReference) &&
        Objects.equals(this.javaEnabled, transaction.javaEnabled) &&
        Objects.equals(this.language, transaction.language) &&
        Objects.equals(this.lineItems, transaction.lineItems) &&
        Objects.equals(this.linkedSpaceId, transaction.linkedSpaceId) &&
        Objects.equals(this.merchantReference, transaction.merchantReference) &&
        Objects.equals(this.metaData, transaction.metaData) &&
        Objects.equals(this.parent, transaction.parent) &&
        Objects.equals(this.paymentConnectorConfiguration, transaction.paymentConnectorConfiguration) &&
        Objects.equals(this.plannedPurgeDate, transaction.plannedPurgeDate) &&
        Objects.equals(this.processingOn, transaction.processingOn) &&
        Objects.equals(this.refundedAmount, transaction.refundedAmount) &&
        Objects.equals(this.screenColorDepth, transaction.screenColorDepth) &&
        Objects.equals(this.screenHeight, transaction.screenHeight) &&
        Objects.equals(this.screenWidth, transaction.screenWidth) &&
        Objects.equals(this.shippingAddress, transaction.shippingAddress) &&
        Objects.equals(this.shippingMethod, transaction.shippingMethod) &&
        Objects.equals(this.spaceViewId, transaction.spaceViewId) &&
        Objects.equals(this.state, transaction.state) &&
        Objects.equals(this.successUrl, transaction.successUrl) &&
        Objects.equals(this.terminal, transaction.terminal) &&
        Objects.equals(this.timeZone, transaction.timeZone) &&
        Objects.equals(this.token, transaction.token) &&
        Objects.equals(this.tokenizationMode, transaction.tokenizationMode) &&
        Objects.equals(this.totalAppliedFees, transaction.totalAppliedFees) &&
        Objects.equals(this.totalSettledAmount, transaction.totalSettledAmount) &&
        Objects.equals(this.userAgentHeader, transaction.userAgentHeader) &&
        Objects.equals(this.userFailureMessage, transaction.userFailureMessage) &&
        Objects.equals(this.userInterfaceType, transaction.userInterfaceType) &&
        Objects.equals(this.version, transaction.version) &&
        Objects.equals(this.windowHeight, transaction.windowHeight) &&
        Objects.equals(this.windowWidth, transaction.windowWidth) &&
        Objects.equals(this.yearsToKeep, transaction.yearsToKeep);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptHeader, acceptLanguageHeader, allowedPaymentMethodBrands, allowedPaymentMethodConfigurations, authorizationAmount, authorizationEnvironment, authorizationSalesChannel, authorizationTimeoutOn, authorizedOn, autoConfirmationEnabled, billingAddress, chargeRetryEnabled, completedAmount, completedOn, completionBehavior, completionTimeoutOn, confirmedBy, confirmedOn, createdBy, createdOn, currency, customerEmailAddress, customerId, customersPresence, deliveryDecisionMadeOn, deviceSessionIdentifier, emailsDisabled, endOfLife, environment, environmentSelectionStrategy, failedOn, failedUrl, failureReason, group, id, internetProtocolAddress, internetProtocolAddressCountry, invoiceMerchantReference, javaEnabled, language, lineItems, linkedSpaceId, merchantReference, metaData, parent, paymentConnectorConfiguration, plannedPurgeDate, processingOn, refundedAmount, screenColorDepth, screenHeight, screenWidth, shippingAddress, shippingMethod, spaceViewId, state, successUrl, terminal, timeZone, token, tokenizationMode, totalAppliedFees, totalSettledAmount, userAgentHeader, userFailureMessage, userInterfaceType, version, windowHeight, windowWidth, yearsToKeep);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    acceptHeader: ").append(toIndentedString(acceptHeader)).append("\n");
    sb.append("    acceptLanguageHeader: ").append(toIndentedString(acceptLanguageHeader)).append("\n");
    sb.append("    allowedPaymentMethodBrands: ").append(toIndentedString(allowedPaymentMethodBrands)).append("\n");
    sb.append("    allowedPaymentMethodConfigurations: ").append(toIndentedString(allowedPaymentMethodConfigurations)).append("\n");
    sb.append("    authorizationAmount: ").append(toIndentedString(authorizationAmount)).append("\n");
    sb.append("    authorizationEnvironment: ").append(toIndentedString(authorizationEnvironment)).append("\n");
    sb.append("    authorizationSalesChannel: ").append(toIndentedString(authorizationSalesChannel)).append("\n");
    sb.append("    authorizationTimeoutOn: ").append(toIndentedString(authorizationTimeoutOn)).append("\n");
    sb.append("    authorizedOn: ").append(toIndentedString(authorizedOn)).append("\n");
    sb.append("    autoConfirmationEnabled: ").append(toIndentedString(autoConfirmationEnabled)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    chargeRetryEnabled: ").append(toIndentedString(chargeRetryEnabled)).append("\n");
    sb.append("    completedAmount: ").append(toIndentedString(completedAmount)).append("\n");
    sb.append("    completedOn: ").append(toIndentedString(completedOn)).append("\n");
    sb.append("    completionBehavior: ").append(toIndentedString(completionBehavior)).append("\n");
    sb.append("    completionTimeoutOn: ").append(toIndentedString(completionTimeoutOn)).append("\n");
    sb.append("    confirmedBy: ").append(toIndentedString(confirmedBy)).append("\n");
    sb.append("    confirmedOn: ").append(toIndentedString(confirmedOn)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    customerEmailAddress: ").append(toIndentedString(customerEmailAddress)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customersPresence: ").append(toIndentedString(customersPresence)).append("\n");
    sb.append("    deliveryDecisionMadeOn: ").append(toIndentedString(deliveryDecisionMadeOn)).append("\n");
    sb.append("    deviceSessionIdentifier: ").append(toIndentedString(deviceSessionIdentifier)).append("\n");
    sb.append("    emailsDisabled: ").append(toIndentedString(emailsDisabled)).append("\n");
    sb.append("    endOfLife: ").append(toIndentedString(endOfLife)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    environmentSelectionStrategy: ").append(toIndentedString(environmentSelectionStrategy)).append("\n");
    sb.append("    failedOn: ").append(toIndentedString(failedOn)).append("\n");
    sb.append("    failedUrl: ").append(toIndentedString(failedUrl)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    internetProtocolAddress: ").append(toIndentedString(internetProtocolAddress)).append("\n");
    sb.append("    internetProtocolAddressCountry: ").append(toIndentedString(internetProtocolAddressCountry)).append("\n");
    sb.append("    invoiceMerchantReference: ").append(toIndentedString(invoiceMerchantReference)).append("\n");
    sb.append("    javaEnabled: ").append(toIndentedString(javaEnabled)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    paymentConnectorConfiguration: ").append(toIndentedString(paymentConnectorConfiguration)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    processingOn: ").append(toIndentedString(processingOn)).append("\n");
    sb.append("    refundedAmount: ").append(toIndentedString(refundedAmount)).append("\n");
    sb.append("    screenColorDepth: ").append(toIndentedString(screenColorDepth)).append("\n");
    sb.append("    screenHeight: ").append(toIndentedString(screenHeight)).append("\n");
    sb.append("    screenWidth: ").append(toIndentedString(screenWidth)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    shippingMethod: ").append(toIndentedString(shippingMethod)).append("\n");
    sb.append("    spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    successUrl: ").append(toIndentedString(successUrl)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    tokenizationMode: ").append(toIndentedString(tokenizationMode)).append("\n");
    sb.append("    totalAppliedFees: ").append(toIndentedString(totalAppliedFees)).append("\n");
    sb.append("    totalSettledAmount: ").append(toIndentedString(totalSettledAmount)).append("\n");
    sb.append("    userAgentHeader: ").append(toIndentedString(userAgentHeader)).append("\n");
    sb.append("    userFailureMessage: ").append(toIndentedString(userFailureMessage)).append("\n");
    sb.append("    userInterfaceType: ").append(toIndentedString(userInterfaceType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    windowHeight: ").append(toIndentedString(windowHeight)).append("\n");
    sb.append("    windowWidth: ").append(toIndentedString(windowWidth)).append("\n");
    sb.append("    yearsToKeep: ").append(toIndentedString(yearsToKeep)).append("\n");
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
    return o.toString().replace("\n", "\n    ");
  }

}

