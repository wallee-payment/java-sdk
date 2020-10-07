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

import java.time.OffsetDateTime;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
@ApiModel(description = "")

public class PaymentTerminalConfiguration {
  
  @JsonProperty("id")
  protected Long id;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId;

  
  @JsonProperty("name")
  protected String name;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate;

  
  @JsonProperty("state")
  protected PaymentTerminalConfigurationState state;

  
  @JsonProperty("type")
  protected PaymentTerminalType type;

  
  @JsonProperty("version")
  protected Integer version;

  
  
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
   * The terminal configuration name is used internally to identify the terminal in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.
   * @return name
  **/
  @ApiModelProperty(value = "The terminal configuration name is used internally to identify the terminal in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.")
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
  public PaymentTerminalConfigurationState getState() {
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
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
  **/
  @ApiModelProperty(value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
  public Integer getVersion() {
    return version;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTerminalConfiguration paymentTerminalConfiguration = (PaymentTerminalConfiguration) o;
    return Objects.equals(this.id, paymentTerminalConfiguration.id) &&
        Objects.equals(this.linkedSpaceId, paymentTerminalConfiguration.linkedSpaceId) &&
        Objects.equals(this.name, paymentTerminalConfiguration.name) &&
        Objects.equals(this.plannedPurgeDate, paymentTerminalConfiguration.plannedPurgeDate) && this.state
      == paymentTerminalConfiguration.state &&
        Objects.equals(this.type, paymentTerminalConfiguration.type) &&
        Objects.equals(this.version, paymentTerminalConfiguration.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, linkedSpaceId, name, plannedPurgeDate, state, type, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTerminalConfiguration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

