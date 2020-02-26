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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.wallee.sdk.model.AbstractCustomerCommentActive;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
public class CustomerCommentCreate extends AbstractCustomerCommentActive {
  
  @SerializedName("customer")
  protected Long customer = null;

  
  
  public CustomerCommentCreate customer(Long customer) {
    this.customer = customer;
    return this;
  }

   /**
   * 
   * @return customer
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getCustomer() {
    return customer;
  }

  public void setCustomer(Long customer) {
    this.customer = customer;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerCommentCreate customerCommentCreate = (CustomerCommentCreate) o;
    return Objects.equals(this.content, customerCommentCreate.content) &&
        Objects.equals(this.customer, customerCommentCreate.customer) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, customer, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerCommentCreate {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
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

