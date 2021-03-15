package com.algorithm.leetcode.test;

public class Test1 {

    public static void main(String[] args) {
        System.out.println(swap(2, 2l));
        System.out.println(swap2(2, 2l));
    }

    private static Boolean swap(Number n1, Number n2) {
        return n1 == n2;
    }

    private static Boolean swap2(Number n1, Number n2) {
        return n1.equals(n2);
    }

}
