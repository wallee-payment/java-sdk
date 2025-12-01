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
import com.wallee.sdk.model.PaymentTerminalConfiguration;
import com.wallee.sdk.model.PaymentTerminalConfigurationVersionState;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * PaymentTerminalConfigurationVersion
 */
@JsonPropertyOrder({
  PaymentTerminalConfigurationVersion.JSON_PROPERTY_MAINTENANCE_WINDOW_START,
  PaymentTerminalConfigurationVersion.JSON_PROPERTY_CONFIGURATION,
  PaymentTerminalConfigurationVersion.JSON_PROPERTY_PLANNED_PURGE_DATE,
  PaymentTerminalConfigurationVersion.JSON_PROPERTY_TIME_ZONE,
  PaymentTerminalConfigurationVersion.JSON_PROPERTY_VERSION_APPLIED_IMMEDIATELY,
  PaymentTerminalConfigurationVersion.JSON_PROPERTY_CREATED_ON,
  PaymentTerminalConfigurationVersion.JSON_PROPERTY_VERSION,
  PaymentTerminalConfigurationVersion.JSON_PROPERTY_LINKED_SPACE_ID,
  PaymentTerminalConfigurationVersion.JSON_PROPERTY_CONNECTOR_CONFIGURATIONS,
  PaymentTerminalConfigurationVersion.JSON_PROPERTY_CREATED_BY,
  PaymentTerminalConfigurationVersion.JSON_PROPERTY_DEFAULT_CURRENCY,
  PaymentTerminalConfigurationVersion.JSON_PROPERTY_MAINTENANCE_WINDOW_DURATION,
  PaymentTerminalConfigurationVersion.JSON_PROPERTY_ID,
  PaymentTerminalConfigurationVersion.JSON_PROPERTY_STATE
})

public class PaymentTerminalConfigurationVersion {
  public static final String JSON_PROPERTY_MAINTENANCE_WINDOW_START = "maintenanceWindowStart";
  @javax.annotation.Nullable
  private String maintenanceWindowStart;

  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  @javax.annotation.Nullable
  private PaymentTerminalConfiguration _configuration;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  @javax.annotation.Nullable
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_TIME_ZONE = "timeZone";
  @javax.annotation.Nullable
  private String timeZone;

  public static final String JSON_PROPERTY_VERSION_APPLIED_IMMEDIATELY = "versionAppliedImmediately";
  @javax.annotation.Nullable
  private Boolean versionAppliedImmediately;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  @javax.annotation.Nullable
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_CONNECTOR_CONFIGURATIONS = "connectorConfigurations";
  @javax.annotation.Nullable
  private List<Long> connectorConfigurations = new ArrayList<>();

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  @javax.annotation.Nullable
  private Long createdBy;

  public static final String JSON_PROPERTY_DEFAULT_CURRENCY = "defaultCurrency";
  @javax.annotation.Nullable
  private String defaultCurrency;

  public static final String JSON_PROPERTY_MAINTENANCE_WINDOW_DURATION = "maintenanceWindowDuration";
  @javax.annotation.Nullable
  private String maintenanceWindowDuration;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private PaymentTerminalConfigurationVersionState state;

