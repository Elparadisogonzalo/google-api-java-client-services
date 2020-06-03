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

package com.google.api.services.recommender.v1.model;

/**
 * Contains metadata about how much money a recommendation can save or incur.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Recommender API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRecommenderV1CostProjection extends com.google.api.client.json.GenericJson {

  /**
   * An approximate projection on amount saved or amount incurred. Negative cost units indicate cost
   * savings and positive cost units indicate increase. See google.type.Money documentation for
   * positive/negative units.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeMoney cost;

  /**
   * Duration for which this cost applies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String duration;

  /**
   * An approximate projection on amount saved or amount incurred. Negative cost units indicate cost
   * savings and positive cost units indicate increase. See google.type.Money documentation for
   * positive/negative units.
   * @return value or {@code null} for none
   */
  public GoogleTypeMoney getCost() {
    return cost;
  }

  /**
   * An approximate projection on amount saved or amount incurred. Negative cost units indicate cost
   * savings and positive cost units indicate increase. See google.type.Money documentation for
   * positive/negative units.
   * @param cost cost or {@code null} for none
   */
  public GoogleCloudRecommenderV1CostProjection setCost(GoogleTypeMoney cost) {
    this.cost = cost;
    return this;
  }

  /**
   * Duration for which this cost applies.
   * @return value or {@code null} for none
   */
  public String getDuration() {
    return duration;
  }

  /**
   * Duration for which this cost applies.
   * @param duration duration or {@code null} for none
   */
  public GoogleCloudRecommenderV1CostProjection setDuration(String duration) {
    this.duration = duration;
    return this;
  }

  @Override
  public GoogleCloudRecommenderV1CostProjection set(String fieldName, Object value) {
    return (GoogleCloudRecommenderV1CostProjection) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRecommenderV1CostProjection clone() {
    return (GoogleCloudRecommenderV1CostProjection) super.clone();
  }

}
