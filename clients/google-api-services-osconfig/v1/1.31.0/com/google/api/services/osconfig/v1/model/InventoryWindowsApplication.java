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

package com.google.api.services.osconfig.v1.model;

/**
 * Contains information about a Windows application that is retrieved from the Windows Registry. For
 * more information about these fields, see: https://docs.microsoft.com/en-us/windows/win32/msi
 * /uninstall-registry-key
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InventoryWindowsApplication extends com.google.api.client.json.GenericJson {

  /**
   * The name of the application or product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The version of the product or application in string format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayVersion;

  /**
   * The internet address for technical support.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String helpLink;

  /**
   * The last time this product received service. The value of this property is replaced each time a
   * patch is applied or removed from the product or the command-line option is used to repair the
   * product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date installDate;

  /**
   * The name of the manufacturer for the product or application.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String publisher;

  /**
   * The name of the application or product.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The name of the application or product.
   * @param displayName displayName or {@code null} for none
   */
  public InventoryWindowsApplication setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The version of the product or application in string format.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayVersion() {
    return displayVersion;
  }

  /**
   * The version of the product or application in string format.
   * @param displayVersion displayVersion or {@code null} for none
   */
  public InventoryWindowsApplication setDisplayVersion(java.lang.String displayVersion) {
    this.displayVersion = displayVersion;
    return this;
  }

  /**
   * The internet address for technical support.
   * @return value or {@code null} for none
   */
  public java.lang.String getHelpLink() {
    return helpLink;
  }

  /**
   * The internet address for technical support.
   * @param helpLink helpLink or {@code null} for none
   */
  public InventoryWindowsApplication setHelpLink(java.lang.String helpLink) {
    this.helpLink = helpLink;
    return this;
  }

  /**
   * The last time this product received service. The value of this property is replaced each time a
   * patch is applied or removed from the product or the command-line option is used to repair the
   * product.
   * @return value or {@code null} for none
   */
  public Date getInstallDate() {
    return installDate;
  }

  /**
   * The last time this product received service. The value of this property is replaced each time a
   * patch is applied or removed from the product or the command-line option is used to repair the
   * product.
   * @param installDate installDate or {@code null} for none
   */
  public InventoryWindowsApplication setInstallDate(Date installDate) {
    this.installDate = installDate;
    return this;
  }

  /**
   * The name of the manufacturer for the product or application.
   * @return value or {@code null} for none
   */
  public java.lang.String getPublisher() {
    return publisher;
  }

  /**
   * The name of the manufacturer for the product or application.
   * @param publisher publisher or {@code null} for none
   */
  public InventoryWindowsApplication setPublisher(java.lang.String publisher) {
    this.publisher = publisher;
    return this;
  }

  @Override
  public InventoryWindowsApplication set(String fieldName, Object value) {
    return (InventoryWindowsApplication) super.set(fieldName, value);
  }

  @Override
  public InventoryWindowsApplication clone() {
    return (InventoryWindowsApplication) super.clone();
  }

}
