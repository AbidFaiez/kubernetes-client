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

public class V2HorizontalPodAutoscalerBehaviorBuilder
    extends V2HorizontalPodAutoscalerBehaviorFluentImpl<V2HorizontalPodAutoscalerBehaviorBuilder>
    implements VisitableBuilder<
        V2HorizontalPodAutoscalerBehavior, V2HorizontalPodAutoscalerBehaviorBuilder> {
  public V2HorizontalPodAutoscalerBehaviorBuilder() {
    this(false);
  }

  public V2HorizontalPodAutoscalerBehaviorBuilder(Boolean validationEnabled) {
    this(new V2HorizontalPodAutoscalerBehavior(), validationEnabled);
  }

  public V2HorizontalPodAutoscalerBehaviorBuilder(
      V2HorizontalPodAutoscalerBehaviorFluent<?> fluent) {
    this(fluent, false);
  }

  public V2HorizontalPodAutoscalerBehaviorBuilder(
      V2HorizontalPodAutoscalerBehaviorFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V2HorizontalPodAutoscalerBehavior(), validationEnabled);
  }

  public V2HorizontalPodAutoscalerBehaviorBuilder(
      V2HorizontalPodAutoscalerBehaviorFluent<?> fluent,
      V2HorizontalPodAutoscalerBehavior instance) {
    this(fluent, instance, false);
  }

  public V2HorizontalPodAutoscalerBehaviorBuilder(
      V2HorizontalPodAutoscalerBehaviorFluent<?> fluent,
      V2HorizontalPodAutoscalerBehavior instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withScaleDown(instance.getScaleDown());

    fluent.withScaleUp(instance.getScaleUp());

    this.validationEnabled = validationEnabled;
  }

  public V2HorizontalPodAutoscalerBehaviorBuilder(V2HorizontalPodAutoscalerBehavior instance) {
    this(instance, false);
  }

  public V2HorizontalPodAutoscalerBehaviorBuilder(
      V2HorizontalPodAutoscalerBehavior instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withScaleDown(instance.getScaleDown());

    this.withScaleUp(instance.getScaleUp());

    this.validationEnabled = validationEnabled;
  }

  V2HorizontalPodAutoscalerBehaviorFluent<?> fluent;
  Boolean validationEnabled;

  public V2HorizontalPodAutoscalerBehavior build() {
    V2HorizontalPodAutoscalerBehavior buildable = new V2HorizontalPodAutoscalerBehavior();
    buildable.setScaleDown(fluent.getScaleDown());
    buildable.setScaleUp(fluent.getScaleUp());
    return buildable;
  }
}
