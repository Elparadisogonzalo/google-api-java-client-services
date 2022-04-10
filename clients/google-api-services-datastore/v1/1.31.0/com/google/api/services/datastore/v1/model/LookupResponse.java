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

package com.google.api.services.datastore.v1.model;

/**
 * The response for Datastore.Lookup.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Datastore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LookupResponse extends com.google.api.client.json.GenericJson {

  /**
   * A list of keys that were not looked up due to resource constraints. The order of results in
   * this field is undefined and has no relation to the order of the keys in the input.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Key> deferred;

  static {
    // hack to force ProGuard to consider Key used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Key.class);
  }

  /**
   * Entities found as `ResultType.FULL` entities. The order of results in this field is undefined
   * and has no relation to the order of the keys in the input.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EntityResult> found;

  static {
    // hack to force ProGuard to consider EntityResult used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(EntityResult.class);
  }

  /**
   * Entities not found as `ResultType.KEY_ONLY` entities. The order of results in this field is
   * undefined and has no relation to the order of the keys in the input.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EntityResult> missing;

  static {
    // hack to force ProGuard to consider EntityResult used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(EntityResult.class);
  }

  /**
   * The time at which these entities were read or found missing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String readTime;

  /**
   * A list of keys that were not looked up due to resource constraints. The order of results in
   * this field is undefined and has no relation to the order of the keys in the input.
   * @return value or {@code null} for none
   */
  public java.util.List<Key> getDeferred() {
    return deferred;
  }

  /**
   * A list of keys that were not looked up due to resource constraints. The order of results in
   * this field is undefined and has no relation to the order of the keys in the input.
   * @param deferred deferred or {@code null} for none
   */
  public LookupResponse setDeferred(java.util.List<Key> deferred) {
    this.deferred = deferred;
    return this;
  }

  /**
   * Entities found as `ResultType.FULL` entities. The order of results in this field is undefined
   * and has no relation to the order of the keys in the input.
   * @return value or {@code null} for none
   */
  public java.util.List<EntityResult> getFound() {
    return found;
  }

  /**
   * Entities found as `ResultType.FULL` entities. The order of results in this field is undefined
   * and has no relation to the order of the keys in the input.
   * @param found found or {@code null} for none
   */
  public LookupResponse setFound(java.util.List<EntityResult> found) {
    this.found = found;
    return this;
  }

  /**
   * Entities not found as `ResultType.KEY_ONLY` entities. The order of results in this field is
   * undefined and has no relation to the order of the keys in the input.
   * @return value or {@code null} for none
   */
  public java.util.List<EntityResult> getMissing() {
    return missing;
  }

  /**
   * Entities not found as `ResultType.KEY_ONLY` entities. The order of results in this field is
   * undefined and has no relation to the order of the keys in the input.
   * @param missing missing or {@code null} for none
   */
  public LookupResponse setMissing(java.util.List<EntityResult> missing) {
    this.missing = missing;
    return this;
  }

  /**
   * The time at which these entities were read or found missing.
   * @return value or {@code null} for none
   */
  public String getReadTime() {
    return readTime;
  }

  /**
   * The time at which these entities were read or found missing.
   * @param readTime readTime or {@code null} for none
   */
  public LookupResponse setReadTime(String readTime) {
    this.readTime = readTime;
    return this;
  }

  @Override
  public LookupResponse set(String fieldName, Object value) {
    return (LookupResponse) super.set(fieldName, value);
  }

  @Override
  public LookupResponse clone() {
    return (LookupResponse) super.clone();
  }

}
