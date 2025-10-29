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
import com.wallee.sdk.model.SubscriptionProduct;
import com.wallee.sdk.model.SubscriptionProductVersionState;
import com.wallee.sdk.model.TaxCalculation;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * SubscriptionProductVersion
 */
@JsonPropertyOrder({
  SubscriptionProductVersion.JSON_PROPERTY_RETIRING_FINISHED_ON,
  SubscriptionProductVersion.JSON_PROPERTY_ENABLED_CURRENCIES,
  SubscriptionProductVersion.JSON_PROPERTY_PRODUCT,
  SubscriptionProductVersion.JSON_PROPERTY_RETIRING_STARTED_ON,
  SubscriptionProductVersion.JSON_PROPERTY_TAX_CALCULATION,
  SubscriptionProductVersion.JSON_PROPERTY_PLANNED_PURGE_DATE,
  SubscriptionProductVersion.JSON_PROPERTY_CREATED_ON,
  SubscriptionProductVersion.JSON_PROPERTY_VERSION,
  SubscriptionProductVersion.JSON_PROPERTY_REFERENCE,
  SubscriptionProductVersion.JSON_PROPERTY_LINKED_SPACE_ID,
  SubscriptionProductVersion.JSON_PROPERTY_ACTIVATED_ON,
  SubscriptionProductVersion.JSON_PROPERTY_BILLING_CYCLE,
  SubscriptionProductVersion.JSON_PROPERTY_DEFAULT_CURRENCY,
  SubscriptionProductVersion.JSON_PROPERTY_NAME,
  SubscriptionProductVersion.JSON_PROPERTY_MINIMAL_NUMBER_OF_PERIODS,
  SubscriptionProductVersion.JSON_PROPERTY_OBSOLETED_ON,
  SubscriptionProductVersion.JSON_PROPERTY_BILLING_CYCLE_MODEL,
  SubscriptionProductVersion.JSON_PROPERTY_COMMENT,
  SubscriptionProductVersion.JSON_PROPERTY_ID,
  SubscriptionProductVersion.JSON_PROPERTY_INCREMENT_NUMBER,
  SubscriptionProductVersion.JSON_PROPERTY_STATE,
  SubscriptionProductVersion.JSON_PROPERTY_NUMBER_OF_NOTICE_PERIODS
})

public class SubscriptionProductVersion {
  public static final String JSON_PROPERTY_RETIRING_FINISHED_ON = "retiringFinishedOn";
  private OffsetDateTime retiringFinishedOn;

  public static final String JSON_PROPERTY_ENABLED_CURRENCIES = "enabledCurrencies";
  private Set<String> enabledCurrencies = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_PRODUCT = "product";
  private SubscriptionProduct product;

  public static final String JSON_PROPERTY_RETIRING_STARTED_ON = "retiringStartedOn";
  private OffsetDateTime retiringStartedOn;

  public static final String JSON_PROPERTY_TAX_CALCULATION = "taxCalculation";
  private TaxCalculation taxCalculation;

  public static final String JSON_PROPERTY_PLANNED_PURGE_DATE = "plannedPurgeDate";
  private OffsetDateTime plannedPurgeDate;

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  private OffsetDateTime createdOn;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_LINKED_SPACE_ID = "linkedSpaceId";
  private Long linkedSpaceId;

  public static final String JSON_PROPERTY_ACTIVATED_ON = "activatedOn";
  private OffsetDateTime activatedOn;

  public static final String JSON_PROPERTY_BILLING_CYCLE = "billingCycle";
  private String billingCycle;

  public static final String JSON_PROPERTY_DEFAULT_CURRENCY = "defaultCurrency";
  private String defaultCurrency;

  public static final String JSON_PROPERTY_NAME = "name";
  private Map<String, String> name = new HashMap<>();

  public static final String JSON_PROPERTY_MINIMAL_NUMBER_OF_PERIODS = "minimalNumberOfPeriods";
  private Integer minimalNumberOfPeriods;

  public static final String JSON_PROPERTY_OBSOLETED_ON = "obsoletedOn";
  private OffsetDateTime obsoletedOn;

  public static final String JSON_PROPERTY_BILLING_CYCLE_MODEL = "billingCycleModel";
  private BillingCycleModel billingCycleModel;

  public static final String JSON_PROPERTY_COMMENT = "comment";
  private String comment;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_INCREMENT_NUMBER = "incrementNumber";
  private Integer incrementNumber;

