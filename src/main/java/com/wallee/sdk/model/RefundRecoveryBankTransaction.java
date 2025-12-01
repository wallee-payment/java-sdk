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
import com.wallee.sdk.model.LineItem;
import com.wallee.sdk.model.Refund;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * RefundRecoveryBankTransaction
 */
@JsonPropertyOrder({
  RefundRecoveryBankTransaction.JSON_PROPERTY_LINE_ITEMS,
  RefundRecoveryBankTransaction.JSON_PROPERTY_LINKED_SPACE_ID,
  RefundRecoveryBankTransaction.JSON_PROPERTY_REFUND_CURRENCY_VALUE_AMOUNT,
  RefundRecoveryBankTransaction.JSON_PROPERTY_REFUND_CURRENCY_AMOUNT,
  RefundRecoveryBankTransaction.JSON_PROPERTY_LANGUAGE,
  RefundRecoveryBankTransaction.JSON_PROPERTY_ID,
  RefundRecoveryBankTransaction.JSON_PROPERTY_SPACE_VIEW_ID,
  RefundRecoveryBankTransaction.JSON_PROPERTY_LINKED_TRANSACTION,
  RefundRecoveryBankTransaction.JSON_PROPERTY_BANK_TRANSACTION,
  RefundRecoveryBankTransaction.JSON_PROPERTY_VERSION,
  RefundRecoveryBankTransaction.JSON_PROPERTY_REFUND
})

public class RefundRecoveryBankTransaction {
  public static final String JSON_PROPERTY_LINE_ITEMS = "lineItems";
  @javax.annotation.Nullable
  private List<LineItem> lineItems = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_REFUND_CURRENCY_VALUE_AMOUNT = "refundCurrencyValueAmount";
  @javax.annotation.Nullable
  private BigDecimal refundCurrencyValueAmount;

  public static final String JSON_PROPERTY_REFUND_CURRENCY_AMOUNT = "refundCurrencyAmount";
  @javax.annotation.Nullable
  private BigDecimal refundCurrencyAmount;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  @javax.annotation.Nullable
  private String language;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_SPACE_VIEW_ID = "spaceViewId";
  @javax.annotation.Nullable
  private Long spaceViewId;

  public static final String JSON_PROPERTY_LINKED_TRANSACTION = "linkedTransaction";
  @javax.annotation.Nullable
  private Long linkedTransaction;

  public static final String JSON_PROPERTY_BANK_TRANSACTION = "bankTransaction";
  @javax.annotation.Nullable
  private BankTransaction bankTransaction;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_REFUND = "refund";
  @javax.annotation.Nullable
  private Refund refund;

