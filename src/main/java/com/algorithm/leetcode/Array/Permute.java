package com.algorithm.leetcode.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * 全排列
 */
public class Permute {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Permute solution = new Permute();
        List<List<Integer>> lists = solution.permute(nums);
        System.out.println(lists);
    }

    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        dfs(res, path, nums, visited);
        return res;
    }

    public static void dfs(List<List<Integer>> res, List<Integer> temp, int[] nums, boolean[] visited) {

        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            temp.add(nums[i]);
            dfs(res, temp, nums, visited);
            visited[i] = false;
            temp.remove(temp.size() - 1);
        }

    }

}
