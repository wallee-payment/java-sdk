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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Permission
 */
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

	@SerializedName("twoFactorRequired")
	private Boolean twoFactorRequired = null;

	/**
	 * description
	 *
	 * @return description
	 */
	public Map<String, String> getDescription() {
		return description;
	}

	/**
	 * feature
	 *
	 * @return feature
	 */
	public Long getFeature() {
		return feature;
	}

	/**
	 * group
	 *
	 * @return group
	 */
	public Boolean getGroup() {
		return group;
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
	 * leaf
	 *
	 * @return leaf
	 */
	public Boolean getLeaf() {
		return leaf;
	}

	/**
	 * name
	 *
	 * @return name
	 */
	public Map<String, String> getName() {
		return name;
	}

	/**
	 * parent
	 *
	 * @return parent
	 */
	public Long getParent() {
		return parent;
	}

	/**
	 * pathToRoot
	 *
	 * @return pathToRoot
	 */
	public List<Long> getPathToRoot() {
		return pathToRoot;
	}

	/**
	 * title
	 *
	 * @return title
	 */
	public Map<String, String> getTitle() {
		return title;
	}

	/**
	 * twoFactorRequired
	 *
	 * @return twoFactorRequired
	 */
	public Boolean getTwoFactorRequired() {
		return twoFactorRequired;
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
				Objects.equals(this.title, permission.title) &&
				Objects.equals(this.twoFactorRequired, permission.twoFactorRequired);
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, feature, group, id, leaf, name, parent, pathToRoot, title, twoFactorRequired);
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
		sb.append("		twoFactorRequired: ").append(toIndentedString(twoFactorRequired)).append("\n");
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

