package com.algorithm.leetcode.Array;

/**
 * 移动0
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        //左指针代码的是所有 非0 数组的 数组下标.右边是
        int left = 0, right = 0;
        while (left < right) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }

    }

    public static int[] swap(int[] num, int left, int right) {
        int temp = num[left];
        num[left] = num[right];
        num[right] = temp;
        return num;
    }
}
