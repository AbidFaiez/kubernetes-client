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

public class V2ResourceMetricStatusBuilder
    extends V2ResourceMetricStatusFluentImpl<V2ResourceMetricStatusBuilder>
    implements VisitableBuilder<V2ResourceMetricStatus, V2ResourceMetricStatusBuilder> {
  public V2ResourceMetricStatusBuilder() {
    this(false);
  }

  public V2ResourceMetricStatusBuilder(Boolean validationEnabled) {
    this(new V2ResourceMetricStatus(), validationEnabled);
  }

  public V2ResourceMetricStatusBuilder(V2ResourceMetricStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V2ResourceMetricStatusBuilder(
      V2ResourceMetricStatusFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V2ResourceMetricStatus(), validationEnabled);
  }

  public V2ResourceMetricStatusBuilder(
      V2ResourceMetricStatusFluent<?> fluent, V2ResourceMetricStatus instance) {
    this(fluent, instance, false);
  }

  public V2ResourceMetricStatusBuilder(
      V2ResourceMetricStatusFluent<?> fluent,
      V2ResourceMetricStatus instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withCurrent(instance.getCurrent());

    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  public V2ResourceMetricStatusBuilder(V2ResourceMetricStatus instance) {
    this(instance, false);
  }

  public V2ResourceMetricStatusBuilder(V2ResourceMetricStatus instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withCurrent(instance.getCurrent());

    this.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  V2ResourceMetricStatusFluent<?> fluent;
  Boolean validationEnabled;

  public V2ResourceMetricStatus build() {
    V2ResourceMetricStatus buildable = new V2ResourceMetricStatus();
    buildable.setCurrent(fluent.getCurrent());
    buildable.setName(fluent.getName());
    return buildable;
  }
}
