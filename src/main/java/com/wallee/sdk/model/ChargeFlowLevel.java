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
import com.wallee.sdk.model.ChargeFlowLevelConfiguration;
import com.wallee.sdk.model.ChargeFlowLevelState;
import com.wallee.sdk.model.Transaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class ChargeFlowLevel {
  
  @JsonProperty("asynchronousCharge")
  protected Long asynchronousCharge = null;

  
  @JsonProperty("configuration")
  protected ChargeFlowLevelConfiguration _configuration = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("linkedTransaction")
  protected Long linkedTransaction = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("state")
  protected ChargeFlowLevelState state = null;

  
  @JsonProperty("synchronousCharge")
  protected Long synchronousCharge = null;

  
  @JsonProperty("timeoutOn")
  protected OffsetDateTime timeoutOn = null;

  
  @JsonProperty("tokenCharge")
  protected Long tokenCharge = null;

  
  @JsonProperty("transaction")
  protected Transaction transaction = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The charge to process the payment asynchronously.
   * @return asynchronousCharge
  **/
  @ApiModelProperty(value = "The charge to process the payment asynchronously.")
  public Long getAsynchronousCharge() {
    return asynchronousCharge;
  }

  
   /**
   * The configuration that was used for this charge flow level.
   * @return _configuration
  **/
  @ApiModelProperty(value = "The configuration that was used for this charge flow level.")
  public ChargeFlowLevelConfiguration getConfiguration() {
    return _configuration;
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
   * The payment transaction this object is linked to.
   * @return linkedTransaction
  **/
  @ApiModelProperty(value = "The payment transaction this object is linked to.")
  public Long getLinkedTransaction() {
    return linkedTransaction;
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
  public ChargeFlowLevelState getState() {
    return state;
  }

  
   /**
   * The charge to process the payment synchronously.
   * @return synchronousCharge
  **/
  @ApiModelProperty(value = "The charge to process the payment synchronously.")
  public Long getSynchronousCharge() {
    return synchronousCharge;
  }

  
   /**
   * The date and time when the charge flow level will expire.
   * @return timeoutOn
  **/
  @ApiModelProperty(value = "The date and time when the charge flow level will expire.")
  public OffsetDateTime getTimeoutOn() {
    return timeoutOn;
  }

  
   /**
   * The charge to process the payment using a token.
   * @return tokenCharge
  **/
  @ApiModelProperty(value = "The charge to process the payment using a token.")
  public Long getTokenCharge() {
    return tokenCharge;
  }

  
   /**
   * The transaction that the charge flow level belongs to.
   * @return transaction
  **/
  @ApiModelProperty(value = "The transaction that the charge flow level belongs to.")
  public Transaction getTransaction() {
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
    ChargeFlowLevel chargeFlowLevel = (ChargeFlowLevel) o;
    return Objects.equals(this.asynchronousCharge, chargeFlowLevel.asynchronousCharge) &&
        Objects.equals(this._configuration, chargeFlowLevel._configuration) &&
        Objects.equals(this.createdOn, chargeFlowLevel.createdOn) &&
        Objects.equals(this.id, chargeFlowLevel.id) &&
        Objects.equals(this.linkedSpaceId, chargeFlowLevel.linkedSpaceId) &&
        Objects.equals(this.linkedTransaction, chargeFlowLevel.linkedTransaction) &&
        Objects.equals(this.plannedPurgeDate, chargeFlowLevel.plannedPurgeDate) &&
        Objects.equals(this.state, chargeFlowLevel.state) &&
        Objects.equals(this.synchronousCharge, chargeFlowLevel.synchronousCharge) &&
        Objects.equals(this.timeoutOn, chargeFlowLevel.timeoutOn) &&
        Objects.equals(this.tokenCharge, chargeFlowLevel.tokenCharge) &&
        Objects.equals(this.transaction, chargeFlowLevel.transaction) &&
        Objects.equals(this.version, chargeFlowLevel.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asynchronousCharge, _configuration, createdOn, id, linkedSpaceId, linkedTransaction, plannedPurgeDate, state, synchronousCharge, timeoutOn, tokenCharge, transaction, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeFlowLevel {\n");
    
    sb.append("    asynchronousCharge: ").append(toIndentedString(asynchronousCharge)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

