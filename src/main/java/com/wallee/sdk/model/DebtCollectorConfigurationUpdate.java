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
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.DebtCollectorCondition;
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
 * The debt collector configuration defines the behavior of the collection process for a particular collector.
 */
@JsonPropertyOrder({
  DebtCollectorConfigurationUpdate.JSON_PROPERTY_SKIP_REVIEW_ENABLED,
  DebtCollectorConfigurationUpdate.JSON_PROPERTY_NAME,
  DebtCollectorConfigurationUpdate.JSON_PROPERTY_ENABLED_SPACE_VIEWS,
  DebtCollectorConfigurationUpdate.JSON_PROPERTY_STATE,
  DebtCollectorConfigurationUpdate.JSON_PROPERTY_CONDITIONS,
  DebtCollectorConfigurationUpdate.JSON_PROPERTY_PRIORITY,
  DebtCollectorConfigurationUpdate.JSON_PROPERTY_VERSION
})
@JsonTypeName("DebtCollectorConfiguration.Update")

public class DebtCollectorConfigurationUpdate {
  public static final String JSON_PROPERTY_SKIP_REVIEW_ENABLED = "skipReviewEnabled";
  @javax.annotation.Nullable
  private Boolean skipReviewEnabled;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_ENABLED_SPACE_VIEWS = "enabledSpaceViews";
  @javax.annotation.Nullable
  private Set<Long> enabledSpaceViews = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private CreationEntityState state;

  public static final String JSON_PROPERTY_CONDITIONS = "conditions";
  @javax.annotation.Nullable
  private List<DebtCollectorCondition> conditions = new ArrayList<>();

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  @javax.annotation.Nullable
  private Integer priority;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nonnull
  private Integer version;

  public DebtCollectorConfigurationUpdate() {
  }

  public DebtCollectorConfigurationUpdate skipReviewEnabled(@javax.annotation.Nullable Boolean skipReviewEnabled) {
    
    this.skipReviewEnabled = skipReviewEnabled;
    return this;
  }

  /**
   * Whether the review of debt collection cases is skipped.
   * @return skipReviewEnabled
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SKIP_REVIEW_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSkipReviewEnabled() {
    return skipReviewEnabled;
  }


  @JsonProperty(JSON_PROPERTY_SKIP_REVIEW_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkipReviewEnabled(@javax.annotation.Nullable Boolean skipReviewEnabled) {
    this.skipReviewEnabled = skipReviewEnabled;
  }

  public DebtCollectorConfigurationUpdate name(@javax.annotation.Nullable String name) {
    
    this.name = name;
    return this;
  }

  /**
   * The name used to identify the debt collector configuration.
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

  public DebtCollectorConfigurationUpdate enabledSpaceViews(@javax.annotation.Nullable Set<Long> enabledSpaceViews) {
    
    this.enabledSpaceViews = enabledSpaceViews;
    return this;
  }

  public DebtCollectorConfigurationUpdate addEnabledSpaceViewsItem(Long enabledSpaceViewsItem) {
    if (this.enabledSpaceViews == null) {
      this.enabledSpaceViews = new LinkedHashSet<>();
    }
    this.enabledSpaceViews.add(enabledSpaceViewsItem);
    return this;
  }

  /**
   * The space views for which the debt collector configuration is enabled. If empty, it is enabled for all space views.
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

  public DebtCollectorConfigurationUpdate state(@javax.annotation.Nullable CreationEntityState state) {
    
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreationEntityState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable CreationEntityState state) {
    this.state = state;
  }

  public DebtCollectorConfigurationUpdate conditions(@javax.annotation.Nullable List<DebtCollectorCondition> conditions) {
    
    this.conditions = conditions;
    return this;
  }

  public DebtCollectorConfigurationUpdate addConditionsItem(DebtCollectorCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

  /**
   * Conditions allow to define criteria that a debt collection case must fulfill in order for the debt collector configuration to be considered for processing the case.
   * @return conditions
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DebtCollectorCondition> getConditions() {
    return conditions;
  }


  @JsonProperty(JSON_PROPERTY_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConditions(@javax.annotation.Nullable List<DebtCollectorCondition> conditions) {
    this.conditions = conditions;
  }

  public DebtCollectorConfigurationUpdate priority(@javax.annotation.Nullable Integer priority) {
    
    this.priority = priority;
    return this;
  }

  /**
   * The priority that determines the order in which debt collector configurations are taken into account when processing a case. Low values are considered first.
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

  public DebtCollectorConfigurationUpdate version(@javax.annotation.Nonnull Integer version) {
    
    this.version = version;
    return this;
  }

  /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersion(@javax.annotation.Nonnull Integer version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebtCollectorConfigurationUpdate debtCollectorConfigurationUpdate = (DebtCollectorConfigurationUpdate) o;
    return Objects.equals(this.skipReviewEnabled, debtCollectorConfigurationUpdate.skipReviewEnabled) &&
        Objects.equals(this.name, debtCollectorConfigurationUpdate.name) &&
        Objects.equals(this.enabledSpaceViews, debtCollectorConfigurationUpdate.enabledSpaceViews) &&
        Objects.equals(this.state, debtCollectorConfigurationUpdate.state) &&
        Objects.equals(this.conditions, debtCollectorConfigurationUpdate.conditions) &&
        Objects.equals(this.priority, debtCollectorConfigurationUpdate.priority) &&
        Objects.equals(this.version, debtCollectorConfigurationUpdate.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skipReviewEnabled, name, enabledSpaceViews, state, conditions, priority, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebtCollectorConfigurationUpdate {\n");
    sb.append("    skipReviewEnabled: ").append(toIndentedString(skipReviewEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabledSpaceViews: ").append(toIndentedString(enabledSpaceViews)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

    // add `skipReviewEnabled` to the URL query string
    if (getSkipReviewEnabled() != null) {
      try {
        joiner.add(String.format("%sskipReviewEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSkipReviewEnabled()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

    // add `state` to the URL query string
    if (getState() != null) {
      try {
        joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `priority` to the URL query string
    if (getPriority() != null) {
      try {
        joiner.add(String.format("%spriority%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPriority()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
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

    return joiner.toString();
  }

}

