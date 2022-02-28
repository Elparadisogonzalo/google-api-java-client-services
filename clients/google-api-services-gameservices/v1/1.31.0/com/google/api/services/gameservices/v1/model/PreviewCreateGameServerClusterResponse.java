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

package com.google.api.services.gameservices.v1.model;

/**
 * Response message for GameServerClustersService.PreviewCreateGameServerCluster.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Game Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PreviewCreateGameServerClusterResponse extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The state of the Kubernetes cluster in preview. This will be available if view is
   * set to FULL in the relevant list/get/preview request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private KubernetesClusterState clusterState;

  /**
   * The ETag of the game server cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The target state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TargetState targetState;

  /**
   * Output only. The state of the Kubernetes cluster in preview. This will be available if view is
   * set to FULL in the relevant list/get/preview request.
   * @return value or {@code null} for none
   */
  public KubernetesClusterState getClusterState() {
    return clusterState;
  }

  /**
   * Output only. The state of the Kubernetes cluster in preview. This will be available if view is
   * set to FULL in the relevant list/get/preview request.
   * @param clusterState clusterState or {@code null} for none
   */
  public PreviewCreateGameServerClusterResponse setClusterState(KubernetesClusterState clusterState) {
    this.clusterState = clusterState;
    return this;
  }

  /**
   * The ETag of the game server cluster.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * The ETag of the game server cluster.
   * @param etag etag or {@code null} for none
   */
  public PreviewCreateGameServerClusterResponse setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The target state.
   * @return value or {@code null} for none
   */
  public TargetState getTargetState() {
    return targetState;
  }

  /**
   * The target state.
   * @param targetState targetState or {@code null} for none
   */
  public PreviewCreateGameServerClusterResponse setTargetState(TargetState targetState) {
    this.targetState = targetState;
    return this;
  }

  @Override
  public PreviewCreateGameServerClusterResponse set(String fieldName, Object value) {
    return (PreviewCreateGameServerClusterResponse) super.set(fieldName, value);
  }

  @Override
  public PreviewCreateGameServerClusterResponse clone() {
    return (PreviewCreateGameServerClusterResponse) super.clone();
  }

}
