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

public class ExternalTransferBankTransaction {
  
  @JsonProperty("bankTransaction")
  protected BankTransaction bankTransaction = null;

  
  @JsonProperty("externalAccountIdentifier")
  protected String externalAccountIdentifier = null;

  
  @JsonProperty("externalAccountType")
  protected String externalAccountType = null;

  
  @JsonProperty("externalBankName")
  protected String externalBankName = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * 
   * @return bankTransaction
  **/
  @ApiModelProperty(value = "")
  public BankTransaction getBankTransaction() {
    return bankTransaction;
  }

  
   /**
   * 
   * @return externalAccountIdentifier
  **/
  @ApiModelProperty(value = "")
  public String getExternalAccountIdentifier() {
    return externalAccountIdentifier;
  }

  
   /**
   * 
   * @return externalAccountType
  **/
  @ApiModelProperty(value = "")
  public String getExternalAccountType() {
    return externalAccountType;
  }

  
   /**
   * 
   * @return externalBankName
  **/
  @ApiModelProperty(value = "")
  public String getExternalBankName() {
    return externalBankName;
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
    ExternalTransferBankTransaction externalTransferBankTransaction = (ExternalTransferBankTransaction) o;
    return Objects.equals(this.bankTransaction, externalTransferBankTransaction.bankTransaction) &&
        Objects.equals(this.externalAccountIdentifier, externalTransferBankTransaction.externalAccountIdentifier) &&
        Objects.equals(this.externalAccountType, externalTransferBankTransaction.externalAccountType) &&
        Objects.equals(this.externalBankName, externalTransferBankTransaction.externalBankName) &&
        Objects.equals(this.id, externalTransferBankTransaction.id) &&
        Objects.equals(this.linkedSpaceId, externalTransferBankTransaction.linkedSpaceId) &&
        Objects.equals(this.version, externalTransferBankTransaction.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankTransaction, externalAccountIdentifier, externalAccountType, externalBankName, id, linkedSpaceId, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalTransferBankTransaction {\n");
    
    sb.append("    bankTransaction: ").append(toIndentedString(bankTransaction)).append("\n");
    sb.append("    externalAccountIdentifier: ").append(toIndentedString(externalAccountIdentifier)).append("\n");
    sb.append("    externalAccountType: ").append(toIndentedString(externalAccountType)).append("\n");
    sb.append("    externalBankName: ").append(toIndentedString(externalBankName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
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

