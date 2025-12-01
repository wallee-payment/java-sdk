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
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * SubscriptionAffiliateCreate
 */
@JsonPropertyOrder({
  SubscriptionAffiliateCreate.JSON_PROPERTY_META_DATA,
  SubscriptionAffiliateCreate.JSON_PROPERTY_NAME,
  SubscriptionAffiliateCreate.JSON_PROPERTY_LANGUAGE,
  SubscriptionAffiliateCreate.JSON_PROPERTY_STATE,
  SubscriptionAffiliateCreate.JSON_PROPERTY_REFERENCE,
  SubscriptionAffiliateCreate.JSON_PROPERTY_EXTERNAL_ID
})
@JsonTypeName("SubscriptionAffiliate.Create")

public class SubscriptionAffiliateCreate {
  public static final String JSON_PROPERTY_META_DATA = "metaData";
  @javax.annotation.Nullable
  private Map<String, String> metaData = new HashMap<>();

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  @javax.annotation.Nullable
  private String language;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private CreationEntityState state;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  @javax.annotation.Nonnull
  private String reference;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  @javax.annotation.Nonnull
  private String externalId;

  public SubscriptionAffiliateCreate() {
  }

  public SubscriptionAffiliateCreate metaData(@javax.annotation.Nullable Map<String, String> metaData) {
    
    this.metaData = metaData;
    return this;
  }

  public SubscriptionAffiliateCreate putMetaDataItem(String key, String metaDataItem) {
    if (this.metaData == null) {
      this.metaData = new HashMap<>();
    }
    this.metaData.put(key, metaDataItem);
    return this;
  }

  /**
   * Allow to store additional information about the object.
   * @return metaData
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getMetaData() {
    return metaData;
  }


  @JsonProperty(JSON_PROPERTY_META_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetaData(@javax.annotation.Nullable Map<String, String> metaData) {
    this.metaData = metaData;
  }

  public SubscriptionAffiliateCreate name(@javax.annotation.Nullable String name) {
    
    this.name = name;
    return this;
  }

  /**
   * The name used to identify the affiliate.
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

  public SubscriptionAffiliateCreate language(@javax.annotation.Nullable String language) {
    
    this.language = language;
    return this;
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


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(@javax.annotation.Nullable String language) {
    this.language = language;
  }

  public SubscriptionAffiliateCreate state(@javax.annotation.Nullable CreationEntityState state) {
    
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

  public SubscriptionAffiliateCreate reference(@javax.annotation.Nonnull String reference) {
    
    this.reference = reference;
    return this;
  }

  /**
   * The reference used to identify the affiliate.
   * @return reference
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReference(@javax.annotation.Nonnull String reference) {
    this.reference = reference;
  }

  public SubscriptionAffiliateCreate externalId(@javax.annotation.Nonnull String externalId) {
    
    this.externalId = externalId;
    return this;
  }

  /**
   * A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.
   * @return externalId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExternalId() {
    return externalId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExternalId(@javax.annotation.Nonnull String externalId) {
    this.externalId = externalId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionAffiliateCreate subscriptionAffiliateCreate = (SubscriptionAffiliateCreate) o;
    return Objects.equals(this.metaData, subscriptionAffiliateCreate.metaData) &&
        Objects.equals(this.name, subscriptionAffiliateCreate.name) &&
        Objects.equals(this.language, subscriptionAffiliateCreate.language) &&
        Objects.equals(this.state, subscriptionAffiliateCreate.state) &&
        Objects.equals(this.reference, subscriptionAffiliateCreate.reference) &&
        Objects.equals(this.externalId, subscriptionAffiliateCreate.externalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metaData, name, language, state, reference, externalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionAffiliateCreate {\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
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

    // add `metaData` to the URL query string
    if (getMetaData() != null) {
      for (String _key : getMetaData().keySet()) {
        try {
          joiner.add(String.format("%smetaData%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getMetaData().get(_key), URLEncoder.encode(String.valueOf(getMetaData().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `language` to the URL query string
    if (getLanguage() != null) {
      try {
        joiner.add(String.format("%slanguage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLanguage()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `reference` to the URL query string
    if (getReference() != null) {
      try {
        joiner.add(String.format("%sreference%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReference()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `externalId` to the URL query string
    if (getExternalId() != null) {
      try {
        joiner.add(String.format("%sexternalId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExternalId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

