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

package com.google.api.services.dataproc.model;

/**
 * Describes an autoscaling policy for Dataproc cluster autoscaler.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AutoscalingPolicy extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BasicAutoscalingAlgorithm basicAlgorithm;

  /**
   * Required. The policy id.The id must contain only letters (a-z, A-Z), numbers (0-9), underscores
   * (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between 3
   * and 50 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Optional. The labels to associate with this autoscaling policy. Label keys must contain 1 to 63
   * characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values
   * may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035
   * (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with an
   * autoscaling policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. The "resource name" of the autoscaling policy, as described in
   * https://cloud.google.com/apis/design/resource_names. For projects.regions.autoscalingPolicies,
   * the resource name of the policy has the following format:
   * projects/{project_id}/regions/{region}/autoscalingPolicies/{policy_id} For
   * projects.locations.autoscalingPolicies, the resource name of the policy has the following
   * format: projects/{project_id}/locations/{location}/autoscalingPolicies/{policy_id}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. Describes how the autoscaler will operate for secondary workers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InstanceGroupAutoscalingPolicyConfig secondaryWorkerConfig;

  /**
   * Required. Describes how the autoscaler will operate for primary workers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InstanceGroupAutoscalingPolicyConfig workerConfig;

  /**
   * @return value or {@code null} for none
   */
  public BasicAutoscalingAlgorithm getBasicAlgorithm() {
    return basicAlgorithm;
  }

  /**
   * @param basicAlgorithm basicAlgorithm or {@code null} for none
   */
  public AutoscalingPolicy setBasicAlgorithm(BasicAutoscalingAlgorithm basicAlgorithm) {
    this.basicAlgorithm = basicAlgorithm;
    return this;
  }

  /**
   * Required. The policy id.The id must contain only letters (a-z, A-Z), numbers (0-9), underscores
   * (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between 3
   * and 50 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Required. The policy id.The id must contain only letters (a-z, A-Z), numbers (0-9), underscores
   * (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between 3
   * and 50 characters.
   * @param id id or {@code null} for none
   */
  public AutoscalingPolicy setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Optional. The labels to associate with this autoscaling policy. Label keys must contain 1 to 63
   * characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values
   * may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035
   * (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with an
   * autoscaling policy.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. The labels to associate with this autoscaling policy. Label keys must contain 1 to 63
   * characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values
   * may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035
   * (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with an
   * autoscaling policy.
   * @param labels labels or {@code null} for none
   */
  public AutoscalingPolicy setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. The "resource name" of the autoscaling policy, as described in
   * https://cloud.google.com/apis/design/resource_names. For projects.regions.autoscalingPolicies,
   * the resource name of the policy has the following format:
   * projects/{project_id}/regions/{region}/autoscalingPolicies/{policy_id} For
   * projects.locations.autoscalingPolicies, the resource name of the policy has the following
   * format: projects/{project_id}/locations/{location}/autoscalingPolicies/{policy_id}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The "resource name" of the autoscaling policy, as described in
   * https://cloud.google.com/apis/design/resource_names. For projects.regions.autoscalingPolicies,
   * the resource name of the policy has the following format:
   * projects/{project_id}/regions/{region}/autoscalingPolicies/{policy_id} For
   * projects.locations.autoscalingPolicies, the resource name of the policy has the following
   * format: projects/{project_id}/locations/{location}/autoscalingPolicies/{policy_id}
   * @param name name or {@code null} for none
   */
  public AutoscalingPolicy setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. Describes how the autoscaler will operate for secondary workers.
   * @return value or {@code null} for none
   */
  public InstanceGroupAutoscalingPolicyConfig getSecondaryWorkerConfig() {
    return secondaryWorkerConfig;
  }

  /**
   * Optional. Describes how the autoscaler will operate for secondary workers.
   * @param secondaryWorkerConfig secondaryWorkerConfig or {@code null} for none
   */
  public AutoscalingPolicy setSecondaryWorkerConfig(InstanceGroupAutoscalingPolicyConfig secondaryWorkerConfig) {
    this.secondaryWorkerConfig = secondaryWorkerConfig;
    return this;
  }

  /**
   * Required. Describes how the autoscaler will operate for primary workers.
   * @return value or {@code null} for none
   */
  public InstanceGroupAutoscalingPolicyConfig getWorkerConfig() {
    return workerConfig;
  }

  /**
   * Required. Describes how the autoscaler will operate for primary workers.
   * @param workerConfig workerConfig or {@code null} for none
   */
  public AutoscalingPolicy setWorkerConfig(InstanceGroupAutoscalingPolicyConfig workerConfig) {
    this.workerConfig = workerConfig;
    return this;
  }

  @Override
  public AutoscalingPolicy set(String fieldName, Object value) {
    return (AutoscalingPolicy) super.set(fieldName, value);
  }

  @Override
  public AutoscalingPolicy clone() {
    return (AutoscalingPolicy) super.clone();
  }

}
