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

public class RestCurrency {
  
  @JsonProperty("currencyCode")
  protected String currencyCode = null;

  
  @JsonProperty("fractionDigits")
  protected Integer fractionDigits = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("numericCode")
  protected Integer numericCode = null;

  
  
   /**
   * The currency&#39;s three-letter code (ISO 4217 format).
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The currency's three-letter code (ISO 4217 format).")
  public String getCurrencyCode() {
    return currencyCode;
  }

  
   /**
   * The currency&#39;s number of decimals. When calculating amounts in this currency, the fraction digits determine the accuracy.
   * @return fractionDigits
  **/
  @ApiModelProperty(value = "The currency's number of decimals. When calculating amounts in this currency, the fraction digits determine the accuracy.")
  public Integer getFractionDigits() {
    return fractionDigits;
  }

  
   /**
   * The name of the currency.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the currency.")
  public String getName() {
    return name;
  }

  
   /**
   * The currency&#39;s three-digit code (ISO 4217 format).
   * @return numericCode
  **/
  @ApiModelProperty(value = "The currency's three-digit code (ISO 4217 format).")
  public Integer getNumericCode() {
    return numericCode;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestCurrency restCurrency = (RestCurrency) o;
    return Objects.equals(this.currencyCode, restCurrency.currencyCode) &&
        Objects.equals(this.fractionDigits, restCurrency.fractionDigits) &&
        Objects.equals(this.name, restCurrency.name) &&
        Objects.equals(this.numericCode, restCurrency.numericCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, fractionDigits, name, numericCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestCurrency {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    fractionDigits: ").append(toIndentedString(fractionDigits)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numericCode: ").append(toIndentedString(numericCode)).append("\n");
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

