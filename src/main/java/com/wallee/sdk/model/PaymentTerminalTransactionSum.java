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
 * Represents the aggregated transaction data for a specific brand and currency, including regular and DCC (Dynamic Currency Conversion) transactions.
 */
@JsonPropertyOrder({
  PaymentTerminalTransactionSum.JSON_PROPERTY_TRANSACTION_TIP_AMOUNT,
  PaymentTerminalTransactionSum.JSON_PROPERTY_PRODUCT,
  PaymentTerminalTransactionSum.JSON_PROPERTY_TRANSACTION_CURRENCY,
  PaymentTerminalTransactionSum.JSON_PROPERTY_TRANSACTION_AMOUNT,
  PaymentTerminalTransactionSum.JSON_PROPERTY_DCC_TIP_AMOUNT,
  PaymentTerminalTransactionSum.JSON_PROPERTY_ID,
  PaymentTerminalTransactionSum.JSON_PROPERTY_TRANSACTION_COUNT,
  PaymentTerminalTransactionSum.JSON_PROPERTY_BRAND,
  PaymentTerminalTransactionSum.JSON_PROPERTY_DCC_TRANSACTION_COUNT,
  PaymentTerminalTransactionSum.JSON_PROPERTY_VERSION,
  PaymentTerminalTransactionSum.JSON_PROPERTY_DCC_TRANSACTION_AMOUNT
})

public class PaymentTerminalTransactionSum {
  public static final String JSON_PROPERTY_TRANSACTION_TIP_AMOUNT = "transactionTipAmount";
  @javax.annotation.Nullable
  private BigDecimal transactionTipAmount;

  public static final String JSON_PROPERTY_PRODUCT = "product";
  @javax.annotation.Nullable
  private String product;

  public static final String JSON_PROPERTY_TRANSACTION_CURRENCY = "transactionCurrency";
  @javax.annotation.Nullable
  private String transactionCurrency;

  public static final String JSON_PROPERTY_TRANSACTION_AMOUNT = "transactionAmount";
  @javax.annotation.Nullable
  private BigDecimal transactionAmount;

  public static final String JSON_PROPERTY_DCC_TIP_AMOUNT = "dccTipAmount";
  @javax.annotation.Nullable
  private BigDecimal dccTipAmount;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_TRANSACTION_COUNT = "transactionCount";
  @javax.annotation.Nullable
  private Integer transactionCount;

  public static final String JSON_PROPERTY_BRAND = "brand";
  @javax.annotation.Nullable
  private String brand;

  public static final String JSON_PROPERTY_DCC_TRANSACTION_COUNT = "dccTransactionCount";
  @javax.annotation.Nullable
  private Integer dccTransactionCount;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_DCC_TRANSACTION_AMOUNT = "dccTransactionAmount";
  @javax.annotation.Nullable
  private BigDecimal dccTransactionAmount;

