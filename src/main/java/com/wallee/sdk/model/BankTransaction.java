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
import com.wallee.sdk.model.BankTransactionFlowDirection;
import com.wallee.sdk.model.BankTransactionState;
import com.wallee.sdk.model.CurrencyBankAccount;
import com.wallee.sdk.model.PaymentAdjustment;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * BankTransaction
 */
@JsonPropertyOrder({
  BankTransaction.JSON_PROPERTY_ADJUSTMENTS,
  BankTransaction.JSON_PROPERTY_CURRENCY_BANK_ACCOUNT,
  BankTransaction.JSON_PROPERTY_PLANNED_PURGE_DATE,
  BankTransaction.JSON_PROPERTY_EXTERNAL_ID,
  BankTransaction.JSON_PROPERTY_POSTING_AMOUNT,
  BankTransaction.JSON_PROPERTY_SOURCE,
  BankTransaction.JSON_PROPERTY_VALUE_DATE,
  BankTransaction.JSON_PROPERTY_TYPE,
  BankTransaction.JSON_PROPERTY_CREATED_ON,
  BankTransaction.JSON_PROPERTY_VERSION,
  BankTransaction.JSON_PROPERTY_REFERENCE,
  BankTransaction.JSON_PROPERTY_LINKED_SPACE_ID,
  BankTransaction.JSON_PROPERTY_VALUE_AMOUNT,
  BankTransaction.JSON_PROPERTY_FLOW_DIRECTION,
  BankTransaction.JSON_PROPERTY_CREATED_BY,
  BankTransaction.JSON_PROPERTY_ID,
  BankTransaction.JSON_PROPERTY_STATE,
  BankTransaction.JSON_PROPERTY_PAYMENT_DATE,
  BankTransaction.JSON_PROPERTY_TOTAL_ADJUSTMENT_AMOUNT_INCLUDING_TAX
})

public class BankTransaction {
  public static final String JSON_PROPERTY_ADJUSTMENTS = "adjustments";
  private List<PaymentAdjustment> adjustments = new ArrayList<>();

  public static final String JSON_PROPERTY_CURRENCY_BANK_ACCOUNT = "currencyBankAccount";
  private CurrencyBankAccount currencyBankAccount;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_POSTING_AMOUNT = "postingAmount";
  private BigDecimal postingAmount;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private Long source;

  public static final String JSON_PROPERTY_VALUE_DATE = "valueDate";
  private OffsetDateTime valueDate;

  public static final String JSON_PROPERTY_TYPE = "type";
  private Long type;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_VALUE_AMOUNT = "valueAmount";
  private BigDecimal valueAmount;

  public static final String JSON_PROPERTY_FLOW_DIRECTION = "flowDirection";
  private BankTransactionFlowDirection flowDirection;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private Long createdBy;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  private BankTransactionState state;

  public static final String JSON_PROPERTY_PAYMENT_DATE = "paymentDate";
  private OffsetDateTime paymentDate;

  public static final String JSON_PROPERTY_TOTAL_ADJUSTMENT_AMOUNT_INCLUDING_TAX = "totalAdjustmentAmountIncludingTax";
  private BigDecimal totalAdjustmentAmountIncludingTax;

