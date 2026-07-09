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
import com.wallee.sdk.model.DeliveryDaysRange;
import com.wallee.sdk.model.DeliveryDestination;
import com.wallee.sdk.model.RefundDaysRange;
import com.wallee.sdk.model.RefundPercentageRange;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * MerchantEcommerceDetailsDto
 */
@JsonPropertyOrder({
  MerchantEcommerceDetailsDto.JSON_PROPERTY_PASSWORD,
  MerchantEcommerceDetailsDto.JSON_PROPERTY_VOUCHER_SALES_OVER5_PERCENT,
  MerchantEcommerceDetailsDto.JSON_PROPERTY_OFFER_SUBSCRIPTION_BASED_PRODUCT,
  MerchantEcommerceDetailsDto.JSON_PROPERTY_URL_PASSWORD_PROTECTED,
  MerchantEcommerceDetailsDto.JSON_PROPERTY_WEBSITE_URL,
  MerchantEcommerceDetailsDto.JSON_PROPERTY_DELIVERY_DESTINATION,
  MerchantEcommerceDetailsDto.JSON_PROPERTY_EXPECTED_INTERNATIONAL_TURNOVER_RANGE,
  MerchantEcommerceDetailsDto.JSON_PROPERTY_DELIVERY_DAYS_RANGE,
  MerchantEcommerceDetailsDto.JSON_PROPERTY_REFUND_DAYS_RANGE,
  MerchantEcommerceDetailsDto.JSON_PROPERTY_REFUND_PERCENTAGE_RANGE,
  MerchantEcommerceDetailsDto.JSON_PROPERTY_USERNAME
})

public class MerchantEcommerceDetailsDto {
  public static final String JSON_PROPERTY_PASSWORD = "password";
  @javax.annotation.Nullable
  private String password;

  public static final String JSON_PROPERTY_VOUCHER_SALES_OVER5_PERCENT = "voucherSalesOver5Percent";
  @javax.annotation.Nullable
  private Boolean voucherSalesOver5Percent;

  public static final String JSON_PROPERTY_OFFER_SUBSCRIPTION_BASED_PRODUCT = "offerSubscriptionBasedProduct";
  @javax.annotation.Nullable
  private Boolean offerSubscriptionBasedProduct;

  public static final String JSON_PROPERTY_URL_PASSWORD_PROTECTED = "urlPasswordProtected";
  @javax.annotation.Nullable
  private Boolean urlPasswordProtected;

  public static final String JSON_PROPERTY_WEBSITE_URL = "websiteUrl";
  @javax.annotation.Nullable
  private String websiteUrl;

  public static final String JSON_PROPERTY_DELIVERY_DESTINATION = "deliveryDestination";
  @javax.annotation.Nullable
  private DeliveryDestination deliveryDestination;

  public static final String JSON_PROPERTY_EXPECTED_INTERNATIONAL_TURNOVER_RANGE = "expectedInternationalTurnoverRange";
  @javax.annotation.Nullable
  private RefundPercentageRange expectedInternationalTurnoverRange;

  public static final String JSON_PROPERTY_DELIVERY_DAYS_RANGE = "deliveryDaysRange";
  @javax.annotation.Nullable
  private DeliveryDaysRange deliveryDaysRange;

  public static final String JSON_PROPERTY_REFUND_DAYS_RANGE = "refundDaysRange";
  @javax.annotation.Nullable
  private RefundDaysRange refundDaysRange;

  public static final String JSON_PROPERTY_REFUND_PERCENTAGE_RANGE = "refundPercentageRange";
  @javax.annotation.Nullable
  private RefundPercentageRange refundPercentageRange;

  public static final String JSON_PROPERTY_USERNAME = "username";
  @javax.annotation.Nullable
  private String username;

  public MerchantEcommerceDetailsDto() {
  }

  public MerchantEcommerceDetailsDto password(@javax.annotation.Nullable String password) {
    
    this.password = password;
    return this;
  }

