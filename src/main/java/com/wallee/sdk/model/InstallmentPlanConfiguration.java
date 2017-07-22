/**
 * Wallee SDK Client
 *
 * This client allows to interact with the Wallee API.
 *
 * Wallee API: 1.0.0
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.wallee.sdk.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.DatabaseTranslatedString;
import com.wallee.sdk.model.ResourcePath;
import com.wallee.sdk.model.SpaceReference;
import com.wallee.sdk.model.TaxClass;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * The installment plan allows to setup a template for an installment.
 */
@io.swagger.annotations.ApiModel(description = "The installment plan allows to setup a template for an installment.")
public class InstallmentPlanConfiguration {
	@SerializedName("baseCurrency")
	private String baseCurrency = null;

	@SerializedName("conditions")
	private List<Long> conditions = new ArrayList<Long>();

	@SerializedName("id")
	private Long id = null;

	@SerializedName("installmentFee")
	private BigDecimal installmentFee = null;

	@SerializedName("interestRate")
	private BigDecimal interestRate = null;

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("minimalAmount")
	private BigDecimal minimalAmount = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("paymentMethodConfigurations")
	private List<Long> paymentMethodConfigurations = new ArrayList<Long>();

	@SerializedName("plannedPurgeDate")
	private DateTime plannedPurgeDate = null;

	@SerializedName("sortOrder")
	private Integer sortOrder = null;

	@SerializedName("spaceReference")
	private SpaceReference spaceReference = null;

	@SerializedName("state")
	private CreationEntityState state = null;

	@SerializedName("taxClass")
	private TaxClass taxClass = null;

	@SerializedName("termsAndConditions")
	private ResourcePath termsAndConditions = null;

	@SerializedName("title")
	private DatabaseTranslatedString title = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * The base currency in which the installment fee and minimal amount are defined.
	 *
	 * @return The base currency in which the installment fee and minimal amount are defined.
	 */
	@ApiModelProperty(example = "null", value = "The base currency in which the installment fee and minimal amount are defined.")
	public String getBaseCurrency() {
		return baseCurrency;
	}

	public InstallmentPlanConfiguration conditions(List<Long> conditions) {
		this.conditions = conditions;
		return this;
	}

	public InstallmentPlanConfiguration addConditionsItem(Long conditionsItem) {
		this.conditions.add(conditionsItem);
		return this;
	}

	/**
	 * If a transaction meets all selected conditions the installment plan will be available to the customer to be selected.
	 *
	 * @return If a transaction meets all selected conditions the installment plan will be available to the customer to be selected.
	 */
	@ApiModelProperty(example = "null", value = "If a transaction meets all selected conditions the installment plan will be available to the customer to be selected.")
	public List<Long> getConditions() {
		return conditions;
	}

	public void setConditions(List<Long> conditions) {
		this.conditions = conditions;
	}