  public PaymentTerminalConfigurationVersion() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public PaymentTerminalConfigurationVersion(
    @JsonProperty(JSON_PROPERTY_MAINTENANCE_WINDOW_START) String maintenanceWindowStart, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_TIME_ZONE) String timeZone, 
    @JsonProperty(JSON_PROPERTY_VERSION_APPLIED_IMMEDIATELY) Boolean versionAppliedImmediately, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_CONNECTOR_CONFIGURATIONS) List<Long> connectorConfigurations, 
    @JsonProperty(JSON_PROPERTY_CREATED_BY) Long createdBy, 
    @JsonProperty(JSON_PROPERTY_DEFAULT_CURRENCY) String defaultCurrency, 
    @JsonProperty(JSON_PROPERTY_MAINTENANCE_WINDOW_DURATION) String maintenanceWindowDuration, 
    @JsonProperty(JSON_PROPERTY_ID) Long id
  ) {
    this();
    this.maintenanceWindowStart = maintenanceWindowStart;
    this.plannedPurgeDate = plannedPurgeDate;
    this.timeZone = timeZone;
    this.versionAppliedImmediately = versionAppliedImmediately;
    this.createdOn = createdOn;
    this.version = version;
    this.linkedSpaceId = linkedSpaceId;
    this.connectorConfigurations = connectorConfigurations;
    this.createdBy = createdBy;
    this.defaultCurrency = defaultCurrency;
    this.maintenanceWindowDuration = maintenanceWindowDuration;
    this.id = id;
  }

  /**
   * The start time of the terminal&#39;s maintenance window.
   * @return maintenanceWindowStart
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAINTENANCE_WINDOW_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMaintenanceWindowStart() {
    return maintenanceWindowStart;
  }



  public PaymentTerminalConfigurationVersion _configuration(@javax.annotation.Nullable PaymentTerminalConfiguration _configuration) {
    
    this._configuration = _configuration;
    return this;
  }

  /**
   * Get _configuration
   * @return _configuration
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentTerminalConfiguration getConfiguration() {
    return _configuration;
  }


  @JsonProperty(JSON_PROPERTY_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfiguration(@javax.annotation.Nullable PaymentTerminalConfiguration _configuration) {
    this._configuration = _configuration;
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
   * The time zone of the payment terminal used to determine the maintenance window.
   * @return timeZone
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeZone() {
    return timeZone;
  }



  /**
   * Whether payment terminals are immediately updated to this configuration version. If not, it will be applied during the maintenance window.
   * @return versionAppliedImmediately
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION_APPLIED_IMMEDIATELY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVersionAppliedImmediately() {
    return versionAppliedImmediately;
  }



  /**
   * The date and time when the object was created.
   * @return createdOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedOn() {
    return createdOn;
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
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }



  /**
   * The payment connector configurations that are available on the payment terminal.
   * @return connectorConfigurations
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECTOR_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getConnectorConfigurations() {
    return connectorConfigurations;
  }



  /**
   * The ID of the user the payment terminal configuration version was created by.
   * @return createdBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreatedBy() {
    return createdBy;
  }



  /**
   * The default currency that is used if none is set on the payment terminal itself. If it is empty, the currency is derived from the location of the terminal.
   * @return defaultCurrency
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultCurrency() {
    return defaultCurrency;
  }



  /**
   * The permitted duration of the terminal&#39;s maintenance window.
   * @return maintenanceWindowDuration
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAINTENANCE_WINDOW_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMaintenanceWindowDuration() {
    return maintenanceWindowDuration;
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



  public PaymentTerminalConfigurationVersion state(@javax.annotation.Nullable PaymentTerminalConfigurationVersionState state) {
    
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

  public PaymentTerminalConfigurationVersionState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable PaymentTerminalConfigurationVersionState state) {
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
    PaymentTerminalConfigurationVersion paymentTerminalConfigurationVersion = (PaymentTerminalConfigurationVersion) o;
    return Objects.equals(this.maintenanceWindowStart, paymentTerminalConfigurationVersion.maintenanceWindowStart) &&
        Objects.equals(this._configuration, paymentTerminalConfigurationVersion._configuration) &&
        Objects.equals(this.plannedPurgeDate, paymentTerminalConfigurationVersion.plannedPurgeDate) &&
        Objects.equals(this.timeZone, paymentTerminalConfigurationVersion.timeZone) &&
        Objects.equals(this.versionAppliedImmediately, paymentTerminalConfigurationVersion.versionAppliedImmediately) &&
        Objects.equals(this.createdOn, paymentTerminalConfigurationVersion.createdOn) &&
        Objects.equals(this.version, paymentTerminalConfigurationVersion.version) &&
        Objects.equals(this.linkedSpaceId, paymentTerminalConfigurationVersion.linkedSpaceId) &&
        Objects.equals(this.connectorConfigurations, paymentTerminalConfigurationVersion.connectorConfigurations) &&
        Objects.equals(this.createdBy, paymentTerminalConfigurationVersion.createdBy) &&
        Objects.equals(this.defaultCurrency, paymentTerminalConfigurationVersion.defaultCurrency) &&
        Objects.equals(this.maintenanceWindowDuration, paymentTerminalConfigurationVersion.maintenanceWindowDuration) &&
        Objects.equals(this.id, paymentTerminalConfigurationVersion.id) &&
        Objects.equals(this.state, paymentTerminalConfigurationVersion.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maintenanceWindowStart, _configuration, plannedPurgeDate, timeZone, versionAppliedImmediately, createdOn, version, linkedSpaceId, connectorConfigurations, createdBy, defaultCurrency, maintenanceWindowDuration, id, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTerminalConfigurationVersion {\n");
    sb.append("    maintenanceWindowStart: ").append(toIndentedString(maintenanceWindowStart)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    versionAppliedImmediately: ").append(toIndentedString(versionAppliedImmediately)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    connectorConfigurations: ").append(toIndentedString(connectorConfigurations)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    maintenanceWindowDuration: ").append(toIndentedString(maintenanceWindowDuration)).append("\n");
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

    // add `maintenanceWindowStart` to the URL query string
    if (getMaintenanceWindowStart() != null) {
      try {
        joiner.add(String.format("%smaintenanceWindowStart%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaintenanceWindowStart()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `configuration` to the URL query string
    if (getConfiguration() != null) {
      joiner.add(getConfiguration().toUrlQueryString(prefix + "configuration" + suffix));
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

    // add `timeZone` to the URL query string
    if (getTimeZone() != null) {
      try {
        joiner.add(String.format("%stimeZone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimeZone()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `versionAppliedImmediately` to the URL query string
    if (getVersionAppliedImmediately() != null) {
      try {
        joiner.add(String.format("%sversionAppliedImmediately%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersionAppliedImmediately()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createdOn` to the URL query string
    if (getCreatedOn() != null) {
      try {
        joiner.add(String.format("%screatedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedOn()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `linkedSpaceId` to the URL query string
    if (getLinkedSpaceId() != null) {
      try {
        joiner.add(String.format("%slinkedSpaceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedSpaceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `connectorConfigurations` to the URL query string
    if (getConnectorConfigurations() != null) {
      for (int i = 0; i < getConnectorConfigurations().size(); i++) {
        try {
          joiner.add(String.format("%sconnectorConfigurations%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getConnectorConfigurations().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `createdBy` to the URL query string
    if (getCreatedBy() != null) {
      try {
        joiner.add(String.format("%screatedBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedBy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

    // add `maintenanceWindowDuration` to the URL query string
    if (getMaintenanceWindowDuration() != null) {
      try {
        joiner.add(String.format("%smaintenanceWindowDuration%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMaintenanceWindowDuration()), "UTF-8").replaceAll("\\+", "%20")));
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

