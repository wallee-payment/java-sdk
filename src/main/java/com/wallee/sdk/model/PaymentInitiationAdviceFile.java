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
import com.wallee.sdk.model.PaymentInitiationAdviceFileState;
import com.wallee.sdk.model.PaymentProcessor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class PaymentInitiationAdviceFile {
  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("failureMessage")
  protected String failureMessage = null;

  
  @JsonProperty("fileGeneratedOn")
  protected OffsetDateTime fileGeneratedOn = null;

  
  @JsonProperty("forwardedOn")
  protected OffsetDateTime forwardedOn = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("processedOn")
  protected OffsetDateTime processedOn = null;

  
  @JsonProperty("processor")
  protected PaymentProcessor processor = null;

  
  @JsonProperty("state")
  protected PaymentInitiationAdviceFileState state = null;

  
  
   /**
   * The created on date indicates the date on which the entity was stored into the database.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The created on date indicates the date on which the entity was stored into the database.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * 
   * @return failureMessage
  **/
  @ApiModelProperty(value = "")
  public String getFailureMessage() {
    return failureMessage;
  }

  
   /**
   * 
   * @return fileGeneratedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getFileGeneratedOn() {
    return fileGeneratedOn;
  }

  
   /**
   * The shipping date indicates the date on which the pain file was transferred to an external processing system.
   * @return forwardedOn
  **/
  @ApiModelProperty(value = "The shipping date indicates the date on which the pain file was transferred to an external processing system.")
  public OffsetDateTime getForwardedOn() {
    return forwardedOn;
  }

  
   /**
   * The ID is the primary key of the entity. The ID identifies the entity uniquely.
   * @return id
  **/
  @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
  public Long getId() {
    return id;
  }

  
   /**
   * The linked space id holds the ID of the space to which the entity belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  
   /**
   * 
   * @return processedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getProcessedOn() {
    return processedOn;
  }

  
   /**
   * 
   * @return processor
  **/
  @ApiModelProperty(value = "")
  public PaymentProcessor getProcessor() {
    return processor;
  }

  
   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public PaymentInitiationAdviceFileState getState() {
    return state;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInitiationAdviceFile paymentInitiationAdviceFile = (PaymentInitiationAdviceFile) o;
    return Objects.equals(this.createdOn, paymentInitiationAdviceFile.createdOn) &&
        Objects.equals(this.failureMessage, paymentInitiationAdviceFile.failureMessage) &&
        Objects.equals(this.fileGeneratedOn, paymentInitiationAdviceFile.fileGeneratedOn) &&
        Objects.equals(this.forwardedOn, paymentInitiationAdviceFile.forwardedOn) &&
        Objects.equals(this.id, paymentInitiationAdviceFile.id) &&
        Objects.equals(this.linkedSpaceId, paymentInitiationAdviceFile.linkedSpaceId) &&
        Objects.equals(this.name, paymentInitiationAdviceFile.name) &&
        Objects.equals(this.processedOn, paymentInitiationAdviceFile.processedOn) &&
        Objects.equals(this.processor, paymentInitiationAdviceFile.processor) &&
        Objects.equals(this.state, paymentInitiationAdviceFile.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdOn, failureMessage, fileGeneratedOn, forwardedOn, id, linkedSpaceId, name, processedOn, processor, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationAdviceFile {\n");
    
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    failureMessage: ").append(toIndentedString(failureMessage)).append("\n");
    sb.append("    fileGeneratedOn: ").append(toIndentedString(fileGeneratedOn)).append("\n");
    sb.append("    forwardedOn: ").append(toIndentedString(forwardedOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    processedOn: ").append(toIndentedString(processedOn)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

