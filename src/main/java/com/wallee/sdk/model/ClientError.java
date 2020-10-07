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
import com.wallee.sdk.model.enums.ClientErrorType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * An error that is returned as the result of a bad user request or a misconfiguration.
 */
@ApiModel(description = "An error that is returned as the result of a bad user request or a misconfiguration.")

public class ClientError extends Indentable {

    @JsonProperty("date")
    protected String date;


    @JsonProperty("defaultMessage")
    protected String defaultMessage;


    @JsonProperty("id")
    protected String id;


    @JsonProperty("message")
    protected String message;


    @JsonProperty("type")
    protected ClientErrorType type;


    /**
     * Date when an error has occurred.
     *
     * @return date
     **/
    @ApiModelProperty(value = "Date when an error has occurred.")
    public String getDate() {
        return date;
    }


    /**
     * The error message which is translated into the default language (i.e. English).
     *
     * @return defaultMessage
     **/
    @ApiModelProperty(value = "The error message which is translated into the default language (i.e. English).")
    public String getDefaultMessage() {
        return defaultMessage;
    }


    /**
     * Unique identifier of an error.
     *
     * @return id
     **/
    @ApiModelProperty(value = "Unique identifier of an error.")
    public String getId() {
        return id;
    }


    /**
     * The error message which is translated in into the language of the client.
     *
     * @return message
     **/
    @ApiModelProperty(value = "The error message which is translated in into the language of the client.")
    public String getMessage() {
        return message;
    }


    /**
     * The type of the client error.
     *
     * @return type
     **/
    @ApiModelProperty(value = "The type of the client error.")
    public ClientErrorType getType() {
        return type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClientError clientError = (ClientError) o;
        return Objects.equals(this.date, clientError.date) &&
                Objects.equals(this.defaultMessage, clientError.defaultMessage) &&
                Objects.equals(this.id, clientError.id) &&
                Objects.equals(this.message, clientError.message) && this.type == clientError.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, defaultMessage, id, message, type);
    }


    @Override
    public String toString() {

        return "class ClientError { \n" +
            "    date: " + toIndentedString(date) + " \n" +
            "    defaultMessage: " + toIndentedString(defaultMessage) + " \n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    message: " + toIndentedString(message) + " \n" +
            "    type: " + toIndentedString(type) + " \n" +
            "}";
        }


}

