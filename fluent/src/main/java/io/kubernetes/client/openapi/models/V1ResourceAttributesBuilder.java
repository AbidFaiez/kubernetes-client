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

public class V1ResourceAttributesBuilder
    extends V1ResourceAttributesFluentImpl<V1ResourceAttributesBuilder>
    implements VisitableBuilder<V1ResourceAttributes, V1ResourceAttributesBuilder> {
  public V1ResourceAttributesBuilder() {
    this(false);
  }

  public V1ResourceAttributesBuilder(Boolean validationEnabled) {
    this(new V1ResourceAttributes(), validationEnabled);
  }

  public V1ResourceAttributesBuilder(V1ResourceAttributesFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ResourceAttributesBuilder(
      V1ResourceAttributesFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1ResourceAttributes(), validationEnabled);
  }

  public V1ResourceAttributesBuilder(
      V1ResourceAttributesFluent<?> fluent, V1ResourceAttributes instance) {
    this(fluent, instance, false);
  }

  public V1ResourceAttributesBuilder(
      V1ResourceAttributesFluent<?> fluent,
      V1ResourceAttributes instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withGroup(instance.getGroup());

    fluent.withName(instance.getName());

    fluent.withNamespace(instance.getNamespace());

    fluent.withResource(instance.getResource());

    fluent.withSubresource(instance.getSubresource());

    fluent.withVerb(instance.getVerb());

    fluent.withVersion(instance.getVersion());

    this.validationEnabled = validationEnabled;
  }

  public V1ResourceAttributesBuilder(V1ResourceAttributes instance) {
    this(instance, false);
  }

  public V1ResourceAttributesBuilder(V1ResourceAttributes instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withGroup(instance.getGroup());

    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.withResource(instance.getResource());

    this.withSubresource(instance.getSubresource());

    this.withVerb(instance.getVerb());

    this.withVersion(instance.getVersion());

    this.validationEnabled = validationEnabled;
  }

  V1ResourceAttributesFluent<?> fluent;
  Boolean validationEnabled;

  public V1ResourceAttributes build() {
    V1ResourceAttributes buildable = new V1ResourceAttributes();
    buildable.setGroup(fluent.getGroup());
    buildable.setName(fluent.getName());
    buildable.setNamespace(fluent.getNamespace());
    buildable.setResource(fluent.getResource());
    buildable.setSubresource(fluent.getSubresource());
    buildable.setVerb(fluent.getVerb());
    buildable.setVersion(fluent.getVersion());
    return buildable;
  }
}
