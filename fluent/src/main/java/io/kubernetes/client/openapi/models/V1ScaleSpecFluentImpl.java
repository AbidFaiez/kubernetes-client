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

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1ScaleSpecFluentImpl<A extends V1ScaleSpecFluent<A>> extends BaseFluent<A>
    implements V1ScaleSpecFluent<A> {
  public V1ScaleSpecFluentImpl() {}

  public V1ScaleSpecFluentImpl(V1ScaleSpec instance) {
    this.withReplicas(instance.getReplicas());
  }

  private Integer replicas;

  public Integer getReplicas() {
    return this.replicas;
  }

  public A withReplicas(Integer replicas) {
    this.replicas = replicas;
    return (A) this;
  }

  public Boolean hasReplicas() {
    return this.replicas != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ScaleSpecFluentImpl that = (V1ScaleSpecFluentImpl) o;
    if (replicas != null ? !replicas.equals(that.replicas) : that.replicas != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(replicas, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (replicas != null) {
      sb.append("replicas:");
      sb.append(replicas);
    }
    sb.append("}");
    return sb.toString();
  }
}
