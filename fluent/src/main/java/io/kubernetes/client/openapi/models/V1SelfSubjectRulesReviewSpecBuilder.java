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

public class V1SelfSubjectRulesReviewSpecBuilder
    extends V1SelfSubjectRulesReviewSpecFluentImpl<V1SelfSubjectRulesReviewSpecBuilder>
    implements VisitableBuilder<V1SelfSubjectRulesReviewSpec, V1SelfSubjectRulesReviewSpecBuilder> {
  public V1SelfSubjectRulesReviewSpecBuilder() {
    this(false);
  }

  public V1SelfSubjectRulesReviewSpecBuilder(Boolean validationEnabled) {
    this(new V1SelfSubjectRulesReviewSpec(), validationEnabled);
  }

  public V1SelfSubjectRulesReviewSpecBuilder(V1SelfSubjectRulesReviewSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1SelfSubjectRulesReviewSpecBuilder(
      V1SelfSubjectRulesReviewSpecFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1SelfSubjectRulesReviewSpec(), validationEnabled);
  }

  public V1SelfSubjectRulesReviewSpecBuilder(
      V1SelfSubjectRulesReviewSpecFluent<?> fluent, V1SelfSubjectRulesReviewSpec instance) {
    this(fluent, instance, false);
  }

  public V1SelfSubjectRulesReviewSpecBuilder(
      V1SelfSubjectRulesReviewSpecFluent<?> fluent,
      V1SelfSubjectRulesReviewSpec instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withNamespace(instance.getNamespace());

    this.validationEnabled = validationEnabled;
  }

  public V1SelfSubjectRulesReviewSpecBuilder(V1SelfSubjectRulesReviewSpec instance) {
    this(instance, false);
  }

  public V1SelfSubjectRulesReviewSpecBuilder(
      V1SelfSubjectRulesReviewSpec instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withNamespace(instance.getNamespace());

    this.validationEnabled = validationEnabled;
  }

  V1SelfSubjectRulesReviewSpecFluent<?> fluent;
  Boolean validationEnabled;

  public V1SelfSubjectRulesReviewSpec build() {
    V1SelfSubjectRulesReviewSpec buildable = new V1SelfSubjectRulesReviewSpec();
    buildable.setNamespace(fluent.getNamespace());
    return buildable;
  }
}
