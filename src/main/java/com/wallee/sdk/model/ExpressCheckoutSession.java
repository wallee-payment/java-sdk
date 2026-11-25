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
import com.wallee.sdk.model.ExpressCheckoutSessionState;
import com.wallee.sdk.model.ExpressCheckoutShippingOption;
import com.wallee.sdk.model.ExpressCheckoutWalletType;
import com.wallee.sdk.model.FailureReason;
import com.wallee.sdk.model.LineItem;
import com.wallee.sdk.model.Transaction;
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
 * ExpressCheckoutSession
 */
@JsonPropertyOrder({
  ExpressCheckoutSession.JSON_PROPERTY_MERCHANT_SHIPPING_CALLBACK_URL,
  ExpressCheckoutSession.JSON_PROPERTY_AUTHORIZATION_AMOUNT,
  ExpressCheckoutSession.JSON_PROPERTY_WALLET_TYPE,
  ExpressCheckoutSession.JSON_PROPERTY_PLANNED_PURGE_DATE,
  ExpressCheckoutSession.JSON_PROPERTY_TIME_ZONE,
  ExpressCheckoutSession.JSON_PROPERTY_LANGUAGE,
  ExpressCheckoutSession.JSON_PROPERTY_CREATED_ON,
  ExpressCheckoutSession.JSON_PROPERTY_LINE_ITEMS,
  ExpressCheckoutSession.JSON_PROPERTY_LINKED_SPACE_ID,
  ExpressCheckoutSession.JSON_PROPERTY_MERCHANT_REDIRECT_URL,
  ExpressCheckoutSession.JSON_PROPERTY_META_DATA,
  ExpressCheckoutSession.JSON_PROPERTY_AUTHORIZATION_ENVIRONMENT,
  ExpressCheckoutSession.JSON_PROPERTY_FAILURE_REASON,
  ExpressCheckoutSession.JSON_PROPERTY_SHIPPING_ADDRESS,
  ExpressCheckoutSession.JSON_PROPERTY_CURRENCY,
  ExpressCheckoutSession.JSON_PROPERTY_BILLING_ADDRESS,
  ExpressCheckoutSession.JSON_PROPERTY_ID,
  ExpressCheckoutSession.JSON_PROPERTY_STATE,
  ExpressCheckoutSession.JSON_PROPERTY_LINKED_TRANSACTION,
  ExpressCheckoutSession.JSON_PROPERTY_SHIPPING_OPTIONS,
  ExpressCheckoutSession.JSON_PROPERTY_TRANSACTION
})

public class ExpressCheckoutSession {
  public static final String JSON_PROPERTY_MERCHANT_SHIPPING_CALLBACK_URL = "merchantShippingCallbackUrl";
  @javax.annotation.Nullable
  private String merchantShippingCallbackUrl;

  public static final String JSON_PROPERTY_AUTHORIZATION_AMOUNT = "authorizationAmount";
  @javax.annotation.Nullable
  private BigDecimal authorizationAmount;

  public static final String JSON_PROPERTY_WALLET_TYPE = "walletType";
  @javax.annotation.Nullable
  private ExpressCheckoutWalletType walletType;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  @javax.annotation.Nullable
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_TIME_ZONE = "timeZone";
  @javax.annotation.Nullable
  private String timeZone;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  @javax.annotation.Nullable
  private String language;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  @javax.annotation.Nullable
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_LINE_ITEMS = "lineItems";
  @javax.annotation.Nullable
  private List<LineItem> lineItems = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_MERCHANT_REDIRECT_URL = "merchantRedirectUrl";
  @javax.annotation.Nullable
  private String merchantRedirectUrl;

  public static final String JSON_PROPERTY_META_DATA = "metaData";
  @javax.annotation.Nullable
  private Map<String, String> metaData = new HashMap<>();

  public static final String JSON_PROPERTY_AUTHORIZATION_ENVIRONMENT = "authorizationEnvironment";
  @javax.annotation.Nullable
  private ChargeAttemptEnvironment authorizationEnvironment;

