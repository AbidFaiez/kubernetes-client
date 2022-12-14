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
public class V1beta1FlowDistinguisherMethodFluentImpl<
        A extends V1beta1FlowDistinguisherMethodFluent<A>>
    extends BaseFluent<A> implements V1beta1FlowDistinguisherMethodFluent<A> {
  public V1beta1FlowDistinguisherMethodFluentImpl() {}

  public V1beta1FlowDistinguisherMethodFluentImpl(V1beta1FlowDistinguisherMethod instance) {
    this.withType(instance.getType());
  }

  private String type;

  public String getType() {
    return this.type;
  }

  public A withType(String type) {
    this.type = type;
    return (A) this;
  }

  public Boolean hasType() {
    return this.type != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta1FlowDistinguisherMethodFluentImpl that = (V1beta1FlowDistinguisherMethodFluentImpl) o;
    if (type != null ? !type.equals(that.type) : that.type != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(type, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (type != null) {
      sb.append("type:");
      sb.append(type);
    }
    sb.append("}");
    return sb.toString();
  }
}
