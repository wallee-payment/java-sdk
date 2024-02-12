package com.wallee.sdk.test;

import com.wallee.sdk.model.AuthenticatedCardDataCreate;

public abstract class TestConstants {
  public static final long APPLICATION_USER_ID = 512;
  public static final String AUTHENTICATION_KEY = "FKrO76r5VwJtBrqZawBspljbBNOxp5veKQQkOnZxucQ=";

  public static final long SPACE_ID = 405;
  public static final long TEST_CARD_PAYMENT_METHOD_CONFIGURATION_ID = 1352;
  public static final long TEST_CUSTOMER_ID = 7311742;

  public static final AuthenticatedCardDataCreate FAKE_CARD_DATA;

  static {
    FAKE_CARD_DATA = new AuthenticatedCardDataCreate();
    FAKE_CARD_DATA.setPrimaryAccountNumber("4111111111111111");
    FAKE_CARD_DATA.setExpiryDate("2026-12");
  }

  private TestConstants() {
  }
}
