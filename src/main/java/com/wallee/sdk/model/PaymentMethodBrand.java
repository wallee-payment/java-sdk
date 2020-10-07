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

public class PaymentMethodBrand extends Indentable {

    @JsonProperty("description")
    protected Map<String, String> description;


    @JsonProperty("grayImagePath")
    protected String grayImagePath;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("imagePath")
    protected String imagePath;


    @JsonProperty("name")
    protected Map<String, String> name;


    @JsonProperty("paymentMethod")
    protected Long paymentMethod;


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
     * @return grayImagePath
     **/
    @ApiModelProperty(value = "")
    public String getGrayImagePath() {
        return grayImagePath;
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
     * @return imagePath
     **/
    @ApiModelProperty(value = "")
    public String getImagePath() {
        return imagePath;
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
     * @return paymentMethod
     **/
    @ApiModelProperty(value = "")
    public Long getPaymentMethod() {
        return paymentMethod;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentMethodBrand paymentMethodBrand = (PaymentMethodBrand) o;
        return Objects.equals(this.description, paymentMethodBrand.description) &&
                Objects.equals(this.grayImagePath, paymentMethodBrand.grayImagePath) &&
                Objects.equals(this.id, paymentMethodBrand.id) &&
                Objects.equals(this.imagePath, paymentMethodBrand.imagePath) &&
                Objects.equals(this.name, paymentMethodBrand.name) &&
                Objects.equals(this.paymentMethod, paymentMethodBrand.paymentMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, grayImagePath, id, imagePath, name, paymentMethod);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentMethodBrand {\n");

        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    grayImagePath: ").append(toIndentedString(grayImagePath)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    imagePath: ").append(toIndentedString(imagePath)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
        sb.append("}");
        return sb.toString();
    }


}

