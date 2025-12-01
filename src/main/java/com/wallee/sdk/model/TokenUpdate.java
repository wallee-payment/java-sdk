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
 * TokenUpdate
 */
@JsonPropertyOrder({
  TokenUpdate.JSON_PROPERTY_ENABLED_FOR_ONE_CLICK_PAYMENT,
  TokenUpdate.JSON_PROPERTY_CUSTOMER_EMAIL_ADDRESS,
  TokenUpdate.JSON_PROPERTY_TOKEN_REFERENCE,
  TokenUpdate.JSON_PROPERTY_CUSTOMER_ID,
  TokenUpdate.JSON_PROPERTY_TIME_ZONE,
  TokenUpdate.JSON_PROPERTY_LANGUAGE,
  TokenUpdate.JSON_PROPERTY_VERSION
})
@JsonTypeName("Token.Update")

public class TokenUpdate {
  public static final String JSON_PROPERTY_ENABLED_FOR_ONE_CLICK_PAYMENT = "enabledForOneClickPayment";
  @javax.annotation.Nullable
  private Boolean enabledForOneClickPayment;

  public static final String JSON_PROPERTY_CUSTOMER_EMAIL_ADDRESS = "customerEmailAddress";
  @javax.annotation.Nullable
  private String customerEmailAddress;

  public static final String JSON_PROPERTY_TOKEN_REFERENCE = "tokenReference";
  @javax.annotation.Nullable
  private String tokenReference;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @javax.annotation.Nullable
  private String customerId;

  public static final String JSON_PROPERTY_TIME_ZONE = "timeZone";
  @javax.annotation.Nullable
  private String timeZone;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  @javax.annotation.Nullable
  private String language;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nonnull
  private Integer version;

  public TokenUpdate() {
  }

  public TokenUpdate enabledForOneClickPayment(@javax.annotation.Nullable Boolean enabledForOneClickPayment) {
    
    this.enabledForOneClickPayment = enabledForOneClickPayment;
    return this;
  }

  /**
   * Whether the token is enabled for one-click payments, which simplify the payment process for the customer. One-click tokens are linked to customers via the customer ID.
   * @return enabledForOneClickPayment
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED_FOR_ONE_CLICK_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabledForOneClickPayment() {
    return enabledForOneClickPayment;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED_FOR_ONE_CLICK_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabledForOneClickPayment(@javax.annotation.Nullable Boolean enabledForOneClickPayment) {
    this.enabledForOneClickPayment = enabledForOneClickPayment;
  }

  public TokenUpdate customerEmailAddress(@javax.annotation.Nullable String customerEmailAddress) {
    
    this.customerEmailAddress = customerEmailAddress;
    return this;
  }

  /**
   * The customer&#39;s email address.
   * @return customerEmailAddress
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerEmailAddress() {
    return customerEmailAddress;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerEmailAddress(@javax.annotation.Nullable String customerEmailAddress) {
    this.customerEmailAddress = customerEmailAddress;
  }

  public TokenUpdate tokenReference(@javax.annotation.Nullable String tokenReference) {
    
    this.tokenReference = tokenReference;
    return this;
  }

  /**
   * The reference used to identify the payment token (e.g. the customer&#39;s ID or email address).
   * @return tokenReference
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTokenReference() {
    return tokenReference;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTokenReference(@javax.annotation.Nullable String tokenReference) {
    this.tokenReference = tokenReference;
  }

  public TokenUpdate customerId(@javax.annotation.Nullable String customerId) {
    
    this.customerId = customerId;
    return this;
  }

  /**
   * The unique identifier of the customer in the external system.
   * @return customerId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerId() {
    return customerId;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerId(@javax.annotation.Nullable String customerId) {
    this.customerId = customerId;
  }

  public TokenUpdate timeZone(@javax.annotation.Nullable String timeZone) {
    
    this.timeZone = timeZone;
    return this;
  }

  /**
   * The customer&#39;s time zone, which affects how dates and times are formatted when communicating with the customer.
   * @return timeZone
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeZone() {
    return timeZone;
  }


  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeZone(@javax.annotation.Nullable String timeZone) {
    this.timeZone = timeZone;
  }

  public TokenUpdate language(@javax.annotation.Nullable String language) {
    
    this.language = language;
    return this;
  }

  /**
   * The language that is linked to the object.
   * @return language
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(@javax.annotation.Nullable String language) {
    this.language = language;
  }

  public TokenUpdate version(@javax.annotation.Nonnull Integer version) {
    
    this.version = version;
    return this;
  }

  /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersion(@javax.annotation.Nonnull Integer version) {
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
    TokenUpdate tokenUpdate = (TokenUpdate) o;
    return Objects.equals(this.enabledForOneClickPayment, tokenUpdate.enabledForOneClickPayment) &&
        Objects.equals(this.customerEmailAddress, tokenUpdate.customerEmailAddress) &&
        Objects.equals(this.tokenReference, tokenUpdate.tokenReference) &&
        Objects.equals(this.customerId, tokenUpdate.customerId) &&
        Objects.equals(this.timeZone, tokenUpdate.timeZone) &&
        Objects.equals(this.language, tokenUpdate.language) &&
        Objects.equals(this.version, tokenUpdate.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabledForOneClickPayment, customerEmailAddress, tokenReference, customerId, timeZone, language, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenUpdate {\n");
    sb.append("    enabledForOneClickPayment: ").append(toIndentedString(enabledForOneClickPayment)).append("\n");
    sb.append("    customerEmailAddress: ").append(toIndentedString(customerEmailAddress)).append("\n");
    sb.append("    tokenReference: ").append(toIndentedString(tokenReference)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

    // add `enabledForOneClickPayment` to the URL query string
    if (getEnabledForOneClickPayment() != null) {
      try {
        joiner.add(String.format("%senabledForOneClickPayment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnabledForOneClickPayment()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `customerEmailAddress` to the URL query string
    if (getCustomerEmailAddress() != null) {
      try {
        joiner.add(String.format("%scustomerEmailAddress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustomerEmailAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `tokenReference` to the URL query string
    if (getTokenReference() != null) {
      try {
        joiner.add(String.format("%stokenReference%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTokenReference()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `customerId` to the URL query string
    if (getCustomerId() != null) {
      try {
        joiner.add(String.format("%scustomerId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustomerId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `timeZone` to the URL query string
    if (getTimeZone() != null) {
      try {
        joiner.add(String.format("%stimeZone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimeZone()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `language` to the URL query string
    if (getLanguage() != null) {
      try {
        joiner.add(String.format("%slanguage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLanguage()), "UTF-8").replaceAll("\\+", "%20")));
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

