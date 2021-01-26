package com.algorithm.leetcode.common;

import java.util.HashSet;

public class SingleNumber {

    public static void main(String[] args) {

        int solution = solution(new int[]{4, 2, 1, 2, 1});
        System.out.println(solution);
    }

    public static int solution(int[] nums) {
        HashSet set = new HashSet();
        for (int i = 0; i < nums.length; i++) {

            if (!set.add(nums[i])) {
                set.remove(nums[i]);
            }

        }
        return (int) set.toArray()[0];
    }

    public static int solution2(int[] nums) {
        int result = 0;
        for (int num : nums) {

            result = result ^ num;

        }
        return result;
    }

}
