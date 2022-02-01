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
 * Connect settings retrieval response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConnectSettings extends com.google.api.client.json.GenericJson {

  /**
   * `SECOND_GEN`: Cloud SQL database instance. `EXTERNAL`: A database server that is not managed by
   * Google. This property is read-only; use the `tier` property in the `settings` object to
   * determine the database type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String backendType;

  /**
   * The database engine type and version. The `databaseVersion` field cannot be changed after
   * instance creation. MySQL instances: `MYSQL_8_0`, `MYSQL_5_7` (default), or `MYSQL_5_6`.
   * PostgreSQL instances: `POSTGRES_9_6`, `POSTGRES_10`, `POSTGRES_11` or `POSTGRES_12` (default),
   * `POSTGRES_13`, or `POSTGRES_14`. SQL Server instances: `SQLSERVER_2017_STANDARD` (default),
   * `SQLSERVER_2017_ENTERPRISE`, `SQLSERVER_2017_EXPRESS`, `SQLSERVER_2017_WEB`,
   * `SQLSERVER_2019_STANDARD`, `SQLSERVER_2019_ENTERPRISE`, `SQLSERVER_2019_EXPRESS`, or
   * `SQLSERVER_2019_WEB`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String databaseVersion;

  /**
   * The assigned IP addresses for the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<IpMapping> ipAddresses;

  /**
   * This is always `sql#connectSettings`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The cloud region for the instance. e.g. `us-central1`, `europe-west1`. The region cannot be
   * changed after instance creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * SSL configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SslCert serverCaCert;

  /**
   * `SECOND_GEN`: Cloud SQL database instance. `EXTERNAL`: A database server that is not managed by
   * Google. This property is read-only; use the `tier` property in the `settings` object to
   * determine the database type.
   * @return value or {@code null} for none
   */
  public java.lang.String getBackendType() {
    return backendType;
  }

  /**
   * `SECOND_GEN`: Cloud SQL database instance. `EXTERNAL`: A database server that is not managed by
   * Google. This property is read-only; use the `tier` property in the `settings` object to
   * determine the database type.
   * @param backendType backendType or {@code null} for none
   */
  public ConnectSettings setBackendType(java.lang.String backendType) {
    this.backendType = backendType;
    return this;
  }

  /**
   * The database engine type and version. The `databaseVersion` field cannot be changed after
   * instance creation. MySQL instances: `MYSQL_8_0`, `MYSQL_5_7` (default), or `MYSQL_5_6`.
   * PostgreSQL instances: `POSTGRES_9_6`, `POSTGRES_10`, `POSTGRES_11` or `POSTGRES_12` (default),
   * `POSTGRES_13`, or `POSTGRES_14`. SQL Server instances: `SQLSERVER_2017_STANDARD` (default),
   * `SQLSERVER_2017_ENTERPRISE`, `SQLSERVER_2017_EXPRESS`, `SQLSERVER_2017_WEB`,
   * `SQLSERVER_2019_STANDARD`, `SQLSERVER_2019_ENTERPRISE`, `SQLSERVER_2019_EXPRESS`, or
   * `SQLSERVER_2019_WEB`.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatabaseVersion() {
    return databaseVersion;
  }

  /**
   * The database engine type and version. The `databaseVersion` field cannot be changed after
   * instance creation. MySQL instances: `MYSQL_8_0`, `MYSQL_5_7` (default), or `MYSQL_5_6`.
   * PostgreSQL instances: `POSTGRES_9_6`, `POSTGRES_10`, `POSTGRES_11` or `POSTGRES_12` (default),
   * `POSTGRES_13`, or `POSTGRES_14`. SQL Server instances: `SQLSERVER_2017_STANDARD` (default),
   * `SQLSERVER_2017_ENTERPRISE`, `SQLSERVER_2017_EXPRESS`, `SQLSERVER_2017_WEB`,
   * `SQLSERVER_2019_STANDARD`, `SQLSERVER_2019_ENTERPRISE`, `SQLSERVER_2019_EXPRESS`, or
   * `SQLSERVER_2019_WEB`.
   * @param databaseVersion databaseVersion or {@code null} for none
   */
  public ConnectSettings setDatabaseVersion(java.lang.String databaseVersion) {
    this.databaseVersion = databaseVersion;
    return this;
  }

  /**
   * The assigned IP addresses for the instance.
   * @return value or {@code null} for none
   */
  public java.util.List<IpMapping> getIpAddresses() {
    return ipAddresses;
  }

  /**
   * The assigned IP addresses for the instance.
   * @param ipAddresses ipAddresses or {@code null} for none
   */
  public ConnectSettings setIpAddresses(java.util.List<IpMapping> ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }

  /**
   * This is always `sql#connectSettings`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always `sql#connectSettings`.
   * @param kind kind or {@code null} for none
   */
  public ConnectSettings setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The cloud region for the instance. e.g. `us-central1`, `europe-west1`. The region cannot be
   * changed after instance creation.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * The cloud region for the instance. e.g. `us-central1`, `europe-west1`. The region cannot be
   * changed after instance creation.
   * @param region region or {@code null} for none
   */
  public ConnectSettings setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * SSL configuration.
   * @return value or {@code null} for none
   */
  public SslCert getServerCaCert() {
    return serverCaCert;
  }

  /**
   * SSL configuration.
   * @param serverCaCert serverCaCert or {@code null} for none
   */
  public ConnectSettings setServerCaCert(SslCert serverCaCert) {
    this.serverCaCert = serverCaCert;
    return this;
  }

  @Override
  public ConnectSettings set(String fieldName, Object value) {
    return (ConnectSettings) super.set(fieldName, value);
  }

  @Override
  public ConnectSettings clone() {
    return (ConnectSettings) super.clone();
  }

}
