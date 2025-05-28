/**
* wallee SDK
*
* This library allows to interact with the wallee payment service.
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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wallee.sdk.model.AbstractDebtCollectionCaseUpdate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * The debt collection case represents a try to collect the money from the debtor.
 */
@ApiModel(description = "The debt collection case represents a try to collect the money from the debtor.")

public class DebtCollectionCaseCreate extends AbstractDebtCollectionCaseUpdate {
  
  @JsonProperty("collectorConfiguration")
  protected Long collectorConfiguration = null;

  
  @JsonProperty("externalId")
  protected String externalId = null;

  
  @JsonProperty("reference")
  protected String reference = null;

  
  
  public DebtCollectionCaseCreate collectorConfiguration(Long collectorConfiguration) {
    this.collectorConfiguration = collectorConfiguration;
    return this;
  }

   /**
   * The configuration that the case is processed with.
   * @return collectorConfiguration
  **/
  @ApiModelProperty(value = "The configuration that the case is processed with.")
  public Long getCollectorConfiguration() {
    return collectorConfiguration;
  }

  public void setCollectorConfiguration(Long collectorConfiguration) {
    this.collectorConfiguration = collectorConfiguration;
  }

  
  public DebtCollectionCaseCreate externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.
   * @return externalId
  **/
  @ApiModelProperty(required = true, value = "A client-generated nonce which uniquely identifies some action to be executed. Subsequent requests with the same external ID do not execute the action again, but return the original result.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  
  public DebtCollectionCaseCreate reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * A unique reference to identify the debt collection case in communication with the debtor.
   * @return reference
  **/
  @ApiModelProperty(required = true, value = "A unique reference to identify the debt collection case in communication with the debtor.")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebtCollectionCaseCreate debtCollectionCaseCreate = (DebtCollectionCaseCreate) o;
    return Objects.equals(this.billingAddress, debtCollectionCaseCreate.billingAddress) &&
        Objects.equals(this.contractDate, debtCollectionCaseCreate.contractDate) &&
        Objects.equals(this.currency, debtCollectionCaseCreate.currency) &&
        Objects.equals(this.dueDate, debtCollectionCaseCreate.dueDate) &&
        Objects.equals(this.environment, debtCollectionCaseCreate.environment) &&
        Objects.equals(this.language, debtCollectionCaseCreate.language) &&
        Objects.equals(this.lineItems, debtCollectionCaseCreate.lineItems) &&
        Objects.equals(this.spaceViewId, debtCollectionCaseCreate.spaceViewId) &&
        Objects.equals(this.collectorConfiguration, debtCollectionCaseCreate.collectorConfiguration) &&
        Objects.equals(this.externalId, debtCollectionCaseCreate.externalId) &&
        Objects.equals(this.reference, debtCollectionCaseCreate.reference) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, contractDate, currency, dueDate, environment, language, lineItems, spaceViewId, collectorConfiguration, externalId, reference, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebtCollectionCaseCreate {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    contractDate: ").append(toIndentedString(contractDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
    sb.append("    collectorConfiguration: ").append(toIndentedString(collectorConfiguration)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

