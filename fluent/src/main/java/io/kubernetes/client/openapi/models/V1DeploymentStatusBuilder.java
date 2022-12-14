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

public class V1DeploymentStatusBuilder
    extends V1DeploymentStatusFluentImpl<V1DeploymentStatusBuilder>
    implements VisitableBuilder<V1DeploymentStatus, V1DeploymentStatusBuilder> {
  public V1DeploymentStatusBuilder() {
    this(false);
  }

  public V1DeploymentStatusBuilder(Boolean validationEnabled) {
    this(new V1DeploymentStatus(), validationEnabled);
  }

  public V1DeploymentStatusBuilder(V1DeploymentStatusFluent<?> fluent) {
    this(fluent, false);
  }

  public V1DeploymentStatusBuilder(V1DeploymentStatusFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1DeploymentStatus(), validationEnabled);
  }

  public V1DeploymentStatusBuilder(
      V1DeploymentStatusFluent<?> fluent, V1DeploymentStatus instance) {
    this(fluent, instance, false);
  }

  public V1DeploymentStatusBuilder(
      V1DeploymentStatusFluent<?> fluent, V1DeploymentStatus instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withAvailableReplicas(instance.getAvailableReplicas());

    fluent.withCollisionCount(instance.getCollisionCount());

    fluent.withConditions(instance.getConditions());

    fluent.withObservedGeneration(instance.getObservedGeneration());

    fluent.withReadyReplicas(instance.getReadyReplicas());

    fluent.withReplicas(instance.getReplicas());

    fluent.withUnavailableReplicas(instance.getUnavailableReplicas());

    fluent.withUpdatedReplicas(instance.getUpdatedReplicas());

    this.validationEnabled = validationEnabled;
  }

  public V1DeploymentStatusBuilder(V1DeploymentStatus instance) {
    this(instance, false);
  }

  public V1DeploymentStatusBuilder(V1DeploymentStatus instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withAvailableReplicas(instance.getAvailableReplicas());

    this.withCollisionCount(instance.getCollisionCount());

    this.withConditions(instance.getConditions());

    this.withObservedGeneration(instance.getObservedGeneration());

    this.withReadyReplicas(instance.getReadyReplicas());

    this.withReplicas(instance.getReplicas());

    this.withUnavailableReplicas(instance.getUnavailableReplicas());

    this.withUpdatedReplicas(instance.getUpdatedReplicas());

    this.validationEnabled = validationEnabled;
  }

  V1DeploymentStatusFluent<?> fluent;
  Boolean validationEnabled;

  public V1DeploymentStatus build() {
    V1DeploymentStatus buildable = new V1DeploymentStatus();
    buildable.setAvailableReplicas(fluent.getAvailableReplicas());
    buildable.setCollisionCount(fluent.getCollisionCount());
    buildable.setConditions(fluent.getConditions());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    buildable.setReadyReplicas(fluent.getReadyReplicas());
    buildable.setReplicas(fluent.getReplicas());
    buildable.setUnavailableReplicas(fluent.getUnavailableReplicas());
    buildable.setUpdatedReplicas(fluent.getUpdatedReplicas());
    return buildable;
  }
}
