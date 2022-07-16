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

package com.google.api.services.networksecurity.v1beta1.model;

/**
 * Specification of the GRPC Endpoint.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Security API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudNetworksecurityV1beta1GrpcEndpoint extends com.google.api.client.json.GenericJson {

  /**
   * Required. The target URI of the gRPC endpoint. Only UDS path is supported, and should start
   * with "unix:".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetUri;

  /**
   * Required. The target URI of the gRPC endpoint. Only UDS path is supported, and should start
   * with "unix:".
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetUri() {
    return targetUri;
  }

  /**
   * Required. The target URI of the gRPC endpoint. Only UDS path is supported, and should start
   * with "unix:".
   * @param targetUri targetUri or {@code null} for none
   */
  public GoogleCloudNetworksecurityV1beta1GrpcEndpoint setTargetUri(java.lang.String targetUri) {
    this.targetUri = targetUri;
    return this;
  }

  @Override
  public GoogleCloudNetworksecurityV1beta1GrpcEndpoint set(String fieldName, Object value) {
    return (GoogleCloudNetworksecurityV1beta1GrpcEndpoint) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudNetworksecurityV1beta1GrpcEndpoint clone() {
    return (GoogleCloudNetworksecurityV1beta1GrpcEndpoint) super.clone();
  }

}
