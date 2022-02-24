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

package com.google.api.services.content.model;

/**
 * The tax settings of a merchant account. All methods require the admin role.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AccountTax extends com.google.api.client.json.GenericJson {

  /**
   * Required. The ID of the account to which these account tax settings belong.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger accountId;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "`content#accountTax`".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Tax rules. Updating the tax rules will enable "US" taxes (not reversible). Defining no rules is
   * equivalent to not charging tax at all.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AccountTaxTaxRule> rules;

  /**
   * Required. The ID of the account to which these account tax settings belong.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getAccountId() {
    return accountId;
  }

  /**
   * Required. The ID of the account to which these account tax settings belong.
   * @param accountId accountId or {@code null} for none
   */
  public AccountTax setAccountId(java.math.BigInteger accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "`content#accountTax`".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "`content#accountTax`".
   * @param kind kind or {@code null} for none
   */
  public AccountTax setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Tax rules. Updating the tax rules will enable "US" taxes (not reversible). Defining no rules is
   * equivalent to not charging tax at all.
   * @return value or {@code null} for none
   */
  public java.util.List<AccountTaxTaxRule> getRules() {
    return rules;
  }

  /**
   * Tax rules. Updating the tax rules will enable "US" taxes (not reversible). Defining no rules is
   * equivalent to not charging tax at all.
   * @param rules rules or {@code null} for none
   */
  public AccountTax setRules(java.util.List<AccountTaxTaxRule> rules) {
    this.rules = rules;
    return this;
  }

  @Override
  public AccountTax set(String fieldName, Object value) {
    return (AccountTax) super.set(fieldName, value);
  }

  @Override
  public AccountTax clone() {
    return (AccountTax) super.clone();
  }

}
