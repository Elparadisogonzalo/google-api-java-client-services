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

package com.google.api.services.sqladmin.model;

/**
 * Read-replica configuration for connecting to the primary instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReplicaConfiguration extends com.google.api.client.json.GenericJson {

  /**
   * Specifies if the replica is the failover target. If the field is set to `true`, the replica
   * will be designated as a failover replica. In case the primary instance fails, the replica
   * instance will be promoted as the new primary instance. Only one replica can be specified as
   * failover target, and the replica has to be in different zone with the primary instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean failoverTarget;

  /**
   * This is always `sql#replicaConfiguration`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * MySQL specific configuration when replicating from a MySQL on-premises primary instance.
   * Replication configuration information such as the username, password, certificates, and keys
   * are not stored in the instance metadata. The configuration information is used only to set up
   * the replication connection and is stored by MySQL in a file named `master.info` in the data
   * directory.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MySqlReplicaConfiguration mysqlReplicaConfiguration;

  /**
   * Specifies if the replica is the failover target. If the field is set to `true`, the replica
   * will be designated as a failover replica. In case the primary instance fails, the replica
   * instance will be promoted as the new primary instance. Only one replica can be specified as
   * failover target, and the replica has to be in different zone with the primary instance.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getFailoverTarget() {
    return failoverTarget;
  }

  /**
   * Specifies if the replica is the failover target. If the field is set to `true`, the replica
   * will be designated as a failover replica. In case the primary instance fails, the replica
   * instance will be promoted as the new primary instance. Only one replica can be specified as
   * failover target, and the replica has to be in different zone with the primary instance.
   * @param failoverTarget failoverTarget or {@code null} for none
   */
  public ReplicaConfiguration setFailoverTarget(java.lang.Boolean failoverTarget) {
    this.failoverTarget = failoverTarget;
    return this;
  }

  /**
   * This is always `sql#replicaConfiguration`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always `sql#replicaConfiguration`.
   * @param kind kind or {@code null} for none
   */
  public ReplicaConfiguration setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * MySQL specific configuration when replicating from a MySQL on-premises primary instance.
   * Replication configuration information such as the username, password, certificates, and keys
   * are not stored in the instance metadata. The configuration information is used only to set up
   * the replication connection and is stored by MySQL in a file named `master.info` in the data
   * directory.
   * @return value or {@code null} for none
   */
  public MySqlReplicaConfiguration getMysqlReplicaConfiguration() {
    return mysqlReplicaConfiguration;
  }

  /**
   * MySQL specific configuration when replicating from a MySQL on-premises primary instance.
   * Replication configuration information such as the username, password, certificates, and keys
   * are not stored in the instance metadata. The configuration information is used only to set up
   * the replication connection and is stored by MySQL in a file named `master.info` in the data
   * directory.
   * @param mysqlReplicaConfiguration mysqlReplicaConfiguration or {@code null} for none
   */
  public ReplicaConfiguration setMysqlReplicaConfiguration(MySqlReplicaConfiguration mysqlReplicaConfiguration) {
    this.mysqlReplicaConfiguration = mysqlReplicaConfiguration;
    return this;
  }

  @Override
  public ReplicaConfiguration set(String fieldName, Object value) {
    return (ReplicaConfiguration) super.set(fieldName, value);
  }

  @Override
  public ReplicaConfiguration clone() {
    return (ReplicaConfiguration) super.clone();
  }

}
