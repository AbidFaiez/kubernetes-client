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

public class V1LocalObjectReferenceBuilder
    extends V1LocalObjectReferenceFluentImpl<V1LocalObjectReferenceBuilder>
    implements VisitableBuilder<V1LocalObjectReference, V1LocalObjectReferenceBuilder> {
  public V1LocalObjectReferenceBuilder() {
    this(false);
  }

  public V1LocalObjectReferenceBuilder(Boolean validationEnabled) {
    this(new V1LocalObjectReference(), validationEnabled);
  }

  public V1LocalObjectReferenceBuilder(V1LocalObjectReferenceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1LocalObjectReferenceBuilder(
      V1LocalObjectReferenceFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1LocalObjectReference(), validationEnabled);
  }

  public V1LocalObjectReferenceBuilder(
      V1LocalObjectReferenceFluent<?> fluent, V1LocalObjectReference instance) {
    this(fluent, instance, false);
  }

  public V1LocalObjectReferenceBuilder(
      V1LocalObjectReferenceFluent<?> fluent,
      V1LocalObjectReference instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  public V1LocalObjectReferenceBuilder(V1LocalObjectReference instance) {
    this(instance, false);
  }

  public V1LocalObjectReferenceBuilder(V1LocalObjectReference instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  V1LocalObjectReferenceFluent<?> fluent;
  Boolean validationEnabled;

  public V1LocalObjectReference build() {
    V1LocalObjectReference buildable = new V1LocalObjectReference();
    buildable.setName(fluent.getName());
    return buildable;
  }
}
