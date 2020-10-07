package com.wallee.sdk;

import java.io.IOException;
import java.io.OutputStream;

import com.fasterxml.jackson.annotation.JsonInclude;
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
import com.wallee.sdk.service.AccountService;
import com.wallee.sdk.service.ApplicationUserService;
import com.wallee.sdk.service.CardProcessingService;
import com.wallee.sdk.service.ChargeAttemptService;
import com.wallee.sdk.service.ChargeFlowLevelPaymentLinkService;
import com.wallee.sdk.service.ChargeFlowLevelService;
import com.wallee.sdk.service.ChargeFlowService;
import com.wallee.sdk.service.ConditionTypeService;
import com.wallee.sdk.service.CountryService;
import com.wallee.sdk.service.CountryStateService;
import com.wallee.sdk.service.CurrencyService;
import com.wallee.sdk.service.CustomerAddressService;
import com.wallee.sdk.service.CustomerCommentService;
import com.wallee.sdk.service.CustomerService;
import com.wallee.sdk.service.DebtCollectionCaseService;
import com.wallee.sdk.service.DebtCollectorConfigurationService;
import com.wallee.sdk.service.DebtCollectorService;
import com.wallee.sdk.service.DeliveryIndicationService;
import com.wallee.sdk.service.DocumentTemplateService;
import com.wallee.sdk.service.DocumentTemplateTypeService;
import com.wallee.sdk.service.HumanUserService;
import com.wallee.sdk.service.InstallmentPaymentService;
import com.wallee.sdk.service.InstallmentPaymentSliceService;
import com.wallee.sdk.service.InstallmentPlanCalculationService;
import com.wallee.sdk.service.InstallmentPlanConfigurationService;
import com.wallee.sdk.service.InstallmentPlanSliceConfigurationService;
import com.wallee.sdk.service.LabelDescriptionGroupService;
import com.wallee.sdk.service.LabelDescriptionService;
import com.wallee.sdk.service.LanguageService;
import com.wallee.sdk.service.LegalOrganizationFormService;
import com.wallee.sdk.service.ManualTaskService;
import com.wallee.sdk.service.MerticUsageService;
import com.wallee.sdk.service.PaymentConnectorConfigurationService;
import com.wallee.sdk.service.PaymentConnectorService;
import com.wallee.sdk.service.PaymentLinkService;
import com.wallee.sdk.service.PaymentMethodBrandService;
import com.wallee.sdk.service.PaymentMethodConfigurationService;
import com.wallee.sdk.service.PaymentMethodService;
import com.wallee.sdk.service.PaymentProcessorConfigurationService;
import com.wallee.sdk.service.PaymentProcessorService;
import com.wallee.sdk.service.PaymentTerminalService;
import com.wallee.sdk.service.PermissionService;
import com.wallee.sdk.service.RefundCommentService;
import com.wallee.sdk.service.RefundService;
import com.wallee.sdk.service.ShopifyRecurringOrderService;
import com.wallee.sdk.service.ShopifySubscriberService;
import com.wallee.sdk.service.ShopifySubscriptionProductService;
import com.wallee.sdk.service.ShopifySubscriptionService;
import com.wallee.sdk.service.ShopifySubscriptionSuspensionService;
import com.wallee.sdk.service.ShopifySubscriptionVersionService;
import com.wallee.sdk.service.ShopifyTransactionService;
import com.wallee.sdk.service.SpaceService;
import com.wallee.sdk.service.StaticValueService;
import com.wallee.sdk.service.SubscriberService;
import com.wallee.sdk.service.SubscriptionAffiliateService;
import com.wallee.sdk.service.SubscriptionChargeService;
import com.wallee.sdk.service.SubscriptionLedgerEntryService;
import com.wallee.sdk.service.SubscriptionMetricService;
import com.wallee.sdk.service.SubscriptionMetricUsageService;
import com.wallee.sdk.service.SubscriptionPeriodBillService;
import com.wallee.sdk.service.SubscriptionProductComponentGroupService;
import com.wallee.sdk.service.SubscriptionProductComponentService;
import com.wallee.sdk.service.SubscriptionProductFeeTierService;
import com.wallee.sdk.service.SubscriptionProductMeteredFeeService;
import com.wallee.sdk.service.SubscriptionProductPeriodFeeService;
import com.wallee.sdk.service.SubscriptionProductRetirementService;
import com.wallee.sdk.service.SubscriptionProductService;
import com.wallee.sdk.service.SubscriptionProductSetupFeeService;
import com.wallee.sdk.service.SubscriptionProductVersionRetirementService;
import com.wallee.sdk.service.SubscriptionProductVersionService;
import com.wallee.sdk.service.SubscriptionService;
import com.wallee.sdk.service.SubscriptionSuspensionService;
import com.wallee.sdk.service.SubscriptionVersionService;
import com.wallee.sdk.service.TokenService;
import com.wallee.sdk.service.TokenVersionService;
import com.wallee.sdk.service.TransactionCommentService;
import com.wallee.sdk.service.TransactionCompletionService;
import com.wallee.sdk.service.TransactionIframeService;
import com.wallee.sdk.service.TransactionInvoiceCommentService;
import com.wallee.sdk.service.TransactionInvoiceService;
import com.wallee.sdk.service.TransactionLightboxService;
import com.wallee.sdk.service.TransactionMobileSdkService;
import com.wallee.sdk.service.TransactionPaymentPageService;
import com.wallee.sdk.service.TransactionService;
import com.wallee.sdk.service.TransactionTerminalService;
import com.wallee.sdk.service.TransactionVoidService;
import com.wallee.sdk.service.UserAccountRoleService;
import com.wallee.sdk.service.UserSpaceRoleService;
import com.wallee.sdk.service.WebhookListenerService;
import com.wallee.sdk.service.WebhookUrlService;


