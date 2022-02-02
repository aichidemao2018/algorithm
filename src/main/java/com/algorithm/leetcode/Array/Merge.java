package com.algorithm.leetcode.Array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 区间合并
 * 输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
 * 输出：[[1,6],[8,10],[15,18]]
 * 解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-intervals
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Merge {
    public static void main(String[] args) {

        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] merge = merge(intervals);
        System.out.println(merge);
    }

    public static int[][] merge(int[][] intervals) {
        // 先按照区间起始位置排序
        Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);
        // 遍历区间
        int[][] res = new int[intervals.length][2];
        int idx = -1;
        for (int[] interval : intervals) {
            // 如果结果数组是空的，或者当前区间的起始位置 > 结果数组中最后区间的终止位置，
            // 则不合并，直接将当前区间加入结果数组。
            if (idx == -1 || interval[0] > res[idx][1]) {
                res[++idx] = interval;
            } else {
                // 反之将当前区间合并至结果数组的最后区间
                int i = res[idx][1];
                int max = Math.max(res[idx][1], interval[1]);
                res[idx][1] = Math.max(res[idx][1], interval[1]);
            }
        }
        return Arrays.copyOf(res, idx + 1);
    }

    public int[][] merge2(int[][] intervals) {

        if (intervals.length == 0) {
            return new int[intervals.length][2];
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o1[0];
            }
        });
        int size = -1;
        int[][] res = new int[intervals.length][2];
        for (int num[] : intervals) {
            //如果是初始队列
            if (size == -1 || num[0] > res[size][0]) {
                res[size++] = num;
            } else {
                res[size][1] = Math.max(num[1], res[size][1]);
            }
        }
        return Arrays.copyOf(res, size + 1);
    }

    public int[][] mergeBySelf(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[intervals.length][2];
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        int idx = -1;
        int res[][] = new int[intervals.length][2];
        for (int[] interval : intervals) {
            int L = interval[0], R = interval[1];
            if (idx == -1 || interval[0] > res[idx][1]) {
                res[idx++] = new int[]{L, R};
                ;
            } else {
                res[idx][1] = Math.max(res[idx][1], interval[1]);
            }
        }
        return Arrays.copyOf(res, idx + 1);
    }
}
