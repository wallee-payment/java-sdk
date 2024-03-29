/**
* wallee SDK
*
* This library allows to interact with the wallee payment service.
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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wallee.sdk.model.PaymentTerminalConfiguration;
import com.wallee.sdk.model.PaymentTerminalConfigurationVersionState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class PaymentTerminalConfigurationVersion {
  
  @JsonProperty("configuration")
  protected PaymentTerminalConfiguration _configuration = null;

  
  @JsonProperty("connectorConfigurations")
  protected List<Long> connectorConfigurations = null;

  
  @JsonProperty("createdBy")
  protected Long createdBy = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("defaultCurrency")
  protected String defaultCurrency = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("maintenanceWindowDuration")
  protected String maintenanceWindowDuration = null;

  
  @JsonProperty("maintenanceWindowStart")
  protected String maintenanceWindowStart = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("state")
  protected PaymentTerminalConfigurationVersionState state = null;

  
  @JsonProperty("timeZone")
  protected String timeZone = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  @JsonProperty("versionAppliedImmediately")
  protected Boolean versionAppliedImmediately = null;

  
  
   /**
   * 
   * @return _configuration
  **/
  @ApiModelProperty(value = "")
  public PaymentTerminalConfiguration getConfiguration() {
    return _configuration;
  }

  
   /**
   * 
   * @return connectorConfigurations
  **/
  @ApiModelProperty(value = "")
  public List<Long> getConnectorConfigurations() {
    return connectorConfigurations;
  }

  
   /**
   * 
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public Long getCreatedBy() {
    return createdBy;
  }

  
   /**
   * The date and time when the object was created.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The date and time when the object was created.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * The currency is derived by default from the terminal location. By setting a specific currency the derived currency is overridden.
   * @return defaultCurrency
  **/
  @ApiModelProperty(value = "The currency is derived by default from the terminal location. By setting a specific currency the derived currency is overridden.")
  public String getDefaultCurrency() {
    return defaultCurrency;
  }

  
   /**
   * A unique identifier for the object.
   * @return id
  **/
  @ApiModelProperty(value = "A unique identifier for the object.")
  public Long getId() {
    return id;
  }

  
   /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The ID of the space this object belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * 
   * @return maintenanceWindowDuration
  **/
  @ApiModelProperty(value = "")
  public String getMaintenanceWindowDuration() {
    return maintenanceWindowDuration;
  }

  
   /**
   * 
   * @return maintenanceWindowStart
  **/
  @ApiModelProperty(value = "")
  public String getMaintenanceWindowStart() {
    return maintenanceWindowStart;
  }

  
   /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public PaymentTerminalConfigurationVersionState getState() {
    return state;
  }

  
   /**
   * 
   * @return timeZone
  **/
  @ApiModelProperty(value = "")
  public String getTimeZone() {
    return timeZone;
  }

  
   /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @ApiModelProperty(value = "The version is used for optimistic locking and incremented whenever the object is updated.")
  public Integer getVersion() {
    return version;
  }

  
   /**
   * 
   * @return versionAppliedImmediately
  **/
  @ApiModelProperty(value = "")
  public Boolean isVersionAppliedImmediately() {
    return versionAppliedImmediately;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTerminalConfigurationVersion paymentTerminalConfigurationVersion = (PaymentTerminalConfigurationVersion) o;
    return Objects.equals(this._configuration, paymentTerminalConfigurationVersion._configuration) &&
        Objects.equals(this.connectorConfigurations, paymentTerminalConfigurationVersion.connectorConfigurations) &&
        Objects.equals(this.createdBy, paymentTerminalConfigurationVersion.createdBy) &&
        Objects.equals(this.createdOn, paymentTerminalConfigurationVersion.createdOn) &&
        Objects.equals(this.defaultCurrency, paymentTerminalConfigurationVersion.defaultCurrency) &&
        Objects.equals(this.id, paymentTerminalConfigurationVersion.id) &&
        Objects.equals(this.linkedSpaceId, paymentTerminalConfigurationVersion.linkedSpaceId) &&
        Objects.equals(this.maintenanceWindowDuration, paymentTerminalConfigurationVersion.maintenanceWindowDuration) &&
        Objects.equals(this.maintenanceWindowStart, paymentTerminalConfigurationVersion.maintenanceWindowStart) &&
        Objects.equals(this.plannedPurgeDate, paymentTerminalConfigurationVersion.plannedPurgeDate) &&
        Objects.equals(this.state, paymentTerminalConfigurationVersion.state) &&
        Objects.equals(this.timeZone, paymentTerminalConfigurationVersion.timeZone) &&
        Objects.equals(this.version, paymentTerminalConfigurationVersion.version) &&
        Objects.equals(this.versionAppliedImmediately, paymentTerminalConfigurationVersion.versionAppliedImmediately);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_configuration, connectorConfigurations, createdBy, createdOn, defaultCurrency, id, linkedSpaceId, maintenanceWindowDuration, maintenanceWindowStart, plannedPurgeDate, state, timeZone, version, versionAppliedImmediately);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTerminalConfigurationVersion {\n");
    
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    connectorConfigurations: ").append(toIndentedString(connectorConfigurations)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    maintenanceWindowDuration: ").append(toIndentedString(maintenanceWindowDuration)).append("\n");
    sb.append("    maintenanceWindowStart: ").append(toIndentedString(maintenanceWindowStart)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionAppliedImmediately: ").append(toIndentedString(versionAppliedImmediately)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

