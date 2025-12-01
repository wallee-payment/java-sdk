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
import com.wallee.sdk.model.DebtCollector;
import com.wallee.sdk.model.DebtCollectorCondition;
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
 * The debt collector configuration defines the behavior of the collection process for a particular collector.
 */
@JsonPropertyOrder({
  DebtCollectorConfiguration.JSON_PROPERTY_LINKED_SPACE_ID,
  DebtCollectorConfiguration.JSON_PROPERTY_SKIP_REVIEW_ENABLED,
  DebtCollectorConfiguration.JSON_PROPERTY_NAME,
  DebtCollectorConfiguration.JSON_PROPERTY_PLANNED_PURGE_DATE,
  DebtCollectorConfiguration.JSON_PROPERTY_ENABLED_SPACE_VIEWS,
  DebtCollectorConfiguration.JSON_PROPERTY_ID,
  DebtCollectorConfiguration.JSON_PROPERTY_STATE,
  DebtCollectorConfiguration.JSON_PROPERTY_CONDITIONS,
  DebtCollectorConfiguration.JSON_PROPERTY_PRIORITY,
  DebtCollectorConfiguration.JSON_PROPERTY_VERSION,
  DebtCollectorConfiguration.JSON_PROPERTY_COLLECTOR
})

public class DebtCollectorConfiguration {
  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_SKIP_REVIEW_ENABLED = "skipReviewEnabled";
  @javax.annotation.Nullable
  private Boolean skipReviewEnabled;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  @javax.annotation.Nullable
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_ENABLED_SPACE_VIEWS = "enabledSpaceViews";
  @javax.annotation.Nullable
  private Set<Long> enabledSpaceViews = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

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
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_COLLECTOR = "collector";
  @javax.annotation.Nullable
  private DebtCollector collector;

  public DebtCollectorConfiguration() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public DebtCollectorConfiguration(
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_SKIP_REVIEW_ENABLED) Boolean skipReviewEnabled, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_ENABLED_SPACE_VIEWS) Set<Long> enabledSpaceViews, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_CONDITIONS) List<DebtCollectorCondition> conditions, 
    @JsonProperty(JSON_PROPERTY_PRIORITY) Integer priority, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version
  ) {
    this();
    this.linkedSpaceId = linkedSpaceId;
    this.skipReviewEnabled = skipReviewEnabled;
    this.name = name;
    this.plannedPurgeDate = plannedPurgeDate;
    this.enabledSpaceViews = enabledSpaceViews;
    this.id = id;
    this.conditions = conditions;
    this.priority = priority;
    this.version = version;
  }

  /**
   * The ID of the space this object belongs to.
   * @return linkedSpaceId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedSpaceId() {
    return linkedSpaceId;
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



  /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
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



  /**
   * A unique identifier for the object.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }



  public DebtCollectorConfiguration state(@javax.annotation.Nullable CreationEntityState state) {
    
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



  /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }



  public DebtCollectorConfiguration collector(@javax.annotation.Nullable DebtCollector collector) {
    
    this.collector = collector;
    return this;
  }

  /**
   * Get collector
   * @return collector
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLLECTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DebtCollector getCollector() {
    return collector;
  }


  @JsonProperty(JSON_PROPERTY_COLLECTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCollector(@javax.annotation.Nullable DebtCollector collector) {
    this.collector = collector;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebtCollectorConfiguration debtCollectorConfiguration = (DebtCollectorConfiguration) o;
    return Objects.equals(this.linkedSpaceId, debtCollectorConfiguration.linkedSpaceId) &&
        Objects.equals(this.skipReviewEnabled, debtCollectorConfiguration.skipReviewEnabled) &&
        Objects.equals(this.name, debtCollectorConfiguration.name) &&
        Objects.equals(this.plannedPurgeDate, debtCollectorConfiguration.plannedPurgeDate) &&
        Objects.equals(this.enabledSpaceViews, debtCollectorConfiguration.enabledSpaceViews) &&
        Objects.equals(this.id, debtCollectorConfiguration.id) &&
        Objects.equals(this.state, debtCollectorConfiguration.state) &&
        Objects.equals(this.conditions, debtCollectorConfiguration.conditions) &&
        Objects.equals(this.priority, debtCollectorConfiguration.priority) &&
        Objects.equals(this.version, debtCollectorConfiguration.version) &&
        Objects.equals(this.collector, debtCollectorConfiguration.collector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkedSpaceId, skipReviewEnabled, name, plannedPurgeDate, enabledSpaceViews, id, state, conditions, priority, version, collector);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebtCollectorConfiguration {\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    skipReviewEnabled: ").append(toIndentedString(skipReviewEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    enabledSpaceViews: ").append(toIndentedString(enabledSpaceViews)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    collector: ").append(toIndentedString(collector)).append("\n");
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

    // add `linkedSpaceId` to the URL query string
    if (getLinkedSpaceId() != null) {
      try {
        joiner.add(String.format("%slinkedSpaceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedSpaceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

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

    // add `plannedPurgeDate` to the URL query string
    if (getPlannedPurgeDate() != null) {
      try {
        joiner.add(String.format("%splannedPurgeDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlannedPurgeDate()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `collector` to the URL query string
    if (getCollector() != null) {
      joiner.add(getCollector().toUrlQueryString(prefix + "collector" + suffix));
    }

    return joiner.toString();
  }

}

