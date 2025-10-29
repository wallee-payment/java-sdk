/**
 * Wallee AG Java SDK
 *
 * This library allows to interact with the Wallee AG payment service.
 *
 * Copyright owner: Wallee AG
 * Website: https://en.wallee.com
 * Developer email: ecosystem-team@wallee.com
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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Transaction
 */
@JsonPropertyOrder({
  Transaction.JSON_PROPERTY_PARENT,
  Transaction.JSON_PROPERTY_TOTAL_SETTLED_AMOUNT,
  Transaction.JSON_PROPERTY_DEVICE_SESSION_IDENTIFIER,
  Transaction.JSON_PROPERTY_PROCESSING_ON,
  Transaction.JSON_PROPERTY_INVOICE_MERCHANT_REFERENCE,
  Transaction.JSON_PROPERTY_LANGUAGE,
  Transaction.JSON_PROPERTY_CONFIRMED_ON,
  Transaction.JSON_PROPERTY_LINE_ITEMS,
  Transaction.JSON_PROPERTY_ACCEPT_LANGUAGE_HEADER,
  Transaction.JSON_PROPERTY_JAVA_ENABLED,
  Transaction.JSON_PROPERTY_CONFIRMED_BY,
  Transaction.JSON_PROPERTY_PAYMENT_CONNECTOR_CONFIGURATION,
  Transaction.JSON_PROPERTY_ID,
  Transaction.JSON_PROPERTY_STATE,
  Transaction.JSON_PROPERTY_WINDOW_WIDTH,
  Transaction.JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_CONFIGURATIONS,
  Transaction.JSON_PROPERTY_GROUP,
  Transaction.JSON_PROPERTY_CHARGE_RETRY_ENABLED,
  Transaction.JSON_PROPERTY_ACCEPT_HEADER,
  Transaction.JSON_PROPERTY_USER_AGENT_HEADER,
  Transaction.JSON_PROPERTY_SHIPPING_METHOD,
  Transaction.JSON_PROPERTY_PLANNED_PURGE_DATE,
  Transaction.JSON_PROPERTY_SUCCESS_URL,
  Transaction.JSON_PROPERTY_TIME_ZONE,
  Transaction.JSON_PROPERTY_SPACE_VIEW_ID,
  Transaction.JSON_PROPERTY_USER_FAILURE_MESSAGE,
  Transaction.JSON_PROPERTY_COMPLETION_BEHAVIOR,
  Transaction.JSON_PROPERTY_VERSION,
  Transaction.JSON_PROPERTY_INTERNET_PROTOCOL_ADDRESS_COUNTRY,
  Transaction.JSON_PROPERTY_LINKED_SPACE_ID,
  Transaction.JSON_PROPERTY_DELIVERY_DECISION_MADE_ON,
  Transaction.JSON_PROPERTY_AUTHORIZATION_ENVIRONMENT,
  Transaction.JSON_PROPERTY_AUTO_CONFIRMATION_ENABLED,
  Transaction.JSON_PROPERTY_FAILURE_REASON,
  Transaction.JSON_PROPERTY_TOTAL_APPLIED_FEES,
  Transaction.JSON_PROPERTY_CUSTOMERS_PRESENCE,
  Transaction.JSON_PROPERTY_FAILED_ON,
  Transaction.JSON_PROPERTY_REFUNDED_AMOUNT,
  Transaction.JSON_PROPERTY_AUTHORIZATION_AMOUNT,
  Transaction.JSON_PROPERTY_SCREEN_WIDTH,
  Transaction.JSON_PROPERTY_ENVIRONMENT_SELECTION_STRATEGY,
  Transaction.JSON_PROPERTY_CUSTOMER_EMAIL_ADDRESS,
  Transaction.JSON_PROPERTY_WINDOW_HEIGHT,
  Transaction.JSON_PROPERTY_TOKENIZATION_MODE,
  Transaction.JSON_PROPERTY_AUTHORIZATION_TIMEOUT_ON,
  Transaction.JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_BRANDS,
  Transaction.JSON_PROPERTY_CREATED_ON,
  Transaction.JSON_PROPERTY_META_DATA,
  Transaction.JSON_PROPERTY_EMAILS_DISABLED,
  Transaction.JSON_PROPERTY_USER_INTERFACE_TYPE,
  Transaction.JSON_PROPERTY_CUSTOMER_ID,
  Transaction.JSON_PROPERTY_CURRENCY,
  Transaction.JSON_PROPERTY_MERCHANT_REFERENCE,
  Transaction.JSON_PROPERTY_AUTHORIZATION_SALES_CHANNEL,
  Transaction.JSON_PROPERTY_YEARS_TO_KEEP,
  Transaction.JSON_PROPERTY_COMPLETED_AMOUNT,
  Transaction.JSON_PROPERTY_SCREEN_HEIGHT,
  Transaction.JSON_PROPERTY_INTERNET_PROTOCOL_ADDRESS,
  Transaction.JSON_PROPERTY_TERMINAL,
  Transaction.JSON_PROPERTY_END_OF_LIFE,
  Transaction.JSON_PROPERTY_TOKEN,
  Transaction.JSON_PROPERTY_ENVIRONMENT,
  Transaction.JSON_PROPERTY_SCREEN_COLOR_DEPTH,
  Transaction.JSON_PROPERTY_CREATED_BY,
  Transaction.JSON_PROPERTY_COMPLETED_ON,
  Transaction.JSON_PROPERTY_COMPLETION_TIMEOUT_ON,
  Transaction.JSON_PROPERTY_SHIPPING_ADDRESS,
  Transaction.JSON_PROPERTY_BILLING_ADDRESS,
  Transaction.JSON_PROPERTY_AUTHORIZED_ON,
  Transaction.JSON_PROPERTY_FAILED_URL
})

public class Transaction {
  public static final String JSON_PROPERTY_PARENT = "parent";
  private Transaction parent;

  public static final String JSON_PROPERTY_TOTAL_SETTLED_AMOUNT = "totalSettledAmount";
  private BigDecimal totalSettledAmount;

  public static final String JSON_PROPERTY_DEVICE_SESSION_IDENTIFIER = "deviceSessionIdentifier";
  private String deviceSessionIdentifier;

  public static final String JSON_PROPERTY_PROCESSING_ON = "processingOn";
  private OffsetDateTime processingOn;

  public static final String JSON_PROPERTY_INVOICE_MERCHANT_REFERENCE = "invoiceMerchantReference";
  private String invoiceMerchantReference;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_CONFIRMED_ON = "confirmedOn";
  private OffsetDateTime confirmedOn;

  public static final String JSON_PROPERTY_LINE_ITEMS = "lineItems";
  private List<LineItem> lineItems = new ArrayList<>();

  public static final String JSON_PROPERTY_ACCEPT_LANGUAGE_HEADER = "acceptLanguageHeader";
  private String acceptLanguageHeader;

  public static final String JSON_PROPERTY_JAVA_ENABLED = "javaEnabled";
  private Boolean javaEnabled;

  public static final String JSON_PROPERTY_CONFIRMED_BY = "confirmedBy";
  private Long confirmedBy;

  public static final String JSON_PROPERTY_PAYMENT_CONNECTOR_CONFIGURATION = "paymentConnectorConfiguration";
  private PaymentConnectorConfiguration paymentConnectorConfiguration;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  private TransactionState state;

  public static final String JSON_PROPERTY_WINDOW_WIDTH = "windowWidth";
  private String windowWidth;

