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
import com.wallee.sdk.model.ChargeAttemptEnvironment;
import com.wallee.sdk.model.LineItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ExpressCheckoutSessionCreate
 */
@JsonPropertyOrder({
  ExpressCheckoutSessionCreate.JSON_PROPERTY_LINE_ITEMS,
  ExpressCheckoutSessionCreate.JSON_PROPERTY_MERCHANT_SHIPPING_CALLBACK_URL,
  ExpressCheckoutSessionCreate.JSON_PROPERTY_MERCHANT_REDIRECT_URL,
  ExpressCheckoutSessionCreate.JSON_PROPERTY_AUTHORIZATION_ENVIRONMENT,
  ExpressCheckoutSessionCreate.JSON_PROPERTY_TIME_ZONE,
  ExpressCheckoutSessionCreate.JSON_PROPERTY_CURRENCY,
  ExpressCheckoutSessionCreate.JSON_PROPERTY_LANGUAGE
})
@JsonTypeName("ExpressCheckoutSession.Create")

public class ExpressCheckoutSessionCreate {
  public static final String JSON_PROPERTY_LINE_ITEMS = "lineItems";
  @javax.annotation.Nonnull
  private List<LineItem> lineItems = new ArrayList<>();

  public static final String JSON_PROPERTY_MERCHANT_SHIPPING_CALLBACK_URL = "merchantShippingCallbackUrl";
  @javax.annotation.Nullable
  private String merchantShippingCallbackUrl;

  public static final String JSON_PROPERTY_MERCHANT_REDIRECT_URL = "merchantRedirectUrl";
  @javax.annotation.Nonnull
  private String merchantRedirectUrl;

  public static final String JSON_PROPERTY_AUTHORIZATION_ENVIRONMENT = "authorizationEnvironment";
  @javax.annotation.Nonnull
  private ChargeAttemptEnvironment authorizationEnvironment;

  public static final String JSON_PROPERTY_TIME_ZONE = "timeZone";
  @javax.annotation.Nullable
  private String timeZone;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nonnull
  private String currency;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  @javax.annotation.Nullable
  private String language;

  public ExpressCheckoutSessionCreate() {
  }

  public ExpressCheckoutSessionCreate lineItems(@javax.annotation.Nonnull List<LineItem> lineItems) {
    
    this.lineItems = lineItems;
    return this;
  }

  public ExpressCheckoutSessionCreate addLineItemsItem(LineItem lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

  /**
   * Get lineItems
   * @return lineItems
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<LineItem> getLineItems() {
    return lineItems;
  }


  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLineItems(@javax.annotation.Nonnull List<LineItem> lineItems) {
    this.lineItems = lineItems;
  }

  public ExpressCheckoutSessionCreate merchantShippingCallbackUrl(@javax.annotation.Nullable String merchantShippingCallbackUrl) {
    
    this.merchantShippingCallbackUrl = merchantShippingCallbackUrl;
    return this;
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


  @JsonProperty(JSON_PROPERTY_MERCHANT_SHIPPING_CALLBACK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantShippingCallbackUrl(@javax.annotation.Nullable String merchantShippingCallbackUrl) {
    this.merchantShippingCallbackUrl = merchantShippingCallbackUrl;
  }

  public ExpressCheckoutSessionCreate merchantRedirectUrl(@javax.annotation.Nonnull String merchantRedirectUrl) {
    
    this.merchantRedirectUrl = merchantRedirectUrl;
    return this;
  }

  /**
   * The base URL on the merchant shop used to create the order.
   * @return merchantRedirectUrl
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MERCHANT_REDIRECT_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMerchantRedirectUrl() {
    return merchantRedirectUrl;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_REDIRECT_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMerchantRedirectUrl(@javax.annotation.Nonnull String merchantRedirectUrl) {
    this.merchantRedirectUrl = merchantRedirectUrl;
  }

  public ExpressCheckoutSessionCreate authorizationEnvironment(@javax.annotation.Nonnull ChargeAttemptEnvironment authorizationEnvironment) {
    
    this.authorizationEnvironment = authorizationEnvironment;
    return this;
  }

  /**
   * Get authorizationEnvironment
   * @return authorizationEnvironment
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ChargeAttemptEnvironment getAuthorizationEnvironment() {
    return authorizationEnvironment;
  }


  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAuthorizationEnvironment(@javax.annotation.Nonnull ChargeAttemptEnvironment authorizationEnvironment) {
    this.authorizationEnvironment = authorizationEnvironment;
  }

  public ExpressCheckoutSessionCreate timeZone(@javax.annotation.Nullable String timeZone) {
    
    this.timeZone = timeZone;
    return this;
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


  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeZone(@javax.annotation.Nullable String timeZone) {
    this.timeZone = timeZone;
  }

  public ExpressCheckoutSessionCreate currency(@javax.annotation.Nonnull String currency) {
    
    this.currency = currency;
    return this;
  }

  /**
   * The currency of the session.
   * @return currency
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrency(@javax.annotation.Nonnull String currency) {
    this.currency = currency;
  }

  public ExpressCheckoutSessionCreate language(@javax.annotation.Nullable String language) {
    
    this.language = language;
    return this;
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


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(@javax.annotation.Nullable String language) {
    this.language = language;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpressCheckoutSessionCreate expressCheckoutSessionCreate = (ExpressCheckoutSessionCreate) o;
    return Objects.equals(this.lineItems, expressCheckoutSessionCreate.lineItems) &&
        Objects.equals(this.merchantShippingCallbackUrl, expressCheckoutSessionCreate.merchantShippingCallbackUrl) &&
        Objects.equals(this.merchantRedirectUrl, expressCheckoutSessionCreate.merchantRedirectUrl) &&
        Objects.equals(this.authorizationEnvironment, expressCheckoutSessionCreate.authorizationEnvironment) &&
        Objects.equals(this.timeZone, expressCheckoutSessionCreate.timeZone) &&
        Objects.equals(this.currency, expressCheckoutSessionCreate.currency) &&
        Objects.equals(this.language, expressCheckoutSessionCreate.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineItems, merchantShippingCallbackUrl, merchantRedirectUrl, authorizationEnvironment, timeZone, currency, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpressCheckoutSessionCreate {\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    merchantShippingCallbackUrl: ").append(toIndentedString(merchantShippingCallbackUrl)).append("\n");
    sb.append("    merchantRedirectUrl: ").append(toIndentedString(merchantRedirectUrl)).append("\n");
    sb.append("    authorizationEnvironment: ").append(toIndentedString(authorizationEnvironment)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

    // add `merchantShippingCallbackUrl` to the URL query string
    if (getMerchantShippingCallbackUrl() != null) {
      try {
        joiner.add(String.format("%smerchantShippingCallbackUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMerchantShippingCallbackUrl()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `authorizationEnvironment` to the URL query string
    if (getAuthorizationEnvironment() != null) {
      try {
        joiner.add(String.format("%sauthorizationEnvironment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthorizationEnvironment()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

