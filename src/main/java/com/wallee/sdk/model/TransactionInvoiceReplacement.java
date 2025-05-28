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
import com.wallee.sdk.model.AddressCreate;
import com.wallee.sdk.model.LineItemCreate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class TransactionInvoiceReplacement {
  
  @JsonProperty("billingAddress")
  protected AddressCreate billingAddress = null;

  
  @JsonProperty("dueOn")
  protected OffsetDateTime dueOn = null;

  
  @JsonProperty("externalId")
  protected String externalId = null;

  
  @JsonProperty("lineItems")
  protected List<LineItemCreate> lineItems = new ArrayList<>();

  
  @JsonProperty("merchantReference")
  protected String merchantReference = null;

  
  @JsonProperty("sentToCustomer")
  protected Boolean sentToCustomer = null;

  
  
  public TransactionInvoiceReplacement billingAddress(AddressCreate billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * The address associated with the invoice, used for billing purposes.
   * @return billingAddress
  **/
  @ApiModelProperty(value = "The address associated with the invoice, used for billing purposes.")
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
   * The due date for payment of the invoice.
   * @return dueOn
  **/
  @ApiModelProperty(value = "The due date for payment of the invoice.")
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
   * A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.
   * @return externalId
  **/
  @ApiModelProperty(required = true, value = "A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.")
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
   * The invoiced line items that will appear on the invoice document.
   * @return lineItems
  **/
  @ApiModelProperty(required = true, value = "The invoiced line items that will appear on the invoice document.")
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
   * The merchant&#39;s reference used to identify the invoice.
   * @return merchantReference
  **/
  @ApiModelProperty(value = "The merchant's reference used to identify the invoice.")
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
   * Whether the invoice will be sent to the customer via email.
   * @return sentToCustomer
  **/
  @ApiModelProperty(value = "Whether the invoice will be sent to the customer via email.")
  public Boolean isSentToCustomer() {
    return sentToCustomer;
  }

  public void setSentToCustomer(Boolean sentToCustomer) {
    this.sentToCustomer = sentToCustomer;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

