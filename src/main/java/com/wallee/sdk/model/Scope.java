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
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.Feature;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class Scope {
	@SerializedName("domainName")
	private String domainName = null;

	@SerializedName("features")
	private List<Feature> features = new ArrayList<Feature>();

	@SerializedName("id")
	private Long id = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("plannedPurgeDate")
	private DateTime plannedPurgeDate = null;

	@SerializedName("port")
	private Integer port = null;

	@SerializedName("sslActive")
	private Boolean sslActive = null;

	@SerializedName("state")
	private CreationEntityState state = null;

	@SerializedName("themes")
	private List<String> themes = new ArrayList<String>();

	@SerializedName("url")
	private String url = null;

	@SerializedName("version")
	private Integer version = null;

	/**
	 * The domain name to which this scope is mapped to.
	 *
	 * @return The domain name to which this scope is mapped to.
	 */
	@ApiModelProperty(example = "null", value = "The domain name to which this scope is mapped to.")
	public String getDomainName() {
		return domainName;
	}

	public Scope features(List<Feature> features) {
		this.features = features;
		return this;
	}

	public Scope addFeaturesItem(Feature featuresItem) {
		this.features.add(featuresItem);
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public List<Feature> getFeatures() {
		return features;
	}

	public void setFeatures(List<Feature> features) {
		this.features = features;
	}

	public Scope id(Long id) {
		this.id = id;
		return this;
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

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * The name of the scope is shown to the user where the user should select a scope.
	 *
	 * @return The name of the scope is shown to the user where the user should select a scope.
	 */
	@ApiModelProperty(example = "null", value = "The name of the scope is shown to the user where the user should select a scope.")
	public String getName() {
		return name;
	}

	/**
	 * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 *
	 * @return The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
	 */
	@ApiModelProperty(example = "null", value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
	public DateTime getPlannedPurgeDate() {
		return plannedPurgeDate;
	}

	/**
	 * The port number to which this scope is mapped to.
	 *
	 * @return The port number to which this scope is mapped to.
	 */
	@ApiModelProperty(example = "null", value = "The port number to which this scope is mapped to.")
	public Integer getPort() {
		return port;
	}

	/**
	 * Define whether the scope supports SSL.
	 *
	 * @return Define whether the scope supports SSL.
	 */
	@ApiModelProperty(example = "null", value = "Define whether the scope supports SSL.")
	public Boolean getSslActive() {
		return sslActive;
	}

	public Scope state(CreationEntityState state) {
		this.state = state;
		return this;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public CreationEntityState getState() {
		return state;
	}

	public void setState(CreationEntityState state) {
		this.state = state;
	}

	public Scope themes(List<String> themes) {
		this.themes = themes;
		return this;
	}

	public Scope addThemesItem(String themesItem) {
		this.themes.add(themesItem);
		return this;
	}

	/**
	 * The themes determines how the application layout, look and feel is. By providing multiple themes you can fallback to other themes.
	 *
	 * @return The themes determines how the application layout, look and feel is. By providing multiple themes you can fallback to other themes.
	 */
	@ApiModelProperty(example = "null", value = "The themes determines how the application layout, look and feel is. By providing multiple themes you can fallback to other themes.")
	public List<String> getThemes() {
		return themes;
	}

	public void setThemes(List<String> themes) {
		this.themes = themes;
	}

	/**
	 * 
	 *
	 * @return 
	 */
	@ApiModelProperty(example = "null", value = "")
	public String getUrl() {
		return url;
	}

	public Scope version(Integer version) {
		this.version = version;
		return this;
	}

	/**
	 * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 *
	 * @return The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
	 */
	@ApiModelProperty(example = "null", value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}


	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Scope scope = (Scope) o;
		return Objects.equals(this.domainName, scope.domainName) &&
				Objects.equals(this.features, scope.features) &&
				Objects.equals(this.id, scope.id) &&
				Objects.equals(this.name, scope.name) &&
				Objects.equals(this.plannedPurgeDate, scope.plannedPurgeDate) &&
				Objects.equals(this.port, scope.port) &&
				Objects.equals(this.sslActive, scope.sslActive) &&
				Objects.equals(this.state, scope.state) &&
				Objects.equals(this.themes, scope.themes) &&
				Objects.equals(this.url, scope.url) &&
				Objects.equals(this.version, scope.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(domainName, features, id, name, plannedPurgeDate, port, sslActive, state, themes, url, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Scope {\n");
		
		sb.append("		domainName: ").append(toIndentedString(domainName)).append("\n");
		sb.append("		features: ").append(toIndentedString(features)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		port: ").append(toIndentedString(port)).append("\n");
		sb.append("		sslActive: ").append(toIndentedString(sslActive)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("		themes: ").append(toIndentedString(themes)).append("\n");
		sb.append("		url: ").append(toIndentedString(url)).append("\n");
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

