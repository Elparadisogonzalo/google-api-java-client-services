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

package com.google.api.services.vmmigration.v1alpha1.model;

/**
 * NetworkInterface represents a NIC of a VM.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the VM Migration API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NetworkInterface extends com.google.api.client.json.GenericJson {

  /**
   * The external IP to define in the NIC.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String externalIp;

  /**
   * The internal IP to define in the NIC. The formats accepted are: `ephemeral` \ ipv4 address \ a
   * named address resource full path.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String internalIp;

  /**
   * The network to connect the NIC to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * The subnetwork to connect the NIC to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subnetwork;

  /**
   * The external IP to define in the NIC.
   * @return value or {@code null} for none
   */
  public java.lang.String getExternalIp() {
    return externalIp;
  }

  /**
   * The external IP to define in the NIC.
   * @param externalIp externalIp or {@code null} for none
   */
  public NetworkInterface setExternalIp(java.lang.String externalIp) {
    this.externalIp = externalIp;
    return this;
  }

  /**
   * The internal IP to define in the NIC. The formats accepted are: `ephemeral` \ ipv4 address \ a
   * named address resource full path.
   * @return value or {@code null} for none
   */
  public java.lang.String getInternalIp() {
    return internalIp;
  }

  /**
   * The internal IP to define in the NIC. The formats accepted are: `ephemeral` \ ipv4 address \ a
   * named address resource full path.
   * @param internalIp internalIp or {@code null} for none
   */
  public NetworkInterface setInternalIp(java.lang.String internalIp) {
    this.internalIp = internalIp;
    return this;
  }

  /**
   * The network to connect the NIC to.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * The network to connect the NIC to.
   * @param network network or {@code null} for none
   */
  public NetworkInterface setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * The subnetwork to connect the NIC to.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubnetwork() {
    return subnetwork;
  }

  /**
   * The subnetwork to connect the NIC to.
   * @param subnetwork subnetwork or {@code null} for none
   */
  public NetworkInterface setSubnetwork(java.lang.String subnetwork) {
    this.subnetwork = subnetwork;
    return this;
  }

  @Override
  public NetworkInterface set(String fieldName, Object value) {
    return (NetworkInterface) super.set(fieldName, value);
  }

  @Override
  public NetworkInterface clone() {
    return (NetworkInterface) super.clone();
  }

}
