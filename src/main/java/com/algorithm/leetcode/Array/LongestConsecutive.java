package com.algorithm.leetcode.Array;

import java.util.*;

/**
 * 最长连续队列
 * 输入：nums = [100,4,200,1,3,2]
 * 输出：4
 * 解释：最长数字连续序列是 [1, 2, 3, 4]。它的长度为 4。
 */
public class LongestConsecutive {

    public static void main(String[] args) {
        Set<Integer> set = Collections.EMPTY_SET;
        int[] nums = {100, 4, 200, 1, 3, 2};
        int solution = solution(nums);
        System.out.println("ssss" + solution);
    }

    public static int solution(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        List<Integer> res = new ArrayList<>();
        int longest = 0;
        for (int num : nums) {
            if (numSet.contains(num - 1)) {
                continue;
            }
            int longer = 0;

            res.add(num);
            int addNum = num++;
            while (numSet.contains(addNum)) {
                res.add(addNum);
                addNum++;
                longer++;
            }
            longest = Math.max(longest, longer);
        }
        System.out.println("res" + res.toString());
        return longest;
    }
}
