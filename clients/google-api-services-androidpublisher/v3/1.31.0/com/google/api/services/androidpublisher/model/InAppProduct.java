/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.androidpublisher.model;

/**
 * An in-app product. The resource for InappproductsService.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Android Developer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InAppProduct extends com.google.api.client.json.GenericJson {

  /**
   * Default language of the localized data, as defined by BCP-47. e.g. "en-US".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String defaultLanguage;

  /**
   * Default price. Cannot be zero, as in-app products are never free. Always in the developer's
   * Checkout merchant currency.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price defaultPrice;

  /**
   * Grace period of the subscription, specified in ISO 8601 format. Allows developers to give their
   * subscribers a grace period when the payment for the new recurrence period is declined.
   * Acceptable values are P0D (zero days), P3D (three days), P7D (seven days), P14D (14 days), and
   * P30D (30 days).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gracePeriod;

  /**
   * List of localized title and description data. Map key is the language of the localized data, as
   * defined by BCP-47, e.g. "en-US".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, InAppProductListing> listings;

  /**
   * Details about taxes and legal compliance. Only applicable to managed products.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ManagedProductTaxAndComplianceSettings managedProductTaxesAndComplianceSettings;

  /**
   * Package name of the parent app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String packageName;

  /**
   * Prices per buyer region. None of these can be zero, as in-app products are never free. Map key
   * is region code, as defined by ISO 3166-2.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, Price> prices;

  /**
   * The type of the product, e.g. a recurring subscription.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String purchaseType;

  /**
   * Stock-keeping-unit (SKU) of the product, unique within an app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sku;

  /**
   * The status of the product, e.g. whether it's active.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Subscription period, specified in ISO 8601 format. Acceptable values are P1W (one week), P1M
   * (one month), P3M (three months), P6M (six months), and P1Y (one year).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subscriptionPeriod;

  /**
   * Details about taxes and legal compliance. Only applicable to subscription products.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SubscriptionTaxAndComplianceSettings subscriptionTaxesAndComplianceSettings;

  /**
   * Trial period, specified in ISO 8601 format. Acceptable values are anything between P7D (seven
   * days) and P999D (999 days).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String trialPeriod;

  /**
   * Default language of the localized data, as defined by BCP-47. e.g. "en-US".
   * @return value or {@code null} for none
   */
  public java.lang.String getDefaultLanguage() {
    return defaultLanguage;
  }

  /**
   * Default language of the localized data, as defined by BCP-47. e.g. "en-US".
   * @param defaultLanguage defaultLanguage or {@code null} for none
   */
  public InAppProduct setDefaultLanguage(java.lang.String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
    return this;
  }

  /**
   * Default price. Cannot be zero, as in-app products are never free. Always in the developer's
   * Checkout merchant currency.
   * @return value or {@code null} for none
   */
  public Price getDefaultPrice() {
    return defaultPrice;
  }

  /**
   * Default price. Cannot be zero, as in-app products are never free. Always in the developer's
   * Checkout merchant currency.
   * @param defaultPrice defaultPrice or {@code null} for none
   */
  public InAppProduct setDefaultPrice(Price defaultPrice) {
    this.defaultPrice = defaultPrice;
    return this;
  }

  /**
   * Grace period of the subscription, specified in ISO 8601 format. Allows developers to give their
   * subscribers a grace period when the payment for the new recurrence period is declined.
   * Acceptable values are P0D (zero days), P3D (three days), P7D (seven days), P14D (14 days), and
   * P30D (30 days).
   * @return value or {@code null} for none
   */
  public java.lang.String getGracePeriod() {
    return gracePeriod;
  }

  /**
   * Grace period of the subscription, specified in ISO 8601 format. Allows developers to give their
   * subscribers a grace period when the payment for the new recurrence period is declined.
   * Acceptable values are P0D (zero days), P3D (three days), P7D (seven days), P14D (14 days), and
   * P30D (30 days).
   * @param gracePeriod gracePeriod or {@code null} for none
   */
  public InAppProduct setGracePeriod(java.lang.String gracePeriod) {
    this.gracePeriod = gracePeriod;
    return this;
  }

  /**
   * List of localized title and description data. Map key is the language of the localized data, as
   * defined by BCP-47, e.g. "en-US".
   * @return value or {@code null} for none
   */
  public java.util.Map<String, InAppProductListing> getListings() {
    return listings;
  }

  /**
   * List of localized title and description data. Map key is the language of the localized data, as
   * defined by BCP-47, e.g. "en-US".
   * @param listings listings or {@code null} for none
   */
  public InAppProduct setListings(java.util.Map<String, InAppProductListing> listings) {
    this.listings = listings;
    return this;
  }

  /**
   * Details about taxes and legal compliance. Only applicable to managed products.
   * @return value or {@code null} for none
   */
  public ManagedProductTaxAndComplianceSettings getManagedProductTaxesAndComplianceSettings() {
    return managedProductTaxesAndComplianceSettings;
  }

  /**
   * Details about taxes and legal compliance. Only applicable to managed products.
   * @param managedProductTaxesAndComplianceSettings managedProductTaxesAndComplianceSettings or {@code null} for none
   */
  public InAppProduct setManagedProductTaxesAndComplianceSettings(ManagedProductTaxAndComplianceSettings managedProductTaxesAndComplianceSettings) {
    this.managedProductTaxesAndComplianceSettings = managedProductTaxesAndComplianceSettings;
    return this;
  }

  /**
   * Package name of the parent app.
   * @return value or {@code null} for none
   */
  public java.lang.String getPackageName() {
    return packageName;
  }

  /**
   * Package name of the parent app.
   * @param packageName packageName or {@code null} for none
   */
  public InAppProduct setPackageName(java.lang.String packageName) {
    this.packageName = packageName;
    return this;
  }

  /**
   * Prices per buyer region. None of these can be zero, as in-app products are never free. Map key
   * is region code, as defined by ISO 3166-2.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, Price> getPrices() {
    return prices;
  }

  /**
   * Prices per buyer region. None of these can be zero, as in-app products are never free. Map key
   * is region code, as defined by ISO 3166-2.
   * @param prices prices or {@code null} for none
   */
  public InAppProduct setPrices(java.util.Map<String, Price> prices) {
    this.prices = prices;
    return this;
  }

  /**
   * The type of the product, e.g. a recurring subscription.
   * @return value or {@code null} for none
   */
  public java.lang.String getPurchaseType() {
    return purchaseType;
  }

  /**
   * The type of the product, e.g. a recurring subscription.
   * @param purchaseType purchaseType or {@code null} for none
   */
  public InAppProduct setPurchaseType(java.lang.String purchaseType) {
    this.purchaseType = purchaseType;
    return this;
  }

  /**
   * Stock-keeping-unit (SKU) of the product, unique within an app.
   * @return value or {@code null} for none
   */
  public java.lang.String getSku() {
    return sku;
  }

  /**
   * Stock-keeping-unit (SKU) of the product, unique within an app.
   * @param sku sku or {@code null} for none
   */
  public InAppProduct setSku(java.lang.String sku) {
    this.sku = sku;
    return this;
  }

  /**
   * The status of the product, e.g. whether it's active.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * The status of the product, e.g. whether it's active.
   * @param status status or {@code null} for none
   */
  public InAppProduct setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * Subscription period, specified in ISO 8601 format. Acceptable values are P1W (one week), P1M
   * (one month), P3M (three months), P6M (six months), and P1Y (one year).
   * @return value or {@code null} for none
   */
  public java.lang.String getSubscriptionPeriod() {
    return subscriptionPeriod;
  }

  /**
   * Subscription period, specified in ISO 8601 format. Acceptable values are P1W (one week), P1M
   * (one month), P3M (three months), P6M (six months), and P1Y (one year).
   * @param subscriptionPeriod subscriptionPeriod or {@code null} for none
   */
  public InAppProduct setSubscriptionPeriod(java.lang.String subscriptionPeriod) {
    this.subscriptionPeriod = subscriptionPeriod;
    return this;
  }

  /**
   * Details about taxes and legal compliance. Only applicable to subscription products.
   * @return value or {@code null} for none
   */
  public SubscriptionTaxAndComplianceSettings getSubscriptionTaxesAndComplianceSettings() {
    return subscriptionTaxesAndComplianceSettings;
  }

  /**
   * Details about taxes and legal compliance. Only applicable to subscription products.
   * @param subscriptionTaxesAndComplianceSettings subscriptionTaxesAndComplianceSettings or {@code null} for none
   */
  public InAppProduct setSubscriptionTaxesAndComplianceSettings(SubscriptionTaxAndComplianceSettings subscriptionTaxesAndComplianceSettings) {
    this.subscriptionTaxesAndComplianceSettings = subscriptionTaxesAndComplianceSettings;
    return this;
  }

  /**
   * Trial period, specified in ISO 8601 format. Acceptable values are anything between P7D (seven
   * days) and P999D (999 days).
   * @return value or {@code null} for none
   */
  public java.lang.String getTrialPeriod() {
    return trialPeriod;
  }

  /**
   * Trial period, specified in ISO 8601 format. Acceptable values are anything between P7D (seven
   * days) and P999D (999 days).
   * @param trialPeriod trialPeriod or {@code null} for none
   */
  public InAppProduct setTrialPeriod(java.lang.String trialPeriod) {
    this.trialPeriod = trialPeriod;
    return this;
  }

  @Override
  public InAppProduct set(String fieldName, Object value) {
    return (InAppProduct) super.set(fieldName, value);
  }

  @Override
  public InAppProduct clone() {
    return (InAppProduct) super.clone();
  }

}
