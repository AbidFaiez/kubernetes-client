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
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
public interface V1DownwardAPIVolumeSourceFluent<A extends V1DownwardAPIVolumeSourceFluent<A>>
    extends Fluent<A> {
  public Integer getDefaultMode();

  public A withDefaultMode(Integer defaultMode);

  public Boolean hasDefaultMode();

  public A addToItems(Integer index, V1DownwardAPIVolumeFile item);

  public A setToItems(Integer index, V1DownwardAPIVolumeFile item);

  public A addToItems(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile... items);

  public A addAllToItems(Collection<V1DownwardAPIVolumeFile> items);

  public A removeFromItems(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile... items);

  public A removeAllFromItems(Collection<V1DownwardAPIVolumeFile> items);

  public A removeMatchingFromItems(Predicate<V1DownwardAPIVolumeFileBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildItems instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<V1DownwardAPIVolumeFile> getItems();

  public List<V1DownwardAPIVolumeFile> buildItems();

  public V1DownwardAPIVolumeFile buildItem(Integer index);

  public V1DownwardAPIVolumeFile buildFirstItem();

  public V1DownwardAPIVolumeFile buildLastItem();

  public V1DownwardAPIVolumeFile buildMatchingItem(
      Predicate<V1DownwardAPIVolumeFileBuilder> predicate);

  public Boolean hasMatchingItem(Predicate<V1DownwardAPIVolumeFileBuilder> predicate);

  public A withItems(List<V1DownwardAPIVolumeFile> items);

  public A withItems(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile... items);

  public Boolean hasItems();

  public V1DownwardAPIVolumeSourceFluent.ItemsNested<A> addNewItem();

  public V1DownwardAPIVolumeSourceFluent.ItemsNested<A> addNewItemLike(
      V1DownwardAPIVolumeFile item);

  public V1DownwardAPIVolumeSourceFluent.ItemsNested<A> setNewItemLike(
      Integer index, V1DownwardAPIVolumeFile item);

  public V1DownwardAPIVolumeSourceFluent.ItemsNested<A> editItem(Integer index);

  public V1DownwardAPIVolumeSourceFluent.ItemsNested<A> editFirstItem();

  public V1DownwardAPIVolumeSourceFluent.ItemsNested<A> editLastItem();

  public V1DownwardAPIVolumeSourceFluent.ItemsNested<A> editMatchingItem(
      Predicate<V1DownwardAPIVolumeFileBuilder> predicate);

  public interface ItemsNested<N>
      extends Nested<N>,
          V1DownwardAPIVolumeFileFluent<V1DownwardAPIVolumeSourceFluent.ItemsNested<N>> {
    public N and();

    public N endItem();
  }
}
