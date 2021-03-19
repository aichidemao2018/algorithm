package com.algorithm.leetcode.Thread;

import java.util.concurrent.Callable;

public class CountNum implements Callable {
    private Integer sum;

    public CountNum(Integer sum) {
        this.sum = sum;
    }

    public Object call() throws Exception {
        for (int i = 0; i < 100; i++) {
            sum = sum + i;
        }
        // 休眠5秒钟，观察主线程行为，预期的结果是主线程会继续执行，到要取得FutureTask的结果是等待直至完成
        Thread.sleep(3000);
        System.out.println("futureTask 执行完成" + System.currentTimeMillis());
        return sum;
    }

}
