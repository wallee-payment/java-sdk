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
import com.wallee.sdk.model.PaymentAppChargeAttemptTargetState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * The charge attempt update request allows to change the state of a charge attempt. The charge attempt must be linked with a processor that was created by the payment Web App that invokes the operation.
 */
@ApiModel(description = "The charge attempt update request allows to change the state of a charge attempt. The charge attempt must be linked with a processor that was created by the payment Web App that invokes the operation.")

public class PaymentAppChargeAttemptUpdateRequest {
  
  @JsonProperty("chargeAttemptId")
  protected Long chargeAttemptId = null;

  
  @JsonProperty("endUserFailureMessage")
  protected String endUserFailureMessage = null;

  
  @JsonProperty("failureReasonId")
  protected Long failureReasonId = null;

  
  @JsonProperty("reference")
  protected String reference = null;

  
  @JsonProperty("targetState")
  protected PaymentAppChargeAttemptTargetState targetState = null;

  
  
  public PaymentAppChargeAttemptUpdateRequest chargeAttemptId(Long chargeAttemptId) {
    this.chargeAttemptId = chargeAttemptId;
    return this;
  }

   /**
   * This is the ID of the charge attempt that should be updated.
   * @return chargeAttemptId
  **/
  @ApiModelProperty(value = "This is the ID of the charge attempt that should be updated.")
  public Long getChargeAttemptId() {
    return chargeAttemptId;
  }

  public void setChargeAttemptId(Long chargeAttemptId) {
    this.chargeAttemptId = chargeAttemptId;
  }

  
  public PaymentAppChargeAttemptUpdateRequest endUserFailureMessage(String endUserFailureMessage) {
    this.endUserFailureMessage = endUserFailureMessage;
    return this;
  }

   /**
   * The end user failure message indicates to the end user (buyer) why the payment failed. The message has to be in the language of the end user. The language is provided within the payment page invocation URL.
   * @return endUserFailureMessage
  **/
  @ApiModelProperty(value = "The end user failure message indicates to the end user (buyer) why the payment failed. The message has to be in the language of the end user. The language is provided within the payment page invocation URL.")
  public String getEndUserFailureMessage() {
    return endUserFailureMessage;
  }

  public void setEndUserFailureMessage(String endUserFailureMessage) {
    this.endUserFailureMessage = endUserFailureMessage;
  }

  
  public PaymentAppChargeAttemptUpdateRequest failureReasonId(Long failureReasonId) {
    this.failureReasonId = failureReasonId;
    return this;
  }

   /**
   * The failure reason indicates why the charge attempt failed. It is required when the target state is FAILED.
   * @return failureReasonId
  **/
  @ApiModelProperty(value = "The failure reason indicates why the charge attempt failed. It is required when the target state is FAILED.")
  public Long getFailureReasonId() {
    return failureReasonId;
  }

  public void setFailureReasonId(Long failureReasonId) {
    this.failureReasonId = failureReasonId;
  }

  
  public PaymentAppChargeAttemptUpdateRequest reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * The reference identifies the charge attempt within the systems of the external service provider. It is required when the target state is SUCCESSFUL.
   * @return reference
  **/
  @ApiModelProperty(value = "The reference identifies the charge attempt within the systems of the external service provider. It is required when the target state is SUCCESSFUL.")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  
  public PaymentAppChargeAttemptUpdateRequest targetState(PaymentAppChargeAttemptTargetState targetState) {
    this.targetState = targetState;
    return this;
  }

   /**
   * The target state defines the state into which the charge attempt should be switched into. Once the charge attempt changed the state it will not be possible to change it again.
   * @return targetState
  **/
  @ApiModelProperty(value = "The target state defines the state into which the charge attempt should be switched into. Once the charge attempt changed the state it will not be possible to change it again.")
  public PaymentAppChargeAttemptTargetState getTargetState() {
    return targetState;
  }

  public void setTargetState(PaymentAppChargeAttemptTargetState targetState) {
    this.targetState = targetState;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAppChargeAttemptUpdateRequest paymentAppChargeAttemptUpdateRequest = (PaymentAppChargeAttemptUpdateRequest) o;
    return Objects.equals(this.chargeAttemptId, paymentAppChargeAttemptUpdateRequest.chargeAttemptId) &&
        Objects.equals(this.endUserFailureMessage, paymentAppChargeAttemptUpdateRequest.endUserFailureMessage) &&
        Objects.equals(this.failureReasonId, paymentAppChargeAttemptUpdateRequest.failureReasonId) &&
        Objects.equals(this.reference, paymentAppChargeAttemptUpdateRequest.reference) &&
        Objects.equals(this.targetState, paymentAppChargeAttemptUpdateRequest.targetState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeAttemptId, endUserFailureMessage, failureReasonId, reference, targetState);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAppChargeAttemptUpdateRequest {\n");
    
    sb.append("    chargeAttemptId: ").append(toIndentedString(chargeAttemptId)).append("\n");
    sb.append("    endUserFailureMessage: ").append(toIndentedString(endUserFailureMessage)).append("\n");
    sb.append("    failureReasonId: ").append(toIndentedString(failureReasonId)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    targetState: ").append(toIndentedString(targetState)).append("\n");
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

