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

public class V2beta2HorizontalPodAutoscalerListBuilder
    extends V2beta2HorizontalPodAutoscalerListFluentImpl<V2beta2HorizontalPodAutoscalerListBuilder>
    implements VisitableBuilder<
        V2beta2HorizontalPodAutoscalerList, V2beta2HorizontalPodAutoscalerListBuilder> {
  public V2beta2HorizontalPodAutoscalerListBuilder() {
    this(false);
  }

  public V2beta2HorizontalPodAutoscalerListBuilder(Boolean validationEnabled) {
    this(new V2beta2HorizontalPodAutoscalerList(), validationEnabled);
  }

  public V2beta2HorizontalPodAutoscalerListBuilder(
      V2beta2HorizontalPodAutoscalerListFluent<?> fluent) {
    this(fluent, false);
  }

  public V2beta2HorizontalPodAutoscalerListBuilder(
      V2beta2HorizontalPodAutoscalerListFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V2beta2HorizontalPodAutoscalerList(), validationEnabled);
  }

  public V2beta2HorizontalPodAutoscalerListBuilder(
      V2beta2HorizontalPodAutoscalerListFluent<?> fluent,
      V2beta2HorizontalPodAutoscalerList instance) {
    this(fluent, instance, false);
  }

  public V2beta2HorizontalPodAutoscalerListBuilder(
      V2beta2HorizontalPodAutoscalerListFluent<?> fluent,
      V2beta2HorizontalPodAutoscalerList instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled;
  }

  public V2beta2HorizontalPodAutoscalerListBuilder(V2beta2HorizontalPodAutoscalerList instance) {
    this(instance, false);
  }

  public V2beta2HorizontalPodAutoscalerListBuilder(
      V2beta2HorizontalPodAutoscalerList instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled;
  }

  V2beta2HorizontalPodAutoscalerListFluent<?> fluent;
  Boolean validationEnabled;

  public V2beta2HorizontalPodAutoscalerList build() {
    V2beta2HorizontalPodAutoscalerList buildable = new V2beta2HorizontalPodAutoscalerList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
}
