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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This error is thrown when something unexpected happens on our side.
 */
@ApiModel(description = "This error is thrown when something unexpected happens on our side.")

public class ServerError {
  
  @JsonProperty("date")
  protected String date;

  
  @JsonProperty("id")
  protected String id;

  
  @JsonProperty("message")
  protected String message;

  
  
   /**
   * Date when an error has occurred.
   * @return date
  **/
  @ApiModelProperty(value = "Date when an error has occurred.")
  public String getDate() {
    return date;
  }

  
   /**
   * Unique identifier of an error.
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of an error.")
  public String getId() {
    return id;
  }

  
   /**
   * This message describes an error.
   * @return message
  **/
  @ApiModelProperty(value = "This message describes an error.")
  public String getMessage() {
    return message;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerError serverError = (ServerError) o;
    return Objects.equals(this.date, serverError.date) &&
        Objects.equals(this.id, serverError.id) &&
        Objects.equals(this.message, serverError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, id, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerError {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

