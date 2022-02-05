package com.algorithm.leetcode.huisu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 全排列
 * https://leetcode-cn.com/problems/permutations/solution/hui-su-suan-fa-python-dai-ma-java-dai-ma-by-liweiw/
 */
public class Permute {

    private static List<List<Integer>> res = new ArrayList<>();

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

    private void backtrack(int[] nums, LinkedList<Integer> road) {
        if (nums.length == road.size()) {
            res.add(road);
            return;
        }

        for (int num : nums) {
            if (road.contains(num)) {
                continue;
            }
            road.add(num);
            backtrack(nums, road);
            road.removeLast();
        }
    }

    private void backtrack(int[] nums, LinkedList<Integer> road, int start) {
        if (nums.length == start) {
            res.add(road);
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (road.contains(nums[i])) {
                continue;
            }
            road.add(nums[i]);
            backtrack(nums, road, i + 1);
            road.removeLast();
        }
    }

}
