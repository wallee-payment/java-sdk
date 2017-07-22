# com.wallee.sdk

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>com.wallee.sdk</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:com.wallee.sdk:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/com.wallee.sdk-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.wallee.sdk.*;
import com.wallee.sdk.auth.*;
import com.wallee.sdk.model.*;
import com.wallee.sdk.api.AccountServiceApi;

import java.io.File;
import java.util.*;

public class AccountServiceApiExample {

    public static void main(String[] args) {
        
        AccountServiceApi apiInstance = new AccountServiceApi();
        EntityQueryFilter filter = new EntityQueryFilter(); // EntityQueryFilter | The filter which restricts the entities which are used to calculate the count.
        try {
            Long result = apiInstance.count(filter);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountServiceApi#count");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://app-wallee.com:443/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountServiceApi* | [**count**](docs/AccountServiceApi.md#count) | **POST** /account/count | Count
*AccountServiceApi* | [**create**](docs/AccountServiceApi.md#create) | **POST** /account/create | Create
*AccountServiceApi* | [**delete**](docs/AccountServiceApi.md#delete) | **POST** /account/delete | Delete
*AccountServiceApi* | [**read**](docs/AccountServiceApi.md#read) | **GET** /account/read | Read
*AccountServiceApi* | [**search**](docs/AccountServiceApi.md#search) | **POST** /account/search | Search
*AccountServiceApi* | [**update**](docs/AccountServiceApi.md#update) | **POST** /account/update | Update
*ApplicationUserServiceApi* | [**count**](docs/ApplicationUserServiceApi.md#count) | **POST** /application-user/count | Count
*ApplicationUserServiceApi* | [**create**](docs/ApplicationUserServiceApi.md#create) | **POST** /application-user/create | Create
*ApplicationUserServiceApi* | [**delete**](docs/ApplicationUserServiceApi.md#delete) | **POST** /application-user/delete | Delete
*ApplicationUserServiceApi* | [**read**](docs/ApplicationUserServiceApi.md#read) | **GET** /application-user/read | Read
*ApplicationUserServiceApi* | [**search**](docs/ApplicationUserServiceApi.md#search) | **POST** /application-user/search | Search
*ApplicationUserServiceApi* | [**update**](docs/ApplicationUserServiceApi.md#update) | **POST** /application-user/update | Update
*ChargeAttemptServiceApi* | [**count**](docs/ChargeAttemptServiceApi.md#count) | **POST** /charge-attempt/count | Count
*ChargeAttemptServiceApi* | [**read**](docs/ChargeAttemptServiceApi.md#read) | **GET** /charge-attempt/read | Read
*ChargeAttemptServiceApi* | [**search**](docs/ChargeAttemptServiceApi.md#search) | **POST** /charge-attempt/search | Search
*ChargeFlowLevelServiceApi* | [**count**](docs/ChargeFlowLevelServiceApi.md#count) | **POST** /charge-flow-level/count | Count
*ChargeFlowLevelServiceApi* | [**read**](docs/ChargeFlowLevelServiceApi.md#read) | **GET** /charge-flow-level/read | Read
*ChargeFlowLevelServiceApi* | [**search**](docs/ChargeFlowLevelServiceApi.md#search) | **POST** /charge-flow-level/search | Search
*ChargeFlowLevelServiceApi* | [**sendMessage**](docs/ChargeFlowLevelServiceApi.md#sendMessage) | **POST** /charge-flow-level/sendMessage | Send Payment Link
*ChargeFlowServiceApi* | [**applyFlow**](docs/ChargeFlowServiceApi.md#applyFlow) | **POST** /charge-flow/applyFlow | applyFlow
*ChargeFlowServiceApi* | [**count**](docs/ChargeFlowServiceApi.md#count) | **POST** /charge-flow/count | Count
*ChargeFlowServiceApi* | [**read**](docs/ChargeFlowServiceApi.md#read) | **GET** /charge-flow/read | Read
*ChargeFlowServiceApi* | [**search**](docs/ChargeFlowServiceApi.md#search) | **POST** /charge-flow/search | Search
*ChargeFlowServiceApi* | [**updateRecipient**](docs/ChargeFlowServiceApi.md#updateRecipient) | **POST** /charge-flow/updateRecipient | updateRecipient
*ConditionTypeServiceApi* | [**all**](docs/ConditionTypeServiceApi.md#all) | **GET** /condition-type/all | All
*ConditionTypeServiceApi* | [**read**](docs/ConditionTypeServiceApi.md#read) | **GET** /condition-type/read | Read
*CountryServiceApi* | [**all**](docs/CountryServiceApi.md#all) | **GET** /country/all | All
*CountryStateServiceApi* | [**all**](docs/CountryStateServiceApi.md#all) | **GET** /country-state/all | All
*CountryStateServiceApi* | [**country**](docs/CountryStateServiceApi.md#country) | **GET** /country-state/country | Find by Country
*CurrencyServiceApi* | [**all**](docs/CurrencyServiceApi.md#all) | **GET** /currency/all | All
*DeliveryIndicationServiceApi* | [**count**](docs/DeliveryIndicationServiceApi.md#count) | **POST** /delivery-indication/count | Count
*DeliveryIndicationServiceApi* | [**markAsNotSuitable**](docs/DeliveryIndicationServiceApi.md#markAsNotSuitable) | **POST** /delivery-indication/markAsNotSuitable | markAsNotSuitable
*DeliveryIndicationServiceApi* | [**markAsSuitable**](docs/DeliveryIndicationServiceApi.md#markAsSuitable) | **POST** /delivery-indication/markAsSuitable | markAsSuitable
*DeliveryIndicationServiceApi* | [**read**](docs/DeliveryIndicationServiceApi.md#read) | **GET** /delivery-indication/read | Read
*DeliveryIndicationServiceApi* | [**search**](docs/DeliveryIndicationServiceApi.md#search) | **POST** /delivery-indication/search | Search
*DocumentTemplateServiceApi* | [**count**](docs/DocumentTemplateServiceApi.md#count) | **POST** /document-template/count | Count
*DocumentTemplateServiceApi* | [**read**](docs/DocumentTemplateServiceApi.md#read) | **GET** /document-template/read | Read
*DocumentTemplateServiceApi* | [**search**](docs/DocumentTemplateServiceApi.md#search) | **POST** /document-template/search | Search
*DocumentTemplateTypeServiceApi* | [**all**](docs/DocumentTemplateTypeServiceApi.md#all) | **GET** /document-template-type/all | All
*DocumentTemplateTypeServiceApi* | [**read**](docs/DocumentTemplateTypeServiceApi.md#read) | **GET** /document-template-type/read | Read
*HumanUserServiceApi* | [**count**](docs/HumanUserServiceApi.md#count) | **POST** /human-user/count | Count
*HumanUserServiceApi* | [**create**](docs/HumanUserServiceApi.md#create) | **POST** /human-user/create | Create
*HumanUserServiceApi* | [**delete**](docs/HumanUserServiceApi.md#delete) | **POST** /human-user/delete | Delete
*HumanUserServiceApi* | [**read**](docs/HumanUserServiceApi.md#read) | **GET** /human-user/read | Read
*HumanUserServiceApi* | [**search**](docs/HumanUserServiceApi.md#search) | **POST** /human-user/search | Search
*HumanUserServiceApi* | [**update**](docs/HumanUserServiceApi.md#update) | **POST** /human-user/update | Update
*InstallmentPaymentServiceApi* | [**count**](docs/InstallmentPaymentServiceApi.md#count) | **POST** /installment-payment/count | Count
*InstallmentPaymentServiceApi* | [**createInstallmentPayment**](docs/InstallmentPaymentServiceApi.md#createInstallmentPayment) | **POST** /installment-payment/createInstallmentPayment | Create Installment Payment
*InstallmentPaymentServiceApi* | [**read**](docs/InstallmentPaymentServiceApi.md#read) | **GET** /installment-payment/read | Read
*InstallmentPaymentServiceApi* | [**search**](docs/InstallmentPaymentServiceApi.md#search) | **POST** /installment-payment/search | Search
*InstallmentPaymentSliceServiceApi* | [**count**](docs/InstallmentPaymentSliceServiceApi.md#count) | **POST** /installment-payment-slice/count | Count
*InstallmentPaymentSliceServiceApi* | [**read**](docs/InstallmentPaymentSliceServiceApi.md#read) | **GET** /installment-payment-slice/read | Read
*InstallmentPaymentSliceServiceApi* | [**search**](docs/InstallmentPaymentSliceServiceApi.md#search) | **POST** /installment-payment-slice/search | Search
*InstallmentPlanCalculationServiceApi* | [**calculatePlans**](docs/InstallmentPlanCalculationServiceApi.md#calculatePlans) | **POST** /installment-plan-calculation/calculatePlans | Calculate Plans
*InstallmentPlanConfigurationServiceApi* | [**count**](docs/InstallmentPlanConfigurationServiceApi.md#count) | **POST** /installment-plan-configuration/count | Count
*InstallmentPlanConfigurationServiceApi* | [**read**](docs/InstallmentPlanConfigurationServiceApi.md#read) | **GET** /installment-plan-configuration/read | Read
*InstallmentPlanConfigurationServiceApi* | [**search**](docs/InstallmentPlanConfigurationServiceApi.md#search) | **POST** /installment-plan-configuration/search | Search
*InstallmentPlanSliceConfigurationServiceApi* | [**count**](docs/InstallmentPlanSliceConfigurationServiceApi.md#count) | **POST** /installment-plan-slice-configuration/count | Count
*InstallmentPlanSliceConfigurationServiceApi* | [**read**](docs/InstallmentPlanSliceConfigurationServiceApi.md#read) | **GET** /installment-plan-slice-configuration/read | Read
*InstallmentPlanSliceConfigurationServiceApi* | [**search**](docs/InstallmentPlanSliceConfigurationServiceApi.md#search) | **POST** /installment-plan-slice-configuration/search | Search
*LabelDescriptionGroupServiceApi* | [**all**](docs/LabelDescriptionGroupServiceApi.md#all) | **GET** /label-description-group-service/all | All
*LabelDescriptionGroupServiceApi* | [**read**](docs/LabelDescriptionGroupServiceApi.md#read) | **GET** /label-description-group-service/read | Read
*LabelDescriptionServiceApi* | [**all**](docs/LabelDescriptionServiceApi.md#all) | **GET** /label-description-service/all | All
*LabelDescriptionServiceApi* | [**read**](docs/LabelDescriptionServiceApi.md#read) | **GET** /label-description-service/read | Read
*LanguageServiceApi* | [**all**](docs/LanguageServiceApi.md#all) | **GET** /language/all | All
*ManualTaskServiceApi* | [**count**](docs/ManualTaskServiceApi.md#count) | **POST** /manual-task/count | Count
*ManualTaskServiceApi* | [**read**](docs/ManualTaskServiceApi.md#read) | **GET** /manual-task/read | Read
*ManualTaskServiceApi* | [**search**](docs/ManualTaskServiceApi.md#search) | **POST** /manual-task/search | Search
*PaymentConnectorConfigurationServiceApi* | [**count**](docs/PaymentConnectorConfigurationServiceApi.md#count) | **POST** /payment-connector-configuration/count | Count
*PaymentConnectorConfigurationServiceApi* | [**read**](docs/PaymentConnectorConfigurationServiceApi.md#read) | **GET** /payment-connector-configuration/read | Read
*PaymentConnectorConfigurationServiceApi* | [**search**](docs/PaymentConnectorConfigurationServiceApi.md#search) | **POST** /payment-connector-configuration/search | Search
*PaymentConnectorServiceApi* | [**all**](docs/PaymentConnectorServiceApi.md#all) | **GET** /payment-connector/all | All
*PaymentConnectorServiceApi* | [**read**](docs/PaymentConnectorServiceApi.md#read) | **GET** /payment-connector/read | Read
*PaymentMethodConfigurationServiceApi* | [**count**](docs/PaymentMethodConfigurationServiceApi.md#count) | **POST** /payment-method-configuration/count | Count
*PaymentMethodConfigurationServiceApi* | [**read**](docs/PaymentMethodConfigurationServiceApi.md#read) | **GET** /payment-method-configuration/read | Read
*PaymentMethodConfigurationServiceApi* | [**search**](docs/PaymentMethodConfigurationServiceApi.md#search) | **POST** /payment-method-configuration/search | Search
*PaymentMethodServiceApi* | [**all**](docs/PaymentMethodServiceApi.md#all) | **GET** /payment-method/all | All
*PaymentMethodServiceApi* | [**read**](docs/PaymentMethodServiceApi.md#read) | **GET** /payment-method/read | Read
*PaymentProcessorConfigurationServiceApi* | [**count**](docs/PaymentProcessorConfigurationServiceApi.md#count) | **POST** /payment-processor-configuration/count | Count
*PaymentProcessorConfigurationServiceApi* | [**read**](docs/PaymentProcessorConfigurationServiceApi.md#read) | **GET** /payment-processor-configuration/read | Read
*PaymentProcessorConfigurationServiceApi* | [**search**](docs/PaymentProcessorConfigurationServiceApi.md#search) | **POST** /payment-processor-configuration/search | Search
*PaymentProcessorServiceApi* | [**all**](docs/PaymentProcessorServiceApi.md#all) | **GET** /payment-processor/all | All
*PaymentProcessorServiceApi* | [**read**](docs/PaymentProcessorServiceApi.md#read) | **GET** /payment-processor/read | Read
*PermissionServiceApi* | [**all**](docs/PermissionServiceApi.md#all) | **GET** /permission/all | All
*PermissionServiceApi* | [**read**](docs/PermissionServiceApi.md#read) | **GET** /permission/read | Read
*RefundServiceApi* | [**count**](docs/RefundServiceApi.md#count) | **POST** /refund/count | Count
*RefundServiceApi* | [**fail**](docs/RefundServiceApi.md#fail) | **POST** /refund/fail | fail
*RefundServiceApi* | [**getRefundDocument**](docs/RefundServiceApi.md#getRefundDocument) | **GET** /refund/getRefundDocument | getRefundDocument
*RefundServiceApi* | [**read**](docs/RefundServiceApi.md#read) | **GET** /refund/read | Read
*RefundServiceApi* | [**refund**](docs/RefundServiceApi.md#refund) | **POST** /refund/refund | create
*RefundServiceApi* | [**search**](docs/RefundServiceApi.md#search) | **POST** /refund/search | Search
*RefundServiceApi* | [**succeed**](docs/RefundServiceApi.md#succeed) | **POST** /refund/succeed | succeed
*SpaceServiceApi* | [**count**](docs/SpaceServiceApi.md#count) | **POST** /space/count | Count
*SpaceServiceApi* | [**create**](docs/SpaceServiceApi.md#create) | **POST** /space/create | Create
*SpaceServiceApi* | [**delete**](docs/SpaceServiceApi.md#delete) | **POST** /space/delete | Delete
*SpaceServiceApi* | [**read**](docs/SpaceServiceApi.md#read) | **GET** /space/read | Read
*SpaceServiceApi* | [**search**](docs/SpaceServiceApi.md#search) | **POST** /space/search | Search
*SpaceServiceApi* | [**update**](docs/SpaceServiceApi.md#update) | **POST** /space/update | Update
*StaticValueServiceApi* | [**all**](docs/StaticValueServiceApi.md#all) | **GET** /static-value-service/all | All
*StaticValueServiceApi* | [**read**](docs/StaticValueServiceApi.md#read) | **GET** /static-value-service/read | Read
*SubscriberServiceApi* | [**count**](docs/SubscriberServiceApi.md#count) | **POST** /subscriber/count | Count
*SubscriberServiceApi* | [**create**](docs/SubscriberServiceApi.md#create) | **POST** /subscriber/create | Create
*SubscriberServiceApi* | [**delete**](docs/SubscriberServiceApi.md#delete) | **POST** /subscriber/delete | Delete
*SubscriberServiceApi* | [**read**](docs/SubscriberServiceApi.md#read) | **GET** /subscriber/read | Read
*SubscriberServiceApi* | [**search**](docs/SubscriberServiceApi.md#search) | **POST** /subscriber/search | Search
*SubscriberServiceApi* | [**update**](docs/SubscriberServiceApi.md#update) | **POST** /subscriber/update | Update
*SubscriptionChargeServiceApi* | [**count**](docs/SubscriptionChargeServiceApi.md#count) | **POST** /subscription-charge/count | Count
*SubscriptionChargeServiceApi* | [**create**](docs/SubscriptionChargeServiceApi.md#create) | **POST** /subscription-charge/create | Create
*SubscriptionChargeServiceApi* | [**discard**](docs/SubscriptionChargeServiceApi.md#discard) | **POST** /subscription-charge/discard | discard
*SubscriptionChargeServiceApi* | [**read**](docs/SubscriptionChargeServiceApi.md#read) | **GET** /subscription-charge/read | Read
*SubscriptionChargeServiceApi* | [**search**](docs/SubscriptionChargeServiceApi.md#search) | **POST** /subscription-charge/search | Search
*SubscriptionLedgerEntryServiceApi* | [**count**](docs/SubscriptionLedgerEntryServiceApi.md#count) | **POST** /subscription-ledger-entry/count | Count
*SubscriptionLedgerEntryServiceApi* | [**create**](docs/SubscriptionLedgerEntryServiceApi.md#create) | **POST** /subscription-ledger-entry/create | Create
*SubscriptionLedgerEntryServiceApi* | [**read**](docs/SubscriptionLedgerEntryServiceApi.md#read) | **GET** /subscription-ledger-entry/read | Read
*SubscriptionLedgerEntryServiceApi* | [**search**](docs/SubscriptionLedgerEntryServiceApi.md#search) | **POST** /subscription-ledger-entry/search | Search
*SubscriptionMetricServiceApi* | [**count**](docs/SubscriptionMetricServiceApi.md#count) | **POST** /subscription-metric/count | Count
*SubscriptionMetricServiceApi* | [**create**](docs/SubscriptionMetricServiceApi.md#create) | **POST** /subscription-metric/create | Create
*SubscriptionMetricServiceApi* | [**delete**](docs/SubscriptionMetricServiceApi.md#delete) | **POST** /subscription-metric/delete | Delete
*SubscriptionMetricServiceApi* | [**read**](docs/SubscriptionMetricServiceApi.md#read) | **GET** /subscription-metric/read | Read
*SubscriptionMetricServiceApi* | [**search**](docs/SubscriptionMetricServiceApi.md#search) | **POST** /subscription-metric/search | Search
*SubscriptionMetricServiceApi* | [**update**](docs/SubscriptionMetricServiceApi.md#update) | **POST** /subscription-metric/update | Update
*SubscriptionMetricUsageServiceApi* | [**count**](docs/SubscriptionMetricUsageServiceApi.md#count) | **POST** /subscription-metric-usage/count | Count
*SubscriptionMetricUsageServiceApi* | [**create**](docs/SubscriptionMetricUsageServiceApi.md#create) | **POST** /subscription-metric-usage/create | Create
*SubscriptionMetricUsageServiceApi* | [**read**](docs/SubscriptionMetricUsageServiceApi.md#read) | **GET** /subscription-metric-usage/read | Read
*SubscriptionMetricUsageServiceApi* | [**search**](docs/SubscriptionMetricUsageServiceApi.md#search) | **POST** /subscription-metric-usage/search | Search
*SubscriptionPeriodBillServiceApi* | [**count**](docs/SubscriptionPeriodBillServiceApi.md#count) | **POST** /subscription-period-bill/count | Count
*SubscriptionPeriodBillServiceApi* | [**read**](docs/SubscriptionPeriodBillServiceApi.md#read) | **GET** /subscription-period-bill/read | Read
*SubscriptionPeriodBillServiceApi* | [**search**](docs/SubscriptionPeriodBillServiceApi.md#search) | **POST** /subscription-period-bill/search | Search
*SubscriptionProductComponentGroupServiceApi* | [**count**](docs/SubscriptionProductComponentGroupServiceApi.md#count) | **POST** /subscription-product-component-group/count | Count
*SubscriptionProductComponentGroupServiceApi* | [**create**](docs/SubscriptionProductComponentGroupServiceApi.md#create) | **POST** /subscription-product-component-group/create | Create
*SubscriptionProductComponentGroupServiceApi* | [**delete**](docs/SubscriptionProductComponentGroupServiceApi.md#delete) | **POST** /subscription-product-component-group/delete | Delete
*SubscriptionProductComponentGroupServiceApi* | [**read**](docs/SubscriptionProductComponentGroupServiceApi.md#read) | **GET** /subscription-product-component-group/read | Read
*SubscriptionProductComponentGroupServiceApi* | [**search**](docs/SubscriptionProductComponentGroupServiceApi.md#search) | **POST** /subscription-product-component-group/search | Search
*SubscriptionProductComponentGroupServiceApi* | [**update**](docs/SubscriptionProductComponentGroupServiceApi.md#update) | **POST** /subscription-product-component-group/update | Update
*SubscriptionProductComponentServiceApi* | [**count**](docs/SubscriptionProductComponentServiceApi.md#count) | **POST** /subscription-product-component/count | Count
*SubscriptionProductComponentServiceApi* | [**create**](docs/SubscriptionProductComponentServiceApi.md#create) | **POST** /subscription-product-component/create | Create
*SubscriptionProductComponentServiceApi* | [**delete**](docs/SubscriptionProductComponentServiceApi.md#delete) | **POST** /subscription-product-component/delete | Delete
*SubscriptionProductComponentServiceApi* | [**read**](docs/SubscriptionProductComponentServiceApi.md#read) | **GET** /subscription-product-component/read | Read
*SubscriptionProductComponentServiceApi* | [**search**](docs/SubscriptionProductComponentServiceApi.md#search) | **POST** /subscription-product-component/search | Search
*SubscriptionProductComponentServiceApi* | [**update**](docs/SubscriptionProductComponentServiceApi.md#update) | **POST** /subscription-product-component/update | Update
*SubscriptionProductFeeTierServiceApi* | [**count**](docs/SubscriptionProductFeeTierServiceApi.md#count) | **POST** /subscription-product-fee-tier/count | Count
*SubscriptionProductFeeTierServiceApi* | [**create**](docs/SubscriptionProductFeeTierServiceApi.md#create) | **POST** /subscription-product-fee-tier/create | Create
*SubscriptionProductFeeTierServiceApi* | [**delete**](docs/SubscriptionProductFeeTierServiceApi.md#delete) | **POST** /subscription-product-fee-tier/delete | Delete
*SubscriptionProductFeeTierServiceApi* | [**read**](docs/SubscriptionProductFeeTierServiceApi.md#read) | **GET** /subscription-product-fee-tier/read | Read
*SubscriptionProductFeeTierServiceApi* | [**search**](docs/SubscriptionProductFeeTierServiceApi.md#search) | **POST** /subscription-product-fee-tier/search | Search
*SubscriptionProductFeeTierServiceApi* | [**update**](docs/SubscriptionProductFeeTierServiceApi.md#update) | **POST** /subscription-product-fee-tier/update | Update
*SubscriptionProductMeteredFeeServiceApi* | [**count**](docs/SubscriptionProductMeteredFeeServiceApi.md#count) | **POST** /subscription-product-metered-fee/count | Count
*SubscriptionProductMeteredFeeServiceApi* | [**create**](docs/SubscriptionProductMeteredFeeServiceApi.md#create) | **POST** /subscription-product-metered-fee/create | Create
*SubscriptionProductMeteredFeeServiceApi* | [**delete**](docs/SubscriptionProductMeteredFeeServiceApi.md#delete) | **POST** /subscription-product-metered-fee/delete | Delete
*SubscriptionProductMeteredFeeServiceApi* | [**read**](docs/SubscriptionProductMeteredFeeServiceApi.md#read) | **GET** /subscription-product-metered-fee/read | Read
*SubscriptionProductMeteredFeeServiceApi* | [**search**](docs/SubscriptionProductMeteredFeeServiceApi.md#search) | **POST** /subscription-product-metered-fee/search | Search
*SubscriptionProductMeteredFeeServiceApi* | [**update**](docs/SubscriptionProductMeteredFeeServiceApi.md#update) | **POST** /subscription-product-metered-fee/update | Update
*SubscriptionProductPeriodFeeServiceApi* | [**count**](docs/SubscriptionProductPeriodFeeServiceApi.md#count) | **POST** /subscription-product-period-fee/count | Count
*SubscriptionProductPeriodFeeServiceApi* | [**create**](docs/SubscriptionProductPeriodFeeServiceApi.md#create) | **POST** /subscription-product-period-fee/create | Create
*SubscriptionProductPeriodFeeServiceApi* | [**delete**](docs/SubscriptionProductPeriodFeeServiceApi.md#delete) | **POST** /subscription-product-period-fee/delete | Delete
*SubscriptionProductPeriodFeeServiceApi* | [**read**](docs/SubscriptionProductPeriodFeeServiceApi.md#read) | **GET** /subscription-product-period-fee/read | Read
*SubscriptionProductPeriodFeeServiceApi* | [**search**](docs/SubscriptionProductPeriodFeeServiceApi.md#search) | **POST** /subscription-product-period-fee/search | Search
*SubscriptionProductPeriodFeeServiceApi* | [**update**](docs/SubscriptionProductPeriodFeeServiceApi.md#update) | **POST** /subscription-product-period-fee/update | Update
*SubscriptionProductRetirementServiceApi* | [**count**](docs/SubscriptionProductRetirementServiceApi.md#count) | **POST** /subscription-product-retirement/count | Count
*SubscriptionProductRetirementServiceApi* | [**create**](docs/SubscriptionProductRetirementServiceApi.md#create) | **POST** /subscription-product-retirement/create | Create
*SubscriptionProductRetirementServiceApi* | [**read**](docs/SubscriptionProductRetirementServiceApi.md#read) | **GET** /subscription-product-retirement/read | Read
*SubscriptionProductRetirementServiceApi* | [**search**](docs/SubscriptionProductRetirementServiceApi.md#search) | **POST** /subscription-product-retirement/search | Search
*SubscriptionProductServiceApi* | [**count**](docs/SubscriptionProductServiceApi.md#count) | **POST** /subscription-product/count | Count
*SubscriptionProductServiceApi* | [**create**](docs/SubscriptionProductServiceApi.md#create) | **POST** /subscription-product/create | Create
*SubscriptionProductServiceApi* | [**read**](docs/SubscriptionProductServiceApi.md#read) | **GET** /subscription-product/read | Read
*SubscriptionProductServiceApi* | [**search**](docs/SubscriptionProductServiceApi.md#search) | **POST** /subscription-product/search | Search
*SubscriptionProductServiceApi* | [**update**](docs/SubscriptionProductServiceApi.md#update) | **POST** /subscription-product/update | Update
*SubscriptionProductSetupFeeServiceApi* | [**count**](docs/SubscriptionProductSetupFeeServiceApi.md#count) | **POST** /subscription-product-setup-fee/count | Count
*SubscriptionProductSetupFeeServiceApi* | [**create**](docs/SubscriptionProductSetupFeeServiceApi.md#create) | **POST** /subscription-product-setup-fee/create | Create
*SubscriptionProductSetupFeeServiceApi* | [**delete**](docs/SubscriptionProductSetupFeeServiceApi.md#delete) | **POST** /subscription-product-setup-fee/delete | Delete
*SubscriptionProductSetupFeeServiceApi* | [**read**](docs/SubscriptionProductSetupFeeServiceApi.md#read) | **GET** /subscription-product-setup-fee/read | Read
*SubscriptionProductSetupFeeServiceApi* | [**search**](docs/SubscriptionProductSetupFeeServiceApi.md#search) | **POST** /subscription-product-setup-fee/search | Search
*SubscriptionProductSetupFeeServiceApi* | [**update**](docs/SubscriptionProductSetupFeeServiceApi.md#update) | **POST** /subscription-product-setup-fee/update | Update
*SubscriptionProductVersionRetirementServiceApi* | [**count**](docs/SubscriptionProductVersionRetirementServiceApi.md#count) | **POST** /subscription-product-version-retirement/count | Count
*SubscriptionProductVersionRetirementServiceApi* | [**create**](docs/SubscriptionProductVersionRetirementServiceApi.md#create) | **POST** /subscription-product-version-retirement/create | Create
*SubscriptionProductVersionRetirementServiceApi* | [**read**](docs/SubscriptionProductVersionRetirementServiceApi.md#read) | **GET** /subscription-product-version-retirement/read | Read
*SubscriptionProductVersionRetirementServiceApi* | [**search**](docs/SubscriptionProductVersionRetirementServiceApi.md#search) | **POST** /subscription-product-version-retirement/search | Search
*SubscriptionProductVersionServiceApi* | [**activate**](docs/SubscriptionProductVersionServiceApi.md#activate) | **POST** /subscription-product-version/activate | activate
*SubscriptionProductVersionServiceApi* | [**count**](docs/SubscriptionProductVersionServiceApi.md#count) | **POST** /subscription-product-version/count | Count
*SubscriptionProductVersionServiceApi* | [**create**](docs/SubscriptionProductVersionServiceApi.md#create) | **POST** /subscription-product-version/create | Create
*SubscriptionProductVersionServiceApi* | [**read**](docs/SubscriptionProductVersionServiceApi.md#read) | **GET** /subscription-product-version/read | Read
*SubscriptionProductVersionServiceApi* | [**search**](docs/SubscriptionProductVersionServiceApi.md#search) | **POST** /subscription-product-version/search | Search
*SubscriptionProductVersionServiceApi* | [**update**](docs/SubscriptionProductVersionServiceApi.md#update) | **POST** /subscription-product-version/update | Update
*SubscriptionServiceApi* | [**applyChanges**](docs/SubscriptionServiceApi.md#applyChanges) | **POST** /subscription/applyChanges | apply changes
*SubscriptionServiceApi* | [**count**](docs/SubscriptionServiceApi.md#count) | **POST** /subscription/count | Count
*SubscriptionServiceApi* | [**create**](docs/SubscriptionServiceApi.md#create) | **POST** /subscription/create | Create
*SubscriptionServiceApi* | [**initialize**](docs/SubscriptionServiceApi.md#initialize) | **POST** /subscription/initialize | initialize
*SubscriptionServiceApi* | [**initializeSubscriberPresent**](docs/SubscriptionServiceApi.md#initializeSubscriberPresent) | **POST** /subscription/initializeSubscriberPresent | initializeSubscriberPresent
*SubscriptionServiceApi* | [**read**](docs/SubscriptionServiceApi.md#read) | **GET** /subscription/read | Read
*SubscriptionServiceApi* | [**search**](docs/SubscriptionServiceApi.md#search) | **POST** /subscription/search | Search
*SubscriptionServiceApi* | [**terminate**](docs/SubscriptionServiceApi.md#terminate) | **POST** /subscription/terminate | terminate
*SubscriptionServiceApi* | [**updateProductVersion**](docs/SubscriptionServiceApi.md#updateProductVersion) | **POST** /subscription/updateProductVersion | update product version
*SubscriptionSuspensionServiceApi* | [**count**](docs/SubscriptionSuspensionServiceApi.md#count) | **POST** /subscription-suspension/count | Count
*SubscriptionSuspensionServiceApi* | [**create**](docs/SubscriptionSuspensionServiceApi.md#create) | **POST** /subscription-suspension/create | Create
*SubscriptionSuspensionServiceApi* | [**read**](docs/SubscriptionSuspensionServiceApi.md#read) | **GET** /subscription-suspension/read | Read
*SubscriptionSuspensionServiceApi* | [**search**](docs/SubscriptionSuspensionServiceApi.md#search) | **POST** /subscription-suspension/search | Search
*SubscriptionSuspensionServiceApi* | [**terminate**](docs/SubscriptionSuspensionServiceApi.md#terminate) | **POST** /subscription-suspension/terminate | terminate
*SubscriptionVersionServiceApi* | [**count**](docs/SubscriptionVersionServiceApi.md#count) | **POST** /subscription-version/count | Count
*SubscriptionVersionServiceApi* | [**read**](docs/SubscriptionVersionServiceApi.md#read) | **GET** /subscription-version/read | Read
*SubscriptionVersionServiceApi* | [**search**](docs/SubscriptionVersionServiceApi.md#search) | **POST** /subscription-version/search | Search
*TokenServiceApi* | [**count**](docs/TokenServiceApi.md#count) | **POST** /token/count | Count
*TokenServiceApi* | [**create**](docs/TokenServiceApi.md#create) | **POST** /token/create | Create
*TokenServiceApi* | [**delete**](docs/TokenServiceApi.md#delete) | **POST** /token/delete | Delete
*TokenServiceApi* | [**read**](docs/TokenServiceApi.md#read) | **GET** /token/read | Read
*TokenServiceApi* | [**search**](docs/TokenServiceApi.md#search) | **POST** /token/search | Search
*TokenServiceApi* | [**update**](docs/TokenServiceApi.md#update) | **POST** /token/update | Update
*TokenVersionServiceApi* | [**activeVersion**](docs/TokenVersionServiceApi.md#activeVersion) | **GET** /token-version/active-version | Active Version
*TokenVersionServiceApi* | [**count**](docs/TokenVersionServiceApi.md#count) | **POST** /token-version/count | Count
*TokenVersionServiceApi* | [**read**](docs/TokenVersionServiceApi.md#read) | **GET** /token-version/read | Read
*TokenVersionServiceApi* | [**search**](docs/TokenVersionServiceApi.md#search) | **POST** /token-version/search | Search
*TransactionCompletionServiceApi* | [**completeOffline**](docs/TransactionCompletionServiceApi.md#completeOffline) | **POST** /transaction-completion/completeOffline | completeOffline
*TransactionCompletionServiceApi* | [**completeOnline**](docs/TransactionCompletionServiceApi.md#completeOnline) | **POST** /transaction-completion/completeOnline | completeOnline
*TransactionCompletionServiceApi* | [**count**](docs/TransactionCompletionServiceApi.md#count) | **POST** /transaction-completion/count | Count
*TransactionCompletionServiceApi* | [**read**](docs/TransactionCompletionServiceApi.md#read) | **GET** /transaction-completion/read | Read
*TransactionCompletionServiceApi* | [**search**](docs/TransactionCompletionServiceApi.md#search) | **POST** /transaction-completion/search | Search
*TransactionInvoiceServiceApi* | [**count**](docs/TransactionInvoiceServiceApi.md#count) | **POST** /transaction-invoice/count | Count
*TransactionInvoiceServiceApi* | [**getInvoiceDocument**](docs/TransactionInvoiceServiceApi.md#getInvoiceDocument) | **GET** /transaction-invoice/getInvoiceDocument | getInvoiceDocument
*TransactionInvoiceServiceApi* | [**isReplacementPossible**](docs/TransactionInvoiceServiceApi.md#isReplacementPossible) | **GET** /transaction-invoice/isReplacementPossible | isReplacementPossible
*TransactionInvoiceServiceApi* | [**markAsPaid**](docs/TransactionInvoiceServiceApi.md#markAsPaid) | **POST** /transaction-invoice/markAsPaid | Mark as Paid
*TransactionInvoiceServiceApi* | [**read**](docs/TransactionInvoiceServiceApi.md#read) | **GET** /transaction-invoice/read | Read
*TransactionInvoiceServiceApi* | [**replace**](docs/TransactionInvoiceServiceApi.md#replace) | **POST** /transaction-invoice/replace | replace
*TransactionInvoiceServiceApi* | [**search**](docs/TransactionInvoiceServiceApi.md#search) | **POST** /transaction-invoice/search | Search
*TransactionServiceApi* | [**buildJavaScriptUrl**](docs/TransactionServiceApi.md#buildJavaScriptUrl) | **GET** /transaction/buildJavaScriptUrl | Build JavaScript URL
*TransactionServiceApi* | [**buildMobileSdkUrlWithCredentials**](docs/TransactionServiceApi.md#buildMobileSdkUrlWithCredentials) | **GET** /transaction/buildMobileSdkUrlWithCredentials | Build Mobile SDK URL with Credentials
*TransactionServiceApi* | [**buildPaymentPageUrl**](docs/TransactionServiceApi.md#buildPaymentPageUrl) | **GET** /transaction/buildPaymentPageUrl | Build Payment Page URL
*TransactionServiceApi* | [**confirm**](docs/TransactionServiceApi.md#confirm) | **POST** /transaction/confirm | Confirm
*TransactionServiceApi* | [**count**](docs/TransactionServiceApi.md#count) | **POST** /transaction/count | Count
*TransactionServiceApi* | [**create**](docs/TransactionServiceApi.md#create) | **POST** /transaction/create | Create
*TransactionServiceApi* | [**createTransactionCredentials**](docs/TransactionServiceApi.md#createTransactionCredentials) | **POST** /transaction/createTransactionCredentials | Create Transaction Credentials
*TransactionServiceApi* | [**deleteOneClickTokenWithCredentials**](docs/TransactionServiceApi.md#deleteOneClickTokenWithCredentials) | **POST** /transaction/deleteOneClickTokenWithCredentials | Delete One-Click Token with Credentials
*TransactionServiceApi* | [**fetchOneClickTokensWithCredentials**](docs/TransactionServiceApi.md#fetchOneClickTokensWithCredentials) | **GET** /transaction/fetchOneClickTokensWithCredentials | Fetch One Click Tokens with Credentials
*TransactionServiceApi* | [**fetchPossiblePaymentMethods**](docs/TransactionServiceApi.md#fetchPossiblePaymentMethods) | **GET** /transaction/fetchPossiblePaymentMethods | Fetch Possible Payment Methods
*TransactionServiceApi* | [**fetchPossiblePaymentMethodsWithCredentials**](docs/TransactionServiceApi.md#fetchPossiblePaymentMethodsWithCredentials) | **GET** /transaction/fetchPossiblePaymentMethodsWithCredentials | Fetch Possible Payment Methods with Credentials
*TransactionServiceApi* | [**getInvoiceDocument**](docs/TransactionServiceApi.md#getInvoiceDocument) | **GET** /transaction/getInvoiceDocument | getInvoiceDocument
*TransactionServiceApi* | [**getLatestTransactionLineItemVersion**](docs/TransactionServiceApi.md#getLatestTransactionLineItemVersion) | **GET** /transaction/getLatestTransactionLineItemVersion | getLatestTransactionLineItemVersion
*TransactionServiceApi* | [**getPackingSlip**](docs/TransactionServiceApi.md#getPackingSlip) | **GET** /transaction/getPackingSlip | getPackingSlip
*TransactionServiceApi* | [**processOneClickTokenWithCredentials**](docs/TransactionServiceApi.md#processOneClickTokenWithCredentials) | **POST** /transaction/processOneClickTokenWithCredentials | Process One-Click Token with Credentials
*TransactionServiceApi* | [**read**](docs/TransactionServiceApi.md#read) | **GET** /transaction/read | Read
*TransactionServiceApi* | [**readWithCredentials**](docs/TransactionServiceApi.md#readWithCredentials) | **GET** /transaction/readWithCredentials | Read With Credentials
*TransactionServiceApi* | [**search**](docs/TransactionServiceApi.md#search) | **POST** /transaction/search | Search
*TransactionServiceApi* | [**update**](docs/TransactionServiceApi.md#update) | **POST** /transaction/update | Update
*TransactionServiceApi* | [**updateTransactionLineItems**](docs/TransactionServiceApi.md#updateTransactionLineItems) | **POST** /transaction/updateTransactionLineItems | updateTransactionLineItems
*TransactionVoidServiceApi* | [**count**](docs/TransactionVoidServiceApi.md#count) | **POST** /transaction-void/count | Count
*TransactionVoidServiceApi* | [**read**](docs/TransactionVoidServiceApi.md#read) | **GET** /transaction-void/read | Read
*TransactionVoidServiceApi* | [**search**](docs/TransactionVoidServiceApi.md#search) | **POST** /transaction-void/search | Search
*TransactionVoidServiceApi* | [**voidOffline**](docs/TransactionVoidServiceApi.md#voidOffline) | **POST** /transaction-void/voidOffline | voidOffline
*TransactionVoidServiceApi* | [**voidOnline**](docs/TransactionVoidServiceApi.md#voidOnline) | **POST** /transaction-void/voidOnline | voidOnline
*WebhookListenerServiceApi* | [**count**](docs/WebhookListenerServiceApi.md#count) | **POST** /webhook-listener/count | Count
*WebhookListenerServiceApi* | [**create**](docs/WebhookListenerServiceApi.md#create) | **POST** /webhook-listener/create | Create
*WebhookListenerServiceApi* | [**delete**](docs/WebhookListenerServiceApi.md#delete) | **POST** /webhook-listener/delete | Delete
*WebhookListenerServiceApi* | [**read**](docs/WebhookListenerServiceApi.md#read) | **GET** /webhook-listener/read | Read
*WebhookListenerServiceApi* | [**search**](docs/WebhookListenerServiceApi.md#search) | **POST** /webhook-listener/search | Search
*WebhookListenerServiceApi* | [**update**](docs/WebhookListenerServiceApi.md#update) | **POST** /webhook-listener/update | Update
*WebhookUrlServiceApi* | [**count**](docs/WebhookUrlServiceApi.md#count) | **POST** /webhook-url/count | Count
*WebhookUrlServiceApi* | [**create**](docs/WebhookUrlServiceApi.md#create) | **POST** /webhook-url/create | Create
*WebhookUrlServiceApi* | [**delete**](docs/WebhookUrlServiceApi.md#delete) | **POST** /webhook-url/delete | Delete
*WebhookUrlServiceApi* | [**read**](docs/WebhookUrlServiceApi.md#read) | **GET** /webhook-url/read | Read
*WebhookUrlServiceApi* | [**search**](docs/WebhookUrlServiceApi.md#search) | **POST** /webhook-url/search | Search
*WebhookUrlServiceApi* | [**update**](docs/WebhookUrlServiceApi.md#update) | **POST** /webhook-url/update | Update


## Documentation for Models

 - [AbstractAccountUpdate](docs/AbstractAccountUpdate.md)
 - [AbstractApplicationUserUpdate](docs/AbstractApplicationUserUpdate.md)
 - [AbstractHumanUserUpdate](docs/AbstractHumanUserUpdate.md)
 - [AbstractSpaceUpdate](docs/AbstractSpaceUpdate.md)
 - [AbstractSubscriberUpdate](docs/AbstractSubscriberUpdate.md)
 - [AbstractSubscriptionMetricUpdate](docs/AbstractSubscriptionMetricUpdate.md)
 - [AbstractSubscriptionProductActive](docs/AbstractSubscriptionProductActive.md)
 - [AbstractTokenUpdate](docs/AbstractTokenUpdate.md)
 - [AbstractTransactionPending](docs/AbstractTransactionPending.md)
 - [AbstractWebhookListenerUpdate](docs/AbstractWebhookListenerUpdate.md)
 - [AbstractWebhookUrlUpdate](docs/AbstractWebhookUrlUpdate.md)
 - [Account](docs/Account.md)
 - [AccountCreate](docs/AccountCreate.md)
 - [AccountState](docs/AccountState.md)
 - [AccountType](docs/AccountType.md)
 - [AccountUpdate](docs/AccountUpdate.md)
 - [Address](docs/Address.md)
 - [AddressCreate](docs/AddressCreate.md)
 - [ApplicationUser](docs/ApplicationUser.md)
 - [ApplicationUserCreate](docs/ApplicationUserCreate.md)
 - [ApplicationUserCreateWithMacKey](docs/ApplicationUserCreateWithMacKey.md)
 - [ApplicationUserUpdate](docs/ApplicationUserUpdate.md)
 - [Charge](docs/Charge.md)
 - [ChargeAttempt](docs/ChargeAttempt.md)
 - [ChargeAttemptEnvironment](docs/ChargeAttemptEnvironment.md)
 - [ChargeAttemptState](docs/ChargeAttemptState.md)
 - [ChargeFlow](docs/ChargeFlow.md)
 - [ChargeFlowLevel](docs/ChargeFlowLevel.md)
 - [ChargeFlowLevelConfiguration](docs/ChargeFlowLevelConfiguration.md)
 - [ChargeFlowLevelConfigurationType](docs/ChargeFlowLevelConfigurationType.md)
 - [ChargeFlowLevelState](docs/ChargeFlowLevelState.md)
 - [ChargeState](docs/ChargeState.md)
 - [ChargeType](docs/ChargeType.md)
 - [ClientError](docs/ClientError.md)
 - [ClientErrorType](docs/ClientErrorType.md)
 - [Condition](docs/Condition.md)
 - [ConditionType](docs/ConditionType.md)
 - [ConnectorInvocation](docs/ConnectorInvocation.md)
 - [ConnectorInvocationStage](docs/ConnectorInvocationStage.md)
 - [CreationEntityState](docs/CreationEntityState.md)
 - [CriteriaOperator](docs/CriteriaOperator.md)
 - [CustomersPresence](docs/CustomersPresence.md)
 - [DataCollectionType](docs/DataCollectionType.md)
 - [DatabaseTranslatedString](docs/DatabaseTranslatedString.md)
 - [DatabaseTranslatedStringCreate](docs/DatabaseTranslatedStringCreate.md)
 - [DatabaseTranslatedStringItem](docs/DatabaseTranslatedStringItem.md)
 - [DatabaseTranslatedStringItemCreate](docs/DatabaseTranslatedStringItemCreate.md)
 - [DeliveryIndication](docs/DeliveryIndication.md)
 - [DeliveryIndicationDecisionReason](docs/DeliveryIndicationDecisionReason.md)
 - [DeliveryIndicationState](docs/DeliveryIndicationState.md)
 - [DocumentTemplate](docs/DocumentTemplate.md)
 - [DocumentTemplateType](docs/DocumentTemplateType.md)
 - [EntityQuery](docs/EntityQuery.md)
 - [EntityQueryFilter](docs/EntityQueryFilter.md)
 - [EntityQueryFilterType](docs/EntityQueryFilterType.md)
 - [EntityQueryOrderBy](docs/EntityQueryOrderBy.md)
 - [EntityQueryOrderByType](docs/EntityQueryOrderByType.md)
 - [FailureCategory](docs/FailureCategory.md)
 - [FailureReason](docs/FailureReason.md)
 - [Feature](docs/Feature.md)
 - [Gender](docs/Gender.md)
 - [HumanUser](docs/HumanUser.md)
 - [HumanUserCreate](docs/HumanUserCreate.md)
 - [HumanUserUpdate](docs/HumanUserUpdate.md)
 - [InstallmentCalculatedPlan](docs/InstallmentCalculatedPlan.md)
 - [InstallmentCalculatedSlice](docs/InstallmentCalculatedSlice.md)
 - [InstallmentPayment](docs/InstallmentPayment.md)
 - [InstallmentPaymentSlice](docs/InstallmentPaymentSlice.md)
 - [InstallmentPaymentSliceState](docs/InstallmentPaymentSliceState.md)
 - [InstallmentPaymentState](docs/InstallmentPaymentState.md)
 - [InstallmentPlanConfiguration](docs/InstallmentPlanConfiguration.md)
 - [InstallmentPlanSliceConfiguration](docs/InstallmentPlanSliceConfiguration.md)
 - [Label](docs/Label.md)
 - [LabelDescriptor](docs/LabelDescriptor.md)
 - [LabelDescriptorCategory](docs/LabelDescriptorCategory.md)
 - [LabelDescriptorGroup](docs/LabelDescriptorGroup.md)
 - [LabelDescriptorType](docs/LabelDescriptorType.md)
 - [LegalOrganizationForm](docs/LegalOrganizationForm.md)
 - [LineItem](docs/LineItem.md)
 - [LineItemAttribute](docs/LineItemAttribute.md)
 - [LineItemAttributeCreate](docs/LineItemAttributeCreate.md)
 - [LineItemCreate](docs/LineItemCreate.md)
 - [LineItemReduction](docs/LineItemReduction.md)
 - [LineItemReductionCreate](docs/LineItemReductionCreate.md)
 - [LineItemType](docs/LineItemType.md)
 - [LocalizedString](docs/LocalizedString.md)
 - [ManualTask](docs/ManualTask.md)
 - [ManualTaskAction](docs/ManualTaskAction.md)
 - [ManualTaskActionStyle](docs/ManualTaskActionStyle.md)
 - [ManualTaskState](docs/ManualTaskState.md)
 - [ManualTaskType](docs/ManualTaskType.md)
 - [OneClickPaymentMode](docs/OneClickPaymentMode.md)
 - [PaymentConnector](docs/PaymentConnector.md)
 - [PaymentConnectorConfiguration](docs/PaymentConnectorConfiguration.md)
 - [PaymentConnectorFeature](docs/PaymentConnectorFeature.md)
 - [PaymentMethod](docs/PaymentMethod.md)
 - [PaymentMethodBrand](docs/PaymentMethodBrand.md)
 - [PaymentMethodConfiguration](docs/PaymentMethodConfiguration.md)
 - [PaymentPrimaryRiskTaker](docs/PaymentPrimaryRiskTaker.md)
 - [PaymentProcessor](docs/PaymentProcessor.md)
 - [PaymentProcessorConfiguration](docs/PaymentProcessorConfiguration.md)
 - [Permission](docs/Permission.md)
 - [PersistableCurrencyAmount](docs/PersistableCurrencyAmount.md)
 - [PersistableCurrencyAmountUpdate](docs/PersistableCurrencyAmountUpdate.md)
 - [ProductFeeType](docs/ProductFeeType.md)
 - [ProductMeteredFee](docs/ProductMeteredFee.md)
 - [ProductMeteredFeeUpdate](docs/ProductMeteredFeeUpdate.md)
 - [ProductMeteredTierFee](docs/ProductMeteredTierFee.md)
 - [ProductMeteredTierFeeUpdate](docs/ProductMeteredTierFeeUpdate.md)
 - [ProductMeteredTierPricing](docs/ProductMeteredTierPricing.md)
 - [ProductPeriodFee](docs/ProductPeriodFee.md)
 - [ProductPeriodFeeUpdate](docs/ProductPeriodFeeUpdate.md)
 - [ProductSetupFee](docs/ProductSetupFee.md)
 - [ProductSetupFeeUpdate](docs/ProductSetupFeeUpdate.md)
 - [Refund](docs/Refund.md)
 - [RefundCreate](docs/RefundCreate.md)
 - [RefundState](docs/RefundState.md)
 - [RefundType](docs/RefundType.md)
 - [RenderedDocument](docs/RenderedDocument.md)
 - [ResourcePath](docs/ResourcePath.md)
 - [ResourceState](docs/ResourceState.md)
 - [RestCountry](docs/RestCountry.md)
 - [RestCountryState](docs/RestCountryState.md)
 - [RestCurrency](docs/RestCurrency.md)
 - [RestLanguage](docs/RestLanguage.md)
 - [Scope](docs/Scope.md)
 - [ServerError](docs/ServerError.md)
 - [Space](docs/Space.md)
 - [SpaceAddress](docs/SpaceAddress.md)
 - [SpaceAddressCreate](docs/SpaceAddressCreate.md)
 - [SpaceCreate](docs/SpaceCreate.md)
 - [SpaceReference](docs/SpaceReference.md)
 - [SpaceReferenceState](docs/SpaceReferenceState.md)
 - [SpaceUpdate](docs/SpaceUpdate.md)
 - [SpaceView](docs/SpaceView.md)
 - [StaticValue](docs/StaticValue.md)
 - [Subscriber](docs/Subscriber.md)
 - [SubscriberActive](docs/SubscriberActive.md)
 - [SubscriberCreate](docs/SubscriberCreate.md)
 - [SubscriberUpdate](docs/SubscriberUpdate.md)
 - [Subscription](docs/Subscription.md)
 - [SubscriptionChangeRequest](docs/SubscriptionChangeRequest.md)
 - [SubscriptionCharge](docs/SubscriptionCharge.md)
 - [SubscriptionChargeCreate](docs/SubscriptionChargeCreate.md)
 - [SubscriptionChargeProcessingType](docs/SubscriptionChargeProcessingType.md)
 - [SubscriptionChargeState](docs/SubscriptionChargeState.md)
 - [SubscriptionChargeType](docs/SubscriptionChargeType.md)
 - [SubscriptionCreateRequest](docs/SubscriptionCreateRequest.md)
 - [SubscriptionLedgerEntry](docs/SubscriptionLedgerEntry.md)
 - [SubscriptionLedgerEntryCreate](docs/SubscriptionLedgerEntryCreate.md)
 - [SubscriptionLedgerEntryState](docs/SubscriptionLedgerEntryState.md)
 - [SubscriptionMetric](docs/SubscriptionMetric.md)
 - [SubscriptionMetricActive](docs/SubscriptionMetricActive.md)
 - [SubscriptionMetricCreate](docs/SubscriptionMetricCreate.md)
 - [SubscriptionMetricType](docs/SubscriptionMetricType.md)
 - [SubscriptionMetricUpdate](docs/SubscriptionMetricUpdate.md)
 - [SubscriptionMetricUsageReport](docs/SubscriptionMetricUsageReport.md)
 - [SubscriptionMetricUsageReportCreate](docs/SubscriptionMetricUsageReportCreate.md)
 - [SubscriptionPending](docs/SubscriptionPending.md)
 - [SubscriptionPeriodBill](docs/SubscriptionPeriodBill.md)
 - [SubscriptionPeriodBillState](docs/SubscriptionPeriodBillState.md)
 - [SubscriptionProduct](docs/SubscriptionProduct.md)
 - [SubscriptionProductActive](docs/SubscriptionProductActive.md)
 - [SubscriptionProductComponent](docs/SubscriptionProductComponent.md)
 - [SubscriptionProductComponentGroup](docs/SubscriptionProductComponentGroup.md)
 - [SubscriptionProductComponentGroupUpdate](docs/SubscriptionProductComponentGroupUpdate.md)
 - [SubscriptionProductComponentReference](docs/SubscriptionProductComponentReference.md)
 - [SubscriptionProductComponentReferenceState](docs/SubscriptionProductComponentReferenceState.md)
 - [SubscriptionProductComponentUpdate](docs/SubscriptionProductComponentUpdate.md)
 - [SubscriptionProductCreate](docs/SubscriptionProductCreate.md)
 - [SubscriptionProductRetirement](docs/SubscriptionProductRetirement.md)
 - [SubscriptionProductRetirementCreate](docs/SubscriptionProductRetirementCreate.md)
 - [SubscriptionProductState](docs/SubscriptionProductState.md)
 - [SubscriptionProductVersion](docs/SubscriptionProductVersion.md)
 - [SubscriptionProductVersionPending](docs/SubscriptionProductVersionPending.md)
 - [SubscriptionProductVersionRetirement](docs/SubscriptionProductVersionRetirement.md)
 - [SubscriptionProductVersionRetirementCreate](docs/SubscriptionProductVersionRetirementCreate.md)
 - [SubscriptionProductVersionState](docs/SubscriptionProductVersionState.md)
 - [SubscriptionState](docs/SubscriptionState.md)
 - [SubscriptionSuspension](docs/SubscriptionSuspension.md)
 - [SubscriptionSuspensionAction](docs/SubscriptionSuspensionAction.md)
 - [SubscriptionSuspensionCreate](docs/SubscriptionSuspensionCreate.md)
 - [SubscriptionSuspensionReason](docs/SubscriptionSuspensionReason.md)
 - [SubscriptionSuspensionRunning](docs/SubscriptionSuspensionRunning.md)
 - [SubscriptionSuspensionState](docs/SubscriptionSuspensionState.md)
 - [SubscriptionUpdate](docs/SubscriptionUpdate.md)
 - [SubscriptionVersion](docs/SubscriptionVersion.md)
 - [SubscriptionVersionState](docs/SubscriptionVersionState.md)
 - [Tax](docs/Tax.md)
 - [TaxClass](docs/TaxClass.md)
 - [TaxCreate](docs/TaxCreate.md)
 - [TenantDatabase](docs/TenantDatabase.md)
 - [Token](docs/Token.md)
 - [TokenCreate](docs/TokenCreate.md)
 - [TokenUpdate](docs/TokenUpdate.md)
 - [TokenVersion](docs/TokenVersion.md)
 - [TokenVersionState](docs/TokenVersionState.md)
 - [Transaction](docs/Transaction.md)
 - [TransactionAwareEntity](docs/TransactionAwareEntity.md)
 - [TransactionCompletion](docs/TransactionCompletion.md)
 - [TransactionCompletionMode](docs/TransactionCompletionMode.md)
 - [TransactionCompletionState](docs/TransactionCompletionState.md)
 - [TransactionCreate](docs/TransactionCreate.md)
 - [TransactionGroup](docs/TransactionGroup.md)
 - [TransactionGroupState](docs/TransactionGroupState.md)
 - [TransactionInvoice](docs/TransactionInvoice.md)
 - [TransactionInvoiceReplacement](docs/TransactionInvoiceReplacement.md)
 - [TransactionInvoiceState](docs/TransactionInvoiceState.md)
 - [TransactionLineItemUpdateRequest](docs/TransactionLineItemUpdateRequest.md)
 - [TransactionLineItemVersion](docs/TransactionLineItemVersion.md)
 - [TransactionPending](docs/TransactionPending.md)
 - [TransactionState](docs/TransactionState.md)
 - [TransactionUserInterfaceType](docs/TransactionUserInterfaceType.md)
 - [TransactionVoid](docs/TransactionVoid.md)
 - [TransactionVoidMode](docs/TransactionVoidMode.md)
 - [TransactionVoidState](docs/TransactionVoidState.md)
 - [User](docs/User.md)
 - [UserType](docs/UserType.md)
 - [WebhookIdentity](docs/WebhookIdentity.md)
 - [WebhookListener](docs/WebhookListener.md)
 - [WebhookListenerCreate](docs/WebhookListenerCreate.md)
 - [WebhookListenerEntity](docs/WebhookListenerEntity.md)
 - [WebhookListenerUpdate](docs/WebhookListenerUpdate.md)
 - [WebhookUrl](docs/WebhookUrl.md)
 - [WebhookUrlCreate](docs/WebhookUrlCreate.md)
 - [WebhookUrlUpdate](docs/WebhookUrlUpdate.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



