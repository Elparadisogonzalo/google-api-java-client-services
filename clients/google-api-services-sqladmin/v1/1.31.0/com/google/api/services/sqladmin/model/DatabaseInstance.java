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
 * A Cloud SQL instance resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DatabaseInstance extends com.google.api.client.json.GenericJson {

  /**
   * List all maintenance versions applicable on the instance
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> availableMaintenanceVersions;

  /**
   * The backend type. `SECOND_GEN`: Cloud SQL database instance. `EXTERNAL`: A database server that
   * is not managed by Google. This property is read-only; use the `tier` property in the `settings`
   * object to determine the database type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String backendType;

  /**
   * Connection name of the Cloud SQL instance used in connection strings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String connectionName;

  /**
   * Output only. The time when the instance was created in [RFC
   * 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The current disk usage of the instance in bytes. This property has been deprecated. Use the
   * "cloudsql.googleapis.com/database/disk/bytes_used" metric in Cloud Monitoring API instead.
   * Please see [this announcement](https://groups.google.com/d/msg/google-cloud-sql-
   * announce/I_7-F9EBhT0/BtvFtdFeAgAJ) for details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long currentDiskSize;

  /**
   * Output only. Stores the current database version running on the instance including minor
   * version such as `MYSQL_8_0_18`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String databaseInstalledVersion;

  /**
   * The database engine type and version. The `databaseVersion` field cannot be changed after
   * instance creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String databaseVersion;

  /**
   * Disk encryption configuration specific to an instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DiskEncryptionConfiguration diskEncryptionConfiguration;

  /**
   * Disk encryption status specific to an instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DiskEncryptionStatus diskEncryptionStatus;

  /**
   * This field is deprecated and will be removed from a future version of the API. Use the
   * `settings.settingsVersion` field instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The name and status of the failover replica.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FailoverReplica failoverReplica;

  /**
   * The Compute Engine zone that the instance is currently serving from. This value could be
   * different from the zone that was specified when the instance was created if the instance has
   * failed over to its secondary zone. WARNING: Changing this might restart the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gceZone;

  /**
   * The instance type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instanceType;

  /**
   * The assigned IP addresses for the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<IpMapping> ipAddresses;

  /**
   * The IPv6 address assigned to the instance. (Deprecated) This property was applicable only to
   * First Generation instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipv6Address;

  /**
   * This is always `sql#instance`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The current software version on the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String maintenanceVersion;

  /**
   * The name of the instance which will act as primary in the replication setup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String masterInstanceName;

  /**
   * The maximum disk size of the instance in bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maxDiskSize;

  /**
   * Name of the Cloud SQL instance. This does not include the project ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Configuration specific to on-premises instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OnPremisesConfiguration onPremisesConfiguration;

  /**
   * This field represents the report generated by the proactive database wellness job for OutOfDisk
   * issues. * Writers: * the proactive database wellness job for OOD. * Readers: * the proactive
   * database wellness job
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SqlOutOfDiskReport outOfDiskReport;

  /**
   * The project ID of the project containing the Cloud SQL instance. The Google apps domain is
   * prefixed if applicable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String project;

  /**
   * The geographical region. Can be: * `us-central` (`FIRST_GEN` instances only) * `us-central1`
   * (`SECOND_GEN` instances only) * `asia-east1` or `europe-west1`. Defaults to `us-central` or
   * `us-central1` depending on the instance type. The region cannot be changed after instance
   * creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * Configuration specific to failover replicas and read replicas.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ReplicaConfiguration replicaConfiguration;

  /**
   * The replicas of the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> replicaNames;

  /**
   * Initial root password. Use only on creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rootPassword;

  /**
   * The status indicating if instance satisfiesPzs. Reserved for future use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean satisfiesPzs;

  /**
   * The start time of any upcoming scheduled maintenance for this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SqlScheduledMaintenance scheduledMaintenance;

  /**
   * The Compute Engine zone that the failover instance is currently serving from for a regional
   * instance. This value could be different from the zone that was specified when the instance was
   * created if the instance has failed over to its secondary/failover zone. Reserved for future
   * use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String secondaryGceZone;

  /**
   * The URI of this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * SSL configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SslCert serverCaCert;

  /**
   * The service account email address assigned to the instance.\This property is read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccountEmailAddress;

  /**
   * The user settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Settings settings;

  /**
   * The current serving state of the Cloud SQL instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * If the instance state is SUSPENDED, the reason for the suspension.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> suspensionReason;

  /**
   * List all maintenance versions applicable on the instance
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAvailableMaintenanceVersions() {
    return availableMaintenanceVersions;
  }

  /**
   * List all maintenance versions applicable on the instance
   * @param availableMaintenanceVersions availableMaintenanceVersions or {@code null} for none
   */
  public DatabaseInstance setAvailableMaintenanceVersions(java.util.List<java.lang.String> availableMaintenanceVersions) {
    this.availableMaintenanceVersions = availableMaintenanceVersions;
    return this;
  }

  /**
   * The backend type. `SECOND_GEN`: Cloud SQL database instance. `EXTERNAL`: A database server that
   * is not managed by Google. This property is read-only; use the `tier` property in the `settings`
   * object to determine the database type.
   * @return value or {@code null} for none
   */
  public java.lang.String getBackendType() {
    return backendType;
  }

  /**
   * The backend type. `SECOND_GEN`: Cloud SQL database instance. `EXTERNAL`: A database server that
   * is not managed by Google. This property is read-only; use the `tier` property in the `settings`
   * object to determine the database type.
   * @param backendType backendType or {@code null} for none
   */
  public DatabaseInstance setBackendType(java.lang.String backendType) {
    this.backendType = backendType;
    return this;
  }

  /**
   * Connection name of the Cloud SQL instance used in connection strings.
   * @return value or {@code null} for none
   */
  public java.lang.String getConnectionName() {
    return connectionName;
  }

  /**
   * Connection name of the Cloud SQL instance used in connection strings.
   * @param connectionName connectionName or {@code null} for none
   */
  public DatabaseInstance setConnectionName(java.lang.String connectionName) {
    this.connectionName = connectionName;
    return this;
  }

  /**
   * Output only. The time when the instance was created in [RFC
   * 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time when the instance was created in [RFC
   * 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
   * @param createTime createTime or {@code null} for none
   */
  public DatabaseInstance setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The current disk usage of the instance in bytes. This property has been deprecated. Use the
   * "cloudsql.googleapis.com/database/disk/bytes_used" metric in Cloud Monitoring API instead.
   * Please see [this announcement](https://groups.google.com/d/msg/google-cloud-sql-
   * announce/I_7-F9EBhT0/BtvFtdFeAgAJ) for details.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCurrentDiskSize() {
    return currentDiskSize;
  }

  /**
   * The current disk usage of the instance in bytes. This property has been deprecated. Use the
   * "cloudsql.googleapis.com/database/disk/bytes_used" metric in Cloud Monitoring API instead.
   * Please see [this announcement](https://groups.google.com/d/msg/google-cloud-sql-
   * announce/I_7-F9EBhT0/BtvFtdFeAgAJ) for details.
   * @param currentDiskSize currentDiskSize or {@code null} for none
   */
  public DatabaseInstance setCurrentDiskSize(java.lang.Long currentDiskSize) {
    this.currentDiskSize = currentDiskSize;
    return this;
  }

  /**
   * Output only. Stores the current database version running on the instance including minor
   * version such as `MYSQL_8_0_18`.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatabaseInstalledVersion() {
    return databaseInstalledVersion;
  }

  /**
   * Output only. Stores the current database version running on the instance including minor
   * version such as `MYSQL_8_0_18`.
   * @param databaseInstalledVersion databaseInstalledVersion or {@code null} for none
   */
  public DatabaseInstance setDatabaseInstalledVersion(java.lang.String databaseInstalledVersion) {
    this.databaseInstalledVersion = databaseInstalledVersion;
    return this;
  }

  /**
   * The database engine type and version. The `databaseVersion` field cannot be changed after
   * instance creation.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatabaseVersion() {
    return databaseVersion;
  }

  /**
   * The database engine type and version. The `databaseVersion` field cannot be changed after
   * instance creation.
   * @param databaseVersion databaseVersion or {@code null} for none
   */
  public DatabaseInstance setDatabaseVersion(java.lang.String databaseVersion) {
    this.databaseVersion = databaseVersion;
    return this;
  }

  /**
   * Disk encryption configuration specific to an instance.
   * @return value or {@code null} for none
   */
  public DiskEncryptionConfiguration getDiskEncryptionConfiguration() {
    return diskEncryptionConfiguration;
  }

  /**
   * Disk encryption configuration specific to an instance.
   * @param diskEncryptionConfiguration diskEncryptionConfiguration or {@code null} for none
   */
  public DatabaseInstance setDiskEncryptionConfiguration(DiskEncryptionConfiguration diskEncryptionConfiguration) {
    this.diskEncryptionConfiguration = diskEncryptionConfiguration;
    return this;
  }

  /**
   * Disk encryption status specific to an instance.
   * @return value or {@code null} for none
   */
  public DiskEncryptionStatus getDiskEncryptionStatus() {
    return diskEncryptionStatus;
  }

  /**
   * Disk encryption status specific to an instance.
   * @param diskEncryptionStatus diskEncryptionStatus or {@code null} for none
   */
  public DatabaseInstance setDiskEncryptionStatus(DiskEncryptionStatus diskEncryptionStatus) {
    this.diskEncryptionStatus = diskEncryptionStatus;
    return this;
  }

  /**
   * This field is deprecated and will be removed from a future version of the API. Use the
   * `settings.settingsVersion` field instead.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * This field is deprecated and will be removed from a future version of the API. Use the
   * `settings.settingsVersion` field instead.
   * @param etag etag or {@code null} for none
   */
  public DatabaseInstance setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The name and status of the failover replica.
   * @return value or {@code null} for none
   */
  public FailoverReplica getFailoverReplica() {
    return failoverReplica;
  }

  /**
   * The name and status of the failover replica.
   * @param failoverReplica failoverReplica or {@code null} for none
   */
  public DatabaseInstance setFailoverReplica(FailoverReplica failoverReplica) {
    this.failoverReplica = failoverReplica;
    return this;
  }

  /**
   * The Compute Engine zone that the instance is currently serving from. This value could be
   * different from the zone that was specified when the instance was created if the instance has
   * failed over to its secondary zone. WARNING: Changing this might restart the instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getGceZone() {
    return gceZone;
  }

  /**
   * The Compute Engine zone that the instance is currently serving from. This value could be
   * different from the zone that was specified when the instance was created if the instance has
   * failed over to its secondary zone. WARNING: Changing this might restart the instance.
   * @param gceZone gceZone or {@code null} for none
   */
  public DatabaseInstance setGceZone(java.lang.String gceZone) {
    this.gceZone = gceZone;
    return this;
  }

  /**
   * The instance type.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstanceType() {
    return instanceType;
  }

  /**
   * The instance type.
   * @param instanceType instanceType or {@code null} for none
   */
  public DatabaseInstance setInstanceType(java.lang.String instanceType) {
    this.instanceType = instanceType;
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
  public DatabaseInstance setIpAddresses(java.util.List<IpMapping> ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }

  /**
   * The IPv6 address assigned to the instance. (Deprecated) This property was applicable only to
   * First Generation instances.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpv6Address() {
    return ipv6Address;
  }

  /**
   * The IPv6 address assigned to the instance. (Deprecated) This property was applicable only to
   * First Generation instances.
   * @param ipv6Address ipv6Address or {@code null} for none
   */
  public DatabaseInstance setIpv6Address(java.lang.String ipv6Address) {
    this.ipv6Address = ipv6Address;
    return this;
  }

  /**
   * This is always `sql#instance`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always `sql#instance`.
   * @param kind kind or {@code null} for none
   */
  public DatabaseInstance setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The current software version on the instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getMaintenanceVersion() {
    return maintenanceVersion;
  }

  /**
   * The current software version on the instance.
   * @param maintenanceVersion maintenanceVersion or {@code null} for none
   */
  public DatabaseInstance setMaintenanceVersion(java.lang.String maintenanceVersion) {
    this.maintenanceVersion = maintenanceVersion;
    return this;
  }

  /**
   * The name of the instance which will act as primary in the replication setup.
   * @return value or {@code null} for none
   */
  public java.lang.String getMasterInstanceName() {
    return masterInstanceName;
  }

  /**
   * The name of the instance which will act as primary in the replication setup.
   * @param masterInstanceName masterInstanceName or {@code null} for none
   */
  public DatabaseInstance setMasterInstanceName(java.lang.String masterInstanceName) {
    this.masterInstanceName = masterInstanceName;
    return this;
  }

  /**
   * The maximum disk size of the instance in bytes.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaxDiskSize() {
    return maxDiskSize;
  }

  /**
   * The maximum disk size of the instance in bytes.
   * @param maxDiskSize maxDiskSize or {@code null} for none
   */
  public DatabaseInstance setMaxDiskSize(java.lang.Long maxDiskSize) {
    this.maxDiskSize = maxDiskSize;
    return this;
  }

  /**
   * Name of the Cloud SQL instance. This does not include the project ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the Cloud SQL instance. This does not include the project ID.
   * @param name name or {@code null} for none
   */
  public DatabaseInstance setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Configuration specific to on-premises instances.
   * @return value or {@code null} for none
   */
  public OnPremisesConfiguration getOnPremisesConfiguration() {
    return onPremisesConfiguration;
  }

  /**
   * Configuration specific to on-premises instances.
   * @param onPremisesConfiguration onPremisesConfiguration or {@code null} for none
   */
  public DatabaseInstance setOnPremisesConfiguration(OnPremisesConfiguration onPremisesConfiguration) {
    this.onPremisesConfiguration = onPremisesConfiguration;
    return this;
  }

  /**
   * This field represents the report generated by the proactive database wellness job for OutOfDisk
   * issues. * Writers: * the proactive database wellness job for OOD. * Readers: * the proactive
   * database wellness job
   * @return value or {@code null} for none
   */
  public SqlOutOfDiskReport getOutOfDiskReport() {
    return outOfDiskReport;
  }

  /**
   * This field represents the report generated by the proactive database wellness job for OutOfDisk
   * issues. * Writers: * the proactive database wellness job for OOD. * Readers: * the proactive
   * database wellness job
   * @param outOfDiskReport outOfDiskReport or {@code null} for none
   */
  public DatabaseInstance setOutOfDiskReport(SqlOutOfDiskReport outOfDiskReport) {
    this.outOfDiskReport = outOfDiskReport;
    return this;
  }

  /**
   * The project ID of the project containing the Cloud SQL instance. The Google apps domain is
   * prefixed if applicable.
   * @return value or {@code null} for none
   */
  public java.lang.String getProject() {
    return project;
  }

  /**
   * The project ID of the project containing the Cloud SQL instance. The Google apps domain is
   * prefixed if applicable.
   * @param project project or {@code null} for none
   */
  public DatabaseInstance setProject(java.lang.String project) {
    this.project = project;
    return this;
  }

  /**
   * The geographical region. Can be: * `us-central` (`FIRST_GEN` instances only) * `us-central1`
   * (`SECOND_GEN` instances only) * `asia-east1` or `europe-west1`. Defaults to `us-central` or
   * `us-central1` depending on the instance type. The region cannot be changed after instance
   * creation.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * The geographical region. Can be: * `us-central` (`FIRST_GEN` instances only) * `us-central1`
   * (`SECOND_GEN` instances only) * `asia-east1` or `europe-west1`. Defaults to `us-central` or
   * `us-central1` depending on the instance type. The region cannot be changed after instance
   * creation.
   * @param region region or {@code null} for none
   */
  public DatabaseInstance setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * Configuration specific to failover replicas and read replicas.
   * @return value or {@code null} for none
   */
  public ReplicaConfiguration getReplicaConfiguration() {
    return replicaConfiguration;
  }

  /**
   * Configuration specific to failover replicas and read replicas.
   * @param replicaConfiguration replicaConfiguration or {@code null} for none
   */
  public DatabaseInstance setReplicaConfiguration(ReplicaConfiguration replicaConfiguration) {
    this.replicaConfiguration = replicaConfiguration;
    return this;
  }

  /**
   * The replicas of the instance.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getReplicaNames() {
    return replicaNames;
  }

  /**
   * The replicas of the instance.
   * @param replicaNames replicaNames or {@code null} for none
   */
  public DatabaseInstance setReplicaNames(java.util.List<java.lang.String> replicaNames) {
    this.replicaNames = replicaNames;
    return this;
  }

  /**
   * Initial root password. Use only on creation.
   * @return value or {@code null} for none
   */
  public java.lang.String getRootPassword() {
    return rootPassword;
  }

  /**
   * Initial root password. Use only on creation.
   * @param rootPassword rootPassword or {@code null} for none
   */
  public DatabaseInstance setRootPassword(java.lang.String rootPassword) {
    this.rootPassword = rootPassword;
    return this;
  }

  /**
   * The status indicating if instance satisfiesPzs. Reserved for future use.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSatisfiesPzs() {
    return satisfiesPzs;
  }

  /**
   * The status indicating if instance satisfiesPzs. Reserved for future use.
   * @param satisfiesPzs satisfiesPzs or {@code null} for none
   */
  public DatabaseInstance setSatisfiesPzs(java.lang.Boolean satisfiesPzs) {
    this.satisfiesPzs = satisfiesPzs;
    return this;
  }

  /**
   * The start time of any upcoming scheduled maintenance for this instance.
   * @return value or {@code null} for none
   */
  public SqlScheduledMaintenance getScheduledMaintenance() {
    return scheduledMaintenance;
  }

  /**
   * The start time of any upcoming scheduled maintenance for this instance.
   * @param scheduledMaintenance scheduledMaintenance or {@code null} for none
   */
  public DatabaseInstance setScheduledMaintenance(SqlScheduledMaintenance scheduledMaintenance) {
    this.scheduledMaintenance = scheduledMaintenance;
    return this;
  }

  /**
   * The Compute Engine zone that the failover instance is currently serving from for a regional
   * instance. This value could be different from the zone that was specified when the instance was
   * created if the instance has failed over to its secondary/failover zone. Reserved for future
   * use.
   * @return value or {@code null} for none
   */
  public java.lang.String getSecondaryGceZone() {
    return secondaryGceZone;
  }

  /**
   * The Compute Engine zone that the failover instance is currently serving from for a regional
   * instance. This value could be different from the zone that was specified when the instance was
   * created if the instance has failed over to its secondary/failover zone. Reserved for future
   * use.
   * @param secondaryGceZone secondaryGceZone or {@code null} for none
   */
  public DatabaseInstance setSecondaryGceZone(java.lang.String secondaryGceZone) {
    this.secondaryGceZone = secondaryGceZone;
    return this;
  }

  /**
   * The URI of this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * The URI of this resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public DatabaseInstance setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
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
  public DatabaseInstance setServerCaCert(SslCert serverCaCert) {
    this.serverCaCert = serverCaCert;
    return this;
  }

  /**
   * The service account email address assigned to the instance.\This property is read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccountEmailAddress() {
    return serviceAccountEmailAddress;
  }

  /**
   * The service account email address assigned to the instance.\This property is read-only.
   * @param serviceAccountEmailAddress serviceAccountEmailAddress or {@code null} for none
   */
  public DatabaseInstance setServiceAccountEmailAddress(java.lang.String serviceAccountEmailAddress) {
    this.serviceAccountEmailAddress = serviceAccountEmailAddress;
    return this;
  }

  /**
   * The user settings.
   * @return value or {@code null} for none
   */
  public Settings getSettings() {
    return settings;
  }

  /**
   * The user settings.
   * @param settings settings or {@code null} for none
   */
  public DatabaseInstance setSettings(Settings settings) {
    this.settings = settings;
    return this;
  }

  /**
   * The current serving state of the Cloud SQL instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The current serving state of the Cloud SQL instance.
   * @param state state or {@code null} for none
   */
  public DatabaseInstance setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * If the instance state is SUSPENDED, the reason for the suspension.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSuspensionReason() {
    return suspensionReason;
  }

  /**
   * If the instance state is SUSPENDED, the reason for the suspension.
   * @param suspensionReason suspensionReason or {@code null} for none
   */
  public DatabaseInstance setSuspensionReason(java.util.List<java.lang.String> suspensionReason) {
    this.suspensionReason = suspensionReason;
    return this;
  }

  @Override
  public DatabaseInstance set(String fieldName, Object value) {
    return (DatabaseInstance) super.set(fieldName, value);
  }

  @Override
  public DatabaseInstance clone() {
    return (DatabaseInstance) super.clone();
  }

  /**
   * The name and status of the failover replica.
   */
  public static final class FailoverReplica extends com.google.api.client.json.GenericJson {

    /**
     * The availability status of the failover replica. A false status indicates that the failover
     * replica is out of sync. The primary instance can only failover to the failover replica when the
     * status is true.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean available;

    /**
     * The name of the failover replica. If specified at instance creation, a failover replica is
     * created for the instance. The name doesn't include the project ID.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String name;

    /**
     * The availability status of the failover replica. A false status indicates that the failover
     * replica is out of sync. The primary instance can only failover to the failover replica when the
     * status is true.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getAvailable() {
      return available;
    }

    /**
     * The availability status of the failover replica. A false status indicates that the failover
     * replica is out of sync. The primary instance can only failover to the failover replica when the
     * status is true.
     * @param available available or {@code null} for none
     */
    public FailoverReplica setAvailable(java.lang.Boolean available) {
      this.available = available;
      return this;
    }

    /**
     * The name of the failover replica. If specified at instance creation, a failover replica is
     * created for the instance. The name doesn't include the project ID.
     * @return value or {@code null} for none
     */
    public java.lang.String getName() {
      return name;
    }

    /**
     * The name of the failover replica. If specified at instance creation, a failover replica is
     * created for the instance. The name doesn't include the project ID.
     * @param name name or {@code null} for none
     */
    public FailoverReplica setName(java.lang.String name) {
      this.name = name;
      return this;
    }

    @Override
    public FailoverReplica set(String fieldName, Object value) {
      return (FailoverReplica) super.set(fieldName, value);
    }

    @Override
    public FailoverReplica clone() {
      return (FailoverReplica) super.clone();
    }

  }

}
