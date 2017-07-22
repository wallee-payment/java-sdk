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
import com.wallee.sdk.model.Account;
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.SpaceAddress;
import com.wallee.sdk.model.TenantDatabase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * 
 */
@io.swagger.annotations.ApiModel(description = "")
public class Space {
	@SerializedName("account")
	private Account account = null;

	@SerializedName("active")
	private Boolean active = null;

	@SerializedName("activeOrRestrictedActive")
	private Boolean activeOrRestrictedActive = null;

	@SerializedName("database")
	private TenantDatabase database = null;

	@SerializedName("id")
	private Long id = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("plannedPurgeDate")
	private DateTime plannedPurgeDate = null;

	@SerializedName("postalAddress")
	private SpaceAddress postalAddress = null;

	@SerializedName("requestLimit")
	private Long requestLimit = null;

	@SerializedName("restrictedActive")
	private Boolean restrictedActive = null;

	@SerializedName("state")
	private CreationEntityState state = null;

	@SerializedName("technicalContactAddresses")
	private List<String> technicalContactAddresses = new ArrayList<String>();

	@SerializedName("timeZone")
	private String timeZone = null;

	@SerializedName("version")
	private Integer version = null;

	public Space account(Account account) {
		this.account = account;
		return this;
	}

	/**
	 * The account to which the space belongs to.
	 *
	 * @return The account to which the space belongs to.
	 */
	@ApiModelProperty(example = "null", value = "The account to which the space belongs to.")
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	/**
	 * Active means that this account and all accounts in the hierarchy are active.
	 *
	 * @return Active means that this account and all accounts in the hierarchy are active.
	 */
	@ApiModelProperty(example = "null", value = "Active means that this account and all accounts in the hierarchy are active.")
	public Boolean getActive() {
		return active;
	}

	/**
	 * This property is true when all accounts in the hierarchy are active or restricted active.
	 *
	 * @return This property is true when all accounts in the hierarchy are active or restricted active.
	 */
	@ApiModelProperty(example = "null", value = "This property is true when all accounts in the hierarchy are active or restricted active.")
	public Boolean getActiveOrRestrictedActive() {
		return activeOrRestrictedActive;
	}

	public Space database(TenantDatabase database) {
		this.database = database;
		return this;
	}

	/**
	 * The database in which the space's data are stored in.
	 *
	 * @return The database in which the space's data are stored in.
	 */
	@ApiModelProperty(example = "null", value = "The database in which the space's data are stored in.")
	public TenantDatabase getDatabase() {
		return database;
	}

	public void setDatabase(TenantDatabase database) {
		this.database = database;
	}

