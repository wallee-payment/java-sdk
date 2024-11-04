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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class DebtCollectionReceipt {
  
  @JsonProperty("amount")
  protected BigDecimal amount = null;

  
  @JsonProperty("createdBy")
  protected Long createdBy = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("debtCollectionCase")
  protected Long debtCollectionCase = null;

  
  @JsonProperty("externalId")
  protected String externalId = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("source")
  protected Long source = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The amount that was collected.
   * @return amount
  **/
  @ApiModelProperty(value = "The amount that was collected.")
  public BigDecimal getAmount() {
    return amount;
  }

  
   /**
   * The ID of the user the receipt was created by.
   * @return createdBy
  **/
  @ApiModelProperty(value = "The ID of the user the receipt was created by.")
  public Long getCreatedBy() {
    return createdBy;
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
   * The debt collection case that this document belongs to.
   * @return debtCollectionCase
  **/
  @ApiModelProperty(value = "The debt collection case that this document belongs to.")
  public Long getDebtCollectionCase() {
    return debtCollectionCase;
  }

  
   /**
   * A client-generated nonce which uniquely identifies the receipt.Subsequent requests with the same external ID do not lead to the creation of another receipt, but return the original one.
   * @return externalId
  **/
  @ApiModelProperty(value = "A client-generated nonce which uniquely identifies the receipt.Subsequent requests with the same external ID do not lead to the creation of another receipt, but return the original one.")
  public String getExternalId() {
    return externalId;
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
   * The source stating where the receipt is coming from.
   * @return source
  **/
  @ApiModelProperty(value = "The source stating where the receipt is coming from.")
  public Long getSource() {
    return source;
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
    DebtCollectionReceipt debtCollectionReceipt = (DebtCollectionReceipt) o;
    return Objects.equals(this.amount, debtCollectionReceipt.amount) &&
        Objects.equals(this.createdBy, debtCollectionReceipt.createdBy) &&
        Objects.equals(this.createdOn, debtCollectionReceipt.createdOn) &&
        Objects.equals(this.debtCollectionCase, debtCollectionReceipt.debtCollectionCase) &&
        Objects.equals(this.externalId, debtCollectionReceipt.externalId) &&
        Objects.equals(this.id, debtCollectionReceipt.id) &&
        Objects.equals(this.linkedSpaceId, debtCollectionReceipt.linkedSpaceId) &&
        Objects.equals(this.plannedPurgeDate, debtCollectionReceipt.plannedPurgeDate) &&
        Objects.equals(this.source, debtCollectionReceipt.source) &&
        Objects.equals(this.version, debtCollectionReceipt.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, createdBy, createdOn, debtCollectionCase, externalId, id, linkedSpaceId, plannedPurgeDate, source, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebtCollectionReceipt {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    debtCollectionCase: ").append(toIndentedString(debtCollectionCase)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

