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
import com.wallee.sdk.model.enums.CustomersPresence;
import com.wallee.sdk.model.enums.DataCollectionType;
import com.wallee.sdk.model.enums.PaymentPrimaryRiskTaker;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@ApiModel(description = "")

public class PaymentConnector extends Indentable {

    @JsonProperty("dataCollectionType")
    protected DataCollectionType dataCollectionType;


    @JsonProperty("deprecated")
    protected Boolean deprecated;


    @JsonProperty("deprecationReason")
    protected Map<String, String> deprecationReason;


    @JsonProperty("description")
    protected Map<String, String> description;


    @JsonProperty("feature")
    protected Feature feature;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("name")
    protected Map<String, String> name;


    @JsonProperty("paymentMethod")
    protected Long paymentMethod;


    @JsonProperty("paymentMethodBrand")
    protected PaymentMethodBrand paymentMethodBrand;


    @JsonProperty("primaryRiskTaker")
    protected PaymentPrimaryRiskTaker primaryRiskTaker;


    @JsonProperty("processor")
    protected Long processor;


    @JsonProperty("supportedCustomersPresences")
    protected List<CustomersPresence> supportedCustomersPresences;


    @JsonProperty("supportedFeatures")
    protected List<Long> supportedFeatures;


    /**
     * @return dataCollectionType
     **/
    @ApiModelProperty(value = "")
    public DataCollectionType getDataCollectionType() {
        return dataCollectionType;
    }


    /**
     * @return deprecated
     **/
    @ApiModelProperty(value = "")
    public Boolean isDeprecated() {
        return deprecated;
    }


    /**
     * @return deprecationReason
     **/
    @ApiModelProperty(value = "")
    public Map<String, String> getDeprecationReason() {
        return deprecationReason;
    }


    /**
     * @return description
     **/
    @ApiModelProperty(value = "")
    public Map<String, String> getDescription() {
        return description;
    }


    /**
     * @return feature
     **/
    @ApiModelProperty(value = "")
    public Feature getFeature() {
        return feature;
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
     * @return name
     **/
    @ApiModelProperty(value = "")
    public Map<String, String> getName() {
        return name;
    }


    /**
     * @return paymentMethod
     **/
    @ApiModelProperty(value = "")
    public Long getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * @return paymentMethodBrand
     **/
    @ApiModelProperty(value = "")
    public PaymentMethodBrand getPaymentMethodBrand() {
        return paymentMethodBrand;
    }


    /**
     * @return primaryRiskTaker
     **/
    @ApiModelProperty(value = "")
    public PaymentPrimaryRiskTaker getPrimaryRiskTaker() {
        return primaryRiskTaker;
    }


    /**
     * @return processor
     **/
    @ApiModelProperty(value = "")
    public Long getProcessor() {
        return processor;
    }


    /**
     * @return supportedCustomersPresences
     **/
    @ApiModelProperty(value = "")
    public List<CustomersPresence> getSupportedCustomersPresences() {
        return supportedCustomersPresences;
    }


    /**
     * @return supportedFeatures
     **/
    @ApiModelProperty(value = "")
    public List<Long> getSupportedFeatures() {
        return supportedFeatures;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentConnector paymentConnector = (PaymentConnector) o;
        return this.dataCollectionType == paymentConnector.dataCollectionType &&
                Objects.equals(this.deprecated, paymentConnector.deprecated) &&
                Objects.equals(this.deprecationReason, paymentConnector.deprecationReason) &&
                Objects.equals(this.description, paymentConnector.description) &&
                Objects.equals(this.feature, paymentConnector.feature) &&
                Objects.equals(this.id, paymentConnector.id) &&
                Objects.equals(this.name, paymentConnector.name) &&
                Objects.equals(this.paymentMethod, paymentConnector.paymentMethod) &&
                Objects.equals(this.paymentMethodBrand, paymentConnector.paymentMethodBrand) && this.primaryRiskTaker
                == paymentConnector.primaryRiskTaker &&
                Objects.equals(this.processor, paymentConnector.processor) &&
                Objects.equals(this.supportedCustomersPresences, paymentConnector.supportedCustomersPresences) &&
                Objects.equals(this.supportedFeatures, paymentConnector.supportedFeatures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataCollectionType, deprecated, deprecationReason, description, feature, id, name, paymentMethod, paymentMethodBrand, primaryRiskTaker, processor, supportedCustomersPresences, supportedFeatures);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentConnector {\n");

        sb.append("    dataCollectionType: ").append(toIndentedString(dataCollectionType)).append("\n");
        sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
        sb.append("    deprecationReason: ").append(toIndentedString(deprecationReason)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
        sb.append("    paymentMethodBrand: ").append(toIndentedString(paymentMethodBrand)).append("\n");
        sb.append("    primaryRiskTaker: ").append(toIndentedString(primaryRiskTaker)).append("\n");
        sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
        sb.append("    supportedCustomersPresences: ").append(toIndentedString(supportedCustomersPresences)).append("\n");
        sb.append("    supportedFeatures: ").append(toIndentedString(supportedFeatures)).append("\n");
        sb.append("}");
        return sb.toString();
    }


}

