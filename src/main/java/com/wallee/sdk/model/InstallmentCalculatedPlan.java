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
import com.wallee.sdk.model.InstallmentCalculatedSlice;
import com.wallee.sdk.model.InstallmentPlanConfiguration;
import com.wallee.sdk.model.PaymentMethodConfiguration;
import com.wallee.sdk.model.Transaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
public class InstallmentCalculatedPlan {
  
  @SerializedName("configuration")
  protected InstallmentPlanConfiguration _configuration = null;

  
  @SerializedName("paymentMethodConfigurations")
  protected List<PaymentMethodConfiguration> paymentMethodConfigurations = null;

  
  @SerializedName("slices")
  protected List<InstallmentCalculatedSlice> slices = null;

  
  @SerializedName("totalAmount")
  protected BigDecimal totalAmount = null;

  
  @SerializedName("transaction")
  protected Transaction transaction = null;

  
  
   /**
   * 
   * @return _configuration
  **/
  @ApiModelProperty(value = "")
  public InstallmentPlanConfiguration getConfiguration() {
    return _configuration;
  }

  
   /**
   * 
   * @return paymentMethodConfigurations
  **/
  @ApiModelProperty(value = "")
  public List<PaymentMethodConfiguration> getPaymentMethodConfigurations() {
    return paymentMethodConfigurations;
  }

  
   /**
   * 
   * @return slices
  **/
  @ApiModelProperty(value = "")
  public List<InstallmentCalculatedSlice> getSlices() {
    return slices;
  }

  
   /**
   * 
   * @return totalAmount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTotalAmount() {
    return totalAmount;
  }

  
   /**
   * 
   * @return transaction
  **/
  @ApiModelProperty(value = "")
  public Transaction getTransaction() {
    return transaction;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallmentCalculatedPlan installmentCalculatedPlan = (InstallmentCalculatedPlan) o;
    return Objects.equals(this._configuration, installmentCalculatedPlan._configuration) &&
        Objects.equals(this.paymentMethodConfigurations, installmentCalculatedPlan.paymentMethodConfigurations) &&
        Objects.equals(this.slices, installmentCalculatedPlan.slices) &&
        Objects.equals(this.totalAmount, installmentCalculatedPlan.totalAmount) &&
        Objects.equals(this.transaction, installmentCalculatedPlan.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_configuration, paymentMethodConfigurations, slices, totalAmount, transaction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallmentCalculatedPlan {\n");
    
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    paymentMethodConfigurations: ").append(toIndentedString(paymentMethodConfigurations)).append("\n");
    sb.append("    slices: ").append(toIndentedString(slices)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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

