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
import com.wallee.sdk.model.SubscriptionComponentGroupConfigurationRequestSetter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Model used to store a Trial Subscription, assigning it to an Account
 */
@JsonPropertyOrder({
  StoreTrialSubscriptionRequest.JSON_PROPERTY_COUPON_CODES,
  StoreTrialSubscriptionRequest.JSON_PROPERTY_COMPONENT_CONFIGURATIONS,
  StoreTrialSubscriptionRequest.JSON_PROPERTY_PRODUCT_ID,
  StoreTrialSubscriptionRequest.JSON_PROPERTY_CURRENCY,
  StoreTrialSubscriptionRequest.JSON_PROPERTY_AFFILIATE_ID
})

public class StoreTrialSubscriptionRequest {
  public static final String JSON_PROPERTY_COUPON_CODES = "couponCodes";
  @javax.annotation.Nullable
  private List<String> couponCodes = new ArrayList<>();

  public static final String JSON_PROPERTY_COMPONENT_CONFIGURATIONS = "componentConfigurations";
  @javax.annotation.Nullable
  private List<SubscriptionComponentGroupConfigurationRequestSetter> componentConfigurations = new ArrayList<>();

  public static final String JSON_PROPERTY_PRODUCT_ID = "productId";
  @javax.annotation.Nullable
  private Long productId;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @javax.annotation.Nullable
  private String currency;

  public static final String JSON_PROPERTY_AFFILIATE_ID = "affiliateId";
  @javax.annotation.Nullable
  private Long affiliateId;

  public StoreTrialSubscriptionRequest() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public StoreTrialSubscriptionRequest(
    @JsonProperty(JSON_PROPERTY_COUPON_CODES) List<String> couponCodes, 
    @JsonProperty(JSON_PROPERTY_COMPONENT_CONFIGURATIONS) List<SubscriptionComponentGroupConfigurationRequestSetter> componentConfigurations, 
    @JsonProperty(JSON_PROPERTY_PRODUCT_ID) Long productId, 
    @JsonProperty(JSON_PROPERTY_CURRENCY) String currency, 
    @JsonProperty(JSON_PROPERTY_AFFILIATE_ID) Long affiliateId
  ) {
    this();
    this.couponCodes = couponCodes;
    this.componentConfigurations = componentConfigurations;
    this.productId = productId;
    this.currency = currency;
    this.affiliateId = affiliateId;
  }

  /**
   * Get couponCodes
   * @return couponCodes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUPON_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCouponCodes() {
    return couponCodes;
  }



  /**
   * Get componentConfigurations
   * @return componentConfigurations
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENT_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SubscriptionComponentGroupConfigurationRequestSetter> getComponentConfigurations() {
    return componentConfigurations;
  }



  /**
   * ID of the product that will be used for the Trial Subscription assigned to the Account.
   * @return productId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getProductId() {
    return productId;
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



  /**
   * ID of the affiliate to be added in the subscription assignment.
   * @return affiliateId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AFFILIATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAffiliateId() {
    return affiliateId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreTrialSubscriptionRequest storeTrialSubscriptionRequest = (StoreTrialSubscriptionRequest) o;
    return Objects.equals(this.couponCodes, storeTrialSubscriptionRequest.couponCodes) &&
        Objects.equals(this.componentConfigurations, storeTrialSubscriptionRequest.componentConfigurations) &&
        Objects.equals(this.productId, storeTrialSubscriptionRequest.productId) &&
        Objects.equals(this.currency, storeTrialSubscriptionRequest.currency) &&
        Objects.equals(this.affiliateId, storeTrialSubscriptionRequest.affiliateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(couponCodes, componentConfigurations, productId, currency, affiliateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreTrialSubscriptionRequest {\n");
    sb.append("    couponCodes: ").append(toIndentedString(couponCodes)).append("\n");
    sb.append("    componentConfigurations: ").append(toIndentedString(componentConfigurations)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    affiliateId: ").append(toIndentedString(affiliateId)).append("\n");
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

    // add `couponCodes` to the URL query string
    if (getCouponCodes() != null) {
      for (int i = 0; i < getCouponCodes().size(); i++) {
        try {
          joiner.add(String.format("%scouponCodes%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getCouponCodes().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `componentConfigurations` to the URL query string
    if (getComponentConfigurations() != null) {
      for (int i = 0; i < getComponentConfigurations().size(); i++) {
        if (getComponentConfigurations().get(i) != null) {
          joiner.add(getComponentConfigurations().get(i).toUrlQueryString(String.format("%scomponentConfigurations%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `productId` to the URL query string
    if (getProductId() != null) {
      try {
        joiner.add(String.format("%sproductId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProductId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `affiliateId` to the URL query string
    if (getAffiliateId() != null) {
      try {
        joiner.add(String.format("%saffiliateId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAffiliateId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

