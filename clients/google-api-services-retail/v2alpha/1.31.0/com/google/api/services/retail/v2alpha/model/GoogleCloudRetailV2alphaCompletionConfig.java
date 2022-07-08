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

package com.google.api.services.retail.v2alpha.model;

/**
 * Catalog level autocomplete config for customers to customize autocomplete feature's settings.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2alphaCompletionConfig extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The source data for the latest import of the autocomplete allowlist phrases.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2alphaCompletionDataInputConfig allowlistInputConfig;

  /**
   * If set to true, the auto learning function is enabled. Auto learning uses user data to generate
   * suggestions using ML techniques. Default value is false. Only after enabling auto learning can
   * users use `cloud-retail` data in CompleteQueryRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean autoLearning;

  /**
   * Output only. The source data for the latest import of the autocomplete denylist phrases.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2alphaCompletionDataInputConfig denylistInputConfig;

  /**
   * Output only. Name of the LRO corresponding to the latest allowlist import. Can use GetOperation
   * API to retrieve the latest state of the Long Running Operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lastAllowlistImportOperation;

  /**
   * Output only. Name of the LRO corresponding to the latest denylist import. Can use GetOperation
   * API to retrieve the latest state of the Long Running Operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lastDenylistImportOperation;

  /**
   * Output only. Name of the LRO corresponding to the latest suggestion terms list import. Can use
   * GetOperation API to retrieve the latest state of the Long Running Operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lastSuggestionsImportOperation;

  /**
   * Specifies the matching order for autocomplete suggestions, e.g., a query consisting of 'sh'
   * with 'out-of-order' specified would suggest "women's shoes", whereas a query of 'red s' with
   * 'exact-prefix' specified would suggest "red shoes". Currently supported values: * 'out-of-
   * order' * 'exact-prefix' Default value: 'exact-prefix'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String matchingOrder;

  /**
   * The maximum number of autocomplete suggestions returned per term. The maximum allowed max
   * suggestions is 20. Default value is 20. If left unset or set to 0, then will fallback to
   * default value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxSuggestions;

  /**
   * The minimum number of characters needed to be typed in order to get suggestions. Default value
   * is 2. If left unset or set to 0, then will fallback to default value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minPrefixLength;

  /**
   * Required. Immutable. Fully qualified name `projects/locations/catalogs/completionConfig`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The source data for the latest import of the autocomplete suggestion phrases.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2alphaCompletionDataInputConfig suggestionsInputConfig;

  /**
   * Output only. The source data for the latest import of the autocomplete allowlist phrases.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2alphaCompletionDataInputConfig getAllowlistInputConfig() {
    return allowlistInputConfig;
  }

  /**
   * Output only. The source data for the latest import of the autocomplete allowlist phrases.
   * @param allowlistInputConfig allowlistInputConfig or {@code null} for none
   */
  public GoogleCloudRetailV2alphaCompletionConfig setAllowlistInputConfig(GoogleCloudRetailV2alphaCompletionDataInputConfig allowlistInputConfig) {
    this.allowlistInputConfig = allowlistInputConfig;
    return this;
  }

  /**
   * If set to true, the auto learning function is enabled. Auto learning uses user data to generate
   * suggestions using ML techniques. Default value is false. Only after enabling auto learning can
   * users use `cloud-retail` data in CompleteQueryRequest.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAutoLearning() {
    return autoLearning;
  }

  /**
   * If set to true, the auto learning function is enabled. Auto learning uses user data to generate
   * suggestions using ML techniques. Default value is false. Only after enabling auto learning can
   * users use `cloud-retail` data in CompleteQueryRequest.
   * @param autoLearning autoLearning or {@code null} for none
   */
  public GoogleCloudRetailV2alphaCompletionConfig setAutoLearning(java.lang.Boolean autoLearning) {
    this.autoLearning = autoLearning;
    return this;
  }

  /**
   * Output only. The source data for the latest import of the autocomplete denylist phrases.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2alphaCompletionDataInputConfig getDenylistInputConfig() {
    return denylistInputConfig;
  }

  /**
   * Output only. The source data for the latest import of the autocomplete denylist phrases.
   * @param denylistInputConfig denylistInputConfig or {@code null} for none
   */
  public GoogleCloudRetailV2alphaCompletionConfig setDenylistInputConfig(GoogleCloudRetailV2alphaCompletionDataInputConfig denylistInputConfig) {
    this.denylistInputConfig = denylistInputConfig;
    return this;
  }

  /**
   * Output only. Name of the LRO corresponding to the latest allowlist import. Can use GetOperation
   * API to retrieve the latest state of the Long Running Operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getLastAllowlistImportOperation() {
    return lastAllowlistImportOperation;
  }

  /**
   * Output only. Name of the LRO corresponding to the latest allowlist import. Can use GetOperation
   * API to retrieve the latest state of the Long Running Operation.
   * @param lastAllowlistImportOperation lastAllowlistImportOperation or {@code null} for none
   */
  public GoogleCloudRetailV2alphaCompletionConfig setLastAllowlistImportOperation(java.lang.String lastAllowlistImportOperation) {
    this.lastAllowlistImportOperation = lastAllowlistImportOperation;
    return this;
  }

  /**
   * Output only. Name of the LRO corresponding to the latest denylist import. Can use GetOperation
   * API to retrieve the latest state of the Long Running Operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getLastDenylistImportOperation() {
    return lastDenylistImportOperation;
  }

  /**
   * Output only. Name of the LRO corresponding to the latest denylist import. Can use GetOperation
   * API to retrieve the latest state of the Long Running Operation.
   * @param lastDenylistImportOperation lastDenylistImportOperation or {@code null} for none
   */
  public GoogleCloudRetailV2alphaCompletionConfig setLastDenylistImportOperation(java.lang.String lastDenylistImportOperation) {
    this.lastDenylistImportOperation = lastDenylistImportOperation;
    return this;
  }

  /**
   * Output only. Name of the LRO corresponding to the latest suggestion terms list import. Can use
   * GetOperation API to retrieve the latest state of the Long Running Operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getLastSuggestionsImportOperation() {
    return lastSuggestionsImportOperation;
  }

  /**
   * Output only. Name of the LRO corresponding to the latest suggestion terms list import. Can use
   * GetOperation API to retrieve the latest state of the Long Running Operation.
   * @param lastSuggestionsImportOperation lastSuggestionsImportOperation or {@code null} for none
   */
  public GoogleCloudRetailV2alphaCompletionConfig setLastSuggestionsImportOperation(java.lang.String lastSuggestionsImportOperation) {
    this.lastSuggestionsImportOperation = lastSuggestionsImportOperation;
    return this;
  }

  /**
   * Specifies the matching order for autocomplete suggestions, e.g., a query consisting of 'sh'
   * with 'out-of-order' specified would suggest "women's shoes", whereas a query of 'red s' with
   * 'exact-prefix' specified would suggest "red shoes". Currently supported values: * 'out-of-
   * order' * 'exact-prefix' Default value: 'exact-prefix'.
   * @return value or {@code null} for none
   */
  public java.lang.String getMatchingOrder() {
    return matchingOrder;
  }

  /**
   * Specifies the matching order for autocomplete suggestions, e.g., a query consisting of 'sh'
   * with 'out-of-order' specified would suggest "women's shoes", whereas a query of 'red s' with
   * 'exact-prefix' specified would suggest "red shoes". Currently supported values: * 'out-of-
   * order' * 'exact-prefix' Default value: 'exact-prefix'.
   * @param matchingOrder matchingOrder or {@code null} for none
   */
  public GoogleCloudRetailV2alphaCompletionConfig setMatchingOrder(java.lang.String matchingOrder) {
    this.matchingOrder = matchingOrder;
    return this;
  }

  /**
   * The maximum number of autocomplete suggestions returned per term. The maximum allowed max
   * suggestions is 20. Default value is 20. If left unset or set to 0, then will fallback to
   * default value.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxSuggestions() {
    return maxSuggestions;
  }

  /**
   * The maximum number of autocomplete suggestions returned per term. The maximum allowed max
   * suggestions is 20. Default value is 20. If left unset or set to 0, then will fallback to
   * default value.
   * @param maxSuggestions maxSuggestions or {@code null} for none
   */
  public GoogleCloudRetailV2alphaCompletionConfig setMaxSuggestions(java.lang.Integer maxSuggestions) {
    this.maxSuggestions = maxSuggestions;
    return this;
  }

  /**
   * The minimum number of characters needed to be typed in order to get suggestions. Default value
   * is 2. If left unset or set to 0, then will fallback to default value.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinPrefixLength() {
    return minPrefixLength;
  }

  /**
   * The minimum number of characters needed to be typed in order to get suggestions. Default value
   * is 2. If left unset or set to 0, then will fallback to default value.
   * @param minPrefixLength minPrefixLength or {@code null} for none
   */
  public GoogleCloudRetailV2alphaCompletionConfig setMinPrefixLength(java.lang.Integer minPrefixLength) {
    this.minPrefixLength = minPrefixLength;
    return this;
  }

  /**
   * Required. Immutable. Fully qualified name `projects/locations/catalogs/completionConfig`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Immutable. Fully qualified name `projects/locations/catalogs/completionConfig`
   * @param name name or {@code null} for none
   */
  public GoogleCloudRetailV2alphaCompletionConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The source data for the latest import of the autocomplete suggestion phrases.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2alphaCompletionDataInputConfig getSuggestionsInputConfig() {
    return suggestionsInputConfig;
  }

  /**
   * Output only. The source data for the latest import of the autocomplete suggestion phrases.
   * @param suggestionsInputConfig suggestionsInputConfig or {@code null} for none
   */
  public GoogleCloudRetailV2alphaCompletionConfig setSuggestionsInputConfig(GoogleCloudRetailV2alphaCompletionDataInputConfig suggestionsInputConfig) {
    this.suggestionsInputConfig = suggestionsInputConfig;
    return this;
  }

  @Override
  public GoogleCloudRetailV2alphaCompletionConfig set(String fieldName, Object value) {
    return (GoogleCloudRetailV2alphaCompletionConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2alphaCompletionConfig clone() {
    return (GoogleCloudRetailV2alphaCompletionConfig) super.clone();
  }

}
