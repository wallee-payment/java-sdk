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
import com.wallee.sdk.model.AbstractDebtCollectionCaseUpdate;
import com.wallee.sdk.model.AddressCreate;
import com.wallee.sdk.model.DebtCollectionEnvironment;
import com.wallee.sdk.model.LineItemCreate;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * The debt collection case represents a try to collect the money from the debtor.
 */
public class DebtCollectionCaseCreate extends AbstractDebtCollectionCaseUpdate {

	@SerializedName("collectorConfiguration")
	private Long collectorConfiguration = null;

	@SerializedName("externalId")
	private String externalId = null;

	@SerializedName("reference")
	private String reference = null;

	public DebtCollectionCaseCreate collectorConfiguration(Long collectorConfiguration) {
		this.collectorConfiguration = collectorConfiguration;
		return this;
	}

	/**
	 * The collector configuration determines how the debt collection case is processed.
	 *
	 * @return The collector configuration determines how the debt collection case is processed.
	 */
	public Long getCollectorConfiguration() {
		return collectorConfiguration;
	}

	public void setCollectorConfiguration(Long collectorConfiguration) {
		this.collectorConfiguration = collectorConfiguration;
	}

	public DebtCollectionCaseCreate externalId(String externalId) {
		this.externalId = externalId;
		return this;
	}

	/**
	 * The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
	 *
	 * @return The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
	 */
	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public DebtCollectionCaseCreate reference(String reference) {
		this.reference = reference;
		return this;
	}

	/**
	 * The case reference is used in the communication with the debtor. It should be unique and it should be linkable with the source of the debt collection case.
	 *
	 * @return The case reference is used in the communication with the debtor. It should be unique and it should be linkable with the source of the debt collection case.
	 */
	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	@Override
	public DebtCollectionCaseCreate billingAddress(AddressCreate billingAddress) {
		super.billingAddress(billingAddress);
		return this;
	}

	@Override
	public DebtCollectionCaseCreate contractDate(OffsetDateTime contractDate) {
		super.contractDate(contractDate);
		return this;
	}

	@Override
	public DebtCollectionCaseCreate currency(String currency) {
		super.currency(currency);
		return this;
	}

	@Override
	public DebtCollectionCaseCreate dueDate(OffsetDateTime dueDate) {
		super.dueDate(dueDate);
		return this;
	}

	@Override
	public DebtCollectionCaseCreate environment(DebtCollectionEnvironment environment) {
		super.environment(environment);
		return this;
	}

	@Override
	public DebtCollectionCaseCreate language(String language) {
		super.language(language);
		return this;
	}

	@Override
	public DebtCollectionCaseCreate lineItems(List<LineItemCreate> lineItems) {
		super.lineItems(lineItems);
		return this;
	}

	@Override
	public DebtCollectionCaseCreate addLineItemsItem(LineItemCreate lineItemsItem) {
		super.addLineItemsItem(lineItemsItem);
		return this;
	}

	@Override
	public DebtCollectionCaseCreate spaceViewId(Long spaceViewId) {
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
		DebtCollectionCaseCreate debtCollectionCaseCreate = (DebtCollectionCaseCreate) o;
		return Objects.equals(this.collectorConfiguration, debtCollectionCaseCreate.collectorConfiguration) &&
				Objects.equals(this.externalId, debtCollectionCaseCreate.externalId) &&
				Objects.equals(this.reference, debtCollectionCaseCreate.reference) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(collectorConfiguration, externalId, reference, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DebtCollectionCaseCreate {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
		sb.append("		collectorConfiguration: ").append(toIndentedString(collectorConfiguration)).append("\n");
		sb.append("		externalId: ").append(toIndentedString(externalId)).append("\n");
		sb.append("		reference: ").append(toIndentedString(reference)).append("\n");
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

