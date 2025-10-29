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
import com.wallee.sdk.model.AddressCreate;
import com.wallee.sdk.model.DebtCollectionEnvironment;
import com.wallee.sdk.model.LineItemCreate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * The debt collection case represents a try to collect the money from the debtor.
 */
@JsonPropertyOrder({
  DebtCollectionCaseCreate.JSON_PROPERTY_LINE_ITEMS,
  DebtCollectionCaseCreate.JSON_PROPERTY_CONTRACT_DATE,
  DebtCollectionCaseCreate.JSON_PROPERTY_ENVIRONMENT,
  DebtCollectionCaseCreate.JSON_PROPERTY_DUE_DATE,
  DebtCollectionCaseCreate.JSON_PROPERTY_CURRENCY,
  DebtCollectionCaseCreate.JSON_PROPERTY_LANGUAGE,
  DebtCollectionCaseCreate.JSON_PROPERTY_BILLING_ADDRESS,
  DebtCollectionCaseCreate.JSON_PROPERTY_SPACE_VIEW_ID,
  DebtCollectionCaseCreate.JSON_PROPERTY_REFERENCE,
  DebtCollectionCaseCreate.JSON_PROPERTY_EXTERNAL_ID,
  DebtCollectionCaseCreate.JSON_PROPERTY_COLLECTOR_CONFIGURATION
})
@JsonTypeName("DebtCollectionCase.Create")

public class DebtCollectionCaseCreate {
  public static final String JSON_PROPERTY_LINE_ITEMS = "lineItems";
  private List<LineItemCreate> lineItems = new ArrayList<>();

  public static final String JSON_PROPERTY_CONTRACT_DATE = "contractDate";
  private OffsetDateTime contractDate;

  public static final String JSON_PROPERTY_ENVIRONMENT = "environment";
  private DebtCollectionEnvironment environment;

  public static final String JSON_PROPERTY_DUE_DATE = "dueDate";
  private OffsetDateTime dueDate;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_BILLING_ADDRESS = "billingAddress";
  private AddressCreate billingAddress;

  public static final String JSON_PROPERTY_SPACE_VIEW_ID = "spaceViewId";
  private Long spaceViewId;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_COLLECTOR_CONFIGURATION = "collectorConfiguration";
  private Long collectorConfiguration;

  public DebtCollectionCaseCreate() {
  }

  public DebtCollectionCaseCreate lineItems(List<LineItemCreate> lineItems) {
    
    this.lineItems = lineItems;
    return this;
  }

