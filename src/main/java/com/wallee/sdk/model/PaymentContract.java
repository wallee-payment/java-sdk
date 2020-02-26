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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.wallee.sdk.model.Account;
import com.wallee.sdk.model.FailureReason;
import com.wallee.sdk.model.PaymentContractState;
import com.wallee.sdk.model.PaymentContractType;
import com.wallee.sdk.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
public class PaymentContract {
  
  @SerializedName("account")
  protected Account account = null;

  
  @SerializedName("activatedOn")
  protected OffsetDateTime activatedOn = null;

  
  @SerializedName("contractIdentifier")
  protected String contractIdentifier = null;

  
  @SerializedName("contractType")
  protected PaymentContractType contractType = null;

  
  @SerializedName("createdBy")
  protected User createdBy = null;

  
  @SerializedName("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @SerializedName("externalId")
  protected String externalId = null;

  
  @SerializedName("id")
  protected Long id = null;

  
  @SerializedName("rejectedOn")
  protected OffsetDateTime rejectedOn = null;

  
  @SerializedName("rejectionReason")
  protected FailureReason rejectionReason = null;

  
  @SerializedName("startTerminatingOn")
  protected OffsetDateTime startTerminatingOn = null;

  
  @SerializedName("state")
  protected PaymentContractState state = null;

  
  @SerializedName("terminatedBy")
  protected User terminatedBy = null;

  
  @SerializedName("terminatedOn")
  protected OffsetDateTime terminatedOn = null;

  
  @SerializedName("version")
  protected Integer version = null;

  
  
   /**
   * 
   * @return account
  **/
  @ApiModelProperty(value = "")
  public Account getAccount() {
    return account;
  }

  
   /**
   * 
   * @return activatedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getActivatedOn() {
    return activatedOn;
  }

  
   /**
   * 
   * @return contractIdentifier
  **/
  @ApiModelProperty(value = "")
  public String getContractIdentifier() {
    return contractIdentifier;
  }

  
   /**
   * 
   * @return contractType
  **/
  @ApiModelProperty(value = "")
  public PaymentContractType getContractType() {
    return contractType;
  }

  
   /**
   * 
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public User getCreatedBy() {
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
   * The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
   * @return externalId
  **/
  @ApiModelProperty(value = "The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.")
  public String getExternalId() {
    return externalId;
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
   * 
   * @return rejectedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getRejectedOn() {
    return rejectedOn;
  }

  
   /**
   * 
   * @return rejectionReason
  **/
  @ApiModelProperty(value = "")
  public FailureReason getRejectionReason() {
    return rejectionReason;
  }

  
   /**
   * 
   * @return startTerminatingOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getStartTerminatingOn() {
    return startTerminatingOn;
  }

  
   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public PaymentContractState getState() {
    return state;
  }

  
   /**
   * 
   * @return terminatedBy
  **/
  @ApiModelProperty(value = "")
  public User getTerminatedBy() {
    return terminatedBy;
  }

  
   /**
   * 
   * @return terminatedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTerminatedOn() {
    return terminatedOn;
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
    PaymentContract paymentContract = (PaymentContract) o;
    return Objects.equals(this.account, paymentContract.account) &&
        Objects.equals(this.activatedOn, paymentContract.activatedOn) &&
        Objects.equals(this.contractIdentifier, paymentContract.contractIdentifier) &&
        Objects.equals(this.contractType, paymentContract.contractType) &&
        Objects.equals(this.createdBy, paymentContract.createdBy) &&
        Objects.equals(this.createdOn, paymentContract.createdOn) &&
        Objects.equals(this.externalId, paymentContract.externalId) &&
        Objects.equals(this.id, paymentContract.id) &&
        Objects.equals(this.rejectedOn, paymentContract.rejectedOn) &&
        Objects.equals(this.rejectionReason, paymentContract.rejectionReason) &&
        Objects.equals(this.startTerminatingOn, paymentContract.startTerminatingOn) &&
        Objects.equals(this.state, paymentContract.state) &&
        Objects.equals(this.terminatedBy, paymentContract.terminatedBy) &&
        Objects.equals(this.terminatedOn, paymentContract.terminatedOn) &&
        Objects.equals(this.version, paymentContract.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, activatedOn, contractIdentifier, contractType, createdBy, createdOn, externalId, id, rejectedOn, rejectionReason, startTerminatingOn, state, terminatedBy, terminatedOn, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContract {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    activatedOn: ").append(toIndentedString(activatedOn)).append("\n");
    sb.append("    contractIdentifier: ").append(toIndentedString(contractIdentifier)).append("\n");
    sb.append("    contractType: ").append(toIndentedString(contractType)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rejectedOn: ").append(toIndentedString(rejectedOn)).append("\n");
    sb.append("    rejectionReason: ").append(toIndentedString(rejectionReason)).append("\n");
    sb.append("    startTerminatingOn: ").append(toIndentedString(startTerminatingOn)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    terminatedBy: ").append(toIndentedString(terminatedBy)).append("\n");
    sb.append("    terminatedOn: ").append(toIndentedString(terminatedOn)).append("\n");
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

