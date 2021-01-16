package com.algorithm.leetcode.Array;

import com.algorithm.leetcode.BaseMain;

public class Palouti extends BaseMain {

    public static void main(String[] args) {

        int solution = solution(5);
        System.out.println(solution);
    }

    public static int solution(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return solution(n - 1) + solution(n - 2);
    }
}
