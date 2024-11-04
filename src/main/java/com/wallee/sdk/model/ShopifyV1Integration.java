/**
* wallee SDK
*
* This library allows to interact with the wallee payment service.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/


package com.wallee.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wallee.sdk.model.CreationEntityState;
import com.wallee.sdk.model.PaymentMethodConfiguration;
import com.wallee.sdk.model.ShopifyAdditionalLineItemData;
import com.wallee.sdk.model.ShopifyIntegrationPaymentAppVersion;
import com.wallee.sdk.model.ShopifyIntegrationSubscriptionAppVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * A Shopify Integration allows to connect a Shopify shop.
 */
@ApiModel(description = "A Shopify Integration allows to connect a Shopify shop.")

public class ShopifyV1Integration {
  
  @JsonProperty("additionalLineItemData")
  protected List<ShopifyAdditionalLineItemData> additionalLineItemData = null;

  
  @JsonProperty("allowInvoiceDownload")
  protected Boolean allowInvoiceDownload = null;

  
  @JsonProperty("allowedPaymentMethodConfigurations")
  protected List<PaymentMethodConfiguration> allowedPaymentMethodConfigurations = null;

  
  @JsonProperty("currency")
  protected String currency = null;

  
  @JsonProperty("id")
  protected Long id = null;

  
  @JsonProperty("integratedPaymentFormEnabled")
  protected Boolean integratedPaymentFormEnabled = null;

  
  @JsonProperty("language")
  protected String language = null;

  
  @JsonProperty("loginName")
  protected String loginName = null;

  
  @JsonProperty("name")
  protected String name = null;

  
  @JsonProperty("paymentAppVersion")
  protected ShopifyIntegrationPaymentAppVersion paymentAppVersion = null;

  
  @JsonProperty("paymentInstalled")
  protected Boolean paymentInstalled = null;

  
  @JsonProperty("paymentProxyPath")
  protected String paymentProxyPath = null;

  
  @JsonProperty("plannedPurgeDate")
  protected OffsetDateTime plannedPurgeDate = null;

  
  @JsonProperty("replacePaymentMethodImage")
  protected Boolean replacePaymentMethodImage = null;

  
  @JsonProperty("shopName")
  protected String shopName = null;

  
  @JsonProperty("showPaymentInformation")
  protected Boolean showPaymentInformation = null;

  
  @JsonProperty("showSubscriptionInformation")
  protected Boolean showSubscriptionInformation = null;

  
  @JsonProperty("spaceId")
  protected Long spaceId = null;

  
  @JsonProperty("spaceViewId")
  protected Long spaceViewId = null;

  
  @JsonProperty("state")
  protected CreationEntityState state = null;

  
  @JsonProperty("subscriptionAppVersion")
  protected ShopifyIntegrationSubscriptionAppVersion subscriptionAppVersion = null;

  
  @JsonProperty("subscriptionInstalled")
  protected Boolean subscriptionInstalled = null;

  
  @JsonProperty("subscriptionProxyPath")
  protected String subscriptionProxyPath = null;

  
  @JsonProperty("version")
  protected Integer version = null;

  
  
