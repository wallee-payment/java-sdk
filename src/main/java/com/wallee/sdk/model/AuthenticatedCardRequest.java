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
import com.wallee.sdk.model.AuthenticatedCardDataCreate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AuthenticatedCardRequest
 */
@JsonPropertyOrder({
  AuthenticatedCardRequest.JSON_PROPERTY_CARD_DATA,
  AuthenticatedCardRequest.JSON_PROPERTY_PAYMENT_METHOD_CONFIGURATION
})

public class AuthenticatedCardRequest {
  public static final String JSON_PROPERTY_CARD_DATA = "cardData";
  @javax.annotation.Nullable
  private AuthenticatedCardDataCreate cardData;

  public static final String JSON_PROPERTY_PAYMENT_METHOD_CONFIGURATION = "paymentMethodConfiguration";
  @javax.annotation.Nullable
  private Long paymentMethodConfiguration;

  public AuthenticatedCardRequest() {
  }

  public AuthenticatedCardRequest cardData(@javax.annotation.Nullable AuthenticatedCardDataCreate cardData) {
    
    this.cardData = cardData;
    return this;
  }

  /**
   * Get cardData
   * @return cardData
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARD_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AuthenticatedCardDataCreate getCardData() {
    return cardData;
  }


  @JsonProperty(JSON_PROPERTY_CARD_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardData(@javax.annotation.Nullable AuthenticatedCardDataCreate cardData) {
    this.cardData = cardData;
  }

  public AuthenticatedCardRequest paymentMethodConfiguration(@javax.annotation.Nullable Long paymentMethodConfiguration) {
    
    this.paymentMethodConfiguration = paymentMethodConfiguration;
    return this;
  }

  /**
   * The ID of the payment method configuration to use.
   * @return paymentMethodConfiguration
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPaymentMethodConfiguration() {
    return paymentMethodConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethodConfiguration(@javax.annotation.Nullable Long paymentMethodConfiguration) {
    this.paymentMethodConfiguration = paymentMethodConfiguration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticatedCardRequest authenticatedCardRequest = (AuthenticatedCardRequest) o;
    return Objects.equals(this.cardData, authenticatedCardRequest.cardData) &&
        Objects.equals(this.paymentMethodConfiguration, authenticatedCardRequest.paymentMethodConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardData, paymentMethodConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticatedCardRequest {\n");
    sb.append("    cardData: ").append(toIndentedString(cardData)).append("\n");
    sb.append("    paymentMethodConfiguration: ").append(toIndentedString(paymentMethodConfiguration)).append("\n");
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

    // add `cardData` to the URL query string
    if (getCardData() != null) {
      joiner.add(getCardData().toUrlQueryString(prefix + "cardData" + suffix));
    }

    // add `paymentMethodConfiguration` to the URL query string
    if (getPaymentMethodConfiguration() != null) {
      try {
        joiner.add(String.format("%spaymentMethodConfiguration%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentMethodConfiguration()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

