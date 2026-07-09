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
 * WalleejoinCreatePartnershipRequestDto
 */
@JsonPropertyOrder({
  WalleejoinCreatePartnershipRequestDto.JSON_PROPERTY_EMAIL_MESSAGE,
  WalleejoinCreatePartnershipRequestDto.JSON_PROPERTY_PARTNER_ACCOUNT_ID,
  WalleejoinCreatePartnershipRequestDto.JSON_PROPERTY_PRICING_PROFILE_SELL_RATE_ID,
  WalleejoinCreatePartnershipRequestDto.JSON_PROPERTY_SUBSCRIPTION_PRODUCT_ID,
  WalleejoinCreatePartnershipRequestDto.JSON_PROPERTY_MERCHANT_EMAIL_ADDRESS
})

public class WalleejoinCreatePartnershipRequestDto {
  public static final String JSON_PROPERTY_EMAIL_MESSAGE = "emailMessage";
  @javax.annotation.Nullable
  private String emailMessage;

  public static final String JSON_PROPERTY_PARTNER_ACCOUNT_ID = "partnerAccountId";
  @javax.annotation.Nullable
  private Long partnerAccountId;

  public static final String JSON_PROPERTY_PRICING_PROFILE_SELL_RATE_ID = "pricingProfileSellRateId";
  @javax.annotation.Nullable
  private Long pricingProfileSellRateId;

  public static final String JSON_PROPERTY_SUBSCRIPTION_PRODUCT_ID = "subscriptionProductId";
  @javax.annotation.Nullable
  private Long subscriptionProductId;

  public static final String JSON_PROPERTY_MERCHANT_EMAIL_ADDRESS = "merchantEmailAddress";
  @javax.annotation.Nullable
  private String merchantEmailAddress;

  public WalleejoinCreatePartnershipRequestDto() {
  }

  public WalleejoinCreatePartnershipRequestDto emailMessage(@javax.annotation.Nullable String emailMessage) {
    
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

  public WalleejoinCreatePartnershipRequestDto partnerAccountId(@javax.annotation.Nullable Long partnerAccountId) {
    
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

  public WalleejoinCreatePartnershipRequestDto pricingProfileSellRateId(@javax.annotation.Nullable Long pricingProfileSellRateId) {
    
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

  public WalleejoinCreatePartnershipRequestDto subscriptionProductId(@javax.annotation.Nullable Long subscriptionProductId) {
    
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

  public WalleejoinCreatePartnershipRequestDto merchantEmailAddress(@javax.annotation.Nullable String merchantEmailAddress) {
    
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
    WalleejoinCreatePartnershipRequestDto walleejoinCreatePartnershipRequestDto = (WalleejoinCreatePartnershipRequestDto) o;
    return Objects.equals(this.emailMessage, walleejoinCreatePartnershipRequestDto.emailMessage) &&
        Objects.equals(this.partnerAccountId, walleejoinCreatePartnershipRequestDto.partnerAccountId) &&
        Objects.equals(this.pricingProfileSellRateId, walleejoinCreatePartnershipRequestDto.pricingProfileSellRateId) &&
        Objects.equals(this.subscriptionProductId, walleejoinCreatePartnershipRequestDto.subscriptionProductId) &&
        Objects.equals(this.merchantEmailAddress, walleejoinCreatePartnershipRequestDto.merchantEmailAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailMessage, partnerAccountId, pricingProfileSellRateId, subscriptionProductId, merchantEmailAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalleejoinCreatePartnershipRequestDto {\n");
    sb.append("    emailMessage: ").append(toIndentedString(emailMessage)).append("\n");
    sb.append("    partnerAccountId: ").append(toIndentedString(partnerAccountId)).append("\n");
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

