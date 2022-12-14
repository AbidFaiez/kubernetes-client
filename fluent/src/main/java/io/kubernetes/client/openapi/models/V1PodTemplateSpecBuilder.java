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

public class V1PodTemplateSpecBuilder extends V1PodTemplateSpecFluentImpl<V1PodTemplateSpecBuilder>
    implements VisitableBuilder<V1PodTemplateSpec, V1PodTemplateSpecBuilder> {
  public V1PodTemplateSpecBuilder() {
    this(false);
  }

  public V1PodTemplateSpecBuilder(Boolean validationEnabled) {
    this(new V1PodTemplateSpec(), validationEnabled);
  }

  public V1PodTemplateSpecBuilder(V1PodTemplateSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1PodTemplateSpecBuilder(V1PodTemplateSpecFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1PodTemplateSpec(), validationEnabled);
  }

  public V1PodTemplateSpecBuilder(V1PodTemplateSpecFluent<?> fluent, V1PodTemplateSpec instance) {
    this(fluent, instance, false);
  }

  public V1PodTemplateSpecBuilder(
      V1PodTemplateSpecFluent<?> fluent, V1PodTemplateSpec instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled;
  }

  public V1PodTemplateSpecBuilder(V1PodTemplateSpec instance) {
    this(instance, false);
  }

  public V1PodTemplateSpecBuilder(V1PodTemplateSpec instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.validationEnabled = validationEnabled;
  }

  V1PodTemplateSpecFluent<?> fluent;
  Boolean validationEnabled;

  public V1PodTemplateSpec build() {
    V1PodTemplateSpec buildable = new V1PodTemplateSpec();
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    return buildable;
  }
}
