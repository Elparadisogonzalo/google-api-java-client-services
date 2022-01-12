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

package com.google.api.services.retail.v2beta.model;

/**
 * Response message for SearchService.Search method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2betaSearchResponse extends com.google.api.client.json.GenericJson {

  /**
   * The fully qualified resource name of applied [controls](https://cloud.google.com/retail/docs
   * /serving-control-rules).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> appliedControls;

  /**
   * A unique search token. This should be included in the UserEvent logs resulting from this
   * search, which enables accurate attribution of search model performance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String attributionToken;

  /**
   * If spell correction applies, the corrected query. Otherwise, empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String correctedQuery;

  /**
   * Results of facets requested by user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRetailV2betaSearchResponseFacet> facets;

  /**
   * A token that can be sent as SearchRequest.page_token to retrieve the next page. If this field
   * is omitted, there are no subsequent pages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Query expansion information for the returned results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2betaSearchResponseQueryExpansionInfo queryExpansionInfo;

  /**
   * The URI of a customer-defined redirect page. If redirect action is triggered, no search will be
   * performed, and only redirect_uri and attribution_token will be set in the response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String redirectUri;

  /**
   * A list of matched items. The order represents the ranking.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRetailV2betaSearchResponseSearchResult> results;

  /**
   * The estimated total count of matched items irrespective of pagination. The count of results
   * returned by pagination may be less than the total_size that matches.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalSize;

  /**
   * The fully qualified resource name of applied [controls](https://cloud.google.com/retail/docs
   * /serving-control-rules).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAppliedControls() {
    return appliedControls;
  }

  /**
   * The fully qualified resource name of applied [controls](https://cloud.google.com/retail/docs
   * /serving-control-rules).
   * @param appliedControls appliedControls or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchResponse setAppliedControls(java.util.List<java.lang.String> appliedControls) {
    this.appliedControls = appliedControls;
    return this;
  }

  /**
   * A unique search token. This should be included in the UserEvent logs resulting from this
   * search, which enables accurate attribution of search model performance.
   * @return value or {@code null} for none
   */
  public java.lang.String getAttributionToken() {
    return attributionToken;
  }

  /**
   * A unique search token. This should be included in the UserEvent logs resulting from this
   * search, which enables accurate attribution of search model performance.
   * @param attributionToken attributionToken or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchResponse setAttributionToken(java.lang.String attributionToken) {
    this.attributionToken = attributionToken;
    return this;
  }

  /**
   * If spell correction applies, the corrected query. Otherwise, empty.
   * @return value or {@code null} for none
   */
  public java.lang.String getCorrectedQuery() {
    return correctedQuery;
  }

  /**
   * If spell correction applies, the corrected query. Otherwise, empty.
   * @param correctedQuery correctedQuery or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchResponse setCorrectedQuery(java.lang.String correctedQuery) {
    this.correctedQuery = correctedQuery;
    return this;
  }

  /**
   * Results of facets requested by user.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRetailV2betaSearchResponseFacet> getFacets() {
    return facets;
  }

  /**
   * Results of facets requested by user.
   * @param facets facets or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchResponse setFacets(java.util.List<GoogleCloudRetailV2betaSearchResponseFacet> facets) {
    this.facets = facets;
    return this;
  }

  /**
   * A token that can be sent as SearchRequest.page_token to retrieve the next page. If this field
   * is omitted, there are no subsequent pages.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token that can be sent as SearchRequest.page_token to retrieve the next page. If this field
   * is omitted, there are no subsequent pages.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Query expansion information for the returned results.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchResponseQueryExpansionInfo getQueryExpansionInfo() {
    return queryExpansionInfo;
  }

  /**
   * Query expansion information for the returned results.
   * @param queryExpansionInfo queryExpansionInfo or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchResponse setQueryExpansionInfo(GoogleCloudRetailV2betaSearchResponseQueryExpansionInfo queryExpansionInfo) {
    this.queryExpansionInfo = queryExpansionInfo;
    return this;
  }

  /**
   * The URI of a customer-defined redirect page. If redirect action is triggered, no search will be
   * performed, and only redirect_uri and attribution_token will be set in the response.
   * @return value or {@code null} for none
   */
  public java.lang.String getRedirectUri() {
    return redirectUri;
  }

  /**
   * The URI of a customer-defined redirect page. If redirect action is triggered, no search will be
   * performed, and only redirect_uri and attribution_token will be set in the response.
   * @param redirectUri redirectUri or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchResponse setRedirectUri(java.lang.String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  /**
   * A list of matched items. The order represents the ranking.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRetailV2betaSearchResponseSearchResult> getResults() {
    return results;
  }

  /**
   * A list of matched items. The order represents the ranking.
   * @param results results or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchResponse setResults(java.util.List<GoogleCloudRetailV2betaSearchResponseSearchResult> results) {
    this.results = results;
    return this;
  }

  /**
   * The estimated total count of matched items irrespective of pagination. The count of results
   * returned by pagination may be less than the total_size that matches.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalSize() {
    return totalSize;
  }

  /**
   * The estimated total count of matched items irrespective of pagination. The count of results
   * returned by pagination may be less than the total_size that matches.
   * @param totalSize totalSize or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchResponse setTotalSize(java.lang.Integer totalSize) {
    this.totalSize = totalSize;
    return this;
  }

  @Override
  public GoogleCloudRetailV2betaSearchResponse set(String fieldName, Object value) {
    return (GoogleCloudRetailV2betaSearchResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2betaSearchResponse clone() {
    return (GoogleCloudRetailV2betaSearchResponse) super.clone();
  }

}
