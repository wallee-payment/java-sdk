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
import com.wallee.sdk.model.PaymentAppVoidTargetState;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * A request to update the state of a void. The void must be associated with a processor created by the invoking payment web app.
 */
@JsonPropertyOrder({
  PaymentAppVoidUpdate.JSON_PROPERTY_REFERENCE,
  PaymentAppVoidUpdate.JSON_PROPERTY_TARGET_STATE,
  PaymentAppVoidUpdate.JSON_PROPERTY_FAILURE_REASON
})

public class PaymentAppVoidUpdate {
  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_TARGET_STATE = "targetState";
  private PaymentAppVoidTargetState targetState;

  public static final String JSON_PROPERTY_FAILURE_REASON = "failureReason";
  private Long failureReason;

  public PaymentAppVoidUpdate() {
  }

  public PaymentAppVoidUpdate reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * A unique identifier for the void within the systems of the external service provider. This field is mandatory when the target state is set to &#39;SUCCESSFUL&#39;.
   * @return reference
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }

  public PaymentAppVoidUpdate targetState(PaymentAppVoidTargetState targetState) {
    
    this.targetState = targetState;
    return this;
  }

   /**
   * Get targetState
   * @return targetState
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentAppVoidTargetState getTargetState() {
    return targetState;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetState(PaymentAppVoidTargetState targetState) {
    this.targetState = targetState;
  }

  public PaymentAppVoidUpdate failureReason(Long failureReason) {
    
    this.failureReason = failureReason;
    return this;
  }

   /**
   * The reason for the void&#39;s failure. This field is mandatory when the target state is set to &#39;FAILED&#39;.
   * @return failureReason
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILURE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFailureReason() {
    return failureReason;
  }


  @JsonProperty(JSON_PROPERTY_FAILURE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailureReason(Long failureReason) {
    this.failureReason = failureReason;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAppVoidUpdate paymentAppVoidUpdate = (PaymentAppVoidUpdate) o;
    return Objects.equals(this.reference, paymentAppVoidUpdate.reference) &&
        Objects.equals(this.targetState, paymentAppVoidUpdate.targetState) &&
        Objects.equals(this.failureReason, paymentAppVoidUpdate.failureReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, targetState, failureReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAppVoidUpdate {\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    targetState: ").append(toIndentedString(targetState)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
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

    // add `reference` to the URL query string
    if (getReference() != null) {
      try {
        joiner.add(String.format("%sreference%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReference()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `targetState` to the URL query string
    if (getTargetState() != null) {
      try {
        joiner.add(String.format("%stargetState%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTargetState()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `failureReason` to the URL query string
    if (getFailureReason() != null) {
      try {
        joiner.add(String.format("%sfailureReason%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFailureReason()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

