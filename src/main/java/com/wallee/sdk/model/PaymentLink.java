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
import com.wallee.sdk.model.enums.PaymentLinkProtectionMode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * The payment link defines an URL to automatically create transactions.
 */
@ApiModel(description = "The payment link defines an URL to automatically create transactions.")

public class PaymentLink extends Indentable {

    @JsonProperty("allowedPaymentMethodConfigurations")
    protected List<PaymentMethodConfiguration> allowedPaymentMethodConfigurations;


    @JsonProperty("appliedSpaceView")
    protected Long appliedSpaceView;


    @JsonProperty("availableFrom")
    protected OffsetDateTime availableFrom;


    @JsonProperty("availableUntil")
    protected OffsetDateTime availableUntil;


    @JsonProperty("billingAddressRequired")
    protected Boolean billingAddressRequired;


    @JsonProperty("currency")
    protected String currency;


    @JsonProperty("externalId")
    protected String externalId;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("language")
    protected String language;


    @JsonProperty("lineItems")
    protected List<LineItem> lineItems;


    @JsonProperty("linkedSpaceId")
    protected Long linkedSpaceId;


    @JsonProperty("maximalNumberOfTransactions")
    protected Integer maximalNumberOfTransactions;


    @JsonProperty("name")
    protected String name;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("protectionMode")
    protected PaymentLinkProtectionMode protectionMode;


    @JsonProperty("shippingAddressRequired")
    protected Boolean shippingAddressRequired;


    @JsonProperty("state")
    protected CreationEntityState state;


    @JsonProperty("url")
    protected String url;


    @JsonProperty("version")
    protected Integer version;


    /**
     * The allowed payment method configurations restrict the payment methods which can be used with this payment link.
     *
     * @return allowedPaymentMethodConfigurations
     **/
    @ApiModelProperty(value = "The allowed payment method configurations restrict the payment methods which can be used with this payment link.")
    public List<PaymentMethodConfiguration> getAllowedPaymentMethodConfigurations() {
        return allowedPaymentMethodConfigurations;
    }


    /**
     * The payment link can be conducted in a specific space view. The space view may apply a specific design to the payment page.
     *
     * @return appliedSpaceView
     **/
    @ApiModelProperty(value = "The payment link can be conducted in a specific space view. The space view may apply a specific design to the payment page.")
    public Long getAppliedSpaceView() {
        return appliedSpaceView;
    }


    /**
     * The available from date defines the earliest date on which the payment link can be used. When no date is specified there will be no restriction.
     *
     * @return availableFrom
     **/
    @ApiModelProperty(value = "The available from date defines the earliest date on which the payment link can be used. When no date is specified there will be no restriction.")
    public OffsetDateTime getAvailableFrom() {
        return availableFrom;
    }


    /**
     * The available from date defines the latest date on which the payment link can be used to initialize a transaction. When no date is specified there will be no restriction.
     *
     * @return availableUntil
     **/
    @ApiModelProperty(value = "The available from date defines the latest date on which the payment link can be used to initialize a transaction. When no date is specified there will be no restriction.")
    public OffsetDateTime getAvailableUntil() {
        return availableUntil;
    }


    /**
     * By making the billing address required the transaction can only be created when a billing address is provided within the request.
     *
     * @return billingAddressRequired
     **/
    @ApiModelProperty(value = "By making the billing address required the transaction can only be created when a billing address is provided within the request.")
    public Boolean isBillingAddressRequired() {
        return billingAddressRequired;
    }


    /**
     * The currency defines in which currency the payment is executed in. If no currency is defined it has to be specified within the request parameter &#39;currency&#39;.
     *
     * @return currency
     **/
    @ApiModelProperty(value = "The currency defines in which currency the payment is executed in. If no currency is defined it has to be specified within the request parameter 'currency'.")
    public String getCurrency() {
        return currency;
    }


