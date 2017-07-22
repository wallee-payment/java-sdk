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
import com.wallee.sdk.model.ClientErrorType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * An error that is returned as the result of a bad user request or a misconfiguration.
 */
@io.swagger.annotations.ApiModel(description = "An error that is returned as the result of a bad user request or a misconfiguration.")
public class ClientError {
	@SerializedName("date")
	private String date = null;

	@SerializedName("defaultMessage")
	private String defaultMessage = null;

	@SerializedName("id")
	private String id = null;

	@SerializedName("message")
	private String message = null;

	@SerializedName("type")
	private ClientErrorType type = null;

	/**
	 * Date when an error has occurred.
	 *
	 * @return Date when an error has occurred.
	 */
	@ApiModelProperty(example = "null", value = "Date when an error has occurred.")
	public String getDate() {
		return date;
	}

	/**
	 * The error message which is translated into the default language (i.e. English).
	 *
	 * @return The error message which is translated into the default language (i.e. English).
	 */
	@ApiModelProperty(example = "null", value = "The error message which is translated into the default language (i.e. English).")
	public String getDefaultMessage() {
		return defaultMessage;
	}

	/**
	 * Unique identifier of an error.
	 *
	 * @return Unique identifier of an error.
	 */
	@ApiModelProperty(example = "null", value = "Unique identifier of an error.")
	public String getId() {
		return id;
	}

	/**
	 * The error message which is translated in into the language of the client.
	 *
	 * @return The error message which is translated in into the language of the client.
	 */
	@ApiModelProperty(example = "null", value = "The error message which is translated in into the language of the client.")
	public String getMessage() {
		return message;
	}

	public ClientError type(ClientErrorType type) {
		this.type = type;
		return this;
	}

	/**
	 * The type of the client error.
	 *
	 * @return The type of the client error.
	 */
	@ApiModelProperty(example = "null", value = "The type of the client error.")
	public ClientErrorType getType() {
		return type;
	}

	public void setType(ClientErrorType type) {
		this.type = type;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ClientError clientError = (ClientError) o;
		return Objects.equals(this.date, clientError.date) &&
				Objects.equals(this.defaultMessage, clientError.defaultMessage) &&
				Objects.equals(this.id, clientError.id) &&
				Objects.equals(this.message, clientError.message) &&
				Objects.equals(this.type, clientError.type);
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, defaultMessage, id, message, type);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ClientError {\n");
		
		sb.append("		date: ").append(toIndentedString(date)).append("\n");
		sb.append("		defaultMessage: ").append(toIndentedString(defaultMessage)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		message: ").append(toIndentedString(message)).append("\n");
		sb.append("		type: ").append(toIndentedString(type)).append("\n");
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

