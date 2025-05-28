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
   * The environment (e.g., test or production) currently configured for the processor.
   * @return configuredEnvironment
  **/
  @ApiModelProperty(value = "The environment (e.g., test or production) currently configured for the processor.")
  public ChargeAttemptEnvironment getConfiguredEnvironment() {
    return configuredEnvironment;
  }

  
   /**
   * The date and time when the processor was created.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The date and time when the processor was created.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * A URL pointing to the documentation that explains how to configure and use the processor.
   * @return documentationUrl
  **/
  @ApiModelProperty(value = "A URL pointing to the documentation that explains how to configure and use the processor.")
  public String getDocumentationUrl() {
    return documentationUrl;
  }

  
   /**
   * A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.
   * @return externalId
  **/
  @ApiModelProperty(value = "A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.")
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
   * The name used to identify the processor.
   * @return name
  **/
  @ApiModelProperty(value = "The name used to identify the processor.")
  public String getName() {
    return name;
  }

  
   /**
   * The processor configuration created alongside the process within its designated space. This configuration is used in transactions created using this processor.
   * @return processorConfiguration
  **/
  @ApiModelProperty(value = "The processor configuration created alongside the process within its designated space. This configuration is used in transactions created using this processor.")
  public PaymentProcessorConfiguration getProcessorConfiguration() {
    return processorConfiguration;
  }

  
   /**
   * A URL pointing to the site where merchants can set up production mode for the processor.
   * @return productionModeUrl
  **/
  @ApiModelProperty(value = "A URL pointing to the site where merchants can set up production mode for the processor.")
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
   * An SVG icon representing the processor, displayed to the user in the interface.
   * @return svgIcon
  **/
  @ApiModelProperty(value = "An SVG icon representing the processor, displayed to the user in the interface.")
  public String getSvgIcon() {
    return svgIcon;
  }

  
   /**
   * The date and time when the processor was last updated.
   * @return updatedOn
  **/
  @ApiModelProperty(value = "The date and time when the processor was last updated.")
  public OffsetDateTime getUpdatedOn() {
    return updatedOn;
  }

  
   /**
   * Whether the processor is fully prepared and available for handling transactions in a production environment.
   * @return usableInProduction
  **/
  @ApiModelProperty(value = "Whether the processor is fully prepared and available for handling transactions in a production environment.")
  public Boolean isUsableInProduction() {
    return usableInProduction;
  }

  
   /**
   * the date and time when the processor became fully usable and available for handling transactions in a production environment.
   * @return usableInProductionSince
  **/
  @ApiModelProperty(value = "the date and time when the processor became fully usable and available for handling transactions in a production environment.")
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

