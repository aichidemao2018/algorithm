package com.algorithm.leetcode.Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTest {
    public static void main(String[] args) {
        CountNum cn = new CountNum(0);
        // FutureTask<Integer> 这里的表示返回的是Integer
        FutureTask<Integer> ft = new FutureTask<Integer>(cn);
        Thread td = new Thread(ft);
        System.out.println("futureTask执行计算:" + System.currentTimeMillis());
        td.start();
        System.out.println("main 主线程可以做些其他事情" + System.currentTimeMillis());
        try {
            // futureTask的get方法会阻塞，知道可以取得结果为止
            Integer result = ft.get();
            System.out.println("计算的结果是:" + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("取得分支线程执行的结果后，主线程可以继续处理其他事项");
    }
}
