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
import com.wallee.sdk.model.SubscriptionSuspensionAction;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * SuspensionCreationRequest
 */
@JsonPropertyOrder({
  SuspensionCreationRequest.JSON_PROPERTY_NOTE,
  SuspensionCreationRequest.JSON_PROPERTY_END_ACTION,
  SuspensionCreationRequest.JSON_PROPERTY_PLANNED_END_DATE
})

public class SuspensionCreationRequest {
  public static final String JSON_PROPERTY_NOTE = "note";
  @javax.annotation.Nullable
  private String note;

  public static final String JSON_PROPERTY_END_ACTION = "endAction";
  @javax.annotation.Nullable
  private SubscriptionSuspensionAction endAction;

  public static final String JSON_PROPERTY_PLANNED_END_DATE = "plannedEndDate";
  @javax.annotation.Nullable
  private OffsetDateTime plannedEndDate;

  public SuspensionCreationRequest() {
  }

  public SuspensionCreationRequest note(@javax.annotation.Nullable String note) {
    
    this.note = note;
    return this;
  }

  /**
   * A note that contains details about the suspension. It is not disclosed to the subscriber.
   * @return note
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNote() {
    return note;
  }


  @JsonProperty(JSON_PROPERTY_NOTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNote(@javax.annotation.Nullable String note) {
    this.note = note;
  }

  public SuspensionCreationRequest endAction(@javax.annotation.Nullable SubscriptionSuspensionAction endAction) {
    
    this.endAction = endAction;
    return this;
  }

  /**
   * Get endAction
   * @return endAction
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionSuspensionAction getEndAction() {
    return endAction;
  }


  @JsonProperty(JSON_PROPERTY_END_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndAction(@javax.annotation.Nullable SubscriptionSuspensionAction endAction) {
    this.endAction = endAction;
  }

  public SuspensionCreationRequest plannedEndDate(@javax.annotation.Nullable OffsetDateTime plannedEndDate) {
    
    this.plannedEndDate = plannedEndDate;
    return this;
  }

  /**
   * The date and time when the suspension is planned to end.
   * @return plannedEndDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLANNED_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPlannedEndDate() {
    return plannedEndDate;
  }


  @JsonProperty(JSON_PROPERTY_PLANNED_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlannedEndDate(@javax.annotation.Nullable OffsetDateTime plannedEndDate) {
    this.plannedEndDate = plannedEndDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuspensionCreationRequest suspensionCreationRequest = (SuspensionCreationRequest) o;
    return Objects.equals(this.note, suspensionCreationRequest.note) &&
        Objects.equals(this.endAction, suspensionCreationRequest.endAction) &&
        Objects.equals(this.plannedEndDate, suspensionCreationRequest.plannedEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(note, endAction, plannedEndDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuspensionCreationRequest {\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    endAction: ").append(toIndentedString(endAction)).append("\n");
    sb.append("    plannedEndDate: ").append(toIndentedString(plannedEndDate)).append("\n");
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

    // add `note` to the URL query string
    if (getNote() != null) {
      try {
        joiner.add(String.format("%snote%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNote()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `endAction` to the URL query string
    if (getEndAction() != null) {
      try {
        joiner.add(String.format("%sendAction%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEndAction()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `plannedEndDate` to the URL query string
    if (getPlannedEndDate() != null) {
      try {
        joiner.add(String.format("%splannedEndDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlannedEndDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

