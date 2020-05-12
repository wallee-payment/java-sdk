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
@javax.annotation.Generated(value = "io.wallee.sdk.java.WalleeJavaClientCodegen", date = "2020-05-12T11:16:45.520+02:00")
public class RestCountry {
  
  @JsonProperty("ISOCode2Letter")
  protected String isOCode2Letter = null;

  
  @JsonProperty("ISOCode3Letter")
  protected String isOCode3Letter = null;

  
  @JsonProperty("addressFormat")
  protected RestAddressFormat addressFormat = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("numericCode")
  protected String numericCode = null;

  
  @JsonProperty("stateCodes")
  protected List<String> stateCodes = null;

  
  
   /**
   * The ISO code 2 letter identifies the country by two chars as defined in ISO 3166-1 (e.g. US, DE, CH).
   * @return isOCode2Letter
  **/
  @ApiModelProperty(value = "The ISO code 2 letter identifies the country by two chars as defined in ISO 3166-1 (e.g. US, DE, CH).")
  public String getIsOCode2Letter() {
    return isOCode2Letter;
  }

  
   /**
   * The ISO code 3 letter identifies the country by three chars as defined in ISO 3166-1 (e.g. CHE, USA, GBR).
   * @return isOCode3Letter
  **/
  @ApiModelProperty(value = "The ISO code 3 letter identifies the country by three chars as defined in ISO 3166-1 (e.g. CHE, USA, GBR).")
  public String getIsOCode3Letter() {
    return isOCode3Letter;
  }

  
   /**
   * The address format of the country indicates how an address has to look like for the country.
   * @return addressFormat
  **/
  @ApiModelProperty(value = "The address format of the country indicates how an address has to look like for the country.")
  public RestAddressFormat getAddressFormat() {
    return addressFormat;
  }

  
   /**
   * The name labels the country by a name in English.
   * @return name
  **/
  @ApiModelProperty(value = "The name labels the country by a name in English.")
  public String getName() {
    return name;
  }

  
   /**
   * The numeric code identifies the country by a three digit number as defined in ISO 3166-1 (e.g. 840, 826, 756).
   * @return numericCode
  **/
  @ApiModelProperty(value = "The numeric code identifies the country by a three digit number as defined in ISO 3166-1 (e.g. 840, 826, 756).")
  public String getNumericCode() {
    return numericCode;
  }

  
   /**
   * The state codes field is a list of all states associated with this country. The list contains the identifiers of the states. The identifiers corresponds to the ISO 3166-2 subdivision identifier.
   * @return stateCodes
  **/
  @ApiModelProperty(value = "The state codes field is a list of all states associated with this country. The list contains the identifiers of the states. The identifiers corresponds to the ISO 3166-2 subdivision identifier.")
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
    return Objects.equals(this.isOCode2Letter, restCountry.isOCode2Letter) &&
        Objects.equals(this.isOCode3Letter, restCountry.isOCode3Letter) &&
        Objects.equals(this.addressFormat, restCountry.addressFormat) &&
        Objects.equals(this.name, restCountry.name) &&
        Objects.equals(this.numericCode, restCountry.numericCode) &&
        Objects.equals(this.stateCodes, restCountry.stateCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isOCode2Letter, isOCode3Letter, addressFormat, name, numericCode, stateCodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestCountry {\n");
    
    sb.append("    isOCode2Letter: ").append(toIndentedString(isOCode2Letter)).append("\n");
    sb.append("    isOCode3Letter: ").append(toIndentedString(isOCode3Letter)).append("\n");
    sb.append("    addressFormat: ").append(toIndentedString(addressFormat)).append("\n");
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

