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
import com.wallee.sdk.model.PaymentAppCompletionConfiguration;
import com.wallee.sdk.model.PaymentAppConnectorState;
import com.wallee.sdk.model.PaymentAppProcessor;
import com.wallee.sdk.model.PaymentAppRefundConfiguration;
import com.wallee.sdk.model.PaymentConnectorConfiguration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class PaymentAppConnector {
  
  @JsonProperty("authorizationTimeout")
  protected String authorizationTimeout = null;

  
  @JsonProperty("completionConfiguration")
  protected PaymentAppCompletionConfiguration completionConfiguration = null;

  
  @JsonProperty("connectorConfiguration")
  protected PaymentConnectorConfiguration connectorConfiguration = null;

  
  @JsonProperty("createdOn")
  protected OffsetDateTime createdOn = null;

  
  @JsonProperty("externalId")
  protected String externalId = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("paymentPageEndpoint")
  protected String paymentPageEndpoint = null;

  
  @JsonProperty("processor")
  protected PaymentAppProcessor processor = null;

  
  @JsonProperty("refundConfiguration")
  protected PaymentAppRefundConfiguration refundConfiguration = null;

  
  @JsonProperty("state")
  protected PaymentAppConnectorState state = null;

  
  @JsonProperty("updatedOn")
  protected OffsetDateTime updatedOn = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * 
   * @return authorizationTimeout
  **/
  @ApiModelProperty(value = "")
  public String getAuthorizationTimeout() {
    return authorizationTimeout;
  }

  
   /**
   * The completion configuration defines how the deferred completion is processed. If it is not present it means that deferred completion is not supported by this connector.
   * @return completionConfiguration
  **/
  @ApiModelProperty(value = "The completion configuration defines how the deferred completion is processed. If it is not present it means that deferred completion is not supported by this connector.")
  public PaymentAppCompletionConfiguration getCompletionConfiguration() {
    return completionConfiguration;
  }

  
   /**
   * The connector configuration references the configuration that was created as part of this connector within the space. The connector configuration is referenced within transactions created with this connector.
   * @return connectorConfiguration
  **/
  @ApiModelProperty(value = "The connector configuration references the configuration that was created as part of this connector within the space. The connector configuration is referenced within transactions created with this connector.")
  public PaymentConnectorConfiguration getConnectorConfiguration() {
    return connectorConfiguration;
  }

  
   /**
   * The created on date indicates when the connector was added.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The created on date indicates when the connector was added.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  
   /**
   * The external ID corresponds to the ID provided during inserting of the processor.
   * @return externalId
  **/
  @ApiModelProperty(value = "The external ID corresponds to the ID provided during inserting of the processor.")
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
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The ID of the space this object belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The name of the connector will be displayed within the user interfaces that the merchant is interacting with.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the connector will be displayed within the user interfaces that the merchant is interacting with.")
  public String getName() {
    return name;
  }

  
   /**
   * The payment page endpoint is invoked to process the transaction. The endpoint is defined by the external service provider.
   * @return paymentPageEndpoint
  **/
  @ApiModelProperty(value = "The payment page endpoint is invoked to process the transaction. The endpoint is defined by the external service provider.")
  public String getPaymentPageEndpoint() {
    return paymentPageEndpoint;
  }

  
   /**
   * The processor references the app processor to which this connector belongs to. The relationship is established during the creation of the connector.
   * @return processor
  **/
  @ApiModelProperty(value = "The processor references the app processor to which this connector belongs to. The relationship is established during the creation of the connector.")
  public PaymentAppProcessor getProcessor() {
    return processor;
  }

  
   /**
   * The refund configuration defines how refunds are processed. If it is not present it means that refunds are not supported by this connector.
   * @return refundConfiguration
  **/
  @ApiModelProperty(value = "The refund configuration defines how refunds are processed. If it is not present it means that refunds are not supported by this connector.")
  public PaymentAppRefundConfiguration getRefundConfiguration() {
    return refundConfiguration;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public PaymentAppConnectorState getState() {
    return state;
  }

  
   /**
   * The updated on date indicates when the last time the connector was updated on.
   * @return updatedOn
  **/
  @ApiModelProperty(value = "The updated on date indicates when the last time the connector was updated on.")
  public OffsetDateTime getUpdatedOn() {
    return updatedOn;
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
    PaymentAppConnector paymentAppConnector = (PaymentAppConnector) o;
    return Objects.equals(this.authorizationTimeout, paymentAppConnector.authorizationTimeout) &&
        Objects.equals(this.completionConfiguration, paymentAppConnector.completionConfiguration) &&
        Objects.equals(this.connectorConfiguration, paymentAppConnector.connectorConfiguration) &&
        Objects.equals(this.createdOn, paymentAppConnector.createdOn) &&
        Objects.equals(this.externalId, paymentAppConnector.externalId) &&
        Objects.equals(this.id, paymentAppConnector.id) &&
        Objects.equals(this.linkedSpaceId, paymentAppConnector.linkedSpaceId) &&
        Objects.equals(this.name, paymentAppConnector.name) &&
        Objects.equals(this.paymentPageEndpoint, paymentAppConnector.paymentPageEndpoint) &&
        Objects.equals(this.processor, paymentAppConnector.processor) &&
        Objects.equals(this.refundConfiguration, paymentAppConnector.refundConfiguration) &&
        Objects.equals(this.state, paymentAppConnector.state) &&
        Objects.equals(this.updatedOn, paymentAppConnector.updatedOn) &&
        Objects.equals(this.version, paymentAppConnector.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationTimeout, completionConfiguration, connectorConfiguration, createdOn, externalId, id, linkedSpaceId, name, paymentPageEndpoint, processor, refundConfiguration, state, updatedOn, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAppConnector {\n");
    
    sb.append("    authorizationTimeout: ").append(toIndentedString(authorizationTimeout)).append("\n");
    sb.append("    completionConfiguration: ").append(toIndentedString(completionConfiguration)).append("\n");
    sb.append("    connectorConfiguration: ").append(toIndentedString(connectorConfiguration)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paymentPageEndpoint: ").append(toIndentedString(paymentPageEndpoint)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    refundConfiguration: ").append(toIndentedString(refundConfiguration)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
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

