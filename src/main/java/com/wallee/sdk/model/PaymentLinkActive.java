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
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.PaymentLinkUpdate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * The payment link defines an URL to automatically create transactions.
 */
@ApiModel(description = "The payment link defines an URL to automatically create transactions.")

public class PaymentLinkActive extends PaymentLinkUpdate {
  
  @JsonProperty("state")
  protected CreationEntityState state = null;

  
  
  public PaymentLinkActive state(CreationEntityState state) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentLinkActive paymentLinkActive = (PaymentLinkActive) o;
    return Objects.equals(this.id, paymentLinkActive.id) &&
        Objects.equals(this.version, paymentLinkActive.version) &&
        Objects.equals(this.allowedPaymentMethodConfigurations, paymentLinkActive.allowedPaymentMethodConfigurations) &&
        Objects.equals(this.appliedSpaceView, paymentLinkActive.appliedSpaceView) &&
        Objects.equals(this.availableFrom, paymentLinkActive.availableFrom) &&
        Objects.equals(this.availableUntil, paymentLinkActive.availableUntil) &&
        Objects.equals(this.billingAddressHandlingMode, paymentLinkActive.billingAddressHandlingMode) &&
        Objects.equals(this.currency, paymentLinkActive.currency) &&
        Objects.equals(this.language, paymentLinkActive.language) &&
        Objects.equals(this.lineItems, paymentLinkActive.lineItems) &&
        Objects.equals(this.maximalNumberOfTransactions, paymentLinkActive.maximalNumberOfTransactions) &&
        Objects.equals(this.name, paymentLinkActive.name) &&
        Objects.equals(this.shippingAddressHandlingMode, paymentLinkActive.shippingAddressHandlingMode) &&
        Objects.equals(this.state, paymentLinkActive.state) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, allowedPaymentMethodConfigurations, appliedSpaceView, availableFrom, availableUntil, billingAddressHandlingMode, currency, language, lineItems, maximalNumberOfTransactions, name, shippingAddressHandlingMode, state, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentLinkActive {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    allowedPaymentMethodConfigurations: ").append(toIndentedString(allowedPaymentMethodConfigurations)).append("\n");
    sb.append("    appliedSpaceView: ").append(toIndentedString(appliedSpaceView)).append("\n");
    sb.append("    availableFrom: ").append(toIndentedString(availableFrom)).append("\n");
    sb.append("    availableUntil: ").append(toIndentedString(availableUntil)).append("\n");
    sb.append("    billingAddressHandlingMode: ").append(toIndentedString(billingAddressHandlingMode)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    maximalNumberOfTransactions: ").append(toIndentedString(maximalNumberOfTransactions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shippingAddressHandlingMode: ").append(toIndentedString(shippingAddressHandlingMode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

