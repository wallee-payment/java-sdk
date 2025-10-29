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
import com.wallee.sdk.model.Tax;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * PaymentAdjustment
 */
@JsonPropertyOrder({
  PaymentAdjustment.JSON_PROPERTY_AMOUNT_EXCLUDING_TAX,
  PaymentAdjustment.JSON_PROPERTY_RATE_IN_PERCENTAGE,
  PaymentAdjustment.JSON_PROPERTY_TAX,
  PaymentAdjustment.JSON_PROPERTY_ID,
  PaymentAdjustment.JSON_PROPERTY_AMOUNT_INCLUDING_TAX,
  PaymentAdjustment.JSON_PROPERTY_TYPE
})

public class PaymentAdjustment {
  public static final String JSON_PROPERTY_AMOUNT_EXCLUDING_TAX = "amountExcludingTax";
  private BigDecimal amountExcludingTax;

  public static final String JSON_PROPERTY_RATE_IN_PERCENTAGE = "rateInPercentage";
  private BigDecimal rateInPercentage;

  public static final String JSON_PROPERTY_TAX = "tax";
  private Tax tax;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_AMOUNT_INCLUDING_TAX = "amountIncludingTax";
  private BigDecimal amountIncludingTax;

  public static final String JSON_PROPERTY_TYPE = "type";
  private Long type;

  public PaymentAdjustment() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public PaymentAdjustment(
    @JsonProperty(JSON_PROPERTY_AMOUNT_EXCLUDING_TAX) BigDecimal amountExcludingTax, 
    @JsonProperty(JSON_PROPERTY_RATE_IN_PERCENTAGE) BigDecimal rateInPercentage, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_AMOUNT_INCLUDING_TAX) BigDecimal amountIncludingTax, 
    @JsonProperty(JSON_PROPERTY_TYPE) Long type
  ) {
    this();
    this.amountExcludingTax = amountExcludingTax;
    this.rateInPercentage = rateInPercentage;
    this.id = id;
    this.amountIncludingTax = amountIncludingTax;
    this.type = type;
  }

   /**
   * The adjustment&#39;s amount, excluding taxes.
   * @return amountExcludingTax
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT_EXCLUDING_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAmountExcludingTax() {
    return amountExcludingTax;
  }



   /**
   * The percentage rate used to calculate the adjustment amount.
   * maximum: 100
   * @return rateInPercentage
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RATE_IN_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRateInPercentage() {
    return rateInPercentage;
  }



  public PaymentAdjustment tax(Tax tax) {
    
    this.tax = tax;
    return this;
  }

   /**
   * Get tax
   * @return tax
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Tax getTax() {
    return tax;
  }


  @JsonProperty(JSON_PROPERTY_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTax(Tax tax) {
    this.tax = tax;
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
   * The adjustment&#39;s amount, including taxes.
   * @return amountIncludingTax
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT_INCLUDING_TAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAmountIncludingTax() {
    return amountIncludingTax;
  }



   /**
   * The type of the adjustment.
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getType() {
    return type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAdjustment paymentAdjustment = (PaymentAdjustment) o;
    return Objects.equals(this.amountExcludingTax, paymentAdjustment.amountExcludingTax) &&
        Objects.equals(this.rateInPercentage, paymentAdjustment.rateInPercentage) &&
        Objects.equals(this.tax, paymentAdjustment.tax) &&
        Objects.equals(this.id, paymentAdjustment.id) &&
        Objects.equals(this.amountIncludingTax, paymentAdjustment.amountIncludingTax) &&
        Objects.equals(this.type, paymentAdjustment.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountExcludingTax, rateInPercentage, tax, id, amountIncludingTax, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAdjustment {\n");
    sb.append("    amountExcludingTax: ").append(toIndentedString(amountExcludingTax)).append("\n");
    sb.append("    rateInPercentage: ").append(toIndentedString(rateInPercentage)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amountIncludingTax: ").append(toIndentedString(amountIncludingTax)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

    // add `amountExcludingTax` to the URL query string
    if (getAmountExcludingTax() != null) {
      try {
        joiner.add(String.format("%samountExcludingTax%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmountExcludingTax()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `rateInPercentage` to the URL query string
    if (getRateInPercentage() != null) {
      try {
        joiner.add(String.format("%srateInPercentage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRateInPercentage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `tax` to the URL query string
    if (getTax() != null) {
      joiner.add(getTax().toUrlQueryString(prefix + "tax" + suffix));
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

    // add `amountIncludingTax` to the URL query string
    if (getAmountIncludingTax() != null) {
      try {
        joiner.add(String.format("%samountIncludingTax%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmountIncludingTax()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

