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
import com.wallee.sdk.model.Account;
import com.wallee.sdk.model.AccountState;
import com.wallee.sdk.model.AccountType;
import java.time.OffsetDateTime;

/**
 * Account
 */
public class Account {

	@SerializedName("active")
	private Boolean active = null;

	@SerializedName("activeOrRestrictedActive")
	private Boolean activeOrRestrictedActive = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("parentAccount")
	private Account parentAccount = null;

	@SerializedName("plannedPurgeDate")
	private OffsetDateTime plannedPurgeDate = null;

	@SerializedName("restrictedActive")
	private Boolean restrictedActive = null;

	@SerializedName("scope")
	private Long scope = null;

	@SerializedName("state")
	private AccountState state = null;

	@SerializedName("subaccountLimit")
	private Long subaccountLimit = null;

	@SerializedName("type")
	private AccountType type = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * Active means that this account and all accounts in the hierarchy are active.
	 *
	 * @return Active means that this account and all accounts in the hierarchy are active.
	 */
	public Boolean getActive() {
		return active;
	}

	/**
	 * This property is true when all accounts in the hierarchy are active or restricted active.
	 *
	 * @return This property is true when all accounts in the hierarchy are active or restricted active.
	 */
	public Boolean getActiveOrRestrictedActive() {
		return activeOrRestrictedActive;
	}

	/**
	 * The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 *
	 * @return The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * The name of the account identifies the account within the administrative interface.
	 *
	 * @return The name of the account identifies the account within the administrative interface.
	 */
	public String getName() {
		return name;
	}

	/**
	 * The account which is responsible for administering the account.
	 *
	 * @return The account which is responsible for administering the account.
	 */
	public Account getParentAccount() {
		return parentAccount;
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
	 * Restricted active means that at least one account in the hierarchy is only restricted active, but all are either restricted active or active.
	 *
	 * @return Restricted active means that at least one account in the hierarchy is only restricted active, but all are either restricted active or active.
	 */
	public Boolean getRestrictedActive() {
		return restrictedActive;
	}

	/**
	 * This is the scope to which the account belongs to.
	 *
	 * @return This is the scope to which the account belongs to.
	 */
	public Long getScope() {
		return scope;
	}

	/**
	 * state
	 *
	 * @return state
	 */
	public AccountState getState() {
		return state;
	}

	/**
	 * This property restricts the number of subaccounts which can be created within this account.
	 *
	 * @return This property restricts the number of subaccounts which can be created within this account.
	 */
	public Long getSubaccountLimit() {
		return subaccountLimit;
	}

	/**
	 * The account type defines which role and capabilities it has.
	 *
	 * @return The account type defines which role and capabilities it has.
	 */
	public AccountType getType() {
		return type;
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
		Account account = (Account) o;
		return Objects.equals(this.active, account.active) &&
				Objects.equals(this.activeOrRestrictedActive, account.activeOrRestrictedActive) &&
				Objects.equals(this.id, account.id) &&
				Objects.equals(this.name, account.name) &&
				Objects.equals(this.parentAccount, account.parentAccount) &&
				Objects.equals(this.plannedPurgeDate, account.plannedPurgeDate) &&
				Objects.equals(this.restrictedActive, account.restrictedActive) &&
				Objects.equals(this.scope, account.scope) &&
				Objects.equals(this.state, account.state) &&
				Objects.equals(this.subaccountLimit, account.subaccountLimit) &&
				Objects.equals(this.type, account.type) &&
				Objects.equals(this.version, account.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(active, activeOrRestrictedActive, id, name, parentAccount, plannedPurgeDate, restrictedActive, scope, state, subaccountLimit, type, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Account {\n");
		
		sb.append("		active: ").append(toIndentedString(active)).append("\n");
		sb.append("		activeOrRestrictedActive: ").append(toIndentedString(activeOrRestrictedActive)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		parentAccount: ").append(toIndentedString(parentAccount)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		restrictedActive: ").append(toIndentedString(restrictedActive)).append("\n");
		sb.append("		scope: ").append(toIndentedString(scope)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("		subaccountLimit: ").append(toIndentedString(subaccountLimit)).append("\n");
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

