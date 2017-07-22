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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class HumanUser extends User {
	@SerializedName("emailAddress")
	private String emailAddress = null;

	@SerializedName("emailAddressVerified")
	private Boolean emailAddressVerified = null;

	@SerializedName("firstname")
	private String firstname = null;

	@SerializedName("language")
	private String language = null;

	@SerializedName("lastname")
	private String lastname = null;

	@SerializedName("primaryAccount")
	private Account primaryAccount = null;

	@SerializedName("scope")
	private Scope scope = null;

	@SerializedName("timeZone")
	private String timeZone = null;

	/**
	 * The email address of the user.
	 *
	 * @return The email address of the user.
	 */
	@ApiModelProperty(example = "null", value = "The email address of the user.")
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * Defines whether a user is verified or not.
	 *
	 * @return Defines whether a user is verified or not.
	 */
	@ApiModelProperty(example = "null", value = "Defines whether a user is verified or not.")
	public Boolean getEmailAddressVerified() {
		return emailAddressVerified;
	}

	/**
	 * The first name of the user.
	 *
	 * @return The first name of the user.
	 */
	@ApiModelProperty(example = "null", value = "The first name of the user.")
	public String getFirstname() {
		return firstname;
	}

	/**
	 * The preferred language of the user.
	 *
	 * @return The preferred language of the user.
	 */
	@ApiModelProperty(example = "null", value = "The preferred language of the user.")
	public String getLanguage() {
		return language;
	}

	/**
	 * The last name of the user.
	 *
	 * @return The last name of the user.
	 */
	@ApiModelProperty(example = "null", value = "The last name of the user.")
	public String getLastname() {
		return lastname;
	}

	public HumanUser primaryAccount(Account primaryAccount) {
		this.primaryAccount = primaryAccount;
		return this;
	}

	/**
	 * The primary account links the user to a specific account.
	 *
	 * @return The primary account links the user to a specific account.
	 */
	@ApiModelProperty(example = "null", value = "The primary account links the user to a specific account.")
	public Account getPrimaryAccount() {
		return primaryAccount;
	}

	public void setPrimaryAccount(Account primaryAccount) {
		this.primaryAccount = primaryAccount;
	}

	public HumanUser scope(Scope scope) {
		this.scope = scope;
		return this;
	}

	/**
	 * The scope to which the user belongs to.
	 *
	 * @return The scope to which the user belongs to.
	 */
	@ApiModelProperty(example = "null", value = "The scope to which the user belongs to.")
	public Scope getScope() {
		return scope;
	}

	public void setScope(Scope scope) {
		this.scope = scope;
	}

	/**
	 * The time zone which is applied for the user. If no timezone is specified the browser is used to determine an appropriate time zone.
	 *
	 * @return The time zone which is applied for the user. If no timezone is specified the browser is used to determine an appropriate time zone.
	 */
	@ApiModelProperty(example = "null", value = "The time zone which is applied for the user. If no timezone is specified the browser is used to determine an appropriate time zone.")
	public String getTimeZone() {
		return timeZone;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		HumanUser humanUser = (HumanUser) o;
		return Objects.equals(this.emailAddress, humanUser.emailAddress) &&
				Objects.equals(this.emailAddressVerified, humanUser.emailAddressVerified) &&
				Objects.equals(this.firstname, humanUser.firstname) &&
				Objects.equals(this.language, humanUser.language) &&
				Objects.equals(this.lastname, humanUser.lastname) &&
				Objects.equals(this.primaryAccount, humanUser.primaryAccount) &&
				Objects.equals(this.scope, humanUser.scope) &&
				Objects.equals(this.timeZone, humanUser.timeZone) &&
				super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(emailAddress, emailAddressVerified, firstname, language, lastname, primaryAccount, scope, timeZone, super.hashCode());
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class HumanUser {\n");
		sb.append("		").append(toIndentedString(super.toString())).append("\n");
		sb.append("		emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
		sb.append("		emailAddressVerified: ").append(toIndentedString(emailAddressVerified)).append("\n");
		sb.append("		firstname: ").append(toIndentedString(firstname)).append("\n");
		sb.append("		language: ").append(toIndentedString(language)).append("\n");
		sb.append("		lastname: ").append(toIndentedString(lastname)).append("\n");
		sb.append("		primaryAccount: ").append(toIndentedString(primaryAccount)).append("\n");
		sb.append("		scope: ").append(toIndentedString(scope)).append("\n");
		sb.append("		timeZone: ").append(toIndentedString(timeZone)).append("\n");
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

