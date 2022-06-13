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
import com.wallee.sdk.model.PaymentAppCompletionConfigurationCreate;
import com.wallee.sdk.model.PaymentAppRefundConfigurationCreate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class PaymentAppConnectorCreationRequest {
  
  @JsonProperty("authorizationTimeoutInMinutes")
  protected Integer authorizationTimeoutInMinutes = null;

  
  @JsonProperty("completionConfiguration")
  protected PaymentAppCompletionConfigurationCreate completionConfiguration = null;

  
  @JsonProperty("connector")
  protected Long connector = null;

  
  @JsonProperty("externalId")
  protected String externalId = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("paymentPageEndpoint")
  protected String paymentPageEndpoint = null;

  
  @JsonProperty("processorExternalId")
  protected String processorExternalId = null;

  
  @JsonProperty("refundConfiguration")
  protected PaymentAppRefundConfigurationCreate refundConfiguration = null;

  
  
  public PaymentAppConnectorCreationRequest authorizationTimeoutInMinutes(Integer authorizationTimeoutInMinutes) {
    this.authorizationTimeoutInMinutes = authorizationTimeoutInMinutes;
    return this;
  }

   /**
   * When the transaction is not authorized within this timeout the transaction is considered as failed.
   * @return authorizationTimeoutInMinutes
  **/
  @ApiModelProperty(required = true, value = "When the transaction is not authorized within this timeout the transaction is considered as failed.")
  public Integer getAuthorizationTimeoutInMinutes() {
    return authorizationTimeoutInMinutes;
  }

  public void setAuthorizationTimeoutInMinutes(Integer authorizationTimeoutInMinutes) {
    this.authorizationTimeoutInMinutes = authorizationTimeoutInMinutes;
  }

  
  public PaymentAppConnectorCreationRequest completionConfiguration(PaymentAppCompletionConfigurationCreate completionConfiguration) {
    this.completionConfiguration = completionConfiguration;
    return this;
  }

   /**
   * The completion configuration allows the connector to support deferred completions on a transaction. If it is not provided the connector will not process transactions in deferred mode.
   * @return completionConfiguration
  **/
  @ApiModelProperty(value = "The completion configuration allows the connector to support deferred completions on a transaction. If it is not provided the connector will not process transactions in deferred mode.")
  public PaymentAppCompletionConfigurationCreate getCompletionConfiguration() {
    return completionConfiguration;
  }

  public void setCompletionConfiguration(PaymentAppCompletionConfigurationCreate completionConfiguration) {
    this.completionConfiguration = completionConfiguration;
  }

  
  public PaymentAppConnectorCreationRequest connector(Long connector) {
    this.connector = connector;
    return this;
  }

   /**
   * The ID of the connector identifies which connector that should be linked with this web app connector. The connector defines the payment method.
   * @return connector
  **/
  @ApiModelProperty(required = true, value = "The ID of the connector identifies which connector that should be linked with this web app connector. The connector defines the payment method.")
  public Long getConnector() {
    return connector;
  }

  public void setConnector(Long connector) {
    this.connector = connector;
  }

  
  public PaymentAppConnectorCreationRequest externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * The external ID identifies the connector within the external system. It has to be unique per processor external ID and for any subsequent update the same ID must be sent.
   * @return externalId
  **/
  @ApiModelProperty(required = true, value = "The external ID identifies the connector within the external system. It has to be unique per processor external ID and for any subsequent update the same ID must be sent.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  
  public PaymentAppConnectorCreationRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the connector will be displayed within the user interfaces that the merchant is interacting with.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the connector will be displayed within the user interfaces that the merchant is interacting with.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public PaymentAppConnectorCreationRequest paymentPageEndpoint(String paymentPageEndpoint) {
    this.paymentPageEndpoint = paymentPageEndpoint;
    return this;
  }

   /**
   * The payment page endpoint URL will be invoked by the buyer to carry out the authorization of the payment.
   * @return paymentPageEndpoint
  **/
  @ApiModelProperty(required = true, value = "The payment page endpoint URL will be invoked by the buyer to carry out the authorization of the payment.")
  public String getPaymentPageEndpoint() {
    return paymentPageEndpoint;
  }

  public void setPaymentPageEndpoint(String paymentPageEndpoint) {
    this.paymentPageEndpoint = paymentPageEndpoint;
  }

  
  public PaymentAppConnectorCreationRequest processorExternalId(String processorExternalId) {
    this.processorExternalId = processorExternalId;
    return this;
  }

   /**
   * The external ID of the processor identifies the processor to which this connector belongs to. The processor cannot be changed once it has been set on a connector.
   * @return processorExternalId
  **/
  @ApiModelProperty(required = true, value = "The external ID of the processor identifies the processor to which this connector belongs to. The processor cannot be changed once it has been set on a connector.")
  public String getProcessorExternalId() {
    return processorExternalId;
  }

  public void setProcessorExternalId(String processorExternalId) {
    this.processorExternalId = processorExternalId;
  }

  
  public PaymentAppConnectorCreationRequest refundConfiguration(PaymentAppRefundConfigurationCreate refundConfiguration) {
    this.refundConfiguration = refundConfiguration;
    return this;
  }

   /**
   * The refund configuration allows the connector to support refunds on transactions. In case no refund configuration is provided the connector will not support refunds.
   * @return refundConfiguration
  **/
  @ApiModelProperty(value = "The refund configuration allows the connector to support refunds on transactions. In case no refund configuration is provided the connector will not support refunds.")
  public PaymentAppRefundConfigurationCreate getRefundConfiguration() {
    return refundConfiguration;
  }

  public void setRefundConfiguration(PaymentAppRefundConfigurationCreate refundConfiguration) {
    this.refundConfiguration = refundConfiguration;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentAppConnectorCreationRequest paymentAppConnectorCreationRequest = (PaymentAppConnectorCreationRequest) o;
    return Objects.equals(this.authorizationTimeoutInMinutes, paymentAppConnectorCreationRequest.authorizationTimeoutInMinutes) &&
        Objects.equals(this.completionConfiguration, paymentAppConnectorCreationRequest.completionConfiguration) &&
        Objects.equals(this.connector, paymentAppConnectorCreationRequest.connector) &&
        Objects.equals(this.externalId, paymentAppConnectorCreationRequest.externalId) &&
        Objects.equals(this.name, paymentAppConnectorCreationRequest.name) &&
        Objects.equals(this.paymentPageEndpoint, paymentAppConnectorCreationRequest.paymentPageEndpoint) &&
        Objects.equals(this.processorExternalId, paymentAppConnectorCreationRequest.processorExternalId) &&
        Objects.equals(this.refundConfiguration, paymentAppConnectorCreationRequest.refundConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationTimeoutInMinutes, completionConfiguration, connector, externalId, name, paymentPageEndpoint, processorExternalId, refundConfiguration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAppConnectorCreationRequest {\n");
    
    sb.append("    authorizationTimeoutInMinutes: ").append(toIndentedString(authorizationTimeoutInMinutes)).append("\n");
    sb.append("    completionConfiguration: ").append(toIndentedString(completionConfiguration)).append("\n");
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paymentPageEndpoint: ").append(toIndentedString(paymentPageEndpoint)).append("\n");
    sb.append("    processorExternalId: ").append(toIndentedString(processorExternalId)).append("\n");
    sb.append("    refundConfiguration: ").append(toIndentedString(refundConfiguration)).append("\n");
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

