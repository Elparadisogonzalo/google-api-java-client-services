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

package com.google.api.services.appengine.model;

/**
 * An Application resource contains the top-level configuration of an App Engine application.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Application extends com.google.api.client.json.GenericJson {

  /**
   * Google Apps authentication domain that controls which users can access this
   * application.Defaults to open access for any Google Account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String authDomain;

  /**
   * Google Cloud Storage bucket that can be used for storing files associated with this
   * application. This bucket is associated with the application and can be used by the gcloud
   * deployment commands.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String codeBucket;

  /**
   * The type of the Cloud Firestore or Cloud Datastore database associated with this application.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String databaseType;

  /**
   * Google Cloud Storage bucket that can be used by this application to store content.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String defaultBucket;

  /**
   * Cookie expiration policy for this application.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String defaultCookieExpiration;

  /**
   * Hostname used to reach this application, as resolved by App Engine.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String defaultHostname;

  /**
   * HTTP path dispatch rules for requests to the application that do not explicitly target a
   * service or version. Rules are order-dependent. Up to 20 dispatch rules can be supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<UrlDispatchRule> dispatchRules;

  /**
   * The feature specific settings to be used in the application.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FeatureSettings featureSettings;

  /**
   * The Google Container Registry domain used for storing managed build docker images for this
   * application.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gcrDomain;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IdentityAwareProxy iap;

  /**
   * Identifier of the Application resource. This identifier is equivalent to the project ID of the
   * Google Cloud Platform project where you want to deploy your application. Example: myapp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Location from which this application runs. Application instances run out of the data centers in
   * the specified location, which is also where all of the application's end user content is
   * stored.Defaults to us-central.View the list of supported locations
   * (https://cloud.google.com/appengine/docs/locations).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locationId;

  /**
   * Full path to the Application resource in the API. Example: apps/myapp.@OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The service account associated with the application. This is the app-level default identity. If
   * no identity provided during create version, Admin API will fallback to this one.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccount;

  /**
   * Serving status of this application.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String servingStatus;

  /**
   * Google Apps authentication domain that controls which users can access this
   * application.Defaults to open access for any Google Account.
   * @return value or {@code null} for none
   */
  public java.lang.String getAuthDomain() {
    return authDomain;
  }

  /**
   * Google Apps authentication domain that controls which users can access this
   * application.Defaults to open access for any Google Account.
   * @param authDomain authDomain or {@code null} for none
   */
  public Application setAuthDomain(java.lang.String authDomain) {
    this.authDomain = authDomain;
    return this;
  }

  /**
   * Google Cloud Storage bucket that can be used for storing files associated with this
   * application. This bucket is associated with the application and can be used by the gcloud
   * deployment commands.@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getCodeBucket() {
    return codeBucket;
  }

  /**
   * Google Cloud Storage bucket that can be used for storing files associated with this
   * application. This bucket is associated with the application and can be used by the gcloud
   * deployment commands.@OutputOnly
   * @param codeBucket codeBucket or {@code null} for none
   */
  public Application setCodeBucket(java.lang.String codeBucket) {
    this.codeBucket = codeBucket;
    return this;
  }

  /**
   * The type of the Cloud Firestore or Cloud Datastore database associated with this application.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatabaseType() {
    return databaseType;
  }

  /**
   * The type of the Cloud Firestore or Cloud Datastore database associated with this application.
   * @param databaseType databaseType or {@code null} for none
   */
  public Application setDatabaseType(java.lang.String databaseType) {
    this.databaseType = databaseType;
    return this;
  }

  /**
   * Google Cloud Storage bucket that can be used by this application to store content.@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getDefaultBucket() {
    return defaultBucket;
  }

  /**
   * Google Cloud Storage bucket that can be used by this application to store content.@OutputOnly
   * @param defaultBucket defaultBucket or {@code null} for none
   */
  public Application setDefaultBucket(java.lang.String defaultBucket) {
    this.defaultBucket = defaultBucket;
    return this;
  }

  /**
   * Cookie expiration policy for this application.
   * @return value or {@code null} for none
   */
  public String getDefaultCookieExpiration() {
    return defaultCookieExpiration;
  }

  /**
   * Cookie expiration policy for this application.
   * @param defaultCookieExpiration defaultCookieExpiration or {@code null} for none
   */
  public Application setDefaultCookieExpiration(String defaultCookieExpiration) {
    this.defaultCookieExpiration = defaultCookieExpiration;
    return this;
  }

  /**
   * Hostname used to reach this application, as resolved by App Engine.@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getDefaultHostname() {
    return defaultHostname;
  }

  /**
   * Hostname used to reach this application, as resolved by App Engine.@OutputOnly
   * @param defaultHostname defaultHostname or {@code null} for none
   */
  public Application setDefaultHostname(java.lang.String defaultHostname) {
    this.defaultHostname = defaultHostname;
    return this;
  }

  /**
   * HTTP path dispatch rules for requests to the application that do not explicitly target a
   * service or version. Rules are order-dependent. Up to 20 dispatch rules can be supported.
   * @return value or {@code null} for none
   */
  public java.util.List<UrlDispatchRule> getDispatchRules() {
    return dispatchRules;
  }

  /**
   * HTTP path dispatch rules for requests to the application that do not explicitly target a
   * service or version. Rules are order-dependent. Up to 20 dispatch rules can be supported.
   * @param dispatchRules dispatchRules or {@code null} for none
   */
  public Application setDispatchRules(java.util.List<UrlDispatchRule> dispatchRules) {
    this.dispatchRules = dispatchRules;
    return this;
  }

  /**
   * The feature specific settings to be used in the application.
   * @return value or {@code null} for none
   */
  public FeatureSettings getFeatureSettings() {
    return featureSettings;
  }

  /**
   * The feature specific settings to be used in the application.
   * @param featureSettings featureSettings or {@code null} for none
   */
  public Application setFeatureSettings(FeatureSettings featureSettings) {
    this.featureSettings = featureSettings;
    return this;
  }

  /**
   * The Google Container Registry domain used for storing managed build docker images for this
   * application.
   * @return value or {@code null} for none
   */
  public java.lang.String getGcrDomain() {
    return gcrDomain;
  }

  /**
   * The Google Container Registry domain used for storing managed build docker images for this
   * application.
   * @param gcrDomain gcrDomain or {@code null} for none
   */
  public Application setGcrDomain(java.lang.String gcrDomain) {
    this.gcrDomain = gcrDomain;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public IdentityAwareProxy getIap() {
    return iap;
  }

  /**
   * @param iap iap or {@code null} for none
   */
  public Application setIap(IdentityAwareProxy iap) {
    this.iap = iap;
    return this;
  }

  /**
   * Identifier of the Application resource. This identifier is equivalent to the project ID of the
   * Google Cloud Platform project where you want to deploy your application. Example: myapp.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Identifier of the Application resource. This identifier is equivalent to the project ID of the
   * Google Cloud Platform project where you want to deploy your application. Example: myapp.
   * @param id id or {@code null} for none
   */
  public Application setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Location from which this application runs. Application instances run out of the data centers in
   * the specified location, which is also where all of the application's end user content is
   * stored.Defaults to us-central.View the list of supported locations
   * (https://cloud.google.com/appengine/docs/locations).
   * @return value or {@code null} for none
   */
  public java.lang.String getLocationId() {
    return locationId;
  }

  /**
   * Location from which this application runs. Application instances run out of the data centers in
   * the specified location, which is also where all of the application's end user content is
   * stored.Defaults to us-central.View the list of supported locations
   * (https://cloud.google.com/appengine/docs/locations).
   * @param locationId locationId or {@code null} for none
   */
  public Application setLocationId(java.lang.String locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * Full path to the Application resource in the API. Example: apps/myapp.@OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Full path to the Application resource in the API. Example: apps/myapp.@OutputOnly
   * @param name name or {@code null} for none
   */
  public Application setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The service account associated with the application. This is the app-level default identity. If
   * no identity provided during create version, Admin API will fallback to this one.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccount() {
    return serviceAccount;
  }

  /**
   * The service account associated with the application. This is the app-level default identity. If
   * no identity provided during create version, Admin API will fallback to this one.
   * @param serviceAccount serviceAccount or {@code null} for none
   */
  public Application setServiceAccount(java.lang.String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * Serving status of this application.
   * @return value or {@code null} for none
   */
  public java.lang.String getServingStatus() {
    return servingStatus;
  }

  /**
   * Serving status of this application.
   * @param servingStatus servingStatus or {@code null} for none
   */
  public Application setServingStatus(java.lang.String servingStatus) {
    this.servingStatus = servingStatus;
    return this;
  }

  @Override
  public Application set(String fieldName, Object value) {
    return (Application) super.set(fieldName, value);
  }

  @Override
  public Application clone() {
    return (Application) super.clone();
  }

}