  public DebtCollectionCaseCreate addLineItemsItem(LineItemCreate lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * The line items that are subject of this debt collection case.
   * @return lineItems
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LineItemCreate> getLineItems() {
    return lineItems;
  }


  @JsonProperty(JSON_PROPERTY_LINE_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineItems(List<LineItemCreate> lineItems) {
    this.lineItems = lineItems;
  }

  public DebtCollectionCaseCreate contractDate(OffsetDateTime contractDate) {
    
    this.contractDate = contractDate;
    return this;
  }

   /**
   * The date and time when the contract with the debtor was signed.
   * @return contractDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTRACT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getContractDate() {
    return contractDate;
  }


  @JsonProperty(JSON_PROPERTY_CONTRACT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContractDate(OffsetDateTime contractDate) {
    this.contractDate = contractDate;
  }

  public DebtCollectionCaseCreate environment(DebtCollectionEnvironment environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DebtCollectionEnvironment getEnvironment() {
    return environment;
  }


  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnvironment(DebtCollectionEnvironment environment) {
    this.environment = environment;
  }

  public DebtCollectionCaseCreate dueDate(OffsetDateTime dueDate) {
    
    this.dueDate = dueDate;
    return this;
  }

   /**
   * The date and time when the claim was due.
   * @return dueDate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDueDate() {
    return dueDate;
  }


  @JsonProperty(JSON_PROPERTY_DUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public DebtCollectionCaseCreate currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * The three-letter code (ISO 4217 format) of the case&#39;s currency.
   * @return currency
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public DebtCollectionCaseCreate language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * The language that is linked to the object.
   * @return language
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(String language) {
    this.language = language;
  }

  public DebtCollectionCaseCreate billingAddress(AddressCreate billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AddressCreate getBillingAddress() {
    return billingAddress;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingAddress(AddressCreate billingAddress) {
    this.billingAddress = billingAddress;
  }

  public DebtCollectionCaseCreate spaceViewId(Long spaceViewId) {
    
    this.spaceViewId = spaceViewId;
    return this;
  }

   /**
   * The ID of the space view this object is linked to.
   * @return spaceViewId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SPACE_VIEW_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSpaceViewId() {
    return spaceViewId;
  }


  @JsonProperty(JSON_PROPERTY_SPACE_VIEW_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpaceViewId(Long spaceViewId) {
    this.spaceViewId = spaceViewId;
  }

  public DebtCollectionCaseCreate reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * A unique reference to identify the debt collection case in communication with the debtor.
   * @return reference
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReference(String reference) {
    this.reference = reference;
  }

  public DebtCollectionCaseCreate externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.
   * @return externalId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExternalId() {
    return externalId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public DebtCollectionCaseCreate collectorConfiguration(Long collectorConfiguration) {
    
    this.collectorConfiguration = collectorConfiguration;
    return this;
  }

   /**
   * The configuration that the case is processed with.
   * @return collectorConfiguration
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLLECTOR_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCollectorConfiguration() {
    return collectorConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_COLLECTOR_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCollectorConfiguration(Long collectorConfiguration) {
    this.collectorConfiguration = collectorConfiguration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebtCollectionCaseCreate debtCollectionCaseCreate = (DebtCollectionCaseCreate) o;
    return Objects.equals(this.lineItems, debtCollectionCaseCreate.lineItems) &&
        Objects.equals(this.contractDate, debtCollectionCaseCreate.contractDate) &&
        Objects.equals(this.environment, debtCollectionCaseCreate.environment) &&
        Objects.equals(this.dueDate, debtCollectionCaseCreate.dueDate) &&
        Objects.equals(this.currency, debtCollectionCaseCreate.currency) &&
        Objects.equals(this.language, debtCollectionCaseCreate.language) &&
        Objects.equals(this.billingAddress, debtCollectionCaseCreate.billingAddress) &&
        Objects.equals(this.spaceViewId, debtCollectionCaseCreate.spaceViewId) &&
        Objects.equals(this.reference, debtCollectionCaseCreate.reference) &&
        Objects.equals(this.externalId, debtCollectionCaseCreate.externalId) &&
        Objects.equals(this.collectorConfiguration, debtCollectionCaseCreate.collectorConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineItems, contractDate, environment, dueDate, currency, language, billingAddress, spaceViewId, reference, externalId, collectorConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebtCollectionCaseCreate {\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    contractDate: ").append(toIndentedString(contractDate)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    collectorConfiguration: ").append(toIndentedString(collectorConfiguration)).append("\n");
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

    // add `lineItems` to the URL query string
    if (getLineItems() != null) {
      for (int i = 0; i < getLineItems().size(); i++) {
        if (getLineItems().get(i) != null) {
          joiner.add(getLineItems().get(i).toUrlQueryString(String.format("%slineItems%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `contractDate` to the URL query string
    if (getContractDate() != null) {
      try {
        joiner.add(String.format("%scontractDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getContractDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `environment` to the URL query string
    if (getEnvironment() != null) {
      try {
        joiner.add(String.format("%senvironment%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getEnvironment()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `dueDate` to the URL query string
    if (getDueDate() != null) {
      try {
        joiner.add(String.format("%sdueDate%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDueDate()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      try {
        joiner.add(String.format("%scurrency%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCurrency()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `billingAddress` to the URL query string
    if (getBillingAddress() != null) {
      joiner.add(getBillingAddress().toUrlQueryString(prefix + "billingAddress" + suffix));
    }

    // add `spaceViewId` to the URL query string
    if (getSpaceViewId() != null) {
      try {
        joiner.add(String.format("%sspaceViewId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSpaceViewId()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `collectorConfiguration` to the URL query string
    if (getCollectorConfiguration() != null) {
      try {
        joiner.add(String.format("%scollectorConfiguration%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCollectorConfiguration()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

