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
 * CreateFulfillmentRequest
 */
@JsonPropertyOrder({
  CreateFulfillmentRequest.JSON_PROPERTY_COMPLETION_ID,
  CreateFulfillmentRequest.JSON_PROPERTY_TRACKING_NUMBER
})

public class CreateFulfillmentRequest {
  public static final String JSON_PROPERTY_COMPLETION_ID = "completionId";
  @javax.annotation.Nullable
  private Long completionId;

  public static final String JSON_PROPERTY_TRACKING_NUMBER = "trackingNumber";
  @javax.annotation.Nullable
  private String trackingNumber;

  public CreateFulfillmentRequest() {
  }

  public CreateFulfillmentRequest completionId(@javax.annotation.Nullable Long completionId) {
    
    this.completionId = completionId;
    return this;
  }

  /**
   * Get completionId
   * @return completionId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLETION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCompletionId() {
    return completionId;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompletionId(@javax.annotation.Nullable Long completionId) {
    this.completionId = completionId;
  }

  public CreateFulfillmentRequest trackingNumber(@javax.annotation.Nullable String trackingNumber) {
    
    this.trackingNumber = trackingNumber;
    return this;
  }

  /**
   * Get trackingNumber
   * @return trackingNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRACKING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTrackingNumber() {
    return trackingNumber;
  }


  @JsonProperty(JSON_PROPERTY_TRACKING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackingNumber(@javax.annotation.Nullable String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFulfillmentRequest createFulfillmentRequest = (CreateFulfillmentRequest) o;
    return Objects.equals(this.completionId, createFulfillmentRequest.completionId) &&
        Objects.equals(this.trackingNumber, createFulfillmentRequest.trackingNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionId, trackingNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFulfillmentRequest {\n");
    sb.append("    completionId: ").append(toIndentedString(completionId)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
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

    // add `completionId` to the URL query string
    if (getCompletionId() != null) {
      try {
        joiner.add(String.format("%scompletionId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCompletionId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `trackingNumber` to the URL query string
    if (getTrackingNumber() != null) {
      try {
        joiner.add(String.format("%strackingNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTrackingNumber()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

