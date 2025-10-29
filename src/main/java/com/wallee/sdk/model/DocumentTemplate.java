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
import com.wallee.sdk.model.DocumentTemplateType;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * A document template contains the customizations for a particular document template type.
 */
@JsonPropertyOrder({
  DocumentTemplate.JSON_PROPERTY_DELIVERY_ENABLED,
  DocumentTemplate.JSON_PROPERTY_LINKED_SPACE_ID,
  DocumentTemplate.JSON_PROPERTY_SPACE_ID,
  DocumentTemplate.JSON_PROPERTY_DEFAULT_TEMPLATE,
  DocumentTemplate.JSON_PROPERTY_NAME,
  DocumentTemplate.JSON_PROPERTY_PLANNED_PURGE_DATE,
  DocumentTemplate.JSON_PROPERTY_TEMPLATE_RESOURCE,
  DocumentTemplate.JSON_PROPERTY_ID,
  DocumentTemplate.JSON_PROPERTY_STATE,
  DocumentTemplate.JSON_PROPERTY_TYPE,
  DocumentTemplate.JSON_PROPERTY_VERSION
})

public class DocumentTemplate {
  public static final String JSON_PROPERTY_DELIVERY_ENABLED = "deliveryEnabled";
  private Boolean deliveryEnabled;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_SPACE_ID = "spaceId";
  private Long spaceId;

  public static final String JSON_PROPERTY_DEFAULT_TEMPLATE = "defaultTemplate";
  private Boolean defaultTemplate;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_TEMPLATE_RESOURCE = "templateResource";
  private String templateResource;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  private CreationEntityState state;

  public static final String JSON_PROPERTY_TYPE = "type";
  private DocumentTemplateType type;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public DocumentTemplate() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public DocumentTemplate(
    @JsonProperty(JSON_PROPERTY_DELIVERY_ENABLED) Boolean deliveryEnabled, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_SPACE_ID) Long spaceId, 
    @JsonProperty(JSON_PROPERTY_DEFAULT_TEMPLATE) Boolean defaultTemplate, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_TEMPLATE_RESOURCE) String templateResource, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version
  ) {
    this();
    this.deliveryEnabled = deliveryEnabled;
    this.linkedSpaceId = linkedSpaceId;
    this.spaceId = spaceId;
    this.defaultTemplate = defaultTemplate;
    this.name = name;
    this.plannedPurgeDate = plannedPurgeDate;
    this.templateResource = templateResource;
    this.id = id;
    this.version = version;
  }

   /**
   * Whether documents of this template should be delivered.
   * @return deliveryEnabled
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELIVERY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeliveryEnabled() {
    return deliveryEnabled;
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



   /**
   * The ID of the space this object belongs to.
   * @return spaceId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSpaceId() {
    return spaceId;
  }



   /**
   * Whether this is the default document template which is used whenever no specific template is specified for the same template type.
   * @return defaultTemplate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDefaultTemplate() {
    return defaultTemplate;
  }



   /**
   * The name used to identify the document template.
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
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
   * The resource path to a custom template to be used to generate PDF documents.
   * @return templateResource
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATE_RESOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTemplateResource() {
    return templateResource;
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



  public DocumentTemplate state(CreationEntityState state) {
    
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

  public DocumentTemplate type(DocumentTemplateType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocumentTemplateType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(DocumentTemplateType type) {
    this.type = type;
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentTemplate documentTemplate = (DocumentTemplate) o;
    return Objects.equals(this.deliveryEnabled, documentTemplate.deliveryEnabled) &&
        Objects.equals(this.linkedSpaceId, documentTemplate.linkedSpaceId) &&
        Objects.equals(this.spaceId, documentTemplate.spaceId) &&
        Objects.equals(this.defaultTemplate, documentTemplate.defaultTemplate) &&
        Objects.equals(this.name, documentTemplate.name) &&
        Objects.equals(this.plannedPurgeDate, documentTemplate.plannedPurgeDate) &&
        Objects.equals(this.templateResource, documentTemplate.templateResource) &&
        Objects.equals(this.id, documentTemplate.id) &&
        Objects.equals(this.state, documentTemplate.state) &&
        Objects.equals(this.type, documentTemplate.type) &&
        Objects.equals(this.version, documentTemplate.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryEnabled, linkedSpaceId, spaceId, defaultTemplate, name, plannedPurgeDate, templateResource, id, state, type, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentTemplate {\n");
    sb.append("    deliveryEnabled: ").append(toIndentedString(deliveryEnabled)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    defaultTemplate: ").append(toIndentedString(defaultTemplate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    templateResource: ").append(toIndentedString(templateResource)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

    // add `deliveryEnabled` to the URL query string
    if (getDeliveryEnabled() != null) {
      try {
        joiner.add(String.format("%sdeliveryEnabled%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDeliveryEnabled()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `spaceId` to the URL query string
    if (getSpaceId() != null) {
      try {
        joiner.add(String.format("%sspaceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSpaceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `defaultTemplate` to the URL query string
    if (getDefaultTemplate() != null) {
      try {
        joiner.add(String.format("%sdefaultTemplate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDefaultTemplate()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `templateResource` to the URL query string
    if (getTemplateResource() != null) {
      try {
        joiner.add(String.format("%stemplateResource%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTemplateResource()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(getType().toUrlQueryString(prefix + "type" + suffix));
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

