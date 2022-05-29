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

package com.google.api.services.certificatemanager.v1.model;

/**
 * ResourcesCount represents the resource that stores aggregated project's info in the given
 * location, e.g.: total number of certificates assigned to the project.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Certificate Manager API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResourcesCount extends com.google.api.client.json.GenericJson {

  /**
   * The count of certificates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger certificates;

  /**
   * Required. Input only. The time of the computation. The field is input only, used in Create and
   * Update calls. For Update call, new values of selected resources are set if their compute_time
   * is younger than the persisted ones, e.g.: If you support 3 types of resources: A, B and C, and
   * you have: 'A' resource count computed at timestamp = 3 'B' resource count computed at timestamp
   * = 10 'C' resource count computed at timestamp = 5 And you're going to update all of them with
   * compute_time = 8, only 'A' and 'C' will be updated, as 'B' already has fresher data. For Get
   * call a ResourcesCount instance contains the freshest values for every type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String computeTime;

  /**
   * The singleton resource of the resources count. Must be in the format
   * `projects/locations/resourcesCounts/single`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The count of certificates.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getCertificates() {
    return certificates;
  }

  /**
   * The count of certificates.
   * @param certificates certificates or {@code null} for none
   */
  public ResourcesCount setCertificates(java.math.BigInteger certificates) {
    this.certificates = certificates;
    return this;
  }

  /**
   * Required. Input only. The time of the computation. The field is input only, used in Create and
   * Update calls. For Update call, new values of selected resources are set if their compute_time
   * is younger than the persisted ones, e.g.: If you support 3 types of resources: A, B and C, and
   * you have: 'A' resource count computed at timestamp = 3 'B' resource count computed at timestamp
   * = 10 'C' resource count computed at timestamp = 5 And you're going to update all of them with
   * compute_time = 8, only 'A' and 'C' will be updated, as 'B' already has fresher data. For Get
   * call a ResourcesCount instance contains the freshest values for every type.
   * @return value or {@code null} for none
   */
  public String getComputeTime() {
    return computeTime;
  }

  /**
   * Required. Input only. The time of the computation. The field is input only, used in Create and
   * Update calls. For Update call, new values of selected resources are set if their compute_time
   * is younger than the persisted ones, e.g.: If you support 3 types of resources: A, B and C, and
   * you have: 'A' resource count computed at timestamp = 3 'B' resource count computed at timestamp
   * = 10 'C' resource count computed at timestamp = 5 And you're going to update all of them with
   * compute_time = 8, only 'A' and 'C' will be updated, as 'B' already has fresher data. For Get
   * call a ResourcesCount instance contains the freshest values for every type.
   * @param computeTime computeTime or {@code null} for none
   */
  public ResourcesCount setComputeTime(String computeTime) {
    this.computeTime = computeTime;
    return this;
  }

  /**
   * The singleton resource of the resources count. Must be in the format
   * `projects/locations/resourcesCounts/single`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The singleton resource of the resources count. Must be in the format
   * `projects/locations/resourcesCounts/single`.
   * @param name name or {@code null} for none
   */
  public ResourcesCount setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public ResourcesCount set(String fieldName, Object value) {
    return (ResourcesCount) super.set(fieldName, value);
  }

  @Override
  public ResourcesCount clone() {
    return (ResourcesCount) super.clone();
  }

}
