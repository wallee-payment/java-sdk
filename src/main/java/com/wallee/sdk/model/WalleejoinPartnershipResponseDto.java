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
import com.wallee.sdk.model.PricingHistoryDto;
import com.wallee.sdk.model.WalleejoinAdminPricingType;
import com.wallee.sdk.model.WalleejoinPartnership;
import com.wallee.sdk.model.WalleejoinPartnershipState;
import com.wallee.sdk.model.WalleejoinPartnershipType;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * WalleejoinPartnershipResponseDto
 */
@JsonPropertyOrder({
  WalleejoinPartnershipResponseDto.JSON_PROPERTY_PARTNERSHIP,
  WalleejoinPartnershipResponseDto.JSON_PROPERTY_MERCHANT_ACCOUNT,
  WalleejoinPartnershipResponseDto.JSON_PROPERTY_ALLOWED_TO_SELL_SCOPE_PRODUCTS,
  WalleejoinPartnershipResponseDto.JSON_PROPERTY_PRICING_HISTORY,
  WalleejoinPartnershipResponseDto.JSON_PROPERTY_PARTNERSHIP_TYPE,
  WalleejoinPartnershipResponseDto.JSON_PROPERTY_STATE,
  WalleejoinPartnershipResponseDto.JSON_PROPERTY_UPDATED_ON,
  WalleejoinPartnershipResponseDto.JSON_PROPERTY_ALLOWED_PRICING_TYPE,
  WalleejoinPartnershipResponseDto.JSON_PROPERTY_CREATED_ON,
  WalleejoinPartnershipResponseDto.JSON_PROPERTY_SUBSCRIPTION_PRODUCT_ID,
  WalleejoinPartnershipResponseDto.JSON_PROPERTY_PARTNER_ACCOUNT
})

public class WalleejoinPartnershipResponseDto {
  public static final String JSON_PROPERTY_PARTNERSHIP = "partnership";
  @javax.annotation.Nullable
  private WalleejoinPartnership partnership;

  public static final String JSON_PROPERTY_MERCHANT_ACCOUNT = "merchantAccount";
  @javax.annotation.Nullable
  private Long merchantAccount;

  public static final String JSON_PROPERTY_ALLOWED_TO_SELL_SCOPE_PRODUCTS = "allowedToSellScopeProducts";
  @javax.annotation.Nullable
  private Boolean allowedToSellScopeProducts;

  public static final String JSON_PROPERTY_PRICING_HISTORY = "pricingHistory";
  @javax.annotation.Nullable
  private PricingHistoryDto pricingHistory;

  public static final String JSON_PROPERTY_PARTNERSHIP_TYPE = "partnershipType";
  @javax.annotation.Nullable
  private WalleejoinPartnershipType partnershipType;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private WalleejoinPartnershipState state;

  public static final String JSON_PROPERTY_UPDATED_ON = "updatedOn";
  @javax.annotation.Nullable
  private OffsetDateTime updatedOn;

  public static final String JSON_PROPERTY_ALLOWED_PRICING_TYPE = "allowedPricingType";
  @javax.annotation.Nullable
  private WalleejoinAdminPricingType allowedPricingType;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  @javax.annotation.Nullable
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_SUBSCRIPTION_PRODUCT_ID = "subscriptionProductId";
  @javax.annotation.Nullable
  private Long subscriptionProductId;

  public static final String JSON_PROPERTY_PARTNER_ACCOUNT = "partnerAccount";
  @javax.annotation.Nullable
  private Long partnerAccount;

  public WalleejoinPartnershipResponseDto() {
  }

  public WalleejoinPartnershipResponseDto partnership(@javax.annotation.Nullable WalleejoinPartnership partnership) {
    
    this.partnership = partnership;
    return this;
  }

