package com.algorithm.leetcode.Array;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.List;

public class LongCommonStr {

    public static void main(String args[]) {
        List a = new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);

        List b = new ArrayList();
        b.add(2);
        b.add(1);
        b.add(2);
        b.add(3);
        int test = test(b, a);
        System.out.println(test);
        String[] str = {"flower", "flow", "flight"};
        String solution = solution(str);
        System.out.println(solution);
    }

    //纵向扫描
    public static String solution(String[] str) {
        if (ArrayUtils.isEmpty(str)) {
            return "";
        }
        int length = str[0].length();
        int count = str.length;

        //第一个字符串的长度
        for (int i = 0; i < length; i++) {
            char c = str[0].charAt(i);
            //有几个字符串进行比较
            for (int j = 1; j < count; j++) {
                if (str[j].charAt(i) != c) {
                    return str[0].substring(0, i);
                }

            }
        }
        return str[0];
    }

    public static int test(List<?> source, List<?> target) {
        int sourceSize = source.size();
        int targetSize = target.size();
        int maxCandidate = sourceSize - targetSize;
        for (int candidate = 0; candidate <= maxCandidate; candidate++) {
            for (int i = 0, j = candidate; i < targetSize; i++, j++)
                if (!target.get(i).equals(source.get(j)))
                    continue;  // Element mismatch, try next cand
            return candidate;  // All elements of candidate matched target
        }
        return -1;
    }
}
