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
import com.wallee.sdk.model.AbstractHumanUserUpdate;
import com.wallee.sdk.model.CreationEntityState;

/**
 * HumanUserCreate
 */
public class HumanUserCreate extends AbstractHumanUserUpdate {

	@SerializedName("primaryAccount")
	private Long primaryAccount = null;

	public HumanUserCreate primaryAccount(Long primaryAccount) {
		this.primaryAccount = primaryAccount;
		return this;
	}

	/**
	 * The primary account links the user to a specific account.
	 *
	 * @return The primary account links the user to a specific account.
	 */
	public Long getPrimaryAccount() {
		return primaryAccount;
	}

	public void setPrimaryAccount(Long primaryAccount) {
		this.primaryAccount = primaryAccount;
	}

	@Override
	public HumanUserCreate emailAddress(String emailAddress) {
		super.emailAddress(emailAddress);
		return this;
	}

	@Override
	public HumanUserCreate firstname(String firstname) {
		super.firstname(firstname);
		return this;
	}

	@Override
	public HumanUserCreate language(String language) {
		super.language(language);
		return this;
	}

	@Override
	public HumanUserCreate lastname(String lastname) {
		super.lastname(lastname);
		return this;
	}

	@Override
	public HumanUserCreate state(CreationEntityState state) {
		super.state(state);
		return this;
	}

	@Override
	public HumanUserCreate timeZone(String timeZone) {
		super.timeZone(timeZone);
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
		HumanUserCreate humanUserCreate = (HumanUserCreate) o;
		return Objects.equals(this.primaryAccount, humanUserCreate.primaryAccount) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(primaryAccount, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class HumanUserCreate {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
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

