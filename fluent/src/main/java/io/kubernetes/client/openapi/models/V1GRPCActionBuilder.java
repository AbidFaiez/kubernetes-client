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

public class V1GRPCActionBuilder extends V1GRPCActionFluentImpl<V1GRPCActionBuilder>
    implements VisitableBuilder<V1GRPCAction, V1GRPCActionBuilder> {
  public V1GRPCActionBuilder() {
    this(false);
  }

  public V1GRPCActionBuilder(Boolean validationEnabled) {
    this(new V1GRPCAction(), validationEnabled);
  }

  public V1GRPCActionBuilder(V1GRPCActionFluent<?> fluent) {
    this(fluent, false);
  }

  public V1GRPCActionBuilder(V1GRPCActionFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1GRPCAction(), validationEnabled);
  }

  public V1GRPCActionBuilder(V1GRPCActionFluent<?> fluent, V1GRPCAction instance) {
    this(fluent, instance, false);
  }

  public V1GRPCActionBuilder(
      V1GRPCActionFluent<?> fluent, V1GRPCAction instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withPort(instance.getPort());

    fluent.withService(instance.getService());

    this.validationEnabled = validationEnabled;
  }

  public V1GRPCActionBuilder(V1GRPCAction instance) {
    this(instance, false);
  }

  public V1GRPCActionBuilder(V1GRPCAction instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withPort(instance.getPort());

    this.withService(instance.getService());

    this.validationEnabled = validationEnabled;
  }

  V1GRPCActionFluent<?> fluent;
  Boolean validationEnabled;

  public V1GRPCAction build() {
    V1GRPCAction buildable = new V1GRPCAction();
    buildable.setPort(fluent.getPort());
    buildable.setService(fluent.getService());
    return buildable;
  }
}
