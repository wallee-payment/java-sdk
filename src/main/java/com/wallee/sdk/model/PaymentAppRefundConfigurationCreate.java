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
 * PaymentAppRefundConfigurationCreate
 */
@JsonPropertyOrder({
  PaymentAppRefundConfigurationCreate.JSON_PROPERTY_REFUND_TIMEOUT_IN_MINUTES,
  PaymentAppRefundConfigurationCreate.JSON_PROPERTY_MULTIPLE_REFUNDS_SUPPORTED,
  PaymentAppRefundConfigurationCreate.JSON_PROPERTY_REFUND_ENDPOINT
})
@JsonTypeName("PaymentAppRefundConfiguration.Create")

public class PaymentAppRefundConfigurationCreate {
  public static final String JSON_PROPERTY_REFUND_TIMEOUT_IN_MINUTES = "refundTimeoutInMinutes";
  private Integer refundTimeoutInMinutes;

  public static final String JSON_PROPERTY_MULTIPLE_REFUNDS_SUPPORTED = "multipleRefundsSupported";
  private Boolean multipleRefundsSupported;

  public static final String JSON_PROPERTY_REFUND_ENDPOINT = "refundEndpoint";
  private String refundEndpoint;

  public PaymentAppRefundConfigurationCreate() {
  }

  public PaymentAppRefundConfigurationCreate refundTimeoutInMinutes(Integer refundTimeoutInMinutes) {
    
    this.refundTimeoutInMinutes = refundTimeoutInMinutes;
    return this;
  }

   /**
   * The maximum time (in minutes) to wait for a response from the payment service provider after a refund request is triggered. If no feedback or final status is received within this period, the refund is considered failed.
   * @return refundTimeoutInMinutes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFUND_TIMEOUT_IN_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRefundTimeoutInMinutes() {
    return refundTimeoutInMinutes;
  }


  @JsonProperty(JSON_PROPERTY_REFUND_TIMEOUT_IN_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefundTimeoutInMinutes(Integer refundTimeoutInMinutes) {
    this.refundTimeoutInMinutes = refundTimeoutInMinutes;
  }

  public PaymentAppRefundConfigurationCreate multipleRefundsSupported(Boolean multipleRefundsSupported) {
    
    this.multipleRefundsSupported = multipleRefundsSupported;
    return this;
  }

   /**
   * Whether the payment connector can process multiple refunds for a single transaction.
   * @return multipleRefundsSupported
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MULTIPLE_REFUNDS_SUPPORTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMultipleRefundsSupported() {
    return multipleRefundsSupported;
  }


  @JsonProperty(JSON_PROPERTY_MULTIPLE_REFUNDS_SUPPORTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMultipleRefundsSupported(Boolean multipleRefundsSupported) {
    this.multipleRefundsSupported = multipleRefundsSupported;
  }

  public PaymentAppRefundConfigurationCreate refundEndpoint(String refundEndpoint) {
    
    this.refundEndpoint = refundEndpoint;
    return this;
  }

   /**
   * The URL that the payment service provider will invoke to process a refund request. This endpoint handles communication with the provider for initiating and managing refunds.
   * @return refundEndpoint
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFUND_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRefundEndpoint() {
    return refundEndpoint;
  }


  @JsonProperty(JSON_PROPERTY_REFUND_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefundEndpoint(String refundEndpoint) {
    this.refundEndpoint = refundEndpoint;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAppRefundConfigurationCreate paymentAppRefundConfigurationCreate = (PaymentAppRefundConfigurationCreate) o;
    return Objects.equals(this.refundTimeoutInMinutes, paymentAppRefundConfigurationCreate.refundTimeoutInMinutes) &&
        Objects.equals(this.multipleRefundsSupported, paymentAppRefundConfigurationCreate.multipleRefundsSupported) &&
        Objects.equals(this.refundEndpoint, paymentAppRefundConfigurationCreate.refundEndpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refundTimeoutInMinutes, multipleRefundsSupported, refundEndpoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAppRefundConfigurationCreate {\n");
    sb.append("    refundTimeoutInMinutes: ").append(toIndentedString(refundTimeoutInMinutes)).append("\n");
    sb.append("    multipleRefundsSupported: ").append(toIndentedString(multipleRefundsSupported)).append("\n");
    sb.append("    refundEndpoint: ").append(toIndentedString(refundEndpoint)).append("\n");
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

    // add `refundTimeoutInMinutes` to the URL query string
    if (getRefundTimeoutInMinutes() != null) {
      try {
        joiner.add(String.format("%srefundTimeoutInMinutes%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRefundTimeoutInMinutes()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `multipleRefundsSupported` to the URL query string
    if (getMultipleRefundsSupported() != null) {
      try {
        joiner.add(String.format("%smultipleRefundsSupported%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMultipleRefundsSupported()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `refundEndpoint` to the URL query string
    if (getRefundEndpoint() != null) {
      try {
        joiner.add(String.format("%srefundEndpoint%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRefundEndpoint()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

