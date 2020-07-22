/**
*  SDK
*
* This library allows to interact with the  payment service.
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
import com.wallee.sdk.model.PaymentTerminalAddress;
import com.wallee.sdk.model.PaymentTerminalConfiguration;
import com.wallee.sdk.model.PaymentTerminalContactAddress;
import com.wallee.sdk.model.PaymentTerminalLocationState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class PaymentTerminalLocation {
  
  @JsonProperty("contactAddress")
  protected PaymentTerminalContactAddress contactAddress = null;

  
  @JsonProperty("defaultConfiguration")
  protected PaymentTerminalConfiguration defaultConfiguration = null;

  
  @JsonProperty("deliveryAddress")
  protected PaymentTerminalAddress deliveryAddress = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("state")
  protected PaymentTerminalLocationState state = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * 
   * @return contactAddress
  **/
  @ApiModelProperty(value = "")
  public PaymentTerminalContactAddress getContactAddress() {
    return contactAddress;
  }

  
   /**
   * 
   * @return defaultConfiguration
  **/
  @ApiModelProperty(value = "")
  public PaymentTerminalConfiguration getDefaultConfiguration() {
    return defaultConfiguration;
  }

  
   /**
   * 
   * @return deliveryAddress
  **/
  @ApiModelProperty(value = "")
  public PaymentTerminalAddress getDeliveryAddress() {
    return deliveryAddress;
  }

  
   /**
   * The ID is the primary key of the entity. The ID identifies the entity uniquely.
   * @return id
  **/
  @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
  public Long getId() {
    return id;
  }

  
   /**
   * The linked space id holds the ID of the space to which the entity belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The terminal location name is used internally to identify the terminal in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.
   * @return name
  **/
  @ApiModelProperty(value = "The terminal location name is used internally to identify the terminal in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.")
  public String getName() {
    return name;
  }

  
   /**
   * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public PaymentTerminalLocationState getState() {
    return state;
  }

  
   /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
  **/
  @ApiModelProperty(value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
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
    PaymentTerminalLocation paymentTerminalLocation = (PaymentTerminalLocation) o;
    return Objects.equals(this.contactAddress, paymentTerminalLocation.contactAddress) &&
        Objects.equals(this.defaultConfiguration, paymentTerminalLocation.defaultConfiguration) &&
        Objects.equals(this.deliveryAddress, paymentTerminalLocation.deliveryAddress) &&
        Objects.equals(this.id, paymentTerminalLocation.id) &&
        Objects.equals(this.linkedSpaceId, paymentTerminalLocation.linkedSpaceId) &&
        Objects.equals(this.name, paymentTerminalLocation.name) &&
        Objects.equals(this.plannedPurgeDate, paymentTerminalLocation.plannedPurgeDate) &&
        Objects.equals(this.state, paymentTerminalLocation.state) &&
        Objects.equals(this.version, paymentTerminalLocation.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactAddress, defaultConfiguration, deliveryAddress, id, linkedSpaceId, name, plannedPurgeDate, state, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTerminalLocation {\n");
    
    sb.append("    contactAddress: ").append(toIndentedString(contactAddress)).append("\n");
    sb.append("    defaultConfiguration: ").append(toIndentedString(defaultConfiguration)).append("\n");
    sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

