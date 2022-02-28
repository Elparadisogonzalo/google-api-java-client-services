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

package com.google.api.services.gameservices.v1beta.model;

/**
 * A reference to a GKE cluster.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Game Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GkeClusterReference extends com.google.api.client.json.GenericJson {

  /**
   * The full or partial name of a GKE cluster, using one of the following forms: *
   * `projects/{project}/locations/{locationId}/clusters/{cluster}` *
   * `locations/{locationId}/clusters/{cluster}` * `{cluster}` If project and location are not
   * specified, the project and location of the GameServerCluster resource are used to generate the
   * full name of the GKE cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cluster;

  /**
   * The full or partial name of a GKE cluster, using one of the following forms: *
   * `projects/{project}/locations/{locationId}/clusters/{cluster}` *
   * `locations/{locationId}/clusters/{cluster}` * `{cluster}` If project and location are not
   * specified, the project and location of the GameServerCluster resource are used to generate the
   * full name of the GKE cluster.
   * @return value or {@code null} for none
   */
  public java.lang.String getCluster() {
    return cluster;
  }

  /**
   * The full or partial name of a GKE cluster, using one of the following forms: *
   * `projects/{project}/locations/{locationId}/clusters/{cluster}` *
   * `locations/{locationId}/clusters/{cluster}` * `{cluster}` If project and location are not
   * specified, the project and location of the GameServerCluster resource are used to generate the
   * full name of the GKE cluster.
   * @param cluster cluster or {@code null} for none
   */
  public GkeClusterReference setCluster(java.lang.String cluster) {
    this.cluster = cluster;
    return this;
  }

  @Override
  public GkeClusterReference set(String fieldName, Object value) {
    return (GkeClusterReference) super.set(fieldName, value);
  }

  @Override
  public GkeClusterReference clone() {
    return (GkeClusterReference) super.clone();
  }

}
