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
import com.wallee.sdk.model.LineItemCreate;
import com.wallee.sdk.model.PaymentLinkAddressHandlingMode;
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
 * PaymentLinkUpdate
 */
@JsonPropertyOrder({
  PaymentLinkUpdate.JSON_PROPERTY_SHIPPING_ADDRESS_HANDLING_MODE,
  PaymentLinkUpdate.JSON_PROPERTY_ALLOWED_REDIRECTION_DOMAINS,
  PaymentLinkUpdate.JSON_PROPERTY_LANGUAGE,
  PaymentLinkUpdate.JSON_PROPERTY_VERSION,
  PaymentLinkUpdate.JSON_PROPERTY_AVAILABLE_FROM,
  PaymentLinkUpdate.JSON_PROPERTY_LINE_ITEMS,
  PaymentLinkUpdate.JSON_PROPERTY_AVAILABLE_UNTIL,
  PaymentLinkUpdate.JSON_PROPERTY_NAME,
  PaymentLinkUpdate.JSON_PROPERTY_CURRENCY,
  PaymentLinkUpdate.JSON_PROPERTY_MAXIMAL_NUMBER_OF_TRANSACTIONS,
  PaymentLinkUpdate.JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_CONFIGURATIONS,
  PaymentLinkUpdate.JSON_PROPERTY_APPLIED_SPACE_VIEW,
  PaymentLinkUpdate.JSON_PROPERTY_BILLING_ADDRESS_HANDLING_MODE
})
@JsonTypeName("PaymentLink.Update")

public class PaymentLinkUpdate {
  public static final String JSON_PROPERTY_SHIPPING_ADDRESS_HANDLING_MODE = "shippingAddressHandlingMode";
  @javax.annotation.Nullable
  private PaymentLinkAddressHandlingMode shippingAddressHandlingMode;

  public static final String JSON_PROPERTY_ALLOWED_REDIRECTION_DOMAINS = "allowedRedirectionDomains";
  @javax.annotation.Nullable
  private Set<String> allowedRedirectionDomains = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  @javax.annotation.Nullable
  private String language;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nonnull
  private Integer version;

  public static final String JSON_PROPERTY_AVAILABLE_FROM = "availableFrom";
  @javax.annotation.Nullable
  private OffsetDateTime availableFrom;

  public static final String JSON_PROPERTY_LINE_ITEMS = "lineItems";
  @javax.annotation.Nullable
  private List<LineItemCreate> lineItems = new ArrayList<>();

  public static final String JSON_PROPERTY_AVAILABLE_UNTIL = "availableUntil";
  @javax.annotation.Nullable
  private OffsetDateTime availableUntil;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nullable
  private String currency;

  public static final String JSON_PROPERTY_MAXIMAL_NUMBER_OF_TRANSACTIONS = "maximalNumberOfTransactions";
  @javax.annotation.Nullable
  private Integer maximalNumberOfTransactions;

  public static final String JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_CONFIGURATIONS = "allowedPaymentMethodConfigurations";
  @javax.annotation.Nullable
  private Set<PaymentMethodConfiguration> allowedPaymentMethodConfigurations = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_APPLIED_SPACE_VIEW = "appliedSpaceView";
  @javax.annotation.Nullable
  private Long appliedSpaceView;

  public static final String JSON_PROPERTY_BILLING_ADDRESS_HANDLING_MODE = "billingAddressHandlingMode";
  @javax.annotation.Nullable
  private PaymentLinkAddressHandlingMode billingAddressHandlingMode;

  public PaymentLinkUpdate() {
  }

  public PaymentLinkUpdate shippingAddressHandlingMode(@javax.annotation.Nullable PaymentLinkAddressHandlingMode shippingAddressHandlingMode) {
    
    this.shippingAddressHandlingMode = shippingAddressHandlingMode;
    return this;
  }

