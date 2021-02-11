package com.algorithm.leetcode.Array;

import org.apache.commons.lang3.ArrayUtils;

/**
 * 53。最大子序列和
 */
public class MaxSubArray {
    public static void main(String[] args) {

    }

    // 正数增益
    public static int solution(int[] nums) {
        if (ArrayUtils.isEmpty(nums)) {
            return 0;
        }

        int sum = 0;
        int arr = nums[0];
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            arr = Math.max(sum, arr);
        }
        return arr;
    }
}
