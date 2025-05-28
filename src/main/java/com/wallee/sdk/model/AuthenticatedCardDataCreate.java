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
import com.wallee.sdk.model.PanType;
import com.wallee.sdk.model.RecurringIndicator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

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

  
  @JsonProperty("panType")
  protected PanType panType = null;

  
  @JsonProperty("primaryAccountNumber")
  protected String primaryAccountNumber = null;

  
  @JsonProperty("recurringIndicator")
  protected RecurringIndicator recurringIndicator = null;

  
  @JsonProperty("schemeTransactionReference")
  protected String schemeTransactionReference = null;

  
  @JsonProperty("tokenRequestorId")
  protected String tokenRequestorId = null;

  
  
  public AuthenticatedCardDataCreate cardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
    return this;
  }

   /**
   * The name of the cardholder, as printed on the card, identifying the card owner.
   * @return cardHolderName
  **/
  @ApiModelProperty(value = "The name of the cardholder, as printed on the card, identifying the card owner.")
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
   * The security code used to validate the card during transactions.
   * @return cardVerificationCode
  **/
  @ApiModelProperty(value = "The security code used to validate the card during transactions.")
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
   * Optional authentication details for the cardholder, such as 3D Secure authentication, used when the cardholder has already been verified during the transaction for added security.
   * @return cardholderAuthentication
  **/
  @ApiModelProperty(value = "Optional authentication details for the cardholder, such as 3D Secure authentication, used when the cardholder has already been verified during the transaction for added security.")
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
   * An additional authentication value that enhances the security of tokenized card transactions.
   * @return cryptogram
  **/
  @ApiModelProperty(value = "An additional authentication value that enhances the security of tokenized card transactions.")
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
   * The expiry date of the card, indicating its validity period in yyyy-mm format (e.g., 2023-09).
   * @return expiryDate
  **/
  @ApiModelProperty(value = "The expiry date of the card, indicating its validity period in yyyy-mm format (e.g., 2023-09).")
  public String getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  
  public AuthenticatedCardDataCreate panType(PanType panType) {
    this.panType = panType;
    return this;
  }

   /**
   * The type of PAN or token, indicating the source or security method of the card information.
   * @return panType
  **/
  @ApiModelProperty(value = "The type of PAN or token, indicating the source or security method of the card information.")
  public PanType getPanType() {
    return panType;
  }

  public void setPanType(PanType panType) {
    this.panType = panType;
  }

  
  public AuthenticatedCardDataCreate primaryAccountNumber(String primaryAccountNumber) {
    this.primaryAccountNumber = primaryAccountNumber;
    return this;
  }

   /**
   * The card&#39;s primary account number (PAN), the unique identifier of the card.
   * @return primaryAccountNumber
  **/
  @ApiModelProperty(required = true, value = "The card's primary account number (PAN), the unique identifier of the card.")
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
   * The indicator used to distinguish between recurring and one-time transactions. If omitted, it will be automatically determined based on the transaction&#39;s properties.
   * @return recurringIndicator
  **/
  @ApiModelProperty(value = "The indicator used to distinguish between recurring and one-time transactions. If omitted, it will be automatically determined based on the transaction's properties.")
  public RecurringIndicator getRecurringIndicator() {
    return recurringIndicator;
  }

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
  @ApiModelProperty(value = "A reference specific to the card's transaction within its payment scheme.")
  public String getSchemeTransactionReference() {
    return schemeTransactionReference;
  }

  public void setSchemeTransactionReference(String schemeTransactionReference) {
    this.schemeTransactionReference = schemeTransactionReference;
  }

  
  public AuthenticatedCardDataCreate tokenRequestorId(String tokenRequestorId) {
    this.tokenRequestorId = tokenRequestorId;
    return this;
  }

   /**
   * The token requestor identifier (TRID) identifies the entity requesting tokenization for a card transaction.
   * @return tokenRequestorId
  **/
  @ApiModelProperty(value = "The token requestor identifier (TRID) identifies the entity requesting tokenization for a card transaction.")
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
        Objects.equals(this.panType, authenticatedCardDataCreate.panType) &&
        Objects.equals(this.primaryAccountNumber, authenticatedCardDataCreate.primaryAccountNumber) &&
        Objects.equals(this.recurringIndicator, authenticatedCardDataCreate.recurringIndicator) &&
        Objects.equals(this.schemeTransactionReference, authenticatedCardDataCreate.schemeTransactionReference) &&
        Objects.equals(this.tokenRequestorId, authenticatedCardDataCreate.tokenRequestorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardHolderName, cardVerificationCode, cardholderAuthentication, cryptogram, expiryDate, panType, primaryAccountNumber, recurringIndicator, schemeTransactionReference, tokenRequestorId);
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
    sb.append("    panType: ").append(toIndentedString(panType)).append("\n");
    sb.append("    primaryAccountNumber: ").append(toIndentedString(primaryAccountNumber)).append("\n");
    sb.append("    recurringIndicator: ").append(toIndentedString(recurringIndicator)).append("\n");
    sb.append("    schemeTransactionReference: ").append(toIndentedString(schemeTransactionReference)).append("\n");
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

