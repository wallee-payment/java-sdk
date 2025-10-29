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
import com.wallee.sdk.model.CardCryptogram;
import com.wallee.sdk.model.CardholderAuthentication;
import com.wallee.sdk.model.RecurringIndicator;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AuthenticatedCardData
 */
@JsonPropertyOrder({
  AuthenticatedCardData.JSON_PROPERTY_INITIAL_RECURRING_TRANSACTION,
  AuthenticatedCardData.JSON_PROPERTY_RECURRING_INDICATOR,
  AuthenticatedCardData.JSON_PROPERTY_TOKEN_REQUESTOR_ID,
  AuthenticatedCardData.JSON_PROPERTY_CRYPTOGRAM,
  AuthenticatedCardData.JSON_PROPERTY_CARDHOLDER_AUTHENTICATION
})

public class AuthenticatedCardData {
  public static final String JSON_PROPERTY_INITIAL_RECURRING_TRANSACTION = "initialRecurringTransaction";
  private Boolean initialRecurringTransaction;

  public static final String JSON_PROPERTY_RECURRING_INDICATOR = "recurringIndicator";
  private RecurringIndicator recurringIndicator;

  public static final String JSON_PROPERTY_TOKEN_REQUESTOR_ID = "tokenRequestorId";
  private String tokenRequestorId;

  public static final String JSON_PROPERTY_CRYPTOGRAM = "cryptogram";
  private CardCryptogram cryptogram;

  public static final String JSON_PROPERTY_CARDHOLDER_AUTHENTICATION = "cardholderAuthentication";
  private CardholderAuthentication cardholderAuthentication;

  public AuthenticatedCardData() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public AuthenticatedCardData(
    @JsonProperty(JSON_PROPERTY_INITIAL_RECURRING_TRANSACTION) Boolean initialRecurringTransaction, 
    @JsonProperty(JSON_PROPERTY_TOKEN_REQUESTOR_ID) String tokenRequestorId
  ) {
    this();
    this.initialRecurringTransaction = initialRecurringTransaction;
    this.tokenRequestorId = tokenRequestorId;
  }

   /**
   * Whether the transaction is an initial recurring transaction, based on the recurring indicator. This is used to identify the first transaction in a recurring payment setup.
   * @return initialRecurringTransaction
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INITIAL_RECURRING_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInitialRecurringTransaction() {
    return initialRecurringTransaction;
  }



  public AuthenticatedCardData recurringIndicator(RecurringIndicator recurringIndicator) {
    
    this.recurringIndicator = recurringIndicator;
    return this;
  }

   /**
   * Get recurringIndicator
   * @return recurringIndicator
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECURRING_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecurringIndicator getRecurringIndicator() {
    return recurringIndicator;
  }


  @JsonProperty(JSON_PROPERTY_RECURRING_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringIndicator(RecurringIndicator recurringIndicator) {
    this.recurringIndicator = recurringIndicator;
  }

   /**
   * The token requestor identifier (TRID) identifies the entity requesting tokenization for a card transaction.
   * @return tokenRequestorId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN_REQUESTOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTokenRequestorId() {
    return tokenRequestorId;
  }



  public AuthenticatedCardData cryptogram(CardCryptogram cryptogram) {
    
    this.cryptogram = cryptogram;
    return this;
  }

   /**
   * Get cryptogram
   * @return cryptogram
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CRYPTOGRAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CardCryptogram getCryptogram() {
    return cryptogram;
  }


  @JsonProperty(JSON_PROPERTY_CRYPTOGRAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCryptogram(CardCryptogram cryptogram) {
    this.cryptogram = cryptogram;
  }

  public AuthenticatedCardData cardholderAuthentication(CardholderAuthentication cardholderAuthentication) {
    
    this.cardholderAuthentication = cardholderAuthentication;
    return this;
  }

   /**
   * Get cardholderAuthentication
   * @return cardholderAuthentication
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARDHOLDER_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CardholderAuthentication getCardholderAuthentication() {
    return cardholderAuthentication;
  }


  @JsonProperty(JSON_PROPERTY_CARDHOLDER_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardholderAuthentication(CardholderAuthentication cardholderAuthentication) {
    this.cardholderAuthentication = cardholderAuthentication;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticatedCardData authenticatedCardData = (AuthenticatedCardData) o;
    return Objects.equals(this.initialRecurringTransaction, authenticatedCardData.initialRecurringTransaction) &&
        Objects.equals(this.recurringIndicator, authenticatedCardData.recurringIndicator) &&
        Objects.equals(this.tokenRequestorId, authenticatedCardData.tokenRequestorId) &&
        Objects.equals(this.cryptogram, authenticatedCardData.cryptogram) &&
        Objects.equals(this.cardholderAuthentication, authenticatedCardData.cardholderAuthentication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initialRecurringTransaction, recurringIndicator, tokenRequestorId, cryptogram, cardholderAuthentication);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticatedCardData {\n");
    sb.append("    initialRecurringTransaction: ").append(toIndentedString(initialRecurringTransaction)).append("\n");
    sb.append("    recurringIndicator: ").append(toIndentedString(recurringIndicator)).append("\n");
    sb.append("    tokenRequestorId: ").append(toIndentedString(tokenRequestorId)).append("\n");
    sb.append("    cryptogram: ").append(toIndentedString(cryptogram)).append("\n");
    sb.append("    cardholderAuthentication: ").append(toIndentedString(cardholderAuthentication)).append("\n");
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

    // add `initialRecurringTransaction` to the URL query string
    if (getInitialRecurringTransaction() != null) {
      try {
        joiner.add(String.format("%sinitialRecurringTransaction%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInitialRecurringTransaction()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `recurringIndicator` to the URL query string
    if (getRecurringIndicator() != null) {
      try {
        joiner.add(String.format("%srecurringIndicator%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRecurringIndicator()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `tokenRequestorId` to the URL query string
    if (getTokenRequestorId() != null) {
      try {
        joiner.add(String.format("%stokenRequestorId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTokenRequestorId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `cryptogram` to the URL query string
    if (getCryptogram() != null) {
      joiner.add(getCryptogram().toUrlQueryString(prefix + "cryptogram" + suffix));
    }

    // add `cardholderAuthentication` to the URL query string
    if (getCardholderAuthentication() != null) {
      joiner.add(getCardholderAuthentication().toUrlQueryString(prefix + "cardholderAuthentication" + suffix));
    }

    return joiner.toString();
  }

}

