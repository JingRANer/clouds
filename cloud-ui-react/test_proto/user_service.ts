/* eslint-disable */
import * as Long from "long";
import { util, configure, Reader, Writer } from "protobufjs/minimal";
import { FieldMask } from "./google/protobuf/field_mask";
import { Timestamp } from "./google/protobuf/timestamp";
import { RowStatus, rowStatusFromJSON, rowStatusToJSON } from "./store/common";

export const protobufPackage = "cloud.api";

export interface User {
  /**
   * The name of the user.
   * Format: users/{username}
   */
  name: string;
  id: number;
  role: User_Role;
  username: string;
  email: string;
  nickname: string;
  avatarUrl: string;
  password: string;
  rowStatus: RowStatus;
  createTime: Date | undefined;
  updateTime: Date | undefined;
}

export enum User_Role {
  ROLE_UNSPECIFIED = 0,
  HOST = 1,
  ADMIN = 2,
  USER = 3,
  UNRECOGNIZED = -1,
}

export function user_RoleFromJSON(object: any): User_Role {
  switch (object) {
    case 0:
    case "ROLE_UNSPECIFIED":
      return User_Role.ROLE_UNSPECIFIED;
    case 1:
    case "HOST":
      return User_Role.HOST;
    case 2:
    case "ADMIN":
      return User_Role.ADMIN;
    case 3:
    case "USER":
      return User_Role.USER;
    case -1:
    case "UNRECOGNIZED":
    default:
      return User_Role.UNRECOGNIZED;
  }
}

export function user_RoleToJSON(object: User_Role): string {
  switch (object) {
    case User_Role.ROLE_UNSPECIFIED:
      return "ROLE_UNSPECIFIED";
    case User_Role.HOST:
      return "HOST";
    case User_Role.ADMIN:
      return "ADMIN";
    case User_Role.USER:
      return "USER";
    default:
      return "UNKNOWN";
  }
}

export interface ListUsersRequest {}

export interface ListUsersResponse {
  users: User[];
}

export interface GetUserRequest {
  /**
   * The name of the user.
   * Format: users/{username}
   */
  name: string;
}

export interface GetUserResponse {
  user: User | undefined;
}

export interface CreateUserRequest {
  user: User | undefined;
}

export interface CreateUserResponse {
  user: User | undefined;
}

export interface UpdateUserRequest {
  user: User | undefined;
  updateMask: FieldMask | undefined;
}

export interface UpdateUserResponse {
  user: User | undefined;
}

export interface DeleteUserRequest {
  /**
   * The name of the user.
   * Format: users/{username}
   */
  name: string;
}

export interface DeleteUserResponse {}

export interface UserSetting {
  /**
   * The name of the user.
   * Format: users/{username}
   */
  name: string;
  /** The preferred locale of the user. */
  locale: string;
  /** The preferred appearance of the user. */
  appearance: string;
  /** The default visibility of the memo. */
  memoVisibility: string;
  /** The telegram user id of the user. */
  telegramUserId: string;
}

export interface GetUserSettingRequest {
  /**
   * The name of the user.
   * Format: users/{username}
   */
  name: string;
}

export interface GetUserSettingResponse {
  setting: UserSetting | undefined;
}

export interface UpdateUserSettingRequest {
  setting: UserSetting | undefined;
  updateMask: FieldMask | undefined;
}

export interface UpdateUserSettingResponse {
  setting: UserSetting | undefined;
}

export interface UserAccessToken {
  accessToken: string;
  description: string;
  issuedAt: Date | undefined;
  expiresAt: Date | undefined;
}

export interface ListUserAccessTokensRequest {
  /**
   * The name of the user.
   * Format: users/{username}
   */
  name: string;
}

export interface ListUserAccessTokensResponse {
  accessTokens: UserAccessToken[];
}

export interface CreateUserAccessTokenRequest {
  /**
   * The name of the user.
   * Format: users/{username}
   */
  name: string;
  description: string;
  expiresAt?: Date | undefined;
}

export interface CreateUserAccessTokenResponse {
  accessToken: UserAccessToken | undefined;
}

export interface DeleteUserAccessTokenRequest {
  /**
   * The name of the user.
   * Format: users/{username}
   */
  name: string;
  /** access_token is the access token to delete. */
  accessToken: string;
}

export interface DeleteUserAccessTokenResponse {}

const baseUser: object = { name: "", id: 0, role: 0, username: "", email: "", nickname: "", avatarUrl: "", password: "", rowStatus: 0 };

