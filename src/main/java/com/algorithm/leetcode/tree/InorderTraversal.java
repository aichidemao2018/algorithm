package com.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 中序遍历
 * 输入：root = [1,null,2,3]
 * 输出：[1,3,2]
 * 左根右
 */
public class InorderTraversal {


    /**
     * 中序遍历
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();

        inOrder(root, res);

        return res;
    }

    public void inOrder(TreeNode treeNode, List<Integer> res) {
        if (treeNode == null) {
            return;
        }
        inOrder(treeNode.getLeft(), res);
        res.add(treeNode.getVal());
        inOrder(treeNode.getRight(), res);
    }
}
