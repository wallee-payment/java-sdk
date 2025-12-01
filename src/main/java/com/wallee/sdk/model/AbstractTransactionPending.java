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
import com.wallee.sdk.model.LineItemCreate;
import com.wallee.sdk.model.TokenizationMode;
import com.wallee.sdk.model.TransactionCompletionBehavior;
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
 * AbstractTransactionPending
 */
@JsonPropertyOrder({
  AbstractTransactionPending.JSON_PROPERTY_CUSTOMER_EMAIL_ADDRESS,
  AbstractTransactionPending.JSON_PROPERTY_SHIPPING_METHOD,
  AbstractTransactionPending.JSON_PROPERTY_INVOICE_MERCHANT_REFERENCE,
  AbstractTransactionPending.JSON_PROPERTY_SUCCESS_URL,
  AbstractTransactionPending.JSON_PROPERTY_TIME_ZONE,
  AbstractTransactionPending.JSON_PROPERTY_LANGUAGE,
  AbstractTransactionPending.JSON_PROPERTY_TOKENIZATION_MODE,
  AbstractTransactionPending.JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_BRANDS,
  AbstractTransactionPending.JSON_PROPERTY_COMPLETION_BEHAVIOR,
  AbstractTransactionPending.JSON_PROPERTY_TOKEN,
  AbstractTransactionPending.JSON_PROPERTY_LINE_ITEMS,
  AbstractTransactionPending.JSON_PROPERTY_META_DATA,
  AbstractTransactionPending.JSON_PROPERTY_CUSTOMER_ID,
  AbstractTransactionPending.JSON_PROPERTY_SHIPPING_ADDRESS,
  AbstractTransactionPending.JSON_PROPERTY_CURRENCY,
  AbstractTransactionPending.JSON_PROPERTY_BILLING_ADDRESS,
  AbstractTransactionPending.JSON_PROPERTY_MERCHANT_REFERENCE,
  AbstractTransactionPending.JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_CONFIGURATIONS,
  AbstractTransactionPending.JSON_PROPERTY_FAILED_URL
})
@JsonTypeName("Abstract.Transaction.Pending")

public class AbstractTransactionPending {
  public static final String JSON_PROPERTY_CUSTOMER_EMAIL_ADDRESS = "customerEmailAddress";
  @javax.annotation.Nullable
  private String customerEmailAddress;

  public static final String JSON_PROPERTY_SHIPPING_METHOD = "shippingMethod";
  @javax.annotation.Nullable
  private String shippingMethod;

  public static final String JSON_PROPERTY_INVOICE_MERCHANT_REFERENCE = "invoiceMerchantReference";
  @javax.annotation.Nullable
  private String invoiceMerchantReference;

  public static final String JSON_PROPERTY_SUCCESS_URL = "successUrl";
  @javax.annotation.Nullable
  private String successUrl;

  public static final String JSON_PROPERTY_TIME_ZONE = "timeZone";
  @javax.annotation.Nullable
  private String timeZone;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  @javax.annotation.Nullable
  private String language;

  public static final String JSON_PROPERTY_TOKENIZATION_MODE = "tokenizationMode";
  @javax.annotation.Nullable
  private TokenizationMode tokenizationMode;

  public static final String JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_BRANDS = "allowedPaymentMethodBrands";
  @javax.annotation.Nullable
  private List<Long> allowedPaymentMethodBrands = new ArrayList<>();

  public static final String JSON_PROPERTY_COMPLETION_BEHAVIOR = "completionBehavior";
  @javax.annotation.Nullable
  private TransactionCompletionBehavior completionBehavior;

  public static final String JSON_PROPERTY_TOKEN = "token";
  @javax.annotation.Nullable
  private Long token;

  public static final String JSON_PROPERTY_LINE_ITEMS = "lineItems";
  @javax.annotation.Nullable
  private List<LineItemCreate> lineItems = new ArrayList<>();

  public static final String JSON_PROPERTY_META_DATA = "metaData";
  @javax.annotation.Nullable
  private Map<String, String> metaData = new HashMap<>();

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @javax.annotation.Nullable
  private String customerId;

  public static final String JSON_PROPERTY_SHIPPING_ADDRESS = "shippingAddress";
  @javax.annotation.Nullable
  private AddressCreate shippingAddress;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nullable
  private String currency;

