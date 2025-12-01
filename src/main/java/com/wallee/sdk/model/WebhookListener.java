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
import com.wallee.sdk.model.WebhookIdentity;
import com.wallee.sdk.model.WebhookUrl;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * WebhookListener
 */
@JsonPropertyOrder({
  WebhookListener.JSON_PROPERTY_LINKED_SPACE_ID,
  WebhookListener.JSON_PROPERTY_ENTITY_STATES,
  WebhookListener.JSON_PROPERTY_IDENTITY,
  WebhookListener.JSON_PROPERTY_NAME,
  WebhookListener.JSON_PROPERTY_PLANNED_PURGE_DATE,
  WebhookListener.JSON_PROPERTY_ID,
  WebhookListener.JSON_PROPERTY_STATE,
  WebhookListener.JSON_PROPERTY_NOTIFY_EVERY_CHANGE,
  WebhookListener.JSON_PROPERTY_VERSION,
  WebhookListener.JSON_PROPERTY_ENABLE_PAYLOAD_SIGNATURE_AND_STATE,
  WebhookListener.JSON_PROPERTY_ENTITY,
  WebhookListener.JSON_PROPERTY_URL
})

public class WebhookListener {
  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_ENTITY_STATES = "entityStates";
  @javax.annotation.Nullable
  private Set<String> entityStates = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_IDENTITY = "identity";
  @javax.annotation.Nullable
  private WebhookIdentity identity;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  @javax.annotation.Nullable
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private CreationEntityState state;

  public static final String JSON_PROPERTY_NOTIFY_EVERY_CHANGE = "notifyEveryChange";
  @javax.annotation.Nullable
  private Boolean notifyEveryChange;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_ENABLE_PAYLOAD_SIGNATURE_AND_STATE = "enablePayloadSignatureAndState";
  @javax.annotation.Nullable
  private Boolean enablePayloadSignatureAndState;

  public static final String JSON_PROPERTY_ENTITY = "entity";
  @javax.annotation.Nullable
  private Long entity;

  public static final String JSON_PROPERTY_URL = "url";
  @javax.annotation.Nullable
  private WebhookUrl url;

  public WebhookListener() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public WebhookListener(
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_ENTITY_STATES) Set<String> entityStates, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_NOTIFY_EVERY_CHANGE) Boolean notifyEveryChange, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_ENABLE_PAYLOAD_SIGNATURE_AND_STATE) Boolean enablePayloadSignatureAndState, 
    @JsonProperty(JSON_PROPERTY_ENTITY) Long entity
  ) {
    this();
    this.linkedSpaceId = linkedSpaceId;
    this.entityStates = entityStates;
    this.name = name;
    this.plannedPurgeDate = plannedPurgeDate;
    this.id = id;
    this.notifyEveryChange = notifyEveryChange;
    this.version = version;
    this.enablePayloadSignatureAndState = enablePayloadSignatureAndState;
    this.entity = entity;
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
   * The entity&#39;s target states that are to be monitored.
   * @return entityStates
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTITY_STATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getEntityStates() {
    return entityStates;
  }



  public WebhookListener identity(@javax.annotation.Nullable WebhookIdentity identity) {
    
    this.identity = identity;
    return this;
  }

  /**
   * Get identity
   * @return identity
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WebhookIdentity getIdentity() {
    return identity;
  }


  @JsonProperty(JSON_PROPERTY_IDENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdentity(@javax.annotation.Nullable WebhookIdentity identity) {
    this.identity = identity;
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
   * A unique identifier for the object.
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }



  public WebhookListener state(@javax.annotation.Nullable CreationEntityState state) {
    
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
   * Whether every update of the entity or only state changes are to be monitored.
   * @return notifyEveryChange
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFY_EVERY_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNotifyEveryChange() {
    return notifyEveryChange;
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
   * Whether signature header and &#39;state&#39; property are enabled in webhook payload.
   * @return enablePayloadSignatureAndState
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLE_PAYLOAD_SIGNATURE_AND_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnablePayloadSignatureAndState() {
    return enablePayloadSignatureAndState;
  }



  /**
   * The entity that is to be monitored.
   * @return entity
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEntity() {
    return entity;
  }



  public WebhookListener url(@javax.annotation.Nullable WebhookUrl url) {
    
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WebhookUrl getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(@javax.annotation.Nullable WebhookUrl url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookListener webhookListener = (WebhookListener) o;
    return Objects.equals(this.linkedSpaceId, webhookListener.linkedSpaceId) &&
        Objects.equals(this.entityStates, webhookListener.entityStates) &&
        Objects.equals(this.identity, webhookListener.identity) &&
        Objects.equals(this.name, webhookListener.name) &&
        Objects.equals(this.plannedPurgeDate, webhookListener.plannedPurgeDate) &&
        Objects.equals(this.id, webhookListener.id) &&
        Objects.equals(this.state, webhookListener.state) &&
        Objects.equals(this.notifyEveryChange, webhookListener.notifyEveryChange) &&
        Objects.equals(this.version, webhookListener.version) &&
        Objects.equals(this.enablePayloadSignatureAndState, webhookListener.enablePayloadSignatureAndState) &&
        Objects.equals(this.entity, webhookListener.entity) &&
        Objects.equals(this.url, webhookListener.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkedSpaceId, entityStates, identity, name, plannedPurgeDate, id, state, notifyEveryChange, version, enablePayloadSignatureAndState, entity, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookListener {\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    entityStates: ").append(toIndentedString(entityStates)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    notifyEveryChange: ").append(toIndentedString(notifyEveryChange)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    enablePayloadSignatureAndState: ").append(toIndentedString(enablePayloadSignatureAndState)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

    // add `identity` to the URL query string
    if (getIdentity() != null) {
      joiner.add(getIdentity().toUrlQueryString(prefix + "identity" + suffix));
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

    // add `notifyEveryChange` to the URL query string
    if (getNotifyEveryChange() != null) {
      try {
        joiner.add(String.format("%snotifyEveryChange%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNotifyEveryChange()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `enablePayloadSignatureAndState` to the URL query string
    if (getEnablePayloadSignatureAndState() != null) {
      try {
        joiner.add(String.format("%senablePayloadSignatureAndState%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnablePayloadSignatureAndState()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `entity` to the URL query string
    if (getEntity() != null) {
      try {
        joiner.add(String.format("%sentity%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEntity()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `url` to the URL query string
    if (getUrl() != null) {
      joiner.add(getUrl().toUrlQueryString(prefix + "url" + suffix));
    }

    return joiner.toString();
  }

}

