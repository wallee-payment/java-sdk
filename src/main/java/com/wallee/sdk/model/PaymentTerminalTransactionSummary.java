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
import com.wallee.sdk.model.PaymentTerminalDccTransactionSum;
import com.wallee.sdk.model.PaymentTerminalTransactionSum;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * PaymentTerminalTransactionSummary
 */
@JsonPropertyOrder({
  PaymentTerminalTransactionSummary.JSON_PROPERTY_REFERENCE,
  PaymentTerminalTransactionSummary.JSON_PROPERTY_LINKED_SPACE_ID,
  PaymentTerminalTransactionSummary.JSON_PROPERTY_TRANSACTION_SUMS,
  PaymentTerminalTransactionSummary.JSON_PROPERTY_DCC_TRANSACTION_SUMS,
  PaymentTerminalTransactionSummary.JSON_PROPERTY_ENDED_ON,
  PaymentTerminalTransactionSummary.JSON_PROPERTY_BALANCE_AMOUNT_PER_CURRENCY,
  PaymentTerminalTransactionSummary.JSON_PROPERTY_PAYMENT_TERMINAL,
  PaymentTerminalTransactionSummary.JSON_PROPERTY_RECEIPT,
  PaymentTerminalTransactionSummary.JSON_PROPERTY_ID,
  PaymentTerminalTransactionSummary.JSON_PROPERTY_NUMBER_OF_TRANSACTIONS,
  PaymentTerminalTransactionSummary.JSON_PROPERTY_STARTED_ON,
  PaymentTerminalTransactionSummary.JSON_PROPERTY_VERSION
})

public class PaymentTerminalTransactionSummary {
  public static final String JSON_PROPERTY_REFERENCE = "reference";
  @javax.annotation.Nullable
  private Long reference;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_TRANSACTION_SUMS = "transactionSums";
  @javax.annotation.Nullable
  private List<PaymentTerminalTransactionSum> transactionSums = new ArrayList<>();

  public static final String JSON_PROPERTY_DCC_TRANSACTION_SUMS = "dccTransactionSums";
  @javax.annotation.Nullable
  private List<PaymentTerminalDccTransactionSum> dccTransactionSums = new ArrayList<>();

  public static final String JSON_PROPERTY_ENDED_ON = "endedOn";
  @javax.annotation.Nullable
  private OffsetDateTime endedOn;

  public static final String JSON_PROPERTY_BALANCE_AMOUNT_PER_CURRENCY = "balanceAmountPerCurrency";
  @javax.annotation.Nullable
  private Map<String, BigDecimal> balanceAmountPerCurrency = new HashMap<>();

  public static final String JSON_PROPERTY_PAYMENT_TERMINAL = "paymentTerminal";
  @javax.annotation.Nullable
  private Long paymentTerminal;

  public static final String JSON_PROPERTY_RECEIPT = "receipt";
  @javax.annotation.Nullable
  private String receipt;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_NUMBER_OF_TRANSACTIONS = "numberOfTransactions";
  @javax.annotation.Nullable
  private Integer numberOfTransactions;

