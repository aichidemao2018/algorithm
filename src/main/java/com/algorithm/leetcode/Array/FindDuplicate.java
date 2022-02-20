package com.algorithm.leetcode.Array;

/**
 * 寻找重复数字
 * 给定一个包含n + 1 个整数的数组nums ，其数字都在[1, n]范围内（包括 1 和 n），可知至少存在一个重复的整数。
 * <p>
 * 假设 nums 只有 一个重复的整数 ，返回这个重复的数 。
 * <p>
 * 你设计的解决方案必须 不修改 数组 nums 且只用常量级 O(1) 的额外空间。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-the-duplicate-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class FindDuplicate {
    public static void main(String[] args) {
        int[] ints = {1, 3, 4, 2, 2};
        int duplicate = findDuplicate(ints);
        System.out.println("1111" + duplicate);
    }

    /**
     * 快慢指针
     * 将数组的每个元素 看做一个函数
     * x = f(x)
     * 解题思路
     * https://leetcode-cn.com/problems/find-the-duplicate-number/solution/kuai-man-zhi-zhen-de-jie-shi-cong-damien_undoxie-d/
     *
     * @param nums
     */
    public static int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        //直到 相遇  即 慢指针在 环中的位置
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        //定义一个新的指针 或者快指针为0
        //慢指针继续 向前走 同 从起点 相遇的点 即环的起点  重复数字
        fast = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