  /**
   * Get shippingAddressHandlingMode
   * @return shippingAddressHandlingMode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SHIPPING_ADDRESS_HANDLING_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentLinkAddressHandlingMode getShippingAddressHandlingMode() {
    return shippingAddressHandlingMode;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_ADDRESS_HANDLING_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingAddressHandlingMode(@javax.annotation.Nullable PaymentLinkAddressHandlingMode shippingAddressHandlingMode) {
    this.shippingAddressHandlingMode = shippingAddressHandlingMode;
  }

  public PaymentLinkUpdate allowedRedirectionDomains(@javax.annotation.Nullable Set<String> allowedRedirectionDomains) {
    
    this.allowedRedirectionDomains = allowedRedirectionDomains;
    return this;
  }

  public PaymentLinkUpdate addAllowedRedirectionDomainsItem(String allowedRedirectionDomainsItem) {
    if (this.allowedRedirectionDomains == null) {
      this.allowedRedirectionDomains = new LinkedHashSet<>();
    }
    this.allowedRedirectionDomains.add(allowedRedirectionDomainsItem);
    return this;
  }

  /**
   * The domains to which the user is allowed to be redirected after the payment is completed. The following options can be configured: Exact domain: enter a full domain, e.g. (https://example.com). Wildcard domain: use to allow subdomains, e.g. (https://_*.example.com). All domains: use (ALL) to allow redirection to any domain (not recommended for security reasons). No domains : use (NONE) to disallow any redirection. Only one option per line is allowed. Invalid entries will be rejected. 
   * @return allowedRedirectionDomains
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWED_REDIRECTION_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getAllowedRedirectionDomains() {
    return allowedRedirectionDomains;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_ALLOWED_REDIRECTION_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedRedirectionDomains(@javax.annotation.Nullable Set<String> allowedRedirectionDomains) {
    this.allowedRedirectionDomains = allowedRedirectionDomains;
  }

  public PaymentLinkUpdate language(@javax.annotation.Nullable String language) {
    
    this.language = language;
    return this;
  }

  /**
   * The language for displaying the payment page. If not specified, it can be supplied via the &#39;language&#39; request parameter.
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

  public PaymentLinkUpdate version(@javax.annotation.Nonnull Integer version) {
    
    this.version = version;
    return this;
  }

  /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersion(@javax.annotation.Nonnull Integer version) {
    this.version = version;
  }

  public PaymentLinkUpdate availableFrom(@javax.annotation.Nullable OffsetDateTime availableFrom) {
    
    this.availableFrom = availableFrom;
    return this;
  }

  /**
   * The earliest date the payment link can be used to initiate a transaction. If no date is provided, the link will be available immediately.
   * @return availableFrom
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVAILABLE_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getAvailableFrom() {
    return availableFrom;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABLE_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailableFrom(@javax.annotation.Nullable OffsetDateTime availableFrom) {
    this.availableFrom = availableFrom;
  }

  public PaymentLinkUpdate lineItems(@javax.annotation.Nullable List<LineItemCreate> lineItems) {
    
    this.lineItems = lineItems;
    return this;
  }

  public PaymentLinkUpdate addLineItemsItem(LineItemCreate lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

  /**
   * The line items representing what is being sold. If not specified, they can be supplied via request parameters.
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

  public PaymentLinkUpdate availableUntil(@javax.annotation.Nullable OffsetDateTime availableUntil) {
    
    this.availableUntil = availableUntil;
    return this;
  }

  /**
   * The latest date the payment link can be used to initiate a transaction. If no date is provided, the link will remain available indefinitely.
   * @return availableUntil
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVAILABLE_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getAvailableUntil() {
    return availableUntil;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABLE_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailableUntil(@javax.annotation.Nullable OffsetDateTime availableUntil) {
    this.availableUntil = availableUntil;
  }

  public PaymentLinkUpdate name(@javax.annotation.Nullable String name) {
    
    this.name = name;
    return this;
  }

  /**
   * The name used to identify the payment link.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }

  public PaymentLinkUpdate currency(@javax.annotation.Nullable String currency) {
    
    this.currency = currency;
    return this;
  }

  /**
   * The three-letter currency code (ISO 4217). If not specified, it must be provided in the &#39;currency&#39; request parameter.
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

  public PaymentLinkUpdate maximalNumberOfTransactions(@javax.annotation.Nullable Integer maximalNumberOfTransactions) {
    
    this.maximalNumberOfTransactions = maximalNumberOfTransactions;
    return this;
  }

  /**
   * The maximum number of transactions that can be initiated using the payment link.
   * @return maximalNumberOfTransactions
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAXIMAL_NUMBER_OF_TRANSACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaximalNumberOfTransactions() {
    return maximalNumberOfTransactions;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMAL_NUMBER_OF_TRANSACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximalNumberOfTransactions(@javax.annotation.Nullable Integer maximalNumberOfTransactions) {
    this.maximalNumberOfTransactions = maximalNumberOfTransactions;
  }

  public PaymentLinkUpdate allowedPaymentMethodConfigurations(@javax.annotation.Nullable Set<PaymentMethodConfiguration> allowedPaymentMethodConfigurations) {
    
    this.allowedPaymentMethodConfigurations = allowedPaymentMethodConfigurations;
    return this;
  }

  public PaymentLinkUpdate addAllowedPaymentMethodConfigurationsItem(PaymentMethodConfiguration allowedPaymentMethodConfigurationsItem) {
    if (this.allowedPaymentMethodConfigurations == null) {
      this.allowedPaymentMethodConfigurations = new LinkedHashSet<>();
    }
    this.allowedPaymentMethodConfigurations.add(allowedPaymentMethodConfigurationsItem);
    return this;
  }

  /**
   * The payment method configurations that customers can use for making payments.
   * @return allowedPaymentMethodConfigurations
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<PaymentMethodConfiguration> getAllowedPaymentMethodConfigurations() {
    return allowedPaymentMethodConfigurations;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_ALLOWED_PAYMENT_METHOD_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedPaymentMethodConfigurations(@javax.annotation.Nullable Set<PaymentMethodConfiguration> allowedPaymentMethodConfigurations) {
    this.allowedPaymentMethodConfigurations = allowedPaymentMethodConfigurations;
  }

  public PaymentLinkUpdate appliedSpaceView(@javax.annotation.Nullable Long appliedSpaceView) {
    
    this.appliedSpaceView = appliedSpaceView;
    return this;
  }

  /**
   * The payment link can be used within a specific space view, which may apply a customized design to the payment page.
   * @return appliedSpaceView
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLIED_SPACE_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAppliedSpaceView() {
    return appliedSpaceView;
  }


  @JsonProperty(JSON_PROPERTY_APPLIED_SPACE_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppliedSpaceView(@javax.annotation.Nullable Long appliedSpaceView) {
    this.appliedSpaceView = appliedSpaceView;
  }

  public PaymentLinkUpdate billingAddressHandlingMode(@javax.annotation.Nullable PaymentLinkAddressHandlingMode billingAddressHandlingMode) {
    
    this.billingAddressHandlingMode = billingAddressHandlingMode;
    return this;
  }

  /**
   * Get billingAddressHandlingMode
   * @return billingAddressHandlingMode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS_HANDLING_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentLinkAddressHandlingMode getBillingAddressHandlingMode() {
    return billingAddressHandlingMode;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS_HANDLING_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingAddressHandlingMode(@javax.annotation.Nullable PaymentLinkAddressHandlingMode billingAddressHandlingMode) {
    this.billingAddressHandlingMode = billingAddressHandlingMode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentLinkUpdate paymentLinkUpdate = (PaymentLinkUpdate) o;
    return Objects.equals(this.shippingAddressHandlingMode, paymentLinkUpdate.shippingAddressHandlingMode) &&
        Objects.equals(this.allowedRedirectionDomains, paymentLinkUpdate.allowedRedirectionDomains) &&
        Objects.equals(this.language, paymentLinkUpdate.language) &&
        Objects.equals(this.version, paymentLinkUpdate.version) &&
        Objects.equals(this.availableFrom, paymentLinkUpdate.availableFrom) &&
        Objects.equals(this.lineItems, paymentLinkUpdate.lineItems) &&
        Objects.equals(this.availableUntil, paymentLinkUpdate.availableUntil) &&
        Objects.equals(this.name, paymentLinkUpdate.name) &&
        Objects.equals(this.currency, paymentLinkUpdate.currency) &&
        Objects.equals(this.maximalNumberOfTransactions, paymentLinkUpdate.maximalNumberOfTransactions) &&
        Objects.equals(this.allowedPaymentMethodConfigurations, paymentLinkUpdate.allowedPaymentMethodConfigurations) &&
        Objects.equals(this.appliedSpaceView, paymentLinkUpdate.appliedSpaceView) &&
        Objects.equals(this.billingAddressHandlingMode, paymentLinkUpdate.billingAddressHandlingMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingAddressHandlingMode, allowedRedirectionDomains, language, version, availableFrom, lineItems, availableUntil, name, currency, maximalNumberOfTransactions, allowedPaymentMethodConfigurations, appliedSpaceView, billingAddressHandlingMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentLinkUpdate {\n");
    sb.append("    shippingAddressHandlingMode: ").append(toIndentedString(shippingAddressHandlingMode)).append("\n");
    sb.append("    allowedRedirectionDomains: ").append(toIndentedString(allowedRedirectionDomains)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    availableFrom: ").append(toIndentedString(availableFrom)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    availableUntil: ").append(toIndentedString(availableUntil)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    maximalNumberOfTransactions: ").append(toIndentedString(maximalNumberOfTransactions)).append("\n");
    sb.append("    allowedPaymentMethodConfigurations: ").append(toIndentedString(allowedPaymentMethodConfigurations)).append("\n");
    sb.append("    appliedSpaceView: ").append(toIndentedString(appliedSpaceView)).append("\n");
    sb.append("    billingAddressHandlingMode: ").append(toIndentedString(billingAddressHandlingMode)).append("\n");
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

    // add `language` to the URL query string
    if (getLanguage() != null) {
      try {
        joiner.add(String.format("%slanguage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLanguage()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `availableFrom` to the URL query string
    if (getAvailableFrom() != null) {
      try {
        joiner.add(String.format("%savailableFrom%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAvailableFrom()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `availableUntil` to the URL query string
    if (getAvailableUntil() != null) {
      try {
        joiner.add(String.format("%savailableUntil%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAvailableUntil()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

    // add `maximalNumberOfTransactions` to the URL query string
    if (getMaximalNumberOfTransactions() != null) {
      try {
        joiner.add(String.format("%smaximalNumberOfTransactions%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaximalNumberOfTransactions()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

