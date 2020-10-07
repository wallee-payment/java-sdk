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
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * AbstractSubscriptionAffiliateUpdate
 */

public class AbstractSubscriptionAffiliateUpdate extends Indentable {

    @JsonProperty("language")
    protected String language;

    @JsonProperty("metaData")
    protected Map<String, String> metaData;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("state")
    protected CreationEntityState state;


    public AbstractSubscriptionAffiliateUpdate language(String language) {
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


    public AbstractSubscriptionAffiliateUpdate metaData(Map<String, String> metaData) {
        this.metaData = metaData;
        return this;
    }

    public AbstractSubscriptionAffiliateUpdate putMetaDataItem(String key, String metaDataItem) {
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


    public AbstractSubscriptionAffiliateUpdate name(String name) {
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


    public AbstractSubscriptionAffiliateUpdate state(CreationEntityState state) {
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
        AbstractSubscriptionAffiliateUpdate abstractSubscriptionAffiliateUpdate = (AbstractSubscriptionAffiliateUpdate) o;
        return Objects.equals(this.language, abstractSubscriptionAffiliateUpdate.language) &&
                Objects.equals(this.metaData, abstractSubscriptionAffiliateUpdate.metaData) &&
                Objects.equals(this.name, abstractSubscriptionAffiliateUpdate.name) && this.state
                == abstractSubscriptionAffiliateUpdate.state;
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, metaData, name, state);
    }


    @Override
    public String toString() {

        return "class AbstractSubscriptionAffiliateUpdate { \n" +
            "    language: " + toIndentedString(language) + " \n" +
            "    metaData: " + toIndentedString(metaData) + " \n" +
            "    name: " + toIndentedString(name) + " \n" +
            "    state: " + toIndentedString(state) + " \n" +
            "}";
    }

}

