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
import com.wallee.sdk.model.PaymentConnector;
import com.wallee.sdk.model.PaymentMethodConfiguration;
import com.wallee.sdk.model.PaymentProcessorConfiguration;
import com.wallee.sdk.model.SalesChannel;
import java.time.OffsetDateTime;
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
 * PaymentConnectorConfiguration
 */
@JsonPropertyOrder({
  PaymentConnectorConfiguration.JSON_PROPERTY_PAYMENT_METHOD_CONFIGURATION,
  PaymentConnectorConfiguration.JSON_PROPERTY_IMAGE_PATH,
  PaymentConnectorConfiguration.JSON_PROPERTY_PLANNED_PURGE_DATE,
  PaymentConnectorConfiguration.JSON_PROPERTY_PRIORITY,
  PaymentConnectorConfiguration.JSON_PROPERTY_ENABLED_SALES_CHANNELS,
  PaymentConnectorConfiguration.JSON_PROPERTY_VERSION,
  PaymentConnectorConfiguration.JSON_PROPERTY_PROCESSOR_CONFIGURATION,
  PaymentConnectorConfiguration.JSON_PROPERTY_LINKED_SPACE_ID,
  PaymentConnectorConfiguration.JSON_PROPERTY_CONNECTOR,
  PaymentConnectorConfiguration.JSON_PROPERTY_NAME,
  PaymentConnectorConfiguration.JSON_PROPERTY_ENABLED_SPACE_VIEWS,
  PaymentConnectorConfiguration.JSON_PROPERTY_ID,
  PaymentConnectorConfiguration.JSON_PROPERTY_STATE,
  PaymentConnectorConfiguration.JSON_PROPERTY_APPLICABLE_FOR_TRANSACTION_PROCESSING,
  PaymentConnectorConfiguration.JSON_PROPERTY_CONDITIONS
})

public class PaymentConnectorConfiguration {
  public static final String JSON_PROPERTY_PAYMENT_METHOD_CONFIGURATION = "paymentMethodConfiguration";
  private PaymentMethodConfiguration paymentMethodConfiguration;

  public static final String JSON_PROPERTY_IMAGE_PATH = "imagePath";
  private String imagePath;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private Integer priority;

  public static final String JSON_PROPERTY_ENABLED_SALES_CHANNELS = "enabledSalesChannels";
  private Set<SalesChannel> enabledSalesChannels = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_PROCESSOR_CONFIGURATION = "processorConfiguration";
  private PaymentProcessorConfiguration processorConfiguration;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_CONNECTOR = "connector";
  private PaymentConnector connector;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ENABLED_SPACE_VIEWS = "enabledSpaceViews";
  private Set<Long> enabledSpaceViews = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  private CreationEntityState state;

  public static final String JSON_PROPERTY_APPLICABLE_FOR_TRANSACTION_PROCESSING = "applicableForTransactionProcessing";
  private Boolean applicableForTransactionProcessing;

  public static final String JSON_PROPERTY_CONDITIONS = "conditions";
  private List<Condition> conditions = new ArrayList<>();

