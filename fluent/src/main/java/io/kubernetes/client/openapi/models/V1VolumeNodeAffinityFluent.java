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
public interface V1VolumeNodeAffinityFluent<A extends V1VolumeNodeAffinityFluent<A>>
    extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildRequired instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1NodeSelector getRequired();

  public V1NodeSelector buildRequired();

  public A withRequired(V1NodeSelector required);

  public Boolean hasRequired();

  public V1VolumeNodeAffinityFluent.RequiredNested<A> withNewRequired();

  public V1VolumeNodeAffinityFluent.RequiredNested<A> withNewRequiredLike(V1NodeSelector item);

  public V1VolumeNodeAffinityFluent.RequiredNested<A> editRequired();

  public V1VolumeNodeAffinityFluent.RequiredNested<A> editOrNewRequired();

  public V1VolumeNodeAffinityFluent.RequiredNested<A> editOrNewRequiredLike(V1NodeSelector item);

  public interface RequiredNested<N>
      extends Nested<N>, V1NodeSelectorFluent<V1VolumeNodeAffinityFluent.RequiredNested<N>> {
    public N and();

    public N endRequired();
  }
}
