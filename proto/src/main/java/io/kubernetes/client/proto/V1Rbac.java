/*
Copyright 2021 The Kubernetes Authors.
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
package io.kubernetes.client.proto;

public final class V1Rbac {
  private V1Rbac() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public interface AggregationRuleOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.rbac.v1.AggregationRule)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules.
     * If any of the selectors match, then the ClusterRole's permissions will be added
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector clusterRoleSelectors = 1;
     * </code>
     */
    java.util.List<io.kubernetes.client.proto.Meta.LabelSelector> getClusterRoleSelectorsList();
    /**
     *
     *
     * <pre>
     * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules.
     * If any of the selectors match, then the ClusterRole's permissions will be added
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector clusterRoleSelectors = 1;
     * </code>
     */
    io.kubernetes.client.proto.Meta.LabelSelector getClusterRoleSelectors(int index);
    /**
     *
     *
     * <pre>
     * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules.
     * If any of the selectors match, then the ClusterRole's permissions will be added
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector clusterRoleSelectors = 1;
     * </code>
     */
    int getClusterRoleSelectorsCount();
    /**
     *
     *
     * <pre>
     * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules.
     * If any of the selectors match, then the ClusterRole's permissions will be added
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector clusterRoleSelectors = 1;
     * </code>
     */
    java.util.List<? extends io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
        getClusterRoleSelectorsOrBuilderList();
    /**
     *
     *
     * <pre>
     * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules.
     * If any of the selectors match, then the ClusterRole's permissions will be added
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector clusterRoleSelectors = 1;
     * </code>
     */
    io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getClusterRoleSelectorsOrBuilder(
        int index);
  }
  /**
   *
   *
   * <pre>
   * AggregationRule describes how to locate ClusterRoles to aggregate into the ClusterRole
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.rbac.v1.AggregationRule}
   */
  public static final class AggregationRule extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.rbac.v1.AggregationRule)
      AggregationRuleOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use AggregationRule.newBuilder() to construct.
    private AggregationRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private AggregationRule() {
      clusterRoleSelectors_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private AggregationRule(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                  clusterRoleSelectors_ =
                      new java.util.ArrayList<io.kubernetes.client.proto.Meta.LabelSelector>();
                  mutable_bitField0_ |= 0x00000001;
                }
                clusterRoleSelectors_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.LabelSelector.PARSER, extensionRegistry));
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          clusterRoleSelectors_ = java.util.Collections.unmodifiableList(clusterRoleSelectors_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Rbac
          .internal_static_k8s_io_api_rbac_v1_AggregationRule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Rbac
          .internal_static_k8s_io_api_rbac_v1_AggregationRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Rbac.AggregationRule.class,
              io.kubernetes.client.proto.V1Rbac.AggregationRule.Builder.class);
    }

    public static final int CLUSTERROLESELECTORS_FIELD_NUMBER = 1;
    private java.util.List<io.kubernetes.client.proto.Meta.LabelSelector> clusterRoleSelectors_;
    /**
     *
     *
     * <pre>
     * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules.
     * If any of the selectors match, then the ClusterRole's permissions will be added
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector clusterRoleSelectors = 1;
     * </code>
     */
    public java.util.List<io.kubernetes.client.proto.Meta.LabelSelector>
        getClusterRoleSelectorsList() {
      return clusterRoleSelectors_;
    }
    /**
     *
     *
     * <pre>
     * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules.
     * If any of the selectors match, then the ClusterRole's permissions will be added
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector clusterRoleSelectors = 1;
     * </code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
        getClusterRoleSelectorsOrBuilderList() {
      return clusterRoleSelectors_;
    }
    /**
     *
     *
     * <pre>
     * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules.
     * If any of the selectors match, then the ClusterRole's permissions will be added
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector clusterRoleSelectors = 1;
     * </code>
     */
    public int getClusterRoleSelectorsCount() {
      return clusterRoleSelectors_.size();
    }
    /**
     *
     *
     * <pre>
     * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules.
     * If any of the selectors match, then the ClusterRole's permissions will be added
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector clusterRoleSelectors = 1;
     * </code>
     */
    public io.kubernetes.client.proto.Meta.LabelSelector getClusterRoleSelectors(int index) {
      return clusterRoleSelectors_.get(index);
    }
    /**
     *
     *
     * <pre>
     * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules.
     * If any of the selectors match, then the ClusterRole's permissions will be added
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector clusterRoleSelectors = 1;
     * </code>
     */
    public io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder getClusterRoleSelectorsOrBuilder(
        int index) {
      return clusterRoleSelectors_.get(index);
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      for (int i = 0; i < clusterRoleSelectors_.size(); i++) {
        output.writeMessage(1, clusterRoleSelectors_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < clusterRoleSelectors_.size(); i++) {
        size +=
            com.google.protobuf.CodedOutputStream.computeMessageSize(
                1, clusterRoleSelectors_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Rbac.AggregationRule)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Rbac.AggregationRule other =
          (io.kubernetes.client.proto.V1Rbac.AggregationRule) obj;

      boolean result = true;
      result = result && getClusterRoleSelectorsList().equals(other.getClusterRoleSelectorsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getClusterRoleSelectorsCount() > 0) {
        hash = (37 * hash) + CLUSTERROLESELECTORS_FIELD_NUMBER;
        hash = (53 * hash) + getClusterRoleSelectorsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Rbac.AggregationRule parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.AggregationRule parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.AggregationRule parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.AggregationRule parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.AggregationRule parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.AggregationRule parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.AggregationRule parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.AggregationRule parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.AggregationRule parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.AggregationRule parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.AggregationRule parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.AggregationRule parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(io.kubernetes.client.proto.V1Rbac.AggregationRule prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * AggregationRule describes how to locate ClusterRoles to aggregate into the ClusterRole
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.rbac.v1.AggregationRule}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.rbac.v1.AggregationRule)
        io.kubernetes.client.proto.V1Rbac.AggregationRuleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_AggregationRule_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_AggregationRule_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Rbac.AggregationRule.class,
                io.kubernetes.client.proto.V1Rbac.AggregationRule.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Rbac.AggregationRule.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getClusterRoleSelectorsFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (clusterRoleSelectorsBuilder_ == null) {
          clusterRoleSelectors_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          clusterRoleSelectorsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_AggregationRule_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.AggregationRule getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Rbac.AggregationRule.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.AggregationRule build() {
        io.kubernetes.client.proto.V1Rbac.AggregationRule result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.AggregationRule buildPartial() {
        io.kubernetes.client.proto.V1Rbac.AggregationRule result =
            new io.kubernetes.client.proto.V1Rbac.AggregationRule(this);
        int from_bitField0_ = bitField0_;
        if (clusterRoleSelectorsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            clusterRoleSelectors_ = java.util.Collections.unmodifiableList(clusterRoleSelectors_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.clusterRoleSelectors_ = clusterRoleSelectors_;
        } else {
          result.clusterRoleSelectors_ = clusterRoleSelectorsBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Rbac.AggregationRule) {
          return mergeFrom((io.kubernetes.client.proto.V1Rbac.AggregationRule) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Rbac.AggregationRule other) {
        if (other == io.kubernetes.client.proto.V1Rbac.AggregationRule.getDefaultInstance())
          return this;
        if (clusterRoleSelectorsBuilder_ == null) {
          if (!other.clusterRoleSelectors_.isEmpty()) {
            if (clusterRoleSelectors_.isEmpty()) {
              clusterRoleSelectors_ = other.clusterRoleSelectors_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureClusterRoleSelectorsIsMutable();
              clusterRoleSelectors_.addAll(other.clusterRoleSelectors_);
            }
            onChanged();
          }
        } else {
          if (!other.clusterRoleSelectors_.isEmpty()) {
            if (clusterRoleSelectorsBuilder_.isEmpty()) {
              clusterRoleSelectorsBuilder_.dispose();
              clusterRoleSelectorsBuilder_ = null;
              clusterRoleSelectors_ = other.clusterRoleSelectors_;
              bitField0_ = (bitField0_ & ~0x00000001);
              clusterRoleSelectorsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getClusterRoleSelectorsFieldBuilder()
                      : null;
            } else {
              clusterRoleSelectorsBuilder_.addAllMessages(other.clusterRoleSelectors_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Rbac.AggregationRule parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Rbac.AggregationRule) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.util.List<io.kubernetes.client.proto.Meta.LabelSelector> clusterRoleSelectors_ =
          java.util.Collections.emptyList();

      private void ensureClusterRoleSelectorsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          clusterRoleSelectors_ =
              new java.util.ArrayList<io.kubernetes.client.proto.Meta.LabelSelector>(
                  clusterRoleSelectors_);
          bitField0_ |= 0x00000001;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.Meta.LabelSelector,
              io.kubernetes.client.proto.Meta.LabelSelector.Builder,
              io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
          clusterRoleSelectorsBuilder_;

      /**
       *
       *
       * <pre>
       * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules.
       * If any of the selectors match, then the ClusterRole's permissions will be added
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector clusterRoleSelectors = 1;
       * </code>
       */
      public java.util.List<io.kubernetes.client.proto.Meta.LabelSelector>
          getClusterRoleSelectorsList() {
        if (clusterRoleSelectorsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(clusterRoleSelectors_);
        } else {
          return clusterRoleSelectorsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules.
       * If any of the selectors match, then the ClusterRole's permissions will be added
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector clusterRoleSelectors = 1;
       * </code>
       */
      public int getClusterRoleSelectorsCount() {
        if (clusterRoleSelectorsBuilder_ == null) {
          return clusterRoleSelectors_.size();
        } else {
          return clusterRoleSelectorsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules.
       * If any of the selectors match, then the ClusterRole's permissions will be added
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector clusterRoleSelectors = 1;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector getClusterRoleSelectors(int index) {
        if (clusterRoleSelectorsBuilder_ == null) {
          return clusterRoleSelectors_.get(index);
        } else {
          return clusterRoleSelectorsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules.
       * If any of the selectors match, then the ClusterRole's permissions will be added
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector clusterRoleSelectors = 1;
       * </code>
       */
      public Builder setClusterRoleSelectors(
          int index, io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (clusterRoleSelectorsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureClusterRoleSelectorsIsMutable();
          clusterRoleSelectors_.set(index, value);
          onChanged();
        } else {
          clusterRoleSelectorsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules.
       * If any of the selectors match, then the ClusterRole's permissions will be added
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector clusterRoleSelectors = 1;
       * </code>
       */
      public Builder setClusterRoleSelectors(
          int index, io.kubernetes.client.proto.Meta.LabelSelector.Builder builderForValue) {
        if (clusterRoleSelectorsBuilder_ == null) {
          ensureClusterRoleSelectorsIsMutable();
          clusterRoleSelectors_.set(index, builderForValue.build());
          onChanged();
        } else {
          clusterRoleSelectorsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules.
       * If any of the selectors match, then the ClusterRole's permissions will be added
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector clusterRoleSelectors = 1;
       * </code>
       */
      public Builder addClusterRoleSelectors(io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (clusterRoleSelectorsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureClusterRoleSelectorsIsMutable();
          clusterRoleSelectors_.add(value);
          onChanged();
        } else {
          clusterRoleSelectorsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules.
       * If any of the selectors match, then the ClusterRole's permissions will be added
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector clusterRoleSelectors = 1;
       * </code>
       */
      public Builder addClusterRoleSelectors(
          int index, io.kubernetes.client.proto.Meta.LabelSelector value) {
        if (clusterRoleSelectorsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureClusterRoleSelectorsIsMutable();
          clusterRoleSelectors_.add(index, value);
          onChanged();
        } else {
          clusterRoleSelectorsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules.
       * If any of the selectors match, then the ClusterRole's permissions will be added
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector clusterRoleSelectors = 1;
       * </code>
       */
      public Builder addClusterRoleSelectors(
          io.kubernetes.client.proto.Meta.LabelSelector.Builder builderForValue) {
        if (clusterRoleSelectorsBuilder_ == null) {
          ensureClusterRoleSelectorsIsMutable();
          clusterRoleSelectors_.add(builderForValue.build());
          onChanged();
        } else {
          clusterRoleSelectorsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules.
       * If any of the selectors match, then the ClusterRole's permissions will be added
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector clusterRoleSelectors = 1;
       * </code>
       */
      public Builder addClusterRoleSelectors(
          int index, io.kubernetes.client.proto.Meta.LabelSelector.Builder builderForValue) {
        if (clusterRoleSelectorsBuilder_ == null) {
          ensureClusterRoleSelectorsIsMutable();
          clusterRoleSelectors_.add(index, builderForValue.build());
          onChanged();
        } else {
          clusterRoleSelectorsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules.
       * If any of the selectors match, then the ClusterRole's permissions will be added
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector clusterRoleSelectors = 1;
       * </code>
       */
      public Builder addAllClusterRoleSelectors(
          java.lang.Iterable<? extends io.kubernetes.client.proto.Meta.LabelSelector> values) {
        if (clusterRoleSelectorsBuilder_ == null) {
          ensureClusterRoleSelectorsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, clusterRoleSelectors_);
          onChanged();
        } else {
          clusterRoleSelectorsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules.
       * If any of the selectors match, then the ClusterRole's permissions will be added
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector clusterRoleSelectors = 1;
       * </code>
       */
      public Builder clearClusterRoleSelectors() {
        if (clusterRoleSelectorsBuilder_ == null) {
          clusterRoleSelectors_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          clusterRoleSelectorsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules.
       * If any of the selectors match, then the ClusterRole's permissions will be added
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector clusterRoleSelectors = 1;
       * </code>
       */
      public Builder removeClusterRoleSelectors(int index) {
        if (clusterRoleSelectorsBuilder_ == null) {
          ensureClusterRoleSelectorsIsMutable();
          clusterRoleSelectors_.remove(index);
          onChanged();
        } else {
          clusterRoleSelectorsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules.
       * If any of the selectors match, then the ClusterRole's permissions will be added
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector clusterRoleSelectors = 1;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector.Builder getClusterRoleSelectorsBuilder(
          int index) {
        return getClusterRoleSelectorsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules.
       * If any of the selectors match, then the ClusterRole's permissions will be added
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector clusterRoleSelectors = 1;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder
          getClusterRoleSelectorsOrBuilder(int index) {
        if (clusterRoleSelectorsBuilder_ == null) {
          return clusterRoleSelectors_.get(index);
        } else {
          return clusterRoleSelectorsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules.
       * If any of the selectors match, then the ClusterRole's permissions will be added
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector clusterRoleSelectors = 1;
       * </code>
       */
      public java.util.List<? extends io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
          getClusterRoleSelectorsOrBuilderList() {
        if (clusterRoleSelectorsBuilder_ != null) {
          return clusterRoleSelectorsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(clusterRoleSelectors_);
        }
      }
      /**
       *
       *
       * <pre>
       * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules.
       * If any of the selectors match, then the ClusterRole's permissions will be added
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector clusterRoleSelectors = 1;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector.Builder
          addClusterRoleSelectorsBuilder() {
        return getClusterRoleSelectorsFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules.
       * If any of the selectors match, then the ClusterRole's permissions will be added
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector clusterRoleSelectors = 1;
       * </code>
       */
      public io.kubernetes.client.proto.Meta.LabelSelector.Builder addClusterRoleSelectorsBuilder(
          int index) {
        return getClusterRoleSelectorsFieldBuilder()
            .addBuilder(index, io.kubernetes.client.proto.Meta.LabelSelector.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules.
       * If any of the selectors match, then the ClusterRole's permissions will be added
       * +optional
       * </pre>
       *
       * <code>
       * repeated .k8s.io.apimachinery.pkg.apis.meta.v1.LabelSelector clusterRoleSelectors = 1;
       * </code>
       */
      public java.util.List<io.kubernetes.client.proto.Meta.LabelSelector.Builder>
          getClusterRoleSelectorsBuilderList() {
        return getClusterRoleSelectorsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.Meta.LabelSelector,
              io.kubernetes.client.proto.Meta.LabelSelector.Builder,
              io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>
          getClusterRoleSelectorsFieldBuilder() {
        if (clusterRoleSelectorsBuilder_ == null) {
          clusterRoleSelectorsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.LabelSelector,
                  io.kubernetes.client.proto.Meta.LabelSelector.Builder,
                  io.kubernetes.client.proto.Meta.LabelSelectorOrBuilder>(
                  clusterRoleSelectors_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          clusterRoleSelectors_ = null;
        }
        return clusterRoleSelectorsBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.rbac.v1.AggregationRule)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.rbac.v1.AggregationRule)
    private static final io.kubernetes.client.proto.V1Rbac.AggregationRule DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Rbac.AggregationRule();
    }

    public static io.kubernetes.client.proto.V1Rbac.AggregationRule getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<AggregationRule> PARSER =
        new com.google.protobuf.AbstractParser<AggregationRule>() {
          @java.lang.Override
          public AggregationRule parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new AggregationRule(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<AggregationRule> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AggregationRule> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Rbac.AggregationRule getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface ClusterRoleOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.rbac.v1.ClusterRole)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMeta getMetadata();
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * Rules holds all the PolicyRules for this ClusterRole
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1Rbac.PolicyRule> getRulesList();
    /**
     *
     *
     * <pre>
     * Rules holds all the PolicyRules for this ClusterRole
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
     */
    io.kubernetes.client.proto.V1Rbac.PolicyRule getRules(int index);
    /**
     *
     *
     * <pre>
     * Rules holds all the PolicyRules for this ClusterRole
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
     */
    int getRulesCount();
    /**
     *
     *
     * <pre>
     * Rules holds all the PolicyRules for this ClusterRole
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1Rbac.PolicyRuleOrBuilder>
        getRulesOrBuilderList();
    /**
     *
     *
     * <pre>
     * Rules holds all the PolicyRules for this ClusterRole
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
     */
    io.kubernetes.client.proto.V1Rbac.PolicyRuleOrBuilder getRulesOrBuilder(int index);

    /**
     *
     *
     * <pre>
     * AggregationRule is an optional field that describes how to build the Rules for this ClusterRole.
     * If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be
     * stomped by the controller.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.rbac.v1.AggregationRule aggregationRule = 3;</code>
     */
    boolean hasAggregationRule();
    /**
     *
     *
     * <pre>
     * AggregationRule is an optional field that describes how to build the Rules for this ClusterRole.
     * If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be
     * stomped by the controller.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.rbac.v1.AggregationRule aggregationRule = 3;</code>
     */
    io.kubernetes.client.proto.V1Rbac.AggregationRule getAggregationRule();
    /**
     *
     *
     * <pre>
     * AggregationRule is an optional field that describes how to build the Rules for this ClusterRole.
     * If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be
     * stomped by the controller.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.rbac.v1.AggregationRule aggregationRule = 3;</code>
     */
    io.kubernetes.client.proto.V1Rbac.AggregationRuleOrBuilder getAggregationRuleOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding or ClusterRoleBinding.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.rbac.v1.ClusterRole}
   */
  public static final class ClusterRole extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.rbac.v1.ClusterRole)
      ClusterRoleOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ClusterRole.newBuilder() to construct.
    private ClusterRole(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ClusterRole() {
      rules_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ClusterRole(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                io.kubernetes.client.proto.Meta.ObjectMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ObjectMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  rules_ = new java.util.ArrayList<io.kubernetes.client.proto.V1Rbac.PolicyRule>();
                  mutable_bitField0_ |= 0x00000002;
                }
                rules_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1Rbac.PolicyRule.PARSER, extensionRegistry));
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.V1Rbac.AggregationRule.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = aggregationRule_.toBuilder();
                }
                aggregationRule_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1Rbac.AggregationRule.PARSER,
                        extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(aggregationRule_);
                  aggregationRule_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          rules_ = java.util.Collections.unmodifiableList(rules_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Rbac
          .internal_static_k8s_io_api_rbac_v1_ClusterRole_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Rbac
          .internal_static_k8s_io_api_rbac_v1_ClusterRole_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Rbac.ClusterRole.class,
              io.kubernetes.client.proto.V1Rbac.ClusterRole.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ObjectMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int RULES_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V1Rbac.PolicyRule> rules_;
    /**
     *
     *
     * <pre>
     * Rules holds all the PolicyRules for this ClusterRole
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1Rbac.PolicyRule> getRulesList() {
      return rules_;
    }
    /**
     *
     *
     * <pre>
     * Rules holds all the PolicyRules for this ClusterRole
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1Rbac.PolicyRuleOrBuilder>
        getRulesOrBuilderList() {
      return rules_;
    }
    /**
     *
     *
     * <pre>
     * Rules holds all the PolicyRules for this ClusterRole
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
     */
    public int getRulesCount() {
      return rules_.size();
    }
    /**
     *
     *
     * <pre>
     * Rules holds all the PolicyRules for this ClusterRole
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
     */
    public io.kubernetes.client.proto.V1Rbac.PolicyRule getRules(int index) {
      return rules_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Rules holds all the PolicyRules for this ClusterRole
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
     */
    public io.kubernetes.client.proto.V1Rbac.PolicyRuleOrBuilder getRulesOrBuilder(int index) {
      return rules_.get(index);
    }

    public static final int AGGREGATIONRULE_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.V1Rbac.AggregationRule aggregationRule_;
    /**
     *
     *
     * <pre>
     * AggregationRule is an optional field that describes how to build the Rules for this ClusterRole.
     * If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be
     * stomped by the controller.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.rbac.v1.AggregationRule aggregationRule = 3;</code>
     */
    public boolean hasAggregationRule() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * AggregationRule is an optional field that describes how to build the Rules for this ClusterRole.
     * If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be
     * stomped by the controller.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.rbac.v1.AggregationRule aggregationRule = 3;</code>
     */
    public io.kubernetes.client.proto.V1Rbac.AggregationRule getAggregationRule() {
      return aggregationRule_ == null
          ? io.kubernetes.client.proto.V1Rbac.AggregationRule.getDefaultInstance()
          : aggregationRule_;
    }
    /**
     *
     *
     * <pre>
     * AggregationRule is an optional field that describes how to build the Rules for this ClusterRole.
     * If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be
     * stomped by the controller.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.api.rbac.v1.AggregationRule aggregationRule = 3;</code>
     */
    public io.kubernetes.client.proto.V1Rbac.AggregationRuleOrBuilder
        getAggregationRuleOrBuilder() {
      return aggregationRule_ == null
          ? io.kubernetes.client.proto.V1Rbac.AggregationRule.getDefaultInstance()
          : aggregationRule_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      for (int i = 0; i < rules_.size(); i++) {
        output.writeMessage(2, rules_.get(i));
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(3, getAggregationRule());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      for (int i = 0; i < rules_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, rules_.get(i));
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getAggregationRule());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Rbac.ClusterRole)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Rbac.ClusterRole other =
          (io.kubernetes.client.proto.V1Rbac.ClusterRole) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && getRulesList().equals(other.getRulesList());
      result = result && (hasAggregationRule() == other.hasAggregationRule());
      if (hasAggregationRule()) {
        result = result && getAggregationRule().equals(other.getAggregationRule());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (getRulesCount() > 0) {
        hash = (37 * hash) + RULES_FIELD_NUMBER;
        hash = (53 * hash) + getRulesList().hashCode();
      }
      if (hasAggregationRule()) {
        hash = (37 * hash) + AGGREGATIONRULE_FIELD_NUMBER;
        hash = (53 * hash) + getAggregationRule().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRole parseFrom(java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRole parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRole parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRole parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRole parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRole parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRole parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRole parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRole parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRole parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRole parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRole parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(io.kubernetes.client.proto.V1Rbac.ClusterRole prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding or ClusterRoleBinding.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.rbac.v1.ClusterRole}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.rbac.v1.ClusterRole)
        io.kubernetes.client.proto.V1Rbac.ClusterRoleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_ClusterRole_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_ClusterRole_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Rbac.ClusterRole.class,
                io.kubernetes.client.proto.V1Rbac.ClusterRole.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Rbac.ClusterRole.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getRulesFieldBuilder();
          getAggregationRuleFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (rulesBuilder_ == null) {
          rules_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          rulesBuilder_.clear();
        }
        if (aggregationRuleBuilder_ == null) {
          aggregationRule_ = null;
        } else {
          aggregationRuleBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_ClusterRole_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.ClusterRole getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Rbac.ClusterRole.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.ClusterRole build() {
        io.kubernetes.client.proto.V1Rbac.ClusterRole result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.ClusterRole buildPartial() {
        io.kubernetes.client.proto.V1Rbac.ClusterRole result =
            new io.kubernetes.client.proto.V1Rbac.ClusterRole(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (rulesBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            rules_ = java.util.Collections.unmodifiableList(rules_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.rules_ = rules_;
        } else {
          result.rules_ = rulesBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000002;
        }
        if (aggregationRuleBuilder_ == null) {
          result.aggregationRule_ = aggregationRule_;
        } else {
          result.aggregationRule_ = aggregationRuleBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Rbac.ClusterRole) {
          return mergeFrom((io.kubernetes.client.proto.V1Rbac.ClusterRole) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Rbac.ClusterRole other) {
        if (other == io.kubernetes.client.proto.V1Rbac.ClusterRole.getDefaultInstance())
          return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (rulesBuilder_ == null) {
          if (!other.rules_.isEmpty()) {
            if (rules_.isEmpty()) {
              rules_ = other.rules_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureRulesIsMutable();
              rules_.addAll(other.rules_);
            }
            onChanged();
          }
        } else {
          if (!other.rules_.isEmpty()) {
            if (rulesBuilder_.isEmpty()) {
              rulesBuilder_.dispose();
              rulesBuilder_ = null;
              rules_ = other.rules_;
              bitField0_ = (bitField0_ & ~0x00000002);
              rulesBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getRulesFieldBuilder()
                      : null;
            } else {
              rulesBuilder_.addAllMessages(other.rules_);
            }
          }
        }
        if (other.hasAggregationRule()) {
          mergeAggregationRule(other.getAggregationRule());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Rbac.ClusterRole parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.kubernetes.client.proto.V1Rbac.ClusterRole) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ObjectMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(
          io.kubernetes.client.proto.Meta.ObjectMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ObjectMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ObjectMeta,
                  io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
                  io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private java.util.List<io.kubernetes.client.proto.V1Rbac.PolicyRule> rules_ =
          java.util.Collections.emptyList();

      private void ensureRulesIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          rules_ = new java.util.ArrayList<io.kubernetes.client.proto.V1Rbac.PolicyRule>(rules_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Rbac.PolicyRule,
              io.kubernetes.client.proto.V1Rbac.PolicyRule.Builder,
              io.kubernetes.client.proto.V1Rbac.PolicyRuleOrBuilder>
          rulesBuilder_;

      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this ClusterRole
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Rbac.PolicyRule> getRulesList() {
        if (rulesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(rules_);
        } else {
          return rulesBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this ClusterRole
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public int getRulesCount() {
        if (rulesBuilder_ == null) {
          return rules_.size();
        } else {
          return rulesBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this ClusterRole
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.PolicyRule getRules(int index) {
        if (rulesBuilder_ == null) {
          return rules_.get(index);
        } else {
          return rulesBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this ClusterRole
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public Builder setRules(int index, io.kubernetes.client.proto.V1Rbac.PolicyRule value) {
        if (rulesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRulesIsMutable();
          rules_.set(index, value);
          onChanged();
        } else {
          rulesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this ClusterRole
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public Builder setRules(
          int index, io.kubernetes.client.proto.V1Rbac.PolicyRule.Builder builderForValue) {
        if (rulesBuilder_ == null) {
          ensureRulesIsMutable();
          rules_.set(index, builderForValue.build());
          onChanged();
        } else {
          rulesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this ClusterRole
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public Builder addRules(io.kubernetes.client.proto.V1Rbac.PolicyRule value) {
        if (rulesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRulesIsMutable();
          rules_.add(value);
          onChanged();
        } else {
          rulesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this ClusterRole
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public Builder addRules(int index, io.kubernetes.client.proto.V1Rbac.PolicyRule value) {
        if (rulesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRulesIsMutable();
          rules_.add(index, value);
          onChanged();
        } else {
          rulesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this ClusterRole
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public Builder addRules(
          io.kubernetes.client.proto.V1Rbac.PolicyRule.Builder builderForValue) {
        if (rulesBuilder_ == null) {
          ensureRulesIsMutable();
          rules_.add(builderForValue.build());
          onChanged();
        } else {
          rulesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this ClusterRole
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public Builder addRules(
          int index, io.kubernetes.client.proto.V1Rbac.PolicyRule.Builder builderForValue) {
        if (rulesBuilder_ == null) {
          ensureRulesIsMutable();
          rules_.add(index, builderForValue.build());
          onChanged();
        } else {
          rulesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this ClusterRole
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public Builder addAllRules(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1Rbac.PolicyRule> values) {
        if (rulesBuilder_ == null) {
          ensureRulesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, rules_);
          onChanged();
        } else {
          rulesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this ClusterRole
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public Builder clearRules() {
        if (rulesBuilder_ == null) {
          rules_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          rulesBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this ClusterRole
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public Builder removeRules(int index) {
        if (rulesBuilder_ == null) {
          ensureRulesIsMutable();
          rules_.remove(index);
          onChanged();
        } else {
          rulesBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this ClusterRole
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.PolicyRule.Builder getRulesBuilder(int index) {
        return getRulesFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this ClusterRole
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.PolicyRuleOrBuilder getRulesOrBuilder(int index) {
        if (rulesBuilder_ == null) {
          return rules_.get(index);
        } else {
          return rulesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this ClusterRole
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public java.util.List<? extends io.kubernetes.client.proto.V1Rbac.PolicyRuleOrBuilder>
          getRulesOrBuilderList() {
        if (rulesBuilder_ != null) {
          return rulesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(rules_);
        }
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this ClusterRole
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.PolicyRule.Builder addRulesBuilder() {
        return getRulesFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1Rbac.PolicyRule.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this ClusterRole
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.PolicyRule.Builder addRulesBuilder(int index) {
        return getRulesFieldBuilder()
            .addBuilder(index, io.kubernetes.client.proto.V1Rbac.PolicyRule.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this ClusterRole
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Rbac.PolicyRule.Builder>
          getRulesBuilderList() {
        return getRulesFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Rbac.PolicyRule,
              io.kubernetes.client.proto.V1Rbac.PolicyRule.Builder,
              io.kubernetes.client.proto.V1Rbac.PolicyRuleOrBuilder>
          getRulesFieldBuilder() {
        if (rulesBuilder_ == null) {
          rulesBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1Rbac.PolicyRule,
                  io.kubernetes.client.proto.V1Rbac.PolicyRule.Builder,
                  io.kubernetes.client.proto.V1Rbac.PolicyRuleOrBuilder>(
                  rules_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          rules_ = null;
        }
        return rulesBuilder_;
      }

      private io.kubernetes.client.proto.V1Rbac.AggregationRule aggregationRule_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Rbac.AggregationRule,
              io.kubernetes.client.proto.V1Rbac.AggregationRule.Builder,
              io.kubernetes.client.proto.V1Rbac.AggregationRuleOrBuilder>
          aggregationRuleBuilder_;
      /**
       *
       *
       * <pre>
       * AggregationRule is an optional field that describes how to build the Rules for this ClusterRole.
       * If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be
       * stomped by the controller.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.rbac.v1.AggregationRule aggregationRule = 3;</code>
       */
      public boolean hasAggregationRule() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * AggregationRule is an optional field that describes how to build the Rules for this ClusterRole.
       * If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be
       * stomped by the controller.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.rbac.v1.AggregationRule aggregationRule = 3;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.AggregationRule getAggregationRule() {
        if (aggregationRuleBuilder_ == null) {
          return aggregationRule_ == null
              ? io.kubernetes.client.proto.V1Rbac.AggregationRule.getDefaultInstance()
              : aggregationRule_;
        } else {
          return aggregationRuleBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * AggregationRule is an optional field that describes how to build the Rules for this ClusterRole.
       * If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be
       * stomped by the controller.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.rbac.v1.AggregationRule aggregationRule = 3;</code>
       */
      public Builder setAggregationRule(io.kubernetes.client.proto.V1Rbac.AggregationRule value) {
        if (aggregationRuleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          aggregationRule_ = value;
          onChanged();
        } else {
          aggregationRuleBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * AggregationRule is an optional field that describes how to build the Rules for this ClusterRole.
       * If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be
       * stomped by the controller.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.rbac.v1.AggregationRule aggregationRule = 3;</code>
       */
      public Builder setAggregationRule(
          io.kubernetes.client.proto.V1Rbac.AggregationRule.Builder builderForValue) {
        if (aggregationRuleBuilder_ == null) {
          aggregationRule_ = builderForValue.build();
          onChanged();
        } else {
          aggregationRuleBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * AggregationRule is an optional field that describes how to build the Rules for this ClusterRole.
       * If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be
       * stomped by the controller.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.rbac.v1.AggregationRule aggregationRule = 3;</code>
       */
      public Builder mergeAggregationRule(io.kubernetes.client.proto.V1Rbac.AggregationRule value) {
        if (aggregationRuleBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && aggregationRule_ != null
              && aggregationRule_
                  != io.kubernetes.client.proto.V1Rbac.AggregationRule.getDefaultInstance()) {
            aggregationRule_ =
                io.kubernetes.client.proto.V1Rbac.AggregationRule.newBuilder(aggregationRule_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            aggregationRule_ = value;
          }
          onChanged();
        } else {
          aggregationRuleBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * AggregationRule is an optional field that describes how to build the Rules for this ClusterRole.
       * If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be
       * stomped by the controller.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.rbac.v1.AggregationRule aggregationRule = 3;</code>
       */
      public Builder clearAggregationRule() {
        if (aggregationRuleBuilder_ == null) {
          aggregationRule_ = null;
          onChanged();
        } else {
          aggregationRuleBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * AggregationRule is an optional field that describes how to build the Rules for this ClusterRole.
       * If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be
       * stomped by the controller.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.rbac.v1.AggregationRule aggregationRule = 3;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.AggregationRule.Builder getAggregationRuleBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getAggregationRuleFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * AggregationRule is an optional field that describes how to build the Rules for this ClusterRole.
       * If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be
       * stomped by the controller.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.rbac.v1.AggregationRule aggregationRule = 3;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.AggregationRuleOrBuilder
          getAggregationRuleOrBuilder() {
        if (aggregationRuleBuilder_ != null) {
          return aggregationRuleBuilder_.getMessageOrBuilder();
        } else {
          return aggregationRule_ == null
              ? io.kubernetes.client.proto.V1Rbac.AggregationRule.getDefaultInstance()
              : aggregationRule_;
        }
      }
      /**
       *
       *
       * <pre>
       * AggregationRule is an optional field that describes how to build the Rules for this ClusterRole.
       * If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be
       * stomped by the controller.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.api.rbac.v1.AggregationRule aggregationRule = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Rbac.AggregationRule,
              io.kubernetes.client.proto.V1Rbac.AggregationRule.Builder,
              io.kubernetes.client.proto.V1Rbac.AggregationRuleOrBuilder>
          getAggregationRuleFieldBuilder() {
        if (aggregationRuleBuilder_ == null) {
          aggregationRuleBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1Rbac.AggregationRule,
                  io.kubernetes.client.proto.V1Rbac.AggregationRule.Builder,
                  io.kubernetes.client.proto.V1Rbac.AggregationRuleOrBuilder>(
                  getAggregationRule(), getParentForChildren(), isClean());
          aggregationRule_ = null;
        }
        return aggregationRuleBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.rbac.v1.ClusterRole)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.rbac.v1.ClusterRole)
    private static final io.kubernetes.client.proto.V1Rbac.ClusterRole DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Rbac.ClusterRole();
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRole getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ClusterRole> PARSER =
        new com.google.protobuf.AbstractParser<ClusterRole>() {
          @java.lang.Override
          public ClusterRole parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ClusterRole(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ClusterRole> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ClusterRole> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Rbac.ClusterRole getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface ClusterRoleBindingOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.rbac.v1.ClusterRoleBinding)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMeta getMetadata();
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * Subjects holds references to the objects the role applies to.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1Rbac.Subject> getSubjectsList();
    /**
     *
     *
     * <pre>
     * Subjects holds references to the objects the role applies to.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
     */
    io.kubernetes.client.proto.V1Rbac.Subject getSubjects(int index);
    /**
     *
     *
     * <pre>
     * Subjects holds references to the objects the role applies to.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
     */
    int getSubjectsCount();
    /**
     *
     *
     * <pre>
     * Subjects holds references to the objects the role applies to.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1Rbac.SubjectOrBuilder>
        getSubjectsOrBuilderList();
    /**
     *
     *
     * <pre>
     * Subjects holds references to the objects the role applies to.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
     */
    io.kubernetes.client.proto.V1Rbac.SubjectOrBuilder getSubjectsOrBuilder(int index);

    /**
     *
     *
     * <pre>
     * RoleRef can only reference a ClusterRole in the global namespace.
     * If the RoleRef cannot be resolved, the Authorizer must return an error.
     * </pre>
     *
     * <code>optional .k8s.io.api.rbac.v1.RoleRef roleRef = 3;</code>
     */
    boolean hasRoleRef();
    /**
     *
     *
     * <pre>
     * RoleRef can only reference a ClusterRole in the global namespace.
     * If the RoleRef cannot be resolved, the Authorizer must return an error.
     * </pre>
     *
     * <code>optional .k8s.io.api.rbac.v1.RoleRef roleRef = 3;</code>
     */
    io.kubernetes.client.proto.V1Rbac.RoleRef getRoleRef();
    /**
     *
     *
     * <pre>
     * RoleRef can only reference a ClusterRole in the global namespace.
     * If the RoleRef cannot be resolved, the Authorizer must return an error.
     * </pre>
     *
     * <code>optional .k8s.io.api.rbac.v1.RoleRef roleRef = 3;</code>
     */
    io.kubernetes.client.proto.V1Rbac.RoleRefOrBuilder getRoleRefOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * ClusterRoleBinding references a ClusterRole, but not contain it.  It can reference a ClusterRole in the global namespace,
   * and adds who information via Subject.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.rbac.v1.ClusterRoleBinding}
   */
  public static final class ClusterRoleBinding extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.rbac.v1.ClusterRoleBinding)
      ClusterRoleBindingOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ClusterRoleBinding.newBuilder() to construct.
    private ClusterRoleBinding(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ClusterRoleBinding() {
      subjects_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ClusterRoleBinding(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                io.kubernetes.client.proto.Meta.ObjectMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ObjectMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  subjects_ = new java.util.ArrayList<io.kubernetes.client.proto.V1Rbac.Subject>();
                  mutable_bitField0_ |= 0x00000002;
                }
                subjects_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1Rbac.Subject.PARSER, extensionRegistry));
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.V1Rbac.RoleRef.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = roleRef_.toBuilder();
                }
                roleRef_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1Rbac.RoleRef.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(roleRef_);
                  roleRef_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          subjects_ = java.util.Collections.unmodifiableList(subjects_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Rbac
          .internal_static_k8s_io_api_rbac_v1_ClusterRoleBinding_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Rbac
          .internal_static_k8s_io_api_rbac_v1_ClusterRoleBinding_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding.class,
              io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ObjectMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int SUBJECTS_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V1Rbac.Subject> subjects_;
    /**
     *
     *
     * <pre>
     * Subjects holds references to the objects the role applies to.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1Rbac.Subject> getSubjectsList() {
      return subjects_;
    }
    /**
     *
     *
     * <pre>
     * Subjects holds references to the objects the role applies to.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1Rbac.SubjectOrBuilder>
        getSubjectsOrBuilderList() {
      return subjects_;
    }
    /**
     *
     *
     * <pre>
     * Subjects holds references to the objects the role applies to.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
     */
    public int getSubjectsCount() {
      return subjects_.size();
    }
    /**
     *
     *
     * <pre>
     * Subjects holds references to the objects the role applies to.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
     */
    public io.kubernetes.client.proto.V1Rbac.Subject getSubjects(int index) {
      return subjects_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Subjects holds references to the objects the role applies to.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
     */
    public io.kubernetes.client.proto.V1Rbac.SubjectOrBuilder getSubjectsOrBuilder(int index) {
      return subjects_.get(index);
    }

    public static final int ROLEREF_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.V1Rbac.RoleRef roleRef_;
    /**
     *
     *
     * <pre>
     * RoleRef can only reference a ClusterRole in the global namespace.
     * If the RoleRef cannot be resolved, the Authorizer must return an error.
     * </pre>
     *
     * <code>optional .k8s.io.api.rbac.v1.RoleRef roleRef = 3;</code>
     */
    public boolean hasRoleRef() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * RoleRef can only reference a ClusterRole in the global namespace.
     * If the RoleRef cannot be resolved, the Authorizer must return an error.
     * </pre>
     *
     * <code>optional .k8s.io.api.rbac.v1.RoleRef roleRef = 3;</code>
     */
    public io.kubernetes.client.proto.V1Rbac.RoleRef getRoleRef() {
      return roleRef_ == null
          ? io.kubernetes.client.proto.V1Rbac.RoleRef.getDefaultInstance()
          : roleRef_;
    }
    /**
     *
     *
     * <pre>
     * RoleRef can only reference a ClusterRole in the global namespace.
     * If the RoleRef cannot be resolved, the Authorizer must return an error.
     * </pre>
     *
     * <code>optional .k8s.io.api.rbac.v1.RoleRef roleRef = 3;</code>
     */
    public io.kubernetes.client.proto.V1Rbac.RoleRefOrBuilder getRoleRefOrBuilder() {
      return roleRef_ == null
          ? io.kubernetes.client.proto.V1Rbac.RoleRef.getDefaultInstance()
          : roleRef_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      for (int i = 0; i < subjects_.size(); i++) {
        output.writeMessage(2, subjects_.get(i));
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(3, getRoleRef());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      for (int i = 0; i < subjects_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, subjects_.get(i));
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getRoleRef());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding other =
          (io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && getSubjectsList().equals(other.getSubjectsList());
      result = result && (hasRoleRef() == other.hasRoleRef());
      if (hasRoleRef()) {
        result = result && getRoleRef().equals(other.getRoleRef());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (getSubjectsCount() > 0) {
        hash = (37 * hash) + SUBJECTS_FIELD_NUMBER;
        hash = (53 * hash) + getSubjectsList().hashCode();
      }
      if (hasRoleRef()) {
        hash = (37 * hash) + ROLEREF_FIELD_NUMBER;
        hash = (53 * hash) + getRoleRef().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * ClusterRoleBinding references a ClusterRole, but not contain it.  It can reference a ClusterRole in the global namespace,
     * and adds who information via Subject.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.rbac.v1.ClusterRoleBinding}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.rbac.v1.ClusterRoleBinding)
        io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_ClusterRoleBinding_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_ClusterRoleBinding_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding.class,
                io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getSubjectsFieldBuilder();
          getRoleRefFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (subjectsBuilder_ == null) {
          subjects_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          subjectsBuilder_.clear();
        }
        if (roleRefBuilder_ == null) {
          roleRef_ = null;
        } else {
          roleRefBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_ClusterRoleBinding_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding build() {
        io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding buildPartial() {
        io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding result =
            new io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (subjectsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            subjects_ = java.util.Collections.unmodifiableList(subjects_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.subjects_ = subjects_;
        } else {
          result.subjects_ = subjectsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000002;
        }
        if (roleRefBuilder_ == null) {
          result.roleRef_ = roleRef_;
        } else {
          result.roleRef_ = roleRefBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding) {
          return mergeFrom((io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding other) {
        if (other == io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding.getDefaultInstance())
          return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (subjectsBuilder_ == null) {
          if (!other.subjects_.isEmpty()) {
            if (subjects_.isEmpty()) {
              subjects_ = other.subjects_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureSubjectsIsMutable();
              subjects_.addAll(other.subjects_);
            }
            onChanged();
          }
        } else {
          if (!other.subjects_.isEmpty()) {
            if (subjectsBuilder_.isEmpty()) {
              subjectsBuilder_.dispose();
              subjectsBuilder_ = null;
              subjects_ = other.subjects_;
              bitField0_ = (bitField0_ & ~0x00000002);
              subjectsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getSubjectsFieldBuilder()
                      : null;
            } else {
              subjectsBuilder_.addAllMessages(other.subjects_);
            }
          }
        }
        if (other.hasRoleRef()) {
          mergeRoleRef(other.getRoleRef());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ObjectMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(
          io.kubernetes.client.proto.Meta.ObjectMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ObjectMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ObjectMeta,
                  io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
                  io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private java.util.List<io.kubernetes.client.proto.V1Rbac.Subject> subjects_ =
          java.util.Collections.emptyList();

      private void ensureSubjectsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          subjects_ = new java.util.ArrayList<io.kubernetes.client.proto.V1Rbac.Subject>(subjects_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Rbac.Subject,
              io.kubernetes.client.proto.V1Rbac.Subject.Builder,
              io.kubernetes.client.proto.V1Rbac.SubjectOrBuilder>
          subjectsBuilder_;

      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Rbac.Subject> getSubjectsList() {
        if (subjectsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(subjects_);
        } else {
          return subjectsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public int getSubjectsCount() {
        if (subjectsBuilder_ == null) {
          return subjects_.size();
        } else {
          return subjectsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.Subject getSubjects(int index) {
        if (subjectsBuilder_ == null) {
          return subjects_.get(index);
        } else {
          return subjectsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public Builder setSubjects(int index, io.kubernetes.client.proto.V1Rbac.Subject value) {
        if (subjectsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSubjectsIsMutable();
          subjects_.set(index, value);
          onChanged();
        } else {
          subjectsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public Builder setSubjects(
          int index, io.kubernetes.client.proto.V1Rbac.Subject.Builder builderForValue) {
        if (subjectsBuilder_ == null) {
          ensureSubjectsIsMutable();
          subjects_.set(index, builderForValue.build());
          onChanged();
        } else {
          subjectsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public Builder addSubjects(io.kubernetes.client.proto.V1Rbac.Subject value) {
        if (subjectsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSubjectsIsMutable();
          subjects_.add(value);
          onChanged();
        } else {
          subjectsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public Builder addSubjects(int index, io.kubernetes.client.proto.V1Rbac.Subject value) {
        if (subjectsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSubjectsIsMutable();
          subjects_.add(index, value);
          onChanged();
        } else {
          subjectsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public Builder addSubjects(
          io.kubernetes.client.proto.V1Rbac.Subject.Builder builderForValue) {
        if (subjectsBuilder_ == null) {
          ensureSubjectsIsMutable();
          subjects_.add(builderForValue.build());
          onChanged();
        } else {
          subjectsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public Builder addSubjects(
          int index, io.kubernetes.client.proto.V1Rbac.Subject.Builder builderForValue) {
        if (subjectsBuilder_ == null) {
          ensureSubjectsIsMutable();
          subjects_.add(index, builderForValue.build());
          onChanged();
        } else {
          subjectsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public Builder addAllSubjects(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1Rbac.Subject> values) {
        if (subjectsBuilder_ == null) {
          ensureSubjectsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, subjects_);
          onChanged();
        } else {
          subjectsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public Builder clearSubjects() {
        if (subjectsBuilder_ == null) {
          subjects_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          subjectsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public Builder removeSubjects(int index) {
        if (subjectsBuilder_ == null) {
          ensureSubjectsIsMutable();
          subjects_.remove(index);
          onChanged();
        } else {
          subjectsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.Subject.Builder getSubjectsBuilder(int index) {
        return getSubjectsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.SubjectOrBuilder getSubjectsOrBuilder(int index) {
        if (subjectsBuilder_ == null) {
          return subjects_.get(index);
        } else {
          return subjectsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public java.util.List<? extends io.kubernetes.client.proto.V1Rbac.SubjectOrBuilder>
          getSubjectsOrBuilderList() {
        if (subjectsBuilder_ != null) {
          return subjectsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(subjects_);
        }
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.Subject.Builder addSubjectsBuilder() {
        return getSubjectsFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1Rbac.Subject.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.Subject.Builder addSubjectsBuilder(int index) {
        return getSubjectsFieldBuilder()
            .addBuilder(index, io.kubernetes.client.proto.V1Rbac.Subject.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Rbac.Subject.Builder>
          getSubjectsBuilderList() {
        return getSubjectsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Rbac.Subject,
              io.kubernetes.client.proto.V1Rbac.Subject.Builder,
              io.kubernetes.client.proto.V1Rbac.SubjectOrBuilder>
          getSubjectsFieldBuilder() {
        if (subjectsBuilder_ == null) {
          subjectsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1Rbac.Subject,
                  io.kubernetes.client.proto.V1Rbac.Subject.Builder,
                  io.kubernetes.client.proto.V1Rbac.SubjectOrBuilder>(
                  subjects_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          subjects_ = null;
        }
        return subjectsBuilder_;
      }

      private io.kubernetes.client.proto.V1Rbac.RoleRef roleRef_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Rbac.RoleRef,
              io.kubernetes.client.proto.V1Rbac.RoleRef.Builder,
              io.kubernetes.client.proto.V1Rbac.RoleRefOrBuilder>
          roleRefBuilder_;
      /**
       *
       *
       * <pre>
       * RoleRef can only reference a ClusterRole in the global namespace.
       * If the RoleRef cannot be resolved, the Authorizer must return an error.
       * </pre>
       *
       * <code>optional .k8s.io.api.rbac.v1.RoleRef roleRef = 3;</code>
       */
      public boolean hasRoleRef() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * RoleRef can only reference a ClusterRole in the global namespace.
       * If the RoleRef cannot be resolved, the Authorizer must return an error.
       * </pre>
       *
       * <code>optional .k8s.io.api.rbac.v1.RoleRef roleRef = 3;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.RoleRef getRoleRef() {
        if (roleRefBuilder_ == null) {
          return roleRef_ == null
              ? io.kubernetes.client.proto.V1Rbac.RoleRef.getDefaultInstance()
              : roleRef_;
        } else {
          return roleRefBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * RoleRef can only reference a ClusterRole in the global namespace.
       * If the RoleRef cannot be resolved, the Authorizer must return an error.
       * </pre>
       *
       * <code>optional .k8s.io.api.rbac.v1.RoleRef roleRef = 3;</code>
       */
      public Builder setRoleRef(io.kubernetes.client.proto.V1Rbac.RoleRef value) {
        if (roleRefBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          roleRef_ = value;
          onChanged();
        } else {
          roleRefBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * RoleRef can only reference a ClusterRole in the global namespace.
       * If the RoleRef cannot be resolved, the Authorizer must return an error.
       * </pre>
       *
       * <code>optional .k8s.io.api.rbac.v1.RoleRef roleRef = 3;</code>
       */
      public Builder setRoleRef(io.kubernetes.client.proto.V1Rbac.RoleRef.Builder builderForValue) {
        if (roleRefBuilder_ == null) {
          roleRef_ = builderForValue.build();
          onChanged();
        } else {
          roleRefBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * RoleRef can only reference a ClusterRole in the global namespace.
       * If the RoleRef cannot be resolved, the Authorizer must return an error.
       * </pre>
       *
       * <code>optional .k8s.io.api.rbac.v1.RoleRef roleRef = 3;</code>
       */
      public Builder mergeRoleRef(io.kubernetes.client.proto.V1Rbac.RoleRef value) {
        if (roleRefBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && roleRef_ != null
              && roleRef_ != io.kubernetes.client.proto.V1Rbac.RoleRef.getDefaultInstance()) {
            roleRef_ =
                io.kubernetes.client.proto.V1Rbac.RoleRef.newBuilder(roleRef_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            roleRef_ = value;
          }
          onChanged();
        } else {
          roleRefBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * RoleRef can only reference a ClusterRole in the global namespace.
       * If the RoleRef cannot be resolved, the Authorizer must return an error.
       * </pre>
       *
       * <code>optional .k8s.io.api.rbac.v1.RoleRef roleRef = 3;</code>
       */
      public Builder clearRoleRef() {
        if (roleRefBuilder_ == null) {
          roleRef_ = null;
          onChanged();
        } else {
          roleRefBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * RoleRef can only reference a ClusterRole in the global namespace.
       * If the RoleRef cannot be resolved, the Authorizer must return an error.
       * </pre>
       *
       * <code>optional .k8s.io.api.rbac.v1.RoleRef roleRef = 3;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.RoleRef.Builder getRoleRefBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getRoleRefFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * RoleRef can only reference a ClusterRole in the global namespace.
       * If the RoleRef cannot be resolved, the Authorizer must return an error.
       * </pre>
       *
       * <code>optional .k8s.io.api.rbac.v1.RoleRef roleRef = 3;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.RoleRefOrBuilder getRoleRefOrBuilder() {
        if (roleRefBuilder_ != null) {
          return roleRefBuilder_.getMessageOrBuilder();
        } else {
          return roleRef_ == null
              ? io.kubernetes.client.proto.V1Rbac.RoleRef.getDefaultInstance()
              : roleRef_;
        }
      }
      /**
       *
       *
       * <pre>
       * RoleRef can only reference a ClusterRole in the global namespace.
       * If the RoleRef cannot be resolved, the Authorizer must return an error.
       * </pre>
       *
       * <code>optional .k8s.io.api.rbac.v1.RoleRef roleRef = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Rbac.RoleRef,
              io.kubernetes.client.proto.V1Rbac.RoleRef.Builder,
              io.kubernetes.client.proto.V1Rbac.RoleRefOrBuilder>
          getRoleRefFieldBuilder() {
        if (roleRefBuilder_ == null) {
          roleRefBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1Rbac.RoleRef,
                  io.kubernetes.client.proto.V1Rbac.RoleRef.Builder,
                  io.kubernetes.client.proto.V1Rbac.RoleRefOrBuilder>(
                  getRoleRef(), getParentForChildren(), isClean());
          roleRef_ = null;
        }
        return roleRefBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.rbac.v1.ClusterRoleBinding)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.rbac.v1.ClusterRoleBinding)
    private static final io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding();
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ClusterRoleBinding> PARSER =
        new com.google.protobuf.AbstractParser<ClusterRoleBinding>() {
          @java.lang.Override
          public ClusterRoleBinding parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ClusterRoleBinding(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ClusterRoleBinding> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ClusterRoleBinding> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface ClusterRoleBindingListOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.rbac.v1.ClusterRoleBindingList)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMeta getMetadata();
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * Items is a list of ClusterRoleBindings
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.ClusterRoleBinding items = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding> getItemsList();
    /**
     *
     *
     * <pre>
     * Items is a list of ClusterRoleBindings
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.ClusterRoleBinding items = 2;</code>
     */
    io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding getItems(int index);
    /**
     *
     *
     * <pre>
     * Items is a list of ClusterRoleBindings
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.ClusterRoleBinding items = 2;</code>
     */
    int getItemsCount();
    /**
     *
     *
     * <pre>
     * Items is a list of ClusterRoleBindings
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.ClusterRoleBinding items = 2;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingOrBuilder>
        getItemsOrBuilderList();
    /**
     *
     *
     * <pre>
     * Items is a list of ClusterRoleBindings
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.ClusterRoleBinding items = 2;</code>
     */
    io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingOrBuilder getItemsOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * ClusterRoleBindingList is a collection of ClusterRoleBindings
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.rbac.v1.ClusterRoleBindingList}
   */
  public static final class ClusterRoleBindingList extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.rbac.v1.ClusterRoleBindingList)
      ClusterRoleBindingListOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ClusterRoleBindingList.newBuilder() to construct.
    private ClusterRoleBindingList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ClusterRoleBindingList() {
      items_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ClusterRoleBindingList(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                io.kubernetes.client.proto.Meta.ListMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ListMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  items_ =
                      new java.util.ArrayList<
                          io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding>();
                  mutable_bitField0_ |= 0x00000002;
                }
                items_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding.PARSER,
                        extensionRegistry));
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          items_ = java.util.Collections.unmodifiableList(items_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Rbac
          .internal_static_k8s_io_api_rbac_v1_ClusterRoleBindingList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Rbac
          .internal_static_k8s_io_api_rbac_v1_ClusterRoleBindingList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList.class,
              io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ListMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int ITEMS_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding> items_;
    /**
     *
     *
     * <pre>
     * Items is a list of ClusterRoleBindings
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.ClusterRoleBinding items = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding> getItemsList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * Items is a list of ClusterRoleBindings
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.ClusterRoleBinding items = 2;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingOrBuilder>
        getItemsOrBuilderList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * Items is a list of ClusterRoleBindings
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.ClusterRoleBinding items = 2;</code>
     */
    public int getItemsCount() {
      return items_.size();
    }
    /**
     *
     *
     * <pre>
     * Items is a list of ClusterRoleBindings
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.ClusterRoleBinding items = 2;</code>
     */
    public io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding getItems(int index) {
      return items_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Items is a list of ClusterRoleBindings
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.ClusterRoleBinding items = 2;</code>
     */
    public io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingOrBuilder getItemsOrBuilder(
        int index) {
      return items_.get(index);
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        output.writeMessage(2, items_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, items_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList other =
          (io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && getItemsList().equals(other.getItemsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (getItemsCount() > 0) {
        hash = (37 * hash) + ITEMS_FIELD_NUMBER;
        hash = (53 * hash) + getItemsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
        io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * ClusterRoleBindingList is a collection of ClusterRoleBindings
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.rbac.v1.ClusterRoleBindingList}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.rbac.v1.ClusterRoleBindingList)
        io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_ClusterRoleBindingList_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_ClusterRoleBindingList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList.class,
                io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getItemsFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_ClusterRoleBindingList_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList build() {
        io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList buildPartial() {
        io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList result =
            new io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (itemsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            items_ = java.util.Collections.unmodifiableList(items_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.items_ = items_;
        } else {
          result.items_ = itemsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList) {
          return mergeFrom((io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList other) {
        if (other == io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList.getDefaultInstance())
          return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (itemsBuilder_ == null) {
          if (!other.items_.isEmpty()) {
            if (items_.isEmpty()) {
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureItemsIsMutable();
              items_.addAll(other.items_);
            }
            onChanged();
          }
        } else {
          if (!other.items_.isEmpty()) {
            if (itemsBuilder_.isEmpty()) {
              itemsBuilder_.dispose();
              itemsBuilder_ = null;
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
              itemsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getItemsFieldBuilder()
                      : null;
            } else {
              itemsBuilder_.addAllMessages(other.items_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ListMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ListMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ListMeta,
                  io.kubernetes.client.proto.Meta.ListMeta.Builder,
                  io.kubernetes.client.proto.Meta.ListMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private java.util.List<io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding> items_ =
          java.util.Collections.emptyList();

      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          items_ =
              new java.util.ArrayList<io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding>(items_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding,
              io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding.Builder,
              io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingOrBuilder>
          itemsBuilder_;

      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRoleBinding items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding> getItemsList() {
        if (itemsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(items_);
        } else {
          return itemsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRoleBinding items = 2;</code>
       */
      public int getItemsCount() {
        if (itemsBuilder_ == null) {
          return items_.size();
        } else {
          return itemsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRoleBinding items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding getItems(int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRoleBinding items = 2;</code>
       */
      public Builder setItems(
          int index, io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.set(index, value);
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRoleBinding items = 2;</code>
       */
      public Builder setItems(
          int index, io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.set(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRoleBinding items = 2;</code>
       */
      public Builder addItems(io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRoleBinding items = 2;</code>
       */
      public Builder addItems(
          int index, io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(index, value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRoleBinding items = 2;</code>
       */
      public Builder addItems(
          io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRoleBinding items = 2;</code>
       */
      public Builder addItems(
          int index, io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRoleBinding items = 2;</code>
       */
      public Builder addAllItems(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding>
              values) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, items_);
          onChanged();
        } else {
          itemsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRoleBinding items = 2;</code>
       */
      public Builder clearItems() {
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRoleBinding items = 2;</code>
       */
      public Builder removeItems(int index) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.remove(index);
          onChanged();
        } else {
          itemsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRoleBinding items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding.Builder getItemsBuilder(
          int index) {
        return getItemsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRoleBinding items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingOrBuilder getItemsOrBuilder(
          int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRoleBinding items = 2;</code>
       */
      public java.util.List<? extends io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingOrBuilder>
          getItemsOrBuilderList() {
        if (itemsBuilder_ != null) {
          return itemsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(items_);
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRoleBinding items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding.Builder addItemsBuilder() {
        return getItemsFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRoleBinding items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding.Builder addItemsBuilder(
          int index) {
        return getItemsFieldBuilder()
            .addBuilder(
                index, io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRoleBinding items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding.Builder>
          getItemsBuilderList() {
        return getItemsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding,
              io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding.Builder,
              io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingOrBuilder>
          getItemsFieldBuilder() {
        if (itemsBuilder_ == null) {
          itemsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding,
                  io.kubernetes.client.proto.V1Rbac.ClusterRoleBinding.Builder,
                  io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingOrBuilder>(
                  items_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          items_ = null;
        }
        return itemsBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.rbac.v1.ClusterRoleBindingList)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.rbac.v1.ClusterRoleBindingList)
    private static final io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList();
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ClusterRoleBindingList> PARSER =
        new com.google.protobuf.AbstractParser<ClusterRoleBindingList>() {
          @java.lang.Override
          public ClusterRoleBindingList parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ClusterRoleBindingList(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ClusterRoleBindingList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ClusterRoleBindingList> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Rbac.ClusterRoleBindingList getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface ClusterRoleListOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.rbac.v1.ClusterRoleList)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMeta getMetadata();
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * Items is a list of ClusterRoles
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.ClusterRole items = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1Rbac.ClusterRole> getItemsList();
    /**
     *
     *
     * <pre>
     * Items is a list of ClusterRoles
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.ClusterRole items = 2;</code>
     */
    io.kubernetes.client.proto.V1Rbac.ClusterRole getItems(int index);
    /**
     *
     *
     * <pre>
     * Items is a list of ClusterRoles
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.ClusterRole items = 2;</code>
     */
    int getItemsCount();
    /**
     *
     *
     * <pre>
     * Items is a list of ClusterRoles
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.ClusterRole items = 2;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1Rbac.ClusterRoleOrBuilder>
        getItemsOrBuilderList();
    /**
     *
     *
     * <pre>
     * Items is a list of ClusterRoles
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.ClusterRole items = 2;</code>
     */
    io.kubernetes.client.proto.V1Rbac.ClusterRoleOrBuilder getItemsOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * ClusterRoleList is a collection of ClusterRoles
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.rbac.v1.ClusterRoleList}
   */
  public static final class ClusterRoleList extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.rbac.v1.ClusterRoleList)
      ClusterRoleListOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use ClusterRoleList.newBuilder() to construct.
    private ClusterRoleList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private ClusterRoleList() {
      items_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private ClusterRoleList(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                io.kubernetes.client.proto.Meta.ListMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ListMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  items_ = new java.util.ArrayList<io.kubernetes.client.proto.V1Rbac.ClusterRole>();
                  mutable_bitField0_ |= 0x00000002;
                }
                items_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1Rbac.ClusterRole.PARSER, extensionRegistry));
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          items_ = java.util.Collections.unmodifiableList(items_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Rbac
          .internal_static_k8s_io_api_rbac_v1_ClusterRoleList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Rbac
          .internal_static_k8s_io_api_rbac_v1_ClusterRoleList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Rbac.ClusterRoleList.class,
              io.kubernetes.client.proto.V1Rbac.ClusterRoleList.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ListMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int ITEMS_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V1Rbac.ClusterRole> items_;
    /**
     *
     *
     * <pre>
     * Items is a list of ClusterRoles
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.ClusterRole items = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1Rbac.ClusterRole> getItemsList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * Items is a list of ClusterRoles
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.ClusterRole items = 2;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1Rbac.ClusterRoleOrBuilder>
        getItemsOrBuilderList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * Items is a list of ClusterRoles
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.ClusterRole items = 2;</code>
     */
    public int getItemsCount() {
      return items_.size();
    }
    /**
     *
     *
     * <pre>
     * Items is a list of ClusterRoles
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.ClusterRole items = 2;</code>
     */
    public io.kubernetes.client.proto.V1Rbac.ClusterRole getItems(int index) {
      return items_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Items is a list of ClusterRoles
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.ClusterRole items = 2;</code>
     */
    public io.kubernetes.client.proto.V1Rbac.ClusterRoleOrBuilder getItemsOrBuilder(int index) {
      return items_.get(index);
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        output.writeMessage(2, items_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, items_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Rbac.ClusterRoleList)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Rbac.ClusterRoleList other =
          (io.kubernetes.client.proto.V1Rbac.ClusterRoleList) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && getItemsList().equals(other.getItemsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (getItemsCount() > 0) {
        hash = (37 * hash) + ITEMS_FIELD_NUMBER;
        hash = (53 * hash) + getItemsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleList parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleList parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleList parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleList parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleList parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleList parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleList parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleList parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(io.kubernetes.client.proto.V1Rbac.ClusterRoleList prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * ClusterRoleList is a collection of ClusterRoles
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.rbac.v1.ClusterRoleList}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.rbac.v1.ClusterRoleList)
        io.kubernetes.client.proto.V1Rbac.ClusterRoleListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_ClusterRoleList_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_ClusterRoleList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Rbac.ClusterRoleList.class,
                io.kubernetes.client.proto.V1Rbac.ClusterRoleList.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Rbac.ClusterRoleList.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getItemsFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_ClusterRoleList_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.ClusterRoleList getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Rbac.ClusterRoleList.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.ClusterRoleList build() {
        io.kubernetes.client.proto.V1Rbac.ClusterRoleList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.ClusterRoleList buildPartial() {
        io.kubernetes.client.proto.V1Rbac.ClusterRoleList result =
            new io.kubernetes.client.proto.V1Rbac.ClusterRoleList(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (itemsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            items_ = java.util.Collections.unmodifiableList(items_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.items_ = items_;
        } else {
          result.items_ = itemsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Rbac.ClusterRoleList) {
          return mergeFrom((io.kubernetes.client.proto.V1Rbac.ClusterRoleList) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Rbac.ClusterRoleList other) {
        if (other == io.kubernetes.client.proto.V1Rbac.ClusterRoleList.getDefaultInstance())
          return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (itemsBuilder_ == null) {
          if (!other.items_.isEmpty()) {
            if (items_.isEmpty()) {
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureItemsIsMutable();
              items_.addAll(other.items_);
            }
            onChanged();
          }
        } else {
          if (!other.items_.isEmpty()) {
            if (itemsBuilder_.isEmpty()) {
              itemsBuilder_.dispose();
              itemsBuilder_ = null;
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
              itemsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getItemsFieldBuilder()
                      : null;
            } else {
              itemsBuilder_.addAllMessages(other.items_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Rbac.ClusterRoleList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Rbac.ClusterRoleList) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ListMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ListMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ListMeta,
                  io.kubernetes.client.proto.Meta.ListMeta.Builder,
                  io.kubernetes.client.proto.Meta.ListMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private java.util.List<io.kubernetes.client.proto.V1Rbac.ClusterRole> items_ =
          java.util.Collections.emptyList();

      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          items_ = new java.util.ArrayList<io.kubernetes.client.proto.V1Rbac.ClusterRole>(items_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Rbac.ClusterRole,
              io.kubernetes.client.proto.V1Rbac.ClusterRole.Builder,
              io.kubernetes.client.proto.V1Rbac.ClusterRoleOrBuilder>
          itemsBuilder_;

      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRole items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Rbac.ClusterRole> getItemsList() {
        if (itemsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(items_);
        } else {
          return itemsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRole items = 2;</code>
       */
      public int getItemsCount() {
        if (itemsBuilder_ == null) {
          return items_.size();
        } else {
          return itemsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRole items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.ClusterRole getItems(int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRole items = 2;</code>
       */
      public Builder setItems(int index, io.kubernetes.client.proto.V1Rbac.ClusterRole value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.set(index, value);
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRole items = 2;</code>
       */
      public Builder setItems(
          int index, io.kubernetes.client.proto.V1Rbac.ClusterRole.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.set(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRole items = 2;</code>
       */
      public Builder addItems(io.kubernetes.client.proto.V1Rbac.ClusterRole value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRole items = 2;</code>
       */
      public Builder addItems(int index, io.kubernetes.client.proto.V1Rbac.ClusterRole value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(index, value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRole items = 2;</code>
       */
      public Builder addItems(
          io.kubernetes.client.proto.V1Rbac.ClusterRole.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRole items = 2;</code>
       */
      public Builder addItems(
          int index, io.kubernetes.client.proto.V1Rbac.ClusterRole.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRole items = 2;</code>
       */
      public Builder addAllItems(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1Rbac.ClusterRole> values) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, items_);
          onChanged();
        } else {
          itemsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRole items = 2;</code>
       */
      public Builder clearItems() {
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRole items = 2;</code>
       */
      public Builder removeItems(int index) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.remove(index);
          onChanged();
        } else {
          itemsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRole items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.ClusterRole.Builder getItemsBuilder(int index) {
        return getItemsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRole items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.ClusterRoleOrBuilder getItemsOrBuilder(int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRole items = 2;</code>
       */
      public java.util.List<? extends io.kubernetes.client.proto.V1Rbac.ClusterRoleOrBuilder>
          getItemsOrBuilderList() {
        if (itemsBuilder_ != null) {
          return itemsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(items_);
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRole items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.ClusterRole.Builder addItemsBuilder() {
        return getItemsFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1Rbac.ClusterRole.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRole items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.ClusterRole.Builder addItemsBuilder(int index) {
        return getItemsFieldBuilder()
            .addBuilder(index, io.kubernetes.client.proto.V1Rbac.ClusterRole.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Items is a list of ClusterRoles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.ClusterRole items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Rbac.ClusterRole.Builder>
          getItemsBuilderList() {
        return getItemsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Rbac.ClusterRole,
              io.kubernetes.client.proto.V1Rbac.ClusterRole.Builder,
              io.kubernetes.client.proto.V1Rbac.ClusterRoleOrBuilder>
          getItemsFieldBuilder() {
        if (itemsBuilder_ == null) {
          itemsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1Rbac.ClusterRole,
                  io.kubernetes.client.proto.V1Rbac.ClusterRole.Builder,
                  io.kubernetes.client.proto.V1Rbac.ClusterRoleOrBuilder>(
                  items_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          items_ = null;
        }
        return itemsBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.rbac.v1.ClusterRoleList)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.rbac.v1.ClusterRoleList)
    private static final io.kubernetes.client.proto.V1Rbac.ClusterRoleList DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Rbac.ClusterRoleList();
    }

    public static io.kubernetes.client.proto.V1Rbac.ClusterRoleList getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<ClusterRoleList> PARSER =
        new com.google.protobuf.AbstractParser<ClusterRoleList>() {
          @java.lang.Override
          public ClusterRoleList parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new ClusterRoleList(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<ClusterRoleList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ClusterRoleList> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Rbac.ClusterRoleList getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface PolicyRuleOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.rbac.v1.PolicyRule)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Verbs is a list of Verbs that apply to ALL the ResourceKinds contained in this rule. '*' represents all verbs.
     * </pre>
     *
     * <code>repeated string verbs = 1;</code>
     */
    java.util.List<java.lang.String> getVerbsList();
    /**
     *
     *
     * <pre>
     * Verbs is a list of Verbs that apply to ALL the ResourceKinds contained in this rule. '*' represents all verbs.
     * </pre>
     *
     * <code>repeated string verbs = 1;</code>
     */
    int getVerbsCount();
    /**
     *
     *
     * <pre>
     * Verbs is a list of Verbs that apply to ALL the ResourceKinds contained in this rule. '*' represents all verbs.
     * </pre>
     *
     * <code>repeated string verbs = 1;</code>
     */
    java.lang.String getVerbs(int index);
    /**
     *
     *
     * <pre>
     * Verbs is a list of Verbs that apply to ALL the ResourceKinds contained in this rule. '*' represents all verbs.
     * </pre>
     *
     * <code>repeated string verbs = 1;</code>
     */
    com.google.protobuf.ByteString getVerbsBytes(int index);

    /**
     *
     *
     * <pre>
     * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
     * the enumerated resources in any API group will be allowed.
     * +optional
     * </pre>
     *
     * <code>repeated string apiGroups = 2;</code>
     */
    java.util.List<java.lang.String> getApiGroupsList();
    /**
     *
     *
     * <pre>
     * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
     * the enumerated resources in any API group will be allowed.
     * +optional
     * </pre>
     *
     * <code>repeated string apiGroups = 2;</code>
     */
    int getApiGroupsCount();
    /**
     *
     *
     * <pre>
     * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
     * the enumerated resources in any API group will be allowed.
     * +optional
     * </pre>
     *
     * <code>repeated string apiGroups = 2;</code>
     */
    java.lang.String getApiGroups(int index);
    /**
     *
     *
     * <pre>
     * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
     * the enumerated resources in any API group will be allowed.
     * +optional
     * </pre>
     *
     * <code>repeated string apiGroups = 2;</code>
     */
    com.google.protobuf.ByteString getApiGroupsBytes(int index);

    /**
     *
     *
     * <pre>
     * Resources is a list of resources this rule applies to. '*' represents all resources.
     * +optional
     * </pre>
     *
     * <code>repeated string resources = 3;</code>
     */
    java.util.List<java.lang.String> getResourcesList();
    /**
     *
     *
     * <pre>
     * Resources is a list of resources this rule applies to. '*' represents all resources.
     * +optional
     * </pre>
     *
     * <code>repeated string resources = 3;</code>
     */
    int getResourcesCount();
    /**
     *
     *
     * <pre>
     * Resources is a list of resources this rule applies to. '*' represents all resources.
     * +optional
     * </pre>
     *
     * <code>repeated string resources = 3;</code>
     */
    java.lang.String getResources(int index);
    /**
     *
     *
     * <pre>
     * Resources is a list of resources this rule applies to. '*' represents all resources.
     * +optional
     * </pre>
     *
     * <code>repeated string resources = 3;</code>
     */
    com.google.protobuf.ByteString getResourcesBytes(int index);

    /**
     *
     *
     * <pre>
     * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
     * +optional
     * </pre>
     *
     * <code>repeated string resourceNames = 4;</code>
     */
    java.util.List<java.lang.String> getResourceNamesList();
    /**
     *
     *
     * <pre>
     * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
     * +optional
     * </pre>
     *
     * <code>repeated string resourceNames = 4;</code>
     */
    int getResourceNamesCount();
    /**
     *
     *
     * <pre>
     * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
     * +optional
     * </pre>
     *
     * <code>repeated string resourceNames = 4;</code>
     */
    java.lang.String getResourceNames(int index);
    /**
     *
     *
     * <pre>
     * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
     * +optional
     * </pre>
     *
     * <code>repeated string resourceNames = 4;</code>
     */
    com.google.protobuf.ByteString getResourceNamesBytes(int index);

    /**
     *
     *
     * <pre>
     * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path
     * Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding.
     * Rules can either apply to API resources (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
     * +optional
     * </pre>
     *
     * <code>repeated string nonResourceURLs = 5;</code>
     */
    java.util.List<java.lang.String> getNonResourceURLsList();
    /**
     *
     *
     * <pre>
     * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path
     * Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding.
     * Rules can either apply to API resources (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
     * +optional
     * </pre>
     *
     * <code>repeated string nonResourceURLs = 5;</code>
     */
    int getNonResourceURLsCount();
    /**
     *
     *
     * <pre>
     * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path
     * Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding.
     * Rules can either apply to API resources (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
     * +optional
     * </pre>
     *
     * <code>repeated string nonResourceURLs = 5;</code>
     */
    java.lang.String getNonResourceURLs(int index);
    /**
     *
     *
     * <pre>
     * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path
     * Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding.
     * Rules can either apply to API resources (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
     * +optional
     * </pre>
     *
     * <code>repeated string nonResourceURLs = 5;</code>
     */
    com.google.protobuf.ByteString getNonResourceURLsBytes(int index);
  }
  /**
   *
   *
   * <pre>
   * PolicyRule holds information that describes a policy rule, but does not contain information
   * about who the rule applies to or which namespace the rule applies to.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.rbac.v1.PolicyRule}
   */
  public static final class PolicyRule extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.rbac.v1.PolicyRule)
      PolicyRuleOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use PolicyRule.newBuilder() to construct.
    private PolicyRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private PolicyRule() {
      verbs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      apiGroups_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      resources_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      resourceNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      nonResourceURLs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private PolicyRule(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                  verbs_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000001;
                }
                verbs_.add(bs);
                break;
              }
            case 18:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  apiGroups_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000002;
                }
                apiGroups_.add(bs);
                break;
              }
            case 26:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                  resources_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000004;
                }
                resources_.add(bs);
                break;
              }
            case 34:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                  resourceNames_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000008;
                }
                resourceNames_.add(bs);
                break;
              }
            case 42:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                  nonResourceURLs_ = new com.google.protobuf.LazyStringArrayList();
                  mutable_bitField0_ |= 0x00000010;
                }
                nonResourceURLs_.add(bs);
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          verbs_ = verbs_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          apiGroups_ = apiGroups_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          resources_ = resources_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          resourceNames_ = resourceNames_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
          nonResourceURLs_ = nonResourceURLs_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Rbac
          .internal_static_k8s_io_api_rbac_v1_PolicyRule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Rbac
          .internal_static_k8s_io_api_rbac_v1_PolicyRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Rbac.PolicyRule.class,
              io.kubernetes.client.proto.V1Rbac.PolicyRule.Builder.class);
    }

    public static final int VERBS_FIELD_NUMBER = 1;
    private com.google.protobuf.LazyStringList verbs_;
    /**
     *
     *
     * <pre>
     * Verbs is a list of Verbs that apply to ALL the ResourceKinds contained in this rule. '*' represents all verbs.
     * </pre>
     *
     * <code>repeated string verbs = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList getVerbsList() {
      return verbs_;
    }
    /**
     *
     *
     * <pre>
     * Verbs is a list of Verbs that apply to ALL the ResourceKinds contained in this rule. '*' represents all verbs.
     * </pre>
     *
     * <code>repeated string verbs = 1;</code>
     */
    public int getVerbsCount() {
      return verbs_.size();
    }
    /**
     *
     *
     * <pre>
     * Verbs is a list of Verbs that apply to ALL the ResourceKinds contained in this rule. '*' represents all verbs.
     * </pre>
     *
     * <code>repeated string verbs = 1;</code>
     */
    public java.lang.String getVerbs(int index) {
      return verbs_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Verbs is a list of Verbs that apply to ALL the ResourceKinds contained in this rule. '*' represents all verbs.
     * </pre>
     *
     * <code>repeated string verbs = 1;</code>
     */
    public com.google.protobuf.ByteString getVerbsBytes(int index) {
      return verbs_.getByteString(index);
    }

    public static final int APIGROUPS_FIELD_NUMBER = 2;
    private com.google.protobuf.LazyStringList apiGroups_;
    /**
     *
     *
     * <pre>
     * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
     * the enumerated resources in any API group will be allowed.
     * +optional
     * </pre>
     *
     * <code>repeated string apiGroups = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList getApiGroupsList() {
      return apiGroups_;
    }
    /**
     *
     *
     * <pre>
     * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
     * the enumerated resources in any API group will be allowed.
     * +optional
     * </pre>
     *
     * <code>repeated string apiGroups = 2;</code>
     */
    public int getApiGroupsCount() {
      return apiGroups_.size();
    }
    /**
     *
     *
     * <pre>
     * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
     * the enumerated resources in any API group will be allowed.
     * +optional
     * </pre>
     *
     * <code>repeated string apiGroups = 2;</code>
     */
    public java.lang.String getApiGroups(int index) {
      return apiGroups_.get(index);
    }
    /**
     *
     *
     * <pre>
     * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
     * the enumerated resources in any API group will be allowed.
     * +optional
     * </pre>
     *
     * <code>repeated string apiGroups = 2;</code>
     */
    public com.google.protobuf.ByteString getApiGroupsBytes(int index) {
      return apiGroups_.getByteString(index);
    }

    public static final int RESOURCES_FIELD_NUMBER = 3;
    private com.google.protobuf.LazyStringList resources_;
    /**
     *
     *
     * <pre>
     * Resources is a list of resources this rule applies to. '*' represents all resources.
     * +optional
     * </pre>
     *
     * <code>repeated string resources = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList getResourcesList() {
      return resources_;
    }
    /**
     *
     *
     * <pre>
     * Resources is a list of resources this rule applies to. '*' represents all resources.
     * +optional
     * </pre>
     *
     * <code>repeated string resources = 3;</code>
     */
    public int getResourcesCount() {
      return resources_.size();
    }
    /**
     *
     *
     * <pre>
     * Resources is a list of resources this rule applies to. '*' represents all resources.
     * +optional
     * </pre>
     *
     * <code>repeated string resources = 3;</code>
     */
    public java.lang.String getResources(int index) {
      return resources_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Resources is a list of resources this rule applies to. '*' represents all resources.
     * +optional
     * </pre>
     *
     * <code>repeated string resources = 3;</code>
     */
    public com.google.protobuf.ByteString getResourcesBytes(int index) {
      return resources_.getByteString(index);
    }

    public static final int RESOURCENAMES_FIELD_NUMBER = 4;
    private com.google.protobuf.LazyStringList resourceNames_;
    /**
     *
     *
     * <pre>
     * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
     * +optional
     * </pre>
     *
     * <code>repeated string resourceNames = 4;</code>
     */
    public com.google.protobuf.ProtocolStringList getResourceNamesList() {
      return resourceNames_;
    }
    /**
     *
     *
     * <pre>
     * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
     * +optional
     * </pre>
     *
     * <code>repeated string resourceNames = 4;</code>
     */
    public int getResourceNamesCount() {
      return resourceNames_.size();
    }
    /**
     *
     *
     * <pre>
     * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
     * +optional
     * </pre>
     *
     * <code>repeated string resourceNames = 4;</code>
     */
    public java.lang.String getResourceNames(int index) {
      return resourceNames_.get(index);
    }
    /**
     *
     *
     * <pre>
     * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
     * +optional
     * </pre>
     *
     * <code>repeated string resourceNames = 4;</code>
     */
    public com.google.protobuf.ByteString getResourceNamesBytes(int index) {
      return resourceNames_.getByteString(index);
    }

    public static final int NONRESOURCEURLS_FIELD_NUMBER = 5;
    private com.google.protobuf.LazyStringList nonResourceURLs_;
    /**
     *
     *
     * <pre>
     * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path
     * Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding.
     * Rules can either apply to API resources (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
     * +optional
     * </pre>
     *
     * <code>repeated string nonResourceURLs = 5;</code>
     */
    public com.google.protobuf.ProtocolStringList getNonResourceURLsList() {
      return nonResourceURLs_;
    }
    /**
     *
     *
     * <pre>
     * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path
     * Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding.
     * Rules can either apply to API resources (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
     * +optional
     * </pre>
     *
     * <code>repeated string nonResourceURLs = 5;</code>
     */
    public int getNonResourceURLsCount() {
      return nonResourceURLs_.size();
    }
    /**
     *
     *
     * <pre>
     * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path
     * Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding.
     * Rules can either apply to API resources (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
     * +optional
     * </pre>
     *
     * <code>repeated string nonResourceURLs = 5;</code>
     */
    public java.lang.String getNonResourceURLs(int index) {
      return nonResourceURLs_.get(index);
    }
    /**
     *
     *
     * <pre>
     * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path
     * Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding.
     * Rules can either apply to API resources (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
     * +optional
     * </pre>
     *
     * <code>repeated string nonResourceURLs = 5;</code>
     */
    public com.google.protobuf.ByteString getNonResourceURLsBytes(int index) {
      return nonResourceURLs_.getByteString(index);
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      for (int i = 0; i < verbs_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, verbs_.getRaw(i));
      }
      for (int i = 0; i < apiGroups_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, apiGroups_.getRaw(i));
      }
      for (int i = 0; i < resources_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, resources_.getRaw(i));
      }
      for (int i = 0; i < resourceNames_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, resourceNames_.getRaw(i));
      }
      for (int i = 0; i < nonResourceURLs_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, nonResourceURLs_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < verbs_.size(); i++) {
          dataSize += computeStringSizeNoTag(verbs_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getVerbsList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < apiGroups_.size(); i++) {
          dataSize += computeStringSizeNoTag(apiGroups_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getApiGroupsList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < resources_.size(); i++) {
          dataSize += computeStringSizeNoTag(resources_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getResourcesList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < resourceNames_.size(); i++) {
          dataSize += computeStringSizeNoTag(resourceNames_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getResourceNamesList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < nonResourceURLs_.size(); i++) {
          dataSize += computeStringSizeNoTag(nonResourceURLs_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getNonResourceURLsList().size();
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Rbac.PolicyRule)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Rbac.PolicyRule other =
          (io.kubernetes.client.proto.V1Rbac.PolicyRule) obj;

      boolean result = true;
      result = result && getVerbsList().equals(other.getVerbsList());
      result = result && getApiGroupsList().equals(other.getApiGroupsList());
      result = result && getResourcesList().equals(other.getResourcesList());
      result = result && getResourceNamesList().equals(other.getResourceNamesList());
      result = result && getNonResourceURLsList().equals(other.getNonResourceURLsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getVerbsCount() > 0) {
        hash = (37 * hash) + VERBS_FIELD_NUMBER;
        hash = (53 * hash) + getVerbsList().hashCode();
      }
      if (getApiGroupsCount() > 0) {
        hash = (37 * hash) + APIGROUPS_FIELD_NUMBER;
        hash = (53 * hash) + getApiGroupsList().hashCode();
      }
      if (getResourcesCount() > 0) {
        hash = (37 * hash) + RESOURCES_FIELD_NUMBER;
        hash = (53 * hash) + getResourcesList().hashCode();
      }
      if (getResourceNamesCount() > 0) {
        hash = (37 * hash) + RESOURCENAMES_FIELD_NUMBER;
        hash = (53 * hash) + getResourceNamesList().hashCode();
      }
      if (getNonResourceURLsCount() > 0) {
        hash = (37 * hash) + NONRESOURCEURLS_FIELD_NUMBER;
        hash = (53 * hash) + getNonResourceURLsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Rbac.PolicyRule parseFrom(java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.PolicyRule parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.PolicyRule parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.PolicyRule parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.PolicyRule parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.PolicyRule parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.PolicyRule parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.PolicyRule parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.PolicyRule parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.PolicyRule parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.PolicyRule parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.PolicyRule parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(io.kubernetes.client.proto.V1Rbac.PolicyRule prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * PolicyRule holds information that describes a policy rule, but does not contain information
     * about who the rule applies to or which namespace the rule applies to.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.rbac.v1.PolicyRule}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.rbac.v1.PolicyRule)
        io.kubernetes.client.proto.V1Rbac.PolicyRuleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_PolicyRule_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_PolicyRule_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Rbac.PolicyRule.class,
                io.kubernetes.client.proto.V1Rbac.PolicyRule.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Rbac.PolicyRule.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        verbs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        apiGroups_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        resources_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        resourceNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        nonResourceURLs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_PolicyRule_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.PolicyRule getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Rbac.PolicyRule.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.PolicyRule build() {
        io.kubernetes.client.proto.V1Rbac.PolicyRule result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.PolicyRule buildPartial() {
        io.kubernetes.client.proto.V1Rbac.PolicyRule result =
            new io.kubernetes.client.proto.V1Rbac.PolicyRule(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          verbs_ = verbs_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.verbs_ = verbs_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          apiGroups_ = apiGroups_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.apiGroups_ = apiGroups_;
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          resources_ = resources_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.resources_ = resources_;
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          resourceNames_ = resourceNames_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.resourceNames_ = resourceNames_;
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
          nonResourceURLs_ = nonResourceURLs_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000010);
        }
        result.nonResourceURLs_ = nonResourceURLs_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Rbac.PolicyRule) {
          return mergeFrom((io.kubernetes.client.proto.V1Rbac.PolicyRule) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Rbac.PolicyRule other) {
        if (other == io.kubernetes.client.proto.V1Rbac.PolicyRule.getDefaultInstance()) return this;
        if (!other.verbs_.isEmpty()) {
          if (verbs_.isEmpty()) {
            verbs_ = other.verbs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureVerbsIsMutable();
            verbs_.addAll(other.verbs_);
          }
          onChanged();
        }
        if (!other.apiGroups_.isEmpty()) {
          if (apiGroups_.isEmpty()) {
            apiGroups_ = other.apiGroups_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureApiGroupsIsMutable();
            apiGroups_.addAll(other.apiGroups_);
          }
          onChanged();
        }
        if (!other.resources_.isEmpty()) {
          if (resources_.isEmpty()) {
            resources_ = other.resources_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureResourcesIsMutable();
            resources_.addAll(other.resources_);
          }
          onChanged();
        }
        if (!other.resourceNames_.isEmpty()) {
          if (resourceNames_.isEmpty()) {
            resourceNames_ = other.resourceNames_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureResourceNamesIsMutable();
            resourceNames_.addAll(other.resourceNames_);
          }
          onChanged();
        }
        if (!other.nonResourceURLs_.isEmpty()) {
          if (nonResourceURLs_.isEmpty()) {
            nonResourceURLs_ = other.nonResourceURLs_;
            bitField0_ = (bitField0_ & ~0x00000010);
          } else {
            ensureNonResourceURLsIsMutable();
            nonResourceURLs_.addAll(other.nonResourceURLs_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Rbac.PolicyRule parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.kubernetes.client.proto.V1Rbac.PolicyRule) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private com.google.protobuf.LazyStringList verbs_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureVerbsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          verbs_ = new com.google.protobuf.LazyStringArrayList(verbs_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       *
       *
       * <pre>
       * Verbs is a list of Verbs that apply to ALL the ResourceKinds contained in this rule. '*' represents all verbs.
       * </pre>
       *
       * <code>repeated string verbs = 1;</code>
       */
      public com.google.protobuf.ProtocolStringList getVerbsList() {
        return verbs_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * Verbs is a list of Verbs that apply to ALL the ResourceKinds contained in this rule. '*' represents all verbs.
       * </pre>
       *
       * <code>repeated string verbs = 1;</code>
       */
      public int getVerbsCount() {
        return verbs_.size();
      }
      /**
       *
       *
       * <pre>
       * Verbs is a list of Verbs that apply to ALL the ResourceKinds contained in this rule. '*' represents all verbs.
       * </pre>
       *
       * <code>repeated string verbs = 1;</code>
       */
      public java.lang.String getVerbs(int index) {
        return verbs_.get(index);
      }
      /**
       *
       *
       * <pre>
       * Verbs is a list of Verbs that apply to ALL the ResourceKinds contained in this rule. '*' represents all verbs.
       * </pre>
       *
       * <code>repeated string verbs = 1;</code>
       */
      public com.google.protobuf.ByteString getVerbsBytes(int index) {
        return verbs_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * Verbs is a list of Verbs that apply to ALL the ResourceKinds contained in this rule. '*' represents all verbs.
       * </pre>
       *
       * <code>repeated string verbs = 1;</code>
       */
      public Builder setVerbs(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVerbsIsMutable();
        verbs_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Verbs is a list of Verbs that apply to ALL the ResourceKinds contained in this rule. '*' represents all verbs.
       * </pre>
       *
       * <code>repeated string verbs = 1;</code>
       */
      public Builder addVerbs(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVerbsIsMutable();
        verbs_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Verbs is a list of Verbs that apply to ALL the ResourceKinds contained in this rule. '*' represents all verbs.
       * </pre>
       *
       * <code>repeated string verbs = 1;</code>
       */
      public Builder addAllVerbs(java.lang.Iterable<java.lang.String> values) {
        ensureVerbsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, verbs_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Verbs is a list of Verbs that apply to ALL the ResourceKinds contained in this rule. '*' represents all verbs.
       * </pre>
       *
       * <code>repeated string verbs = 1;</code>
       */
      public Builder clearVerbs() {
        verbs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Verbs is a list of Verbs that apply to ALL the ResourceKinds contained in this rule. '*' represents all verbs.
       * </pre>
       *
       * <code>repeated string verbs = 1;</code>
       */
      public Builder addVerbsBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVerbsIsMutable();
        verbs_.add(value);
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList apiGroups_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureApiGroupsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          apiGroups_ = new com.google.protobuf.LazyStringArrayList(apiGroups_);
          bitField0_ |= 0x00000002;
        }
      }
      /**
       *
       *
       * <pre>
       * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
       * the enumerated resources in any API group will be allowed.
       * +optional
       * </pre>
       *
       * <code>repeated string apiGroups = 2;</code>
       */
      public com.google.protobuf.ProtocolStringList getApiGroupsList() {
        return apiGroups_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
       * the enumerated resources in any API group will be allowed.
       * +optional
       * </pre>
       *
       * <code>repeated string apiGroups = 2;</code>
       */
      public int getApiGroupsCount() {
        return apiGroups_.size();
      }
      /**
       *
       *
       * <pre>
       * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
       * the enumerated resources in any API group will be allowed.
       * +optional
       * </pre>
       *
       * <code>repeated string apiGroups = 2;</code>
       */
      public java.lang.String getApiGroups(int index) {
        return apiGroups_.get(index);
      }
      /**
       *
       *
       * <pre>
       * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
       * the enumerated resources in any API group will be allowed.
       * +optional
       * </pre>
       *
       * <code>repeated string apiGroups = 2;</code>
       */
      public com.google.protobuf.ByteString getApiGroupsBytes(int index) {
        return apiGroups_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
       * the enumerated resources in any API group will be allowed.
       * +optional
       * </pre>
       *
       * <code>repeated string apiGroups = 2;</code>
       */
      public Builder setApiGroups(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureApiGroupsIsMutable();
        apiGroups_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
       * the enumerated resources in any API group will be allowed.
       * +optional
       * </pre>
       *
       * <code>repeated string apiGroups = 2;</code>
       */
      public Builder addApiGroups(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureApiGroupsIsMutable();
        apiGroups_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
       * the enumerated resources in any API group will be allowed.
       * +optional
       * </pre>
       *
       * <code>repeated string apiGroups = 2;</code>
       */
      public Builder addAllApiGroups(java.lang.Iterable<java.lang.String> values) {
        ensureApiGroupsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, apiGroups_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
       * the enumerated resources in any API group will be allowed.
       * +optional
       * </pre>
       *
       * <code>repeated string apiGroups = 2;</code>
       */
      public Builder clearApiGroups() {
        apiGroups_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of
       * the enumerated resources in any API group will be allowed.
       * +optional
       * </pre>
       *
       * <code>repeated string apiGroups = 2;</code>
       */
      public Builder addApiGroupsBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureApiGroupsIsMutable();
        apiGroups_.add(value);
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList resources_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureResourcesIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          resources_ = new com.google.protobuf.LazyStringArrayList(resources_);
          bitField0_ |= 0x00000004;
        }
      }
      /**
       *
       *
       * <pre>
       * Resources is a list of resources this rule applies to. '*' represents all resources.
       * +optional
       * </pre>
       *
       * <code>repeated string resources = 3;</code>
       */
      public com.google.protobuf.ProtocolStringList getResourcesList() {
        return resources_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * Resources is a list of resources this rule applies to. '*' represents all resources.
       * +optional
       * </pre>
       *
       * <code>repeated string resources = 3;</code>
       */
      public int getResourcesCount() {
        return resources_.size();
      }
      /**
       *
       *
       * <pre>
       * Resources is a list of resources this rule applies to. '*' represents all resources.
       * +optional
       * </pre>
       *
       * <code>repeated string resources = 3;</code>
       */
      public java.lang.String getResources(int index) {
        return resources_.get(index);
      }
      /**
       *
       *
       * <pre>
       * Resources is a list of resources this rule applies to. '*' represents all resources.
       * +optional
       * </pre>
       *
       * <code>repeated string resources = 3;</code>
       */
      public com.google.protobuf.ByteString getResourcesBytes(int index) {
        return resources_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * Resources is a list of resources this rule applies to. '*' represents all resources.
       * +optional
       * </pre>
       *
       * <code>repeated string resources = 3;</code>
       */
      public Builder setResources(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourcesIsMutable();
        resources_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Resources is a list of resources this rule applies to. '*' represents all resources.
       * +optional
       * </pre>
       *
       * <code>repeated string resources = 3;</code>
       */
      public Builder addResources(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourcesIsMutable();
        resources_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Resources is a list of resources this rule applies to. '*' represents all resources.
       * +optional
       * </pre>
       *
       * <code>repeated string resources = 3;</code>
       */
      public Builder addAllResources(java.lang.Iterable<java.lang.String> values) {
        ensureResourcesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, resources_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Resources is a list of resources this rule applies to. '*' represents all resources.
       * +optional
       * </pre>
       *
       * <code>repeated string resources = 3;</code>
       */
      public Builder clearResources() {
        resources_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Resources is a list of resources this rule applies to. '*' represents all resources.
       * +optional
       * </pre>
       *
       * <code>repeated string resources = 3;</code>
       */
      public Builder addResourcesBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourcesIsMutable();
        resources_.add(value);
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList resourceNames_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureResourceNamesIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          resourceNames_ = new com.google.protobuf.LazyStringArrayList(resourceNames_);
          bitField0_ |= 0x00000008;
        }
      }
      /**
       *
       *
       * <pre>
       * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
       * +optional
       * </pre>
       *
       * <code>repeated string resourceNames = 4;</code>
       */
      public com.google.protobuf.ProtocolStringList getResourceNamesList() {
        return resourceNames_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
       * +optional
       * </pre>
       *
       * <code>repeated string resourceNames = 4;</code>
       */
      public int getResourceNamesCount() {
        return resourceNames_.size();
      }
      /**
       *
       *
       * <pre>
       * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
       * +optional
       * </pre>
       *
       * <code>repeated string resourceNames = 4;</code>
       */
      public java.lang.String getResourceNames(int index) {
        return resourceNames_.get(index);
      }
      /**
       *
       *
       * <pre>
       * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
       * +optional
       * </pre>
       *
       * <code>repeated string resourceNames = 4;</code>
       */
      public com.google.protobuf.ByteString getResourceNamesBytes(int index) {
        return resourceNames_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
       * +optional
       * </pre>
       *
       * <code>repeated string resourceNames = 4;</code>
       */
      public Builder setResourceNames(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceNamesIsMutable();
        resourceNames_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
       * +optional
       * </pre>
       *
       * <code>repeated string resourceNames = 4;</code>
       */
      public Builder addResourceNames(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceNamesIsMutable();
        resourceNames_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
       * +optional
       * </pre>
       *
       * <code>repeated string resourceNames = 4;</code>
       */
      public Builder addAllResourceNames(java.lang.Iterable<java.lang.String> values) {
        ensureResourceNamesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, resourceNames_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
       * +optional
       * </pre>
       *
       * <code>repeated string resourceNames = 4;</code>
       */
      public Builder clearResourceNames() {
        resourceNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
       * +optional
       * </pre>
       *
       * <code>repeated string resourceNames = 4;</code>
       */
      public Builder addResourceNamesBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceNamesIsMutable();
        resourceNames_.add(value);
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList nonResourceURLs_ =
          com.google.protobuf.LazyStringArrayList.EMPTY;

      private void ensureNonResourceURLsIsMutable() {
        if (!((bitField0_ & 0x00000010) == 0x00000010)) {
          nonResourceURLs_ = new com.google.protobuf.LazyStringArrayList(nonResourceURLs_);
          bitField0_ |= 0x00000010;
        }
      }
      /**
       *
       *
       * <pre>
       * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path
       * Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding.
       * Rules can either apply to API resources (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
       * +optional
       * </pre>
       *
       * <code>repeated string nonResourceURLs = 5;</code>
       */
      public com.google.protobuf.ProtocolStringList getNonResourceURLsList() {
        return nonResourceURLs_.getUnmodifiableView();
      }
      /**
       *
       *
       * <pre>
       * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path
       * Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding.
       * Rules can either apply to API resources (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
       * +optional
       * </pre>
       *
       * <code>repeated string nonResourceURLs = 5;</code>
       */
      public int getNonResourceURLsCount() {
        return nonResourceURLs_.size();
      }
      /**
       *
       *
       * <pre>
       * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path
       * Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding.
       * Rules can either apply to API resources (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
       * +optional
       * </pre>
       *
       * <code>repeated string nonResourceURLs = 5;</code>
       */
      public java.lang.String getNonResourceURLs(int index) {
        return nonResourceURLs_.get(index);
      }
      /**
       *
       *
       * <pre>
       * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path
       * Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding.
       * Rules can either apply to API resources (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
       * +optional
       * </pre>
       *
       * <code>repeated string nonResourceURLs = 5;</code>
       */
      public com.google.protobuf.ByteString getNonResourceURLsBytes(int index) {
        return nonResourceURLs_.getByteString(index);
      }
      /**
       *
       *
       * <pre>
       * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path
       * Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding.
       * Rules can either apply to API resources (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
       * +optional
       * </pre>
       *
       * <code>repeated string nonResourceURLs = 5;</code>
       */
      public Builder setNonResourceURLs(int index, java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNonResourceURLsIsMutable();
        nonResourceURLs_.set(index, value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path
       * Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding.
       * Rules can either apply to API resources (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
       * +optional
       * </pre>
       *
       * <code>repeated string nonResourceURLs = 5;</code>
       */
      public Builder addNonResourceURLs(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNonResourceURLsIsMutable();
        nonResourceURLs_.add(value);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path
       * Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding.
       * Rules can either apply to API resources (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
       * +optional
       * </pre>
       *
       * <code>repeated string nonResourceURLs = 5;</code>
       */
      public Builder addAllNonResourceURLs(java.lang.Iterable<java.lang.String> values) {
        ensureNonResourceURLsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, nonResourceURLs_);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path
       * Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding.
       * Rules can either apply to API resources (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
       * +optional
       * </pre>
       *
       * <code>repeated string nonResourceURLs = 5;</code>
       */
      public Builder clearNonResourceURLs() {
        nonResourceURLs_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path
       * Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding.
       * Rules can either apply to API resources (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
       * +optional
       * </pre>
       *
       * <code>repeated string nonResourceURLs = 5;</code>
       */
      public Builder addNonResourceURLsBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNonResourceURLsIsMutable();
        nonResourceURLs_.add(value);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.rbac.v1.PolicyRule)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.rbac.v1.PolicyRule)
    private static final io.kubernetes.client.proto.V1Rbac.PolicyRule DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Rbac.PolicyRule();
    }

    public static io.kubernetes.client.proto.V1Rbac.PolicyRule getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<PolicyRule> PARSER =
        new com.google.protobuf.AbstractParser<PolicyRule>() {
          @java.lang.Override
          public PolicyRule parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new PolicyRule(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<PolicyRule> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PolicyRule> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Rbac.PolicyRule getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface RoleOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.rbac.v1.Role)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMeta getMetadata();
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * Rules holds all the PolicyRules for this Role
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1Rbac.PolicyRule> getRulesList();
    /**
     *
     *
     * <pre>
     * Rules holds all the PolicyRules for this Role
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
     */
    io.kubernetes.client.proto.V1Rbac.PolicyRule getRules(int index);
    /**
     *
     *
     * <pre>
     * Rules holds all the PolicyRules for this Role
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
     */
    int getRulesCount();
    /**
     *
     *
     * <pre>
     * Rules holds all the PolicyRules for this Role
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1Rbac.PolicyRuleOrBuilder>
        getRulesOrBuilderList();
    /**
     *
     *
     * <pre>
     * Rules holds all the PolicyRules for this Role
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
     */
    io.kubernetes.client.proto.V1Rbac.PolicyRuleOrBuilder getRulesOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * Role is a namespaced, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.rbac.v1.Role}
   */
  public static final class Role extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.rbac.v1.Role)
      RoleOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use Role.newBuilder() to construct.
    private Role(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private Role() {
      rules_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private Role(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                io.kubernetes.client.proto.Meta.ObjectMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ObjectMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  rules_ = new java.util.ArrayList<io.kubernetes.client.proto.V1Rbac.PolicyRule>();
                  mutable_bitField0_ |= 0x00000002;
                }
                rules_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1Rbac.PolicyRule.PARSER, extensionRegistry));
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          rules_ = java.util.Collections.unmodifiableList(rules_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Rbac.internal_static_k8s_io_api_rbac_v1_Role_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Rbac
          .internal_static_k8s_io_api_rbac_v1_Role_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Rbac.Role.class,
              io.kubernetes.client.proto.V1Rbac.Role.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ObjectMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int RULES_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V1Rbac.PolicyRule> rules_;
    /**
     *
     *
     * <pre>
     * Rules holds all the PolicyRules for this Role
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1Rbac.PolicyRule> getRulesList() {
      return rules_;
    }
    /**
     *
     *
     * <pre>
     * Rules holds all the PolicyRules for this Role
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1Rbac.PolicyRuleOrBuilder>
        getRulesOrBuilderList() {
      return rules_;
    }
    /**
     *
     *
     * <pre>
     * Rules holds all the PolicyRules for this Role
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
     */
    public int getRulesCount() {
      return rules_.size();
    }
    /**
     *
     *
     * <pre>
     * Rules holds all the PolicyRules for this Role
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
     */
    public io.kubernetes.client.proto.V1Rbac.PolicyRule getRules(int index) {
      return rules_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Rules holds all the PolicyRules for this Role
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
     */
    public io.kubernetes.client.proto.V1Rbac.PolicyRuleOrBuilder getRulesOrBuilder(int index) {
      return rules_.get(index);
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      for (int i = 0; i < rules_.size(); i++) {
        output.writeMessage(2, rules_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      for (int i = 0; i < rules_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, rules_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Rbac.Role)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Rbac.Role other = (io.kubernetes.client.proto.V1Rbac.Role) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && getRulesList().equals(other.getRulesList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (getRulesCount() > 0) {
        hash = (37 * hash) + RULES_FIELD_NUMBER;
        hash = (53 * hash) + getRulesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Rbac.Role parseFrom(java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.Role parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.Role parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.Role parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.Role parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.Role parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.Role parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.Role parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.Role parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.Role parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.Role parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.Role parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(io.kubernetes.client.proto.V1Rbac.Role prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * Role is a namespaced, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.rbac.v1.Role}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.rbac.v1.Role)
        io.kubernetes.client.proto.V1Rbac.RoleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Rbac.internal_static_k8s_io_api_rbac_v1_Role_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_Role_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Rbac.Role.class,
                io.kubernetes.client.proto.V1Rbac.Role.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Rbac.Role.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getRulesFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (rulesBuilder_ == null) {
          rules_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          rulesBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Rbac.internal_static_k8s_io_api_rbac_v1_Role_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.Role getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Rbac.Role.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.Role build() {
        io.kubernetes.client.proto.V1Rbac.Role result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.Role buildPartial() {
        io.kubernetes.client.proto.V1Rbac.Role result =
            new io.kubernetes.client.proto.V1Rbac.Role(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (rulesBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            rules_ = java.util.Collections.unmodifiableList(rules_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.rules_ = rules_;
        } else {
          result.rules_ = rulesBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Rbac.Role) {
          return mergeFrom((io.kubernetes.client.proto.V1Rbac.Role) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Rbac.Role other) {
        if (other == io.kubernetes.client.proto.V1Rbac.Role.getDefaultInstance()) return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (rulesBuilder_ == null) {
          if (!other.rules_.isEmpty()) {
            if (rules_.isEmpty()) {
              rules_ = other.rules_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureRulesIsMutable();
              rules_.addAll(other.rules_);
            }
            onChanged();
          }
        } else {
          if (!other.rules_.isEmpty()) {
            if (rulesBuilder_.isEmpty()) {
              rulesBuilder_.dispose();
              rulesBuilder_ = null;
              rules_ = other.rules_;
              bitField0_ = (bitField0_ & ~0x00000002);
              rulesBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getRulesFieldBuilder()
                      : null;
            } else {
              rulesBuilder_.addAllMessages(other.rules_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Rbac.Role parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.kubernetes.client.proto.V1Rbac.Role) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ObjectMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(
          io.kubernetes.client.proto.Meta.ObjectMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ObjectMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ObjectMeta,
                  io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
                  io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private java.util.List<io.kubernetes.client.proto.V1Rbac.PolicyRule> rules_ =
          java.util.Collections.emptyList();

      private void ensureRulesIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          rules_ = new java.util.ArrayList<io.kubernetes.client.proto.V1Rbac.PolicyRule>(rules_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Rbac.PolicyRule,
              io.kubernetes.client.proto.V1Rbac.PolicyRule.Builder,
              io.kubernetes.client.proto.V1Rbac.PolicyRuleOrBuilder>
          rulesBuilder_;

      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this Role
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Rbac.PolicyRule> getRulesList() {
        if (rulesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(rules_);
        } else {
          return rulesBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this Role
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public int getRulesCount() {
        if (rulesBuilder_ == null) {
          return rules_.size();
        } else {
          return rulesBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this Role
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.PolicyRule getRules(int index) {
        if (rulesBuilder_ == null) {
          return rules_.get(index);
        } else {
          return rulesBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this Role
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public Builder setRules(int index, io.kubernetes.client.proto.V1Rbac.PolicyRule value) {
        if (rulesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRulesIsMutable();
          rules_.set(index, value);
          onChanged();
        } else {
          rulesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this Role
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public Builder setRules(
          int index, io.kubernetes.client.proto.V1Rbac.PolicyRule.Builder builderForValue) {
        if (rulesBuilder_ == null) {
          ensureRulesIsMutable();
          rules_.set(index, builderForValue.build());
          onChanged();
        } else {
          rulesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this Role
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public Builder addRules(io.kubernetes.client.proto.V1Rbac.PolicyRule value) {
        if (rulesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRulesIsMutable();
          rules_.add(value);
          onChanged();
        } else {
          rulesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this Role
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public Builder addRules(int index, io.kubernetes.client.proto.V1Rbac.PolicyRule value) {
        if (rulesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRulesIsMutable();
          rules_.add(index, value);
          onChanged();
        } else {
          rulesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this Role
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public Builder addRules(
          io.kubernetes.client.proto.V1Rbac.PolicyRule.Builder builderForValue) {
        if (rulesBuilder_ == null) {
          ensureRulesIsMutable();
          rules_.add(builderForValue.build());
          onChanged();
        } else {
          rulesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this Role
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public Builder addRules(
          int index, io.kubernetes.client.proto.V1Rbac.PolicyRule.Builder builderForValue) {
        if (rulesBuilder_ == null) {
          ensureRulesIsMutable();
          rules_.add(index, builderForValue.build());
          onChanged();
        } else {
          rulesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this Role
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public Builder addAllRules(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1Rbac.PolicyRule> values) {
        if (rulesBuilder_ == null) {
          ensureRulesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, rules_);
          onChanged();
        } else {
          rulesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this Role
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public Builder clearRules() {
        if (rulesBuilder_ == null) {
          rules_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          rulesBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this Role
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public Builder removeRules(int index) {
        if (rulesBuilder_ == null) {
          ensureRulesIsMutable();
          rules_.remove(index);
          onChanged();
        } else {
          rulesBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this Role
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.PolicyRule.Builder getRulesBuilder(int index) {
        return getRulesFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this Role
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.PolicyRuleOrBuilder getRulesOrBuilder(int index) {
        if (rulesBuilder_ == null) {
          return rules_.get(index);
        } else {
          return rulesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this Role
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public java.util.List<? extends io.kubernetes.client.proto.V1Rbac.PolicyRuleOrBuilder>
          getRulesOrBuilderList() {
        if (rulesBuilder_ != null) {
          return rulesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(rules_);
        }
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this Role
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.PolicyRule.Builder addRulesBuilder() {
        return getRulesFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1Rbac.PolicyRule.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this Role
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.PolicyRule.Builder addRulesBuilder(int index) {
        return getRulesFieldBuilder()
            .addBuilder(index, io.kubernetes.client.proto.V1Rbac.PolicyRule.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Rules holds all the PolicyRules for this Role
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.PolicyRule rules = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Rbac.PolicyRule.Builder>
          getRulesBuilderList() {
        return getRulesFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Rbac.PolicyRule,
              io.kubernetes.client.proto.V1Rbac.PolicyRule.Builder,
              io.kubernetes.client.proto.V1Rbac.PolicyRuleOrBuilder>
          getRulesFieldBuilder() {
        if (rulesBuilder_ == null) {
          rulesBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1Rbac.PolicyRule,
                  io.kubernetes.client.proto.V1Rbac.PolicyRule.Builder,
                  io.kubernetes.client.proto.V1Rbac.PolicyRuleOrBuilder>(
                  rules_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          rules_ = null;
        }
        return rulesBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.rbac.v1.Role)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.rbac.v1.Role)
    private static final io.kubernetes.client.proto.V1Rbac.Role DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Rbac.Role();
    }

    public static io.kubernetes.client.proto.V1Rbac.Role getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<Role> PARSER =
        new com.google.protobuf.AbstractParser<Role>() {
          @java.lang.Override
          public Role parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new Role(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<Role> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Role> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Rbac.Role getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface RoleBindingOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.rbac.v1.RoleBinding)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMeta getMetadata();
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * Subjects holds references to the objects the role applies to.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1Rbac.Subject> getSubjectsList();
    /**
     *
     *
     * <pre>
     * Subjects holds references to the objects the role applies to.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
     */
    io.kubernetes.client.proto.V1Rbac.Subject getSubjects(int index);
    /**
     *
     *
     * <pre>
     * Subjects holds references to the objects the role applies to.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
     */
    int getSubjectsCount();
    /**
     *
     *
     * <pre>
     * Subjects holds references to the objects the role applies to.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1Rbac.SubjectOrBuilder>
        getSubjectsOrBuilderList();
    /**
     *
     *
     * <pre>
     * Subjects holds references to the objects the role applies to.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
     */
    io.kubernetes.client.proto.V1Rbac.SubjectOrBuilder getSubjectsOrBuilder(int index);

    /**
     *
     *
     * <pre>
     * RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace.
     * If the RoleRef cannot be resolved, the Authorizer must return an error.
     * </pre>
     *
     * <code>optional .k8s.io.api.rbac.v1.RoleRef roleRef = 3;</code>
     */
    boolean hasRoleRef();
    /**
     *
     *
     * <pre>
     * RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace.
     * If the RoleRef cannot be resolved, the Authorizer must return an error.
     * </pre>
     *
     * <code>optional .k8s.io.api.rbac.v1.RoleRef roleRef = 3;</code>
     */
    io.kubernetes.client.proto.V1Rbac.RoleRef getRoleRef();
    /**
     *
     *
     * <pre>
     * RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace.
     * If the RoleRef cannot be resolved, the Authorizer must return an error.
     * </pre>
     *
     * <code>optional .k8s.io.api.rbac.v1.RoleRef roleRef = 3;</code>
     */
    io.kubernetes.client.proto.V1Rbac.RoleRefOrBuilder getRoleRefOrBuilder();
  }
  /**
   *
   *
   * <pre>
   * RoleBinding references a role, but does not contain it.  It can reference a Role in the same namespace or a ClusterRole in the global namespace.
   * It adds who information via Subjects and namespace information by which namespace it exists in.  RoleBindings in a given
   * namespace only have effect in that namespace.
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.rbac.v1.RoleBinding}
   */
  public static final class RoleBinding extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.rbac.v1.RoleBinding)
      RoleBindingOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use RoleBinding.newBuilder() to construct.
    private RoleBinding(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private RoleBinding() {
      subjects_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private RoleBinding(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                io.kubernetes.client.proto.Meta.ObjectMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ObjectMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  subjects_ = new java.util.ArrayList<io.kubernetes.client.proto.V1Rbac.Subject>();
                  mutable_bitField0_ |= 0x00000002;
                }
                subjects_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1Rbac.Subject.PARSER, extensionRegistry));
                break;
              }
            case 26:
              {
                io.kubernetes.client.proto.V1Rbac.RoleRef.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = roleRef_.toBuilder();
                }
                roleRef_ =
                    input.readMessage(
                        io.kubernetes.client.proto.V1Rbac.RoleRef.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(roleRef_);
                  roleRef_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          subjects_ = java.util.Collections.unmodifiableList(subjects_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Rbac
          .internal_static_k8s_io_api_rbac_v1_RoleBinding_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Rbac
          .internal_static_k8s_io_api_rbac_v1_RoleBinding_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Rbac.RoleBinding.class,
              io.kubernetes.client.proto.V1Rbac.RoleBinding.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ObjectMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int SUBJECTS_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V1Rbac.Subject> subjects_;
    /**
     *
     *
     * <pre>
     * Subjects holds references to the objects the role applies to.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1Rbac.Subject> getSubjectsList() {
      return subjects_;
    }
    /**
     *
     *
     * <pre>
     * Subjects holds references to the objects the role applies to.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1Rbac.SubjectOrBuilder>
        getSubjectsOrBuilderList() {
      return subjects_;
    }
    /**
     *
     *
     * <pre>
     * Subjects holds references to the objects the role applies to.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
     */
    public int getSubjectsCount() {
      return subjects_.size();
    }
    /**
     *
     *
     * <pre>
     * Subjects holds references to the objects the role applies to.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
     */
    public io.kubernetes.client.proto.V1Rbac.Subject getSubjects(int index) {
      return subjects_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Subjects holds references to the objects the role applies to.
     * +optional
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
     */
    public io.kubernetes.client.proto.V1Rbac.SubjectOrBuilder getSubjectsOrBuilder(int index) {
      return subjects_.get(index);
    }

    public static final int ROLEREF_FIELD_NUMBER = 3;
    private io.kubernetes.client.proto.V1Rbac.RoleRef roleRef_;
    /**
     *
     *
     * <pre>
     * RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace.
     * If the RoleRef cannot be resolved, the Authorizer must return an error.
     * </pre>
     *
     * <code>optional .k8s.io.api.rbac.v1.RoleRef roleRef = 3;</code>
     */
    public boolean hasRoleRef() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace.
     * If the RoleRef cannot be resolved, the Authorizer must return an error.
     * </pre>
     *
     * <code>optional .k8s.io.api.rbac.v1.RoleRef roleRef = 3;</code>
     */
    public io.kubernetes.client.proto.V1Rbac.RoleRef getRoleRef() {
      return roleRef_ == null
          ? io.kubernetes.client.proto.V1Rbac.RoleRef.getDefaultInstance()
          : roleRef_;
    }
    /**
     *
     *
     * <pre>
     * RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace.
     * If the RoleRef cannot be resolved, the Authorizer must return an error.
     * </pre>
     *
     * <code>optional .k8s.io.api.rbac.v1.RoleRef roleRef = 3;</code>
     */
    public io.kubernetes.client.proto.V1Rbac.RoleRefOrBuilder getRoleRefOrBuilder() {
      return roleRef_ == null
          ? io.kubernetes.client.proto.V1Rbac.RoleRef.getDefaultInstance()
          : roleRef_;
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      for (int i = 0; i < subjects_.size(); i++) {
        output.writeMessage(2, subjects_.get(i));
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(3, getRoleRef());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      for (int i = 0; i < subjects_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, subjects_.get(i));
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getRoleRef());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Rbac.RoleBinding)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Rbac.RoleBinding other =
          (io.kubernetes.client.proto.V1Rbac.RoleBinding) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && getSubjectsList().equals(other.getSubjectsList());
      result = result && (hasRoleRef() == other.hasRoleRef());
      if (hasRoleRef()) {
        result = result && getRoleRef().equals(other.getRoleRef());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (getSubjectsCount() > 0) {
        hash = (37 * hash) + SUBJECTS_FIELD_NUMBER;
        hash = (53 * hash) + getSubjectsList().hashCode();
      }
      if (hasRoleRef()) {
        hash = (37 * hash) + ROLEREF_FIELD_NUMBER;
        hash = (53 * hash) + getRoleRef().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleBinding parseFrom(java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleBinding parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleBinding parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleBinding parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleBinding parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleBinding parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleBinding parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleBinding parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleBinding parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleBinding parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleBinding parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleBinding parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(io.kubernetes.client.proto.V1Rbac.RoleBinding prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * RoleBinding references a role, but does not contain it.  It can reference a Role in the same namespace or a ClusterRole in the global namespace.
     * It adds who information via Subjects and namespace information by which namespace it exists in.  RoleBindings in a given
     * namespace only have effect in that namespace.
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.rbac.v1.RoleBinding}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.rbac.v1.RoleBinding)
        io.kubernetes.client.proto.V1Rbac.RoleBindingOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_RoleBinding_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_RoleBinding_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Rbac.RoleBinding.class,
                io.kubernetes.client.proto.V1Rbac.RoleBinding.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Rbac.RoleBinding.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getSubjectsFieldBuilder();
          getRoleRefFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (subjectsBuilder_ == null) {
          subjects_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          subjectsBuilder_.clear();
        }
        if (roleRefBuilder_ == null) {
          roleRef_ = null;
        } else {
          roleRefBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_RoleBinding_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.RoleBinding getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Rbac.RoleBinding.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.RoleBinding build() {
        io.kubernetes.client.proto.V1Rbac.RoleBinding result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.RoleBinding buildPartial() {
        io.kubernetes.client.proto.V1Rbac.RoleBinding result =
            new io.kubernetes.client.proto.V1Rbac.RoleBinding(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (subjectsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            subjects_ = java.util.Collections.unmodifiableList(subjects_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.subjects_ = subjects_;
        } else {
          result.subjects_ = subjectsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000002;
        }
        if (roleRefBuilder_ == null) {
          result.roleRef_ = roleRef_;
        } else {
          result.roleRef_ = roleRefBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Rbac.RoleBinding) {
          return mergeFrom((io.kubernetes.client.proto.V1Rbac.RoleBinding) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Rbac.RoleBinding other) {
        if (other == io.kubernetes.client.proto.V1Rbac.RoleBinding.getDefaultInstance())
          return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (subjectsBuilder_ == null) {
          if (!other.subjects_.isEmpty()) {
            if (subjects_.isEmpty()) {
              subjects_ = other.subjects_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureSubjectsIsMutable();
              subjects_.addAll(other.subjects_);
            }
            onChanged();
          }
        } else {
          if (!other.subjects_.isEmpty()) {
            if (subjectsBuilder_.isEmpty()) {
              subjectsBuilder_.dispose();
              subjectsBuilder_ = null;
              subjects_ = other.subjects_;
              bitField0_ = (bitField0_ & ~0x00000002);
              subjectsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getSubjectsFieldBuilder()
                      : null;
            } else {
              subjectsBuilder_.addAllMessages(other.subjects_);
            }
          }
        }
        if (other.hasRoleRef()) {
          mergeRoleRef(other.getRoleRef());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Rbac.RoleBinding parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.kubernetes.client.proto.V1Rbac.RoleBinding) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ObjectMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder setMetadata(
          io.kubernetes.client.proto.Meta.ObjectMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ObjectMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ObjectMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ObjectMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ObjectMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ObjectMeta,
              io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
              io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ObjectMeta,
                  io.kubernetes.client.proto.Meta.ObjectMeta.Builder,
                  io.kubernetes.client.proto.Meta.ObjectMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private java.util.List<io.kubernetes.client.proto.V1Rbac.Subject> subjects_ =
          java.util.Collections.emptyList();

      private void ensureSubjectsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          subjects_ = new java.util.ArrayList<io.kubernetes.client.proto.V1Rbac.Subject>(subjects_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Rbac.Subject,
              io.kubernetes.client.proto.V1Rbac.Subject.Builder,
              io.kubernetes.client.proto.V1Rbac.SubjectOrBuilder>
          subjectsBuilder_;

      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Rbac.Subject> getSubjectsList() {
        if (subjectsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(subjects_);
        } else {
          return subjectsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public int getSubjectsCount() {
        if (subjectsBuilder_ == null) {
          return subjects_.size();
        } else {
          return subjectsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.Subject getSubjects(int index) {
        if (subjectsBuilder_ == null) {
          return subjects_.get(index);
        } else {
          return subjectsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public Builder setSubjects(int index, io.kubernetes.client.proto.V1Rbac.Subject value) {
        if (subjectsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSubjectsIsMutable();
          subjects_.set(index, value);
          onChanged();
        } else {
          subjectsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public Builder setSubjects(
          int index, io.kubernetes.client.proto.V1Rbac.Subject.Builder builderForValue) {
        if (subjectsBuilder_ == null) {
          ensureSubjectsIsMutable();
          subjects_.set(index, builderForValue.build());
          onChanged();
        } else {
          subjectsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public Builder addSubjects(io.kubernetes.client.proto.V1Rbac.Subject value) {
        if (subjectsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSubjectsIsMutable();
          subjects_.add(value);
          onChanged();
        } else {
          subjectsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public Builder addSubjects(int index, io.kubernetes.client.proto.V1Rbac.Subject value) {
        if (subjectsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSubjectsIsMutable();
          subjects_.add(index, value);
          onChanged();
        } else {
          subjectsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public Builder addSubjects(
          io.kubernetes.client.proto.V1Rbac.Subject.Builder builderForValue) {
        if (subjectsBuilder_ == null) {
          ensureSubjectsIsMutable();
          subjects_.add(builderForValue.build());
          onChanged();
        } else {
          subjectsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public Builder addSubjects(
          int index, io.kubernetes.client.proto.V1Rbac.Subject.Builder builderForValue) {
        if (subjectsBuilder_ == null) {
          ensureSubjectsIsMutable();
          subjects_.add(index, builderForValue.build());
          onChanged();
        } else {
          subjectsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public Builder addAllSubjects(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1Rbac.Subject> values) {
        if (subjectsBuilder_ == null) {
          ensureSubjectsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, subjects_);
          onChanged();
        } else {
          subjectsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public Builder clearSubjects() {
        if (subjectsBuilder_ == null) {
          subjects_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          subjectsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public Builder removeSubjects(int index) {
        if (subjectsBuilder_ == null) {
          ensureSubjectsIsMutable();
          subjects_.remove(index);
          onChanged();
        } else {
          subjectsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.Subject.Builder getSubjectsBuilder(int index) {
        return getSubjectsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.SubjectOrBuilder getSubjectsOrBuilder(int index) {
        if (subjectsBuilder_ == null) {
          return subjects_.get(index);
        } else {
          return subjectsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public java.util.List<? extends io.kubernetes.client.proto.V1Rbac.SubjectOrBuilder>
          getSubjectsOrBuilderList() {
        if (subjectsBuilder_ != null) {
          return subjectsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(subjects_);
        }
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.Subject.Builder addSubjectsBuilder() {
        return getSubjectsFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1Rbac.Subject.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.Subject.Builder addSubjectsBuilder(int index) {
        return getSubjectsFieldBuilder()
            .addBuilder(index, io.kubernetes.client.proto.V1Rbac.Subject.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Subjects holds references to the objects the role applies to.
       * +optional
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Subject subjects = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Rbac.Subject.Builder>
          getSubjectsBuilderList() {
        return getSubjectsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Rbac.Subject,
              io.kubernetes.client.proto.V1Rbac.Subject.Builder,
              io.kubernetes.client.proto.V1Rbac.SubjectOrBuilder>
          getSubjectsFieldBuilder() {
        if (subjectsBuilder_ == null) {
          subjectsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1Rbac.Subject,
                  io.kubernetes.client.proto.V1Rbac.Subject.Builder,
                  io.kubernetes.client.proto.V1Rbac.SubjectOrBuilder>(
                  subjects_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          subjects_ = null;
        }
        return subjectsBuilder_;
      }

      private io.kubernetes.client.proto.V1Rbac.RoleRef roleRef_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Rbac.RoleRef,
              io.kubernetes.client.proto.V1Rbac.RoleRef.Builder,
              io.kubernetes.client.proto.V1Rbac.RoleRefOrBuilder>
          roleRefBuilder_;
      /**
       *
       *
       * <pre>
       * RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace.
       * If the RoleRef cannot be resolved, the Authorizer must return an error.
       * </pre>
       *
       * <code>optional .k8s.io.api.rbac.v1.RoleRef roleRef = 3;</code>
       */
      public boolean hasRoleRef() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace.
       * If the RoleRef cannot be resolved, the Authorizer must return an error.
       * </pre>
       *
       * <code>optional .k8s.io.api.rbac.v1.RoleRef roleRef = 3;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.RoleRef getRoleRef() {
        if (roleRefBuilder_ == null) {
          return roleRef_ == null
              ? io.kubernetes.client.proto.V1Rbac.RoleRef.getDefaultInstance()
              : roleRef_;
        } else {
          return roleRefBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace.
       * If the RoleRef cannot be resolved, the Authorizer must return an error.
       * </pre>
       *
       * <code>optional .k8s.io.api.rbac.v1.RoleRef roleRef = 3;</code>
       */
      public Builder setRoleRef(io.kubernetes.client.proto.V1Rbac.RoleRef value) {
        if (roleRefBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          roleRef_ = value;
          onChanged();
        } else {
          roleRefBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace.
       * If the RoleRef cannot be resolved, the Authorizer must return an error.
       * </pre>
       *
       * <code>optional .k8s.io.api.rbac.v1.RoleRef roleRef = 3;</code>
       */
      public Builder setRoleRef(io.kubernetes.client.proto.V1Rbac.RoleRef.Builder builderForValue) {
        if (roleRefBuilder_ == null) {
          roleRef_ = builderForValue.build();
          onChanged();
        } else {
          roleRefBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace.
       * If the RoleRef cannot be resolved, the Authorizer must return an error.
       * </pre>
       *
       * <code>optional .k8s.io.api.rbac.v1.RoleRef roleRef = 3;</code>
       */
      public Builder mergeRoleRef(io.kubernetes.client.proto.V1Rbac.RoleRef value) {
        if (roleRefBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && roleRef_ != null
              && roleRef_ != io.kubernetes.client.proto.V1Rbac.RoleRef.getDefaultInstance()) {
            roleRef_ =
                io.kubernetes.client.proto.V1Rbac.RoleRef.newBuilder(roleRef_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            roleRef_ = value;
          }
          onChanged();
        } else {
          roleRefBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       *
       *
       * <pre>
       * RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace.
       * If the RoleRef cannot be resolved, the Authorizer must return an error.
       * </pre>
       *
       * <code>optional .k8s.io.api.rbac.v1.RoleRef roleRef = 3;</code>
       */
      public Builder clearRoleRef() {
        if (roleRefBuilder_ == null) {
          roleRef_ = null;
          onChanged();
        } else {
          roleRefBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       *
       *
       * <pre>
       * RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace.
       * If the RoleRef cannot be resolved, the Authorizer must return an error.
       * </pre>
       *
       * <code>optional .k8s.io.api.rbac.v1.RoleRef roleRef = 3;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.RoleRef.Builder getRoleRefBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getRoleRefFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace.
       * If the RoleRef cannot be resolved, the Authorizer must return an error.
       * </pre>
       *
       * <code>optional .k8s.io.api.rbac.v1.RoleRef roleRef = 3;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.RoleRefOrBuilder getRoleRefOrBuilder() {
        if (roleRefBuilder_ != null) {
          return roleRefBuilder_.getMessageOrBuilder();
        } else {
          return roleRef_ == null
              ? io.kubernetes.client.proto.V1Rbac.RoleRef.getDefaultInstance()
              : roleRef_;
        }
      }
      /**
       *
       *
       * <pre>
       * RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace.
       * If the RoleRef cannot be resolved, the Authorizer must return an error.
       * </pre>
       *
       * <code>optional .k8s.io.api.rbac.v1.RoleRef roleRef = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.V1Rbac.RoleRef,
              io.kubernetes.client.proto.V1Rbac.RoleRef.Builder,
              io.kubernetes.client.proto.V1Rbac.RoleRefOrBuilder>
          getRoleRefFieldBuilder() {
        if (roleRefBuilder_ == null) {
          roleRefBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.V1Rbac.RoleRef,
                  io.kubernetes.client.proto.V1Rbac.RoleRef.Builder,
                  io.kubernetes.client.proto.V1Rbac.RoleRefOrBuilder>(
                  getRoleRef(), getParentForChildren(), isClean());
          roleRef_ = null;
        }
        return roleRefBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.rbac.v1.RoleBinding)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.rbac.v1.RoleBinding)
    private static final io.kubernetes.client.proto.V1Rbac.RoleBinding DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Rbac.RoleBinding();
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleBinding getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<RoleBinding> PARSER =
        new com.google.protobuf.AbstractParser<RoleBinding>() {
          @java.lang.Override
          public RoleBinding parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new RoleBinding(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<RoleBinding> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RoleBinding> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Rbac.RoleBinding getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface RoleBindingListOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.rbac.v1.RoleBindingList)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMeta getMetadata();
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * Items is a list of RoleBindings
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.RoleBinding items = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1Rbac.RoleBinding> getItemsList();
    /**
     *
     *
     * <pre>
     * Items is a list of RoleBindings
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.RoleBinding items = 2;</code>
     */
    io.kubernetes.client.proto.V1Rbac.RoleBinding getItems(int index);
    /**
     *
     *
     * <pre>
     * Items is a list of RoleBindings
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.RoleBinding items = 2;</code>
     */
    int getItemsCount();
    /**
     *
     *
     * <pre>
     * Items is a list of RoleBindings
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.RoleBinding items = 2;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1Rbac.RoleBindingOrBuilder>
        getItemsOrBuilderList();
    /**
     *
     *
     * <pre>
     * Items is a list of RoleBindings
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.RoleBinding items = 2;</code>
     */
    io.kubernetes.client.proto.V1Rbac.RoleBindingOrBuilder getItemsOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * RoleBindingList is a collection of RoleBindings
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.rbac.v1.RoleBindingList}
   */
  public static final class RoleBindingList extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.rbac.v1.RoleBindingList)
      RoleBindingListOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use RoleBindingList.newBuilder() to construct.
    private RoleBindingList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private RoleBindingList() {
      items_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private RoleBindingList(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                io.kubernetes.client.proto.Meta.ListMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ListMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  items_ = new java.util.ArrayList<io.kubernetes.client.proto.V1Rbac.RoleBinding>();
                  mutable_bitField0_ |= 0x00000002;
                }
                items_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1Rbac.RoleBinding.PARSER, extensionRegistry));
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          items_ = java.util.Collections.unmodifiableList(items_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Rbac
          .internal_static_k8s_io_api_rbac_v1_RoleBindingList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Rbac
          .internal_static_k8s_io_api_rbac_v1_RoleBindingList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Rbac.RoleBindingList.class,
              io.kubernetes.client.proto.V1Rbac.RoleBindingList.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ListMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int ITEMS_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V1Rbac.RoleBinding> items_;
    /**
     *
     *
     * <pre>
     * Items is a list of RoleBindings
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.RoleBinding items = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1Rbac.RoleBinding> getItemsList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * Items is a list of RoleBindings
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.RoleBinding items = 2;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1Rbac.RoleBindingOrBuilder>
        getItemsOrBuilderList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * Items is a list of RoleBindings
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.RoleBinding items = 2;</code>
     */
    public int getItemsCount() {
      return items_.size();
    }
    /**
     *
     *
     * <pre>
     * Items is a list of RoleBindings
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.RoleBinding items = 2;</code>
     */
    public io.kubernetes.client.proto.V1Rbac.RoleBinding getItems(int index) {
      return items_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Items is a list of RoleBindings
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.RoleBinding items = 2;</code>
     */
    public io.kubernetes.client.proto.V1Rbac.RoleBindingOrBuilder getItemsOrBuilder(int index) {
      return items_.get(index);
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        output.writeMessage(2, items_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, items_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Rbac.RoleBindingList)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Rbac.RoleBindingList other =
          (io.kubernetes.client.proto.V1Rbac.RoleBindingList) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && getItemsList().equals(other.getItemsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (getItemsCount() > 0) {
        hash = (37 * hash) + ITEMS_FIELD_NUMBER;
        hash = (53 * hash) + getItemsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleBindingList parseFrom(
        java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleBindingList parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleBindingList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleBindingList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleBindingList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleBindingList parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleBindingList parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleBindingList parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleBindingList parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleBindingList parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleBindingList parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleBindingList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(io.kubernetes.client.proto.V1Rbac.RoleBindingList prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * RoleBindingList is a collection of RoleBindings
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.rbac.v1.RoleBindingList}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.rbac.v1.RoleBindingList)
        io.kubernetes.client.proto.V1Rbac.RoleBindingListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_RoleBindingList_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_RoleBindingList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Rbac.RoleBindingList.class,
                io.kubernetes.client.proto.V1Rbac.RoleBindingList.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Rbac.RoleBindingList.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getItemsFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_RoleBindingList_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.RoleBindingList getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Rbac.RoleBindingList.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.RoleBindingList build() {
        io.kubernetes.client.proto.V1Rbac.RoleBindingList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.RoleBindingList buildPartial() {
        io.kubernetes.client.proto.V1Rbac.RoleBindingList result =
            new io.kubernetes.client.proto.V1Rbac.RoleBindingList(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (itemsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            items_ = java.util.Collections.unmodifiableList(items_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.items_ = items_;
        } else {
          result.items_ = itemsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Rbac.RoleBindingList) {
          return mergeFrom((io.kubernetes.client.proto.V1Rbac.RoleBindingList) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Rbac.RoleBindingList other) {
        if (other == io.kubernetes.client.proto.V1Rbac.RoleBindingList.getDefaultInstance())
          return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (itemsBuilder_ == null) {
          if (!other.items_.isEmpty()) {
            if (items_.isEmpty()) {
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureItemsIsMutable();
              items_.addAll(other.items_);
            }
            onChanged();
          }
        } else {
          if (!other.items_.isEmpty()) {
            if (itemsBuilder_.isEmpty()) {
              itemsBuilder_.dispose();
              itemsBuilder_ = null;
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
              itemsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getItemsFieldBuilder()
                      : null;
            } else {
              itemsBuilder_.addAllMessages(other.items_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Rbac.RoleBindingList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (io.kubernetes.client.proto.V1Rbac.RoleBindingList) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ListMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ListMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ListMeta,
                  io.kubernetes.client.proto.Meta.ListMeta.Builder,
                  io.kubernetes.client.proto.Meta.ListMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private java.util.List<io.kubernetes.client.proto.V1Rbac.RoleBinding> items_ =
          java.util.Collections.emptyList();

      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          items_ = new java.util.ArrayList<io.kubernetes.client.proto.V1Rbac.RoleBinding>(items_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Rbac.RoleBinding,
              io.kubernetes.client.proto.V1Rbac.RoleBinding.Builder,
              io.kubernetes.client.proto.V1Rbac.RoleBindingOrBuilder>
          itemsBuilder_;

      /**
       *
       *
       * <pre>
       * Items is a list of RoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.RoleBinding items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Rbac.RoleBinding> getItemsList() {
        if (itemsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(items_);
        } else {
          return itemsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of RoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.RoleBinding items = 2;</code>
       */
      public int getItemsCount() {
        if (itemsBuilder_ == null) {
          return items_.size();
        } else {
          return itemsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of RoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.RoleBinding items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.RoleBinding getItems(int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of RoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.RoleBinding items = 2;</code>
       */
      public Builder setItems(int index, io.kubernetes.client.proto.V1Rbac.RoleBinding value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.set(index, value);
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of RoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.RoleBinding items = 2;</code>
       */
      public Builder setItems(
          int index, io.kubernetes.client.proto.V1Rbac.RoleBinding.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.set(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of RoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.RoleBinding items = 2;</code>
       */
      public Builder addItems(io.kubernetes.client.proto.V1Rbac.RoleBinding value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of RoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.RoleBinding items = 2;</code>
       */
      public Builder addItems(int index, io.kubernetes.client.proto.V1Rbac.RoleBinding value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(index, value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of RoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.RoleBinding items = 2;</code>
       */
      public Builder addItems(
          io.kubernetes.client.proto.V1Rbac.RoleBinding.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of RoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.RoleBinding items = 2;</code>
       */
      public Builder addItems(
          int index, io.kubernetes.client.proto.V1Rbac.RoleBinding.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of RoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.RoleBinding items = 2;</code>
       */
      public Builder addAllItems(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1Rbac.RoleBinding> values) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, items_);
          onChanged();
        } else {
          itemsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of RoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.RoleBinding items = 2;</code>
       */
      public Builder clearItems() {
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of RoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.RoleBinding items = 2;</code>
       */
      public Builder removeItems(int index) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.remove(index);
          onChanged();
        } else {
          itemsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of RoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.RoleBinding items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.RoleBinding.Builder getItemsBuilder(int index) {
        return getItemsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * Items is a list of RoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.RoleBinding items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.RoleBindingOrBuilder getItemsOrBuilder(int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of RoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.RoleBinding items = 2;</code>
       */
      public java.util.List<? extends io.kubernetes.client.proto.V1Rbac.RoleBindingOrBuilder>
          getItemsOrBuilderList() {
        if (itemsBuilder_ != null) {
          return itemsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(items_);
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of RoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.RoleBinding items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.RoleBinding.Builder addItemsBuilder() {
        return getItemsFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1Rbac.RoleBinding.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Items is a list of RoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.RoleBinding items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.RoleBinding.Builder addItemsBuilder(int index) {
        return getItemsFieldBuilder()
            .addBuilder(index, io.kubernetes.client.proto.V1Rbac.RoleBinding.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Items is a list of RoleBindings
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.RoleBinding items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Rbac.RoleBinding.Builder>
          getItemsBuilderList() {
        return getItemsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Rbac.RoleBinding,
              io.kubernetes.client.proto.V1Rbac.RoleBinding.Builder,
              io.kubernetes.client.proto.V1Rbac.RoleBindingOrBuilder>
          getItemsFieldBuilder() {
        if (itemsBuilder_ == null) {
          itemsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1Rbac.RoleBinding,
                  io.kubernetes.client.proto.V1Rbac.RoleBinding.Builder,
                  io.kubernetes.client.proto.V1Rbac.RoleBindingOrBuilder>(
                  items_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          items_ = null;
        }
        return itemsBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.rbac.v1.RoleBindingList)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.rbac.v1.RoleBindingList)
    private static final io.kubernetes.client.proto.V1Rbac.RoleBindingList DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Rbac.RoleBindingList();
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleBindingList getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<RoleBindingList> PARSER =
        new com.google.protobuf.AbstractParser<RoleBindingList>() {
          @java.lang.Override
          public RoleBindingList parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new RoleBindingList(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<RoleBindingList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RoleBindingList> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Rbac.RoleBindingList getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface RoleListOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.rbac.v1.RoleList)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    boolean hasMetadata();
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMeta getMetadata();
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder();

    /**
     *
     *
     * <pre>
     * Items is a list of Roles
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.Role items = 2;</code>
     */
    java.util.List<io.kubernetes.client.proto.V1Rbac.Role> getItemsList();
    /**
     *
     *
     * <pre>
     * Items is a list of Roles
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.Role items = 2;</code>
     */
    io.kubernetes.client.proto.V1Rbac.Role getItems(int index);
    /**
     *
     *
     * <pre>
     * Items is a list of Roles
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.Role items = 2;</code>
     */
    int getItemsCount();
    /**
     *
     *
     * <pre>
     * Items is a list of Roles
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.Role items = 2;</code>
     */
    java.util.List<? extends io.kubernetes.client.proto.V1Rbac.RoleOrBuilder>
        getItemsOrBuilderList();
    /**
     *
     *
     * <pre>
     * Items is a list of Roles
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.Role items = 2;</code>
     */
    io.kubernetes.client.proto.V1Rbac.RoleOrBuilder getItemsOrBuilder(int index);
  }
  /**
   *
   *
   * <pre>
   * RoleList is a collection of Roles
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.rbac.v1.RoleList}
   */
  public static final class RoleList extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.rbac.v1.RoleList)
      RoleListOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use RoleList.newBuilder() to construct.
    private RoleList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private RoleList() {
      items_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private RoleList(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                io.kubernetes.client.proto.Meta.ListMeta.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = metadata_.toBuilder();
                }
                metadata_ =
                    input.readMessage(
                        io.kubernetes.client.proto.Meta.ListMeta.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(metadata_);
                  metadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
            case 18:
              {
                if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                  items_ = new java.util.ArrayList<io.kubernetes.client.proto.V1Rbac.Role>();
                  mutable_bitField0_ |= 0x00000002;
                }
                items_.add(
                    input.readMessage(
                        io.kubernetes.client.proto.V1Rbac.Role.PARSER, extensionRegistry));
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          items_ = java.util.Collections.unmodifiableList(items_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Rbac
          .internal_static_k8s_io_api_rbac_v1_RoleList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Rbac
          .internal_static_k8s_io_api_rbac_v1_RoleList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Rbac.RoleList.class,
              io.kubernetes.client.proto.V1Rbac.RoleList.Builder.class);
    }

    private int bitField0_;
    public static final int METADATA_FIELD_NUMBER = 1;
    private io.kubernetes.client.proto.Meta.ListMeta metadata_;
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }
    /**
     *
     *
     * <pre>
     * Standard object's metadata.
     * +optional
     * </pre>
     *
     * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
     */
    public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
      return metadata_ == null
          ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
          : metadata_;
    }

    public static final int ITEMS_FIELD_NUMBER = 2;
    private java.util.List<io.kubernetes.client.proto.V1Rbac.Role> items_;
    /**
     *
     *
     * <pre>
     * Items is a list of Roles
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.Role items = 2;</code>
     */
    public java.util.List<io.kubernetes.client.proto.V1Rbac.Role> getItemsList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * Items is a list of Roles
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.Role items = 2;</code>
     */
    public java.util.List<? extends io.kubernetes.client.proto.V1Rbac.RoleOrBuilder>
        getItemsOrBuilderList() {
      return items_;
    }
    /**
     *
     *
     * <pre>
     * Items is a list of Roles
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.Role items = 2;</code>
     */
    public int getItemsCount() {
      return items_.size();
    }
    /**
     *
     *
     * <pre>
     * Items is a list of Roles
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.Role items = 2;</code>
     */
    public io.kubernetes.client.proto.V1Rbac.Role getItems(int index) {
      return items_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Items is a list of Roles
     * </pre>
     *
     * <code>repeated .k8s.io.api.rbac.v1.Role items = 2;</code>
     */
    public io.kubernetes.client.proto.V1Rbac.RoleOrBuilder getItemsOrBuilder(int index) {
      return items_.get(index);
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        output.writeMessage(2, items_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetadata());
      }
      for (int i = 0; i < items_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, items_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Rbac.RoleList)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Rbac.RoleList other =
          (io.kubernetes.client.proto.V1Rbac.RoleList) obj;

      boolean result = true;
      result = result && (hasMetadata() == other.hasMetadata());
      if (hasMetadata()) {
        result = result && getMetadata().equals(other.getMetadata());
      }
      result = result && getItemsList().equals(other.getItemsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMetadata()) {
        hash = (37 * hash) + METADATA_FIELD_NUMBER;
        hash = (53 * hash) + getMetadata().hashCode();
      }
      if (getItemsCount() > 0) {
        hash = (37 * hash) + ITEMS_FIELD_NUMBER;
        hash = (53 * hash) + getItemsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleList parseFrom(java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleList parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleList parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleList parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleList parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleList parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleList parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(io.kubernetes.client.proto.V1Rbac.RoleList prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * RoleList is a collection of Roles
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.rbac.v1.RoleList}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.rbac.v1.RoleList)
        io.kubernetes.client.proto.V1Rbac.RoleListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_RoleList_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_RoleList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Rbac.RoleList.class,
                io.kubernetes.client.proto.V1Rbac.RoleList.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Rbac.RoleList.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
          getMetadataFieldBuilder();
          getItemsFieldBuilder();
        }
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (metadataBuilder_ == null) {
          metadata_ = null;
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_RoleList_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.RoleList getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Rbac.RoleList.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.RoleList build() {
        io.kubernetes.client.proto.V1Rbac.RoleList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.RoleList buildPartial() {
        io.kubernetes.client.proto.V1Rbac.RoleList result =
            new io.kubernetes.client.proto.V1Rbac.RoleList(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (metadataBuilder_ == null) {
          result.metadata_ = metadata_;
        } else {
          result.metadata_ = metadataBuilder_.build();
        }
        if (itemsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            items_ = java.util.Collections.unmodifiableList(items_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.items_ = items_;
        } else {
          result.items_ = itemsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Rbac.RoleList) {
          return mergeFrom((io.kubernetes.client.proto.V1Rbac.RoleList) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Rbac.RoleList other) {
        if (other == io.kubernetes.client.proto.V1Rbac.RoleList.getDefaultInstance()) return this;
        if (other.hasMetadata()) {
          mergeMetadata(other.getMetadata());
        }
        if (itemsBuilder_ == null) {
          if (!other.items_.isEmpty()) {
            if (items_.isEmpty()) {
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureItemsIsMutable();
              items_.addAll(other.items_);
            }
            onChanged();
          }
        } else {
          if (!other.items_.isEmpty()) {
            if (itemsBuilder_.isEmpty()) {
              itemsBuilder_.dispose();
              itemsBuilder_ = null;
              items_ = other.items_;
              bitField0_ = (bitField0_ & ~0x00000002);
              itemsBuilder_ =
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                      ? getItemsFieldBuilder()
                      : null;
            } else {
              itemsBuilder_.addAllMessages(other.items_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Rbac.RoleList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.kubernetes.client.proto.V1Rbac.RoleList) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private io.kubernetes.client.proto.Meta.ListMeta metadata_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          metadataBuilder_;
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public boolean hasMetadata() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta getMetadata() {
        if (metadataBuilder_ == null) {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        } else {
          return metadataBuilder_.getMessage();
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
        if (metadataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          metadata_ = value;
          onChanged();
        } else {
          metadataBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder setMetadata(io.kubernetes.client.proto.Meta.ListMeta.Builder builderForValue) {
        if (metadataBuilder_ == null) {
          metadata_ = builderForValue.build();
          onChanged();
        } else {
          metadataBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder mergeMetadata(io.kubernetes.client.proto.Meta.ListMeta value) {
        if (metadataBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && metadata_ != null
              && metadata_ != io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()) {
            metadata_ =
                io.kubernetes.client.proto.Meta.ListMeta.newBuilder(metadata_)
                    .mergeFrom(value)
                    .buildPartial();
          } else {
            metadata_ = value;
          }
          onChanged();
        } else {
          metadataBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public Builder clearMetadata() {
        if (metadataBuilder_ == null) {
          metadata_ = null;
          onChanged();
        } else {
          metadataBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMeta.Builder getMetadataBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMetadataFieldBuilder().getBuilder();
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      public io.kubernetes.client.proto.Meta.ListMetaOrBuilder getMetadataOrBuilder() {
        if (metadataBuilder_ != null) {
          return metadataBuilder_.getMessageOrBuilder();
        } else {
          return metadata_ == null
              ? io.kubernetes.client.proto.Meta.ListMeta.getDefaultInstance()
              : metadata_;
        }
      }
      /**
       *
       *
       * <pre>
       * Standard object's metadata.
       * +optional
       * </pre>
       *
       * <code>optional .k8s.io.apimachinery.pkg.apis.meta.v1.ListMeta metadata = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
              io.kubernetes.client.proto.Meta.ListMeta,
              io.kubernetes.client.proto.Meta.ListMeta.Builder,
              io.kubernetes.client.proto.Meta.ListMetaOrBuilder>
          getMetadataFieldBuilder() {
        if (metadataBuilder_ == null) {
          metadataBuilder_ =
              new com.google.protobuf.SingleFieldBuilderV3<
                  io.kubernetes.client.proto.Meta.ListMeta,
                  io.kubernetes.client.proto.Meta.ListMeta.Builder,
                  io.kubernetes.client.proto.Meta.ListMetaOrBuilder>(
                  getMetadata(), getParentForChildren(), isClean());
          metadata_ = null;
        }
        return metadataBuilder_;
      }

      private java.util.List<io.kubernetes.client.proto.V1Rbac.Role> items_ =
          java.util.Collections.emptyList();

      private void ensureItemsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          items_ = new java.util.ArrayList<io.kubernetes.client.proto.V1Rbac.Role>(items_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Rbac.Role,
              io.kubernetes.client.proto.V1Rbac.Role.Builder,
              io.kubernetes.client.proto.V1Rbac.RoleOrBuilder>
          itemsBuilder_;

      /**
       *
       *
       * <pre>
       * Items is a list of Roles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Role items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Rbac.Role> getItemsList() {
        if (itemsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(items_);
        } else {
          return itemsBuilder_.getMessageList();
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of Roles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Role items = 2;</code>
       */
      public int getItemsCount() {
        if (itemsBuilder_ == null) {
          return items_.size();
        } else {
          return itemsBuilder_.getCount();
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of Roles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Role items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.Role getItems(int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessage(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of Roles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Role items = 2;</code>
       */
      public Builder setItems(int index, io.kubernetes.client.proto.V1Rbac.Role value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.set(index, value);
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of Roles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Role items = 2;</code>
       */
      public Builder setItems(
          int index, io.kubernetes.client.proto.V1Rbac.Role.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.set(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of Roles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Role items = 2;</code>
       */
      public Builder addItems(io.kubernetes.client.proto.V1Rbac.Role value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of Roles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Role items = 2;</code>
       */
      public Builder addItems(int index, io.kubernetes.client.proto.V1Rbac.Role value) {
        if (itemsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemsIsMutable();
          items_.add(index, value);
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of Roles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Role items = 2;</code>
       */
      public Builder addItems(io.kubernetes.client.proto.V1Rbac.Role.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of Roles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Role items = 2;</code>
       */
      public Builder addItems(
          int index, io.kubernetes.client.proto.V1Rbac.Role.Builder builderForValue) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.add(index, builderForValue.build());
          onChanged();
        } else {
          itemsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of Roles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Role items = 2;</code>
       */
      public Builder addAllItems(
          java.lang.Iterable<? extends io.kubernetes.client.proto.V1Rbac.Role> values) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, items_);
          onChanged();
        } else {
          itemsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of Roles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Role items = 2;</code>
       */
      public Builder clearItems() {
        if (itemsBuilder_ == null) {
          items_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          itemsBuilder_.clear();
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of Roles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Role items = 2;</code>
       */
      public Builder removeItems(int index) {
        if (itemsBuilder_ == null) {
          ensureItemsIsMutable();
          items_.remove(index);
          onChanged();
        } else {
          itemsBuilder_.remove(index);
        }
        return this;
      }
      /**
       *
       *
       * <pre>
       * Items is a list of Roles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Role items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.Role.Builder getItemsBuilder(int index) {
        return getItemsFieldBuilder().getBuilder(index);
      }
      /**
       *
       *
       * <pre>
       * Items is a list of Roles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Role items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.RoleOrBuilder getItemsOrBuilder(int index) {
        if (itemsBuilder_ == null) {
          return items_.get(index);
        } else {
          return itemsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of Roles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Role items = 2;</code>
       */
      public java.util.List<? extends io.kubernetes.client.proto.V1Rbac.RoleOrBuilder>
          getItemsOrBuilderList() {
        if (itemsBuilder_ != null) {
          return itemsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(items_);
        }
      }
      /**
       *
       *
       * <pre>
       * Items is a list of Roles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Role items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.Role.Builder addItemsBuilder() {
        return getItemsFieldBuilder()
            .addBuilder(io.kubernetes.client.proto.V1Rbac.Role.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Items is a list of Roles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Role items = 2;</code>
       */
      public io.kubernetes.client.proto.V1Rbac.Role.Builder addItemsBuilder(int index) {
        return getItemsFieldBuilder()
            .addBuilder(index, io.kubernetes.client.proto.V1Rbac.Role.getDefaultInstance());
      }
      /**
       *
       *
       * <pre>
       * Items is a list of Roles
       * </pre>
       *
       * <code>repeated .k8s.io.api.rbac.v1.Role items = 2;</code>
       */
      public java.util.List<io.kubernetes.client.proto.V1Rbac.Role.Builder> getItemsBuilderList() {
        return getItemsFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
              io.kubernetes.client.proto.V1Rbac.Role,
              io.kubernetes.client.proto.V1Rbac.Role.Builder,
              io.kubernetes.client.proto.V1Rbac.RoleOrBuilder>
          getItemsFieldBuilder() {
        if (itemsBuilder_ == null) {
          itemsBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilderV3<
                  io.kubernetes.client.proto.V1Rbac.Role,
                  io.kubernetes.client.proto.V1Rbac.Role.Builder,
                  io.kubernetes.client.proto.V1Rbac.RoleOrBuilder>(
                  items_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          items_ = null;
        }
        return itemsBuilder_;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.rbac.v1.RoleList)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.rbac.v1.RoleList)
    private static final io.kubernetes.client.proto.V1Rbac.RoleList DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Rbac.RoleList();
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleList getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<RoleList> PARSER =
        new com.google.protobuf.AbstractParser<RoleList>() {
          @java.lang.Override
          public RoleList parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new RoleList(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<RoleList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RoleList> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Rbac.RoleList getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface RoleRefOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.rbac.v1.RoleRef)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * APIGroup is the group for the resource being referenced
     * </pre>
     *
     * <code>optional string apiGroup = 1;</code>
     */
    boolean hasApiGroup();
    /**
     *
     *
     * <pre>
     * APIGroup is the group for the resource being referenced
     * </pre>
     *
     * <code>optional string apiGroup = 1;</code>
     */
    java.lang.String getApiGroup();
    /**
     *
     *
     * <pre>
     * APIGroup is the group for the resource being referenced
     * </pre>
     *
     * <code>optional string apiGroup = 1;</code>
     */
    com.google.protobuf.ByteString getApiGroupBytes();

    /**
     *
     *
     * <pre>
     * Kind is the type of resource being referenced
     * </pre>
     *
     * <code>optional string kind = 2;</code>
     */
    boolean hasKind();
    /**
     *
     *
     * <pre>
     * Kind is the type of resource being referenced
     * </pre>
     *
     * <code>optional string kind = 2;</code>
     */
    java.lang.String getKind();
    /**
     *
     *
     * <pre>
     * Kind is the type of resource being referenced
     * </pre>
     *
     * <code>optional string kind = 2;</code>
     */
    com.google.protobuf.ByteString getKindBytes();

    /**
     *
     *
     * <pre>
     * Name is the name of resource being referenced
     * </pre>
     *
     * <code>optional string name = 3;</code>
     */
    boolean hasName();
    /**
     *
     *
     * <pre>
     * Name is the name of resource being referenced
     * </pre>
     *
     * <code>optional string name = 3;</code>
     */
    java.lang.String getName();
    /**
     *
     *
     * <pre>
     * Name is the name of resource being referenced
     * </pre>
     *
     * <code>optional string name = 3;</code>
     */
    com.google.protobuf.ByteString getNameBytes();
  }
  /**
   *
   *
   * <pre>
   * RoleRef contains information that points to the role being used
   * +structType=atomic
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.rbac.v1.RoleRef}
   */
  public static final class RoleRef extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.rbac.v1.RoleRef)
      RoleRefOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use RoleRef.newBuilder() to construct.
    private RoleRef(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private RoleRef() {
      apiGroup_ = "";
      kind_ = "";
      name_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private RoleRef(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                apiGroup_ = bs;
                break;
              }
            case 18:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000002;
                kind_ = bs;
                break;
              }
            case 26:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000004;
                name_ = bs;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Rbac
          .internal_static_k8s_io_api_rbac_v1_RoleRef_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Rbac
          .internal_static_k8s_io_api_rbac_v1_RoleRef_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Rbac.RoleRef.class,
              io.kubernetes.client.proto.V1Rbac.RoleRef.Builder.class);
    }

    private int bitField0_;
    public static final int APIGROUP_FIELD_NUMBER = 1;
    private volatile java.lang.Object apiGroup_;
    /**
     *
     *
     * <pre>
     * APIGroup is the group for the resource being referenced
     * </pre>
     *
     * <code>optional string apiGroup = 1;</code>
     */
    public boolean hasApiGroup() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * APIGroup is the group for the resource being referenced
     * </pre>
     *
     * <code>optional string apiGroup = 1;</code>
     */
    public java.lang.String getApiGroup() {
      java.lang.Object ref = apiGroup_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          apiGroup_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * APIGroup is the group for the resource being referenced
     * </pre>
     *
     * <code>optional string apiGroup = 1;</code>
     */
    public com.google.protobuf.ByteString getApiGroupBytes() {
      java.lang.Object ref = apiGroup_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        apiGroup_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int KIND_FIELD_NUMBER = 2;
    private volatile java.lang.Object kind_;
    /**
     *
     *
     * <pre>
     * Kind is the type of resource being referenced
     * </pre>
     *
     * <code>optional string kind = 2;</code>
     */
    public boolean hasKind() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * Kind is the type of resource being referenced
     * </pre>
     *
     * <code>optional string kind = 2;</code>
     */
    public java.lang.String getKind() {
      java.lang.Object ref = kind_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          kind_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Kind is the type of resource being referenced
     * </pre>
     *
     * <code>optional string kind = 2;</code>
     */
    public com.google.protobuf.ByteString getKindBytes() {
      java.lang.Object ref = kind_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        kind_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NAME_FIELD_NUMBER = 3;
    private volatile java.lang.Object name_;
    /**
     *
     *
     * <pre>
     * Name is the name of resource being referenced
     * </pre>
     *
     * <code>optional string name = 3;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * Name is the name of resource being referenced
     * </pre>
     *
     * <code>optional string name = 3;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Name is the name of resource being referenced
     * </pre>
     *
     * <code>optional string name = 3;</code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, apiGroup_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, kind_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, apiGroup_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, kind_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Rbac.RoleRef)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Rbac.RoleRef other =
          (io.kubernetes.client.proto.V1Rbac.RoleRef) obj;

      boolean result = true;
      result = result && (hasApiGroup() == other.hasApiGroup());
      if (hasApiGroup()) {
        result = result && getApiGroup().equals(other.getApiGroup());
      }
      result = result && (hasKind() == other.hasKind());
      if (hasKind()) {
        result = result && getKind().equals(other.getKind());
      }
      result = result && (hasName() == other.hasName());
      if (hasName()) {
        result = result && getName().equals(other.getName());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasApiGroup()) {
        hash = (37 * hash) + APIGROUP_FIELD_NUMBER;
        hash = (53 * hash) + getApiGroup().hashCode();
      }
      if (hasKind()) {
        hash = (37 * hash) + KIND_FIELD_NUMBER;
        hash = (53 * hash) + getKind().hashCode();
      }
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleRef parseFrom(java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleRef parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleRef parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleRef parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleRef parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleRef parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleRef parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleRef parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleRef parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleRef parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleRef parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleRef parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(io.kubernetes.client.proto.V1Rbac.RoleRef prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * RoleRef contains information that points to the role being used
     * +structType=atomic
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.rbac.v1.RoleRef}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.rbac.v1.RoleRef)
        io.kubernetes.client.proto.V1Rbac.RoleRefOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_RoleRef_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_RoleRef_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Rbac.RoleRef.class,
                io.kubernetes.client.proto.V1Rbac.RoleRef.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Rbac.RoleRef.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        apiGroup_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        kind_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_RoleRef_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.RoleRef getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Rbac.RoleRef.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.RoleRef build() {
        io.kubernetes.client.proto.V1Rbac.RoleRef result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.RoleRef buildPartial() {
        io.kubernetes.client.proto.V1Rbac.RoleRef result =
            new io.kubernetes.client.proto.V1Rbac.RoleRef(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.apiGroup_ = apiGroup_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.kind_ = kind_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.name_ = name_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Rbac.RoleRef) {
          return mergeFrom((io.kubernetes.client.proto.V1Rbac.RoleRef) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Rbac.RoleRef other) {
        if (other == io.kubernetes.client.proto.V1Rbac.RoleRef.getDefaultInstance()) return this;
        if (other.hasApiGroup()) {
          bitField0_ |= 0x00000001;
          apiGroup_ = other.apiGroup_;
          onChanged();
        }
        if (other.hasKind()) {
          bitField0_ |= 0x00000002;
          kind_ = other.kind_;
          onChanged();
        }
        if (other.hasName()) {
          bitField0_ |= 0x00000004;
          name_ = other.name_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Rbac.RoleRef parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.kubernetes.client.proto.V1Rbac.RoleRef) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object apiGroup_ = "";
      /**
       *
       *
       * <pre>
       * APIGroup is the group for the resource being referenced
       * </pre>
       *
       * <code>optional string apiGroup = 1;</code>
       */
      public boolean hasApiGroup() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * APIGroup is the group for the resource being referenced
       * </pre>
       *
       * <code>optional string apiGroup = 1;</code>
       */
      public java.lang.String getApiGroup() {
        java.lang.Object ref = apiGroup_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            apiGroup_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * APIGroup is the group for the resource being referenced
       * </pre>
       *
       * <code>optional string apiGroup = 1;</code>
       */
      public com.google.protobuf.ByteString getApiGroupBytes() {
        java.lang.Object ref = apiGroup_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          apiGroup_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * APIGroup is the group for the resource being referenced
       * </pre>
       *
       * <code>optional string apiGroup = 1;</code>
       */
      public Builder setApiGroup(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        apiGroup_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * APIGroup is the group for the resource being referenced
       * </pre>
       *
       * <code>optional string apiGroup = 1;</code>
       */
      public Builder clearApiGroup() {
        bitField0_ = (bitField0_ & ~0x00000001);
        apiGroup_ = getDefaultInstance().getApiGroup();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * APIGroup is the group for the resource being referenced
       * </pre>
       *
       * <code>optional string apiGroup = 1;</code>
       */
      public Builder setApiGroupBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        apiGroup_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object kind_ = "";
      /**
       *
       *
       * <pre>
       * Kind is the type of resource being referenced
       * </pre>
       *
       * <code>optional string kind = 2;</code>
       */
      public boolean hasKind() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * Kind is the type of resource being referenced
       * </pre>
       *
       * <code>optional string kind = 2;</code>
       */
      public java.lang.String getKind() {
        java.lang.Object ref = kind_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            kind_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Kind is the type of resource being referenced
       * </pre>
       *
       * <code>optional string kind = 2;</code>
       */
      public com.google.protobuf.ByteString getKindBytes() {
        java.lang.Object ref = kind_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          kind_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Kind is the type of resource being referenced
       * </pre>
       *
       * <code>optional string kind = 2;</code>
       */
      public Builder setKind(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        kind_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Kind is the type of resource being referenced
       * </pre>
       *
       * <code>optional string kind = 2;</code>
       */
      public Builder clearKind() {
        bitField0_ = (bitField0_ & ~0x00000002);
        kind_ = getDefaultInstance().getKind();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Kind is the type of resource being referenced
       * </pre>
       *
       * <code>optional string kind = 2;</code>
       */
      public Builder setKindBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        kind_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       *
       *
       * <pre>
       * Name is the name of resource being referenced
       * </pre>
       *
       * <code>optional string name = 3;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * Name is the name of resource being referenced
       * </pre>
       *
       * <code>optional string name = 3;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Name is the name of resource being referenced
       * </pre>
       *
       * <code>optional string name = 3;</code>
       */
      public com.google.protobuf.ByteString getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Name is the name of resource being referenced
       * </pre>
       *
       * <code>optional string name = 3;</code>
       */
      public Builder setName(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Name is the name of resource being referenced
       * </pre>
       *
       * <code>optional string name = 3;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000004);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Name is the name of resource being referenced
       * </pre>
       *
       * <code>optional string name = 3;</code>
       */
      public Builder setNameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        name_ = value;
        onChanged();
        return this;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.rbac.v1.RoleRef)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.rbac.v1.RoleRef)
    private static final io.kubernetes.client.proto.V1Rbac.RoleRef DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Rbac.RoleRef();
    }

    public static io.kubernetes.client.proto.V1Rbac.RoleRef getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<RoleRef> PARSER =
        new com.google.protobuf.AbstractParser<RoleRef>() {
          @java.lang.Override
          public RoleRef parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new RoleRef(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<RoleRef> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RoleRef> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Rbac.RoleRef getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  public interface SubjectOrBuilder
      extends
      // @@protoc_insertion_point(interface_extends:k8s.io.api.rbac.v1.Subject)
      com.google.protobuf.MessageOrBuilder {

    /**
     *
     *
     * <pre>
     * Kind of object being referenced. Values defined by this API group are "User", "Group", and "ServiceAccount".
     * If the Authorizer does not recognized the kind value, the Authorizer should report an error.
     * </pre>
     *
     * <code>optional string kind = 1;</code>
     */
    boolean hasKind();
    /**
     *
     *
     * <pre>
     * Kind of object being referenced. Values defined by this API group are "User", "Group", and "ServiceAccount".
     * If the Authorizer does not recognized the kind value, the Authorizer should report an error.
     * </pre>
     *
     * <code>optional string kind = 1;</code>
     */
    java.lang.String getKind();
    /**
     *
     *
     * <pre>
     * Kind of object being referenced. Values defined by this API group are "User", "Group", and "ServiceAccount".
     * If the Authorizer does not recognized the kind value, the Authorizer should report an error.
     * </pre>
     *
     * <code>optional string kind = 1;</code>
     */
    com.google.protobuf.ByteString getKindBytes();

    /**
     *
     *
     * <pre>
     * APIGroup holds the API group of the referenced subject.
     * Defaults to "" for ServiceAccount subjects.
     * Defaults to "rbac.authorization.k8s.io" for User and Group subjects.
     * +optional
     * </pre>
     *
     * <code>optional string apiGroup = 2;</code>
     */
    boolean hasApiGroup();
    /**
     *
     *
     * <pre>
     * APIGroup holds the API group of the referenced subject.
     * Defaults to "" for ServiceAccount subjects.
     * Defaults to "rbac.authorization.k8s.io" for User and Group subjects.
     * +optional
     * </pre>
     *
     * <code>optional string apiGroup = 2;</code>
     */
    java.lang.String getApiGroup();
    /**
     *
     *
     * <pre>
     * APIGroup holds the API group of the referenced subject.
     * Defaults to "" for ServiceAccount subjects.
     * Defaults to "rbac.authorization.k8s.io" for User and Group subjects.
     * +optional
     * </pre>
     *
     * <code>optional string apiGroup = 2;</code>
     */
    com.google.protobuf.ByteString getApiGroupBytes();

    /**
     *
     *
     * <pre>
     * Name of the object being referenced.
     * </pre>
     *
     * <code>optional string name = 3;</code>
     */
    boolean hasName();
    /**
     *
     *
     * <pre>
     * Name of the object being referenced.
     * </pre>
     *
     * <code>optional string name = 3;</code>
     */
    java.lang.String getName();
    /**
     *
     *
     * <pre>
     * Name of the object being referenced.
     * </pre>
     *
     * <code>optional string name = 3;</code>
     */
    com.google.protobuf.ByteString getNameBytes();

    /**
     *
     *
     * <pre>
     * Namespace of the referenced object.  If the object kind is non-namespace, such as "User" or "Group", and this value is not empty
     * the Authorizer should report an error.
     * +optional
     * </pre>
     *
     * <code>optional string namespace = 4;</code>
     */
    boolean hasNamespace();
    /**
     *
     *
     * <pre>
     * Namespace of the referenced object.  If the object kind is non-namespace, such as "User" or "Group", and this value is not empty
     * the Authorizer should report an error.
     * +optional
     * </pre>
     *
     * <code>optional string namespace = 4;</code>
     */
    java.lang.String getNamespace();
    /**
     *
     *
     * <pre>
     * Namespace of the referenced object.  If the object kind is non-namespace, such as "User" or "Group", and this value is not empty
     * the Authorizer should report an error.
     * +optional
     * </pre>
     *
     * <code>optional string namespace = 4;</code>
     */
    com.google.protobuf.ByteString getNamespaceBytes();
  }
  /**
   *
   *
   * <pre>
   * Subject contains a reference to the object or user identities a role binding applies to.  This can either hold a direct API object reference,
   * or a value for non-objects such as user and group names.
   * +structType=atomic
   * </pre>
   *
   * Protobuf type {@code k8s.io.api.rbac.v1.Subject}
   */
  public static final class Subject extends com.google.protobuf.GeneratedMessageV3
      implements
      // @@protoc_insertion_point(message_implements:k8s.io.api.rbac.v1.Subject)
      SubjectOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use Subject.newBuilder() to construct.
    private Subject(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }

    private Subject() {
      kind_ = "";
      apiGroup_ = "";
      name_ = "";
      namespace_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private Subject(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                kind_ = bs;
                break;
              }
            case 18:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000002;
                apiGroup_ = bs;
                break;
              }
            case 26:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000004;
                name_ = bs;
                break;
              }
            case 34:
              {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000008;
                namespace_ = bs;
                break;
              }
            default:
              {
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.kubernetes.client.proto.V1Rbac
          .internal_static_k8s_io_api_rbac_v1_Subject_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.kubernetes.client.proto.V1Rbac
          .internal_static_k8s_io_api_rbac_v1_Subject_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.kubernetes.client.proto.V1Rbac.Subject.class,
              io.kubernetes.client.proto.V1Rbac.Subject.Builder.class);
    }

    private int bitField0_;
    public static final int KIND_FIELD_NUMBER = 1;
    private volatile java.lang.Object kind_;
    /**
     *
     *
     * <pre>
     * Kind of object being referenced. Values defined by this API group are "User", "Group", and "ServiceAccount".
     * If the Authorizer does not recognized the kind value, the Authorizer should report an error.
     * </pre>
     *
     * <code>optional string kind = 1;</code>
     */
    public boolean hasKind() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     *
     *
     * <pre>
     * Kind of object being referenced. Values defined by this API group are "User", "Group", and "ServiceAccount".
     * If the Authorizer does not recognized the kind value, the Authorizer should report an error.
     * </pre>
     *
     * <code>optional string kind = 1;</code>
     */
    public java.lang.String getKind() {
      java.lang.Object ref = kind_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          kind_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Kind of object being referenced. Values defined by this API group are "User", "Group", and "ServiceAccount".
     * If the Authorizer does not recognized the kind value, the Authorizer should report an error.
     * </pre>
     *
     * <code>optional string kind = 1;</code>
     */
    public com.google.protobuf.ByteString getKindBytes() {
      java.lang.Object ref = kind_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        kind_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int APIGROUP_FIELD_NUMBER = 2;
    private volatile java.lang.Object apiGroup_;
    /**
     *
     *
     * <pre>
     * APIGroup holds the API group of the referenced subject.
     * Defaults to "" for ServiceAccount subjects.
     * Defaults to "rbac.authorization.k8s.io" for User and Group subjects.
     * +optional
     * </pre>
     *
     * <code>optional string apiGroup = 2;</code>
     */
    public boolean hasApiGroup() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     *
     *
     * <pre>
     * APIGroup holds the API group of the referenced subject.
     * Defaults to "" for ServiceAccount subjects.
     * Defaults to "rbac.authorization.k8s.io" for User and Group subjects.
     * +optional
     * </pre>
     *
     * <code>optional string apiGroup = 2;</code>
     */
    public java.lang.String getApiGroup() {
      java.lang.Object ref = apiGroup_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          apiGroup_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * APIGroup holds the API group of the referenced subject.
     * Defaults to "" for ServiceAccount subjects.
     * Defaults to "rbac.authorization.k8s.io" for User and Group subjects.
     * +optional
     * </pre>
     *
     * <code>optional string apiGroup = 2;</code>
     */
    public com.google.protobuf.ByteString getApiGroupBytes() {
      java.lang.Object ref = apiGroup_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        apiGroup_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NAME_FIELD_NUMBER = 3;
    private volatile java.lang.Object name_;
    /**
     *
     *
     * <pre>
     * Name of the object being referenced.
     * </pre>
     *
     * <code>optional string name = 3;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     *
     *
     * <pre>
     * Name of the object being referenced.
     * </pre>
     *
     * <code>optional string name = 3;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the object being referenced.
     * </pre>
     *
     * <code>optional string name = 3;</code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NAMESPACE_FIELD_NUMBER = 4;
    private volatile java.lang.Object namespace_;
    /**
     *
     *
     * <pre>
     * Namespace of the referenced object.  If the object kind is non-namespace, such as "User" or "Group", and this value is not empty
     * the Authorizer should report an error.
     * +optional
     * </pre>
     *
     * <code>optional string namespace = 4;</code>
     */
    public boolean hasNamespace() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     *
     *
     * <pre>
     * Namespace of the referenced object.  If the object kind is non-namespace, such as "User" or "Group", and this value is not empty
     * the Authorizer should report an error.
     * +optional
     * </pre>
     *
     * <code>optional string namespace = 4;</code>
     */
    public java.lang.String getNamespace() {
      java.lang.Object ref = namespace_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          namespace_ = s;
        }
        return s;
      }
    }
    /**
     *
     *
     * <pre>
     * Namespace of the referenced object.  If the object kind is non-namespace, such as "User" or "Group", and this value is not empty
     * the Authorizer should report an error.
     * +optional
     * </pre>
     *
     * <code>optional string namespace = 4;</code>
     */
    public com.google.protobuf.ByteString getNamespaceBytes() {
      java.lang.Object ref = namespace_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        namespace_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, kind_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, apiGroup_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, namespace_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, kind_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, apiGroup_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, namespace_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
        return true;
      }
      if (!(obj instanceof io.kubernetes.client.proto.V1Rbac.Subject)) {
        return super.equals(obj);
      }
      io.kubernetes.client.proto.V1Rbac.Subject other =
          (io.kubernetes.client.proto.V1Rbac.Subject) obj;

      boolean result = true;
      result = result && (hasKind() == other.hasKind());
      if (hasKind()) {
        result = result && getKind().equals(other.getKind());
      }
      result = result && (hasApiGroup() == other.hasApiGroup());
      if (hasApiGroup()) {
        result = result && getApiGroup().equals(other.getApiGroup());
      }
      result = result && (hasName() == other.hasName());
      if (hasName()) {
        result = result && getName().equals(other.getName());
      }
      result = result && (hasNamespace() == other.hasNamespace());
      if (hasNamespace()) {
        result = result && getNamespace().equals(other.getNamespace());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasKind()) {
        hash = (37 * hash) + KIND_FIELD_NUMBER;
        hash = (53 * hash) + getKind().hashCode();
      }
      if (hasApiGroup()) {
        hash = (37 * hash) + APIGROUP_FIELD_NUMBER;
        hash = (53 * hash) + getApiGroup().hashCode();
      }
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasNamespace()) {
        hash = (37 * hash) + NAMESPACE_FIELD_NUMBER;
        hash = (53 * hash) + getNamespace().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.kubernetes.client.proto.V1Rbac.Subject parseFrom(java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.Subject parseFrom(
        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.Subject parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.Subject parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.Subject parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static io.kubernetes.client.proto.V1Rbac.Subject parseFrom(
        byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.Subject parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.Subject parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.Subject parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.Subject parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
          PARSER, input, extensionRegistry);
    }

    public static io.kubernetes.client.proto.V1Rbac.Subject parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.kubernetes.client.proto.V1Rbac.Subject parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
          PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(io.kubernetes.client.proto.V1Rbac.Subject prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     *
     *
     * <pre>
     * Subject contains a reference to the object or user identities a role binding applies to.  This can either hold a direct API object reference,
     * or a value for non-objects such as user and group names.
     * +structType=atomic
     * </pre>
     *
     * Protobuf type {@code k8s.io.api.rbac.v1.Subject}
     */
    public static final class Builder
        extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
        implements
        // @@protoc_insertion_point(builder_implements:k8s.io.api.rbac.v1.Subject)
        io.kubernetes.client.proto.V1Rbac.SubjectOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_Subject_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_Subject_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.kubernetes.client.proto.V1Rbac.Subject.class,
                io.kubernetes.client.proto.V1Rbac.Subject.Builder.class);
      }

      // Construct using io.kubernetes.client.proto.V1Rbac.Subject.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
      }

      @java.lang.Override
      public Builder clear() {
        super.clear();
        kind_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        apiGroup_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        namespace_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return io.kubernetes.client.proto.V1Rbac
            .internal_static_k8s_io_api_rbac_v1_Subject_descriptor;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.Subject getDefaultInstanceForType() {
        return io.kubernetes.client.proto.V1Rbac.Subject.getDefaultInstance();
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.Subject build() {
        io.kubernetes.client.proto.V1Rbac.Subject result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.kubernetes.client.proto.V1Rbac.Subject buildPartial() {
        io.kubernetes.client.proto.V1Rbac.Subject result =
            new io.kubernetes.client.proto.V1Rbac.Subject(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.kind_ = kind_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.apiGroup_ = apiGroup_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.namespace_ = namespace_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }

      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }

      @java.lang.Override
      public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }

      @java.lang.Override
      public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }

      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index,
          java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }

      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.kubernetes.client.proto.V1Rbac.Subject) {
          return mergeFrom((io.kubernetes.client.proto.V1Rbac.Subject) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.kubernetes.client.proto.V1Rbac.Subject other) {
        if (other == io.kubernetes.client.proto.V1Rbac.Subject.getDefaultInstance()) return this;
        if (other.hasKind()) {
          bitField0_ |= 0x00000001;
          kind_ = other.kind_;
          onChanged();
        }
        if (other.hasApiGroup()) {
          bitField0_ |= 0x00000002;
          apiGroup_ = other.apiGroup_;
          onChanged();
        }
        if (other.hasName()) {
          bitField0_ |= 0x00000004;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasNamespace()) {
          bitField0_ |= 0x00000008;
          namespace_ = other.namespace_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.kubernetes.client.proto.V1Rbac.Subject parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.kubernetes.client.proto.V1Rbac.Subject) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object kind_ = "";
      /**
       *
       *
       * <pre>
       * Kind of object being referenced. Values defined by this API group are "User", "Group", and "ServiceAccount".
       * If the Authorizer does not recognized the kind value, the Authorizer should report an error.
       * </pre>
       *
       * <code>optional string kind = 1;</code>
       */
      public boolean hasKind() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       *
       *
       * <pre>
       * Kind of object being referenced. Values defined by this API group are "User", "Group", and "ServiceAccount".
       * If the Authorizer does not recognized the kind value, the Authorizer should report an error.
       * </pre>
       *
       * <code>optional string kind = 1;</code>
       */
      public java.lang.String getKind() {
        java.lang.Object ref = kind_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            kind_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Kind of object being referenced. Values defined by this API group are "User", "Group", and "ServiceAccount".
       * If the Authorizer does not recognized the kind value, the Authorizer should report an error.
       * </pre>
       *
       * <code>optional string kind = 1;</code>
       */
      public com.google.protobuf.ByteString getKindBytes() {
        java.lang.Object ref = kind_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          kind_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Kind of object being referenced. Values defined by this API group are "User", "Group", and "ServiceAccount".
       * If the Authorizer does not recognized the kind value, the Authorizer should report an error.
       * </pre>
       *
       * <code>optional string kind = 1;</code>
       */
      public Builder setKind(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        kind_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Kind of object being referenced. Values defined by this API group are "User", "Group", and "ServiceAccount".
       * If the Authorizer does not recognized the kind value, the Authorizer should report an error.
       * </pre>
       *
       * <code>optional string kind = 1;</code>
       */
      public Builder clearKind() {
        bitField0_ = (bitField0_ & ~0x00000001);
        kind_ = getDefaultInstance().getKind();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Kind of object being referenced. Values defined by this API group are "User", "Group", and "ServiceAccount".
       * If the Authorizer does not recognized the kind value, the Authorizer should report an error.
       * </pre>
       *
       * <code>optional string kind = 1;</code>
       */
      public Builder setKindBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        kind_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object apiGroup_ = "";
      /**
       *
       *
       * <pre>
       * APIGroup holds the API group of the referenced subject.
       * Defaults to "" for ServiceAccount subjects.
       * Defaults to "rbac.authorization.k8s.io" for User and Group subjects.
       * +optional
       * </pre>
       *
       * <code>optional string apiGroup = 2;</code>
       */
      public boolean hasApiGroup() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       *
       *
       * <pre>
       * APIGroup holds the API group of the referenced subject.
       * Defaults to "" for ServiceAccount subjects.
       * Defaults to "rbac.authorization.k8s.io" for User and Group subjects.
       * +optional
       * </pre>
       *
       * <code>optional string apiGroup = 2;</code>
       */
      public java.lang.String getApiGroup() {
        java.lang.Object ref = apiGroup_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            apiGroup_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * APIGroup holds the API group of the referenced subject.
       * Defaults to "" for ServiceAccount subjects.
       * Defaults to "rbac.authorization.k8s.io" for User and Group subjects.
       * +optional
       * </pre>
       *
       * <code>optional string apiGroup = 2;</code>
       */
      public com.google.protobuf.ByteString getApiGroupBytes() {
        java.lang.Object ref = apiGroup_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          apiGroup_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * APIGroup holds the API group of the referenced subject.
       * Defaults to "" for ServiceAccount subjects.
       * Defaults to "rbac.authorization.k8s.io" for User and Group subjects.
       * +optional
       * </pre>
       *
       * <code>optional string apiGroup = 2;</code>
       */
      public Builder setApiGroup(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        apiGroup_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * APIGroup holds the API group of the referenced subject.
       * Defaults to "" for ServiceAccount subjects.
       * Defaults to "rbac.authorization.k8s.io" for User and Group subjects.
       * +optional
       * </pre>
       *
       * <code>optional string apiGroup = 2;</code>
       */
      public Builder clearApiGroup() {
        bitField0_ = (bitField0_ & ~0x00000002);
        apiGroup_ = getDefaultInstance().getApiGroup();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * APIGroup holds the API group of the referenced subject.
       * Defaults to "" for ServiceAccount subjects.
       * Defaults to "rbac.authorization.k8s.io" for User and Group subjects.
       * +optional
       * </pre>
       *
       * <code>optional string apiGroup = 2;</code>
       */
      public Builder setApiGroupBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        apiGroup_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       *
       *
       * <pre>
       * Name of the object being referenced.
       * </pre>
       *
       * <code>optional string name = 3;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       *
       *
       * <pre>
       * Name of the object being referenced.
       * </pre>
       *
       * <code>optional string name = 3;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Name of the object being referenced.
       * </pre>
       *
       * <code>optional string name = 3;</code>
       */
      public com.google.protobuf.ByteString getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Name of the object being referenced.
       * </pre>
       *
       * <code>optional string name = 3;</code>
       */
      public Builder setName(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Name of the object being referenced.
       * </pre>
       *
       * <code>optional string name = 3;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000004);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Name of the object being referenced.
       * </pre>
       *
       * <code>optional string name = 3;</code>
       */
      public Builder setNameBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        name_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object namespace_ = "";
      /**
       *
       *
       * <pre>
       * Namespace of the referenced object.  If the object kind is non-namespace, such as "User" or "Group", and this value is not empty
       * the Authorizer should report an error.
       * +optional
       * </pre>
       *
       * <code>optional string namespace = 4;</code>
       */
      public boolean hasNamespace() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       *
       *
       * <pre>
       * Namespace of the referenced object.  If the object kind is non-namespace, such as "User" or "Group", and this value is not empty
       * the Authorizer should report an error.
       * +optional
       * </pre>
       *
       * <code>optional string namespace = 4;</code>
       */
      public java.lang.String getNamespace() {
        java.lang.Object ref = namespace_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            namespace_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Namespace of the referenced object.  If the object kind is non-namespace, such as "User" or "Group", and this value is not empty
       * the Authorizer should report an error.
       * +optional
       * </pre>
       *
       * <code>optional string namespace = 4;</code>
       */
      public com.google.protobuf.ByteString getNamespaceBytes() {
        java.lang.Object ref = namespace_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          namespace_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       *
       *
       * <pre>
       * Namespace of the referenced object.  If the object kind is non-namespace, such as "User" or "Group", and this value is not empty
       * the Authorizer should report an error.
       * +optional
       * </pre>
       *
       * <code>optional string namespace = 4;</code>
       */
      public Builder setNamespace(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        namespace_ = value;
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Namespace of the referenced object.  If the object kind is non-namespace, such as "User" or "Group", and this value is not empty
       * the Authorizer should report an error.
       * +optional
       * </pre>
       *
       * <code>optional string namespace = 4;</code>
       */
      public Builder clearNamespace() {
        bitField0_ = (bitField0_ & ~0x00000008);
        namespace_ = getDefaultInstance().getNamespace();
        onChanged();
        return this;
      }
      /**
       *
       *
       * <pre>
       * Namespace of the referenced object.  If the object kind is non-namespace, such as "User" or "Group", and this value is not empty
       * the Authorizer should report an error.
       * +optional
       * </pre>
       *
       * <code>optional string namespace = 4;</code>
       */
      public Builder setNamespaceBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        namespace_ = value;
        onChanged();
        return this;
      }

      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }

      // @@protoc_insertion_point(builder_scope:k8s.io.api.rbac.v1.Subject)
    }

    // @@protoc_insertion_point(class_scope:k8s.io.api.rbac.v1.Subject)
    private static final io.kubernetes.client.proto.V1Rbac.Subject DEFAULT_INSTANCE;

    static {
      DEFAULT_INSTANCE = new io.kubernetes.client.proto.V1Rbac.Subject();
    }

    public static io.kubernetes.client.proto.V1Rbac.Subject getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated
    public static final com.google.protobuf.Parser<Subject> PARSER =
        new com.google.protobuf.AbstractParser<Subject>() {
          @java.lang.Override
          public Subject parsePartialFrom(
              com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new Subject(input, extensionRegistry);
          }
        };

    public static com.google.protobuf.Parser<Subject> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Subject> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.kubernetes.client.proto.V1Rbac.Subject getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }
  }

  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_rbac_v1_AggregationRule_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_rbac_v1_AggregationRule_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_rbac_v1_ClusterRole_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_rbac_v1_ClusterRole_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_rbac_v1_ClusterRoleBinding_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_rbac_v1_ClusterRoleBinding_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_rbac_v1_ClusterRoleBindingList_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_rbac_v1_ClusterRoleBindingList_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_rbac_v1_ClusterRoleList_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_rbac_v1_ClusterRoleList_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_rbac_v1_PolicyRule_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_rbac_v1_PolicyRule_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_rbac_v1_Role_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_rbac_v1_Role_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_rbac_v1_RoleBinding_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_rbac_v1_RoleBinding_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_rbac_v1_RoleBindingList_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_rbac_v1_RoleBindingList_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_rbac_v1_RoleList_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_rbac_v1_RoleList_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_rbac_v1_RoleRef_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_rbac_v1_RoleRef_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_k8s_io_api_rbac_v1_Subject_descriptor;
  private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_k8s_io_api_rbac_v1_Subject_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\"k8s.io/api/rbac/v1/generated.proto\022\022k8"
          + "s.io.api.rbac.v1\0324k8s.io/apimachinery/pk"
          + "g/apis/meta/v1/generated.proto\032/k8s.io/a"
          + "pimachinery/pkg/runtime/generated.proto\032"
          + "6k8s.io/apimachinery/pkg/runtime/schema/"
          + "generated.proto\"d\n\017AggregationRule\022Q\n\024cl"
          + "usterRoleSelectors\030\001 \003(\01323.k8s.io.apimac"
          + "hinery.pkg.apis.meta.v1.LabelSelector\"\276\001"
          + "\n\013ClusterRole\022B\n\010metadata\030\001 \001(\01320.k8s.io"
          + ".apimachinery.pkg.apis.meta.v1.ObjectMet"
          + "a\022-\n\005rules\030\002 \003(\0132\036.k8s.io.api.rbac.v1.Po"
          + "licyRule\022<\n\017aggregationRule\030\003 \001(\0132#.k8s."
          + "io.api.rbac.v1.AggregationRule\"\265\001\n\022Clust"
          + "erRoleBinding\022B\n\010metadata\030\001 \001(\01320.k8s.io"
          + ".apimachinery.pkg.apis.meta.v1.ObjectMet"
          + "a\022-\n\010subjects\030\002 \003(\0132\033.k8s.io.api.rbac.v1"
          + ".Subject\022,\n\007roleRef\030\003 \001(\0132\033.k8s.io.api.r"
          + "bac.v1.RoleRef\"\221\001\n\026ClusterRoleBindingLis"
          + "t\022@\n\010metadata\030\001 \001(\0132..k8s.io.apimachiner"
          + "y.pkg.apis.meta.v1.ListMeta\0225\n\005items\030\002 \003"
          + "(\0132&.k8s.io.api.rbac.v1.ClusterRoleBindi"
          + "ng\"\203\001\n\017ClusterRoleList\022@\n\010metadata\030\001 \001(\013"
          + "2..k8s.io.apimachinery.pkg.apis.meta.v1."
          + "ListMeta\022.\n\005items\030\002 \003(\0132\037.k8s.io.api.rba"
          + "c.v1.ClusterRole\"q\n\nPolicyRule\022\r\n\005verbs\030"
          + "\001 \003(\t\022\021\n\tapiGroups\030\002 \003(\t\022\021\n\tresources\030\003 "
          + "\003(\t\022\025\n\rresourceNames\030\004 \003(\t\022\027\n\017nonResourc"
          + "eURLs\030\005 \003(\t\"y\n\004Role\022B\n\010metadata\030\001 \001(\01320."
          + "k8s.io.apimachinery.pkg.apis.meta.v1.Obj"
          + "ectMeta\022-\n\005rules\030\002 \003(\0132\036.k8s.io.api.rbac"
          + ".v1.PolicyRule\"\256\001\n\013RoleBinding\022B\n\010metada"
          + "ta\030\001 \001(\01320.k8s.io.apimachinery.pkg.apis."
          + "meta.v1.ObjectMeta\022-\n\010subjects\030\002 \003(\0132\033.k"
          + "8s.io.api.rbac.v1.Subject\022,\n\007roleRef\030\003 \001"
          + "(\0132\033.k8s.io.api.rbac.v1.RoleRef\"\203\001\n\017Role"
          + "BindingList\022@\n\010metadata\030\001 \001(\0132..k8s.io.a"
          + "pimachinery.pkg.apis.meta.v1.ListMeta\022.\n"
          + "\005items\030\002 \003(\0132\037.k8s.io.api.rbac.v1.RoleBi"
          + "nding\"u\n\010RoleList\022@\n\010metadata\030\001 \001(\0132..k8"
          + "s.io.apimachinery.pkg.apis.meta.v1.ListM"
          + "eta\022\'\n\005items\030\002 \003(\0132\030.k8s.io.api.rbac.v1."
          + "Role\"7\n\007RoleRef\022\020\n\010apiGroup\030\001 \001(\t\022\014\n\004kin"
          + "d\030\002 \001(\t\022\014\n\004name\030\003 \001(\t\"J\n\007Subject\022\014\n\004kind"
          + "\030\001 \001(\t\022\020\n\010apiGroup\030\002 \001(\t\022\014\n\004name\030\003 \001(\t\022\021"
          + "\n\tnamespace\030\004 \001(\tB(\n\032io.kubernetes.clien"
          + "t.protoB\006V1RbacZ\002v1"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.kubernetes.client.proto.Meta.getDescriptor(),
          io.kubernetes.client.proto.Runtime.getDescriptor(),
          io.kubernetes.client.proto.RuntimeSchema.getDescriptor(),
        },
        assigner);
    internal_static_k8s_io_api_rbac_v1_AggregationRule_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_k8s_io_api_rbac_v1_AggregationRule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_rbac_v1_AggregationRule_descriptor,
            new java.lang.String[] {
              "ClusterRoleSelectors",
            });
    internal_static_k8s_io_api_rbac_v1_ClusterRole_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_k8s_io_api_rbac_v1_ClusterRole_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_rbac_v1_ClusterRole_descriptor,
            new java.lang.String[] {
              "Metadata", "Rules", "AggregationRule",
            });
    internal_static_k8s_io_api_rbac_v1_ClusterRoleBinding_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_k8s_io_api_rbac_v1_ClusterRoleBinding_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_rbac_v1_ClusterRoleBinding_descriptor,
            new java.lang.String[] {
              "Metadata", "Subjects", "RoleRef",
            });
    internal_static_k8s_io_api_rbac_v1_ClusterRoleBindingList_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_k8s_io_api_rbac_v1_ClusterRoleBindingList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_rbac_v1_ClusterRoleBindingList_descriptor,
            new java.lang.String[] {
              "Metadata", "Items",
            });
    internal_static_k8s_io_api_rbac_v1_ClusterRoleList_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_k8s_io_api_rbac_v1_ClusterRoleList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_rbac_v1_ClusterRoleList_descriptor,
            new java.lang.String[] {
              "Metadata", "Items",
            });
    internal_static_k8s_io_api_rbac_v1_PolicyRule_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_k8s_io_api_rbac_v1_PolicyRule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_rbac_v1_PolicyRule_descriptor,
            new java.lang.String[] {
              "Verbs", "ApiGroups", "Resources", "ResourceNames", "NonResourceURLs",
            });
    internal_static_k8s_io_api_rbac_v1_Role_descriptor = getDescriptor().getMessageTypes().get(6);
    internal_static_k8s_io_api_rbac_v1_Role_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_rbac_v1_Role_descriptor,
            new java.lang.String[] {
              "Metadata", "Rules",
            });
    internal_static_k8s_io_api_rbac_v1_RoleBinding_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_k8s_io_api_rbac_v1_RoleBinding_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_rbac_v1_RoleBinding_descriptor,
            new java.lang.String[] {
              "Metadata", "Subjects", "RoleRef",
            });
    internal_static_k8s_io_api_rbac_v1_RoleBindingList_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_k8s_io_api_rbac_v1_RoleBindingList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_rbac_v1_RoleBindingList_descriptor,
            new java.lang.String[] {
              "Metadata", "Items",
            });
    internal_static_k8s_io_api_rbac_v1_RoleList_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_k8s_io_api_rbac_v1_RoleList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_rbac_v1_RoleList_descriptor,
            new java.lang.String[] {
              "Metadata", "Items",
            });
    internal_static_k8s_io_api_rbac_v1_RoleRef_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_k8s_io_api_rbac_v1_RoleRef_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_rbac_v1_RoleRef_descriptor,
            new java.lang.String[] {
              "ApiGroup", "Kind", "Name",
            });
    internal_static_k8s_io_api_rbac_v1_Subject_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_k8s_io_api_rbac_v1_Subject_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_k8s_io_api_rbac_v1_Subject_descriptor,
            new java.lang.String[] {
              "Kind", "ApiGroup", "Name", "Namespace",
            });
    io.kubernetes.client.proto.Meta.getDescriptor();
    io.kubernetes.client.proto.Runtime.getDescriptor();
    io.kubernetes.client.proto.RuntimeSchema.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
