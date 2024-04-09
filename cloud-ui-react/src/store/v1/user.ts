/* eslint-disable @typescript-eslint/no-unused-vars */
import { create } from "zustand";
import { combine } from "zustand/middleware";
// import { authServiceClient, userServiceClient } from "@/grpcweb";
import { userServiceClient } from "@/grpcweb";
import { RowStatus } from "@/types/proto/api/v2/store/common";
import { User, UserSetting, User_Role } from "@/types/proto/api/v2/user_service";
import { UserNamePrefix, extractUsernameFromName } from "./resourceName";

// const UserSetting = { ...userServiceClient.UserSetting };

// enum User_Role {
//   ROLE_UNSPECIFIED = 0,
//   HOST = 1,
//   ADMIN = 2,
//   USER = 3,
// }

// class User {
//   id!: number;
//   name!: string;
//   username!: string;

//   role: User_Role;
//   // emial nickname avatar_url password

//   constructor(name: string, id: number, role: User_Role, username: string) {
//     this.name = name;
//     this.id = id;
//     this.role = role;
//     this.username = username;
//   }
// }

// class UserSetting {
//   name: string | undefined;
//   locale: string | undefined;
//   appearance: string | undefined;
//   memo_visibility: string | undefined;
//   telegram_user_id: string | undefined;
// }

interface State {
  userMapByUsername: Record<string, User>;
  // The name of current user. Format: `users/${username}`
  currentUser?: string;
  userSetting?: UserSetting;
}

const getDefaultState = (): State => ({
  userMapByUsername: {},
  currentUser: undefined,
  userSetting: undefined,
});

const getDefaultUserSetting = () => {
  return UserSetting.fromPartial({
    locale: "en",
    appearance: "auto",
    memoVisibility: "PRIVATE",
  });
};

function createUserMock(): User {
  return {
    name: "test",
    id: 1,
    role: User_Role.USER,
    username: "test",
    email: "",
    nickname: "",
    avatarUrl: "",
    password: "123456",
    rowStatus: RowStatus.ARCHIVED,
    createTime: new Date(),
    updateTime: new Date("2023-10-06"),
  };
}

// Request cache is used to prevent multiple requests.
const requestCache = new Map<string, Promise<any>>();

const usersMock: User[] = [];

export const useUserStore = create(
  combine(getDefaultState(), (set, get) => ({
    fetchUsers: async () => {
      const { users } = await userServiceClient.listUsers({});
      const userMap = get().userMapByUsername;
      for (const user of users) {
        userMap[user.username] = user;
      }
      set({ userMapByUsername: userMap });
      return users;
    },
    getOrFetchUserByUsername: async (username: string) => {
      const userMap = get().userMapByUsername;
      if (userMap[username]) {
        return userMap[username] as User;
      }
      if (requestCache.has(username)) {
        return await requestCache.get(username);
      }

      const promisedUser = userServiceClient
        .getUser({
          name: `${UserNamePrefix}${username}`,
        })
        .then(({ user }) => user);

      requestCache.set(username, promisedUser);
      const user = await promisedUser;
      if (!user) {
        throw new Error("User not found");
      }
      requestCache.delete(username);
      userMap[username] = user;
      set({ userMapByUsername: userMap });
      return user;
    },
    getUserByUsername: (username: string) => {
      const userMap = get().userMapByUsername;
      return userMap[username];
    },
    updateUser: async (user: Partial<User>, updateMask: string[]) => {
      // const { user: updatedUser } = await userServiceClient.updateUser({
      //   user: user,
      //   updateMask: updateMask,
      // });
      const updatedUser = createUserMock();
      console.log("updateMark", updateMask);
      if (!updatedUser) {
        throw new Error("User not found");
      }
      const userMap = get().userMapByUsername;
      if (user.name !== updatedUser.name) {
        delete userMap[extractUsernameFromName(user.name)];
      }
      userMap[updatedUser.username] = updatedUser;
      set({ userMapByUsername: userMap });
      if (user.name === get().currentUser) {
        set({ currentUser: updatedUser.name });
      }
      return updatedUser;
    },
    deleteUser: async (name: string) => {
      // await userServiceClient.deleteUser({
      //   name,
      // });
      const username = extractUsernameFromName(name);
      const userMap = get().userMapByUsername;
      delete userMap[username];
      set({ userMapByUsername: userMap });
    },
    fetchCurrentUser: async () => {
      // const { user } = await authServiceClient.getAuthStatus({});
      const user = createUserMock();
      if (!user) {
        throw new Error("User not found");
      }
      const userMap = get().userMapByUsername;
      userMap[user.username] = user;
      set({ currentUser: user.name, userMapByUsername: userMap });
      // const { setting } = await userServiceClient.getUserSetting({});
      // set({
      //   userSetting: UserSetting.fromPartial({
      //     ...getDefaultUserSetting(),
      //     ...setting,
      //   }),
      // });
      return user;
    },
    updateUserSetting: async (userSetting: Partial<UserSetting>, updateMask: string[]) => {
      const { setting: updatedUserSetting } = await userServiceClient.updateUserSetting({
        setting: userSetting,
        // updateMask: updateMask,
      });
      console.log("userSetting", userSetting);
      console.log("updateMask", updateMask);
      if (!updatedUserSetting) {
        throw new Error("User setting not found");
      }
      set({ userSetting: updatedUserSetting });
      return updatedUserSetting;
    },
  }))
);

export const stringifyUserRole = (role: User_Role) => {
  if (role === User_Role.HOST) {
    return "Host";
  } else if (role === User_Role.ADMIN) {
    return "Admin";
  } else {
    return "User";
  }
};
