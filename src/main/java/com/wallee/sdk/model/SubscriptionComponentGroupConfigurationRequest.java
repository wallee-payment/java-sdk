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
 * Model used to configure the Subscription Product to be assigned to the Account
 */
@JsonPropertyOrder({
  SubscriptionComponentGroupConfigurationRequest.JSON_PROPERTY_QUANTITY,
  SubscriptionComponentGroupConfigurationRequest.JSON_PROPERTY_SUBSCRIPTION_PRODUCT_COMPONENT_GROUP_ID,
  SubscriptionComponentGroupConfigurationRequest.JSON_PROPERTY_SUBSCRIPTION_PRODUCT_COMPONENT_REFERENCE_ID
})

public class SubscriptionComponentGroupConfigurationRequest {
  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  @javax.annotation.Nullable
  private BigDecimal quantity;

  public static final String JSON_PROPERTY_SUBSCRIPTION_PRODUCT_COMPONENT_GROUP_ID = "subscriptionProductComponentGroupId";
  @javax.annotation.Nullable
  private Long subscriptionProductComponentGroupId;

  public static final String JSON_PROPERTY_SUBSCRIPTION_PRODUCT_COMPONENT_REFERENCE_ID = "subscriptionProductComponentReferenceId";
  @javax.annotation.Nullable
  private Long subscriptionProductComponentReferenceId;

  public SubscriptionComponentGroupConfigurationRequest() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public SubscriptionComponentGroupConfigurationRequest(
    @JsonProperty(JSON_PROPERTY_QUANTITY) BigDecimal quantity, 
    @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_PRODUCT_COMPONENT_GROUP_ID) Long subscriptionProductComponentGroupId, 
    @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_PRODUCT_COMPONENT_REFERENCE_ID) Long subscriptionProductComponentReferenceId
  ) {
    this();
    this.quantity = quantity;
    this.subscriptionProductComponentGroupId = subscriptionProductComponentGroupId;
    this.subscriptionProductComponentReferenceId = subscriptionProductComponentReferenceId;
  }

  /**
   * Get quantity
   * @return quantity
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getQuantity() {
    return quantity;
  }



  /**
   * Get subscriptionProductComponentGroupId
   * @return subscriptionProductComponentGroupId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_PRODUCT_COMPONENT_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSubscriptionProductComponentGroupId() {
    return subscriptionProductComponentGroupId;
  }



  /**
   * Get subscriptionProductComponentReferenceId
   * @return subscriptionProductComponentReferenceId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_PRODUCT_COMPONENT_REFERENCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSubscriptionProductComponentReferenceId() {
    return subscriptionProductComponentReferenceId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionComponentGroupConfigurationRequest subscriptionComponentGroupConfigurationRequest = (SubscriptionComponentGroupConfigurationRequest) o;
    return Objects.equals(this.quantity, subscriptionComponentGroupConfigurationRequest.quantity) &&
        Objects.equals(this.subscriptionProductComponentGroupId, subscriptionComponentGroupConfigurationRequest.subscriptionProductComponentGroupId) &&
        Objects.equals(this.subscriptionProductComponentReferenceId, subscriptionComponentGroupConfigurationRequest.subscriptionProductComponentReferenceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, subscriptionProductComponentGroupId, subscriptionProductComponentReferenceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionComponentGroupConfigurationRequest {\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    subscriptionProductComponentGroupId: ").append(toIndentedString(subscriptionProductComponentGroupId)).append("\n");
    sb.append("    subscriptionProductComponentReferenceId: ").append(toIndentedString(subscriptionProductComponentReferenceId)).append("\n");
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

    // add `quantity` to the URL query string
    if (getQuantity() != null) {
      try {
        joiner.add(String.format("%squantity%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQuantity()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `subscriptionProductComponentGroupId` to the URL query string
    if (getSubscriptionProductComponentGroupId() != null) {
      try {
        joiner.add(String.format("%ssubscriptionProductComponentGroupId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubscriptionProductComponentGroupId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `subscriptionProductComponentReferenceId` to the URL query string
    if (getSubscriptionProductComponentReferenceId() != null) {
      try {
        joiner.add(String.format("%ssubscriptionProductComponentReferenceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSubscriptionProductComponentReferenceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

