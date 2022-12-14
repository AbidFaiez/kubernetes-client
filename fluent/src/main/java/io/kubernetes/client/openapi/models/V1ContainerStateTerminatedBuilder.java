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

public class V1ContainerStateTerminatedBuilder
    extends V1ContainerStateTerminatedFluentImpl<V1ContainerStateTerminatedBuilder>
    implements VisitableBuilder<V1ContainerStateTerminated, V1ContainerStateTerminatedBuilder> {
  public V1ContainerStateTerminatedBuilder() {
    this(false);
  }

  public V1ContainerStateTerminatedBuilder(Boolean validationEnabled) {
    this(new V1ContainerStateTerminated(), validationEnabled);
  }

  public V1ContainerStateTerminatedBuilder(V1ContainerStateTerminatedFluent<?> fluent) {
    this(fluent, false);
  }

  public V1ContainerStateTerminatedBuilder(
      V1ContainerStateTerminatedFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1ContainerStateTerminated(), validationEnabled);
  }

  public V1ContainerStateTerminatedBuilder(
      V1ContainerStateTerminatedFluent<?> fluent, V1ContainerStateTerminated instance) {
    this(fluent, instance, false);
  }

  public V1ContainerStateTerminatedBuilder(
      V1ContainerStateTerminatedFluent<?> fluent,
      V1ContainerStateTerminated instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withContainerID(instance.getContainerID());

    fluent.withExitCode(instance.getExitCode());

    fluent.withFinishedAt(instance.getFinishedAt());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    fluent.withSignal(instance.getSignal());

    fluent.withStartedAt(instance.getStartedAt());

    this.validationEnabled = validationEnabled;
  }

  public V1ContainerStateTerminatedBuilder(V1ContainerStateTerminated instance) {
    this(instance, false);
  }

  public V1ContainerStateTerminatedBuilder(
      V1ContainerStateTerminated instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withContainerID(instance.getContainerID());

    this.withExitCode(instance.getExitCode());

    this.withFinishedAt(instance.getFinishedAt());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withSignal(instance.getSignal());

    this.withStartedAt(instance.getStartedAt());

    this.validationEnabled = validationEnabled;
  }

  V1ContainerStateTerminatedFluent<?> fluent;
  Boolean validationEnabled;

  public V1ContainerStateTerminated build() {
    V1ContainerStateTerminated buildable = new V1ContainerStateTerminated();
    buildable.setContainerID(fluent.getContainerID());
    buildable.setExitCode(fluent.getExitCode());
    buildable.setFinishedAt(fluent.getFinishedAt());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setSignal(fluent.getSignal());
    buildable.setStartedAt(fluent.getStartedAt());
    return buildable;
  }
}
