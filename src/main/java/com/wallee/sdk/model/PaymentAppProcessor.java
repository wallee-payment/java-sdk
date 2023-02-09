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
import com.wallee.sdk.model.ChargeAttemptEnvironment;
import com.wallee.sdk.model.PaymentAppProcessorState;
import com.wallee.sdk.model.PaymentProcessorConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class PaymentAppProcessor {
  
  @JsonProperty("configuredEnvironment")
  protected ChargeAttemptEnvironment configuredEnvironment = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("documentationUrl")
  protected String documentationUrl = null;

  
  @JsonProperty("externalId")
  protected String externalId = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("installationId")
  protected Long installationId = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("processorConfiguration")
  protected PaymentProcessorConfiguration processorConfiguration = null;

  
  @JsonProperty("productionModeUrl")
  protected String productionModeUrl = null;

  
  @JsonProperty("state")
  protected PaymentAppProcessorState state = null;

  
  @JsonProperty("svgIcon")
  protected String svgIcon = null;

  
  @JsonProperty("updatedOn")
  protected OffsetDateTime updatedOn = null;

  
  @JsonProperty("usableInProduction")
  protected Boolean usableInProduction = null;

  
  @JsonProperty("usableInProductionSince")
  protected OffsetDateTime usableInProductionSince = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * 
   * @return configuredEnvironment
  **/
  @ApiModelProperty(value = "")
  public ChargeAttemptEnvironment getConfiguredEnvironment() {
    return configuredEnvironment;
  }

  
   /**
   * The created on date is the date when this processor has been added.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The created on date is the date when this processor has been added.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * The documentation URL points to a web site that describes how to configure and use the processor.
   * @return documentationUrl
  **/
  @ApiModelProperty(value = "The documentation URL points to a web site that describes how to configure and use the processor.")
  public String getDocumentationUrl() {
    return documentationUrl;
  }

  
   /**
   * The external ID corresponds to the ID that was provided during creation of the processor.
   * @return externalId
  **/
  @ApiModelProperty(value = "The external ID corresponds to the ID that was provided during creation of the processor.")
  public String getExternalId() {
    return externalId;
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
   * The installation ID identifies the Web App installation.
   * @return installationId
  **/
  @ApiModelProperty(value = "The installation ID identifies the Web App installation.")
  public Long getInstallationId() {
    return installationId;
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
   * The name of the processor will be displayed within the user interfaces that the merchant is interacting with.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the processor will be displayed within the user interfaces that the merchant is interacting with.")
  public String getName() {
    return name;
  }

  
   /**
   * This processor configuration is created as part of the app processor. Any transaction created with the processor is linked with this processor configuration.
   * @return processorConfiguration
  **/
  @ApiModelProperty(value = "This processor configuration is created as part of the app processor. Any transaction created with the processor is linked with this processor configuration.")
  public PaymentProcessorConfiguration getProcessorConfiguration() {
    return processorConfiguration;
  }

  
   /**
   * When the user sets the processor into the production mode the user will be forwarded to this URL to configure the production environment. When no URL is provided no redirection will happen.
   * @return productionModeUrl
  **/
  @ApiModelProperty(value = "When the user sets the processor into the production mode the user will be forwarded to this URL to configure the production environment. When no URL is provided no redirection will happen.")
  public String getProductionModeUrl() {
    return productionModeUrl;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public PaymentAppProcessorState getState() {
    return state;
  }

  
   /**
   * 
   * @return svgIcon
  **/
  @ApiModelProperty(value = "")
  public String getSvgIcon() {
    return svgIcon;
  }

  
   /**
   * The updated on date indicates when the last update on the processor occurred.
   * @return updatedOn
  **/
  @ApiModelProperty(value = "The updated on date indicates when the last update on the processor occurred.")
  public OffsetDateTime getUpdatedOn() {
    return updatedOn;
  }

  
   /**
   * When the processor is ready to be used for transactions in the production environment this flag is set to true.
   * @return usableInProduction
  **/
  @ApiModelProperty(value = "When the processor is ready to be used for transactions in the production environment this flag is set to true.")
  public Boolean isUsableInProduction() {
    return usableInProduction;
  }

  
   /**
   * 
   * @return usableInProductionSince
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getUsableInProductionSince() {
    return usableInProductionSince;
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
    PaymentAppProcessor paymentAppProcessor = (PaymentAppProcessor) o;
    return Objects.equals(this.configuredEnvironment, paymentAppProcessor.configuredEnvironment) &&
        Objects.equals(this.createdOn, paymentAppProcessor.createdOn) &&
        Objects.equals(this.documentationUrl, paymentAppProcessor.documentationUrl) &&
        Objects.equals(this.externalId, paymentAppProcessor.externalId) &&
        Objects.equals(this.id, paymentAppProcessor.id) &&
        Objects.equals(this.installationId, paymentAppProcessor.installationId) &&
        Objects.equals(this.linkedSpaceId, paymentAppProcessor.linkedSpaceId) &&
        Objects.equals(this.name, paymentAppProcessor.name) &&
        Objects.equals(this.processorConfiguration, paymentAppProcessor.processorConfiguration) &&
        Objects.equals(this.productionModeUrl, paymentAppProcessor.productionModeUrl) &&
        Objects.equals(this.state, paymentAppProcessor.state) &&
        Objects.equals(this.svgIcon, paymentAppProcessor.svgIcon) &&
        Objects.equals(this.updatedOn, paymentAppProcessor.updatedOn) &&
        Objects.equals(this.usableInProduction, paymentAppProcessor.usableInProduction) &&
        Objects.equals(this.usableInProductionSince, paymentAppProcessor.usableInProductionSince) &&
        Objects.equals(this.version, paymentAppProcessor.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configuredEnvironment, createdOn, documentationUrl, externalId, id, installationId, linkedSpaceId, name, processorConfiguration, productionModeUrl, state, svgIcon, updatedOn, usableInProduction, usableInProductionSince, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAppProcessor {\n");
    
    sb.append("    configuredEnvironment: ").append(toIndentedString(configuredEnvironment)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    documentationUrl: ").append(toIndentedString(documentationUrl)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    installationId: ").append(toIndentedString(installationId)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    processorConfiguration: ").append(toIndentedString(processorConfiguration)).append("\n");
    sb.append("    productionModeUrl: ").append(toIndentedString(productionModeUrl)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    svgIcon: ").append(toIndentedString(svgIcon)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
    sb.append("    usableInProduction: ").append(toIndentedString(usableInProduction)).append("\n");
    sb.append("    usableInProductionSince: ").append(toIndentedString(usableInProductionSince)).append("\n");
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

