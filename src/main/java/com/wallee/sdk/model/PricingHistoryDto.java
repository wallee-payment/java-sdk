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
 * PricingHistoryDto
 */
@JsonPropertyOrder({
  PricingHistoryDto.JSON_PROPERTY_ACCOUNT_ID,
  PricingHistoryDto.JSON_PROPERTY_REVENUE_SHARE,
  PricingHistoryDto.JSON_PROPERTY_ONE_OFF_REFERRAL,
  PricingHistoryDto.JSON_PROPERTY_PRICING_PROFILE_BUY_RATE_ID,
  PricingHistoryDto.JSON_PROPERTY_PRICING_PROFILE_SELL_RATE_ID
})

public class PricingHistoryDto {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  @javax.annotation.Nullable
  private Long accountId;

  public static final String JSON_PROPERTY_REVENUE_SHARE = "revenueShare";
  @javax.annotation.Nullable
  private BigDecimal revenueShare;

  public static final String JSON_PROPERTY_ONE_OFF_REFERRAL = "oneOffReferral";
  @javax.annotation.Nullable
  private Integer oneOffReferral;

  public static final String JSON_PROPERTY_PRICING_PROFILE_BUY_RATE_ID = "pricingProfileBuyRateId";
  @javax.annotation.Nullable
  private Long pricingProfileBuyRateId;

  public static final String JSON_PROPERTY_PRICING_PROFILE_SELL_RATE_ID = "pricingProfileSellRateId";
  @javax.annotation.Nullable
  private Long pricingProfileSellRateId;

  public PricingHistoryDto() {
  }

  public PricingHistoryDto accountId(@javax.annotation.Nullable Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(@javax.annotation.Nullable Long accountId) {
    this.accountId = accountId;
  }

  public PricingHistoryDto revenueShare(@javax.annotation.Nullable BigDecimal revenueShare) {
    
    this.revenueShare = revenueShare;
    return this;
  }

  /**
   * Get revenueShare
   * @return revenueShare
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVENUE_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRevenueShare() {
    return revenueShare;
  }


  @JsonProperty(JSON_PROPERTY_REVENUE_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRevenueShare(@javax.annotation.Nullable BigDecimal revenueShare) {
    this.revenueShare = revenueShare;
  }

  public PricingHistoryDto oneOffReferral(@javax.annotation.Nullable Integer oneOffReferral) {
    
    this.oneOffReferral = oneOffReferral;
    return this;
  }

  /**
   * Get oneOffReferral
   * @return oneOffReferral
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ONE_OFF_REFERRAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOneOffReferral() {
    return oneOffReferral;
  }


  @JsonProperty(JSON_PROPERTY_ONE_OFF_REFERRAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOneOffReferral(@javax.annotation.Nullable Integer oneOffReferral) {
    this.oneOffReferral = oneOffReferral;
  }

  public PricingHistoryDto pricingProfileBuyRateId(@javax.annotation.Nullable Long pricingProfileBuyRateId) {
    
    this.pricingProfileBuyRateId = pricingProfileBuyRateId;
    return this;
  }

  /**
   * Get pricingProfileBuyRateId
   * @return pricingProfileBuyRateId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRICING_PROFILE_BUY_RATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPricingProfileBuyRateId() {
    return pricingProfileBuyRateId;
  }


  @JsonProperty(JSON_PROPERTY_PRICING_PROFILE_BUY_RATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPricingProfileBuyRateId(@javax.annotation.Nullable Long pricingProfileBuyRateId) {
    this.pricingProfileBuyRateId = pricingProfileBuyRateId;
  }

  public PricingHistoryDto pricingProfileSellRateId(@javax.annotation.Nullable Long pricingProfileSellRateId) {
    
    this.pricingProfileSellRateId = pricingProfileSellRateId;
    return this;
  }

  /**
   * Get pricingProfileSellRateId
   * @return pricingProfileSellRateId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRICING_PROFILE_SELL_RATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPricingProfileSellRateId() {
    return pricingProfileSellRateId;
  }


  @JsonProperty(JSON_PROPERTY_PRICING_PROFILE_SELL_RATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPricingProfileSellRateId(@javax.annotation.Nullable Long pricingProfileSellRateId) {
    this.pricingProfileSellRateId = pricingProfileSellRateId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingHistoryDto pricingHistoryDto = (PricingHistoryDto) o;
    return Objects.equals(this.accountId, pricingHistoryDto.accountId) &&
        Objects.equals(this.revenueShare, pricingHistoryDto.revenueShare) &&
        Objects.equals(this.oneOffReferral, pricingHistoryDto.oneOffReferral) &&
        Objects.equals(this.pricingProfileBuyRateId, pricingHistoryDto.pricingProfileBuyRateId) &&
        Objects.equals(this.pricingProfileSellRateId, pricingHistoryDto.pricingProfileSellRateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, revenueShare, oneOffReferral, pricingProfileBuyRateId, pricingProfileSellRateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingHistoryDto {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    revenueShare: ").append(toIndentedString(revenueShare)).append("\n");
    sb.append("    oneOffReferral: ").append(toIndentedString(oneOffReferral)).append("\n");
    sb.append("    pricingProfileBuyRateId: ").append(toIndentedString(pricingProfileBuyRateId)).append("\n");
    sb.append("    pricingProfileSellRateId: ").append(toIndentedString(pricingProfileSellRateId)).append("\n");
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

    // add `accountId` to the URL query string
    if (getAccountId() != null) {
      try {
        joiner.add(String.format("%saccountId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccountId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `revenueShare` to the URL query string
    if (getRevenueShare() != null) {
      try {
        joiner.add(String.format("%srevenueShare%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRevenueShare()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `oneOffReferral` to the URL query string
    if (getOneOffReferral() != null) {
      try {
        joiner.add(String.format("%soneOffReferral%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOneOffReferral()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `pricingProfileBuyRateId` to the URL query string
    if (getPricingProfileBuyRateId() != null) {
      try {
        joiner.add(String.format("%spricingProfileBuyRateId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPricingProfileBuyRateId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `pricingProfileSellRateId` to the URL query string
    if (getPricingProfileSellRateId() != null) {
      try {
        joiner.add(String.format("%spricingProfileSellRateId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPricingProfileSellRateId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

