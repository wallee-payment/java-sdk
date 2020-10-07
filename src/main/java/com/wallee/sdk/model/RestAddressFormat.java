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

import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
@ApiModel(description = "")

public class RestAddressFormat {
  
  @JsonProperty("postCodeExamples")
  protected List<String> postCodeExamples;

  
  @JsonProperty("postCodeRegex")
  protected String postCodeRegex;

  
  @JsonProperty("requiredFields")
  protected List<RestAddressFormatField> requiredFields;

  
  @JsonProperty("usedFields")
  protected List<RestAddressFormatField> usedFields;

  
  
   /**
   * The example post codes allow the user to understand what we expect here.
   * @return postCodeExamples
  **/
  @ApiModelProperty(value = "The example post codes allow the user to understand what we expect here.")
  public List<String> getPostCodeExamples() {
    return postCodeExamples;
  }

  
   /**
   * The post code regex is a regular expression which can validates the input of the post code.
   * @return postCodeRegex
  **/
  @ApiModelProperty(value = "The post code regex is a regular expression which can validates the input of the post code.")
  public String getPostCodeRegex() {
    return postCodeRegex;
  }

  
   /**
   * The required fields indicate what fields are required within an address to comply with the address format.
   * @return requiredFields
  **/
  @ApiModelProperty(value = "The required fields indicate what fields are required within an address to comply with the address format.")
  public List<RestAddressFormatField> getRequiredFields() {
    return requiredFields;
  }

  
   /**
   * The used fields indicate what fields are used within this address format.
   * @return usedFields
  **/
  @ApiModelProperty(value = "The used fields indicate what fields are used within this address format.")
  public List<RestAddressFormatField> getUsedFields() {
    return usedFields;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestAddressFormat restAddressFormat = (RestAddressFormat) o;
    return Objects.equals(this.postCodeExamples, restAddressFormat.postCodeExamples) &&
        Objects.equals(this.postCodeRegex, restAddressFormat.postCodeRegex) &&
        Objects.equals(this.requiredFields, restAddressFormat.requiredFields) &&
        Objects.equals(this.usedFields, restAddressFormat.usedFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postCodeExamples, postCodeRegex, requiredFields, usedFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestAddressFormat {\n");
    
    sb.append("    postCodeExamples: ").append(toIndentedString(postCodeExamples)).append("\n");
    sb.append("    postCodeRegex: ").append(toIndentedString(postCodeRegex)).append("\n");
    sb.append("    requiredFields: ").append(toIndentedString(requiredFields)).append("\n");
    sb.append("    usedFields: ").append(toIndentedString(usedFields)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

