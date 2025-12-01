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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * RestCurrency
 */
@JsonPropertyOrder({
  RestCurrency.JSON_PROPERTY_NAME,
  RestCurrency.JSON_PROPERTY_FRACTION_DIGITS,
  RestCurrency.JSON_PROPERTY_CURRENCY_CODE,
  RestCurrency.JSON_PROPERTY_NUMERIC_CODE
})

public class RestCurrency {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_FRACTION_DIGITS = "fractionDigits";
  @javax.annotation.Nullable
  private Integer fractionDigits;

  public static final String JSON_PROPERTY_CURRENCY_CODE = "currencyCode";
  @javax.annotation.Nullable
  private String currencyCode;

  public static final String JSON_PROPERTY_NUMERIC_CODE = "numericCode";
  @javax.annotation.Nullable
  private Integer numericCode;

  public RestCurrency() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public RestCurrency(
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_FRACTION_DIGITS) Integer fractionDigits, 
    @JsonProperty(JSON_PROPERTY_CURRENCY_CODE) String currencyCode, 
    @JsonProperty(JSON_PROPERTY_NUMERIC_CODE) Integer numericCode
  ) {
    this();
    this.name = name;
    this.fractionDigits = fractionDigits;
    this.currencyCode = currencyCode;
    this.numericCode = numericCode;
  }

  /**
   * The name of the currency.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }



  /**
   * The currency&#39;s number of decimals. When calculating amounts in this currency, the fraction digits determine the accuracy.
   * @return fractionDigits
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FRACTION_DIGITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFractionDigits() {
    return fractionDigits;
  }



  /**
   * The currency&#39;s three-letter code (ISO 4217 format).
   * @return currencyCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrencyCode() {
    return currencyCode;
  }



  /**
   * The currency&#39;s three-digit code (ISO 4217 format).
   * @return numericCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMERIC_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumericCode() {
    return numericCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestCurrency restCurrency = (RestCurrency) o;
    return Objects.equals(this.name, restCurrency.name) &&
        Objects.equals(this.fractionDigits, restCurrency.fractionDigits) &&
        Objects.equals(this.currencyCode, restCurrency.currencyCode) &&
        Objects.equals(this.numericCode, restCurrency.numericCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, fractionDigits, currencyCode, numericCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestCurrency {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fractionDigits: ").append(toIndentedString(fractionDigits)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    numericCode: ").append(toIndentedString(numericCode)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `fractionDigits` to the URL query string
    if (getFractionDigits() != null) {
      try {
        joiner.add(String.format("%sfractionDigits%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFractionDigits()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `currencyCode` to the URL query string
    if (getCurrencyCode() != null) {
      try {
        joiner.add(String.format("%scurrencyCode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCurrencyCode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `numericCode` to the URL query string
    if (getNumericCode() != null) {
      try {
        joiner.add(String.format("%snumericCode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNumericCode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