  public BankTransaction() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public BankTransaction(
    @JsonProperty(JSON_PROPERTY_ADJUSTMENTS) List<PaymentAdjustment> adjustments, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_EXTERNAL_ID) String externalId, 
    @JsonProperty(JSON_PROPERTY_POSTING_AMOUNT) BigDecimal postingAmount, 
    @JsonProperty(JSON_PROPERTY_SOURCE) Long source, 
    @JsonProperty(JSON_PROPERTY_VALUE_DATE) OffsetDateTime valueDate, 
    @JsonProperty(JSON_PROPERTY_TYPE) Long type, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_REFERENCE) String reference, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_VALUE_AMOUNT) BigDecimal valueAmount, 
    @JsonProperty(JSON_PROPERTY_CREATED_BY) Long createdBy, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_PAYMENT_DATE) OffsetDateTime paymentDate, 
    @JsonProperty(JSON_PROPERTY_TOTAL_ADJUSTMENT_AMOUNT_INCLUDING_TAX) BigDecimal totalAdjustmentAmountIncludingTax
  ) {
    this();
    this.adjustments = adjustments;
    this.plannedPurgeDate = plannedPurgeDate;
    this.externalId = externalId;
    this.postingAmount = postingAmount;
    this.source = source;
    this.valueDate = valueDate;
    this.type = type;
    this.createdOn = createdOn;
    this.version = version;
    this.reference = reference;
    this.linkedSpaceId = linkedSpaceId;
    this.valueAmount = valueAmount;
    this.createdBy = createdBy;
    this.id = id;
    this.paymentDate = paymentDate;
    this.totalAdjustmentAmountIncludingTax = totalAdjustmentAmountIncludingTax;
  }

   /**
   * Adjustments are changes made to the initial transaction amount, such as fees or corrections.
   * @return adjustments
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADJUSTMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PaymentAdjustment> getAdjustments() {
    return adjustments;
  }



  public BankTransaction currencyBankAccount(CurrencyBankAccount currencyBankAccount) {
    
    this.currencyBankAccount = currencyBankAccount;
    return this;
  }

   /**
   * Get currencyBankAccount
   * @return currencyBankAccount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY_BANK_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CurrencyBankAccount getCurrencyBankAccount() {
    return currencyBankAccount;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_BANK_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyBankAccount(CurrencyBankAccount currencyBankAccount) {
    this.currencyBankAccount = currencyBankAccount;
  }

   /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }



   /**
   * A client generated nonce which identifies the entity to be created. Subsequent creation requests with the same external ID will not create new entities but return the initially created entity instead.
   * @return externalId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalId() {
    return externalId;
  }



   /**
   * The posting amount refers to the monetary value recorded for the bank transaction prior to any adjustments.
   * @return postingAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSTING_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPostingAmount() {
    return postingAmount;
  }



   /**
   * The source indicates how the bank transaction was created.
   * @return source
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSource() {
    return source;
  }



   /**
   * The value date indicates the date on which the transaction amount becomes effective.
   * @return valueDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getValueDate() {
    return valueDate;
  }



   /**
   * The bank transaction&#39;s type.
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getType() {
    return type;
  }



   /**
   * The date and time when the object was created.
   * @return createdOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedOn() {
    return createdOn;
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



   /**
   * A unique reference to identify the bank transaction.
   * @return reference
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
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
   * The value amount represents the net monetary value of the transaction after applicable deductions.
   * @return valueAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getValueAmount() {
    return valueAmount;
  }



  public BankTransaction flowDirection(BankTransactionFlowDirection flowDirection) {
    
    this.flowDirection = flowDirection;
    return this;
  }

   /**
   * Get flowDirection
   * @return flowDirection
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLOW_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BankTransactionFlowDirection getFlowDirection() {
    return flowDirection;
  }


  @JsonProperty(JSON_PROPERTY_FLOW_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFlowDirection(BankTransactionFlowDirection flowDirection) {
    this.flowDirection = flowDirection;
  }

   /**
   * The ID of the user the bank transaction was created by.
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreatedBy() {
    return createdBy;
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



  public BankTransaction state(BankTransactionState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BankTransactionState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(BankTransactionState state) {
    this.state = state;
  }

   /**
   * The payment date specifies the date on which the payment was processed.
   * @return paymentDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPaymentDate() {
    return paymentDate;
  }



   /**
   * Represents the total value of all adjustments to the bank transaction, including tax.
   * @return totalAdjustmentAmountIncludingTax
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_ADJUSTMENT_AMOUNT_INCLUDING_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTotalAdjustmentAmountIncludingTax() {
    return totalAdjustmentAmountIncludingTax;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankTransaction bankTransaction = (BankTransaction) o;
    return Objects.equals(this.adjustments, bankTransaction.adjustments) &&
        Objects.equals(this.currencyBankAccount, bankTransaction.currencyBankAccount) &&
        Objects.equals(this.plannedPurgeDate, bankTransaction.plannedPurgeDate) &&
        Objects.equals(this.externalId, bankTransaction.externalId) &&
        Objects.equals(this.postingAmount, bankTransaction.postingAmount) &&
        Objects.equals(this.source, bankTransaction.source) &&
        Objects.equals(this.valueDate, bankTransaction.valueDate) &&
        Objects.equals(this.type, bankTransaction.type) &&
        Objects.equals(this.createdOn, bankTransaction.createdOn) &&
        Objects.equals(this.version, bankTransaction.version) &&
        Objects.equals(this.reference, bankTransaction.reference) &&
        Objects.equals(this.linkedSpaceId, bankTransaction.linkedSpaceId) &&
        Objects.equals(this.valueAmount, bankTransaction.valueAmount) &&
        Objects.equals(this.flowDirection, bankTransaction.flowDirection) &&
        Objects.equals(this.createdBy, bankTransaction.createdBy) &&
        Objects.equals(this.id, bankTransaction.id) &&
        Objects.equals(this.state, bankTransaction.state) &&
        Objects.equals(this.paymentDate, bankTransaction.paymentDate) &&
        Objects.equals(this.totalAdjustmentAmountIncludingTax, bankTransaction.totalAdjustmentAmountIncludingTax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustments, currencyBankAccount, plannedPurgeDate, externalId, postingAmount, source, valueDate, type, createdOn, version, reference, linkedSpaceId, valueAmount, flowDirection, createdBy, id, state, paymentDate, totalAdjustmentAmountIncludingTax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankTransaction {\n");
    sb.append("    adjustments: ").append(toIndentedString(adjustments)).append("\n");
    sb.append("    currencyBankAccount: ").append(toIndentedString(currencyBankAccount)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    postingAmount: ").append(toIndentedString(postingAmount)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    valueAmount: ").append(toIndentedString(valueAmount)).append("\n");
    sb.append("    flowDirection: ").append(toIndentedString(flowDirection)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    totalAdjustmentAmountIncludingTax: ").append(toIndentedString(totalAdjustmentAmountIncludingTax)).append("\n");
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

    // add `adjustments` to the URL query string
    if (getAdjustments() != null) {
      for (int i = 0; i < getAdjustments().size(); i++) {
        if (getAdjustments().get(i) != null) {
          joiner.add(getAdjustments().get(i).toUrlQueryString(String.format("%sadjustments%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `currencyBankAccount` to the URL query string
    if (getCurrencyBankAccount() != null) {
      joiner.add(getCurrencyBankAccount().toUrlQueryString(prefix + "currencyBankAccount" + suffix));
    }

    // add `plannedPurgeDate` to the URL query string
    if (getPlannedPurgeDate() != null) {
      try {
        joiner.add(String.format("%splannedPurgeDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlannedPurgeDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `externalId` to the URL query string
    if (getExternalId() != null) {
      try {
        joiner.add(String.format("%sexternalId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExternalId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `postingAmount` to the URL query string
    if (getPostingAmount() != null) {
      try {
        joiner.add(String.format("%spostingAmount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPostingAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `source` to the URL query string
    if (getSource() != null) {
      try {
        joiner.add(String.format("%ssource%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSource()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `valueDate` to the URL query string
    if (getValueDate() != null) {
      try {
        joiner.add(String.format("%svalueDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getValueDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createdOn` to the URL query string
    if (getCreatedOn() != null) {
      try {
        joiner.add(String.format("%screatedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

    // add `reference` to the URL query string
    if (getReference() != null) {
      try {
        joiner.add(String.format("%sreference%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReference()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
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

    // add `valueAmount` to the URL query string
    if (getValueAmount() != null) {
      try {
        joiner.add(String.format("%svalueAmount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getValueAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `flowDirection` to the URL query string
    if (getFlowDirection() != null) {
      try {
        joiner.add(String.format("%sflowDirection%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFlowDirection()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createdBy` to the URL query string
    if (getCreatedBy() != null) {
      try {
        joiner.add(String.format("%screatedBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedBy()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `state` to the URL query string
    if (getState() != null) {
      try {
        joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `paymentDate` to the URL query string
    if (getPaymentDate() != null) {
      try {
        joiner.add(String.format("%spaymentDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `totalAdjustmentAmountIncludingTax` to the URL query string
    if (getTotalAdjustmentAmountIncludingTax() != null) {
      try {
        joiner.add(String.format("%stotalAdjustmentAmountIncludingTax%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTotalAdjustmentAmountIncludingTax()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

