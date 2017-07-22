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
import com.wallee.sdk.model.LineItem;
import com.wallee.sdk.model.TransactionAwareEntity;
import com.wallee.sdk.model.TransactionCompletion;
import com.wallee.sdk.model.TransactionInvoiceState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * The transaction invoice represents the invoice document for a particular transaction.
 */
@io.swagger.annotations.ApiModel(description = "The transaction invoice represents the invoice document for a particular transaction.")
public class TransactionInvoice extends TransactionAwareEntity {
	@SerializedName("amount")
	private BigDecimal amount = null;

	@SerializedName("completion")
	private TransactionCompletion completion = null;

	@SerializedName("createdOn")
	private DateTime createdOn = null;

	@SerializedName("derecognizedOn")
	private DateTime derecognizedOn = null;

	@SerializedName("dueOn")
	private DateTime dueOn = null;

	@SerializedName("externalId")
	private String externalId = null;

	@SerializedName("language")
	private String language = null;

	@SerializedName("lineItems")
	private List<LineItem> lineItems = new ArrayList<LineItem>();

	@SerializedName("merchantReference")
	private String merchantReference = null;

	@SerializedName("outstandingAmount")
	private BigDecimal outstandingAmount = null;

	@SerializedName("paidOn")
	private DateTime paidOn = null;

	@SerializedName("plannedPurgeDate")
	private DateTime plannedPurgeDate = null;

	@SerializedName("spaceViewId")
	private Long spaceViewId = null;

	@SerializedName("state")
	private TransactionInvoiceState state = null;

	@SerializedName("taxAmount")
	private BigDecimal taxAmount = null;

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

	public TransactionInvoice completion(TransactionCompletion completion) {
		this.completion = completion;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public TransactionCompletion getCompletion() {
		return completion;
	}

	public void setCompletion(TransactionCompletion completion) {
		this.completion = completion;
	}

	/**
	 * The date on which the invoice is created on.
	 *
	 * @return The date on which the invoice is created on.
	 */
	@ApiModelProperty(example = "null", value = "The date on which the invoice is created on.")
	public DateTime getCreatedOn() {
		return createdOn;
	}

	/**
	 * The date on which the invoice is marked as derecognized.
	 *
	 * @return The date on which the invoice is marked as derecognized.
	 */
	@ApiModelProperty(example = "null", value = "The date on which the invoice is marked as derecognized.")
	public DateTime getDerecognizedOn() {
		return derecognizedOn;
	}

	/**
	 * The date on which the invoice should be paid on.
	 *
	 * @return The date on which the invoice should be paid on.
	 */
	@ApiModelProperty(example = "null", value = "The date on which the invoice should be paid on.")
	public DateTime getDueOn() {
		return dueOn;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getExternalId() {
		return externalId;
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

	public TransactionInvoice lineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
		return this;
	}

	public TransactionInvoice addLineItemsItem(LineItem lineItemsItem) {
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
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getMerchantReference() {
		return merchantReference;
	}

	/**
	 * The outstanding amount indicates how much the buyer owes the merchant. A negative amount indicates that the invoice is overpaid.
	 *
	 * @return The outstanding amount indicates how much the buyer owes the merchant. A negative amount indicates that the invoice is overpaid.
	 */
	@ApiModelProperty(example = "null", value = "The outstanding amount indicates how much the buyer owes the merchant. A negative amount indicates that the invoice is overpaid.")
	public BigDecimal getOutstandingAmount() {
		return outstandingAmount;
	}

	/**
	 * The date on which the invoice is marked as paid. Eventually this date lags behind of the actual paid date.
	 *
	 * @return The date on which the invoice is marked as paid. Eventually this date lags behind of the actual paid date.
	 */
	@ApiModelProperty(example = "null", value = "The date on which the invoice is marked as paid. Eventually this date lags behind of the actual paid date.")
	public DateTime getPaidOn() {
		return paidOn;
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
	public Long getSpaceViewId() {
		return spaceViewId;
	}

	public TransactionInvoice state(TransactionInvoiceState state) {
		this.state = state;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public TransactionInvoiceState getState() {
		return state;
	}

	public void setState(TransactionInvoiceState state) {
		this.state = state;
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

	/**
	 * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 *
	 * @return The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 */
	@ApiModelProperty(example = "null", value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
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
		TransactionInvoice transactionInvoice = (TransactionInvoice) o;
		return Objects.equals(this.amount, transactionInvoice.amount) &&
				Objects.equals(this.completion, transactionInvoice.completion) &&
				Objects.equals(this.createdOn, transactionInvoice.createdOn) &&
				Objects.equals(this.derecognizedOn, transactionInvoice.derecognizedOn) &&
				Objects.equals(this.dueOn, transactionInvoice.dueOn) &&
				Objects.equals(this.externalId, transactionInvoice.externalId) &&
				Objects.equals(this.language, transactionInvoice.language) &&
				Objects.equals(this.lineItems, transactionInvoice.lineItems) &&
				Objects.equals(this.merchantReference, transactionInvoice.merchantReference) &&
				Objects.equals(this.outstandingAmount, transactionInvoice.outstandingAmount) &&
				Objects.equals(this.paidOn, transactionInvoice.paidOn) &&
				Objects.equals(this.plannedPurgeDate, transactionInvoice.plannedPurgeDate) &&
				Objects.equals(this.spaceViewId, transactionInvoice.spaceViewId) &&
				Objects.equals(this.state, transactionInvoice.state) &&
				Objects.equals(this.taxAmount, transactionInvoice.taxAmount) &&
				Objects.equals(this.version, transactionInvoice.version) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, completion, createdOn, derecognizedOn, dueOn, externalId, language, lineItems, merchantReference, outstandingAmount, paidOn, plannedPurgeDate, spaceViewId, state, taxAmount, version, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TransactionInvoice {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
		sb.append("		amount: ").append(toIndentedString(amount)).append("\n");
		sb.append("		completion: ").append(toIndentedString(completion)).append("\n");
		sb.append("		createdOn: ").append(toIndentedString(createdOn)).append("\n");
		sb.append("		derecognizedOn: ").append(toIndentedString(derecognizedOn)).append("\n");
		sb.append("		dueOn: ").append(toIndentedString(dueOn)).append("\n");
		sb.append("		externalId: ").append(toIndentedString(externalId)).append("\n");
		sb.append("		language: ").append(toIndentedString(language)).append("\n");
		sb.append("		lineItems: ").append(toIndentedString(lineItems)).append("\n");
		sb.append("		merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
		sb.append("		outstandingAmount: ").append(toIndentedString(outstandingAmount)).append("\n");
		sb.append("		paidOn: ").append(toIndentedString(paidOn)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("		taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
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

