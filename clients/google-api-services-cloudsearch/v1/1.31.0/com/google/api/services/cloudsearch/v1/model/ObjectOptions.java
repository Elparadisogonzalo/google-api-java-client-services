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

package com.google.api.services.cloudsearch.v1.model;

/**
 * The options for an object.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ObjectOptions extends com.google.api.client.json.GenericJson {

  /**
   * The options that determine how the object is displayed in the Cloud Search results page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ObjectDisplayOptions displayOptions;

  /**
   * The freshness options for an object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FreshnessOptions freshnessOptions;

  /**
   * Operators that can be used to filter suggestions. For Suggest API, only operators mentioned
   * here will be honored in the FilterOptions. Only TEXT and ENUM operators are supported. NOTE:
   * "objecttype", "type" and "mimetype" are already supported. This property is to configure schema
   * specific operators. Even though this is an array, only one operator can be specified. This is
   * an array for future extensibility. Operators mapping to multiple properties within the same
   * object are not supported. If the operator spans across different object types, this option has
   * to be set once for each object definition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> suggestionFilteringOperators;

  /**
   * The options that determine how the object is displayed in the Cloud Search results page.
   * @return value or {@code null} for none
   */
  public ObjectDisplayOptions getDisplayOptions() {
    return displayOptions;
  }

  /**
   * The options that determine how the object is displayed in the Cloud Search results page.
   * @param displayOptions displayOptions or {@code null} for none
   */
  public ObjectOptions setDisplayOptions(ObjectDisplayOptions displayOptions) {
    this.displayOptions = displayOptions;
    return this;
  }

  /**
   * The freshness options for an object.
   * @return value or {@code null} for none
   */
  public FreshnessOptions getFreshnessOptions() {
    return freshnessOptions;
  }

  /**
   * The freshness options for an object.
   * @param freshnessOptions freshnessOptions or {@code null} for none
   */
  public ObjectOptions setFreshnessOptions(FreshnessOptions freshnessOptions) {
    this.freshnessOptions = freshnessOptions;
    return this;
  }

  /**
   * Operators that can be used to filter suggestions. For Suggest API, only operators mentioned
   * here will be honored in the FilterOptions. Only TEXT and ENUM operators are supported. NOTE:
   * "objecttype", "type" and "mimetype" are already supported. This property is to configure schema
   * specific operators. Even though this is an array, only one operator can be specified. This is
   * an array for future extensibility. Operators mapping to multiple properties within the same
   * object are not supported. If the operator spans across different object types, this option has
   * to be set once for each object definition.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSuggestionFilteringOperators() {
    return suggestionFilteringOperators;
  }

  /**
   * Operators that can be used to filter suggestions. For Suggest API, only operators mentioned
   * here will be honored in the FilterOptions. Only TEXT and ENUM operators are supported. NOTE:
   * "objecttype", "type" and "mimetype" are already supported. This property is to configure schema
   * specific operators. Even though this is an array, only one operator can be specified. This is
   * an array for future extensibility. Operators mapping to multiple properties within the same
   * object are not supported. If the operator spans across different object types, this option has
   * to be set once for each object definition.
   * @param suggestionFilteringOperators suggestionFilteringOperators or {@code null} for none
   */
  public ObjectOptions setSuggestionFilteringOperators(java.util.List<java.lang.String> suggestionFilteringOperators) {
    this.suggestionFilteringOperators = suggestionFilteringOperators;
    return this;
  }

  @Override
  public ObjectOptions set(String fieldName, Object value) {
    return (ObjectOptions) super.set(fieldName, value);
  }

  @Override
  public ObjectOptions clone() {
    return (ObjectOptions) super.clone();
  }

}
