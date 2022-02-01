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
 * Database instance operation errors list wrapper.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OperationErrors extends com.google.api.client.json.GenericJson {

  /**
   * The list of errors encountered while processing this operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OperationError> errors;

  static {
    // hack to force ProGuard to consider OperationError used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(OperationError.class);
  }

  /**
   * This is always `sql#operationErrors`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The list of errors encountered while processing this operation.
   * @return value or {@code null} for none
   */
  public java.util.List<OperationError> getErrors() {
    return errors;
  }

  /**
   * The list of errors encountered while processing this operation.
   * @param errors errors or {@code null} for none
   */
  public OperationErrors setErrors(java.util.List<OperationError> errors) {
    this.errors = errors;
    return this;
  }

  /**
   * This is always `sql#operationErrors`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always `sql#operationErrors`.
   * @param kind kind or {@code null} for none
   */
  public OperationErrors setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public OperationErrors set(String fieldName, Object value) {
    return (OperationErrors) super.set(fieldName, value);
  }

  @Override
  public OperationErrors clone() {
    return (OperationErrors) super.clone();
  }

}
