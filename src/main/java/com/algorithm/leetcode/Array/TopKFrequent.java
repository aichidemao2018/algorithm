package com.algorithm.leetcode.Array;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * topK
 */
public class TopKFrequent {
    public static void main(String[] args) {
        int[] ints = {1, 2};
    }

    public static int[] soultion(int[] nums, int k) {
        HashMap<Integer, Integer> occurrentce = new HashMap();
        for (int num : nums) {
            occurrentce.put(num, occurrentce.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        for (Map.Entry<Integer, Integer> entry : occurrentce.entrySet()) {
            int num = entry.getKey(), count = entry.getValue();

            if (queue.size() == k) {

                if (queue.peek()[1] < count) {
                    queue.poll();
                    queue.offer(new int[]{num, count});
                }

            } else {
                queue.offer(new int[]{num, count});
            }
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = queue.poll()[0];
        }
        return res;
    }
}
