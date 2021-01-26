package com.algorithm.leetcode.Array;

/**
 * 颜色分类
 */
public class SortColor {

    public static void main(String[] args) {
        int[] ints = sortColors(new int[]{1, 2, 1, 2, 3});
        System.out.println(ints);
    }

    public static int[] sortColors(int[] nums) {
        int n = nums.length;
        int ptr = 0;
        for (int i = 0; i < n; ++i) {
            if (nums[i] == 0) {
                swap(nums, ptr, i);
                ptr++;
            }

        }
        for (int i = ptr; i < n; ++i) {
            if (nums[i] == 1) {
                swap(nums, ptr, i);
                ptr++;
            }

        }

        return nums;
    }

    private static void swap(int[] nums, int ptr, int i) {
        int temp = nums[i];
        nums[i] = nums[ptr];
        nums[ptr] = temp;
    }


    public static int[] sortColors2(int[] nums) {
        int n = nums.length;

        int po = 0, p2 = n - 1;
        for (int i = 0; i < p2; i++) {

            while (i < p2 && nums[i] == 2) {
                swap(nums, i, p2);
                p2--;
            }

            if (nums[i] == 0) {
                swap(nums, i, po);
                po++;
            }
        }


        return nums;
    }
}
