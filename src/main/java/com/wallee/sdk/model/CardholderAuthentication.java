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
import com.wallee.sdk.model.CardAuthenticationResponse;
import com.wallee.sdk.model.CardAuthenticationVersion;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * CardholderAuthentication
 */
@JsonPropertyOrder({
  CardholderAuthentication.JSON_PROPERTY_AUTHENTICATION_IDENTIFIER,
  CardholderAuthentication.JSON_PROPERTY_AUTHENTICATION_RESPONSE,
  CardholderAuthentication.JSON_PROPERTY_ELECTRONIC_COMMERCE_INDICATOR,
  CardholderAuthentication.JSON_PROPERTY_AUTHENTICATION_VALUE,
  CardholderAuthentication.JSON_PROPERTY_VERSION
})

public class CardholderAuthentication {
  public static final String JSON_PROPERTY_AUTHENTICATION_IDENTIFIER = "authenticationIdentifier";
  @javax.annotation.Nullable
  private String authenticationIdentifier;

  public static final String JSON_PROPERTY_AUTHENTICATION_RESPONSE = "authenticationResponse";
  @javax.annotation.Nullable
  private CardAuthenticationResponse authenticationResponse;

  public static final String JSON_PROPERTY_ELECTRONIC_COMMERCE_INDICATOR = "electronicCommerceIndicator";
  @javax.annotation.Nullable
  private String electronicCommerceIndicator;

  public static final String JSON_PROPERTY_AUTHENTICATION_VALUE = "authenticationValue";
  @javax.annotation.Nullable
  private String authenticationValue;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private CardAuthenticationVersion version;

  public CardholderAuthentication() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public CardholderAuthentication(
    @JsonProperty(JSON_PROPERTY_AUTHENTICATION_IDENTIFIER) String authenticationIdentifier, 
    @JsonProperty(JSON_PROPERTY_ELECTRONIC_COMMERCE_INDICATOR) String electronicCommerceIndicator, 
    @JsonProperty(JSON_PROPERTY_AUTHENTICATION_VALUE) String authenticationValue
  ) {
    this();
    this.authenticationIdentifier = authenticationIdentifier;
    this.electronicCommerceIndicator = electronicCommerceIndicator;
    this.authenticationValue = authenticationValue;
  }

  /**
   * The identifier (e.g., XID or DSTransactionID) assigned by the authentication system for tracking and verification.
   * @return authenticationIdentifier
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthenticationIdentifier() {
    return authenticationIdentifier;
  }



  public CardholderAuthentication authenticationResponse(@javax.annotation.Nullable CardAuthenticationResponse authenticationResponse) {
    
    this.authenticationResponse = authenticationResponse;
    return this;
  }

  /**
   * Get authenticationResponse
   * @return authenticationResponse
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CardAuthenticationResponse getAuthenticationResponse() {
    return authenticationResponse;
  }


  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthenticationResponse(@javax.annotation.Nullable CardAuthenticationResponse authenticationResponse) {
    this.authenticationResponse = authenticationResponse;
  }

  /**
   * The Electronic Commerce Indicator (ECI) represents the authentication level and indicates liability shift during online or card-not-present transactions.
   * @return electronicCommerceIndicator
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELECTRONIC_COMMERCE_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getElectronicCommerceIndicator() {
    return electronicCommerceIndicator;
  }



  /**
   * The cryptographic token (CAVV/AAV) generated during the authentication process to validate the cardholder&#39;s identity.
   * @return authenticationValue
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthenticationValue() {
    return authenticationValue;
  }



  public CardholderAuthentication version(@javax.annotation.Nullable CardAuthenticationVersion version) {
    
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CardAuthenticationVersion getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(@javax.annotation.Nullable CardAuthenticationVersion version) {
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
    CardholderAuthentication cardholderAuthentication = (CardholderAuthentication) o;
    return Objects.equals(this.authenticationIdentifier, cardholderAuthentication.authenticationIdentifier) &&
        Objects.equals(this.authenticationResponse, cardholderAuthentication.authenticationResponse) &&
        Objects.equals(this.electronicCommerceIndicator, cardholderAuthentication.electronicCommerceIndicator) &&
        Objects.equals(this.authenticationValue, cardholderAuthentication.authenticationValue) &&
        Objects.equals(this.version, cardholderAuthentication.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationIdentifier, authenticationResponse, electronicCommerceIndicator, authenticationValue, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardholderAuthentication {\n");
    sb.append("    authenticationIdentifier: ").append(toIndentedString(authenticationIdentifier)).append("\n");
    sb.append("    authenticationResponse: ").append(toIndentedString(authenticationResponse)).append("\n");
    sb.append("    electronicCommerceIndicator: ").append(toIndentedString(electronicCommerceIndicator)).append("\n");
    sb.append("    authenticationValue: ").append(toIndentedString(authenticationValue)).append("\n");
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

    // add `authenticationIdentifier` to the URL query string
    if (getAuthenticationIdentifier() != null) {
      try {
        joiner.add(String.format("%sauthenticationIdentifier%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthenticationIdentifier()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `authenticationResponse` to the URL query string
    if (getAuthenticationResponse() != null) {
      try {
        joiner.add(String.format("%sauthenticationResponse%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthenticationResponse()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `electronicCommerceIndicator` to the URL query string
    if (getElectronicCommerceIndicator() != null) {
      try {
        joiner.add(String.format("%selectronicCommerceIndicator%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getElectronicCommerceIndicator()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `authenticationValue` to the URL query string
    if (getAuthenticationValue() != null) {
      try {
        joiner.add(String.format("%sauthenticationValue%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAuthenticationValue()), "UTF-8").replaceAll("\\+", "%20")));
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

