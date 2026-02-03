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
import com.wallee.sdk.model.ExpressCheckoutSessionState;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * ExpressCheckoutApprovalResponse
 */
@JsonPropertyOrder({
  ExpressCheckoutApprovalResponse.JSON_PROPERTY_MERCHANT_REDIRECT_URL,
  ExpressCheckoutApprovalResponse.JSON_PROPERTY_SESSION_ID,
  ExpressCheckoutApprovalResponse.JSON_PROPERTY_STATE
})

public class ExpressCheckoutApprovalResponse {
  public static final String JSON_PROPERTY_MERCHANT_REDIRECT_URL = "merchantRedirectUrl";
  @javax.annotation.Nullable
  private String merchantRedirectUrl;

  public static final String JSON_PROPERTY_SESSION_ID = "sessionId";
  @javax.annotation.Nullable
  private Long sessionId;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private ExpressCheckoutSessionState state;

  public ExpressCheckoutApprovalResponse() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public ExpressCheckoutApprovalResponse(
    @JsonProperty(JSON_PROPERTY_MERCHANT_REDIRECT_URL) String merchantRedirectUrl, 
    @JsonProperty(JSON_PROPERTY_SESSION_ID) Long sessionId
  ) {
    this();
    this.merchantRedirectUrl = merchantRedirectUrl;
    this.sessionId = sessionId;
  }

  /**
   * Get merchantRedirectUrl
   * @return merchantRedirectUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MERCHANT_REDIRECT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantRedirectUrl() {
    return merchantRedirectUrl;
  }



  /**
   * Get sessionId
   * @return sessionId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSessionId() {
    return sessionId;
  }



  public ExpressCheckoutApprovalResponse state(@javax.annotation.Nullable ExpressCheckoutSessionState state) {
    
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExpressCheckoutSessionState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable ExpressCheckoutSessionState state) {
    this.state = state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpressCheckoutApprovalResponse expressCheckoutApprovalResponse = (ExpressCheckoutApprovalResponse) o;
    return Objects.equals(this.merchantRedirectUrl, expressCheckoutApprovalResponse.merchantRedirectUrl) &&
        Objects.equals(this.sessionId, expressCheckoutApprovalResponse.sessionId) &&
        Objects.equals(this.state, expressCheckoutApprovalResponse.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantRedirectUrl, sessionId, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpressCheckoutApprovalResponse {\n");
    sb.append("    merchantRedirectUrl: ").append(toIndentedString(merchantRedirectUrl)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

    // add `merchantRedirectUrl` to the URL query string
    if (getMerchantRedirectUrl() != null) {
      try {
        joiner.add(String.format("%smerchantRedirectUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMerchantRedirectUrl()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `state` to the URL query string
    if (getState() != null) {
      try {
        joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