	public Space id(Long id) {
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
	 * The space name is used internally to identify the space in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.
	 *
	 * @return The space name is used internally to identify the space in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.
	 */
	@ApiModelProperty(example = "null", value = "The space name is used internally to identify the space in administrative interfaces. For example it is used within search fields and hence it should be distinct and descriptive.")
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

	public Space postalAddress(SpaceAddress postalAddress) {
		this.postalAddress = postalAddress;
		return this;
	}

	/**
	 * The address to use in communication with clients for example in email, documents etc.
	 *
	 * @return The address to use in communication with clients for example in email, documents etc.
	 */
	@ApiModelProperty(example = "null", value = "The address to use in communication with clients for example in email, documents etc.")
	public SpaceAddress getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(SpaceAddress postalAddress) {
		this.postalAddress = postalAddress;
	}

	/**
	 * The request limit defines the maximum number of API request accepted within 2 minutes per cluster node. This limit can only be changed with special privileges.
	 *
	 * @return The request limit defines the maximum number of API request accepted within 2 minutes per cluster node. This limit can only be changed with special privileges.
	 */
	@ApiModelProperty(example = "null", value = "The request limit defines the maximum number of API request accepted within 2 minutes per cluster node. This limit can only be changed with special privileges.")
	public Long getRequestLimit() {
		return requestLimit;
	}

	/**
	 * Restricted active means that at least one account in the hierarchy is only restricted active, but all are either restricted active or active.
	 *
	 * @return Restricted active means that at least one account in the hierarchy is only restricted active, but all are either restricted active or active.
	 */
	@ApiModelProperty(example = "null", value = "Restricted active means that at least one account in the hierarchy is only restricted active, but all are either restricted active or active.")
	public Boolean getRestrictedActive() {
		return restrictedActive;
	}

	public Space state(CreationEntityState state) {
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

	public Space technicalContactAddresses(List<String> technicalContactAddresses) {
		this.technicalContactAddresses = technicalContactAddresses;
		return this;
	}

	public Space addTechnicalContactAddressesItem(String technicalContactAddressesItem) {
		this.technicalContactAddresses.add(technicalContactAddressesItem);
		return this;
	}

	/**
	 * The email address provided as contact addresses will be informed about technical issues or errors triggered by the space.
	 *
	 * @return The email address provided as contact addresses will be informed about technical issues or errors triggered by the space.
	 */
	@ApiModelProperty(example = "null", value = "The email address provided as contact addresses will be informed about technical issues or errors triggered by the space.")
	public List<String> getTechnicalContactAddresses() {
		return technicalContactAddresses;
	}

	public void setTechnicalContactAddresses(List<String> technicalContactAddresses) {
		this.technicalContactAddresses = technicalContactAddresses;
	}

	/**
	 * The time zone assigned to the space determines the time offset for calculating dates within the space. This is typically used for background processed which needs to be triggered on a specific hour within the day. Changing the space time zone will not change the display of dates.
	 *
	 * @return The time zone assigned to the space determines the time offset for calculating dates within the space. This is typically used for background processed which needs to be triggered on a specific hour within the day. Changing the space time zone will not change the display of dates.
	 */
	@ApiModelProperty(example = "null", value = "The time zone assigned to the space determines the time offset for calculating dates within the space. This is typically used for background processed which needs to be triggered on a specific hour within the day. Changing the space time zone will not change the display of dates.")
	public String getTimeZone() {
		return timeZone;
	}

	public Space version(Integer version) {
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
		Space space = (Space) o;
		return Objects.equals(this.account, space.account) &&
				Objects.equals(this.active, space.active) &&
				Objects.equals(this.activeOrRestrictedActive, space.activeOrRestrictedActive) &&
				Objects.equals(this.database, space.database) &&
				Objects.equals(this.id, space.id) &&
				Objects.equals(this.name, space.name) &&
				Objects.equals(this.plannedPurgeDate, space.plannedPurgeDate) &&
				Objects.equals(this.postalAddress, space.postalAddress) &&
				Objects.equals(this.requestLimit, space.requestLimit) &&
				Objects.equals(this.restrictedActive, space.restrictedActive) &&
				Objects.equals(this.state, space.state) &&
				Objects.equals(this.technicalContactAddresses, space.technicalContactAddresses) &&
				Objects.equals(this.timeZone, space.timeZone) &&
				Objects.equals(this.version, space.version);
	}

	@Override
	public int hashCode() {
		return Objects.hash(account, active, activeOrRestrictedActive, database, id, name, plannedPurgeDate, postalAddress, requestLimit, restrictedActive, state, technicalContactAddresses, timeZone, version);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Space {\n");
		
		sb.append("		account: ").append(toIndentedString(account)).append("\n");
		sb.append("		active: ").append(toIndentedString(active)).append("\n");
		sb.append("		activeOrRestrictedActive: ").append(toIndentedString(activeOrRestrictedActive)).append("\n");
		sb.append("		database: ").append(toIndentedString(database)).append("\n");
		sb.append("		id: ").append(toIndentedString(id)).append("\n");
		sb.append("		name: ").append(toIndentedString(name)).append("\n");
		sb.append("		plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
		sb.append("		postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
		sb.append("		requestLimit: ").append(toIndentedString(requestLimit)).append("\n");
		sb.append("		restrictedActive: ").append(toIndentedString(restrictedActive)).append("\n");
		sb.append("		state: ").append(toIndentedString(state)).append("\n");
		sb.append("		technicalContactAddresses: ").append(toIndentedString(technicalContactAddresses)).append("\n");
		sb.append("		timeZone: ").append(toIndentedString(timeZone)).append("\n");
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

