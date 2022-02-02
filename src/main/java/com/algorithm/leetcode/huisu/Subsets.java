package com.algorithm.leetcode.huisu;

import java.util.ArrayList;
import java.util.List;

/**
 * 子集
 * 输入：nums = [1,2,3]
 * 输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 */
public class Subsets {

    //保存最终结果
    private static List<List<Integer>> res = new ArrayList<>();
    //保存临时结果
    private static List<Integer> path = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<Integer> initList = new ArrayList<>();
        initList.add(1);
        initList.add(2);
        initList.add(3);
        int[] intervals = {1, 2, 3};
        List<List<Integer>> subsets = subsets(intervals, 0);
    }

    public static List<List<Integer>> subsets(int[] nums, int size) {
        res.add(new ArrayList<>(path));
        for (int i = size; size < nums.length; size++) {
            path.add(nums[i]);
            subsets(nums, i + 1);
            path.remove(path.size() - 1);
        }

        return res;
    }
}