   /**
   * 
   * @return additionalLineItemData
  **/
  @ApiModelProperty(value = "")
  public List<ShopifyAdditionalLineItemData> getAdditionalLineItemData() {
    return additionalLineItemData;
  }

  
   /**
   * 
   * @return allowInvoiceDownload
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowInvoiceDownload() {
    return allowInvoiceDownload;
  }

  
   /**
   * 
   * @return allowedPaymentMethodConfigurations
  **/
  @ApiModelProperty(value = "")
  public List<PaymentMethodConfiguration> getAllowedPaymentMethodConfigurations() {
    return allowedPaymentMethodConfigurations;
  }

  
   /**
   * 
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }

  
   /**
   * A unique identifier for the object.
   * @return id
  **/
  @ApiModelProperty(value = "A unique identifier for the object.")
  public Long getId() {
    return id;
  }

  
   /**
   * Enabling the integrated payment form will embed the payment form in the Shopify shop. The app needs to be installed for this to be possible.
   * @return integratedPaymentFormEnabled
  **/
  @ApiModelProperty(value = "Enabling the integrated payment form will embed the payment form in the Shopify shop. The app needs to be installed for this to be possible.")
  public Boolean isIntegratedPaymentFormEnabled() {
    return integratedPaymentFormEnabled;
  }

  
   /**
   * The checkout language forces a specific language in the checkout. Without a checkout language the browser setting of the buyer is used to determine the language.
   * @return language
  **/
  @ApiModelProperty(value = "The checkout language forces a specific language in the checkout. Without a checkout language the browser setting of the buyer is used to determine the language.")
  public String getLanguage() {
    return language;
  }

  
   /**
   * The login name is used to link a specific Shopify payment gateway to this integration.This login name is to be filled into the appropriate field in the shop&#39;s payment gateway configuration.
   * @return loginName
  **/
  @ApiModelProperty(value = "The login name is used to link a specific Shopify payment gateway to this integration.This login name is to be filled into the appropriate field in the shop's payment gateway configuration.")
  public String getLoginName() {
    return loginName;
  }

  
   /**
   * The integration name is used internally to identify a specific integration.For example the name is used withinsearch fields and hence it should be distinct and descriptive.
   * @return name
  **/
  @ApiModelProperty(value = "The integration name is used internally to identify a specific integration.For example the name is used withinsearch fields and hence it should be distinct and descriptive.")
  public String getName() {
    return name;
  }

  
   /**
   * 
   * @return paymentAppVersion
  **/
  @ApiModelProperty(value = "")
  public ShopifyIntegrationPaymentAppVersion getPaymentAppVersion() {
    return paymentAppVersion;
  }

  
   /**
   * 
   * @return paymentInstalled
  **/
  @ApiModelProperty(value = "")
  public Boolean isPaymentInstalled() {
    return paymentInstalled;
  }

  
   /**
   * Define the path of the proxy URL. This only needs to be changed if the app&#39;s proxy URL is overwritten in the Shopify store.
   * @return paymentProxyPath
  **/
  @ApiModelProperty(value = "Define the path of the proxy URL. This only needs to be changed if the app's proxy URL is overwritten in the Shopify store.")
  public String getPaymentProxyPath() {
    return paymentProxyPath;
  }

  
   /**
   * The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.
   * @return plannedPurgeDate
  **/
  @ApiModelProperty(value = "The date and time when the object is planned to be permanently removed. If the value is empty, the object will not be removed.")
  public OffsetDateTime getPlannedPurgeDate() {
    return plannedPurgeDate;
  }

  
   /**
   * 
   * @return replacePaymentMethodImage
  **/
  @ApiModelProperty(value = "")
  public Boolean isReplacePaymentMethodImage() {
    return replacePaymentMethodImage;
  }

  
   /**
   * The store address is used to link a specific Shopify shop to this integration. This is the name used in the Shopify&#39;s admin URL: [storeAddress].myshopify.com
   * @return shopName
  **/
  @ApiModelProperty(value = "The store address is used to link a specific Shopify shop to this integration. This is the name used in the Shopify's admin URL: [storeAddress].myshopify.com")
  public String getShopName() {
    return shopName;
  }

  
   /**
   * 
   * @return showPaymentInformation
  **/
  @ApiModelProperty(value = "")
  public Boolean isShowPaymentInformation() {
    return showPaymentInformation;
  }

  
   /**
   * 
   * @return showSubscriptionInformation
  **/
  @ApiModelProperty(value = "")
  public Boolean isShowSubscriptionInformation() {
    return showSubscriptionInformation;
  }

  
   /**
   * 
   * @return spaceId
  **/
  @ApiModelProperty(value = "")
  public Long getSpaceId() {
    return spaceId;
  }

  
   /**
   * The ID of the space view this object is linked to.
   * @return spaceViewId
  **/
  @ApiModelProperty(value = "The ID of the space view this object is linked to.")
  public Long getSpaceViewId() {
    return spaceViewId;
  }

  
   /**
   * The object&#39;s current state.
   * @return state
  **/
  @ApiModelProperty(value = "The object's current state.")
  public CreationEntityState getState() {
    return state;
  }

  
   /**
   * 
   * @return subscriptionAppVersion
  **/
  @ApiModelProperty(value = "")
  public ShopifyIntegrationSubscriptionAppVersion getSubscriptionAppVersion() {
    return subscriptionAppVersion;
  }

  
   /**
   * 
   * @return subscriptionInstalled
  **/
  @ApiModelProperty(value = "")
  public Boolean isSubscriptionInstalled() {
    return subscriptionInstalled;
  }

  
   /**
   * Define the path of the proxy URL. This only needs to be changed if the app&#39;s proxy URL is overwritten in the Shopify store.
   * @return subscriptionProxyPath
  **/
  @ApiModelProperty(value = "Define the path of the proxy URL. This only needs to be changed if the app's proxy URL is overwritten in the Shopify store.")
  public String getSubscriptionProxyPath() {
    return subscriptionProxyPath;
  }

  
   /**
   * The version is used for optimistic locking and incremented whenever the object is updated.
   * @return version
  **/
  @ApiModelProperty(value = "The version is used for optimistic locking and incremented whenever the object is updated.")
  public Integer getVersion() {
    return version;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopifyV1Integration shopifyV1Integration = (ShopifyV1Integration) o;
    return Objects.equals(this.additionalLineItemData, shopifyV1Integration.additionalLineItemData) &&
        Objects.equals(this.allowInvoiceDownload, shopifyV1Integration.allowInvoiceDownload) &&
        Objects.equals(this.allowedPaymentMethodConfigurations, shopifyV1Integration.allowedPaymentMethodConfigurations) &&
        Objects.equals(this.currency, shopifyV1Integration.currency) &&
        Objects.equals(this.id, shopifyV1Integration.id) &&
        Objects.equals(this.integratedPaymentFormEnabled, shopifyV1Integration.integratedPaymentFormEnabled) &&
        Objects.equals(this.language, shopifyV1Integration.language) &&
        Objects.equals(this.loginName, shopifyV1Integration.loginName) &&
        Objects.equals(this.name, shopifyV1Integration.name) &&
        Objects.equals(this.paymentAppVersion, shopifyV1Integration.paymentAppVersion) &&
        Objects.equals(this.paymentInstalled, shopifyV1Integration.paymentInstalled) &&
        Objects.equals(this.paymentProxyPath, shopifyV1Integration.paymentProxyPath) &&
        Objects.equals(this.plannedPurgeDate, shopifyV1Integration.plannedPurgeDate) &&
        Objects.equals(this.replacePaymentMethodImage, shopifyV1Integration.replacePaymentMethodImage) &&
        Objects.equals(this.shopName, shopifyV1Integration.shopName) &&
        Objects.equals(this.showPaymentInformation, shopifyV1Integration.showPaymentInformation) &&
        Objects.equals(this.showSubscriptionInformation, shopifyV1Integration.showSubscriptionInformation) &&
        Objects.equals(this.spaceId, shopifyV1Integration.spaceId) &&
        Objects.equals(this.spaceViewId, shopifyV1Integration.spaceViewId) &&
        Objects.equals(this.state, shopifyV1Integration.state) &&
        Objects.equals(this.subscriptionAppVersion, shopifyV1Integration.subscriptionAppVersion) &&
        Objects.equals(this.subscriptionInstalled, shopifyV1Integration.subscriptionInstalled) &&
        Objects.equals(this.subscriptionProxyPath, shopifyV1Integration.subscriptionProxyPath) &&
        Objects.equals(this.version, shopifyV1Integration.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalLineItemData, allowInvoiceDownload, allowedPaymentMethodConfigurations, currency, id, integratedPaymentFormEnabled, language, loginName, name, paymentAppVersion, paymentInstalled, paymentProxyPath, plannedPurgeDate, replacePaymentMethodImage, shopName, showPaymentInformation, showSubscriptionInformation, spaceId, spaceViewId, state, subscriptionAppVersion, subscriptionInstalled, subscriptionProxyPath, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopifyV1Integration {\n");
    
    sb.append("    additionalLineItemData: ").append(toIndentedString(additionalLineItemData)).append("\n");
    sb.append("    allowInvoiceDownload: ").append(toIndentedString(allowInvoiceDownload)).append("\n");
    sb.append("    allowedPaymentMethodConfigurations: ").append(toIndentedString(allowedPaymentMethodConfigurations)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    integratedPaymentFormEnabled: ").append(toIndentedString(integratedPaymentFormEnabled)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    loginName: ").append(toIndentedString(loginName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paymentAppVersion: ").append(toIndentedString(paymentAppVersion)).append("\n");
    sb.append("    paymentInstalled: ").append(toIndentedString(paymentInstalled)).append("\n");
    sb.append("    paymentProxyPath: ").append(toIndentedString(paymentProxyPath)).append("\n");
    sb.append("    plannedPurgeDate: ").append(toIndentedString(plannedPurgeDate)).append("\n");
    sb.append("    replacePaymentMethodImage: ").append(toIndentedString(replacePaymentMethodImage)).append("\n");
    sb.append("    shopName: ").append(toIndentedString(shopName)).append("\n");
    sb.append("    showPaymentInformation: ").append(toIndentedString(showPaymentInformation)).append("\n");
    sb.append("    showSubscriptionInformation: ").append(toIndentedString(showSubscriptionInformation)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    spaceViewId: ").append(toIndentedString(spaceViewId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    subscriptionAppVersion: ").append(toIndentedString(subscriptionAppVersion)).append("\n");
    sb.append("    subscriptionInstalled: ").append(toIndentedString(subscriptionInstalled)).append("\n");
    sb.append("    subscriptionProxyPath: ").append(toIndentedString(subscriptionProxyPath)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

