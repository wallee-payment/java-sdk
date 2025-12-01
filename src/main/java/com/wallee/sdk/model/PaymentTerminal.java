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
import com.wallee.sdk.model.PaymentTerminalConfigurationVersion;
import com.wallee.sdk.model.PaymentTerminalLocationVersion;
import com.wallee.sdk.model.PaymentTerminalState;
import com.wallee.sdk.model.PaymentTerminalType;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * PaymentTerminal
 */
@JsonPropertyOrder({
  PaymentTerminal.JSON_PROPERTY_IDENTIFIER,
  PaymentTerminal.JSON_PROPERTY_PLANNED_PURGE_DATE,
  PaymentTerminal.JSON_PROPERTY_EXTERNAL_ID,
  PaymentTerminal.JSON_PROPERTY_TYPE,
  PaymentTerminal.JSON_PROPERTY_DEVICE_NAME,
  PaymentTerminal.JSON_PROPERTY_VERSION,
  PaymentTerminal.JSON_PROPERTY_DEVICE_SERIAL_NUMBER,
  PaymentTerminal.JSON_PROPERTY_LINKED_SPACE_ID,
  PaymentTerminal.JSON_PROPERTY_CONFIGURATION_VERSION,
  PaymentTerminal.JSON_PROPERTY_LOCATION_VERSION,
  PaymentTerminal.JSON_PROPERTY_DEFAULT_CURRENCY,
  PaymentTerminal.JSON_PROPERTY_NAME,
  PaymentTerminal.JSON_PROPERTY_ID,
  PaymentTerminal.JSON_PROPERTY_STATE
})

public class PaymentTerminal {
  public static final String JSON_PROPERTY_IDENTIFIER = "identifier";
  @javax.annotation.Nullable
  private String identifier;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  @javax.annotation.Nullable
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  @javax.annotation.Nullable
  private String externalId;

  public static final String JSON_PROPERTY_TYPE = "type";
  @javax.annotation.Nullable
  private PaymentTerminalType type;

  public static final String JSON_PROPERTY_DEVICE_NAME = "deviceName";
  @javax.annotation.Nullable
  private String deviceName;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_DEVICE_SERIAL_NUMBER = "deviceSerialNumber";
  @javax.annotation.Nullable
  private String deviceSerialNumber;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_CONFIGURATION_VERSION = "configurationVersion";
  @javax.annotation.Nullable
  private PaymentTerminalConfigurationVersion configurationVersion;

  public static final String JSON_PROPERTY_LOCATION_VERSION = "locationVersion";
  @javax.annotation.Nullable
  private PaymentTerminalLocationVersion locationVersion;

  public static final String JSON_PROPERTY_DEFAULT_CURRENCY = "defaultCurrency";
  @javax.annotation.Nullable
  private String defaultCurrency;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private PaymentTerminalState state;