  public PaymentConnectorConfiguration() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public PaymentConnectorConfiguration(
    @JsonProperty(JSON_PROPERTY_IMAGE_PATH) String imagePath, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_PRIORITY) Integer priority, 
    @JsonProperty(JSON_PROPERTY_ENABLED_SALES_CHANNELS) Set<SalesChannel> enabledSalesChannels, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_ENABLED_SPACE_VIEWS) Set<Long> enabledSpaceViews, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_APPLICABLE_FOR_TRANSACTION_PROCESSING) Boolean applicableForTransactionProcessing, 
    @JsonProperty(JSON_PROPERTY_CONDITIONS) List<Condition> conditions
  ) {
    this();
    this.imagePath = imagePath;
    this.plannedPurgeDate = plannedPurgeDate;
    this.priority = priority;
    this.enabledSalesChannels = enabledSalesChannels;
    this.version = version;
    this.linkedSpaceId = linkedSpaceId;
    this.name = name;
    this.enabledSpaceViews = enabledSpaceViews;
    this.id = id;
    this.applicableForTransactionProcessing = applicableForTransactionProcessing;
    this.conditions = conditions;
  }

  public PaymentConnectorConfiguration paymentMethodConfiguration(PaymentMethodConfiguration paymentMethodConfiguration) {
    
    this.paymentMethodConfiguration = paymentMethodConfiguration;
    return this;
  }

   /**
   * Get paymentMethodConfiguration
   * @return paymentMethodConfiguration
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentMethodConfiguration getPaymentMethodConfiguration() {
    return paymentMethodConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethodConfiguration(PaymentMethodConfiguration paymentMethodConfiguration) {
    this.paymentMethodConfiguration = paymentMethodConfiguration;
  }

   /**
   * The URL to the connector&#39;s image.
   * @return imagePath
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImagePath() {
    return imagePath;
  }



   /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
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



   /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }



  public PaymentConnectorConfiguration processorConfiguration(PaymentProcessorConfiguration processorConfiguration) {
    
    this.processorConfiguration = processorConfiguration;
    return this;
  }

   /**
   * Get processorConfiguration
   * @return processorConfiguration
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROCESSOR_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentProcessorConfiguration getProcessorConfiguration() {
    return processorConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_PROCESSOR_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProcessorConfiguration(PaymentProcessorConfiguration processorConfiguration) {
    this.processorConfiguration = processorConfiguration;
  }

   /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }



  public PaymentConnectorConfiguration connector(PaymentConnector connector) {
    
    this.connector = connector;
    return this;
  }

   /**
   * Get connector
   * @return connector
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentConnector getConnector() {
    return connector;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnector(PaymentConnector connector) {
    this.connector = connector;
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



   /**
   * A unique identifier for the object.
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }



  public PaymentConnectorConfiguration state(CreationEntityState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreationEntityState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(CreationEntityState state) {
    this.state = state;
  }

   /**
   * Whether this connector configuration is enabled for processing payments, taking into account the state of the processor and payment method configurations.
   * @return applicableForTransactionProcessing
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLICABLE_FOR_TRANSACTION_PROCESSING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getApplicableForTransactionProcessing() {
    return applicableForTransactionProcessing;
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentConnectorConfiguration paymentConnectorConfiguration = (PaymentConnectorConfiguration) o;
    return Objects.equals(this.paymentMethodConfiguration, paymentConnectorConfiguration.paymentMethodConfiguration) &&
        Objects.equals(this.imagePath, paymentConnectorConfiguration.imagePath) &&
        Objects.equals(this.plannedPurgeDate, paymentConnectorConfiguration.plannedPurgeDate) &&
        Objects.equals(this.priority, paymentConnectorConfiguration.priority) &&
        Objects.equals(this.enabledSalesChannels, paymentConnectorConfiguration.enabledSalesChannels) &&
        Objects.equals(this.version, paymentConnectorConfiguration.version) &&
        Objects.equals(this.processorConfiguration, paymentConnectorConfiguration.processorConfiguration) &&
        Objects.equals(this.linkedSpaceId, paymentConnectorConfiguration.linkedSpaceId) &&
        Objects.equals(this.connector, paymentConnectorConfiguration.connector) &&
        Objects.equals(this.name, paymentConnectorConfiguration.name) &&
        Objects.equals(this.enabledSpaceViews, paymentConnectorConfiguration.enabledSpaceViews) &&
        Objects.equals(this.id, paymentConnectorConfiguration.id) &&
        Objects.equals(this.state, paymentConnectorConfiguration.state) &&
        Objects.equals(this.applicableForTransactionProcessing, paymentConnectorConfiguration.applicableForTransactionProcessing) &&
        Objects.equals(this.conditions, paymentConnectorConfiguration.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethodConfiguration, imagePath, plannedPurgeDate, priority, enabledSalesChannels, version, processorConfiguration, linkedSpaceId, connector, name, enabledSpaceViews, id, state, applicableForTransactionProcessing, conditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentConnectorConfiguration {\n");
    sb.append("    paymentMethodConfiguration: ").append(toIndentedString(paymentMethodConfiguration)).append("\n");
    sb.append("    imagePath: ").append(toIndentedString(imagePath)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    enabledSalesChannels: ").append(toIndentedString(enabledSalesChannels)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    processorConfiguration: ").append(toIndentedString(processorConfiguration)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabledSpaceViews: ").append(toIndentedString(enabledSpaceViews)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    applicableForTransactionProcessing: ").append(toIndentedString(applicableForTransactionProcessing)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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

    // add `paymentMethodConfiguration` to the URL query string
    if (getPaymentMethodConfiguration() != null) {
      joiner.add(getPaymentMethodConfiguration().toUrlQueryString(prefix + "paymentMethodConfiguration" + suffix));
    }

    // add `imagePath` to the URL query string
    if (getImagePath() != null) {
      try {
        joiner.add(String.format("%simagePath%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImagePath()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `plannedPurgeDate` to the URL query string
    if (getPlannedPurgeDate() != null) {
      try {
        joiner.add(String.format("%splannedPurgeDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlannedPurgeDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
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

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `processorConfiguration` to the URL query string
    if (getProcessorConfiguration() != null) {
      joiner.add(getProcessorConfiguration().toUrlQueryString(prefix + "processorConfiguration" + suffix));
    }

    // add `linkedSpaceId` to the URL query string
    if (getLinkedSpaceId() != null) {
      try {
        joiner.add(String.format("%slinkedSpaceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedSpaceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `connector` to the URL query string
    if (getConnector() != null) {
      joiner.add(getConnector().toUrlQueryString(prefix + "connector" + suffix));
    }

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

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `applicableForTransactionProcessing` to the URL query string
    if (getApplicableForTransactionProcessing() != null) {
      try {
        joiner.add(String.format("%sapplicableForTransactionProcessing%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getApplicableForTransactionProcessing()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

    return joiner.toString();
  }

}

