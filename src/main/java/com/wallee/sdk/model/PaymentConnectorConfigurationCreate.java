/**
 * Wallee AG Java SDK
 *
 * This library allows to interact with the Wallee AG payment service.
 *
 * Copyright owner: Wallee AG
 * Website: https://en.wallee.com
 * Developer email: ecosystem-team@wallee.com
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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.wallee.sdk.model.Condition;
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.SalesChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * PaymentConnectorConfigurationCreate
 */
@JsonPropertyOrder({
  PaymentConnectorConfigurationCreate.JSON_PROPERTY_NAME,
  PaymentConnectorConfigurationCreate.JSON_PROPERTY_ENABLED_SPACE_VIEWS,
  PaymentConnectorConfigurationCreate.JSON_PROPERTY_CONDITIONS,
  PaymentConnectorConfigurationCreate.JSON_PROPERTY_PRIORITY,
  PaymentConnectorConfigurationCreate.JSON_PROPERTY_ENABLED_SALES_CHANNELS,
  PaymentConnectorConfigurationCreate.JSON_PROPERTY_PAYMENT_METHOD_CONFIGURATION,
  PaymentConnectorConfigurationCreate.JSON_PROPERTY_CONNECTOR,
  PaymentConnectorConfigurationCreate.JSON_PROPERTY_STATE,
  PaymentConnectorConfigurationCreate.JSON_PROPERTY_PROCESSOR_CONFIGURATION
})
@JsonTypeName("PaymentConnectorConfiguration.Create")

public class PaymentConnectorConfigurationCreate {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ENABLED_SPACE_VIEWS = "enabledSpaceViews";
  private Set<Long> enabledSpaceViews = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_CONDITIONS = "conditions";
  private List<Condition> conditions = new ArrayList<>();

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private Integer priority;

  public static final String JSON_PROPERTY_ENABLED_SALES_CHANNELS = "enabledSalesChannels";
  private Set<SalesChannel> enabledSalesChannels = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_PAYMENT_METHOD_CONFIGURATION = "paymentMethodConfiguration";
  private Long paymentMethodConfiguration;

  public static final String JSON_PROPERTY_CONNECTOR = "connector";
  private Long connector;

  public static final String JSON_PROPERTY_STATE = "state";
  private CreationEntityState state;

  public static final String JSON_PROPERTY_PROCESSOR_CONFIGURATION = "processorConfiguration";
  private Long processorConfiguration;

  public PaymentConnectorConfigurationCreate() {
  }

