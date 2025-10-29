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
import com.wallee.sdk.model.BankTransaction;
import com.wallee.sdk.model.Transaction;
import com.wallee.sdk.model.TransactionCompletion;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ChargeBankTransaction
 */
@JsonPropertyOrder({
  ChargeBankTransaction.JSON_PROPERTY_TRANSACTION_CURRENCY_AMOUNT,
  ChargeBankTransaction.JSON_PROPERTY_COMPLETION,
  ChargeBankTransaction.JSON_PROPERTY_LINKED_SPACE_ID,
  ChargeBankTransaction.JSON_PROPERTY_LANGUAGE,
  ChargeBankTransaction.JSON_PROPERTY_ID,
  ChargeBankTransaction.JSON_PROPERTY_SPACE_VIEW_ID,
  ChargeBankTransaction.JSON_PROPERTY_LINKED_TRANSACTION,
  ChargeBankTransaction.JSON_PROPERTY_BANK_TRANSACTION,
  ChargeBankTransaction.JSON_PROPERTY_VERSION,
  ChargeBankTransaction.JSON_PROPERTY_TRANSACTION,
  ChargeBankTransaction.JSON_PROPERTY_TRANSACTION_CURRENCY_VALUE_AMOUNT
})

public class ChargeBankTransaction {
  public static final String JSON_PROPERTY_TRANSACTION_CURRENCY_AMOUNT = "transactionCurrencyAmount";
  private BigDecimal transactionCurrencyAmount;

  public static final String JSON_PROPERTY_COMPLETION = "completion";
  private TransactionCompletion completion;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_SPACE_VIEW_ID = "spaceViewId";
  private Long spaceViewId;

  public static final String JSON_PROPERTY_LINKED_TRANSACTION = "linkedTransaction";
  private Long linkedTransaction;

  public static final String JSON_PROPERTY_BANK_TRANSACTION = "bankTransaction";
  private BankTransaction bankTransaction;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_TRANSACTION = "transaction";
  private Transaction transaction;

  public static final String JSON_PROPERTY_TRANSACTION_CURRENCY_VALUE_AMOUNT = "transactionCurrencyValueAmount";
  private BigDecimal transactionCurrencyValueAmount;

