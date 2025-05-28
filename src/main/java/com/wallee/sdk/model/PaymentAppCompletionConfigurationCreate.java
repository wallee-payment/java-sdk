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

public class PaymentAppCompletionConfigurationCreate {
  
  @JsonProperty("completionEndpoint")
  protected String completionEndpoint = null;

  
  @JsonProperty("completionTimeoutInMinutes")
  protected Integer completionTimeoutInMinutes = null;

  
  @JsonProperty("maximalCompletionDelayInDays")
  protected Integer maximalCompletionDelayInDays = null;

  
  @JsonProperty("multipleCompletionsSupported")
  protected Boolean multipleCompletionsSupported = null;

  
  @JsonProperty("voidEndpoint")
  protected String voidEndpoint = null;

  
  
  public PaymentAppCompletionConfigurationCreate completionEndpoint(String completionEndpoint) {
    this.completionEndpoint = completionEndpoint;
    return this;
  }

   /**
   * The URL that the payment service provider will invoke to process a completion request. This endpoint handles communication with the provider for initiating and managing completions.
   * @return completionEndpoint
  **/
  @ApiModelProperty(value = "The URL that the payment service provider will invoke to process a completion request. This endpoint handles communication with the provider for initiating and managing completions.")
  public String getCompletionEndpoint() {
    return completionEndpoint;
  }

  public void setCompletionEndpoint(String completionEndpoint) {
    this.completionEndpoint = completionEndpoint;
  }

  
  public PaymentAppCompletionConfigurationCreate completionTimeoutInMinutes(Integer completionTimeoutInMinutes) {
    this.completionTimeoutInMinutes = completionTimeoutInMinutes;
    return this;
  }

   /**
   * The maximum time (in minutes) to wait for a response from the payment service provider after a completion request is triggered. If no feedback or final status is received within this period, the completion is considered failed.
   * @return completionTimeoutInMinutes
  **/
  @ApiModelProperty(value = "The maximum time (in minutes) to wait for a response from the payment service provider after a completion request is triggered. If no feedback or final status is received within this period, the completion is considered failed.")
  public Integer getCompletionTimeoutInMinutes() {
    return completionTimeoutInMinutes;
  }

  public void setCompletionTimeoutInMinutes(Integer completionTimeoutInMinutes) {
    this.completionTimeoutInMinutes = completionTimeoutInMinutes;
  }

  
  public PaymentAppCompletionConfigurationCreate maximalCompletionDelayInDays(Integer maximalCompletionDelayInDays) {
    this.maximalCompletionDelayInDays = maximalCompletionDelayInDays;
    return this;
  }

   /**
   * The maximum number of days after a transaction&#39;s authorization during which a completion or void action can be triggered. Once this period has passed, neither action can be executed.
   * @return maximalCompletionDelayInDays
  **/
  @ApiModelProperty(value = "The maximum number of days after a transaction's authorization during which a completion or void action can be triggered. Once this period has passed, neither action can be executed.")
  public Integer getMaximalCompletionDelayInDays() {
    return maximalCompletionDelayInDays;
  }

  public void setMaximalCompletionDelayInDays(Integer maximalCompletionDelayInDays) {
    this.maximalCompletionDelayInDays = maximalCompletionDelayInDays;
  }

  
  public PaymentAppCompletionConfigurationCreate multipleCompletionsSupported(Boolean multipleCompletionsSupported) {
    this.multipleCompletionsSupported = multipleCompletionsSupported;
    return this;
  }

   /**
   * Whether the payment connector can process multiple completions for a single transaction.
   * @return multipleCompletionsSupported
  **/
  @ApiModelProperty(value = "Whether the payment connector can process multiple completions for a single transaction.")
  public Boolean isMultipleCompletionsSupported() {
    return multipleCompletionsSupported;
  }

  public void setMultipleCompletionsSupported(Boolean multipleCompletionsSupported) {
    this.multipleCompletionsSupported = multipleCompletionsSupported;
  }

  
  public PaymentAppCompletionConfigurationCreate voidEndpoint(String voidEndpoint) {
    this.voidEndpoint = voidEndpoint;
    return this;
  }

   /**
   * The URL that the payment service provider will invoke to process a void request. This endpoint handles communication with the provider for initiating and managing voids.
   * @return voidEndpoint
  **/
  @ApiModelProperty(value = "The URL that the payment service provider will invoke to process a void request. This endpoint handles communication with the provider for initiating and managing voids.")
  public String getVoidEndpoint() {
    return voidEndpoint;
  }

  public void setVoidEndpoint(String voidEndpoint) {
    this.voidEndpoint = voidEndpoint;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAppCompletionConfigurationCreate paymentAppCompletionConfigurationCreate = (PaymentAppCompletionConfigurationCreate) o;
    return Objects.equals(this.completionEndpoint, paymentAppCompletionConfigurationCreate.completionEndpoint) &&
        Objects.equals(this.completionTimeoutInMinutes, paymentAppCompletionConfigurationCreate.completionTimeoutInMinutes) &&
        Objects.equals(this.maximalCompletionDelayInDays, paymentAppCompletionConfigurationCreate.maximalCompletionDelayInDays) &&
        Objects.equals(this.multipleCompletionsSupported, paymentAppCompletionConfigurationCreate.multipleCompletionsSupported) &&
        Objects.equals(this.voidEndpoint, paymentAppCompletionConfigurationCreate.voidEndpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionEndpoint, completionTimeoutInMinutes, maximalCompletionDelayInDays, multipleCompletionsSupported, voidEndpoint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAppCompletionConfigurationCreate {\n");
    
    sb.append("    completionEndpoint: ").append(toIndentedString(completionEndpoint)).append("\n");
    sb.append("    completionTimeoutInMinutes: ").append(toIndentedString(completionTimeoutInMinutes)).append("\n");
    sb.append("    maximalCompletionDelayInDays: ").append(toIndentedString(maximalCompletionDelayInDays)).append("\n");
    sb.append("    multipleCompletionsSupported: ").append(toIndentedString(multipleCompletionsSupported)).append("\n");
    sb.append("    voidEndpoint: ").append(toIndentedString(voidEndpoint)).append("\n");
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

