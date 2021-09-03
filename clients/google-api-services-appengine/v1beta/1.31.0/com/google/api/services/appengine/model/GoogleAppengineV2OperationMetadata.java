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

package com.google.api.services.appengine.model;

/**
 * Represents the metadata of the long-running operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppengineV2OperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Output only. API version used to start the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String apiVersion;

  /**
   * Output only. The time the operation was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The time the operation finished running.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Output only. Ephemeral message that may change every time the operation is polled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ephemeralMessage;

  /**
   * Output only. Identifies whether the user has requested cancellation of the operation.
   * Operations that have been cancelled successfully have Operation.error value with a
   * google.rpc.Status.code of 1, corresponding to Code.CANCELLED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean requestedCancellation;

  /**
   * Output only. Human-readable status of the operation, if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String statusMessage;

  /**
   * Output only. Server-defined resource path for the target of the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String target;

  /**
   * Output only. Name of the verb executed by the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String verb;

  /**
   * Output only. Durable messages that persist on every operation poll.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> warning;

  /**
   * Output only. API version used to start the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getApiVersion() {
    return apiVersion;
  }

  /**
   * Output only. API version used to start the operation.
   * @param apiVersion apiVersion or {@code null} for none
   */
  public GoogleAppengineV2OperationMetadata setApiVersion(java.lang.String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Output only. The time the operation was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time the operation was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleAppengineV2OperationMetadata setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The time the operation finished running.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Output only. The time the operation finished running.
   * @param endTime endTime or {@code null} for none
   */
  public GoogleAppengineV2OperationMetadata setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Output only. Ephemeral message that may change every time the operation is polled.
   * @return value or {@code null} for none
   */
  public java.lang.String getEphemeralMessage() {
    return ephemeralMessage;
  }

  /**
   * Output only. Ephemeral message that may change every time the operation is polled.
   * @param ephemeralMessage ephemeralMessage or {@code null} for none
   */
  public GoogleAppengineV2OperationMetadata setEphemeralMessage(java.lang.String ephemeralMessage) {
    this.ephemeralMessage = ephemeralMessage;
    return this;
  }

  /**
   * Output only. Identifies whether the user has requested cancellation of the operation.
   * Operations that have been cancelled successfully have Operation.error value with a
   * google.rpc.Status.code of 1, corresponding to Code.CANCELLED.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRequestedCancellation() {
    return requestedCancellation;
  }

  /**
   * Output only. Identifies whether the user has requested cancellation of the operation.
   * Operations that have been cancelled successfully have Operation.error value with a
   * google.rpc.Status.code of 1, corresponding to Code.CANCELLED.
   * @param requestedCancellation requestedCancellation or {@code null} for none
   */
  public GoogleAppengineV2OperationMetadata setRequestedCancellation(java.lang.Boolean requestedCancellation) {
    this.requestedCancellation = requestedCancellation;
    return this;
  }

  /**
   * Output only. Human-readable status of the operation, if any.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatusMessage() {
    return statusMessage;
  }

  /**
   * Output only. Human-readable status of the operation, if any.
   * @param statusMessage statusMessage or {@code null} for none
   */
  public GoogleAppengineV2OperationMetadata setStatusMessage(java.lang.String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  /**
   * Output only. Server-defined resource path for the target of the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getTarget() {
    return target;
  }

  /**
   * Output only. Server-defined resource path for the target of the operation.
   * @param target target or {@code null} for none
   */
  public GoogleAppengineV2OperationMetadata setTarget(java.lang.String target) {
    this.target = target;
    return this;
  }

  /**
   * Output only. Name of the verb executed by the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getVerb() {
    return verb;
  }

  /**
   * Output only. Name of the verb executed by the operation.
   * @param verb verb or {@code null} for none
   */
  public GoogleAppengineV2OperationMetadata setVerb(java.lang.String verb) {
    this.verb = verb;
    return this;
  }

  /**
   * Output only. Durable messages that persist on every operation poll.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getWarning() {
    return warning;
  }

  /**
   * Output only. Durable messages that persist on every operation poll.
   * @param warning warning or {@code null} for none
   */
  public GoogleAppengineV2OperationMetadata setWarning(java.util.List<java.lang.String> warning) {
    this.warning = warning;
    return this;
  }

  @Override
  public GoogleAppengineV2OperationMetadata set(String fieldName, Object value) {
    return (GoogleAppengineV2OperationMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleAppengineV2OperationMetadata clone() {
    return (GoogleAppengineV2OperationMetadata) super.clone();
  }

}
