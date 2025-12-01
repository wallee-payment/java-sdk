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
import com.wallee.sdk.model.BillingCycleModel;
import com.wallee.sdk.model.Subscription;
import com.wallee.sdk.model.SubscriptionComponentConfiguration;
import com.wallee.sdk.model.SubscriptionProductVersion;
import com.wallee.sdk.model.SubscriptionVersionState;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * SubscriptionVersion
 */
@JsonPropertyOrder({
  SubscriptionVersion.JSON_PROPERTY_PLANNED_PURGE_DATE,
  SubscriptionVersion.JSON_PROPERTY_LANGUAGE,
  SubscriptionVersion.JSON_PROPERTY_SUBSCRIPTION,
  SubscriptionVersion.JSON_PROPERTY_CREATED_ON,
  SubscriptionVersion.JSON_PROPERTY_VERSION,
  SubscriptionVersion.JSON_PROPERTY_TERMINATED_ON,
  SubscriptionVersion.JSON_PROPERTY_LINKED_SPACE_ID,
  SubscriptionVersion.JSON_PROPERTY_TERMINATION_ISSUED_ON,
  SubscriptionVersion.JSON_PROPERTY_COMPONENT_CONFIGURATIONS,
  SubscriptionVersion.JSON_PROPERTY_PRODUCT_VERSION,
  SubscriptionVersion.JSON_PROPERTY_ACTIVATED_ON,
  SubscriptionVersion.JSON_PROPERTY_TERMINATING_ON,
  SubscriptionVersion.JSON_PROPERTY_BILLING_CURRENCY,
  SubscriptionVersion.JSON_PROPERTY_EXPECTED_LAST_PERIOD_END,
  SubscriptionVersion.JSON_PROPERTY_BILLING_CYCLE_MODEL,
  SubscriptionVersion.JSON_PROPERTY_PLANNED_TERMINATION_DATE,
  SubscriptionVersion.JSON_PROPERTY_ID,
  SubscriptionVersion.JSON_PROPERTY_STATE,
  SubscriptionVersion.JSON_PROPERTY_FAILED_ON
})

public class SubscriptionVersion {
  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  @javax.annotation.Nullable
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  @javax.annotation.Nullable
  private String language;

  public static final String JSON_PROPERTY_SUBSCRIPTION = "subscription";
  @javax.annotation.Nullable
  private Subscription subscription;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  @javax.annotation.Nullable
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private Integer version;

  public static final String JSON_PROPERTY_TERMINATED_ON = "terminatedOn";
  @javax.annotation.Nullable
  private OffsetDateTime terminatedOn;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  @javax.annotation.Nullable
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_TERMINATION_ISSUED_ON = "terminationIssuedOn";
  @javax.annotation.Nullable
  private OffsetDateTime terminationIssuedOn;

  public static final String JSON_PROPERTY_COMPONENT_CONFIGURATIONS = "componentConfigurations";
  @javax.annotation.Nullable
  private Set<SubscriptionComponentConfiguration> componentConfigurations = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_PRODUCT_VERSION = "productVersion";
  @javax.annotation.Nullable
  private SubscriptionProductVersion productVersion;

  public static final String JSON_PROPERTY_ACTIVATED_ON = "activatedOn";
  @javax.annotation.Nullable
  private OffsetDateTime activatedOn;

  public static final String JSON_PROPERTY_TERMINATING_ON = "terminatingOn";
  @javax.annotation.Nullable
  private OffsetDateTime terminatingOn;

  public static final String JSON_PROPERTY_BILLING_CURRENCY = "billingCurrency";
  @javax.annotation.Nullable
  private String billingCurrency;

  public static final String JSON_PROPERTY_EXPECTED_LAST_PERIOD_END = "expectedLastPeriodEnd";
  @javax.annotation.Nullable
  private OffsetDateTime expectedLastPeriodEnd;

  public static final String JSON_PROPERTY_BILLING_CYCLE_MODEL = "billingCycleModel";
  @javax.annotation.Nullable
  private BillingCycleModel billingCycleModel;

  public static final String JSON_PROPERTY_PLANNED_TERMINATION_DATE = "plannedTerminationDate";
  @javax.annotation.Nullable
  private OffsetDateTime plannedTerminationDate;

  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private Long id;

  public static final String JSON_PROPERTY_STATE = "state";
  @javax.annotation.Nullable
  private SubscriptionVersionState state;

  public static final String JSON_PROPERTY_FAILED_ON = "failedOn";
  @javax.annotation.Nullable
  private OffsetDateTime failedOn;

