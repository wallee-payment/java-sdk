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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Token
 */
@JsonPropertyOrder({
  Token.JSON_PROPERTY_ENABLED_FOR_ONE_CLICK_PAYMENT,
  Token.JSON_PROPERTY_CUSTOMER_EMAIL_ADDRESS,
  Token.JSON_PROPERTY_PLANNED_PURGE_DATE,
  Token.JSON_PROPERTY_EXTERNAL_ID,
  Token.JSON_PROPERTY_TIME_ZONE,
  Token.JSON_PROPERTY_LANGUAGE,
  Token.JSON_PROPERTY_CREATED_ON,
  Token.JSON_PROPERTY_VERSION,
  Token.JSON_PROPERTY_LINKED_SPACE_ID,
  Token.JSON_PROPERTY_TOKEN_REFERENCE,
  Token.JSON_PROPERTY_CUSTOMER_ID,
  Token.JSON_PROPERTY_ID,
  Token.JSON_PROPERTY_STATE
})

public class Token {
  public static final String JSON_PROPERTY_ENABLED_FOR_ONE_CLICK_PAYMENT = "enabledForOneClickPayment";
  @javax.annotation.Nullable
  private Boolean enabledForOneClickPayment;

  public static final String JSON_PROPERTY_CUSTOMER_EMAIL_ADDRESS = "customerEmailAddress";
  @javax.annotation.Nullable
  private String customerEmailAddress;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  @javax.annotation.Nullable
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  @javax.annotation.Nullable
  private String externalId;

  public static final String JSON_PROPERTY_TIME_ZONE = "timeZone";
  @javax.annotation.Nullable
  private String timeZone;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  @javax.annotation.Nullable
  private String language;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  @javax.annotation.Nullable
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_TOKEN_REFERENCE = "tokenReference";
  @javax.annotation.Nullable
  private String tokenReference;

  public static final String JSON_PROPERTY_CUSTOMER_ID = "customerId";
  @javax.annotation.Nullable
  private String customerId;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private CreationEntityState state;

  public Token() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public Token(
    @JsonProperty(JSON_PROPERTY_ENABLED_FOR_ONE_CLICK_PAYMENT) Boolean enabledForOneClickPayment, 
    @JsonProperty(JSON_PROPERTY_CUSTOMER_EMAIL_ADDRESS) String customerEmailAddress, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_EXTERNAL_ID) String externalId, 
    @JsonProperty(JSON_PROPERTY_TIME_ZONE) String timeZone, 
    @JsonProperty(JSON_PROPERTY_LANGUAGE) String language, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_TOKEN_REFERENCE) String tokenReference, 
    @JsonProperty(JSON_PROPERTY_CUSTOMER_ID) String customerId, 
    @JsonProperty(JSON_PROPERTY_ID) Long id
  ) {
    this();
    this.enabledForOneClickPayment = enabledForOneClickPayment;
    this.customerEmailAddress = customerEmailAddress;
    this.plannedPurgeDate = plannedPurgeDate;
    this.externalId = externalId;
    this.timeZone = timeZone;
    this.language = language;
    this.createdOn = createdOn;
    this.version = version;
    this.linkedSpaceId = linkedSpaceId;
    this.tokenReference = tokenReference;
    this.customerId = customerId;
    this.id = id;
  }

  /**
   * Whether the token is enabled for one-click payments, which simplify the payment process for the customer. One-click tokens are linked to customers via the customer ID.
   * @return enabledForOneClickPayment
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED_FOR_ONE_CLICK_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabledForOneClickPayment() {
    return enabledForOneClickPayment;
  }



  /**
   * The customer&#39;s email address.
   * @return customerEmailAddress
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerEmailAddress() {
    return customerEmailAddress;
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
   * A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.
   * @return externalId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalId() {
    return externalId;
  }



  /**
   * The customer&#39;s time zone, which affects how dates and times are formatted when communicating with the customer.
   * @return timeZone
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeZone() {
    return timeZone;
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
   * The reference used to identify the payment token (e.g. the customer&#39;s ID or email address).
   * @return tokenReference
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTokenReference() {
    return tokenReference;
  }



  /**
   * The unique identifier of the customer in the external system.
   * @return customerId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerId() {
    return customerId;
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



  public Token state(@javax.annotation.Nullable CreationEntityState state) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Token token = (Token) o;
    return Objects.equals(this.enabledForOneClickPayment, token.enabledForOneClickPayment) &&
        Objects.equals(this.customerEmailAddress, token.customerEmailAddress) &&
        Objects.equals(this.plannedPurgeDate, token.plannedPurgeDate) &&
        Objects.equals(this.externalId, token.externalId) &&
        Objects.equals(this.timeZone, token.timeZone) &&
        Objects.equals(this.language, token.language) &&
        Objects.equals(this.createdOn, token.createdOn) &&
        Objects.equals(this.version, token.version) &&
        Objects.equals(this.linkedSpaceId, token.linkedSpaceId) &&
        Objects.equals(this.tokenReference, token.tokenReference) &&
        Objects.equals(this.customerId, token.customerId) &&
        Objects.equals(this.id, token.id) &&
        Objects.equals(this.state, token.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabledForOneClickPayment, customerEmailAddress, plannedPurgeDate, externalId, timeZone, language, createdOn, version, linkedSpaceId, tokenReference, customerId, id, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Token {\n");
    sb.append("    enabledForOneClickPayment: ").append(toIndentedString(enabledForOneClickPayment)).append("\n");
    sb.append("    customerEmailAddress: ").append(toIndentedString(customerEmailAddress)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    tokenReference: ").append(toIndentedString(tokenReference)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
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

    // add `enabledForOneClickPayment` to the URL query string
    if (getEnabledForOneClickPayment() != null) {
      try {
        joiner.add(String.format("%senabledForOneClickPayment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnabledForOneClickPayment()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `customerEmailAddress` to the URL query string
    if (getCustomerEmailAddress() != null) {
      try {
        joiner.add(String.format("%scustomerEmailAddress%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCustomerEmailAddress()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `externalId` to the URL query string
    if (getExternalId() != null) {
      try {
        joiner.add(String.format("%sexternalId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExternalId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `timeZone` to the URL query string
    if (getTimeZone() != null) {
      try {
        joiner.add(String.format("%stimeZone%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTimeZone()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `linkedSpaceId` to the URL query string
    if (getLinkedSpaceId() != null) {
      try {
        joiner.add(String.format("%slinkedSpaceId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLinkedSpaceId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `tokenReference` to the URL query string
    if (getTokenReference() != null) {
      try {
        joiner.add(String.format("%stokenReference%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTokenReference()), "UTF-8").replaceAll("\\+", "%20")));
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

