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
public interface V1EndpointAddressFluent<A extends V1EndpointAddressFluent<A>> extends Fluent<A> {
  public String getHostname();

  public A withHostname(String hostname);

  public Boolean hasHostname();

  public String getIp();

  public A withIp(String ip);

  public Boolean hasIp();

  public String getNodeName();

  public A withNodeName(String nodeName);

  public Boolean hasNodeName();

  /**
   * This method has been deprecated, please use method buildTargetRef instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectReference getTargetRef();

  public V1ObjectReference buildTargetRef();

  public A withTargetRef(V1ObjectReference targetRef);

  public Boolean hasTargetRef();

  public V1EndpointAddressFluent.TargetRefNested<A> withNewTargetRef();

  public V1EndpointAddressFluent.TargetRefNested<A> withNewTargetRefLike(V1ObjectReference item);

  public V1EndpointAddressFluent.TargetRefNested<A> editTargetRef();

  public V1EndpointAddressFluent.TargetRefNested<A> editOrNewTargetRef();

  public V1EndpointAddressFluent.TargetRefNested<A> editOrNewTargetRefLike(V1ObjectReference item);

  public interface TargetRefNested<N>
      extends Nested<N>, V1ObjectReferenceFluent<V1EndpointAddressFluent.TargetRefNested<N>> {
    public N and();

    public N endTargetRef();
  }
}
