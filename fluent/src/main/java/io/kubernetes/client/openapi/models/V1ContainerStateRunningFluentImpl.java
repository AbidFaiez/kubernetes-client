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

import io.kubernetes.client.fluent.BaseFluent;
import java.time.OffsetDateTime;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1ContainerStateRunningFluentImpl<A extends V1ContainerStateRunningFluent<A>>
    extends BaseFluent<A> implements V1ContainerStateRunningFluent<A> {
  public V1ContainerStateRunningFluentImpl() {}

  public V1ContainerStateRunningFluentImpl(V1ContainerStateRunning instance) {
    this.withStartedAt(instance.getStartedAt());
  }

  private OffsetDateTime startedAt;

  public OffsetDateTime getStartedAt() {
    return this.startedAt;
  }

  public A withStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return (A) this;
  }

  public Boolean hasStartedAt() {
    return this.startedAt != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ContainerStateRunningFluentImpl that = (V1ContainerStateRunningFluentImpl) o;
    if (startedAt != null ? !startedAt.equals(that.startedAt) : that.startedAt != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(startedAt, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (startedAt != null) {
      sb.append("startedAt:");
      sb.append(startedAt);
    }
    sb.append("}");
    return sb.toString();
  }
}
