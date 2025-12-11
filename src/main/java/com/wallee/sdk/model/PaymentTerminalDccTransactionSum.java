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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Represents the aggregated summary of Dynamic Currency Conversion (DCC) transactions grouped by brand and currency combinations in a transaction summary receipt.
 */
@JsonPropertyOrder({
  PaymentTerminalDccTransactionSum.JSON_PROPERTY_TRANSACTION_CURRENCY,
  PaymentTerminalDccTransactionSum.JSON_PROPERTY_TRANSACTION_AMOUNT,
  PaymentTerminalDccTransactionSum.JSON_PROPERTY_DCC_AMOUNT,
  PaymentTerminalDccTransactionSum.JSON_PROPERTY_ID,
  PaymentTerminalDccTransactionSum.JSON_PROPERTY_TRANSACTION_COUNT,
  PaymentTerminalDccTransactionSum.JSON_PROPERTY_DCC_CURRENCY,
  PaymentTerminalDccTransactionSum.JSON_PROPERTY_BRAND,
  PaymentTerminalDccTransactionSum.JSON_PROPERTY_VERSION
})

public class PaymentTerminalDccTransactionSum {
  public static final String JSON_PROPERTY_TRANSACTION_CURRENCY = "transactionCurrency";
  @javax.annotation.Nullable
  private String transactionCurrency;

  public static final String JSON_PROPERTY_TRANSACTION_AMOUNT = "transactionAmount";
  @javax.annotation.Nullable
  private BigDecimal transactionAmount;

  public static final String JSON_PROPERTY_DCC_AMOUNT = "dccAmount";
  @javax.annotation.Nullable
  private BigDecimal dccAmount;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_TRANSACTION_COUNT = "transactionCount";
  @javax.annotation.Nullable
  private Integer transactionCount;

  public static final String JSON_PROPERTY_DCC_CURRENCY = "dccCurrency";
  @javax.annotation.Nullable
  private String dccCurrency;

  public static final String JSON_PROPERTY_BRAND = "brand";
  @javax.annotation.Nullable
  private String brand;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public PaymentTerminalDccTransactionSum() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public PaymentTerminalDccTransactionSum(
    @JsonProperty(JSON_PROPERTY_TRANSACTION_CURRENCY) String transactionCurrency, 
    @JsonProperty(JSON_PROPERTY_TRANSACTION_AMOUNT) BigDecimal transactionAmount, 
    @JsonProperty(JSON_PROPERTY_DCC_AMOUNT) BigDecimal dccAmount, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_TRANSACTION_COUNT) Integer transactionCount, 
    @JsonProperty(JSON_PROPERTY_DCC_CURRENCY) String dccCurrency, 
    @JsonProperty(JSON_PROPERTY_BRAND) String brand, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version
  ) {
    this();
    this.transactionCurrency = transactionCurrency;
    this.transactionAmount = transactionAmount;
    this.dccAmount = dccAmount;
    this.id = id;
    this.transactionCount = transactionCount;
    this.dccCurrency = dccCurrency;
    this.brand = brand;
    this.version = version;
  }

  /**
   * The original currency of the transactions before DCC conversion (typically the merchant&#39;s local currency).
   * @return transactionCurrency
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSACTION_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTransactionCurrency() {
    return transactionCurrency;
  }



  /**
   * The total sum of all transactions in the original transaction currency (the amount in merchant&#39;s local currency before DCC conversion).
   * @return transactionAmount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSACTION_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTransactionAmount() {
    return transactionAmount;
  }



  /**
   * The total sum of all transactions in the converted DCC currency (the amount paid by customers in their chosen currency).
   * @return dccAmount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DCC_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDccAmount() {
    return dccAmount;
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
   * The total count of DCC transactions processed for this specific brand and currency combination.
   * @return transactionCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSACTION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTransactionCount() {
    return transactionCount;
  }



  /**
   * The converted currency used in DCC transactions (the currency chosen by the customer for payment).
   * @return dccCurrency
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DCC_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDccCurrency() {
    return dccCurrency;
  }



  /**
   * The payment brand for which these DCC transactions are summarized.
   * @return brand
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrand() {
    return brand;
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
    PaymentTerminalDccTransactionSum paymentTerminalDccTransactionSum = (PaymentTerminalDccTransactionSum) o;
    return Objects.equals(this.transactionCurrency, paymentTerminalDccTransactionSum.transactionCurrency) &&
        Objects.equals(this.transactionAmount, paymentTerminalDccTransactionSum.transactionAmount) &&
        Objects.equals(this.dccAmount, paymentTerminalDccTransactionSum.dccAmount) &&
        Objects.equals(this.id, paymentTerminalDccTransactionSum.id) &&
        Objects.equals(this.transactionCount, paymentTerminalDccTransactionSum.transactionCount) &&
        Objects.equals(this.dccCurrency, paymentTerminalDccTransactionSum.dccCurrency) &&
        Objects.equals(this.brand, paymentTerminalDccTransactionSum.brand) &&
        Objects.equals(this.version, paymentTerminalDccTransactionSum.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionCurrency, transactionAmount, dccAmount, id, transactionCount, dccCurrency, brand, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTerminalDccTransactionSum {\n");
    sb.append("    transactionCurrency: ").append(toIndentedString(transactionCurrency)).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    dccAmount: ").append(toIndentedString(dccAmount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transactionCount: ").append(toIndentedString(transactionCount)).append("\n");
    sb.append("    dccCurrency: ").append(toIndentedString(dccCurrency)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
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

    // add `transactionCurrency` to the URL query string
    if (getTransactionCurrency() != null) {
      try {
        joiner.add(String.format("%stransactionCurrency%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTransactionCurrency()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `transactionAmount` to the URL query string
    if (getTransactionAmount() != null) {
      try {
        joiner.add(String.format("%stransactionAmount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTransactionAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `dccAmount` to the URL query string
    if (getDccAmount() != null) {
      try {
        joiner.add(String.format("%sdccAmount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDccAmount()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `transactionCount` to the URL query string
    if (getTransactionCount() != null) {
      try {
        joiner.add(String.format("%stransactionCount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTransactionCount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `dccCurrency` to the URL query string
    if (getDccCurrency() != null) {
      try {
        joiner.add(String.format("%sdccCurrency%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDccCurrency()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `brand` to the URL query string
    if (getBrand() != null) {
      try {
        joiner.add(String.format("%sbrand%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBrand()), "UTF-8").replaceAll("\\+", "%20")));
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

