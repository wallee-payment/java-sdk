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
 * CardCryptogram
 */
@JsonPropertyOrder({
  CardCryptogram.JSON_PROPERTY_ECI,
  CardCryptogram.JSON_PROPERTY_VALUE
})

public class CardCryptogram {
  public static final String JSON_PROPERTY_ECI = "eci";
  @javax.annotation.Nullable
  private String eci;

  public static final String JSON_PROPERTY_VALUE = "value";
  @javax.annotation.Nullable
  private String value;

  public CardCryptogram() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public CardCryptogram(
    @JsonProperty(JSON_PROPERTY_ECI) String eci, 
    @JsonProperty(JSON_PROPERTY_VALUE) String value
  ) {
    this();
    this.eci = eci;
    this.value = value;
  }

  /**
   * The Electronic Commerce Indicator (ECI) represents the authentication level and indicates liability shift during online or card-not-present transactions.
   * @return eci
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ECI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEci() {
    return eci;
  }



  /**
   * The cryptogram value used for securing card transactions, format varying based on the PAN type.
   * @return value
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardCryptogram cardCryptogram = (CardCryptogram) o;
    return Objects.equals(this.eci, cardCryptogram.eci) &&
        Objects.equals(this.value, cardCryptogram.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eci, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardCryptogram {\n");
    sb.append("    eci: ").append(toIndentedString(eci)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

    // add `eci` to the URL query string
    if (getEci() != null) {
      try {
        joiner.add(String.format("%seci%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEci()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `value` to the URL query string
    if (getValue() != null) {
      try {
        joiner.add(String.format("%svalue%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getValue()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

