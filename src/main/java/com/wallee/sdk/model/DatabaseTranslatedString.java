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
import com.wallee.sdk.model.DatabaseTranslatedStringItem;
import java.util.ArrayList;
import java.util.List;

/**
 * DatabaseTranslatedString
 */
public class DatabaseTranslatedString {

	@SerializedName("availableLanguages")
	private List<String> availableLanguages = new ArrayList<String>();

	@SerializedName("displayName")
	private String displayName = null;

	@SerializedName("items")
	private List<DatabaseTranslatedStringItem> items = new ArrayList<DatabaseTranslatedStringItem>();

	/**
	 * availableLanguages
	 *
	 * @return availableLanguages
	 */
	public List<String> getAvailableLanguages() {
		return availableLanguages;
	}

	/**
	 * displayName
	 *
	 * @return displayName
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * items
	 *
	 * @return items
	 */
	public List<DatabaseTranslatedStringItem> getItems() {
		return items;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DatabaseTranslatedString databaseTranslatedString = (DatabaseTranslatedString) o;
		return Objects.equals(this.availableLanguages, databaseTranslatedString.availableLanguages) &&
				Objects.equals(this.displayName, databaseTranslatedString.displayName) &&
				Objects.equals(this.items, databaseTranslatedString.items);
	}

	@Override
	public int hashCode() {
		return Objects.hash(availableLanguages, displayName, items);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DatabaseTranslatedString {\n");
		
		sb.append("		availableLanguages: ").append(toIndentedString(availableLanguages)).append("\n");
		sb.append("		displayName: ").append(toIndentedString(displayName)).append("\n");
		sb.append("		items: ").append(toIndentedString(items)).append("\n");
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

