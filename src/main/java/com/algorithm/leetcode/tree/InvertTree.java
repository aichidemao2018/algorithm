package com.algorithm.leetcode.tree;

/*
反转二叉树
 */
public class InvertTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = root.getLeft();
        TreeNode right = root.getLeft();

        root.left = right;
        root.right = left;
        return root;
    }
}
