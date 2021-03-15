package com.algorithm.leetcode.Thread;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MySelfThreadPool {
    // 默认线程池中的线程数量
    public static final int WORK_NUM = 5;

    // 默认处理任务的数量
    public static final int TASK_NUM = 100;

    private final BlockingQueue<Runnable> taskQueue;//阻塞有序队列存放任务

    private final Set<WorkerThread> workerThreads;

    private int workNum;

    private int taskNum;

    public MySelfThreadPool() {
        this(WORK_NUM, TASK_NUM);
    }

    public MySelfThreadPool(int workNum, int taskNum) {
        this.workNum = workNum;
        this.taskNum = taskNum;
        if (workNum < 0) {
            workNum = WORK_NUM;
        }
        if (taskNum < 0) {
            taskNum = TASK_NUM;
        }
        taskQueue = new ArrayBlockingQueue<>(taskNum);
        workerThreads = new HashSet<>();
        for (int i = 0; i < workNum; i++) {
            WorkerThread workerThread = new WorkerThread("thread_" + i);
            workerThread.start();
            workerThreads.add(workerThread);
        }

    }

    public void execute(Runnable task) {
        try {
            taskQueue.put(task);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void destroy() {
        System.out.println("ready close thread pool...");
        if (workerThreads == null || workerThreads.isEmpty()) return;
        for (WorkerThread workThread : workerThreads) {
            workThread.stopWork();
            workThread = null;//help gc
        }
        workerThreads.clear();
    }


    private class WorkerThread extends Thread {
        public WorkerThread(String name) {
            super();
        }

        @Override
        public void run() {
            while (!interrupted()) {
                try {
                    Runnable runnable = taskQueue.take();
                    if (runnable != null) {
                        System.out.println(getName() + "ready execute:" + runnable.toString());
                        runnable.run();
                    }
                    runnable = null;// help gc
                } catch (Exception e) {
                    interrupt();
                }
            }


        }

        public void stopWork() {
            interrupt();
        }

    }
}
