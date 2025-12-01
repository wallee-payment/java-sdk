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
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.DocumentTemplate;
import com.wallee.sdk.model.DunningFlow;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * DunningFlowLevel
 */
@JsonPropertyOrder({
  DunningFlowLevel.JSON_PROPERTY_PERIOD,
  DunningFlowLevel.JSON_PROPERTY_PLANNED_PURGE_DATE,
  DunningFlowLevel.JSON_PROPERTY_REMINDER_TEMPLATE,
  DunningFlowLevel.JSON_PROPERTY_PRIORITY,
  DunningFlowLevel.JSON_PROPERTY_TITLE,
  DunningFlowLevel.JSON_PROPERTY_PROCESSOR,
  DunningFlowLevel.JSON_PROPERTY_VERSION,
  DunningFlowLevel.JSON_PROPERTY_LINKED_SPACE_ID,
  DunningFlowLevel.JSON_PROPERTY_DOCUMENT_TEXT,
  DunningFlowLevel.JSON_PROPERTY_NAME,
  DunningFlowLevel.JSON_PROPERTY_ID,
  DunningFlowLevel.JSON_PROPERTY_STATE,
  DunningFlowLevel.JSON_PROPERTY_FLOW
})

public class DunningFlowLevel {
  public static final String JSON_PROPERTY_PERIOD = "period";
  @javax.annotation.Nullable
  private String period;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  @javax.annotation.Nullable
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_REMINDER_TEMPLATE = "reminderTemplate";
  @javax.annotation.Nullable
  private DocumentTemplate reminderTemplate;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  @javax.annotation.Nullable
  private Integer priority;

  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nullable
  private Map<String, String> title = new HashMap<>();

  public static final String JSON_PROPERTY_PROCESSOR = "processor";
  @javax.annotation.Nullable
  private Long processor;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_DOCUMENT_TEXT = "documentText";
  @javax.annotation.Nullable
  private Map<String, String> documentText = new HashMap<>();

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private CreationEntityState state;

  public static final String JSON_PROPERTY_FLOW = "flow";
  @javax.annotation.Nullable
  private DunningFlow flow;

  public DunningFlowLevel() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public DunningFlowLevel(
    @JsonProperty(JSON_PROPERTY_PERIOD) String period, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_PRIORITY) Integer priority, 
    @JsonProperty(JSON_PROPERTY_TITLE) Map<String, String> title, 
    @JsonProperty(JSON_PROPERTY_PROCESSOR) Long processor, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_DOCUMENT_TEXT) Map<String, String> documentText, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_ID) Long id
  ) {
    this();
    this.period = period;
    this.plannedPurgeDate = plannedPurgeDate;
    this.priority = priority;
    this.title = title;
    this.processor = processor;
    this.version = version;
    this.linkedSpaceId = linkedSpaceId;
    this.documentText = documentText;
    this.name = name;
    this.id = id;
  }

  /**
   * The duration of the level before switching to the next one.
   * @return period
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPeriod() {
    return period;
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



  public DunningFlowLevel reminderTemplate(@javax.annotation.Nullable DocumentTemplate reminderTemplate) {
    
    this.reminderTemplate = reminderTemplate;
    return this;
  }

  /**
   * Get reminderTemplate
   * @return reminderTemplate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMINDER_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocumentTemplate getReminderTemplate() {
    return reminderTemplate;
  }


  @JsonProperty(JSON_PROPERTY_REMINDER_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReminderTemplate(@javax.annotation.Nullable DocumentTemplate reminderTemplate) {
    this.reminderTemplate = reminderTemplate;
  }

  /**
   * The priority indicates the sort order of the level. A low value indicates that the level is executed before any level with a higher value. Any change to this value affects future level selections. The value has to pe unique per dunning flow.
   * @return priority
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPriority() {
    return priority;
  }



  /**
   * The title is used to communicate the dunning level to the customer within the reminder.
   * @return title
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getTitle() {
    return title;
  }



  /**
   * Get processor
   * @return processor
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROCESSOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getProcessor() {
    return processor;
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
   * This text is put in the reminder document of this dunning flow level.
   * @return documentText
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCUMENT_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getDocumentText() {
    return documentText;
  }



  /**
   * The dunning flow level name is used internally to identify the dunning flow level. For example the name is used within search fields and hence it should be distinct and descriptive.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
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



  public DunningFlowLevel state(@javax.annotation.Nullable CreationEntityState state) {
    
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

  public DunningFlowLevel flow(@javax.annotation.Nullable DunningFlow flow) {
    
    this.flow = flow;
    return this;
  }

  /**
   * Get flow
   * @return flow
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DunningFlow getFlow() {
    return flow;
  }


  @JsonProperty(JSON_PROPERTY_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFlow(@javax.annotation.Nullable DunningFlow flow) {
    this.flow = flow;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DunningFlowLevel dunningFlowLevel = (DunningFlowLevel) o;
    return Objects.equals(this.period, dunningFlowLevel.period) &&
        Objects.equals(this.plannedPurgeDate, dunningFlowLevel.plannedPurgeDate) &&
        Objects.equals(this.reminderTemplate, dunningFlowLevel.reminderTemplate) &&
        Objects.equals(this.priority, dunningFlowLevel.priority) &&
        Objects.equals(this.title, dunningFlowLevel.title) &&
        Objects.equals(this.processor, dunningFlowLevel.processor) &&
        Objects.equals(this.version, dunningFlowLevel.version) &&
        Objects.equals(this.linkedSpaceId, dunningFlowLevel.linkedSpaceId) &&
        Objects.equals(this.documentText, dunningFlowLevel.documentText) &&
        Objects.equals(this.name, dunningFlowLevel.name) &&
        Objects.equals(this.id, dunningFlowLevel.id) &&
        Objects.equals(this.state, dunningFlowLevel.state) &&
        Objects.equals(this.flow, dunningFlowLevel.flow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, plannedPurgeDate, reminderTemplate, priority, title, processor, version, linkedSpaceId, documentText, name, id, state, flow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DunningFlowLevel {\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    reminderTemplate: ").append(toIndentedString(reminderTemplate)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    documentText: ").append(toIndentedString(documentText)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
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

    // add `period` to the URL query string
    if (getPeriod() != null) {
      try {
        joiner.add(String.format("%speriod%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPeriod()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `reminderTemplate` to the URL query string
    if (getReminderTemplate() != null) {
      joiner.add(getReminderTemplate().toUrlQueryString(prefix + "reminderTemplate" + suffix));
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

    // add `title` to the URL query string
    if (getTitle() != null) {
      for (String _key : getTitle().keySet()) {
        try {
          joiner.add(String.format("%stitle%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getTitle().get(_key), URLEncoder.encode(String.valueOf(getTitle().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `processor` to the URL query string
    if (getProcessor() != null) {
      try {
        joiner.add(String.format("%sprocessor%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getProcessor()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `linkedSpaceId` to the URL query string
    if (getLinkedSpaceId() != null) {
      try {
        joiner.add(String.format("%slinkedSpaceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedSpaceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `documentText` to the URL query string
    if (getDocumentText() != null) {
      for (String _key : getDocumentText().keySet()) {
        try {
          joiner.add(String.format("%sdocumentText%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getDocumentText().get(_key), URLEncoder.encode(String.valueOf(getDocumentText().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
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

    // add `flow` to the URL query string
    if (getFlow() != null) {
      joiner.add(getFlow().toUrlQueryString(prefix + "flow" + suffix));
    }

    return joiner.toString();
  }

}

