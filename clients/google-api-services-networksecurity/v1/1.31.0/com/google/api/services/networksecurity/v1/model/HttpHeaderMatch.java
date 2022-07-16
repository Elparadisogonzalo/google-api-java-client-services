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

package com.google.api.services.networksecurity.v1.model;

/**
 * Specification of HTTP header match attributes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Security API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HttpHeaderMatch extends com.google.api.client.json.GenericJson {

  /**
   * Required. The name of the HTTP header to match. For matching against the HTTP request's
   * authority, use a headerMatch with the header name ":authority". For matching a request's
   * method, use the headerName ":method".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String headerName;

  /**
   * Required. The value of the header must match the regular expression specified in regexMatch.
   * For regular expression grammar, please see: en.cppreference.com/w/cpp/regex/ecmascript For
   * matching against a port specified in the HTTP request, use a headerMatch with headerName set to
   * Host and a regular expression that satisfies the RFC2616 Host header's port specifier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String regexMatch;

  /**
   * Required. The name of the HTTP header to match. For matching against the HTTP request's
   * authority, use a headerMatch with the header name ":authority". For matching a request's
   * method, use the headerName ":method".
   * @return value or {@code null} for none
   */
  public java.lang.String getHeaderName() {
    return headerName;
  }

  /**
   * Required. The name of the HTTP header to match. For matching against the HTTP request's
   * authority, use a headerMatch with the header name ":authority". For matching a request's
   * method, use the headerName ":method".
   * @param headerName headerName or {@code null} for none
   */
  public HttpHeaderMatch setHeaderName(java.lang.String headerName) {
    this.headerName = headerName;
    return this;
  }

  /**
   * Required. The value of the header must match the regular expression specified in regexMatch.
   * For regular expression grammar, please see: en.cppreference.com/w/cpp/regex/ecmascript For
   * matching against a port specified in the HTTP request, use a headerMatch with headerName set to
   * Host and a regular expression that satisfies the RFC2616 Host header's port specifier.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegexMatch() {
    return regexMatch;
  }

  /**
   * Required. The value of the header must match the regular expression specified in regexMatch.
   * For regular expression grammar, please see: en.cppreference.com/w/cpp/regex/ecmascript For
   * matching against a port specified in the HTTP request, use a headerMatch with headerName set to
   * Host and a regular expression that satisfies the RFC2616 Host header's port specifier.
   * @param regexMatch regexMatch or {@code null} for none
   */
  public HttpHeaderMatch setRegexMatch(java.lang.String regexMatch) {
    this.regexMatch = regexMatch;
    return this;
  }

  @Override
  public HttpHeaderMatch set(String fieldName, Object value) {
    return (HttpHeaderMatch) super.set(fieldName, value);
  }

  @Override
  public HttpHeaderMatch clone() {
    return (HttpHeaderMatch) super.clone();
  }

}
