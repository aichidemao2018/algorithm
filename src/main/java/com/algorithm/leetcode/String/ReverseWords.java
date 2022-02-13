package com.algorithm.leetcode.String;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        reverseWords("let go");
    }

    // 跳过字符串 只查询 不包含字富川的部分
    public static String reverseWords(String s) {
        char[] array = s.toCharArray();
        int length = s.length();
        int i = 0;
        while (i < length) {
            int start = i;
            while (i < length && array[i] != ' ') {
                i++;
            }
            int left = start, right = i - 1;
            reverse(array, left, right);

            while (i < length && array[i] == ' ') {
                i++;
            }
        }
        return Arrays.toString(array);
    }

    private static void reverse(char[] array, int l, int r) {
        while (l < r) {
            char temp = array[l];
            array[l] = array[r];
            array[r] = temp;
            l += 1;
            r -= 1;
        }
    }
}