  public static final String JSON_PROPERTY_STARTED_ON = "startedOn";
  @javax.annotation.Nullable
  private OffsetDateTime startedOn;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public PaymentTerminalTransactionSummary() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public PaymentTerminalTransactionSummary(
    @JsonProperty(JSON_PROPERTY_REFERENCE) Long reference, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_TRANSACTION_SUMS) List<PaymentTerminalTransactionSum> transactionSums, 
    @JsonProperty(JSON_PROPERTY_DCC_TRANSACTION_SUMS) List<PaymentTerminalDccTransactionSum> dccTransactionSums, 
    @JsonProperty(JSON_PROPERTY_ENDED_ON) OffsetDateTime endedOn, 
    @JsonProperty(JSON_PROPERTY_BALANCE_AMOUNT_PER_CURRENCY) Map<String, BigDecimal> balanceAmountPerCurrency, 
    @JsonProperty(JSON_PROPERTY_PAYMENT_TERMINAL) Long paymentTerminal, 
    @JsonProperty(JSON_PROPERTY_RECEIPT) String receipt, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_NUMBER_OF_TRANSACTIONS) Integer numberOfTransactions, 
    @JsonProperty(JSON_PROPERTY_STARTED_ON) OffsetDateTime startedOn, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version
  ) {
    this();
    this.reference = reference;
    this.linkedSpaceId = linkedSpaceId;
    this.transactionSums = transactionSums;
    this.dccTransactionSums = dccTransactionSums;
    this.endedOn = endedOn;
    this.balanceAmountPerCurrency = balanceAmountPerCurrency;
    this.paymentTerminal = paymentTerminal;
    this.receipt = receipt;
    this.id = id;
    this.numberOfTransactions = numberOfTransactions;
    this.startedOn = startedOn;
    this.version = version;
  }

  /**
   * The unique reference assigned to this transaction summary.
   * @return reference
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getReference() {
    return reference;
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
   * The total monetary amounts of all transactions, organized and grouped by brand and currency.
   * @return transactionSums
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSACTION_SUMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PaymentTerminalTransactionSum> getTransactionSums() {
    return transactionSums;
  }



  /**
   * Detailed breakdown of Dynamic Currency Conversion (DCC) transactions, showing transaction amounts in both original and converted currencies, grouped by payment brand.
   * @return dccTransactionSums
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DCC_TRANSACTION_SUMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PaymentTerminalDccTransactionSum> getDccTransactionSums() {
    return dccTransactionSums;
  }



  /**
   * The end of the time period covered by this summary report.
   * @return endedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndedOn() {
    return endedOn;
  }



  /**
   * The overall transaction volume in each processed currency.
   * @return balanceAmountPerCurrency
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BALANCE_AMOUNT_PER_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, BigDecimal> getBalanceAmountPerCurrency() {
    return balanceAmountPerCurrency;
  }



  /**
   * The payment terminal that processed the transactions included in this summary report.
   * @return paymentTerminal
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_TERMINAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPaymentTerminal() {
    return paymentTerminal;
  }



  /**
   * The HTML content of the transaction summary receipt.
   * @return receipt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReceipt() {
    return receipt;
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
   * The total count of all transactions processed by the terminal during the summary period.
   * @return numberOfTransactions
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_TRANSACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfTransactions() {
    return numberOfTransactions;
  }



  /**
   * The beginning of the time period covered by this summary report.
   * @return startedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STARTED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartedOn() {
    return startedOn;
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTerminalTransactionSummary paymentTerminalTransactionSummary = (PaymentTerminalTransactionSummary) o;
    return Objects.equals(this.reference, paymentTerminalTransactionSummary.reference) &&
        Objects.equals(this.linkedSpaceId, paymentTerminalTransactionSummary.linkedSpaceId) &&
        Objects.equals(this.transactionSums, paymentTerminalTransactionSummary.transactionSums) &&
        Objects.equals(this.dccTransactionSums, paymentTerminalTransactionSummary.dccTransactionSums) &&
        Objects.equals(this.endedOn, paymentTerminalTransactionSummary.endedOn) &&
        Objects.equals(this.balanceAmountPerCurrency, paymentTerminalTransactionSummary.balanceAmountPerCurrency) &&
        Objects.equals(this.paymentTerminal, paymentTerminalTransactionSummary.paymentTerminal) &&
        Objects.equals(this.receipt, paymentTerminalTransactionSummary.receipt) &&
        Objects.equals(this.id, paymentTerminalTransactionSummary.id) &&
        Objects.equals(this.numberOfTransactions, paymentTerminalTransactionSummary.numberOfTransactions) &&
        Objects.equals(this.startedOn, paymentTerminalTransactionSummary.startedOn) &&
        Objects.equals(this.version, paymentTerminalTransactionSummary.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, linkedSpaceId, transactionSums, dccTransactionSums, endedOn, balanceAmountPerCurrency, paymentTerminal, receipt, id, numberOfTransactions, startedOn, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTerminalTransactionSummary {\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    transactionSums: ").append(toIndentedString(transactionSums)).append("\n");
    sb.append("    dccTransactionSums: ").append(toIndentedString(dccTransactionSums)).append("\n");
    sb.append("    endedOn: ").append(toIndentedString(endedOn)).append("\n");
    sb.append("    balanceAmountPerCurrency: ").append(toIndentedString(balanceAmountPerCurrency)).append("\n");
    sb.append("    paymentTerminal: ").append(toIndentedString(paymentTerminal)).append("\n");
    sb.append("    receipt: ").append(toIndentedString(receipt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numberOfTransactions: ").append(toIndentedString(numberOfTransactions)).append("\n");
    sb.append("    startedOn: ").append(toIndentedString(startedOn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

    // add `transactionSums` to the URL query string
    if (getTransactionSums() != null) {
      for (int i = 0; i < getTransactionSums().size(); i++) {
        if (getTransactionSums().get(i) != null) {
          joiner.add(getTransactionSums().get(i).toUrlQueryString(String.format("%stransactionSums%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `dccTransactionSums` to the URL query string
    if (getDccTransactionSums() != null) {
      for (int i = 0; i < getDccTransactionSums().size(); i++) {
        if (getDccTransactionSums().get(i) != null) {
          joiner.add(getDccTransactionSums().get(i).toUrlQueryString(String.format("%sdccTransactionSums%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `endedOn` to the URL query string
    if (getEndedOn() != null) {
      try {
        joiner.add(String.format("%sendedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEndedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `balanceAmountPerCurrency` to the URL query string
    if (getBalanceAmountPerCurrency() != null) {
      for (String _key : getBalanceAmountPerCurrency().keySet()) {
        try {
          joiner.add(String.format("%sbalanceAmountPerCurrency%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getBalanceAmountPerCurrency().get(_key), URLEncoder.encode(String.valueOf(getBalanceAmountPerCurrency().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `paymentTerminal` to the URL query string
    if (getPaymentTerminal() != null) {
      try {
        joiner.add(String.format("%spaymentTerminal%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentTerminal()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `receipt` to the URL query string
    if (getReceipt() != null) {
      try {
        joiner.add(String.format("%sreceipt%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReceipt()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `numberOfTransactions` to the URL query string
    if (getNumberOfTransactions() != null) {
      try {
        joiner.add(String.format("%snumberOfTransactions%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNumberOfTransactions()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `startedOn` to the URL query string
    if (getStartedOn() != null) {
      try {
        joiner.add(String.format("%sstartedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getStartedOn()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

