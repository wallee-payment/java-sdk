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
import com.wallee.sdk.model.PaymentAppChargeAttemptTargetState;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * A request to update the state of a charge attempt. The charge attempt must be associated with a processor created by the invoking payment web app.
 */
@JsonPropertyOrder({
  PaymentAppChargeAttemptUpdate.JSON_PROPERTY_REFERENCE,
  PaymentAppChargeAttemptUpdate.JSON_PROPERTY_TARGET_STATE,
  PaymentAppChargeAttemptUpdate.JSON_PROPERTY_FAILURE_REASON,
  PaymentAppChargeAttemptUpdate.JSON_PROPERTY_END_USER_FAILURE_MESSAGE
})

public class PaymentAppChargeAttemptUpdate {
  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_TARGET_STATE = "targetState";
  private PaymentAppChargeAttemptTargetState targetState;

  public static final String JSON_PROPERTY_FAILURE_REASON = "failureReason";
  private Long failureReason;

  public static final String JSON_PROPERTY_END_USER_FAILURE_MESSAGE = "endUserFailureMessage";
  private String endUserFailureMessage;

  public PaymentAppChargeAttemptUpdate() {
  }

  public PaymentAppChargeAttemptUpdate reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * A unique identifier for the charge attempt within the systems of the external service provider. This field is mandatory when the target state is set to &#39;SUCCESSFUL&#39;.
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

  public PaymentAppChargeAttemptUpdate targetState(PaymentAppChargeAttemptTargetState targetState) {
    
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

  public PaymentAppChargeAttemptTargetState getTargetState() {
    return targetState;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetState(PaymentAppChargeAttemptTargetState targetState) {
    this.targetState = targetState;
  }

  public PaymentAppChargeAttemptUpdate failureReason(Long failureReason) {
    
    this.failureReason = failureReason;
    return this;
  }

   /**
   * The reason for the charge attempt&#39;s failure. This field is mandatory when the target state is set to &#39;FAILED&#39;.
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

  public PaymentAppChargeAttemptUpdate endUserFailureMessage(String endUserFailureMessage) {
    
    this.endUserFailureMessage = endUserFailureMessage;
    return this;
  }

   /**
   * A message explaining to the buyer why the payment failed. The message must be localized in the buyer&#39;s language, as specified in the payment page invocation URL.
   * @return endUserFailureMessage
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_USER_FAILURE_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndUserFailureMessage() {
    return endUserFailureMessage;
  }


  @JsonProperty(JSON_PROPERTY_END_USER_FAILURE_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndUserFailureMessage(String endUserFailureMessage) {
    this.endUserFailureMessage = endUserFailureMessage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAppChargeAttemptUpdate paymentAppChargeAttemptUpdate = (PaymentAppChargeAttemptUpdate) o;
    return Objects.equals(this.reference, paymentAppChargeAttemptUpdate.reference) &&
        Objects.equals(this.targetState, paymentAppChargeAttemptUpdate.targetState) &&
        Objects.equals(this.failureReason, paymentAppChargeAttemptUpdate.failureReason) &&
        Objects.equals(this.endUserFailureMessage, paymentAppChargeAttemptUpdate.endUserFailureMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reference, targetState, failureReason, endUserFailureMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAppChargeAttemptUpdate {\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    targetState: ").append(toIndentedString(targetState)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    endUserFailureMessage: ").append(toIndentedString(endUserFailureMessage)).append("\n");
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

    // add `endUserFailureMessage` to the URL query string
    if (getEndUserFailureMessage() != null) {
      try {
        joiner.add(String.format("%sendUserFailureMessage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEndUserFailureMessage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

