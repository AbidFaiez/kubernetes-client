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

public class V1ClusterRoleBuilder extends V1ClusterRoleFluentImpl<V1ClusterRoleBuilder>
    implements VisitableBuilder<V1ClusterRole, V1ClusterRoleBuilder> {
  public V1ClusterRoleBuilder() {
    this(false);
  }

  public V1ClusterRoleBuilder(Boolean validationEnabled) {
    this(new V1ClusterRole(), validationEnabled);
  }

  public V1ClusterRoleBuilder(V1ClusterRoleFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ClusterRoleBuilder(V1ClusterRoleFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1ClusterRole(), validationEnabled);
  }

  public V1ClusterRoleBuilder(V1ClusterRoleFluent<?> fluent, V1ClusterRole instance) {
    this(fluent, instance, false);
  }

  public V1ClusterRoleBuilder(
      V1ClusterRoleFluent<?> fluent, V1ClusterRole instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAggregationRule(instance.getAggregationRule());

    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withRules(instance.getRules());

    this.validationEnabled = validationEnabled;
  }

  public V1ClusterRoleBuilder(V1ClusterRole instance) {
    this(instance, false);
  }

  public V1ClusterRoleBuilder(V1ClusterRole instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withAggregationRule(instance.getAggregationRule());

    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withRules(instance.getRules());

    this.validationEnabled = validationEnabled;
  }

  V1ClusterRoleFluent<?> fluent;
  Boolean validationEnabled;

  public V1ClusterRole build() {
    V1ClusterRole buildable = new V1ClusterRole();
    buildable.setAggregationRule(fluent.getAggregationRule());
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setRules(fluent.getRules());
    return buildable;
  }
}
