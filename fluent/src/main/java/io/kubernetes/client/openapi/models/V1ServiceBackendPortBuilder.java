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

public class V1ServiceBackendPortBuilder
    extends V1ServiceBackendPortFluentImpl<V1ServiceBackendPortBuilder>
    implements VisitableBuilder<V1ServiceBackendPort, V1ServiceBackendPortBuilder> {
  public V1ServiceBackendPortBuilder() {
    this(false);
  }

  public V1ServiceBackendPortBuilder(Boolean validationEnabled) {
    this(new V1ServiceBackendPort(), validationEnabled);
  }

  public V1ServiceBackendPortBuilder(V1ServiceBackendPortFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ServiceBackendPortBuilder(
      V1ServiceBackendPortFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1ServiceBackendPort(), validationEnabled);
  }

  public V1ServiceBackendPortBuilder(
      V1ServiceBackendPortFluent<?> fluent, V1ServiceBackendPort instance) {
    this(fluent, instance, false);
  }

  public V1ServiceBackendPortBuilder(
      V1ServiceBackendPortFluent<?> fluent,
      V1ServiceBackendPort instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withName(instance.getName());

    fluent.withNumber(instance.getNumber());

    this.validationEnabled = validationEnabled;
  }

  public V1ServiceBackendPortBuilder(V1ServiceBackendPort instance) {
    this(instance, false);
  }

  public V1ServiceBackendPortBuilder(V1ServiceBackendPort instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withName(instance.getName());

    this.withNumber(instance.getNumber());

    this.validationEnabled = validationEnabled;
  }

  V1ServiceBackendPortFluent<?> fluent;
  Boolean validationEnabled;

  public V1ServiceBackendPort build() {
    V1ServiceBackendPort buildable = new V1ServiceBackendPort();
    buildable.setName(fluent.getName());
    buildable.setNumber(fluent.getNumber());
    return buildable;
  }
}
