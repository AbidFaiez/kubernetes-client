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

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;

/** Generated */
public interface V2beta2ObjectMetricSourceFluent<A extends V2beta2ObjectMetricSourceFluent<A>>
    extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildDescribedObject instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2CrossVersionObjectReference getDescribedObject();

  public V2beta2CrossVersionObjectReference buildDescribedObject();

  public A withDescribedObject(V2beta2CrossVersionObjectReference describedObject);

  public Boolean hasDescribedObject();

  public V2beta2ObjectMetricSourceFluent.DescribedObjectNested<A> withNewDescribedObject();

  public V2beta2ObjectMetricSourceFluent.DescribedObjectNested<A> withNewDescribedObjectLike(
      V2beta2CrossVersionObjectReference item);

  public V2beta2ObjectMetricSourceFluent.DescribedObjectNested<A> editDescribedObject();

  public V2beta2ObjectMetricSourceFluent.DescribedObjectNested<A> editOrNewDescribedObject();

  public V2beta2ObjectMetricSourceFluent.DescribedObjectNested<A> editOrNewDescribedObjectLike(
      V2beta2CrossVersionObjectReference item);

  /**
   * This method has been deprecated, please use method buildMetric instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2MetricIdentifier getMetric();

  public V2beta2MetricIdentifier buildMetric();

  public A withMetric(V2beta2MetricIdentifier metric);

  public Boolean hasMetric();

  public V2beta2ObjectMetricSourceFluent.MetricNested<A> withNewMetric();

  public V2beta2ObjectMetricSourceFluent.MetricNested<A> withNewMetricLike(
      V2beta2MetricIdentifier item);

  public V2beta2ObjectMetricSourceFluent.MetricNested<A> editMetric();

  public V2beta2ObjectMetricSourceFluent.MetricNested<A> editOrNewMetric();

  public V2beta2ObjectMetricSourceFluent.MetricNested<A> editOrNewMetricLike(
      V2beta2MetricIdentifier item);

  /**
   * This method has been deprecated, please use method buildTarget instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V2beta2MetricTarget getTarget();

  public V2beta2MetricTarget buildTarget();

  public A withTarget(V2beta2MetricTarget target);

  public Boolean hasTarget();

  public V2beta2ObjectMetricSourceFluent.TargetNested<A> withNewTarget();

  public V2beta2ObjectMetricSourceFluent.TargetNested<A> withNewTargetLike(
      V2beta2MetricTarget item);

  public V2beta2ObjectMetricSourceFluent.TargetNested<A> editTarget();

  public V2beta2ObjectMetricSourceFluent.TargetNested<A> editOrNewTarget();

  public V2beta2ObjectMetricSourceFluent.TargetNested<A> editOrNewTargetLike(
      V2beta2MetricTarget item);

  public interface DescribedObjectNested<N>
      extends Nested<N>,
          V2beta2CrossVersionObjectReferenceFluent<
              V2beta2ObjectMetricSourceFluent.DescribedObjectNested<N>> {
    public N and();

    public N endDescribedObject();
  }

  public interface MetricNested<N>
      extends Nested<N>,
          V2beta2MetricIdentifierFluent<V2beta2ObjectMetricSourceFluent.MetricNested<N>> {
    public N and();

    public N endMetric();
  }

  public interface TargetNested<N>
      extends Nested<N>,
          V2beta2MetricTargetFluent<V2beta2ObjectMetricSourceFluent.TargetNested<N>> {
    public N and();

    public N endTarget();
  }
}
