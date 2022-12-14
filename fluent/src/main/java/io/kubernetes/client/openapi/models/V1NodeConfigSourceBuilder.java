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

public class V1NodeConfigSourceBuilder
    extends V1NodeConfigSourceFluentImpl<V1NodeConfigSourceBuilder>
    implements VisitableBuilder<V1NodeConfigSource, V1NodeConfigSourceBuilder> {
  public V1NodeConfigSourceBuilder() {
    this(false);
  }

  public V1NodeConfigSourceBuilder(Boolean validationEnabled) {
    this(new V1NodeConfigSource(), validationEnabled);
  }

  public V1NodeConfigSourceBuilder(V1NodeConfigSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1NodeConfigSourceBuilder(V1NodeConfigSourceFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1NodeConfigSource(), validationEnabled);
  }

  public V1NodeConfigSourceBuilder(
      V1NodeConfigSourceFluent<?> fluent, V1NodeConfigSource instance) {
    this(fluent, instance, false);
  }

  public V1NodeConfigSourceBuilder(
      V1NodeConfigSourceFluent<?> fluent, V1NodeConfigSource instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withConfigMap(instance.getConfigMap());

    this.validationEnabled = validationEnabled;
  }

  public V1NodeConfigSourceBuilder(V1NodeConfigSource instance) {
    this(instance, false);
  }

  public V1NodeConfigSourceBuilder(V1NodeConfigSource instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withConfigMap(instance.getConfigMap());

    this.validationEnabled = validationEnabled;
  }

  V1NodeConfigSourceFluent<?> fluent;
  Boolean validationEnabled;

  public V1NodeConfigSource build() {
    V1NodeConfigSource buildable = new V1NodeConfigSource();
    buildable.setConfigMap(fluent.getConfigMap());
    return buildable;
  }
}
