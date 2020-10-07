/**
 * SDK
 * <p>
 * This library allows to interact with the  payment service.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.wallee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
import java.util.Objects;


@ApiModel(description = "")

public class RestCountry extends Indentable {

    @JsonProperty("ISOCode2Letter")
    protected String isOCode2Letter;


    @JsonProperty("ISOCode3Letter")
    protected String isOCode3Letter;


    @JsonProperty("addressFormat")
    protected RestAddressFormat addressFormat;


    @JsonProperty("name")
    protected String name;


    @JsonProperty("numericCode")
    protected String numericCode;


    @JsonProperty("stateCodes")
    protected List<String> stateCodes;


    /**
     * The ISO code 2 letter identifies the country by two chars as defined in ISO 3166-1 (e.g. US, DE, CH).
     *
     * @return isOCode2Letter
     **/
    @ApiModelProperty(value = "The ISO code 2 letter identifies the country by two chars as defined in ISO 3166-1 (e.g. US, DE, CH).")
    public String getIsOCode2Letter() {
        return isOCode2Letter;
    }


    /**
     * The ISO code 3 letter identifies the country by three chars as defined in ISO 3166-1 (e.g. CHE, USA, GBR).
     *
     * @return isOCode3Letter
     **/
    @ApiModelProperty(value = "The ISO code 3 letter identifies the country by three chars as defined in ISO 3166-1 (e.g. CHE, USA, GBR).")
    public String getIsOCode3Letter() {
        return isOCode3Letter;
    }


    /**
     * The address format of the country indicates how an address has to look like for the country.
     *
     * @return addressFormat
     **/
    @ApiModelProperty(value = "The address format of the country indicates how an address has to look like for the country.")
    public RestAddressFormat getAddressFormat() {
        return addressFormat;
    }


    /**
     * The name labels the country by a name in English.
     *
     * @return name
     **/
    @ApiModelProperty(value = "The name labels the country by a name in English.")
    public String getName() {
        return name;
    }


    /**
     * The numeric code identifies the country by a three digit number as defined in ISO 3166-1 (e.g. 840, 826, 756).
     *
     * @return numericCode
     **/
    @ApiModelProperty(value = "The numeric code identifies the country by a three digit number as defined in ISO 3166-1 (e.g. 840, 826, 756).")
    public String getNumericCode() {
        return numericCode;
    }


    /**
     * The state codes field is a list of all states associated with this country. The list contains the identifiers of the states. The identifiers corresponds to the ISO 3166-2 subdivision identifier.
     *
     * @return stateCodes
     **/
    @ApiModelProperty(value = "The state codes field is a list of all states associated with this country. The list contains the identifiers of the states. The identifiers corresponds to the ISO 3166-2 subdivision identifier.")
    public List<String> getStateCodes() {
        return stateCodes;
    }


    @Override
    public boolean equals(Object o) {
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

        return "class RestCountry { \n" +
            "    isOCode2Letter: " + toIndentedString(isOCode2Letter) +  "\n" +
            "    isOCode3Letter: " + toIndentedString(isOCode3Letter) + " \n" +
            "    addressFormat: " + toIndentedString(addressFormat) + " \n" +
            "    name: " + toIndentedString(name) + " \n" +
            "    numericCode: " + toIndentedString(numericCode) + " \n" +
            "    stateCodes: " + toIndentedString(stateCodes) + " \n" +
            "}";
        }


}

