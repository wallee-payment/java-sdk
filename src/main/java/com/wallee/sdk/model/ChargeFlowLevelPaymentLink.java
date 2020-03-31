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
import com.wallee.sdk.model.ChargeFlowLevel;
import com.wallee.sdk.model.TransactionAwareEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
public class ChargeFlowLevelPaymentLink extends TransactionAwareEntity {
  
  @SerializedName("chargeFlowLevel")
  protected ChargeFlowLevel chargeFlowLevel = null;

  
  @SerializedName("paymentLink")
  protected String paymentLink = null;

  
  
   /**
   * 
   * @return chargeFlowLevel
  **/
  @ApiModelProperty(value = "")
  public ChargeFlowLevel getChargeFlowLevel() {
    return chargeFlowLevel;
  }

  
   /**
   * 
   * @return paymentLink
  **/
  @ApiModelProperty(value = "")
  public String getPaymentLink() {
    return paymentLink;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeFlowLevelPaymentLink chargeFlowLevelPaymentLink = (ChargeFlowLevelPaymentLink) o;
    return Objects.equals(this.id, chargeFlowLevelPaymentLink.id) &&
        Objects.equals(this.linkedSpaceId, chargeFlowLevelPaymentLink.linkedSpaceId) &&
        Objects.equals(this.linkedTransaction, chargeFlowLevelPaymentLink.linkedTransaction) &&
        Objects.equals(this.chargeFlowLevel, chargeFlowLevelPaymentLink.chargeFlowLevel) &&
        Objects.equals(this.paymentLink, chargeFlowLevelPaymentLink.paymentLink) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, linkedSpaceId, linkedTransaction, chargeFlowLevel, paymentLink, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeFlowLevelPaymentLink {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    chargeFlowLevel: ").append(toIndentedString(chargeFlowLevel)).append("\n");
    sb.append("    paymentLink: ").append(toIndentedString(paymentLink)).append("\n");
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
