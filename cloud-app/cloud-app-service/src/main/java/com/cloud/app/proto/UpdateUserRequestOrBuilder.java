// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user_service.proto

package com.cloud.app.proto;

public interface UpdateUserRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.cloud.app.proto.UpdateUserRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *[(google.api.field_behavior) = REQUIRED]
   * </pre>
   *
   * <code>.com.cloud.app.proto.User user = 1;</code>
   */
  boolean hasUser();
  /**
   * <pre>
   *[(google.api.field_behavior) = REQUIRED]
   * </pre>
   *
   * <code>.com.cloud.app.proto.User user = 1;</code>
   */
  com.cloud.app.proto.User getUser();
  /**
   * <pre>
   *[(google.api.field_behavior) = REQUIRED]
   * </pre>
   *
   * <code>.com.cloud.app.proto.User user = 1;</code>
   */
  com.cloud.app.proto.UserOrBuilder getUserOrBuilder();

  /**
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  boolean hasUpdateMask();
  /**
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}