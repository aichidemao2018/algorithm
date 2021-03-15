package com.algorithm.leetcode.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树的层次遍历
 */
public class LevelOrder {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        Queue<TreeNode> queues = new ArrayDeque<TreeNode>();
        if (root != null) {
            queues.add(root);
        }
        while (!queues.isEmpty()) {
            int length = queues.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                TreeNode node = queues.poll();
                level.add(node.getVal());
                if (node.getLeft() != null) {
                    queues.add(node.getLeft());
                }
                if (node.getRight() != null) {
                    queues.add(node.getRight());
                }

            }
            res.add(level);
        }
        return res;
    }

}
