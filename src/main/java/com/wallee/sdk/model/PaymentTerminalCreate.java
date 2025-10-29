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
 * PaymentTerminalCreate
 */
@JsonPropertyOrder({
  PaymentTerminalCreate.JSON_PROPERTY_NAME,
  PaymentTerminalCreate.JSON_PROPERTY_IDENTIFIER,
  PaymentTerminalCreate.JSON_PROPERTY_CONFIGURATION_VERSION,
  PaymentTerminalCreate.JSON_PROPERTY_LOCATION_VERSION,
  PaymentTerminalCreate.JSON_PROPERTY_EXTERNAL_ID,
  PaymentTerminalCreate.JSON_PROPERTY_TYPE
})
@JsonTypeName("PaymentTerminal.Create")

public class PaymentTerminalCreate {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_IDENTIFIER = "identifier";
  private String identifier;

  public static final String JSON_PROPERTY_CONFIGURATION_VERSION = "configurationVersion";
  private Long configurationVersion;

  public static final String JSON_PROPERTY_LOCATION_VERSION = "locationVersion";
  private Long locationVersion;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private Long type;

  public PaymentTerminalCreate() {
  }

  public PaymentTerminalCreate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name used to identify the payment terminal.
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }

  public PaymentTerminalCreate identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * The unique identifier of the terminal, that is displayed on the device.
   * @return identifier
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdentifier() {
    return identifier;
  }


  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public PaymentTerminalCreate configurationVersion(Long configurationVersion) {
    
    this.configurationVersion = configurationVersion;
    return this;
  }

   /**
   * The configuration that is assigned to the terminal and determines how it works.
   * @return configurationVersion
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIGURATION_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getConfigurationVersion() {
    return configurationVersion;
  }


  @JsonProperty(JSON_PROPERTY_CONFIGURATION_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfigurationVersion(Long configurationVersion) {
    this.configurationVersion = configurationVersion;
  }

  public PaymentTerminalCreate locationVersion(Long locationVersion) {
    
    this.locationVersion = locationVersion;
    return this;
  }

   /**
   * The physical location where the terminal is used.
   * @return locationVersion
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLocationVersion() {
    return locationVersion;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocationVersion(Long locationVersion) {
    this.locationVersion = locationVersion;
  }

  public PaymentTerminalCreate externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.
   * @return externalId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExternalId() {
    return externalId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public PaymentTerminalCreate type(Long type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the payment terminal.
   * @return type
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(Long type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTerminalCreate paymentTerminalCreate = (PaymentTerminalCreate) o;
    return Objects.equals(this.name, paymentTerminalCreate.name) &&
        Objects.equals(this.identifier, paymentTerminalCreate.identifier) &&
        Objects.equals(this.configurationVersion, paymentTerminalCreate.configurationVersion) &&
        Objects.equals(this.locationVersion, paymentTerminalCreate.locationVersion) &&
        Objects.equals(this.externalId, paymentTerminalCreate.externalId) &&
        Objects.equals(this.type, paymentTerminalCreate.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, identifier, configurationVersion, locationVersion, externalId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTerminalCreate {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    configurationVersion: ").append(toIndentedString(configurationVersion)).append("\n");
    sb.append("    locationVersion: ").append(toIndentedString(locationVersion)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `identifier` to the URL query string
    if (getIdentifier() != null) {
      try {
        joiner.add(String.format("%sidentifier%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIdentifier()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `configurationVersion` to the URL query string
    if (getConfigurationVersion() != null) {
      try {
        joiner.add(String.format("%sconfigurationVersion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConfigurationVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `locationVersion` to the URL query string
    if (getLocationVersion() != null) {
      try {
        joiner.add(String.format("%slocationVersion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLocationVersion()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

