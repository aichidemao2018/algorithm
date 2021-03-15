package com.algorithm.leetcode.tree;

/**
 * 最小生成树
 */
public class MinDepth {
    public static void main(String[] args) {

    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.getLeft() == null && root.getRight() == null) {
            return 1;
        }

        if (root.getLeft() != null) {

        }

        return 1;
    }
}
