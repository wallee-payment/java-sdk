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
import com.wallee.sdk.model.PaymentFacilitatorPricingProfileDto;
import com.wallee.sdk.model.SubscriptionProductDto;
import com.wallee.sdk.model.WalleejoinAdminPricingType;
import com.wallee.sdk.model.WalleejoinPartnershipType;
import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * WalleejoinAdminPartnerConfigurationResponseDto
 */
@JsonPropertyOrder({
  WalleejoinAdminPartnerConfigurationResponseDto.JSON_PROPERTY_PRICING_PROFILE_SELL_RATES,
  WalleejoinAdminPartnerConfigurationResponseDto.JSON_PROPERTY_REVENUE_SHARE,
  WalleejoinAdminPartnerConfigurationResponseDto.JSON_PROPERTY_SUBSCRIPTION_PRODUCTS,
  WalleejoinAdminPartnerConfigurationResponseDto.JSON_PROPERTY_ONE_OFF_REFERRAL,
  WalleejoinAdminPartnerConfigurationResponseDto.JSON_PROPERTY_PRICING_PROFILE_BUY_RATE,
  WalleejoinAdminPartnerConfigurationResponseDto.JSON_PROPERTY_PARTNERSHIP_TYPES,
  WalleejoinAdminPartnerConfigurationResponseDto.JSON_PROPERTY_PARTNER_ACCOUNT,
  WalleejoinAdminPartnerConfigurationResponseDto.JSON_PROPERTY_PRICING_TYPE
})

public class WalleejoinAdminPartnerConfigurationResponseDto {
  public static final String JSON_PROPERTY_PRICING_PROFILE_SELL_RATES = "pricingProfileSellRates";
  @javax.annotation.Nullable
  private Set<PaymentFacilitatorPricingProfileDto> pricingProfileSellRates = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_REVENUE_SHARE = "revenueShare";
  @javax.annotation.Nullable
  private BigDecimal revenueShare;

  public static final String JSON_PROPERTY_SUBSCRIPTION_PRODUCTS = "subscriptionProducts";
  @javax.annotation.Nullable
  private Set<SubscriptionProductDto> subscriptionProducts = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_ONE_OFF_REFERRAL = "oneOffReferral";
  @javax.annotation.Nullable
  private Integer oneOffReferral;

  public static final String JSON_PROPERTY_PRICING_PROFILE_BUY_RATE = "pricingProfileBuyRate";
  @javax.annotation.Nullable
  private PaymentFacilitatorPricingProfileDto pricingProfileBuyRate;

  public static final String JSON_PROPERTY_PARTNERSHIP_TYPES = "partnershipTypes";
  @javax.annotation.Nullable
  private Set<WalleejoinPartnershipType> partnershipTypes = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_PARTNER_ACCOUNT = "partnerAccount";
  @javax.annotation.Nullable
  private Long partnerAccount;

  public static final String JSON_PROPERTY_PRICING_TYPE = "pricingType";
  @javax.annotation.Nullable
  private WalleejoinAdminPricingType pricingType;

  public WalleejoinAdminPartnerConfigurationResponseDto() {
  }

  public WalleejoinAdminPartnerConfigurationResponseDto pricingProfileSellRates(@javax.annotation.Nullable Set<PaymentFacilitatorPricingProfileDto> pricingProfileSellRates) {
    
    this.pricingProfileSellRates = pricingProfileSellRates;
    return this;
  }

  public WalleejoinAdminPartnerConfigurationResponseDto addPricingProfileSellRatesItem(PaymentFacilitatorPricingProfileDto pricingProfileSellRatesItem) {
    if (this.pricingProfileSellRates == null) {
      this.pricingProfileSellRates = new LinkedHashSet<>();
    }
    this.pricingProfileSellRates.add(pricingProfileSellRatesItem);
    return this;
  }

