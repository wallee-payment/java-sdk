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
 * AbstractPaymentConnectorConfigurationUpdate
 */
@JsonPropertyOrder({
  AbstractPaymentConnectorConfigurationUpdate.JSON_PROPERTY_NAME,
  AbstractPaymentConnectorConfigurationUpdate.JSON_PROPERTY_ENABLED_SPACE_VIEWS,
  AbstractPaymentConnectorConfigurationUpdate.JSON_PROPERTY_CONDITIONS,
  AbstractPaymentConnectorConfigurationUpdate.JSON_PROPERTY_PRIORITY,
  AbstractPaymentConnectorConfigurationUpdate.JSON_PROPERTY_ENABLED_SALES_CHANNELS
})
@JsonTypeName("Abstract.PaymentConnectorConfiguration.Update")

public class AbstractPaymentConnectorConfigurationUpdate {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_ENABLED_SPACE_VIEWS = "enabledSpaceViews";
  @javax.annotation.Nullable
  private Set<Long> enabledSpaceViews = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_CONDITIONS = "conditions";
  @javax.annotation.Nullable
  private List<Condition> conditions = new ArrayList<>();

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  @javax.annotation.Nullable
  private Integer priority;

  public static final String JSON_PROPERTY_ENABLED_SALES_CHANNELS = "enabledSalesChannels";
  @javax.annotation.Nullable
  private Set<SalesChannel> enabledSalesChannels = new LinkedHashSet<>();

  public AbstractPaymentConnectorConfigurationUpdate() {
  }

  public AbstractPaymentConnectorConfigurationUpdate name(@javax.annotation.Nullable String name) {
    
    this.name = name;
    return this;
  }

  /**
   * The name used to identify the connector configuration.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }

  public AbstractPaymentConnectorConfigurationUpdate enabledSpaceViews(@javax.annotation.Nullable Set<Long> enabledSpaceViews) {
    
    this.enabledSpaceViews = enabledSpaceViews;
    return this;
  }

  public AbstractPaymentConnectorConfigurationUpdate addEnabledSpaceViewsItem(Long enabledSpaceViewsItem) {
    if (this.enabledSpaceViews == null) {
      this.enabledSpaceViews = new LinkedHashSet<>();
    }
    this.enabledSpaceViews.add(enabledSpaceViewsItem);
    return this;
  }

  /**
   * The space views for which the connector configuration is enabled. If empty, it is enabled for all space views.
   * @return enabledSpaceViews
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED_SPACE_VIEWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Long> getEnabledSpaceViews() {
    return enabledSpaceViews;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_ENABLED_SPACE_VIEWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabledSpaceViews(@javax.annotation.Nullable Set<Long> enabledSpaceViews) {
    this.enabledSpaceViews = enabledSpaceViews;
  }

  public AbstractPaymentConnectorConfigurationUpdate conditions(@javax.annotation.Nullable List<Condition> conditions) {
    
    this.conditions = conditions;
    return this;
  }

  public AbstractPaymentConnectorConfigurationUpdate addConditionsItem(Condition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * Conditions allow to define criteria that a transaction must fulfill in order for the connector configuration to be considered for processing the payment.
   * @return conditions
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Condition> getConditions() {
    return conditions;
  }


  @JsonProperty(JSON_PROPERTY_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConditions(@javax.annotation.Nullable List<Condition> conditions) {
    this.conditions = conditions;
  }

  public AbstractPaymentConnectorConfigurationUpdate priority(@javax.annotation.Nullable Integer priority) {
    
    this.priority = priority;
    return this;
  }

  /**
   * The priority that determines the order in which connector configurations are taken into account when processing a payment. Low values are considered first.
   * @return priority
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPriority() {
    return priority;
  }


  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriority(@javax.annotation.Nullable Integer priority) {
    this.priority = priority;
  }

  public AbstractPaymentConnectorConfigurationUpdate enabledSalesChannels(@javax.annotation.Nullable Set<SalesChannel> enabledSalesChannels) {
    
    this.enabledSalesChannels = enabledSalesChannels;
    return this;
  }

  public AbstractPaymentConnectorConfigurationUpdate addEnabledSalesChannelsItem(SalesChannel enabledSalesChannelsItem) {
    if (this.enabledSalesChannels == null) {
      this.enabledSalesChannels = new LinkedHashSet<>();
    }
    this.enabledSalesChannels.add(enabledSalesChannelsItem);
    return this;
  }

  /**
   * The sales channels for which the connector configuration is enabled. If empty, it is enabled for all sales channels.
   * @return enabledSalesChannels
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED_SALES_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<SalesChannel> getEnabledSalesChannels() {
    return enabledSalesChannels;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_ENABLED_SALES_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabledSalesChannels(@javax.annotation.Nullable Set<SalesChannel> enabledSalesChannels) {
    this.enabledSalesChannels = enabledSalesChannels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractPaymentConnectorConfigurationUpdate abstractPaymentConnectorConfigurationUpdate = (AbstractPaymentConnectorConfigurationUpdate) o;
    return Objects.equals(this.name, abstractPaymentConnectorConfigurationUpdate.name) &&
        Objects.equals(this.enabledSpaceViews, abstractPaymentConnectorConfigurationUpdate.enabledSpaceViews) &&
        Objects.equals(this.conditions, abstractPaymentConnectorConfigurationUpdate.conditions) &&
        Objects.equals(this.priority, abstractPaymentConnectorConfigurationUpdate.priority) &&
        Objects.equals(this.enabledSalesChannels, abstractPaymentConnectorConfigurationUpdate.enabledSalesChannels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, enabledSpaceViews, conditions, priority, enabledSalesChannels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractPaymentConnectorConfigurationUpdate {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabledSpaceViews: ").append(toIndentedString(enabledSpaceViews)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    enabledSalesChannels: ").append(toIndentedString(enabledSalesChannels)).append("\n");
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

    return joiner.toString();
  }

}

