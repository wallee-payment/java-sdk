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
import com.wallee.sdk.model.AddressCreate;
import com.wallee.sdk.model.CustomersPresence;
import com.wallee.sdk.model.Environment;
import com.wallee.sdk.model.LineItemCreate;
import com.wallee.sdk.model.TokenizationMode;
import com.wallee.sdk.model.TransactionCompletionBehavior;
import com.wallee.sdk.model.TransactionEnvironmentSelectionStrategy;
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
 * TransactionCreate
 */
@JsonPropertyOrder({
  TransactionCreate.JSON_PROPERTY_CUSTOMER_EMAIL_ADDRESS,
  TransactionCreate.JSON_PROPERTY_SHIPPING_METHOD,
  TransactionCreate.JSON_PROPERTY_INVOICE_MERCHANT_REFERENCE,
  TransactionCreate.JSON_PROPERTY_SUCCESS_URL,
  TransactionCreate.JSON_PROPERTY_TIME_ZONE,
  TransactionCreate.JSON_PROPERTY_LANGUAGE,
  TransactionCreate.JSON_PROPERTY_TOKENIZATION_MODE,
  TransactionCreate.JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_BRANDS,
  TransactionCreate.JSON_PROPERTY_COMPLETION_BEHAVIOR,
  TransactionCreate.JSON_PROPERTY_TOKEN,
  TransactionCreate.JSON_PROPERTY_LINE_ITEMS,
  TransactionCreate.JSON_PROPERTY_META_DATA,
  TransactionCreate.JSON_PROPERTY_CUSTOMER_ID,
  TransactionCreate.JSON_PROPERTY_SHIPPING_ADDRESS,
  TransactionCreate.JSON_PROPERTY_CURRENCY,
  TransactionCreate.JSON_PROPERTY_BILLING_ADDRESS,
  TransactionCreate.JSON_PROPERTY_MERCHANT_REFERENCE,
  TransactionCreate.JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_CONFIGURATIONS,
  TransactionCreate.JSON_PROPERTY_FAILED_URL,
  TransactionCreate.JSON_PROPERTY_CHARGE_RETRY_ENABLED,
  TransactionCreate.JSON_PROPERTY_EMAILS_DISABLED,
  TransactionCreate.JSON_PROPERTY_ENVIRONMENT,
  TransactionCreate.JSON_PROPERTY_ENVIRONMENT_SELECTION_STRATEGY,
  TransactionCreate.JSON_PROPERTY_DEVICE_SESSION_IDENTIFIER,
  TransactionCreate.JSON_PROPERTY_AUTO_CONFIRMATION_ENABLED,
  TransactionCreate.JSON_PROPERTY_SPACE_VIEW_ID,
  TransactionCreate.JSON_PROPERTY_CUSTOMERS_PRESENCE
})
@JsonTypeName("Transaction.Create")

public class TransactionCreate {
  public static final String JSON_PROPERTY_CUSTOMER_EMAIL_ADDRESS = "customerEmailAddress";
  private String customerEmailAddress;

  public static final String JSON_PROPERTY_SHIPPING_METHOD = "shippingMethod";
  private String shippingMethod;

  public static final String JSON_PROPERTY_INVOICE_MERCHANT_REFERENCE = "invoiceMerchantReference";
  private String invoiceMerchantReference;

  public static final String JSON_PROPERTY_SUCCESS_URL = "successUrl";
  private String successUrl;

  public static final String JSON_PROPERTY_TIME_ZONE = "timeZone";
  private String timeZone;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_TOKENIZATION_MODE = "tokenizationMode";
  private TokenizationMode tokenizationMode;

  public static final String JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_BRANDS = "allowedPaymentMethodBrands";
  private List<Long> allowedPaymentMethodBrands = new ArrayList<>();

  public static final String JSON_PROPERTY_COMPLETION_BEHAVIOR = "completionBehavior";
  private TransactionCompletionBehavior completionBehavior;

  public static final String JSON_PROPERTY_TOKEN = "token";
  private Long token;

  public static final String JSON_PROPERTY_LINE_ITEMS = "lineItems";
  private List<LineItemCreate> lineItems = new ArrayList<>();

