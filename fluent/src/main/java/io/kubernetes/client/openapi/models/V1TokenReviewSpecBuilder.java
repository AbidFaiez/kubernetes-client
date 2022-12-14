/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;

public class V1TokenReviewSpecBuilder extends V1TokenReviewSpecFluentImpl<V1TokenReviewSpecBuilder>
    implements VisitableBuilder<V1TokenReviewSpec, V1TokenReviewSpecBuilder> {
  public V1TokenReviewSpecBuilder() {
    this(false);
  }

  public V1TokenReviewSpecBuilder(Boolean validationEnabled) {
    this(new V1TokenReviewSpec(), validationEnabled);
  }

  public V1TokenReviewSpecBuilder(V1TokenReviewSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1TokenReviewSpecBuilder(V1TokenReviewSpecFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1TokenReviewSpec(), validationEnabled);
  }

  public V1TokenReviewSpecBuilder(V1TokenReviewSpecFluent<?> fluent, V1TokenReviewSpec instance) {
    this(fluent, instance, false);
  }

  public V1TokenReviewSpecBuilder(
      V1TokenReviewSpecFluent<?> fluent, V1TokenReviewSpec instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAudiences(instance.getAudiences());

    fluent.withToken(instance.getToken());

    this.validationEnabled = validationEnabled;
  }

  public V1TokenReviewSpecBuilder(V1TokenReviewSpec instance) {
    this(instance, false);
  }

  public V1TokenReviewSpecBuilder(V1TokenReviewSpec instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withAudiences(instance.getAudiences());

    this.withToken(instance.getToken());

    this.validationEnabled = validationEnabled;
  }

  V1TokenReviewSpecFluent<?> fluent;
  Boolean validationEnabled;

  public V1TokenReviewSpec build() {
    V1TokenReviewSpec buildable = new V1TokenReviewSpec();
    buildable.setAudiences(fluent.getAudiences());
    buildable.setToken(fluent.getToken());
    return buildable;
  }
}
