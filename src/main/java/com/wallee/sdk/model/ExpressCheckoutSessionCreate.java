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
import com.wallee.sdk.model.ExpressCheckoutShippingOption;
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
  ExpressCheckoutSessionCreate.JSON_PROPERTY_CURRENCY,
  ExpressCheckoutSessionCreate.JSON_PROPERTY_SHIPPING_OPTIONS
})
@JsonTypeName("ExpressCheckoutSession.Create")

public class ExpressCheckoutSessionCreate {
  public static final String JSON_PROPERTY_LINE_ITEMS = "lineItems";
  @javax.annotation.Nullable
  private List<LineItem> lineItems = new ArrayList<>();

  public static final String JSON_PROPERTY_MERCHANT_SHIPPING_CALLBACK_URL = "merchantShippingCallbackUrl";
  @javax.annotation.Nullable
  private String merchantShippingCallbackUrl;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nullable
  private String currency;

  public static final String JSON_PROPERTY_SHIPPING_OPTIONS = "shippingOptions";
  @javax.annotation.Nullable
  private List<ExpressCheckoutShippingOption> shippingOptions = new ArrayList<>();

  public ExpressCheckoutSessionCreate() {
  }

  public ExpressCheckoutSessionCreate lineItems(@javax.annotation.Nullable List<LineItem> lineItems) {
    
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
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LineItem> getLineItems() {
    return lineItems;
  }


  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineItems(@javax.annotation.Nullable List<LineItem> lineItems) {
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

  public ExpressCheckoutSessionCreate currency(@javax.annotation.Nullable String currency) {
    
    this.currency = currency;
    return this;
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


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
  }

  public ExpressCheckoutSessionCreate shippingOptions(@javax.annotation.Nullable List<ExpressCheckoutShippingOption> shippingOptions) {
    
    this.shippingOptions = shippingOptions;
    return this;
  }

  public ExpressCheckoutSessionCreate addShippingOptionsItem(ExpressCheckoutShippingOption shippingOptionsItem) {
    if (this.shippingOptions == null) {
      this.shippingOptions = new ArrayList<>();
    }
    this.shippingOptions.add(shippingOptionsItem);
    return this;
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


  @JsonProperty(JSON_PROPERTY_SHIPPING_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingOptions(@javax.annotation.Nullable List<ExpressCheckoutShippingOption> shippingOptions) {
    this.shippingOptions = shippingOptions;
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
        Objects.equals(this.currency, expressCheckoutSessionCreate.currency) &&
        Objects.equals(this.shippingOptions, expressCheckoutSessionCreate.shippingOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineItems, merchantShippingCallbackUrl, currency, shippingOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpressCheckoutSessionCreate {\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    merchantShippingCallbackUrl: ").append(toIndentedString(merchantShippingCallbackUrl)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    shippingOptions: ").append(toIndentedString(shippingOptions)).append("\n");
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

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      try {
        joiner.add(String.format("%scurrency%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCurrency()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

