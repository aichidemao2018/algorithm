package com.algorithm.leetcode.String;

import java.util.HashMap;
import java.util.Map;

/**
 * 最长公共子串
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class LengthOfLongestSubstring {
    public static void main(String[] args) {


    }

    /**
     * 滑动时间窗口
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {

        int length = s.length();
        Map<Character, Integer> resultMap = new HashMap<>();

        int max = 0;
        int left = 0;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            //记录 重复字符的开始位置
            if (resultMap.containsKey(c)) {
                left = Math.max(left, resultMap.get(c) + 1);
            }
            resultMap.put(c, i);
            max = Math.max(max, i - left + 1);
        }
        //数组下标从0开始所以+1
        return max;
    }

}
