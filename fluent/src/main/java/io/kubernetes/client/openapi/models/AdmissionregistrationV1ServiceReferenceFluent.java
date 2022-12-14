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

/** Generated */
public interface AdmissionregistrationV1ServiceReferenceFluent<
        A extends AdmissionregistrationV1ServiceReferenceFluent<A>>
    extends Fluent<A> {
  public String getName();

  public A withName(String name);

  public Boolean hasName();

  public String getNamespace();

  public A withNamespace(String namespace);

  public Boolean hasNamespace();

  public String getPath();

  public A withPath(String path);

  public Boolean hasPath();

  public Integer getPort();

  public A withPort(Integer port);

  public Boolean hasPort();
}