  public static final String JSON_PROPERTY_STATE = "state";
  private SubscriptionProductVersionState state;

  public static final String JSON_PROPERTY_NUMBER_OF_NOTICE_PERIODS = "numberOfNoticePeriods";
  private Integer numberOfNoticePeriods;

  public SubscriptionProductVersion() {
  }
  /**
  * Constructor with only readonly parameters
  */
  @JsonCreator
  public SubscriptionProductVersion(
    @JsonProperty(JSON_PROPERTY_RETIRING_FINISHED_ON) OffsetDateTime retiringFinishedOn, 
    @JsonProperty(JSON_PROPERTY_ENABLED_CURRENCIES) Set<String> enabledCurrencies, 
    @JsonProperty(JSON_PROPERTY_RETIRING_STARTED_ON) OffsetDateTime retiringStartedOn, 
    @JsonProperty(JSON_PROPERTY_PLANNED_PURGE_DATE) OffsetDateTime plannedPurgeDate, 
    @JsonProperty(JSON_PROPERTY_CREATED_ON) OffsetDateTime createdOn, 
    @JsonProperty(JSON_PROPERTY_VERSION) Integer version, 
    @JsonProperty(JSON_PROPERTY_REFERENCE) String reference, 
    @JsonProperty(JSON_PROPERTY_LINKED_SPACE_ID) Long linkedSpaceId, 
    @JsonProperty(JSON_PROPERTY_ACTIVATED_ON) OffsetDateTime activatedOn, 
    @JsonProperty(JSON_PROPERTY_BILLING_CYCLE) String billingCycle, 
    @JsonProperty(JSON_PROPERTY_DEFAULT_CURRENCY) String defaultCurrency, 
    @JsonProperty(JSON_PROPERTY_NAME) Map<String, String> name, 
    @JsonProperty(JSON_PROPERTY_MINIMAL_NUMBER_OF_PERIODS) Integer minimalNumberOfPeriods, 
    @JsonProperty(JSON_PROPERTY_OBSOLETED_ON) OffsetDateTime obsoletedOn, 
    @JsonProperty(JSON_PROPERTY_COMMENT) String comment, 
    @JsonProperty(JSON_PROPERTY_ID) Long id, 
    @JsonProperty(JSON_PROPERTY_INCREMENT_NUMBER) Integer incrementNumber, 
    @JsonProperty(JSON_PROPERTY_NUMBER_OF_NOTICE_PERIODS) Integer numberOfNoticePeriods
  ) {
    this();
    this.retiringFinishedOn = retiringFinishedOn;
    this.enabledCurrencies = enabledCurrencies;
    this.retiringStartedOn = retiringStartedOn;
    this.plannedPurgeDate = plannedPurgeDate;
    this.createdOn = createdOn;
    this.version = version;
    this.reference = reference;
    this.linkedSpaceId = linkedSpaceId;
    this.activatedOn = activatedOn;
    this.billingCycle = billingCycle;
    this.defaultCurrency = defaultCurrency;
    this.name = name;
    this.minimalNumberOfPeriods = minimalNumberOfPeriods;
    this.obsoletedOn = obsoletedOn;
    this.comment = comment;
    this.id = id;
    this.incrementNumber = incrementNumber;
    this.numberOfNoticePeriods = numberOfNoticePeriods;
  }

