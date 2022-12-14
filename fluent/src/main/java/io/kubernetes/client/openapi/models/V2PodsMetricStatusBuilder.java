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

public class V2PodsMetricStatusBuilder
    extends V2PodsMetricStatusFluentImpl<V2PodsMetricStatusBuilder>
    implements VisitableBuilder<V2PodsMetricStatus, V2PodsMetricStatusBuilder> {
  public V2PodsMetricStatusBuilder() {
    this(false);
  }

  public V2PodsMetricStatusBuilder(Boolean validationEnabled) {
    this(new V2PodsMetricStatus(), validationEnabled);
  }

  public V2PodsMetricStatusBuilder(V2PodsMetricStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V2PodsMetricStatusBuilder(V2PodsMetricStatusFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V2PodsMetricStatus(), validationEnabled);
  }

  public V2PodsMetricStatusBuilder(
      V2PodsMetricStatusFluent<?> fluent, V2PodsMetricStatus instance) {
    this(fluent, instance, false);
  }

  public V2PodsMetricStatusBuilder(
      V2PodsMetricStatusFluent<?> fluent, V2PodsMetricStatus instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withCurrent(instance.getCurrent());

    fluent.withMetric(instance.getMetric());

    this.validationEnabled = validationEnabled;
  }

  public V2PodsMetricStatusBuilder(V2PodsMetricStatus instance) {
    this(instance, false);
  }

  public V2PodsMetricStatusBuilder(V2PodsMetricStatus instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withCurrent(instance.getCurrent());

    this.withMetric(instance.getMetric());

    this.validationEnabled = validationEnabled;
  }

  V2PodsMetricStatusFluent<?> fluent;
  Boolean validationEnabled;

  public V2PodsMetricStatus build() {
    V2PodsMetricStatus buildable = new V2PodsMetricStatus();
    buildable.setCurrent(fluent.getCurrent());
    buildable.setMetric(fluent.getMetric());
    return buildable;
  }
}