  public static final String JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_CONFIGURATIONS = "allowedPaymentMethodConfigurations";
  private List<Long> allowedPaymentMethodConfigurations = new ArrayList<>();

  public static final String JSON_PROPERTY_GROUP = "group";
  private TransactionGroup group;

  public static final String JSON_PROPERTY_CHARGE_RETRY_ENABLED = "chargeRetryEnabled";
  private Boolean chargeRetryEnabled;

  public static final String JSON_PROPERTY_ACCEPT_HEADER = "acceptHeader";
  private String acceptHeader;

  public static final String JSON_PROPERTY_USER_AGENT_HEADER = "userAgentHeader";
  private String userAgentHeader;

  public static final String JSON_PROPERTY_SHIPPING_METHOD = "shippingMethod";
  private String shippingMethod;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_SUCCESS_URL = "successUrl";
  private String successUrl;

  public static final String JSON_PROPERTY_TIME_ZONE = "timeZone";
  private String timeZone;

  public static final String JSON_PROPERTY_SPACE_VIEW_ID = "spaceViewId";
  private Long spaceViewId;

  public static final String JSON_PROPERTY_USER_FAILURE_MESSAGE = "userFailureMessage";
  private String userFailureMessage;

  public static final String JSON_PROPERTY_COMPLETION_BEHAVIOR = "completionBehavior";
  private TransactionCompletionBehavior completionBehavior;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_INTERNET_PROTOCOL_ADDRESS_COUNTRY = "internetProtocolAddressCountry";
  private String internetProtocolAddressCountry;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_DELIVERY_DECISION_MADE_ON = "deliveryDecisionMadeOn";
  private OffsetDateTime deliveryDecisionMadeOn;

  public static final String JSON_PROPERTY_AUTHORIZATION_ENVIRONMENT = "authorizationEnvironment";
  private ChargeAttemptEnvironment authorizationEnvironment;

  public static final String JSON_PROPERTY_AUTO_CONFIRMATION_ENABLED = "autoConfirmationEnabled";
  private Boolean autoConfirmationEnabled;

  public static final String JSON_PROPERTY_FAILURE_REASON = "failureReason";
  private FailureReason failureReason;

  public static final String JSON_PROPERTY_TOTAL_APPLIED_FEES = "totalAppliedFees";
  private BigDecimal totalAppliedFees;

  public static final String JSON_PROPERTY_CUSTOMERS_PRESENCE = "customersPresence";
  private CustomersPresence customersPresence;

  public static final String JSON_PROPERTY_FAILED_ON = "failedOn";
  private OffsetDateTime failedOn;

  public static final String JSON_PROPERTY_REFUNDED_AMOUNT = "refundedAmount";
  private BigDecimal refundedAmount;

  public static final String JSON_PROPERTY_AUTHORIZATION_AMOUNT = "authorizationAmount";
  private BigDecimal authorizationAmount;

  public static final String JSON_PROPERTY_SCREEN_WIDTH = "screenWidth";
  private String screenWidth;

  public static final String JSON_PROPERTY_ENVIRONMENT_SELECTION_STRATEGY = "environmentSelectionStrategy";
  private TransactionEnvironmentSelectionStrategy environmentSelectionStrategy;

  public static final String JSON_PROPERTY_CUSTOMER_EMAIL_ADDRESS = "customerEmailAddress";
  private String customerEmailAddress;

  public static final String JSON_PROPERTY_WINDOW_HEIGHT = "windowHeight";
  private String windowHeight;

  public static final String JSON_PROPERTY_TOKENIZATION_MODE = "tokenizationMode";
  private TokenizationMode tokenizationMode;

  public static final String JSON_PROPERTY_AUTHORIZATION_TIMEOUT_ON = "authorizationTimeoutOn";
  private OffsetDateTime authorizationTimeoutOn;

  public static final String JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_BRANDS = "allowedPaymentMethodBrands";
  private List<Long> allowedPaymentMethodBrands = new ArrayList<>();

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_META_DATA = "metaData";
  private Map<String, String> metaData = new HashMap<>();

  public static final String JSON_PROPERTY_EMAILS_DISABLED = "emailsDisabled";
  private Boolean emailsDisabled;

  public static final String JSON_PROPERTY_USER_INTERFACE_TYPE = "userInterfaceType";
  private TransactionUserInterfaceType userInterfaceType;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  private String customerId;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_MERCHANT_REFERENCE = "merchantReference";
  private String merchantReference;

  public static final String JSON_PROPERTY_AUTHORIZATION_SALES_CHANNEL = "authorizationSalesChannel";
  private Long authorizationSalesChannel;

  public static final String JSON_PROPERTY_YEARS_TO_KEEP = "yearsToKeep";
  private Integer yearsToKeep;

  public static final String JSON_PROPERTY_COMPLETED_AMOUNT = "completedAmount";
  private BigDecimal completedAmount;

  public static final String JSON_PROPERTY_SCREEN_HEIGHT = "screenHeight";
  private String screenHeight;

  public static final String JSON_PROPERTY_INTERNET_PROTOCOL_ADDRESS = "internetProtocolAddress";
  private String internetProtocolAddress;

  public static final String JSON_PROPERTY_TERMINAL = "terminal";
  private PaymentTerminal terminal;

  public static final String JSON_PROPERTY_END_OF_LIFE = "endOfLife";
  private OffsetDateTime endOfLife;

  public static final String JSON_PROPERTY_TOKEN = "token";
  private Token token;

  public static final String JSON_PROPERTY_ENVIRONMENT = "environment";
  private Environment environment;

  public static final String JSON_PROPERTY_SCREEN_COLOR_DEPTH = "screenColorDepth";
  private String screenColorDepth;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private Long createdBy;

  public static final String JSON_PROPERTY_COMPLETED_ON = "completedOn";
  private OffsetDateTime completedOn;

  public static final String JSON_PROPERTY_COMPLETION_TIMEOUT_ON = "completionTimeoutOn";
  private OffsetDateTime completionTimeoutOn;

  public static final String JSON_PROPERTY_SHIPPING_ADDRESS = "shippingAddress";
  private Address shippingAddress;

  public static final String JSON_PROPERTY_BILLING_ADDRESS = "billingAddress";
  private Address billingAddress;

  public static final String JSON_PROPERTY_AUTHORIZED_ON = "authorizedOn";
  private OffsetDateTime authorizedOn;

  public static final String JSON_PROPERTY_FAILED_URL = "failedUrl";
  private String failedUrl;

