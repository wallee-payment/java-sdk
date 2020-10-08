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

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")

public class DatabaseTranslatedStringItemCreate extends Indentable {

    @JsonProperty("language")
    protected String language;


    @JsonProperty("translation")
    protected String translation;


    public DatabaseTranslatedStringItemCreate language(String language) {
        this.language = language;
        return this;
    }

    /**
     * @return language
     **/
    @ApiModelProperty(required = true, value = "")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


    public DatabaseTranslatedStringItemCreate translation(String translation) {
        this.translation = translation;
        return this;
    }

    /**
     * @return translation
     **/
    @ApiModelProperty(value = "")
    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DatabaseTranslatedStringItemCreate databaseTranslatedStringItemCreate = (DatabaseTranslatedStringItemCreate) o;
        return Objects.equals(this.language, databaseTranslatedStringItemCreate.language) &&
                Objects.equals(this.translation, databaseTranslatedStringItemCreate.translation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, translation);
    }


    @Override
    public String toString() {

        return "class DatabaseTranslatedStringItemCreate { \n" +
            "    language: " + toIndentedString(language) + "\n" +
            "    translation: " + toIndentedString(translation) + "\n" +
            "}";
        }


}

