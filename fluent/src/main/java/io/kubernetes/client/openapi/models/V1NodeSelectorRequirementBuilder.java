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

public class V1NodeSelectorRequirementBuilder
    extends V1NodeSelectorRequirementFluentImpl<V1NodeSelectorRequirementBuilder>
    implements VisitableBuilder<V1NodeSelectorRequirement, V1NodeSelectorRequirementBuilder> {
  public V1NodeSelectorRequirementBuilder() {
    this(false);
  }

  public V1NodeSelectorRequirementBuilder(Boolean validationEnabled) {
    this(new V1NodeSelectorRequirement(), validationEnabled);
  }

  public V1NodeSelectorRequirementBuilder(V1NodeSelectorRequirementFluent<?> fluent) {
    this(fluent, false);
  }

  public V1NodeSelectorRequirementBuilder(
      V1NodeSelectorRequirementFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1NodeSelectorRequirement(), validationEnabled);
  }

  public V1NodeSelectorRequirementBuilder(
      V1NodeSelectorRequirementFluent<?> fluent, V1NodeSelectorRequirement instance) {
    this(fluent, instance, false);
  }

  public V1NodeSelectorRequirementBuilder(
      V1NodeSelectorRequirementFluent<?> fluent,
      V1NodeSelectorRequirement instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withKey(instance.getKey());

    fluent.withOperator(instance.getOperator());

    fluent.withValues(instance.getValues());

    this.validationEnabled = validationEnabled;
  }

  public V1NodeSelectorRequirementBuilder(V1NodeSelectorRequirement instance) {
    this(instance, false);
  }

  public V1NodeSelectorRequirementBuilder(
      V1NodeSelectorRequirement instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withKey(instance.getKey());

    this.withOperator(instance.getOperator());

    this.withValues(instance.getValues());

    this.validationEnabled = validationEnabled;
  }

  V1NodeSelectorRequirementFluent<?> fluent;
  Boolean validationEnabled;

  public V1NodeSelectorRequirement build() {
    V1NodeSelectorRequirement buildable = new V1NodeSelectorRequirement();
    buildable.setKey(fluent.getKey());
    buildable.setOperator(fluent.getOperator());
    buildable.setValues(fluent.getValues());
    return buildable;
  }
}
