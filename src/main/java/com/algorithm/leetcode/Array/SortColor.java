package com.algorithm.leetcode.Array;

/**
 * 颜色分类
 * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * <p>
 * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-colors
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SortColor {

    public static void main(String[] args) {
        int[] ints = sortColors(new int[]{1, 2, 1, 2, 3});
        for (int num : ints) {
            System.out.println(num);
        }

    }

    /**
     * 单指针
     * 两次循环
     * 第一次 移动0
     * 第二次 移动1
     * 最后 2在最右侧
     *
     * @param nums
     * @return
     */
    public static int[] sortColors(int[] nums) {
        int n = nums.length;
        //记录 当前移动的初始位置
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


    /**
     * 双指针
     * 一个将2移动到最右侧
     * 一个将0移动到最左侧
     *
     * @param nums
     * @return
     */
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
