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
public class V1beta2LimitedPriorityLevelConfigurationFluentImpl<
        A extends V1beta2LimitedPriorityLevelConfigurationFluent<A>>
    extends BaseFluent<A> implements V1beta2LimitedPriorityLevelConfigurationFluent<A> {
  public V1beta2LimitedPriorityLevelConfigurationFluentImpl() {}

  public V1beta2LimitedPriorityLevelConfigurationFluentImpl(
      V1beta2LimitedPriorityLevelConfiguration instance) {
    this.withAssuredConcurrencyShares(instance.getAssuredConcurrencyShares());

    this.withLimitResponse(instance.getLimitResponse());
  }

  private Integer assuredConcurrencyShares;
  private V1beta2LimitResponseBuilder limitResponse;

  public Integer getAssuredConcurrencyShares() {
    return this.assuredConcurrencyShares;
  }

  public A withAssuredConcurrencyShares(Integer assuredConcurrencyShares) {
    this.assuredConcurrencyShares = assuredConcurrencyShares;
    return (A) this;
  }

  public Boolean hasAssuredConcurrencyShares() {
    return this.assuredConcurrencyShares != null;
  }

  /**
   * This method has been deprecated, please use method buildLimitResponse instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1beta2LimitResponse getLimitResponse() {
    return this.limitResponse != null ? this.limitResponse.build() : null;
  }

  public V1beta2LimitResponse buildLimitResponse() {
    return this.limitResponse != null ? this.limitResponse.build() : null;
  }

  public A withLimitResponse(V1beta2LimitResponse limitResponse) {
    _visitables.get("limitResponse").remove(this.limitResponse);
    if (limitResponse != null) {
      this.limitResponse = new V1beta2LimitResponseBuilder(limitResponse);
      _visitables.get("limitResponse").add(this.limitResponse);
    } else {
      this.limitResponse = null;
      _visitables.get("limitResponse").remove(this.limitResponse);
    }
    return (A) this;
  }

  public Boolean hasLimitResponse() {
    return this.limitResponse != null;
  }

  public V1beta2LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A>
      withNewLimitResponse() {
    return new V1beta2LimitedPriorityLevelConfigurationFluentImpl.LimitResponseNestedImpl();
  }

  public V1beta2LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A>
      withNewLimitResponseLike(V1beta2LimitResponse item) {
    return new V1beta2LimitedPriorityLevelConfigurationFluentImpl.LimitResponseNestedImpl(item);
  }

  public V1beta2LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A> editLimitResponse() {
    return withNewLimitResponseLike(getLimitResponse());
  }

  public V1beta2LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A>
      editOrNewLimitResponse() {
    return withNewLimitResponseLike(
        getLimitResponse() != null
            ? getLimitResponse()
            : new V1beta2LimitResponseBuilder().build());
  }

  public V1beta2LimitedPriorityLevelConfigurationFluent.LimitResponseNested<A>
      editOrNewLimitResponseLike(V1beta2LimitResponse item) {
    return withNewLimitResponseLike(getLimitResponse() != null ? getLimitResponse() : item);
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta2LimitedPriorityLevelConfigurationFluentImpl that =
        (V1beta2LimitedPriorityLevelConfigurationFluentImpl) o;
    if (assuredConcurrencyShares != null
        ? !assuredConcurrencyShares.equals(that.assuredConcurrencyShares)
        : that.assuredConcurrencyShares != null) return false;
    if (limitResponse != null
        ? !limitResponse.equals(that.limitResponse)
        : that.limitResponse != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(assuredConcurrencyShares, limitResponse, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (assuredConcurrencyShares != null) {
      sb.append("assuredConcurrencyShares:");
      sb.append(assuredConcurrencyShares + ",");
    }
    if (limitResponse != null) {
      sb.append("limitResponse:");
      sb.append(limitResponse);
    }
    sb.append("}");
    return sb.toString();
  }

  class LimitResponseNestedImpl<N>
      extends V1beta2LimitResponseFluentImpl<
          V1beta2LimitedPriorityLevelConfigurationFluent.LimitResponseNested<N>>
      implements V1beta2LimitedPriorityLevelConfigurationFluent.LimitResponseNested<N>, Nested<N> {
    LimitResponseNestedImpl(V1beta2LimitResponse item) {
      this.builder = new V1beta2LimitResponseBuilder(this, item);
    }

    LimitResponseNestedImpl() {
      this.builder = new V1beta2LimitResponseBuilder(this);
    }

    V1beta2LimitResponseBuilder builder;

    public N and() {
      return (N)
          V1beta2LimitedPriorityLevelConfigurationFluentImpl.this.withLimitResponse(
              builder.build());
    }

    public N endLimitResponse() {
      return and();
    }
  }
}
