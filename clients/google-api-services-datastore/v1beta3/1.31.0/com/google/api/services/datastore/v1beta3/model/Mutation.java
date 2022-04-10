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

package com.google.api.services.datastore.v1beta3.model;

/**
 * A mutation to apply to an entity.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Datastore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Mutation extends com.google.api.client.json.GenericJson {

  /**
   * The version of the entity that this mutation is being applied to. If this does not match the
   * current version on the server, the mutation conflicts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long baseVersion;

  /**
   * The key of the entity to delete. The entity may or may not already exist. Must have a complete
   * key path and must not be reserved/read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Key delete;

  /**
   * The entity to insert. The entity must not already exist. The entity key's final path element
   * may be incomplete.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Entity insert;

  /**
   * The entity to update. The entity must already exist. Must have a complete key path.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Entity update;

  /**
   * The update time of the entity that this mutation is being applied to. If this does not match
   * the current update time on the server, the mutation conflicts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * The entity to upsert. The entity may or may not already exist. The entity key's final path
   * element may be incomplete.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Entity upsert;

  /**
   * The version of the entity that this mutation is being applied to. If this does not match the
   * current version on the server, the mutation conflicts.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBaseVersion() {
    return baseVersion;
  }

  /**
   * The version of the entity that this mutation is being applied to. If this does not match the
   * current version on the server, the mutation conflicts.
   * @param baseVersion baseVersion or {@code null} for none
   */
  public Mutation setBaseVersion(java.lang.Long baseVersion) {
    this.baseVersion = baseVersion;
    return this;
  }

  /**
   * The key of the entity to delete. The entity may or may not already exist. Must have a complete
   * key path and must not be reserved/read-only.
   * @return value or {@code null} for none
   */
  public Key getDelete() {
    return delete;
  }

  /**
   * The key of the entity to delete. The entity may or may not already exist. Must have a complete
   * key path and must not be reserved/read-only.
   * @param delete delete or {@code null} for none
   */
  public Mutation setDelete(Key delete) {
    this.delete = delete;
    return this;
  }

  /**
   * The entity to insert. The entity must not already exist. The entity key's final path element
   * may be incomplete.
   * @return value or {@code null} for none
   */
  public Entity getInsert() {
    return insert;
  }

  /**
   * The entity to insert. The entity must not already exist. The entity key's final path element
   * may be incomplete.
   * @param insert insert or {@code null} for none
   */
  public Mutation setInsert(Entity insert) {
    this.insert = insert;
    return this;
  }

  /**
   * The entity to update. The entity must already exist. Must have a complete key path.
   * @return value or {@code null} for none
   */
  public Entity getUpdate() {
    return update;
  }

  /**
   * The entity to update. The entity must already exist. Must have a complete key path.
   * @param update update or {@code null} for none
   */
  public Mutation setUpdate(Entity update) {
    this.update = update;
    return this;
  }

  /**
   * The update time of the entity that this mutation is being applied to. If this does not match
   * the current update time on the server, the mutation conflicts.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * The update time of the entity that this mutation is being applied to. If this does not match
   * the current update time on the server, the mutation conflicts.
   * @param updateTime updateTime or {@code null} for none
   */
  public Mutation setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * The entity to upsert. The entity may or may not already exist. The entity key's final path
   * element may be incomplete.
   * @return value or {@code null} for none
   */
  public Entity getUpsert() {
    return upsert;
  }

  /**
   * The entity to upsert. The entity may or may not already exist. The entity key's final path
   * element may be incomplete.
   * @param upsert upsert or {@code null} for none
   */
  public Mutation setUpsert(Entity upsert) {
    this.upsert = upsert;
    return this;
  }

  @Override
  public Mutation set(String fieldName, Object value) {
    return (Mutation) super.set(fieldName, value);
  }

  @Override
  public Mutation clone() {
    return (Mutation) super.clone();
  }

}
