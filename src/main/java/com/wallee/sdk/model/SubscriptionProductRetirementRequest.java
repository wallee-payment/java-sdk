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
 * SubscriptionProductRetirementRequest
 */
@JsonPropertyOrder({
  SubscriptionProductRetirementRequest.JSON_PROPERTY_RESPECT_TERMINATION_PERIODS,
  SubscriptionProductRetirementRequest.JSON_PROPERTY_TARGET_PRODUCT
})

public class SubscriptionProductRetirementRequest {
  public static final String JSON_PROPERTY_RESPECT_TERMINATION_PERIODS = "respectTerminationPeriods";
  private Boolean respectTerminationPeriods;

  public static final String JSON_PROPERTY_TARGET_PRODUCT = "targetProduct";
  private Long targetProduct;

  public SubscriptionProductRetirementRequest() {
  }

  public SubscriptionProductRetirementRequest respectTerminationPeriods(Boolean respectTerminationPeriods) {
    
    this.respectTerminationPeriods = respectTerminationPeriods;
    return this;
  }

   /**
   * Whether the subscriptions&#39; termination periods should be respected.
   * @return respectTerminationPeriods
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESPECT_TERMINATION_PERIODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRespectTerminationPeriods() {
    return respectTerminationPeriods;
  }


  @JsonProperty(JSON_PROPERTY_RESPECT_TERMINATION_PERIODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRespectTerminationPeriods(Boolean respectTerminationPeriods) {
    this.respectTerminationPeriods = respectTerminationPeriods;
  }

  public SubscriptionProductRetirementRequest targetProduct(Long targetProduct) {
    
    this.targetProduct = targetProduct;
    return this;
  }

   /**
   * The product to which the subscriptions with the retiring product are to be migrated. If none is defined, the subscriptions are terminated.
   * @return targetProduct
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTargetProduct() {
    return targetProduct;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetProduct(Long targetProduct) {
    this.targetProduct = targetProduct;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionProductRetirementRequest subscriptionProductRetirementRequest = (SubscriptionProductRetirementRequest) o;
    return Objects.equals(this.respectTerminationPeriods, subscriptionProductRetirementRequest.respectTerminationPeriods) &&
        Objects.equals(this.targetProduct, subscriptionProductRetirementRequest.targetProduct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(respectTerminationPeriods, targetProduct);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProductRetirementRequest {\n");
    sb.append("    respectTerminationPeriods: ").append(toIndentedString(respectTerminationPeriods)).append("\n");
    sb.append("    targetProduct: ").append(toIndentedString(targetProduct)).append("\n");
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

    // add `respectTerminationPeriods` to the URL query string
    if (getRespectTerminationPeriods() != null) {
      try {
        joiner.add(String.format("%srespectTerminationPeriods%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRespectTerminationPeriods()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `targetProduct` to the URL query string
    if (getTargetProduct() != null) {
      try {
        joiner.add(String.format("%stargetProduct%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTargetProduct()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

