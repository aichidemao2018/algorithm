package com.algorithm.leetcode.Thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 用两个线程，一个输出字母，一个输出数字，交替输出 1A2B3C4D...26Z
 */
public class NumAndLetterPrinter {
    private static Thread numThread, letterThread;

    public static void main(String[] args) {

        solution2();

    }

    private static void solution2() {
        Lock lock = new ReentrantLock();
        Condition A = lock.newCondition();
        Condition B = lock.newCondition();
        // solution1();

        numThread = new Thread(() -> {
            for (int i = 0; i < 26; i++) {
                try {
                    lock.lock();
                    System.out.print(i);

                    B.signal();
                    A.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }, "numThread");

        letterThread = new Thread(() -> {
            for (int i = 0; i < 26; i++) {
                System.out.print((char) ('A' + i));

                try {
                    lock.lock();
                    A.signal();
                    B.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }, "numThread");

        numThread.start();
        letterThread.start();
    }

    private static void solution1() {
        numThread = new Thread(() -> {
            for (int i = 0; i < 26; i++) {
                System.out.print(i);
                LockSupport.unpark(letterThread);
                LockSupport.park();
            }
        }, "numThread");

        letterThread = new Thread(() -> {
            for (int i = 0; i < 26; i++) {
                System.out.print((char) ('A' + i));
                LockSupport.park();
                LockSupport.unpark(numThread);
            }
        }, "numThread");

        numThread.start();
        letterThread.start();
    }
}
