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

public class PaymentTerminalLocationVersion {
  
  @JsonProperty("address")
  protected PaymentTerminalAddress address = null;

  
  @JsonProperty("contactAddress")
  protected PaymentTerminalAddress contactAddress = null;

  
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
   * The postal address of the location where the payment terminals are used.
   * @return address
  **/
  @ApiModelProperty(value = "The postal address of the location where the payment terminals are used.")
  public PaymentTerminalAddress getAddress() {
    return address;
  }

  
   /**
   * The contact details if the person responsible for the payment terminals at this location.
   * @return contactAddress
  **/
  @ApiModelProperty(value = "The contact details if the person responsible for the payment terminals at this location.")
  public PaymentTerminalAddress getContactAddress() {
    return contactAddress;
  }

  
   /**
   * The ID of the user the payment terminal location version was created by.
   * @return createdBy
  **/
  @ApiModelProperty(value = "The ID of the user the payment terminal location version was created by.")
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
   * The payment terminal location that the version belongs to.
   * @return location
  **/
  @ApiModelProperty(value = "The payment terminal location that the version belongs to.")
  public PaymentTerminalLocation getLocation() {
    return location;
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
  public PaymentTerminalLocationVersionState getState() {
    return state;
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
   * Whether payment terminals are immediately updated to this configuration version. If not, it will be applied during the maintenance window.
   * @return versionAppliedImmediately
  **/
  @ApiModelProperty(value = "Whether payment terminals are immediately updated to this configuration version. If not, it will be applied during the maintenance window.")
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
        Objects.equals(this.contactAddress, paymentTerminalLocationVersion.contactAddress) &&
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
    return Objects.hash(address, contactAddress, createdBy, createdOn, id, linkedSpaceId, location, plannedPurgeDate, state, version, versionAppliedImmediately);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTerminalLocationVersion {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    contactAddress: ").append(toIndentedString(contactAddress)).append("\n");
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

