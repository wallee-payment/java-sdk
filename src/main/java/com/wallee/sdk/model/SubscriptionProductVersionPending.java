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
import com.wallee.sdk.model.DatabaseTranslatedStringCreate;
import com.wallee.sdk.model.SubscriptionProductVersionState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class SubscriptionProductVersionPending {
	@SerializedName("id")
	private Long id = null;

	@SerializedName("version")
	private Long version = null;

	@SerializedName("billingCycle")
	private String billingCycle = null;

	@SerializedName("comment")
	private String comment = null;

	@SerializedName("defaultCurrency")
	private String defaultCurrency = null;

	@SerializedName("enabledCurrencies")
	private List<String> enabledCurrencies = new ArrayList<String>();

	@SerializedName("minimalNumberOfPeriods")
	private Integer minimalNumberOfPeriods = null;

	@SerializedName("name")
	private DatabaseTranslatedStringCreate name = null;

	@SerializedName("numberOfNoticePeriods")
	private Integer numberOfNoticePeriods = null;

	@SerializedName("product")
	private Long product = null;

	@SerializedName("state")
	private SubscriptionProductVersionState state = null;

	public SubscriptionProductVersionPending id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 *
	 * @return The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 */
	@ApiModelProperty(example = "null", required = true, value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SubscriptionProductVersionPending version(Long version) {
		this.version = version;
		return this;
	}

	/**
	 * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 *
	 * @return The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 */
	@ApiModelProperty(example = "null", required = true, value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public SubscriptionProductVersionPending billingCycle(String billingCycle) {
		this.billingCycle = billingCycle;
		return this;
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

	public void setBillingCycle(String billingCycle) {
		this.billingCycle = billingCycle;
	}

	public SubscriptionProductVersionPending comment(String comment) {
		this.comment = comment;
		return this;
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

	public void setComment(String comment) {
		this.comment = comment;
	}

	public SubscriptionProductVersionPending defaultCurrency(String defaultCurrency) {
		this.defaultCurrency = defaultCurrency;
		return this;
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

	public void setDefaultCurrency(String defaultCurrency) {
		this.defaultCurrency = defaultCurrency;
	}

	public SubscriptionProductVersionPending enabledCurrencies(List<String> enabledCurrencies) {
		this.enabledCurrencies = enabledCurrencies;
		return this;
	}

	public SubscriptionProductVersionPending addEnabledCurrenciesItem(String enabledCurrenciesItem) {
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

	public SubscriptionProductVersionPending minimalNumberOfPeriods(Integer minimalNumberOfPeriods) {
		this.minimalNumberOfPeriods = minimalNumberOfPeriods;
		return this;
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

	public void setMinimalNumberOfPeriods(Integer minimalNumberOfPeriods) {
		this.minimalNumberOfPeriods = minimalNumberOfPeriods;
	}

	public SubscriptionProductVersionPending name(DatabaseTranslatedStringCreate name) {
		this.name = name;
		return this;
	}

	/**
	 * The product version name is the name of the product which is shown to the user for the version. When the visible product name should be changed for a particular product a new version has to be created which contains the new name of the product.
	 *
	 * @return The product version name is the name of the product which is shown to the user for the version. When the visible product name should be changed for a particular product a new version has to be created which contains the new name of the product.
	 */
	@ApiModelProperty(example = "null", value = "The product version name is the name of the product which is shown to the user for the version. When the visible product name should be changed for a particular product a new version has to be created which contains the new name of the product.")
	public DatabaseTranslatedStringCreate getName() {
		return name;
	}

	public void setName(DatabaseTranslatedStringCreate name) {
		this.name = name;
	}

	public SubscriptionProductVersionPending numberOfNoticePeriods(Integer numberOfNoticePeriods) {
		this.numberOfNoticePeriods = numberOfNoticePeriods;
		return this;
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

	public void setNumberOfNoticePeriods(Integer numberOfNoticePeriods) {
		this.numberOfNoticePeriods = numberOfNoticePeriods;
	}

	public SubscriptionProductVersionPending product(Long product) {
		this.product = product;
		return this;
	}

	/**
	 * Each product version is linked to a product.
	 *
	 * @return Each product version is linked to a product.
	 */
	@ApiModelProperty(example = "null", value = "Each product version is linked to a product.")
	public Long getProduct() {
		return product;
	}

	public void setProduct(Long product) {
		this.product = product;
	}

	public SubscriptionProductVersionPending state(SubscriptionProductVersionState state) {
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


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SubscriptionProductVersionPending subscriptionProductVersionPending = (SubscriptionProductVersionPending) o;
		return Objects.equals(this.id, subscriptionProductVersionPending.id) &&
				Objects.equals(this.version, subscriptionProductVersionPending.version) &&
				Objects.equals(this.billingCycle, subscriptionProductVersionPending.billingCycle) &&
				Objects.equals(this.comment, subscriptionProductVersionPending.comment) &&
				Objects.equals(this.defaultCurrency, subscriptionProductVersionPending.defaultCurrency) &&
				Objects.equals(this.enabledCurrencies, subscriptionProductVersionPending.enabledCurrencies) &&
				Objects.equals(this.minimalNumberOfPeriods, subscriptionProductVersionPending.minimalNumberOfPeriods) &&
				Objects.equals(this.name, subscriptionProductVersionPending.name) &&
				Objects.equals(this.numberOfNoticePeriods, subscriptionProductVersionPending.numberOfNoticePeriods) &&
				Objects.equals(this.product, subscriptionProductVersionPending.product) &&
				Objects.equals(this.state, subscriptionProductVersionPending.state);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, version, billingCycle, comment, defaultCurrency, enabledCurrencies, minimalNumberOfPeriods, name, numberOfNoticePeriods, product, state);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SubscriptionProductVersionPending {\n");
		
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		version: ").append(toIndentedString(version)).append("\n");
		sb.append("		billingCycle: ").append(toIndentedString(billingCycle)).append("\n");
		sb.append("		comment: ").append(toIndentedString(comment)).append("\n");
		sb.append("		defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
		sb.append("		enabledCurrencies: ").append(toIndentedString(enabledCurrencies)).append("\n");
		sb.append("		minimalNumberOfPeriods: ").append(toIndentedString(minimalNumberOfPeriods)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		numberOfNoticePeriods: ").append(toIndentedString(numberOfNoticePeriods)).append("\n");
		sb.append("		product: ").append(toIndentedString(product)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
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

