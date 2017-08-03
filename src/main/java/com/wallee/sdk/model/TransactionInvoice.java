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
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * The transaction invoice represents the invoice document for a particular transaction.
 */
public class TransactionInvoice extends TransactionAwareEntity {

	@SerializedName("amount")
	private BigDecimal amount = null;

	@SerializedName("completion")
	private TransactionCompletion completion = null;

	@SerializedName("createdOn")
	private OffsetDateTime createdOn = null;

	@SerializedName("derecognizedOn")
	private OffsetDateTime derecognizedOn = null;

	@SerializedName("dueOn")
	private OffsetDateTime dueOn = null;

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
	private OffsetDateTime paidOn = null;

	@SerializedName("plannedPurgeDate")
	private OffsetDateTime plannedPurgeDate = null;

	@SerializedName("spaceViewId")
	private Long spaceViewId = null;

	@SerializedName("state")
	private TransactionInvoiceState state = null;

	@SerializedName("taxAmount")
	private BigDecimal taxAmount = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * amount
	 *
	 * @return amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * completion
	 *
	 * @return completion
	 */
	public TransactionCompletion getCompletion() {
		return completion;
	}

	/**
	 * The date on which the invoice is created on.
	 *
	 * @return The date on which the invoice is created on.
	 */
	public OffsetDateTime getCreatedOn() {
		return createdOn;
	}

	/**
	 * The date on which the invoice is marked as derecognized.
	 *
	 * @return The date on which the invoice is marked as derecognized.
	 */
	public OffsetDateTime getDerecognizedOn() {
		return derecognizedOn;
	}

	/**
	 * The date on which the invoice should be paid on.
	 *
	 * @return The date on which the invoice should be paid on.
	 */
	public OffsetDateTime getDueOn() {
		return dueOn;
	}

	/**
	 * externalId
	 *
	 * @return externalId
	 */
	public String getExternalId() {
		return externalId;
	}

	/**
	 * language
	 *
	 * @return language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * lineItems
	 *
	 * @return lineItems
	 */
	public List<LineItem> getLineItems() {
		return lineItems;
	}

	/**
	 * merchantReference
	 *
	 * @return merchantReference
	 */
	public String getMerchantReference() {
		return merchantReference;
	}

	/**
	 * The outstanding amount indicates how much the buyer owes the merchant. A negative amount indicates that the invoice is overpaid.
	 *
	 * @return The outstanding amount indicates how much the buyer owes the merchant. A negative amount indicates that the invoice is overpaid.
	 */
	public BigDecimal getOutstandingAmount() {
		return outstandingAmount;
	}

	/**
	 * The date on which the invoice is marked as paid. Eventually this date lags behind of the actual paid date.
	 *
	 * @return The date on which the invoice is marked as paid. Eventually this date lags behind of the actual paid date.
	 */
	public OffsetDateTime getPaidOn() {
		return paidOn;
	}

	/**
	 * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 *
	 * @return The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 */
	public OffsetDateTime getPlannedPurgeDate() {
		return plannedPurgeDate;
	}

	/**
	 * spaceViewId
	 *
	 * @return spaceViewId
	 */
	public Long getSpaceViewId() {
		return spaceViewId;
	}

	/**
	 * state
	 *
	 * @return state
	 */
	public TransactionInvoiceState getState() {
		return state;
	}

	/**
	 * taxAmount
	 *
	 * @return taxAmount
	 */
	public BigDecimal getTaxAmount() {
		return taxAmount;
	}

	/**
	 * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 *
	 * @return The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 */
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

