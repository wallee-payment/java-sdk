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
import com.wallee.sdk.model.FailureCategory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * FailureReason
 */
public class FailureReason {

	@SerializedName("category")
	private FailureCategory category = null;

	@SerializedName("description")
	private Map<String, String> description = new HashMap<String, String>();

	@SerializedName("features")
	private List<Long> features = new ArrayList<Long>();

	@SerializedName("id")
	private Long id = null;

	@SerializedName("name")
	private Map<String, String> name = new HashMap<String, String>();

	/**
	 * category
	 *
	 * @return category
	 */
	public FailureCategory getCategory() {
		return category;
	}

	/**
	 * description
	 *
	 * @return description
	 */
	public Map<String, String> getDescription() {
		return description;
	}

	/**
	 * features
	 *
	 * @return features
	 */
	public List<Long> getFeatures() {
		return features;
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
	 * name
	 *
	 * @return name
	 */
	public Map<String, String> getName() {
		return name;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FailureReason failureReason = (FailureReason) o;
		return Objects.equals(this.category, failureReason.category) &&
				Objects.equals(this.description, failureReason.description) &&
				Objects.equals(this.features, failureReason.features) &&
				Objects.equals(this.id, failureReason.id) &&
				Objects.equals(this.name, failureReason.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(category, description, features, id, name);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FailureReason {\n");
		
		sb.append("		category: ").append(toIndentedString(category)).append("\n");
		sb.append("		description: ").append(toIndentedString(description)).append("\n");
		sb.append("		features: ").append(toIndentedString(features)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
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

