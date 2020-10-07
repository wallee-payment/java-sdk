/**
 * SDK
 * <p>
 * This library allows to interact with the  payment service.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.wallee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wallee.sdk.model.enums.CreationEntityState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

@ApiModel(description = "")

public class Role extends Indentable {

    @JsonProperty("account")
    protected Account account;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("name")
    protected DatabaseTranslatedString name;


    @JsonProperty("permissions")
    protected List<Permission> permissions;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("state")
    protected CreationEntityState state;


    @JsonProperty("twoFactorRequired")
    protected Boolean twoFactorRequired;


    @JsonProperty("version")
    protected Integer version;


    /**
     * The account to which this role belongs to. This role can only be assigned within the assigned account and the sub accounts of the assigned account.
     *
     * @return account
     **/
    @ApiModelProperty(value = "The account to which this role belongs to. This role can only be assigned within the assigned account and the sub accounts of the assigned account.")
    public Account getAccount() {
        return account;
    }


    /**
     * The ID is the primary key of the entity. The ID identifies the entity uniquely.
     *
     * @return id
     **/
    @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
    public Long getId() {
        return id;
    }


    /**
     * The name of this role is used to identify the role within administrative interfaces.
     *
     * @return name
     **/
    @ApiModelProperty(value = "The name of this role is used to identify the role within administrative interfaces.")
    public DatabaseTranslatedString getName() {
        return name;
    }


    /**
     * Set of permissions that are granted to this role.
     *
     * @return permissions
     **/
    @ApiModelProperty(value = "Set of permissions that are granted to this role.")
    public List<Permission> getPermissions() {
        return permissions;
    }


    /**
     * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
     *
     * @return plannedPurgeDate
     **/
    @ApiModelProperty(value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
    public OffsetDateTime getPlannedPurgeDate() {
        return plannedPurgeDate;
    }


    /**
     * @return state
     **/
    @ApiModelProperty(value = "")
    public CreationEntityState getState() {
        return state;
    }


    /**
     * Defines whether having been granted this role will force a user to use two-factor authentication.
     *
     * @return twoFactorRequired
     **/
    @ApiModelProperty(value = "Defines whether having been granted this role will force a user to use two-factor authentication.")
    public Boolean isTwoFactorRequired() {
        return twoFactorRequired;
    }


    /**
     * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
     *
     * @return version
     **/
    @ApiModelProperty(value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
    public Integer getVersion() {
        return version;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Role role = (Role) o;
        return Objects.equals(this.account, role.account) &&
                Objects.equals(this.id, role.id) &&
                Objects.equals(this.name, role.name) &&
                Objects.equals(this.permissions, role.permissions) &&
                Objects.equals(this.plannedPurgeDate, role.plannedPurgeDate) && this.state == role.state &&
                Objects.equals(this.twoFactorRequired, role.twoFactorRequired) &&
                Objects.equals(this.version, role.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account, id, name, permissions, plannedPurgeDate, state, twoFactorRequired, version);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Role {\n");

        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    twoFactorRequired: ").append(toIndentedString(twoFactorRequired)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("}");
        return sb.toString();
    }


}

