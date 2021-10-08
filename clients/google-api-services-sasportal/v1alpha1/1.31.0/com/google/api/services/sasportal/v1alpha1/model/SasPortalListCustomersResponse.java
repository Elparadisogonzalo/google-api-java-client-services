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

package com.google.api.services.sasportal.v1alpha1.model;

/**
 * Response for `ListCustomers`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the SAS Portal API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SasPortalListCustomersResponse extends com.google.api.client.json.GenericJson {

  /**
   * The list of customers that match the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SasPortalCustomer> customers;

  static {
    // hack to force ProGuard to consider SasPortalCustomer used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(SasPortalCustomer.class);
  }

  /**
   * A pagination token returned from a previous call to ListCustomers that indicates from where
   * listing should continue. If the field is missing or empty, it means there are no more
   * customers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of customers that match the request.
   * @return value or {@code null} for none
   */
  public java.util.List<SasPortalCustomer> getCustomers() {
    return customers;
  }

  /**
   * The list of customers that match the request.
   * @param customers customers or {@code null} for none
   */
  public SasPortalListCustomersResponse setCustomers(java.util.List<SasPortalCustomer> customers) {
    this.customers = customers;
    return this;
  }

  /**
   * A pagination token returned from a previous call to ListCustomers that indicates from where
   * listing should continue. If the field is missing or empty, it means there are no more
   * customers.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A pagination token returned from a previous call to ListCustomers that indicates from where
   * listing should continue. If the field is missing or empty, it means there are no more
   * customers.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public SasPortalListCustomersResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public SasPortalListCustomersResponse set(String fieldName, Object value) {
    return (SasPortalListCustomersResponse) super.set(fieldName, value);
  }

  @Override
  public SasPortalListCustomersResponse clone() {
    return (SasPortalListCustomersResponse) super.clone();
  }

}
