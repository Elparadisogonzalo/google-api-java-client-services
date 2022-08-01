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

package com.google.api.services.analyticsdata.v1beta.model;

/**
 * The batch response containing multiple reports.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics Data API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BatchRunReportsResponse extends com.google.api.client.json.GenericJson {

  /**
   * Identifies what kind of resource this message is. This `kind` is always the fixed string
   * "analyticsData#batchRunReports". Useful to distinguish between response types in JSON.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Individual responses. Each response has a separate report request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RunReportResponse> reports;

  /**
   * Identifies what kind of resource this message is. This `kind` is always the fixed string
   * "analyticsData#batchRunReports". Useful to distinguish between response types in JSON.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this message is. This `kind` is always the fixed string
   * "analyticsData#batchRunReports". Useful to distinguish between response types in JSON.
   * @param kind kind or {@code null} for none
   */
  public BatchRunReportsResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Individual responses. Each response has a separate report request.
   * @return value or {@code null} for none
   */
  public java.util.List<RunReportResponse> getReports() {
    return reports;
  }

  /**
   * Individual responses. Each response has a separate report request.
   * @param reports reports or {@code null} for none
   */
  public BatchRunReportsResponse setReports(java.util.List<RunReportResponse> reports) {
    this.reports = reports;
    return this;
  }

  @Override
  public BatchRunReportsResponse set(String fieldName, Object value) {
    return (BatchRunReportsResponse) super.set(fieldName, value);
  }

  @Override
  public BatchRunReportsResponse clone() {
    return (BatchRunReportsResponse) super.clone();
  }

}
