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
import com.wallee.sdk.model.TransactionGroupState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class TransactionGroup {
  
  @JsonProperty("beginDate")
  protected OffsetDateTime beginDate = null;

  
  @JsonProperty("customerId")
  protected String customerId = null;

  
  @JsonProperty("endDate")
  protected OffsetDateTime endDate = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("state")
  protected TransactionGroupState state = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The date and time when the initial transaction in the group was created.
   * @return beginDate
  **/
  @ApiModelProperty(value = "The date and time when the initial transaction in the group was created.")
  public OffsetDateTime getBeginDate() {
    return beginDate;
  }

  
   /**
   * The unique identifier of the customer in the external system.
   * @return customerId
  **/
  @ApiModelProperty(value = "The unique identifier of the customer in the external system.")
  public String getCustomerId() {
    return customerId;
  }

  
   /**
   * The date and time when the final transaction in the group was last updated.
   * @return endDate
  **/
  @ApiModelProperty(value = "The date and time when the final transaction in the group was last updated.")
  public OffsetDateTime getEndDate() {
    return endDate;
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
  public TransactionGroupState getState() {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionGroup transactionGroup = (TransactionGroup) o;
    return Objects.equals(this.beginDate, transactionGroup.beginDate) &&
        Objects.equals(this.customerId, transactionGroup.customerId) &&
        Objects.equals(this.endDate, transactionGroup.endDate) &&
        Objects.equals(this.id, transactionGroup.id) &&
        Objects.equals(this.linkedSpaceId, transactionGroup.linkedSpaceId) &&
        Objects.equals(this.plannedPurgeDate, transactionGroup.plannedPurgeDate) &&
        Objects.equals(this.state, transactionGroup.state) &&
        Objects.equals(this.version, transactionGroup.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginDate, customerId, endDate, id, linkedSpaceId, plannedPurgeDate, state, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionGroup {\n");
    
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
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

