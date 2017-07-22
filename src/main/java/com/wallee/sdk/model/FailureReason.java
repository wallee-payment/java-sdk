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
import com.wallee.sdk.model.FailureCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
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

	public FailureReason category(FailureCategory category) {
		this.category = category;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public FailureCategory getCategory() {
		return category;
	}

	public void setCategory(FailureCategory category) {
		this.category = category;
	}

	public FailureReason description(Map<String, String> description) {
		this.description = description;
		return this;
	}

	public FailureReason putDescriptionItem(String key, String descriptionItem) {
		this.description.put(key, descriptionItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Map<String, String> getDescription() {
		return description;
	}

	public void setDescription(Map<String, String> description) {
		this.description = description;
	}

	public FailureReason features(List<Long> features) {
		this.features = features;
		return this;
	}

	public FailureReason addFeaturesItem(Long featuresItem) {
		this.features.add(featuresItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public List<Long> getFeatures() {
		return features;
	}

	public void setFeatures(List<Long> features) {
		this.features = features;
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

	public FailureReason name(Map<String, String> name) {
		this.name = name;
		return this;
	}

	public FailureReason putNameItem(String key, String nameItem) {
		this.name.put(key, nameItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Map<String, String> getName() {
		return name;
	}

	public void setName(Map<String, String> name) {
		this.name = name;
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

