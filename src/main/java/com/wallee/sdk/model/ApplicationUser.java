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
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.Scope;
import com.wallee.sdk.model.User;
import com.wallee.sdk.model.UserType;
import java.time.OffsetDateTime;

/**
 * ApplicationUser
 */
public class ApplicationUser extends User {

	@SerializedName("name")
	private String name = null;

	@SerializedName("primaryAccount")
	private Account primaryAccount = null;

	/**
	 * The user name is used to identify the application user in administrative interfaces.
	 *
	 * @return The user name is used to identify the application user in administrative interfaces.
	 */
	public String getName() {
		return name;
	}

	/**
	 * The account that this user is associated with. The account owner will be able to manage this user.
	 *
	 * @return The account that this user is associated with. The account owner will be able to manage this user.
	 */
	public Account getPrimaryAccount() {
		return primaryAccount;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ApplicationUser applicationUser = (ApplicationUser) o;
		return Objects.equals(this.name, applicationUser.name) &&
				Objects.equals(this.primaryAccount, applicationUser.primaryAccount) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, primaryAccount, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ApplicationUser {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		primaryAccount: ").append(toIndentedString(primaryAccount)).append("\n");
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

