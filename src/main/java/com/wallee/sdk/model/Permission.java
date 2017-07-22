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
public class Permission {
	@SerializedName("description")
	private Map<String, String> description = new HashMap<String, String>();

	@SerializedName("feature")
	private Long feature = null;

	@SerializedName("group")
	private Boolean group = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("leaf")
	private Boolean leaf = null;

	@SerializedName("name")
	private Map<String, String> name = new HashMap<String, String>();

	@SerializedName("parent")
	private Long parent = null;

	@SerializedName("pathToRoot")
	private List<Long> pathToRoot = new ArrayList<Long>();

	@SerializedName("title")
	private Map<String, String> title = new HashMap<String, String>();

	public Permission description(Map<String, String> description) {
		this.description = description;
		return this;
	}

	public Permission putDescriptionItem(String key, String descriptionItem) {
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
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Boolean getGroup() {
		return group;
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
	public Boolean getLeaf() {
		return leaf;
	}

	public Permission name(Map<String, String> name) {
		this.name = name;
		return this;
	}

	public Permission putNameItem(String key, String nameItem) {
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

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public Long getParent() {
		return parent;
	}

	public Permission pathToRoot(List<Long> pathToRoot) {
		this.pathToRoot = pathToRoot;
		return this;
	}

	public Permission addPathToRootItem(Long pathToRootItem) {
		this.pathToRoot.add(pathToRootItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public List<Long> getPathToRoot() {
		return pathToRoot;
	}

	public void setPathToRoot(List<Long> pathToRoot) {
		this.pathToRoot = pathToRoot;
	}

	public Permission title(Map<String, String> title) {
		this.title = title;
		return this;
	}

	public Permission putTitleItem(String key, String titleItem) {
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
		Permission permission = (Permission) o;
		return Objects.equals(this.description, permission.description) &&
				Objects.equals(this.feature, permission.feature) &&
				Objects.equals(this.group, permission.group) &&
				Objects.equals(this.id, permission.id) &&
				Objects.equals(this.leaf, permission.leaf) &&
				Objects.equals(this.name, permission.name) &&
				Objects.equals(this.parent, permission.parent) &&
				Objects.equals(this.pathToRoot, permission.pathToRoot) &&
				Objects.equals(this.title, permission.title);
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, feature, group, id, leaf, name, parent, pathToRoot, title);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Permission {\n");
		
		sb.append("		description: ").append(toIndentedString(description)).append("\n");
		sb.append("		feature: ").append(toIndentedString(feature)).append("\n");
		sb.append("		group: ").append(toIndentedString(group)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		leaf: ").append(toIndentedString(leaf)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		parent: ").append(toIndentedString(parent)).append("\n");
		sb.append("		pathToRoot: ").append(toIndentedString(pathToRoot)).append("\n");
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

