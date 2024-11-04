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
 * AbstractTokenUpdate
 */

public class AbstractTokenUpdate {
  
  @JsonProperty("customerEmailAddress")
  protected String customerEmailAddress = null;

  
  @JsonProperty("customerId")
  protected String customerId = null;

  
  @JsonProperty("enabledForOneClickPayment")
  protected Boolean enabledForOneClickPayment = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("timeZone")
  protected String timeZone = null;

  
  @JsonProperty("tokenReference")
  protected String tokenReference = null;

  
  
  public AbstractTokenUpdate customerEmailAddress(String customerEmailAddress) {
    this.customerEmailAddress = customerEmailAddress;
    return this;
  }

   /**
   * The customer&#39;s email address.
   * @return customerEmailAddress
  **/
  @ApiModelProperty(value = "The customer's email address.")
  public String getCustomerEmailAddress() {
    return customerEmailAddress;
  }

  public void setCustomerEmailAddress(String customerEmailAddress) {
    this.customerEmailAddress = customerEmailAddress;
  }

  
  public AbstractTokenUpdate customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * The unique identifier of the customer in the external system.
   * @return customerId
  **/
  @ApiModelProperty(value = "The unique identifier of the customer in the external system.")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  
  public AbstractTokenUpdate enabledForOneClickPayment(Boolean enabledForOneClickPayment) {
    this.enabledForOneClickPayment = enabledForOneClickPayment;
    return this;
  }

   /**
   * Whether the token is enabled for one-click payments, which simplify the payment process for the customer. One-click tokens are linked to customers via the customer ID.
   * @return enabledForOneClickPayment
  **/
  @ApiModelProperty(value = "Whether the token is enabled for one-click payments, which simplify the payment process for the customer. One-click tokens are linked to customers via the customer ID.")
  public Boolean isEnabledForOneClickPayment() {
    return enabledForOneClickPayment;
  }

  public void setEnabledForOneClickPayment(Boolean enabledForOneClickPayment) {
    this.enabledForOneClickPayment = enabledForOneClickPayment;
  }

  
  public AbstractTokenUpdate language(String language) {
    this.language = language;
    return this;
  }

   /**
   * The language that is linked to the object.
   * @return language
  **/
  @ApiModelProperty(value = "The language that is linked to the object.")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  
  public AbstractTokenUpdate timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * The customer&#39;s time zone, which affects how dates and times are formatted when communicating with the customer.
   * @return timeZone
  **/
  @ApiModelProperty(value = "The customer's time zone, which affects how dates and times are formatted when communicating with the customer.")
  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  
  public AbstractTokenUpdate tokenReference(String tokenReference) {
    this.tokenReference = tokenReference;
    return this;
  }

   /**
   * The reference used to identify the payment token (e.g. the customer&#39;s ID or email address).
   * @return tokenReference
  **/
  @ApiModelProperty(value = "The reference used to identify the payment token (e.g. the customer's ID or email address).")
  public String getTokenReference() {
    return tokenReference;
  }

  public void setTokenReference(String tokenReference) {
    this.tokenReference = tokenReference;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractTokenUpdate abstractTokenUpdate = (AbstractTokenUpdate) o;
    return Objects.equals(this.customerEmailAddress, abstractTokenUpdate.customerEmailAddress) &&
        Objects.equals(this.customerId, abstractTokenUpdate.customerId) &&
        Objects.equals(this.enabledForOneClickPayment, abstractTokenUpdate.enabledForOneClickPayment) &&
        Objects.equals(this.language, abstractTokenUpdate.language) &&
        Objects.equals(this.timeZone, abstractTokenUpdate.timeZone) &&
        Objects.equals(this.tokenReference, abstractTokenUpdate.tokenReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerEmailAddress, customerId, enabledForOneClickPayment, language, timeZone, tokenReference);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractTokenUpdate {\n");
    
    sb.append("    customerEmailAddress: ").append(toIndentedString(customerEmailAddress)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    enabledForOneClickPayment: ").append(toIndentedString(enabledForOneClickPayment)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    tokenReference: ").append(toIndentedString(tokenReference)).append("\n");
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

