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

package com.google.api.services.policytroubleshooter.v1.model;

/**
 * Details about how a specific IAM Policy contributed to the access check.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Policy Troubleshooter API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudPolicytroubleshooterV1ExplainedPolicy extends com.google.api.client.json.GenericJson {

  /**
   * Indicates whether _this policy_ provides the specified permission to the specified principal
   * for the specified resource. This field does _not_ indicate whether the principal actually has
   * the permission for the resource. There might be another policy that overrides this policy. To
   * determine whether the principal actually has the permission, use the `access` field in the
   * TroubleshootIamPolicyResponse.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String access;

  /**
   * Details about how each binding in the policy affects the principal's ability, or inability, to
   * use the permission for the resource. If the sender of the request does not have access to the
   * policy, this field is omitted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudPolicytroubleshooterV1BindingExplanation> bindingExplanations;

  static {
    // hack to force ProGuard to consider GoogleCloudPolicytroubleshooterV1BindingExplanation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudPolicytroubleshooterV1BindingExplanation.class);
  }

  /**
   * The full resource name that identifies the resource. For example,
   * `//compute.googleapis.com/projects/my-project/zones/us-central1-a/instances/my-instance`. If
   * the sender of the request does not have access to the policy, this field is omitted. For
   * examples of full resource names for Google Cloud services, see
   * https://cloud.google.com/iam/help/troubleshooter/full-resource-names.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fullResourceName;

  /**
   * The IAM policy attached to the resource. If the sender of the request does not have access to
   * the policy, this field is empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleIamV1Policy policy;

  /**
   * The relevance of this policy to the overall determination in the TroubleshootIamPolicyResponse.
   * If the sender of the request does not have access to the policy, this field is omitted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String relevance;

  /**
   * Indicates whether _this policy_ provides the specified permission to the specified principal
   * for the specified resource. This field does _not_ indicate whether the principal actually has
   * the permission for the resource. There might be another policy that overrides this policy. To
   * determine whether the principal actually has the permission, use the `access` field in the
   * TroubleshootIamPolicyResponse.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccess() {
    return access;
  }

  /**
   * Indicates whether _this policy_ provides the specified permission to the specified principal
   * for the specified resource. This field does _not_ indicate whether the principal actually has
   * the permission for the resource. There might be another policy that overrides this policy. To
   * determine whether the principal actually has the permission, use the `access` field in the
   * TroubleshootIamPolicyResponse.
   * @param access access or {@code null} for none
   */
  public GoogleCloudPolicytroubleshooterV1ExplainedPolicy setAccess(java.lang.String access) {
    this.access = access;
    return this;
  }

  /**
   * Details about how each binding in the policy affects the principal's ability, or inability, to
   * use the permission for the resource. If the sender of the request does not have access to the
   * policy, this field is omitted.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudPolicytroubleshooterV1BindingExplanation> getBindingExplanations() {
    return bindingExplanations;
  }

  /**
   * Details about how each binding in the policy affects the principal's ability, or inability, to
   * use the permission for the resource. If the sender of the request does not have access to the
   * policy, this field is omitted.
   * @param bindingExplanations bindingExplanations or {@code null} for none
   */
  public GoogleCloudPolicytroubleshooterV1ExplainedPolicy setBindingExplanations(java.util.List<GoogleCloudPolicytroubleshooterV1BindingExplanation> bindingExplanations) {
    this.bindingExplanations = bindingExplanations;
    return this;
  }

  /**
   * The full resource name that identifies the resource. For example,
   * `//compute.googleapis.com/projects/my-project/zones/us-central1-a/instances/my-instance`. If
   * the sender of the request does not have access to the policy, this field is omitted. For
   * examples of full resource names for Google Cloud services, see
   * https://cloud.google.com/iam/help/troubleshooter/full-resource-names.
   * @return value or {@code null} for none
   */
  public java.lang.String getFullResourceName() {
    return fullResourceName;
  }

  /**
   * The full resource name that identifies the resource. For example,
   * `//compute.googleapis.com/projects/my-project/zones/us-central1-a/instances/my-instance`. If
   * the sender of the request does not have access to the policy, this field is omitted. For
   * examples of full resource names for Google Cloud services, see
   * https://cloud.google.com/iam/help/troubleshooter/full-resource-names.
   * @param fullResourceName fullResourceName or {@code null} for none
   */
  public GoogleCloudPolicytroubleshooterV1ExplainedPolicy setFullResourceName(java.lang.String fullResourceName) {
    this.fullResourceName = fullResourceName;
    return this;
  }

  /**
   * The IAM policy attached to the resource. If the sender of the request does not have access to
   * the policy, this field is empty.
   * @return value or {@code null} for none
   */
  public GoogleIamV1Policy getPolicy() {
    return policy;
  }

  /**
   * The IAM policy attached to the resource. If the sender of the request does not have access to
   * the policy, this field is empty.
   * @param policy policy or {@code null} for none
   */
  public GoogleCloudPolicytroubleshooterV1ExplainedPolicy setPolicy(GoogleIamV1Policy policy) {
    this.policy = policy;
    return this;
  }

  /**
   * The relevance of this policy to the overall determination in the TroubleshootIamPolicyResponse.
   * If the sender of the request does not have access to the policy, this field is omitted.
   * @return value or {@code null} for none
   */
  public java.lang.String getRelevance() {
    return relevance;
  }

  /**
   * The relevance of this policy to the overall determination in the TroubleshootIamPolicyResponse.
   * If the sender of the request does not have access to the policy, this field is omitted.
   * @param relevance relevance or {@code null} for none
   */
  public GoogleCloudPolicytroubleshooterV1ExplainedPolicy setRelevance(java.lang.String relevance) {
    this.relevance = relevance;
    return this;
  }

  @Override
  public GoogleCloudPolicytroubleshooterV1ExplainedPolicy set(String fieldName, Object value) {
    return (GoogleCloudPolicytroubleshooterV1ExplainedPolicy) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudPolicytroubleshooterV1ExplainedPolicy clone() {
    return (GoogleCloudPolicytroubleshooterV1ExplainedPolicy) super.clone();
  }

}
