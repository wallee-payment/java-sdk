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
import com.wallee.sdk.model.CreationEntityState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class PaymentProcessorConfiguration {
  
  @JsonProperty("applicationManaged")
  protected Boolean applicationManaged = null;

  
  @JsonProperty("contractId")
  protected Long contractId = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("processor")
  protected Long processor = null;

  
  @JsonProperty("state")
  protected CreationEntityState state = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * Whether the processor configuration is managed by the application and therefore cannot be changed.
   * @return applicationManaged
  **/
  @ApiModelProperty(value = "Whether the processor configuration is managed by the application and therefore cannot be changed.")
  public Boolean isApplicationManaged() {
    return applicationManaged;
  }

  
   /**
   * The ID of the payment contract the processor configuration is linked to.
   * @return contractId
  **/
  @ApiModelProperty(value = "The ID of the payment contract the processor configuration is linked to.")
  public Long getContractId() {
    return contractId;
  }

  
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
   * The name used to identify the payment method configuration.
   * @return name
  **/
  @ApiModelProperty(value = "The name used to identify the payment method configuration.")
  public String getName() {
    return name;
  }

  
   /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * The payment processor that the configuration is for.
   * @return processor
  **/
  @ApiModelProperty(value = "The payment processor that the configuration is for.")
  public Long getProcessor() {
    return processor;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public CreationEntityState getState() {
    return state;
  }

  
   /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @ApiModelProperty(value = "The version is used for optimistic locking and incremented whenever the object is updated.")
  public Integer getVersion() {
    return version;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentProcessorConfiguration paymentProcessorConfiguration = (PaymentProcessorConfiguration) o;
    return Objects.equals(this.applicationManaged, paymentProcessorConfiguration.applicationManaged) &&
        Objects.equals(this.contractId, paymentProcessorConfiguration.contractId) &&
        Objects.equals(this.id, paymentProcessorConfiguration.id) &&
        Objects.equals(this.linkedSpaceId, paymentProcessorConfiguration.linkedSpaceId) &&
        Objects.equals(this.name, paymentProcessorConfiguration.name) &&
        Objects.equals(this.plannedPurgeDate, paymentProcessorConfiguration.plannedPurgeDate) &&
        Objects.equals(this.processor, paymentProcessorConfiguration.processor) &&
        Objects.equals(this.state, paymentProcessorConfiguration.state) &&
        Objects.equals(this.version, paymentProcessorConfiguration.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationManaged, contractId, id, linkedSpaceId, name, plannedPurgeDate, processor, state, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentProcessorConfiguration {\n");
    
    sb.append("    applicationManaged: ").append(toIndentedString(applicationManaged)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

