/**
*  SDK
*
* This library allows to interact with the  payment service.
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

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The installment plan allows to setup a template for an installment.
 */
@ApiModel(description = "The installment plan allows to setup a template for an installment.")

public class InstallmentPlanConfiguration {
  
  @JsonProperty("baseCurrency")
  protected String baseCurrency = null;

  
  @JsonProperty("conditions")
  protected List<Long> conditions = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("installmentFee")
  protected BigDecimal installmentFee = null;

  
  @JsonProperty("interestRate")
  protected BigDecimal interestRate = null;

  
  @JsonProperty("linkedSpaceId")
  protected Long linkedSpaceId = null;

  
  @JsonProperty("minimalAmount")
  protected BigDecimal minimalAmount = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("paymentMethodConfigurations")
  protected List<Long> paymentMethodConfigurations = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("sortOrder")
  protected Integer sortOrder = null;

  
  @JsonProperty("spaceReference")
  protected SpaceReference spaceReference = null;

  
  @JsonProperty("state")
  protected CreationEntityState state = null;

  
  @JsonProperty("taxClass")
  protected TaxClass taxClass = null;

  
  @JsonProperty("termsAndConditions")
  protected ResourcePath termsAndConditions = null;

  
  @JsonProperty("title")
  protected DatabaseTranslatedString title = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * The base currency in which the installment fee and minimal amount are defined.
   * @return baseCurrency
  **/
  @ApiModelProperty(value = "The base currency in which the installment fee and minimal amount are defined.")
  public String getBaseCurrency() {
    return baseCurrency;
  }

  
   /**
   * If a transaction meets all selected conditions the installment plan will be available to the customer to be selected.
   * @return conditions
  **/
  @ApiModelProperty(value = "If a transaction meets all selected conditions the installment plan will be available to the customer to be selected.")
  public List<Long> getConditions() {
    return conditions;
  }

  
   /**
   * The ID is the primary key of the entity. The ID identifies the entity uniquely.
   * @return id
  **/
  @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
  public Long getId() {
    return id;
  }

  
   /**
   * The installment fee is a fixed amount that is charged additionally when applying this installment plan.
   * @return installmentFee
  **/
  @ApiModelProperty(value = "The installment fee is a fixed amount that is charged additionally when applying this installment plan.")
  public BigDecimal getInstallmentFee() {
    return installmentFee;
  }

  
   /**
   * The interest rate is a percentage of the total amount that is charged additionally when applying this installment plan.
   * @return interestRate
  **/
  @ApiModelProperty(value = "The interest rate is a percentage of the total amount that is charged additionally when applying this installment plan.")
  public BigDecimal getInterestRate() {
    return interestRate;
  }

  
   /**
   * The linked space id holds the ID of the space to which the entity belongs to.
   * @return linkedSpaceId
  **/
  @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
  public Long getLinkedSpaceId() {
    return linkedSpaceId;
  }

  
   /**
   * The installment plan can only be applied if the orders total is at least the defined minimal amount.
   * @return minimalAmount
  **/
  @ApiModelProperty(value = "The installment plan can only be applied if the orders total is at least the defined minimal amount.")
  public BigDecimal getMinimalAmount() {
    return minimalAmount;
  }

  
   /**
   * The installment plan name is used internally to identify the plan in administrative interfaces.For example it is used within search fields and hence it should be distinct and descriptive.
   * @return name
  **/
  @ApiModelProperty(value = "The installment plan name is used internally to identify the plan in administrative interfaces.For example it is used within search fields and hence it should be distinct and descriptive.")
  public String getName() {
    return name;
  }

  
   /**
   * A installment plan can be enabled only for specific payment method configurations. Other payment methods will not be selectable by the buyer.
   * @return paymentMethodConfigurations
  **/
  @ApiModelProperty(value = "A installment plan can be enabled only for specific payment method configurations. Other payment methods will not be selectable by the buyer.")
  public List<Long> getPaymentMethodConfigurations() {
    return paymentMethodConfigurations;
  }

  
   /**
   * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * The sort order controls in which order the installation plans are listed. The sort order is used to order the plans in ascending order.
   * @return sortOrder
  **/
  @ApiModelProperty(value = "The sort order controls in which order the installation plans are listed. The sort order is used to order the plans in ascending order.")
  public Integer getSortOrder() {
    return sortOrder;
  }

  
   /**
   * 
   * @return spaceReference
  **/
  @ApiModelProperty(value = "")
  public SpaceReference getSpaceReference() {
    return spaceReference;
  }

  
   /**
   * 
   * @return state
  **/
  @ApiModelProperty(value = "")
  public CreationEntityState getState() {
    return state;
  }

  
   /**
   * The tax class determines the taxes which are applicable on all fees linked to the installment plan.
   * @return taxClass
  **/
  @ApiModelProperty(value = "The tax class determines the taxes which are applicable on all fees linked to the installment plan.")
  public TaxClass getTaxClass() {
    return taxClass;
  }

  
   /**
   * The terms and conditions will be displayed to the customer when he or she selects this installment plan.
   * @return termsAndConditions
  **/
  @ApiModelProperty(value = "The terms and conditions will be displayed to the customer when he or she selects this installment plan.")
  public ResourcePath getTermsAndConditions() {
    return termsAndConditions;
  }

  
   /**
   * The title of the installment plan is used within the payment process. The title is visible to the buyer.
   * @return title
  **/
  @ApiModelProperty(value = "The title of the installment plan is used within the payment process. The title is visible to the buyer.")
  public DatabaseTranslatedString getTitle() {
    return title;
  }

  
   /**
   * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
   * @return version
  **/
  @ApiModelProperty(value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
  public Integer getVersion() {
    return version;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallmentPlanConfiguration installmentPlanConfiguration = (InstallmentPlanConfiguration) o;
    return Objects.equals(this.baseCurrency, installmentPlanConfiguration.baseCurrency) &&
        Objects.equals(this.conditions, installmentPlanConfiguration.conditions) &&
        Objects.equals(this.id, installmentPlanConfiguration.id) &&
        Objects.equals(this.installmentFee, installmentPlanConfiguration.installmentFee) &&
        Objects.equals(this.interestRate, installmentPlanConfiguration.interestRate) &&
        Objects.equals(this.linkedSpaceId, installmentPlanConfiguration.linkedSpaceId) &&
        Objects.equals(this.minimalAmount, installmentPlanConfiguration.minimalAmount) &&
        Objects.equals(this.name, installmentPlanConfiguration.name) &&
        Objects.equals(this.paymentMethodConfigurations, installmentPlanConfiguration.paymentMethodConfigurations) &&
        Objects.equals(this.plannedPurgeDate, installmentPlanConfiguration.plannedPurgeDate) &&
        Objects.equals(this.sortOrder, installmentPlanConfiguration.sortOrder) &&
        Objects.equals(this.spaceReference, installmentPlanConfiguration.spaceReference) && this.state
      == installmentPlanConfiguration.state &&
        Objects.equals(this.taxClass, installmentPlanConfiguration.taxClass) &&
        Objects.equals(this.termsAndConditions, installmentPlanConfiguration.termsAndConditions) &&
        Objects.equals(this.title, installmentPlanConfiguration.title) &&
        Objects.equals(this.version, installmentPlanConfiguration.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseCurrency, conditions, id, installmentFee, interestRate, linkedSpaceId, minimalAmount, name, paymentMethodConfigurations, plannedPurgeDate, sortOrder, spaceReference, state, taxClass, termsAndConditions, title, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallmentPlanConfiguration {\n");
    
    sb.append("    baseCurrency: ").append(toIndentedString(baseCurrency)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    installmentFee: ").append(toIndentedString(installmentFee)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
    sb.append("    minimalAmount: ").append(toIndentedString(minimalAmount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paymentMethodConfigurations: ").append(toIndentedString(paymentMethodConfigurations)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    spaceReference: ").append(toIndentedString(spaceReference)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    taxClass: ").append(toIndentedString(taxClass)).append("\n");
    sb.append("    termsAndConditions: ").append(toIndentedString(termsAndConditions)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

