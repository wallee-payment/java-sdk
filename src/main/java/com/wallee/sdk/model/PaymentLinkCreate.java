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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.LineItemCreate;
import com.wallee.sdk.model.PaymentLinkAddressHandlingMode;
import com.wallee.sdk.model.PaymentLinkProtectionMode;
import com.wallee.sdk.model.PaymentMethodConfiguration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * PaymentLinkCreate
 */
@JsonPropertyOrder({
  PaymentLinkCreate.JSON_PROPERTY_LINE_ITEMS,
  PaymentLinkCreate.JSON_PROPERTY_AVAILABLE_UNTIL,
  PaymentLinkCreate.JSON_PROPERTY_SHIPPING_ADDRESS_HANDLING_MODE,
  PaymentLinkCreate.JSON_PROPERTY_ALLOWED_REDIRECTION_DOMAINS,
  PaymentLinkCreate.JSON_PROPERTY_NAME,
  PaymentLinkCreate.JSON_PROPERTY_CURRENCY,
  PaymentLinkCreate.JSON_PROPERTY_LANGUAGE,
  PaymentLinkCreate.JSON_PROPERTY_MAXIMAL_NUMBER_OF_TRANSACTIONS,
  PaymentLinkCreate.JSON_PROPERTY_AVAILABLE_FROM,
  PaymentLinkCreate.JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_CONFIGURATIONS,
  PaymentLinkCreate.JSON_PROPERTY_APPLIED_SPACE_VIEW,
  PaymentLinkCreate.JSON_PROPERTY_BILLING_ADDRESS_HANDLING_MODE,
  PaymentLinkCreate.JSON_PROPERTY_PROTECTION_MODE,
  PaymentLinkCreate.JSON_PROPERTY_EXTERNAL_ID,
  PaymentLinkCreate.JSON_PROPERTY_STATE
})
@JsonTypeName("PaymentLink.Create")

public class PaymentLinkCreate {
  public static final String JSON_PROPERTY_LINE_ITEMS = "lineItems";
  private List<LineItemCreate> lineItems = new ArrayList<>();

  public static final String JSON_PROPERTY_AVAILABLE_UNTIL = "availableUntil";
  private OffsetDateTime availableUntil;

  public static final String JSON_PROPERTY_SHIPPING_ADDRESS_HANDLING_MODE = "shippingAddressHandlingMode";
  private PaymentLinkAddressHandlingMode shippingAddressHandlingMode;

  public static final String JSON_PROPERTY_ALLOWED_REDIRECTION_DOMAINS = "allowedRedirectionDomains";
  private Set<String> allowedRedirectionDomains = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_MAXIMAL_NUMBER_OF_TRANSACTIONS = "maximalNumberOfTransactions";
  private Integer maximalNumberOfTransactions;

  public static final String JSON_PROPERTY_AVAILABLE_FROM = "availableFrom";
  private OffsetDateTime availableFrom;

  public static final String JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_CONFIGURATIONS = "allowedPaymentMethodConfigurations";
  private Set<PaymentMethodConfiguration> allowedPaymentMethodConfigurations = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_APPLIED_SPACE_VIEW = "appliedSpaceView";
  private Long appliedSpaceView;

  public static final String JSON_PROPERTY_BILLING_ADDRESS_HANDLING_MODE = "billingAddressHandlingMode";
  private PaymentLinkAddressHandlingMode billingAddressHandlingMode;

  public static final String JSON_PROPERTY_PROTECTION_MODE = "protectionMode";
  private PaymentLinkProtectionMode protectionMode;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_STATE = "state";
  private CreationEntityState state;

  public PaymentLinkCreate() {
  }

  public PaymentLinkCreate lineItems(List<LineItemCreate> lineItems) {
    
    this.lineItems = lineItems;
    return this;
  }

