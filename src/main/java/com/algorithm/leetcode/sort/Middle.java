package com.algorithm.leetcode.sort;

import com.google.common.collect.Lists;

import java.util.ArrayList;

/**
 * 二分查找
 */
public class Middle {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = Lists.newArrayList(1, 3, 2, 5);
        int[] a1 = {1, 2, 3, 4, 5};
        int search = search(a1, 5);
        System.out.println("位置是" + search);
    }

    public static int search(int[] nums, int target) {

        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int middle = (end - start) / 2 + start;
            if (nums[middle] == target) {
                return middle;
            }
            if (target > nums[middle]) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }
}
