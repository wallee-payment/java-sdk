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
import com.wallee.sdk.model.SpaceAddressCreate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * WalleejoinCreatePartnershipApiRequestDto
 */
@JsonPropertyOrder({
  WalleejoinCreatePartnershipApiRequestDto.JSON_PROPERTY_EMAIL_MESSAGE,
  WalleejoinCreatePartnershipApiRequestDto.JSON_PROPERTY_PARTNER_ACCOUNT_ID,
  WalleejoinCreatePartnershipApiRequestDto.JSON_PROPERTY_MERCHANT_ACCOUNT_NAME,
  WalleejoinCreatePartnershipApiRequestDto.JSON_PROPERTY_MERCHANT_ADDRESS,
  WalleejoinCreatePartnershipApiRequestDto.JSON_PROPERTY_PRICING_PROFILE_SELL_RATE_ID,
  WalleejoinCreatePartnershipApiRequestDto.JSON_PROPERTY_SUBSCRIPTION_PRODUCT_ID,
  WalleejoinCreatePartnershipApiRequestDto.JSON_PROPERTY_MERCHANT_EMAIL_ADDRESS
})

public class WalleejoinCreatePartnershipApiRequestDto {
  public static final String JSON_PROPERTY_EMAIL_MESSAGE = "emailMessage";
  @javax.annotation.Nullable
  private String emailMessage;

  public static final String JSON_PROPERTY_PARTNER_ACCOUNT_ID = "partnerAccountId";
  @javax.annotation.Nullable
  private Long partnerAccountId;

  public static final String JSON_PROPERTY_MERCHANT_ACCOUNT_NAME = "merchantAccountName";
  @javax.annotation.Nullable
  private String merchantAccountName;

  public static final String JSON_PROPERTY_MERCHANT_ADDRESS = "merchantAddress";
  @javax.annotation.Nullable
  private SpaceAddressCreate merchantAddress;

  public static final String JSON_PROPERTY_PRICING_PROFILE_SELL_RATE_ID = "pricingProfileSellRateId";
  @javax.annotation.Nullable
  private Long pricingProfileSellRateId;

  public static final String JSON_PROPERTY_SUBSCRIPTION_PRODUCT_ID = "subscriptionProductId";
  @javax.annotation.Nullable
  private Long subscriptionProductId;

  public static final String JSON_PROPERTY_MERCHANT_EMAIL_ADDRESS = "merchantEmailAddress";
  @javax.annotation.Nullable
  private String merchantEmailAddress;

  public WalleejoinCreatePartnershipApiRequestDto() {
  }

  public WalleejoinCreatePartnershipApiRequestDto emailMessage(@javax.annotation.Nullable String emailMessage) {
    
    this.emailMessage = emailMessage;
    return this;
  }

