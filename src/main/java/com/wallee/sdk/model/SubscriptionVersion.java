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
import com.wallee.sdk.model.Subscription;
import com.wallee.sdk.model.SubscriptionProductComponent;
import com.wallee.sdk.model.SubscriptionProductVersion;
import com.wallee.sdk.model.SubscriptionVersionState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class SubscriptionVersion {
	@SerializedName("activatedOn")
	private DateTime activatedOn = null;

	@SerializedName("billingCurrency")
	private String billingCurrency = null;

	@SerializedName("createdOn")
	private DateTime createdOn = null;

	@SerializedName("expectedLastPeriodEnd")
	private DateTime expectedLastPeriodEnd = null;

	@SerializedName("failedOn")
	private DateTime failedOn = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("language")
	private String language = null;

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("plannedPurgeDate")
	private DateTime plannedPurgeDate = null;

	@SerializedName("plannedTerminationDate")
	private DateTime plannedTerminationDate = null;

	@SerializedName("productVersion")
	private SubscriptionProductVersion productVersion = null;

	@SerializedName("selectedComponents")
	private List<SubscriptionProductComponent> selectedComponents = new ArrayList<SubscriptionProductComponent>();

	@SerializedName("state")
	private SubscriptionVersionState state = null;

	@SerializedName("subscription")
	private Subscription subscription = null;

	@SerializedName("terminatedOn")
	private DateTime terminatedOn = null;

	@SerializedName("terminatingOn")
	private DateTime terminatingOn = null;

	@SerializedName("terminationIssuedOn")
	private DateTime terminationIssuedOn = null;

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
	 * The subscriber is charged in the billing currency. The billing currency has to be one of the enabled currencies on the subscription product.
	 *
	 * @return The subscriber is charged in the billing currency. The billing currency has to be one of the enabled currencies on the subscription product.
	 */
	@ApiModelProperty(example = "null", value = "The subscriber is charged in the billing currency. The billing currency has to be one of the enabled currencies on the subscription product.")
	public String getBillingCurrency() {
		return billingCurrency;
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
	 * The expected last period end is the date on which the projected end date of the last period is. This is only a projection and as such the actual date may be different.
	 *
	 * @return The expected last period end is the date on which the projected end date of the last period is. This is only a projection and as such the actual date may be different.
	 */
	@ApiModelProperty(example = "null", value = "The expected last period end is the date on which the projected end date of the last period is. This is only a projection and as such the actual date may be different.")
	public DateTime getExpectedLastPeriodEnd() {
		return expectedLastPeriodEnd;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getFailedOn() {
		return failedOn;
	}

	public SubscriptionVersion id(Long id) {
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
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getLanguage() {
		return language;
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
	 * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 *
	 * @return The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 */
	@ApiModelProperty(example = "null", value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
	public DateTime getPlannedPurgeDate() {
		return plannedPurgeDate;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getPlannedTerminationDate() {
		return plannedTerminationDate;
	}

	public SubscriptionVersion productVersion(SubscriptionProductVersion productVersion) {
		this.productVersion = productVersion;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public SubscriptionProductVersion getProductVersion() {
		return productVersion;
	}

	public void setProductVersion(SubscriptionProductVersion productVersion) {
		this.productVersion = productVersion;
	}

	public SubscriptionVersion selectedComponents(List<SubscriptionProductComponent> selectedComponents) {
		this.selectedComponents = selectedComponents;
		return this;
	}

	public SubscriptionVersion addSelectedComponentsItem(SubscriptionProductComponent selectedComponentsItem) {
		this.selectedComponents.add(selectedComponentsItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public List<SubscriptionProductComponent> getSelectedComponents() {
		return selectedComponents;
	}

	public void setSelectedComponents(List<SubscriptionProductComponent> selectedComponents) {
		this.selectedComponents = selectedComponents;
	}

	public SubscriptionVersion state(SubscriptionVersionState state) {
		this.state = state;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public SubscriptionVersionState getState() {
		return state;
	}

	public void setState(SubscriptionVersionState state) {
		this.state = state;
	}

	public SubscriptionVersion subscription(Subscription subscription) {
		this.subscription = subscription;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getTerminatedOn() {
		return terminatedOn;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getTerminatingOn() {
		return terminatingOn;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getTerminationIssuedOn() {
		return terminationIssuedOn;
	}

	public SubscriptionVersion version(Integer version) {
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
		SubscriptionVersion subscriptionVersion = (SubscriptionVersion) o;
		return Objects.equals(this.activatedOn, subscriptionVersion.activatedOn) &&
				Objects.equals(this.billingCurrency, subscriptionVersion.billingCurrency) &&
				Objects.equals(this.createdOn, subscriptionVersion.createdOn) &&
				Objects.equals(this.expectedLastPeriodEnd, subscriptionVersion.expectedLastPeriodEnd) &&
				Objects.equals(this.failedOn, subscriptionVersion.failedOn) &&
				Objects.equals(this.id, subscriptionVersion.id) &&
				Objects.equals(this.language, subscriptionVersion.language) &&
				Objects.equals(this.linkedSpaceId, subscriptionVersion.linkedSpaceId) &&
				Objects.equals(this.plannedPurgeDate, subscriptionVersion.plannedPurgeDate) &&
				Objects.equals(this.plannedTerminationDate, subscriptionVersion.plannedTerminationDate) &&
				Objects.equals(this.productVersion, subscriptionVersion.productVersion) &&
				Objects.equals(this.selectedComponents, subscriptionVersion.selectedComponents) &&
				Objects.equals(this.state, subscriptionVersion.state) &&
				Objects.equals(this.subscription, subscriptionVersion.subscription) &&
				Objects.equals(this.terminatedOn, subscriptionVersion.terminatedOn) &&
				Objects.equals(this.terminatingOn, subscriptionVersion.terminatingOn) &&
				Objects.equals(this.terminationIssuedOn, subscriptionVersion.terminationIssuedOn) &&
				Objects.equals(this.version, subscriptionVersion.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(activatedOn, billingCurrency, createdOn, expectedLastPeriodEnd, failedOn, id, language, linkedSpaceId, plannedPurgeDate, plannedTerminationDate, productVersion, selectedComponents, state, subscription, terminatedOn, terminatingOn, terminationIssuedOn, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SubscriptionVersion {\n");
		
		sb.append("		activatedOn: ").append(toIndentedString(activatedOn)).append("\n");
		sb.append("		billingCurrency: ").append(toIndentedString(billingCurrency)).append("\n");
		sb.append("		createdOn: ").append(toIndentedString(createdOn)).append("\n");
		sb.append("		expectedLastPeriodEnd: ").append(toIndentedString(expectedLastPeriodEnd)).append("\n");
		sb.append("		failedOn: ").append(toIndentedString(failedOn)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		language: ").append(toIndentedString(language)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		plannedTerminationDate: ").append(toIndentedString(plannedTerminationDate)).append("\n");
		sb.append("		productVersion: ").append(toIndentedString(productVersion)).append("\n");
		sb.append("		selectedComponents: ").append(toIndentedString(selectedComponents)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("		subscription: ").append(toIndentedString(subscription)).append("\n");
		sb.append("		terminatedOn: ").append(toIndentedString(terminatedOn)).append("\n");
		sb.append("		terminatingOn: ").append(toIndentedString(terminatingOn)).append("\n");
		sb.append("		terminationIssuedOn: ").append(toIndentedString(terminationIssuedOn)).append("\n");
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

