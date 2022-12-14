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

public class V2beta2HorizontalPodAutoscalerConditionBuilder
    extends V2beta2HorizontalPodAutoscalerConditionFluentImpl<
        V2beta2HorizontalPodAutoscalerConditionBuilder>
    implements VisitableBuilder<
        V2beta2HorizontalPodAutoscalerCondition, V2beta2HorizontalPodAutoscalerConditionBuilder> {
  public V2beta2HorizontalPodAutoscalerConditionBuilder() {
    this(false);
  }

  public V2beta2HorizontalPodAutoscalerConditionBuilder(Boolean validationEnabled) {
    this(new V2beta2HorizontalPodAutoscalerCondition(), validationEnabled);
  }

  public V2beta2HorizontalPodAutoscalerConditionBuilder(
      V2beta2HorizontalPodAutoscalerConditionFluent<?> fluent) {
    this(fluent, false);
  }

  public V2beta2HorizontalPodAutoscalerConditionBuilder(
      V2beta2HorizontalPodAutoscalerConditionFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V2beta2HorizontalPodAutoscalerCondition(), validationEnabled);
  }

  public V2beta2HorizontalPodAutoscalerConditionBuilder(
      V2beta2HorizontalPodAutoscalerConditionFluent<?> fluent,
      V2beta2HorizontalPodAutoscalerCondition instance) {
    this(fluent, instance, false);
  }

  public V2beta2HorizontalPodAutoscalerConditionBuilder(
      V2beta2HorizontalPodAutoscalerConditionFluent<?> fluent,
      V2beta2HorizontalPodAutoscalerCondition instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withLastTransitionTime(instance.getLastTransitionTime());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  public V2beta2HorizontalPodAutoscalerConditionBuilder(
      V2beta2HorizontalPodAutoscalerCondition instance) {
    this(instance, false);
  }

  public V2beta2HorizontalPodAutoscalerConditionBuilder(
      V2beta2HorizontalPodAutoscalerCondition instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  V2beta2HorizontalPodAutoscalerConditionFluent<?> fluent;
  Boolean validationEnabled;

  public V2beta2HorizontalPodAutoscalerCondition build() {
    V2beta2HorizontalPodAutoscalerCondition buildable =
        new V2beta2HorizontalPodAutoscalerCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
}