  /**
   * Get emailMessage
   * @return emailMessage
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailMessage() {
    return emailMessage;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailMessage(@javax.annotation.Nullable String emailMessage) {
    this.emailMessage = emailMessage;
  }

  public WalleejoinCreatePartnershipApiRequestDto partnerAccountId(@javax.annotation.Nullable Long partnerAccountId) {
    
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

  public WalleejoinCreatePartnershipApiRequestDto merchantAccountName(@javax.annotation.Nullable String merchantAccountName) {
    
    this.merchantAccountName = merchantAccountName;
    return this;
  }

  /**
   * The name of the subaccount created for the merchant. Only used for ISV partnerships when a merchant email address is provided. If empty, a generated name is used.
   * @return merchantAccountName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantAccountName() {
    return merchantAccountName;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantAccountName(@javax.annotation.Nullable String merchantAccountName) {
    this.merchantAccountName = merchantAccountName;
  }

  public WalleejoinCreatePartnershipApiRequestDto merchantAddress(@javax.annotation.Nullable SpaceAddressCreate merchantAddress) {
    
    this.merchantAddress = merchantAddress;
    return this;
  }

  /**
   * Get merchantAddress
   * @return merchantAddress
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MERCHANT_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SpaceAddressCreate getMerchantAddress() {
    return merchantAddress;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantAddress(@javax.annotation.Nullable SpaceAddressCreate merchantAddress) {
    this.merchantAddress = merchantAddress;
  }

  public WalleejoinCreatePartnershipApiRequestDto pricingProfileSellRateId(@javax.annotation.Nullable Long pricingProfileSellRateId) {
    
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

  public WalleejoinCreatePartnershipApiRequestDto subscriptionProductId(@javax.annotation.Nullable Long subscriptionProductId) {
    
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

  public WalleejoinCreatePartnershipApiRequestDto merchantEmailAddress(@javax.annotation.Nullable String merchantEmailAddress) {
    
    this.merchantEmailAddress = merchantEmailAddress;
    return this;
  }

  /**
   * Get merchantEmailAddress
   * @return merchantEmailAddress
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MERCHANT_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantEmailAddress() {
    return merchantEmailAddress;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantEmailAddress(@javax.annotation.Nullable String merchantEmailAddress) {
    this.merchantEmailAddress = merchantEmailAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalleejoinCreatePartnershipApiRequestDto walleejoinCreatePartnershipApiRequestDto = (WalleejoinCreatePartnershipApiRequestDto) o;
    return Objects.equals(this.emailMessage, walleejoinCreatePartnershipApiRequestDto.emailMessage) &&
        Objects.equals(this.partnerAccountId, walleejoinCreatePartnershipApiRequestDto.partnerAccountId) &&
        Objects.equals(this.merchantAccountName, walleejoinCreatePartnershipApiRequestDto.merchantAccountName) &&
        Objects.equals(this.merchantAddress, walleejoinCreatePartnershipApiRequestDto.merchantAddress) &&
        Objects.equals(this.pricingProfileSellRateId, walleejoinCreatePartnershipApiRequestDto.pricingProfileSellRateId) &&
        Objects.equals(this.subscriptionProductId, walleejoinCreatePartnershipApiRequestDto.subscriptionProductId) &&
        Objects.equals(this.merchantEmailAddress, walleejoinCreatePartnershipApiRequestDto.merchantEmailAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailMessage, partnerAccountId, merchantAccountName, merchantAddress, pricingProfileSellRateId, subscriptionProductId, merchantEmailAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalleejoinCreatePartnershipApiRequestDto {\n");
    sb.append("    emailMessage: ").append(toIndentedString(emailMessage)).append("\n");
    sb.append("    partnerAccountId: ").append(toIndentedString(partnerAccountId)).append("\n");
    sb.append("    merchantAccountName: ").append(toIndentedString(merchantAccountName)).append("\n");
    sb.append("    merchantAddress: ").append(toIndentedString(merchantAddress)).append("\n");
    sb.append("    pricingProfileSellRateId: ").append(toIndentedString(pricingProfileSellRateId)).append("\n");
    sb.append("    subscriptionProductId: ").append(toIndentedString(subscriptionProductId)).append("\n");
    sb.append("    merchantEmailAddress: ").append(toIndentedString(merchantEmailAddress)).append("\n");
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

    // add `emailMessage` to the URL query string
    if (getEmailMessage() != null) {
      try {
        joiner.add(String.format("%semailMessage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmailMessage()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `merchantAccountName` to the URL query string
    if (getMerchantAccountName() != null) {
      try {
        joiner.add(String.format("%smerchantAccountName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMerchantAccountName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `merchantAddress` to the URL query string
    if (getMerchantAddress() != null) {
      joiner.add(getMerchantAddress().toUrlQueryString(prefix + "merchantAddress" + suffix));
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

    // add `subscriptionProductId` to the URL query string
    if (getSubscriptionProductId() != null) {
      try {
        joiner.add(String.format("%ssubscriptionProductId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubscriptionProductId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `merchantEmailAddress` to the URL query string
    if (getMerchantEmailAddress() != null) {
      try {
        joiner.add(String.format("%smerchantEmailAddress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMerchantEmailAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

