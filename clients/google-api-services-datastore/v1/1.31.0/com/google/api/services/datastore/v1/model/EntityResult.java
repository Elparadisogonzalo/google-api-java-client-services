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
 * The result of fetching an entity from Datastore.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Datastore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EntityResult extends com.google.api.client.json.GenericJson {

  /**
   * A cursor that points to the position after the result entity. Set only when the `EntityResult`
   * is part of a `QueryResultBatch` message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cursor;

  /**
   * The resulting entity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Entity entity;

  /**
   * The time at which the entity was last changed. This field is set for `FULL` entity results. If
   * this entity is missing, this field will not be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * The version of the entity, a strictly positive number that monotonically increases with changes
   * to the entity. This field is set for `FULL` entity results. For missing entities in
   * `LookupResponse`, this is the version of the snapshot that was used to look up the entity, and
   * it is always set except for eventually consistent reads.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long version;

  /**
   * A cursor that points to the position after the result entity. Set only when the `EntityResult`
   * is part of a `QueryResultBatch` message.
   * @see #decodeCursor()
   * @return value or {@code null} for none
   */
  public java.lang.String getCursor() {
    return cursor;
  }

  /**
   * A cursor that points to the position after the result entity. Set only when the `EntityResult`
   * is part of a `QueryResultBatch` message.
   * @see #getCursor()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeCursor() {
    return com.google.api.client.util.Base64.decodeBase64(cursor);
  }

  /**
   * A cursor that points to the position after the result entity. Set only when the `EntityResult`
   * is part of a `QueryResultBatch` message.
   * @see #encodeCursor()
   * @param cursor cursor or {@code null} for none
   */
  public EntityResult setCursor(java.lang.String cursor) {
    this.cursor = cursor;
    return this;
  }

  /**
   * A cursor that points to the position after the result entity. Set only when the `EntityResult`
   * is part of a `QueryResultBatch` message.
   * @see #setCursor()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public EntityResult encodeCursor(byte[] cursor) {
    this.cursor = com.google.api.client.util.Base64.encodeBase64URLSafeString(cursor);
    return this;
  }

  /**
   * The resulting entity.
   * @return value or {@code null} for none
   */
  public Entity getEntity() {
    return entity;
  }

  /**
   * The resulting entity.
   * @param entity entity or {@code null} for none
   */
  public EntityResult setEntity(Entity entity) {
    this.entity = entity;
    return this;
  }

  /**
   * The time at which the entity was last changed. This field is set for `FULL` entity results. If
   * this entity is missing, this field will not be set.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * The time at which the entity was last changed. This field is set for `FULL` entity results. If
   * this entity is missing, this field will not be set.
   * @param updateTime updateTime or {@code null} for none
   */
  public EntityResult setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * The version of the entity, a strictly positive number that monotonically increases with changes
   * to the entity. This field is set for `FULL` entity results. For missing entities in
   * `LookupResponse`, this is the version of the snapshot that was used to look up the entity, and
   * it is always set except for eventually consistent reads.
   * @return value or {@code null} for none
   */
  public java.lang.Long getVersion() {
    return version;
  }

  /**
   * The version of the entity, a strictly positive number that monotonically increases with changes
   * to the entity. This field is set for `FULL` entity results. For missing entities in
   * `LookupResponse`, this is the version of the snapshot that was used to look up the entity, and
   * it is always set except for eventually consistent reads.
   * @param version version or {@code null} for none
   */
  public EntityResult setVersion(java.lang.Long version) {
    this.version = version;
    return this;
  }

  @Override
  public EntityResult set(String fieldName, Object value) {
    return (EntityResult) super.set(fieldName, value);
  }

  @Override
  public EntityResult clone() {
    return (EntityResult) super.clone();
  }

}
