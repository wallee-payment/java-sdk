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
import com.wallee.sdk.model.Subscriber;
import com.wallee.sdk.model.SubscriptionAffiliate;
import com.wallee.sdk.model.SubscriptionProductVersion;
import com.wallee.sdk.model.SubscriptionState;
import com.wallee.sdk.model.Token;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Subscription
 */
@JsonPropertyOrder({
  Subscription.JSON_PROPERTY_SUBSCRIBER,
  Subscription.JSON_PROPERTY_PLANNED_PURGE_DATE,
  Subscription.JSON_PROPERTY_TERMINATED_BY,
  Subscription.JSON_PROPERTY_DESCRIPTION,
  Subscription.JSON_PROPERTY_LANGUAGE,
  Subscription.JSON_PROPERTY_INITIALIZED_ON,
  Subscription.JSON_PROPERTY_CREATED_ON,
  Subscription.JSON_PROPERTY_VERSION,
  Subscription.JSON_PROPERTY_TOKEN,
  Subscription.JSON_PROPERTY_REFERENCE,
  Subscription.JSON_PROPERTY_TERMINATED_ON,
  Subscription.JSON_PROPERTY_LINKED_SPACE_ID,
  Subscription.JSON_PROPERTY_ACTIVATED_ON,
  Subscription.JSON_PROPERTY_TERMINATING_ON,
  Subscription.JSON_PROPERTY_CURRENT_PRODUCT_VERSION,
  Subscription.JSON_PROPERTY_PLANNED_TERMINATION_DATE,
  Subscription.JSON_PROPERTY_ID,
  Subscription.JSON_PROPERTY_STATE,
  Subscription.JSON_PROPERTY_AFFILIATE,
  Subscription.JSON_PROPERTY_TERMINATION_SCHEDULED_ON
})

public class Subscription {
  public static final String JSON_PROPERTY_SUBSCRIBER = "subscriber";
  @javax.annotation.Nullable
  private Subscriber subscriber;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  @javax.annotation.Nullable
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_TERMINATED_BY = "terminatedBy";
  @javax.annotation.Nullable
  private Long terminatedBy;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable
  private String description;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  @javax.annotation.Nullable
  private String language;

  public static final String JSON_PROPERTY_INITIALIZED_ON = "initializedOn";
  @javax.annotation.Nullable
  private OffsetDateTime initializedOn;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  @javax.annotation.Nullable
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_TOKEN = "token";
  @javax.annotation.Nullable
  private Token token;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  @javax.annotation.Nullable
  private String reference;

  public static final String JSON_PROPERTY_TERMINATED_ON = "terminatedOn";
  @javax.annotation.Nullable
  private OffsetDateTime terminatedOn;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_ACTIVATED_ON = "activatedOn";
  @javax.annotation.Nullable
  private OffsetDateTime activatedOn;

  public static final String JSON_PROPERTY_TERMINATING_ON = "terminatingOn";
  @javax.annotation.Nullable
  private OffsetDateTime terminatingOn;

  public static final String JSON_PROPERTY_CURRENT_PRODUCT_VERSION = "currentProductVersion";
  @javax.annotation.Nullable
  private SubscriptionProductVersion currentProductVersion;

  public static final String JSON_PROPERTY_PLANNED_TERMINATION_DATE = "plannedTerminationDate";
  @javax.annotation.Nullable
  private OffsetDateTime plannedTerminationDate;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private SubscriptionState state;

  public static final String JSON_PROPERTY_AFFILIATE = "affiliate";
  @javax.annotation.Nullable
  private SubscriptionAffiliate affiliate;

  public static final String JSON_PROPERTY_TERMINATION_SCHEDULED_ON = "terminationScheduledOn";
  @javax.annotation.Nullable
  private OffsetDateTime terminationScheduledOn;

