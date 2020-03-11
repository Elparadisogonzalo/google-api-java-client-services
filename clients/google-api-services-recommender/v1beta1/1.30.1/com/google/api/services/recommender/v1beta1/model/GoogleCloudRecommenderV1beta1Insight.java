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

package com.google.api.services.recommender.v1beta1.model;

/**
 * An insight along with the information used to derive the insight. The insight may have associated
 * recomendations as well.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Recommender API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRecommenderV1beta1Insight extends com.google.api.client.json.GenericJson {

  /**
   * Recommendations derived from this insight.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRecommenderV1beta1InsightRecommendationReference> associatedRecommendations;

  /**
   * Category being targeted by the insight.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String category;

  /**
   * A struct of custom fields to explain the insight. Example: "grantedPermissionsCount": "1000"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> content;

  /**
   * Free-form human readable summary in English. The maximum length is 500 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Fingerprint of the Insight. Provides optimistic locking when updating states.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Insight subtype. Insight content schema will be stable for a given subtype.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String insightSubtype;

  /**
   * Timestamp of the latest data used to generate the insight.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastRefreshTime;

  /**
   * Name of the insight.
   *
   * * A project insight is represented as   projects/[PROJECT_NUMBER]/locations/[LOCATION]/insightT
   * ypes/[INSIGHT_TYPE_ID]/insights/[insight_id]
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Observation period that led to the insight. The source data used to generate the insight ends
   * at last_refresh_time and begins at (last_refresh_time - observation_period).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String observationPeriod;

  /**
   * Information state and metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRecommenderV1beta1InsightStateInfo stateInfo;

  /**
   * Fully qualified resource names that this insight is targeting.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> targetResources;

  /**
   * Recommendations derived from this insight.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRecommenderV1beta1InsightRecommendationReference> getAssociatedRecommendations() {
    return associatedRecommendations;
  }

  /**
   * Recommendations derived from this insight.
   * @param associatedRecommendations associatedRecommendations or {@code null} for none
   */
  public GoogleCloudRecommenderV1beta1Insight setAssociatedRecommendations(java.util.List<GoogleCloudRecommenderV1beta1InsightRecommendationReference> associatedRecommendations) {
    this.associatedRecommendations = associatedRecommendations;
    return this;
  }

  /**
   * Category being targeted by the insight.
   * @return value or {@code null} for none
   */
  public java.lang.String getCategory() {
    return category;
  }

  /**
   * Category being targeted by the insight.
   * @param category category or {@code null} for none
   */
  public GoogleCloudRecommenderV1beta1Insight setCategory(java.lang.String category) {
    this.category = category;
    return this;
  }

  /**
   * A struct of custom fields to explain the insight. Example: "grantedPermissionsCount": "1000"
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getContent() {
    return content;
  }

  /**
   * A struct of custom fields to explain the insight. Example: "grantedPermissionsCount": "1000"
   * @param content content or {@code null} for none
   */
  public GoogleCloudRecommenderV1beta1Insight setContent(java.util.Map<String, java.lang.Object> content) {
    this.content = content;
    return this;
  }

  /**
   * Free-form human readable summary in English. The maximum length is 500 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Free-form human readable summary in English. The maximum length is 500 characters.
   * @param description description or {@code null} for none
   */
  public GoogleCloudRecommenderV1beta1Insight setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Fingerprint of the Insight. Provides optimistic locking when updating states.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Fingerprint of the Insight. Provides optimistic locking when updating states.
   * @param etag etag or {@code null} for none
   */
  public GoogleCloudRecommenderV1beta1Insight setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Insight subtype. Insight content schema will be stable for a given subtype.
   * @return value or {@code null} for none
   */
  public java.lang.String getInsightSubtype() {
    return insightSubtype;
  }

  /**
   * Insight subtype. Insight content schema will be stable for a given subtype.
   * @param insightSubtype insightSubtype or {@code null} for none
   */
  public GoogleCloudRecommenderV1beta1Insight setInsightSubtype(java.lang.String insightSubtype) {
    this.insightSubtype = insightSubtype;
    return this;
  }

  /**
   * Timestamp of the latest data used to generate the insight.
   * @return value or {@code null} for none
   */
  public String getLastRefreshTime() {
    return lastRefreshTime;
  }

  /**
   * Timestamp of the latest data used to generate the insight.
   * @param lastRefreshTime lastRefreshTime or {@code null} for none
   */
  public GoogleCloudRecommenderV1beta1Insight setLastRefreshTime(String lastRefreshTime) {
    this.lastRefreshTime = lastRefreshTime;
    return this;
  }

  /**
   * Name of the insight.
   *
   * * A project insight is represented as   projects/[PROJECT_NUMBER]/locations/[LOCATION]/insightT
   * ypes/[INSIGHT_TYPE_ID]/insights/[insight_id]
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the insight.
   *
   * * A project insight is represented as   projects/[PROJECT_NUMBER]/locations/[LOCATION]/insightT
   * ypes/[INSIGHT_TYPE_ID]/insights/[insight_id]
   * @param name name or {@code null} for none
   */
  public GoogleCloudRecommenderV1beta1Insight setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Observation period that led to the insight. The source data used to generate the insight ends
   * at last_refresh_time and begins at (last_refresh_time - observation_period).
   * @return value or {@code null} for none
   */
  public String getObservationPeriod() {
    return observationPeriod;
  }

  /**
   * Observation period that led to the insight. The source data used to generate the insight ends
   * at last_refresh_time and begins at (last_refresh_time - observation_period).
   * @param observationPeriod observationPeriod or {@code null} for none
   */
  public GoogleCloudRecommenderV1beta1Insight setObservationPeriod(String observationPeriod) {
    this.observationPeriod = observationPeriod;
    return this;
  }

  /**
   * Information state and metadata.
   * @return value or {@code null} for none
   */
  public GoogleCloudRecommenderV1beta1InsightStateInfo getStateInfo() {
    return stateInfo;
  }

  /**
   * Information state and metadata.
   * @param stateInfo stateInfo or {@code null} for none
   */
  public GoogleCloudRecommenderV1beta1Insight setStateInfo(GoogleCloudRecommenderV1beta1InsightStateInfo stateInfo) {
    this.stateInfo = stateInfo;
    return this;
  }

  /**
   * Fully qualified resource names that this insight is targeting.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTargetResources() {
    return targetResources;
  }

  /**
   * Fully qualified resource names that this insight is targeting.
   * @param targetResources targetResources or {@code null} for none
   */
  public GoogleCloudRecommenderV1beta1Insight setTargetResources(java.util.List<java.lang.String> targetResources) {
    this.targetResources = targetResources;
    return this;
  }

  @Override
  public GoogleCloudRecommenderV1beta1Insight set(String fieldName, Object value) {
    return (GoogleCloudRecommenderV1beta1Insight) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRecommenderV1beta1Insight clone() {
    return (GoogleCloudRecommenderV1beta1Insight) super.clone();
  }

}
