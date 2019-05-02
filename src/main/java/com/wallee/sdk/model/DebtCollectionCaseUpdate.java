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
import com.wallee.sdk.model.AbstractDebtCollectionCaseUpdate;
import com.wallee.sdk.model.AddressCreate;
import com.wallee.sdk.model.DebtCollectionEnvironment;
import com.wallee.sdk.model.LineItemCreate;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * The debt collection case represents a try to collect the money from the debtor.
 */
public class DebtCollectionCaseUpdate extends AbstractDebtCollectionCaseUpdate {

	@SerializedName("id")
	private Long id = null;

	@SerializedName("version")
	private Long version = null;

	public DebtCollectionCaseUpdate id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 *
	 * @return The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DebtCollectionCaseUpdate version(Long version) {
		this.version = version;
		return this;
	}

	/**
	 * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 *
	 * @return The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 */
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	@Override
	public DebtCollectionCaseUpdate billingAddress(AddressCreate billingAddress) {
		super.billingAddress(billingAddress);
		return this;
	}

	@Override
	public DebtCollectionCaseUpdate contractDate(OffsetDateTime contractDate) {
		super.contractDate(contractDate);
		return this;
	}

	@Override
	public DebtCollectionCaseUpdate currency(String currency) {
		super.currency(currency);
		return this;
	}

	@Override
	public DebtCollectionCaseUpdate dueDate(OffsetDateTime dueDate) {
		super.dueDate(dueDate);
		return this;
	}

	@Override
	public DebtCollectionCaseUpdate environment(DebtCollectionEnvironment environment) {
		super.environment(environment);
		return this;
	}

	@Override
	public DebtCollectionCaseUpdate language(String language) {
		super.language(language);
		return this;
	}

	@Override
	public DebtCollectionCaseUpdate lineItems(List<LineItemCreate> lineItems) {
		super.lineItems(lineItems);
		return this;
	}

	@Override
	public DebtCollectionCaseUpdate addLineItemsItem(LineItemCreate lineItemsItem) {
		super.addLineItemsItem(lineItemsItem);
		return this;
	}

	@Override
	public DebtCollectionCaseUpdate spaceViewId(Long spaceViewId) {
		super.spaceViewId(spaceViewId);
		return this;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DebtCollectionCaseUpdate debtCollectionCaseUpdate = (DebtCollectionCaseUpdate) o;
		return Objects.equals(this.id, debtCollectionCaseUpdate.id) &&
				Objects.equals(this.version, debtCollectionCaseUpdate.version) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, version, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DebtCollectionCaseUpdate {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
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

