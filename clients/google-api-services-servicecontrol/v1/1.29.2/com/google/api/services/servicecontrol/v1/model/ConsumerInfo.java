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

package com.google.api.services.servicecontrol.v1.model;

/**
 * `ConsumerInfo` provides information about the consumer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Control API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConsumerInfo extends com.google.api.client.json.GenericJson {

  /**
   * The consumer identity number, can be Google cloud project number, folder number or organization
   * number e.g. 1234567890. A value of 0 indicates no consumer number is found.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long consumerNumber;

  /**
   * The Google cloud project number, e.g. 1234567890. A value of 0 indicates no project number is
   * found.
   *
   * NOTE: This field is deprecated after Chemist support flexible consumer id. New code should not
   * depend on this field anymore.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long projectNumber;

  /**
   * The type of the consumer which should have been defined in [Google Resource
   * Manager](https://cloud.google.com/resource-manager/).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The consumer identity number, can be Google cloud project number, folder number or organization
   * number e.g. 1234567890. A value of 0 indicates no consumer number is found.
   * @return value or {@code null} for none
   */
  public java.lang.Long getConsumerNumber() {
    return consumerNumber;
  }

  /**
   * The consumer identity number, can be Google cloud project number, folder number or organization
   * number e.g. 1234567890. A value of 0 indicates no consumer number is found.
   * @param consumerNumber consumerNumber or {@code null} for none
   */
  public ConsumerInfo setConsumerNumber(java.lang.Long consumerNumber) {
    this.consumerNumber = consumerNumber;
    return this;
  }

  /**
   * The Google cloud project number, e.g. 1234567890. A value of 0 indicates no project number is
   * found.
   *
   * NOTE: This field is deprecated after Chemist support flexible consumer id. New code should not
   * depend on this field anymore.
   * @return value or {@code null} for none
   */
  public java.lang.Long getProjectNumber() {
    return projectNumber;
  }

  /**
   * The Google cloud project number, e.g. 1234567890. A value of 0 indicates no project number is
   * found.
   *
   * NOTE: This field is deprecated after Chemist support flexible consumer id. New code should not
   * depend on this field anymore.
   * @param projectNumber projectNumber or {@code null} for none
   */
  public ConsumerInfo setProjectNumber(java.lang.Long projectNumber) {
    this.projectNumber = projectNumber;
    return this;
  }

  /**
   * The type of the consumer which should have been defined in [Google Resource
   * Manager](https://cloud.google.com/resource-manager/).
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the consumer which should have been defined in [Google Resource
   * Manager](https://cloud.google.com/resource-manager/).
   * @param type type or {@code null} for none
   */
  public ConsumerInfo setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public ConsumerInfo set(String fieldName, Object value) {
    return (ConsumerInfo) super.set(fieldName, value);
  }

  @Override
  public ConsumerInfo clone() {
    return (ConsumerInfo) super.clone();
  }

}