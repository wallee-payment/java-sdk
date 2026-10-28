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
import com.wallee.sdk.model.DunningCase;
import com.wallee.sdk.model.DunningCaseLevelState;
import com.wallee.sdk.model.Environment;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * DunningCaseLevel
 */
@JsonPropertyOrder({
  DunningCaseLevel.JSON_PROPERTY_CANCELED_ON,
  DunningCaseLevel.JSON_PROPERTY_PLANNED_PURGE_DATE,
  DunningCaseLevel.JSON_PROPERTY_LANGUAGE,
  DunningCaseLevel.JSON_PROPERTY_CREATED_ON,
  DunningCaseLevel.JSON_PROPERTY_VERSION,
  DunningCaseLevel.JSON_PROPERTY_FLOW_LEVEL,
  DunningCaseLevel.JSON_PROPERTY_LINKED_SPACE_ID,
  DunningCaseLevel.JSON_PROPERTY_TIMEOUT_ON,
  DunningCaseLevel.JSON_PROPERTY_ENVIRONMENT,
  DunningCaseLevel.JSON_PROPERTY_SUCCEEDED_ON,
  DunningCaseLevel.JSON_PROPERTY_ID,
  DunningCaseLevel.JSON_PROPERTY_INVOICE,
  DunningCaseLevel.JSON_PROPERTY_STATE,
  DunningCaseLevel.JSON_PROPERTY_LINKED_TRANSACTION,
  DunningCaseLevel.JSON_PROPERTY_FAILED_ON,
  DunningCaseLevel.JSON_PROPERTY_MOST_RECENT_LEVEL,
  DunningCaseLevel.JSON_PROPERTY_DUNNING_CASE
})

public class DunningCaseLevel {
  public static final String JSON_PROPERTY_CANCELED_ON = "canceledOn";
  @javax.annotation.Nullable
  private OffsetDateTime canceledOn;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  @javax.annotation.Nullable
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  @javax.annotation.Nullable
  private String language;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  @javax.annotation.Nullable
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_FLOW_LEVEL = "flowLevel";
  @javax.annotation.Nullable
  private Long flowLevel;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_TIMEOUT_ON = "timeoutOn";
  @javax.annotation.Nullable
  private OffsetDateTime timeoutOn;

  public static final String JSON_PROPERTY_ENVIRONMENT = "environment";
  @javax.annotation.Nullable
  private Environment environment;

  public static final String JSON_PROPERTY_SUCCEEDED_ON = "succeededOn";
  @javax.annotation.Nullable
  private OffsetDateTime succeededOn;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_INVOICE = "invoice";
  @javax.annotation.Nullable
  private Long invoice;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private DunningCaseLevelState state;

  public static final String JSON_PROPERTY_LINKED_TRANSACTION = "linkedTransaction";
  @javax.annotation.Nullable
  private Long linkedTransaction;

  public static final String JSON_PROPERTY_FAILED_ON = "failedOn";
  @javax.annotation.Nullable
  private OffsetDateTime failedOn;

  public static final String JSON_PROPERTY_MOST_RECENT_LEVEL = "mostRecentLevel";
  @javax.annotation.Nullable
  private Boolean mostRecentLevel;

  public static final String JSON_PROPERTY_DUNNING_CASE = "dunningCase";
  @javax.annotation.Nullable
  private DunningCase dunningCase;

