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
public class V1AzureFileVolumeSourceFluentImpl<A extends V1AzureFileVolumeSourceFluent<A>>
    extends BaseFluent<A> implements V1AzureFileVolumeSourceFluent<A> {
  public V1AzureFileVolumeSourceFluentImpl() {}

  public V1AzureFileVolumeSourceFluentImpl(V1AzureFileVolumeSource instance) {
    this.withReadOnly(instance.getReadOnly());

    this.withSecretName(instance.getSecretName());

    this.withShareName(instance.getShareName());
  }

  private Boolean readOnly;
  private String secretName;
  private String shareName;

  public Boolean getReadOnly() {
    return this.readOnly;
  }

  public A withReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return (A) this;
  }

  public Boolean hasReadOnly() {
    return this.readOnly != null;
  }

  public String getSecretName() {
    return this.secretName;
  }

  public A withSecretName(String secretName) {
    this.secretName = secretName;
    return (A) this;
  }

  public Boolean hasSecretName() {
    return this.secretName != null;
  }

  public String getShareName() {
    return this.shareName;
  }

  public A withShareName(String shareName) {
    this.shareName = shareName;
    return (A) this;
  }

  public Boolean hasShareName() {
    return this.shareName != null;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1AzureFileVolumeSourceFluentImpl that = (V1AzureFileVolumeSourceFluentImpl) o;
    if (readOnly != null ? !readOnly.equals(that.readOnly) : that.readOnly != null) return false;
    if (secretName != null ? !secretName.equals(that.secretName) : that.secretName != null)
      return false;
    if (shareName != null ? !shareName.equals(that.shareName) : that.shareName != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(readOnly, secretName, shareName, super.hashCode());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (readOnly != null) {
      sb.append("readOnly:");
      sb.append(readOnly + ",");
    }
    if (secretName != null) {
      sb.append("secretName:");
      sb.append(secretName + ",");
    }
    if (shareName != null) {
      sb.append("shareName:");
      sb.append(shareName);
    }
    sb.append("}");
    return sb.toString();
  }

  public A withReadOnly() {
    return withReadOnly(true);
  }
}