  public Transaction() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public Transaction(
    @JsonProperty(JSON_PROPERTY_TOTAL_SETTLED_AMOUNT) BigDecimal totalSettledAmount, 
    @JsonProperty(JSON_PROPERTY_DEVICE_SESSION_IDENTIFIER) String deviceSessionIdentifier, 
    @JsonProperty(JSON_PROPERTY_PROCESSING_ON) OffsetDateTime processingOn, 
    @JsonProperty(JSON_PROPERTY_INVOICE_MERCHANT_REFERENCE) String invoiceMerchantReference, 
    @JsonProperty(JSON_PROPERTY_LANGUAGE) String language, 
    @JsonProperty(JSON_PROPERTY_CONFIRMED_ON) OffsetDateTime confirmedOn, 
    @JsonProperty(JSON_PROPERTY_LINE_ITEMS) List<LineItem> lineItems, 
    @JsonProperty(JSON_PROPERTY_ACCEPT_LANGUAGE_HEADER) String acceptLanguageHeader, 
    @JsonProperty(JSON_PROPERTY_JAVA_ENABLED) Boolean javaEnabled, 
    @JsonProperty(JSON_PROPERTY_CONFIRMED_BY) Long confirmedBy, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_WINDOW_WIDTH) String windowWidth, 
    @JsonProperty(JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_CONFIGURATIONS) List<Long> allowedPaymentMethodConfigurations, 
    @JsonProperty(JSON_PROPERTY_CHARGE_RETRY_ENABLED) Boolean chargeRetryEnabled, 
    @JsonProperty(JSON_PROPERTY_ACCEPT_HEADER) String acceptHeader, 
    @JsonProperty(JSON_PROPERTY_USER_AGENT_HEADER) String userAgentHeader, 
    @JsonProperty(JSON_PROPERTY_SHIPPING_METHOD) String shippingMethod, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_SUCCESS_URL) String successUrl, 
    @JsonProperty(JSON_PROPERTY_TIME_ZONE) String timeZone, 
    @JsonProperty(JSON_PROPERTY_SPACE_VIEW_ID) Long spaceViewId, 
    @JsonProperty(JSON_PROPERTY_USER_FAILURE_MESSAGE) String userFailureMessage, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_INTERNET_PROTOCOL_ADDRESS_COUNTRY) String internetProtocolAddressCountry, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_DELIVERY_DECISION_MADE_ON) OffsetDateTime deliveryDecisionMadeOn, 
    @JsonProperty(JSON_PROPERTY_AUTO_CONFIRMATION_ENABLED) Boolean autoConfirmationEnabled, 
    @JsonProperty(JSON_PROPERTY_TOTAL_APPLIED_FEES) BigDecimal totalAppliedFees, 
    @JsonProperty(JSON_PROPERTY_FAILED_ON) OffsetDateTime failedOn, 
    @JsonProperty(JSON_PROPERTY_REFUNDED_AMOUNT) BigDecimal refundedAmount, 
    @JsonProperty(JSON_PROPERTY_AUTHORIZATION_AMOUNT) BigDecimal authorizationAmount, 
    @JsonProperty(JSON_PROPERTY_SCREEN_WIDTH) String screenWidth, 
    @JsonProperty(JSON_PROPERTY_CUSTOMER_EMAIL_ADDRESS) String customerEmailAddress, 
    @JsonProperty(JSON_PROPERTY_WINDOW_HEIGHT) String windowHeight, 
    @JsonProperty(JSON_PROPERTY_AUTHORIZATION_TIMEOUT_ON) OffsetDateTime authorizationTimeoutOn, 
    @JsonProperty(JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_BRANDS) List<Long> allowedPaymentMethodBrands, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_META_DATA) Map<String, String> metaData, 
    @JsonProperty(JSON_PROPERTY_EMAILS_DISABLED) Boolean emailsDisabled, 
    @JsonProperty(JSON_PROPERTY_CUSTOMER_ID) String customerId, 
    @JsonProperty(JSON_PROPERTY_CURRENCY) String currency, 
    @JsonProperty(JSON_PROPERTY_MERCHANT_REFERENCE) String merchantReference, 
    @JsonProperty(JSON_PROPERTY_AUTHORIZATION_SALES_CHANNEL) Long authorizationSalesChannel, 
    @JsonProperty(JSON_PROPERTY_YEARS_TO_KEEP) Integer yearsToKeep, 
    @JsonProperty(JSON_PROPERTY_COMPLETED_AMOUNT) BigDecimal completedAmount, 
    @JsonProperty(JSON_PROPERTY_SCREEN_HEIGHT) String screenHeight, 
    @JsonProperty(JSON_PROPERTY_INTERNET_PROTOCOL_ADDRESS) String internetProtocolAddress, 
    @JsonProperty(JSON_PROPERTY_END_OF_LIFE) OffsetDateTime endOfLife, 
    @JsonProperty(JSON_PROPERTY_SCREEN_COLOR_DEPTH) String screenColorDepth, 
    @JsonProperty(JSON_PROPERTY_CREATED_BY) Long createdBy, 
    @JsonProperty(JSON_PROPERTY_COMPLETED_ON) OffsetDateTime completedOn, 
    @JsonProperty(JSON_PROPERTY_COMPLETION_TIMEOUT_ON) OffsetDateTime completionTimeoutOn, 
    @JsonProperty(JSON_PROPERTY_AUTHORIZED_ON) OffsetDateTime authorizedOn, 
    @JsonProperty(JSON_PROPERTY_FAILED_URL) String failedUrl
  ) {
    this();
    this.totalSettledAmount = totalSettledAmount;
    this.deviceSessionIdentifier = deviceSessionIdentifier;
    this.processingOn = processingOn;
    this.invoiceMerchantReference = invoiceMerchantReference;
    this.language = language;
    this.confirmedOn = confirmedOn;
    this.lineItems = lineItems;
    this.acceptLanguageHeader = acceptLanguageHeader;
    this.javaEnabled = javaEnabled;
    this.confirmedBy = confirmedBy;
    this.id = id;
    this.windowWidth = windowWidth;
    this.allowedPaymentMethodConfigurations = allowedPaymentMethodConfigurations;
    this.chargeRetryEnabled = chargeRetryEnabled;
    this.acceptHeader = acceptHeader;
    this.userAgentHeader = userAgentHeader;
    this.shippingMethod = shippingMethod;
    this.plannedPurgeDate = plannedPurgeDate;
    this.successUrl = successUrl;
    this.timeZone = timeZone;
    this.spaceViewId = spaceViewId;
    this.userFailureMessage = userFailureMessage;
    this.version = version;
    this.internetProtocolAddressCountry = internetProtocolAddressCountry;
    this.linkedSpaceId = linkedSpaceId;
    this.deliveryDecisionMadeOn = deliveryDecisionMadeOn;
    this.autoConfirmationEnabled = autoConfirmationEnabled;
    this.totalAppliedFees = totalAppliedFees;
    this.failedOn = failedOn;
    this.refundedAmount = refundedAmount;
    this.authorizationAmount = authorizationAmount;
    this.screenWidth = screenWidth;
    this.customerEmailAddress = customerEmailAddress;
    this.windowHeight = windowHeight;
    this.authorizationTimeoutOn = authorizationTimeoutOn;
    this.allowedPaymentMethodBrands = allowedPaymentMethodBrands;
    this.createdOn = createdOn;
    this.metaData = metaData;
    this.emailsDisabled = emailsDisabled;
    this.customerId = customerId;
    this.currency = currency;
    this.merchantReference = merchantReference;
    this.authorizationSalesChannel = authorizationSalesChannel;
    this.yearsToKeep = yearsToKeep;
    this.completedAmount = completedAmount;
    this.screenHeight = screenHeight;
    this.internetProtocolAddress = internetProtocolAddress;
    this.endOfLife = endOfLife;
    this.screenColorDepth = screenColorDepth;
    this.createdBy = createdBy;
    this.completedOn = completedOn;
    this.completionTimeoutOn = completionTimeoutOn;
    this.authorizedOn = authorizedOn;
    this.failedUrl = failedUrl;
  }

  public Transaction parent(Transaction parent) {
    
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Transaction getParent() {
    return parent;
  }


  @JsonProperty(JSON_PROPERTY_PARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParent(Transaction parent) {
    this.parent = parent;
  }

   /**
   * The total amount that was settled, in the transaction&#39;s currency.
   * @return totalSettledAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_SETTLED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTotalSettledAmount() {
    return totalSettledAmount;
  }



   /**
   * Allows to link the transaction to the data collected from the customer&#39;s device.
   * @return deviceSessionIdentifier
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_SESSION_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeviceSessionIdentifier() {
    return deviceSessionIdentifier;
  }



   /**
   * The date and time when the processing of the transaction was started.
   * @return processingOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROCESSING_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getProcessingOn() {
    return processingOn;
  }



   /**
   * The merchant&#39;s reference used to identify the invoice.
   * @return invoiceMerchantReference
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVOICE_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvoiceMerchantReference() {
    return invoiceMerchantReference;
  }



   /**
   * The language that is linked to the object.
   * @return language
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }



   /**
   * The date and time when the transaction was created.
   * @return confirmedOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIRMED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getConfirmedOn() {
    return confirmedOn;
  }



   /**
   * The line items purchased by the customer.
   * @return lineItems
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LineItem> getLineItems() {
    return lineItems;
  }



   /**
   * The &#39;Accept Language&#39; header of the customer&#39;s web browser.
   * @return acceptLanguageHeader
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCEPT_LANGUAGE_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAcceptLanguageHeader() {
    return acceptLanguageHeader;
  }



   /**
   * Whether Java is enabled on the customer&#39;s web browser.
   * @return javaEnabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_JAVA_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getJavaEnabled() {
    return javaEnabled;
  }



   /**
   * The ID of the user the transaction was confirmed by.
   * @return confirmedBy
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIRMED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getConfirmedBy() {
    return confirmedBy;
  }



  public Transaction paymentConnectorConfiguration(PaymentConnectorConfiguration paymentConnectorConfiguration) {
    
    this.paymentConnectorConfiguration = paymentConnectorConfiguration;
    return this;
  }

   /**
   * Get paymentConnectorConfiguration
   * @return paymentConnectorConfiguration
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_CONNECTOR_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentConnectorConfiguration getPaymentConnectorConfiguration() {
    return paymentConnectorConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_CONNECTOR_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentConnectorConfiguration(PaymentConnectorConfiguration paymentConnectorConfiguration) {
    this.paymentConnectorConfiguration = paymentConnectorConfiguration;
  }

   /**
   * A unique identifier for the object.
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }



  public Transaction state(TransactionState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(TransactionState state) {
    this.state = state;
  }

   /**
   * The window width of the customer&#39;s web browser.
   * @return windowWidth
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WINDOW_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWindowWidth() {
    return windowWidth;
  }



   /**
   * The payment method configurations that can be used to authorize the transaction.
   * @return allowedPaymentMethodConfigurations
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getAllowedPaymentMethodConfigurations() {
    return allowedPaymentMethodConfigurations;
  }



  public Transaction group(TransactionGroup group) {
    
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionGroup getGroup() {
    return group;
  }


  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroup(TransactionGroup group) {
    this.group = group;
  }

   /**
   * Whether the customer can make further payment attempts if the first one has failed. Default is true.
   * @return chargeRetryEnabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHARGE_RETRY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getChargeRetryEnabled() {
    return chargeRetryEnabled;
  }



   /**
   * The &#39;Accept&#39; header of the customer&#39;s web browser.
   * @return acceptHeader
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCEPT_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAcceptHeader() {
    return acceptHeader;
  }



   /**
   * The &#39;User Agent&#39; header of the customer&#39;s web browser.
   * @return userAgentHeader
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_AGENT_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserAgentHeader() {
    return userAgentHeader;
  }



   /**
   * The name of the shipping method used to ship the products.
   * @return shippingMethod
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHIPPING_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShippingMethod() {
    return shippingMethod;
  }



   /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }



   /**
   * The URL to redirect the customer back to after they successfully authenticated their payment.
   * @return successUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUCCESS_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSuccessUrl() {
    return successUrl;
  }



   /**
   * The customer&#39;s time zone, which affects how dates and times are formatted when communicating with the customer.
   * @return timeZone
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeZone() {
    return timeZone;
  }



   /**
   * The ID of the space view this object is linked to.
   * @return spaceViewId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPACE_VIEW_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSpaceViewId() {
    return spaceViewId;
  }



   /**
   * The message that can be displayed to the customer explaining why the transaction failed, in the customer&#39;s language.
   * @return userFailureMessage
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_FAILURE_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserFailureMessage() {
    return userFailureMessage;
  }



  public Transaction completionBehavior(TransactionCompletionBehavior completionBehavior) {
    
    this.completionBehavior = completionBehavior;
    return this;
  }

   /**
   * Get completionBehavior
   * @return completionBehavior
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETION_BEHAVIOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionCompletionBehavior getCompletionBehavior() {
    return completionBehavior;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETION_BEHAVIOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompletionBehavior(TransactionCompletionBehavior completionBehavior) {
    this.completionBehavior = completionBehavior;
  }

   /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }



   /**
   * The country determined from the IP address of the customer&#39;s device.
   * @return internetProtocolAddressCountry
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERNET_PROTOCOL_ADDRESS_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInternetProtocolAddressCountry() {
    return internetProtocolAddressCountry;
  }



   /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }



   /**
   * This date and time when the decision was made as to whether the order should be shipped.
   * @return deliveryDecisionMadeOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELIVERY_DECISION_MADE_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDeliveryDecisionMadeOn() {
    return deliveryDecisionMadeOn;
  }



  public Transaction authorizationEnvironment(ChargeAttemptEnvironment authorizationEnvironment) {
    
    this.authorizationEnvironment = authorizationEnvironment;
    return this;
  }

   /**
   * Get authorizationEnvironment
   * @return authorizationEnvironment
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChargeAttemptEnvironment getAuthorizationEnvironment() {
    return authorizationEnvironment;
  }


  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorizationEnvironment(ChargeAttemptEnvironment authorizationEnvironment) {
    this.authorizationEnvironment = authorizationEnvironment;
  }

   /**
   * Whether the transaction can be confirmed automatically or whether this must be done explicitly via the API. Default is true.
   * @return autoConfirmationEnabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_CONFIRMATION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAutoConfirmationEnabled() {
    return autoConfirmationEnabled;
  }



  public Transaction failureReason(FailureReason failureReason) {
    
    this.failureReason = failureReason;
    return this;
  }

   /**
   * Get failureReason
   * @return failureReason
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILURE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FailureReason getFailureReason() {
    return failureReason;
  }


  @JsonProperty(JSON_PROPERTY_FAILURE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailureReason(FailureReason failureReason) {
    this.failureReason = failureReason;
  }

   /**
   * The total of all fees charged, in the transaction&#39;s currency.
   * @return totalAppliedFees
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_APPLIED_FEES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTotalAppliedFees() {
    return totalAppliedFees;
  }



  public Transaction customersPresence(CustomersPresence customersPresence) {
    
    this.customersPresence = customersPresence;
    return this;
  }

   /**
   * Get customersPresence
   * @return customersPresence
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMERS_PRESENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomersPresence getCustomersPresence() {
    return customersPresence;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMERS_PRESENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomersPresence(CustomersPresence customersPresence) {
    this.customersPresence = customersPresence;
  }

   /**
   * The date and time when the transaction failed.
   * @return failedOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getFailedOn() {
    return failedOn;
  }



   /**
   * The total amount that was refunded, in the transaction&#39;s currency.
   * @return refundedAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFUNDED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRefundedAmount() {
    return refundedAmount;
  }



   /**
   * The sum of all line item prices including taxes in the transaction&#39;s currency.
   * @return authorizationAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAuthorizationAmount() {
    return authorizationAmount;
  }



   /**
   * The screen width of the customer&#39;s web browser.
   * @return screenWidth
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCREEN_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScreenWidth() {
    return screenWidth;
  }



  public Transaction environmentSelectionStrategy(TransactionEnvironmentSelectionStrategy environmentSelectionStrategy) {
    
    this.environmentSelectionStrategy = environmentSelectionStrategy;
    return this;
  }

   /**
   * Get environmentSelectionStrategy
   * @return environmentSelectionStrategy
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT_SELECTION_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionEnvironmentSelectionStrategy getEnvironmentSelectionStrategy() {
    return environmentSelectionStrategy;
  }


  @JsonProperty(JSON_PROPERTY_ENVIRONMENT_SELECTION_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnvironmentSelectionStrategy(TransactionEnvironmentSelectionStrategy environmentSelectionStrategy) {
    this.environmentSelectionStrategy = environmentSelectionStrategy;
  }

   /**
   * The customer&#39;s email address.
   * @return customerEmailAddress
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerEmailAddress() {
    return customerEmailAddress;
  }



   /**
   * The window height of the customer&#39;s web browser.
   * @return windowHeight
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WINDOW_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWindowHeight() {
    return windowHeight;
  }



  public Transaction tokenizationMode(TokenizationMode tokenizationMode) {
    
    this.tokenizationMode = tokenizationMode;
    return this;
  }

   /**
   * Get tokenizationMode
   * @return tokenizationMode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKENIZATION_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TokenizationMode getTokenizationMode() {
    return tokenizationMode;
  }


  @JsonProperty(JSON_PROPERTY_TOKENIZATION_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenizationMode(TokenizationMode tokenizationMode) {
    this.tokenizationMode = tokenizationMode;
  }

   /**
   * The date and time when the transaction must be authorized, otherwise it will canceled.
   * @return authorizationTimeoutOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_TIMEOUT_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getAuthorizationTimeoutOn() {
    return authorizationTimeoutOn;
  }



   /**
   * The payment method brands that can be used to authorize the transaction.
   * @return allowedPaymentMethodBrands
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_BRANDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getAllowedPaymentMethodBrands() {
    return allowedPaymentMethodBrands;
  }



   /**
   * The date and time when the object was created.
   * @return createdOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }



   /**
   * Allow to store additional information about the object.
   * @return metaData
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getMetaData() {
    return metaData;
  }



   /**
   * Whether email sending is deactivated for the transaction. Default is false.
   * @return emailsDisabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAILS_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEmailsDisabled() {
    return emailsDisabled;
  }



  public Transaction userInterfaceType(TransactionUserInterfaceType userInterfaceType) {
    
    this.userInterfaceType = userInterfaceType;
    return this;
  }

   /**
   * Get userInterfaceType
   * @return userInterfaceType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_INTERFACE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionUserInterfaceType getUserInterfaceType() {
    return userInterfaceType;
  }


  @JsonProperty(JSON_PROPERTY_USER_INTERFACE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserInterfaceType(TransactionUserInterfaceType userInterfaceType) {
    this.userInterfaceType = userInterfaceType;
  }

   /**
   * The unique identifier of the customer in the external system.
   * @return customerId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerId() {
    return customerId;
  }



   /**
   * The three-letter code (ISO 4217 format) of the transaction&#39;s currency.
   * @return currency
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }



   /**
   * The merchant&#39;s reference used to identify the transaction.
   * @return merchantReference
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantReference() {
    return merchantReference;
  }



   /**
   * The sales channel through which the transaction was placed.
   * @return authorizationSalesChannel
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_SALES_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAuthorizationSalesChannel() {
    return authorizationSalesChannel;
  }



   /**
   * The number of years the transaction is kept after its authorization.
   * @return yearsToKeep
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_YEARS_TO_KEEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getYearsToKeep() {
    return yearsToKeep;
  }



   /**
   * The total amount that was completed, in the transaction&#39;s currency.
   * @return completedAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCompletedAmount() {
    return completedAmount;
  }



   /**
   * The screen height of the customer&#39;s web browser.
   * @return screenHeight
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCREEN_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScreenHeight() {
    return screenHeight;
  }



   /**
   * The IP address of the customer&#39;s device.
   * @return internetProtocolAddress
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERNET_PROTOCOL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInternetProtocolAddress() {
    return internetProtocolAddress;
  }



  public Transaction terminal(PaymentTerminal terminal) {
    
    this.terminal = terminal;
    return this;
  }

   /**
   * Get terminal
   * @return terminal
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TERMINAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentTerminal getTerminal() {
    return terminal;
  }


  @JsonProperty(JSON_PROPERTY_TERMINAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTerminal(PaymentTerminal terminal) {
    this.terminal = terminal;
  }

   /**
   * The date and time when the transaction reaches its end of live. No further actions can be carried out at this time.
   * @return endOfLife
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_OF_LIFE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndOfLife() {
    return endOfLife;
  }



  public Transaction token(Token token) {
    
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Token getToken() {
    return token;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToken(Token token) {
    this.token = token;
  }

  public Transaction environment(Environment environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Environment getEnvironment() {
    return environment;
  }


  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnvironment(Environment environment) {
    this.environment = environment;
  }

   /**
   * The screen color depth of the customer&#39;s web browser.
   * @return screenColorDepth
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCREEN_COLOR_DEPTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScreenColorDepth() {
    return screenColorDepth;
  }



   /**
   * The ID of the user the transaction was created by.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreatedBy() {
    return createdBy;
  }



   /**
   * The date and time when the transaction was completed.
   * @return completedOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCompletedOn() {
    return completedOn;
  }



   /**
   * The date and time when the transaction is completed automatically.
   * @return completionTimeoutOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETION_TIMEOUT_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCompletionTimeoutOn() {
    return completionTimeoutOn;
  }



  public Transaction shippingAddress(Address shippingAddress) {
    
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHIPPING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Address getShippingAddress() {
    return shippingAddress;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public Transaction billingAddress(Address billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Address getBillingAddress() {
    return billingAddress;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
  }

   /**
   * The date and time when the transaction was authorized.
   * @return authorizedOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHORIZED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getAuthorizedOn() {
    return authorizedOn;
  }



   /**
   * The URL to redirect the customer back to after they canceled or failed to authenticated their payment.
   * @return failedUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILED_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFailedUrl() {
    return failedUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.parent, transaction.parent) &&
        Objects.equals(this.totalSettledAmount, transaction.totalSettledAmount) &&
        Objects.equals(this.deviceSessionIdentifier, transaction.deviceSessionIdentifier) &&
        Objects.equals(this.processingOn, transaction.processingOn) &&
        Objects.equals(this.invoiceMerchantReference, transaction.invoiceMerchantReference) &&
        Objects.equals(this.language, transaction.language) &&
        Objects.equals(this.confirmedOn, transaction.confirmedOn) &&
        Objects.equals(this.lineItems, transaction.lineItems) &&
        Objects.equals(this.acceptLanguageHeader, transaction.acceptLanguageHeader) &&
        Objects.equals(this.javaEnabled, transaction.javaEnabled) &&
        Objects.equals(this.confirmedBy, transaction.confirmedBy) &&
        Objects.equals(this.paymentConnectorConfiguration, transaction.paymentConnectorConfiguration) &&
        Objects.equals(this.id, transaction.id) &&
        Objects.equals(this.state, transaction.state) &&
        Objects.equals(this.windowWidth, transaction.windowWidth) &&
        Objects.equals(this.allowedPaymentMethodConfigurations, transaction.allowedPaymentMethodConfigurations) &&
        Objects.equals(this.group, transaction.group) &&
        Objects.equals(this.chargeRetryEnabled, transaction.chargeRetryEnabled) &&
        Objects.equals(this.acceptHeader, transaction.acceptHeader) &&
        Objects.equals(this.userAgentHeader, transaction.userAgentHeader) &&
        Objects.equals(this.shippingMethod, transaction.shippingMethod) &&
        Objects.equals(this.plannedPurgeDate, transaction.plannedPurgeDate) &&
        Objects.equals(this.successUrl, transaction.successUrl) &&
        Objects.equals(this.timeZone, transaction.timeZone) &&
        Objects.equals(this.spaceViewId, transaction.spaceViewId) &&
        Objects.equals(this.userFailureMessage, transaction.userFailureMessage) &&
        Objects.equals(this.completionBehavior, transaction.completionBehavior) &&
        Objects.equals(this.version, transaction.version) &&
        Objects.equals(this.internetProtocolAddressCountry, transaction.internetProtocolAddressCountry) &&
        Objects.equals(this.linkedSpaceId, transaction.linkedSpaceId) &&
        Objects.equals(this.deliveryDecisionMadeOn, transaction.deliveryDecisionMadeOn) &&
        Objects.equals(this.authorizationEnvironment, transaction.authorizationEnvironment) &&
        Objects.equals(this.autoConfirmationEnabled, transaction.autoConfirmationEnabled) &&
        Objects.equals(this.failureReason, transaction.failureReason) &&
        Objects.equals(this.totalAppliedFees, transaction.totalAppliedFees) &&
        Objects.equals(this.customersPresence, transaction.customersPresence) &&
        Objects.equals(this.failedOn, transaction.failedOn) &&
        Objects.equals(this.refundedAmount, transaction.refundedAmount) &&
        Objects.equals(this.authorizationAmount, transaction.authorizationAmount) &&
        Objects.equals(this.screenWidth, transaction.screenWidth) &&
        Objects.equals(this.environmentSelectionStrategy, transaction.environmentSelectionStrategy) &&
        Objects.equals(this.customerEmailAddress, transaction.customerEmailAddress) &&
        Objects.equals(this.windowHeight, transaction.windowHeight) &&
        Objects.equals(this.tokenizationMode, transaction.tokenizationMode) &&
        Objects.equals(this.authorizationTimeoutOn, transaction.authorizationTimeoutOn) &&
        Objects.equals(this.allowedPaymentMethodBrands, transaction.allowedPaymentMethodBrands) &&
        Objects.equals(this.createdOn, transaction.createdOn) &&
        Objects.equals(this.metaData, transaction.metaData) &&
        Objects.equals(this.emailsDisabled, transaction.emailsDisabled) &&
        Objects.equals(this.userInterfaceType, transaction.userInterfaceType) &&
        Objects.equals(this.customerId, transaction.customerId) &&
        Objects.equals(this.currency, transaction.currency) &&
        Objects.equals(this.merchantReference, transaction.merchantReference) &&
        Objects.equals(this.authorizationSalesChannel, transaction.authorizationSalesChannel) &&
        Objects.equals(this.yearsToKeep, transaction.yearsToKeep) &&
        Objects.equals(this.completedAmount, transaction.completedAmount) &&
        Objects.equals(this.screenHeight, transaction.screenHeight) &&
        Objects.equals(this.internetProtocolAddress, transaction.internetProtocolAddress) &&
        Objects.equals(this.terminal, transaction.terminal) &&
        Objects.equals(this.endOfLife, transaction.endOfLife) &&
        Objects.equals(this.token, transaction.token) &&
        Objects.equals(this.environment, transaction.environment) &&
        Objects.equals(this.screenColorDepth, transaction.screenColorDepth) &&
        Objects.equals(this.createdBy, transaction.createdBy) &&
        Objects.equals(this.completedOn, transaction.completedOn) &&
        Objects.equals(this.completionTimeoutOn, transaction.completionTimeoutOn) &&
        Objects.equals(this.shippingAddress, transaction.shippingAddress) &&
        Objects.equals(this.billingAddress, transaction.billingAddress) &&
        Objects.equals(this.authorizedOn, transaction.authorizedOn) &&
        Objects.equals(this.failedUrl, transaction.failedUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, totalSettledAmount, deviceSessionIdentifier, processingOn, invoiceMerchantReference, language, confirmedOn, lineItems, acceptLanguageHeader, javaEnabled, confirmedBy, paymentConnectorConfiguration, id, state, windowWidth, allowedPaymentMethodConfigurations, group, chargeRetryEnabled, acceptHeader, userAgentHeader, shippingMethod, plannedPurgeDate, successUrl, timeZone, spaceViewId, userFailureMessage, completionBehavior, version, internetProtocolAddressCountry, linkedSpaceId, deliveryDecisionMadeOn, authorizationEnvironment, autoConfirmationEnabled, failureReason, totalAppliedFees, customersPresence, failedOn, refundedAmount, authorizationAmount, screenWidth, environmentSelectionStrategy, customerEmailAddress, windowHeight, tokenizationMode, authorizationTimeoutOn, allowedPaymentMethodBrands, createdOn, metaData, emailsDisabled, userInterfaceType, customerId, currency, merchantReference, authorizationSalesChannel, yearsToKeep, completedAmount, screenHeight, internetProtocolAddress, terminal, endOfLife, token, environment, screenColorDepth, createdBy, completedOn, completionTimeoutOn, shippingAddress, billingAddress, authorizedOn, failedUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    totalSettledAmount: ").append(toIndentedString(totalSettledAmount)).append("\n");
    sb.append("    deviceSessionIdentifier: ").append(toIndentedString(deviceSessionIdentifier)).append("\n");
    sb.append("    processingOn: ").append(toIndentedString(processingOn)).append("\n");
    sb.append("    invoiceMerchantReference: ").append(toIndentedString(invoiceMerchantReference)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    confirmedOn: ").append(toIndentedString(confirmedOn)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    acceptLanguageHeader: ").append(toIndentedString(acceptLanguageHeader)).append("\n");
    sb.append("    javaEnabled: ").append(toIndentedString(javaEnabled)).append("\n");
    sb.append("    confirmedBy: ").append(toIndentedString(confirmedBy)).append("\n");
    sb.append("    paymentConnectorConfiguration: ").append(toIndentedString(paymentConnectorConfiguration)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    windowWidth: ").append(toIndentedString(windowWidth)).append("\n");
    sb.append("    allowedPaymentMethodConfigurations: ").append(toIndentedString(allowedPaymentMethodConfigurations)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    chargeRetryEnabled: ").append(toIndentedString(chargeRetryEnabled)).append("\n");
    sb.append("    acceptHeader: ").append(toIndentedString(acceptHeader)).append("\n");
    sb.append("    userAgentHeader: ").append(toIndentedString(userAgentHeader)).append("\n");
    sb.append("    shippingMethod: ").append(toIndentedString(shippingMethod)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    successUrl: ").append(toIndentedString(successUrl)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
    sb.append("    userFailureMessage: ").append(toIndentedString(userFailureMessage)).append("\n");
    sb.append("    completionBehavior: ").append(toIndentedString(completionBehavior)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    internetProtocolAddressCountry: ").append(toIndentedString(internetProtocolAddressCountry)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    deliveryDecisionMadeOn: ").append(toIndentedString(deliveryDecisionMadeOn)).append("\n");
    sb.append("    authorizationEnvironment: ").append(toIndentedString(authorizationEnvironment)).append("\n");
    sb.append("    autoConfirmationEnabled: ").append(toIndentedString(autoConfirmationEnabled)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    totalAppliedFees: ").append(toIndentedString(totalAppliedFees)).append("\n");
    sb.append("    customersPresence: ").append(toIndentedString(customersPresence)).append("\n");
    sb.append("    failedOn: ").append(toIndentedString(failedOn)).append("\n");
    sb.append("    refundedAmount: ").append(toIndentedString(refundedAmount)).append("\n");
    sb.append("    authorizationAmount: ").append(toIndentedString(authorizationAmount)).append("\n");
    sb.append("    screenWidth: ").append(toIndentedString(screenWidth)).append("\n");
    sb.append("    environmentSelectionStrategy: ").append(toIndentedString(environmentSelectionStrategy)).append("\n");
    sb.append("    customerEmailAddress: ").append(toIndentedString(customerEmailAddress)).append("\n");
    sb.append("    windowHeight: ").append(toIndentedString(windowHeight)).append("\n");
    sb.append("    tokenizationMode: ").append(toIndentedString(tokenizationMode)).append("\n");
    sb.append("    authorizationTimeoutOn: ").append(toIndentedString(authorizationTimeoutOn)).append("\n");
    sb.append("    allowedPaymentMethodBrands: ").append(toIndentedString(allowedPaymentMethodBrands)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    emailsDisabled: ").append(toIndentedString(emailsDisabled)).append("\n");
    sb.append("    userInterfaceType: ").append(toIndentedString(userInterfaceType)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
    sb.append("    authorizationSalesChannel: ").append(toIndentedString(authorizationSalesChannel)).append("\n");
    sb.append("    yearsToKeep: ").append(toIndentedString(yearsToKeep)).append("\n");
    sb.append("    completedAmount: ").append(toIndentedString(completedAmount)).append("\n");
    sb.append("    screenHeight: ").append(toIndentedString(screenHeight)).append("\n");
    sb.append("    internetProtocolAddress: ").append(toIndentedString(internetProtocolAddress)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    endOfLife: ").append(toIndentedString(endOfLife)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    screenColorDepth: ").append(toIndentedString(screenColorDepth)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    completedOn: ").append(toIndentedString(completedOn)).append("\n");
    sb.append("    completionTimeoutOn: ").append(toIndentedString(completionTimeoutOn)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    authorizedOn: ").append(toIndentedString(authorizedOn)).append("\n");
    sb.append("    failedUrl: ").append(toIndentedString(failedUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `parent` to the URL query string
    if (getParent() != null) {
      joiner.add(getParent().toUrlQueryString(prefix + "parent" + suffix));
    }

    // add `totalSettledAmount` to the URL query string
    if (getTotalSettledAmount() != null) {
      try {
        joiner.add(String.format("%stotalSettledAmount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalSettledAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `deviceSessionIdentifier` to the URL query string
    if (getDeviceSessionIdentifier() != null) {
      try {
        joiner.add(String.format("%sdeviceSessionIdentifier%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDeviceSessionIdentifier()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `processingOn` to the URL query string
    if (getProcessingOn() != null) {
      try {
        joiner.add(String.format("%sprocessingOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProcessingOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `invoiceMerchantReference` to the URL query string
    if (getInvoiceMerchantReference() != null) {
      try {
        joiner.add(String.format("%sinvoiceMerchantReference%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInvoiceMerchantReference()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `language` to the URL query string
    if (getLanguage() != null) {
      try {
        joiner.add(String.format("%slanguage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLanguage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `confirmedOn` to the URL query string
    if (getConfirmedOn() != null) {
      try {
        joiner.add(String.format("%sconfirmedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConfirmedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `lineItems` to the URL query string
    if (getLineItems() != null) {
      for (int i = 0; i < getLineItems().size(); i++) {
        if (getLineItems().get(i) != null) {
          joiner.add(getLineItems().get(i).toUrlQueryString(String.format("%slineItems%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `acceptLanguageHeader` to the URL query string
    if (getAcceptLanguageHeader() != null) {
      try {
        joiner.add(String.format("%sacceptLanguageHeader%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAcceptLanguageHeader()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `javaEnabled` to the URL query string
    if (getJavaEnabled() != null) {
      try {
        joiner.add(String.format("%sjavaEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getJavaEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `confirmedBy` to the URL query string
    if (getConfirmedBy() != null) {
      try {
        joiner.add(String.format("%sconfirmedBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConfirmedBy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `paymentConnectorConfiguration` to the URL query string
    if (getPaymentConnectorConfiguration() != null) {
      joiner.add(getPaymentConnectorConfiguration().toUrlQueryString(prefix + "paymentConnectorConfiguration" + suffix));
    }

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `state` to the URL query string
    if (getState() != null) {
      try {
        joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `windowWidth` to the URL query string
    if (getWindowWidth() != null) {
      try {
        joiner.add(String.format("%swindowWidth%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWindowWidth()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `allowedPaymentMethodConfigurations` to the URL query string
    if (getAllowedPaymentMethodConfigurations() != null) {
      for (int i = 0; i < getAllowedPaymentMethodConfigurations().size(); i++) {
        try {
          joiner.add(String.format("%sallowedPaymentMethodConfigurations%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getAllowedPaymentMethodConfigurations().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `group` to the URL query string
    if (getGroup() != null) {
      joiner.add(getGroup().toUrlQueryString(prefix + "group" + suffix));
    }

    // add `chargeRetryEnabled` to the URL query string
    if (getChargeRetryEnabled() != null) {
      try {
        joiner.add(String.format("%schargeRetryEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getChargeRetryEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `acceptHeader` to the URL query string
    if (getAcceptHeader() != null) {
      try {
        joiner.add(String.format("%sacceptHeader%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAcceptHeader()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `userAgentHeader` to the URL query string
    if (getUserAgentHeader() != null) {
      try {
        joiner.add(String.format("%suserAgentHeader%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserAgentHeader()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `shippingMethod` to the URL query string
    if (getShippingMethod() != null) {
      try {
        joiner.add(String.format("%sshippingMethod%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getShippingMethod()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `plannedPurgeDate` to the URL query string
    if (getPlannedPurgeDate() != null) {
      try {
        joiner.add(String.format("%splannedPurgeDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlannedPurgeDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `successUrl` to the URL query string
    if (getSuccessUrl() != null) {
      try {
        joiner.add(String.format("%ssuccessUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSuccessUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `timeZone` to the URL query string
    if (getTimeZone() != null) {
      try {
        joiner.add(String.format("%stimeZone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimeZone()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `spaceViewId` to the URL query string
    if (getSpaceViewId() != null) {
      try {
        joiner.add(String.format("%sspaceViewId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSpaceViewId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `userFailureMessage` to the URL query string
    if (getUserFailureMessage() != null) {
      try {
        joiner.add(String.format("%suserFailureMessage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserFailureMessage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `completionBehavior` to the URL query string
    if (getCompletionBehavior() != null) {
      try {
        joiner.add(String.format("%scompletionBehavior%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCompletionBehavior()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `internetProtocolAddressCountry` to the URL query string
    if (getInternetProtocolAddressCountry() != null) {
      try {
        joiner.add(String.format("%sinternetProtocolAddressCountry%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInternetProtocolAddressCountry()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `linkedSpaceId` to the URL query string
    if (getLinkedSpaceId() != null) {
      try {
        joiner.add(String.format("%slinkedSpaceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedSpaceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `deliveryDecisionMadeOn` to the URL query string
    if (getDeliveryDecisionMadeOn() != null) {
      try {
        joiner.add(String.format("%sdeliveryDecisionMadeOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDeliveryDecisionMadeOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `authorizationEnvironment` to the URL query string
    if (getAuthorizationEnvironment() != null) {
      try {
        joiner.add(String.format("%sauthorizationEnvironment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthorizationEnvironment()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `autoConfirmationEnabled` to the URL query string
    if (getAutoConfirmationEnabled() != null) {
      try {
        joiner.add(String.format("%sautoConfirmationEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAutoConfirmationEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `failureReason` to the URL query string
    if (getFailureReason() != null) {
      joiner.add(getFailureReason().toUrlQueryString(prefix + "failureReason" + suffix));
    }

    // add `totalAppliedFees` to the URL query string
    if (getTotalAppliedFees() != null) {
      try {
        joiner.add(String.format("%stotalAppliedFees%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalAppliedFees()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `customersPresence` to the URL query string
    if (getCustomersPresence() != null) {
      try {
        joiner.add(String.format("%scustomersPresence%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustomersPresence()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `failedOn` to the URL query string
    if (getFailedOn() != null) {
      try {
        joiner.add(String.format("%sfailedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFailedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `refundedAmount` to the URL query string
    if (getRefundedAmount() != null) {
      try {
        joiner.add(String.format("%srefundedAmount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRefundedAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `authorizationAmount` to the URL query string
    if (getAuthorizationAmount() != null) {
      try {
        joiner.add(String.format("%sauthorizationAmount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthorizationAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `screenWidth` to the URL query string
    if (getScreenWidth() != null) {
      try {
        joiner.add(String.format("%sscreenWidth%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getScreenWidth()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `environmentSelectionStrategy` to the URL query string
    if (getEnvironmentSelectionStrategy() != null) {
      try {
        joiner.add(String.format("%senvironmentSelectionStrategy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnvironmentSelectionStrategy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `customerEmailAddress` to the URL query string
    if (getCustomerEmailAddress() != null) {
      try {
        joiner.add(String.format("%scustomerEmailAddress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustomerEmailAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `windowHeight` to the URL query string
    if (getWindowHeight() != null) {
      try {
        joiner.add(String.format("%swindowHeight%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWindowHeight()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `tokenizationMode` to the URL query string
    if (getTokenizationMode() != null) {
      try {
        joiner.add(String.format("%stokenizationMode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTokenizationMode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `authorizationTimeoutOn` to the URL query string
    if (getAuthorizationTimeoutOn() != null) {
      try {
        joiner.add(String.format("%sauthorizationTimeoutOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthorizationTimeoutOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `allowedPaymentMethodBrands` to the URL query string
    if (getAllowedPaymentMethodBrands() != null) {
      for (int i = 0; i < getAllowedPaymentMethodBrands().size(); i++) {
        try {
          joiner.add(String.format("%sallowedPaymentMethodBrands%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getAllowedPaymentMethodBrands().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `createdOn` to the URL query string
    if (getCreatedOn() != null) {
      try {
        joiner.add(String.format("%screatedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `metaData` to the URL query string
    if (getMetaData() != null) {
      for (String _key : getMetaData().keySet()) {
        try {
          joiner.add(String.format("%smetaData%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getMetaData().get(_key), URLEncoder.encode(String.valueOf(getMetaData().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `emailsDisabled` to the URL query string
    if (getEmailsDisabled() != null) {
      try {
        joiner.add(String.format("%semailsDisabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmailsDisabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `userInterfaceType` to the URL query string
    if (getUserInterfaceType() != null) {
      try {
        joiner.add(String.format("%suserInterfaceType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUserInterfaceType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `customerId` to the URL query string
    if (getCustomerId() != null) {
      try {
        joiner.add(String.format("%scustomerId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustomerId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      try {
        joiner.add(String.format("%scurrency%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCurrency()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `merchantReference` to the URL query string
    if (getMerchantReference() != null) {
      try {
        joiner.add(String.format("%smerchantReference%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMerchantReference()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `authorizationSalesChannel` to the URL query string
    if (getAuthorizationSalesChannel() != null) {
      try {
        joiner.add(String.format("%sauthorizationSalesChannel%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthorizationSalesChannel()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `yearsToKeep` to the URL query string
    if (getYearsToKeep() != null) {
      try {
        joiner.add(String.format("%syearsToKeep%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getYearsToKeep()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `completedAmount` to the URL query string
    if (getCompletedAmount() != null) {
      try {
        joiner.add(String.format("%scompletedAmount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCompletedAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `screenHeight` to the URL query string
    if (getScreenHeight() != null) {
      try {
        joiner.add(String.format("%sscreenHeight%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getScreenHeight()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `internetProtocolAddress` to the URL query string
    if (getInternetProtocolAddress() != null) {
      try {
        joiner.add(String.format("%sinternetProtocolAddress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInternetProtocolAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `terminal` to the URL query string
    if (getTerminal() != null) {
      joiner.add(getTerminal().toUrlQueryString(prefix + "terminal" + suffix));
    }

    // add `endOfLife` to the URL query string
    if (getEndOfLife() != null) {
      try {
        joiner.add(String.format("%sendOfLife%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEndOfLife()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `token` to the URL query string
    if (getToken() != null) {
      joiner.add(getToken().toUrlQueryString(prefix + "token" + suffix));
    }

    // add `environment` to the URL query string
    if (getEnvironment() != null) {
      try {
        joiner.add(String.format("%senvironment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnvironment()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `screenColorDepth` to the URL query string
    if (getScreenColorDepth() != null) {
      try {
        joiner.add(String.format("%sscreenColorDepth%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getScreenColorDepth()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createdBy` to the URL query string
    if (getCreatedBy() != null) {
      try {
        joiner.add(String.format("%screatedBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedBy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `completedOn` to the URL query string
    if (getCompletedOn() != null) {
      try {
        joiner.add(String.format("%scompletedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCompletedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `completionTimeoutOn` to the URL query string
    if (getCompletionTimeoutOn() != null) {
      try {
        joiner.add(String.format("%scompletionTimeoutOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCompletionTimeoutOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `shippingAddress` to the URL query string
    if (getShippingAddress() != null) {
      joiner.add(getShippingAddress().toUrlQueryString(prefix + "shippingAddress" + suffix));
    }

    // add `billingAddress` to the URL query string
    if (getBillingAddress() != null) {
      joiner.add(getBillingAddress().toUrlQueryString(prefix + "billingAddress" + suffix));
    }

    // add `authorizedOn` to the URL query string
    if (getAuthorizedOn() != null) {
      try {
        joiner.add(String.format("%sauthorizedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthorizedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `failedUrl` to the URL query string
    if (getFailedUrl() != null) {
      try {
        joiner.add(String.format("%sfailedUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFailedUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

