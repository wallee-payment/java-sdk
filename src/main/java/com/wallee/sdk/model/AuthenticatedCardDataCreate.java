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
import com.wallee.sdk.model.CardCryptogramCreate;
import com.wallee.sdk.model.CardholderAuthenticationCreate;
import com.wallee.sdk.model.PanType;
import com.wallee.sdk.model.RecurringIndicator;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AuthenticatedCardDataCreate
 */
@JsonPropertyOrder({
  AuthenticatedCardDataCreate.JSON_PROPERTY_EXPIRY_DATE,
  AuthenticatedCardDataCreate.JSON_PROPERTY_PAN_TYPE,
  AuthenticatedCardDataCreate.JSON_PROPERTY_CARD_HOLDER_NAME,
  AuthenticatedCardDataCreate.JSON_PROPERTY_CARD_VERIFICATION_CODE,
  AuthenticatedCardDataCreate.JSON_PROPERTY_PRIMARY_ACCOUNT_NUMBER,
  AuthenticatedCardDataCreate.JSON_PROPERTY_RECURRING_INDICATOR,
  AuthenticatedCardDataCreate.JSON_PROPERTY_SCHEME_TRANSACTION_REFERENCE,
  AuthenticatedCardDataCreate.JSON_PROPERTY_CARDHOLDER_AUTHENTICATION,
  AuthenticatedCardDataCreate.JSON_PROPERTY_TOKEN_REQUESTOR_ID,
  AuthenticatedCardDataCreate.JSON_PROPERTY_CRYPTOGRAM
})
@JsonTypeName("AuthenticatedCardData.Create")

public class AuthenticatedCardDataCreate {
  public static final String JSON_PROPERTY_EXPIRY_DATE = "expiryDate";
  private String expiryDate;

  public static final String JSON_PROPERTY_PAN_TYPE = "panType";
  private PanType panType;

  public static final String JSON_PROPERTY_CARD_HOLDER_NAME = "cardHolderName";
  private String cardHolderName;

  public static final String JSON_PROPERTY_CARD_VERIFICATION_CODE = "cardVerificationCode";
  private String cardVerificationCode;

  public static final String JSON_PROPERTY_PRIMARY_ACCOUNT_NUMBER = "primaryAccountNumber";
  private String primaryAccountNumber;

  public static final String JSON_PROPERTY_RECURRING_INDICATOR = "recurringIndicator";
  private RecurringIndicator recurringIndicator;

  public static final String JSON_PROPERTY_SCHEME_TRANSACTION_REFERENCE = "schemeTransactionReference";
  private String schemeTransactionReference;

  public static final String JSON_PROPERTY_CARDHOLDER_AUTHENTICATION = "cardholderAuthentication";
  private CardholderAuthenticationCreate cardholderAuthentication;

  public static final String JSON_PROPERTY_TOKEN_REQUESTOR_ID = "tokenRequestorId";
  private String tokenRequestorId;

  public static final String JSON_PROPERTY_CRYPTOGRAM = "cryptogram";
  private CardCryptogramCreate cryptogram;

  public AuthenticatedCardDataCreate() {
  }

