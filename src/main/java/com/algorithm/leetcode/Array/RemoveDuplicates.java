package com.algorithm.leetcode.Array;

/**
 * 删除重复元素
 * 快慢指针
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 2};
        int solution = solution(nums);
        System.out.println(solution);
    }

    private static int solution(int num[]) {

        if (num.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < num.length; j++) {
            if (num[j] != num[i]) {
                i++;
                num[i] = num[j];
            }
        }
        return i + 1;
    }
}
