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

package com.google.api.services.file.v1.model;

/**
 * Network configuration for the instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Filestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NetworkConfig extends com.google.api.client.json.GenericJson {

  /**
   * Output only. IPv4 addresses in the format `{octet1}.{octet2}.{octet3}.{octet4}` or IPv6
   * addresses in the format
   * `{block1}:{block2}:{block3}:{block4}:{block5}:{block6}:{block7}:{block8}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> ipAddresses;

  /**
   * Internet protocol versions for which the instance has IP addresses assigned. For this version,
   * only MODE_IPV4 is supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> modes;

  /**
   * The name of the Google Compute Engine [VPC network](https://cloud.google.com/vpc/docs/vpc) to
   * which the instance is connected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * A /29 CIDR block in one of the [internal IP address
   * ranges](https://www.arin.net/reference/research/statistics/address_filters/) that identifies
   * the range of IP addresses reserved for this instance. For example, 10.0.0.0/29 or
   * 192.168.0.0/29. The range you specify can't overlap with either existing subnets or assigned IP
   * address ranges for other Cloud Filestore instances in the selected VPC network.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reservedIpRange;

  /**
   * Output only. IPv4 addresses in the format `{octet1}.{octet2}.{octet3}.{octet4}` or IPv6
   * addresses in the format
   * `{block1}:{block2}:{block3}:{block4}:{block5}:{block6}:{block7}:{block8}`.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIpAddresses() {
    return ipAddresses;
  }

  /**
   * Output only. IPv4 addresses in the format `{octet1}.{octet2}.{octet3}.{octet4}` or IPv6
   * addresses in the format
   * `{block1}:{block2}:{block3}:{block4}:{block5}:{block6}:{block7}:{block8}`.
   * @param ipAddresses ipAddresses or {@code null} for none
   */
  public NetworkConfig setIpAddresses(java.util.List<java.lang.String> ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }

  /**
   * Internet protocol versions for which the instance has IP addresses assigned. For this version,
   * only MODE_IPV4 is supported.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getModes() {
    return modes;
  }

  /**
   * Internet protocol versions for which the instance has IP addresses assigned. For this version,
   * only MODE_IPV4 is supported.
   * @param modes modes or {@code null} for none
   */
  public NetworkConfig setModes(java.util.List<java.lang.String> modes) {
    this.modes = modes;
    return this;
  }

  /**
   * The name of the Google Compute Engine [VPC network](https://cloud.google.com/vpc/docs/vpc) to
   * which the instance is connected.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * The name of the Google Compute Engine [VPC network](https://cloud.google.com/vpc/docs/vpc) to
   * which the instance is connected.
   * @param network network or {@code null} for none
   */
  public NetworkConfig setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * A /29 CIDR block in one of the [internal IP address
   * ranges](https://www.arin.net/reference/research/statistics/address_filters/) that identifies
   * the range of IP addresses reserved for this instance. For example, 10.0.0.0/29 or
   * 192.168.0.0/29. The range you specify can't overlap with either existing subnets or assigned IP
   * address ranges for other Cloud Filestore instances in the selected VPC network.
   * @return value or {@code null} for none
   */
  public java.lang.String getReservedIpRange() {
    return reservedIpRange;
  }

  /**
   * A /29 CIDR block in one of the [internal IP address
   * ranges](https://www.arin.net/reference/research/statistics/address_filters/) that identifies
   * the range of IP addresses reserved for this instance. For example, 10.0.0.0/29 or
   * 192.168.0.0/29. The range you specify can't overlap with either existing subnets or assigned IP
   * address ranges for other Cloud Filestore instances in the selected VPC network.
   * @param reservedIpRange reservedIpRange or {@code null} for none
   */
  public NetworkConfig setReservedIpRange(java.lang.String reservedIpRange) {
    this.reservedIpRange = reservedIpRange;
    return this;
  }

  @Override
  public NetworkConfig set(String fieldName, Object value) {
    return (NetworkConfig) super.set(fieldName, value);
  }

  @Override
  public NetworkConfig clone() {
    return (NetworkConfig) super.clone();
  }

}
