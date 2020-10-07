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

import java.util.Map;
import java.util.Objects;


@ApiModel(description = "")

public class PaymentProcessor extends Indentable {

    @JsonProperty("companyName")
    protected Map<String, String> companyName;


    @JsonProperty("description")
    protected Map<String, String> description;


    @JsonProperty("feature")
    protected Long feature;


    @JsonProperty("headquartersLocation")
    protected Map<String, String> headquartersLocation;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("logoPath")
    protected String logoPath;


    @JsonProperty("name")
    protected Map<String, String> name;


    @JsonProperty("productName")
    protected Map<String, String> productName;


    /**
     *
     * @return companyName
     **/
    @ApiModelProperty(value = "")
    public Map<String, String> getCompanyName() {
        return companyName;
    }


    /**
     *
     * @return description
     **/
    @ApiModelProperty(value = "")
    public Map<String, String> getDescription() {
        return description;
    }


    /**
     *
     * @return feature
     **/
    @ApiModelProperty(value = "")
    public Long getFeature() {
        return feature;
    }


    /**
     *
     * @return headquartersLocation
     **/
    @ApiModelProperty(value = "")
    public Map<String, String> getHeadquartersLocation() {
        return headquartersLocation;
    }


    /**
     * The ID is the primary key of the entity. The ID identifies the entity uniquely.
     * @return id
     **/
    @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
    public Long getId() {
        return id;
    }


    /**
     *
     * @return logoPath
     **/
    @ApiModelProperty(value = "")
    public String getLogoPath() {
        return logoPath;
    }


    /**
     *
     * @return name
     **/
    @ApiModelProperty(value = "")
    public Map<String, String> getName() {
        return name;
    }


    /**
     *
     * @return productName
     **/
    @ApiModelProperty(value = "")
    public Map<String, String> getProductName() {
        return productName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentProcessor paymentProcessor = (PaymentProcessor) o;
        return Objects.equals(this.companyName, paymentProcessor.companyName) &&
                Objects.equals(this.description, paymentProcessor.description) &&
                Objects.equals(this.feature, paymentProcessor.feature) &&
                Objects.equals(this.headquartersLocation, paymentProcessor.headquartersLocation) &&
                Objects.equals(this.id, paymentProcessor.id) &&
                Objects.equals(this.logoPath, paymentProcessor.logoPath) &&
                Objects.equals(this.name, paymentProcessor.name) &&
                Objects.equals(this.productName, paymentProcessor.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName, description, feature, headquartersLocation, id, logoPath, name, productName);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentProcessor {\n");

        sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
        sb.append("    headquartersLocation: ").append(toIndentedString(headquartersLocation)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    logoPath: ").append(toIndentedString(logoPath)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("}");
        return sb.toString();
    }


}

