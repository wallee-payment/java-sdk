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
   * The duration within which the authorization process for a payment should complete.
   * @return authorizationTimeout
  **/
  @ApiModelProperty(value = "The duration within which the authorization process for a payment should complete.")
  public String getAuthorizationTimeout() {
    return authorizationTimeout;
  }

  
   /**
   * The completion configuration controlling how deferred completion is processed. If not present, deferred completion is not supported for this connector.
   * @return completionConfiguration
  **/
  @ApiModelProperty(value = "The completion configuration controlling how deferred completion is processed. If not present, deferred completion is not supported for this connector.")
  public PaymentAppCompletionConfiguration getCompletionConfiguration() {
    return completionConfiguration;
  }

  
   /**
   * The connector configuration created alongside the connector within its designated space. This configuration is used in transactions created using this connector.
   * @return connectorConfiguration
  **/
  @ApiModelProperty(value = "The connector configuration created alongside the connector within its designated space. This configuration is used in transactions created using this connector.")
  public PaymentConnectorConfiguration getConnectorConfiguration() {
    return connectorConfiguration;
  }

  
   /**
   * The date and time when the connector was created.
   * @return createdOn
  **/
  @ApiModelProperty(value = "The date and time when the connector was created.")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
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
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The ID of the space this object belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The name used to identify the connector.
   * @return name
  **/
  @ApiModelProperty(value = "The name used to identify the connector.")
  public String getName() {
    return name;
  }

  
   /**
   * The URL where the user is redirected to process a payment. This endpoint is provided by the external service provider.
   * @return paymentPageEndpoint
  **/
  @ApiModelProperty(value = "The URL where the user is redirected to process a payment. This endpoint is provided by the external service provider.")
  public String getPaymentPageEndpoint() {
    return paymentPageEndpoint;
  }

  
   /**
   * The payment app processor that the connector belongs to. This relationship is defined when the connector is created.
   * @return processor
  **/
  @ApiModelProperty(value = "The payment app processor that the connector belongs to. This relationship is defined when the connector is created.")
  public PaymentAppProcessor getProcessor() {
    return processor;
  }

  
   /**
   * The refund configuration controlling the behavior for processing refunds. If not present, refunds are not supported for this connector.
   * @return refundConfiguration
  **/
  @ApiModelProperty(value = "The refund configuration controlling the behavior for processing refunds. If not present, refunds are not supported for this connector.")
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
   * The date and time when the connector was last updated.
   * @return updatedOn
  **/
  @ApiModelProperty(value = "The date and time when the connector was last updated.")
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

