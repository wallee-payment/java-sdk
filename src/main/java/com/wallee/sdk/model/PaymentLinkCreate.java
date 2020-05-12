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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wallee.sdk.model.AbstractPaymentLinkUpdate;
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.PaymentLinkProtectionMode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * The payment link defines an URL to automatically create transactions.
 */
@ApiModel(description = "The payment link defines an URL to automatically create transactions.")
@javax.annotation.Generated(value = "io.wallee.sdk.java.WalleeJavaClientCodegen", date = "2020-05-12T11:16:45.520+02:00")
public class PaymentLinkCreate extends AbstractPaymentLinkUpdate {
  
  @JsonProperty("state")
  protected CreationEntityState state = null;

  
  @JsonProperty("externalId")
  protected String externalId = null;

  
  @JsonProperty("protectionMode")
  protected PaymentLinkProtectionMode protectionMode = null;

  
  
  public PaymentLinkCreate state(CreationEntityState state) {
    this.state = state;
    return this;
  }

   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public CreationEntityState getState() {
    return state;
  }

  public void setState(CreationEntityState state) {
    this.state = state;
  }

  
  public PaymentLinkCreate externalId(String externalId) {
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

  
  public PaymentLinkCreate protectionMode(PaymentLinkProtectionMode protectionMode) {
    this.protectionMode = protectionMode;
    return this;
  }

   /**
   * The protection mode determines if the payment link is protected against tampering and in what way.
   * @return protectionMode
  **/
  @ApiModelProperty(value = "The protection mode determines if the payment link is protected against tampering and in what way.")
  public PaymentLinkProtectionMode getProtectionMode() {
    return protectionMode;
  }

  public void setProtectionMode(PaymentLinkProtectionMode protectionMode) {
    this.protectionMode = protectionMode;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentLinkCreate paymentLinkCreate = (PaymentLinkCreate) o;
    return Objects.equals(this.allowedPaymentMethodConfigurations, paymentLinkCreate.allowedPaymentMethodConfigurations) &&
        Objects.equals(this.appliedSpaceView, paymentLinkCreate.appliedSpaceView) &&
        Objects.equals(this.availableFrom, paymentLinkCreate.availableFrom) &&
        Objects.equals(this.availableUntil, paymentLinkCreate.availableUntil) &&
        Objects.equals(this.billingAddressRequired, paymentLinkCreate.billingAddressRequired) &&
        Objects.equals(this.currency, paymentLinkCreate.currency) &&
        Objects.equals(this.language, paymentLinkCreate.language) &&
        Objects.equals(this.lineItems, paymentLinkCreate.lineItems) &&
        Objects.equals(this.maximalNumberOfTransactions, paymentLinkCreate.maximalNumberOfTransactions) &&
        Objects.equals(this.name, paymentLinkCreate.name) &&
        Objects.equals(this.shippingAddressRequired, paymentLinkCreate.shippingAddressRequired) &&
        Objects.equals(this.state, paymentLinkCreate.state) &&
        Objects.equals(this.externalId, paymentLinkCreate.externalId) &&
        Objects.equals(this.protectionMode, paymentLinkCreate.protectionMode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedPaymentMethodConfigurations, appliedSpaceView, availableFrom, availableUntil, billingAddressRequired, currency, language, lineItems, maximalNumberOfTransactions, name, shippingAddressRequired, state, externalId, protectionMode, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentLinkCreate {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    allowedPaymentMethodConfigurations: ").append(toIndentedString(allowedPaymentMethodConfigurations)).append("\n");
    sb.append("    appliedSpaceView: ").append(toIndentedString(appliedSpaceView)).append("\n");
    sb.append("    availableFrom: ").append(toIndentedString(availableFrom)).append("\n");
    sb.append("    availableUntil: ").append(toIndentedString(availableUntil)).append("\n");
    sb.append("    billingAddressRequired: ").append(toIndentedString(billingAddressRequired)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    maximalNumberOfTransactions: ").append(toIndentedString(maximalNumberOfTransactions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shippingAddressRequired: ").append(toIndentedString(shippingAddressRequired)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    protectionMode: ").append(toIndentedString(protectionMode)).append("\n");
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