  public static final String JSON_PROPERTY_META_DATA = "metaData";
  private Map<String, String> metaData = new HashMap<>();

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  private String customerId;

  public static final String JSON_PROPERTY_SHIPPING_ADDRESS = "shippingAddress";
  private AddressCreate shippingAddress;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_BILLING_ADDRESS = "billingAddress";
  private AddressCreate billingAddress;

  public static final String JSON_PROPERTY_MERCHANT_REFERENCE = "merchantReference";
  private String merchantReference;

  public static final String JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_CONFIGURATIONS = "allowedPaymentMethodConfigurations";
  private List<Long> allowedPaymentMethodConfigurations = new ArrayList<>();

  public static final String JSON_PROPERTY_FAILED_URL = "failedUrl";
  private String failedUrl;

  public static final String JSON_PROPERTY_CHARGE_RETRY_ENABLED = "chargeRetryEnabled";
  private Boolean chargeRetryEnabled;

  public static final String JSON_PROPERTY_EMAILS_DISABLED = "emailsDisabled";
  private Boolean emailsDisabled;

  public static final String JSON_PROPERTY_ENVIRONMENT = "environment";
  private Environment environment;

  public static final String JSON_PROPERTY_ENVIRONMENT_SELECTION_STRATEGY = "environmentSelectionStrategy";
  private TransactionEnvironmentSelectionStrategy environmentSelectionStrategy;

  public static final String JSON_PROPERTY_DEVICE_SESSION_IDENTIFIER = "deviceSessionIdentifier";
  private String deviceSessionIdentifier;

  public static final String JSON_PROPERTY_AUTO_CONFIRMATION_ENABLED = "autoConfirmationEnabled";
  private Boolean autoConfirmationEnabled;

  public static final String JSON_PROPERTY_SPACE_VIEW_ID = "spaceViewId";
  private Long spaceViewId;

  public static final String JSON_PROPERTY_CUSTOMERS_PRESENCE = "customersPresence";
  private CustomersPresence customersPresence;

  public TransactionCreate() {
  }

