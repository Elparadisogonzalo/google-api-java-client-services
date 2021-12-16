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

package com.google.api.services.networkconnectivity.v1.model;

/**
 * RoutingVPC contains information about the VPC network that is associated with a hub's spokes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Connectivity API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RoutingVPC extends com.google.api.client.json.GenericJson {

  /**
   * Output only. If true, indicates that this VPC network is currently associated with spokes that
   * use the data transfer feature (spokes where the site_to_site_data_transfer field is set to
   * true). If you create new spokes that use data transfer, they must be associated with this VPC
   * network.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean requiredForNewSiteToSiteDataTransferSpokes;

  /**
   * The URI of the VPC network.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Output only. If true, indicates that this VPC network is currently associated with spokes that
   * use the data transfer feature (spokes where the site_to_site_data_transfer field is set to
   * true). If you create new spokes that use data transfer, they must be associated with this VPC
   * network.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRequiredForNewSiteToSiteDataTransferSpokes() {
    return requiredForNewSiteToSiteDataTransferSpokes;
  }

  /**
   * Output only. If true, indicates that this VPC network is currently associated with spokes that
   * use the data transfer feature (spokes where the site_to_site_data_transfer field is set to
   * true). If you create new spokes that use data transfer, they must be associated with this VPC
   * network.
   * @param requiredForNewSiteToSiteDataTransferSpokes requiredForNewSiteToSiteDataTransferSpokes or {@code null} for none
   */
  public RoutingVPC setRequiredForNewSiteToSiteDataTransferSpokes(java.lang.Boolean requiredForNewSiteToSiteDataTransferSpokes) {
    this.requiredForNewSiteToSiteDataTransferSpokes = requiredForNewSiteToSiteDataTransferSpokes;
    return this;
  }

  /**
   * The URI of the VPC network.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * The URI of the VPC network.
   * @param uri uri or {@code null} for none
   */
  public RoutingVPC setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public RoutingVPC set(String fieldName, Object value) {
    return (RoutingVPC) super.set(fieldName, value);
  }

  @Override
  public RoutingVPC clone() {
    return (RoutingVPC) super.clone();
  }

}
