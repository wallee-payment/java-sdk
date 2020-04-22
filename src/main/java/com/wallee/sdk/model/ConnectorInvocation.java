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
import com.wallee.sdk.model.ConnectorInvocationStage;
import com.wallee.sdk.model.TransactionAwareEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.wallee.sdk.java.WalleeJavaClientCodegen", date = "2020-04-22T16:32:44.639+02:00")
public class ConnectorInvocation extends TransactionAwareEntity {
  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
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
   * The created on date indicates the date on which the entity was stored into the database.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The created on date indicates the date on which the entity was stored into the database.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
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
   * @return stage
  **/
  @ApiModelProperty(value = "")
  public ConnectorInvocationStage getStage() {
    return stage;
  }

  
   /**
   * 
   * @return timeTookInMilliseconds
  **/
  @ApiModelProperty(value = "")
  public Long getTimeTookInMilliseconds() {
    return timeTookInMilliseconds;
  }

  
   /**
   * 
   * @return transaction
  **/
  @ApiModelProperty(value = "")
  public Long getTransaction() {
    return transaction;
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
    ConnectorInvocation connectorInvocation = (ConnectorInvocation) o;
    return Objects.equals(this.id, connectorInvocation.id) &&
        Objects.equals(this.linkedSpaceId, connectorInvocation.linkedSpaceId) &&
        Objects.equals(this.linkedTransaction, connectorInvocation.linkedTransaction) &&
        Objects.equals(this.createdOn, connectorInvocation.createdOn) &&
        Objects.equals(this.plannedPurgeDate, connectorInvocation.plannedPurgeDate) &&
        Objects.equals(this.stage, connectorInvocation.stage) &&
        Objects.equals(this.timeTookInMilliseconds, connectorInvocation.timeTookInMilliseconds) &&
        Objects.equals(this.transaction, connectorInvocation.transaction) &&
        Objects.equals(this.version, connectorInvocation.version) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, linkedSpaceId, linkedTransaction, createdOn, plannedPurgeDate, stage, timeTookInMilliseconds, transaction, version, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorInvocation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
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

