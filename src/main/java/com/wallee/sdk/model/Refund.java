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
import com.wallee.sdk.model.FailureReason;
import com.wallee.sdk.model.Label;
import com.wallee.sdk.model.LineItem;
import com.wallee.sdk.model.LineItemReduction;
import com.wallee.sdk.model.RefundState;
import com.wallee.sdk.model.RefundType;
import com.wallee.sdk.model.Tax;
import com.wallee.sdk.model.Transaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * The refund represents a credit back to the customer. It can be issued by the merchant or by the customer (reversal).
 */
@io.swagger.annotations.ApiModel(description = "The refund represents a credit back to the customer. It can be issued by the merchant or by the customer (reversal).")
public class Refund {
	@SerializedName("amount")
	private BigDecimal amount = null;

	@SerializedName("baseLineItems")
	private List<LineItem> baseLineItems = new ArrayList<LineItem>();

	@SerializedName("createdBy")
	private Long createdBy = null;

	@SerializedName("createdOn")
	private DateTime createdOn = null;

	@SerializedName("externalId")
	private String externalId = null;

	@SerializedName("failedOn")
	private DateTime failedOn = null;

	@SerializedName("failureReason")
	private FailureReason failureReason = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("labels")
	private List<Label> labels = new ArrayList<Label>();

	@SerializedName("language")
	private String language = null;

	@SerializedName("lineItems")
	private List<LineItem> lineItems = new ArrayList<LineItem>();

	@SerializedName("linkedSpaceId")
	private Long linkedSpaceId = null;

	@SerializedName("merchantReference")
	private String merchantReference = null;

	@SerializedName("nextUpdateOn")
	private DateTime nextUpdateOn = null;

	@SerializedName("plannedPurgeDate")
	private DateTime plannedPurgeDate = null;

	@SerializedName("processorReference")
	private String processorReference = null;

	@SerializedName("reducedLineItems")
	private List<LineItem> reducedLineItems = new ArrayList<LineItem>();

	@SerializedName("reductions")
	private List<LineItemReduction> reductions = new ArrayList<LineItemReduction>();

	@SerializedName("state")
	private RefundState state = null;

	@SerializedName("succeededOn")
	private DateTime succeededOn = null;

	@SerializedName("taxes")
	private List<Tax> taxes = new ArrayList<Tax>();

	@SerializedName("timeoutOn")
	private DateTime timeoutOn = null;

	@SerializedName("transaction")
	private Transaction transaction = null;

	@SerializedName("type")
	private RefundType type = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public BigDecimal getAmount() {
		return amount;
	}

	public Refund baseLineItems(List<LineItem> baseLineItems) {
		this.baseLineItems = baseLineItems;
		return this;
	}

