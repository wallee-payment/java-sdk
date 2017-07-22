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

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class TransactionLineItemUpdateRequest {
	@SerializedName("newLineItems")
	private List<LineItemCreate> newLineItems = new ArrayList<LineItemCreate>();

	@SerializedName("transactionId")
	private Long transactionId = null;

	public TransactionLineItemUpdateRequest newLineItems(List<LineItemCreate> newLineItems) {
		this.newLineItems = newLineItems;
		return this;
	}

	public TransactionLineItemUpdateRequest addNewLineItemsItem(LineItemCreate newLineItemsItem) {
		this.newLineItems.add(newLineItemsItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public List<LineItemCreate> getNewLineItems() {
		return newLineItems;
	}

	public void setNewLineItems(List<LineItemCreate> newLineItems) {
		this.newLineItems = newLineItems;
	}

	public TransactionLineItemUpdateRequest transactionId(Long transactionId) {
		this.transactionId = transactionId;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", required = true, value = "")
	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TransactionLineItemUpdateRequest transactionLineItemUpdateRequest = (TransactionLineItemUpdateRequest) o;
		return Objects.equals(this.newLineItems, transactionLineItemUpdateRequest.newLineItems) &&
				Objects.equals(this.transactionId, transactionLineItemUpdateRequest.transactionId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(newLineItems, transactionId);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TransactionLineItemUpdateRequest {\n");
		
		sb.append("		newLineItems: ").append(toIndentedString(newLineItems)).append("\n");
		sb.append("		transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

