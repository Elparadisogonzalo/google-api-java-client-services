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

package com.google.api.services.retail.v2beta.model;

/**
 * Request message for SearchService.Search method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2betaSearchRequest extends com.google.api.client.json.GenericJson {

  /**
   * Boost specification to boost certain products. See more details at this [user
   * guide](https://cloud.google.com/retail/docs/boosting).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2betaSearchRequestBoostSpec boostSpec;

  /**
   * The branch resource name, such as
   * `projects/locations/global/catalogs/default_catalog/branches/0`. Use "default_branch" as the
   * branch ID or leave this field empty, to search products under the default branch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String branch;

  /**
   * The filter applied to every search request when quality improvement such as query expansion is
   * needed. For example, if a query does not have enough results, an expanded query with
   * SearchRequest.canonical_filter will be returned as a supplement of the original query. This
   * field is strongly recommended to achieve high search quality. See SearchRequest.filter for more
   * details about filter syntax.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String canonicalFilter;

  /**
   * The specification for dynamically generated facets. Notice that only textual facets can be
   * dynamically generated. This feature requires additional allowlisting. Contact Retail Search
   * support team if you are interested in using dynamic facet feature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2betaSearchRequestDynamicFacetSpec dynamicFacetSpec;

  /**
   * Facet specifications for faceted search. If empty, no facets are returned. A maximum of 100
   * values are allowed. Otherwise, an INVALID_ARGUMENT error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRetailV2betaSearchRequestFacetSpec> facetSpecs;

  /**
   * The filter syntax consists of an expression language for constructing a predicate from one or
   * more fields of the products being filtered. Filter expression is case-sensitive. See more
   * details at this [user guide](https://cloud.google.com/retail/docs/filter-and-order#filter). If
   * this field is unrecognizable, an INVALID_ARGUMENT is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filter;

  /**
   * A 0-indexed integer that specifies the current offset (that is, starting result location,
   * amongst the Products deemed by the API as relevant) in search results. This field is only
   * considered if page_token is unset. If this field is negative, an INVALID_ARGUMENT is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer offset;

  /**
   * The order in which products are returned. Products can be ordered by a field in an Product
   * object. Leave it unset if ordered by relevance. OrderBy expression is case-sensitive. See more
   * details at this [user guide](https://cloud.google.com/retail/docs/filter-and-order#order). If
   * this field is unrecognizable, an INVALID_ARGUMENT is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String orderBy;

  /**
   * The categories associated with a category page. Required for category navigation queries to
   * achieve good search quality. The format should be the same as UserEvent.page_categories; To
   * represent full path of category, use '>' sign to separate different hierarchies. If '>' is part
   * of the category name, please replace it with other character(s). Category pages include special
   * pages such as sales or promotions. For instance, a special sale page may have the category
   * hierarchy: "pageCategories" : ["Sales > 2017 Black Friday Deals"].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> pageCategories;

  /**
   * Maximum number of Products to return. If unspecified, defaults to a reasonable value. The
   * maximum allowed value is 120. Values above 120 will be coerced to 120. If this field is
   * negative, an INVALID_ARGUMENT is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pageSize;

  /**
   * A page token SearchResponse.next_page_token, received from a previous SearchService.Search
   * call. Provide this to retrieve the subsequent page. When paginating, all other parameters
   * provided to SearchService.Search must match the call that provided the page token. Otherwise,
   * an INVALID_ARGUMENT error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageToken;

  /**
   * Raw search query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String query;

  /**
   * The query expansion specification that specifies the conditions under which query expansion
   * will occur. See more details at this [user guide](https://cloud.google.com/retail/docs/result-
   * size#query_expansion).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2betaSearchRequestQueryExpansionSpec queryExpansionSpec;

  /**
   * User information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2betaUserInfo userInfo;

  /**
   * The keys to fetch and rollup the matching variant Products attributes. The attributes from all
   * the matching variant Products are merged and de-duplicated. Notice that rollup variant Products
   * attributes will lead to extra query latency. Maximum number of keys is 10. For FulfillmentInfo,
   * a fulfillment type and a fulfillment ID must be provided in the format of
   * "fulfillmentType.fulfillmentId". E.g., in "pickupInStore.store123", "pickupInStore" is
   * fulfillment type and "store123" is the store ID. Supported keys are: * colorFamilies * price *
   * originalPrice * discount * attributes.key, where key is any key in the Product.attributes map.
   * * pickupInStore.id, where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type "pickup-
   * in-store". * shipToStore.id, where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type
   * "ship-to-store". * sameDayDelivery.id, where id is any FulfillmentInfo.place_ids for
   * FulfillmentInfo.type "same-day-delivery". * nextDayDelivery.id, where id is any
   * FulfillmentInfo.place_ids for FulfillmentInfo.type "next-day-delivery". *
   * customFulfillment1.id, where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type
   * "custom-type-1". * customFulfillment2.id, where id is any FulfillmentInfo.place_ids for
   * FulfillmentInfo.type "custom-type-2". * customFulfillment3.id, where id is any
   * FulfillmentInfo.place_ids for FulfillmentInfo.type "custom-type-3". * customFulfillment4.id,
   * where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type "custom-type-4". *
   * customFulfillment5.id, where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type
   * "custom-type-5". If this field is set to an invalid value other than these, an INVALID_ARGUMENT
   * error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> variantRollupKeys;

  /**
   * Required. A unique identifier for tracking visitors. For example, this could be implemented
   * with an HTTP cookie, which should be able to uniquely identify a visitor on a single device.
   * This unique identifier should not change if the visitor logs in or out of the website. The
   * field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an
   * INVALID_ARGUMENT error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String visitorId;

  /**
   * Boost specification to boost certain products. See more details at this [user
   * guide](https://cloud.google.com/retail/docs/boosting).
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchRequestBoostSpec getBoostSpec() {
    return boostSpec;
  }

  /**
   * Boost specification to boost certain products. See more details at this [user
   * guide](https://cloud.google.com/retail/docs/boosting).
   * @param boostSpec boostSpec or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchRequest setBoostSpec(GoogleCloudRetailV2betaSearchRequestBoostSpec boostSpec) {
    this.boostSpec = boostSpec;
    return this;
  }

  /**
   * The branch resource name, such as
   * `projects/locations/global/catalogs/default_catalog/branches/0`. Use "default_branch" as the
   * branch ID or leave this field empty, to search products under the default branch.
   * @return value or {@code null} for none
   */
  public java.lang.String getBranch() {
    return branch;
  }

  /**
   * The branch resource name, such as
   * `projects/locations/global/catalogs/default_catalog/branches/0`. Use "default_branch" as the
   * branch ID or leave this field empty, to search products under the default branch.
   * @param branch branch or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchRequest setBranch(java.lang.String branch) {
    this.branch = branch;
    return this;
  }

  /**
   * The filter applied to every search request when quality improvement such as query expansion is
   * needed. For example, if a query does not have enough results, an expanded query with
   * SearchRequest.canonical_filter will be returned as a supplement of the original query. This
   * field is strongly recommended to achieve high search quality. See SearchRequest.filter for more
   * details about filter syntax.
   * @return value or {@code null} for none
   */
  public java.lang.String getCanonicalFilter() {
    return canonicalFilter;
  }

  /**
   * The filter applied to every search request when quality improvement such as query expansion is
   * needed. For example, if a query does not have enough results, an expanded query with
   * SearchRequest.canonical_filter will be returned as a supplement of the original query. This
   * field is strongly recommended to achieve high search quality. See SearchRequest.filter for more
   * details about filter syntax.
   * @param canonicalFilter canonicalFilter or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchRequest setCanonicalFilter(java.lang.String canonicalFilter) {
    this.canonicalFilter = canonicalFilter;
    return this;
  }

  /**
   * The specification for dynamically generated facets. Notice that only textual facets can be
   * dynamically generated. This feature requires additional allowlisting. Contact Retail Search
   * support team if you are interested in using dynamic facet feature.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchRequestDynamicFacetSpec getDynamicFacetSpec() {
    return dynamicFacetSpec;
  }

  /**
   * The specification for dynamically generated facets. Notice that only textual facets can be
   * dynamically generated. This feature requires additional allowlisting. Contact Retail Search
   * support team if you are interested in using dynamic facet feature.
   * @param dynamicFacetSpec dynamicFacetSpec or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchRequest setDynamicFacetSpec(GoogleCloudRetailV2betaSearchRequestDynamicFacetSpec dynamicFacetSpec) {
    this.dynamicFacetSpec = dynamicFacetSpec;
    return this;
  }

  /**
   * Facet specifications for faceted search. If empty, no facets are returned. A maximum of 100
   * values are allowed. Otherwise, an INVALID_ARGUMENT error is returned.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRetailV2betaSearchRequestFacetSpec> getFacetSpecs() {
    return facetSpecs;
  }

  /**
   * Facet specifications for faceted search. If empty, no facets are returned. A maximum of 100
   * values are allowed. Otherwise, an INVALID_ARGUMENT error is returned.
   * @param facetSpecs facetSpecs or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchRequest setFacetSpecs(java.util.List<GoogleCloudRetailV2betaSearchRequestFacetSpec> facetSpecs) {
    this.facetSpecs = facetSpecs;
    return this;
  }

  /**
   * The filter syntax consists of an expression language for constructing a predicate from one or
   * more fields of the products being filtered. Filter expression is case-sensitive. See more
   * details at this [user guide](https://cloud.google.com/retail/docs/filter-and-order#filter). If
   * this field is unrecognizable, an INVALID_ARGUMENT is returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * The filter syntax consists of an expression language for constructing a predicate from one or
   * more fields of the products being filtered. Filter expression is case-sensitive. See more
   * details at this [user guide](https://cloud.google.com/retail/docs/filter-and-order#filter). If
   * this field is unrecognizable, an INVALID_ARGUMENT is returned.
   * @param filter filter or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchRequest setFilter(java.lang.String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * A 0-indexed integer that specifies the current offset (that is, starting result location,
   * amongst the Products deemed by the API as relevant) in search results. This field is only
   * considered if page_token is unset. If this field is negative, an INVALID_ARGUMENT is returned.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getOffset() {
    return offset;
  }

  /**
   * A 0-indexed integer that specifies the current offset (that is, starting result location,
   * amongst the Products deemed by the API as relevant) in search results. This field is only
   * considered if page_token is unset. If this field is negative, an INVALID_ARGUMENT is returned.
   * @param offset offset or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchRequest setOffset(java.lang.Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * The order in which products are returned. Products can be ordered by a field in an Product
   * object. Leave it unset if ordered by relevance. OrderBy expression is case-sensitive. See more
   * details at this [user guide](https://cloud.google.com/retail/docs/filter-and-order#order). If
   * this field is unrecognizable, an INVALID_ARGUMENT is returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrderBy() {
    return orderBy;
  }

  /**
   * The order in which products are returned. Products can be ordered by a field in an Product
   * object. Leave it unset if ordered by relevance. OrderBy expression is case-sensitive. See more
   * details at this [user guide](https://cloud.google.com/retail/docs/filter-and-order#order). If
   * this field is unrecognizable, an INVALID_ARGUMENT is returned.
   * @param orderBy orderBy or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchRequest setOrderBy(java.lang.String orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  /**
   * The categories associated with a category page. Required for category navigation queries to
   * achieve good search quality. The format should be the same as UserEvent.page_categories; To
   * represent full path of category, use '>' sign to separate different hierarchies. If '>' is part
   * of the category name, please replace it with other character(s). Category pages include special
   * pages such as sales or promotions. For instance, a special sale page may have the category
   * hierarchy: "pageCategories" : ["Sales > 2017 Black Friday Deals"].
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPageCategories() {
    return pageCategories;
  }

  /**
   * The categories associated with a category page. Required for category navigation queries to
   * achieve good search quality. The format should be the same as UserEvent.page_categories; To
   * represent full path of category, use '>' sign to separate different hierarchies. If '>' is part
   * of the category name, please replace it with other character(s). Category pages include special
   * pages such as sales or promotions. For instance, a special sale page may have the category
   * hierarchy: "pageCategories" : ["Sales > 2017 Black Friday Deals"].
   * @param pageCategories pageCategories or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchRequest setPageCategories(java.util.List<java.lang.String> pageCategories) {
    this.pageCategories = pageCategories;
    return this;
  }

  /**
   * Maximum number of Products to return. If unspecified, defaults to a reasonable value. The
   * maximum allowed value is 120. Values above 120 will be coerced to 120. If this field is
   * negative, an INVALID_ARGUMENT is returned.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPageSize() {
    return pageSize;
  }

  /**
   * Maximum number of Products to return. If unspecified, defaults to a reasonable value. The
   * maximum allowed value is 120. Values above 120 will be coerced to 120. If this field is
   * negative, an INVALID_ARGUMENT is returned.
   * @param pageSize pageSize or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchRequest setPageSize(java.lang.Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * A page token SearchResponse.next_page_token, received from a previous SearchService.Search
   * call. Provide this to retrieve the subsequent page. When paginating, all other parameters
   * provided to SearchService.Search must match the call that provided the page token. Otherwise,
   * an INVALID_ARGUMENT error is returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageToken() {
    return pageToken;
  }

  /**
   * A page token SearchResponse.next_page_token, received from a previous SearchService.Search
   * call. Provide this to retrieve the subsequent page. When paginating, all other parameters
   * provided to SearchService.Search must match the call that provided the page token. Otherwise,
   * an INVALID_ARGUMENT error is returned.
   * @param pageToken pageToken or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchRequest setPageToken(java.lang.String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * Raw search query.
   * @return value or {@code null} for none
   */
  public java.lang.String getQuery() {
    return query;
  }

  /**
   * Raw search query.
   * @param query query or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchRequest setQuery(java.lang.String query) {
    this.query = query;
    return this;
  }

  /**
   * The query expansion specification that specifies the conditions under which query expansion
   * will occur. See more details at this [user guide](https://cloud.google.com/retail/docs/result-
   * size#query_expansion).
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchRequestQueryExpansionSpec getQueryExpansionSpec() {
    return queryExpansionSpec;
  }

  /**
   * The query expansion specification that specifies the conditions under which query expansion
   * will occur. See more details at this [user guide](https://cloud.google.com/retail/docs/result-
   * size#query_expansion).
   * @param queryExpansionSpec queryExpansionSpec or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchRequest setQueryExpansionSpec(GoogleCloudRetailV2betaSearchRequestQueryExpansionSpec queryExpansionSpec) {
    this.queryExpansionSpec = queryExpansionSpec;
    return this;
  }

  /**
   * User information.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2betaUserInfo getUserInfo() {
    return userInfo;
  }

  /**
   * User information.
   * @param userInfo userInfo or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchRequest setUserInfo(GoogleCloudRetailV2betaUserInfo userInfo) {
    this.userInfo = userInfo;
    return this;
  }

  /**
   * The keys to fetch and rollup the matching variant Products attributes. The attributes from all
   * the matching variant Products are merged and de-duplicated. Notice that rollup variant Products
   * attributes will lead to extra query latency. Maximum number of keys is 10. For FulfillmentInfo,
   * a fulfillment type and a fulfillment ID must be provided in the format of
   * "fulfillmentType.fulfillmentId". E.g., in "pickupInStore.store123", "pickupInStore" is
   * fulfillment type and "store123" is the store ID. Supported keys are: * colorFamilies * price *
   * originalPrice * discount * attributes.key, where key is any key in the Product.attributes map.
   * * pickupInStore.id, where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type "pickup-
   * in-store". * shipToStore.id, where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type
   * "ship-to-store". * sameDayDelivery.id, where id is any FulfillmentInfo.place_ids for
   * FulfillmentInfo.type "same-day-delivery". * nextDayDelivery.id, where id is any
   * FulfillmentInfo.place_ids for FulfillmentInfo.type "next-day-delivery". *
   * customFulfillment1.id, where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type
   * "custom-type-1". * customFulfillment2.id, where id is any FulfillmentInfo.place_ids for
   * FulfillmentInfo.type "custom-type-2". * customFulfillment3.id, where id is any
   * FulfillmentInfo.place_ids for FulfillmentInfo.type "custom-type-3". * customFulfillment4.id,
   * where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type "custom-type-4". *
   * customFulfillment5.id, where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type
   * "custom-type-5". If this field is set to an invalid value other than these, an INVALID_ARGUMENT
   * error is returned.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getVariantRollupKeys() {
    return variantRollupKeys;
  }

  /**
   * The keys to fetch and rollup the matching variant Products attributes. The attributes from all
   * the matching variant Products are merged and de-duplicated. Notice that rollup variant Products
   * attributes will lead to extra query latency. Maximum number of keys is 10. For FulfillmentInfo,
   * a fulfillment type and a fulfillment ID must be provided in the format of
   * "fulfillmentType.fulfillmentId". E.g., in "pickupInStore.store123", "pickupInStore" is
   * fulfillment type and "store123" is the store ID. Supported keys are: * colorFamilies * price *
   * originalPrice * discount * attributes.key, where key is any key in the Product.attributes map.
   * * pickupInStore.id, where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type "pickup-
   * in-store". * shipToStore.id, where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type
   * "ship-to-store". * sameDayDelivery.id, where id is any FulfillmentInfo.place_ids for
   * FulfillmentInfo.type "same-day-delivery". * nextDayDelivery.id, where id is any
   * FulfillmentInfo.place_ids for FulfillmentInfo.type "next-day-delivery". *
   * customFulfillment1.id, where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type
   * "custom-type-1". * customFulfillment2.id, where id is any FulfillmentInfo.place_ids for
   * FulfillmentInfo.type "custom-type-2". * customFulfillment3.id, where id is any
   * FulfillmentInfo.place_ids for FulfillmentInfo.type "custom-type-3". * customFulfillment4.id,
   * where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type "custom-type-4". *
   * customFulfillment5.id, where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type
   * "custom-type-5". If this field is set to an invalid value other than these, an INVALID_ARGUMENT
   * error is returned.
   * @param variantRollupKeys variantRollupKeys or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchRequest setVariantRollupKeys(java.util.List<java.lang.String> variantRollupKeys) {
    this.variantRollupKeys = variantRollupKeys;
    return this;
  }

  /**
   * Required. A unique identifier for tracking visitors. For example, this could be implemented
   * with an HTTP cookie, which should be able to uniquely identify a visitor on a single device.
   * This unique identifier should not change if the visitor logs in or out of the website. The
   * field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an
   * INVALID_ARGUMENT error is returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getVisitorId() {
    return visitorId;
  }

  /**
   * Required. A unique identifier for tracking visitors. For example, this could be implemented
   * with an HTTP cookie, which should be able to uniquely identify a visitor on a single device.
   * This unique identifier should not change if the visitor logs in or out of the website. The
   * field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an
   * INVALID_ARGUMENT error is returned.
   * @param visitorId visitorId or {@code null} for none
   */
  public GoogleCloudRetailV2betaSearchRequest setVisitorId(java.lang.String visitorId) {
    this.visitorId = visitorId;
    return this;
  }

  @Override
  public GoogleCloudRetailV2betaSearchRequest set(String fieldName, Object value) {
    return (GoogleCloudRetailV2betaSearchRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2betaSearchRequest clone() {
    return (GoogleCloudRetailV2betaSearchRequest) super.clone();
  }

}
