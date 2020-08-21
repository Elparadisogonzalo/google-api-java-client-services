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

package com.google.api.services.fitness.model;

/**
 * A dataset represents a projection container for data points. They do not carry any info of their
 * own. Datasets represent a set of data points from a particular data source. A data point can be
 * found in more than one dataset.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Fitness API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Dataset extends com.google.api.client.json.GenericJson {

  /**
   * The data stream ID of the data source that created the points in this dataset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataSourceId;

  /**
   * The largest end time of all data points in this possibly partial representation of the dataset.
   * Time is in nanoseconds from epoch. This should also match the second part of the dataset
   * identifier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maxEndTimeNs;

  /**
   * The smallest start time of all data points in this possibly partial representation of the
   * dataset. Time is in nanoseconds from epoch. This should also match the first part of the
   * dataset identifier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long minStartTimeNs;

  /**
   * This token will be set when a dataset is received in response to a GET request and the dataset
   * is too large to be included in a single response. Provide this value in a subsequent GET
   * request to return the next page of data points within this dataset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * A partial list of data points contained in the dataset, ordered by largest endTimeNanos first.
   * This list is considered complete when retrieving a small dataset and partial when patching a
   * dataset or retrieving a dataset that is too large to include in a single response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DataPoint> point;

  static {
    // hack to force ProGuard to consider DataPoint used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DataPoint.class);
  }

  /**
   * The data stream ID of the data source that created the points in this dataset.
   * @return value or {@code null} for none
   */
  public java.lang.String getDataSourceId() {
    return dataSourceId;
  }

  /**
   * The data stream ID of the data source that created the points in this dataset.
   * @param dataSourceId dataSourceId or {@code null} for none
   */
  public Dataset setDataSourceId(java.lang.String dataSourceId) {
    this.dataSourceId = dataSourceId;
    return this;
  }

  /**
   * The largest end time of all data points in this possibly partial representation of the dataset.
   * Time is in nanoseconds from epoch. This should also match the second part of the dataset
   * identifier.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaxEndTimeNs() {
    return maxEndTimeNs;
  }

  /**
   * The largest end time of all data points in this possibly partial representation of the dataset.
   * Time is in nanoseconds from epoch. This should also match the second part of the dataset
   * identifier.
   * @param maxEndTimeNs maxEndTimeNs or {@code null} for none
   */
  public Dataset setMaxEndTimeNs(java.lang.Long maxEndTimeNs) {
    this.maxEndTimeNs = maxEndTimeNs;
    return this;
  }

  /**
   * The smallest start time of all data points in this possibly partial representation of the
   * dataset. Time is in nanoseconds from epoch. This should also match the first part of the
   * dataset identifier.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMinStartTimeNs() {
    return minStartTimeNs;
  }

  /**
   * The smallest start time of all data points in this possibly partial representation of the
   * dataset. Time is in nanoseconds from epoch. This should also match the first part of the
   * dataset identifier.
   * @param minStartTimeNs minStartTimeNs or {@code null} for none
   */
  public Dataset setMinStartTimeNs(java.lang.Long minStartTimeNs) {
    this.minStartTimeNs = minStartTimeNs;
    return this;
  }

  /**
   * This token will be set when a dataset is received in response to a GET request and the dataset
   * is too large to be included in a single response. Provide this value in a subsequent GET
   * request to return the next page of data points within this dataset.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * This token will be set when a dataset is received in response to a GET request and the dataset
   * is too large to be included in a single response. Provide this value in a subsequent GET
   * request to return the next page of data points within this dataset.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public Dataset setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * A partial list of data points contained in the dataset, ordered by largest endTimeNanos first.
   * This list is considered complete when retrieving a small dataset and partial when patching a
   * dataset or retrieving a dataset that is too large to include in a single response.
   * @return value or {@code null} for none
   */
  public java.util.List<DataPoint> getPoint() {
    return point;
  }

  /**
   * A partial list of data points contained in the dataset, ordered by largest endTimeNanos first.
   * This list is considered complete when retrieving a small dataset and partial when patching a
   * dataset or retrieving a dataset that is too large to include in a single response.
   * @param point point or {@code null} for none
   */
  public Dataset setPoint(java.util.List<DataPoint> point) {
    this.point = point;
    return this;
  }

  @Override
  public Dataset set(String fieldName, Object value) {
    return (Dataset) super.set(fieldName, value);
  }

  @Override
  public Dataset clone() {
    return (Dataset) super.clone();
  }

}
