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

public class V1VolumeAttachmentSourceBuilder
    extends V1VolumeAttachmentSourceFluentImpl<V1VolumeAttachmentSourceBuilder>
    implements VisitableBuilder<V1VolumeAttachmentSource, V1VolumeAttachmentSourceBuilder> {
  public V1VolumeAttachmentSourceBuilder() {
    this(false);
  }

  public V1VolumeAttachmentSourceBuilder(Boolean validationEnabled) {
    this(new V1VolumeAttachmentSource(), validationEnabled);
  }

  public V1VolumeAttachmentSourceBuilder(V1VolumeAttachmentSourceFluent<?> fluent) {
    this(fluent, false);
  }

  public V1VolumeAttachmentSourceBuilder(
      V1VolumeAttachmentSourceFluent<?> fluent, Boolean validationEnabled) {
    this(fluent, new V1VolumeAttachmentSource(), validationEnabled);
  }

  public V1VolumeAttachmentSourceBuilder(
      V1VolumeAttachmentSourceFluent<?> fluent, V1VolumeAttachmentSource instance) {
    this(fluent, instance, false);
  }

  public V1VolumeAttachmentSourceBuilder(
      V1VolumeAttachmentSourceFluent<?> fluent,
      V1VolumeAttachmentSource instance,
      Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withInlineVolumeSpec(instance.getInlineVolumeSpec());

    fluent.withPersistentVolumeName(instance.getPersistentVolumeName());

    this.validationEnabled = validationEnabled;
  }

  public V1VolumeAttachmentSourceBuilder(V1VolumeAttachmentSource instance) {
    this(instance, false);
  }

  public V1VolumeAttachmentSourceBuilder(
      V1VolumeAttachmentSource instance, Boolean validationEnabled) {
    this.fluent = this;
    this.withInlineVolumeSpec(instance.getInlineVolumeSpec());

    this.withPersistentVolumeName(instance.getPersistentVolumeName());

    this.validationEnabled = validationEnabled;
  }

  V1VolumeAttachmentSourceFluent<?> fluent;
  Boolean validationEnabled;

  public V1VolumeAttachmentSource build() {
    V1VolumeAttachmentSource buildable = new V1VolumeAttachmentSource();
    buildable.setInlineVolumeSpec(fluent.getInlineVolumeSpec());
    buildable.setPersistentVolumeName(fluent.getPersistentVolumeName());
    return buildable;
  }
}
