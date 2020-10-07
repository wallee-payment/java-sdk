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

/**
 * This error is thrown when something unexpected happens on our side.
 */
@ApiModel(description = "This error is thrown when something unexpected happens on our side.")

public class ServerError extends Indentable {

    @JsonProperty("date")
    protected String date;


    @JsonProperty("id")
    protected String id;


    @JsonProperty("message")
    protected String message;


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
     * Unique identifier of an error.
     *
     * @return id
     **/
    @ApiModelProperty(value = "Unique identifier of an error.")
    public String getId() {
        return id;
    }


    /**
     * This message describes an error.
     *
     * @return message
     **/
    @ApiModelProperty(value = "This message describes an error.")
    public String getMessage() {
        return message;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServerError serverError = (ServerError) o;
        return Objects.equals(this.date, serverError.date) &&
                Objects.equals(this.id, serverError.id) &&
                Objects.equals(this.message, serverError.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, id, message);
    }


    @Override
    public String toString() {

        return "class ServerError { \n" +
            "    date: " + toIndentedString(date) + " \n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    message: " + toIndentedString(message) + " \n" +
            "}";
        }


}

