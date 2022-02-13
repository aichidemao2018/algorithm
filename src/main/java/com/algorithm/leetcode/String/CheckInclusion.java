package com.algorithm.leetcode.String;

/**
 * 给你两个字符串s1和s2 ，写一个函数来判断 s2 是否包含 s1的排列。如果是，返回 true ；否则，返回 false 。
 * <p>
 * 换句话说，s1 的排列之一是 s2 的 子串 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/permutation-in-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 输入：s1 = "ab" s2 = "eidbaooo"
 * 输出：true
 * 解释：s2 包含 s1 的排列之一 ("ba").
 */
public class CheckInclusion {

    /**
     * 采用双指针 法
     * 因为 数组本数有序
     * 1.数组两端存放的是最大值,用双指针比较两遍,数组尾部存放最大值,防到尾部，移动双指针到中间
     *
     * @param s1
     * @param s2
     * @return
     */
  /*  public boolean checkInclusion(String s1, String s2) {

    }*/
}
