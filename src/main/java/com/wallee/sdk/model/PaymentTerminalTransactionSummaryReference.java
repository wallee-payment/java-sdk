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

public class PaymentTerminalTransactionSummaryReference {
  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("terminalId")
  protected Long terminalId = null;

  
  @JsonProperty("terminalIdentifier")
  protected String terminalIdentifier = null;

  
  
   /**
   * A unique identifier for the object.
   * @return id
  **/
  @ApiModelProperty(value = "A unique identifier for the object.")
  public Long getId() {
    return id;
  }

  
   /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The ID of the space this object belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The unique identifier of the terminal.
   * @return terminalId
  **/
  @ApiModelProperty(value = "The unique identifier of the terminal.")
  public Long getTerminalId() {
    return terminalId;
  }

  
   /**
   * The unique identifier of the terminal, that is displayed on the device.
   * @return terminalIdentifier
  **/
  @ApiModelProperty(value = "The unique identifier of the terminal, that is displayed on the device.")
  public String getTerminalIdentifier() {
    return terminalIdentifier;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTerminalTransactionSummaryReference paymentTerminalTransactionSummaryReference = (PaymentTerminalTransactionSummaryReference) o;
    return Objects.equals(this.id, paymentTerminalTransactionSummaryReference.id) &&
        Objects.equals(this.linkedSpaceId, paymentTerminalTransactionSummaryReference.linkedSpaceId) &&
        Objects.equals(this.terminalId, paymentTerminalTransactionSummaryReference.terminalId) &&
        Objects.equals(this.terminalIdentifier, paymentTerminalTransactionSummaryReference.terminalIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, linkedSpaceId, terminalId, terminalIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTerminalTransactionSummaryReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    terminalIdentifier: ").append(toIndentedString(terminalIdentifier)).append("\n");
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

