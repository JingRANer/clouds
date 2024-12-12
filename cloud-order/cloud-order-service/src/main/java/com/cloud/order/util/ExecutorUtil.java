package com.cloud.order.util;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: ExecutorUtil
 * @create: 2024-12-11 22:27
 **/


public class ExecutorUtil {
    private ExecutorUtil() {
    }

    /**
     * 通用线程池
     */
    private static class ExecutorInstance {
        private static final int COREPOOLSIZE = 30;
        private static final ExecutorService EXECUTOR = new ThreadPoolExecutor(COREPOOLSIZE,
                COREPOOLSIZE * 2,
                3,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(20),
                new ThreadPoolExecutor.CallerRunsPolicy());
    }


    public static ExecutorService getExecutorInstance() {
        return ExecutorInstance.EXECUTOR;
    }


}
