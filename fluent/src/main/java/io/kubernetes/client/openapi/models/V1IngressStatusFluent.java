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
public interface V1IngressStatusFluent<A extends V1IngressStatusFluent<A>> extends Fluent<A> {

  /**
   * This method has been deprecated, please use method buildLoadBalancer instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1LoadBalancerStatus getLoadBalancer();

  public V1LoadBalancerStatus buildLoadBalancer();

  public A withLoadBalancer(V1LoadBalancerStatus loadBalancer);

  public Boolean hasLoadBalancer();

  public V1IngressStatusFluent.LoadBalancerNested<A> withNewLoadBalancer();

  public V1IngressStatusFluent.LoadBalancerNested<A> withNewLoadBalancerLike(
      V1LoadBalancerStatus item);

  public V1IngressStatusFluent.LoadBalancerNested<A> editLoadBalancer();

  public V1IngressStatusFluent.LoadBalancerNested<A> editOrNewLoadBalancer();

  public V1IngressStatusFluent.LoadBalancerNested<A> editOrNewLoadBalancerLike(
      V1LoadBalancerStatus item);

  public interface LoadBalancerNested<N>
      extends Nested<N>, V1LoadBalancerStatusFluent<V1IngressStatusFluent.LoadBalancerNested<N>> {
    public N and();

    public N endLoadBalancer();
  }
}
