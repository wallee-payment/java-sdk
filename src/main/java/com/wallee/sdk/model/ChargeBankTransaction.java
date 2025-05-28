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
import com.wallee.sdk.model.BankTransaction;
import com.wallee.sdk.model.Transaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class ChargeBankTransaction {
  
  @JsonProperty("bankTransaction")
  protected BankTransaction bankTransaction = null;

  
  @JsonProperty("completion")
  protected Long completion = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("linkedTransaction")
  protected Long linkedTransaction = null;

  
  @JsonProperty("spaceViewId")
  protected Long spaceViewId = null;

  
  @JsonProperty("transaction")
  protected Transaction transaction = null;

  
  @JsonProperty("transactionCurrencyAmount")
  protected BigDecimal transactionCurrencyAmount = null;

  
  @JsonProperty("transactionCurrencyValueAmount")
  protected BigDecimal transactionCurrencyValueAmount = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * Provides general information about the bank transaction.
   * @return bankTransaction
  **/
  @ApiModelProperty(value = "Provides general information about the bank transaction.")
  public BankTransaction getBankTransaction() {
    return bankTransaction;
  }

  
   /**
   * The transaction completion this bank transaction is belongs to.
   * @return completion
  **/
  @ApiModelProperty(value = "The transaction completion this bank transaction is belongs to.")
  public Long getCompletion() {
    return completion;
  }

  
   /**
   * A unique identifier for the object.
   * @return id
  **/
  @ApiModelProperty(value = "A unique identifier for the object.")
  public Long getId() {
    return id;
  }

  
   /**
   * The language that is linked to the object.
   * @return language
  **/
  @ApiModelProperty(value = "The language that is linked to the object.")
  public String getLanguage() {
    return language;
  }

  
   /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The ID of the space this object belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The payment transaction this object is linked to.
   * @return linkedTransaction
  **/
  @ApiModelProperty(value = "The payment transaction this object is linked to.")
  public Long getLinkedTransaction() {
    return linkedTransaction;
  }

  
   /**
   * The ID of the space view this object is linked to.
   * @return spaceViewId
  **/
  @ApiModelProperty(value = "The ID of the space view this object is linked to.")
  public Long getSpaceViewId() {
    return spaceViewId;
  }

  
   /**
   * The payment transaction this bank transaction belongs to.
   * @return transaction
  **/
  @ApiModelProperty(value = "The payment transaction this bank transaction belongs to.")
  public Transaction getTransaction() {
    return transaction;
  }

  
   /**
   * The posting amount represents the monetary value of the bank transaction, recorded in the payment transaction&#39;s currency, before applying any adjustments.
   * @return transactionCurrencyAmount
  **/
  @ApiModelProperty(value = "The posting amount represents the monetary value of the bank transaction, recorded in the payment transaction's currency, before applying any adjustments.")
  public BigDecimal getTransactionCurrencyAmount() {
    return transactionCurrencyAmount;
  }

  
   /**
   * The value amount represents the net monetary value of the bank transaction, recorded in the payment transaction&#39;s currency, after applicable deductions.
   * @return transactionCurrencyValueAmount
  **/
  @ApiModelProperty(value = "The value amount represents the net monetary value of the bank transaction, recorded in the payment transaction's currency, after applicable deductions.")
  public BigDecimal getTransactionCurrencyValueAmount() {
    return transactionCurrencyValueAmount;
  }

  
   /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @ApiModelProperty(value = "The version is used for optimistic locking and incremented whenever the object is updated.")
  public Integer getVersion() {
    return version;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeBankTransaction chargeBankTransaction = (ChargeBankTransaction) o;
    return Objects.equals(this.bankTransaction, chargeBankTransaction.bankTransaction) &&
        Objects.equals(this.completion, chargeBankTransaction.completion) &&
        Objects.equals(this.id, chargeBankTransaction.id) &&
        Objects.equals(this.language, chargeBankTransaction.language) &&
        Objects.equals(this.linkedSpaceId, chargeBankTransaction.linkedSpaceId) &&
        Objects.equals(this.linkedTransaction, chargeBankTransaction.linkedTransaction) &&
        Objects.equals(this.spaceViewId, chargeBankTransaction.spaceViewId) &&
        Objects.equals(this.transaction, chargeBankTransaction.transaction) &&
        Objects.equals(this.transactionCurrencyAmount, chargeBankTransaction.transactionCurrencyAmount) &&
        Objects.equals(this.transactionCurrencyValueAmount, chargeBankTransaction.transactionCurrencyValueAmount) &&
        Objects.equals(this.version, chargeBankTransaction.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankTransaction, completion, id, language, linkedSpaceId, linkedTransaction, spaceViewId, transaction, transactionCurrencyAmount, transactionCurrencyValueAmount, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeBankTransaction {\n");
    
    sb.append("    bankTransaction: ").append(toIndentedString(bankTransaction)).append("\n");
    sb.append("    completion: ").append(toIndentedString(completion)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    transactionCurrencyAmount: ").append(toIndentedString(transactionCurrencyAmount)).append("\n");
    sb.append("    transactionCurrencyValueAmount: ").append(toIndentedString(transactionCurrencyValueAmount)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

