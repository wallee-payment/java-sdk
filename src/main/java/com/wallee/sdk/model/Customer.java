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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Customer
 */
@JsonPropertyOrder({
  Customer.JSON_PROPERTY_LINKED_SPACE_ID,
  Customer.JSON_PROPERTY_META_DATA,
  Customer.JSON_PROPERTY_EMAIL_ADDRESS,
  Customer.JSON_PROPERTY_FAMILY_NAME,
  Customer.JSON_PROPERTY_GIVEN_NAME,
  Customer.JSON_PROPERTY_PREFERRED_CURRENCY,
  Customer.JSON_PROPERTY_CUSTOMER_ID,
  Customer.JSON_PROPERTY_LANGUAGE,
  Customer.JSON_PROPERTY_ID,
  Customer.JSON_PROPERTY_CREATED_ON,
  Customer.JSON_PROPERTY_VERSION
})

public class Customer {
  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_META_DATA = "metaData";
  @javax.annotation.Nullable
  private Map<String, String> metaData = new HashMap<>();

  public static final String JSON_PROPERTY_EMAIL_ADDRESS = "emailAddress";
  @javax.annotation.Nullable
  private String emailAddress;

  public static final String JSON_PROPERTY_FAMILY_NAME = "familyName";
  @javax.annotation.Nullable
  private String familyName;

  public static final String JSON_PROPERTY_GIVEN_NAME = "givenName";
  @javax.annotation.Nullable
  private String givenName;

  public static final String JSON_PROPERTY_PREFERRED_CURRENCY = "preferredCurrency";
  @javax.annotation.Nullable
  private String preferredCurrency;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @javax.annotation.Nullable
  private String customerId;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  @javax.annotation.Nullable
  private String language;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  @javax.annotation.Nullable
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public Customer() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public Customer(
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_META_DATA) Map<String, String> metaData, 
    @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS) String emailAddress, 
    @JsonProperty(JSON_PROPERTY_FAMILY_NAME) String familyName, 
    @JsonProperty(JSON_PROPERTY_GIVEN_NAME) String givenName, 
    @JsonProperty(JSON_PROPERTY_PREFERRED_CURRENCY) String preferredCurrency, 
    @JsonProperty(JSON_PROPERTY_CUSTOMER_ID) String customerId, 
    @JsonProperty(JSON_PROPERTY_LANGUAGE) String language, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version
  ) {
    this();
    this.linkedSpaceId = linkedSpaceId;
    this.metaData = metaData;
    this.emailAddress = emailAddress;
    this.familyName = familyName;
    this.givenName = givenName;
    this.preferredCurrency = preferredCurrency;
    this.customerId = customerId;
    this.language = language;
    this.id = id;
    this.createdOn = createdOn;
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
   * Allow to store additional information about the object.
   * @return metaData
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getMetaData() {
    return metaData;
  }



  /**
   * The customer&#39;s email address.
   * @return emailAddress
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailAddress() {
    return emailAddress;
  }



  /**
   * The customer&#39;s family or last name.
   * @return familyName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAMILY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFamilyName() {
    return familyName;
  }



  /**
   * The customer&#39;s given or first name.
   * @return givenName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GIVEN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGivenName() {
    return givenName;
  }



  /**
   * The customer&#39;s preferred currency.
   * @return preferredCurrency
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFERRED_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPreferredCurrency() {
    return preferredCurrency;
  }



  /**
   * The customer&#39;s ID in the merchant&#39;s system.
   * @return customerId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerId() {
    return customerId;
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.linkedSpaceId, customer.linkedSpaceId) &&
        Objects.equals(this.metaData, customer.metaData) &&
        Objects.equals(this.emailAddress, customer.emailAddress) &&
        Objects.equals(this.familyName, customer.familyName) &&
        Objects.equals(this.givenName, customer.givenName) &&
        Objects.equals(this.preferredCurrency, customer.preferredCurrency) &&
        Objects.equals(this.customerId, customer.customerId) &&
        Objects.equals(this.language, customer.language) &&
        Objects.equals(this.id, customer.id) &&
        Objects.equals(this.createdOn, customer.createdOn) &&
        Objects.equals(this.version, customer.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkedSpaceId, metaData, emailAddress, familyName, givenName, preferredCurrency, customerId, language, id, createdOn, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    preferredCurrency: ").append(toIndentedString(preferredCurrency)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
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

    // add `linkedSpaceId` to the URL query string
    if (getLinkedSpaceId() != null) {
      try {
        joiner.add(String.format("%slinkedSpaceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedSpaceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

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

    // add `emailAddress` to the URL query string
    if (getEmailAddress() != null) {
      try {
        joiner.add(String.format("%semailAddress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEmailAddress()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `familyName` to the URL query string
    if (getFamilyName() != null) {
      try {
        joiner.add(String.format("%sfamilyName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFamilyName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `givenName` to the URL query string
    if (getGivenName() != null) {
      try {
        joiner.add(String.format("%sgivenName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGivenName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `preferredCurrency` to the URL query string
    if (getPreferredCurrency() != null) {
      try {
        joiner.add(String.format("%spreferredCurrency%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPreferredCurrency()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `customerId` to the URL query string
    if (getCustomerId() != null) {
      try {
        joiner.add(String.format("%scustomerId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustomerId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }

}

