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
import com.wallee.sdk.model.DataCollectionType;
import com.wallee.sdk.model.OneClickPaymentMode;
import com.wallee.sdk.model.PaymentMethod;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * PaymentMethodConfiguration
 */
@JsonPropertyOrder({
  PaymentMethodConfiguration.JSON_PROPERTY_DATA_COLLECTION_TYPE,
  PaymentMethodConfiguration.JSON_PROPERTY_PLANNED_PURGE_DATE,
  PaymentMethodConfiguration.JSON_PROPERTY_DESCRIPTION,
  PaymentMethodConfiguration.JSON_PROPERTY_RESOLVED_IMAGE_URL,
  PaymentMethodConfiguration.JSON_PROPERTY_ONE_CLICK_PAYMENT_MODE,
  PaymentMethodConfiguration.JSON_PROPERTY_TITLE,
  PaymentMethodConfiguration.JSON_PROPERTY_VERSION,
  PaymentMethodConfiguration.JSON_PROPERTY_LINKED_SPACE_ID,
  PaymentMethodConfiguration.JSON_PROPERTY_SPACE_ID,
  PaymentMethodConfiguration.JSON_PROPERTY_IMAGE_RESOURCE_PATH,
  PaymentMethodConfiguration.JSON_PROPERTY_SORT_ORDER,
  PaymentMethodConfiguration.JSON_PROPERTY_NAME,
  PaymentMethodConfiguration.JSON_PROPERTY_RESOLVED_DESCRIPTION,
  PaymentMethodConfiguration.JSON_PROPERTY_RESOLVED_TITLE,
  PaymentMethodConfiguration.JSON_PROPERTY_PAYMENT_METHOD,
  PaymentMethodConfiguration.JSON_PROPERTY_ID,
  PaymentMethodConfiguration.JSON_PROPERTY_STATE
})

public class PaymentMethodConfiguration {
  public static final String JSON_PROPERTY_DATA_COLLECTION_TYPE = "dataCollectionType";
  private DataCollectionType dataCollectionType;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private Map<String, String> description = new HashMap<>();

  public static final String JSON_PROPERTY_RESOLVED_IMAGE_URL = "resolvedImageUrl";
  private String resolvedImageUrl;

  public static final String JSON_PROPERTY_ONE_CLICK_PAYMENT_MODE = "oneClickPaymentMode";
  private OneClickPaymentMode oneClickPaymentMode;

  public static final String JSON_PROPERTY_TITLE = "title";
  private Map<String, String> title = new HashMap<>();

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_SPACE_ID = "spaceId";
  private Long spaceId;

  public static final String JSON_PROPERTY_IMAGE_RESOURCE_PATH = "imageResourcePath";
  private String imageResourcePath;

  public static final String JSON_PROPERTY_SORT_ORDER = "sortOrder";
  private Integer sortOrder;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RESOLVED_DESCRIPTION = "resolvedDescription";
  private Map<String, String> resolvedDescription = new HashMap<>();

  public static final String JSON_PROPERTY_RESOLVED_TITLE = "resolvedTitle";
  private Map<String, String> resolvedTitle = new HashMap<>();

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "paymentMethod";
  private PaymentMethod paymentMethod;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  private CreationEntityState state;

