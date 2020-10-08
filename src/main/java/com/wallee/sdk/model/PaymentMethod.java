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

import java.util.List;
import java.util.Map;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wallee.sdk.model.enums.DataCollectionType;

@ApiModel(description = "")

public class PaymentMethod extends Indentable {

    @JsonProperty("dataCollectionTypes")
    protected List<DataCollectionType> dataCollectionTypes;


    @JsonProperty("description")
    protected Map<String, String> description;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("imagePath")
    protected String imagePath;


    @JsonProperty("merchantDescription")
    protected Map<String, String> merchantDescription;


    @JsonProperty("name")
    protected Map<String, String> name;


    @JsonProperty("supportedCurrencies")
    protected List<String> supportedCurrencies;


    /**
     * @return dataCollectionTypes
     **/
    @ApiModelProperty(value = "")
    public List<DataCollectionType> getDataCollectionTypes() {
        return dataCollectionTypes;
    }


    /**
     * @return description
     **/
    @ApiModelProperty(value = "")
    public Map<String, String> getDescription() {
        return description;
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
     * @return imagePath
     **/
    @ApiModelProperty(value = "")
    public String getImagePath() {
        return imagePath;
    }


    /**
     * @return merchantDescription
     **/
    @ApiModelProperty(value = "")
    public Map<String, String> getMerchantDescription() {
        return merchantDescription;
    }


    /**
     * @return name
     **/
    @ApiModelProperty(value = "")
    public Map<String, String> getName() {
        return name;
    }


    /**
     * @return supportedCurrencies
     **/
    @ApiModelProperty(value = "")
    public List<String> getSupportedCurrencies() {
        return supportedCurrencies;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentMethod paymentMethod = (PaymentMethod) o;
        return Objects.equals(this.dataCollectionTypes, paymentMethod.dataCollectionTypes) &&
                Objects.equals(this.description, paymentMethod.description) &&
                Objects.equals(this.id, paymentMethod.id) &&
                Objects.equals(this.imagePath, paymentMethod.imagePath) &&
                Objects.equals(this.merchantDescription, paymentMethod.merchantDescription) &&
                Objects.equals(this.name, paymentMethod.name) &&
                Objects.equals(this.supportedCurrencies, paymentMethod.supportedCurrencies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataCollectionTypes, description, id, imagePath, merchantDescription, name, supportedCurrencies);
    }


    @Override
    public String toString() {

        return "class PaymentMethod { \n" +
            "    dataCollectionTypes: " + toIndentedString(dataCollectionTypes) + "\n" +
            "    description: " + toIndentedString(description) + "\n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    imagePath: " + toIndentedString(imagePath) + "\n" +
            "    merchantDescription: " + toIndentedString(merchantDescription) + " \n" +
            "    name: " + toIndentedString(name) +  " \n" +
            "    supportedCurrencies: " + toIndentedString(supportedCurrencies) + " \n" +
            "}";
        }


}

