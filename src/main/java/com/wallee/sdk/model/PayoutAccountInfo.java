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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * PayoutAccountInfo
 */
@JsonPropertyOrder({
  PayoutAccountInfo.JSON_PROPERTY_IBAN,
  PayoutAccountInfo.JSON_PROPERTY_BANK_NAME,
  PayoutAccountInfo.JSON_PROPERTY_CURRENCY,
  PayoutAccountInfo.JSON_PROPERTY_BIC
})

public class PayoutAccountInfo {
  public static final String JSON_PROPERTY_IBAN = "iban";
  @javax.annotation.Nullable
  private String iban;

  public static final String JSON_PROPERTY_BANK_NAME = "bankName";
  @javax.annotation.Nullable
  private String bankName;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nullable
  private String currency;

  public static final String JSON_PROPERTY_BIC = "bic";
  @javax.annotation.Nullable
  private String bic;

  public PayoutAccountInfo() {
  }

  public PayoutAccountInfo iban(@javax.annotation.Nullable String iban) {
    
    this.iban = iban;
    return this;
  }

  /**
   * Get iban
   * @return iban
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IBAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIban() {
    return iban;
  }


  @JsonProperty(JSON_PROPERTY_IBAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIban(@javax.annotation.Nullable String iban) {
    this.iban = iban;
  }

  public PayoutAccountInfo bankName(@javax.annotation.Nullable String bankName) {
    
    this.bankName = bankName;
    return this;
  }

  /**
   * Get bankName
   * @return bankName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BANK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBankName() {
    return bankName;
  }


  @JsonProperty(JSON_PROPERTY_BANK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankName(@javax.annotation.Nullable String bankName) {
    this.bankName = bankName;
  }

  public PayoutAccountInfo currency(@javax.annotation.Nullable String currency) {
    
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
  }

  public PayoutAccountInfo bic(@javax.annotation.Nullable String bic) {
    
    this.bic = bic;
    return this;
  }

  /**
   * Get bic
   * @return bic
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBic() {
    return bic;
  }


  @JsonProperty(JSON_PROPERTY_BIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBic(@javax.annotation.Nullable String bic) {
    this.bic = bic;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutAccountInfo payoutAccountInfo = (PayoutAccountInfo) o;
    return Objects.equals(this.iban, payoutAccountInfo.iban) &&
        Objects.equals(this.bankName, payoutAccountInfo.bankName) &&
        Objects.equals(this.currency, payoutAccountInfo.currency) &&
        Objects.equals(this.bic, payoutAccountInfo.bic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iban, bankName, currency, bic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutAccountInfo {\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
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

    // add `iban` to the URL query string
    if (getIban() != null) {
      try {
        joiner.add(String.format("%siban%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIban()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `bankName` to the URL query string
    if (getBankName() != null) {
      try {
        joiner.add(String.format("%sbankName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBankName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      try {
        joiner.add(String.format("%scurrency%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCurrency()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `bic` to the URL query string
    if (getBic() != null) {
      try {
        joiner.add(String.format("%sbic%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBic()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

