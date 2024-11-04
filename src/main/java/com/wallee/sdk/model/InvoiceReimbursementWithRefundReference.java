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
import com.wallee.sdk.model.InvoiceReimbursement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class InvoiceReimbursementWithRefundReference extends InvoiceReimbursement {
  
  @JsonProperty("refundMerchantReference")
  protected String refundMerchantReference = null;

  
  
   /**
   * 
   * @return refundMerchantReference
  **/
  @ApiModelProperty(value = "")
  public String getRefundMerchantReference() {
    return refundMerchantReference;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceReimbursementWithRefundReference invoiceReimbursementWithRefundReference = (InvoiceReimbursementWithRefundReference) o;
    return Objects.equals(this.amount, invoiceReimbursementWithRefundReference.amount) &&
        Objects.equals(this.createdOn, invoiceReimbursementWithRefundReference.createdOn) &&
        Objects.equals(this.currency, invoiceReimbursementWithRefundReference.currency) &&
        Objects.equals(this.discardedBy, invoiceReimbursementWithRefundReference.discardedBy) &&
        Objects.equals(this.discardedOn, invoiceReimbursementWithRefundReference.discardedOn) &&
        Objects.equals(this.id, invoiceReimbursementWithRefundReference.id) &&
        Objects.equals(this.linkedSpaceId, invoiceReimbursementWithRefundReference.linkedSpaceId) &&
        Objects.equals(this.paymentConnectorConfiguration, invoiceReimbursementWithRefundReference.paymentConnectorConfiguration) &&
        Objects.equals(this.paymentInitiationAdviceFile, invoiceReimbursementWithRefundReference.paymentInitiationAdviceFile) &&
        Objects.equals(this.processedBy, invoiceReimbursementWithRefundReference.processedBy) &&
        Objects.equals(this.processedOn, invoiceReimbursementWithRefundReference.processedOn) &&
        Objects.equals(this.recipientCity, invoiceReimbursementWithRefundReference.recipientCity) &&
        Objects.equals(this.recipientCountry, invoiceReimbursementWithRefundReference.recipientCountry) &&
        Objects.equals(this.recipientFamilyName, invoiceReimbursementWithRefundReference.recipientFamilyName) &&
        Objects.equals(this.recipientGivenName, invoiceReimbursementWithRefundReference.recipientGivenName) &&
        Objects.equals(this.recipientIban, invoiceReimbursementWithRefundReference.recipientIban) &&
        Objects.equals(this.recipientOrganizationName, invoiceReimbursementWithRefundReference.recipientOrganizationName) &&
        Objects.equals(this.recipientPostcode, invoiceReimbursementWithRefundReference.recipientPostcode) &&
        Objects.equals(this.recipientStreet, invoiceReimbursementWithRefundReference.recipientStreet) &&
        Objects.equals(this.senderIban, invoiceReimbursementWithRefundReference.senderIban) &&
        Objects.equals(this.state, invoiceReimbursementWithRefundReference.state) &&
        Objects.equals(this.version, invoiceReimbursementWithRefundReference.version) &&
        Objects.equals(this.refundMerchantReference, invoiceReimbursementWithRefundReference.refundMerchantReference) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, createdOn, currency, discardedBy, discardedOn, id, linkedSpaceId, paymentConnectorConfiguration, paymentInitiationAdviceFile, processedBy, processedOn, recipientCity, recipientCountry, recipientFamilyName, recipientGivenName, recipientIban, recipientOrganizationName, recipientPostcode, recipientStreet, senderIban, state, version, refundMerchantReference, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceReimbursementWithRefundReference {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    discardedBy: ").append(toIndentedString(discardedBy)).append("\n");
    sb.append("    discardedOn: ").append(toIndentedString(discardedOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    paymentConnectorConfiguration: ").append(toIndentedString(paymentConnectorConfiguration)).append("\n");
    sb.append("    paymentInitiationAdviceFile: ").append(toIndentedString(paymentInitiationAdviceFile)).append("\n");
    sb.append("    processedBy: ").append(toIndentedString(processedBy)).append("\n");
    sb.append("    processedOn: ").append(toIndentedString(processedOn)).append("\n");
    sb.append("    recipientCity: ").append(toIndentedString(recipientCity)).append("\n");
    sb.append("    recipientCountry: ").append(toIndentedString(recipientCountry)).append("\n");
    sb.append("    recipientFamilyName: ").append(toIndentedString(recipientFamilyName)).append("\n");
    sb.append("    recipientGivenName: ").append(toIndentedString(recipientGivenName)).append("\n");
    sb.append("    recipientIban: ").append(toIndentedString(recipientIban)).append("\n");
    sb.append("    recipientOrganizationName: ").append(toIndentedString(recipientOrganizationName)).append("\n");
    sb.append("    recipientPostcode: ").append(toIndentedString(recipientPostcode)).append("\n");
    sb.append("    recipientStreet: ").append(toIndentedString(recipientStreet)).append("\n");
    sb.append("    senderIban: ").append(toIndentedString(senderIban)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    refundMerchantReference: ").append(toIndentedString(refundMerchantReference)).append("\n");
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

