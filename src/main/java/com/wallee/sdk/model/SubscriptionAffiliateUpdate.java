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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wallee.sdk.model.enums.CreationEntityState;

@ApiModel(description = "")

public class SubscriptionAffiliateUpdate extends Indentable implements UpsertableEntity {

    @JsonProperty("id")
    protected Long id;


    @JsonProperty("version")
    protected Long version;


    @JsonProperty("language")
    protected String language;


    @JsonProperty("metaData")
    protected Map<String, String> metaData;


    @JsonProperty("name")
    protected String name;


    @JsonProperty("state")
    protected CreationEntityState state;


    public SubscriptionAffiliateUpdate id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The ID is the primary key of the entity. The ID identifies the entity uniquely.
     *
     * @return id
     **/
    @ApiModelProperty(required = true, value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public SubscriptionAffiliateUpdate version(Long version) {
        this.version = version;
        return this;
    }

    /**
     * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
     *
     * @return version
     **/
    @ApiModelProperty(required = true, value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }


    public SubscriptionAffiliateUpdate language(String language) {
        this.language = language;
        return this;
    }

    /**
     * @return language
     **/
    @ApiModelProperty(value = "")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


    public SubscriptionAffiliateUpdate metaData(Map<String, String> metaData) {
        this.metaData = metaData;
        return this;
    }

    public SubscriptionAffiliateUpdate putMetaDataItem(String key, String metaDataItem) {
        if (this.metaData == null) {
            this.metaData = new HashMap<>();
        }
        this.metaData.put(key, metaDataItem);
        return this;
    }

    /**
     * Meta data allow to store additional data along the object.
     *
     * @return metaData
     **/
    @ApiModelProperty(value = "Meta data allow to store additional data along the object.")
    public Map<String, String> getMetaData() {
        return metaData;
    }

    public void setMetaData(Map<String, String> metaData) {
        this.metaData = metaData;
    }


    public SubscriptionAffiliateUpdate name(String name) {
        this.name = name;
        return this;
    }

    /**
     * @return name
     **/
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public SubscriptionAffiliateUpdate state(CreationEntityState state) {
        this.state = state;
        return this;
    }

    /**
     * @return state
     **/
    @ApiModelProperty(value = "")
    public CreationEntityState getState() {
        return state;
    }

    public void setState(CreationEntityState state) {
        this.state = state;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriptionAffiliateUpdate subscriptionAffiliateUpdate = (SubscriptionAffiliateUpdate) o;
        return Objects.equals(this.id, subscriptionAffiliateUpdate.id) &&
                Objects.equals(this.version, subscriptionAffiliateUpdate.version) &&
                Objects.equals(this.language, subscriptionAffiliateUpdate.language) &&
                Objects.equals(this.metaData, subscriptionAffiliateUpdate.metaData) &&
                Objects.equals(this.name, subscriptionAffiliateUpdate.name) && this.state == subscriptionAffiliateUpdate.state;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, language, metaData, name, state);
    }


    @Override
    public String toString() {

      return "class SubscriptionAffiliateUpdate { \n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    version: " + toIndentedString(version) + " \n" +
            "    language: " + toIndentedString(language) + " \n" +
            "    metaData: " + toIndentedString(metaData) + " \n" +
            "    name: " + toIndentedString(name) + " \n" +
            "    state: " + toIndentedString(state) + " \n" +
            "}";
      }


}