  public PaymentTerminal() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public PaymentTerminal(
    @JsonProperty(JSON_PROPERTY_IDENTIFIER) String identifier, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_EXTERNAL_ID) String externalId, 
    @JsonProperty(JSON_PROPERTY_DEVICE_NAME) String deviceName, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_DEVICE_SERIAL_NUMBER) String deviceSerialNumber, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_DEFAULT_CURRENCY) String defaultCurrency, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_ID) Long id
  ) {
    this();
    this.identifier = identifier;
    this.plannedPurgeDate = plannedPurgeDate;
    this.externalId = externalId;
    this.deviceName = deviceName;
    this.version = version;
    this.deviceSerialNumber = deviceSerialNumber;
    this.linkedSpaceId = linkedSpaceId;
    this.defaultCurrency = defaultCurrency;
    this.name = name;
    this.id = id;
  }

  /**
   * The unique identifier of the terminal, that is displayed on the device.
   * @return identifier
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdentifier() {
    return identifier;
  }



  /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }



  /**
   * A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.
   * @return externalId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalId() {
    return externalId;
  }



  public PaymentTerminal type(@javax.annotation.Nullable PaymentTerminalType type) {
    
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentTerminalType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(@javax.annotation.Nullable PaymentTerminalType type) {
    this.type = type;
  }

  /**
   * The name of the device that is currently linked to the payment terminal.
   * @return deviceName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeviceName() {
    return deviceName;
  }



  /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }



  /**
   * The serial number of the device that is currently linked to the payment terminal.
   * @return deviceSerialNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEVICE_SERIAL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeviceSerialNumber() {
    return deviceSerialNumber;
  }



  /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }



  public PaymentTerminal configurationVersion(@javax.annotation.Nullable PaymentTerminalConfigurationVersion configurationVersion) {
    
    this.configurationVersion = configurationVersion;
    return this;
  }

  /**
   * Get configurationVersion
   * @return configurationVersion
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIGURATION_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentTerminalConfigurationVersion getConfigurationVersion() {
    return configurationVersion;
  }


  @JsonProperty(JSON_PROPERTY_CONFIGURATION_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfigurationVersion(@javax.annotation.Nullable PaymentTerminalConfigurationVersion configurationVersion) {
    this.configurationVersion = configurationVersion;
  }

  public PaymentTerminal locationVersion(@javax.annotation.Nullable PaymentTerminalLocationVersion locationVersion) {
    
    this.locationVersion = locationVersion;
    return this;
  }

  /**
   * Get locationVersion
   * @return locationVersion
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentTerminalLocationVersion getLocationVersion() {
    return locationVersion;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocationVersion(@javax.annotation.Nullable PaymentTerminalLocationVersion locationVersion) {
    this.locationVersion = locationVersion;
  }

  /**
   * The default currency of the terminal.
   * @return defaultCurrency
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultCurrency() {
    return defaultCurrency;
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



  /**
   * A unique identifier for the object.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }



  public PaymentTerminal state(@javax.annotation.Nullable PaymentTerminalState state) {
    
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

  public PaymentTerminalState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable PaymentTerminalState state) {
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
    PaymentTerminal paymentTerminal = (PaymentTerminal) o;
    return Objects.equals(this.identifier, paymentTerminal.identifier) &&
        Objects.equals(this.plannedPurgeDate, paymentTerminal.plannedPurgeDate) &&
        Objects.equals(this.externalId, paymentTerminal.externalId) &&
        Objects.equals(this.type, paymentTerminal.type) &&
        Objects.equals(this.deviceName, paymentTerminal.deviceName) &&
        Objects.equals(this.version, paymentTerminal.version) &&
        Objects.equals(this.deviceSerialNumber, paymentTerminal.deviceSerialNumber) &&
        Objects.equals(this.linkedSpaceId, paymentTerminal.linkedSpaceId) &&
        Objects.equals(this.configurationVersion, paymentTerminal.configurationVersion) &&
        Objects.equals(this.locationVersion, paymentTerminal.locationVersion) &&
        Objects.equals(this.defaultCurrency, paymentTerminal.defaultCurrency) &&
        Objects.equals(this.name, paymentTerminal.name) &&
        Objects.equals(this.id, paymentTerminal.id) &&
        Objects.equals(this.state, paymentTerminal.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, plannedPurgeDate, externalId, type, deviceName, version, deviceSerialNumber, linkedSpaceId, configurationVersion, locationVersion, defaultCurrency, name, id, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTerminal {\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    deviceSerialNumber: ").append(toIndentedString(deviceSerialNumber)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    configurationVersion: ").append(toIndentedString(configurationVersion)).append("\n");
    sb.append("    locationVersion: ").append(toIndentedString(locationVersion)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

    // add `identifier` to the URL query string
    if (getIdentifier() != null) {
      try {
        joiner.add(String.format("%sidentifier%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIdentifier()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `plannedPurgeDate` to the URL query string
    if (getPlannedPurgeDate() != null) {
      try {
        joiner.add(String.format("%splannedPurgeDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlannedPurgeDate()), "UTF-8").replaceAll("\\+", "%20")));
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
      joiner.add(getType().toUrlQueryString(prefix + "type" + suffix));
    }

    // add `deviceName` to the URL query string
    if (getDeviceName() != null) {
      try {
        joiner.add(String.format("%sdeviceName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDeviceName()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `deviceSerialNumber` to the URL query string
    if (getDeviceSerialNumber() != null) {
      try {
        joiner.add(String.format("%sdeviceSerialNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDeviceSerialNumber()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `linkedSpaceId` to the URL query string
    if (getLinkedSpaceId() != null) {
      try {
        joiner.add(String.format("%slinkedSpaceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedSpaceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `configurationVersion` to the URL query string
    if (getConfigurationVersion() != null) {
      joiner.add(getConfigurationVersion().toUrlQueryString(prefix + "configurationVersion" + suffix));
    }

    // add `locationVersion` to the URL query string
    if (getLocationVersion() != null) {
      joiner.add(getLocationVersion().toUrlQueryString(prefix + "locationVersion" + suffix));
    }

    // add `defaultCurrency` to the URL query string
    if (getDefaultCurrency() != null) {
      try {
        joiner.add(String.format("%sdefaultCurrency%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDefaultCurrency()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
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

