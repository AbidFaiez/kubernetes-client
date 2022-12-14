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

public class V1CrossVersionObjectReferenceBuilder
    extends V1CrossVersionObjectReferenceFluentImpl<V1CrossVersionObjectReferenceBuilder>
    implements VisitableBuilder<
        V1CrossVersionObjectReference, V1CrossVersionObjectReferenceBuilder> {
  public V1CrossVersionObjectReferenceBuilder() {
    this(false);
  }

  public V1CrossVersionObjectReferenceBuilder(Boolean validationEnabled) {
    this(new V1CrossVersionObjectReference(), validationEnabled);
  }

  public V1CrossVersionObjectReferenceBuilder(V1CrossVersionObjectReferenceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1CrossVersionObjectReferenceBuilder(
      V1CrossVersionObjectReferenceFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1CrossVersionObjectReference(), validationEnabled);
  }

  public V1CrossVersionObjectReferenceBuilder(
      V1CrossVersionObjectReferenceFluent<?> fluent, V1CrossVersionObjectReference instance) {
    this(fluent, instance, false);
  }

  public V1CrossVersionObjectReferenceBuilder(
      V1CrossVersionObjectReferenceFluent<?> fluent,
      V1CrossVersionObjectReference instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  public V1CrossVersionObjectReferenceBuilder(V1CrossVersionObjectReference instance) {
    this(instance, false);
  }

  public V1CrossVersionObjectReferenceBuilder(
      V1CrossVersionObjectReference instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  V1CrossVersionObjectReferenceFluent<?> fluent;
  Boolean validationEnabled;

  public V1CrossVersionObjectReference build() {
    V1CrossVersionObjectReference buildable = new V1CrossVersionObjectReference();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    return buildable;
  }
}
