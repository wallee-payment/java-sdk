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
 * ExpressCheckoutCreateResponse
 */
@JsonPropertyOrder({
  ExpressCheckoutCreateResponse.JSON_PROPERTY_IFRAME_SRC,
  ExpressCheckoutCreateResponse.JSON_PROPERTY_SESSION
})

public class ExpressCheckoutCreateResponse {
  public static final String JSON_PROPERTY_IFRAME_SRC = "iframeSrc";
  private String iframeSrc;

  public static final String JSON_PROPERTY_SESSION = "session";
  private Long session;

  public ExpressCheckoutCreateResponse() {
  }

  public ExpressCheckoutCreateResponse iframeSrc(String iframeSrc) {
    
    this.iframeSrc = iframeSrc;
    return this;
  }

   /**
   * Get iframeSrc
   * @return iframeSrc
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IFRAME_SRC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIframeSrc() {
    return iframeSrc;
  }


  @JsonProperty(JSON_PROPERTY_IFRAME_SRC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIframeSrc(String iframeSrc) {
    this.iframeSrc = iframeSrc;
  }

  public ExpressCheckoutCreateResponse session(Long session) {
    
    this.session = session;
    return this;
  }

   /**
   * Get session
   * @return session
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSession() {
    return session;
  }


  @JsonProperty(JSON_PROPERTY_SESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSession(Long session) {
    this.session = session;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpressCheckoutCreateResponse expressCheckoutCreateResponse = (ExpressCheckoutCreateResponse) o;
    return Objects.equals(this.iframeSrc, expressCheckoutCreateResponse.iframeSrc) &&
        Objects.equals(this.session, expressCheckoutCreateResponse.session);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iframeSrc, session);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpressCheckoutCreateResponse {\n");
    sb.append("    iframeSrc: ").append(toIndentedString(iframeSrc)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
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

    // add `iframeSrc` to the URL query string
    if (getIframeSrc() != null) {
      try {
        joiner.add(String.format("%siframeSrc%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIframeSrc()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `session` to the URL query string
    if (getSession() != null) {
      try {
        joiner.add(String.format("%ssession%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSession()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