   /**
   * The date and time when the product version was retired.
   * @return retiringFinishedOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETIRING_FINISHED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getRetiringFinishedOn() {
    return retiringFinishedOn;
  }



   /**
   * The three-letter codes (ISO 4217 format) of the currencies that the product version supports.
   * @return enabledCurrencies
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED_CURRENCIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getEnabledCurrencies() {
    return enabledCurrencies;
  }



  public SubscriptionProductVersion product(SubscriptionProduct product) {
    
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionProduct getProduct() {
    return product;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProduct(SubscriptionProduct product) {
    this.product = product;
  }

   /**
   * The date and time when the product version&#39;s retirement was started.
   * @return retiringStartedOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETIRING_STARTED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getRetiringStartedOn() {
    return retiringStartedOn;
  }



  public SubscriptionProductVersion taxCalculation(TaxCalculation taxCalculation) {
    
    this.taxCalculation = taxCalculation;
    return this;
  }

   /**
   * Get taxCalculation
   * @return taxCalculation
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_CALCULATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TaxCalculation getTaxCalculation() {
    return taxCalculation;
  }


  @JsonProperty(JSON_PROPERTY_TAX_CALCULATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxCalculation(TaxCalculation taxCalculation) {
    this.taxCalculation = taxCalculation;
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
   * The date and time when the product version was created.
   * @return createdOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedOn() {
    return createdOn;
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
   * The reference used to identify the product version.
   * @return reference
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
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
   * The date and time when the product version was activated.
   * @return activatedOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTIVATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getActivatedOn() {
    return activatedOn;
  }



   /**
   * The recurring period of time, typically monthly or annually, for which a subscriber is charged.
   * @return billingCycle
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLING_CYCLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBillingCycle() {
    return billingCycle;
  }



   /**
   * The three-letter code (ISO 4217 format) of the product version&#39;s default currency.
   * @return defaultCurrency
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultCurrency() {
    return defaultCurrency;
  }



   /**
   * The localized name of the product that is displayed to the customer.
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getName() {
    return name;
  }



   /**
   * The minimum number of periods the subscription will run before it can be terminated.
   * @return minimalNumberOfPeriods
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MINIMAL_NUMBER_OF_PERIODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinimalNumberOfPeriods() {
    return minimalNumberOfPeriods;
  }



   /**
   * The date and time when the product version was made obsolete.
   * @return obsoletedOn
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OBSOLETED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getObsoletedOn() {
    return obsoletedOn;
  }



  public SubscriptionProductVersion billingCycleModel(BillingCycleModel billingCycleModel) {
    
    this.billingCycleModel = billingCycleModel;
    return this;
  }

   /**
   * Get billingCycleModel
   * @return billingCycleModel
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLING_CYCLE_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BillingCycleModel getBillingCycleModel() {
    return billingCycleModel;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_CYCLE_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingCycleModel(BillingCycleModel billingCycleModel) {
    this.billingCycleModel = billingCycleModel;
  }

   /**
   * A comment that describes the product version and why it was created. It is not disclosed to the subscriber.
   * @return comment
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getComment() {
    return comment;
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



   /**
   * Whenever a new version of a product is created, the number is increased and assigned.
   * @return incrementNumber
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCREMENT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIncrementNumber() {
    return incrementNumber;
  }



  public SubscriptionProductVersion state(SubscriptionProductVersionState state) {
    
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

  public SubscriptionProductVersionState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(SubscriptionProductVersionState state) {
    this.state = state;
  }

   /**
   * The number of periods the subscription will keep running after its termination was requested.
   * @return numberOfNoticePeriods
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_NOTICE_PERIODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfNoticePeriods() {
    return numberOfNoticePeriods;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionProductVersion subscriptionProductVersion = (SubscriptionProductVersion) o;
    return Objects.equals(this.retiringFinishedOn, subscriptionProductVersion.retiringFinishedOn) &&
        Objects.equals(this.enabledCurrencies, subscriptionProductVersion.enabledCurrencies) &&
        Objects.equals(this.product, subscriptionProductVersion.product) &&
        Objects.equals(this.retiringStartedOn, subscriptionProductVersion.retiringStartedOn) &&
        Objects.equals(this.taxCalculation, subscriptionProductVersion.taxCalculation) &&
        Objects.equals(this.plannedPurgeDate, subscriptionProductVersion.plannedPurgeDate) &&
        Objects.equals(this.createdOn, subscriptionProductVersion.createdOn) &&
        Objects.equals(this.version, subscriptionProductVersion.version) &&
        Objects.equals(this.reference, subscriptionProductVersion.reference) &&
        Objects.equals(this.linkedSpaceId, subscriptionProductVersion.linkedSpaceId) &&
        Objects.equals(this.activatedOn, subscriptionProductVersion.activatedOn) &&
        Objects.equals(this.billingCycle, subscriptionProductVersion.billingCycle) &&
        Objects.equals(this.defaultCurrency, subscriptionProductVersion.defaultCurrency) &&
        Objects.equals(this.name, subscriptionProductVersion.name) &&
        Objects.equals(this.minimalNumberOfPeriods, subscriptionProductVersion.minimalNumberOfPeriods) &&
        Objects.equals(this.obsoletedOn, subscriptionProductVersion.obsoletedOn) &&
        Objects.equals(this.billingCycleModel, subscriptionProductVersion.billingCycleModel) &&
        Objects.equals(this.comment, subscriptionProductVersion.comment) &&
        Objects.equals(this.id, subscriptionProductVersion.id) &&
        Objects.equals(this.incrementNumber, subscriptionProductVersion.incrementNumber) &&
        Objects.equals(this.state, subscriptionProductVersion.state) &&
        Objects.equals(this.numberOfNoticePeriods, subscriptionProductVersion.numberOfNoticePeriods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retiringFinishedOn, enabledCurrencies, product, retiringStartedOn, taxCalculation, plannedPurgeDate, createdOn, version, reference, linkedSpaceId, activatedOn, billingCycle, defaultCurrency, name, minimalNumberOfPeriods, obsoletedOn, billingCycleModel, comment, id, incrementNumber, state, numberOfNoticePeriods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProductVersion {\n");
    sb.append("    retiringFinishedOn: ").append(toIndentedString(retiringFinishedOn)).append("\n");
    sb.append("    enabledCurrencies: ").append(toIndentedString(enabledCurrencies)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    retiringStartedOn: ").append(toIndentedString(retiringStartedOn)).append("\n");
    sb.append("    taxCalculation: ").append(toIndentedString(taxCalculation)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    activatedOn: ").append(toIndentedString(activatedOn)).append("\n");
    sb.append("    billingCycle: ").append(toIndentedString(billingCycle)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    minimalNumberOfPeriods: ").append(toIndentedString(minimalNumberOfPeriods)).append("\n");
    sb.append("    obsoletedOn: ").append(toIndentedString(obsoletedOn)).append("\n");
    sb.append("    billingCycleModel: ").append(toIndentedString(billingCycleModel)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    incrementNumber: ").append(toIndentedString(incrementNumber)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    numberOfNoticePeriods: ").append(toIndentedString(numberOfNoticePeriods)).append("\n");
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

    // add `retiringFinishedOn` to the URL query string
    if (getRetiringFinishedOn() != null) {
      try {
        joiner.add(String.format("%sretiringFinishedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRetiringFinishedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `enabledCurrencies` to the URL query string
    if (getEnabledCurrencies() != null) {
      int i = 0;
      for (String _item : getEnabledCurrencies()) {
        try {
          joiner.add(String.format("%senabledCurrencies%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(_item), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
      i++;
    }

    // add `product` to the URL query string
    if (getProduct() != null) {
      joiner.add(getProduct().toUrlQueryString(prefix + "product" + suffix));
    }

    // add `retiringStartedOn` to the URL query string
    if (getRetiringStartedOn() != null) {
      try {
        joiner.add(String.format("%sretiringStartedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getRetiringStartedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `taxCalculation` to the URL query string
    if (getTaxCalculation() != null) {
      try {
        joiner.add(String.format("%staxCalculation%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getTaxCalculation()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `reference` to the URL query string
    if (getReference() != null) {
      try {
        joiner.add(String.format("%sreference%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getReference()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `billingCycle` to the URL query string
    if (getBillingCycle() != null) {
      try {
        joiner.add(String.format("%sbillingCycle%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBillingCycle()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `defaultCurrency` to the URL query string
    if (getDefaultCurrency() != null) {
      try {
        joiner.add(String.format("%sdefaultCurrency%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDefaultCurrency()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      for (String _key : getName().keySet()) {
        try {
          joiner.add(String.format("%sname%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getName().get(_key), URLEncoder.encode(String.valueOf(getName().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    // add `minimalNumberOfPeriods` to the URL query string
    if (getMinimalNumberOfPeriods() != null) {
      try {
        joiner.add(String.format("%sminimalNumberOfPeriods%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getMinimalNumberOfPeriods()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `obsoletedOn` to the URL query string
    if (getObsoletedOn() != null) {
      try {
        joiner.add(String.format("%sobsoletedOn%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getObsoletedOn()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `billingCycleModel` to the URL query string
    if (getBillingCycleModel() != null) {
      joiner.add(getBillingCycleModel().toUrlQueryString(prefix + "billingCycleModel" + suffix));
    }

    // add `comment` to the URL query string
    if (getComment() != null) {
      try {
        joiner.add(String.format("%scomment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getComment()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `incrementNumber` to the URL query string
    if (getIncrementNumber() != null) {
      try {
        joiner.add(String.format("%sincrementNumber%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIncrementNumber()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `numberOfNoticePeriods` to the URL query string
    if (getNumberOfNoticePeriods() != null) {
      try {
        joiner.add(String.format("%snumberOfNoticePeriods%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getNumberOfNoticePeriods()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

