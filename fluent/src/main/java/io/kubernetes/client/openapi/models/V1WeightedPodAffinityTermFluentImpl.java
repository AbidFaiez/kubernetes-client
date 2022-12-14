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
import io.kubernetes.client.fluent.Nested;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1WeightedPodAffinityTermFluentImpl<A extends V1WeightedPodAffinityTermFluent<A>>
    extends BaseFluent<A> implements V1WeightedPodAffinityTermFluent<A> {
  public V1WeightedPodAffinityTermFluentImpl() {}

  public V1WeightedPodAffinityTermFluentImpl(V1WeightedPodAffinityTerm instance) {
    this.withPodAffinityTerm(instance.getPodAffinityTerm());

    this.withWeight(instance.getWeight());
  }

  private V1PodAffinityTermBuilder podAffinityTerm;
  private Integer weight;

  /**
   * This method has been deprecated, please use method buildPodAffinityTerm instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1PodAffinityTerm getPodAffinityTerm() {
    return this.podAffinityTerm != null ? this.podAffinityTerm.build() : null;
  }

  public V1PodAffinityTerm buildPodAffinityTerm() {
    return this.podAffinityTerm != null ? this.podAffinityTerm.build() : null;
  }

  public A withPodAffinityTerm(V1PodAffinityTerm podAffinityTerm) {
    _visitables.get("podAffinityTerm").remove(this.podAffinityTerm);
    if (podAffinityTerm != null) {
      this.podAffinityTerm = new V1PodAffinityTermBuilder(podAffinityTerm);
      _visitables.get("podAffinityTerm").add(this.podAffinityTerm);
    } else {
      this.podAffinityTerm = null;
      _visitables.get("podAffinityTerm").remove(this.podAffinityTerm);
    }
    return (A) this;
  }

  public Boolean hasPodAffinityTerm() {
    return this.podAffinityTerm != null;
  }

  public V1WeightedPodAffinityTermFluent.PodAffinityTermNested<A> withNewPodAffinityTerm() {
    return new V1WeightedPodAffinityTermFluentImpl.PodAffinityTermNestedImpl();
  }

  public V1WeightedPodAffinityTermFluent.PodAffinityTermNested<A> withNewPodAffinityTermLike(
      V1PodAffinityTerm item) {
    return new V1WeightedPodAffinityTermFluentImpl.PodAffinityTermNestedImpl(item);
  }

  public V1WeightedPodAffinityTermFluent.PodAffinityTermNested<A> editPodAffinityTerm() {
    return withNewPodAffinityTermLike(getPodAffinityTerm());
  }

  public V1WeightedPodAffinityTermFluent.PodAffinityTermNested<A> editOrNewPodAffinityTerm() {
    return withNewPodAffinityTermLike(
        getPodAffinityTerm() != null
            ? getPodAffinityTerm()
            : new V1PodAffinityTermBuilder().build());
  }

  public V1WeightedPodAffinityTermFluent.PodAffinityTermNested<A> editOrNewPodAffinityTermLike(
      V1PodAffinityTerm item) {
    return withNewPodAffinityTermLike(getPodAffinityTerm() != null ? getPodAffinityTerm() : item);
  }

  public Integer getWeight() {
    return this.weight;
  }

  public A withWeight(Integer weight) {
    this.weight = weight;
    return (A) this;
  }

  public Boolean hasWeight() {
    return this.weight != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1WeightedPodAffinityTermFluentImpl that = (V1WeightedPodAffinityTermFluentImpl) o;
    if (podAffinityTerm != null
        ? !podAffinityTerm.equals(that.podAffinityTerm)
        : that.podAffinityTerm != null) return false;
    if (weight != null ? !weight.equals(that.weight) : that.weight != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(podAffinityTerm, weight, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (podAffinityTerm != null) {
      sb.append("podAffinityTerm:");
      sb.append(podAffinityTerm + ",");
    }
    if (weight != null) {
      sb.append("weight:");
      sb.append(weight);
    }
    sb.append("}");
    return sb.toString();
  }

  class PodAffinityTermNestedImpl<N>
      extends V1PodAffinityTermFluentImpl<V1WeightedPodAffinityTermFluent.PodAffinityTermNested<N>>
      implements V1WeightedPodAffinityTermFluent.PodAffinityTermNested<N>, Nested<N> {
    PodAffinityTermNestedImpl(V1PodAffinityTerm item) {
      this.builder = new V1PodAffinityTermBuilder(this, item);
    }

    PodAffinityTermNestedImpl() {
      this.builder = new V1PodAffinityTermBuilder(this);
    }

    V1PodAffinityTermBuilder builder;

    public N and() {
      return (N) V1WeightedPodAffinityTermFluentImpl.this.withPodAffinityTerm(builder.build());
    }

    public N endPodAffinityTerm() {
      return and();
    }
  }
}