public class ApiClient {
    private final String basePath;
    private final HttpRequestFactory httpRequestFactory;
    private final ObjectMapper objectMapper;
    private final long userId;
    private final String applicationKey;

    // A reasonable default object mapper. Client can pass in a chosen ObjectMapper anyway, this is just for reasonable defaults.
    private static ObjectMapper createDefaultObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper()
            .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .setDateFormat(new RFC3339DateFormat());
		objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
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
		this(userId, applicationKey, "https://app-wallee.com:443/api");
	}
	
    /**
     * Constructor for ApiClient
     *
     * @param userId
     * @param applicationKey
     */
    public ApiClient(long userId, String applicationKey, String basePath) {
        if (applicationKey == null || applicationKey.trim().isEmpty()) {
            throw new IllegalArgumentException("The application key cannot be empty or null.");
        }
        if (userId < 1) {
            throw new IllegalArgumentException("The user id is invalid.");
        }
        if (basePath == null || basePath.trim().isEmpty()) {
	        throw new IllegalArgumentException("The base path cannot be empty.");
	    }
	    
		this.basePath = basePath;
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
        return transport.createRequestFactory(request -> request.setInterceptor(signer));
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
    
    private AccountService accountService;
    public AccountService getAccountService() {
        if (this.accountService == null) {
            this.accountService = new AccountService(this);
        }
        return this.accountService;
    }
    
    private ApplicationUserService applicationUserService;
    public ApplicationUserService getApplicationUserService() {
        if (this.applicationUserService == null) {
            this.applicationUserService = new ApplicationUserService(this);
        }
        return this.applicationUserService;
    }
    
    private CardProcessingService cardProcessingService;
    public CardProcessingService getCardProcessingService() {
        if (this.cardProcessingService == null) {
            this.cardProcessingService = new CardProcessingService(this);
        }
        return this.cardProcessingService;
    }
    
    private ChargeAttemptService chargeAttemptService;
    public ChargeAttemptService getChargeAttemptService() {
        if (this.chargeAttemptService == null) {
            this.chargeAttemptService = new ChargeAttemptService(this);
        }
        return this.chargeAttemptService;
    }
    
    private ChargeFlowLevelPaymentLinkService chargeFlowLevelPaymentLinkService;
    public ChargeFlowLevelPaymentLinkService getChargeFlowLevelPaymentLinkService() {
        if (this.chargeFlowLevelPaymentLinkService == null) {
            this.chargeFlowLevelPaymentLinkService = new ChargeFlowLevelPaymentLinkService(this);
        }
        return this.chargeFlowLevelPaymentLinkService;
    }
    
    private ChargeFlowLevelService chargeFlowLevelService;
    public ChargeFlowLevelService getChargeFlowLevelService() {
        if (this.chargeFlowLevelService == null) {
            this.chargeFlowLevelService = new ChargeFlowLevelService(this);
        }
        return this.chargeFlowLevelService;
    }
    
    private ChargeFlowService chargeFlowService;
    public ChargeFlowService getChargeFlowService() {
        if (this.chargeFlowService == null) {
            this.chargeFlowService = new ChargeFlowService(this);
        }
        return this.chargeFlowService;
    }
    
    private ConditionTypeService conditionTypeService;
    public ConditionTypeService getConditionTypeService() {
        if (this.conditionTypeService == null) {
            this.conditionTypeService = new ConditionTypeService(this);
        }
        return this.conditionTypeService;
    }
    
    private CountryService countryService;
    public CountryService getCountryService() {
        if (this.countryService == null) {
            this.countryService = new CountryService(this);
        }
        return this.countryService;
    }
    
    private CountryStateService countryStateService;
    public CountryStateService getCountryStateService() {
        if (this.countryStateService == null) {
            this.countryStateService = new CountryStateService(this);
        }
        return this.countryStateService;
    }
    
    private CurrencyService currencyService;
    public CurrencyService getCurrencyService() {
        if (this.currencyService == null) {
            this.currencyService = new CurrencyService(this);
        }
        return this.currencyService;
    }
    
    private CustomerAddressService customerAddressService;
    public CustomerAddressService getCustomerAddressService() {
        if (this.customerAddressService == null) {
            this.customerAddressService = new CustomerAddressService(this);
        }
        return this.customerAddressService;
    }
    
    private CustomerCommentService customerCommentService;
    public CustomerCommentService getCustomerCommentService() {
        if (this.customerCommentService == null) {
            this.customerCommentService = new CustomerCommentService(this);
        }
        return this.customerCommentService;
    }
    
    private CustomerService customerService;
    public CustomerService getCustomerService() {
        if (this.customerService == null) {
            this.customerService = new CustomerService(this);
        }
        return this.customerService;
    }
    
    private DebtCollectionCaseService debtCollectionCaseService;
    public DebtCollectionCaseService getDebtCollectionCaseService() {
        if (this.debtCollectionCaseService == null) {
            this.debtCollectionCaseService = new DebtCollectionCaseService(this);
        }
        return this.debtCollectionCaseService;
    }
    
    private DebtCollectorConfigurationService debtCollectorConfigurationService;
    public DebtCollectorConfigurationService getDebtCollectorConfigurationService() {
        if (this.debtCollectorConfigurationService == null) {
            this.debtCollectorConfigurationService = new DebtCollectorConfigurationService(this);
        }
        return this.debtCollectorConfigurationService;
    }
    
    private DebtCollectorService debtCollectorService;
    public DebtCollectorService getDebtCollectorService() {
        if (this.debtCollectorService == null) {
            this.debtCollectorService = new DebtCollectorService(this);
        }
        return this.debtCollectorService;
    }
    
    private DeliveryIndicationService deliveryIndicationService;
    public DeliveryIndicationService getDeliveryIndicationService() {
        if (this.deliveryIndicationService == null) {
            this.deliveryIndicationService = new DeliveryIndicationService(this);
        }
        return this.deliveryIndicationService;
    }
    
    private DocumentTemplateService documentTemplateService;
    public DocumentTemplateService getDocumentTemplateService() {
        if (this.documentTemplateService == null) {
            this.documentTemplateService = new DocumentTemplateService(this);
        }
        return this.documentTemplateService;
    }
    
    private DocumentTemplateTypeService documentTemplateTypeService;
    public DocumentTemplateTypeService getDocumentTemplateTypeService() {
        if (this.documentTemplateTypeService == null) {
            this.documentTemplateTypeService = new DocumentTemplateTypeService(this);
        }
        return this.documentTemplateTypeService;
    }
    
    private HumanUserService humanUserService;
    public HumanUserService getHumanUserService() {
        if (this.humanUserService == null) {
            this.humanUserService = new HumanUserService(this);
        }
        return this.humanUserService;
    }
    
    private InstallmentPaymentService installmentPaymentService;
    public InstallmentPaymentService getInstallmentPaymentService() {
        if (this.installmentPaymentService == null) {
            this.installmentPaymentService = new InstallmentPaymentService(this);
        }
        return this.installmentPaymentService;
    }
    
    private InstallmentPaymentSliceService installmentPaymentSliceService;
    public InstallmentPaymentSliceService getInstallmentPaymentSliceService() {
        if (this.installmentPaymentSliceService == null) {
            this.installmentPaymentSliceService = new InstallmentPaymentSliceService(this);
        }
        return this.installmentPaymentSliceService;
    }
    
    private InstallmentPlanCalculationService installmentPlanCalculationService;
    public InstallmentPlanCalculationService getInstallmentPlanCalculationService() {
        if (this.installmentPlanCalculationService == null) {
            this.installmentPlanCalculationService = new InstallmentPlanCalculationService(this);
        }
        return this.installmentPlanCalculationService;
    }
    
    private InstallmentPlanConfigurationService installmentPlanConfigurationService;
    public InstallmentPlanConfigurationService getInstallmentPlanConfigurationService() {
        if (this.installmentPlanConfigurationService == null) {
            this.installmentPlanConfigurationService = new InstallmentPlanConfigurationService(this);
        }
        return this.installmentPlanConfigurationService;
    }
    
    private InstallmentPlanSliceConfigurationService installmentPlanSliceConfigurationService;
    public InstallmentPlanSliceConfigurationService getInstallmentPlanSliceConfigurationService() {
        if (this.installmentPlanSliceConfigurationService == null) {
            this.installmentPlanSliceConfigurationService = new InstallmentPlanSliceConfigurationService(this);
        }
        return this.installmentPlanSliceConfigurationService;
    }
    
    private LabelDescriptionGroupService labelDescriptionGroupService;
    public LabelDescriptionGroupService getLabelDescriptionGroupService() {
        if (this.labelDescriptionGroupService == null) {
            this.labelDescriptionGroupService = new LabelDescriptionGroupService(this);
        }
        return this.labelDescriptionGroupService;
    }
    
    private LabelDescriptionService labelDescriptionService;
    public LabelDescriptionService getLabelDescriptionService() {
        if (this.labelDescriptionService == null) {
            this.labelDescriptionService = new LabelDescriptionService(this);
        }
        return this.labelDescriptionService;
    }
    
    private LanguageService languageService;
    public LanguageService getLanguageService() {
        if (this.languageService == null) {
            this.languageService = new LanguageService(this);
        }
        return this.languageService;
    }
    
    private LegalOrganizationFormService legalOrganizationFormService;
    public LegalOrganizationFormService getLegalOrganizationFormService() {
        if (this.legalOrganizationFormService == null) {
            this.legalOrganizationFormService = new LegalOrganizationFormService(this);
        }
        return this.legalOrganizationFormService;
    }
    
    private ManualTaskService manualTaskService;
    public ManualTaskService getManualTaskService() {
        if (this.manualTaskService == null) {
            this.manualTaskService = new ManualTaskService(this);
        }
        return this.manualTaskService;
    }
    
    private MerticUsageService merticUsageService;
    public MerticUsageService getMerticUsageService() {
        if (this.merticUsageService == null) {
            this.merticUsageService = new MerticUsageService(this);
        }
        return this.merticUsageService;
    }
    
    private PaymentConnectorConfigurationService paymentConnectorConfigurationService;
    public PaymentConnectorConfigurationService getPaymentConnectorConfigurationService() {
        if (this.paymentConnectorConfigurationService == null) {
            this.paymentConnectorConfigurationService = new PaymentConnectorConfigurationService(this);
        }
        return this.paymentConnectorConfigurationService;
    }
    
    private PaymentConnectorService paymentConnectorService;
    public PaymentConnectorService getPaymentConnectorService() {
        if (this.paymentConnectorService == null) {
            this.paymentConnectorService = new PaymentConnectorService(this);
        }
        return this.paymentConnectorService;
    }
    
    private PaymentLinkService paymentLinkService;
    public PaymentLinkService getPaymentLinkService() {
        if (this.paymentLinkService == null) {
            this.paymentLinkService = new PaymentLinkService(this);
        }
        return this.paymentLinkService;
    }
    
    private PaymentMethodBrandService paymentMethodBrandService;
    public PaymentMethodBrandService getPaymentMethodBrandService() {
        if (this.paymentMethodBrandService == null) {
            this.paymentMethodBrandService = new PaymentMethodBrandService(this);
        }
        return this.paymentMethodBrandService;
    }
    
    private PaymentMethodConfigurationService paymentMethodConfigurationService;
    public PaymentMethodConfigurationService getPaymentMethodConfigurationService() {
        if (this.paymentMethodConfigurationService == null) {
            this.paymentMethodConfigurationService = new PaymentMethodConfigurationService(this);
        }
        return this.paymentMethodConfigurationService;
    }
    
    private PaymentMethodService paymentMethodService;
    public PaymentMethodService getPaymentMethodService() {
        if (this.paymentMethodService == null) {
            this.paymentMethodService = new PaymentMethodService(this);
        }
        return this.paymentMethodService;
    }
    
    private PaymentProcessorConfigurationService paymentProcessorConfigurationService;
    public PaymentProcessorConfigurationService getPaymentProcessorConfigurationService() {
        if (this.paymentProcessorConfigurationService == null) {
            this.paymentProcessorConfigurationService = new PaymentProcessorConfigurationService(this);
        }
        return this.paymentProcessorConfigurationService;
    }
    
    private PaymentProcessorService paymentProcessorService;
    public PaymentProcessorService getPaymentProcessorService() {
        if (this.paymentProcessorService == null) {
            this.paymentProcessorService = new PaymentProcessorService(this);
        }
        return this.paymentProcessorService;
    }
    
    private PaymentTerminalService paymentTerminalService;
    public PaymentTerminalService getPaymentTerminalService() {
        if (this.paymentTerminalService == null) {
            this.paymentTerminalService = new PaymentTerminalService(this);
        }
        return this.paymentTerminalService;
    }
    
    private PermissionService permissionService;
    public PermissionService getPermissionService() {
        if (this.permissionService == null) {
            this.permissionService = new PermissionService(this);
        }
        return this.permissionService;
    }
    
    private RefundCommentService refundCommentService;
    public RefundCommentService getRefundCommentService() {
        if (this.refundCommentService == null) {
            this.refundCommentService = new RefundCommentService(this);
        }
        return this.refundCommentService;
    }
    
    private RefundService refundService;
    public RefundService getRefundService() {
        if (this.refundService == null) {
            this.refundService = new RefundService(this);
        }
        return this.refundService;
    }
    
    private ShopifyRecurringOrderService shopifyRecurringOrderService;
    public ShopifyRecurringOrderService getShopifyRecurringOrderService() {
        if (this.shopifyRecurringOrderService == null) {
            this.shopifyRecurringOrderService = new ShopifyRecurringOrderService(this);
        }
        return this.shopifyRecurringOrderService;
    }
    
    private ShopifySubscriberService shopifySubscriberService;
    public ShopifySubscriberService getShopifySubscriberService() {
        if (this.shopifySubscriberService == null) {
            this.shopifySubscriberService = new ShopifySubscriberService(this);
        }
        return this.shopifySubscriberService;
    }
    
    private ShopifySubscriptionProductService shopifySubscriptionProductService;
    public ShopifySubscriptionProductService getShopifySubscriptionProductService() {
        if (this.shopifySubscriptionProductService == null) {
            this.shopifySubscriptionProductService = new ShopifySubscriptionProductService(this);
        }
        return this.shopifySubscriptionProductService;
    }
    
    private ShopifySubscriptionService shopifySubscriptionService;
    public ShopifySubscriptionService getShopifySubscriptionService() {
        if (this.shopifySubscriptionService == null) {
            this.shopifySubscriptionService = new ShopifySubscriptionService(this);
        }
        return this.shopifySubscriptionService;
    }
    
    private ShopifySubscriptionSuspensionService shopifySubscriptionSuspensionService;
    public ShopifySubscriptionSuspensionService getShopifySubscriptionSuspensionService() {
        if (this.shopifySubscriptionSuspensionService == null) {
            this.shopifySubscriptionSuspensionService = new ShopifySubscriptionSuspensionService(this);
        }
        return this.shopifySubscriptionSuspensionService;
    }
    
    private ShopifySubscriptionVersionService shopifySubscriptionVersionService;
    public ShopifySubscriptionVersionService getShopifySubscriptionVersionService() {
        if (this.shopifySubscriptionVersionService == null) {
            this.shopifySubscriptionVersionService = new ShopifySubscriptionVersionService(this);
        }
        return this.shopifySubscriptionVersionService;
    }
    
    private ShopifyTransactionService shopifyTransactionService;
    public ShopifyTransactionService getShopifyTransactionService() {
        if (this.shopifyTransactionService == null) {
            this.shopifyTransactionService = new ShopifyTransactionService(this);
        }
        return this.shopifyTransactionService;
    }
    
    private SpaceService spaceService;
    public SpaceService getSpaceService() {
        if (this.spaceService == null) {
            this.spaceService = new SpaceService(this);
        }
        return this.spaceService;
    }
    
    private StaticValueService staticValueService;
    public StaticValueService getStaticValueService() {
        if (this.staticValueService == null) {
            this.staticValueService = new StaticValueService(this);
        }
        return this.staticValueService;
    }
    
    private SubscriberService subscriberService;
    public SubscriberService getSubscriberService() {
        if (this.subscriberService == null) {
            this.subscriberService = new SubscriberService(this);
        }
        return this.subscriberService;
    }
    
    private SubscriptionAffiliateService subscriptionAffiliateService;
    public SubscriptionAffiliateService getSubscriptionAffiliateService() {
        if (this.subscriptionAffiliateService == null) {
            this.subscriptionAffiliateService = new SubscriptionAffiliateService(this);
        }
        return this.subscriptionAffiliateService;
    }
    
    private SubscriptionChargeService subscriptionChargeService;
    public SubscriptionChargeService getSubscriptionChargeService() {
        if (this.subscriptionChargeService == null) {
            this.subscriptionChargeService = new SubscriptionChargeService(this);
        }
        return this.subscriptionChargeService;
    }
    
    private SubscriptionLedgerEntryService subscriptionLedgerEntryService;
    public SubscriptionLedgerEntryService getSubscriptionLedgerEntryService() {
        if (this.subscriptionLedgerEntryService == null) {
            this.subscriptionLedgerEntryService = new SubscriptionLedgerEntryService(this);
        }
        return this.subscriptionLedgerEntryService;
    }
    
    private SubscriptionMetricService subscriptionMetricService;
    public SubscriptionMetricService getSubscriptionMetricService() {
        if (this.subscriptionMetricService == null) {
            this.subscriptionMetricService = new SubscriptionMetricService(this);
        }
        return this.subscriptionMetricService;
    }
    
    private SubscriptionMetricUsageService subscriptionMetricUsageService;
    public SubscriptionMetricUsageService getSubscriptionMetricUsageService() {
        if (this.subscriptionMetricUsageService == null) {
            this.subscriptionMetricUsageService = new SubscriptionMetricUsageService(this);
        }
        return this.subscriptionMetricUsageService;
    }
    
    private SubscriptionPeriodBillService subscriptionPeriodBillService;
    public SubscriptionPeriodBillService getSubscriptionPeriodBillService() {
        if (this.subscriptionPeriodBillService == null) {
            this.subscriptionPeriodBillService = new SubscriptionPeriodBillService(this);
        }
        return this.subscriptionPeriodBillService;
    }
    
    private SubscriptionProductComponentGroupService subscriptionProductComponentGroupService;
    public SubscriptionProductComponentGroupService getSubscriptionProductComponentGroupService() {
        if (this.subscriptionProductComponentGroupService == null) {
            this.subscriptionProductComponentGroupService = new SubscriptionProductComponentGroupService(this);
        }
        return this.subscriptionProductComponentGroupService;
    }
    
    private SubscriptionProductComponentService subscriptionProductComponentService;
    public SubscriptionProductComponentService getSubscriptionProductComponentService() {
        if (this.subscriptionProductComponentService == null) {
            this.subscriptionProductComponentService = new SubscriptionProductComponentService(this);
        }
        return this.subscriptionProductComponentService;
    }
    
    private SubscriptionProductFeeTierService subscriptionProductFeeTierService;
    public SubscriptionProductFeeTierService getSubscriptionProductFeeTierService() {
        if (this.subscriptionProductFeeTierService == null) {
            this.subscriptionProductFeeTierService = new SubscriptionProductFeeTierService(this);
        }
        return this.subscriptionProductFeeTierService;
    }
    
    private SubscriptionProductMeteredFeeService subscriptionProductMeteredFeeService;
    public SubscriptionProductMeteredFeeService getSubscriptionProductMeteredFeeService() {
        if (this.subscriptionProductMeteredFeeService == null) {
            this.subscriptionProductMeteredFeeService = new SubscriptionProductMeteredFeeService(this);
        }
        return this.subscriptionProductMeteredFeeService;
    }
    
    private SubscriptionProductPeriodFeeService subscriptionProductPeriodFeeService;
    public SubscriptionProductPeriodFeeService getSubscriptionProductPeriodFeeService() {
        if (this.subscriptionProductPeriodFeeService == null) {
            this.subscriptionProductPeriodFeeService = new SubscriptionProductPeriodFeeService(this);
        }
        return this.subscriptionProductPeriodFeeService;
    }
    
    private SubscriptionProductRetirementService subscriptionProductRetirementService;
    public SubscriptionProductRetirementService getSubscriptionProductRetirementService() {
        if (this.subscriptionProductRetirementService == null) {
            this.subscriptionProductRetirementService = new SubscriptionProductRetirementService(this);
        }
        return this.subscriptionProductRetirementService;
    }
    
    private SubscriptionProductService subscriptionProductService;
    public SubscriptionProductService getSubscriptionProductService() {
        if (this.subscriptionProductService == null) {
            this.subscriptionProductService = new SubscriptionProductService(this);
        }
        return this.subscriptionProductService;
    }
    
    private SubscriptionProductSetupFeeService subscriptionProductSetupFeeService;
    public SubscriptionProductSetupFeeService getSubscriptionProductSetupFeeService() {
        if (this.subscriptionProductSetupFeeService == null) {
            this.subscriptionProductSetupFeeService = new SubscriptionProductSetupFeeService(this);
        }
        return this.subscriptionProductSetupFeeService;
    }
    
    private SubscriptionProductVersionRetirementService subscriptionProductVersionRetirementService;
    public SubscriptionProductVersionRetirementService getSubscriptionProductVersionRetirementService() {
        if (this.subscriptionProductVersionRetirementService == null) {
            this.subscriptionProductVersionRetirementService = new SubscriptionProductVersionRetirementService(this);
        }
        return this.subscriptionProductVersionRetirementService;
    }
    
    private SubscriptionProductVersionService subscriptionProductVersionService;
    public SubscriptionProductVersionService getSubscriptionProductVersionService() {
        if (this.subscriptionProductVersionService == null) {
            this.subscriptionProductVersionService = new SubscriptionProductVersionService(this);
        }
        return this.subscriptionProductVersionService;
    }
    
    private SubscriptionService subscriptionService;
    public SubscriptionService getSubscriptionService() {
        if (this.subscriptionService == null) {
            this.subscriptionService = new SubscriptionService(this);
        }
        return this.subscriptionService;
    }
    
    private SubscriptionSuspensionService subscriptionSuspensionService;
    public SubscriptionSuspensionService getSubscriptionSuspensionService() {
        if (this.subscriptionSuspensionService == null) {
            this.subscriptionSuspensionService = new SubscriptionSuspensionService(this);
        }
        return this.subscriptionSuspensionService;
    }
    
    private SubscriptionVersionService subscriptionVersionService;
    public SubscriptionVersionService getSubscriptionVersionService() {
        if (this.subscriptionVersionService == null) {
            this.subscriptionVersionService = new SubscriptionVersionService(this);
        }
        return this.subscriptionVersionService;
    }
    
    private TokenService tokenService;
    public TokenService getTokenService() {
        if (this.tokenService == null) {
            this.tokenService = new TokenService(this);
        }
        return this.tokenService;
    }
    
    private TokenVersionService tokenVersionService;
    public TokenVersionService getTokenVersionService() {
        if (this.tokenVersionService == null) {
            this.tokenVersionService = new TokenVersionService(this);
        }
        return this.tokenVersionService;
    }
    
    private TransactionCommentService transactionCommentService;
    public TransactionCommentService getTransactionCommentService() {
        if (this.transactionCommentService == null) {
            this.transactionCommentService = new TransactionCommentService(this);
        }
        return this.transactionCommentService;
    }
    
    private TransactionCompletionService transactionCompletionService;
    public TransactionCompletionService getTransactionCompletionService() {
        if (this.transactionCompletionService == null) {
            this.transactionCompletionService = new TransactionCompletionService(this);
        }
        return this.transactionCompletionService;
    }
    
    private TransactionIframeService transactionIframeService;
    public TransactionIframeService getTransactionIframeService() {
        if (this.transactionIframeService == null) {
            this.transactionIframeService = new TransactionIframeService(this);
        }
        return this.transactionIframeService;
    }
    
    private TransactionInvoiceCommentService transactionInvoiceCommentService;
    public TransactionInvoiceCommentService getTransactionInvoiceCommentService() {
        if (this.transactionInvoiceCommentService == null) {
            this.transactionInvoiceCommentService = new TransactionInvoiceCommentService(this);
        }
        return this.transactionInvoiceCommentService;
    }
    
    private TransactionInvoiceService transactionInvoiceService;
    public TransactionInvoiceService getTransactionInvoiceService() {
        if (this.transactionInvoiceService == null) {
            this.transactionInvoiceService = new TransactionInvoiceService(this);
        }
        return this.transactionInvoiceService;
    }
    
    private TransactionLightboxService transactionLightboxService;
    public TransactionLightboxService getTransactionLightboxService() {
        if (this.transactionLightboxService == null) {
            this.transactionLightboxService = new TransactionLightboxService(this);
        }
        return this.transactionLightboxService;
    }
    
    private TransactionMobileSdkService transactionMobileSdkService;
    public TransactionMobileSdkService getTransactionMobileSdkService() {
        if (this.transactionMobileSdkService == null) {
            this.transactionMobileSdkService = new TransactionMobileSdkService(this);
        }
        return this.transactionMobileSdkService;
    }
    
    private TransactionPaymentPageService transactionPaymentPageService;
    public TransactionPaymentPageService getTransactionPaymentPageService() {
        if (this.transactionPaymentPageService == null) {
            this.transactionPaymentPageService = new TransactionPaymentPageService(this);
        }
        return this.transactionPaymentPageService;
    }
    
    private TransactionService transactionService;
    public TransactionService getTransactionService() {
        if (this.transactionService == null) {
            this.transactionService = new TransactionService(this);
        }
        return this.transactionService;
    }
    
    private TransactionTerminalService transactionTerminalService;
    public TransactionTerminalService getTransactionTerminalService() {
        if (this.transactionTerminalService == null) {
            this.transactionTerminalService = new TransactionTerminalService(this);
        }
        return this.transactionTerminalService;
    }
    
    private TransactionVoidService transactionVoidService;
    public TransactionVoidService getTransactionVoidService() {
        if (this.transactionVoidService == null) {
            this.transactionVoidService = new TransactionVoidService(this);
        }
        return this.transactionVoidService;
    }
    
    private UserAccountRoleService userAccountRoleService;
    public UserAccountRoleService getUserAccountRoleService() {
        if (this.userAccountRoleService == null) {
            this.userAccountRoleService = new UserAccountRoleService(this);
        }
        return this.userAccountRoleService;
    }
    
    private UserSpaceRoleService userSpaceRoleService;
    public UserSpaceRoleService getUserSpaceRoleService() {
        if (this.userSpaceRoleService == null) {
            this.userSpaceRoleService = new UserSpaceRoleService(this);
        }
        return this.userSpaceRoleService;
    }
    
    private WebhookListenerService webhookListenerService;
    public WebhookListenerService getWebhookListenerService() {
        if (this.webhookListenerService == null) {
            this.webhookListenerService = new WebhookListenerService(this);
        }
        return this.webhookListenerService;
    }
    
    private WebhookUrlService webhookUrlService;
    public WebhookUrlService getWebhookUrlService() {
        if (this.webhookUrlService == null) {
            this.webhookUrlService = new WebhookUrlService(this);
        }
        return this.webhookUrlService;
    }
    
}
