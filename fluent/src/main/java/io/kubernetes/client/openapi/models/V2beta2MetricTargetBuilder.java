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

public class V2beta2MetricTargetBuilder
    extends V2beta2MetricTargetFluentImpl<V2beta2MetricTargetBuilder>
    implements VisitableBuilder<V2beta2MetricTarget, V2beta2MetricTargetBuilder> {
  public V2beta2MetricTargetBuilder() {
    this(false);
  }

  public V2beta2MetricTargetBuilder(Boolean validationEnabled) {
    this(new V2beta2MetricTarget(), validationEnabled);
  }

  public V2beta2MetricTargetBuilder(V2beta2MetricTargetFluent<?> fluent) {
    this(fluent, false);
  }

  public V2beta2MetricTargetBuilder(
      V2beta2MetricTargetFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V2beta2MetricTarget(), validationEnabled);
  }

  public V2beta2MetricTargetBuilder(
      V2beta2MetricTargetFluent<?> fluent, V2beta2MetricTarget instance) {
    this(fluent, instance, false);
  }

  public V2beta2MetricTargetBuilder(
      V2beta2MetricTargetFluent<?> fluent,
      V2beta2MetricTarget instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAverageUtilization(instance.getAverageUtilization());

    fluent.withAverageValue(instance.getAverageValue());

    fluent.withType(instance.getType());

    fluent.withValue(instance.getValue());

    this.validationEnabled = validationEnabled;
  }

  public V2beta2MetricTargetBuilder(V2beta2MetricTarget instance) {
    this(instance, false);
  }

  public V2beta2MetricTargetBuilder(V2beta2MetricTarget instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withAverageUtilization(instance.getAverageUtilization());

    this.withAverageValue(instance.getAverageValue());

    this.withType(instance.getType());

    this.withValue(instance.getValue());

    this.validationEnabled = validationEnabled;
  }

  V2beta2MetricTargetFluent<?> fluent;
  Boolean validationEnabled;

  public V2beta2MetricTarget build() {
    V2beta2MetricTarget buildable = new V2beta2MetricTarget();
    buildable.setAverageUtilization(fluent.getAverageUtilization());
    buildable.setAverageValue(fluent.getAverageValue());
    buildable.setType(fluent.getType());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
}
