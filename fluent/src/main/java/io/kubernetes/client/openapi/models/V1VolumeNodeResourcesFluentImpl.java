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
public class V1VolumeNodeResourcesFluentImpl<A extends V1VolumeNodeResourcesFluent<A>>
    extends BaseFluent<A> implements V1VolumeNodeResourcesFluent<A> {
  public V1VolumeNodeResourcesFluentImpl() {}

  public V1VolumeNodeResourcesFluentImpl(V1VolumeNodeResources instance) {
    this.withCount(instance.getCount());
  }

  private Integer count;

  public Integer getCount() {
    return this.count;
  }

  public A withCount(Integer count) {
    this.count = count;
    return (A) this;
  }

  public Boolean hasCount() {
    return this.count != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1VolumeNodeResourcesFluentImpl that = (V1VolumeNodeResourcesFluentImpl) o;
    if (count != null ? !count.equals(that.count) : that.count != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(count, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (count != null) {
      sb.append("count:");
      sb.append(count);
    }
    sb.append("}");
    return sb.toString();
  }
}
