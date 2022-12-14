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
public interface V1DaemonSetUpdateStrategyFluent<A extends V1DaemonSetUpdateStrategyFluent<A>>
    extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildRollingUpdate instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1RollingUpdateDaemonSet getRollingUpdate();

  public V1RollingUpdateDaemonSet buildRollingUpdate();

  public A withRollingUpdate(V1RollingUpdateDaemonSet rollingUpdate);

  public Boolean hasRollingUpdate();

  public V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> withNewRollingUpdate();

  public V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> withNewRollingUpdateLike(
      V1RollingUpdateDaemonSet item);

  public V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> editRollingUpdate();

  public V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdate();

  public V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<A> editOrNewRollingUpdateLike(
      V1RollingUpdateDaemonSet item);

  public String getType();

  public A withType(String type);

  public Boolean hasType();

  public interface RollingUpdateNested<N>
      extends Nested<N>,
          V1RollingUpdateDaemonSetFluent<V1DaemonSetUpdateStrategyFluent.RollingUpdateNested<N>> {
    public N and();

    public N endRollingUpdate();
  }
}