  /**
   * The password used to access the protected ecommerce website.
   * @return password
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(@javax.annotation.Nullable String password) {
    this.password = password;
  }

  public MerchantEcommerceDetailsDto voucherSalesOver5Percent(@javax.annotation.Nullable Boolean voucherSalesOver5Percent) {
    
    this.voucherSalesOver5Percent = voucherSalesOver5Percent;
    return this;
  }

  /**
   * Whether voucher sales exceed five percent of turnover.
   * @return voucherSalesOver5Percent
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VOUCHER_SALES_OVER5_PERCENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVoucherSalesOver5Percent() {
    return voucherSalesOver5Percent;
  }


  @JsonProperty(JSON_PROPERTY_VOUCHER_SALES_OVER5_PERCENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVoucherSalesOver5Percent(@javax.annotation.Nullable Boolean voucherSalesOver5Percent) {
    this.voucherSalesOver5Percent = voucherSalesOver5Percent;
  }

  public MerchantEcommerceDetailsDto offerSubscriptionBasedProduct(@javax.annotation.Nullable Boolean offerSubscriptionBasedProduct) {
    
    this.offerSubscriptionBasedProduct = offerSubscriptionBasedProduct;
    return this;
  }

  /**
   * Whether the merchant offers subscription-based products.
   * @return offerSubscriptionBasedProduct
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OFFER_SUBSCRIPTION_BASED_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOfferSubscriptionBasedProduct() {
    return offerSubscriptionBasedProduct;
  }


  @JsonProperty(JSON_PROPERTY_OFFER_SUBSCRIPTION_BASED_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOfferSubscriptionBasedProduct(@javax.annotation.Nullable Boolean offerSubscriptionBasedProduct) {
    this.offerSubscriptionBasedProduct = offerSubscriptionBasedProduct;
  }

  public MerchantEcommerceDetailsDto urlPasswordProtected(@javax.annotation.Nullable Boolean urlPasswordProtected) {
    
    this.urlPasswordProtected = urlPasswordProtected;
    return this;
  }

  /**
   * Whether the ecommerce website is protected by a login.
   * @return urlPasswordProtected
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL_PASSWORD_PROTECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUrlPasswordProtected() {
    return urlPasswordProtected;
  }


  @JsonProperty(JSON_PROPERTY_URL_PASSWORD_PROTECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrlPasswordProtected(@javax.annotation.Nullable Boolean urlPasswordProtected) {
    this.urlPasswordProtected = urlPasswordProtected;
  }

  public MerchantEcommerceDetailsDto websiteUrl(@javax.annotation.Nullable String websiteUrl) {
    
    this.websiteUrl = websiteUrl;
    return this;
  }

  /**
   * The URL of the merchant&#39;s ecommerce website.
   * @return websiteUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEBSITE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebsiteUrl() {
    return websiteUrl;
  }


  @JsonProperty(JSON_PROPERTY_WEBSITE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebsiteUrl(@javax.annotation.Nullable String websiteUrl) {
    this.websiteUrl = websiteUrl;
  }

  public MerchantEcommerceDetailsDto deliveryDestination(@javax.annotation.Nullable DeliveryDestination deliveryDestination) {
    
    this.deliveryDestination = deliveryDestination;
    return this;
  }

  /**
   * Get deliveryDestination
   * @return deliveryDestination
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELIVERY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DeliveryDestination getDeliveryDestination() {
    return deliveryDestination;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveryDestination(@javax.annotation.Nullable DeliveryDestination deliveryDestination) {
    this.deliveryDestination = deliveryDestination;
  }

  public MerchantEcommerceDetailsDto expectedInternationalTurnoverRange(@javax.annotation.Nullable RefundPercentageRange expectedInternationalTurnoverRange) {
    
    this.expectedInternationalTurnoverRange = expectedInternationalTurnoverRange;
    return this;
  }

  /**
   * Get expectedInternationalTurnoverRange
   * @return expectedInternationalTurnoverRange
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPECTED_INTERNATIONAL_TURNOVER_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RefundPercentageRange getExpectedInternationalTurnoverRange() {
    return expectedInternationalTurnoverRange;
  }


  @JsonProperty(JSON_PROPERTY_EXPECTED_INTERNATIONAL_TURNOVER_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpectedInternationalTurnoverRange(@javax.annotation.Nullable RefundPercentageRange expectedInternationalTurnoverRange) {
    this.expectedInternationalTurnoverRange = expectedInternationalTurnoverRange;
  }

  public MerchantEcommerceDetailsDto deliveryDaysRange(@javax.annotation.Nullable DeliveryDaysRange deliveryDaysRange) {
    
    this.deliveryDaysRange = deliveryDaysRange;
    return this;
  }

  /**
   * Get deliveryDaysRange
   * @return deliveryDaysRange
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELIVERY_DAYS_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DeliveryDaysRange getDeliveryDaysRange() {
    return deliveryDaysRange;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERY_DAYS_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveryDaysRange(@javax.annotation.Nullable DeliveryDaysRange deliveryDaysRange) {
    this.deliveryDaysRange = deliveryDaysRange;
  }

  public MerchantEcommerceDetailsDto refundDaysRange(@javax.annotation.Nullable RefundDaysRange refundDaysRange) {
    
    this.refundDaysRange = refundDaysRange;
    return this;
  }

  /**
   * Get refundDaysRange
   * @return refundDaysRange
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFUND_DAYS_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RefundDaysRange getRefundDaysRange() {
    return refundDaysRange;
  }


  @JsonProperty(JSON_PROPERTY_REFUND_DAYS_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefundDaysRange(@javax.annotation.Nullable RefundDaysRange refundDaysRange) {
    this.refundDaysRange = refundDaysRange;
  }

  public MerchantEcommerceDetailsDto refundPercentageRange(@javax.annotation.Nullable RefundPercentageRange refundPercentageRange) {
    
    this.refundPercentageRange = refundPercentageRange;
    return this;
  }

  /**
   * Get refundPercentageRange
   * @return refundPercentageRange
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFUND_PERCENTAGE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RefundPercentageRange getRefundPercentageRange() {
    return refundPercentageRange;
  }


  @JsonProperty(JSON_PROPERTY_REFUND_PERCENTAGE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefundPercentageRange(@javax.annotation.Nullable RefundPercentageRange refundPercentageRange) {
    this.refundPercentageRange = refundPercentageRange;
  }

  public MerchantEcommerceDetailsDto username(@javax.annotation.Nullable String username) {
    
    this.username = username;
    return this;
  }

  /**
   * The username used to access the protected ecommerce website.
   * @return username
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername(@javax.annotation.Nullable String username) {
    this.username = username;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantEcommerceDetailsDto merchantEcommerceDetailsDto = (MerchantEcommerceDetailsDto) o;
    return Objects.equals(this.password, merchantEcommerceDetailsDto.password) &&
        Objects.equals(this.voucherSalesOver5Percent, merchantEcommerceDetailsDto.voucherSalesOver5Percent) &&
        Objects.equals(this.offerSubscriptionBasedProduct, merchantEcommerceDetailsDto.offerSubscriptionBasedProduct) &&
        Objects.equals(this.urlPasswordProtected, merchantEcommerceDetailsDto.urlPasswordProtected) &&
        Objects.equals(this.websiteUrl, merchantEcommerceDetailsDto.websiteUrl) &&
        Objects.equals(this.deliveryDestination, merchantEcommerceDetailsDto.deliveryDestination) &&
        Objects.equals(this.expectedInternationalTurnoverRange, merchantEcommerceDetailsDto.expectedInternationalTurnoverRange) &&
        Objects.equals(this.deliveryDaysRange, merchantEcommerceDetailsDto.deliveryDaysRange) &&
        Objects.equals(this.refundDaysRange, merchantEcommerceDetailsDto.refundDaysRange) &&
        Objects.equals(this.refundPercentageRange, merchantEcommerceDetailsDto.refundPercentageRange) &&
        Objects.equals(this.username, merchantEcommerceDetailsDto.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, voucherSalesOver5Percent, offerSubscriptionBasedProduct, urlPasswordProtected, websiteUrl, deliveryDestination, expectedInternationalTurnoverRange, deliveryDaysRange, refundDaysRange, refundPercentageRange, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantEcommerceDetailsDto {\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    voucherSalesOver5Percent: ").append(toIndentedString(voucherSalesOver5Percent)).append("\n");
    sb.append("    offerSubscriptionBasedProduct: ").append(toIndentedString(offerSubscriptionBasedProduct)).append("\n");
    sb.append("    urlPasswordProtected: ").append(toIndentedString(urlPasswordProtected)).append("\n");
    sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
    sb.append("    deliveryDestination: ").append(toIndentedString(deliveryDestination)).append("\n");
    sb.append("    expectedInternationalTurnoverRange: ").append(toIndentedString(expectedInternationalTurnoverRange)).append("\n");
    sb.append("    deliveryDaysRange: ").append(toIndentedString(deliveryDaysRange)).append("\n");
    sb.append("    refundDaysRange: ").append(toIndentedString(refundDaysRange)).append("\n");
    sb.append("    refundPercentageRange: ").append(toIndentedString(refundPercentageRange)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

    // add `password` to the URL query string
    if (getPassword() != null) {
      try {
        joiner.add(String.format("%spassword%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPassword()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `voucherSalesOver5Percent` to the URL query string
    if (getVoucherSalesOver5Percent() != null) {
      try {
        joiner.add(String.format("%svoucherSalesOver5Percent%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVoucherSalesOver5Percent()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `offerSubscriptionBasedProduct` to the URL query string
    if (getOfferSubscriptionBasedProduct() != null) {
      try {
        joiner.add(String.format("%sofferSubscriptionBasedProduct%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOfferSubscriptionBasedProduct()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `urlPasswordProtected` to the URL query string
    if (getUrlPasswordProtected() != null) {
      try {
        joiner.add(String.format("%surlPasswordProtected%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUrlPasswordProtected()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `websiteUrl` to the URL query string
    if (getWebsiteUrl() != null) {
      try {
        joiner.add(String.format("%swebsiteUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getWebsiteUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `deliveryDestination` to the URL query string
    if (getDeliveryDestination() != null) {
      try {
        joiner.add(String.format("%sdeliveryDestination%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDeliveryDestination()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `expectedInternationalTurnoverRange` to the URL query string
    if (getExpectedInternationalTurnoverRange() != null) {
      try {
        joiner.add(String.format("%sexpectedInternationalTurnoverRange%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExpectedInternationalTurnoverRange()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `deliveryDaysRange` to the URL query string
    if (getDeliveryDaysRange() != null) {
      try {
        joiner.add(String.format("%sdeliveryDaysRange%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDeliveryDaysRange()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `refundDaysRange` to the URL query string
    if (getRefundDaysRange() != null) {
      try {
        joiner.add(String.format("%srefundDaysRange%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRefundDaysRange()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `refundPercentageRange` to the URL query string
    if (getRefundPercentageRange() != null) {
      try {
        joiner.add(String.format("%srefundPercentageRange%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRefundPercentageRange()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `username` to the URL query string
    if (getUsername() != null) {
      try {
        joiner.add(String.format("%susername%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUsername()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

