package com.algorithm.leetcode.tree;

public class MaxDepth {
    public static void main(String[] args) {

    }

    public static int maxDepthmaxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        } else {
            int left = maxDepthmaxDepth(root.getLeft());
            int right = maxDepthmaxDepth(root.getRight());
            return Math.max(left, right) + 1;
        }
        //maxDepthmaxDepth(root.getLeft()) + maxDepthmaxDepth(root.getRight());
    }


}
