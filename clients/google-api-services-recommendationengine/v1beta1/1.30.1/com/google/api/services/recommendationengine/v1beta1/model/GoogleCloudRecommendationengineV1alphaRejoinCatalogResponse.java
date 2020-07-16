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

package com.google.api.services.recommendationengine.v1beta1.model;

/**
 * Response message for TriggerCatalogRejoin method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Recommendations AI. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRecommendationengineV1alphaRejoinCatalogResponse extends com.google.api.client.json.GenericJson {

  /**
   * Number of user events that were joined with latest catalog items.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long rejoinedUserEventsCount;

  /**
   * Number of user events that were joined with latest catalog items.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRejoinedUserEventsCount() {
    return rejoinedUserEventsCount;
  }

  /**
   * Number of user events that were joined with latest catalog items.
   * @param rejoinedUserEventsCount rejoinedUserEventsCount or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1alphaRejoinCatalogResponse setRejoinedUserEventsCount(java.lang.Long rejoinedUserEventsCount) {
    this.rejoinedUserEventsCount = rejoinedUserEventsCount;
    return this;
  }

  @Override
  public GoogleCloudRecommendationengineV1alphaRejoinCatalogResponse set(String fieldName, Object value) {
    return (GoogleCloudRecommendationengineV1alphaRejoinCatalogResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRecommendationengineV1alphaRejoinCatalogResponse clone() {
    return (GoogleCloudRecommendationengineV1alphaRejoinCatalogResponse) super.clone();
  }

}
