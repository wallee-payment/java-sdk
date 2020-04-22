package com.wallee.sdk;

import com.wallee.sdk.service.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.google.api.client.http.AbstractHttpContent;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.Json;

import java.io.IOException;
import java.io.OutputStream;

@javax.annotation.Generated(value = "io.wallee.sdk.java.WalleeJavaClientCodegen", date = "2020-04-22T15:39:51.189+02:00")
public class ApiClient {
    private final String basePath = "https://app-wallee.com:443/api";
    private final HttpRequestFactory httpRequestFactory;
    private final ObjectMapper objectMapper;
    private long userId;
    private String applicationKey;

    // A reasonable default object mapper. Client can pass in a chosen ObjectMapper anyway, this is just for reasonable defaults.
    private static ObjectMapper createDefaultObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper()
            .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .setDateFormat(new RFC3339DateFormat());
        objectMapper.registerModule(new JavaTimeModule());
        return objectMapper;
    }

    /**
     * Constructor for ApiClient
     *
     * @param userId
     * @param applicationKey
     */
    public ApiClient(long userId, String applicationKey) {
        if (applicationKey == null || applicationKey.trim().isEmpty()) {
            throw new IllegalArgumentException("The application key cannot be empty or null.");
        }
        if (userId < 1) {
            throw new IllegalArgumentException("The user id is invalid.");
        }

        this.userId = userId;
        this.applicationKey = applicationKey;
        this.httpRequestFactory = this.createRequestFactory();
        this.objectMapper = createDefaultObjectMapper();
    }

    public HttpRequestFactory getHttpRequestFactory() {
        return httpRequestFactory;
    }

    public HttpRequestFactory createRequestFactory() {
        final Auth signer = new Auth(this.userId, this.applicationKey);
        NetHttpTransport transport = new NetHttpTransport();
        return transport.createRequestFactory(new HttpRequestInitializer() {
            public void initialize(HttpRequest request) {
                request.setInterceptor(signer);
            }
        });
    }

    public String getBasePath() {
        return basePath;
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    public class JacksonJsonHttpContent extends AbstractHttpContent {
        /* A POJO that can be serialized with a com.fasterxml Jackson ObjectMapper */
        private final Object data;

        public JacksonJsonHttpContent(Object data) {
            super(Json.MEDIA_TYPE);
            this.data = data;
        }

        @Override
        public void writeTo(OutputStream out) throws IOException {
            objectMapper.writeValue(out, data);
        }
    }

    // Builder pattern to get API instances for this client.
    
    public AccountService accountServiceApi() {
        return new AccountService(this);
    }
    
    public ApplicationUserService applicationUserServiceApi() {
        return new ApplicationUserService(this);
    }
    
    public CardProcessingService cardProcessingServiceApi() {
        return new CardProcessingService(this);
    }
    
    public ChargeAttemptService chargeAttemptServiceApi() {
        return new ChargeAttemptService(this);
    }
    
    public ChargeFlowLevelPaymentLinkService chargeFlowLevelPaymentLinkServiceApi() {
        return new ChargeFlowLevelPaymentLinkService(this);
    }
    
    public ChargeFlowLevelService chargeFlowLevelServiceApi() {
        return new ChargeFlowLevelService(this);
    }
    
    public ChargeFlowService chargeFlowServiceApi() {
        return new ChargeFlowService(this);
    }
    
    public ConditionTypeService conditionTypeServiceApi() {
        return new ConditionTypeService(this);
    }
    
    public CountryService countryServiceApi() {
        return new CountryService(this);
    }
    
    public CountryStateService countryStateServiceApi() {
        return new CountryStateService(this);
    }
    
    public CurrencyService currencyServiceApi() {
        return new CurrencyService(this);
    }
    
    public CustomerAddressService customerAddressServiceApi() {
        return new CustomerAddressService(this);
    }
    
    public CustomerCommentService customerCommentServiceApi() {
        return new CustomerCommentService(this);
    }
    
    public CustomerService customerServiceApi() {
        return new CustomerService(this);
    }
    
    public DebtCollectionCaseService debtCollectionCaseServiceApi() {
        return new DebtCollectionCaseService(this);
    }
    
    public DebtCollectorConfigurationService debtCollectorConfigurationServiceApi() {
        return new DebtCollectorConfigurationService(this);
    }
    
    public DebtCollectorService debtCollectorServiceApi() {
        return new DebtCollectorService(this);
    }
    
    public DeliveryIndicationService deliveryIndicationServiceApi() {
        return new DeliveryIndicationService(this);
    }
    
    public DocumentTemplateService documentTemplateServiceApi() {
        return new DocumentTemplateService(this);
    }
    
    public DocumentTemplateTypeService documentTemplateTypeServiceApi() {
        return new DocumentTemplateTypeService(this);
    }
    
    public HumanUserService humanUserServiceApi() {
        return new HumanUserService(this);
    }
    
    public InstallmentPaymentService installmentPaymentServiceApi() {
        return new InstallmentPaymentService(this);
    }
    
    public InstallmentPaymentSliceService installmentPaymentSliceServiceApi() {
        return new InstallmentPaymentSliceService(this);
    }
    
    public InstallmentPlanCalculationService installmentPlanCalculationServiceApi() {
        return new InstallmentPlanCalculationService(this);
    }
    
    public InstallmentPlanConfigurationService installmentPlanConfigurationServiceApi() {
        return new InstallmentPlanConfigurationService(this);
    }
    
    public InstallmentPlanSliceConfigurationService installmentPlanSliceConfigurationServiceApi() {
        return new InstallmentPlanSliceConfigurationService(this);
    }
    
    public LabelDescriptionGroupService labelDescriptionGroupServiceApi() {
        return new LabelDescriptionGroupService(this);
    }
    
    public LabelDescriptionService labelDescriptionServiceApi() {
        return new LabelDescriptionService(this);
    }
    
    public LanguageService languageServiceApi() {
        return new LanguageService(this);
    }
    
    public LegalOrganizationFormService legalOrganizationFormServiceApi() {
        return new LegalOrganizationFormService(this);
    }
    
    public ManualTaskService manualTaskServiceApi() {
        return new ManualTaskService(this);
    }
    
    public MerticUsageService merticUsageServiceApi() {
        return new MerticUsageService(this);
    }
    
    public PaymentConnectorConfigurationService paymentConnectorConfigurationServiceApi() {
        return new PaymentConnectorConfigurationService(this);
    }
    
    public PaymentConnectorService paymentConnectorServiceApi() {
        return new PaymentConnectorService(this);
    }
    
    public PaymentLinkService paymentLinkServiceApi() {
        return new PaymentLinkService(this);
    }
    
    public PaymentMethodBrandService paymentMethodBrandServiceApi() {
        return new PaymentMethodBrandService(this);
    }
    
    public PaymentMethodConfigurationService paymentMethodConfigurationServiceApi() {
        return new PaymentMethodConfigurationService(this);
    }
    
    public PaymentMethodService paymentMethodServiceApi() {
        return new PaymentMethodService(this);
    }
    
    public PaymentProcessorConfigurationService paymentProcessorConfigurationServiceApi() {
        return new PaymentProcessorConfigurationService(this);
    }
    
    public PaymentProcessorService paymentProcessorServiceApi() {
        return new PaymentProcessorService(this);
    }
    
    public PaymentTerminalService paymentTerminalServiceApi() {
        return new PaymentTerminalService(this);
    }
    
    public PermissionService permissionServiceApi() {
        return new PermissionService(this);
    }
    
    public RefundCommentService refundCommentServiceApi() {
        return new RefundCommentService(this);
    }
    
    public RefundService refundServiceApi() {
        return new RefundService(this);
    }
    
    public ShopifyRecurringOrderService shopifyRecurringOrderServiceApi() {
        return new ShopifyRecurringOrderService(this);
    }
    
    public ShopifySubscriberService shopifySubscriberServiceApi() {
        return new ShopifySubscriberService(this);
    }
    
    public ShopifySubscriptionProductService shopifySubscriptionProductServiceApi() {
        return new ShopifySubscriptionProductService(this);
    }
    
    public ShopifySubscriptionService shopifySubscriptionServiceApi() {
        return new ShopifySubscriptionService(this);
    }
    
    public ShopifySubscriptionSuspensionService shopifySubscriptionSuspensionServiceApi() {
        return new ShopifySubscriptionSuspensionService(this);
    }
    
    public ShopifySubscriptionVersionService shopifySubscriptionVersionServiceApi() {
        return new ShopifySubscriptionVersionService(this);
    }
    
    public SpaceService spaceServiceApi() {
        return new SpaceService(this);
    }
    
    public StaticValueService staticValueServiceApi() {
        return new StaticValueService(this);
    }
    
    public SubscriberService subscriberServiceApi() {
        return new SubscriberService(this);
    }
    
    public SubscriptionAffiliateService subscriptionAffiliateServiceApi() {
        return new SubscriptionAffiliateService(this);
    }
    
    public SubscriptionChargeService subscriptionChargeServiceApi() {
        return new SubscriptionChargeService(this);
    }
    
    public SubscriptionLedgerEntryService subscriptionLedgerEntryServiceApi() {
        return new SubscriptionLedgerEntryService(this);
    }
    
    public SubscriptionMetricService subscriptionMetricServiceApi() {
        return new SubscriptionMetricService(this);
    }
    
    public SubscriptionMetricUsageService subscriptionMetricUsageServiceApi() {
        return new SubscriptionMetricUsageService(this);
    }
    
    public SubscriptionPeriodBillService subscriptionPeriodBillServiceApi() {
        return new SubscriptionPeriodBillService(this);
    }
    
    public SubscriptionProductComponentGroupService subscriptionProductComponentGroupServiceApi() {
        return new SubscriptionProductComponentGroupService(this);
    }
    
    public SubscriptionProductComponentService subscriptionProductComponentServiceApi() {
        return new SubscriptionProductComponentService(this);
    }
    
    public SubscriptionProductFeeTierService subscriptionProductFeeTierServiceApi() {
        return new SubscriptionProductFeeTierService(this);
    }
    
    public SubscriptionProductMeteredFeeService subscriptionProductMeteredFeeServiceApi() {
        return new SubscriptionProductMeteredFeeService(this);
    }
    
    public SubscriptionProductPeriodFeeService subscriptionProductPeriodFeeServiceApi() {
        return new SubscriptionProductPeriodFeeService(this);
    }
    
    public SubscriptionProductRetirementService subscriptionProductRetirementServiceApi() {
        return new SubscriptionProductRetirementService(this);
    }
    
    public SubscriptionProductService subscriptionProductServiceApi() {
        return new SubscriptionProductService(this);
    }
    
    public SubscriptionProductSetupFeeService subscriptionProductSetupFeeServiceApi() {
        return new SubscriptionProductSetupFeeService(this);
    }
    
    public SubscriptionProductVersionRetirementService subscriptionProductVersionRetirementServiceApi() {
        return new SubscriptionProductVersionRetirementService(this);
    }
    
    public SubscriptionProductVersionService subscriptionProductVersionServiceApi() {
        return new SubscriptionProductVersionService(this);
    }
    
    public SubscriptionService subscriptionServiceApi() {
        return new SubscriptionService(this);
    }
    
    public SubscriptionSuspensionService subscriptionSuspensionServiceApi() {
        return new SubscriptionSuspensionService(this);
    }
    
    public SubscriptionVersionService subscriptionVersionServiceApi() {
        return new SubscriptionVersionService(this);
    }
    
    public TokenService tokenServiceApi() {
        return new TokenService(this);
    }
    
    public TokenVersionService tokenVersionServiceApi() {
        return new TokenVersionService(this);
    }
    
    public TransactionCommentService transactionCommentServiceApi() {
        return new TransactionCommentService(this);
    }
    
    public TransactionCompletionService transactionCompletionServiceApi() {
        return new TransactionCompletionService(this);
    }
    
    public TransactionIframeService transactionIframeServiceApi() {
        return new TransactionIframeService(this);
    }
    
    public TransactionInvoiceCommentService transactionInvoiceCommentServiceApi() {
        return new TransactionInvoiceCommentService(this);
    }
    
    public TransactionInvoiceService transactionInvoiceServiceApi() {
        return new TransactionInvoiceService(this);
    }
    
    public TransactionLightboxService transactionLightboxServiceApi() {
        return new TransactionLightboxService(this);
    }
    
    public TransactionMobileSdkService transactionMobileSdkServiceApi() {
        return new TransactionMobileSdkService(this);
    }
    
    public TransactionPaymentPageService transactionPaymentPageServiceApi() {
        return new TransactionPaymentPageService(this);
    }
    
    public TransactionService transactionServiceApi() {
        return new TransactionService(this);
    }
    
    public TransactionTerminalService transactionTerminalServiceApi() {
        return new TransactionTerminalService(this);
    }
    
    public TransactionVoidService transactionVoidServiceApi() {
        return new TransactionVoidService(this);
    }
    
    public UserAccountRoleService userAccountRoleServiceApi() {
        return new UserAccountRoleService(this);
    }
    
    public UserSpaceRoleService userSpaceRoleServiceApi() {
        return new UserSpaceRoleService(this);
    }
    
    public WebhookListenerService webhookListenerServiceApi() {
        return new WebhookListenerService(this);
    }
    
    public WebhookUrlService webhookUrlServiceApi() {
        return new WebhookUrlService(this);
    }
    
}
