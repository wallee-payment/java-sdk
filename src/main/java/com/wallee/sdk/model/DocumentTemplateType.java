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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class DocumentTemplateType {
	@SerializedName("description")
	private Map<String, String> description = new HashMap<String, String>();

	@SerializedName("feature")
	private Long feature = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("templateResource")
	private String templateResource = null;

	@SerializedName("title")
	private Map<String, String> title = new HashMap<String, String>();

	public DocumentTemplateType description(Map<String, String> description) {
		this.description = description;
		return this;
	}

	public DocumentTemplateType putDescriptionItem(String key, String descriptionItem) {
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
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Long getFeature() {
		return feature;
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
	public String getTemplateResource() {
		return templateResource;
	}

	public DocumentTemplateType title(Map<String, String> title) {
		this.title = title;
		return this;
	}

	public DocumentTemplateType putTitleItem(String key, String titleItem) {
		this.title.put(key, titleItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Map<String, String> getTitle() {
		return title;
	}

	public void setTitle(Map<String, String> title) {
		this.title = title;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DocumentTemplateType documentTemplateType = (DocumentTemplateType) o;
		return Objects.equals(this.description, documentTemplateType.description) &&
				Objects.equals(this.feature, documentTemplateType.feature) &&
				Objects.equals(this.id, documentTemplateType.id) &&
				Objects.equals(this.templateResource, documentTemplateType.templateResource) &&
				Objects.equals(this.title, documentTemplateType.title);
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, feature, id, templateResource, title);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DocumentTemplateType {\n");
		
		sb.append("		description: ").append(toIndentedString(description)).append("\n");
		sb.append("		feature: ").append(toIndentedString(feature)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		templateResource: ").append(toIndentedString(templateResource)).append("\n");
		sb.append("		title: ").append(toIndentedString(title)).append("\n");
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

