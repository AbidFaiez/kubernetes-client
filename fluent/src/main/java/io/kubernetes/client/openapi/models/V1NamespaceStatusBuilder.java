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

public class V1NamespaceStatusBuilder extends V1NamespaceStatusFluentImpl<V1NamespaceStatusBuilder>
    implements VisitableBuilder<V1NamespaceStatus, V1NamespaceStatusBuilder> {
  public V1NamespaceStatusBuilder() {
    this(false);
  }

  public V1NamespaceStatusBuilder(Boolean validationEnabled) {
    this(new V1NamespaceStatus(), validationEnabled);
  }

  public V1NamespaceStatusBuilder(V1NamespaceStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1NamespaceStatusBuilder(V1NamespaceStatusFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1NamespaceStatus(), validationEnabled);
  }

  public V1NamespaceStatusBuilder(V1NamespaceStatusFluent<?> fluent, V1NamespaceStatus instance) {
    this(fluent, instance, false);
  }

  public V1NamespaceStatusBuilder(
      V1NamespaceStatusFluent<?> fluent, V1NamespaceStatus instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withConditions(instance.getConditions());

    fluent.withPhase(instance.getPhase());

    this.validationEnabled = validationEnabled;
  }

  public V1NamespaceStatusBuilder(V1NamespaceStatus instance) {
    this(instance, false);
  }

  public V1NamespaceStatusBuilder(V1NamespaceStatus instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withConditions(instance.getConditions());

    this.withPhase(instance.getPhase());

    this.validationEnabled = validationEnabled;
  }

  V1NamespaceStatusFluent<?> fluent;
  Boolean validationEnabled;

  public V1NamespaceStatus build() {
    V1NamespaceStatus buildable = new V1NamespaceStatus();
    buildable.setConditions(fluent.getConditions());
    buildable.setPhase(fluent.getPhase());
    return buildable;
  }
}
