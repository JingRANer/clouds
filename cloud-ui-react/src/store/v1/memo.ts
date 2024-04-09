import { create } from "zustand";
import { combine } from "zustand/middleware";

// import { memoServiceClient } from "@/grpcweb";
// import { CreateMemoRequest, ListMemosRequest, Memo } from "@/types/proto/api/v2/memo_service";

class Memo {
  id!: number;
  name!: string;
  displayTime!: string;
  pinned!: boolean;
  constructor(id: number, name: string, displayTime: string, pinned: boolean) {
    this.id = id;
    this.name = name;
    this.displayTime = displayTime;
    this.pinned = pinned;
  }
}

const memo_mock = new Memo(1, "test_memo", "2024-01-02", true);

class ListMemosRequest {
  filter: string | undefined;
  limit!: number;
  offset: number | undefined;
}

class CreateMemoRequest {
  id: number | undefined;
}

interface State {
  memoMapById: Record<number, Memo>;
}

const getDefaultState = (): State => ({
  memoMapById: {},
});

export const useMemoStore = create(
  combine(getDefaultState(), (set, get) => ({
    setState: (state: State) => set(state),
    getState: () => get(),
    fetchMemos: async (request: Partial<ListMemosRequest>) => {
      // const { memos } = await memoServiceClient.listMemos(request);
      console.log("request", request);
      const memos = [memo_mock];
      const memoMap = get().memoMapById;
      for (const memo of memos) {
        memoMap[memo.id] = memo;
      }
      set({ memoMapById: memoMap });
      return memos;
    },
    getOrFetchMemoById: async (id: number, options?: { skipCache?: boolean; skipStore?: boolean }) => {
      const memoMap = get().memoMapById;
      const memo = memoMap[id];
      if (memo && !options?.skipCache) {
        return memo;
      }

      // const res = await memoServiceClient.getMemo({
      //   id,
      // });
      const memo_res = new Memo(id, "test_memo_res", "2024-02-07", true);
      // if (!res.memo) {
      //   throw new Error("Memo not found");
      // }

      // if (!options?.skipStore) {
      //   memoMap[id] = res.memo;
      //   set({ memoMapById: memoMap });
      // }
      // return res.memo;
      return memo_res;
    },
    getMemoById: (id: number) => {
      return get().memoMapById[id];
    },
    getOrFetchMemoByName: async (name: string) => {
      const memoMap = get().memoMapById;
      const memo = Object.values(memoMap).find((memo) => memo.name === name);
      if (memo) {
        return memo;
      }

      // const res = await memoServiceClient.getMemoByName({
      //   name,
      // });
      const res = new Memo(2, name, "2024-01-09", true);

      // if (!res.memo) {
      //   throw new Error("Memo not found");
      // }

      // memoMap[res.memo.id] = res.memo;
      // set({ memoMapById: memoMap });
      // return res.memo;
      return res;
    },
    getMemoByName: (name: string) => {
      const memoMap = get().memoMapById;
      return Object.values(memoMap).find((memo) => memo.name === name);
    },
    createMemo: async (request: CreateMemoRequest) => {
      // const { memo } = await memoServiceClient.createMemo(request);
      console.log("CreateMemoRequest", request);
      const memo = memo_mock;
      if (!memo) {
        throw new Error("Memo not found");
      }

      const memoMap = get().memoMapById;
      memoMap[memo.id] = memo;
      set({ memoMapById: memoMap });
      return memo;
    },
    updateMemo: async (update: Partial<Memo>, updateMask: string[]) => {
      // const { memo } = await memoServiceClient.updateMemo({
      //   id: update.id!,
      //   memo: update,
      //   updateMask,
      // });
      console.log("updateMemo", update, updateMask);
      const memo = new Memo(update.id!, update.name!, "2024-01-09", true);
      if (!memo) {
        throw new Error("Memo not found");
      }

      const memoMap = get().memoMapById;
      memoMap[memo.id] = memo;
      set({ memoMapById: memoMap });
      return memo;
    },
    deleteMemo: async (id: number) => {
      // await memoServiceClient.deleteMemo({
      //   id: id,
      // });

      const memoMap = get().memoMapById;
      delete memoMap[id];
      set({ memoMapById: memoMap });
    },
  }))
);

export const useMemoList = () => {
  const memoStore = useMemoStore();
  const memos = Object.values(memoStore.getState().memoMapById);

  const reset = () => {
    memoStore.setState({ memoMapById: {} });
  };

  const size = () => {
    return Object.keys(memoStore.getState().memoMapById).length;
  };

  return {
    value: memos,
    reset,
    size,
  };
};