	public Refund addBaseLineItemsItem(LineItem baseLineItemsItem) {
		this.baseLineItems.add(baseLineItemsItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public List<LineItem> getBaseLineItems() {
		return baseLineItems;
	}

	public void setBaseLineItems(List<LineItem> baseLineItems) {
		this.baseLineItems = baseLineItems;
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
	 * The external id helps to identify duplicate calls to the refund service. As such the external ID has to be unique per transaction.
	 *
	 * @return The external id helps to identify duplicate calls to the refund service. As such the external ID has to be unique per transaction.
	 */
	@ApiModelProperty(example = "null", value = "The external id helps to identify duplicate calls to the refund service. As such the external ID has to be unique per transaction.")
	public String getExternalId() {
		return externalId;
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

	public Refund failureReason(FailureReason failureReason) {
		this.failureReason = failureReason;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public FailureReason getFailureReason() {
		return failureReason;
	}

	public void setFailureReason(FailureReason failureReason) {
		this.failureReason = failureReason;
	}

	public Refund id(Long id) {
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

	public Refund labels(List<Label> labels) {
		this.labels = labels;
		return this;
	}

	public Refund addLabelsItem(Label labelsItem) {
		this.labels.add(labelsItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public List<Label> getLabels() {
		return labels;
	}

	public void setLabels(List<Label> labels) {
		this.labels = labels;
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

	public Refund lineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
		return this;
	}

	public Refund addLineItemsItem(LineItem lineItemsItem) {
		this.lineItems.add(lineItemsItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public List<LineItem> getLineItems() {
		return lineItems;
	}

	public void setLineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
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
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getMerchantReference() {
		return merchantReference;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getNextUpdateOn() {
		return nextUpdateOn;
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
	public String getProcessorReference() {
		return processorReference;
	}

	public Refund reducedLineItems(List<LineItem> reducedLineItems) {
		this.reducedLineItems = reducedLineItems;
		return this;
	}

	public Refund addReducedLineItemsItem(LineItem reducedLineItemsItem) {
		this.reducedLineItems.add(reducedLineItemsItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public List<LineItem> getReducedLineItems() {
		return reducedLineItems;
	}

	public void setReducedLineItems(List<LineItem> reducedLineItems) {
		this.reducedLineItems = reducedLineItems;
	}

	public Refund reductions(List<LineItemReduction> reductions) {
		this.reductions = reductions;
		return this;
	}

	public Refund addReductionsItem(LineItemReduction reductionsItem) {
		this.reductions.add(reductionsItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public List<LineItemReduction> getReductions() {
		return reductions;
	}

	public void setReductions(List<LineItemReduction> reductions) {
		this.reductions = reductions;
	}

	public Refund state(RefundState state) {
		this.state = state;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public RefundState getState() {
		return state;
	}

	public void setState(RefundState state) {
		this.state = state;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getSucceededOn() {
		return succeededOn;
	}

	public Refund taxes(List<Tax> taxes) {
		this.taxes = taxes;
		return this;
	}

	public Refund addTaxesItem(Tax taxesItem) {
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
	public DateTime getTimeoutOn() {
		return timeoutOn;
	}

	public Refund transaction(Transaction transaction) {
		this.transaction = transaction;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public Refund type(RefundType type) {
		this.type = type;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public RefundType getType() {
		return type;
	}

	public void setType(RefundType type) {
		this.type = type;
	}

	public Refund version(Integer version) {
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
		Refund refund = (Refund) o;
		return Objects.equals(this.amount, refund.amount) &&
				Objects.equals(this.baseLineItems, refund.baseLineItems) &&
				Objects.equals(this.createdBy, refund.createdBy) &&
				Objects.equals(this.createdOn, refund.createdOn) &&
				Objects.equals(this.externalId, refund.externalId) &&
				Objects.equals(this.failedOn, refund.failedOn) &&
				Objects.equals(this.failureReason, refund.failureReason) &&
				Objects.equals(this.id, refund.id) &&
				Objects.equals(this.labels, refund.labels) &&
				Objects.equals(this.language, refund.language) &&
				Objects.equals(this.lineItems, refund.lineItems) &&
				Objects.equals(this.linkedSpaceId, refund.linkedSpaceId) &&
				Objects.equals(this.merchantReference, refund.merchantReference) &&
				Objects.equals(this.nextUpdateOn, refund.nextUpdateOn) &&
				Objects.equals(this.plannedPurgeDate, refund.plannedPurgeDate) &&
				Objects.equals(this.processorReference, refund.processorReference) &&
				Objects.equals(this.reducedLineItems, refund.reducedLineItems) &&
				Objects.equals(this.reductions, refund.reductions) &&
				Objects.equals(this.state, refund.state) &&
				Objects.equals(this.succeededOn, refund.succeededOn) &&
				Objects.equals(this.taxes, refund.taxes) &&
				Objects.equals(this.timeoutOn, refund.timeoutOn) &&
				Objects.equals(this.transaction, refund.transaction) &&
				Objects.equals(this.type, refund.type) &&
				Objects.equals(this.version, refund.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, baseLineItems, createdBy, createdOn, externalId, failedOn, failureReason, id, labels, language, lineItems, linkedSpaceId, merchantReference, nextUpdateOn, plannedPurgeDate, processorReference, reducedLineItems, reductions, state, succeededOn, taxes, timeoutOn, transaction, type, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Refund {\n");
		
		sb.append("		amount: ").append(toIndentedString(amount)).append("\n");
		sb.append("		baseLineItems: ").append(toIndentedString(baseLineItems)).append("\n");
		sb.append("		createdBy: ").append(toIndentedString(createdBy)).append("\n");
		sb.append("		createdOn: ").append(toIndentedString(createdOn)).append("\n");
		sb.append("		externalId: ").append(toIndentedString(externalId)).append("\n");
		sb.append("		failedOn: ").append(toIndentedString(failedOn)).append("\n");
		sb.append("		failureReason: ").append(toIndentedString(failureReason)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		labels: ").append(toIndentedString(labels)).append("\n");
		sb.append("		language: ").append(toIndentedString(language)).append("\n");
		sb.append("		lineItems: ").append(toIndentedString(lineItems)).append("\n");
		sb.append("		linkedSpaceId: ").append(toIndentedString(linkedSpaceId)).append("\n");
		sb.append("		merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
		sb.append("		nextUpdateOn: ").append(toIndentedString(nextUpdateOn)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		processorReference: ").append(toIndentedString(processorReference)).append("\n");
		sb.append("		reducedLineItems: ").append(toIndentedString(reducedLineItems)).append("\n");
		sb.append("		reductions: ").append(toIndentedString(reductions)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("		succeededOn: ").append(toIndentedString(succeededOn)).append("\n");
		sb.append("		taxes: ").append(toIndentedString(taxes)).append("\n");
		sb.append("		timeoutOn: ").append(toIndentedString(timeoutOn)).append("\n");
		sb.append("		transaction: ").append(toIndentedString(transaction)).append("\n");
		sb.append("		type: ").append(toIndentedString(type)).append("\n");
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