  public PaymentMethodConfiguration() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public PaymentMethodConfiguration(
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_DESCRIPTION) Map<String, String> description, 
    @JsonProperty(JSON_PROPERTY_RESOLVED_IMAGE_URL) String resolvedImageUrl, 
    @JsonProperty(JSON_PROPERTY_TITLE) Map<String, String> title, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_SPACE_ID) Long spaceId, 
    @JsonProperty(JSON_PROPERTY_IMAGE_RESOURCE_PATH) String imageResourcePath, 
    @JsonProperty(JSON_PROPERTY_SORT_ORDER) Integer sortOrder, 
    @JsonProperty(JSON_PROPERTY_NAME) String name, 
    @JsonProperty(JSON_PROPERTY_RESOLVED_DESCRIPTION) Map<String, String> resolvedDescription, 
    @JsonProperty(JSON_PROPERTY_RESOLVED_TITLE) Map<String, String> resolvedTitle, 
    @JsonProperty(JSON_PROPERTY_ID) Long id
  ) {
    this();
    this.plannedPurgeDate = plannedPurgeDate;
    this.description = description;
    this.resolvedImageUrl = resolvedImageUrl;
    this.title = title;
    this.version = version;
    this.linkedSpaceId = linkedSpaceId;
    this.spaceId = spaceId;
    this.imageResourcePath = imageResourcePath;
    this.sortOrder = sortOrder;
    this.name = name;
    this.resolvedDescription = resolvedDescription;
    this.resolvedTitle = resolvedTitle;
    this.id = id;
  }

  public PaymentMethodConfiguration dataCollectionType(DataCollectionType dataCollectionType) {
    
    this.dataCollectionType = dataCollectionType;
    return this;
  }

   /**
   * Get dataCollectionType
   * @return dataCollectionType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_COLLECTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DataCollectionType getDataCollectionType() {
    return dataCollectionType;
  }


  @JsonProperty(JSON_PROPERTY_DATA_COLLECTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataCollectionType(DataCollectionType dataCollectionType) {
    this.dataCollectionType = dataCollectionType;
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
   * A customer-facing custom description for the payment method.
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getDescription() {
    return description;
  }



   /**
   * The URL to the image of the payment method displayed to the customer. If a custom image is defined, it will be used; otherwise, the default image of the payment method will be shown.
   * @return resolvedImageUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOLVED_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResolvedImageUrl() {
    return resolvedImageUrl;
  }



  public PaymentMethodConfiguration oneClickPaymentMode(OneClickPaymentMode oneClickPaymentMode) {
    
    this.oneClickPaymentMode = oneClickPaymentMode;
    return this;
  }

   /**
   * Get oneClickPaymentMode
   * @return oneClickPaymentMode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ONE_CLICK_PAYMENT_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OneClickPaymentMode getOneClickPaymentMode() {
    return oneClickPaymentMode;
  }


  @JsonProperty(JSON_PROPERTY_ONE_CLICK_PAYMENT_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOneClickPaymentMode(OneClickPaymentMode oneClickPaymentMode) {
    this.oneClickPaymentMode = oneClickPaymentMode;
  }

   /**
   * A customer-facing custom title for the payment method.
   * @return title
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getTitle() {
    return title;
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
   * minimum: 1
   * @return spaceId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPACE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSpaceId() {
    return spaceId;
  }



   /**
   * The resource path to a custom image for the payment method, displayed to the customer for visual identification.
   * @return imageResourcePath
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IMAGE_RESOURCE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageResourcePath() {
    return imageResourcePath;
  }



   /**
   * When listing payment methods, they can be sorted by this number.
   * @return sortOrder
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SORT_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSortOrder() {
    return sortOrder;
  }



   /**
   * The name used to identify the payment method configuration.
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }



   /**
   * The description of the payment method displayed to the customer. If a custom description is defined, it will be used; otherwise, the default description of the payment method will be shown.
   * @return resolvedDescription
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOLVED_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getResolvedDescription() {
    return resolvedDescription;
  }



   /**
   * The title of the payment method displayed to the customer. If a custom title is defined, it will be used; otherwise, the default title of the payment method will be shown.
   * @return resolvedTitle
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOLVED_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getResolvedTitle() {
    return resolvedTitle;
  }



  public PaymentMethodConfiguration paymentMethod(PaymentMethod paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentMethod getPaymentMethod() {
    return paymentMethod;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
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



  public PaymentMethodConfiguration state(CreationEntityState state) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodConfiguration paymentMethodConfiguration = (PaymentMethodConfiguration) o;
    return Objects.equals(this.dataCollectionType, paymentMethodConfiguration.dataCollectionType) &&
        Objects.equals(this.plannedPurgeDate, paymentMethodConfiguration.plannedPurgeDate) &&
        Objects.equals(this.description, paymentMethodConfiguration.description) &&
        Objects.equals(this.resolvedImageUrl, paymentMethodConfiguration.resolvedImageUrl) &&
        Objects.equals(this.oneClickPaymentMode, paymentMethodConfiguration.oneClickPaymentMode) &&
        Objects.equals(this.title, paymentMethodConfiguration.title) &&
        Objects.equals(this.version, paymentMethodConfiguration.version) &&
        Objects.equals(this.linkedSpaceId, paymentMethodConfiguration.linkedSpaceId) &&
        Objects.equals(this.spaceId, paymentMethodConfiguration.spaceId) &&
        Objects.equals(this.imageResourcePath, paymentMethodConfiguration.imageResourcePath) &&
        Objects.equals(this.sortOrder, paymentMethodConfiguration.sortOrder) &&
        Objects.equals(this.name, paymentMethodConfiguration.name) &&
        Objects.equals(this.resolvedDescription, paymentMethodConfiguration.resolvedDescription) &&
        Objects.equals(this.resolvedTitle, paymentMethodConfiguration.resolvedTitle) &&
        Objects.equals(this.paymentMethod, paymentMethodConfiguration.paymentMethod) &&
        Objects.equals(this.id, paymentMethodConfiguration.id) &&
        Objects.equals(this.state, paymentMethodConfiguration.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataCollectionType, plannedPurgeDate, description, resolvedImageUrl, oneClickPaymentMode, title, version, linkedSpaceId, spaceId, imageResourcePath, sortOrder, name, resolvedDescription, resolvedTitle, paymentMethod, id, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodConfiguration {\n");
    sb.append("    dataCollectionType: ").append(toIndentedString(dataCollectionType)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    resolvedImageUrl: ").append(toIndentedString(resolvedImageUrl)).append("\n");
    sb.append("    oneClickPaymentMode: ").append(toIndentedString(oneClickPaymentMode)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    imageResourcePath: ").append(toIndentedString(imageResourcePath)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resolvedDescription: ").append(toIndentedString(resolvedDescription)).append("\n");
    sb.append("    resolvedTitle: ").append(toIndentedString(resolvedTitle)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

    // add `dataCollectionType` to the URL query string
    if (getDataCollectionType() != null) {
      try {
        joiner.add(String.format("%sdataCollectionType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDataCollectionType()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `description` to the URL query string
    if (getDescription() != null) {
      for (String _key : getDescription().keySet()) {
        try {
          joiner.add(String.format("%sdescription%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getDescription().get(_key), URLEncoder.encode(String.valueOf(getDescription().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `resolvedImageUrl` to the URL query string
    if (getResolvedImageUrl() != null) {
      try {
        joiner.add(String.format("%sresolvedImageUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getResolvedImageUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `oneClickPaymentMode` to the URL query string
    if (getOneClickPaymentMode() != null) {
      try {
        joiner.add(String.format("%soneClickPaymentMode%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOneClickPaymentMode()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `spaceId` to the URL query string
    if (getSpaceId() != null) {
      try {
        joiner.add(String.format("%sspaceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSpaceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `imageResourcePath` to the URL query string
    if (getImageResourcePath() != null) {
      try {
        joiner.add(String.format("%simageResourcePath%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getImageResourcePath()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `sortOrder` to the URL query string
    if (getSortOrder() != null) {
      try {
        joiner.add(String.format("%ssortOrder%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSortOrder()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `resolvedDescription` to the URL query string
    if (getResolvedDescription() != null) {
      for (String _key : getResolvedDescription().keySet()) {
        try {
          joiner.add(String.format("%sresolvedDescription%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getResolvedDescription().get(_key), URLEncoder.encode(String.valueOf(getResolvedDescription().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `resolvedTitle` to the URL query string
    if (getResolvedTitle() != null) {
      for (String _key : getResolvedTitle().keySet()) {
        try {
          joiner.add(String.format("%sresolvedTitle%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getResolvedTitle().get(_key), URLEncoder.encode(String.valueOf(getResolvedTitle().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `paymentMethod` to the URL query string
    if (getPaymentMethod() != null) {
      joiner.add(getPaymentMethod().toUrlQueryString(prefix + "paymentMethod" + suffix));
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

    return joiner.toString();
  }

}

