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
 * ExpressCheckoutSessionProcessRequest
 */
@JsonPropertyOrder({
  ExpressCheckoutSessionProcessRequest.JSON_PROPERTY_SUCCESS_URL,
  ExpressCheckoutSessionProcessRequest.JSON_PROPERTY_SESSION_ID,
  ExpressCheckoutSessionProcessRequest.JSON_PROPERTY_MERCHANT_REFERENCE,
  ExpressCheckoutSessionProcessRequest.JSON_PROPERTY_FAILURE_URL
})

public class ExpressCheckoutSessionProcessRequest {
  public static final String JSON_PROPERTY_SUCCESS_URL = "successUrl";
  @javax.annotation.Nonnull
  private String successUrl;

  public static final String JSON_PROPERTY_SESSION_ID = "sessionId";
  @javax.annotation.Nonnull
  private Long sessionId;

  public static final String JSON_PROPERTY_MERCHANT_REFERENCE = "merchantReference";
  @javax.annotation.Nonnull
  private String merchantReference;

  public static final String JSON_PROPERTY_FAILURE_URL = "failureUrl";
  @javax.annotation.Nonnull
  private String failureUrl;

  public ExpressCheckoutSessionProcessRequest() {
  }

  public ExpressCheckoutSessionProcessRequest successUrl(@javax.annotation.Nonnull String successUrl) {
    
    this.successUrl = successUrl;
    return this;
  }

  /**
   * Mandatory URL to redirect the customer to after a successful payment for Express Checkout.
   * @return successUrl
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUCCESS_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSuccessUrl() {
    return successUrl;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSuccessUrl(@javax.annotation.Nonnull String successUrl) {
    this.successUrl = successUrl;
  }

  public ExpressCheckoutSessionProcessRequest sessionId(@javax.annotation.Nonnull Long sessionId) {
    
    this.sessionId = sessionId;
    return this;
  }

  /**
   * The Express Checkout session identifier returned by create-session.
   * @return sessionId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getSessionId() {
    return sessionId;
  }


  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSessionId(@javax.annotation.Nonnull Long sessionId) {
    this.sessionId = sessionId;
  }

  public ExpressCheckoutSessionProcessRequest merchantReference(@javax.annotation.Nonnull String merchantReference) {
    
    this.merchantReference = merchantReference;
    return this;
  }

  /**
   * Mandatory merchant order identifier used as merchantReference on the created transaction.
   * @return merchantReference
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMerchantReference() {
    return merchantReference;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMerchantReference(@javax.annotation.Nonnull String merchantReference) {
    this.merchantReference = merchantReference;
  }

  public ExpressCheckoutSessionProcessRequest failureUrl(@javax.annotation.Nonnull String failureUrl) {
    
    this.failureUrl = failureUrl;
    return this;
  }

  /**
   * Mandatory URL to redirect the customer to after a failed payment for Express Checkout.
   * @return failureUrl
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FAILURE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFailureUrl() {
    return failureUrl;
  }


  @JsonProperty(JSON_PROPERTY_FAILURE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFailureUrl(@javax.annotation.Nonnull String failureUrl) {
    this.failureUrl = failureUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpressCheckoutSessionProcessRequest expressCheckoutSessionProcessRequest = (ExpressCheckoutSessionProcessRequest) o;
    return Objects.equals(this.successUrl, expressCheckoutSessionProcessRequest.successUrl) &&
        Objects.equals(this.sessionId, expressCheckoutSessionProcessRequest.sessionId) &&
        Objects.equals(this.merchantReference, expressCheckoutSessionProcessRequest.merchantReference) &&
        Objects.equals(this.failureUrl, expressCheckoutSessionProcessRequest.failureUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successUrl, sessionId, merchantReference, failureUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpressCheckoutSessionProcessRequest {\n");
    sb.append("    successUrl: ").append(toIndentedString(successUrl)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
    sb.append("    failureUrl: ").append(toIndentedString(failureUrl)).append("\n");
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

    // add `successUrl` to the URL query string
    if (getSuccessUrl() != null) {
      try {
        joiner.add(String.format("%ssuccessUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSuccessUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sessionId` to the URL query string
    if (getSessionId() != null) {
      try {
        joiner.add(String.format("%ssessionId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSessionId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `merchantReference` to the URL query string
    if (getMerchantReference() != null) {
      try {
        joiner.add(String.format("%smerchantReference%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMerchantReference()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `failureUrl` to the URL query string
    if (getFailureUrl() != null) {
      try {
        joiner.add(String.format("%sfailureUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFailureUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

