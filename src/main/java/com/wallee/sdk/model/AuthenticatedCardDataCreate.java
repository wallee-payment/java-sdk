/**
* wallee SDK
*
* This library allows to interact with the wallee payment service.
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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wallee.sdk.model.CardCryptogramCreate;
import com.wallee.sdk.model.CardholderAuthenticationCreate;
import com.wallee.sdk.model.RecurringIndicator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * This model holds the card data and optional cardholder authentication details.
 */
@ApiModel(description = "This model holds the card data and optional cardholder authentication details.")

public class AuthenticatedCardDataCreate {
  
  @JsonProperty("cardHolderName")
  protected String cardHolderName = null;

  
  @JsonProperty("cardVerificationCode")
  protected String cardVerificationCode = null;

  
  @JsonProperty("cardholderAuthentication")
  protected CardholderAuthenticationCreate cardholderAuthentication = null;

  
  @JsonProperty("cryptogram")
  protected CardCryptogramCreate cryptogram = null;

  
  @JsonProperty("expiryDate")
  protected String expiryDate = null;

  
  @JsonProperty("primaryAccountNumber")
  protected String primaryAccountNumber = null;

  
  @JsonProperty("recurringIndicator")
  protected RecurringIndicator recurringIndicator = null;

  
  @JsonProperty("tokenRequestorId")
  protected String tokenRequestorId = null;

  
  
