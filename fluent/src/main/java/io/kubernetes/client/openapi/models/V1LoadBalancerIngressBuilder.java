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

public class V1LoadBalancerIngressBuilder
    extends V1LoadBalancerIngressFluentImpl<V1LoadBalancerIngressBuilder>
    implements VisitableBuilder<V1LoadBalancerIngress, V1LoadBalancerIngressBuilder> {
  public V1LoadBalancerIngressBuilder() {
    this(false);
  }

  public V1LoadBalancerIngressBuilder(Boolean validationEnabled) {
    this(new V1LoadBalancerIngress(), validationEnabled);
  }

  public V1LoadBalancerIngressBuilder(V1LoadBalancerIngressFluent<?> fluent) {
    this(fluent, false);
  }

  public V1LoadBalancerIngressBuilder(
      V1LoadBalancerIngressFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1LoadBalancerIngress(), validationEnabled);
  }

  public V1LoadBalancerIngressBuilder(
      V1LoadBalancerIngressFluent<?> fluent, V1LoadBalancerIngress instance) {
    this(fluent, instance, false);
  }

  public V1LoadBalancerIngressBuilder(
      V1LoadBalancerIngressFluent<?> fluent,
      V1LoadBalancerIngress instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withHostname(instance.getHostname());

    fluent.withIp(instance.getIp());

    fluent.withPorts(instance.getPorts());

    this.validationEnabled = validationEnabled;
  }

  public V1LoadBalancerIngressBuilder(V1LoadBalancerIngress instance) {
    this(instance, false);
  }

  public V1LoadBalancerIngressBuilder(V1LoadBalancerIngress instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withHostname(instance.getHostname());

    this.withIp(instance.getIp());

    this.withPorts(instance.getPorts());

    this.validationEnabled = validationEnabled;
  }

  V1LoadBalancerIngressFluent<?> fluent;
  Boolean validationEnabled;

  public V1LoadBalancerIngress build() {
    V1LoadBalancerIngress buildable = new V1LoadBalancerIngress();
    buildable.setHostname(fluent.getHostname());
    buildable.setIp(fluent.getIp());
    buildable.setPorts(fluent.getPorts());
    return buildable;
  }
}
