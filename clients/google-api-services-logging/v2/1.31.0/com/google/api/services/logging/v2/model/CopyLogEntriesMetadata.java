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

package com.google.api.services.logging.v2.model;

/**
 * Metadata for CopyLogEntries long running operations.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Logging API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CopyLogEntriesMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Identifies whether the user has requested cancellation of the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean cancellationRequested;

  /**
   * The end time of an operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Estimated progress of the operation (0 - 100%).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer progress;

  /**
   * CopyLogEntries RPC request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CopyLogEntriesRequest request;

  /**
   * The create time of an operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * State of an operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The IAM identity of a service account that must be granted access to the destination. If the
   * service account is not granted permission to the destination within an hour, the operation will
   * be cancelled. Example: "serviceAccount:foo@bar.com"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String writerIdentity;

  /**
   * Identifies whether the user has requested cancellation of the operation.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCancellationRequested() {
    return cancellationRequested;
  }

  /**
   * Identifies whether the user has requested cancellation of the operation.
   * @param cancellationRequested cancellationRequested or {@code null} for none
   */
  public CopyLogEntriesMetadata setCancellationRequested(java.lang.Boolean cancellationRequested) {
    this.cancellationRequested = cancellationRequested;
    return this;
  }

  /**
   * The end time of an operation.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * The end time of an operation.
   * @param endTime endTime or {@code null} for none
   */
  public CopyLogEntriesMetadata setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Estimated progress of the operation (0 - 100%).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getProgress() {
    return progress;
  }

  /**
   * Estimated progress of the operation (0 - 100%).
   * @param progress progress or {@code null} for none
   */
  public CopyLogEntriesMetadata setProgress(java.lang.Integer progress) {
    this.progress = progress;
    return this;
  }

  /**
   * CopyLogEntries RPC request.
   * @return value or {@code null} for none
   */
  public CopyLogEntriesRequest getRequest() {
    return request;
  }

  /**
   * CopyLogEntries RPC request.
   * @param request request or {@code null} for none
   */
  public CopyLogEntriesMetadata setRequest(CopyLogEntriesRequest request) {
    this.request = request;
    return this;
  }

  /**
   * The create time of an operation.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * The create time of an operation.
   * @param startTime startTime or {@code null} for none
   */
  public CopyLogEntriesMetadata setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * State of an operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * State of an operation.
   * @param state state or {@code null} for none
   */
  public CopyLogEntriesMetadata setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * The IAM identity of a service account that must be granted access to the destination. If the
   * service account is not granted permission to the destination within an hour, the operation will
   * be cancelled. Example: "serviceAccount:foo@bar.com"
   * @return value or {@code null} for none
   */
  public java.lang.String getWriterIdentity() {
    return writerIdentity;
  }

  /**
   * The IAM identity of a service account that must be granted access to the destination. If the
   * service account is not granted permission to the destination within an hour, the operation will
   * be cancelled. Example: "serviceAccount:foo@bar.com"
   * @param writerIdentity writerIdentity or {@code null} for none
   */
  public CopyLogEntriesMetadata setWriterIdentity(java.lang.String writerIdentity) {
    this.writerIdentity = writerIdentity;
    return this;
  }

  @Override
  public CopyLogEntriesMetadata set(String fieldName, Object value) {
    return (CopyLogEntriesMetadata) super.set(fieldName, value);
  }

  @Override
  public CopyLogEntriesMetadata clone() {
    return (CopyLogEntriesMetadata) super.clone();
  }

}
