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

package com.google.api.services.sqladmin.model;

/**
 * Flags list response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FlagsListResponse extends com.google.api.client.json.GenericJson {

  /**
   * List of flags.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Flag> items;

  static {
    // hack to force ProGuard to consider Flag used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Flag.class);
  }

  /**
   * This is always `sql#flagsList`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * List of flags.
   * @return value or {@code null} for none
   */
  public java.util.List<Flag> getItems() {
    return items;
  }

  /**
   * List of flags.
   * @param items items or {@code null} for none
   */
  public FlagsListResponse setItems(java.util.List<Flag> items) {
    this.items = items;
    return this;
  }

  /**
   * This is always `sql#flagsList`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always `sql#flagsList`.
   * @param kind kind or {@code null} for none
   */
  public FlagsListResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public FlagsListResponse set(String fieldName, Object value) {
    return (FlagsListResponse) super.set(fieldName, value);
  }

  @Override
  public FlagsListResponse clone() {
    return (FlagsListResponse) super.clone();
  }

}
