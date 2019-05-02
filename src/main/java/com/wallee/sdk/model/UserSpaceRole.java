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

/**
 * UserSpaceRole
 */
public class UserSpaceRole {

	@SerializedName("id")
	private Long id = null;

	@SerializedName("role")
	private Long role = null;

	@SerializedName("space")
	private Long space = null;

	@SerializedName("user")
	private Long user = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 *
	 * @return The ID is the primary key of the entity. The ID identifies the entity uniquely.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * role
	 *
	 * @return role
	 */
	public Long getRole() {
		return role;
	}

	/**
	 * space
	 *
	 * @return space
	 */
	public Long getSpace() {
		return space;
	}

	/**
	 * user
	 *
	 * @return user
	 */
	public Long getUser() {
		return user;
	}

	/**
	 * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 *
	 * @return The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 */
	public Integer getVersion() {
		return version;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		UserSpaceRole userSpaceRole = (UserSpaceRole) o;
		return Objects.equals(this.id, userSpaceRole.id) &&
				Objects.equals(this.role, userSpaceRole.role) &&
				Objects.equals(this.space, userSpaceRole.space) &&
				Objects.equals(this.user, userSpaceRole.user) &&
				Objects.equals(this.version, userSpaceRole.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, role, space, user, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UserSpaceRole {\n");
		
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		role: ").append(toIndentedString(role)).append("\n");
		sb.append("		space: ").append(toIndentedString(space)).append("\n");
		sb.append("		user: ").append(toIndentedString(user)).append("\n");
		sb.append("		version: ").append(toIndentedString(version)).append("\n");
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