  public ChargeBankTransaction() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public ChargeBankTransaction(
    @JsonProperty(JSON_PROPERTY_TRANSACTION_CURRENCY_AMOUNT) BigDecimal transactionCurrencyAmount, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_LANGUAGE) String language, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_SPACE_VIEW_ID) Long spaceViewId, 
    @JsonProperty(JSON_PROPERTY_LINKED_TRANSACTION) Long linkedTransaction, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_TRANSACTION_CURRENCY_VALUE_AMOUNT) BigDecimal transactionCurrencyValueAmount
  ) {
    this();
    this.transactionCurrencyAmount = transactionCurrencyAmount;
    this.linkedSpaceId = linkedSpaceId;
    this.language = language;
    this.id = id;
    this.spaceViewId = spaceViewId;
    this.linkedTransaction = linkedTransaction;
    this.version = version;
    this.transactionCurrencyValueAmount = transactionCurrencyValueAmount;
  }

   /**
   * The posting amount represents the monetary value of the bank transaction, recorded in the payment transaction&#39;s currency, before applying any adjustments.
   * @return transactionCurrencyAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSACTION_CURRENCY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTransactionCurrencyAmount() {
    return transactionCurrencyAmount;
  }



  public ChargeBankTransaction completion(TransactionCompletion completion) {
    
    this.completion = completion;
    return this;
  }

   /**
   * Get completion
   * @return completion
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionCompletion getCompletion() {
    return completion;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompletion(TransactionCompletion completion) {
    this.completion = completion;
  }

   /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }



   /**
   * The language that is linked to the object.
   * @return language
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }



   /**
   * A unique identifier for the object.
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }



   /**
   * The ID of the space view this object is linked to.
   * @return spaceViewId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPACE_VIEW_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSpaceViewId() {
    return spaceViewId;
  }



   /**
   * The payment transaction this object is linked to.
   * @return linkedTransaction
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedTransaction() {
    return linkedTransaction;
  }



  public ChargeBankTransaction bankTransaction(BankTransaction bankTransaction) {
    
    this.bankTransaction = bankTransaction;
    return this;
  }

   /**
   * Get bankTransaction
   * @return bankTransaction
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BANK_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BankTransaction getBankTransaction() {
    return bankTransaction;
  }


  @JsonProperty(JSON_PROPERTY_BANK_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankTransaction(BankTransaction bankTransaction) {
    this.bankTransaction = bankTransaction;
  }

   /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }



  public ChargeBankTransaction transaction(Transaction transaction) {
    
    this.transaction = transaction;
    return this;
  }

   /**
   * Get transaction
   * @return transaction
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Transaction getTransaction() {
    return transaction;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransaction(Transaction transaction) {
    this.transaction = transaction;
  }

   /**
   * The value amount represents the net monetary value of the bank transaction, recorded in the payment transaction&#39;s currency, after applicable deductions.
   * @return transactionCurrencyValueAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSACTION_CURRENCY_VALUE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTransactionCurrencyValueAmount() {
    return transactionCurrencyValueAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeBankTransaction chargeBankTransaction = (ChargeBankTransaction) o;
    return Objects.equals(this.transactionCurrencyAmount, chargeBankTransaction.transactionCurrencyAmount) &&
        Objects.equals(this.completion, chargeBankTransaction.completion) &&
        Objects.equals(this.linkedSpaceId, chargeBankTransaction.linkedSpaceId) &&
        Objects.equals(this.language, chargeBankTransaction.language) &&
        Objects.equals(this.id, chargeBankTransaction.id) &&
        Objects.equals(this.spaceViewId, chargeBankTransaction.spaceViewId) &&
        Objects.equals(this.linkedTransaction, chargeBankTransaction.linkedTransaction) &&
        Objects.equals(this.bankTransaction, chargeBankTransaction.bankTransaction) &&
        Objects.equals(this.version, chargeBankTransaction.version) &&
        Objects.equals(this.transaction, chargeBankTransaction.transaction) &&
        Objects.equals(this.transactionCurrencyValueAmount, chargeBankTransaction.transactionCurrencyValueAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionCurrencyAmount, completion, linkedSpaceId, language, id, spaceViewId, linkedTransaction, bankTransaction, version, transaction, transactionCurrencyValueAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeBankTransaction {\n");
    sb.append("    transactionCurrencyAmount: ").append(toIndentedString(transactionCurrencyAmount)).append("\n");
    sb.append("    completion: ").append(toIndentedString(completion)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    bankTransaction: ").append(toIndentedString(bankTransaction)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    transactionCurrencyValueAmount: ").append(toIndentedString(transactionCurrencyValueAmount)).append("\n");
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

    // add `transactionCurrencyAmount` to the URL query string
    if (getTransactionCurrencyAmount() != null) {
      try {
        joiner.add(String.format("%stransactionCurrencyAmount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTransactionCurrencyAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `completion` to the URL query string
    if (getCompletion() != null) {
      joiner.add(getCompletion().toUrlQueryString(prefix + "completion" + suffix));
    }

    // add `linkedSpaceId` to the URL query string
    if (getLinkedSpaceId() != null) {
      try {
        joiner.add(String.format("%slinkedSpaceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedSpaceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `language` to the URL query string
    if (getLanguage() != null) {
      try {
        joiner.add(String.format("%slanguage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLanguage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `spaceViewId` to the URL query string
    if (getSpaceViewId() != null) {
      try {
        joiner.add(String.format("%sspaceViewId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSpaceViewId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `linkedTransaction` to the URL query string
    if (getLinkedTransaction() != null) {
      try {
        joiner.add(String.format("%slinkedTransaction%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedTransaction()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `bankTransaction` to the URL query string
    if (getBankTransaction() != null) {
      joiner.add(getBankTransaction().toUrlQueryString(prefix + "bankTransaction" + suffix));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `transaction` to the URL query string
    if (getTransaction() != null) {
      joiner.add(getTransaction().toUrlQueryString(prefix + "transaction" + suffix));
    }

    // add `transactionCurrencyValueAmount` to the URL query string
    if (getTransactionCurrencyValueAmount() != null) {
      try {
        joiner.add(String.format("%stransactionCurrencyValueAmount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTransactionCurrencyValueAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

