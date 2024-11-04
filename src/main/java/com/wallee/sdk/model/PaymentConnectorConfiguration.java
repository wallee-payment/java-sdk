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
import com.wallee.sdk.model.PaymentMethodConfiguration;
import com.wallee.sdk.model.PaymentProcessorConfiguration;
import com.wallee.sdk.model.SalesChannel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")

public class PaymentConnectorConfiguration {
  
  @JsonProperty("applicableForTransactionProcessing")
  protected Boolean applicableForTransactionProcessing = null;

  
  @JsonProperty("conditions")
  protected List<Long> conditions = null;

  
  @JsonProperty("connector")
  protected Long connector = null;

  
  @JsonProperty("enabledSalesChannels")
  protected List<SalesChannel> enabledSalesChannels = null;

  
  @JsonProperty("enabledSpaceViews")
  protected List<Long> enabledSpaceViews = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("imagePath")
  protected String imagePath = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("paymentMethodConfiguration")
  protected PaymentMethodConfiguration paymentMethodConfiguration = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("priority")
  protected Integer priority = null;

  
  @JsonProperty("processorConfiguration")
  protected PaymentProcessorConfiguration processorConfiguration = null;

  
  @JsonProperty("state")
  protected CreationEntityState state = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * Whether this connector configuration is enabled for processing payments, taking into account the state of the processor and payment method configurations.
   * @return applicableForTransactionProcessing
  **/
  @ApiModelProperty(value = "Whether this connector configuration is enabled for processing payments, taking into account the state of the processor and payment method configurations.")
  public Boolean isApplicableForTransactionProcessing() {
    return applicableForTransactionProcessing;
  }

  
   /**
   * Conditions allow to define criteria that a transaction must fulfill in order for the connector configuration to be considered for processing the payment.
   * @return conditions
  **/
  @ApiModelProperty(value = "Conditions allow to define criteria that a transaction must fulfill in order for the connector configuration to be considered for processing the payment.")
  public List<Long> getConditions() {
    return conditions;
  }

  
   /**
   * The connector that the configuration is for.
   * @return connector
  **/
  @ApiModelProperty(value = "The connector that the configuration is for.")
  public Long getConnector() {
    return connector;
  }

  
   /**
   * The sales channels for which the connector configuration is enabled. If empty, it is enabled for all sales channels.
   * @return enabledSalesChannels
  **/
  @ApiModelProperty(value = "The sales channels for which the connector configuration is enabled. If empty, it is enabled for all sales channels.")
  public List<SalesChannel> getEnabledSalesChannels() {
    return enabledSalesChannels;
  }

  
   /**
   * The space views for which the connector configuration is enabled. If empty, it is enabled for all space views.
   * @return enabledSpaceViews
  **/
  @ApiModelProperty(value = "The space views for which the connector configuration is enabled. If empty, it is enabled for all space views.")
  public List<Long> getEnabledSpaceViews() {
    return enabledSpaceViews;
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
   * The URL to the connector&#39;s image.
   * @return imagePath
  **/
  @ApiModelProperty(value = "The URL to the connector's image.")
  public String getImagePath() {
    return imagePath;
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
   * The name used to identify the connector configuration.
   * @return name
  **/
  @ApiModelProperty(value = "The name used to identify the connector configuration.")
  public String getName() {
    return name;
  }

  
   /**
   * The payment method configuration that the connector configuration belongs to.
   * @return paymentMethodConfiguration
  **/
  @ApiModelProperty(value = "The payment method configuration that the connector configuration belongs to.")
  public PaymentMethodConfiguration getPaymentMethodConfiguration() {
    return paymentMethodConfiguration;
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
   * The priority that determines the order in which connector configurations are taken into account when processing a payment. Low values are considered first.
   * @return priority
  **/
  @ApiModelProperty(value = "The priority that determines the order in which connector configurations are taken into account when processing a payment. Low values are considered first.")
  public Integer getPriority() {
    return priority;
  }

  
   /**
   * The processor configuration that the connector configuration belongs to.
   * @return processorConfiguration
  **/
  @ApiModelProperty(value = "The processor configuration that the connector configuration belongs to.")
  public PaymentProcessorConfiguration getProcessorConfiguration() {
    return processorConfiguration;
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
    PaymentConnectorConfiguration paymentConnectorConfiguration = (PaymentConnectorConfiguration) o;
    return Objects.equals(this.applicableForTransactionProcessing, paymentConnectorConfiguration.applicableForTransactionProcessing) &&
        Objects.equals(this.conditions, paymentConnectorConfiguration.conditions) &&
        Objects.equals(this.connector, paymentConnectorConfiguration.connector) &&
        Objects.equals(this.enabledSalesChannels, paymentConnectorConfiguration.enabledSalesChannels) &&
        Objects.equals(this.enabledSpaceViews, paymentConnectorConfiguration.enabledSpaceViews) &&
        Objects.equals(this.id, paymentConnectorConfiguration.id) &&
        Objects.equals(this.imagePath, paymentConnectorConfiguration.imagePath) &&
        Objects.equals(this.linkedSpaceId, paymentConnectorConfiguration.linkedSpaceId) &&
        Objects.equals(this.name, paymentConnectorConfiguration.name) &&
        Objects.equals(this.paymentMethodConfiguration, paymentConnectorConfiguration.paymentMethodConfiguration) &&
        Objects.equals(this.plannedPurgeDate, paymentConnectorConfiguration.plannedPurgeDate) &&
        Objects.equals(this.priority, paymentConnectorConfiguration.priority) &&
        Objects.equals(this.processorConfiguration, paymentConnectorConfiguration.processorConfiguration) &&
        Objects.equals(this.state, paymentConnectorConfiguration.state) &&
        Objects.equals(this.version, paymentConnectorConfiguration.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicableForTransactionProcessing, conditions, connector, enabledSalesChannels, enabledSpaceViews, id, imagePath, linkedSpaceId, name, paymentMethodConfiguration, plannedPurgeDate, priority, processorConfiguration, state, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentConnectorConfiguration {\n");
    
    sb.append("    applicableForTransactionProcessing: ").append(toIndentedString(applicableForTransactionProcessing)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
    sb.append("    enabledSalesChannels: ").append(toIndentedString(enabledSalesChannels)).append("\n");
    sb.append("    enabledSpaceViews: ").append(toIndentedString(enabledSpaceViews)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imagePath: ").append(toIndentedString(imagePath)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paymentMethodConfiguration: ").append(toIndentedString(paymentMethodConfiguration)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    processorConfiguration: ").append(toIndentedString(processorConfiguration)).append("\n");
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

