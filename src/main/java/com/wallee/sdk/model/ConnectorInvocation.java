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
import com.wallee.sdk.model.ConnectorInvocationStage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class ConnectorInvocation {
  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("stage")
  protected ConnectorInvocationStage stage = null;

  
  @JsonProperty("timeTookInMilliseconds")
  protected Long timeTookInMilliseconds = null;

  
  @JsonProperty("transaction")
  protected Long transaction = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
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
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * The transaction stage during which the connector invocation was performed.
   * @return stage
  **/
  @ApiModelProperty(value = "The transaction stage during which the connector invocation was performed.")
  public ConnectorInvocationStage getStage() {
    return stage;
  }

  
   /**
   * The duration, in milliseconds, taken to execute the connector invocation.
   * @return timeTookInMilliseconds
  **/
  @ApiModelProperty(value = "The duration, in milliseconds, taken to execute the connector invocation.")
  public Long getTimeTookInMilliseconds() {
    return timeTookInMilliseconds;
  }

  
   /**
   * The transaction that the connector invocation belongs to.
   * @return transaction
  **/
  @ApiModelProperty(value = "The transaction that the connector invocation belongs to.")
  public Long getTransaction() {
    return transaction;
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
    ConnectorInvocation connectorInvocation = (ConnectorInvocation) o;
    return Objects.equals(this.createdOn, connectorInvocation.createdOn) &&
        Objects.equals(this.id, connectorInvocation.id) &&
        Objects.equals(this.linkedSpaceId, connectorInvocation.linkedSpaceId) &&
        Objects.equals(this.plannedPurgeDate, connectorInvocation.plannedPurgeDate) &&
        Objects.equals(this.stage, connectorInvocation.stage) &&
        Objects.equals(this.timeTookInMilliseconds, connectorInvocation.timeTookInMilliseconds) &&
        Objects.equals(this.transaction, connectorInvocation.transaction) &&
        Objects.equals(this.version, connectorInvocation.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdOn, id, linkedSpaceId, plannedPurgeDate, stage, timeTookInMilliseconds, transaction, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorInvocation {\n");
    
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
    sb.append("    timeTookInMilliseconds: ").append(toIndentedString(timeTookInMilliseconds)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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

