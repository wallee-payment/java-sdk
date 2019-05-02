/**
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
 *
 * @author   customweb GmbH (www.customweb.com)
 */
package com.wallee.sdk.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.wallee.sdk.model.LineItem;
import com.wallee.sdk.model.Transaction;
import com.wallee.sdk.model.TransactionAwareEntity;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * TransactionLineItemVersion
 */
public class TransactionLineItemVersion extends TransactionAwareEntity {

	@SerializedName("amount")
	private BigDecimal amount = null;

	@SerializedName("createdBy")
	private Long createdBy = null;

	@SerializedName("createdOn")
	private OffsetDateTime createdOn = null;

	@SerializedName("language")
	private String language = null;

	@SerializedName("lineItems")
	private List<LineItem> lineItems = new ArrayList<LineItem>();

	@SerializedName("plannedPurgeDate")
	private OffsetDateTime plannedPurgeDate = null;

	@SerializedName("spaceViewId")
	private Long spaceViewId = null;

	@SerializedName("taxAmount")
	private BigDecimal taxAmount = null;

	@SerializedName("transaction")
	private Transaction transaction = null;

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
	 * createdBy
	 *
	 * @return createdBy
	 */
	public Long getCreatedBy() {
		return createdBy;
	}

	/**
	 * The created on date indicates the date on which the entity was stored into the database.
	 *
	 * @return The created on date indicates the date on which the entity was stored into the database.
	 */
	public OffsetDateTime getCreatedOn() {
		return createdOn;
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
	 * taxAmount
	 *
	 * @return taxAmount
	 */
	public BigDecimal getTaxAmount() {
		return taxAmount;
	}

	/**
	 * transaction
	 *
	 * @return transaction
	 */
	public Transaction getTransaction() {
		return transaction;
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
		TransactionLineItemVersion transactionLineItemVersion = (TransactionLineItemVersion) o;
		return Objects.equals(this.amount, transactionLineItemVersion.amount) &&
				Objects.equals(this.createdBy, transactionLineItemVersion.createdBy) &&
				Objects.equals(this.createdOn, transactionLineItemVersion.createdOn) &&
				Objects.equals(this.language, transactionLineItemVersion.language) &&
				Objects.equals(this.lineItems, transactionLineItemVersion.lineItems) &&
				Objects.equals(this.plannedPurgeDate, transactionLineItemVersion.plannedPurgeDate) &&
				Objects.equals(this.spaceViewId, transactionLineItemVersion.spaceViewId) &&
				Objects.equals(this.taxAmount, transactionLineItemVersion.taxAmount) &&
				Objects.equals(this.transaction, transactionLineItemVersion.transaction) &&
				Objects.equals(this.version, transactionLineItemVersion.version) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, createdBy, createdOn, language, lineItems, plannedPurgeDate, spaceViewId, taxAmount, transaction, version, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TransactionLineItemVersion {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
		sb.append("		amount: ").append(toIndentedString(amount)).append("\n");
		sb.append("		createdBy: ").append(toIndentedString(createdBy)).append("\n");
		sb.append("		createdOn: ").append(toIndentedString(createdOn)).append("\n");
		sb.append("		language: ").append(toIndentedString(language)).append("\n");
		sb.append("		lineItems: ").append(toIndentedString(lineItems)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
		sb.append("		taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
		sb.append("		transaction: ").append(toIndentedString(transaction)).append("\n");
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

