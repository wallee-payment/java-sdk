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
import com.wallee.sdk.model.InstallmentPayment;
import com.wallee.sdk.model.InstallmentPaymentSliceState;
import com.wallee.sdk.model.LineItem;
import com.wallee.sdk.model.Transaction;
import com.wallee.sdk.model.TransactionAwareEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * An installment payment slice represents a single transaction of money from the buyer to the merchant.
 */
@io.swagger.annotations.ApiModel(description = "An installment payment slice represents a single transaction of money from the buyer to the merchant.")
public class InstallmentPaymentSlice extends TransactionAwareEntity {
	@SerializedName("chargeOn")
	private DateTime chargeOn = null;

	@SerializedName("createdOn")
	private DateTime createdOn = null;

	@SerializedName("installmentPayment")
	private InstallmentPayment installmentPayment = null;

	@SerializedName("lineItems")
	private List<LineItem> lineItems = new ArrayList<LineItem>();

	@SerializedName("plannedPurgeDate")
	private DateTime plannedPurgeDate = null;

	@SerializedName("state")
	private InstallmentPaymentSliceState state = null;

	@SerializedName("transaction")
	private Transaction transaction = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public DateTime getChargeOn() {
		return chargeOn;
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

	public InstallmentPaymentSlice installmentPayment(InstallmentPayment installmentPayment) {
		this.installmentPayment = installmentPayment;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public InstallmentPayment getInstallmentPayment() {
		return installmentPayment;
	}

	public void setInstallmentPayment(InstallmentPayment installmentPayment) {
		this.installmentPayment = installmentPayment;
	}

	public InstallmentPaymentSlice lineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
		return this;
	}

	public InstallmentPaymentSlice addLineItemsItem(LineItem lineItemsItem) {
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
	 * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 *
	 * @return The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 */
	@ApiModelProperty(example = "null", value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
	public DateTime getPlannedPurgeDate() {
		return plannedPurgeDate;
	}

	public InstallmentPaymentSlice state(InstallmentPaymentSliceState state) {
		this.state = state;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public InstallmentPaymentSliceState getState() {
		return state;
	}

	public void setState(InstallmentPaymentSliceState state) {
		this.state = state;
	}

	public InstallmentPaymentSlice transaction(Transaction transaction) {
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
		InstallmentPaymentSlice installmentPaymentSlice = (InstallmentPaymentSlice) o;
		return Objects.equals(this.chargeOn, installmentPaymentSlice.chargeOn) &&
				Objects.equals(this.createdOn, installmentPaymentSlice.createdOn) &&
				Objects.equals(this.installmentPayment, installmentPaymentSlice.installmentPayment) &&
				Objects.equals(this.lineItems, installmentPaymentSlice.lineItems) &&
				Objects.equals(this.plannedPurgeDate, installmentPaymentSlice.plannedPurgeDate) &&
				Objects.equals(this.state, installmentPaymentSlice.state) &&
				Objects.equals(this.transaction, installmentPaymentSlice.transaction) &&
				Objects.equals(this.version, installmentPaymentSlice.version) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(chargeOn, createdOn, installmentPayment, lineItems, plannedPurgeDate, state, transaction, version, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InstallmentPaymentSlice {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
		sb.append("		chargeOn: ").append(toIndentedString(chargeOn)).append("\n");
		sb.append("		createdOn: ").append(toIndentedString(createdOn)).append("\n");
		sb.append("		installmentPayment: ").append(toIndentedString(installmentPayment)).append("\n");
		sb.append("		lineItems: ").append(toIndentedString(lineItems)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
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

