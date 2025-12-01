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
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * AbstractWebhookListenerUpdate
 */
@JsonPropertyOrder({
  AbstractWebhookListenerUpdate.JSON_PROPERTY_ENTITY_STATES,
  AbstractWebhookListenerUpdate.JSON_PROPERTY_NAME,
  AbstractWebhookListenerUpdate.JSON_PROPERTY_STATE,
  AbstractWebhookListenerUpdate.JSON_PROPERTY_NOTIFY_EVERY_CHANGE
})
@JsonTypeName("Abstract.WebhookListener.Update")

public class AbstractWebhookListenerUpdate {
  public static final String JSON_PROPERTY_ENTITY_STATES = "entityStates";
  @javax.annotation.Nullable
  private Set<String> entityStates = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private CreationEntityState state;

  public static final String JSON_PROPERTY_NOTIFY_EVERY_CHANGE = "notifyEveryChange";
  @javax.annotation.Nullable
  private Boolean notifyEveryChange;

  public AbstractWebhookListenerUpdate() {
  }

  public AbstractWebhookListenerUpdate entityStates(@javax.annotation.Nullable Set<String> entityStates) {
    
    this.entityStates = entityStates;
    return this;
  }

  public AbstractWebhookListenerUpdate addEntityStatesItem(String entityStatesItem) {
    if (this.entityStates == null) {
      this.entityStates = new LinkedHashSet<>();
    }
    this.entityStates.add(entityStatesItem);
    return this;
  }

  /**
   * The entity&#39;s target states that are to be monitored.
   * @return entityStates
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTITY_STATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getEntityStates() {
    return entityStates;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_ENTITY_STATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityStates(@javax.annotation.Nullable Set<String> entityStates) {
    this.entityStates = entityStates;
  }

  public AbstractWebhookListenerUpdate name(@javax.annotation.Nullable String name) {
    
    this.name = name;
    return this;
  }

  /**
   * The name used to identify the webhook listener.
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

  public AbstractWebhookListenerUpdate state(@javax.annotation.Nullable CreationEntityState state) {
    
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

  public AbstractWebhookListenerUpdate notifyEveryChange(@javax.annotation.Nullable Boolean notifyEveryChange) {
    
    this.notifyEveryChange = notifyEveryChange;
    return this;
  }

  /**
   * Whether every update of the entity or only state changes are to be monitored.
   * @return notifyEveryChange
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFY_EVERY_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNotifyEveryChange() {
    return notifyEveryChange;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFY_EVERY_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotifyEveryChange(@javax.annotation.Nullable Boolean notifyEveryChange) {
    this.notifyEveryChange = notifyEveryChange;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractWebhookListenerUpdate abstractWebhookListenerUpdate = (AbstractWebhookListenerUpdate) o;
    return Objects.equals(this.entityStates, abstractWebhookListenerUpdate.entityStates) &&
        Objects.equals(this.name, abstractWebhookListenerUpdate.name) &&
        Objects.equals(this.state, abstractWebhookListenerUpdate.state) &&
        Objects.equals(this.notifyEveryChange, abstractWebhookListenerUpdate.notifyEveryChange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityStates, name, state, notifyEveryChange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractWebhookListenerUpdate {\n");
    sb.append("    entityStates: ").append(toIndentedString(entityStates)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    notifyEveryChange: ").append(toIndentedString(notifyEveryChange)).append("\n");
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

    // add `entityStates` to the URL query string
    if (getEntityStates() != null) {
      int i = 0;
      for (String _item : getEntityStates()) {
        try {
          joiner.add(String.format("%sentityStates%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(_item), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
      i++;
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

    // add `state` to the URL query string
    if (getState() != null) {
      try {
        joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getState()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `notifyEveryChange` to the URL query string
    if (getNotifyEveryChange() != null) {
      try {
        joiner.add(String.format("%snotifyEveryChange%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNotifyEveryChange()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

