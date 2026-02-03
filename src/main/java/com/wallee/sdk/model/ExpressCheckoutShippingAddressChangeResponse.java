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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ExpressCheckoutShippingAddressChangeResponse
 */
@JsonPropertyOrder({
  ExpressCheckoutShippingAddressChangeResponse.JSON_PROPERTY_ORDER_TOTAL,
  ExpressCheckoutShippingAddressChangeResponse.JSON_PROPERTY_SHIPPING_OPTIONS
})

public class ExpressCheckoutShippingAddressChangeResponse {
  public static final String JSON_PROPERTY_ORDER_TOTAL = "orderTotal";
  @javax.annotation.Nullable
  private BigDecimal orderTotal;

  public static final String JSON_PROPERTY_SHIPPING_OPTIONS = "shippingOptions";
  @javax.annotation.Nullable
  private List<ExpressCheckoutShippingOption> shippingOptions = new ArrayList<>();

  public ExpressCheckoutShippingAddressChangeResponse() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public ExpressCheckoutShippingAddressChangeResponse(
    @JsonProperty(JSON_PROPERTY_ORDER_TOTAL) BigDecimal orderTotal, 
    @JsonProperty(JSON_PROPERTY_SHIPPING_OPTIONS) List<ExpressCheckoutShippingOption> shippingOptions
  ) {
    this();
    this.orderTotal = orderTotal;
    this.shippingOptions = shippingOptions;
  }

  /**
   * Get orderTotal
   * @return orderTotal
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORDER_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOrderTotal() {
    return orderTotal;
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpressCheckoutShippingAddressChangeResponse expressCheckoutShippingAddressChangeResponse = (ExpressCheckoutShippingAddressChangeResponse) o;
    return Objects.equals(this.orderTotal, expressCheckoutShippingAddressChangeResponse.orderTotal) &&
        Objects.equals(this.shippingOptions, expressCheckoutShippingAddressChangeResponse.shippingOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderTotal, shippingOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpressCheckoutShippingAddressChangeResponse {\n");
    sb.append("    orderTotal: ").append(toIndentedString(orderTotal)).append("\n");
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

    // add `orderTotal` to the URL query string
    if (getOrderTotal() != null) {
      try {
        joiner.add(String.format("%sorderTotal%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOrderTotal()), "UTF-8").replaceAll("\\+", "%20")));
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