export const User = {
  encode(message: User, writer: Writer = Writer.create()): Writer {
    if (message.name !== "") {
      writer.uint32(10).string(message.name);
    }
    if (message.id !== 0) {
      writer.uint32(16).int32(message.id);
    }
    if (message.role !== 0) {
      writer.uint32(24).int32(message.role);
    }
    if (message.username !== "") {
      writer.uint32(34).string(message.username);
    }
    if (message.email !== "") {
      writer.uint32(42).string(message.email);
    }
    if (message.nickname !== "") {
      writer.uint32(50).string(message.nickname);
    }
    if (message.avatarUrl !== "") {
      writer.uint32(58).string(message.avatarUrl);
    }
    if (message.password !== "") {
      writer.uint32(66).string(message.password);
    }
    if (message.rowStatus !== 0) {
      writer.uint32(72).int32(message.rowStatus);
    }
    if (message.createTime !== undefined) {
      Timestamp.encode(toTimestamp(message.createTime), writer.uint32(82).fork()).ldelim();
    }
    if (message.updateTime !== undefined) {
      Timestamp.encode(toTimestamp(message.updateTime), writer.uint32(90).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): User {
    const reader = input instanceof Reader ? input : new Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseUser } as User;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.name = reader.string();
          break;
        case 2:
          message.id = reader.int32();
          break;
        case 3:
          message.role = reader.int32() as any;
          break;
        case 4:
          message.username = reader.string();
          break;
        case 5:
          message.email = reader.string();
          break;
        case 6:
          message.nickname = reader.string();
          break;
        case 7:
          message.avatarUrl = reader.string();
          break;
        case 8:
          message.password = reader.string();
          break;
        case 9:
          message.rowStatus = reader.int32() as any;
          break;
        case 10:
          message.createTime = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          break;
        case 11:
          message.updateTime = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): User {
    const message = { ...baseUser } as User;
    if (object.name !== undefined && object.name !== null) {
      message.name = String(object.name);
    } else {
      message.name = "";
    }
    if (object.id !== undefined && object.id !== null) {
      message.id = Number(object.id);
    } else {
      message.id = 0;
    }
    if (object.role !== undefined && object.role !== null) {
      message.role = user_RoleFromJSON(object.role);
    } else {
      message.role = 0;
    }
    if (object.username !== undefined && object.username !== null) {
      message.username = String(object.username);
    } else {
      message.username = "";
    }
    if (object.email !== undefined && object.email !== null) {
      message.email = String(object.email);
    } else {
      message.email = "";
    }
    if (object.nickname !== undefined && object.nickname !== null) {
      message.nickname = String(object.nickname);
    } else {
      message.nickname = "";
    }
    if (object.avatarUrl !== undefined && object.avatarUrl !== null) {
      message.avatarUrl = String(object.avatarUrl);
    } else {
      message.avatarUrl = "";
    }
    if (object.password !== undefined && object.password !== null) {
      message.password = String(object.password);
    } else {
      message.password = "";
    }
    if (object.rowStatus !== undefined && object.rowStatus !== null) {
      message.rowStatus = rowStatusFromJSON(object.rowStatus);
    } else {
      message.rowStatus = 0;
    }
    if (object.createTime !== undefined && object.createTime !== null) {
      message.createTime = fromJsonTimestamp(object.createTime);
    } else {
      message.createTime = undefined;
    }
    if (object.updateTime !== undefined && object.updateTime !== null) {
      message.updateTime = fromJsonTimestamp(object.updateTime);
    } else {
      message.updateTime = undefined;
    }
    return message;
  },

  toJSON(message: User): unknown {
    const obj: any = {};
    message.name !== undefined && (obj.name = message.name);
    message.id !== undefined && (obj.id = message.id);
    message.role !== undefined && (obj.role = user_RoleToJSON(message.role));
    message.username !== undefined && (obj.username = message.username);
    message.email !== undefined && (obj.email = message.email);
    message.nickname !== undefined && (obj.nickname = message.nickname);
    message.avatarUrl !== undefined && (obj.avatarUrl = message.avatarUrl);
    message.password !== undefined && (obj.password = message.password);
    message.rowStatus !== undefined && (obj.rowStatus = rowStatusToJSON(message.rowStatus));
    message.createTime !== undefined && (obj.createTime = message.createTime.toISOString());
    message.updateTime !== undefined && (obj.updateTime = message.updateTime.toISOString());
    return obj;
  },

  fromPartial(object: DeepPartial<User>): User {
    const message = { ...baseUser } as User;
    if (object.name !== undefined && object.name !== null) {
      message.name = object.name;
    } else {
      message.name = "";
    }
    if (object.id !== undefined && object.id !== null) {
      message.id = object.id;
    } else {
      message.id = 0;
    }
    if (object.role !== undefined && object.role !== null) {
      message.role = object.role;
    } else {
      message.role = 0;
    }
    if (object.username !== undefined && object.username !== null) {
      message.username = object.username;
    } else {
      message.username = "";
    }
    if (object.email !== undefined && object.email !== null) {
      message.email = object.email;
    } else {
      message.email = "";
    }
    if (object.nickname !== undefined && object.nickname !== null) {
      message.nickname = object.nickname;
    } else {
      message.nickname = "";
    }
    if (object.avatarUrl !== undefined && object.avatarUrl !== null) {
      message.avatarUrl = object.avatarUrl;
    } else {
      message.avatarUrl = "";
    }
    if (object.password !== undefined && object.password !== null) {
      message.password = object.password;
    } else {
      message.password = "";
    }
    if (object.rowStatus !== undefined && object.rowStatus !== null) {
      message.rowStatus = object.rowStatus;
    } else {
      message.rowStatus = 0;
    }
    if (object.createTime !== undefined && object.createTime !== null) {
      message.createTime = object.createTime;
    } else {
      message.createTime = undefined;
    }
    if (object.updateTime !== undefined && object.updateTime !== null) {
      message.updateTime = object.updateTime;
    } else {
      message.updateTime = undefined;
    }
    return message;
  },
};

const baseListUsersRequest: object = {};

export const ListUsersRequest = {
  encode(_: ListUsersRequest, writer: Writer = Writer.create()): Writer {
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): ListUsersRequest {
    const reader = input instanceof Reader ? input : new Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseListUsersRequest } as ListUsersRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(_: any): ListUsersRequest {
    const message = { ...baseListUsersRequest } as ListUsersRequest;
    return message;
  },

  toJSON(_: ListUsersRequest): unknown {
    const obj: any = {};
    return obj;
  },

  fromPartial(_: DeepPartial<ListUsersRequest>): ListUsersRequest {
    const message = { ...baseListUsersRequest } as ListUsersRequest;
    return message;
  },
};

const baseListUsersResponse: object = {};

export const ListUsersResponse = {
  encode(message: ListUsersResponse, writer: Writer = Writer.create()): Writer {
    for (const v of message.users) {
      User.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): ListUsersResponse {
    const reader = input instanceof Reader ? input : new Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseListUsersResponse } as ListUsersResponse;
    message.users = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.users.push(User.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): ListUsersResponse {
    const message = { ...baseListUsersResponse } as ListUsersResponse;
    message.users = [];
    if (object.users !== undefined && object.users !== null) {
      for (const e of object.users) {
        message.users.push(User.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: ListUsersResponse): unknown {
    const obj: any = {};
    if (message.users) {
      obj.users = message.users.map((e) => (e ? User.toJSON(e) : undefined));
    } else {
      obj.users = [];
    }
    return obj;
  },

  fromPartial(object: DeepPartial<ListUsersResponse>): ListUsersResponse {
    const message = { ...baseListUsersResponse } as ListUsersResponse;
    message.users = [];
    if (object.users !== undefined && object.users !== null) {
      for (const e of object.users) {
        message.users.push(User.fromPartial(e));
      }
    }
    return message;
  },
};

const baseGetUserRequest: object = { name: "" };

export const GetUserRequest = {
  encode(message: GetUserRequest, writer: Writer = Writer.create()): Writer {
    if (message.name !== "") {
      writer.uint32(10).string(message.name);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): GetUserRequest {
    const reader = input instanceof Reader ? input : new Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseGetUserRequest } as GetUserRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.name = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetUserRequest {
    const message = { ...baseGetUserRequest } as GetUserRequest;
    if (object.name !== undefined && object.name !== null) {
      message.name = String(object.name);
    } else {
      message.name = "";
    }
    return message;
  },

  toJSON(message: GetUserRequest): unknown {
    const obj: any = {};
    message.name !== undefined && (obj.name = message.name);
    return obj;
  },

  fromPartial(object: DeepPartial<GetUserRequest>): GetUserRequest {
    const message = { ...baseGetUserRequest } as GetUserRequest;
    if (object.name !== undefined && object.name !== null) {
      message.name = object.name;
    } else {
      message.name = "";
    }
    return message;
  },
};

const baseGetUserResponse: object = {};

export const GetUserResponse = {
  encode(message: GetUserResponse, writer: Writer = Writer.create()): Writer {
    if (message.user !== undefined) {
      User.encode(message.user, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): GetUserResponse {
    const reader = input instanceof Reader ? input : new Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseGetUserResponse } as GetUserResponse;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.user = User.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetUserResponse {
    const message = { ...baseGetUserResponse } as GetUserResponse;
    if (object.user !== undefined && object.user !== null) {
      message.user = User.fromJSON(object.user);
    } else {
      message.user = undefined;
    }
    return message;
  },

  toJSON(message: GetUserResponse): unknown {
    const obj: any = {};
    message.user !== undefined && (obj.user = message.user ? User.toJSON(message.user) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<GetUserResponse>): GetUserResponse {
    const message = { ...baseGetUserResponse } as GetUserResponse;
    if (object.user !== undefined && object.user !== null) {
      message.user = User.fromPartial(object.user);
    } else {
      message.user = undefined;
    }
    return message;
  },
};

const baseCreateUserRequest: object = {};

export const CreateUserRequest = {
  encode(message: CreateUserRequest, writer: Writer = Writer.create()): Writer {
    if (message.user !== undefined) {
      User.encode(message.user, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): CreateUserRequest {
    const reader = input instanceof Reader ? input : new Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseCreateUserRequest } as CreateUserRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.user = User.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): CreateUserRequest {
    const message = { ...baseCreateUserRequest } as CreateUserRequest;
    if (object.user !== undefined && object.user !== null) {
      message.user = User.fromJSON(object.user);
    } else {
      message.user = undefined;
    }
    return message;
  },

  toJSON(message: CreateUserRequest): unknown {
    const obj: any = {};
    message.user !== undefined && (obj.user = message.user ? User.toJSON(message.user) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<CreateUserRequest>): CreateUserRequest {
    const message = { ...baseCreateUserRequest } as CreateUserRequest;
    if (object.user !== undefined && object.user !== null) {
      message.user = User.fromPartial(object.user);
    } else {
      message.user = undefined;
    }
    return message;
  },
};

const baseCreateUserResponse: object = {};

export const CreateUserResponse = {
  encode(message: CreateUserResponse, writer: Writer = Writer.create()): Writer {
    if (message.user !== undefined) {
      User.encode(message.user, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): CreateUserResponse {
    const reader = input instanceof Reader ? input : new Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseCreateUserResponse } as CreateUserResponse;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.user = User.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): CreateUserResponse {
    const message = { ...baseCreateUserResponse } as CreateUserResponse;
    if (object.user !== undefined && object.user !== null) {
      message.user = User.fromJSON(object.user);
    } else {
      message.user = undefined;
    }
    return message;
  },

  toJSON(message: CreateUserResponse): unknown {
    const obj: any = {};
    message.user !== undefined && (obj.user = message.user ? User.toJSON(message.user) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<CreateUserResponse>): CreateUserResponse {
    const message = { ...baseCreateUserResponse } as CreateUserResponse;
    if (object.user !== undefined && object.user !== null) {
      message.user = User.fromPartial(object.user);
    } else {
      message.user = undefined;
    }
    return message;
  },
};

const baseUpdateUserRequest: object = {};

export const UpdateUserRequest = {
  encode(message: UpdateUserRequest, writer: Writer = Writer.create()): Writer {
    if (message.user !== undefined) {
      User.encode(message.user, writer.uint32(10).fork()).ldelim();
    }
    if (message.updateMask !== undefined) {
      FieldMask.encode(message.updateMask, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): UpdateUserRequest {
    const reader = input instanceof Reader ? input : new Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseUpdateUserRequest } as UpdateUserRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.user = User.decode(reader, reader.uint32());
          break;
        case 2:
          message.updateMask = FieldMask.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): UpdateUserRequest {
    const message = { ...baseUpdateUserRequest } as UpdateUserRequest;
    if (object.user !== undefined && object.user !== null) {
      message.user = User.fromJSON(object.user);
    } else {
      message.user = undefined;
    }
    if (object.updateMask !== undefined && object.updateMask !== null) {
      message.updateMask = FieldMask.fromJSON(object.updateMask);
    } else {
      message.updateMask = undefined;
    }
    return message;
  },

  toJSON(message: UpdateUserRequest): unknown {
    const obj: any = {};
    message.user !== undefined && (obj.user = message.user ? User.toJSON(message.user) : undefined);
    message.updateMask !== undefined && (obj.updateMask = message.updateMask ? FieldMask.toJSON(message.updateMask) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<UpdateUserRequest>): UpdateUserRequest {
    const message = { ...baseUpdateUserRequest } as UpdateUserRequest;
    if (object.user !== undefined && object.user !== null) {
      message.user = User.fromPartial(object.user);
    } else {
      message.user = undefined;
    }
    if (object.updateMask !== undefined && object.updateMask !== null) {
      message.updateMask = FieldMask.fromPartial(object.updateMask);
    } else {
      message.updateMask = undefined;
    }
    return message;
  },
};

const baseUpdateUserResponse: object = {};

export const UpdateUserResponse = {
  encode(message: UpdateUserResponse, writer: Writer = Writer.create()): Writer {
    if (message.user !== undefined) {
      User.encode(message.user, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): UpdateUserResponse {
    const reader = input instanceof Reader ? input : new Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseUpdateUserResponse } as UpdateUserResponse;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.user = User.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): UpdateUserResponse {
    const message = { ...baseUpdateUserResponse } as UpdateUserResponse;
    if (object.user !== undefined && object.user !== null) {
      message.user = User.fromJSON(object.user);
    } else {
      message.user = undefined;
    }
    return message;
  },

  toJSON(message: UpdateUserResponse): unknown {
    const obj: any = {};
    message.user !== undefined && (obj.user = message.user ? User.toJSON(message.user) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<UpdateUserResponse>): UpdateUserResponse {
    const message = { ...baseUpdateUserResponse } as UpdateUserResponse;
    if (object.user !== undefined && object.user !== null) {
      message.user = User.fromPartial(object.user);
    } else {
      message.user = undefined;
    }
    return message;
  },
};

const baseDeleteUserRequest: object = { name: "" };

export const DeleteUserRequest = {
  encode(message: DeleteUserRequest, writer: Writer = Writer.create()): Writer {
    if (message.name !== "") {
      writer.uint32(10).string(message.name);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): DeleteUserRequest {
    const reader = input instanceof Reader ? input : new Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseDeleteUserRequest } as DeleteUserRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.name = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): DeleteUserRequest {
    const message = { ...baseDeleteUserRequest } as DeleteUserRequest;
    if (object.name !== undefined && object.name !== null) {
      message.name = String(object.name);
    } else {
      message.name = "";
    }
    return message;
  },

  toJSON(message: DeleteUserRequest): unknown {
    const obj: any = {};
    message.name !== undefined && (obj.name = message.name);
    return obj;
  },

  fromPartial(object: DeepPartial<DeleteUserRequest>): DeleteUserRequest {
    const message = { ...baseDeleteUserRequest } as DeleteUserRequest;
    if (object.name !== undefined && object.name !== null) {
      message.name = object.name;
    } else {
      message.name = "";
    }
    return message;
  },
};

const baseDeleteUserResponse: object = {};

export const DeleteUserResponse = {
  encode(_: DeleteUserResponse, writer: Writer = Writer.create()): Writer {
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): DeleteUserResponse {
    const reader = input instanceof Reader ? input : new Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseDeleteUserResponse } as DeleteUserResponse;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(_: any): DeleteUserResponse {
    const message = { ...baseDeleteUserResponse } as DeleteUserResponse;
    return message;
  },

  toJSON(_: DeleteUserResponse): unknown {
    const obj: any = {};
    return obj;
  },

  fromPartial(_: DeepPartial<DeleteUserResponse>): DeleteUserResponse {
    const message = { ...baseDeleteUserResponse } as DeleteUserResponse;
    return message;
  },
};

const baseUserSetting: object = { name: "", locale: "", appearance: "", memoVisibility: "", telegramUserId: "" };

export const UserSetting = {
  encode(message: UserSetting, writer: Writer = Writer.create()): Writer {
    if (message.name !== "") {
      writer.uint32(10).string(message.name);
    }
    if (message.locale !== "") {
      writer.uint32(18).string(message.locale);
    }
    if (message.appearance !== "") {
      writer.uint32(26).string(message.appearance);
    }
    if (message.memoVisibility !== "") {
      writer.uint32(34).string(message.memoVisibility);
    }
    if (message.telegramUserId !== "") {
      writer.uint32(42).string(message.telegramUserId);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): UserSetting {
    const reader = input instanceof Reader ? input : new Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseUserSetting } as UserSetting;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.name = reader.string();
          break;
        case 2:
          message.locale = reader.string();
          break;
        case 3:
          message.appearance = reader.string();
          break;
        case 4:
          message.memoVisibility = reader.string();
          break;
        case 5:
          message.telegramUserId = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): UserSetting {
    const message = { ...baseUserSetting } as UserSetting;
    if (object.name !== undefined && object.name !== null) {
      message.name = String(object.name);
    } else {
      message.name = "";
    }
    if (object.locale !== undefined && object.locale !== null) {
      message.locale = String(object.locale);
    } else {
      message.locale = "";
    }
    if (object.appearance !== undefined && object.appearance !== null) {
      message.appearance = String(object.appearance);
    } else {
      message.appearance = "";
    }
    if (object.memoVisibility !== undefined && object.memoVisibility !== null) {
      message.memoVisibility = String(object.memoVisibility);
    } else {
      message.memoVisibility = "";
    }
    if (object.telegramUserId !== undefined && object.telegramUserId !== null) {
      message.telegramUserId = String(object.telegramUserId);
    } else {
      message.telegramUserId = "";
    }
    return message;
  },

  toJSON(message: UserSetting): unknown {
    const obj: any = {};
    message.name !== undefined && (obj.name = message.name);
    message.locale !== undefined && (obj.locale = message.locale);
    message.appearance !== undefined && (obj.appearance = message.appearance);
    message.memoVisibility !== undefined && (obj.memoVisibility = message.memoVisibility);
    message.telegramUserId !== undefined && (obj.telegramUserId = message.telegramUserId);
    return obj;
  },

  fromPartial(object: DeepPartial<UserSetting>): UserSetting {
    const message = { ...baseUserSetting } as UserSetting;
    if (object.name !== undefined && object.name !== null) {
      message.name = object.name;
    } else {
      message.name = "";
    }
    if (object.locale !== undefined && object.locale !== null) {
      message.locale = object.locale;
    } else {
      message.locale = "";
    }
    if (object.appearance !== undefined && object.appearance !== null) {
      message.appearance = object.appearance;
    } else {
      message.appearance = "";
    }
    if (object.memoVisibility !== undefined && object.memoVisibility !== null) {
      message.memoVisibility = object.memoVisibility;
    } else {
      message.memoVisibility = "";
    }
    if (object.telegramUserId !== undefined && object.telegramUserId !== null) {
      message.telegramUserId = object.telegramUserId;
    } else {
      message.telegramUserId = "";
    }
    return message;
  },
};

const baseGetUserSettingRequest: object = { name: "" };

export const GetUserSettingRequest = {
  encode(message: GetUserSettingRequest, writer: Writer = Writer.create()): Writer {
    if (message.name !== "") {
      writer.uint32(10).string(message.name);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): GetUserSettingRequest {
    const reader = input instanceof Reader ? input : new Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseGetUserSettingRequest } as GetUserSettingRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.name = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetUserSettingRequest {
    const message = { ...baseGetUserSettingRequest } as GetUserSettingRequest;
    if (object.name !== undefined && object.name !== null) {
      message.name = String(object.name);
    } else {
      message.name = "";
    }
    return message;
  },

  toJSON(message: GetUserSettingRequest): unknown {
    const obj: any = {};
    message.name !== undefined && (obj.name = message.name);
    return obj;
  },

  fromPartial(object: DeepPartial<GetUserSettingRequest>): GetUserSettingRequest {
    const message = { ...baseGetUserSettingRequest } as GetUserSettingRequest;
    if (object.name !== undefined && object.name !== null) {
      message.name = object.name;
    } else {
      message.name = "";
    }
    return message;
  },
};

const baseGetUserSettingResponse: object = {};

export const GetUserSettingResponse = {
  encode(message: GetUserSettingResponse, writer: Writer = Writer.create()): Writer {
    if (message.setting !== undefined) {
      UserSetting.encode(message.setting, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): GetUserSettingResponse {
    const reader = input instanceof Reader ? input : new Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseGetUserSettingResponse } as GetUserSettingResponse;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.setting = UserSetting.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetUserSettingResponse {
    const message = { ...baseGetUserSettingResponse } as GetUserSettingResponse;
    if (object.setting !== undefined && object.setting !== null) {
      message.setting = UserSetting.fromJSON(object.setting);
    } else {
      message.setting = undefined;
    }
    return message;
  },

  toJSON(message: GetUserSettingResponse): unknown {
    const obj: any = {};
    message.setting !== undefined && (obj.setting = message.setting ? UserSetting.toJSON(message.setting) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<GetUserSettingResponse>): GetUserSettingResponse {
    const message = { ...baseGetUserSettingResponse } as GetUserSettingResponse;
    if (object.setting !== undefined && object.setting !== null) {
      message.setting = UserSetting.fromPartial(object.setting);
    } else {
      message.setting = undefined;
    }
    return message;
  },
};

const baseUpdateUserSettingRequest: object = {};

export const UpdateUserSettingRequest = {
  encode(message: UpdateUserSettingRequest, writer: Writer = Writer.create()): Writer {
    if (message.setting !== undefined) {
      UserSetting.encode(message.setting, writer.uint32(10).fork()).ldelim();
    }
    if (message.updateMask !== undefined) {
      FieldMask.encode(message.updateMask, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): UpdateUserSettingRequest {
    const reader = input instanceof Reader ? input : new Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseUpdateUserSettingRequest } as UpdateUserSettingRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.setting = UserSetting.decode(reader, reader.uint32());
          break;
        case 2:
          message.updateMask = FieldMask.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): UpdateUserSettingRequest {
    const message = { ...baseUpdateUserSettingRequest } as UpdateUserSettingRequest;
    if (object.setting !== undefined && object.setting !== null) {
      message.setting = UserSetting.fromJSON(object.setting);
    } else {
      message.setting = undefined;
    }
    if (object.updateMask !== undefined && object.updateMask !== null) {
      message.updateMask = FieldMask.fromJSON(object.updateMask);
    } else {
      message.updateMask = undefined;
    }
    return message;
  },

  toJSON(message: UpdateUserSettingRequest): unknown {
    const obj: any = {};
    message.setting !== undefined && (obj.setting = message.setting ? UserSetting.toJSON(message.setting) : undefined);
    message.updateMask !== undefined && (obj.updateMask = message.updateMask ? FieldMask.toJSON(message.updateMask) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<UpdateUserSettingRequest>): UpdateUserSettingRequest {
    const message = { ...baseUpdateUserSettingRequest } as UpdateUserSettingRequest;
    if (object.setting !== undefined && object.setting !== null) {
      message.setting = UserSetting.fromPartial(object.setting);
    } else {
      message.setting = undefined;
    }
    if (object.updateMask !== undefined && object.updateMask !== null) {
      message.updateMask = FieldMask.fromPartial(object.updateMask);
    } else {
      message.updateMask = undefined;
    }
    return message;
  },
};

const baseUpdateUserSettingResponse: object = {};

export const UpdateUserSettingResponse = {
  encode(message: UpdateUserSettingResponse, writer: Writer = Writer.create()): Writer {
    if (message.setting !== undefined) {
      UserSetting.encode(message.setting, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): UpdateUserSettingResponse {
    const reader = input instanceof Reader ? input : new Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseUpdateUserSettingResponse } as UpdateUserSettingResponse;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.setting = UserSetting.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): UpdateUserSettingResponse {
    const message = { ...baseUpdateUserSettingResponse } as UpdateUserSettingResponse;
    if (object.setting !== undefined && object.setting !== null) {
      message.setting = UserSetting.fromJSON(object.setting);
    } else {
      message.setting = undefined;
    }
    return message;
  },

  toJSON(message: UpdateUserSettingResponse): unknown {
    const obj: any = {};
    message.setting !== undefined && (obj.setting = message.setting ? UserSetting.toJSON(message.setting) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<UpdateUserSettingResponse>): UpdateUserSettingResponse {
    const message = { ...baseUpdateUserSettingResponse } as UpdateUserSettingResponse;
    if (object.setting !== undefined && object.setting !== null) {
      message.setting = UserSetting.fromPartial(object.setting);
    } else {
      message.setting = undefined;
    }
    return message;
  },
};

const baseUserAccessToken: object = { accessToken: "", description: "" };

export const UserAccessToken = {
  encode(message: UserAccessToken, writer: Writer = Writer.create()): Writer {
    if (message.accessToken !== "") {
      writer.uint32(10).string(message.accessToken);
    }
    if (message.description !== "") {
      writer.uint32(18).string(message.description);
    }
    if (message.issuedAt !== undefined) {
      Timestamp.encode(toTimestamp(message.issuedAt), writer.uint32(26).fork()).ldelim();
    }
    if (message.expiresAt !== undefined) {
      Timestamp.encode(toTimestamp(message.expiresAt), writer.uint32(34).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): UserAccessToken {
    const reader = input instanceof Reader ? input : new Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseUserAccessToken } as UserAccessToken;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.accessToken = reader.string();
          break;
        case 2:
          message.description = reader.string();
          break;
        case 3:
          message.issuedAt = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          break;
        case 4:
          message.expiresAt = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): UserAccessToken {
    const message = { ...baseUserAccessToken } as UserAccessToken;
    if (object.accessToken !== undefined && object.accessToken !== null) {
      message.accessToken = String(object.accessToken);
    } else {
      message.accessToken = "";
    }
    if (object.description !== undefined && object.description !== null) {
      message.description = String(object.description);
    } else {
      message.description = "";
    }
    if (object.issuedAt !== undefined && object.issuedAt !== null) {
      message.issuedAt = fromJsonTimestamp(object.issuedAt);
    } else {
      message.issuedAt = undefined;
    }
    if (object.expiresAt !== undefined && object.expiresAt !== null) {
      message.expiresAt = fromJsonTimestamp(object.expiresAt);
    } else {
      message.expiresAt = undefined;
    }
    return message;
  },

  toJSON(message: UserAccessToken): unknown {
    const obj: any = {};
    message.accessToken !== undefined && (obj.accessToken = message.accessToken);
    message.description !== undefined && (obj.description = message.description);
    message.issuedAt !== undefined && (obj.issuedAt = message.issuedAt.toISOString());
    message.expiresAt !== undefined && (obj.expiresAt = message.expiresAt.toISOString());
    return obj;
  },

  fromPartial(object: DeepPartial<UserAccessToken>): UserAccessToken {
    const message = { ...baseUserAccessToken } as UserAccessToken;
    if (object.accessToken !== undefined && object.accessToken !== null) {
      message.accessToken = object.accessToken;
    } else {
      message.accessToken = "";
    }
    if (object.description !== undefined && object.description !== null) {
      message.description = object.description;
    } else {
      message.description = "";
    }
    if (object.issuedAt !== undefined && object.issuedAt !== null) {
      message.issuedAt = object.issuedAt;
    } else {
      message.issuedAt = undefined;
    }
    if (object.expiresAt !== undefined && object.expiresAt !== null) {
      message.expiresAt = object.expiresAt;
    } else {
      message.expiresAt = undefined;
    }
    return message;
  },
};

const baseListUserAccessTokensRequest: object = { name: "" };

export const ListUserAccessTokensRequest = {
  encode(message: ListUserAccessTokensRequest, writer: Writer = Writer.create()): Writer {
    if (message.name !== "") {
      writer.uint32(10).string(message.name);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): ListUserAccessTokensRequest {
    const reader = input instanceof Reader ? input : new Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseListUserAccessTokensRequest } as ListUserAccessTokensRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.name = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): ListUserAccessTokensRequest {
    const message = { ...baseListUserAccessTokensRequest } as ListUserAccessTokensRequest;
    if (object.name !== undefined && object.name !== null) {
      message.name = String(object.name);
    } else {
      message.name = "";
    }
    return message;
  },

  toJSON(message: ListUserAccessTokensRequest): unknown {
    const obj: any = {};
    message.name !== undefined && (obj.name = message.name);
    return obj;
  },

  fromPartial(object: DeepPartial<ListUserAccessTokensRequest>): ListUserAccessTokensRequest {
    const message = { ...baseListUserAccessTokensRequest } as ListUserAccessTokensRequest;
    if (object.name !== undefined && object.name !== null) {
      message.name = object.name;
    } else {
      message.name = "";
    }
    return message;
  },
};

const baseListUserAccessTokensResponse: object = {};

export const ListUserAccessTokensResponse = {
  encode(message: ListUserAccessTokensResponse, writer: Writer = Writer.create()): Writer {
    for (const v of message.accessTokens) {
      UserAccessToken.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): ListUserAccessTokensResponse {
    const reader = input instanceof Reader ? input : new Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseListUserAccessTokensResponse } as ListUserAccessTokensResponse;
    message.accessTokens = [];
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.accessTokens.push(UserAccessToken.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): ListUserAccessTokensResponse {
    const message = { ...baseListUserAccessTokensResponse } as ListUserAccessTokensResponse;
    message.accessTokens = [];
    if (object.accessTokens !== undefined && object.accessTokens !== null) {
      for (const e of object.accessTokens) {
        message.accessTokens.push(UserAccessToken.fromJSON(e));
      }
    }
    return message;
  },

  toJSON(message: ListUserAccessTokensResponse): unknown {
    const obj: any = {};
    if (message.accessTokens) {
      obj.accessTokens = message.accessTokens.map((e) => (e ? UserAccessToken.toJSON(e) : undefined));
    } else {
      obj.accessTokens = [];
    }
    return obj;
  },

  fromPartial(object: DeepPartial<ListUserAccessTokensResponse>): ListUserAccessTokensResponse {
    const message = { ...baseListUserAccessTokensResponse } as ListUserAccessTokensResponse;
    message.accessTokens = [];
    if (object.accessTokens !== undefined && object.accessTokens !== null) {
      for (const e of object.accessTokens) {
        message.accessTokens.push(UserAccessToken.fromPartial(e));
      }
    }
    return message;
  },
};

const baseCreateUserAccessTokenRequest: object = { name: "", description: "" };

export const CreateUserAccessTokenRequest = {
  encode(message: CreateUserAccessTokenRequest, writer: Writer = Writer.create()): Writer {
    if (message.name !== "") {
      writer.uint32(10).string(message.name);
    }
    if (message.description !== "") {
      writer.uint32(18).string(message.description);
    }
    if (message.expiresAt !== undefined) {
      Timestamp.encode(toTimestamp(message.expiresAt), writer.uint32(26).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): CreateUserAccessTokenRequest {
    const reader = input instanceof Reader ? input : new Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseCreateUserAccessTokenRequest } as CreateUserAccessTokenRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.name = reader.string();
          break;
        case 2:
          message.description = reader.string();
          break;
        case 3:
          message.expiresAt = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): CreateUserAccessTokenRequest {
    const message = { ...baseCreateUserAccessTokenRequest } as CreateUserAccessTokenRequest;
    if (object.name !== undefined && object.name !== null) {
      message.name = String(object.name);
    } else {
      message.name = "";
    }
    if (object.description !== undefined && object.description !== null) {
      message.description = String(object.description);
    } else {
      message.description = "";
    }
    if (object.expiresAt !== undefined && object.expiresAt !== null) {
      message.expiresAt = fromJsonTimestamp(object.expiresAt);
    } else {
      message.expiresAt = undefined;
    }
    return message;
  },

  toJSON(message: CreateUserAccessTokenRequest): unknown {
    const obj: any = {};
    message.name !== undefined && (obj.name = message.name);
    message.description !== undefined && (obj.description = message.description);
    message.expiresAt !== undefined && (obj.expiresAt = message.expiresAt.toISOString());
    return obj;
  },

  fromPartial(object: DeepPartial<CreateUserAccessTokenRequest>): CreateUserAccessTokenRequest {
    const message = { ...baseCreateUserAccessTokenRequest } as CreateUserAccessTokenRequest;
    if (object.name !== undefined && object.name !== null) {
      message.name = object.name;
    } else {
      message.name = "";
    }
    if (object.description !== undefined && object.description !== null) {
      message.description = object.description;
    } else {
      message.description = "";
    }
    if (object.expiresAt !== undefined && object.expiresAt !== null) {
      message.expiresAt = object.expiresAt;
    } else {
      message.expiresAt = undefined;
    }
    return message;
  },
};

const baseCreateUserAccessTokenResponse: object = {};

export const CreateUserAccessTokenResponse = {
  encode(message: CreateUserAccessTokenResponse, writer: Writer = Writer.create()): Writer {
    if (message.accessToken !== undefined) {
      UserAccessToken.encode(message.accessToken, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): CreateUserAccessTokenResponse {
    const reader = input instanceof Reader ? input : new Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseCreateUserAccessTokenResponse } as CreateUserAccessTokenResponse;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.accessToken = UserAccessToken.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): CreateUserAccessTokenResponse {
    const message = { ...baseCreateUserAccessTokenResponse } as CreateUserAccessTokenResponse;
    if (object.accessToken !== undefined && object.accessToken !== null) {
      message.accessToken = UserAccessToken.fromJSON(object.accessToken);
    } else {
      message.accessToken = undefined;
    }
    return message;
  },

  toJSON(message: CreateUserAccessTokenResponse): unknown {
    const obj: any = {};
    message.accessToken !== undefined && (obj.accessToken = message.accessToken ? UserAccessToken.toJSON(message.accessToken) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<CreateUserAccessTokenResponse>): CreateUserAccessTokenResponse {
    const message = { ...baseCreateUserAccessTokenResponse } as CreateUserAccessTokenResponse;
    if (object.accessToken !== undefined && object.accessToken !== null) {
      message.accessToken = UserAccessToken.fromPartial(object.accessToken);
    } else {
      message.accessToken = undefined;
    }
    return message;
  },
};

const baseDeleteUserAccessTokenRequest: object = { name: "", accessToken: "" };

export const DeleteUserAccessTokenRequest = {
  encode(message: DeleteUserAccessTokenRequest, writer: Writer = Writer.create()): Writer {
    if (message.name !== "") {
      writer.uint32(10).string(message.name);
    }
    if (message.accessToken !== "") {
      writer.uint32(18).string(message.accessToken);
    }
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): DeleteUserAccessTokenRequest {
    const reader = input instanceof Reader ? input : new Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseDeleteUserAccessTokenRequest } as DeleteUserAccessTokenRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.name = reader.string();
          break;
        case 2:
          message.accessToken = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): DeleteUserAccessTokenRequest {
    const message = { ...baseDeleteUserAccessTokenRequest } as DeleteUserAccessTokenRequest;
    if (object.name !== undefined && object.name !== null) {
      message.name = String(object.name);
    } else {
      message.name = "";
    }
    if (object.accessToken !== undefined && object.accessToken !== null) {
      message.accessToken = String(object.accessToken);
    } else {
      message.accessToken = "";
    }
    return message;
  },

  toJSON(message: DeleteUserAccessTokenRequest): unknown {
    const obj: any = {};
    message.name !== undefined && (obj.name = message.name);
    message.accessToken !== undefined && (obj.accessToken = message.accessToken);
    return obj;
  },

  fromPartial(object: DeepPartial<DeleteUserAccessTokenRequest>): DeleteUserAccessTokenRequest {
    const message = { ...baseDeleteUserAccessTokenRequest } as DeleteUserAccessTokenRequest;
    if (object.name !== undefined && object.name !== null) {
      message.name = object.name;
    } else {
      message.name = "";
    }
    if (object.accessToken !== undefined && object.accessToken !== null) {
      message.accessToken = object.accessToken;
    } else {
      message.accessToken = "";
    }
    return message;
  },
};

const baseDeleteUserAccessTokenResponse: object = {};

export const DeleteUserAccessTokenResponse = {
  encode(_: DeleteUserAccessTokenResponse, writer: Writer = Writer.create()): Writer {
    return writer;
  },

  decode(input: Reader | Uint8Array, length?: number): DeleteUserAccessTokenResponse {
    const reader = input instanceof Reader ? input : new Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = { ...baseDeleteUserAccessTokenResponse } as DeleteUserAccessTokenResponse;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(_: any): DeleteUserAccessTokenResponse {
    const message = { ...baseDeleteUserAccessTokenResponse } as DeleteUserAccessTokenResponse;
    return message;
  },

  toJSON(_: DeleteUserAccessTokenResponse): unknown {
    const obj: any = {};
    return obj;
  },

  fromPartial(_: DeepPartial<DeleteUserAccessTokenResponse>): DeleteUserAccessTokenResponse {
    const message = { ...baseDeleteUserAccessTokenResponse } as DeleteUserAccessTokenResponse;
    return message;
  },
};

export interface UserService {
  /** ListUsers returns a list of users. */
  ListUsers(request: ListUsersRequest): Promise<ListUsersResponse>;
  /** GetUser gets a user by name. */
  GetUser(request: GetUserRequest): Promise<GetUserResponse>;
  /** CreateUser creates a new user. */
  CreateUser(request: CreateUserRequest): Promise<CreateUserResponse>;
  /** UpdateUser updates a user. */
  UpdateUser(request: UpdateUserRequest): Promise<UpdateUserResponse>;
  /** DeleteUser deletes a user. */
  DeleteUser(request: DeleteUserRequest): Promise<DeleteUserResponse>;
  GetUserSetting(request: GetUserSettingRequest): Promise<GetUserSettingResponse>;
  UpdateUserSetting(request: UpdateUserSettingRequest): Promise<UpdateUserSettingResponse>;
  /** ListUserAccessTokens returns a list of access tokens for a user. */
  ListUserAccessTokens(request: ListUserAccessTokensRequest): Promise<ListUserAccessTokensResponse>;
  /** CreateUserAccessToken creates a new access token for a user. */
  CreateUserAccessToken(request: CreateUserAccessTokenRequest): Promise<CreateUserAccessTokenResponse>;
  /** DeleteUserAccessToken deletes an access token for a user. */
  DeleteUserAccessToken(request: DeleteUserAccessTokenRequest): Promise<DeleteUserAccessTokenResponse>;
}

export class UserServiceClientImpl implements UserService {
  private readonly rpc: Rpc;
  constructor(rpc: Rpc) {
    this.rpc = rpc;
    this.ListUsers = this.ListUsers.bind(this);
    this.GetUser = this.GetUser.bind(this);
    this.CreateUser = this.CreateUser.bind(this);
    this.UpdateUser = this.UpdateUser.bind(this);
    this.DeleteUser = this.DeleteUser.bind(this);
    this.GetUserSetting = this.GetUserSetting.bind(this);
    this.UpdateUserSetting = this.UpdateUserSetting.bind(this);
    this.ListUserAccessTokens = this.ListUserAccessTokens.bind(this);
    this.CreateUserAccessToken = this.CreateUserAccessToken.bind(this);
    this.DeleteUserAccessToken = this.DeleteUserAccessToken.bind(this);
  }
  ListUsers(request: ListUsersRequest): Promise<ListUsersResponse> {
    const data = ListUsersRequest.encode(request).finish();
    const promise = this.rpc.request("cloud.api.UserService", "ListUsers", data);
    return promise.then((data) => ListUsersResponse.decode(new Reader(data)));
  }

  GetUser(request: GetUserRequest): Promise<GetUserResponse> {
    const data = GetUserRequest.encode(request).finish();
    const promise = this.rpc.request("cloud.api.UserService", "GetUser", data);
    return promise.then((data) => GetUserResponse.decode(new Reader(data)));
  }

  CreateUser(request: CreateUserRequest): Promise<CreateUserResponse> {
    const data = CreateUserRequest.encode(request).finish();
    const promise = this.rpc.request("cloud.api.UserService", "CreateUser", data);
    return promise.then((data) => CreateUserResponse.decode(new Reader(data)));
  }

  UpdateUser(request: UpdateUserRequest): Promise<UpdateUserResponse> {
    const data = UpdateUserRequest.encode(request).finish();
    const promise = this.rpc.request("cloud.api.UserService", "UpdateUser", data);
    return promise.then((data) => UpdateUserResponse.decode(new Reader(data)));
  }

  DeleteUser(request: DeleteUserRequest): Promise<DeleteUserResponse> {
    const data = DeleteUserRequest.encode(request).finish();
    const promise = this.rpc.request("cloud.api.UserService", "DeleteUser", data);
    return promise.then((data) => DeleteUserResponse.decode(new Reader(data)));
  }

  GetUserSetting(request: GetUserSettingRequest): Promise<GetUserSettingResponse> {
    const data = GetUserSettingRequest.encode(request).finish();
    const promise = this.rpc.request("cloud.api.UserService", "GetUserSetting", data);
    return promise.then((data) => GetUserSettingResponse.decode(new Reader(data)));
  }

  UpdateUserSetting(request: UpdateUserSettingRequest): Promise<UpdateUserSettingResponse> {
    const data = UpdateUserSettingRequest.encode(request).finish();
    const promise = this.rpc.request("cloud.api.UserService", "UpdateUserSetting", data);
    return promise.then((data) => UpdateUserSettingResponse.decode(new Reader(data)));
  }

  ListUserAccessTokens(request: ListUserAccessTokensRequest): Promise<ListUserAccessTokensResponse> {
    const data = ListUserAccessTokensRequest.encode(request).finish();
    const promise = this.rpc.request("cloud.api.UserService", "ListUserAccessTokens", data);
    return promise.then((data) => ListUserAccessTokensResponse.decode(new Reader(data)));
  }

  CreateUserAccessToken(request: CreateUserAccessTokenRequest): Promise<CreateUserAccessTokenResponse> {
    const data = CreateUserAccessTokenRequest.encode(request).finish();
    const promise = this.rpc.request("cloud.api.UserService", "CreateUserAccessToken", data);
    return promise.then((data) => CreateUserAccessTokenResponse.decode(new Reader(data)));
  }

  DeleteUserAccessToken(request: DeleteUserAccessTokenRequest): Promise<DeleteUserAccessTokenResponse> {
    const data = DeleteUserAccessTokenRequest.encode(request).finish();
    const promise = this.rpc.request("cloud.api.UserService", "DeleteUserAccessToken", data);
    return promise.then((data) => DeleteUserAccessTokenResponse.decode(new Reader(data)));
  }
}

interface Rpc {
  request(service: string, method: string, data: Uint8Array): Promise<Uint8Array>;
}

type Builtin = Date | Function | Uint8Array | string | number | boolean | undefined;
export type DeepPartial<T> = T extends Builtin
  ? T
  : T extends Array<infer U>
  ? Array<DeepPartial<U>>
  : T extends ReadonlyArray<infer U>
  ? ReadonlyArray<DeepPartial<U>>
  : T extends {}
  ? { [K in keyof T]?: DeepPartial<T[K]> }
  : Partial<T>;

function toTimestamp(date: Date): Timestamp {
  const seconds = date.getTime() / 1_000;
  const nanos = (date.getTime() % 1_000) * 1_000_000;
  return { seconds, nanos };
}

function fromTimestamp(t: Timestamp): Date {
  let millis = t.seconds * 1_000;
  millis += t.nanos / 1_000_000;
  return new Date(millis);
}

function fromJsonTimestamp(o: any): Date {
  if (o instanceof Date) {
    return o;
  } else if (typeof o === "string") {
    return new Date(o);
  } else {
    return fromTimestamp(Timestamp.fromJSON(o));
  }
}

// If you get a compile-error about 'Constructor<Long> and ... have no overlap',
// add '--ts_proto_opt=esModuleInterop=true' as a flag when calling 'protoc'.
if (util.Long !== Long) {
  util.Long = Long as any;
  configure();
}
