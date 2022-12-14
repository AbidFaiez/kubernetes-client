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
public interface V1HorizontalPodAutoscalerSpecFluent<
        A extends V1HorizontalPodAutoscalerSpecFluent<A>>
    extends Fluent<A> {
  public Integer getMaxReplicas();

  public A withMaxReplicas(Integer maxReplicas);

  public Boolean hasMaxReplicas();

  public Integer getMinReplicas();

  public A withMinReplicas(Integer minReplicas);

  public Boolean hasMinReplicas();

  /**
   * This method has been deprecated, please use method buildScaleTargetRef instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1CrossVersionObjectReference getScaleTargetRef();

  public V1CrossVersionObjectReference buildScaleTargetRef();

  public A withScaleTargetRef(V1CrossVersionObjectReference scaleTargetRef);

  public Boolean hasScaleTargetRef();

  public V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> withNewScaleTargetRef();

  public V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> withNewScaleTargetRefLike(
      V1CrossVersionObjectReference item);

  public V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editScaleTargetRef();

  public V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editOrNewScaleTargetRef();

  public V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editOrNewScaleTargetRefLike(
      V1CrossVersionObjectReference item);

  public Integer getTargetCPUUtilizationPercentage();

  public A withTargetCPUUtilizationPercentage(Integer targetCPUUtilizationPercentage);

  public Boolean hasTargetCPUUtilizationPercentage();

  public interface ScaleTargetRefNested<N>
      extends Nested<N>,
          V1CrossVersionObjectReferenceFluent<
              V1HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<N>> {
    public N and();

    public N endScaleTargetRef();
  }
}
