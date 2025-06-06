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
import com.wallee.sdk.model.BankTransaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class InternalTransferBankTransaction {
  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("sourceBankTransaction")
  protected BankTransaction sourceBankTransaction = null;

  
  @JsonProperty("targetBankTransaction")
  protected BankTransaction targetBankTransaction = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
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
   * The bank transaction from which funds are being transferred out.
   * @return sourceBankTransaction
  **/
  @ApiModelProperty(value = "The bank transaction from which funds are being transferred out.")
  public BankTransaction getSourceBankTransaction() {
    return sourceBankTransaction;
  }

  
   /**
   * The bank transaction to which funds are being transferred in.
   * @return targetBankTransaction
  **/
  @ApiModelProperty(value = "The bank transaction to which funds are being transferred in.")
  public BankTransaction getTargetBankTransaction() {
    return targetBankTransaction;
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
    InternalTransferBankTransaction internalTransferBankTransaction = (InternalTransferBankTransaction) o;
    return Objects.equals(this.id, internalTransferBankTransaction.id) &&
        Objects.equals(this.linkedSpaceId, internalTransferBankTransaction.linkedSpaceId) &&
        Objects.equals(this.sourceBankTransaction, internalTransferBankTransaction.sourceBankTransaction) &&
        Objects.equals(this.targetBankTransaction, internalTransferBankTransaction.targetBankTransaction) &&
        Objects.equals(this.version, internalTransferBankTransaction.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, linkedSpaceId, sourceBankTransaction, targetBankTransaction, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalTransferBankTransaction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    sourceBankTransaction: ").append(toIndentedString(sourceBankTransaction)).append("\n");
    sb.append("    targetBankTransaction: ").append(toIndentedString(targetBankTransaction)).append("\n");
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

