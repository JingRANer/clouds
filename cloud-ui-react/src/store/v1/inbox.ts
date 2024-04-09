import { create } from "zustand";
import { combine } from "zustand/middleware";

// import { inboxServiceClient } from "@/grpcweb";
// import { Inbox } from "@/types/proto/api/v2/inbox_service";

class Inbox {
  // id!: number;
  // name!: string;
  // email!: string;
  // createdAt!: string;
  // updatedAt!: string;
  constructor(public id: number, public name: string, public email: string, public createdAt: string, public updatedAt: string) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }
}

const inbox_mock = new Inbox(1, "John Doe", "johndoe@example.com", "2022-01-01T00:00:00Z", "2022-01-01T00:00:00Z");

interface State {
  inboxes: Inbox[];
}

const getDefaultState = (): State => ({
  inboxes: [],
});

export const useInboxStore = create(
  combine(getDefaultState(), (set, get) => ({
    fetchInboxes: async () => {
      // const { inboxes } = await inboxServiceClient.listInboxes({});
      const inboxes = [inbox_mock];
      set({ inboxes });
      return inboxes;
    },
    updateInbox: async (inbox: Partial<Inbox>, updateMask: string[]) => {
      // const { inbox: updatedInbox } = await inboxServiceClient.updateInbox({
      //   inbox,
      //   updateMask,
      // });
      const updatedInbox = { ...inbox_mock, ...inbox };
      console.log("updateMask", updateMask);
      if (!updatedInbox) {
        throw new Error("Inbox not found");
      }
      const inboxes = get().inboxes;
      set({ inboxes: inboxes.map((i) => (i.name === updatedInbox.name ? updatedInbox : i)) });
      return updatedInbox;
    },
  }))
);
