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
   * This property indicates if the connector is currently used for processing transactions. In case either the payment method configuration or the processor configuration is not active the connector will not be used even though the connector state is active.
   * @return applicableForTransactionProcessing
  **/
  @ApiModelProperty(value = "This property indicates if the connector is currently used for processing transactions. In case either the payment method configuration or the processor configuration is not active the connector will not be used even though the connector state is active.")
  public Boolean isApplicableForTransactionProcessing() {
    return applicableForTransactionProcessing;
  }

  
   /**
   * If a transaction meet all selected conditions the connector configuration will be used to process the transaction otherwise the next connector configuration in line will be chosen according to the priorities.
   * @return conditions
  **/
  @ApiModelProperty(value = "If a transaction meet all selected conditions the connector configuration will be used to process the transaction otherwise the next connector configuration in line will be chosen according to the priorities.")
  public List<Long> getConditions() {
    return conditions;
  }

  
   /**
   * 
   * @return connector
  **/
  @ApiModelProperty(value = "")
  public Long getConnector() {
    return connector;
  }

  
   /**
   * Defines the sales channels the connector configuration is enabled for. In case the set is empty, the connector configuration is enabled for all sales channels.
   * @return enabledSalesChannels
  **/
  @ApiModelProperty(value = "Defines the sales channels the connector configuration is enabled for. In case the set is empty, the connector configuration is enabled for all sales channels.")
  public List<SalesChannel> getEnabledSalesChannels() {
    return enabledSalesChannels;
  }

  
   /**
   * The connector configuration is only enabled for the selected space views. In case the set is empty the connector configuration is enabled for all space views.
   * @return enabledSpaceViews
  **/
  @ApiModelProperty(value = "The connector configuration is only enabled for the selected space views. In case the set is empty the connector configuration is enabled for all space views.")
  public List<Long> getEnabledSpaceViews() {
    return enabledSpaceViews;
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
   * The connector configuration name is used internally to identify the configuration in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.
   * @return name
  **/
  @ApiModelProperty(value = "The connector configuration name is used internally to identify the configuration in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.")
  public String getName() {
    return name;
  }

  
   /**
   * 
   * @return paymentMethodConfiguration
  **/
  @ApiModelProperty(value = "")
  public PaymentMethodConfiguration getPaymentMethodConfiguration() {
    return paymentMethodConfiguration;
  }

  
   /**
   * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * The priority will define the order of choice of the connector configurations. The lower the value, the higher the priority is going to be. This value can also be a negative number in case you are adding a new configuration that you want to have a high priority and you dont want to change the priority of all the other configurations.
   * @return priority
  **/
  @ApiModelProperty(value = "The priority will define the order of choice of the connector configurations. The lower the value, the higher the priority is going to be. This value can also be a negative number in case you are adding a new configuration that you want to have a high priority and you dont want to change the priority of all the other configurations.")
  public Integer getPriority() {
    return priority;
  }

  
   /**
   * 
   * @return processorConfiguration
  **/
  @ApiModelProperty(value = "")
  public PaymentProcessorConfiguration getProcessorConfiguration() {
    return processorConfiguration;
  }

  
   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public CreationEntityState getState() {
    return state;
  }

  
   /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
  **/
  @ApiModelProperty(value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
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
    return Objects.hash(applicableForTransactionProcessing, conditions, connector, enabledSalesChannels, enabledSpaceViews, id, linkedSpaceId, name, paymentMethodConfiguration, plannedPurgeDate, priority, processorConfiguration, state, version);
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

