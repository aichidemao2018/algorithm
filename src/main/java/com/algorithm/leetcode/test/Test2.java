package com.algorithm.leetcode.test;

import java.util.concurrent.atomic.AtomicInteger;

public class Test2 {
    private static AtomicInteger atomicInteger = new AtomicInteger(0);

    private static int count = 0;

    public static int count() {
        return count = atomicInteger.incrementAndGet();
    }

    public static void main(String[] args) {
        System.out.println(count());
    }
}
