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

package com.google.api.services.compute.model;

/**
 * Model definition for InstanceConsumptionInfo.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstanceConsumptionInfo extends com.google.api.client.json.GenericJson {

  /**
   * The number of virtual CPUs that are available to the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer guestCpus;

  /**
   * The amount of local SSD storage available to the instance, defined in GiB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer localSsdGb;

  /**
   * The amount of physical memory available to the instance, defined in MiB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer memoryMb;

  /**
   * The minimal guaranteed number of virtual CPUs that are reserved.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minNodeCpus;

  /**
   * The number of virtual CPUs that are available to the instance.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getGuestCpus() {
    return guestCpus;
  }

  /**
   * The number of virtual CPUs that are available to the instance.
   * @param guestCpus guestCpus or {@code null} for none
   */
  public InstanceConsumptionInfo setGuestCpus(java.lang.Integer guestCpus) {
    this.guestCpus = guestCpus;
    return this;
  }

  /**
   * The amount of local SSD storage available to the instance, defined in GiB.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLocalSsdGb() {
    return localSsdGb;
  }

  /**
   * The amount of local SSD storage available to the instance, defined in GiB.
   * @param localSsdGb localSsdGb or {@code null} for none
   */
  public InstanceConsumptionInfo setLocalSsdGb(java.lang.Integer localSsdGb) {
    this.localSsdGb = localSsdGb;
    return this;
  }

  /**
   * The amount of physical memory available to the instance, defined in MiB.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMemoryMb() {
    return memoryMb;
  }

  /**
   * The amount of physical memory available to the instance, defined in MiB.
   * @param memoryMb memoryMb or {@code null} for none
   */
  public InstanceConsumptionInfo setMemoryMb(java.lang.Integer memoryMb) {
    this.memoryMb = memoryMb;
    return this;
  }

  /**
   * The minimal guaranteed number of virtual CPUs that are reserved.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinNodeCpus() {
    return minNodeCpus;
  }

  /**
   * The minimal guaranteed number of virtual CPUs that are reserved.
   * @param minNodeCpus minNodeCpus or {@code null} for none
   */
  public InstanceConsumptionInfo setMinNodeCpus(java.lang.Integer minNodeCpus) {
    this.minNodeCpus = minNodeCpus;
    return this;
  }

  @Override
  public InstanceConsumptionInfo set(String fieldName, Object value) {
    return (InstanceConsumptionInfo) super.set(fieldName, value);
  }

  @Override
  public InstanceConsumptionInfo clone() {
    return (InstanceConsumptionInfo) super.clone();
  }

}