  public DunningCaseLevel() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public DunningCaseLevel(
    @JsonProperty(JSON_PROPERTY_CANCELED_ON) OffsetDateTime canceledOn, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_LANGUAGE) String language, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_FLOW_LEVEL) Long flowLevel, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_TIMEOUT_ON) OffsetDateTime timeoutOn, 
    @JsonProperty(JSON_PROPERTY_SUCCEEDED_ON) OffsetDateTime succeededOn, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_INVOICE) Long invoice, 
    @JsonProperty(JSON_PROPERTY_LINKED_TRANSACTION) Long linkedTransaction, 
    @JsonProperty(JSON_PROPERTY_FAILED_ON) OffsetDateTime failedOn, 
    @JsonProperty(JSON_PROPERTY_MOST_RECENT_LEVEL) Boolean mostRecentLevel
  ) {
    this();
    this.canceledOn = canceledOn;
    this.plannedPurgeDate = plannedPurgeDate;
    this.language = language;
    this.createdOn = createdOn;
    this.version = version;
    this.flowLevel = flowLevel;
    this.linkedSpaceId = linkedSpaceId;
    this.timeoutOn = timeoutOn;
    this.succeededOn = succeededOn;
    this.id = id;
    this.invoice = invoice;
    this.linkedTransaction = linkedTransaction;
    this.failedOn = failedOn;
    this.mostRecentLevel = mostRecentLevel;
  }

  /**
   * Get canceledOn
   * @return canceledOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CANCELED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCanceledOn() {
    return canceledOn;
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
   * The language that is linked to the object.
   * @return language
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }



  /**
   * The date and time when the object was created.
   * @return createdOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedOn() {
    return createdOn;
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
   * Get flowLevel
   * @return flowLevel
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FLOW_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFlowLevel() {
    return flowLevel;
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
   * Get timeoutOn
   * @return timeoutOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEOUT_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTimeoutOn() {
    return timeoutOn;
  }



  public DunningCaseLevel environment(@javax.annotation.Nullable Environment environment) {
    
    this.environment = environment;
    return this;
  }

  /**
   * Get environment
   * @return environment
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Environment getEnvironment() {
    return environment;
  }


  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnvironment(@javax.annotation.Nullable Environment environment) {
    this.environment = environment;
  }

  /**
   * Get succeededOn
   * @return succeededOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUCCEEDED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getSucceededOn() {
    return succeededOn;
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



  /**
   * Get invoice
   * @return invoice
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVOICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getInvoice() {
    return invoice;
  }



  public DunningCaseLevel state(@javax.annotation.Nullable DunningCaseLevelState state) {
    
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

  public DunningCaseLevelState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable DunningCaseLevelState state) {
    this.state = state;
  }

  /**
   * The payment transaction this object is linked to.
   * @return linkedTransaction
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKED_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLinkedTransaction() {
    return linkedTransaction;
  }



  /**
   * Get failedOn
   * @return failedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getFailedOn() {
    return failedOn;
  }



  /**
   * Get mostRecentLevel
   * @return mostRecentLevel
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOST_RECENT_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMostRecentLevel() {
    return mostRecentLevel;
  }



  public DunningCaseLevel dunningCase(@javax.annotation.Nullable DunningCase dunningCase) {
    
    this.dunningCase = dunningCase;
    return this;
  }

  /**
   * Get dunningCase
   * @return dunningCase
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DUNNING_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DunningCase getDunningCase() {
    return dunningCase;
  }


  @JsonProperty(JSON_PROPERTY_DUNNING_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDunningCase(@javax.annotation.Nullable DunningCase dunningCase) {
    this.dunningCase = dunningCase;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DunningCaseLevel dunningCaseLevel = (DunningCaseLevel) o;
    return Objects.equals(this.canceledOn, dunningCaseLevel.canceledOn) &&
        Objects.equals(this.plannedPurgeDate, dunningCaseLevel.plannedPurgeDate) &&
        Objects.equals(this.language, dunningCaseLevel.language) &&
        Objects.equals(this.createdOn, dunningCaseLevel.createdOn) &&
        Objects.equals(this.version, dunningCaseLevel.version) &&
        Objects.equals(this.flowLevel, dunningCaseLevel.flowLevel) &&
        Objects.equals(this.linkedSpaceId, dunningCaseLevel.linkedSpaceId) &&
        Objects.equals(this.timeoutOn, dunningCaseLevel.timeoutOn) &&
        Objects.equals(this.environment, dunningCaseLevel.environment) &&
        Objects.equals(this.succeededOn, dunningCaseLevel.succeededOn) &&
        Objects.equals(this.id, dunningCaseLevel.id) &&
        Objects.equals(this.invoice, dunningCaseLevel.invoice) &&
        Objects.equals(this.state, dunningCaseLevel.state) &&
        Objects.equals(this.linkedTransaction, dunningCaseLevel.linkedTransaction) &&
        Objects.equals(this.failedOn, dunningCaseLevel.failedOn) &&
        Objects.equals(this.mostRecentLevel, dunningCaseLevel.mostRecentLevel) &&
        Objects.equals(this.dunningCase, dunningCaseLevel.dunningCase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canceledOn, plannedPurgeDate, language, createdOn, version, flowLevel, linkedSpaceId, timeoutOn, environment, succeededOn, id, invoice, state, linkedTransaction, failedOn, mostRecentLevel, dunningCase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DunningCaseLevel {\n");
    sb.append("    canceledOn: ").append(toIndentedString(canceledOn)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    flowLevel: ").append(toIndentedString(flowLevel)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    timeoutOn: ").append(toIndentedString(timeoutOn)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    succeededOn: ").append(toIndentedString(succeededOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    linkedTransaction: ").append(toIndentedString(linkedTransaction)).append("\n");
    sb.append("    failedOn: ").append(toIndentedString(failedOn)).append("\n");
    sb.append("    mostRecentLevel: ").append(toIndentedString(mostRecentLevel)).append("\n");
    sb.append("    dunningCase: ").append(toIndentedString(dunningCase)).append("\n");
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

    // add `canceledOn` to the URL query string
    if (getCanceledOn() != null) {
      try {
        joiner.add(String.format("%scanceledOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCanceledOn()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `language` to the URL query string
    if (getLanguage() != null) {
      try {
        joiner.add(String.format("%slanguage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLanguage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `createdOn` to the URL query string
    if (getCreatedOn() != null) {
      try {
        joiner.add(String.format("%screatedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCreatedOn()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `flowLevel` to the URL query string
    if (getFlowLevel() != null) {
      try {
        joiner.add(String.format("%sflowLevel%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFlowLevel()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `timeoutOn` to the URL query string
    if (getTimeoutOn() != null) {
      try {
        joiner.add(String.format("%stimeoutOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimeoutOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `environment` to the URL query string
    if (getEnvironment() != null) {
      try {
        joiner.add(String.format("%senvironment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnvironment()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `succeededOn` to the URL query string
    if (getSucceededOn() != null) {
      try {
        joiner.add(String.format("%ssucceededOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSucceededOn()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `invoice` to the URL query string
    if (getInvoice() != null) {
      try {
        joiner.add(String.format("%sinvoice%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInvoice()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `linkedTransaction` to the URL query string
    if (getLinkedTransaction() != null) {
      try {
        joiner.add(String.format("%slinkedTransaction%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedTransaction()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `failedOn` to the URL query string
    if (getFailedOn() != null) {
      try {
        joiner.add(String.format("%sfailedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFailedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `mostRecentLevel` to the URL query string
    if (getMostRecentLevel() != null) {
      try {
        joiner.add(String.format("%smostRecentLevel%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMostRecentLevel()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `dunningCase` to the URL query string
    if (getDunningCase() != null) {
      joiner.add(getDunningCase().toUrlQueryString(prefix + "dunningCase" + suffix));
    }

    return joiner.toString();
  }

}

