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
import com.wallee.sdk.model.RestAddressFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class RestCountry {
  
  @JsonProperty("addressFormat")
  protected RestAddressFormat addressFormat = null;

  
  @JsonProperty("isoCode2")
  protected String isoCode2 = null;

  
  @JsonProperty("isoCode3")
  protected String isoCode3 = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("numericCode")
  protected String numericCode = null;

  
  @JsonProperty("stateCodes")
  protected List<String> stateCodes = null;

  
  
   /**
   * Specifies the country&#39;s way of formatting addresses.
   * @return addressFormat
  **/
  @ApiModelProperty(value = "Specifies the country's way of formatting addresses.")
  public RestAddressFormat getAddressFormat() {
    return addressFormat;
  }

  
   /**
   * The country&#39;s two-letter code (ISO 3166-1 alpha-2 format).
   * @return isoCode2
  **/
  @ApiModelProperty(value = "The country's two-letter code (ISO 3166-1 alpha-2 format).")
  public String getIsoCode2() {
    return isoCode2;
  }

  
   /**
   * The country&#39;s three-letter code (ISO 3166-1 alpha-3 format).
   * @return isoCode3
  **/
  @ApiModelProperty(value = "The country's three-letter code (ISO 3166-1 alpha-3 format).")
  public String getIsoCode3() {
    return isoCode3;
  }

  
   /**
   * The name of the country.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the country.")
  public String getName() {
    return name;
  }

  
   /**
   * The country&#39;s three-digit code (ISO 3166-1 numeric format).
   * @return numericCode
  **/
  @ApiModelProperty(value = "The country's three-digit code (ISO 3166-1 numeric format).")
  public String getNumericCode() {
    return numericCode;
  }

  
   /**
   * The codes of all regions (e.g. states, provinces) of the country (ISO 3166-2 format).
   * @return stateCodes
  **/
  @ApiModelProperty(value = "The codes of all regions (e.g. states, provinces) of the country (ISO 3166-2 format).")
  public List<String> getStateCodes() {
    return stateCodes;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestCountry restCountry = (RestCountry) o;
    return Objects.equals(this.addressFormat, restCountry.addressFormat) &&
        Objects.equals(this.isoCode2, restCountry.isoCode2) &&
        Objects.equals(this.isoCode3, restCountry.isoCode3) &&
        Objects.equals(this.name, restCountry.name) &&
        Objects.equals(this.numericCode, restCountry.numericCode) &&
        Objects.equals(this.stateCodes, restCountry.stateCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressFormat, isoCode2, isoCode3, name, numericCode, stateCodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestCountry {\n");
    
    sb.append("    addressFormat: ").append(toIndentedString(addressFormat)).append("\n");
    sb.append("    isoCode2: ").append(toIndentedString(isoCode2)).append("\n");
    sb.append("    isoCode3: ").append(toIndentedString(isoCode3)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numericCode: ").append(toIndentedString(numericCode)).append("\n");
    sb.append("    stateCodes: ").append(toIndentedString(stateCodes)).append("\n");
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

