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
public class V1LocalVolumeSourceFluentImpl<A extends V1LocalVolumeSourceFluent<A>>
    extends BaseFluent<A> implements V1LocalVolumeSourceFluent<A> {
  public V1LocalVolumeSourceFluentImpl() {}

  public V1LocalVolumeSourceFluentImpl(V1LocalVolumeSource instance) {
    this.withFsType(instance.getFsType());

    this.withPath(instance.getPath());
  }

  private String fsType;
  private String path;

  public String getFsType() {
    return this.fsType;
  }

  public A withFsType(String fsType) {
    this.fsType = fsType;
    return (A) this;
  }

  public Boolean hasFsType() {
    return this.fsType != null;
  }

  public String getPath() {
    return this.path;
  }

  public A withPath(String path) {
    this.path = path;
    return (A) this;
  }

  public Boolean hasPath() {
    return this.path != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1LocalVolumeSourceFluentImpl that = (V1LocalVolumeSourceFluentImpl) o;
    if (fsType != null ? !fsType.equals(that.fsType) : that.fsType != null) return false;
    if (path != null ? !path.equals(that.path) : that.path != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(fsType, path, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (fsType != null) {
      sb.append("fsType:");
      sb.append(fsType + ",");
    }
    if (path != null) {
      sb.append("path:");
      sb.append(path);
    }
    sb.append("}");
    return sb.toString();
  }
}
