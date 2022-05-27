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

package com.google.api.services.monitoring.v3.model;

/**
 * GKE Service. The "service" here represents a Kubernetes service object
 * (https://kubernetes.io/docs/concepts/services-networking/service). The field names correspond to
 * the resource labels on k8s_service monitored resources
 * (https://cloud.google.com/monitoring/api/resources#tag_k8s_service).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GkeService extends com.google.api.client.json.GenericJson {

  /**
   * The name of the parent cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clusterName;

  /**
   * The location of the parent cluster. This may be a zone or region.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * The name of the parent namespace.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String namespaceName;

  /**
   * Output only. The project this resource lives in. For legacy services migrated from the Custom
   * type, this may be a distinct project from the one parenting the service itself.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * The name of this service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceName;

  /**
   * The name of the parent cluster.
   * @return value or {@code null} for none
   */
  public java.lang.String getClusterName() {
    return clusterName;
  }

  /**
   * The name of the parent cluster.
   * @param clusterName clusterName or {@code null} for none
   */
  public GkeService setClusterName(java.lang.String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  /**
   * The location of the parent cluster. This may be a zone or region.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * The location of the parent cluster. This may be a zone or region.
   * @param location location or {@code null} for none
   */
  public GkeService setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * The name of the parent namespace.
   * @return value or {@code null} for none
   */
  public java.lang.String getNamespaceName() {
    return namespaceName;
  }

  /**
   * The name of the parent namespace.
   * @param namespaceName namespaceName or {@code null} for none
   */
  public GkeService setNamespaceName(java.lang.String namespaceName) {
    this.namespaceName = namespaceName;
    return this;
  }

  /**
   * Output only. The project this resource lives in. For legacy services migrated from the Custom
   * type, this may be a distinct project from the one parenting the service itself.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Output only. The project this resource lives in. For legacy services migrated from the Custom
   * type, this may be a distinct project from the one parenting the service itself.
   * @param projectId projectId or {@code null} for none
   */
  public GkeService setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The name of this service.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceName() {
    return serviceName;
  }

  /**
   * The name of this service.
   * @param serviceName serviceName or {@code null} for none
   */
  public GkeService setServiceName(java.lang.String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  @Override
  public GkeService set(String fieldName, Object value) {
    return (GkeService) super.set(fieldName, value);
  }

  @Override
  public GkeService clone() {
    return (GkeService) super.clone();
  }

}
