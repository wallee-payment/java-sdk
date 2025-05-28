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
import com.wallee.sdk.model.PaymentInformationHashType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * A payment information hash is generated from user input, ensuring consistent and collision-free results for identical inputs.
 */
@ApiModel(description = "A payment information hash is generated from user input, ensuring consistent and collision-free results for identical inputs.")

public class PaymentInformationHash {
  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("type")
  protected PaymentInformationHashType type = null;

  
  @JsonProperty("value")
  protected String value = null;

  
  
   /**
   * A unique identifier for the object.
   * @return id
  **/
  @ApiModelProperty(value = "A unique identifier for the object.")
  public Long getId() {
    return id;
  }

  
   /**
   * The type specifies the algorithm used for calculating the hash.
   * @return type
  **/
  @ApiModelProperty(value = "The type specifies the algorithm used for calculating the hash.")
  public PaymentInformationHashType getType() {
    return type;
  }

  
   /**
   * The hash value generated based on the specified type.
   * @return value
  **/
  @ApiModelProperty(value = "The hash value generated based on the specified type.")
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
    PaymentInformationHash paymentInformationHash = (PaymentInformationHash) o;
    return Objects.equals(this.id, paymentInformationHash.id) &&
        Objects.equals(this.type, paymentInformationHash.type) &&
        Objects.equals(this.value, paymentInformationHash.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInformationHash {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