  /**
   * Get pricingProfileSellRates
   * @return pricingProfileSellRates
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRICING_PROFILE_SELL_RATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<PaymentFacilitatorPricingProfileDto> getPricingProfileSellRates() {
    return pricingProfileSellRates;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_PRICING_PROFILE_SELL_RATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPricingProfileSellRates(@javax.annotation.Nullable Set<PaymentFacilitatorPricingProfileDto> pricingProfileSellRates) {
    this.pricingProfileSellRates = pricingProfileSellRates;
  }

  public WalleejoinAdminPartnerConfigurationResponseDto revenueShare(@javax.annotation.Nullable BigDecimal revenueShare) {
    
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

  public WalleejoinAdminPartnerConfigurationResponseDto subscriptionProducts(@javax.annotation.Nullable Set<SubscriptionProductDto> subscriptionProducts) {
    
    this.subscriptionProducts = subscriptionProducts;
    return this;
  }

  public WalleejoinAdminPartnerConfigurationResponseDto addSubscriptionProductsItem(SubscriptionProductDto subscriptionProductsItem) {
    if (this.subscriptionProducts == null) {
      this.subscriptionProducts = new LinkedHashSet<>();
    }
    this.subscriptionProducts.add(subscriptionProductsItem);
    return this;
  }

  /**
   * Get subscriptionProducts
   * @return subscriptionProducts
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_PRODUCTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<SubscriptionProductDto> getSubscriptionProducts() {
    return subscriptionProducts;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_PRODUCTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriptionProducts(@javax.annotation.Nullable Set<SubscriptionProductDto> subscriptionProducts) {
    this.subscriptionProducts = subscriptionProducts;
  }

  public WalleejoinAdminPartnerConfigurationResponseDto oneOffReferral(@javax.annotation.Nullable Integer oneOffReferral) {
    
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

  public WalleejoinAdminPartnerConfigurationResponseDto pricingProfileBuyRate(@javax.annotation.Nullable PaymentFacilitatorPricingProfileDto pricingProfileBuyRate) {
    
    this.pricingProfileBuyRate = pricingProfileBuyRate;
    return this;
  }

  /**
   * Get pricingProfileBuyRate
   * @return pricingProfileBuyRate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRICING_PROFILE_BUY_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentFacilitatorPricingProfileDto getPricingProfileBuyRate() {
    return pricingProfileBuyRate;
  }


  @JsonProperty(JSON_PROPERTY_PRICING_PROFILE_BUY_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPricingProfileBuyRate(@javax.annotation.Nullable PaymentFacilitatorPricingProfileDto pricingProfileBuyRate) {
    this.pricingProfileBuyRate = pricingProfileBuyRate;
  }

  public WalleejoinAdminPartnerConfigurationResponseDto partnershipTypes(@javax.annotation.Nullable Set<WalleejoinPartnershipType> partnershipTypes) {
    
    this.partnershipTypes = partnershipTypes;
    return this;
  }

  public WalleejoinAdminPartnerConfigurationResponseDto addPartnershipTypesItem(WalleejoinPartnershipType partnershipTypesItem) {
    if (this.partnershipTypes == null) {
      this.partnershipTypes = new LinkedHashSet<>();
    }
    this.partnershipTypes.add(partnershipTypesItem);
    return this;
  }

  /**
   * Get partnershipTypes
   * @return partnershipTypes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARTNERSHIP_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<WalleejoinPartnershipType> getPartnershipTypes() {
    return partnershipTypes;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_PARTNERSHIP_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPartnershipTypes(@javax.annotation.Nullable Set<WalleejoinPartnershipType> partnershipTypes) {
    this.partnershipTypes = partnershipTypes;
  }

  public WalleejoinAdminPartnerConfigurationResponseDto partnerAccount(@javax.annotation.Nullable Long partnerAccount) {
    
    this.partnerAccount = partnerAccount;
    return this;
  }

  /**
   * Get partnerAccount
   * @return partnerAccount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARTNER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPartnerAccount() {
    return partnerAccount;
  }


  @JsonProperty(JSON_PROPERTY_PARTNER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPartnerAccount(@javax.annotation.Nullable Long partnerAccount) {
    this.partnerAccount = partnerAccount;
  }

  public WalleejoinAdminPartnerConfigurationResponseDto pricingType(@javax.annotation.Nullable WalleejoinAdminPricingType pricingType) {
    
    this.pricingType = pricingType;
    return this;
  }

  /**
   * Get pricingType
   * @return pricingType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRICING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WalleejoinAdminPricingType getPricingType() {
    return pricingType;
  }


  @JsonProperty(JSON_PROPERTY_PRICING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPricingType(@javax.annotation.Nullable WalleejoinAdminPricingType pricingType) {
    this.pricingType = pricingType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalleejoinAdminPartnerConfigurationResponseDto walleejoinAdminPartnerConfigurationResponseDto = (WalleejoinAdminPartnerConfigurationResponseDto) o;
    return Objects.equals(this.pricingProfileSellRates, walleejoinAdminPartnerConfigurationResponseDto.pricingProfileSellRates) &&
        Objects.equals(this.revenueShare, walleejoinAdminPartnerConfigurationResponseDto.revenueShare) &&
        Objects.equals(this.subscriptionProducts, walleejoinAdminPartnerConfigurationResponseDto.subscriptionProducts) &&
        Objects.equals(this.oneOffReferral, walleejoinAdminPartnerConfigurationResponseDto.oneOffReferral) &&
        Objects.equals(this.pricingProfileBuyRate, walleejoinAdminPartnerConfigurationResponseDto.pricingProfileBuyRate) &&
        Objects.equals(this.partnershipTypes, walleejoinAdminPartnerConfigurationResponseDto.partnershipTypes) &&
        Objects.equals(this.partnerAccount, walleejoinAdminPartnerConfigurationResponseDto.partnerAccount) &&
        Objects.equals(this.pricingType, walleejoinAdminPartnerConfigurationResponseDto.pricingType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pricingProfileSellRates, revenueShare, subscriptionProducts, oneOffReferral, pricingProfileBuyRate, partnershipTypes, partnerAccount, pricingType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalleejoinAdminPartnerConfigurationResponseDto {\n");
    sb.append("    pricingProfileSellRates: ").append(toIndentedString(pricingProfileSellRates)).append("\n");
    sb.append("    revenueShare: ").append(toIndentedString(revenueShare)).append("\n");
    sb.append("    subscriptionProducts: ").append(toIndentedString(subscriptionProducts)).append("\n");
    sb.append("    oneOffReferral: ").append(toIndentedString(oneOffReferral)).append("\n");
    sb.append("    pricingProfileBuyRate: ").append(toIndentedString(pricingProfileBuyRate)).append("\n");
    sb.append("    partnershipTypes: ").append(toIndentedString(partnershipTypes)).append("\n");
    sb.append("    partnerAccount: ").append(toIndentedString(partnerAccount)).append("\n");
    sb.append("    pricingType: ").append(toIndentedString(pricingType)).append("\n");
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

    // add `pricingProfileSellRates` to the URL query string
    if (getPricingProfileSellRates() != null) {
      int i = 0;
      for (PaymentFacilitatorPricingProfileDto _item : getPricingProfileSellRates()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%spricingProfileSellRates%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
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

    // add `subscriptionProducts` to the URL query string
    if (getSubscriptionProducts() != null) {
      int i = 0;
      for (SubscriptionProductDto _item : getSubscriptionProducts()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%ssubscriptionProducts%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
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

    // add `pricingProfileBuyRate` to the URL query string
    if (getPricingProfileBuyRate() != null) {
      joiner.add(getPricingProfileBuyRate().toUrlQueryString(prefix + "pricingProfileBuyRate" + suffix));
    }

    // add `partnershipTypes` to the URL query string
    if (getPartnershipTypes() != null) {
      int i = 0;
      for (WalleejoinPartnershipType _item : getPartnershipTypes()) {
        if (_item != null) {
          try {
            joiner.add(String.format("%spartnershipTypes%s%s=%s", prefix, suffix,
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

    // add `partnerAccount` to the URL query string
    if (getPartnerAccount() != null) {
      try {
        joiner.add(String.format("%spartnerAccount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPartnerAccount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `pricingType` to the URL query string
    if (getPricingType() != null) {
      try {
        joiner.add(String.format("%spricingType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPricingType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