  public RefundRecoveryBankTransaction() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public RefundRecoveryBankTransaction(
    @JsonProperty(JSON_PROPERTY_LINE_ITEMS) List<LineItem> lineItems, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_REFUND_CURRENCY_VALUE_AMOUNT) BigDecimal refundCurrencyValueAmount, 
    @JsonProperty(JSON_PROPERTY_REFUND_CURRENCY_AMOUNT) BigDecimal refundCurrencyAmount, 
    @JsonProperty(JSON_PROPERTY_LANGUAGE) String language, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_SPACE_VIEW_ID) Long spaceViewId, 
    @JsonProperty(JSON_PROPERTY_LINKED_TRANSACTION) Long linkedTransaction, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version
  ) {
    this();
    this.lineItems = lineItems;
    this.linkedSpaceId = linkedSpaceId;
    this.refundCurrencyValueAmount = refundCurrencyValueAmount;
    this.refundCurrencyAmount = refundCurrencyAmount;
    this.language = language;
    this.id = id;
    this.spaceViewId = spaceViewId;
    this.linkedTransaction = linkedTransaction;
    this.version = version;
  }

  /**
   * The line items that were recovered.
   * @return lineItems
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LineItem> getLineItems() {
    return lineItems;
  }



  /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }



  /**
   * The value amount represents the net monetary value of the bank transaction, recorded in the refund&#39;s currency, after applicable deductions.
   * @return refundCurrencyValueAmount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFUND_CURRENCY_VALUE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRefundCurrencyValueAmount() {
    return refundCurrencyValueAmount;
  }



  /**
   * The posting amount represents the monetary value of the bank transaction, recorded in the refund&#39;s currency, before applying any adjustments.
   * @return refundCurrencyAmount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFUND_CURRENCY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRefundCurrencyAmount() {
    return refundCurrencyAmount;
  }



  /**
   * The language that is linked to the object.
   * @return language
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }



  /**
   * A unique identifier for the object.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }



  /**
   * The ID of the space view this object is linked to.
   * @return spaceViewId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPACE_VIEW_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSpaceViewId() {
    return spaceViewId;
  }



  /**
   * The payment transaction this object is linked to.
   * @return linkedTransaction
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedTransaction() {
    return linkedTransaction;
  }



  public RefundRecoveryBankTransaction bankTransaction(@javax.annotation.Nullable BankTransaction bankTransaction) {
    
    this.bankTransaction = bankTransaction;
    return this;
  }

  /**
   * Get bankTransaction
   * @return bankTransaction
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BANK_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BankTransaction getBankTransaction() {
    return bankTransaction;
  }


  @JsonProperty(JSON_PROPERTY_BANK_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankTransaction(@javax.annotation.Nullable BankTransaction bankTransaction) {
    this.bankTransaction = bankTransaction;
  }

  /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }



  public RefundRecoveryBankTransaction refund(@javax.annotation.Nullable Refund refund) {
    
    this.refund = refund;
    return this;
  }

  /**
   * Get refund
   * @return refund
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Refund getRefund() {
    return refund;
  }


  @JsonProperty(JSON_PROPERTY_REFUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefund(@javax.annotation.Nullable Refund refund) {
    this.refund = refund;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundRecoveryBankTransaction refundRecoveryBankTransaction = (RefundRecoveryBankTransaction) o;
    return Objects.equals(this.lineItems, refundRecoveryBankTransaction.lineItems) &&
        Objects.equals(this.linkedSpaceId, refundRecoveryBankTransaction.linkedSpaceId) &&
        Objects.equals(this.refundCurrencyValueAmount, refundRecoveryBankTransaction.refundCurrencyValueAmount) &&
        Objects.equals(this.refundCurrencyAmount, refundRecoveryBankTransaction.refundCurrencyAmount) &&
        Objects.equals(this.language, refundRecoveryBankTransaction.language) &&
        Objects.equals(this.id, refundRecoveryBankTransaction.id) &&
        Objects.equals(this.spaceViewId, refundRecoveryBankTransaction.spaceViewId) &&
        Objects.equals(this.linkedTransaction, refundRecoveryBankTransaction.linkedTransaction) &&
        Objects.equals(this.bankTransaction, refundRecoveryBankTransaction.bankTransaction) &&
        Objects.equals(this.version, refundRecoveryBankTransaction.version) &&
        Objects.equals(this.refund, refundRecoveryBankTransaction.refund);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineItems, linkedSpaceId, refundCurrencyValueAmount, refundCurrencyAmount, language, id, spaceViewId, linkedTransaction, bankTransaction, version, refund);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundRecoveryBankTransaction {\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    refundCurrencyValueAmount: ").append(toIndentedString(refundCurrencyValueAmount)).append("\n");
    sb.append("    refundCurrencyAmount: ").append(toIndentedString(refundCurrencyAmount)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    bankTransaction: ").append(toIndentedString(bankTransaction)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    refund: ").append(toIndentedString(refund)).append("\n");
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

    // add `lineItems` to the URL query string
    if (getLineItems() != null) {
      for (int i = 0; i < getLineItems().size(); i++) {
        if (getLineItems().get(i) != null) {
          joiner.add(getLineItems().get(i).toUrlQueryString(String.format("%slineItems%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
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

    // add `refundCurrencyValueAmount` to the URL query string
    if (getRefundCurrencyValueAmount() != null) {
      try {
        joiner.add(String.format("%srefundCurrencyValueAmount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRefundCurrencyValueAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `refundCurrencyAmount` to the URL query string
    if (getRefundCurrencyAmount() != null) {
      try {
        joiner.add(String.format("%srefundCurrencyAmount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRefundCurrencyAmount()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `refund` to the URL query string
    if (getRefund() != null) {
      joiner.add(getRefund().toUrlQueryString(prefix + "refund" + suffix));
    }

    return joiner.toString();
  }

}

