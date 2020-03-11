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
 * Information related to insight state.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Recommender API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRecommenderV1beta1InsightStateInfo extends com.google.api.client.json.GenericJson {

  /**
   * Insight state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * A map of metadata for the state, provided by user or automations systems.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> stateMetadata;

  /**
   * Insight state.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Insight state.
   * @param state state or {@code null} for none
   */
  public GoogleCloudRecommenderV1beta1InsightStateInfo setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * A map of metadata for the state, provided by user or automations systems.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getStateMetadata() {
    return stateMetadata;
  }

  /**
   * A map of metadata for the state, provided by user or automations systems.
   * @param stateMetadata stateMetadata or {@code null} for none
   */
  public GoogleCloudRecommenderV1beta1InsightStateInfo setStateMetadata(java.util.Map<String, java.lang.String> stateMetadata) {
    this.stateMetadata = stateMetadata;
    return this;
  }

  @Override
  public GoogleCloudRecommenderV1beta1InsightStateInfo set(String fieldName, Object value) {
    return (GoogleCloudRecommenderV1beta1InsightStateInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRecommenderV1beta1InsightStateInfo clone() {
    return (GoogleCloudRecommenderV1beta1InsightStateInfo) super.clone();
  }

}
