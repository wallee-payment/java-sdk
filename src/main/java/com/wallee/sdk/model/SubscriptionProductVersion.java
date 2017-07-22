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
import com.wallee.sdk.model.DatabaseTranslatedString;
import com.wallee.sdk.model.SubscriptionProduct;
import com.wallee.sdk.model.SubscriptionProductVersionState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class SubscriptionProductVersion {
	@SerializedName("activatedOn")
	private DateTime activatedOn = null;

	@SerializedName("billingCycle")
	private String billingCycle = null;

	@SerializedName("comment")
	private String comment = null;

	@SerializedName("createdOn")
	private DateTime createdOn = null;

	@SerializedName("defaultCurrency")
	private String defaultCurrency = null;

	@SerializedName("enabledCurrencies")
	private List<String> enabledCurrencies = new ArrayList<String>();

	@SerializedName("id")
	private Long id = null;

	@SerializedName("incrementNumber")
	private Integer incrementNumber = null;

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("minimalNumberOfPeriods")
	private Integer minimalNumberOfPeriods = null;

	@SerializedName("name")
	private DatabaseTranslatedString name = null;

	@SerializedName("numberOfNoticePeriods")
	private Integer numberOfNoticePeriods = null;

	@SerializedName("obsoletedOn")
	private DateTime obsoletedOn = null;

	@SerializedName("plannedPurgeDate")
	private DateTime plannedPurgeDate = null;

	@SerializedName("product")
	private SubscriptionProduct product = null;

	@SerializedName("reference")
	private String reference = null;

	@SerializedName("retiringFinishedOn")
	private DateTime retiringFinishedOn = null;

	@SerializedName("retiringStartedOn")
	private DateTime retiringStartedOn = null;

	@SerializedName("state")
	private SubscriptionProductVersionState state = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getActivatedOn() {
		return activatedOn;
	}

	/**
	 * The billing cycle determines the rhythm with which the subscriber is billed. The charging may have different rhythm.
	 *
	 * @return The billing cycle determines the rhythm with which the subscriber is billed. The charging may have different rhythm.
	 */
	@ApiModelProperty(example = "null", value = "The billing cycle determines the rhythm with which the subscriber is billed. The charging may have different rhythm.")
	public String getBillingCycle() {
		return billingCycle;
	}

	/**
	 * The comment allows to provide a internal comment for the version. It helps to document why a product was changed. The comment is not disclosed to the subscriber.
	 *
	 * @return The comment allows to provide a internal comment for the version. It helps to document why a product was changed. The comment is not disclosed to the subscriber.
	 */
	@ApiModelProperty(example = "null", value = "The comment allows to provide a internal comment for the version. It helps to document why a product was changed. The comment is not disclosed to the subscriber.")
	public String getComment() {
		return comment;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getCreatedOn() {
		return createdOn;
	}

	/**
	 * The default currency has to be used in all fees.
	 *
	 * @return The default currency has to be used in all fees.
	 */
	@ApiModelProperty(example = "null", value = "The default currency has to be used in all fees.")
	public String getDefaultCurrency() {
		return defaultCurrency;
	}

	public SubscriptionProductVersion enabledCurrencies(List<String> enabledCurrencies) {
		this.enabledCurrencies = enabledCurrencies;
		return this;
	}

	public SubscriptionProductVersion addEnabledCurrenciesItem(String enabledCurrenciesItem) {
		this.enabledCurrencies.add(enabledCurrenciesItem);
		return this;
	}

	/**
	 * The currencies which are enabled can be selected to define component fees. Currencies which are not enabled cannot be used to define fees.
	 *
	 * @return The currencies which are enabled can be selected to define component fees. Currencies which are not enabled cannot be used to define fees.
	 */
	@ApiModelProperty(example = "null", value = "The currencies which are enabled can be selected to define component fees. Currencies which are not enabled cannot be used to define fees.")
	public List<String> getEnabledCurrencies() {
		return enabledCurrencies;
	}

	public void setEnabledCurrencies(List<String> enabledCurrencies) {
		this.enabledCurrencies = enabledCurrencies;
	}

	public SubscriptionProductVersion id(Long id) {
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
	 * The increment number represents the version number incremented whenever a new version is activated.
	 *
	 * @return The increment number represents the version number incremented whenever a new version is activated.
	 */
	@ApiModelProperty(example = "null", value = "The increment number represents the version number incremented whenever a new version is activated.")
	public Integer getIncrementNumber() {
		return incrementNumber;
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
	 * The minimal number of periods determines how long the subscription has to run before the subscription can be terminated.
	 *
	 * @return The minimal number of periods determines how long the subscription has to run before the subscription can be terminated.
	 */
	@ApiModelProperty(example = "null", value = "The minimal number of periods determines how long the subscription has to run before the subscription can be terminated.")
	public Integer getMinimalNumberOfPeriods() {
		return minimalNumberOfPeriods;
	}

	public SubscriptionProductVersion name(DatabaseTranslatedString name) {
		this.name = name;
		return this;
	}

	/**
	 * The product version name is the name of the product which is shown to the user for the version. When the visible product name should be changed for a particular product a new version has to be created which contains the new name of the product.
	 *
	 * @return The product version name is the name of the product which is shown to the user for the version. When the visible product name should be changed for a particular product a new version has to be created which contains the new name of the product.
	 */
	@ApiModelProperty(example = "null", value = "The product version name is the name of the product which is shown to the user for the version. When the visible product name should be changed for a particular product a new version has to be created which contains the new name of the product.")
	public DatabaseTranslatedString getName() {
		return name;
	}

	public void setName(DatabaseTranslatedString name) {
		this.name = name;
	}

	/**
	 * The number of notice periods determines the number of periods which need to be paid between the request to terminate the subscription and the final period.
	 *
	 * @return The number of notice periods determines the number of periods which need to be paid between the request to terminate the subscription and the final period.
	 */
	@ApiModelProperty(example = "null", value = "The number of notice periods determines the number of periods which need to be paid between the request to terminate the subscription and the final period.")
	public Integer getNumberOfNoticePeriods() {
		return numberOfNoticePeriods;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getObsoletedOn() {
		return obsoletedOn;
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

	public SubscriptionProductVersion product(SubscriptionProduct product) {
		this.product = product;
		return this;
	}

	/**
	 * Each product version is linked to a product.
	 *
	 * @return Each product version is linked to a product.
	 */
	@ApiModelProperty(example = "null", value = "Each product version is linked to a product.")
	public SubscriptionProduct getProduct() {
		return product;
	}

	public void setProduct(SubscriptionProduct product) {
		this.product = product;
	}

	/**
	 * The product version reference helps to identify the version. The reference is generated out of the product reference.
	 *
	 * @return The product version reference helps to identify the version. The reference is generated out of the product reference.
	 */
	@ApiModelProperty(example = "null", value = "The product version reference helps to identify the version. The reference is generated out of the product reference.")
	public String getReference() {
		return reference;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getRetiringFinishedOn() {
		return retiringFinishedOn;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getRetiringStartedOn() {
		return retiringStartedOn;
	}

	public SubscriptionProductVersion state(SubscriptionProductVersionState state) {
		this.state = state;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public SubscriptionProductVersionState getState() {
		return state;
	}

	public void setState(SubscriptionProductVersionState state) {
		this.state = state;
	}

	public SubscriptionProductVersion version(Integer version) {
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
		SubscriptionProductVersion subscriptionProductVersion = (SubscriptionProductVersion) o;
		return Objects.equals(this.activatedOn, subscriptionProductVersion.activatedOn) &&
				Objects.equals(this.billingCycle, subscriptionProductVersion.billingCycle) &&
				Objects.equals(this.comment, subscriptionProductVersion.comment) &&
				Objects.equals(this.createdOn, subscriptionProductVersion.createdOn) &&
				Objects.equals(this.defaultCurrency, subscriptionProductVersion.defaultCurrency) &&
				Objects.equals(this.enabledCurrencies, subscriptionProductVersion.enabledCurrencies) &&
				Objects.equals(this.id, subscriptionProductVersion.id) &&
				Objects.equals(this.incrementNumber, subscriptionProductVersion.incrementNumber) &&
				Objects.equals(this.linkedSpaceId, subscriptionProductVersion.linkedSpaceId) &&
				Objects.equals(this.minimalNumberOfPeriods, subscriptionProductVersion.minimalNumberOfPeriods) &&
				Objects.equals(this.name, subscriptionProductVersion.name) &&
				Objects.equals(this.numberOfNoticePeriods, subscriptionProductVersion.numberOfNoticePeriods) &&
				Objects.equals(this.obsoletedOn, subscriptionProductVersion.obsoletedOn) &&
				Objects.equals(this.plannedPurgeDate, subscriptionProductVersion.plannedPurgeDate) &&
				Objects.equals(this.product, subscriptionProductVersion.product) &&
				Objects.equals(this.reference, subscriptionProductVersion.reference) &&
				Objects.equals(this.retiringFinishedOn, subscriptionProductVersion.retiringFinishedOn) &&
				Objects.equals(this.retiringStartedOn, subscriptionProductVersion.retiringStartedOn) &&
				Objects.equals(this.state, subscriptionProductVersion.state) &&
				Objects.equals(this.version, subscriptionProductVersion.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(activatedOn, billingCycle, comment, createdOn, defaultCurrency, enabledCurrencies, id, incrementNumber, linkedSpaceId, minimalNumberOfPeriods, name, numberOfNoticePeriods, obsoletedOn, plannedPurgeDate, product, reference, retiringFinishedOn, retiringStartedOn, state, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SubscriptionProductVersion {\n");
		
		sb.append("		activatedOn: ").append(toIndentedString(activatedOn)).append("\n");
		sb.append("		billingCycle: ").append(toIndentedString(billingCycle)).append("\n");
		sb.append("		comment: ").append(toIndentedString(comment)).append("\n");
		sb.append("		createdOn: ").append(toIndentedString(createdOn)).append("\n");
		sb.append("		defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
		sb.append("		enabledCurrencies: ").append(toIndentedString(enabledCurrencies)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		incrementNumber: ").append(toIndentedString(incrementNumber)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		minimalNumberOfPeriods: ").append(toIndentedString(minimalNumberOfPeriods)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		numberOfNoticePeriods: ").append(toIndentedString(numberOfNoticePeriods)).append("\n");
		sb.append("		obsoletedOn: ").append(toIndentedString(obsoletedOn)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		product: ").append(toIndentedString(product)).append("\n");
		sb.append("		reference: ").append(toIndentedString(reference)).append("\n");
		sb.append("		retiringFinishedOn: ").append(toIndentedString(retiringFinishedOn)).append("\n");
		sb.append("		retiringStartedOn: ").append(toIndentedString(retiringStartedOn)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
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

