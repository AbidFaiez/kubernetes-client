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

public class V1APIServiceSpecBuilder extends V1APIServiceSpecFluentImpl<V1APIServiceSpecBuilder>
    implements VisitableBuilder<V1APIServiceSpec, V1APIServiceSpecBuilder> {
  public V1APIServiceSpecBuilder() {
    this(false);
  }

  public V1APIServiceSpecBuilder(Boolean validationEnabled) {
    this(new V1APIServiceSpec(), validationEnabled);
  }

  public V1APIServiceSpecBuilder(V1APIServiceSpecFluent<?> fluent) {
    this(fluent, false);
  }

  public V1APIServiceSpecBuilder(V1APIServiceSpecFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1APIServiceSpec(), validationEnabled);
  }

  public V1APIServiceSpecBuilder(V1APIServiceSpecFluent<?> fluent, V1APIServiceSpec instance) {
    this(fluent, instance, false);
  }

  public V1APIServiceSpecBuilder(
      V1APIServiceSpecFluent<?> fluent, V1APIServiceSpec instance, Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withCaBundle(instance.getCaBundle());

    fluent.withGroup(instance.getGroup());

    fluent.withGroupPriorityMinimum(instance.getGroupPriorityMinimum());

    fluent.withInsecureSkipTLSVerify(instance.getInsecureSkipTLSVerify());

    fluent.withService(instance.getService());

    fluent.withVersion(instance.getVersion());

    fluent.withVersionPriority(instance.getVersionPriority());

    this.validationEnabled = validationEnabled;
  }

  public V1APIServiceSpecBuilder(V1APIServiceSpec instance) {
    this(instance, false);
  }

  public V1APIServiceSpecBuilder(V1APIServiceSpec instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withCaBundle(instance.getCaBundle());

    this.withGroup(instance.getGroup());

    this.withGroupPriorityMinimum(instance.getGroupPriorityMinimum());

    this.withInsecureSkipTLSVerify(instance.getInsecureSkipTLSVerify());

    this.withService(instance.getService());

    this.withVersion(instance.getVersion());

    this.withVersionPriority(instance.getVersionPriority());

    this.validationEnabled = validationEnabled;
  }

  V1APIServiceSpecFluent<?> fluent;
  Boolean validationEnabled;

  public V1APIServiceSpec build() {
    V1APIServiceSpec buildable = new V1APIServiceSpec();
    buildable.setCaBundle(fluent.getCaBundle());
    buildable.setGroup(fluent.getGroup());
    buildable.setGroupPriorityMinimum(fluent.getGroupPriorityMinimum());
    buildable.setInsecureSkipTLSVerify(fluent.getInsecureSkipTLSVerify());
    buildable.setService(fluent.getService());
    buildable.setVersion(fluent.getVersion());
    buildable.setVersionPriority(fluent.getVersionPriority());
    return buildable;
  }
}
