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
 * Model definition for RouterBgpPeerBfd.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RouterBgpPeerBfd extends com.google.api.client.json.GenericJson {

  /**
   * The minimum interval, in milliseconds, between BFD control packets received from the peer
   * router. The actual value is negotiated between the two routers and is equal to the greater of
   * this value and the transmit interval of the other router. If set, this value must be between
   * 1000 and 30000. The default is 1000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long minReceiveInterval;

  /**
   * The minimum interval, in milliseconds, between BFD control packets transmitted to the peer
   * router. The actual value is negotiated between the two routers and is equal to the greater of
   * this value and the corresponding receive interval of the other router. If set, this value must
   * be between 1000 and 30000. The default is 1000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long minTransmitInterval;

  /**
   * The number of consecutive BFD packets that must be missed before BFD declares that a peer is
   * unavailable. If set, the value must be a value between 5 and 16. The default is 5.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long multiplier;

  /**
   * The BFD session initialization mode for this BGP peer. If set to ACTIVE, the Cloud Router will
   * initiate the BFD session for this BGP peer. If set to PASSIVE, the Cloud Router will wait for
   * the peer router to initiate the BFD session for this BGP peer. If set to DISABLED, BFD is
   * disabled for this BGP peer. The default is DISABLED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sessionInitializationMode;

  /**
   * The minimum interval, in milliseconds, between BFD control packets received from the peer
   * router. The actual value is negotiated between the two routers and is equal to the greater of
   * this value and the transmit interval of the other router. If set, this value must be between
   * 1000 and 30000. The default is 1000.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMinReceiveInterval() {
    return minReceiveInterval;
  }

  /**
   * The minimum interval, in milliseconds, between BFD control packets received from the peer
   * router. The actual value is negotiated between the two routers and is equal to the greater of
   * this value and the transmit interval of the other router. If set, this value must be between
   * 1000 and 30000. The default is 1000.
   * @param minReceiveInterval minReceiveInterval or {@code null} for none
   */
  public RouterBgpPeerBfd setMinReceiveInterval(java.lang.Long minReceiveInterval) {
    this.minReceiveInterval = minReceiveInterval;
    return this;
  }

  /**
   * The minimum interval, in milliseconds, between BFD control packets transmitted to the peer
   * router. The actual value is negotiated between the two routers and is equal to the greater of
   * this value and the corresponding receive interval of the other router. If set, this value must
   * be between 1000 and 30000. The default is 1000.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMinTransmitInterval() {
    return minTransmitInterval;
  }

  /**
   * The minimum interval, in milliseconds, between BFD control packets transmitted to the peer
   * router. The actual value is negotiated between the two routers and is equal to the greater of
   * this value and the corresponding receive interval of the other router. If set, this value must
   * be between 1000 and 30000. The default is 1000.
   * @param minTransmitInterval minTransmitInterval or {@code null} for none
   */
  public RouterBgpPeerBfd setMinTransmitInterval(java.lang.Long minTransmitInterval) {
    this.minTransmitInterval = minTransmitInterval;
    return this;
  }

  /**
   * The number of consecutive BFD packets that must be missed before BFD declares that a peer is
   * unavailable. If set, the value must be a value between 5 and 16. The default is 5.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMultiplier() {
    return multiplier;
  }

  /**
   * The number of consecutive BFD packets that must be missed before BFD declares that a peer is
   * unavailable. If set, the value must be a value between 5 and 16. The default is 5.
   * @param multiplier multiplier or {@code null} for none
   */
  public RouterBgpPeerBfd setMultiplier(java.lang.Long multiplier) {
    this.multiplier = multiplier;
    return this;
  }

  /**
   * The BFD session initialization mode for this BGP peer. If set to ACTIVE, the Cloud Router will
   * initiate the BFD session for this BGP peer. If set to PASSIVE, the Cloud Router will wait for
   * the peer router to initiate the BFD session for this BGP peer. If set to DISABLED, BFD is
   * disabled for this BGP peer. The default is DISABLED.
   * @return value or {@code null} for none
   */
  public java.lang.String getSessionInitializationMode() {
    return sessionInitializationMode;
  }

  /**
   * The BFD session initialization mode for this BGP peer. If set to ACTIVE, the Cloud Router will
   * initiate the BFD session for this BGP peer. If set to PASSIVE, the Cloud Router will wait for
   * the peer router to initiate the BFD session for this BGP peer. If set to DISABLED, BFD is
   * disabled for this BGP peer. The default is DISABLED.
   * @param sessionInitializationMode sessionInitializationMode or {@code null} for none
   */
  public RouterBgpPeerBfd setSessionInitializationMode(java.lang.String sessionInitializationMode) {
    this.sessionInitializationMode = sessionInitializationMode;
    return this;
  }

  @Override
  public RouterBgpPeerBfd set(String fieldName, Object value) {
    return (RouterBgpPeerBfd) super.set(fieldName, value);
  }

  @Override
  public RouterBgpPeerBfd clone() {
    return (RouterBgpPeerBfd) super.clone();
  }

}