  public static final String JSON_PROPERTY_FAILURE_REASON = "failureReason";
  @javax.annotation.Nullable
  private FailureReason failureReason;

  public static final String JSON_PROPERTY_SHIPPING_ADDRESS = "shippingAddress";
  @javax.annotation.Nullable
  private Address shippingAddress;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nullable
  private String currency;

  public static final String JSON_PROPERTY_BILLING_ADDRESS = "billingAddress";
  @javax.annotation.Nullable
  private Address billingAddress;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private ExpressCheckoutSessionState state;

  public static final String JSON_PROPERTY_LINKED_TRANSACTION = "linkedTransaction";
  @javax.annotation.Nullable
  private Long linkedTransaction;

  public static final String JSON_PROPERTY_SHIPPING_OPTIONS = "shippingOptions";
  @javax.annotation.Nullable
  private List<ExpressCheckoutShippingOption> shippingOptions = new ArrayList<>();

  public static final String JSON_PROPERTY_TRANSACTION = "transaction";
  @javax.annotation.Nullable
  private Transaction transaction;

  public ExpressCheckoutSession() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public ExpressCheckoutSession(
    @JsonProperty(JSON_PROPERTY_MERCHANT_SHIPPING_CALLBACK_URL) String merchantShippingCallbackUrl, 
    @JsonProperty(JSON_PROPERTY_AUTHORIZATION_AMOUNT) BigDecimal authorizationAmount, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_TIME_ZONE) String timeZone, 
    @JsonProperty(JSON_PROPERTY_LANGUAGE) String language, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_LINE_ITEMS) List<LineItem> lineItems, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_MERCHANT_REDIRECT_URL) String merchantRedirectUrl, 
    @JsonProperty(JSON_PROPERTY_META_DATA) Map<String, String> metaData, 
    @JsonProperty(JSON_PROPERTY_CURRENCY) String currency, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_LINKED_TRANSACTION) Long linkedTransaction, 
    @JsonProperty(JSON_PROPERTY_SHIPPING_OPTIONS) List<ExpressCheckoutShippingOption> shippingOptions
  ) {
    this();
    this.merchantShippingCallbackUrl = merchantShippingCallbackUrl;
    this.authorizationAmount = authorizationAmount;
    this.plannedPurgeDate = plannedPurgeDate;
    this.timeZone = timeZone;
    this.language = language;
    this.createdOn = createdOn;
    this.lineItems = lineItems;
    this.linkedSpaceId = linkedSpaceId;
    this.merchantRedirectUrl = merchantRedirectUrl;
    this.metaData = metaData;
    this.currency = currency;
    this.id = id;
    this.linkedTransaction = linkedTransaction;
    this.shippingOptions = shippingOptions;
  }

  /**
   * The URL to fetch the shipping options from.
   * @return merchantShippingCallbackUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MERCHANT_SHIPPING_CALLBACK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantShippingCallbackUrl() {
    return merchantShippingCallbackUrl;
  }



  /**
   * The total amount of the session.
   * @return authorizationAmount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAuthorizationAmount() {
    return authorizationAmount;
  }



  public ExpressCheckoutSession walletType(@javax.annotation.Nullable ExpressCheckoutWalletType walletType) {
    
    this.walletType = walletType;
    return this;
  }

  /**
   * Get walletType
   * @return walletType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WALLET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExpressCheckoutWalletType getWalletType() {
    return walletType;
  }


  @JsonProperty(JSON_PROPERTY_WALLET_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWalletType(@javax.annotation.Nullable ExpressCheckoutWalletType walletType) {
    this.walletType = walletType;
  }

  /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }



  /**
   * Customer time zone for presentation and cutoffs (same semantics as on Transaction).
   * @return timeZone
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeZone() {
    return timeZone;
  }



  /**
   * Preferred language for customer-facing content (same semantics as on Transaction).
   * @return language
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }



  /**
   * The date and time when the session was created.
   * @return createdOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }



  /**
   * Get lineItems
   * @return lineItems
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LineItem> getLineItems() {
    return lineItems;
  }



  /**
   * The spaceId linked to the entity.
   * @return linkedSpaceId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }



  /**
   * The base URL on the merchant shop used to create the order.
   * @return merchantRedirectUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MERCHANT_REDIRECT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantRedirectUrl() {
    return merchantRedirectUrl;
  }



  /**
   * Get metaData
   * @return metaData
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getMetaData() {
    return metaData;
  }



  public ExpressCheckoutSession authorizationEnvironment(@javax.annotation.Nullable ChargeAttemptEnvironment authorizationEnvironment) {
    
    this.authorizationEnvironment = authorizationEnvironment;
    return this;
  }

  /**
   * Get authorizationEnvironment
   * @return authorizationEnvironment
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChargeAttemptEnvironment getAuthorizationEnvironment() {
    return authorizationEnvironment;
  }


  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorizationEnvironment(@javax.annotation.Nullable ChargeAttemptEnvironment authorizationEnvironment) {
    this.authorizationEnvironment = authorizationEnvironment;
  }

  public ExpressCheckoutSession failureReason(@javax.annotation.Nullable FailureReason failureReason) {
    
    this.failureReason = failureReason;
    return this;
  }

  /**
   * Get failureReason
   * @return failureReason
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILURE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FailureReason getFailureReason() {
    return failureReason;
  }


  @JsonProperty(JSON_PROPERTY_FAILURE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailureReason(@javax.annotation.Nullable FailureReason failureReason) {
    this.failureReason = failureReason;
  }

  public ExpressCheckoutSession shippingAddress(@javax.annotation.Nullable Address shippingAddress) {
    
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

  public Address getShippingAddress() {
    return shippingAddress;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingAddress(@javax.annotation.Nullable Address shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  /**
   * The currency of the session.
   * @return currency
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }



  public ExpressCheckoutSession billingAddress(@javax.annotation.Nullable Address billingAddress) {
    
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

  public Address getBillingAddress() {
    return billingAddress;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingAddress(@javax.annotation.Nullable Address billingAddress) {
    this.billingAddress = billingAddress;
  }

  /**
   * Id of the entity.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }



  public ExpressCheckoutSession state(@javax.annotation.Nullable ExpressCheckoutSessionState state) {
    
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExpressCheckoutSessionState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable ExpressCheckoutSessionState state) {
    this.state = state;
  }

  /**
   * The payment transaction this object is linked to.
   * @return linkedTransaction
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedTransaction() {
    return linkedTransaction;
  }



  /**
   * Get shippingOptions
   * @return shippingOptions
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHIPPING_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ExpressCheckoutShippingOption> getShippingOptions() {
    return shippingOptions;
  }



  public ExpressCheckoutSession transaction(@javax.annotation.Nullable Transaction transaction) {
    
    this.transaction = transaction;
    return this;
  }

  /**
   * Get transaction
   * @return transaction
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Transaction getTransaction() {
    return transaction;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransaction(@javax.annotation.Nullable Transaction transaction) {
    this.transaction = transaction;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpressCheckoutSession expressCheckoutSession = (ExpressCheckoutSession) o;
    return Objects.equals(this.merchantShippingCallbackUrl, expressCheckoutSession.merchantShippingCallbackUrl) &&
        Objects.equals(this.authorizationAmount, expressCheckoutSession.authorizationAmount) &&
        Objects.equals(this.walletType, expressCheckoutSession.walletType) &&
        Objects.equals(this.plannedPurgeDate, expressCheckoutSession.plannedPurgeDate) &&
        Objects.equals(this.timeZone, expressCheckoutSession.timeZone) &&
        Objects.equals(this.language, expressCheckoutSession.language) &&
        Objects.equals(this.createdOn, expressCheckoutSession.createdOn) &&
        Objects.equals(this.lineItems, expressCheckoutSession.lineItems) &&
        Objects.equals(this.linkedSpaceId, expressCheckoutSession.linkedSpaceId) &&
        Objects.equals(this.merchantRedirectUrl, expressCheckoutSession.merchantRedirectUrl) &&
        Objects.equals(this.metaData, expressCheckoutSession.metaData) &&
        Objects.equals(this.authorizationEnvironment, expressCheckoutSession.authorizationEnvironment) &&
        Objects.equals(this.failureReason, expressCheckoutSession.failureReason) &&
        Objects.equals(this.shippingAddress, expressCheckoutSession.shippingAddress) &&
        Objects.equals(this.currency, expressCheckoutSession.currency) &&
        Objects.equals(this.billingAddress, expressCheckoutSession.billingAddress) &&
        Objects.equals(this.id, expressCheckoutSession.id) &&
        Objects.equals(this.state, expressCheckoutSession.state) &&
        Objects.equals(this.linkedTransaction, expressCheckoutSession.linkedTransaction) &&
        Objects.equals(this.shippingOptions, expressCheckoutSession.shippingOptions) &&
        Objects.equals(this.transaction, expressCheckoutSession.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantShippingCallbackUrl, authorizationAmount, walletType, plannedPurgeDate, timeZone, language, createdOn, lineItems, linkedSpaceId, merchantRedirectUrl, metaData, authorizationEnvironment, failureReason, shippingAddress, currency, billingAddress, id, state, linkedTransaction, shippingOptions, transaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpressCheckoutSession {\n");
    sb.append("    merchantShippingCallbackUrl: ").append(toIndentedString(merchantShippingCallbackUrl)).append("\n");
    sb.append("    authorizationAmount: ").append(toIndentedString(authorizationAmount)).append("\n");
    sb.append("    walletType: ").append(toIndentedString(walletType)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    merchantRedirectUrl: ").append(toIndentedString(merchantRedirectUrl)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    authorizationEnvironment: ").append(toIndentedString(authorizationEnvironment)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    shippingOptions: ").append(toIndentedString(shippingOptions)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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

    // add `merchantShippingCallbackUrl` to the URL query string
    if (getMerchantShippingCallbackUrl() != null) {
      try {
        joiner.add(String.format("%smerchantShippingCallbackUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMerchantShippingCallbackUrl()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `walletType` to the URL query string
    if (getWalletType() != null) {
      joiner.add(getWalletType().toUrlQueryString(prefix + "walletType" + suffix));
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

    // add `createdOn` to the URL query string
    if (getCreatedOn() != null) {
      try {
        joiner.add(String.format("%screatedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedOn()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `linkedSpaceId` to the URL query string
    if (getLinkedSpaceId() != null) {
      try {
        joiner.add(String.format("%slinkedSpaceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedSpaceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `merchantRedirectUrl` to the URL query string
    if (getMerchantRedirectUrl() != null) {
      try {
        joiner.add(String.format("%smerchantRedirectUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMerchantRedirectUrl()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `authorizationEnvironment` to the URL query string
    if (getAuthorizationEnvironment() != null) {
      try {
        joiner.add(String.format("%sauthorizationEnvironment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthorizationEnvironment()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `failureReason` to the URL query string
    if (getFailureReason() != null) {
      joiner.add(getFailureReason().toUrlQueryString(prefix + "failureReason" + suffix));
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

    // add `linkedTransaction` to the URL query string
    if (getLinkedTransaction() != null) {
      try {
        joiner.add(String.format("%slinkedTransaction%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedTransaction()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `shippingOptions` to the URL query string
    if (getShippingOptions() != null) {
      for (int i = 0; i < getShippingOptions().size(); i++) {
        if (getShippingOptions().get(i) != null) {
          joiner.add(getShippingOptions().get(i).toUrlQueryString(String.format("%sshippingOptions%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `transaction` to the URL query string
    if (getTransaction() != null) {
      joiner.add(getTransaction().toUrlQueryString(prefix + "transaction" + suffix));
    }

    return joiner.toString();
  }

}

