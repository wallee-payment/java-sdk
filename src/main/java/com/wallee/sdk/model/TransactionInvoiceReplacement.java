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
import com.wallee.sdk.model.LineItemCreate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class TransactionInvoiceReplacement {
	@SerializedName("dueOn")
	private DateTime dueOn = null;

	@SerializedName("externalId")
	private String externalId = null;

	@SerializedName("lineItems")
	private List<LineItemCreate> lineItems = new ArrayList<LineItemCreate>();

	@SerializedName("merchantReference")
	private String merchantReference = null;

	@SerializedName("sentToCustomer")
	private Boolean sentToCustomer = null;

	public TransactionInvoiceReplacement dueOn(DateTime dueOn) {
		this.dueOn = dueOn;
		return this;
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

	public void setDueOn(DateTime dueOn) {
		this.dueOn = dueOn;
	}

	public TransactionInvoiceReplacement externalId(String externalId) {
		this.externalId = externalId;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", required = true, value = "")
	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public TransactionInvoiceReplacement lineItems(List<LineItemCreate> lineItems) {
		this.lineItems = lineItems;
		return this;
	}

	public TransactionInvoiceReplacement addLineItemsItem(LineItemCreate lineItemsItem) {
		this.lineItems.add(lineItemsItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", required = true, value = "")
	public List<LineItemCreate> getLineItems() {
		return lineItems;
	}

	public void setLineItems(List<LineItemCreate> lineItems) {
		this.lineItems = lineItems;
	}

	public TransactionInvoiceReplacement merchantReference(String merchantReference) {
		this.merchantReference = merchantReference;
		return this;
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

	public void setMerchantReference(String merchantReference) {
		this.merchantReference = merchantReference;
	}

	public TransactionInvoiceReplacement sentToCustomer(Boolean sentToCustomer) {
		this.sentToCustomer = sentToCustomer;
		return this;
	}

	/**
	 * When the connector is configured to send the invoice to the customer and this property is true the customer will receive an email with the updated invoice. When this property is false no invoice is sent.
	 *
	 * @return When the connector is configured to send the invoice to the customer and this property is true the customer will receive an email with the updated invoice. When this property is false no invoice is sent.
	 */
	@ApiModelProperty(example = "null", value = "When the connector is configured to send the invoice to the customer and this property is true the customer will receive an email with the updated invoice. When this property is false no invoice is sent.")
	public Boolean getSentToCustomer() {
		return sentToCustomer;
	}

	public void setSentToCustomer(Boolean sentToCustomer) {
		this.sentToCustomer = sentToCustomer;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TransactionInvoiceReplacement transactionInvoiceReplacement = (TransactionInvoiceReplacement) o;
		return Objects.equals(this.dueOn, transactionInvoiceReplacement.dueOn) &&
				Objects.equals(this.externalId, transactionInvoiceReplacement.externalId) &&
				Objects.equals(this.lineItems, transactionInvoiceReplacement.lineItems) &&
				Objects.equals(this.merchantReference, transactionInvoiceReplacement.merchantReference) &&
				Objects.equals(this.sentToCustomer, transactionInvoiceReplacement.sentToCustomer);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dueOn, externalId, lineItems, merchantReference, sentToCustomer);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TransactionInvoiceReplacement {\n");
		
		sb.append("		dueOn: ").append(toIndentedString(dueOn)).append("\n");
		sb.append("		externalId: ").append(toIndentedString(externalId)).append("\n");
		sb.append("		lineItems: ").append(toIndentedString(lineItems)).append("\n");
		sb.append("		merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
		sb.append("		sentToCustomer: ").append(toIndentedString(sentToCustomer)).append("\n");
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

