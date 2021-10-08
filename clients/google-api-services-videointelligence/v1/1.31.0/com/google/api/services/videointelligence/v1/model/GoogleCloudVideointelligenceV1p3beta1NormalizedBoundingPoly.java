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

package com.google.api.services.videointelligence.v1.model;

/**
 * Normalized bounding polygon for text (that might not be aligned with axis). Contains list of the
 * corner points in clockwise order starting from top-left corner. For example, for a rectangular
 * bounding box: When the text is horizontal it might look like: 0----1 | | 3----2 When it's
 * clockwise rotated 180 degrees around the top-left corner it becomes: 2----3 | | 1----0 and the
 * vertex order will still be (0, 1, 2, 3). Note that values can be less than 0, or greater than 1
 * due to trignometric calculations for location of the box.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Video Intelligence API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVideointelligenceV1p3beta1NormalizedBoundingPoly extends com.google.api.client.json.GenericJson {

  /**
   * Normalized vertices of the bounding polygon.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV1p3beta1NormalizedVertex> vertices;

  /**
   * Normalized vertices of the bounding polygon.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV1p3beta1NormalizedVertex> getVertices() {
    return vertices;
  }

  /**
   * Normalized vertices of the bounding polygon.
   * @param vertices vertices or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p3beta1NormalizedBoundingPoly setVertices(java.util.List<GoogleCloudVideointelligenceV1p3beta1NormalizedVertex> vertices) {
    this.vertices = vertices;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1p3beta1NormalizedBoundingPoly set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1p3beta1NormalizedBoundingPoly) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1p3beta1NormalizedBoundingPoly clone() {
    return (GoogleCloudVideointelligenceV1p3beta1NormalizedBoundingPoly) super.clone();
  }

}
