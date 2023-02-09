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
import com.wallee.sdk.model.PaymentTerminalConfigurationVersion;
import com.wallee.sdk.model.PaymentTerminalLocationVersion;
import com.wallee.sdk.model.PaymentTerminalState;
import com.wallee.sdk.model.PaymentTerminalType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class PaymentTerminal {
  
  @JsonProperty("configurationVersion")
  protected PaymentTerminalConfigurationVersion configurationVersion = null;

  
  @JsonProperty("defaultCurrency")
  protected String defaultCurrency = null;

  
  @JsonProperty("externalId")
  protected String externalId = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("identifier")
  protected String identifier = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("locationVersion")
  protected PaymentTerminalLocationVersion locationVersion = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("state")
  protected PaymentTerminalState state = null;

  
  @JsonProperty("type")
  protected PaymentTerminalType type = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * 
   * @return configurationVersion
  **/
  @ApiModelProperty(value = "")
  public PaymentTerminalConfigurationVersion getConfigurationVersion() {
    return configurationVersion;
  }

  
   /**
   * 
   * @return defaultCurrency
  **/
  @ApiModelProperty(value = "")
  public String getDefaultCurrency() {
    return defaultCurrency;
  }

  
   /**
   * A client generated nonce which identifies the entity to be created. Subsequent creation requests with the same external ID will not create new entities but return the initially created entity instead.
   * @return externalId
  **/
  @ApiModelProperty(value = "A client generated nonce which identifies the entity to be created. Subsequent creation requests with the same external ID will not create new entities but return the initially created entity instead.")
  public String getExternalId() {
    return externalId;
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
   * The identifier uniquely identifies the terminal. Normally it is visible on the device or in the display of the device.
   * @return identifier
  **/
  @ApiModelProperty(value = "The identifier uniquely identifies the terminal. Normally it is visible on the device or in the display of the device.")
  public String getIdentifier() {
    return identifier;
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
   * @return locationVersion
  **/
  @ApiModelProperty(value = "")
  public PaymentTerminalLocationVersion getLocationVersion() {
    return locationVersion;
  }

  
   /**
   * The terminal name is used internally to identify the terminal in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.
   * @return name
  **/
  @ApiModelProperty(value = "The terminal name is used internally to identify the terminal in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.")
  public String getName() {
    return name;
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
  public PaymentTerminalState getState() {
    return state;
  }

  
   /**
   * 
   * @return type
  **/
  @ApiModelProperty(value = "")
  public PaymentTerminalType getType() {
    return type;
  }

  
   /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @ApiModelProperty(value = "The version is used for optimistic locking and incremented whenever the object is updated.")
  public Integer getVersion() {
    return version;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTerminal paymentTerminal = (PaymentTerminal) o;
    return Objects.equals(this.configurationVersion, paymentTerminal.configurationVersion) &&
        Objects.equals(this.defaultCurrency, paymentTerminal.defaultCurrency) &&
        Objects.equals(this.externalId, paymentTerminal.externalId) &&
        Objects.equals(this.id, paymentTerminal.id) &&
        Objects.equals(this.identifier, paymentTerminal.identifier) &&
        Objects.equals(this.linkedSpaceId, paymentTerminal.linkedSpaceId) &&
        Objects.equals(this.locationVersion, paymentTerminal.locationVersion) &&
        Objects.equals(this.name, paymentTerminal.name) &&
        Objects.equals(this.plannedPurgeDate, paymentTerminal.plannedPurgeDate) &&
        Objects.equals(this.state, paymentTerminal.state) &&
        Objects.equals(this.type, paymentTerminal.type) &&
        Objects.equals(this.version, paymentTerminal.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationVersion, defaultCurrency, externalId, id, identifier, linkedSpaceId, locationVersion, name, plannedPurgeDate, state, type, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTerminal {\n");
    
    sb.append("    configurationVersion: ").append(toIndentedString(configurationVersion)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    locationVersion: ").append(toIndentedString(locationVersion)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

