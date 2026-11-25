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
 * PaymentTerminalUpdateRequest
 */
@JsonPropertyOrder({
  PaymentTerminalUpdateRequest.JSON_PROPERTY_CONFIGURATION,
  PaymentTerminalUpdateRequest.JSON_PROPERTY_NAME,
  PaymentTerminalUpdateRequest.JSON_PROPERTY_VERSION
})

public class PaymentTerminalUpdateRequest {
  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  @javax.annotation.Nullable
  private Long _configuration;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public PaymentTerminalUpdateRequest() {
  }

  public PaymentTerminalUpdateRequest _configuration(@javax.annotation.Nullable Long _configuration) {
    
    this._configuration = _configuration;
    return this;
  }

  /**
   * The configuration that is assigned to the terminal and determines how it works.
   * @return _configuration
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getConfiguration() {
    return _configuration;
  }


  @JsonProperty(JSON_PROPERTY_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfiguration(@javax.annotation.Nullable Long _configuration) {
    this._configuration = _configuration;
  }

  public PaymentTerminalUpdateRequest name(@javax.annotation.Nullable String name) {
    
    this.name = name;
    return this;
  }

  /**
   * The name used to identify the payment terminal.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }

  public PaymentTerminalUpdateRequest version(@javax.annotation.Nullable Integer version) {
    
    this.version = version;
    return this;
  }

  /**
   * The version is used for optimistic locking and incremented whenever the payment terminal is updated.
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(@javax.annotation.Nullable Integer version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTerminalUpdateRequest paymentTerminalUpdateRequest = (PaymentTerminalUpdateRequest) o;
    return Objects.equals(this._configuration, paymentTerminalUpdateRequest._configuration) &&
        Objects.equals(this.name, paymentTerminalUpdateRequest.name) &&
        Objects.equals(this.version, paymentTerminalUpdateRequest.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_configuration, name, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTerminalUpdateRequest {\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

    // add `configuration` to the URL query string
    if (getConfiguration() != null) {
      try {
        joiner.add(String.format("%sconfiguration%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConfiguration()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

