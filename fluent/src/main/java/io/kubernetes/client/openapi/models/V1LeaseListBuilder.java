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

public class V1LeaseListBuilder extends V1LeaseListFluentImpl<V1LeaseListBuilder>
    implements VisitableBuilder<V1LeaseList, V1LeaseListBuilder> {
  public V1LeaseListBuilder() {
    this(false);
  }

  public V1LeaseListBuilder(Boolean validationEnabled) {
    this(new V1LeaseList(), validationEnabled);
  }

  public V1LeaseListBuilder(V1LeaseListFluent<?> fluent) {
    this(fluent, false);
  }

  public V1LeaseListBuilder(V1LeaseListFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1LeaseList(), validationEnabled);
  }

  public V1LeaseListBuilder(V1LeaseListFluent<?> fluent, V1LeaseList instance) {
    this(fluent, instance, false);
  }

  public V1LeaseListBuilder(
      V1LeaseListFluent<?> fluent, V1LeaseList instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled;
  }

  public V1LeaseListBuilder(V1LeaseList instance) {
    this(instance, false);
  }

  public V1LeaseListBuilder(V1LeaseList instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled;
  }

  V1LeaseListFluent<?> fluent;
  Boolean validationEnabled;

  public V1LeaseList build() {
    V1LeaseList buildable = new V1LeaseList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
}
