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

public class V1StatefulSetConditionBuilder
    extends V1StatefulSetConditionFluentImpl<V1StatefulSetConditionBuilder>
    implements VisitableBuilder<V1StatefulSetCondition, V1StatefulSetConditionBuilder> {
  public V1StatefulSetConditionBuilder() {
    this(false);
  }

  public V1StatefulSetConditionBuilder(Boolean validationEnabled) {
    this(new V1StatefulSetCondition(), validationEnabled);
  }

  public V1StatefulSetConditionBuilder(V1StatefulSetConditionFluent<?> fluent) {
    this(fluent, false);
  }

  public V1StatefulSetConditionBuilder(
      V1StatefulSetConditionFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1StatefulSetCondition(), validationEnabled);
  }

  public V1StatefulSetConditionBuilder(
      V1StatefulSetConditionFluent<?> fluent, V1StatefulSetCondition instance) {
    this(fluent, instance, false);
  }

  public V1StatefulSetConditionBuilder(
      V1StatefulSetConditionFluent<?> fluent,
      V1StatefulSetCondition instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withLastTransitionTime(instance.getLastTransitionTime());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  public V1StatefulSetConditionBuilder(V1StatefulSetCondition instance) {
    this(instance, false);
  }

  public V1StatefulSetConditionBuilder(V1StatefulSetCondition instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled;
  }

  V1StatefulSetConditionFluent<?> fluent;
  Boolean validationEnabled;

  public V1StatefulSetCondition build() {
    V1StatefulSetCondition buildable = new V1StatefulSetCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
}
