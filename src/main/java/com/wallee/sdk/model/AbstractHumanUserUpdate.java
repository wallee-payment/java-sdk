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
import com.wallee.sdk.model.CreationEntityState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AbstractHumanUserUpdate
 */
public class AbstractHumanUserUpdate {
	@SerializedName("emailAddress")
	private String emailAddress = null;

	@SerializedName("firstname")
	private String firstname = null;

	@SerializedName("language")
	private String language = null;

	@SerializedName("lastname")
	private String lastname = null;

	@SerializedName("state")
	private CreationEntityState state = null;

	@SerializedName("timeZone")
	private String timeZone = null;

	public AbstractHumanUserUpdate emailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		return this;
	}

	/**
	 * The email address of the user.
	 *
	 * @return The email address of the user.
	 */
	@ApiModelProperty(example = "null", value = "The email address of the user.")
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public AbstractHumanUserUpdate firstname(String firstname) {
		this.firstname = firstname;
		return this;
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

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public AbstractHumanUserUpdate language(String language) {
		this.language = language;
		return this;
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

	public void setLanguage(String language) {
		this.language = language;
	}

	public AbstractHumanUserUpdate lastname(String lastname) {
		this.lastname = lastname;
		return this;
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

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public AbstractHumanUserUpdate state(CreationEntityState state) {
		this.state = state;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public CreationEntityState getState() {
		return state;
	}

	public void setState(CreationEntityState state) {
		this.state = state;
	}

	public AbstractHumanUserUpdate timeZone(String timeZone) {
		this.timeZone = timeZone;
		return this;
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

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AbstractHumanUserUpdate abstractHumanUserUpdate = (AbstractHumanUserUpdate) o;
		return Objects.equals(this.emailAddress, abstractHumanUserUpdate.emailAddress) &&
				Objects.equals(this.firstname, abstractHumanUserUpdate.firstname) &&
				Objects.equals(this.language, abstractHumanUserUpdate.language) &&
				Objects.equals(this.lastname, abstractHumanUserUpdate.lastname) &&
				Objects.equals(this.state, abstractHumanUserUpdate.state) &&
				Objects.equals(this.timeZone, abstractHumanUserUpdate.timeZone);
	}

	@Override
	public int hashCode() {
		return Objects.hash(emailAddress, firstname, language, lastname, state, timeZone);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AbstractHumanUserUpdate {\n");
		
		sb.append("		emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
		sb.append("		firstname: ").append(toIndentedString(firstname)).append("\n");
		sb.append("		language: ").append(toIndentedString(language)).append("\n");
		sb.append("		lastname: ").append(toIndentedString(lastname)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
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

