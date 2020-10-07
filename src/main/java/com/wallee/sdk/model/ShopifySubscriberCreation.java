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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
@ApiModel(description = "")

public class ShopifySubscriberCreation {
  
  @JsonProperty("emailAddress")
  protected String emailAddress;

  
  @JsonProperty("phoneNumber")
  protected String phoneNumber;

  
  @JsonProperty("shopifyCustomerId")
  protected String shopifyCustomerId;

  
  
  public ShopifySubscriberCreation emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * 
   * @return emailAddress
  **/
  @ApiModelProperty(value = "")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  
  public ShopifySubscriberCreation phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * 
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  
  public ShopifySubscriberCreation shopifyCustomerId(String shopifyCustomerId) {
    this.shopifyCustomerId = shopifyCustomerId;
    return this;
  }

   /**
   * The customer ID has to correspond to the ID assigned to the customer by Shopify. When the subscriber already exists no new subscriber will be created.
   * @return shopifyCustomerId
  **/
  @ApiModelProperty(required = true, value = "The customer ID has to correspond to the ID assigned to the customer by Shopify. When the subscriber already exists no new subscriber will be created.")
  public String getShopifyCustomerId() {
    return shopifyCustomerId;
  }

  public void setShopifyCustomerId(String shopifyCustomerId) {
    this.shopifyCustomerId = shopifyCustomerId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopifySubscriberCreation shopifySubscriberCreation = (ShopifySubscriberCreation) o;
    return Objects.equals(this.emailAddress, shopifySubscriberCreation.emailAddress) &&
        Objects.equals(this.phoneNumber, shopifySubscriberCreation.phoneNumber) &&
        Objects.equals(this.shopifyCustomerId, shopifySubscriberCreation.shopifyCustomerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, phoneNumber, shopifyCustomerId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopifySubscriberCreation {\n");
    
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    shopifyCustomerId: ").append(toIndentedString(shopifyCustomerId)).append("\n");
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

