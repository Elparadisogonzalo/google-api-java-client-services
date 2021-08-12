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

package com.google.api.services.retail.v2alpha.model;

/**
 * Specification to determine under which conditions query expansion should occur.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2alphaSearchRequestQueryExpansionSpec extends com.google.api.client.json.GenericJson {

  /**
   * The condition under which query expansion should occur. Default to Condition.DISABLED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String condition;

  /**
   * Whether to pin unexpanded results. If this field is set to true, unexpanded products are always
   * at the top of the search results, followed by the expanded results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean pinUnexpandedResults;

  /**
   * The condition under which query expansion should occur. Default to Condition.DISABLED.
   * @return value or {@code null} for none
   */
  public java.lang.String getCondition() {
    return condition;
  }

  /**
   * The condition under which query expansion should occur. Default to Condition.DISABLED.
   * @param condition condition or {@code null} for none
   */
  public GoogleCloudRetailV2alphaSearchRequestQueryExpansionSpec setCondition(java.lang.String condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Whether to pin unexpanded results. If this field is set to true, unexpanded products are always
   * at the top of the search results, followed by the expanded results.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPinUnexpandedResults() {
    return pinUnexpandedResults;
  }

  /**
   * Whether to pin unexpanded results. If this field is set to true, unexpanded products are always
   * at the top of the search results, followed by the expanded results.
   * @param pinUnexpandedResults pinUnexpandedResults or {@code null} for none
   */
  public GoogleCloudRetailV2alphaSearchRequestQueryExpansionSpec setPinUnexpandedResults(java.lang.Boolean pinUnexpandedResults) {
    this.pinUnexpandedResults = pinUnexpandedResults;
    return this;
  }

  @Override
  public GoogleCloudRetailV2alphaSearchRequestQueryExpansionSpec set(String fieldName, Object value) {
    return (GoogleCloudRetailV2alphaSearchRequestQueryExpansionSpec) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2alphaSearchRequestQueryExpansionSpec clone() {
    return (GoogleCloudRetailV2alphaSearchRequestQueryExpansionSpec) super.clone();
  }

}
