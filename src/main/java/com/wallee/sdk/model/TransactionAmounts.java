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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * TransactionAmounts
 */
@JsonPropertyOrder({
  TransactionAmounts.JSON_PROPERTY_COMPLETED_AMOUNT,
  TransactionAmounts.JSON_PROPERTY_AUTHORIZATION_AMOUNT,
  TransactionAmounts.JSON_PROPERTY_CURRENCY,
  TransactionAmounts.JSON_PROPERTY_REFUNDED_AMOUNT
})

public class TransactionAmounts {
  public static final String JSON_PROPERTY_COMPLETED_AMOUNT = "completedAmount";
  @javax.annotation.Nullable
  private BigDecimal completedAmount;

  public static final String JSON_PROPERTY_AUTHORIZATION_AMOUNT = "authorizationAmount";
  @javax.annotation.Nullable
  private BigDecimal authorizationAmount;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nullable
  private String currency;

  public static final String JSON_PROPERTY_REFUNDED_AMOUNT = "refundedAmount";
  @javax.annotation.Nullable
  private BigDecimal refundedAmount;

  public TransactionAmounts() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public TransactionAmounts(
    @JsonProperty(JSON_PROPERTY_COMPLETED_AMOUNT) BigDecimal completedAmount, 
    @JsonProperty(JSON_PROPERTY_AUTHORIZATION_AMOUNT) BigDecimal authorizationAmount, 
    @JsonProperty(JSON_PROPERTY_CURRENCY) String currency, 
    @JsonProperty(JSON_PROPERTY_REFUNDED_AMOUNT) BigDecimal refundedAmount
  ) {
    this();
    this.completedAmount = completedAmount;
    this.authorizationAmount = authorizationAmount;
    this.currency = currency;
    this.refundedAmount = refundedAmount;
  }

  /**
   * Get completedAmount
   * @return completedAmount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCompletedAmount() {
    return completedAmount;
  }



  /**
   * Get authorizationAmount
   * @return authorizationAmount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAuthorizationAmount() {
    return authorizationAmount;
  }



  /**
   * Get currency
   * @return currency
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }



  /**
   * Get refundedAmount
   * @return refundedAmount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFUNDED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRefundedAmount() {
    return refundedAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionAmounts transactionAmounts = (TransactionAmounts) o;
    return Objects.equals(this.completedAmount, transactionAmounts.completedAmount) &&
        Objects.equals(this.authorizationAmount, transactionAmounts.authorizationAmount) &&
        Objects.equals(this.currency, transactionAmounts.currency) &&
        Objects.equals(this.refundedAmount, transactionAmounts.refundedAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completedAmount, authorizationAmount, currency, refundedAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionAmounts {\n");
    sb.append("    completedAmount: ").append(toIndentedString(completedAmount)).append("\n");
    sb.append("    authorizationAmount: ").append(toIndentedString(authorizationAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    refundedAmount: ").append(toIndentedString(refundedAmount)).append("\n");
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

    // add `completedAmount` to the URL query string
    if (getCompletedAmount() != null) {
      try {
        joiner.add(String.format("%scompletedAmount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCompletedAmount()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      try {
        joiner.add(String.format("%scurrency%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCurrency()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `refundedAmount` to the URL query string
    if (getRefundedAmount() != null) {
      try {
        joiner.add(String.format("%srefundedAmount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRefundedAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

