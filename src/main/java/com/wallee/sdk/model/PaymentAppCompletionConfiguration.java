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
 * PaymentAppCompletionConfiguration
 */
@JsonPropertyOrder({
  PaymentAppCompletionConfiguration.JSON_PROPERTY_MULTIPLE_COMPLETIONS_SUPPORTED,
  PaymentAppCompletionConfiguration.JSON_PROPERTY_MAXIMAL_COMPLETION_DELAY_IN_DAYS,
  PaymentAppCompletionConfiguration.JSON_PROPERTY_COMPLETION_ENDPOINT,
  PaymentAppCompletionConfiguration.JSON_PROPERTY_COMPLETION_TIMEOUT_IN_MINUTES,
  PaymentAppCompletionConfiguration.JSON_PROPERTY_VOID_ENDPOINT
})

public class PaymentAppCompletionConfiguration {
  public static final String JSON_PROPERTY_MULTIPLE_COMPLETIONS_SUPPORTED = "multipleCompletionsSupported";
  private Boolean multipleCompletionsSupported;

  public static final String JSON_PROPERTY_MAXIMAL_COMPLETION_DELAY_IN_DAYS = "maximalCompletionDelayInDays";
  private Integer maximalCompletionDelayInDays;

  public static final String JSON_PROPERTY_COMPLETION_ENDPOINT = "completionEndpoint";
  private String completionEndpoint;

  public static final String JSON_PROPERTY_COMPLETION_TIMEOUT_IN_MINUTES = "completionTimeoutInMinutes";
  private Integer completionTimeoutInMinutes;

  public static final String JSON_PROPERTY_VOID_ENDPOINT = "voidEndpoint";
  private String voidEndpoint;

  public PaymentAppCompletionConfiguration() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public PaymentAppCompletionConfiguration(
    @JsonProperty(JSON_PROPERTY_MULTIPLE_COMPLETIONS_SUPPORTED) Boolean multipleCompletionsSupported, 
    @JsonProperty(JSON_PROPERTY_MAXIMAL_COMPLETION_DELAY_IN_DAYS) Integer maximalCompletionDelayInDays, 
    @JsonProperty(JSON_PROPERTY_COMPLETION_ENDPOINT) String completionEndpoint, 
    @JsonProperty(JSON_PROPERTY_COMPLETION_TIMEOUT_IN_MINUTES) Integer completionTimeoutInMinutes, 
    @JsonProperty(JSON_PROPERTY_VOID_ENDPOINT) String voidEndpoint
  ) {
    this();
    this.multipleCompletionsSupported = multipleCompletionsSupported;
    this.maximalCompletionDelayInDays = maximalCompletionDelayInDays;
    this.completionEndpoint = completionEndpoint;
    this.completionTimeoutInMinutes = completionTimeoutInMinutes;
    this.voidEndpoint = voidEndpoint;
  }

   /**
   * Whether the payment connector can process multiple completions for a single transaction.
   * @return multipleCompletionsSupported
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MULTIPLE_COMPLETIONS_SUPPORTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMultipleCompletionsSupported() {
    return multipleCompletionsSupported;
  }



   /**
   * The maximum number of days after a transaction&#39;s authorization during which a completion or void action can be triggered. Once this period has passed, neither action can be executed.
   * @return maximalCompletionDelayInDays
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAXIMAL_COMPLETION_DELAY_IN_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaximalCompletionDelayInDays() {
    return maximalCompletionDelayInDays;
  }



   /**
   * The URL that the payment service provider will invoke to process a completion request. This endpoint handles communication with the provider for initiating and managing completions.
   * @return completionEndpoint
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETION_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompletionEndpoint() {
    return completionEndpoint;
  }



   /**
   * The maximum time (in minutes) to wait for a response from the payment service provider after a completion request is triggered. If no feedback or final status is received within this period, the completion is considered failed.
   * @return completionTimeoutInMinutes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETION_TIMEOUT_IN_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCompletionTimeoutInMinutes() {
    return completionTimeoutInMinutes;
  }



   /**
   * The URL that the payment service provider will invoke to process a void request. This endpoint handles communication with the provider for initiating and managing voids.
   * @return voidEndpoint
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VOID_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVoidEndpoint() {
    return voidEndpoint;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAppCompletionConfiguration paymentAppCompletionConfiguration = (PaymentAppCompletionConfiguration) o;
    return Objects.equals(this.multipleCompletionsSupported, paymentAppCompletionConfiguration.multipleCompletionsSupported) &&
        Objects.equals(this.maximalCompletionDelayInDays, paymentAppCompletionConfiguration.maximalCompletionDelayInDays) &&
        Objects.equals(this.completionEndpoint, paymentAppCompletionConfiguration.completionEndpoint) &&
        Objects.equals(this.completionTimeoutInMinutes, paymentAppCompletionConfiguration.completionTimeoutInMinutes) &&
        Objects.equals(this.voidEndpoint, paymentAppCompletionConfiguration.voidEndpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multipleCompletionsSupported, maximalCompletionDelayInDays, completionEndpoint, completionTimeoutInMinutes, voidEndpoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAppCompletionConfiguration {\n");
    sb.append("    multipleCompletionsSupported: ").append(toIndentedString(multipleCompletionsSupported)).append("\n");
    sb.append("    maximalCompletionDelayInDays: ").append(toIndentedString(maximalCompletionDelayInDays)).append("\n");
    sb.append("    completionEndpoint: ").append(toIndentedString(completionEndpoint)).append("\n");
    sb.append("    completionTimeoutInMinutes: ").append(toIndentedString(completionTimeoutInMinutes)).append("\n");
    sb.append("    voidEndpoint: ").append(toIndentedString(voidEndpoint)).append("\n");
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

    // add `multipleCompletionsSupported` to the URL query string
    if (getMultipleCompletionsSupported() != null) {
      try {
        joiner.add(String.format("%smultipleCompletionsSupported%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMultipleCompletionsSupported()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `maximalCompletionDelayInDays` to the URL query string
    if (getMaximalCompletionDelayInDays() != null) {
      try {
        joiner.add(String.format("%smaximalCompletionDelayInDays%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaximalCompletionDelayInDays()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `completionEndpoint` to the URL query string
    if (getCompletionEndpoint() != null) {
      try {
        joiner.add(String.format("%scompletionEndpoint%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCompletionEndpoint()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `completionTimeoutInMinutes` to the URL query string
    if (getCompletionTimeoutInMinutes() != null) {
      try {
        joiner.add(String.format("%scompletionTimeoutInMinutes%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCompletionTimeoutInMinutes()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `voidEndpoint` to the URL query string
    if (getVoidEndpoint() != null) {
      try {
        joiner.add(String.format("%svoidEndpoint%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVoidEndpoint()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

