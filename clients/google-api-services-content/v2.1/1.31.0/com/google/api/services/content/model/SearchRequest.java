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

package com.google.api.services.content.model;

/**
 * Request message for the ReportService.Search method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SearchRequest extends com.google.api.client.json.GenericJson {

  /**
   * Number of ReportRows to retrieve in a single page. Defaults to the maximum of 1000. Values
   * above 1000 are coerced to 1000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pageSize;

  /**
   * Token of the page to retrieve. If not specified, the first page of results is returned. In
   * order to request the next page of results, the value obtained from `next_page_token` in the
   * previous response should be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageToken;

  /**
   * Required. Query that defines performance metrics to retrieve and dimensions according to which
   * the metrics are to be segmented. For details on how to construct your query, see the [Query
   * Language guide](https://developers.google.com/shopping-content/guides/reports/query-
   * language/overview).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String query;

  /**
   * Number of ReportRows to retrieve in a single page. Defaults to the maximum of 1000. Values
   * above 1000 are coerced to 1000.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPageSize() {
    return pageSize;
  }

  /**
   * Number of ReportRows to retrieve in a single page. Defaults to the maximum of 1000. Values
   * above 1000 are coerced to 1000.
   * @param pageSize pageSize or {@code null} for none
   */
  public SearchRequest setPageSize(java.lang.Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Token of the page to retrieve. If not specified, the first page of results is returned. In
   * order to request the next page of results, the value obtained from `next_page_token` in the
   * previous response should be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageToken() {
    return pageToken;
  }

  /**
   * Token of the page to retrieve. If not specified, the first page of results is returned. In
   * order to request the next page of results, the value obtained from `next_page_token` in the
   * previous response should be used.
   * @param pageToken pageToken or {@code null} for none
   */
  public SearchRequest setPageToken(java.lang.String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * Required. Query that defines performance metrics to retrieve and dimensions according to which
   * the metrics are to be segmented. For details on how to construct your query, see the [Query
   * Language guide](https://developers.google.com/shopping-content/guides/reports/query-
   * language/overview).
   * @return value or {@code null} for none
   */
  public java.lang.String getQuery() {
    return query;
  }

  /**
   * Required. Query that defines performance metrics to retrieve and dimensions according to which
   * the metrics are to be segmented. For details on how to construct your query, see the [Query
   * Language guide](https://developers.google.com/shopping-content/guides/reports/query-
   * language/overview).
   * @param query query or {@code null} for none
   */
  public SearchRequest setQuery(java.lang.String query) {
    this.query = query;
    return this;
  }

  @Override
  public SearchRequest set(String fieldName, Object value) {
    return (SearchRequest) super.set(fieldName, value);
  }

  @Override
  public SearchRequest clone() {
    return (SearchRequest) super.clone();
  }

}