    /**
     * The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.
     *
     * @return externalId
     **/
    @ApiModelProperty(value = "The external id helps to identify the entity and a subsequent creation of an entity with the same ID will not create a new entity.")
    public String getExternalId() {
        return externalId;
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
     * The language defines the language of the payment page. If no language is provided it can be provided through the request parameter.
     *
     * @return language
     **/
    @ApiModelProperty(value = "The language defines the language of the payment page. If no language is provided it can be provided through the request parameter.")
    public String getLanguage() {
        return language;
    }


    /**
     * The line items allows to define the line items for this payment link. When the line items are defined they cannot be overridden through the request parameters.
     *
     * @return lineItems
     **/
    @ApiModelProperty(value = "The line items allows to define the line items for this payment link. When the line items are defined they cannot be overridden through the request parameters.")
    public List<LineItem> getLineItems() {
        return lineItems;
    }


    /**
     * The linked space id holds the ID of the space to which the entity belongs to.
     *
     * @return linkedSpaceId
     **/
    @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
    public Long getLinkedSpaceId() {
        return linkedSpaceId;
    }


    /**
     * The maximal number of transactions limits the number of transactions which can be created with this payment link.
     *
     * @return maximalNumberOfTransactions
     **/
    @ApiModelProperty(value = "The maximal number of transactions limits the number of transactions which can be created with this payment link.")
    public Integer getMaximalNumberOfTransactions() {
        return maximalNumberOfTransactions;
    }


    /**
     * The payment link name is used internally to identify the payment link. For example the name is used within search fields and hence it should be distinct and descriptive.
     *
     * @return name
     **/
    @ApiModelProperty(value = "The payment link name is used internally to identify the payment link. For example the name is used within search fields and hence it should be distinct and descriptive.")
    public String getName() {
        return name;
    }


    /**
     * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
     *
     * @return plannedPurgeDate
     **/
    @ApiModelProperty(value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
    public OffsetDateTime getPlannedPurgeDate() {
        return plannedPurgeDate;
    }


    /**
     * The protection mode determines if the payment link is protected against tampering and in what way.
     *
     * @return protectionMode
     **/
    @ApiModelProperty(value = "The protection mode determines if the payment link is protected against tampering and in what way.")
    public PaymentLinkProtectionMode getProtectionMode() {
        return protectionMode;
    }


    /**
     * By making the shipping address required the transaction can only be created when a shipping address is provided within the request.
     *
     * @return shippingAddressRequired
     **/
    @ApiModelProperty(value = "By making the shipping address required the transaction can only be created when a shipping address is provided within the request.")
    public Boolean isShippingAddressRequired() {
        return shippingAddressRequired;
    }


    /**
     * @return state
     **/
    @ApiModelProperty(value = "")
    public CreationEntityState getState() {
        return state;
    }


    /**
     * The URL defines the URL to which the user has to be forwarded to initialize the payment.
     *
     * @return url
     **/
    @ApiModelProperty(value = "The URL defines the URL to which the user has to be forwarded to initialize the payment.")
    public String getUrl() {
        return url;
    }


    /**
     * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
     *
     * @return version
     **/
    @ApiModelProperty(value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
    public Integer getVersion() {
        return version;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentLink paymentLink = (PaymentLink) o;
        return Objects.equals(this.allowedPaymentMethodConfigurations, paymentLink.allowedPaymentMethodConfigurations) &&
                Objects.equals(this.appliedSpaceView, paymentLink.appliedSpaceView) &&
                Objects.equals(this.availableFrom, paymentLink.availableFrom) &&
                Objects.equals(this.availableUntil, paymentLink.availableUntil) &&
                Objects.equals(this.billingAddressRequired, paymentLink.billingAddressRequired) &&
                Objects.equals(this.currency, paymentLink.currency) &&
                Objects.equals(this.externalId, paymentLink.externalId) &&
                Objects.equals(this.id, paymentLink.id) &&
                Objects.equals(this.language, paymentLink.language) &&
                Objects.equals(this.lineItems, paymentLink.lineItems) &&
                Objects.equals(this.linkedSpaceId, paymentLink.linkedSpaceId) &&
                Objects.equals(this.maximalNumberOfTransactions, paymentLink.maximalNumberOfTransactions) &&
                Objects.equals(this.name, paymentLink.name) &&
                Objects.equals(this.plannedPurgeDate, paymentLink.plannedPurgeDate) && this.protectionMode
                == paymentLink.protectionMode &&
                Objects.equals(this.shippingAddressRequired, paymentLink.shippingAddressRequired) && this.state
                == paymentLink.state &&
                Objects.equals(this.url, paymentLink.url) &&
                Objects.equals(this.version, paymentLink.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowedPaymentMethodConfigurations, appliedSpaceView, availableFrom, availableUntil, billingAddressRequired, currency, externalId, id, language, lineItems, linkedSpaceId, maximalNumberOfTransactions, name, plannedPurgeDate, protectionMode, shippingAddressRequired, state, url, version);
    }


    @Override
    public String toString() {

        return "class PaymentLink { \n" +
            "    allowedPaymentMethodConfigurations: " +  toIndentedString(allowedPaymentMethodConfigurations) + "\n" +
            "    appliedSpaceView: " + toIndentedString(appliedSpaceView) + "\n" +
            "    availableFrom: " + toIndentedString(availableFrom) + "\n" +
            "    availableUntil: " + toIndentedString(availableUntil) + "\n" +
            "    billingAddressRequired: " +  toIndentedString(billingAddressRequired) + "\n" +
            "    currency: " + toIndentedString(currency) + "\n" +
            "    externalId: " + toIndentedString(externalId) + "\n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    language: " + toIndentedString(language) + "\n" +
            "    lineItems: " + toIndentedString(lineItems) +  " \n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) + " \n" +
            "    maximalNumberOfTransactions: " + toIndentedString(maximalNumberOfTransactions) + "\n" +
            "    name: " + toIndentedString(name) +  " \n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) + " \n" +
            "    protectionMode: " + toIndentedString(protectionMode) + "\n" +
            "    shippingAddressRequired: " +  toIndentedString(shippingAddressRequired) + "\n" +
            "    state: " + toIndentedString(state) + "\n" +
            "    url: " + toIndentedString(url) + "\n" +
            "    version: " + toIndentedString(version) + "\n" +
            "}";
        }


}