  /**
   * Get partnership
   * @return partnership
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARTNERSHIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WalleejoinPartnership getPartnership() {
    return partnership;
  }


  @JsonProperty(JSON_PROPERTY_PARTNERSHIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPartnership(@javax.annotation.Nullable WalleejoinPartnership partnership) {
    this.partnership = partnership;
  }

  public WalleejoinPartnershipResponseDto merchantAccount(@javax.annotation.Nullable Long merchantAccount) {
    
    this.merchantAccount = merchantAccount;
    return this;
  }

  /**
   * Get merchantAccount
   * @return merchantAccount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMerchantAccount() {
    return merchantAccount;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantAccount(@javax.annotation.Nullable Long merchantAccount) {
    this.merchantAccount = merchantAccount;
  }

  public WalleejoinPartnershipResponseDto allowedToSellScopeProducts(@javax.annotation.Nullable Boolean allowedToSellScopeProducts) {
    
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

  public WalleejoinPartnershipResponseDto pricingHistory(@javax.annotation.Nullable PricingHistoryDto pricingHistory) {
    
    this.pricingHistory = pricingHistory;
    return this;
  }

  /**
   * Get pricingHistory
   * @return pricingHistory
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRICING_HISTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PricingHistoryDto getPricingHistory() {
    return pricingHistory;
  }


  @JsonProperty(JSON_PROPERTY_PRICING_HISTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPricingHistory(@javax.annotation.Nullable PricingHistoryDto pricingHistory) {
    this.pricingHistory = pricingHistory;
  }

  public WalleejoinPartnershipResponseDto partnershipType(@javax.annotation.Nullable WalleejoinPartnershipType partnershipType) {
    
    this.partnershipType = partnershipType;
    return this;
  }

  /**
   * Get partnershipType
   * @return partnershipType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARTNERSHIP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WalleejoinPartnershipType getPartnershipType() {
    return partnershipType;
  }


  @JsonProperty(JSON_PROPERTY_PARTNERSHIP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPartnershipType(@javax.annotation.Nullable WalleejoinPartnershipType partnershipType) {
    this.partnershipType = partnershipType;
  }

  public WalleejoinPartnershipResponseDto state(@javax.annotation.Nullable WalleejoinPartnershipState state) {
    
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WalleejoinPartnershipState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable WalleejoinPartnershipState state) {
    this.state = state;
  }

  public WalleejoinPartnershipResponseDto updatedOn(@javax.annotation.Nullable OffsetDateTime updatedOn) {
    
    this.updatedOn = updatedOn;
    return this;
  }

  /**
   * Get updatedOn
   * @return updatedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdatedOn() {
    return updatedOn;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedOn(@javax.annotation.Nullable OffsetDateTime updatedOn) {
    this.updatedOn = updatedOn;
  }

  public WalleejoinPartnershipResponseDto allowedPricingType(@javax.annotation.Nullable WalleejoinAdminPricingType allowedPricingType) {
    
    this.allowedPricingType = allowedPricingType;
    return this;
  }

  /**
   * Get allowedPricingType
   * @return allowedPricingType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWED_PRICING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WalleejoinAdminPricingType getAllowedPricingType() {
    return allowedPricingType;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_PRICING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedPricingType(@javax.annotation.Nullable WalleejoinAdminPricingType allowedPricingType) {
    this.allowedPricingType = allowedPricingType;
  }

  public WalleejoinPartnershipResponseDto createdOn(@javax.annotation.Nullable OffsetDateTime createdOn) {
    
    this.createdOn = createdOn;
    return this;
  }

  /**
   * Get createdOn
   * @return createdOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedOn(@javax.annotation.Nullable OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public WalleejoinPartnershipResponseDto subscriptionProductId(@javax.annotation.Nullable Long subscriptionProductId) {
    
    this.subscriptionProductId = subscriptionProductId;
    return this;
  }

  /**
   * Get subscriptionProductId
   * @return subscriptionProductId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSubscriptionProductId() {
    return subscriptionProductId;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriptionProductId(@javax.annotation.Nullable Long subscriptionProductId) {
    this.subscriptionProductId = subscriptionProductId;
  }

  public WalleejoinPartnershipResponseDto partnerAccount(@javax.annotation.Nullable Long partnerAccount) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalleejoinPartnershipResponseDto walleejoinPartnershipResponseDto = (WalleejoinPartnershipResponseDto) o;
    return Objects.equals(this.partnership, walleejoinPartnershipResponseDto.partnership) &&
        Objects.equals(this.merchantAccount, walleejoinPartnershipResponseDto.merchantAccount) &&
        Objects.equals(this.allowedToSellScopeProducts, walleejoinPartnershipResponseDto.allowedToSellScopeProducts) &&
        Objects.equals(this.pricingHistory, walleejoinPartnershipResponseDto.pricingHistory) &&
        Objects.equals(this.partnershipType, walleejoinPartnershipResponseDto.partnershipType) &&
        Objects.equals(this.state, walleejoinPartnershipResponseDto.state) &&
        Objects.equals(this.updatedOn, walleejoinPartnershipResponseDto.updatedOn) &&
        Objects.equals(this.allowedPricingType, walleejoinPartnershipResponseDto.allowedPricingType) &&
        Objects.equals(this.createdOn, walleejoinPartnershipResponseDto.createdOn) &&
        Objects.equals(this.subscriptionProductId, walleejoinPartnershipResponseDto.subscriptionProductId) &&
        Objects.equals(this.partnerAccount, walleejoinPartnershipResponseDto.partnerAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnership, merchantAccount, allowedToSellScopeProducts, pricingHistory, partnershipType, state, updatedOn, allowedPricingType, createdOn, subscriptionProductId, partnerAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalleejoinPartnershipResponseDto {\n");
    sb.append("    partnership: ").append(toIndentedString(partnership)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    allowedToSellScopeProducts: ").append(toIndentedString(allowedToSellScopeProducts)).append("\n");
    sb.append("    pricingHistory: ").append(toIndentedString(pricingHistory)).append("\n");
    sb.append("    partnershipType: ").append(toIndentedString(partnershipType)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
    sb.append("    allowedPricingType: ").append(toIndentedString(allowedPricingType)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    subscriptionProductId: ").append(toIndentedString(subscriptionProductId)).append("\n");
    sb.append("    partnerAccount: ").append(toIndentedString(partnerAccount)).append("\n");
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

    // add `partnership` to the URL query string
    if (getPartnership() != null) {
      joiner.add(getPartnership().toUrlQueryString(prefix + "partnership" + suffix));
    }

    // add `merchantAccount` to the URL query string
    if (getMerchantAccount() != null) {
      try {
        joiner.add(String.format("%smerchantAccount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMerchantAccount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `allowedToSellScopeProducts` to the URL query string
    if (getAllowedToSellScopeProducts() != null) {
      try {
        joiner.add(String.format("%sallowedToSellScopeProducts%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAllowedToSellScopeProducts()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `pricingHistory` to the URL query string
    if (getPricingHistory() != null) {
      joiner.add(getPricingHistory().toUrlQueryString(prefix + "pricingHistory" + suffix));
    }

    // add `partnershipType` to the URL query string
    if (getPartnershipType() != null) {
      try {
        joiner.add(String.format("%spartnershipType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPartnershipType()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `updatedOn` to the URL query string
    if (getUpdatedOn() != null) {
      try {
        joiner.add(String.format("%supdatedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUpdatedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `allowedPricingType` to the URL query string
    if (getAllowedPricingType() != null) {
      try {
        joiner.add(String.format("%sallowedPricingType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAllowedPricingType()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `subscriptionProductId` to the URL query string
    if (getSubscriptionProductId() != null) {
      try {
        joiner.add(String.format("%ssubscriptionProductId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubscriptionProductId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
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

    return joiner.toString();
  }

}

