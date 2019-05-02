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
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.DatabaseTranslatedString;
import com.wallee.sdk.model.Permission;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Role
 */
public class Role {

	@SerializedName("account")
	private Account account = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("name")
	private DatabaseTranslatedString name = null;

	@SerializedName("permissions")
	private List<Permission> permissions = new ArrayList<Permission>();

	@SerializedName("plannedPurgeDate")
	private OffsetDateTime plannedPurgeDate = null;

	@SerializedName("state")
	private CreationEntityState state = null;

	@SerializedName("twoFactorRequired")
	private Boolean twoFactorRequired = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * The account to which this role belongs to. This role can only be assigned within the assigned account and the sub accounts of the assigned account.
	 *
	 * @return The account to which this role belongs to. This role can only be assigned within the assigned account and the sub accounts of the assigned account.
	 */
	public Account getAccount() {
		return account;
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
	 * The name of this role is used to identify the role within administrative interfaces.
	 *
	 * @return The name of this role is used to identify the role within administrative interfaces.
	 */
	public DatabaseTranslatedString getName() {
		return name;
	}

	/**
	 * Set of permissions that are granted to this role.
	 *
	 * @return Set of permissions that are granted to this role.
	 */
	public List<Permission> getPermissions() {
		return permissions;
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
	 * state
	 *
	 * @return state
	 */
	public CreationEntityState getState() {
		return state;
	}

	/**
	 * Defines whether having been granted this role will force a user to use two-factor authentication.
	 *
	 * @return Defines whether having been granted this role will force a user to use two-factor authentication.
	 */
	public Boolean getTwoFactorRequired() {
		return twoFactorRequired;
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
		Role role = (Role) o;
		return Objects.equals(this.account, role.account) &&
				Objects.equals(this.id, role.id) &&
				Objects.equals(this.name, role.name) &&
				Objects.equals(this.permissions, role.permissions) &&
				Objects.equals(this.plannedPurgeDate, role.plannedPurgeDate) &&
				Objects.equals(this.state, role.state) &&
				Objects.equals(this.twoFactorRequired, role.twoFactorRequired) &&
				Objects.equals(this.version, role.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(account, id, name, permissions, plannedPurgeDate, state, twoFactorRequired, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Role {\n");
		
		sb.append("		account: ").append(toIndentedString(account)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		permissions: ").append(toIndentedString(permissions)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("		twoFactorRequired: ").append(toIndentedString(twoFactorRequired)).append("\n");
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