  public static final String JSON_PROPERTY_BILLING_ADDRESS = "billingAddress";
  @javax.annotation.Nullable
  private AddressCreate billingAddress;

  public static final String JSON_PROPERTY_MERCHANT_REFERENCE = "merchantReference";
  @javax.annotation.Nullable
  private String merchantReference;

  public static final String JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_CONFIGURATIONS = "allowedPaymentMethodConfigurations";
  @javax.annotation.Nullable
  private List<Long> allowedPaymentMethodConfigurations = new ArrayList<>();

  public static final String JSON_PROPERTY_FAILED_URL = "failedUrl";
  @javax.annotation.Nullable
  private String failedUrl;

  public AbstractTransactionPending() {
  }

  public AbstractTransactionPending customerEmailAddress(@javax.annotation.Nullable String customerEmailAddress) {
    
    this.customerEmailAddress = customerEmailAddress;
    return this;
  }

  /**
   * The customer&#39;s email address.
   * @return customerEmailAddress
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerEmailAddress() {
    return customerEmailAddress;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerEmailAddress(@javax.annotation.Nullable String customerEmailAddress) {
    this.customerEmailAddress = customerEmailAddress;
  }

  public AbstractTransactionPending shippingMethod(@javax.annotation.Nullable String shippingMethod) {
    
    this.shippingMethod = shippingMethod;
    return this;
  }

  /**
   * The name of the shipping method used to ship the products.
   * @return shippingMethod
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHIPPING_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShippingMethod() {
    return shippingMethod;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingMethod(@javax.annotation.Nullable String shippingMethod) {
    this.shippingMethod = shippingMethod;
  }

  public AbstractTransactionPending invoiceMerchantReference(@javax.annotation.Nullable String invoiceMerchantReference) {
    
    this.invoiceMerchantReference = invoiceMerchantReference;
    return this;
  }

  /**
   * The merchant&#39;s reference used to identify the invoice.
   * @return invoiceMerchantReference
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVOICE_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvoiceMerchantReference() {
    return invoiceMerchantReference;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvoiceMerchantReference(@javax.annotation.Nullable String invoiceMerchantReference) {
    this.invoiceMerchantReference = invoiceMerchantReference;
  }

  public AbstractTransactionPending successUrl(@javax.annotation.Nullable String successUrl) {
    
    this.successUrl = successUrl;
    return this;
  }

  /**
   * The URL to redirect the customer back to after they successfully authenticated their payment.
   * @return successUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUCCESS_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSuccessUrl() {
    return successUrl;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccessUrl(@javax.annotation.Nullable String successUrl) {
    this.successUrl = successUrl;
  }

  public AbstractTransactionPending timeZone(@javax.annotation.Nullable String timeZone) {
    
    this.timeZone = timeZone;
    return this;
  }

  /**
   * The customer&#39;s time zone, which affects how dates and times are formatted when communicating with the customer.
   * @return timeZone
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeZone() {
    return timeZone;
  }


  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeZone(@javax.annotation.Nullable String timeZone) {
    this.timeZone = timeZone;
  }

  public AbstractTransactionPending language(@javax.annotation.Nullable String language) {
    
    this.language = language;
    return this;
  }

  /**
   * The language that is linked to the object.
   * @return language
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(@javax.annotation.Nullable String language) {
    this.language = language;
  }

  public AbstractTransactionPending tokenizationMode(@javax.annotation.Nullable TokenizationMode tokenizationMode) {
    
    this.tokenizationMode = tokenizationMode;
    return this;
  }

  /**
   * Get tokenizationMode
   * @return tokenizationMode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKENIZATION_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TokenizationMode getTokenizationMode() {
    return tokenizationMode;
  }


  @JsonProperty(JSON_PROPERTY_TOKENIZATION_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenizationMode(@javax.annotation.Nullable TokenizationMode tokenizationMode) {
    this.tokenizationMode = tokenizationMode;
  }

  public AbstractTransactionPending allowedPaymentMethodBrands(@javax.annotation.Nullable List<Long> allowedPaymentMethodBrands) {
    
    this.allowedPaymentMethodBrands = allowedPaymentMethodBrands;
    return this;
  }

  public AbstractTransactionPending addAllowedPaymentMethodBrandsItem(Long allowedPaymentMethodBrandsItem) {
    if (this.allowedPaymentMethodBrands == null) {
      this.allowedPaymentMethodBrands = new ArrayList<>();
    }
    this.allowedPaymentMethodBrands.add(allowedPaymentMethodBrandsItem);
    return this;
  }

  /**
   * The payment method brands that can be used to authorize the transaction.
   * @return allowedPaymentMethodBrands
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_BRANDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getAllowedPaymentMethodBrands() {
    return allowedPaymentMethodBrands;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_BRANDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedPaymentMethodBrands(@javax.annotation.Nullable List<Long> allowedPaymentMethodBrands) {
    this.allowedPaymentMethodBrands = allowedPaymentMethodBrands;
  }

  public AbstractTransactionPending completionBehavior(@javax.annotation.Nullable TransactionCompletionBehavior completionBehavior) {
    
    this.completionBehavior = completionBehavior;
    return this;
  }

  /**
   * Get completionBehavior
   * @return completionBehavior
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETION_BEHAVIOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionCompletionBehavior getCompletionBehavior() {
    return completionBehavior;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETION_BEHAVIOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompletionBehavior(@javax.annotation.Nullable TransactionCompletionBehavior completionBehavior) {
    this.completionBehavior = completionBehavior;
  }

  public AbstractTransactionPending token(@javax.annotation.Nullable Long token) {
    
    this.token = token;
    return this;
  }

  /**
   * The payment token that should be used to charge the customer.
   * @return token
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getToken() {
    return token;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToken(@javax.annotation.Nullable Long token) {
    this.token = token;
  }

  public AbstractTransactionPending lineItems(@javax.annotation.Nullable List<LineItemCreate> lineItems) {
    
    this.lineItems = lineItems;
    return this;
  }

  public AbstractTransactionPending addLineItemsItem(LineItemCreate lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

  /**
   * The line items purchased by the customer.
   * @return lineItems
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LineItemCreate> getLineItems() {
    return lineItems;
  }


  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineItems(@javax.annotation.Nullable List<LineItemCreate> lineItems) {
    this.lineItems = lineItems;
  }

  public AbstractTransactionPending metaData(@javax.annotation.Nullable Map<String, String> metaData) {
    
    this.metaData = metaData;
    return this;
  }

  public AbstractTransactionPending putMetaDataItem(String key, String metaDataItem) {
    if (this.metaData == null) {
      this.metaData = new HashMap<>();
    }
    this.metaData.put(key, metaDataItem);
    return this;
  }

  /**
   * Allow to store additional information about the object.
   * @return metaData
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getMetaData() {
    return metaData;
  }


  @JsonProperty(JSON_PROPERTY_META_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetaData(@javax.annotation.Nullable Map<String, String> metaData) {
    this.metaData = metaData;
  }

  public AbstractTransactionPending customerId(@javax.annotation.Nullable String customerId) {
    
    this.customerId = customerId;
    return this;
  }

  /**
   * The unique identifier of the customer in the external system.
   * @return customerId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerId() {
    return customerId;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerId(@javax.annotation.Nullable String customerId) {
    this.customerId = customerId;
  }

  public AbstractTransactionPending shippingAddress(@javax.annotation.Nullable AddressCreate shippingAddress) {
    
    this.shippingAddress = shippingAddress;
    return this;
  }

  /**
   * Get shippingAddress
   * @return shippingAddress
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHIPPING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AddressCreate getShippingAddress() {
    return shippingAddress;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingAddress(@javax.annotation.Nullable AddressCreate shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public AbstractTransactionPending currency(@javax.annotation.Nullable String currency) {
    
    this.currency = currency;
    return this;
  }

  /**
   * The three-letter code (ISO 4217 format) of the transaction&#39;s currency.
   * @return currency
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
  }

  public AbstractTransactionPending billingAddress(@javax.annotation.Nullable AddressCreate billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

  /**
   * Get billingAddress
   * @return billingAddress
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AddressCreate getBillingAddress() {
    return billingAddress;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingAddress(@javax.annotation.Nullable AddressCreate billingAddress) {
    this.billingAddress = billingAddress;
  }

  public AbstractTransactionPending merchantReference(@javax.annotation.Nullable String merchantReference) {
    
    this.merchantReference = merchantReference;
    return this;
  }

  /**
   * The merchant&#39;s reference used to identify the transaction.
   * @return merchantReference
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantReference() {
    return merchantReference;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantReference(@javax.annotation.Nullable String merchantReference) {
    this.merchantReference = merchantReference;
  }

  public AbstractTransactionPending allowedPaymentMethodConfigurations(@javax.annotation.Nullable List<Long> allowedPaymentMethodConfigurations) {
    
    this.allowedPaymentMethodConfigurations = allowedPaymentMethodConfigurations;
    return this;
  }

  public AbstractTransactionPending addAllowedPaymentMethodConfigurationsItem(Long allowedPaymentMethodConfigurationsItem) {
    if (this.allowedPaymentMethodConfigurations == null) {
      this.allowedPaymentMethodConfigurations = new ArrayList<>();
    }
    this.allowedPaymentMethodConfigurations.add(allowedPaymentMethodConfigurationsItem);
    return this;
  }

  /**
   * The payment method configurations that can be used to authorize the transaction.
   * @return allowedPaymentMethodConfigurations
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getAllowedPaymentMethodConfigurations() {
    return allowedPaymentMethodConfigurations;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedPaymentMethodConfigurations(@javax.annotation.Nullable List<Long> allowedPaymentMethodConfigurations) {
    this.allowedPaymentMethodConfigurations = allowedPaymentMethodConfigurations;
  }

  public AbstractTransactionPending failedUrl(@javax.annotation.Nullable String failedUrl) {
    
    this.failedUrl = failedUrl;
    return this;
  }

  /**
   * The URL to redirect the customer back to after they canceled or failed to authenticated their payment.
   * @return failedUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILED_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFailedUrl() {
    return failedUrl;
  }


  @JsonProperty(JSON_PROPERTY_FAILED_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailedUrl(@javax.annotation.Nullable String failedUrl) {
    this.failedUrl = failedUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractTransactionPending abstractTransactionPending = (AbstractTransactionPending) o;
    return Objects.equals(this.customerEmailAddress, abstractTransactionPending.customerEmailAddress) &&
        Objects.equals(this.shippingMethod, abstractTransactionPending.shippingMethod) &&
        Objects.equals(this.invoiceMerchantReference, abstractTransactionPending.invoiceMerchantReference) &&
        Objects.equals(this.successUrl, abstractTransactionPending.successUrl) &&
        Objects.equals(this.timeZone, abstractTransactionPending.timeZone) &&
        Objects.equals(this.language, abstractTransactionPending.language) &&
        Objects.equals(this.tokenizationMode, abstractTransactionPending.tokenizationMode) &&
        Objects.equals(this.allowedPaymentMethodBrands, abstractTransactionPending.allowedPaymentMethodBrands) &&
        Objects.equals(this.completionBehavior, abstractTransactionPending.completionBehavior) &&
        Objects.equals(this.token, abstractTransactionPending.token) &&
        Objects.equals(this.lineItems, abstractTransactionPending.lineItems) &&
        Objects.equals(this.metaData, abstractTransactionPending.metaData) &&
        Objects.equals(this.customerId, abstractTransactionPending.customerId) &&
        Objects.equals(this.shippingAddress, abstractTransactionPending.shippingAddress) &&
        Objects.equals(this.currency, abstractTransactionPending.currency) &&
        Objects.equals(this.billingAddress, abstractTransactionPending.billingAddress) &&
        Objects.equals(this.merchantReference, abstractTransactionPending.merchantReference) &&
        Objects.equals(this.allowedPaymentMethodConfigurations, abstractTransactionPending.allowedPaymentMethodConfigurations) &&
        Objects.equals(this.failedUrl, abstractTransactionPending.failedUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerEmailAddress, shippingMethod, invoiceMerchantReference, successUrl, timeZone, language, tokenizationMode, allowedPaymentMethodBrands, completionBehavior, token, lineItems, metaData, customerId, shippingAddress, currency, billingAddress, merchantReference, allowedPaymentMethodConfigurations, failedUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractTransactionPending {\n");
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

    return joiner.toString();
  }

}