	public InstallmentPlanConfiguration id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 *
	 * @return The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 */
	@ApiModelProperty(example = "null", value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * The installment fee is a fixed amount that is charged additionally when applying this installment plan.
	 *
	 * @return The installment fee is a fixed amount that is charged additionally when applying this installment plan.
	 */
	@ApiModelProperty(example = "null", value = "The installment fee is a fixed amount that is charged additionally when applying this installment plan.")
	public BigDecimal getInstallmentFee() {
		return installmentFee;
	}

	/**
	 * The interest rate is a percentage of the total amount that is charged additionally when applying this installment plan.
	 *
	 * @return The interest rate is a percentage of the total amount that is charged additionally when applying this installment plan.
	 */
	@ApiModelProperty(example = "null", value = "The interest rate is a percentage of the total amount that is charged additionally when applying this installment plan.")
	public BigDecimal getInterestRate() {
		return interestRate;
	}

	/**
	 * The linked space id holds the ID of the space to which the entity belongs to.
	 *
	 * @return The linked space id holds the ID of the space to which the entity belongs to.
	 */
	@ApiModelProperty(example = "null", value = "The linked space id holds the ID of the space to which the entity belongs to.")
	public Long getLinkedSpaceId() {
		return linkedSpaceId;
	}

	/**
	 * The installment plan can only be applied if the orders total is at least the defined minimal amount.
	 *
	 * @return The installment plan can only be applied if the orders total is at least the defined minimal amount.
	 */
	@ApiModelProperty(example = "null", value = "The installment plan can only be applied if the orders total is at least the defined minimal amount.")
	public BigDecimal getMinimalAmount() {
		return minimalAmount;
	}

	/**
	 * The installment plan name is used internally to identify the plan in administrative interfaces.For example it is used within search fields and hence it should be distinct and descriptive.
	 *
	 * @return The installment plan name is used internally to identify the plan in administrative interfaces.For example it is used within search fields and hence it should be distinct and descriptive.
	 */
	@ApiModelProperty(example = "null", value = "The installment plan name is used internally to identify the plan in administrative interfaces.For example it is used within search fields and hence it should be distinct and descriptive.")
	public String getName() {
		return name;
	}

	public InstallmentPlanConfiguration paymentMethodConfigurations(List<Long> paymentMethodConfigurations) {
		this.paymentMethodConfigurations = paymentMethodConfigurations;
		return this;
	}

	public InstallmentPlanConfiguration addPaymentMethodConfigurationsItem(Long paymentMethodConfigurationsItem) {
		this.paymentMethodConfigurations.add(paymentMethodConfigurationsItem);
		return this;
	}

	/**
	 * A installment plan can be enabled only for specific payment method configurations. Other payment methods will not be selectable by the buyer.
	 *
	 * @return A installment plan can be enabled only for specific payment method configurations. Other payment methods will not be selectable by the buyer.
	 */
	@ApiModelProperty(example = "null", value = "A installment plan can be enabled only for specific payment method configurations. Other payment methods will not be selectable by the buyer.")
	public List<Long> getPaymentMethodConfigurations() {
		return paymentMethodConfigurations;
	}

	public void setPaymentMethodConfigurations(List<Long> paymentMethodConfigurations) {
		this.paymentMethodConfigurations = paymentMethodConfigurations;
	}

	/**
	 * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 *
	 * @return The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 */
	@ApiModelProperty(example = "null", value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
	public DateTime getPlannedPurgeDate() {
		return plannedPurgeDate;
	}

	/**
	 * The sort order controls in which order the installation plans are listed. The sort order is used to order the plans in ascending order.
	 *
	 * @return The sort order controls in which order the installation plans are listed. The sort order is used to order the plans in ascending order.
	 */
	@ApiModelProperty(example = "null", value = "The sort order controls in which order the installation plans are listed. The sort order is used to order the plans in ascending order.")
	public Integer getSortOrder() {
		return sortOrder;
	}

	public InstallmentPlanConfiguration spaceReference(SpaceReference spaceReference) {
		this.spaceReference = spaceReference;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public SpaceReference getSpaceReference() {
		return spaceReference;
	}

	public void setSpaceReference(SpaceReference spaceReference) {
		this.spaceReference = spaceReference;
	}

	public InstallmentPlanConfiguration state(CreationEntityState state) {
		this.state = state;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public CreationEntityState getState() {
		return state;
	}

	public void setState(CreationEntityState state) {
		this.state = state;
	}

	public InstallmentPlanConfiguration taxClass(TaxClass taxClass) {
		this.taxClass = taxClass;
		return this;
	}

	/**
	 * The tax class determines the taxes which are applicable on all fees linked to the installment plan.
	 *
	 * @return The tax class determines the taxes which are applicable on all fees linked to the installment plan.
	 */
	@ApiModelProperty(example = "null", value = "The tax class determines the taxes which are applicable on all fees linked to the installment plan.")
	public TaxClass getTaxClass() {
		return taxClass;
	}

	public void setTaxClass(TaxClass taxClass) {
		this.taxClass = taxClass;
	}

	public InstallmentPlanConfiguration termsAndConditions(ResourcePath termsAndConditions) {
		this.termsAndConditions = termsAndConditions;
		return this;
	}

	/**
	 * The terms and conditions will be displayed to the customer when he or she selects this installment plan.
	 *
	 * @return The terms and conditions will be displayed to the customer when he or she selects this installment plan.
	 */
	@ApiModelProperty(example = "null", value = "The terms and conditions will be displayed to the customer when he or she selects this installment plan.")
	public ResourcePath getTermsAndConditions() {
		return termsAndConditions;
	}

	public void setTermsAndConditions(ResourcePath termsAndConditions) {
		this.termsAndConditions = termsAndConditions;
	}

	public InstallmentPlanConfiguration title(DatabaseTranslatedString title) {
		this.title = title;
		return this;
	}

	/**
	 * The title of the installment plan is used within the payment process. The title is visible to the buyer.
	 *
	 * @return The title of the installment plan is used within the payment process. The title is visible to the buyer.
	 */
	@ApiModelProperty(example = "null", value = "The title of the installment plan is used within the payment process. The title is visible to the buyer.")
	public DatabaseTranslatedString getTitle() {
		return title;
	}

	public void setTitle(DatabaseTranslatedString title) {
		this.title = title;
	}

	public InstallmentPlanConfiguration version(Integer version) {
		this.version = version;
		return this;
	}

	/**
	 * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 *
	 * @return The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 */
	@ApiModelProperty(example = "null", value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
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
				Objects.equals(this.spaceReference, installmentPlanConfiguration.spaceReference) &&
				Objects.equals(this.state, installmentPlanConfiguration.state) &&
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
		
		sb.append("		baseCurrency: ").append(toIndentedString(baseCurrency)).append("\n");
		sb.append("		conditions: ").append(toIndentedString(conditions)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		installmentFee: ").append(toIndentedString(installmentFee)).append("\n");
		sb.append("		interestRate: ").append(toIndentedString(interestRate)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		minimalAmount: ").append(toIndentedString(minimalAmount)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		paymentMethodConfigurations: ").append(toIndentedString(paymentMethodConfigurations)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
		sb.append("		spaceReference: ").append(toIndentedString(spaceReference)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("		taxClass: ").append(toIndentedString(taxClass)).append("\n");
		sb.append("		termsAndConditions: ").append(toIndentedString(termsAndConditions)).append("\n");
		sb.append("		title: ").append(toIndentedString(title)).append("\n");
		sb.append("		version: ").append(toIndentedString(version)).append("\n");
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
		return o.toString().replace("\n", "\n		");
	}

}

