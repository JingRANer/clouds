// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user_service.proto

package com.cloud.app.proto;

/**
 * Protobuf type {@code com.cloud.app.proto.CreateUserAccessTokenRequest}
 */
public  final class CreateUserAccessTokenRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.cloud.app.proto.CreateUserAccessTokenRequest)
    CreateUserAccessTokenRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateUserAccessTokenRequest.newBuilder() to construct.
  private CreateUserAccessTokenRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateUserAccessTokenRequest() {
    name_ = "";
    description_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateUserAccessTokenRequest(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          case 26: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (expiresAt_ != null) {
              subBuilder = expiresAt_.toBuilder();
            }
            expiresAt_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(expiresAt_);
              expiresAt_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cloud.app.proto.UserServiceProto.internal_static_com_cloud_app_proto_CreateUserAccessTokenRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cloud.app.proto.UserServiceProto.internal_static_com_cloud_app_proto_CreateUserAccessTokenRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cloud.app.proto.CreateUserAccessTokenRequest.class, com.cloud.app.proto.CreateUserAccessTokenRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The name of the user.
   * Format: users/{username}
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the user.
   * Format: users/{username}
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 2;
  private volatile java.lang.Object description_;
  /**
   * <code>string description = 2;</code>
   */
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPIRES_AT_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp expiresAt_;
  /**
   * <code>.google.protobuf.Timestamp expires_at = 3;</code>
   */
  public boolean hasExpiresAt() {
    return expiresAt_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp expires_at = 3;</code>
   */
  public com.google.protobuf.Timestamp getExpiresAt() {
    return expiresAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expiresAt_;
  }
  /**
   * <code>.google.protobuf.Timestamp expires_at = 3;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getExpiresAtOrBuilder() {
    return getExpiresAt();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, description_);
    }
    if (expiresAt_ != null) {
      output.writeMessage(3, getExpiresAt());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, description_);
    }
    if (expiresAt_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getExpiresAt());
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
    if (!(obj instanceof com.cloud.app.proto.CreateUserAccessTokenRequest)) {
      return super.equals(obj);
    }
    com.cloud.app.proto.CreateUserAccessTokenRequest other = (com.cloud.app.proto.CreateUserAccessTokenRequest) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && getDescription()
        .equals(other.getDescription());
    result = result && (hasExpiresAt() == other.hasExpiresAt());
    if (hasExpiresAt()) {
      result = result && getExpiresAt()
          .equals(other.getExpiresAt());
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    if (hasExpiresAt()) {
      hash = (37 * hash) + EXPIRES_AT_FIELD_NUMBER;
      hash = (53 * hash) + getExpiresAt().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cloud.app.proto.CreateUserAccessTokenRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cloud.app.proto.CreateUserAccessTokenRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cloud.app.proto.CreateUserAccessTokenRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cloud.app.proto.CreateUserAccessTokenRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cloud.app.proto.CreateUserAccessTokenRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cloud.app.proto.CreateUserAccessTokenRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cloud.app.proto.CreateUserAccessTokenRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cloud.app.proto.CreateUserAccessTokenRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cloud.app.proto.CreateUserAccessTokenRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cloud.app.proto.CreateUserAccessTokenRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cloud.app.proto.CreateUserAccessTokenRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cloud.app.proto.CreateUserAccessTokenRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.cloud.app.proto.CreateUserAccessTokenRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.cloud.app.proto.CreateUserAccessTokenRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.cloud.app.proto.CreateUserAccessTokenRequest)
      com.cloud.app.proto.CreateUserAccessTokenRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cloud.app.proto.UserServiceProto.internal_static_com_cloud_app_proto_CreateUserAccessTokenRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cloud.app.proto.UserServiceProto.internal_static_com_cloud_app_proto_CreateUserAccessTokenRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cloud.app.proto.CreateUserAccessTokenRequest.class, com.cloud.app.proto.CreateUserAccessTokenRequest.Builder.class);
    }

    // Construct using com.cloud.app.proto.CreateUserAccessTokenRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      name_ = "";

      description_ = "";

      if (expiresAtBuilder_ == null) {
        expiresAt_ = null;
      } else {
        expiresAt_ = null;
        expiresAtBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cloud.app.proto.UserServiceProto.internal_static_com_cloud_app_proto_CreateUserAccessTokenRequest_descriptor;
    }

    public com.cloud.app.proto.CreateUserAccessTokenRequest getDefaultInstanceForType() {
      return com.cloud.app.proto.CreateUserAccessTokenRequest.getDefaultInstance();
    }

    public com.cloud.app.proto.CreateUserAccessTokenRequest build() {
      com.cloud.app.proto.CreateUserAccessTokenRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.cloud.app.proto.CreateUserAccessTokenRequest buildPartial() {
      com.cloud.app.proto.CreateUserAccessTokenRequest result = new com.cloud.app.proto.CreateUserAccessTokenRequest(this);
      result.name_ = name_;
      result.description_ = description_;
      if (expiresAtBuilder_ == null) {
        result.expiresAt_ = expiresAt_;
      } else {
        result.expiresAt_ = expiresAtBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cloud.app.proto.CreateUserAccessTokenRequest) {
        return mergeFrom((com.cloud.app.proto.CreateUserAccessTokenRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cloud.app.proto.CreateUserAccessTokenRequest other) {
      if (other == com.cloud.app.proto.CreateUserAccessTokenRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (other.hasExpiresAt()) {
        mergeExpiresAt(other.getExpiresAt());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.cloud.app.proto.CreateUserAccessTokenRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.cloud.app.proto.CreateUserAccessTokenRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The name of the user.
     * Format: users/{username}
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the user.
     * Format: users/{username}
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the user.
     * Format: users/{username}
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the user.
     * Format: users/{username}
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the user.
     * Format: users/{username}
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 2;</code>
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string description = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 2;</code>
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 2;</code>
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>string description = 2;</code>
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp expiresAt_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> expiresAtBuilder_;
    /**
     * <code>.google.protobuf.Timestamp expires_at = 3;</code>
     */
    public boolean hasExpiresAt() {
      return expiresAtBuilder_ != null || expiresAt_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp expires_at = 3;</code>
     */
    public com.google.protobuf.Timestamp getExpiresAt() {
      if (expiresAtBuilder_ == null) {
        return expiresAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expiresAt_;
      } else {
        return expiresAtBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp expires_at = 3;</code>
     */
    public Builder setExpiresAt(com.google.protobuf.Timestamp value) {
      if (expiresAtBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        expiresAt_ = value;
        onChanged();
      } else {
        expiresAtBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp expires_at = 3;</code>
     */
    public Builder setExpiresAt(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (expiresAtBuilder_ == null) {
        expiresAt_ = builderForValue.build();
        onChanged();
      } else {
        expiresAtBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp expires_at = 3;</code>
     */
    public Builder mergeExpiresAt(com.google.protobuf.Timestamp value) {
      if (expiresAtBuilder_ == null) {
        if (expiresAt_ != null) {
          expiresAt_ =
            com.google.protobuf.Timestamp.newBuilder(expiresAt_).mergeFrom(value).buildPartial();
        } else {
          expiresAt_ = value;
        }
        onChanged();
      } else {
        expiresAtBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp expires_at = 3;</code>
     */
    public Builder clearExpiresAt() {
      if (expiresAtBuilder_ == null) {
        expiresAt_ = null;
        onChanged();
      } else {
        expiresAt_ = null;
        expiresAtBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp expires_at = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getExpiresAtBuilder() {
      
      onChanged();
      return getExpiresAtFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp expires_at = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getExpiresAtOrBuilder() {
      if (expiresAtBuilder_ != null) {
        return expiresAtBuilder_.getMessageOrBuilder();
      } else {
        return expiresAt_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : expiresAt_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp expires_at = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getExpiresAtFieldBuilder() {
      if (expiresAtBuilder_ == null) {
        expiresAtBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getExpiresAt(),
                getParentForChildren(),
                isClean());
        expiresAt_ = null;
      }
      return expiresAtBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.cloud.app.proto.CreateUserAccessTokenRequest)
  }

  // @@protoc_insertion_point(class_scope:com.cloud.app.proto.CreateUserAccessTokenRequest)
  private static final com.cloud.app.proto.CreateUserAccessTokenRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cloud.app.proto.CreateUserAccessTokenRequest();
  }

  public static com.cloud.app.proto.CreateUserAccessTokenRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateUserAccessTokenRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateUserAccessTokenRequest>() {
    public CreateUserAccessTokenRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateUserAccessTokenRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateUserAccessTokenRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateUserAccessTokenRequest> getParserForType() {
    return PARSER;
  }

  public com.cloud.app.proto.CreateUserAccessTokenRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

