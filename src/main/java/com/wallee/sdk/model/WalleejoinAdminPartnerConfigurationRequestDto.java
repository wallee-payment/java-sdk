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
 * WalleejoinAdminPartnerConfigurationRequestDto
 */
@JsonPropertyOrder({
  WalleejoinAdminPartnerConfigurationRequestDto.JSON_PROPERTY_ALLOWED_TO_SELL_SCOPE_PRODUCTS,
  WalleejoinAdminPartnerConfigurationRequestDto.JSON_PROPERTY_PRICING_PROFILE_SELL_RATE_IDS,
  WalleejoinAdminPartnerConfigurationRequestDto.JSON_PROPERTY_REVENUE_SHARE,
  WalleejoinAdminPartnerConfigurationRequestDto.JSON_PROPERTY_ONE_OFF_REFERRAL,
  WalleejoinAdminPartnerConfigurationRequestDto.JSON_PROPERTY_PARTNER_ACCOUNT_ID,
  WalleejoinAdminPartnerConfigurationRequestDto.JSON_PROPERTY_SUBSCRIPTION_PRODUCT_IDS,
  WalleejoinAdminPartnerConfigurationRequestDto.JSON_PROPERTY_PRICING_PROFILE_BUY_RATE_ID,
  WalleejoinAdminPartnerConfigurationRequestDto.JSON_PROPERTY_PARTNERSHIP_TYPES,
  WalleejoinAdminPartnerConfigurationRequestDto.JSON_PROPERTY_PRICING_TYPE
})

public class WalleejoinAdminPartnerConfigurationRequestDto {
  public static final String JSON_PROPERTY_ALLOWED_TO_SELL_SCOPE_PRODUCTS = "allowedToSellScopeProducts";
  @javax.annotation.Nullable
  private Boolean allowedToSellScopeProducts;

  public static final String JSON_PROPERTY_PRICING_PROFILE_SELL_RATE_IDS = "pricingProfileSellRateIds";
  @javax.annotation.Nullable
  private Set<Long> pricingProfileSellRateIds = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_REVENUE_SHARE = "revenueShare";
  @javax.annotation.Nullable
  private BigDecimal revenueShare;

  public static final String JSON_PROPERTY_ONE_OFF_REFERRAL = "oneOffReferral";
  @javax.annotation.Nullable
  private Integer oneOffReferral;

  public static final String JSON_PROPERTY_PARTNER_ACCOUNT_ID = "partnerAccountId";
  @javax.annotation.Nullable
  private Long partnerAccountId;

  public static final String JSON_PROPERTY_SUBSCRIPTION_PRODUCT_IDS = "subscriptionProductIds";
  @javax.annotation.Nullable
  private Set<Long> subscriptionProductIds = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_PRICING_PROFILE_BUY_RATE_ID = "pricingProfileBuyRateId";
  @javax.annotation.Nullable
  private Long pricingProfileBuyRateId;

  public static final String JSON_PROPERTY_PARTNERSHIP_TYPES = "partnershipTypes";
  @javax.annotation.Nullable
  private Set<WalleejoinPartnershipType> partnershipTypes = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_PRICING_TYPE = "pricingType";
  @javax.annotation.Nullable
  private WalleejoinAdminPricingType pricingType;

  public WalleejoinAdminPartnerConfigurationRequestDto() {
  }

  public WalleejoinAdminPartnerConfigurationRequestDto allowedToSellScopeProducts(@javax.annotation.Nullable Boolean allowedToSellScopeProducts) {
    
    this.allowedToSellScopeProducts = allowedToSellScopeProducts;
    return this;
  }

