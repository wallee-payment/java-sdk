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

public class CardCryptogram {
  
  @JsonProperty("eci")
  protected String eci = null;

  
  @JsonProperty("value")
  protected String value = null;

  
  
   /**
   * The Electronic Commerce Indicator (ECI) represents the authentication level and indicates liability shift during online or card-not-present transactions.
   * @return eci
  **/
  @ApiModelProperty(value = "The Electronic Commerce Indicator (ECI) represents the authentication level and indicates liability shift during online or card-not-present transactions.")
  public String getEci() {
    return eci;
  }

  
   /**
   * The cryptogram value used for securing card transactions, format varying based on the PAN type.
   * @return value
  **/
  @ApiModelProperty(value = "The cryptogram value used for securing card transactions, format varying based on the PAN type.")
  public String getValue() {
    return value;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardCryptogram cardCryptogram = (CardCryptogram) o;
    return Objects.equals(this.eci, cardCryptogram.eci) &&
        Objects.equals(this.value, cardCryptogram.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eci, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardCryptogram {\n");
    
    sb.append("    eci: ").append(toIndentedString(eci)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

