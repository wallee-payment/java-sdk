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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class DatabaseTranslatedStringItemCreate {
	@SerializedName("language")
	private String language = null;

	@SerializedName("translation")
	private String translation = null;

	public DatabaseTranslatedStringItemCreate language(String language) {
		this.language = language;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", required = true, value = "")
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public DatabaseTranslatedStringItemCreate translation(String translation) {
		this.translation = translation;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getTranslation() {
		return translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DatabaseTranslatedStringItemCreate databaseTranslatedStringItemCreate = (DatabaseTranslatedStringItemCreate) o;
		return Objects.equals(this.language, databaseTranslatedStringItemCreate.language) &&
				Objects.equals(this.translation, databaseTranslatedStringItemCreate.translation);
	}

	@Override
	public int hashCode() {
		return Objects.hash(language, translation);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DatabaseTranslatedStringItemCreate {\n");
		
		sb.append("		language: ").append(toIndentedString(language)).append("\n");
		sb.append("		translation: ").append(toIndentedString(translation)).append("\n");
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

