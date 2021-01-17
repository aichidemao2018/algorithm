package com.algorithm.leetcode.common;

public class ReserveInt {
    public static void main(String[] args) {
        int reverse = reverse(123);
        System.out.println(reverse);
    }

    public static int reverse(int x) {
        long res = 0;
        while (x != 0) {

            int temp = x % 10;
            res = res * 10 + temp;

            x = x / 10;
        }
        return (int) res == res ? (int) res : 0;
    }
}
