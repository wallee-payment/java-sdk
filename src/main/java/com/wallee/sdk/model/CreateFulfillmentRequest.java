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
 * CreateFulfillmentRequest
 */
@JsonPropertyOrder({
  CreateFulfillmentRequest.JSON_PROPERTY_AMOUNT,
  CreateFulfillmentRequest.JSON_PROPERTY_COMPLETION_ID,
  CreateFulfillmentRequest.JSON_PROPERTY_DESCRIPTION,
  CreateFulfillmentRequest.JSON_PROPERTY_EXTERNAL_ID,
  CreateFulfillmentRequest.JSON_PROPERTY_TRACKING_NUMBER
})

public class CreateFulfillmentRequest {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  @javax.annotation.Nullable
  private BigDecimal amount;

  public static final String JSON_PROPERTY_COMPLETION_ID = "completionId";
  @javax.annotation.Nullable
  private Long completionId;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable
  private String description;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  @javax.annotation.Nullable
  private String externalId;

  public static final String JSON_PROPERTY_TRACKING_NUMBER = "trackingNumber";
  @javax.annotation.Nullable
  private String trackingNumber;

  public CreateFulfillmentRequest() {
  }

  public CreateFulfillmentRequest amount(@javax.annotation.Nullable BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(@javax.annotation.Nullable BigDecimal amount) {
    this.amount = amount;
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

  public CreateFulfillmentRequest description(@javax.annotation.Nullable String description) {
    
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }

  public CreateFulfillmentRequest externalId(@javax.annotation.Nullable String externalId) {
    
    this.externalId = externalId;
    return this;
  }

  /**
   * Get externalId
   * @return externalId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalId() {
    return externalId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalId(@javax.annotation.Nullable String externalId) {
    this.externalId = externalId;
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
    return Objects.equals(this.amount, createFulfillmentRequest.amount) &&
        Objects.equals(this.completionId, createFulfillmentRequest.completionId) &&
        Objects.equals(this.description, createFulfillmentRequest.description) &&
        Objects.equals(this.externalId, createFulfillmentRequest.externalId) &&
        Objects.equals(this.trackingNumber, createFulfillmentRequest.trackingNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, completionId, description, externalId, trackingNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFulfillmentRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    completionId: ").append(toIndentedString(completionId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
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

    // add `amount` to the URL query string
    if (getAmount() != null) {
      try {
        joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `completionId` to the URL query string
    if (getCompletionId() != null) {
      try {
        joiner.add(String.format("%scompletionId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCompletionId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      try {
        joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `externalId` to the URL query string
    if (getExternalId() != null) {
      try {
        joiner.add(String.format("%sexternalId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExternalId()), "UTF-8").replaceAll("\\+", "%20")));
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

