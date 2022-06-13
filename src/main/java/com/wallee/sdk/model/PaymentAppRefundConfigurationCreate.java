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
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class PaymentAppRefundConfigurationCreate {
  
  @JsonProperty("multipleRefundsSupported")
  protected Boolean multipleRefundsSupported = null;

  
  @JsonProperty("refundEndpoint")
  protected String refundEndpoint = null;

  
  @JsonProperty("refundTimeoutInMinutes")
  protected Integer refundTimeoutInMinutes = null;

  
  
  public PaymentAppRefundConfigurationCreate multipleRefundsSupported(Boolean multipleRefundsSupported) {
    this.multipleRefundsSupported = multipleRefundsSupported;
    return this;
  }

   /**
   * This flag indicates whether the connector supports multiple refunds for a single transaction or not.
   * @return multipleRefundsSupported
  **/
  @ApiModelProperty(value = "This flag indicates whether the connector supports multiple refunds for a single transaction or not.")
  public Boolean isMultipleRefundsSupported() {
    return multipleRefundsSupported;
  }

  public void setMultipleRefundsSupported(Boolean multipleRefundsSupported) {
    this.multipleRefundsSupported = multipleRefundsSupported;
  }

  
  public PaymentAppRefundConfigurationCreate refundEndpoint(String refundEndpoint) {
    this.refundEndpoint = refundEndpoint;
    return this;
  }

   /**
   * The refund endpoint is invoked to request the payment service provider to execute a refund.
   * @return refundEndpoint
  **/
  @ApiModelProperty(value = "The refund endpoint is invoked to request the payment service provider to execute a refund.")
  public String getRefundEndpoint() {
    return refundEndpoint;
  }

  public void setRefundEndpoint(String refundEndpoint) {
    this.refundEndpoint = refundEndpoint;
  }

  
  public PaymentAppRefundConfigurationCreate refundTimeoutInMinutes(Integer refundTimeoutInMinutes) {
    this.refundTimeoutInMinutes = refundTimeoutInMinutes;
    return this;
  }

   /**
   * When the refund is triggered we expect a feedback about the state of it. This timeout defines after how long we consider the refund as failed without receiving a final state update.
   * @return refundTimeoutInMinutes
  **/
  @ApiModelProperty(value = "When the refund is triggered we expect a feedback about the state of it. This timeout defines after how long we consider the refund as failed without receiving a final state update.")
  public Integer getRefundTimeoutInMinutes() {
    return refundTimeoutInMinutes;
  }

  public void setRefundTimeoutInMinutes(Integer refundTimeoutInMinutes) {
    this.refundTimeoutInMinutes = refundTimeoutInMinutes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAppRefundConfigurationCreate paymentAppRefundConfigurationCreate = (PaymentAppRefundConfigurationCreate) o;
    return Objects.equals(this.multipleRefundsSupported, paymentAppRefundConfigurationCreate.multipleRefundsSupported) &&
        Objects.equals(this.refundEndpoint, paymentAppRefundConfigurationCreate.refundEndpoint) &&
        Objects.equals(this.refundTimeoutInMinutes, paymentAppRefundConfigurationCreate.refundTimeoutInMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multipleRefundsSupported, refundEndpoint, refundTimeoutInMinutes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAppRefundConfigurationCreate {\n");
    
    sb.append("    multipleRefundsSupported: ").append(toIndentedString(multipleRefundsSupported)).append("\n");
    sb.append("    refundEndpoint: ").append(toIndentedString(refundEndpoint)).append("\n");
    sb.append("    refundTimeoutInMinutes: ").append(toIndentedString(refundTimeoutInMinutes)).append("\n");
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

