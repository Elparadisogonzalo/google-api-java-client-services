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
 * Response of the auto-complete query.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2alphaCompleteQueryResponse extends com.google.api.client.json.GenericJson {

  /**
   * A unique complete token. This should be included in the SearchRequest resulting from this
   * completion, which enables accurate attribution of complete model performance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String attributionToken;

  /**
   * Results of the matching suggestions. The result list is ordered and the first result is top
   * suggestion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRetailV2alphaCompleteQueryResponseCompletionResult> completionResults;

  /**
   * Matched recent searches of this user. The maximum number of recent searches is 10. This field
   * is a restricted feature. Contact Retail Search support team if you are interested in enabling
   * it. This feature is only available when CompleteQueryRequest.visitor_id field is set and
   * UserEvent is imported. The recent searches satisfy the follow rules: * They are ordered from
   * latest to oldest. * They are matched with CompleteQueryRequest.query case insensitively. * They
   * are transformed to lower cases. * They are UTF-8 safe. Recent searches are deduplicated. More
   * recent searches will be reserved when duplication happens.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRetailV2alphaCompleteQueryResponseRecentSearchResult> recentSearchResults;

  /**
   * A unique complete token. This should be included in the SearchRequest resulting from this
   * completion, which enables accurate attribution of complete model performance.
   * @return value or {@code null} for none
   */
  public java.lang.String getAttributionToken() {
    return attributionToken;
  }

  /**
   * A unique complete token. This should be included in the SearchRequest resulting from this
   * completion, which enables accurate attribution of complete model performance.
   * @param attributionToken attributionToken or {@code null} for none
   */
  public GoogleCloudRetailV2alphaCompleteQueryResponse setAttributionToken(java.lang.String attributionToken) {
    this.attributionToken = attributionToken;
    return this;
  }

  /**
   * Results of the matching suggestions. The result list is ordered and the first result is top
   * suggestion.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRetailV2alphaCompleteQueryResponseCompletionResult> getCompletionResults() {
    return completionResults;
  }

  /**
   * Results of the matching suggestions. The result list is ordered and the first result is top
   * suggestion.
   * @param completionResults completionResults or {@code null} for none
   */
  public GoogleCloudRetailV2alphaCompleteQueryResponse setCompletionResults(java.util.List<GoogleCloudRetailV2alphaCompleteQueryResponseCompletionResult> completionResults) {
    this.completionResults = completionResults;
    return this;
  }

  /**
   * Matched recent searches of this user. The maximum number of recent searches is 10. This field
   * is a restricted feature. Contact Retail Search support team if you are interested in enabling
   * it. This feature is only available when CompleteQueryRequest.visitor_id field is set and
   * UserEvent is imported. The recent searches satisfy the follow rules: * They are ordered from
   * latest to oldest. * They are matched with CompleteQueryRequest.query case insensitively. * They
   * are transformed to lower cases. * They are UTF-8 safe. Recent searches are deduplicated. More
   * recent searches will be reserved when duplication happens.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRetailV2alphaCompleteQueryResponseRecentSearchResult> getRecentSearchResults() {
    return recentSearchResults;
  }

  /**
   * Matched recent searches of this user. The maximum number of recent searches is 10. This field
   * is a restricted feature. Contact Retail Search support team if you are interested in enabling
   * it. This feature is only available when CompleteQueryRequest.visitor_id field is set and
   * UserEvent is imported. The recent searches satisfy the follow rules: * They are ordered from
   * latest to oldest. * They are matched with CompleteQueryRequest.query case insensitively. * They
   * are transformed to lower cases. * They are UTF-8 safe. Recent searches are deduplicated. More
   * recent searches will be reserved when duplication happens.
   * @param recentSearchResults recentSearchResults or {@code null} for none
   */
  public GoogleCloudRetailV2alphaCompleteQueryResponse setRecentSearchResults(java.util.List<GoogleCloudRetailV2alphaCompleteQueryResponseRecentSearchResult> recentSearchResults) {
    this.recentSearchResults = recentSearchResults;
    return this;
  }

  @Override
  public GoogleCloudRetailV2alphaCompleteQueryResponse set(String fieldName, Object value) {
    return (GoogleCloudRetailV2alphaCompleteQueryResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2alphaCompleteQueryResponse clone() {
    return (GoogleCloudRetailV2alphaCompleteQueryResponse) super.clone();
  }

}
