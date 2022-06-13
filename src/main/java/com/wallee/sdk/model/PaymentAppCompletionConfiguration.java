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

public class PaymentAppCompletionConfiguration {
  
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

  
  
   /**
   * The completion endpoint is invoked to request the payment service provider to execute a completion.
   * @return completionEndpoint
  **/
  @ApiModelProperty(value = "The completion endpoint is invoked to request the payment service provider to execute a completion.")
  public String getCompletionEndpoint() {
    return completionEndpoint;
  }

  
   /**
   * When the completion or the void is triggered we expect a feedback about the state of it. This timeout defines after how long we consider the void resp. completion as failed without receiving a final state update.
   * @return completionTimeoutInMinutes
  **/
  @ApiModelProperty(value = "When the completion or the void is triggered we expect a feedback about the state of it. This timeout defines after how long we consider the void resp. completion as failed without receiving a final state update.")
  public Integer getCompletionTimeoutInMinutes() {
    return completionTimeoutInMinutes;
  }

  
   /**
   * The completion resp. the void can be triggered a while after the authorization of the transaction has been executed. This delay defines how many days after the authorization the void resp. completion must be triggered at the latest.
   * @return maximalCompletionDelayInDays
  **/
  @ApiModelProperty(value = "The completion resp. the void can be triggered a while after the authorization of the transaction has been executed. This delay defines how many days after the authorization the void resp. completion must be triggered at the latest.")
  public Integer getMaximalCompletionDelayInDays() {
    return maximalCompletionDelayInDays;
  }

  
   /**
   * This flag indicates whether the connector supports multiple completions for a single transaction or not.
   * @return multipleCompletionsSupported
  **/
  @ApiModelProperty(value = "This flag indicates whether the connector supports multiple completions for a single transaction or not.")
  public Boolean isMultipleCompletionsSupported() {
    return multipleCompletionsSupported;
  }

  
   /**
   * The void endpoint is invoked to request the payment service provider to execute a void.
   * @return voidEndpoint
  **/
  @ApiModelProperty(value = "The void endpoint is invoked to request the payment service provider to execute a void.")
  public String getVoidEndpoint() {
    return voidEndpoint;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAppCompletionConfiguration paymentAppCompletionConfiguration = (PaymentAppCompletionConfiguration) o;
    return Objects.equals(this.completionEndpoint, paymentAppCompletionConfiguration.completionEndpoint) &&
        Objects.equals(this.completionTimeoutInMinutes, paymentAppCompletionConfiguration.completionTimeoutInMinutes) &&
        Objects.equals(this.maximalCompletionDelayInDays, paymentAppCompletionConfiguration.maximalCompletionDelayInDays) &&
        Objects.equals(this.multipleCompletionsSupported, paymentAppCompletionConfiguration.multipleCompletionsSupported) &&
        Objects.equals(this.voidEndpoint, paymentAppCompletionConfiguration.voidEndpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionEndpoint, completionTimeoutInMinutes, maximalCompletionDelayInDays, multipleCompletionsSupported, voidEndpoint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAppCompletionConfiguration {\n");
    
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

