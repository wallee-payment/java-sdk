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
import com.wallee.sdk.model.CardCryptogram;
import com.wallee.sdk.model.RecurringIndicator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * This model holds the card data in plain.
 */
@ApiModel(description = "This model holds the card data in plain.")

public class TokenizedCardData {
  
  @JsonProperty("cryptogram")
  protected CardCryptogram cryptogram = null;

  
  @JsonProperty("recurringIndicator")
  protected RecurringIndicator recurringIndicator = null;

  
  @JsonProperty("tokenRequestorId")
  protected String tokenRequestorId = null;

  
  
   /**
   * The additional authentication value used to secure the tokenized card transactions.
   * @return cryptogram
  **/
  @ApiModelProperty(value = "The additional authentication value used to secure the tokenized card transactions.")
  public CardCryptogram getCryptogram() {
    return cryptogram;
  }

  
   /**
   * 
   * @return recurringIndicator
  **/
  @ApiModelProperty(value = "")
  public RecurringIndicator getRecurringIndicator() {
    return recurringIndicator;
  }

  
   /**
   * 
   * @return tokenRequestorId
  **/
  @ApiModelProperty(value = "")
  public String getTokenRequestorId() {
    return tokenRequestorId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenizedCardData tokenizedCardData = (TokenizedCardData) o;
    return Objects.equals(this.cryptogram, tokenizedCardData.cryptogram) &&
        Objects.equals(this.recurringIndicator, tokenizedCardData.recurringIndicator) &&
        Objects.equals(this.tokenRequestorId, tokenizedCardData.tokenRequestorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cryptogram, recurringIndicator, tokenRequestorId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenizedCardData {\n");
    
    sb.append("    cryptogram: ").append(toIndentedString(cryptogram)).append("\n");
    sb.append("    recurringIndicator: ").append(toIndentedString(recurringIndicator)).append("\n");
    sb.append("    tokenRequestorId: ").append(toIndentedString(tokenRequestorId)).append("\n");
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

