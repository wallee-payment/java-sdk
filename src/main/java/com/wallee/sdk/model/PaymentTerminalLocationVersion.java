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
import com.wallee.sdk.model.PaymentTerminalLocation;
import com.wallee.sdk.model.PaymentTerminalLocationVersionState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.wallee.sdk.java.WalleeJavaClientCodegen", date = "2020-04-22T16:20:41.240+02:00")
public class PaymentTerminalLocationVersion {
  
  @JsonProperty("address")
  protected PaymentTerminalAddress address = null;

  
  @JsonProperty("createdBy")
  protected Long createdBy = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("location")
  protected PaymentTerminalLocation location = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("state")
  protected PaymentTerminalLocationVersionState state = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  @JsonProperty("versionAppliedImmediately")
  protected Boolean versionAppliedImmediately = null;

  
  
   /**
   * 
   * @return address
  **/
  @ApiModelProperty(value = "")
  public PaymentTerminalAddress getAddress() {
    return address;
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
   * The created on date indicates the date on which the entity was stored into the database.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The created on date indicates the date on which the entity was stored into the database.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
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
   * 
   * @return location
  **/
  @ApiModelProperty(value = "")
  public PaymentTerminalLocation getLocation() {
    return location;
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
  public PaymentTerminalLocationVersionState getState() {
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
    PaymentTerminalLocationVersion paymentTerminalLocationVersion = (PaymentTerminalLocationVersion) o;
    return Objects.equals(this.address, paymentTerminalLocationVersion.address) &&
        Objects.equals(this.createdBy, paymentTerminalLocationVersion.createdBy) &&
        Objects.equals(this.createdOn, paymentTerminalLocationVersion.createdOn) &&
        Objects.equals(this.id, paymentTerminalLocationVersion.id) &&
        Objects.equals(this.linkedSpaceId, paymentTerminalLocationVersion.linkedSpaceId) &&
        Objects.equals(this.location, paymentTerminalLocationVersion.location) &&
        Objects.equals(this.plannedPurgeDate, paymentTerminalLocationVersion.plannedPurgeDate) &&
        Objects.equals(this.state, paymentTerminalLocationVersion.state) &&
        Objects.equals(this.version, paymentTerminalLocationVersion.version) &&
        Objects.equals(this.versionAppliedImmediately, paymentTerminalLocationVersion.versionAppliedImmediately);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, createdBy, createdOn, id, linkedSpaceId, location, plannedPurgeDate, state, version, versionAppliedImmediately);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTerminalLocationVersion {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

