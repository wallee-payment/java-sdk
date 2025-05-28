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
import com.wallee.sdk.model.CardholderAuthentication;
import com.wallee.sdk.model.TokenizedCardData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class AuthenticatedCardData extends TokenizedCardData {
  
  @JsonProperty("cardholderAuthentication")
  protected CardholderAuthentication cardholderAuthentication = null;

  
  
   /**
   * Optional authentication details for the cardholder, such as 3D Secure authentication, used when the cardholder has already been verified during the transaction for added security.
   * @return cardholderAuthentication
  **/
  @ApiModelProperty(value = "Optional authentication details for the cardholder, such as 3D Secure authentication, used when the cardholder has already been verified during the transaction for added security.")
  public CardholderAuthentication getCardholderAuthentication() {
    return cardholderAuthentication;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticatedCardData authenticatedCardData = (AuthenticatedCardData) o;
    return Objects.equals(this.cryptogram, authenticatedCardData.cryptogram) &&
        Objects.equals(this.initialRecurringTransaction, authenticatedCardData.initialRecurringTransaction) &&
        Objects.equals(this.recurringIndicator, authenticatedCardData.recurringIndicator) &&
        Objects.equals(this.tokenRequestorId, authenticatedCardData.tokenRequestorId) &&
        Objects.equals(this.cardholderAuthentication, authenticatedCardData.cardholderAuthentication) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cryptogram, initialRecurringTransaction, recurringIndicator, tokenRequestorId, cardholderAuthentication, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticatedCardData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    cryptogram: ").append(toIndentedString(cryptogram)).append("\n");
    sb.append("    initialRecurringTransaction: ").append(toIndentedString(initialRecurringTransaction)).append("\n");
    sb.append("    recurringIndicator: ").append(toIndentedString(recurringIndicator)).append("\n");
    sb.append("    tokenRequestorId: ").append(toIndentedString(tokenRequestorId)).append("\n");
    sb.append("    cardholderAuthentication: ").append(toIndentedString(cardholderAuthentication)).append("\n");
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

