package com.wallee.sdk.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import com.wallee.sdk.exception.WalleeSdkException;
import com.wallee.sdk.util.EncryptionUtil;
import com.wallee.sdk.model.WebhookEncryptionPublicKey;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.security.Security;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.junit.BeforeClass;
import org.junit.Test;

public class EncryptionUtilTest {
  private static final String SIGNATURE_ALGORITHM = "SHA256withECDSA";

  private static final String VALID_CONTENT_TO_VERIFY =
      "{\"entityId\":11,\"eventId\":35,\"listenerEntityId\":1472041829003,\"listenerEntityTechnicalName\":\"Transaction\",\"spaceId\":1,\"state\":\"PROCESSING\",\"timestamp\":\"2023-12-19T13:43:35+0000\",\"webhookListenerId\":2}";

  private static final String VALID_CONTENT_SIGNATURE =
      "MEYCIQCTzbMrMsOAC6T57T9kQTb1iGZVg2R7n6pY9A4ML4P31gIhAIOoav8cG8x0jpRWQztqSJIC8gXWKq+4DuENEySvmMYf";

  private static final String VALID_ENCODED_PUBLIC_KEY =
      "MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEdWq7ZBGsjUzhBO3e6mzUBLpjpV3TQw1bL1rk3ocjn5C5qne7TY0OBBhiWgaPtWlvUcqASz903vtfeSTQma+SBA==";

  private static WebhookEncryptionPublicKey VALID_PUBLIC_KEY;

  @BeforeClass
  public static void init() {
    setupSecurityProvider();
    setupValidPublicKeyAsApiObject();
  }

  @Test
  public void validationShouldPassForValidContentSignatureAndKey() {
    boolean validationResult = EncryptionUtil.isContentValid(
        VALID_CONTENT_TO_VERIFY, VALID_CONTENT_SIGNATURE, VALID_PUBLIC_KEY,
        BouncyCastleProvider.PROVIDER_NAME, SIGNATURE_ALGORITHM);

    assertTrue("Valid public key, signature and content must fit each other", validationResult);
  }

  @Test
  public void validationShouldFailForBadContent() {
    boolean validationResult = EncryptionUtil.isContentValid(
        "ModifiedContent", VALID_CONTENT_SIGNATURE, VALID_PUBLIC_KEY,
        BouncyCastleProvider.PROVIDER_NAME, SIGNATURE_ALGORITHM);

    assertFalse("Invalid content should fail validation", validationResult);
  }

  @Test
  public void validationShouldFailForBadSignatureFormat() {
    assertThrows("Invalid signature should fail validation",
        WalleeSdkException.class, () -> {
          EncryptionUtil.isContentValid(
              VALID_CONTENT_TO_VERIFY, "InvalidModifiedSignature", VALID_PUBLIC_KEY,
              BouncyCastleProvider.PROVIDER_NAME, SIGNATURE_ALGORITHM);
        });
  }

  @Test
  public void validationShouldFailForBadSignatureBase64Format() {
    assertThrows("Invalid signature should fail validation",
        WalleeSdkException.class, () -> {
          EncryptionUtil.isContentValid(
              VALID_CONTENT_TO_VERIFY,
              "MEYCIQCTzbMrMsOAC6T57T9kQTb1iGZVg2R7n6pY9A4ML4P31gIhAIOoav8cG8x0jpRWQztqSJIC8gXWKq",
              VALID_PUBLIC_KEY, BouncyCastleProvider.PROVIDER_NAME, SIGNATURE_ALGORITHM);
        });
  }

  @Test
  public void validationShouldFailForBadPublicKeyFormat() {
    assertThrows("Invalid public key should fail validation",
        WalleeSdkException.class, () -> {
          EncryptionUtil.isContentValid(
              VALID_CONTENT_TO_VERIFY, VALID_CONTENT_SIGNATURE,
              getPublicKeyAsApiObject("InvalidModifiedPublicKey"),
              BouncyCastleProvider.PROVIDER_NAME,
              SIGNATURE_ALGORITHM);
        });
  }

  @Test
  public void validationShouldFailForBadPublicKeyBase64Format() {
    assertThrows("Invalid public key should fail validation",
        IllegalArgumentException.class, () -> {
          EncryptionUtil.isContentValid(
              VALID_CONTENT_TO_VERIFY, VALID_CONTENT_SIGNATURE,
              getPublicKeyAsApiObject(
                  "MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEdWq7ZBGsjUzhBO3e6mzUBLpjpV3TQw1bL1rk3ocjn5C5qne7TY0OBBhiWgaPtWlvUcqASz903vtfeSTQm"),
              BouncyCastleProvider.PROVIDER_NAME, SIGNATURE_ALGORITHM);
        });
  }

  private static void setupValidPublicKeyAsApiObject() {
    VALID_PUBLIC_KEY = getPublicKeyAsApiObject(VALID_ENCODED_PUBLIC_KEY);
  }

  /**
   * Imitate we got key object via API call.
   */
  private static WebhookEncryptionPublicKey getPublicKeyAsApiObject(String key) {
    String json = "{\n" +
        "    \"id\": \"123456890\",\n" +
        "    \"publicKey\": \"" + key + "\"\n" +
        "}";

    ObjectMapper objectMapper = new ObjectMapper();
    try {
      return objectMapper.readValue(json, WebhookEncryptionPublicKey.class);
    } catch (JsonProcessingException ex) {
      throw new RuntimeException(ex);
    }
  }

  private static void setupSecurityProvider() {
    Security.addProvider(new BouncyCastleProvider());
  }
}
