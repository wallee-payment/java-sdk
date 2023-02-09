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
import com.wallee.sdk.model.TransactionAwareEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class ChargeBankTransaction extends TransactionAwareEntity {
  
  @JsonProperty("bankTransaction")
  protected BankTransaction bankTransaction = null;

  
  @JsonProperty("completion")
  protected Long completion = null;

  
  @JsonProperty("language")
  protected String language = null;

  
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
   * 
   * @return bankTransaction
  **/
  @ApiModelProperty(value = "")
  public BankTransaction getBankTransaction() {
    return bankTransaction;
  }

  
   /**
   * 
   * @return completion
  **/
  @ApiModelProperty(value = "")
  public Long getCompletion() {
    return completion;
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
   * 
   * @return spaceViewId
  **/
  @ApiModelProperty(value = "")
  public Long getSpaceViewId() {
    return spaceViewId;
  }

  
   /**
   * 
   * @return transaction
  **/
  @ApiModelProperty(value = "")
  public Transaction getTransaction() {
    return transaction;
  }

  
   /**
   * Specify the posting amount in the transaction&#39;s currency.
   * @return transactionCurrencyAmount
  **/
  @ApiModelProperty(value = "Specify the posting amount in the transaction's currency.")
  public BigDecimal getTransactionCurrencyAmount() {
    return transactionCurrencyAmount;
  }

  
   /**
   * 
   * @return transactionCurrencyValueAmount
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.id, chargeBankTransaction.id) &&
        Objects.equals(this.linkedSpaceId, chargeBankTransaction.linkedSpaceId) &&
        Objects.equals(this.linkedTransaction, chargeBankTransaction.linkedTransaction) &&
        Objects.equals(this.bankTransaction, chargeBankTransaction.bankTransaction) &&
        Objects.equals(this.completion, chargeBankTransaction.completion) &&
        Objects.equals(this.language, chargeBankTransaction.language) &&
        Objects.equals(this.spaceViewId, chargeBankTransaction.spaceViewId) &&
        Objects.equals(this.transaction, chargeBankTransaction.transaction) &&
        Objects.equals(this.transactionCurrencyAmount, chargeBankTransaction.transactionCurrencyAmount) &&
        Objects.equals(this.transactionCurrencyValueAmount, chargeBankTransaction.transactionCurrencyValueAmount) &&
        Objects.equals(this.version, chargeBankTransaction.version) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, linkedSpaceId, linkedTransaction, bankTransaction, completion, language, spaceViewId, transaction, transactionCurrencyAmount, transactionCurrencyValueAmount, version, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeBankTransaction {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    bankTransaction: ").append(toIndentedString(bankTransaction)).append("\n");
    sb.append("    completion: ").append(toIndentedString(completion)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

