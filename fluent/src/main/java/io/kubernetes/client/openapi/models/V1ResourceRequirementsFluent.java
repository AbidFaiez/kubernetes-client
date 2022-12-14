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

import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.fluent.Fluent;
import java.util.Map;

/** Generated */
public interface V1ResourceRequirementsFluent<A extends V1ResourceRequirementsFluent<A>>
    extends Fluent<A> {
  public A addToLimits(String key, Quantity value);

  public A addToLimits(Map<String, Quantity> map);

  public A removeFromLimits(String key);

  public A removeFromLimits(Map<String, Quantity> map);

  public Map<String, Quantity> getLimits();

  public <K, V> A withLimits(Map<String, Quantity> limits);

  public Boolean hasLimits();

  public A addToRequests(String key, Quantity value);

  public A addToRequests(Map<String, Quantity> map);

  public A removeFromRequests(String key);

  public A removeFromRequests(Map<String, Quantity> map);

  public Map<String, Quantity> getRequests();

  public <K, V> A withRequests(Map<String, Quantity> requests);

  public Boolean hasRequests();
}
