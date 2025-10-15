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
import com.wallee.sdk.model.DunningCaseState;
import com.wallee.sdk.model.DunningFlow;
import com.wallee.sdk.model.TransactionInvoice;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class DunningCase {
  
  @JsonProperty("canceledOn")
  protected OffsetDateTime canceledOn = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("derecognizedOn")
  protected OffsetDateTime derecognizedOn = null;

  
  @JsonProperty("failedOn")
  protected OffsetDateTime failedOn = null;

  
  @JsonProperty("flow")
  protected DunningFlow flow = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("initialInvoice")
  protected TransactionInvoice initialInvoice = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("linkedTransaction")
  protected Long linkedTransaction = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("state")
  protected DunningCaseState state = null;

  
  @JsonProperty("succeededOn")
  protected OffsetDateTime succeededOn = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * 
   * @return canceledOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCanceledOn() {
    return canceledOn;
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
   * 
   * @return derecognizedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDerecognizedOn() {
    return derecognizedOn;
  }

  
   /**
   * 
   * @return failedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getFailedOn() {
    return failedOn;
  }

  
   /**
   * 
   * @return flow
  **/
  @ApiModelProperty(value = "")
  public DunningFlow getFlow() {
    return flow;
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
   * 
   * @return initialInvoice
  **/
  @ApiModelProperty(value = "")
  public TransactionInvoice getInitialInvoice() {
    return initialInvoice;
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
  public DunningCaseState getState() {
    return state;
  }

  
   /**
   * 
   * @return succeededOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getSucceededOn() {
    return succeededOn;
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
    DunningCase dunningCase = (DunningCase) o;
    return Objects.equals(this.canceledOn, dunningCase.canceledOn) &&
        Objects.equals(this.createdOn, dunningCase.createdOn) &&
        Objects.equals(this.derecognizedOn, dunningCase.derecognizedOn) &&
        Objects.equals(this.failedOn, dunningCase.failedOn) &&
        Objects.equals(this.flow, dunningCase.flow) &&
        Objects.equals(this.id, dunningCase.id) &&
        Objects.equals(this.initialInvoice, dunningCase.initialInvoice) &&
        Objects.equals(this.linkedSpaceId, dunningCase.linkedSpaceId) &&
        Objects.equals(this.linkedTransaction, dunningCase.linkedTransaction) &&
        Objects.equals(this.plannedPurgeDate, dunningCase.plannedPurgeDate) &&
        Objects.equals(this.state, dunningCase.state) &&
        Objects.equals(this.succeededOn, dunningCase.succeededOn) &&
        Objects.equals(this.version, dunningCase.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canceledOn, createdOn, derecognizedOn, failedOn, flow, id, initialInvoice, linkedSpaceId, linkedTransaction, plannedPurgeDate, state, succeededOn, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DunningCase {\n");
    
    sb.append("    canceledOn: ").append(toIndentedString(canceledOn)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    derecognizedOn: ").append(toIndentedString(derecognizedOn)).append("\n");
    sb.append("    failedOn: ").append(toIndentedString(failedOn)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    initialInvoice: ").append(toIndentedString(initialInvoice)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    succeededOn: ").append(toIndentedString(succeededOn)).append("\n");
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

