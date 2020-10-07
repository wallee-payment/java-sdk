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

import java.util.List;
import java.util.Objects;


@ApiModel(description = "")

public class LegalOrganizationForm extends Indentable {

    @JsonProperty("country")
    protected String country;


    @JsonProperty("description")
    protected List<LocalizedString> description;


    @JsonProperty("englishDescription")
    protected String englishDescription;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("shortcut")
    protected List<LocalizedString> shortcut;


    /**
     * @return country
     **/
    @ApiModelProperty(value = "")
    public String getCountry() {
        return country;
    }


    /**
     * @return description
     **/
    @ApiModelProperty(value = "")
    public List<LocalizedString> getDescription() {
        return description;
    }


    /**
     * @return englishDescription
     **/
    @ApiModelProperty(value = "")
    public String getEnglishDescription() {
        return englishDescription;
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
     * @return shortcut
     **/
    @ApiModelProperty(value = "")
    public List<LocalizedString> getShortcut() {
        return shortcut;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LegalOrganizationForm legalOrganizationForm = (LegalOrganizationForm) o;
        return Objects.equals(this.country, legalOrganizationForm.country) &&
                Objects.equals(this.description, legalOrganizationForm.description) &&
                Objects.equals(this.englishDescription, legalOrganizationForm.englishDescription) &&
                Objects.equals(this.id, legalOrganizationForm.id) &&
                Objects.equals(this.shortcut, legalOrganizationForm.shortcut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, description, englishDescription, id, shortcut);
    }


    @Override
    public String toString() {

        return "class LegalOrganizationForm { \n" +
            "    country: " + toIndentedString(country) +  "\n" +
            "    description: " + toIndentedString(description) + " \n" +
            "    englishDescription: " +  toIndentedString(englishDescription) + " \n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    shortcut: " +  toIndentedString(shortcut) + " \n" +
            "}";
        }


}

