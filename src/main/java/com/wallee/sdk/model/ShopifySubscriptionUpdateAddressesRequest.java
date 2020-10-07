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

public class ShopifySubscriptionUpdateAddressesRequest {
  
  @JsonProperty("billingAddress")
  protected ShopifySubscriptionAddressCreate billingAddress;

  
  @JsonProperty("id")
  protected Long id;

  
  @JsonProperty("shippingAddress")
  protected ShopifySubscriptionAddressCreate shippingAddress;

  
  
  public ShopifySubscriptionUpdateAddressesRequest billingAddress(ShopifySubscriptionAddressCreate billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * 
   * @return billingAddress
  **/
  @ApiModelProperty(value = "")
  public ShopifySubscriptionAddressCreate getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(ShopifySubscriptionAddressCreate billingAddress) {
    this.billingAddress = billingAddress;
  }

  
  public ShopifySubscriptionUpdateAddressesRequest id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  
  public ShopifySubscriptionUpdateAddressesRequest shippingAddress(ShopifySubscriptionAddressCreate shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * 
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "")
  public ShopifySubscriptionAddressCreate getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(ShopifySubscriptionAddressCreate shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopifySubscriptionUpdateAddressesRequest shopifySubscriptionUpdateAddressesRequest = (ShopifySubscriptionUpdateAddressesRequest) o;
    return Objects.equals(this.billingAddress, shopifySubscriptionUpdateAddressesRequest.billingAddress) &&
        Objects.equals(this.id, shopifySubscriptionUpdateAddressesRequest.id) &&
        Objects.equals(this.shippingAddress, shopifySubscriptionUpdateAddressesRequest.shippingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, id, shippingAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopifySubscriptionUpdateAddressesRequest {\n");
    
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