  public PaymentConnectorConfigurationCreate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name used to identify the connector configuration.
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }

  public PaymentConnectorConfigurationCreate enabledSpaceViews(Set<Long> enabledSpaceViews) {
    
    this.enabledSpaceViews = enabledSpaceViews;
    return this;
  }

  public PaymentConnectorConfigurationCreate addEnabledSpaceViewsItem(Long enabledSpaceViewsItem) {
    if (this.enabledSpaceViews == null) {
      this.enabledSpaceViews = new LinkedHashSet<>();
    }
    this.enabledSpaceViews.add(enabledSpaceViewsItem);
    return this;
  }

   /**
   * The space views for which the connector configuration is enabled. If empty, it is enabled for all space views.
   * @return enabledSpaceViews
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED_SPACE_VIEWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Long> getEnabledSpaceViews() {
    return enabledSpaceViews;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_ENABLED_SPACE_VIEWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabledSpaceViews(Set<Long> enabledSpaceViews) {
    this.enabledSpaceViews = enabledSpaceViews;
  }

  public PaymentConnectorConfigurationCreate conditions(List<Condition> conditions) {
    
    this.conditions = conditions;
    return this;
  }

  public PaymentConnectorConfigurationCreate addConditionsItem(Condition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Conditions allow to define criteria that a transaction must fulfill in order for the connector configuration to be considered for processing the payment.
   * @return conditions
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Condition> getConditions() {
    return conditions;
  }


  @JsonProperty(JSON_PROPERTY_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConditions(List<Condition> conditions) {
    this.conditions = conditions;
  }

  public PaymentConnectorConfigurationCreate priority(Integer priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * The priority that determines the order in which connector configurations are taken into account when processing a payment. Low values are considered first.
   * @return priority
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPriority() {
    return priority;
  }


  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public PaymentConnectorConfigurationCreate enabledSalesChannels(Set<SalesChannel> enabledSalesChannels) {
    
    this.enabledSalesChannels = enabledSalesChannels;
    return this;
  }

  public PaymentConnectorConfigurationCreate addEnabledSalesChannelsItem(SalesChannel enabledSalesChannelsItem) {
    if (this.enabledSalesChannels == null) {
      this.enabledSalesChannels = new LinkedHashSet<>();
    }
    this.enabledSalesChannels.add(enabledSalesChannelsItem);
    return this;
  }

   /**
   * The sales channels for which the connector configuration is enabled. If empty, it is enabled for all sales channels.
   * @return enabledSalesChannels
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED_SALES_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<SalesChannel> getEnabledSalesChannels() {
    return enabledSalesChannels;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_ENABLED_SALES_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabledSalesChannels(Set<SalesChannel> enabledSalesChannels) {
    this.enabledSalesChannels = enabledSalesChannels;
  }

  public PaymentConnectorConfigurationCreate paymentMethodConfiguration(Long paymentMethodConfiguration) {
    
    this.paymentMethodConfiguration = paymentMethodConfiguration;
    return this;
  }

   /**
   * The payment method configuration that the connector configuration belongs to.
   * @return paymentMethodConfiguration
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getPaymentMethodConfiguration() {
    return paymentMethodConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentMethodConfiguration(Long paymentMethodConfiguration) {
    this.paymentMethodConfiguration = paymentMethodConfiguration;
  }

  public PaymentConnectorConfigurationCreate connector(Long connector) {
    
    this.connector = connector;
    return this;
  }

   /**
   * The connector that the configuration is for.
   * @return connector
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getConnector() {
    return connector;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConnector(Long connector) {
    this.connector = connector;
  }

  public PaymentConnectorConfigurationCreate state(CreationEntityState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CreationEntityState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setState(CreationEntityState state) {
    this.state = state;
  }

  public PaymentConnectorConfigurationCreate processorConfiguration(Long processorConfiguration) {
    
    this.processorConfiguration = processorConfiguration;
    return this;
  }

   /**
   * The processor configuration that the connector configuration belongs to.
   * @return processorConfiguration
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROCESSOR_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getProcessorConfiguration() {
    return processorConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_PROCESSOR_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProcessorConfiguration(Long processorConfiguration) {
    this.processorConfiguration = processorConfiguration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentConnectorConfigurationCreate paymentConnectorConfigurationCreate = (PaymentConnectorConfigurationCreate) o;
    return Objects.equals(this.name, paymentConnectorConfigurationCreate.name) &&
        Objects.equals(this.enabledSpaceViews, paymentConnectorConfigurationCreate.enabledSpaceViews) &&
        Objects.equals(this.conditions, paymentConnectorConfigurationCreate.conditions) &&
        Objects.equals(this.priority, paymentConnectorConfigurationCreate.priority) &&
        Objects.equals(this.enabledSalesChannels, paymentConnectorConfigurationCreate.enabledSalesChannels) &&
        Objects.equals(this.paymentMethodConfiguration, paymentConnectorConfigurationCreate.paymentMethodConfiguration) &&
        Objects.equals(this.connector, paymentConnectorConfigurationCreate.connector) &&
        Objects.equals(this.state, paymentConnectorConfigurationCreate.state) &&
        Objects.equals(this.processorConfiguration, paymentConnectorConfigurationCreate.processorConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, enabledSpaceViews, conditions, priority, enabledSalesChannels, paymentMethodConfiguration, connector, state, processorConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentConnectorConfigurationCreate {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabledSpaceViews: ").append(toIndentedString(enabledSpaceViews)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    enabledSalesChannels: ").append(toIndentedString(enabledSalesChannels)).append("\n");
    sb.append("    paymentMethodConfiguration: ").append(toIndentedString(paymentMethodConfiguration)).append("\n");
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    processorConfiguration: ").append(toIndentedString(processorConfiguration)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `enabledSpaceViews` to the URL query string
    if (getEnabledSpaceViews() != null) {
      int i = 0;
      for (Long _item : getEnabledSpaceViews()) {
        try {
          joiner.add(String.format("%senabledSpaceViews%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(_item), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
      i++;
    }

    // add `conditions` to the URL query string
    if (getConditions() != null) {
      for (int i = 0; i < getConditions().size(); i++) {
        if (getConditions().get(i) != null) {
          joiner.add(getConditions().get(i).toUrlQueryString(String.format("%sconditions%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `priority` to the URL query string
    if (getPriority() != null) {
      try {
        joiner.add(String.format("%spriority%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPriority()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `enabledSalesChannels` to the URL query string
    if (getEnabledSalesChannels() != null) {
      int i = 0;
      for (SalesChannel _item : getEnabledSalesChannels()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%senabledSalesChannels%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `paymentMethodConfiguration` to the URL query string
    if (getPaymentMethodConfiguration() != null) {
      try {
        joiner.add(String.format("%spaymentMethodConfiguration%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPaymentMethodConfiguration()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `connector` to the URL query string
    if (getConnector() != null) {
      try {
        joiner.add(String.format("%sconnector%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConnector()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `state` to the URL query string
    if (getState() != null) {
      try {
        joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `processorConfiguration` to the URL query string
    if (getProcessorConfiguration() != null) {
      try {
        joiner.add(String.format("%sprocessorConfiguration%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProcessorConfiguration()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

