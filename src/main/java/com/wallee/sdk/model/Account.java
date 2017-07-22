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
import com.wallee.sdk.model.Account;
import com.wallee.sdk.model.AccountState;
import com.wallee.sdk.model.AccountType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
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
	private DateTime plannedPurgeDate = null;

	@SerializedName("restrictedActive")
	private Boolean restrictedActive = null;

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
	@ApiModelProperty(example = "null", value = "Active means that this account and all accounts in the hierarchy are active.")
	public Boolean getActive() {
		return active;
	}

	/**
	 * This property is true when all accounts in the hierarchy are active or restricted active.
	 *
	 * @return This property is true when all accounts in the hierarchy are active or restricted active.
	 */
	@ApiModelProperty(example = "null", value = "This property is true when all accounts in the hierarchy are active or restricted active.")
	public Boolean getActiveOrRestrictedActive() {
		return activeOrRestrictedActive;
	}

	public Account id(Long id) {
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

	/**
	 * The name of the account identifies the account within the administrative interface.
	 *
	 * @return The name of the account identifies the account within the administrative interface.
	 */
	@ApiModelProperty(example = "null", value = "The name of the account identifies the account within the administrative interface.")
	public String getName() {
		return name;
	}

	public Account parentAccount(Account parentAccount) {
		this.parentAccount = parentAccount;
		return this;
	}

	/**
	 * The account which is responsible for administering the account.
	 *
	 * @return The account which is responsible for administering the account.
	 */
	@ApiModelProperty(example = "null", value = "The account which is responsible for administering the account.")
	public Account getParentAccount() {
		return parentAccount;
	}

	public void setParentAccount(Account parentAccount) {
		this.parentAccount = parentAccount;
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
	 * Restricted active means that at least one account in the hierarchy is only restricted active, but all are either restricted active or active.
	 *
	 * @return Restricted active means that at least one account in the hierarchy is only restricted active, but all are either restricted active or active.
	 */
	@ApiModelProperty(example = "null", value = "Restricted active means that at least one account in the hierarchy is only restricted active, but all are either restricted active or active.")
	public Boolean getRestrictedActive() {
		return restrictedActive;
	}

	public Account state(AccountState state) {
		this.state = state;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public AccountState getState() {
		return state;
	}

	public void setState(AccountState state) {
		this.state = state;
	}

	/**
	 * This property restricts the number of subaccounts which can be created within this account.
	 *
	 * @return This property restricts the number of subaccounts which can be created within this account.
	 */
	@ApiModelProperty(example = "null", value = "This property restricts the number of subaccounts which can be created within this account.")
	public Long getSubaccountLimit() {
		return subaccountLimit;
	}

	public Account type(AccountType type) {
		this.type = type;
		return this;
	}

	/**
	 * The account type defines which role and capabilities it has.
	 *
	 * @return The account type defines which role and capabilities it has.
	 */
	@ApiModelProperty(example = "null", value = "The account type defines which role and capabilities it has.")
	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}

	public Account version(Integer version) {
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
		Account account = (Account) o;
		return Objects.equals(this.active, account.active) &&
				Objects.equals(this.activeOrRestrictedActive, account.activeOrRestrictedActive) &&
				Objects.equals(this.id, account.id) &&
				Objects.equals(this.name, account.name) &&
				Objects.equals(this.parentAccount, account.parentAccount) &&
				Objects.equals(this.plannedPurgeDate, account.plannedPurgeDate) &&
				Objects.equals(this.restrictedActive, account.restrictedActive) &&
				Objects.equals(this.state, account.state) &&
				Objects.equals(this.subaccountLimit, account.subaccountLimit) &&
				Objects.equals(this.type, account.type) &&
				Objects.equals(this.version, account.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(active, activeOrRestrictedActive, id, name, parentAccount, plannedPurgeDate, restrictedActive, state, subaccountLimit, type, version);
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