  public AuthenticatedCardDataCreate cardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
    return this;
  }

   /**
   * The card holder name is the name printed onto the card. It identifies the person who owns the card.
   * @return cardHolderName
  **/
  @ApiModelProperty(value = "The card holder name is the name printed onto the card. It identifies the person who owns the card.")
  public String getCardHolderName() {
    return cardHolderName;
  }

  public void setCardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
  }

  
  public AuthenticatedCardDataCreate cardVerificationCode(String cardVerificationCode) {
    this.cardVerificationCode = cardVerificationCode;
    return this;
  }

   /**
   * The card verification code (CVC) is a 3 to 4 digit code typically printed on the back of the card. It helps to ensure that the card holder is authorizing the transaction. For card not-present transactions this field is optional.
   * @return cardVerificationCode
  **/
  @ApiModelProperty(value = "The card verification code (CVC) is a 3 to 4 digit code typically printed on the back of the card. It helps to ensure that the card holder is authorizing the transaction. For card not-present transactions this field is optional.")
  public String getCardVerificationCode() {
    return cardVerificationCode;
  }

  public void setCardVerificationCode(String cardVerificationCode) {
    this.cardVerificationCode = cardVerificationCode;
  }

  
  public AuthenticatedCardDataCreate cardholderAuthentication(CardholderAuthenticationCreate cardholderAuthentication) {
    this.cardholderAuthentication = cardholderAuthentication;
    return this;
  }

   /**
   * The cardholder authentication information. The authentication is optional and can be provided if the cardholder has been already authenticated (e.g. in 3-D Secure system).
   * @return cardholderAuthentication
  **/
  @ApiModelProperty(value = "The cardholder authentication information. The authentication is optional and can be provided if the cardholder has been already authenticated (e.g. in 3-D Secure system).")
  public CardholderAuthenticationCreate getCardholderAuthentication() {
    return cardholderAuthentication;
  }

  public void setCardholderAuthentication(CardholderAuthenticationCreate cardholderAuthentication) {
    this.cardholderAuthentication = cardholderAuthentication;
  }

  
  public AuthenticatedCardDataCreate cryptogram(CardCryptogramCreate cryptogram) {
    this.cryptogram = cryptogram;
    return this;
  }

   /**
   * The additional authentication value used to secure the tokenized card transactions.
   * @return cryptogram
  **/
  @ApiModelProperty(value = "The additional authentication value used to secure the tokenized card transactions.")
  public CardCryptogramCreate getCryptogram() {
    return cryptogram;
  }

  public void setCryptogram(CardCryptogramCreate cryptogram) {
    this.cryptogram = cryptogram;
  }

  
  public AuthenticatedCardDataCreate expiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * The card expiry date indicates when the card expires. The format is the format yyyy-mm where yyyy is the year (e.g. 2019) and the mm is the month (e.g. 09).
   * @return expiryDate
  **/
  @ApiModelProperty(value = "The card expiry date indicates when the card expires. The format is the format yyyy-mm where yyyy is the year (e.g. 2019) and the mm is the month (e.g. 09).")
  public String getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  
  public AuthenticatedCardDataCreate primaryAccountNumber(String primaryAccountNumber) {
    this.primaryAccountNumber = primaryAccountNumber;
    return this;
  }

   /**
   * The primary account number (PAN) identifies the card. The number is numeric and typically printed on the front of the card.
   * @return primaryAccountNumber
  **/
  @ApiModelProperty(required = true, value = "The primary account number (PAN) identifies the card. The number is numeric and typically printed on the front of the card.")
  public String getPrimaryAccountNumber() {
    return primaryAccountNumber;
  }

  public void setPrimaryAccountNumber(String primaryAccountNumber) {
    this.primaryAccountNumber = primaryAccountNumber;
  }

  
  public AuthenticatedCardDataCreate recurringIndicator(RecurringIndicator recurringIndicator) {
    this.recurringIndicator = recurringIndicator;
    return this;
  }

   /**
   * 
   * @return recurringIndicator
  **/
  @ApiModelProperty(value = "")
  public RecurringIndicator getRecurringIndicator() {
    return recurringIndicator;
  }

  public void setRecurringIndicator(RecurringIndicator recurringIndicator) {
    this.recurringIndicator = recurringIndicator;
  }

  
  public AuthenticatedCardDataCreate tokenRequestorId(String tokenRequestorId) {
    this.tokenRequestorId = tokenRequestorId;
    return this;
  }

   /**
   * 
   * @return tokenRequestorId
  **/
  @ApiModelProperty(value = "")
  public String getTokenRequestorId() {
    return tokenRequestorId;
  }

  public void setTokenRequestorId(String tokenRequestorId) {
    this.tokenRequestorId = tokenRequestorId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticatedCardDataCreate authenticatedCardDataCreate = (AuthenticatedCardDataCreate) o;
    return Objects.equals(this.cardHolderName, authenticatedCardDataCreate.cardHolderName) &&
        Objects.equals(this.cardVerificationCode, authenticatedCardDataCreate.cardVerificationCode) &&
        Objects.equals(this.cardholderAuthentication, authenticatedCardDataCreate.cardholderAuthentication) &&
        Objects.equals(this.cryptogram, authenticatedCardDataCreate.cryptogram) &&
        Objects.equals(this.expiryDate, authenticatedCardDataCreate.expiryDate) &&
        Objects.equals(this.primaryAccountNumber, authenticatedCardDataCreate.primaryAccountNumber) &&
        Objects.equals(this.recurringIndicator, authenticatedCardDataCreate.recurringIndicator) &&
        Objects.equals(this.tokenRequestorId, authenticatedCardDataCreate.tokenRequestorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardHolderName, cardVerificationCode, cardholderAuthentication, cryptogram, expiryDate, primaryAccountNumber, recurringIndicator, tokenRequestorId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticatedCardDataCreate {\n");
    
    sb.append("    cardHolderName: ").append(toIndentedString(cardHolderName)).append("\n");
    sb.append("    cardVerificationCode: ").append(toIndentedString(cardVerificationCode)).append("\n");
    sb.append("    cardholderAuthentication: ").append(toIndentedString(cardholderAuthentication)).append("\n");
    sb.append("    cryptogram: ").append(toIndentedString(cryptogram)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    primaryAccountNumber: ").append(toIndentedString(primaryAccountNumber)).append("\n");
    sb.append("    recurringIndicator: ").append(toIndentedString(recurringIndicator)).append("\n");
    sb.append("    tokenRequestorId: ").append(toIndentedString(tokenRequestorId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

