package com.algorithm.leetcode.Array;

import java.util.Arrays;

/**
 * 给你一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 * <p>
 * 输入: nums = [1,2,3,4,5,6,7], k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右轮转 1 步: [7,1,2,3,4,5,6]
 * 向右轮转 2 步: [6,7,1,2,3,4,5]
 * 向右轮转 3 步: [5,6,7,1,2,3,4]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rotate-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Rotate {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        rotate2(a1, 1);
    }

    /**
     * 方法一
     *
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            arr[(i + k) % length] = nums[i];
        }
        System.out.println(Arrays.stream(arr).toArray());
        System.arraycopy(arr, 0, nums, 0, length);
    }


    /**
     * 方法二
     *
     * @param nums
     * @param k    倒序 分为两个数组 a,b
     *             a数组 继续倒序
     *             b数组倒序
     */
    public static void rotate2(int[] nums, int k) {
        int length = nums.length;
        k %= length;
        reserve(nums, 0, nums.length - 1);
        reserve(nums, 0, k - 1);
        reserve(nums, k, length - 1);
        System.out.println(nums);
    }

    /**
     * 倒序 分为两个数组 a,b
     * a数组 继续倒序
     * b数组倒序
     *
     * @return
     */
    public static int[] reserve(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start += 1;
            end -= 1;
        }
        return nums;
    }

}
