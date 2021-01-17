package com.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoNumAdd {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        List a = new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        int[] solution = solution(ints, 4);

        System.out.println(solution);
    }

    public static int[] solution(int[] list, int target) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < list.length; i++) {
            map.put(list[i], i);
        }
        for (int i = 0; i < list.length; i++) {
            int result = target - list[i];
            if (map.containsKey(result)) {
                return new int[]{i, map.get(result)};
            }
        }
        return new int[]{0};
    }
}
