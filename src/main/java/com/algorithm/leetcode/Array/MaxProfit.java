package com.algorithm.leetcode.Array;

/**
 * 买卖股票的最佳时机
 */
public class MaxProfit {
    public static void main(String[] args) {

    }

    public int maxProfit(int prices[]) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < min) {
                min = prices[i];
            } else if (prices[i] > min - max) {
                max = prices[i] - min;
            }
        }
        return max;
    }
}
