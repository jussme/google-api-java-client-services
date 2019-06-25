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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Aggregation of items by status code as of the specified date.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CustomerIndexStats extends com.google.api.client.json.GenericJson {

  /**
   * Date for which statistics were calculated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date date;

  /**
   * Number of items aggregrated by status code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ItemCountByStatus> itemCountByStatus;

  /**
   * Date for which statistics were calculated.
   * @return value or {@code null} for none
   */
  public Date getDate() {
    return date;
  }

  /**
   * Date for which statistics were calculated.
   * @param date date or {@code null} for none
   */
  public CustomerIndexStats setDate(Date date) {
    this.date = date;
    return this;
  }

  /**
   * Number of items aggregrated by status code.
   * @return value or {@code null} for none
   */
  public java.util.List<ItemCountByStatus> getItemCountByStatus() {
    return itemCountByStatus;
  }

  /**
   * Number of items aggregrated by status code.
   * @param itemCountByStatus itemCountByStatus or {@code null} for none
   */
  public CustomerIndexStats setItemCountByStatus(java.util.List<ItemCountByStatus> itemCountByStatus) {
    this.itemCountByStatus = itemCountByStatus;
    return this;
  }

  @Override
  public CustomerIndexStats set(String fieldName, Object value) {
    return (CustomerIndexStats) super.set(fieldName, value);
  }

  @Override
  public CustomerIndexStats clone() {
    return (CustomerIndexStats) super.clone();
  }

}