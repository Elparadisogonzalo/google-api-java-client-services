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
 * Model definition for RouterStatusBgpPeerStatus.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RouterStatusBgpPeerStatus extends com.google.api.client.json.GenericJson {

  /**
   * Routes that were advertised to the remote BGP peer
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Route> advertisedRoutes;

  static {
    // hack to force ProGuard to consider Route used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Route.class);
  }

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BfdStatus bfdStatus;

  /**
   * Enable IPv6 traffic over BGP Peer. If not specified, it is disabled by default.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableIpv6;

  /**
   * IP address of the local BGP interface.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipAddress;

  /**
   * IPv6 address of the local BGP interface.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipv6NexthopAddress;

  /**
   * URL of the VPN tunnel that this BGP peer controls.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String linkedVpnTunnel;

  /**
   * Informs whether MD5 authentication is enabled on this BGP peer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean md5AuthEnabled;

  /**
   * Name of this BGP peer. Unique within the Routers resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Number of routes learned from the remote BGP Peer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long numLearnedRoutes;

  /**
   * IP address of the remote BGP interface.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String peerIpAddress;

  /**
   * IPv6 address of the remote BGP interface.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String peerIpv6NexthopAddress;

  /**
   * [Output only] URI of the VM instance that is used as third-party router appliances such as Next
   * Gen Firewalls, Virtual Routers, or Router Appliances. The VM instance is the peer side of the
   * BGP session.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String routerApplianceInstance;

  /**
   * BGP state as specified in RFC1771.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Status of the BGP peer: {UP, DOWN}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Indicates why particular status was returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String statusReason;

  /**
   * Time this session has been up. Format: 14 years, 51 weeks, 6 days, 23 hours, 59 minutes, 59
   * seconds
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uptime;

  /**
   * Time this session has been up, in seconds. Format: 145
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uptimeSeconds;

  /**
   * Routes that were advertised to the remote BGP peer
   * @return value or {@code null} for none
   */
  public java.util.List<Route> getAdvertisedRoutes() {
    return advertisedRoutes;
  }

  /**
   * Routes that were advertised to the remote BGP peer
   * @param advertisedRoutes advertisedRoutes or {@code null} for none
   */
  public RouterStatusBgpPeerStatus setAdvertisedRoutes(java.util.List<Route> advertisedRoutes) {
    this.advertisedRoutes = advertisedRoutes;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public BfdStatus getBfdStatus() {
    return bfdStatus;
  }

  /**
   * @param bfdStatus bfdStatus or {@code null} for none
   */
  public RouterStatusBgpPeerStatus setBfdStatus(BfdStatus bfdStatus) {
    this.bfdStatus = bfdStatus;
    return this;
  }

  /**
   * Enable IPv6 traffic over BGP Peer. If not specified, it is disabled by default.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableIpv6() {
    return enableIpv6;
  }

  /**
   * Enable IPv6 traffic over BGP Peer. If not specified, it is disabled by default.
   * @param enableIpv6 enableIpv6 or {@code null} for none
   */
  public RouterStatusBgpPeerStatus setEnableIpv6(java.lang.Boolean enableIpv6) {
    this.enableIpv6 = enableIpv6;
    return this;
  }

  /**
   * IP address of the local BGP interface.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpAddress() {
    return ipAddress;
  }

  /**
   * IP address of the local BGP interface.
   * @param ipAddress ipAddress or {@code null} for none
   */
  public RouterStatusBgpPeerStatus setIpAddress(java.lang.String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * IPv6 address of the local BGP interface.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpv6NexthopAddress() {
    return ipv6NexthopAddress;
  }

  /**
   * IPv6 address of the local BGP interface.
   * @param ipv6NexthopAddress ipv6NexthopAddress or {@code null} for none
   */
  public RouterStatusBgpPeerStatus setIpv6NexthopAddress(java.lang.String ipv6NexthopAddress) {
    this.ipv6NexthopAddress = ipv6NexthopAddress;
    return this;
  }

  /**
   * URL of the VPN tunnel that this BGP peer controls.
   * @return value or {@code null} for none
   */
  public java.lang.String getLinkedVpnTunnel() {
    return linkedVpnTunnel;
  }

  /**
   * URL of the VPN tunnel that this BGP peer controls.
   * @param linkedVpnTunnel linkedVpnTunnel or {@code null} for none
   */
  public RouterStatusBgpPeerStatus setLinkedVpnTunnel(java.lang.String linkedVpnTunnel) {
    this.linkedVpnTunnel = linkedVpnTunnel;
    return this;
  }

  /**
   * Informs whether MD5 authentication is enabled on this BGP peer.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMd5AuthEnabled() {
    return md5AuthEnabled;
  }

  /**
   * Informs whether MD5 authentication is enabled on this BGP peer.
   * @param md5AuthEnabled md5AuthEnabled or {@code null} for none
   */
  public RouterStatusBgpPeerStatus setMd5AuthEnabled(java.lang.Boolean md5AuthEnabled) {
    this.md5AuthEnabled = md5AuthEnabled;
    return this;
  }

  /**
   * Name of this BGP peer. Unique within the Routers resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of this BGP peer. Unique within the Routers resource.
   * @param name name or {@code null} for none
   */
  public RouterStatusBgpPeerStatus setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Number of routes learned from the remote BGP Peer.
   * @return value or {@code null} for none
   */
  public java.lang.Long getNumLearnedRoutes() {
    return numLearnedRoutes;
  }

  /**
   * Number of routes learned from the remote BGP Peer.
   * @param numLearnedRoutes numLearnedRoutes or {@code null} for none
   */
  public RouterStatusBgpPeerStatus setNumLearnedRoutes(java.lang.Long numLearnedRoutes) {
    this.numLearnedRoutes = numLearnedRoutes;
    return this;
  }

  /**
   * IP address of the remote BGP interface.
   * @return value or {@code null} for none
   */
  public java.lang.String getPeerIpAddress() {
    return peerIpAddress;
  }

  /**
   * IP address of the remote BGP interface.
   * @param peerIpAddress peerIpAddress or {@code null} for none
   */
  public RouterStatusBgpPeerStatus setPeerIpAddress(java.lang.String peerIpAddress) {
    this.peerIpAddress = peerIpAddress;
    return this;
  }

  /**
   * IPv6 address of the remote BGP interface.
   * @return value or {@code null} for none
   */
  public java.lang.String getPeerIpv6NexthopAddress() {
    return peerIpv6NexthopAddress;
  }

  /**
   * IPv6 address of the remote BGP interface.
   * @param peerIpv6NexthopAddress peerIpv6NexthopAddress or {@code null} for none
   */
  public RouterStatusBgpPeerStatus setPeerIpv6NexthopAddress(java.lang.String peerIpv6NexthopAddress) {
    this.peerIpv6NexthopAddress = peerIpv6NexthopAddress;
    return this;
  }

  /**
   * [Output only] URI of the VM instance that is used as third-party router appliances such as Next
   * Gen Firewalls, Virtual Routers, or Router Appliances. The VM instance is the peer side of the
   * BGP session.
   * @return value or {@code null} for none
   */
  public java.lang.String getRouterApplianceInstance() {
    return routerApplianceInstance;
  }

  /**
   * [Output only] URI of the VM instance that is used as third-party router appliances such as Next
   * Gen Firewalls, Virtual Routers, or Router Appliances. The VM instance is the peer side of the
   * BGP session.
   * @param routerApplianceInstance routerApplianceInstance or {@code null} for none
   */
  public RouterStatusBgpPeerStatus setRouterApplianceInstance(java.lang.String routerApplianceInstance) {
    this.routerApplianceInstance = routerApplianceInstance;
    return this;
  }

  /**
   * BGP state as specified in RFC1771.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * BGP state as specified in RFC1771.
   * @param state state or {@code null} for none
   */
  public RouterStatusBgpPeerStatus setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Status of the BGP peer: {UP, DOWN}
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Status of the BGP peer: {UP, DOWN}
   * @param status status or {@code null} for none
   */
  public RouterStatusBgpPeerStatus setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates why particular status was returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatusReason() {
    return statusReason;
  }

  /**
   * Indicates why particular status was returned.
   * @param statusReason statusReason or {@code null} for none
   */
  public RouterStatusBgpPeerStatus setStatusReason(java.lang.String statusReason) {
    this.statusReason = statusReason;
    return this;
  }

  /**
   * Time this session has been up. Format: 14 years, 51 weeks, 6 days, 23 hours, 59 minutes, 59
   * seconds
   * @return value or {@code null} for none
   */
  public java.lang.String getUptime() {
    return uptime;
  }

  /**
   * Time this session has been up. Format: 14 years, 51 weeks, 6 days, 23 hours, 59 minutes, 59
   * seconds
   * @param uptime uptime or {@code null} for none
   */
  public RouterStatusBgpPeerStatus setUptime(java.lang.String uptime) {
    this.uptime = uptime;
    return this;
  }

  /**
   * Time this session has been up, in seconds. Format: 145
   * @return value or {@code null} for none
   */
  public java.lang.String getUptimeSeconds() {
    return uptimeSeconds;
  }

  /**
   * Time this session has been up, in seconds. Format: 145
   * @param uptimeSeconds uptimeSeconds or {@code null} for none
   */
  public RouterStatusBgpPeerStatus setUptimeSeconds(java.lang.String uptimeSeconds) {
    this.uptimeSeconds = uptimeSeconds;
    return this;
  }

  @Override
  public RouterStatusBgpPeerStatus set(String fieldName, Object value) {
    return (RouterStatusBgpPeerStatus) super.set(fieldName, value);
  }

  @Override
  public RouterStatusBgpPeerStatus clone() {
    return (RouterStatusBgpPeerStatus) super.clone();
  }

}
