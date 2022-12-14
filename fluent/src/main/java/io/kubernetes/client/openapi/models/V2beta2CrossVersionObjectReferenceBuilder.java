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

public class V2beta2CrossVersionObjectReferenceBuilder
    extends V2beta2CrossVersionObjectReferenceFluentImpl<V2beta2CrossVersionObjectReferenceBuilder>
    implements VisitableBuilder<
        V2beta2CrossVersionObjectReference, V2beta2CrossVersionObjectReferenceBuilder> {
  public V2beta2CrossVersionObjectReferenceBuilder() {
    this(false);
  }

  public V2beta2CrossVersionObjectReferenceBuilder(Boolean validationEnabled) {
    this(new V2beta2CrossVersionObjectReference(), validationEnabled);
  }

  public V2beta2CrossVersionObjectReferenceBuilder(
      V2beta2CrossVersionObjectReferenceFluent<?> fluent) {
    this(fluent, false);
  }

  public V2beta2CrossVersionObjectReferenceBuilder(
      V2beta2CrossVersionObjectReferenceFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V2beta2CrossVersionObjectReference(), validationEnabled);
  }

  public V2beta2CrossVersionObjectReferenceBuilder(
      V2beta2CrossVersionObjectReferenceFluent<?> fluent,
      V2beta2CrossVersionObjectReference instance) {
    this(fluent, instance, false);
  }

  public V2beta2CrossVersionObjectReferenceBuilder(
      V2beta2CrossVersionObjectReferenceFluent<?> fluent,
      V2beta2CrossVersionObjectReference instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  public V2beta2CrossVersionObjectReferenceBuilder(V2beta2CrossVersionObjectReference instance) {
    this(instance, false);
  }

  public V2beta2CrossVersionObjectReferenceBuilder(
      V2beta2CrossVersionObjectReference instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withName(instance.getName());

    this.validationEnabled = validationEnabled;
  }

  V2beta2CrossVersionObjectReferenceFluent<?> fluent;
  Boolean validationEnabled;

  public V2beta2CrossVersionObjectReference build() {
    V2beta2CrossVersionObjectReference buildable = new V2beta2CrossVersionObjectReference();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    return buildable;
  }
}
