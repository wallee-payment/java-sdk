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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class Feature {
	@SerializedName("beta")
	private Boolean beta = null;

	@SerializedName("description")
	private Map<String, String> description = new HashMap<String, String>();

	@SerializedName("id")
	private Long id = null;

	@SerializedName("logoPath")
	private String logoPath = null;

	@SerializedName("name")
	private Map<String, String> name = new HashMap<String, String>();

	@SerializedName("requiredFeatures")
	private List<Long> requiredFeatures = new ArrayList<Long>();

	@SerializedName("sortOrder")
	private Integer sortOrder = null;

	@SerializedName("visible")
	private Boolean visible = null;

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Boolean getBeta() {
		return beta;
	}

	public Feature description(Map<String, String> description) {
		this.description = description;
		return this;
	}

	public Feature putDescriptionItem(String key, String descriptionItem) {
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

	/**
	 * The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 *
	 * @return The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 */
	@ApiModelProperty(example = "null", value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
	public Long getId() {
		return id;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getLogoPath() {
		return logoPath;
	}

	public Feature name(Map<String, String> name) {
		this.name = name;
		return this;
	}

	public Feature putNameItem(String key, String nameItem) {
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

	public Feature requiredFeatures(List<Long> requiredFeatures) {
		this.requiredFeatures = requiredFeatures;
		return this;
	}

	public Feature addRequiredFeaturesItem(Long requiredFeaturesItem) {
		this.requiredFeatures.add(requiredFeaturesItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public List<Long> getRequiredFeatures() {
		return requiredFeatures;
	}

	public void setRequiredFeatures(List<Long> requiredFeatures) {
		this.requiredFeatures = requiredFeatures;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Integer getSortOrder() {
		return sortOrder;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Boolean getVisible() {
		return visible;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Feature feature = (Feature) o;
		return Objects.equals(this.beta, feature.beta) &&
				Objects.equals(this.description, feature.description) &&
				Objects.equals(this.id, feature.id) &&
				Objects.equals(this.logoPath, feature.logoPath) &&
				Objects.equals(this.name, feature.name) &&
				Objects.equals(this.requiredFeatures, feature.requiredFeatures) &&
				Objects.equals(this.sortOrder, feature.sortOrder) &&
				Objects.equals(this.visible, feature.visible);
	}

	@Override
	public int hashCode() {
		return Objects.hash(beta, description, id, logoPath, name, requiredFeatures, sortOrder, visible);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Feature {\n");
		
		sb.append("		beta: ").append(toIndentedString(beta)).append("\n");
		sb.append("		description: ").append(toIndentedString(description)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		logoPath: ").append(toIndentedString(logoPath)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		requiredFeatures: ").append(toIndentedString(requiredFeatures)).append("\n");
		sb.append("		sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
		sb.append("		visible: ").append(toIndentedString(visible)).append("\n");
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