  public AuthenticatedCardDataCreate expiryDate(String expiryDate) {
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * The expiry date of the card, indicating its validity period in yyyy-mm format (e.g., 2023-09).
   * @return expiryDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpiryDate() {
    return expiryDate;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  public AuthenticatedCardDataCreate panType(PanType panType) {
    
    this.panType = panType;
    return this;
  }

   /**
   * Get panType
   * @return panType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PanType getPanType() {
    return panType;
  }


  @JsonProperty(JSON_PROPERTY_PAN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPanType(PanType panType) {
    this.panType = panType;
  }

  public AuthenticatedCardDataCreate cardHolderName(String cardHolderName) {
    
    this.cardHolderName = cardHolderName;
    return this;
  }

   /**
   * The name of the cardholder, as printed on the card, identifying the card owner.
   * @return cardHolderName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARD_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCardHolderName() {
    return cardHolderName;
  }


  @JsonProperty(JSON_PROPERTY_CARD_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
  }

  public AuthenticatedCardDataCreate cardVerificationCode(String cardVerificationCode) {
    
    this.cardVerificationCode = cardVerificationCode;
    return this;
  }

   /**
   * The security code used to validate the card during transactions.
   * @return cardVerificationCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CARD_VERIFICATION_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCardVerificationCode() {
    return cardVerificationCode;
  }


  @JsonProperty(JSON_PROPERTY_CARD_VERIFICATION_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardVerificationCode(String cardVerificationCode) {
    this.cardVerificationCode = cardVerificationCode;
  }

  public AuthenticatedCardDataCreate primaryAccountNumber(String primaryAccountNumber) {
    
    this.primaryAccountNumber = primaryAccountNumber;
    return this;
  }

   /**
   * The card&#39;s primary account number (PAN), the unique identifier of the card.
   * @return primaryAccountNumber
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PRIMARY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPrimaryAccountNumber() {
    return primaryAccountNumber;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrimaryAccountNumber(String primaryAccountNumber) {
    this.primaryAccountNumber = primaryAccountNumber;
  }

  public AuthenticatedCardDataCreate recurringIndicator(RecurringIndicator recurringIndicator) {
    
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

  public AuthenticatedCardDataCreate schemeTransactionReference(String schemeTransactionReference) {
    
    this.schemeTransactionReference = schemeTransactionReference;
    return this;
  }

   /**
   * A reference specific to the card&#39;s transaction within its payment scheme.
   * @return schemeTransactionReference
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEME_TRANSACTION_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSchemeTransactionReference() {
    return schemeTransactionReference;
  }


  @JsonProperty(JSON_PROPERTY_SCHEME_TRANSACTION_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchemeTransactionReference(String schemeTransactionReference) {
    this.schemeTransactionReference = schemeTransactionReference;
  }

  public AuthenticatedCardDataCreate cardholderAuthentication(CardholderAuthenticationCreate cardholderAuthentication) {
    
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

  public CardholderAuthenticationCreate getCardholderAuthentication() {
    return cardholderAuthentication;
  }


  @JsonProperty(JSON_PROPERTY_CARDHOLDER_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardholderAuthentication(CardholderAuthenticationCreate cardholderAuthentication) {
    this.cardholderAuthentication = cardholderAuthentication;
  }

  public AuthenticatedCardDataCreate tokenRequestorId(String tokenRequestorId) {
    
    this.tokenRequestorId = tokenRequestorId;
    return this;
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


  @JsonProperty(JSON_PROPERTY_TOKEN_REQUESTOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenRequestorId(String tokenRequestorId) {
    this.tokenRequestorId = tokenRequestorId;
  }

  public AuthenticatedCardDataCreate cryptogram(CardCryptogramCreate cryptogram) {
    
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

  public CardCryptogramCreate getCryptogram() {
    return cryptogram;
  }


  @JsonProperty(JSON_PROPERTY_CRYPTOGRAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCryptogram(CardCryptogramCreate cryptogram) {
    this.cryptogram = cryptogram;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticatedCardDataCreate authenticatedCardDataCreate = (AuthenticatedCardDataCreate) o;
    return Objects.equals(this.expiryDate, authenticatedCardDataCreate.expiryDate) &&
        Objects.equals(this.panType, authenticatedCardDataCreate.panType) &&
        Objects.equals(this.cardHolderName, authenticatedCardDataCreate.cardHolderName) &&
        Objects.equals(this.cardVerificationCode, authenticatedCardDataCreate.cardVerificationCode) &&
        Objects.equals(this.primaryAccountNumber, authenticatedCardDataCreate.primaryAccountNumber) &&
        Objects.equals(this.recurringIndicator, authenticatedCardDataCreate.recurringIndicator) &&
        Objects.equals(this.schemeTransactionReference, authenticatedCardDataCreate.schemeTransactionReference) &&
        Objects.equals(this.cardholderAuthentication, authenticatedCardDataCreate.cardholderAuthentication) &&
        Objects.equals(this.tokenRequestorId, authenticatedCardDataCreate.tokenRequestorId) &&
        Objects.equals(this.cryptogram, authenticatedCardDataCreate.cryptogram);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiryDate, panType, cardHolderName, cardVerificationCode, primaryAccountNumber, recurringIndicator, schemeTransactionReference, cardholderAuthentication, tokenRequestorId, cryptogram);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticatedCardDataCreate {\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    panType: ").append(toIndentedString(panType)).append("\n");
    sb.append("    cardHolderName: ").append(toIndentedString(cardHolderName)).append("\n");
    sb.append("    cardVerificationCode: ").append(toIndentedString(cardVerificationCode)).append("\n");
    sb.append("    primaryAccountNumber: ").append(toIndentedString(primaryAccountNumber)).append("\n");
    sb.append("    recurringIndicator: ").append(toIndentedString(recurringIndicator)).append("\n");
    sb.append("    schemeTransactionReference: ").append(toIndentedString(schemeTransactionReference)).append("\n");
    sb.append("    cardholderAuthentication: ").append(toIndentedString(cardholderAuthentication)).append("\n");
    sb.append("    tokenRequestorId: ").append(toIndentedString(tokenRequestorId)).append("\n");
    sb.append("    cryptogram: ").append(toIndentedString(cryptogram)).append("\n");
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

    // add `expiryDate` to the URL query string
    if (getExpiryDate() != null) {
      try {
        joiner.add(String.format("%sexpiryDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExpiryDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `panType` to the URL query string
    if (getPanType() != null) {
      try {
        joiner.add(String.format("%spanType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPanType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `cardHolderName` to the URL query string
    if (getCardHolderName() != null) {
      try {
        joiner.add(String.format("%scardHolderName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCardHolderName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `cardVerificationCode` to the URL query string
    if (getCardVerificationCode() != null) {
      try {
        joiner.add(String.format("%scardVerificationCode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCardVerificationCode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `primaryAccountNumber` to the URL query string
    if (getPrimaryAccountNumber() != null) {
      try {
        joiner.add(String.format("%sprimaryAccountNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPrimaryAccountNumber()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `schemeTransactionReference` to the URL query string
    if (getSchemeTransactionReference() != null) {
      try {
        joiner.add(String.format("%sschemeTransactionReference%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSchemeTransactionReference()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `cardholderAuthentication` to the URL query string
    if (getCardholderAuthentication() != null) {
      joiner.add(getCardholderAuthentication().toUrlQueryString(prefix + "cardholderAuthentication" + suffix));
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

    return joiner.toString();
  }

}