  public TransactionCreate customerEmailAddress(String customerEmailAddress) {
    
    this.customerEmailAddress = customerEmailAddress;
    return this;
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


  @JsonProperty(JSON_PROPERTY_CUSTOMER_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerEmailAddress(String customerEmailAddress) {
    this.customerEmailAddress = customerEmailAddress;
  }

  public TransactionCreate shippingMethod(String shippingMethod) {
    
    this.shippingMethod = shippingMethod;
    return this;
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


  @JsonProperty(JSON_PROPERTY_SHIPPING_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingMethod(String shippingMethod) {
    this.shippingMethod = shippingMethod;
  }

  public TransactionCreate invoiceMerchantReference(String invoiceMerchantReference) {
    
    this.invoiceMerchantReference = invoiceMerchantReference;
    return this;
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


  @JsonProperty(JSON_PROPERTY_INVOICE_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvoiceMerchantReference(String invoiceMerchantReference) {
    this.invoiceMerchantReference = invoiceMerchantReference;
  }

  public TransactionCreate successUrl(String successUrl) {
    
    this.successUrl = successUrl;
    return this;
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


  @JsonProperty(JSON_PROPERTY_SUCCESS_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccessUrl(String successUrl) {
    this.successUrl = successUrl;
  }

  public TransactionCreate timeZone(String timeZone) {
    
    this.timeZone = timeZone;
    return this;
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


  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public TransactionCreate language(String language) {
    
    this.language = language;
    return this;
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


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(String language) {
    this.language = language;
  }

  public TransactionCreate tokenizationMode(TokenizationMode tokenizationMode) {
    
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

  public TransactionCreate allowedPaymentMethodBrands(List<Long> allowedPaymentMethodBrands) {
    
    this.allowedPaymentMethodBrands = allowedPaymentMethodBrands;
    return this;
  }

  public TransactionCreate addAllowedPaymentMethodBrandsItem(Long allowedPaymentMethodBrandsItem) {
    if (this.allowedPaymentMethodBrands == null) {
      this.allowedPaymentMethodBrands = new ArrayList<>();
    }
    this.allowedPaymentMethodBrands.add(allowedPaymentMethodBrandsItem);
    return this;
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


  @JsonProperty(JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_BRANDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedPaymentMethodBrands(List<Long> allowedPaymentMethodBrands) {
    this.allowedPaymentMethodBrands = allowedPaymentMethodBrands;
  }

  public TransactionCreate completionBehavior(TransactionCompletionBehavior completionBehavior) {
    
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

  public TransactionCreate token(Long token) {
    
    this.token = token;
    return this;
  }

   /**
   * The payment token that should be used to charge the customer.
   * @return token
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getToken() {
    return token;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToken(Long token) {
    this.token = token;
  }

  public TransactionCreate lineItems(List<LineItemCreate> lineItems) {
    
    this.lineItems = lineItems;
    return this;
  }

  public TransactionCreate addLineItemsItem(LineItemCreate lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * The line items purchased by the customer.
   * @return lineItems
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<LineItemCreate> getLineItems() {
    return lineItems;
  }


  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLineItems(List<LineItemCreate> lineItems) {
    this.lineItems = lineItems;
  }

  public TransactionCreate metaData(Map<String, String> metaData) {
    
    this.metaData = metaData;
    return this;
  }

  public TransactionCreate putMetaDataItem(String key, String metaDataItem) {
    if (this.metaData == null) {
      this.metaData = new HashMap<>();
    }
    this.metaData.put(key, metaDataItem);
    return this;
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


  @JsonProperty(JSON_PROPERTY_META_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetaData(Map<String, String> metaData) {
    this.metaData = metaData;
  }

  public TransactionCreate customerId(String customerId) {
    
    this.customerId = customerId;
    return this;
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


  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public TransactionCreate shippingAddress(AddressCreate shippingAddress) {
    
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

  public AddressCreate getShippingAddress() {
    return shippingAddress;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingAddress(AddressCreate shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public TransactionCreate currency(String currency) {
    
    this.currency = currency;
    return this;
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


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public TransactionCreate billingAddress(AddressCreate billingAddress) {
    
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

  public AddressCreate getBillingAddress() {
    return billingAddress;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingAddress(AddressCreate billingAddress) {
    this.billingAddress = billingAddress;
  }

  public TransactionCreate merchantReference(String merchantReference) {
    
    this.merchantReference = merchantReference;
    return this;
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


  @JsonProperty(JSON_PROPERTY_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
  }

  public TransactionCreate allowedPaymentMethodConfigurations(List<Long> allowedPaymentMethodConfigurations) {
    
    this.allowedPaymentMethodConfigurations = allowedPaymentMethodConfigurations;
    return this;
  }

  public TransactionCreate addAllowedPaymentMethodConfigurationsItem(Long allowedPaymentMethodConfigurationsItem) {
    if (this.allowedPaymentMethodConfigurations == null) {
      this.allowedPaymentMethodConfigurations = new ArrayList<>();
    }
    this.allowedPaymentMethodConfigurations.add(allowedPaymentMethodConfigurationsItem);
    return this;
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


  @JsonProperty(JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedPaymentMethodConfigurations(List<Long> allowedPaymentMethodConfigurations) {
    this.allowedPaymentMethodConfigurations = allowedPaymentMethodConfigurations;
  }

  public TransactionCreate failedUrl(String failedUrl) {
    
    this.failedUrl = failedUrl;
    return this;
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


  @JsonProperty(JSON_PROPERTY_FAILED_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailedUrl(String failedUrl) {
    this.failedUrl = failedUrl;
  }

  public TransactionCreate chargeRetryEnabled(Boolean chargeRetryEnabled) {
    
    this.chargeRetryEnabled = chargeRetryEnabled;
    return this;
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


  @JsonProperty(JSON_PROPERTY_CHARGE_RETRY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChargeRetryEnabled(Boolean chargeRetryEnabled) {
    this.chargeRetryEnabled = chargeRetryEnabled;
  }

  public TransactionCreate emailsDisabled(Boolean emailsDisabled) {
    
    this.emailsDisabled = emailsDisabled;
    return this;
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


  @JsonProperty(JSON_PROPERTY_EMAILS_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailsDisabled(Boolean emailsDisabled) {
    this.emailsDisabled = emailsDisabled;
  }

  public TransactionCreate environment(Environment environment) {
    
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

  public TransactionCreate environmentSelectionStrategy(TransactionEnvironmentSelectionStrategy environmentSelectionStrategy) {
    
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

  public TransactionCreate deviceSessionIdentifier(String deviceSessionIdentifier) {
    
    this.deviceSessionIdentifier = deviceSessionIdentifier;
    return this;
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


  @JsonProperty(JSON_PROPERTY_DEVICE_SESSION_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeviceSessionIdentifier(String deviceSessionIdentifier) {
    this.deviceSessionIdentifier = deviceSessionIdentifier;
  }

  public TransactionCreate autoConfirmationEnabled(Boolean autoConfirmationEnabled) {
    
    this.autoConfirmationEnabled = autoConfirmationEnabled;
    return this;
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


  @JsonProperty(JSON_PROPERTY_AUTO_CONFIRMATION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoConfirmationEnabled(Boolean autoConfirmationEnabled) {
    this.autoConfirmationEnabled = autoConfirmationEnabled;
  }

  public TransactionCreate spaceViewId(Long spaceViewId) {
    
    this.spaceViewId = spaceViewId;
    return this;
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


  @JsonProperty(JSON_PROPERTY_SPACE_VIEW_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpaceViewId(Long spaceViewId) {
    this.spaceViewId = spaceViewId;
  }

  public TransactionCreate customersPresence(CustomersPresence customersPresence) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionCreate transactionCreate = (TransactionCreate) o;
    return Objects.equals(this.customerEmailAddress, transactionCreate.customerEmailAddress) &&
        Objects.equals(this.shippingMethod, transactionCreate.shippingMethod) &&
        Objects.equals(this.invoiceMerchantReference, transactionCreate.invoiceMerchantReference) &&
        Objects.equals(this.successUrl, transactionCreate.successUrl) &&
        Objects.equals(this.timeZone, transactionCreate.timeZone) &&
        Objects.equals(this.language, transactionCreate.language) &&
        Objects.equals(this.tokenizationMode, transactionCreate.tokenizationMode) &&
        Objects.equals(this.allowedPaymentMethodBrands, transactionCreate.allowedPaymentMethodBrands) &&
        Objects.equals(this.completionBehavior, transactionCreate.completionBehavior) &&
        Objects.equals(this.token, transactionCreate.token) &&
        Objects.equals(this.lineItems, transactionCreate.lineItems) &&
        Objects.equals(this.metaData, transactionCreate.metaData) &&
        Objects.equals(this.customerId, transactionCreate.customerId) &&
        Objects.equals(this.shippingAddress, transactionCreate.shippingAddress) &&
        Objects.equals(this.currency, transactionCreate.currency) &&
        Objects.equals(this.billingAddress, transactionCreate.billingAddress) &&
        Objects.equals(this.merchantReference, transactionCreate.merchantReference) &&
        Objects.equals(this.allowedPaymentMethodConfigurations, transactionCreate.allowedPaymentMethodConfigurations) &&
        Objects.equals(this.failedUrl, transactionCreate.failedUrl) &&
        Objects.equals(this.chargeRetryEnabled, transactionCreate.chargeRetryEnabled) &&
        Objects.equals(this.emailsDisabled, transactionCreate.emailsDisabled) &&
        Objects.equals(this.environment, transactionCreate.environment) &&
        Objects.equals(this.environmentSelectionStrategy, transactionCreate.environmentSelectionStrategy) &&
        Objects.equals(this.deviceSessionIdentifier, transactionCreate.deviceSessionIdentifier) &&
        Objects.equals(this.autoConfirmationEnabled, transactionCreate.autoConfirmationEnabled) &&
        Objects.equals(this.spaceViewId, transactionCreate.spaceViewId) &&
        Objects.equals(this.customersPresence, transactionCreate.customersPresence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerEmailAddress, shippingMethod, invoiceMerchantReference, successUrl, timeZone, language, tokenizationMode, allowedPaymentMethodBrands, completionBehavior, token, lineItems, metaData, customerId, shippingAddress, currency, billingAddress, merchantReference, allowedPaymentMethodConfigurations, failedUrl, chargeRetryEnabled, emailsDisabled, environment, environmentSelectionStrategy, deviceSessionIdentifier, autoConfirmationEnabled, spaceViewId, customersPresence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionCreate {\n");
    sb.append("    customerEmailAddress: ").append(toIndentedString(customerEmailAddress)).append("\n");
    sb.append("    shippingMethod: ").append(toIndentedString(shippingMethod)).append("\n");
    sb.append("    invoiceMerchantReference: ").append(toIndentedString(invoiceMerchantReference)).append("\n");
    sb.append("    successUrl: ").append(toIndentedString(successUrl)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    tokenizationMode: ").append(toIndentedString(tokenizationMode)).append("\n");
    sb.append("    allowedPaymentMethodBrands: ").append(toIndentedString(allowedPaymentMethodBrands)).append("\n");
    sb.append("    completionBehavior: ").append(toIndentedString(completionBehavior)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
    sb.append("    allowedPaymentMethodConfigurations: ").append(toIndentedString(allowedPaymentMethodConfigurations)).append("\n");
    sb.append("    failedUrl: ").append(toIndentedString(failedUrl)).append("\n");
    sb.append("    chargeRetryEnabled: ").append(toIndentedString(chargeRetryEnabled)).append("\n");
    sb.append("    emailsDisabled: ").append(toIndentedString(emailsDisabled)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    environmentSelectionStrategy: ").append(toIndentedString(environmentSelectionStrategy)).append("\n");
    sb.append("    deviceSessionIdentifier: ").append(toIndentedString(deviceSessionIdentifier)).append("\n");
    sb.append("    autoConfirmationEnabled: ").append(toIndentedString(autoConfirmationEnabled)).append("\n");
    sb.append("    spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
    sb.append("    customersPresence: ").append(toIndentedString(customersPresence)).append("\n");
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

    // add `customerEmailAddress` to the URL query string
    if (getCustomerEmailAddress() != null) {
      try {
        joiner.add(String.format("%scustomerEmailAddress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustomerEmailAddress()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `invoiceMerchantReference` to the URL query string
    if (getInvoiceMerchantReference() != null) {
      try {
        joiner.add(String.format("%sinvoiceMerchantReference%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInvoiceMerchantReference()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `language` to the URL query string
    if (getLanguage() != null) {
      try {
        joiner.add(String.format("%slanguage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLanguage()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `completionBehavior` to the URL query string
    if (getCompletionBehavior() != null) {
      try {
        joiner.add(String.format("%scompletionBehavior%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCompletionBehavior()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `token` to the URL query string
    if (getToken() != null) {
      try {
        joiner.add(String.format("%stoken%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getToken()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `customerId` to the URL query string
    if (getCustomerId() != null) {
      try {
        joiner.add(String.format("%scustomerId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustomerId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `shippingAddress` to the URL query string
    if (getShippingAddress() != null) {
      joiner.add(getShippingAddress().toUrlQueryString(prefix + "shippingAddress" + suffix));
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

    // add `billingAddress` to the URL query string
    if (getBillingAddress() != null) {
      joiner.add(getBillingAddress().toUrlQueryString(prefix + "billingAddress" + suffix));
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

    // add `failedUrl` to the URL query string
    if (getFailedUrl() != null) {
      try {
        joiner.add(String.format("%sfailedUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFailedUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

    // add `emailsDisabled` to the URL query string
    if (getEmailsDisabled() != null) {
      try {
        joiner.add(String.format("%semailsDisabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmailsDisabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

    // add `environmentSelectionStrategy` to the URL query string
    if (getEnvironmentSelectionStrategy() != null) {
      try {
        joiner.add(String.format("%senvironmentSelectionStrategy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnvironmentSelectionStrategy()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `autoConfirmationEnabled` to the URL query string
    if (getAutoConfirmationEnabled() != null) {
      try {
        joiner.add(String.format("%sautoConfirmationEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAutoConfirmationEnabled()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `customersPresence` to the URL query string
    if (getCustomersPresence() != null) {
      try {
        joiner.add(String.format("%scustomersPresence%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustomersPresence()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

