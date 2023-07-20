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

public class RestLanguage {
  
  @JsonProperty("countryCode")
  protected String countryCode = null;

  
  @JsonProperty("ietfCode")
  protected String ietfCode = null;

  
  @JsonProperty("iso2Code")
  protected String iso2Code = null;

  
  @JsonProperty("iso3Code")
  protected String iso3Code = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("pluralExpression")
  protected String pluralExpression = null;

  
  @JsonProperty("primaryOfGroup")
  protected Boolean primaryOfGroup = null;

  
  
   /**
   * The two-letter code of the language&#39;s region (ISO 3166-1 alpha-2 format).
   * @return countryCode
  **/
  @ApiModelProperty(value = "The two-letter code of the language's region (ISO 3166-1 alpha-2 format).")
  public String getCountryCode() {
    return countryCode;
  }

  
   /**
   * The language&#39;s IETF tag consisting of the two-letter ISO code and region e.g. en-US, de-CH.
   * @return ietfCode
  **/
  @ApiModelProperty(value = "The language's IETF tag consisting of the two-letter ISO code and region e.g. en-US, de-CH.")
  public String getIetfCode() {
    return ietfCode;
  }

  
   /**
   * The language&#39;s two-letter code (ISO 639-1 format).
   * @return iso2Code
  **/
  @ApiModelProperty(value = "The language's two-letter code (ISO 639-1 format).")
  public String getIso2Code() {
    return iso2Code;
  }

  
   /**
   * The language&#39;s three-letter code (ISO 639-2/T format).
   * @return iso3Code
  **/
  @ApiModelProperty(value = "The language's three-letter code (ISO 639-2/T format).")
  public String getIso3Code() {
    return iso3Code;
  }

  
   /**
   * The name of the language.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the language.")
  public String getName() {
    return name;
  }

  
   /**
   * The expression to determine the plural index for a given number of items used to find the proper plural form for translations.
   * @return pluralExpression
  **/
  @ApiModelProperty(value = "The expression to determine the plural index for a given number of items used to find the proper plural form for translations.")
  public String getPluralExpression() {
    return pluralExpression;
  }

  
   /**
   * Whether this is the primary language in a group of languages.
   * @return primaryOfGroup
  **/
  @ApiModelProperty(value = "Whether this is the primary language in a group of languages.")
  public Boolean isPrimaryOfGroup() {
    return primaryOfGroup;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestLanguage restLanguage = (RestLanguage) o;
    return Objects.equals(this.countryCode, restLanguage.countryCode) &&
        Objects.equals(this.ietfCode, restLanguage.ietfCode) &&
        Objects.equals(this.iso2Code, restLanguage.iso2Code) &&
        Objects.equals(this.iso3Code, restLanguage.iso3Code) &&
        Objects.equals(this.name, restLanguage.name) &&
        Objects.equals(this.pluralExpression, restLanguage.pluralExpression) &&
        Objects.equals(this.primaryOfGroup, restLanguage.primaryOfGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, ietfCode, iso2Code, iso3Code, name, pluralExpression, primaryOfGroup);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestLanguage {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    ietfCode: ").append(toIndentedString(ietfCode)).append("\n");
    sb.append("    iso2Code: ").append(toIndentedString(iso2Code)).append("\n");
    sb.append("    iso3Code: ").append(toIndentedString(iso3Code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pluralExpression: ").append(toIndentedString(pluralExpression)).append("\n");
    sb.append("    primaryOfGroup: ").append(toIndentedString(primaryOfGroup)).append("\n");
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