  /**
   * Get allowedToSellScopeProducts
   * @return allowedToSellScopeProducts
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWED_TO_SELL_SCOPE_PRODUCTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowedToSellScopeProducts() {
    return allowedToSellScopeProducts;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_TO_SELL_SCOPE_PRODUCTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedToSellScopeProducts(@javax.annotation.Nullable Boolean allowedToSellScopeProducts) {
    this.allowedToSellScopeProducts = allowedToSellScopeProducts;
  }

  public WalleejoinAdminPartnerConfigurationRequestDto pricingProfileSellRateIds(@javax.annotation.Nullable Set<Long> pricingProfileSellRateIds) {
    
    this.pricingProfileSellRateIds = pricingProfileSellRateIds;
    return this;
  }

  public WalleejoinAdminPartnerConfigurationRequestDto addPricingProfileSellRateIdsItem(Long pricingProfileSellRateIdsItem) {
    if (this.pricingProfileSellRateIds == null) {
      this.pricingProfileSellRateIds = new LinkedHashSet<>();
    }
    this.pricingProfileSellRateIds.add(pricingProfileSellRateIdsItem);
    return this;
  }

  /**
   * Get pricingProfileSellRateIds
   * @return pricingProfileSellRateIds
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRICING_PROFILE_SELL_RATE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Long> getPricingProfileSellRateIds() {
    return pricingProfileSellRateIds;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_PRICING_PROFILE_SELL_RATE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPricingProfileSellRateIds(@javax.annotation.Nullable Set<Long> pricingProfileSellRateIds) {
    this.pricingProfileSellRateIds = pricingProfileSellRateIds;
  }

  public WalleejoinAdminPartnerConfigurationRequestDto revenueShare(@javax.annotation.Nullable BigDecimal revenueShare) {
    
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

  public WalleejoinAdminPartnerConfigurationRequestDto oneOffReferral(@javax.annotation.Nullable Integer oneOffReferral) {
    
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

  public WalleejoinAdminPartnerConfigurationRequestDto partnerAccountId(@javax.annotation.Nullable Long partnerAccountId) {
    
    this.partnerAccountId = partnerAccountId;
    return this;
  }

  /**
   * Get partnerAccountId
   * @return partnerAccountId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARTNER_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPartnerAccountId() {
    return partnerAccountId;
  }


  @JsonProperty(JSON_PROPERTY_PARTNER_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPartnerAccountId(@javax.annotation.Nullable Long partnerAccountId) {
    this.partnerAccountId = partnerAccountId;
  }

  public WalleejoinAdminPartnerConfigurationRequestDto subscriptionProductIds(@javax.annotation.Nullable Set<Long> subscriptionProductIds) {
    
    this.subscriptionProductIds = subscriptionProductIds;
    return this;
  }

  public WalleejoinAdminPartnerConfigurationRequestDto addSubscriptionProductIdsItem(Long subscriptionProductIdsItem) {
    if (this.subscriptionProductIds == null) {
      this.subscriptionProductIds = new LinkedHashSet<>();
    }
    this.subscriptionProductIds.add(subscriptionProductIdsItem);
    return this;
  }

  /**
   * Get subscriptionProductIds
   * @return subscriptionProductIds
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_PRODUCT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Long> getSubscriptionProductIds() {
    return subscriptionProductIds;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_PRODUCT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriptionProductIds(@javax.annotation.Nullable Set<Long> subscriptionProductIds) {
    this.subscriptionProductIds = subscriptionProductIds;
  }

  public WalleejoinAdminPartnerConfigurationRequestDto pricingProfileBuyRateId(@javax.annotation.Nullable Long pricingProfileBuyRateId) {
    
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

  public WalleejoinAdminPartnerConfigurationRequestDto partnershipTypes(@javax.annotation.Nullable Set<WalleejoinPartnershipType> partnershipTypes) {
    
    this.partnershipTypes = partnershipTypes;
    return this;
  }

  public WalleejoinAdminPartnerConfigurationRequestDto addPartnershipTypesItem(WalleejoinPartnershipType partnershipTypesItem) {
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

  public WalleejoinAdminPartnerConfigurationRequestDto pricingType(@javax.annotation.Nullable WalleejoinAdminPricingType pricingType) {
    
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
    WalleejoinAdminPartnerConfigurationRequestDto walleejoinAdminPartnerConfigurationRequestDto = (WalleejoinAdminPartnerConfigurationRequestDto) o;
    return Objects.equals(this.allowedToSellScopeProducts, walleejoinAdminPartnerConfigurationRequestDto.allowedToSellScopeProducts) &&
        Objects.equals(this.pricingProfileSellRateIds, walleejoinAdminPartnerConfigurationRequestDto.pricingProfileSellRateIds) &&
        Objects.equals(this.revenueShare, walleejoinAdminPartnerConfigurationRequestDto.revenueShare) &&
        Objects.equals(this.oneOffReferral, walleejoinAdminPartnerConfigurationRequestDto.oneOffReferral) &&
        Objects.equals(this.partnerAccountId, walleejoinAdminPartnerConfigurationRequestDto.partnerAccountId) &&
        Objects.equals(this.subscriptionProductIds, walleejoinAdminPartnerConfigurationRequestDto.subscriptionProductIds) &&
        Objects.equals(this.pricingProfileBuyRateId, walleejoinAdminPartnerConfigurationRequestDto.pricingProfileBuyRateId) &&
        Objects.equals(this.partnershipTypes, walleejoinAdminPartnerConfigurationRequestDto.partnershipTypes) &&
        Objects.equals(this.pricingType, walleejoinAdminPartnerConfigurationRequestDto.pricingType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedToSellScopeProducts, pricingProfileSellRateIds, revenueShare, oneOffReferral, partnerAccountId, subscriptionProductIds, pricingProfileBuyRateId, partnershipTypes, pricingType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalleejoinAdminPartnerConfigurationRequestDto {\n");
    sb.append("    allowedToSellScopeProducts: ").append(toIndentedString(allowedToSellScopeProducts)).append("\n");
    sb.append("    pricingProfileSellRateIds: ").append(toIndentedString(pricingProfileSellRateIds)).append("\n");
    sb.append("    revenueShare: ").append(toIndentedString(revenueShare)).append("\n");
    sb.append("    oneOffReferral: ").append(toIndentedString(oneOffReferral)).append("\n");
    sb.append("    partnerAccountId: ").append(toIndentedString(partnerAccountId)).append("\n");
    sb.append("    subscriptionProductIds: ").append(toIndentedString(subscriptionProductIds)).append("\n");
    sb.append("    pricingProfileBuyRateId: ").append(toIndentedString(pricingProfileBuyRateId)).append("\n");
    sb.append("    partnershipTypes: ").append(toIndentedString(partnershipTypes)).append("\n");
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

    // add `allowedToSellScopeProducts` to the URL query string
    if (getAllowedToSellScopeProducts() != null) {
      try {
        joiner.add(String.format("%sallowedToSellScopeProducts%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAllowedToSellScopeProducts()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `pricingProfileSellRateIds` to the URL query string
    if (getPricingProfileSellRateIds() != null) {
      int i = 0;
      for (Long _item : getPricingProfileSellRateIds()) {
        try {
          joiner.add(String.format("%spricingProfileSellRateIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(_item), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
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

    // add `oneOffReferral` to the URL query string
    if (getOneOffReferral() != null) {
      try {
        joiner.add(String.format("%soneOffReferral%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOneOffReferral()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `partnerAccountId` to the URL query string
    if (getPartnerAccountId() != null) {
      try {
        joiner.add(String.format("%spartnerAccountId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPartnerAccountId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `subscriptionProductIds` to the URL query string
    if (getSubscriptionProductIds() != null) {
      int i = 0;
      for (Long _item : getSubscriptionProductIds()) {
        try {
          joiner.add(String.format("%ssubscriptionProductIds%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(_item), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
      i++;
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

