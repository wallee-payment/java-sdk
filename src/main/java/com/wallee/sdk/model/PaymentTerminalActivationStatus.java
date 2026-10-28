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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * PaymentTerminalActivationStatus
 */
@JsonPropertyOrder({
  PaymentTerminalActivationStatus.JSON_PROPERTY_ACTIVATION_CODE_ACTIVE,
  PaymentTerminalActivationStatus.JSON_PROPERTY_ENVIRONMENT,
  PaymentTerminalActivationStatus.JSON_PROPERTY_ACTIVATED_ON,
  PaymentTerminalActivationStatus.JSON_PROPERTY_LOCATION_ID,
  PaymentTerminalActivationStatus.JSON_PROPERTY_ACTIVATION_CODE,
  PaymentTerminalActivationStatus.JSON_PROPERTY_CONFIGURATION_ID,
  PaymentTerminalActivationStatus.JSON_PROPERTY_TERMINAL_ID,
  PaymentTerminalActivationStatus.JSON_PROPERTY_SPACE
})

public class PaymentTerminalActivationStatus {
  public static final String JSON_PROPERTY_ACTIVATION_CODE_ACTIVE = "activationCodeActive";
  @javax.annotation.Nullable
  private Boolean activationCodeActive;

  public static final String JSON_PROPERTY_ENVIRONMENT = "environment";
  @javax.annotation.Nullable
  private String environment;

  public static final String JSON_PROPERTY_ACTIVATED_ON = "activatedOn";
  @javax.annotation.Nullable
  private OffsetDateTime activatedOn;

  public static final String JSON_PROPERTY_LOCATION_ID = "locationId";
  @javax.annotation.Nullable
  private Long locationId;

  public static final String JSON_PROPERTY_ACTIVATION_CODE = "activationCode";
  @javax.annotation.Nullable
  private String activationCode;

  public static final String JSON_PROPERTY_CONFIGURATION_ID = "configurationId";
  @javax.annotation.Nullable
  private Long configurationId;

  public static final String JSON_PROPERTY_TERMINAL_ID = "terminalId";
  @javax.annotation.Nullable
  private String terminalId;

  public static final String JSON_PROPERTY_SPACE = "space";
  @javax.annotation.Nullable
  private Long space;

  public PaymentTerminalActivationStatus() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public PaymentTerminalActivationStatus(
    @JsonProperty(JSON_PROPERTY_ACTIVATION_CODE_ACTIVE) Boolean activationCodeActive, 
    @JsonProperty(JSON_PROPERTY_ENVIRONMENT) String environment, 
    @JsonProperty(JSON_PROPERTY_ACTIVATED_ON) OffsetDateTime activatedOn, 
    @JsonProperty(JSON_PROPERTY_LOCATION_ID) Long locationId, 
    @JsonProperty(JSON_PROPERTY_ACTIVATION_CODE) String activationCode, 
    @JsonProperty(JSON_PROPERTY_CONFIGURATION_ID) Long configurationId, 
    @JsonProperty(JSON_PROPERTY_TERMINAL_ID) String terminalId, 
    @JsonProperty(JSON_PROPERTY_SPACE) Long space
  ) {
    this();
    this.activationCodeActive = activationCodeActive;
    this.environment = environment;
    this.activatedOn = activatedOn;
    this.locationId = locationId;
    this.activationCode = activationCode;
    this.configurationId = configurationId;
    this.terminalId = terminalId;
    this.space = space;
  }

  /**
   * Whether the activation code is active on the acquirer side
   * @return activationCodeActive
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVATION_CODE_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActivationCodeActive() {
    return activationCodeActive;
  }



  /**
   * The environment (TEST/PRODUCTION) the payment terminal belongs to.
   * @return environment
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnvironment() {
    return environment;
  }



  /**
   * Time when the payment terminal got activated on acquirer side
   * @return activatedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getActivatedOn() {
    return activatedOn;
  }



  /**
   * The ID of the location that the payment terminal belongs to
   * @return locationId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLocationId() {
    return locationId;
  }



  /**
   * Activation code that is used to link the terminal
   * @return activationCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVATION_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getActivationCode() {
    return activationCode;
  }



  /**
   * The ID of the configuration that the payment terminal belongs to
   * @return configurationId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIGURATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getConfigurationId() {
    return configurationId;
  }



  /**
   * The ID of the payment terminal
   * @return terminalId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TERMINAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTerminalId() {
    return terminalId;
  }



  /**
   * The ID of the space that the payment terminal belongs to
   * @return space
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSpace() {
    return space;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTerminalActivationStatus paymentTerminalActivationStatus = (PaymentTerminalActivationStatus) o;
    return Objects.equals(this.activationCodeActive, paymentTerminalActivationStatus.activationCodeActive) &&
        Objects.equals(this.environment, paymentTerminalActivationStatus.environment) &&
        Objects.equals(this.activatedOn, paymentTerminalActivationStatus.activatedOn) &&
        Objects.equals(this.locationId, paymentTerminalActivationStatus.locationId) &&
        Objects.equals(this.activationCode, paymentTerminalActivationStatus.activationCode) &&
        Objects.equals(this.configurationId, paymentTerminalActivationStatus.configurationId) &&
        Objects.equals(this.terminalId, paymentTerminalActivationStatus.terminalId) &&
        Objects.equals(this.space, paymentTerminalActivationStatus.space);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationCodeActive, environment, activatedOn, locationId, activationCode, configurationId, terminalId, space);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTerminalActivationStatus {\n");
    sb.append("    activationCodeActive: ").append(toIndentedString(activationCodeActive)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    activatedOn: ").append(toIndentedString(activatedOn)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    activationCode: ").append(toIndentedString(activationCode)).append("\n");
    sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    space: ").append(toIndentedString(space)).append("\n");
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

    // add `activationCodeActive` to the URL query string
    if (getActivationCodeActive() != null) {
      try {
        joiner.add(String.format("%sactivationCodeActive%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getActivationCodeActive()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `environment` to the URL query string
    if (getEnvironment() != null) {
      try {
        joiner.add(String.format("%senvironment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnvironment()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `activatedOn` to the URL query string
    if (getActivatedOn() != null) {
      try {
        joiner.add(String.format("%sactivatedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getActivatedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `locationId` to the URL query string
    if (getLocationId() != null) {
      try {
        joiner.add(String.format("%slocationId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLocationId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `activationCode` to the URL query string
    if (getActivationCode() != null) {
      try {
        joiner.add(String.format("%sactivationCode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getActivationCode()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `configurationId` to the URL query string
    if (getConfigurationId() != null) {
      try {
        joiner.add(String.format("%sconfigurationId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConfigurationId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `terminalId` to the URL query string
    if (getTerminalId() != null) {
      try {
        joiner.add(String.format("%sterminalId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTerminalId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `space` to the URL query string
    if (getSpace() != null) {
      try {
        joiner.add(String.format("%sspace%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSpace()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

