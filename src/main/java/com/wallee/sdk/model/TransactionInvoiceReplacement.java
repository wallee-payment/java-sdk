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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
@ApiModel(description = "")

public class TransactionInvoiceReplacement {
  
  @JsonProperty("billingAddress")
  protected AddressCreate billingAddress;

  
  @JsonProperty("dueOn")
  protected OffsetDateTime dueOn;

  
  @JsonProperty("externalId")
  protected String externalId;

  
  @JsonProperty("lineItems")
  protected List<LineItemCreate> lineItems = new ArrayList<>();

  
  @JsonProperty("merchantReference")
  protected String merchantReference;

  
  @JsonProperty("sentToCustomer")
  protected Boolean sentToCustomer;

  
  
  public TransactionInvoiceReplacement billingAddress(AddressCreate billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * 
   * @return billingAddress
  **/
  @ApiModelProperty(value = "")
  public AddressCreate getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(AddressCreate billingAddress) {
    this.billingAddress = billingAddress;
  }

  
  public TransactionInvoiceReplacement dueOn(OffsetDateTime dueOn) {
    this.dueOn = dueOn;
    return this;
  }

   /**
   * The date on which the invoice should be paid on.
   * @return dueOn
  **/
  @ApiModelProperty(value = "The date on which the invoice should be paid on.")
  public OffsetDateTime getDueOn() {
    return dueOn;
  }

  public void setDueOn(OffsetDateTime dueOn) {
    this.dueOn = dueOn;
  }

  
  public TransactionInvoiceReplacement externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
   * @return externalId
  **/
  @ApiModelProperty(required = true, value = "The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  
  public TransactionInvoiceReplacement lineItems(List<LineItemCreate> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public TransactionInvoiceReplacement addLineItemsItem(LineItemCreate lineItemsItem) {
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * 
   * @return lineItems
  **/
  @ApiModelProperty(required = true, value = "")
  public List<LineItemCreate> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<LineItemCreate> lineItems) {
    this.lineItems = lineItems;
  }

  
  public TransactionInvoiceReplacement merchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
    return this;
  }

   /**
   * 
   * @return merchantReference
  **/
  @ApiModelProperty(value = "")
  public String getMerchantReference() {
    return merchantReference;
  }

  public void setMerchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
  }

  
  public TransactionInvoiceReplacement sentToCustomer(Boolean sentToCustomer) {
    this.sentToCustomer = sentToCustomer;
    return this;
  }

   /**
   * When the connector is configured to send the invoice to the customer and this property is true the customer will receive an email with the updated invoice. When this property is false no invoice is sent.
   * @return sentToCustomer
  **/
  @ApiModelProperty(value = "When the connector is configured to send the invoice to the customer and this property is true the customer will receive an email with the updated invoice. When this property is false no invoice is sent.")
  public Boolean isSentToCustomer() {
    return sentToCustomer;
  }

  public void setSentToCustomer(Boolean sentToCustomer) {
    this.sentToCustomer = sentToCustomer;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionInvoiceReplacement transactionInvoiceReplacement = (TransactionInvoiceReplacement) o;
    return Objects.equals(this.billingAddress, transactionInvoiceReplacement.billingAddress) &&
        Objects.equals(this.dueOn, transactionInvoiceReplacement.dueOn) &&
        Objects.equals(this.externalId, transactionInvoiceReplacement.externalId) &&
        Objects.equals(this.lineItems, transactionInvoiceReplacement.lineItems) &&
        Objects.equals(this.merchantReference, transactionInvoiceReplacement.merchantReference) &&
        Objects.equals(this.sentToCustomer, transactionInvoiceReplacement.sentToCustomer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, dueOn, externalId, lineItems, merchantReference, sentToCustomer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionInvoiceReplacement {\n");
    
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    dueOn: ").append(toIndentedString(dueOn)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
    sb.append("    sentToCustomer: ").append(toIndentedString(sentToCustomer)).append("\n");
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

