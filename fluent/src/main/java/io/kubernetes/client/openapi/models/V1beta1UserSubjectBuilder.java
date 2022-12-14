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

public class V1beta1UserSubjectBuilder
    extends V1beta1UserSubjectFluentImpl<V1beta1UserSubjectBuilder>
    implements VisitableBuilder<V1beta1UserSubject, V1beta1UserSubjectBuilder> {
  public V1beta1UserSubjectBuilder() {
    this(false);
  }

  public V1beta1UserSubjectBuilder(Boolean validationEnabled) {
    this(new V1beta1UserSubject(), validationEnabled);
  }

  public V1beta1UserSubjectBuilder(V1beta1UserSubjectFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1UserSubjectBuilder(V1beta1UserSubjectFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1beta1UserSubject(), validationEnabled);
  }

  public V1beta1UserSubjectBuilder(
      V1beta1UserSubjectFluent<?> fluent, V1beta1UserSubject instance) {
    this(fluent, instance, false);
  }

  public V1beta1UserSubjectBuilder(
      V1beta1UserSubjectFluent<?> fluent, V1beta1UserSubject instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1UserSubjectBuilder(V1beta1UserSubject instance) {
    this(instance, false);
  }

  public V1beta1UserSubjectBuilder(V1beta1UserSubject instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  V1beta1UserSubjectFluent<?> fluent;
  Boolean validationEnabled;

  public V1beta1UserSubject build() {
    V1beta1UserSubject buildable = new V1beta1UserSubject();
    buildable.setName(fluent.getName());
    return buildable;
  }
}
