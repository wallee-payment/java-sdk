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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.wallee.sdk.model.SalesChannel;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * MerchantPaymentChannelsDto
 */
@JsonPropertyOrder({
  MerchantPaymentChannelsDto.JSON_PROPERTY_SALES_CHANNELS,
  MerchantPaymentChannelsDto.JSON_PROPERTY_EXPECTED_YEARLY_TURNOVER_CURRENCY_RANGE,
  MerchantPaymentChannelsDto.JSON_PROPERTY_AVERAGE_BASKET_VALUE
})

public class MerchantPaymentChannelsDto {
  public static final String JSON_PROPERTY_SALES_CHANNELS = "salesChannels";
  @javax.annotation.Nullable
  private Set<SalesChannel> salesChannels = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_EXPECTED_YEARLY_TURNOVER_CURRENCY_RANGE = "expectedYearlyTurnoverCurrencyRange";
  @javax.annotation.Nullable
  private String expectedYearlyTurnoverCurrencyRange;

  public static final String JSON_PROPERTY_AVERAGE_BASKET_VALUE = "averageBasketValue";
  @javax.annotation.Nullable
  private String averageBasketValue;

  public MerchantPaymentChannelsDto() {
  }

  public MerchantPaymentChannelsDto salesChannels(@javax.annotation.Nullable Set<SalesChannel> salesChannels) {
    
    this.salesChannels = salesChannels;
    return this;
  }

  public MerchantPaymentChannelsDto addSalesChannelsItem(SalesChannel salesChannelsItem) {
    if (this.salesChannels == null) {
      this.salesChannels = new LinkedHashSet<>();
    }
    this.salesChannels.add(salesChannelsItem);
    return this;
  }

  /**
   * The channels through which the merchant accepts payments.
   * @return salesChannels
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SALES_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<SalesChannel> getSalesChannels() {
    return salesChannels;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_SALES_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSalesChannels(@javax.annotation.Nullable Set<SalesChannel> salesChannels) {
    this.salesChannels = salesChannels;
  }

  public MerchantPaymentChannelsDto expectedYearlyTurnoverCurrencyRange(@javax.annotation.Nullable String expectedYearlyTurnoverCurrencyRange) {
    
    this.expectedYearlyTurnoverCurrencyRange = expectedYearlyTurnoverCurrencyRange;
    return this;
  }

  /**
   * The expected yearly turnover range for the merchant.
   * @return expectedYearlyTurnoverCurrencyRange
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPECTED_YEARLY_TURNOVER_CURRENCY_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpectedYearlyTurnoverCurrencyRange() {
    return expectedYearlyTurnoverCurrencyRange;
  }


  @JsonProperty(JSON_PROPERTY_EXPECTED_YEARLY_TURNOVER_CURRENCY_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpectedYearlyTurnoverCurrencyRange(@javax.annotation.Nullable String expectedYearlyTurnoverCurrencyRange) {
    this.expectedYearlyTurnoverCurrencyRange = expectedYearlyTurnoverCurrencyRange;
  }

  public MerchantPaymentChannelsDto averageBasketValue(@javax.annotation.Nullable String averageBasketValue) {
    
    this.averageBasketValue = averageBasketValue;
    return this;
  }

  /**
   * The expected average basket value for a transaction.
   * @return averageBasketValue
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVERAGE_BASKET_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAverageBasketValue() {
    return averageBasketValue;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_BASKET_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAverageBasketValue(@javax.annotation.Nullable String averageBasketValue) {
    this.averageBasketValue = averageBasketValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantPaymentChannelsDto merchantPaymentChannelsDto = (MerchantPaymentChannelsDto) o;
    return Objects.equals(this.salesChannels, merchantPaymentChannelsDto.salesChannels) &&
        Objects.equals(this.expectedYearlyTurnoverCurrencyRange, merchantPaymentChannelsDto.expectedYearlyTurnoverCurrencyRange) &&
        Objects.equals(this.averageBasketValue, merchantPaymentChannelsDto.averageBasketValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(salesChannels, expectedYearlyTurnoverCurrencyRange, averageBasketValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantPaymentChannelsDto {\n");
    sb.append("    salesChannels: ").append(toIndentedString(salesChannels)).append("\n");
    sb.append("    expectedYearlyTurnoverCurrencyRange: ").append(toIndentedString(expectedYearlyTurnoverCurrencyRange)).append("\n");
    sb.append("    averageBasketValue: ").append(toIndentedString(averageBasketValue)).append("\n");
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

    // add `salesChannels` to the URL query string
    if (getSalesChannels() != null) {
      int i = 0;
      for (SalesChannel _item : getSalesChannels()) {
        if (_item != null) {
          try {
            joiner.add(String.format("%ssalesChannels%s%s=%s", prefix, suffix,
                "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
                URLEncoder.encode(String.valueOf(_item), "UTF-8").replaceAll("\\+", "%20")));
          } catch (UnsupportedEncodingException e) {
            // Should never happen, UTF-8 is always supported
            throw new RuntimeException(e);
          }
        }
        i++;
      }
    }

    // add `expectedYearlyTurnoverCurrencyRange` to the URL query string
    if (getExpectedYearlyTurnoverCurrencyRange() != null) {
      try {
        joiner.add(String.format("%sexpectedYearlyTurnoverCurrencyRange%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExpectedYearlyTurnoverCurrencyRange()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `averageBasketValue` to the URL query string
    if (getAverageBasketValue() != null) {
      try {
        joiner.add(String.format("%saverageBasketValue%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAverageBasketValue()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

