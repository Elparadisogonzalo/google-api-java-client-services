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

package com.google.api.services.chromepolicy.v1.model;

/**
 * Request message for modifying multiple policy values for a specific target.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Chrome Policy API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleChromePolicyV1BatchModifyOrgUnitPoliciesRequest extends com.google.api.client.json.GenericJson {

  /**
   * List of policies to modify as defined by the `requests`. All requests in the list must follow
   * these restrictions: 1. All schemas in the list must have the same root namespace. 2. All
   * `policyTargetKey.targetResource` values must point to an org unit resource. 3. All
   * `policyTargetKey` values must have the same key names in the ` additionalTargetKeys`. This also
   * means if one of the targets has an empty `additionalTargetKeys` map, all of the targets must
   * have an empty `additionalTargetKeys` map. 4. No two modification requests can reference the
   * same `policySchema` + ` policyTargetKey` pair.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleChromePolicyV1ModifyOrgUnitPolicyRequest> requests;

  /**
   * List of policies to modify as defined by the `requests`. All requests in the list must follow
   * these restrictions: 1. All schemas in the list must have the same root namespace. 2. All
   * `policyTargetKey.targetResource` values must point to an org unit resource. 3. All
   * `policyTargetKey` values must have the same key names in the ` additionalTargetKeys`. This also
   * means if one of the targets has an empty `additionalTargetKeys` map, all of the targets must
   * have an empty `additionalTargetKeys` map. 4. No two modification requests can reference the
   * same `policySchema` + ` policyTargetKey` pair.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleChromePolicyV1ModifyOrgUnitPolicyRequest> getRequests() {
    return requests;
  }

  /**
   * List of policies to modify as defined by the `requests`. All requests in the list must follow
   * these restrictions: 1. All schemas in the list must have the same root namespace. 2. All
   * `policyTargetKey.targetResource` values must point to an org unit resource. 3. All
   * `policyTargetKey` values must have the same key names in the ` additionalTargetKeys`. This also
   * means if one of the targets has an empty `additionalTargetKeys` map, all of the targets must
   * have an empty `additionalTargetKeys` map. 4. No two modification requests can reference the
   * same `policySchema` + ` policyTargetKey` pair.
   * @param requests requests or {@code null} for none
   */
  public GoogleChromePolicyV1BatchModifyOrgUnitPoliciesRequest setRequests(java.util.List<GoogleChromePolicyV1ModifyOrgUnitPolicyRequest> requests) {
    this.requests = requests;
    return this;
  }

  @Override
  public GoogleChromePolicyV1BatchModifyOrgUnitPoliciesRequest set(String fieldName, Object value) {
    return (GoogleChromePolicyV1BatchModifyOrgUnitPoliciesRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleChromePolicyV1BatchModifyOrgUnitPoliciesRequest clone() {
    return (GoogleChromePolicyV1BatchModifyOrgUnitPoliciesRequest) super.clone();
  }

}
