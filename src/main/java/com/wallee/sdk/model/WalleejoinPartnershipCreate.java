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
import com.wallee.sdk.model.WalleejoinPartnershipState;
import com.wallee.sdk.model.WalleejoinPartnershipType;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * WalleejoinPartnershipCreate
 */
@JsonPropertyOrder({
  WalleejoinPartnershipCreate.JSON_PROPERTY_TERMINATED_ON,
  WalleejoinPartnershipCreate.JSON_PROPERTY_PRICING_PROFILE_SELL_RATE,
  WalleejoinPartnershipCreate.JSON_PROPERTY_ACTIVATED_ON,
  WalleejoinPartnershipCreate.JSON_PROPERTY_MERCHANT_ACCOUNT,
  WalleejoinPartnershipCreate.JSON_PROPERTY_PARTNERSHIP_TYPE,
  WalleejoinPartnershipCreate.JSON_PROPERTY_STATE,
  WalleejoinPartnershipCreate.JSON_PROPERTY_SUBSCRIPTION_PRODUCT_ID,
  WalleejoinPartnershipCreate.JSON_PROPERTY_PARTNER_ACCOUNT
})
@JsonTypeName("WalleejoinPartnership.Create")

public class WalleejoinPartnershipCreate {
  public static final String JSON_PROPERTY_TERMINATED_ON = "terminatedOn";
  @javax.annotation.Nullable
  private OffsetDateTime terminatedOn;

  public static final String JSON_PROPERTY_PRICING_PROFILE_SELL_RATE = "pricingProfileSellRate";
  @javax.annotation.Nullable
  private Object pricingProfileSellRate;

  public static final String JSON_PROPERTY_ACTIVATED_ON = "activatedOn";
  @javax.annotation.Nullable
  private OffsetDateTime activatedOn;

  public static final String JSON_PROPERTY_MERCHANT_ACCOUNT = "merchantAccount";
  @javax.annotation.Nullable
  private Long merchantAccount;

  public static final String JSON_PROPERTY_PARTNERSHIP_TYPE = "partnershipType";
  @javax.annotation.Nullable
  private WalleejoinPartnershipType partnershipType;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private WalleejoinPartnershipState state;

  public static final String JSON_PROPERTY_SUBSCRIPTION_PRODUCT_ID = "subscriptionProductId";
  @javax.annotation.Nullable
  private Long subscriptionProductId;

  public static final String JSON_PROPERTY_PARTNER_ACCOUNT = "partnerAccount";
  @javax.annotation.Nullable
  private Long partnerAccount;

  public WalleejoinPartnershipCreate() {
  }

  public WalleejoinPartnershipCreate terminatedOn(@javax.annotation.Nullable OffsetDateTime terminatedOn) {
    
    this.terminatedOn = terminatedOn;
    return this;
  }

  /**
   * The date and time when the partnership was terminated.
   * @return terminatedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TERMINATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTerminatedOn() {
    return terminatedOn;
  }


  @JsonProperty(JSON_PROPERTY_TERMINATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTerminatedOn(@javax.annotation.Nullable OffsetDateTime terminatedOn) {
    this.terminatedOn = terminatedOn;
  }

  public WalleejoinPartnershipCreate pricingProfileSellRate(@javax.annotation.Nullable Object pricingProfileSellRate) {
    
    this.pricingProfileSellRate = pricingProfileSellRate;
    return this;
  }

  /**
   * Get pricingProfileSellRate
   * @return pricingProfileSellRate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRICING_PROFILE_SELL_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getPricingProfileSellRate() {
    return pricingProfileSellRate;
  }


  @JsonProperty(JSON_PROPERTY_PRICING_PROFILE_SELL_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPricingProfileSellRate(@javax.annotation.Nullable Object pricingProfileSellRate) {
    this.pricingProfileSellRate = pricingProfileSellRate;
  }

  public WalleejoinPartnershipCreate activatedOn(@javax.annotation.Nullable OffsetDateTime activatedOn) {
    
    this.activatedOn = activatedOn;
    return this;
  }

  /**
   * The date and time when the partnership was activated.
   * @return activatedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getActivatedOn() {
    return activatedOn;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActivatedOn(@javax.annotation.Nullable OffsetDateTime activatedOn) {
    this.activatedOn = activatedOn;
  }

  public WalleejoinPartnershipCreate merchantAccount(@javax.annotation.Nullable Long merchantAccount) {
    
    this.merchantAccount = merchantAccount;
    return this;
  }

  /**
   * The ID of the merchant account.
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

  public WalleejoinPartnershipCreate partnershipType(@javax.annotation.Nullable WalleejoinPartnershipType partnershipType) {
    
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

  public WalleejoinPartnershipCreate state(@javax.annotation.Nullable WalleejoinPartnershipState state) {
    
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

  public WalleejoinPartnershipCreate subscriptionProductId(@javax.annotation.Nullable Long subscriptionProductId) {
    
    this.subscriptionProductId = subscriptionProductId;
    return this;
  }

  /**
   * The ID of the product.
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

  public WalleejoinPartnershipCreate partnerAccount(@javax.annotation.Nullable Long partnerAccount) {
    
    this.partnerAccount = partnerAccount;
    return this;
  }

  /**
   * The ID of the partner account.
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
    WalleejoinPartnershipCreate walleejoinPartnershipCreate = (WalleejoinPartnershipCreate) o;
    return Objects.equals(this.terminatedOn, walleejoinPartnershipCreate.terminatedOn) &&
        Objects.equals(this.pricingProfileSellRate, walleejoinPartnershipCreate.pricingProfileSellRate) &&
        Objects.equals(this.activatedOn, walleejoinPartnershipCreate.activatedOn) &&
        Objects.equals(this.merchantAccount, walleejoinPartnershipCreate.merchantAccount) &&
        Objects.equals(this.partnershipType, walleejoinPartnershipCreate.partnershipType) &&
        Objects.equals(this.state, walleejoinPartnershipCreate.state) &&
        Objects.equals(this.subscriptionProductId, walleejoinPartnershipCreate.subscriptionProductId) &&
        Objects.equals(this.partnerAccount, walleejoinPartnershipCreate.partnerAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(terminatedOn, pricingProfileSellRate, activatedOn, merchantAccount, partnershipType, state, subscriptionProductId, partnerAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalleejoinPartnershipCreate {\n");
    sb.append("    terminatedOn: ").append(toIndentedString(terminatedOn)).append("\n");
    sb.append("    pricingProfileSellRate: ").append(toIndentedString(pricingProfileSellRate)).append("\n");
    sb.append("    activatedOn: ").append(toIndentedString(activatedOn)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    partnershipType: ").append(toIndentedString(partnershipType)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

    // add `terminatedOn` to the URL query string
    if (getTerminatedOn() != null) {
      try {
        joiner.add(String.format("%sterminatedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTerminatedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `pricingProfileSellRate` to the URL query string
    if (getPricingProfileSellRate() != null) {
      try {
        joiner.add(String.format("%spricingProfileSellRate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPricingProfileSellRate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `activatedOn` to the URL query string
    if (getActivatedOn() != null) {
      try {
        joiner.add(String.format("%sactivatedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getActivatedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

