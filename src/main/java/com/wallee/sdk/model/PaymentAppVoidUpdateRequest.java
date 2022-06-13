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
import com.wallee.sdk.model.PaymentAppVoidTargetState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * The void update request allows to change the state of a void. The void must be linked with a processor that was created by the payment Web App that invokes the operation.
 */
@ApiModel(description = "The void update request allows to change the state of a void. The void must be linked with a processor that was created by the payment Web App that invokes the operation.")

public class PaymentAppVoidUpdateRequest {
  
  @JsonProperty("failureReasonId")
  protected Long failureReasonId = null;

  
  @JsonProperty("reference")
  protected String reference = null;

  
  @JsonProperty("targetState")
  protected PaymentAppVoidTargetState targetState = null;

  
  @JsonProperty("voidId")
  protected Long voidId = null;

  
  
  public PaymentAppVoidUpdateRequest failureReasonId(Long failureReasonId) {
    this.failureReasonId = failureReasonId;
    return this;
  }

   /**
   * The failure reason indicates why the void failed. It is required when the target state is FAILED.
   * @return failureReasonId
  **/
  @ApiModelProperty(value = "The failure reason indicates why the void failed. It is required when the target state is FAILED.")
  public Long getFailureReasonId() {
    return failureReasonId;
  }

  public void setFailureReasonId(Long failureReasonId) {
    this.failureReasonId = failureReasonId;
  }

  
  public PaymentAppVoidUpdateRequest reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * The reference identifies the void within the systems of the external service provider. It is required when the target state is SUCCESSFUL.
   * @return reference
  **/
  @ApiModelProperty(value = "The reference identifies the void within the systems of the external service provider. It is required when the target state is SUCCESSFUL.")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  
  public PaymentAppVoidUpdateRequest targetState(PaymentAppVoidTargetState targetState) {
    this.targetState = targetState;
    return this;
  }

   /**
   * The target state defines the state into which the void should be switched into. Once the void changed the state it will not be possible to change it again.
   * @return targetState
  **/
  @ApiModelProperty(value = "The target state defines the state into which the void should be switched into. Once the void changed the state it will not be possible to change it again.")
  public PaymentAppVoidTargetState getTargetState() {
    return targetState;
  }

  public void setTargetState(PaymentAppVoidTargetState targetState) {
    this.targetState = targetState;
  }

  
  public PaymentAppVoidUpdateRequest voidId(Long voidId) {
    this.voidId = voidId;
    return this;
  }

   /**
   * This is the ID of the void that should be updated.
   * @return voidId
  **/
  @ApiModelProperty(value = "This is the ID of the void that should be updated.")
  public Long getVoidId() {
    return voidId;
  }

  public void setVoidId(Long voidId) {
    this.voidId = voidId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAppVoidUpdateRequest paymentAppVoidUpdateRequest = (PaymentAppVoidUpdateRequest) o;
    return Objects.equals(this.failureReasonId, paymentAppVoidUpdateRequest.failureReasonId) &&
        Objects.equals(this.reference, paymentAppVoidUpdateRequest.reference) &&
        Objects.equals(this.targetState, paymentAppVoidUpdateRequest.targetState) &&
        Objects.equals(this.voidId, paymentAppVoidUpdateRequest.voidId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failureReasonId, reference, targetState, voidId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAppVoidUpdateRequest {\n");
    
    sb.append("    failureReasonId: ").append(toIndentedString(failureReasonId)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    targetState: ").append(toIndentedString(targetState)).append("\n");
    sb.append("    voidId: ").append(toIndentedString(voidId)).append("\n");
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

