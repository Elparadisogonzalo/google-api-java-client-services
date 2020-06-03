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
 * A recommendation along with a suggested action. E.g., a rightsizing recommendation for an
 * underutilized VM, IAM role recommendations, etc
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Recommender API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRecommenderV1Recommendation extends com.google.api.client.json.GenericJson {

  /**
   * Optional set of additional impact that this recommendation may have when trying to optimize for
   * the primary category. These may be positive or negative.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRecommenderV1Impact> additionalImpact;

  static {
    // hack to force ProGuard to consider GoogleCloudRecommenderV1Impact used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudRecommenderV1Impact.class);
  }

  /**
   * Content of the recommendation describing recommended changes to resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRecommenderV1RecommendationContent content;

  /**
   * Free-form human readable summary in English. The maximum length is 500 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Fingerprint of the Recommendation. Provides optimistic locking when updating states.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Last time this recommendation was refreshed by the system that created it in the first place.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastRefreshTime;

  /**
   * Name of recommendation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The primary impact that this recommendation can have while trying to optimize for one category.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRecommenderV1Impact primaryImpact;

  /**
   * Contains an identifier for a subtype of recommendations produced for the same recommender.
   * Subtype is a function of content and impact, meaning a new subtype might be added when
   * significant changes to `content` or `primary_impact.category` are introduced. See the
   * Recommenders section to see a list of subtypes for a given Recommender.
   *
   * Examples:   For recommender = "google.iam.policy.Recommender",   recommender_subtype can be one
   * of "REMOVE_ROLE"/"REPLACE_ROLE"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String recommenderSubtype;

  /**
   * Information for state. Contains state and metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRecommenderV1RecommendationStateInfo stateInfo;

  /**
   * Optional set of additional impact that this recommendation may have when trying to optimize for
   * the primary category. These may be positive or negative.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRecommenderV1Impact> getAdditionalImpact() {
    return additionalImpact;
  }

  /**
   * Optional set of additional impact that this recommendation may have when trying to optimize for
   * the primary category. These may be positive or negative.
   * @param additionalImpact additionalImpact or {@code null} for none
   */
  public GoogleCloudRecommenderV1Recommendation setAdditionalImpact(java.util.List<GoogleCloudRecommenderV1Impact> additionalImpact) {
    this.additionalImpact = additionalImpact;
    return this;
  }

  /**
   * Content of the recommendation describing recommended changes to resources.
   * @return value or {@code null} for none
   */
  public GoogleCloudRecommenderV1RecommendationContent getContent() {
    return content;
  }

  /**
   * Content of the recommendation describing recommended changes to resources.
   * @param content content or {@code null} for none
   */
  public GoogleCloudRecommenderV1Recommendation setContent(GoogleCloudRecommenderV1RecommendationContent content) {
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
  public GoogleCloudRecommenderV1Recommendation setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Fingerprint of the Recommendation. Provides optimistic locking when updating states.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Fingerprint of the Recommendation. Provides optimistic locking when updating states.
   * @param etag etag or {@code null} for none
   */
  public GoogleCloudRecommenderV1Recommendation setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Last time this recommendation was refreshed by the system that created it in the first place.
   * @return value or {@code null} for none
   */
  public String getLastRefreshTime() {
    return lastRefreshTime;
  }

  /**
   * Last time this recommendation was refreshed by the system that created it in the first place.
   * @param lastRefreshTime lastRefreshTime or {@code null} for none
   */
  public GoogleCloudRecommenderV1Recommendation setLastRefreshTime(String lastRefreshTime) {
    this.lastRefreshTime = lastRefreshTime;
    return this;
  }

  /**
   * Name of recommendation.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of recommendation.
   * @param name name or {@code null} for none
   */
  public GoogleCloudRecommenderV1Recommendation setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The primary impact that this recommendation can have while trying to optimize for one category.
   * @return value or {@code null} for none
   */
  public GoogleCloudRecommenderV1Impact getPrimaryImpact() {
    return primaryImpact;
  }

  /**
   * The primary impact that this recommendation can have while trying to optimize for one category.
   * @param primaryImpact primaryImpact or {@code null} for none
   */
  public GoogleCloudRecommenderV1Recommendation setPrimaryImpact(GoogleCloudRecommenderV1Impact primaryImpact) {
    this.primaryImpact = primaryImpact;
    return this;
  }

  /**
   * Contains an identifier for a subtype of recommendations produced for the same recommender.
   * Subtype is a function of content and impact, meaning a new subtype might be added when
   * significant changes to `content` or `primary_impact.category` are introduced. See the
   * Recommenders section to see a list of subtypes for a given Recommender.
   *
   * Examples:   For recommender = "google.iam.policy.Recommender",   recommender_subtype can be one
   * of "REMOVE_ROLE"/"REPLACE_ROLE"
   * @return value or {@code null} for none
   */
  public java.lang.String getRecommenderSubtype() {
    return recommenderSubtype;
  }

  /**
   * Contains an identifier for a subtype of recommendations produced for the same recommender.
   * Subtype is a function of content and impact, meaning a new subtype might be added when
   * significant changes to `content` or `primary_impact.category` are introduced. See the
   * Recommenders section to see a list of subtypes for a given Recommender.
   *
   * Examples:   For recommender = "google.iam.policy.Recommender",   recommender_subtype can be one
   * of "REMOVE_ROLE"/"REPLACE_ROLE"
   * @param recommenderSubtype recommenderSubtype or {@code null} for none
   */
  public GoogleCloudRecommenderV1Recommendation setRecommenderSubtype(java.lang.String recommenderSubtype) {
    this.recommenderSubtype = recommenderSubtype;
    return this;
  }

  /**
   * Information for state. Contains state and metadata.
   * @return value or {@code null} for none
   */
  public GoogleCloudRecommenderV1RecommendationStateInfo getStateInfo() {
    return stateInfo;
  }

  /**
   * Information for state. Contains state and metadata.
   * @param stateInfo stateInfo or {@code null} for none
   */
  public GoogleCloudRecommenderV1Recommendation setStateInfo(GoogleCloudRecommenderV1RecommendationStateInfo stateInfo) {
    this.stateInfo = stateInfo;
    return this;
  }

  @Override
  public GoogleCloudRecommenderV1Recommendation set(String fieldName, Object value) {
    return (GoogleCloudRecommenderV1Recommendation) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRecommenderV1Recommendation clone() {
    return (GoogleCloudRecommenderV1Recommendation) super.clone();
  }

}
