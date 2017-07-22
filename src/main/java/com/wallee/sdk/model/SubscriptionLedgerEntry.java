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
import com.wallee.sdk.model.SubscriptionLedgerEntryState;
import com.wallee.sdk.model.Tax;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * The subscription ledger entry represents a single change on the subscription balance.
 */
@io.swagger.annotations.ApiModel(description = "The subscription ledger entry represents a single change on the subscription balance.")
public class SubscriptionLedgerEntry {
	@SerializedName("aggregatedTaxRate")
	private BigDecimal aggregatedTaxRate = null;

	@SerializedName("amountExcludingTax")
	private BigDecimal amountExcludingTax = null;

	@SerializedName("amountIncludingTax")
	private BigDecimal amountIncludingTax = null;

	@SerializedName("createdBy")
	private Long createdBy = null;

	@SerializedName("createdOn")
	private DateTime createdOn = null;

	@SerializedName("externalId")
	private String externalId = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("plannedPurgeDate")
	private DateTime plannedPurgeDate = null;

	@SerializedName("quantity")
	private BigDecimal quantity = null;

	@SerializedName("state")
	private SubscriptionLedgerEntryState state = null;

	@SerializedName("subscriptionVersion")
	private Long subscriptionVersion = null;

	@SerializedName("taxAmount")
	private BigDecimal taxAmount = null;

	@SerializedName("taxes")
	private List<Tax> taxes = new ArrayList<Tax>();

	@SerializedName("title")
	private String title = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public BigDecimal getAggregatedTaxRate() {
		return aggregatedTaxRate;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public BigDecimal getAmountExcludingTax() {
		return amountExcludingTax;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public BigDecimal getAmountIncludingTax() {
		return amountIncludingTax;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Long getCreatedBy() {
		return createdBy;
	}

	/**
	 * The created on date indicates the date on which the entity was stored into the database.
	 *
	 * @return The created on date indicates the date on which the entity was stored into the database.
	 */
	@ApiModelProperty(example = "null", value = "The created on date indicates the date on which the entity was stored into the database.")
	public DateTime getCreatedOn() {
		return createdOn;
	}

	/**
	 * The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
	 *
	 * @return The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
	 */
	@ApiModelProperty(example = "null", value = "The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.")
	public String getExternalId() {
		return externalId;
	}

	public SubscriptionLedgerEntry id(Long id) {
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
	public BigDecimal getQuantity() {
		return quantity;
	}

	public SubscriptionLedgerEntry state(SubscriptionLedgerEntryState state) {
		this.state = state;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public SubscriptionLedgerEntryState getState() {
		return state;
	}

	public void setState(SubscriptionLedgerEntryState state) {
		this.state = state;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Long getSubscriptionVersion() {
		return subscriptionVersion;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public BigDecimal getTaxAmount() {
		return taxAmount;
	}

	public SubscriptionLedgerEntry taxes(List<Tax> taxes) {
		this.taxes = taxes;
		return this;
	}

	public SubscriptionLedgerEntry addTaxesItem(Tax taxesItem) {
		this.taxes.add(taxesItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public List<Tax> getTaxes() {
		return taxes;
	}

	public void setTaxes(List<Tax> taxes) {
		this.taxes = taxes;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getTitle() {
		return title;
	}

	public SubscriptionLedgerEntry version(Integer version) {
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
		SubscriptionLedgerEntry subscriptionLedgerEntry = (SubscriptionLedgerEntry) o;
		return Objects.equals(this.aggregatedTaxRate, subscriptionLedgerEntry.aggregatedTaxRate) &&
				Objects.equals(this.amountExcludingTax, subscriptionLedgerEntry.amountExcludingTax) &&
				Objects.equals(this.amountIncludingTax, subscriptionLedgerEntry.amountIncludingTax) &&
				Objects.equals(this.createdBy, subscriptionLedgerEntry.createdBy) &&
				Objects.equals(this.createdOn, subscriptionLedgerEntry.createdOn) &&
				Objects.equals(this.externalId, subscriptionLedgerEntry.externalId) &&
				Objects.equals(this.id, subscriptionLedgerEntry.id) &&
				Objects.equals(this.linkedSpaceId, subscriptionLedgerEntry.linkedSpaceId) &&
				Objects.equals(this.plannedPurgeDate, subscriptionLedgerEntry.plannedPurgeDate) &&
				Objects.equals(this.quantity, subscriptionLedgerEntry.quantity) &&
				Objects.equals(this.state, subscriptionLedgerEntry.state) &&
				Objects.equals(this.subscriptionVersion, subscriptionLedgerEntry.subscriptionVersion) &&
				Objects.equals(this.taxAmount, subscriptionLedgerEntry.taxAmount) &&
				Objects.equals(this.taxes, subscriptionLedgerEntry.taxes) &&
				Objects.equals(this.title, subscriptionLedgerEntry.title) &&
				Objects.equals(this.version, subscriptionLedgerEntry.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(aggregatedTaxRate, amountExcludingTax, amountIncludingTax, createdBy, createdOn, externalId, id, linkedSpaceId, plannedPurgeDate, quantity, state, subscriptionVersion, taxAmount, taxes, title, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SubscriptionLedgerEntry {\n");
		
		sb.append("		aggregatedTaxRate: ").append(toIndentedString(aggregatedTaxRate)).append("\n");
		sb.append("		amountExcludingTax: ").append(toIndentedString(amountExcludingTax)).append("\n");
		sb.append("		amountIncludingTax: ").append(toIndentedString(amountIncludingTax)).append("\n");
		sb.append("		createdBy: ").append(toIndentedString(createdBy)).append("\n");
		sb.append("		createdOn: ").append(toIndentedString(createdOn)).append("\n");
		sb.append("		externalId: ").append(toIndentedString(externalId)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		quantity: ").append(toIndentedString(quantity)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("		subscriptionVersion: ").append(toIndentedString(subscriptionVersion)).append("\n");
		sb.append("		taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
		sb.append("		taxes: ").append(toIndentedString(taxes)).append("\n");
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