  public SubscriptionVersion() {
  }
  /**
   * Constructor with only readonly parameters
   */
  @JsonCreator
  public SubscriptionVersion(
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_LANGUAGE) String language, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_TERMINATED_ON) OffsetDateTime terminatedOn, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_TERMINATION_ISSUED_ON) OffsetDateTime terminationIssuedOn, 
    @JsonProperty(JSON_PROPERTY_COMPONENT_CONFIGURATIONS) Set<SubscriptionComponentConfiguration> componentConfigurations, 
    @JsonProperty(JSON_PROPERTY_ACTIVATED_ON) OffsetDateTime activatedOn, 
    @JsonProperty(JSON_PROPERTY_TERMINATING_ON) OffsetDateTime terminatingOn, 
    @JsonProperty(JSON_PROPERTY_BILLING_CURRENCY) String billingCurrency, 
    @JsonProperty(JSON_PROPERTY_EXPECTED_LAST_PERIOD_END) OffsetDateTime expectedLastPeriodEnd, 
    @JsonProperty(JSON_PROPERTY_PLANNED_TERMINATION_DATE) OffsetDateTime plannedTerminationDate, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_FAILED_ON) OffsetDateTime failedOn
  ) {
    this();
    this.plannedPurgeDate = plannedPurgeDate;
    this.language = language;
    this.createdOn = createdOn;
    this.version = version;
    this.terminatedOn = terminatedOn;
    this.linkedSpaceId = linkedSpaceId;
    this.terminationIssuedOn = terminationIssuedOn;
    this.componentConfigurations = componentConfigurations;
    this.activatedOn = activatedOn;
    this.terminatingOn = terminatingOn;
    this.billingCurrency = billingCurrency;
    this.expectedLastPeriodEnd = expectedLastPeriodEnd;
    this.plannedTerminationDate = plannedTerminationDate;
    this.id = id;
    this.failedOn = failedOn;
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



  public SubscriptionVersion subscription(@javax.annotation.Nullable Subscription subscription) {
    
    this.subscription = subscription;
    return this;
  }

  /**
   * Get subscription
   * @return subscription
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Subscription getSubscription() {
    return subscription;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscription(@javax.annotation.Nullable Subscription subscription) {
    this.subscription = subscription;
  }

  /**
   * The date and time when the subscription version was created.
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
   * The date and time when the subscription version was terminated.
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
   * The date and time when the termination of the subscription version was issued.
   * @return terminationIssuedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TERMINATION_ISSUED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTerminationIssuedOn() {
    return terminationIssuedOn;
  }



  /**
   * The configurations of the subscription&#39;s components.
   * @return componentConfigurations
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENT_CONFIGURATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<SubscriptionComponentConfiguration> getComponentConfigurations() {
    return componentConfigurations;
  }



  public SubscriptionVersion productVersion(@javax.annotation.Nullable SubscriptionProductVersion productVersion) {
    
    this.productVersion = productVersion;
    return this;
  }

  /**
   * Get productVersion
   * @return productVersion
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionProductVersion getProductVersion() {
    return productVersion;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductVersion(@javax.annotation.Nullable SubscriptionProductVersion productVersion) {
    this.productVersion = productVersion;
  }

  /**
   * The date and time when the subscription version was activated.
   * @return activatedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getActivatedOn() {
    return activatedOn;
  }



  /**
   * The date and time when the termination of the subscription version started.
   * @return terminatingOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TERMINATING_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTerminatingOn() {
    return terminatingOn;
  }



  /**
   * The three-letter code (ISO 4217 format) of the currency used to invoice the customer. Must be one of the currencies supported by the product.
   * @return billingCurrency
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLING_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBillingCurrency() {
    return billingCurrency;
  }



  /**
   * The date and time when the last period is expected to end.
   * @return expectedLastPeriodEnd
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPECTED_LAST_PERIOD_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getExpectedLastPeriodEnd() {
    return expectedLastPeriodEnd;
  }



  public SubscriptionVersion billingCycleModel(@javax.annotation.Nullable BillingCycleModel billingCycleModel) {
    
    this.billingCycleModel = billingCycleModel;
    return this;
  }

  /**
   * Get billingCycleModel
   * @return billingCycleModel
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLING_CYCLE_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BillingCycleModel getBillingCycleModel() {
    return billingCycleModel;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_CYCLE_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingCycleModel(@javax.annotation.Nullable BillingCycleModel billingCycleModel) {
    this.billingCycleModel = billingCycleModel;
  }

  /**
   * The date and time when the termination of the subscription version is planned.
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



  public SubscriptionVersion state(@javax.annotation.Nullable SubscriptionVersionState state) {
    
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

  public SubscriptionVersionState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(@javax.annotation.Nullable SubscriptionVersionState state) {
    this.state = state;
  }

  /**
   * The date and time when the subscription version failed.
   * @return failedOn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAILED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getFailedOn() {
    return failedOn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionVersion subscriptionVersion = (SubscriptionVersion) o;
    return Objects.equals(this.plannedPurgeDate, subscriptionVersion.plannedPurgeDate) &&
        Objects.equals(this.language, subscriptionVersion.language) &&
        Objects.equals(this.subscription, subscriptionVersion.subscription) &&
        Objects.equals(this.createdOn, subscriptionVersion.createdOn) &&
        Objects.equals(this.version, subscriptionVersion.version) &&
        Objects.equals(this.terminatedOn, subscriptionVersion.terminatedOn) &&
        Objects.equals(this.linkedSpaceId, subscriptionVersion.linkedSpaceId) &&
        Objects.equals(this.terminationIssuedOn, subscriptionVersion.terminationIssuedOn) &&
        Objects.equals(this.componentConfigurations, subscriptionVersion.componentConfigurations) &&
        Objects.equals(this.productVersion, subscriptionVersion.productVersion) &&
        Objects.equals(this.activatedOn, subscriptionVersion.activatedOn) &&
        Objects.equals(this.terminatingOn, subscriptionVersion.terminatingOn) &&
        Objects.equals(this.billingCurrency, subscriptionVersion.billingCurrency) &&
        Objects.equals(this.expectedLastPeriodEnd, subscriptionVersion.expectedLastPeriodEnd) &&
        Objects.equals(this.billingCycleModel, subscriptionVersion.billingCycleModel) &&
        Objects.equals(this.plannedTerminationDate, subscriptionVersion.plannedTerminationDate) &&
        Objects.equals(this.id, subscriptionVersion.id) &&
        Objects.equals(this.state, subscriptionVersion.state) &&
        Objects.equals(this.failedOn, subscriptionVersion.failedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plannedPurgeDate, language, subscription, createdOn, version, terminatedOn, linkedSpaceId, terminationIssuedOn, componentConfigurations, productVersion, activatedOn, terminatingOn, billingCurrency, expectedLastPeriodEnd, billingCycleModel, plannedTerminationDate, id, state, failedOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionVersion {\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    terminatedOn: ").append(toIndentedString(terminatedOn)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    terminationIssuedOn: ").append(toIndentedString(terminationIssuedOn)).append("\n");
    sb.append("    componentConfigurations: ").append(toIndentedString(componentConfigurations)).append("\n");
    sb.append("    productVersion: ").append(toIndentedString(productVersion)).append("\n");
    sb.append("    activatedOn: ").append(toIndentedString(activatedOn)).append("\n");
    sb.append("    terminatingOn: ").append(toIndentedString(terminatingOn)).append("\n");
    sb.append("    billingCurrency: ").append(toIndentedString(billingCurrency)).append("\n");
    sb.append("    expectedLastPeriodEnd: ").append(toIndentedString(expectedLastPeriodEnd)).append("\n");
    sb.append("    billingCycleModel: ").append(toIndentedString(billingCycleModel)).append("\n");
    sb.append("    plannedTerminationDate: ").append(toIndentedString(plannedTerminationDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    failedOn: ").append(toIndentedString(failedOn)).append("\n");
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

    // add `subscription` to the URL query string
    if (getSubscription() != null) {
      joiner.add(getSubscription().toUrlQueryString(prefix + "subscription" + suffix));
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

    // add `terminationIssuedOn` to the URL query string
    if (getTerminationIssuedOn() != null) {
      try {
        joiner.add(String.format("%sterminationIssuedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTerminationIssuedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `componentConfigurations` to the URL query string
    if (getComponentConfigurations() != null) {
      int i = 0;
      for (SubscriptionComponentConfiguration _item : getComponentConfigurations()) {
        if (_item != null) {
          joiner.add(_item.toUrlQueryString(String.format("%scomponentConfigurations%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
      i++;
    }

    // add `productVersion` to the URL query string
    if (getProductVersion() != null) {
      joiner.add(getProductVersion().toUrlQueryString(prefix + "productVersion" + suffix));
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

    // add `billingCurrency` to the URL query string
    if (getBillingCurrency() != null) {
      try {
        joiner.add(String.format("%sbillingCurrency%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBillingCurrency()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `expectedLastPeriodEnd` to the URL query string
    if (getExpectedLastPeriodEnd() != null) {
      try {
        joiner.add(String.format("%sexpectedLastPeriodEnd%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExpectedLastPeriodEnd()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `billingCycleModel` to the URL query string
    if (getBillingCycleModel() != null) {
      joiner.add(getBillingCycleModel().toUrlQueryString(prefix + "billingCycleModel" + suffix));
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

    // add `failedOn` to the URL query string
    if (getFailedOn() != null) {
      try {
        joiner.add(String.format("%sfailedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getFailedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

