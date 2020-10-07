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

public class ChargeFlowLevel extends TransactionAwareEntity {
  
  @JsonProperty("asynchronousCharge")
  protected Long asynchronousCharge;

  
  @JsonProperty("configuration")
  protected ChargeFlowLevelConfiguration _configuration;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate;

  
  @JsonProperty("state")
  protected ChargeFlowLevelState state;

  
  @JsonProperty("synchronousCharge")
  protected Long synchronousCharge;

  
  @JsonProperty("timeoutOn")
  protected OffsetDateTime timeoutOn;

  
  @JsonProperty("tokenCharge")
  protected Long tokenCharge;

  
  @JsonProperty("transaction")
  protected Transaction transaction;

  
  @JsonProperty("version")
  protected Integer version;

  
  
   /**
   * 
   * @return asynchronousCharge
  **/
  @ApiModelProperty(value = "")
  public Long getAsynchronousCharge() {
    return asynchronousCharge;
  }

  
   /**
   * 
   * @return _configuration
  **/
  @ApiModelProperty(value = "")
  public ChargeFlowLevelConfiguration getConfiguration() {
    return _configuration;
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
  public ChargeFlowLevelState getState() {
    return state;
  }

  
   /**
   * 
   * @return synchronousCharge
  **/
  @ApiModelProperty(value = "")
  public Long getSynchronousCharge() {
    return synchronousCharge;
  }

  
   /**
   * 
   * @return timeoutOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTimeoutOn() {
    return timeoutOn;
  }

  
   /**
   * 
   * @return tokenCharge
  **/
  @ApiModelProperty(value = "")
  public Long getTokenCharge() {
    return tokenCharge;
  }

  
   /**
   * 
   * @return transaction
  **/
  @ApiModelProperty(value = "")
  public Transaction getTransaction() {
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeFlowLevel chargeFlowLevel = (ChargeFlowLevel) o;
    return Objects.equals(this.id, chargeFlowLevel.id) &&
        Objects.equals(this.linkedSpaceId, chargeFlowLevel.linkedSpaceId) &&
        Objects.equals(this.linkedTransaction, chargeFlowLevel.linkedTransaction) &&
        Objects.equals(this.asynchronousCharge, chargeFlowLevel.asynchronousCharge) &&
        Objects.equals(this._configuration, chargeFlowLevel._configuration) &&
        Objects.equals(this.createdOn, chargeFlowLevel.createdOn) &&
        Objects.equals(this.plannedPurgeDate, chargeFlowLevel.plannedPurgeDate) && this.state == chargeFlowLevel.state
      &&
        Objects.equals(this.synchronousCharge, chargeFlowLevel.synchronousCharge) &&
        Objects.equals(this.timeoutOn, chargeFlowLevel.timeoutOn) &&
        Objects.equals(this.tokenCharge, chargeFlowLevel.tokenCharge) &&
        Objects.equals(this.transaction, chargeFlowLevel.transaction) &&
        Objects.equals(this.version, chargeFlowLevel.version) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, linkedSpaceId, linkedTransaction, asynchronousCharge, _configuration, createdOn, plannedPurgeDate, state, synchronousCharge, timeoutOn, tokenCharge, transaction, version, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeFlowLevel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    asynchronousCharge: ").append(toIndentedString(asynchronousCharge)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    synchronousCharge: ").append(toIndentedString(synchronousCharge)).append("\n");
    sb.append("    timeoutOn: ").append(toIndentedString(timeoutOn)).append("\n");
    sb.append("    tokenCharge: ").append(toIndentedString(tokenCharge)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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

