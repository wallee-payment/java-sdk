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
import com.wallee.sdk.model.InvoiceReconciliationRecord;
import com.wallee.sdk.model.TransactionInvoice;
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

public class InvoiceReconciliationRecordInvoiceLink {
  
  @JsonProperty("amount")
  protected BigDecimal amount = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("invoice")
  protected TransactionInvoice invoice = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("record")
  protected InvoiceReconciliationRecord record = null;

  
  
   /**
   * 
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAmount() {
    return amount;
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
   * 
   * @return invoice
  **/
  @ApiModelProperty(value = "")
  public TransactionInvoice getInvoice() {
    return invoice;
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
   * 
   * @return record
  **/
  @ApiModelProperty(value = "")
  public InvoiceReconciliationRecord getRecord() {
    return record;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceReconciliationRecordInvoiceLink invoiceReconciliationRecordInvoiceLink = (InvoiceReconciliationRecordInvoiceLink) o;
    return Objects.equals(this.amount, invoiceReconciliationRecordInvoiceLink.amount) &&
        Objects.equals(this.createdOn, invoiceReconciliationRecordInvoiceLink.createdOn) &&
        Objects.equals(this.id, invoiceReconciliationRecordInvoiceLink.id) &&
        Objects.equals(this.invoice, invoiceReconciliationRecordInvoiceLink.invoice) &&
        Objects.equals(this.linkedSpaceId, invoiceReconciliationRecordInvoiceLink.linkedSpaceId) &&
        Objects.equals(this.record, invoiceReconciliationRecordInvoiceLink.record);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, createdOn, id, invoice, linkedSpaceId, record);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceReconciliationRecordInvoiceLink {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    record: ").append(toIndentedString(record)).append("\n");
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

