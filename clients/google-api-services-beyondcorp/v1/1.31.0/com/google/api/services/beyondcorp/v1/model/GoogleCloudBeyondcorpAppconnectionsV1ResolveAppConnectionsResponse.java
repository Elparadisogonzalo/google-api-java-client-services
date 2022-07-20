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

package com.google.api.services.beyondcorp.v1.model;

/**
 * Response message for BeyondCorp.ResolveAppConnections.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BeyondCorp API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudBeyondcorpAppconnectionsV1ResolveAppConnectionsResponse extends com.google.api.client.json.GenericJson {

  /**
   * A list of BeyondCorp AppConnections with details in the project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudBeyondcorpAppconnectionsV1ResolveAppConnectionsResponseAppConnectionDetails> appConnectionDetails;

  /**
   * A token to retrieve the next page of results, or empty if there are no more results in the
   * list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * A list of locations that could not be reached.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> unreachable;

  /**
   * A list of BeyondCorp AppConnections with details in the project.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudBeyondcorpAppconnectionsV1ResolveAppConnectionsResponseAppConnectionDetails> getAppConnectionDetails() {
    return appConnectionDetails;
  }

  /**
   * A list of BeyondCorp AppConnections with details in the project.
   * @param appConnectionDetails appConnectionDetails or {@code null} for none
   */
  public GoogleCloudBeyondcorpAppconnectionsV1ResolveAppConnectionsResponse setAppConnectionDetails(java.util.List<GoogleCloudBeyondcorpAppconnectionsV1ResolveAppConnectionsResponseAppConnectionDetails> appConnectionDetails) {
    this.appConnectionDetails = appConnectionDetails;
    return this;
  }

  /**
   * A token to retrieve the next page of results, or empty if there are no more results in the
   * list.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token to retrieve the next page of results, or empty if there are no more results in the
   * list.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudBeyondcorpAppconnectionsV1ResolveAppConnectionsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * A list of locations that could not be reached.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUnreachable() {
    return unreachable;
  }

  /**
   * A list of locations that could not be reached.
   * @param unreachable unreachable or {@code null} for none
   */
  public GoogleCloudBeyondcorpAppconnectionsV1ResolveAppConnectionsResponse setUnreachable(java.util.List<java.lang.String> unreachable) {
    this.unreachable = unreachable;
    return this;
  }

  @Override
  public GoogleCloudBeyondcorpAppconnectionsV1ResolveAppConnectionsResponse set(String fieldName, Object value) {
    return (GoogleCloudBeyondcorpAppconnectionsV1ResolveAppConnectionsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudBeyondcorpAppconnectionsV1ResolveAppConnectionsResponse clone() {
    return (GoogleCloudBeyondcorpAppconnectionsV1ResolveAppConnectionsResponse) super.clone();
  }

}