  public Subscription() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public Subscription(
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_TERMINATED_BY) Long terminatedBy, 
    @JsonProperty(JSON_PROPERTY_DESCRIPTION) String description, 
    @JsonProperty(JSON_PROPERTY_LANGUAGE) String language, 
    @JsonProperty(JSON_PROPERTY_INITIALIZED_ON) OffsetDateTime initializedOn, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_REFERENCE) String reference, 
    @JsonProperty(JSON_PROPERTY_TERMINATED_ON) OffsetDateTime terminatedOn, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_ACTIVATED_ON) OffsetDateTime activatedOn, 
    @JsonProperty(JSON_PROPERTY_TERMINATING_ON) OffsetDateTime terminatingOn, 
    @JsonProperty(JSON_PROPERTY_PLANNED_TERMINATION_DATE) OffsetDateTime plannedTerminationDate, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_TERMINATION_SCHEDULED_ON) OffsetDateTime terminationScheduledOn
  ) {
    this();
    this.plannedPurgeDate = plannedPurgeDate;
    this.terminatedBy = terminatedBy;
    this.description = description;
    this.language = language;
    this.initializedOn = initializedOn;
    this.createdOn = createdOn;
    this.version = version;
    this.reference = reference;
    this.terminatedOn = terminatedOn;
    this.linkedSpaceId = linkedSpaceId;
    this.activatedOn = activatedOn;
    this.terminatingOn = terminatingOn;
    this.plannedTerminationDate = plannedTerminationDate;
    this.id = id;
    this.terminationScheduledOn = terminationScheduledOn;
  }

  public Subscription subscriber(@javax.annotation.Nullable Subscriber subscriber) {
    
    this.subscriber = subscriber;
    return this;
  }

  /**
   * Get subscriber
   * @return subscriber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Subscriber getSubscriber() {
    return subscriber;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriber(@javax.annotation.Nullable Subscriber subscriber) {
    this.subscriber = subscriber;
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
   * The ID of the user the subscription was terminated by.
   * @return terminatedBy
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TERMINATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTerminatedBy() {
    return terminatedBy;
  }



  /**
   * A description used to identify the subscription.
   * @return description
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
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
   * The date and time when the subscription was initialized.
   * @return initializedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INITIALIZED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getInitializedOn() {
    return initializedOn;
  }



  /**
   * The date and time when the subscription was created.
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



  public Subscription token(@javax.annotation.Nullable Token token) {
    
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Token getToken() {
    return token;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToken(@javax.annotation.Nullable Token token) {
    this.token = token;
  }

  /**
   * The merchant&#39;s reference used to identify the subscription.
   * @return reference
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }



  /**
   * The date and time when the subscription was terminated.
   * @return terminatedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TERMINATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTerminatedOn() {
    return terminatedOn;
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
   * The date and time when the subscription was activate.
   * @return activatedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getActivatedOn() {
    return activatedOn;
  }



  /**
   * The date and time when the termination of the subscription started.
   * @return terminatingOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TERMINATING_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTerminatingOn() {
    return terminatingOn;
  }



  public Subscription currentProductVersion(@javax.annotation.Nullable SubscriptionProductVersion currentProductVersion) {
    
    this.currentProductVersion = currentProductVersion;
    return this;
  }

  /**
   * Get currentProductVersion
   * @return currentProductVersion
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENT_PRODUCT_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionProductVersion getCurrentProductVersion() {
    return currentProductVersion;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_PRODUCT_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentProductVersion(@javax.annotation.Nullable SubscriptionProductVersion currentProductVersion) {
    this.currentProductVersion = currentProductVersion;
  }

  /**
   * The date and time when the subscription is planned to be terminated.
   * @return plannedTerminationDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLANNED_TERMINATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getPlannedTerminationDate() {
    return plannedTerminationDate;
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



  public Subscription state(@javax.annotation.Nullable SubscriptionState state) {
    
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

  public SubscriptionState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable SubscriptionState state) {
    this.state = state;
  }

  public Subscription affiliate(@javax.annotation.Nullable SubscriptionAffiliate affiliate) {
    
    this.affiliate = affiliate;
    return this;
  }

  /**
   * Get affiliate
   * @return affiliate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AFFILIATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionAffiliate getAffiliate() {
    return affiliate;
  }


  @JsonProperty(JSON_PROPERTY_AFFILIATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAffiliate(@javax.annotation.Nullable SubscriptionAffiliate affiliate) {
    this.affiliate = affiliate;
  }

  /**
   * The date and time when the subscription was scheduled to be terminated.
   * @return terminationScheduledOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TERMINATION_SCHEDULED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTerminationScheduledOn() {
    return terminationScheduledOn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.subscriber, subscription.subscriber) &&
        Objects.equals(this.plannedPurgeDate, subscription.plannedPurgeDate) &&
        Objects.equals(this.terminatedBy, subscription.terminatedBy) &&
        Objects.equals(this.description, subscription.description) &&
        Objects.equals(this.language, subscription.language) &&
        Objects.equals(this.initializedOn, subscription.initializedOn) &&
        Objects.equals(this.createdOn, subscription.createdOn) &&
        Objects.equals(this.version, subscription.version) &&
        Objects.equals(this.token, subscription.token) &&
        Objects.equals(this.reference, subscription.reference) &&
        Objects.equals(this.terminatedOn, subscription.terminatedOn) &&
        Objects.equals(this.linkedSpaceId, subscription.linkedSpaceId) &&
        Objects.equals(this.activatedOn, subscription.activatedOn) &&
        Objects.equals(this.terminatingOn, subscription.terminatingOn) &&
        Objects.equals(this.currentProductVersion, subscription.currentProductVersion) &&
        Objects.equals(this.plannedTerminationDate, subscription.plannedTerminationDate) &&
        Objects.equals(this.id, subscription.id) &&
        Objects.equals(this.state, subscription.state) &&
        Objects.equals(this.affiliate, subscription.affiliate) &&
        Objects.equals(this.terminationScheduledOn, subscription.terminationScheduledOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriber, plannedPurgeDate, terminatedBy, description, language, initializedOn, createdOn, version, token, reference, terminatedOn, linkedSpaceId, activatedOn, terminatingOn, currentProductVersion, plannedTerminationDate, id, state, affiliate, terminationScheduledOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    sb.append("    subscriber: ").append(toIndentedString(subscriber)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    terminatedBy: ").append(toIndentedString(terminatedBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    initializedOn: ").append(toIndentedString(initializedOn)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    terminatedOn: ").append(toIndentedString(terminatedOn)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    activatedOn: ").append(toIndentedString(activatedOn)).append("\n");
    sb.append("    terminatingOn: ").append(toIndentedString(terminatingOn)).append("\n");
    sb.append("    currentProductVersion: ").append(toIndentedString(currentProductVersion)).append("\n");
    sb.append("    plannedTerminationDate: ").append(toIndentedString(plannedTerminationDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    affiliate: ").append(toIndentedString(affiliate)).append("\n");
    sb.append("    terminationScheduledOn: ").append(toIndentedString(terminationScheduledOn)).append("\n");
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

    // add `subscriber` to the URL query string
    if (getSubscriber() != null) {
      joiner.add(getSubscriber().toUrlQueryString(prefix + "subscriber" + suffix));
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

    // add `terminatedBy` to the URL query string
    if (getTerminatedBy() != null) {
      try {
        joiner.add(String.format("%sterminatedBy%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTerminatedBy()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      try {
        joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `initializedOn` to the URL query string
    if (getInitializedOn() != null) {
      try {
        joiner.add(String.format("%sinitializedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getInitializedOn()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `token` to the URL query string
    if (getToken() != null) {
      joiner.add(getToken().toUrlQueryString(prefix + "token" + suffix));
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

    // add `terminatedOn` to the URL query string
    if (getTerminatedOn() != null) {
      try {
        joiner.add(String.format("%sterminatedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTerminatedOn()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `activatedOn` to the URL query string
    if (getActivatedOn() != null) {
      try {
        joiner.add(String.format("%sactivatedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getActivatedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `terminatingOn` to the URL query string
    if (getTerminatingOn() != null) {
      try {
        joiner.add(String.format("%sterminatingOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTerminatingOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `currentProductVersion` to the URL query string
    if (getCurrentProductVersion() != null) {
      joiner.add(getCurrentProductVersion().toUrlQueryString(prefix + "currentProductVersion" + suffix));
    }

    // add `plannedTerminationDate` to the URL query string
    if (getPlannedTerminationDate() != null) {
      try {
        joiner.add(String.format("%splannedTerminationDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getPlannedTerminationDate()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `affiliate` to the URL query string
    if (getAffiliate() != null) {
      joiner.add(getAffiliate().toUrlQueryString(prefix + "affiliate" + suffix));
    }

    // add `terminationScheduledOn` to the URL query string
    if (getTerminationScheduledOn() != null) {
      try {
        joiner.add(String.format("%sterminationScheduledOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTerminationScheduledOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