  public PaymentLinkCreate addLineItemsItem(LineItemCreate lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * The line items representing what is being sold. If not specified, they can be supplied via request parameters.
   * @return lineItems
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LineItemCreate> getLineItems() {
    return lineItems;
  }


  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineItems(List<LineItemCreate> lineItems) {
    this.lineItems = lineItems;
  }

  public PaymentLinkCreate availableUntil(OffsetDateTime availableUntil) {
    
    this.availableUntil = availableUntil;
    return this;
  }

   /**
   * The latest date the payment link can be used to initiate a transaction. If no date is provided, the link will remain available indefinitely.
   * @return availableUntil
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVAILABLE_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getAvailableUntil() {
    return availableUntil;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABLE_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailableUntil(OffsetDateTime availableUntil) {
    this.availableUntil = availableUntil;
  }

  public PaymentLinkCreate shippingAddressHandlingMode(PaymentLinkAddressHandlingMode shippingAddressHandlingMode) {
    
    this.shippingAddressHandlingMode = shippingAddressHandlingMode;
    return this;
  }

   /**
   * Get shippingAddressHandlingMode
   * @return shippingAddressHandlingMode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHIPPING_ADDRESS_HANDLING_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentLinkAddressHandlingMode getShippingAddressHandlingMode() {
    return shippingAddressHandlingMode;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_ADDRESS_HANDLING_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingAddressHandlingMode(PaymentLinkAddressHandlingMode shippingAddressHandlingMode) {
    this.shippingAddressHandlingMode = shippingAddressHandlingMode;
  }

  public PaymentLinkCreate allowedRedirectionDomains(Set<String> allowedRedirectionDomains) {
    
    this.allowedRedirectionDomains = allowedRedirectionDomains;
    return this;
  }

  public PaymentLinkCreate addAllowedRedirectionDomainsItem(String allowedRedirectionDomainsItem) {
    if (this.allowedRedirectionDomains == null) {
      this.allowedRedirectionDomains = new LinkedHashSet<>();
    }
    this.allowedRedirectionDomains.add(allowedRedirectionDomainsItem);
    return this;
  }

   /**
   * The domains to which the user is allowed to be redirected after the payment is completed. The following options can be configured: Exact domain: enter a full domain, e.g. (https://example.com). Wildcard domain: use to allow subdomains, e.g. (https://_*.example.com). All domains: use (ALL) to allow redirection to any domain (not recommended for security reasons). No domains : use (NONE) to disallow any redirection. Only one option per line is allowed. Invalid entries will be rejected. 
   * @return allowedRedirectionDomains
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWED_REDIRECTION_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getAllowedRedirectionDomains() {
    return allowedRedirectionDomains;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_ALLOWED_REDIRECTION_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedRedirectionDomains(Set<String> allowedRedirectionDomains) {
    this.allowedRedirectionDomains = allowedRedirectionDomains;
  }

  public PaymentLinkCreate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name used to identify the payment link.
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }

  public PaymentLinkCreate currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The three-letter currency code (ISO 4217). If not specified, it must be provided in the &#39;currency&#39; request parameter.
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

  public PaymentLinkCreate language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * The language for displaying the payment page. If not specified, it can be supplied via the &#39;language&#39; request parameter.
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

  public PaymentLinkCreate maximalNumberOfTransactions(Integer maximalNumberOfTransactions) {
    
    this.maximalNumberOfTransactions = maximalNumberOfTransactions;
    return this;
  }

   /**
   * The maximum number of transactions that can be initiated using the payment link.
   * @return maximalNumberOfTransactions
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAXIMAL_NUMBER_OF_TRANSACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaximalNumberOfTransactions() {
    return maximalNumberOfTransactions;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMAL_NUMBER_OF_TRANSACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximalNumberOfTransactions(Integer maximalNumberOfTransactions) {
    this.maximalNumberOfTransactions = maximalNumberOfTransactions;
  }

  public PaymentLinkCreate availableFrom(OffsetDateTime availableFrom) {
    
    this.availableFrom = availableFrom;
    return this;
  }

   /**
   * The earliest date the payment link can be used to initiate a transaction. If no date is provided, the link will be available immediately.
   * @return availableFrom
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVAILABLE_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getAvailableFrom() {
    return availableFrom;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABLE_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailableFrom(OffsetDateTime availableFrom) {
    this.availableFrom = availableFrom;
  }

  public PaymentLinkCreate allowedPaymentMethodConfigurations(Set<PaymentMethodConfiguration> allowedPaymentMethodConfigurations) {
    
    this.allowedPaymentMethodConfigurations = allowedPaymentMethodConfigurations;
    return this;
  }

  public PaymentLinkCreate addAllowedPaymentMethodConfigurationsItem(PaymentMethodConfiguration allowedPaymentMethodConfigurationsItem) {
    if (this.allowedPaymentMethodConfigurations == null) {
      this.allowedPaymentMethodConfigurations = new LinkedHashSet<>();
    }
    this.allowedPaymentMethodConfigurations.add(allowedPaymentMethodConfigurationsItem);
    return this;
  }

   /**
   * The payment method configurations that customers can use for making payments.
   * @return allowedPaymentMethodConfigurations
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<PaymentMethodConfiguration> getAllowedPaymentMethodConfigurations() {
    return allowedPaymentMethodConfigurations;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedPaymentMethodConfigurations(Set<PaymentMethodConfiguration> allowedPaymentMethodConfigurations) {
    this.allowedPaymentMethodConfigurations = allowedPaymentMethodConfigurations;
  }

  public PaymentLinkCreate appliedSpaceView(Long appliedSpaceView) {
    
    this.appliedSpaceView = appliedSpaceView;
    return this;
  }

   /**
   * The payment link can be used within a specific space view, which may apply a customized design to the payment page.
   * @return appliedSpaceView
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLIED_SPACE_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAppliedSpaceView() {
    return appliedSpaceView;
  }


  @JsonProperty(JSON_PROPERTY_APPLIED_SPACE_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppliedSpaceView(Long appliedSpaceView) {
    this.appliedSpaceView = appliedSpaceView;
  }

  public PaymentLinkCreate billingAddressHandlingMode(PaymentLinkAddressHandlingMode billingAddressHandlingMode) {
    
    this.billingAddressHandlingMode = billingAddressHandlingMode;
    return this;
  }

   /**
   * Get billingAddressHandlingMode
   * @return billingAddressHandlingMode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS_HANDLING_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentLinkAddressHandlingMode getBillingAddressHandlingMode() {
    return billingAddressHandlingMode;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS_HANDLING_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingAddressHandlingMode(PaymentLinkAddressHandlingMode billingAddressHandlingMode) {
    this.billingAddressHandlingMode = billingAddressHandlingMode;
  }

  public PaymentLinkCreate protectionMode(PaymentLinkProtectionMode protectionMode) {
    
    this.protectionMode = protectionMode;
    return this;
  }

   /**
   * Get protectionMode
   * @return protectionMode
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROTECTION_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PaymentLinkProtectionMode getProtectionMode() {
    return protectionMode;
  }


  @JsonProperty(JSON_PROPERTY_PROTECTION_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProtectionMode(PaymentLinkProtectionMode protectionMode) {
    this.protectionMode = protectionMode;
  }

  public PaymentLinkCreate externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.
   * @return externalId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExternalId() {
    return externalId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public PaymentLinkCreate state(CreationEntityState state) {
    
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

  public CreationEntityState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(CreationEntityState state) {
    this.state = state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentLinkCreate paymentLinkCreate = (PaymentLinkCreate) o;
    return Objects.equals(this.lineItems, paymentLinkCreate.lineItems) &&
        Objects.equals(this.availableUntil, paymentLinkCreate.availableUntil) &&
        Objects.equals(this.shippingAddressHandlingMode, paymentLinkCreate.shippingAddressHandlingMode) &&
        Objects.equals(this.allowedRedirectionDomains, paymentLinkCreate.allowedRedirectionDomains) &&
        Objects.equals(this.name, paymentLinkCreate.name) &&
        Objects.equals(this.currency, paymentLinkCreate.currency) &&
        Objects.equals(this.language, paymentLinkCreate.language) &&
        Objects.equals(this.maximalNumberOfTransactions, paymentLinkCreate.maximalNumberOfTransactions) &&
        Objects.equals(this.availableFrom, paymentLinkCreate.availableFrom) &&
        Objects.equals(this.allowedPaymentMethodConfigurations, paymentLinkCreate.allowedPaymentMethodConfigurations) &&
        Objects.equals(this.appliedSpaceView, paymentLinkCreate.appliedSpaceView) &&
        Objects.equals(this.billingAddressHandlingMode, paymentLinkCreate.billingAddressHandlingMode) &&
        Objects.equals(this.protectionMode, paymentLinkCreate.protectionMode) &&
        Objects.equals(this.externalId, paymentLinkCreate.externalId) &&
        Objects.equals(this.state, paymentLinkCreate.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineItems, availableUntil, shippingAddressHandlingMode, allowedRedirectionDomains, name, currency, language, maximalNumberOfTransactions, availableFrom, allowedPaymentMethodConfigurations, appliedSpaceView, billingAddressHandlingMode, protectionMode, externalId, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentLinkCreate {\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    availableUntil: ").append(toIndentedString(availableUntil)).append("\n");
    sb.append("    shippingAddressHandlingMode: ").append(toIndentedString(shippingAddressHandlingMode)).append("\n");
    sb.append("    allowedRedirectionDomains: ").append(toIndentedString(allowedRedirectionDomains)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    maximalNumberOfTransactions: ").append(toIndentedString(maximalNumberOfTransactions)).append("\n");
    sb.append("    availableFrom: ").append(toIndentedString(availableFrom)).append("\n");
    sb.append("    allowedPaymentMethodConfigurations: ").append(toIndentedString(allowedPaymentMethodConfigurations)).append("\n");
    sb.append("    appliedSpaceView: ").append(toIndentedString(appliedSpaceView)).append("\n");
    sb.append("    billingAddressHandlingMode: ").append(toIndentedString(billingAddressHandlingMode)).append("\n");
    sb.append("    protectionMode: ").append(toIndentedString(protectionMode)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

    // add `lineItems` to the URL query string
    if (getLineItems() != null) {
      for (int i = 0; i < getLineItems().size(); i++) {
        if (getLineItems().get(i) != null) {
          joiner.add(getLineItems().get(i).toUrlQueryString(String.format("%slineItems%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `availableUntil` to the URL query string
    if (getAvailableUntil() != null) {
      try {
        joiner.add(String.format("%savailableUntil%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAvailableUntil()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `shippingAddressHandlingMode` to the URL query string
    if (getShippingAddressHandlingMode() != null) {
      try {
        joiner.add(String.format("%sshippingAddressHandlingMode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getShippingAddressHandlingMode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `allowedRedirectionDomains` to the URL query string
    if (getAllowedRedirectionDomains() != null) {
      int i = 0;
      for (String _item : getAllowedRedirectionDomains()) {
        try {
          joiner.add(String.format("%sallowedRedirectionDomains%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(_item), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
      i++;
    }

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `language` to the URL query string
    if (getLanguage() != null) {
      try {
        joiner.add(String.format("%slanguage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLanguage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `maximalNumberOfTransactions` to the URL query string
    if (getMaximalNumberOfTransactions() != null) {
      try {
        joiner.add(String.format("%smaximalNumberOfTransactions%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaximalNumberOfTransactions()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `availableFrom` to the URL query string
    if (getAvailableFrom() != null) {
      try {
        joiner.add(String.format("%savailableFrom%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAvailableFrom()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `allowedPaymentMethodConfigurations` to the URL query string
    if (getAllowedPaymentMethodConfigurations() != null) {
      int i = 0;
      for (PaymentMethodConfiguration _item : getAllowedPaymentMethodConfigurations()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%sallowedPaymentMethodConfigurations%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `appliedSpaceView` to the URL query string
    if (getAppliedSpaceView() != null) {
      try {
        joiner.add(String.format("%sappliedSpaceView%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAppliedSpaceView()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `billingAddressHandlingMode` to the URL query string
    if (getBillingAddressHandlingMode() != null) {
      try {
        joiner.add(String.format("%sbillingAddressHandlingMode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBillingAddressHandlingMode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `protectionMode` to the URL query string
    if (getProtectionMode() != null) {
      try {
        joiner.add(String.format("%sprotectionMode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProtectionMode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `externalId` to the URL query string
    if (getExternalId() != null) {
      try {
        joiner.add(String.format("%sexternalId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExternalId()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

