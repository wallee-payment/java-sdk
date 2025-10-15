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
import com.wallee.sdk.model.DunningCase;
import com.wallee.sdk.model.DunningCaseLevelState;
import com.wallee.sdk.model.Environment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class DunningCaseLevel {
  
  @JsonProperty("canceledOn")
  protected OffsetDateTime canceledOn = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("dunningCase")
  protected DunningCase dunningCase = null;

  
  @JsonProperty("environment")
  protected Environment environment = null;

  
  @JsonProperty("failedOn")
  protected OffsetDateTime failedOn = null;

  
  @JsonProperty("flowLevel")
  protected Long flowLevel = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("invoice")
  protected Long invoice = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("linkedTransaction")
  protected Long linkedTransaction = null;

  
  @JsonProperty("mostRecentLevel")
  protected Boolean mostRecentLevel = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("state")
  protected DunningCaseLevelState state = null;

  
  @JsonProperty("succeededOn")
  protected OffsetDateTime succeededOn = null;

  
  @JsonProperty("timeoutOn")
  protected OffsetDateTime timeoutOn = null;

  
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
   * @return dunningCase
  **/
  @ApiModelProperty(value = "")
  public DunningCase getDunningCase() {
    return dunningCase;
  }

  
   /**
   * The environment used when rendering resources.
   * @return environment
  **/
  @ApiModelProperty(value = "The environment used when rendering resources.")
  public Environment getEnvironment() {
    return environment;
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
   * @return flowLevel
  **/
  @ApiModelProperty(value = "")
  public Long getFlowLevel() {
    return flowLevel;
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
   * @return invoice
  **/
  @ApiModelProperty(value = "")
  public Long getInvoice() {
    return invoice;
  }

  
   /**
   * The language that is linked to the object.
   * @return language
  **/
  @ApiModelProperty(value = "The language that is linked to the object.")
  public String getLanguage() {
    return language;
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
   * 
   * @return mostRecentLevel
  **/
  @ApiModelProperty(value = "")
  public Boolean isMostRecentLevel() {
    return mostRecentLevel;
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
  public DunningCaseLevelState getState() {
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
   * 
   * @return timeoutOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTimeoutOn() {
    return timeoutOn;
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
    DunningCaseLevel dunningCaseLevel = (DunningCaseLevel) o;
    return Objects.equals(this.canceledOn, dunningCaseLevel.canceledOn) &&
        Objects.equals(this.createdOn, dunningCaseLevel.createdOn) &&
        Objects.equals(this.dunningCase, dunningCaseLevel.dunningCase) &&
        Objects.equals(this.environment, dunningCaseLevel.environment) &&
        Objects.equals(this.failedOn, dunningCaseLevel.failedOn) &&
        Objects.equals(this.flowLevel, dunningCaseLevel.flowLevel) &&
        Objects.equals(this.id, dunningCaseLevel.id) &&
        Objects.equals(this.invoice, dunningCaseLevel.invoice) &&
        Objects.equals(this.language, dunningCaseLevel.language) &&
        Objects.equals(this.linkedSpaceId, dunningCaseLevel.linkedSpaceId) &&
        Objects.equals(this.linkedTransaction, dunningCaseLevel.linkedTransaction) &&
        Objects.equals(this.mostRecentLevel, dunningCaseLevel.mostRecentLevel) &&
        Objects.equals(this.plannedPurgeDate, dunningCaseLevel.plannedPurgeDate) &&
        Objects.equals(this.state, dunningCaseLevel.state) &&
        Objects.equals(this.succeededOn, dunningCaseLevel.succeededOn) &&
        Objects.equals(this.timeoutOn, dunningCaseLevel.timeoutOn) &&
        Objects.equals(this.version, dunningCaseLevel.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canceledOn, createdOn, dunningCase, environment, failedOn, flowLevel, id, invoice, language, linkedSpaceId, linkedTransaction, mostRecentLevel, plannedPurgeDate, state, succeededOn, timeoutOn, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DunningCaseLevel {\n");
    
    sb.append("    canceledOn: ").append(toIndentedString(canceledOn)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    dunningCase: ").append(toIndentedString(dunningCase)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    failedOn: ").append(toIndentedString(failedOn)).append("\n");
    sb.append("    flowLevel: ").append(toIndentedString(flowLevel)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    mostRecentLevel: ").append(toIndentedString(mostRecentLevel)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    succeededOn: ").append(toIndentedString(succeededOn)).append("\n");
    sb.append("    timeoutOn: ").append(toIndentedString(timeoutOn)).append("\n");
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

