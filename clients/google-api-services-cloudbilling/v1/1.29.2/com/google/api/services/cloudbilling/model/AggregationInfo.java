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

package com.google.api.services.cloudbilling.model;

/**
 * Represents the aggregation level and interval for pricing of a single SKU.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Billing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AggregationInfo extends com.google.api.client.json.GenericJson {

  /**
   * The number of intervals to aggregate over. Example: If aggregation_level is "DAILY" and
   * aggregation_count is 14, aggregation will be over 14 days.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer aggregationCount;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String aggregationInterval;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String aggregationLevel;

  /**
   * The number of intervals to aggregate over. Example: If aggregation_level is "DAILY" and
   * aggregation_count is 14, aggregation will be over 14 days.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAggregationCount() {
    return aggregationCount;
  }

  /**
   * The number of intervals to aggregate over. Example: If aggregation_level is "DAILY" and
   * aggregation_count is 14, aggregation will be over 14 days.
   * @param aggregationCount aggregationCount or {@code null} for none
   */
  public AggregationInfo setAggregationCount(java.lang.Integer aggregationCount) {
    this.aggregationCount = aggregationCount;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAggregationInterval() {
    return aggregationInterval;
  }

  /**
   * @param aggregationInterval aggregationInterval or {@code null} for none
   */
  public AggregationInfo setAggregationInterval(java.lang.String aggregationInterval) {
    this.aggregationInterval = aggregationInterval;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAggregationLevel() {
    return aggregationLevel;
  }

  /**
   * @param aggregationLevel aggregationLevel or {@code null} for none
   */
  public AggregationInfo setAggregationLevel(java.lang.String aggregationLevel) {
    this.aggregationLevel = aggregationLevel;
    return this;
  }

  @Override
  public AggregationInfo set(String fieldName, Object value) {
    return (AggregationInfo) super.set(fieldName, value);
  }

  @Override
  public AggregationInfo clone() {
    return (AggregationInfo) super.clone();
  }

}
