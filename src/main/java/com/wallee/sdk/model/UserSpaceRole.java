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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;


@ApiModel(description = "")

public class UserSpaceRole extends Indentable {

    @JsonProperty("id")
    protected Long id;


    @JsonProperty("role")
    protected Long role;


    @JsonProperty("space")
    protected Long space;


    @JsonProperty("user")
    protected Long user;


    @JsonProperty("version")
    protected Integer version;


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
     * @return role
     **/
    @ApiModelProperty(value = "")
    public Long getRole() {
        return role;
    }


    /**
     * @return space
     **/
    @ApiModelProperty(value = "")
    public Long getSpace() {
        return space;
    }


    /**
     * @return user
     **/
    @ApiModelProperty(value = "")
    public Long getUser() {
        return user;
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

        return "class UserSpaceRole { \n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    role: " + toIndentedString(role) + " \n" +
            "    space: " + toIndentedString(space) + "\n" +
            "    user: " + toIndentedString(user) + " \n" +
            "    version: " + toIndentedString(version) + "\n" +
            "}";
        }


}