  public PaymentTerminalTransactionSum() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public PaymentTerminalTransactionSum(
    @JsonProperty(JSON_PROPERTY_TRANSACTION_TIP_AMOUNT) BigDecimal transactionTipAmount, 
    @JsonProperty(JSON_PROPERTY_PRODUCT) String product, 
    @JsonProperty(JSON_PROPERTY_TRANSACTION_CURRENCY) String transactionCurrency, 
    @JsonProperty(JSON_PROPERTY_TRANSACTION_AMOUNT) BigDecimal transactionAmount, 
    @JsonProperty(JSON_PROPERTY_DCC_TIP_AMOUNT) BigDecimal dccTipAmount, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_TRANSACTION_COUNT) Integer transactionCount, 
    @JsonProperty(JSON_PROPERTY_BRAND) String brand, 
    @JsonProperty(JSON_PROPERTY_DCC_TRANSACTION_COUNT) Integer dccTransactionCount, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_DCC_TRANSACTION_AMOUNT) BigDecimal dccTransactionAmount
  ) {
    this();
    this.transactionTipAmount = transactionTipAmount;
    this.product = product;
    this.transactionCurrency = transactionCurrency;
    this.transactionAmount = transactionAmount;
    this.dccTipAmount = dccTipAmount;
    this.id = id;
    this.transactionCount = transactionCount;
    this.brand = brand;
    this.dccTransactionCount = dccTransactionCount;
    this.version = version;
    this.dccTransactionAmount = dccTransactionAmount;
  }

  /**
   * The total amount of tips from regular (non-DCC) transactions in the transaction currency.
   * @return transactionTipAmount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSACTION_TIP_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTransactionTipAmount() {
    return transactionTipAmount;
  }



  /**
   * The product within the brand for which transactions are summarized.
   * @return product
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProduct() {
    return product;
  }



  /**
   * The base currency in which the transactions were processed and settled, excluding any DCC conversions.
   * @return transactionCurrency
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSACTION_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTransactionCurrency() {
    return transactionCurrency;
  }



  /**
   * The total monetary value of all transactions in the transaction currency, excluding DCC transactions.
   * @return transactionAmount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSACTION_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTransactionAmount() {
    return transactionAmount;
  }



  /**
   * The total amount of tips from DCC transactions, converted and presented in the transaction currency.
   * @return dccTipAmount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DCC_TIP_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDccTipAmount() {
    return dccTipAmount;
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
   * The total count of regular (non-DCC) transactions processed within this summary period.
   * @return transactionCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRANSACTION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTransactionCount() {
    return transactionCount;
  }



  /**
   * The payment brand for which the transactions are summarized.
   * @return brand
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrand() {
    return brand;
  }



  /**
   * The number of transactions where Dynamic Currency Conversion (DCC) was applied, allowing customers to pay in their home currency.
   * @return dccTransactionCount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DCC_TRANSACTION_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDccTransactionCount() {
    return dccTransactionCount;
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



  /**
   * The total monetary value of DCC transactions, converted and presented in the transaction currency.
   * @return dccTransactionAmount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DCC_TRANSACTION_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDccTransactionAmount() {
    return dccTransactionAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTerminalTransactionSum paymentTerminalTransactionSum = (PaymentTerminalTransactionSum) o;
    return Objects.equals(this.transactionTipAmount, paymentTerminalTransactionSum.transactionTipAmount) &&
        Objects.equals(this.product, paymentTerminalTransactionSum.product) &&
        Objects.equals(this.transactionCurrency, paymentTerminalTransactionSum.transactionCurrency) &&
        Objects.equals(this.transactionAmount, paymentTerminalTransactionSum.transactionAmount) &&
        Objects.equals(this.dccTipAmount, paymentTerminalTransactionSum.dccTipAmount) &&
        Objects.equals(this.id, paymentTerminalTransactionSum.id) &&
        Objects.equals(this.transactionCount, paymentTerminalTransactionSum.transactionCount) &&
        Objects.equals(this.brand, paymentTerminalTransactionSum.brand) &&
        Objects.equals(this.dccTransactionCount, paymentTerminalTransactionSum.dccTransactionCount) &&
        Objects.equals(this.version, paymentTerminalTransactionSum.version) &&
        Objects.equals(this.dccTransactionAmount, paymentTerminalTransactionSum.dccTransactionAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionTipAmount, product, transactionCurrency, transactionAmount, dccTipAmount, id, transactionCount, brand, dccTransactionCount, version, dccTransactionAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTerminalTransactionSum {\n");
    sb.append("    transactionTipAmount: ").append(toIndentedString(transactionTipAmount)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    transactionCurrency: ").append(toIndentedString(transactionCurrency)).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    dccTipAmount: ").append(toIndentedString(dccTipAmount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transactionCount: ").append(toIndentedString(transactionCount)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    dccTransactionCount: ").append(toIndentedString(dccTransactionCount)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    dccTransactionAmount: ").append(toIndentedString(dccTransactionAmount)).append("\n");
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

    // add `transactionTipAmount` to the URL query string
    if (getTransactionTipAmount() != null) {
      try {
        joiner.add(String.format("%stransactionTipAmount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTransactionTipAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `product` to the URL query string
    if (getProduct() != null) {
      try {
        joiner.add(String.format("%sproduct%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProduct()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

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

    // add `dccTipAmount` to the URL query string
    if (getDccTipAmount() != null) {
      try {
        joiner.add(String.format("%sdccTipAmount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDccTipAmount()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `brand` to the URL query string
    if (getBrand() != null) {
      try {
        joiner.add(String.format("%sbrand%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBrand()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `dccTransactionCount` to the URL query string
    if (getDccTransactionCount() != null) {
      try {
        joiner.add(String.format("%sdccTransactionCount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDccTransactionCount()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `dccTransactionAmount` to the URL query string
    if (getDccTransactionAmount() != null) {
      try {
        joiner.add(String.format("%sdccTransactionAmount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDccTransactionAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

