package com.geek.algorithm.light.Algorithm.practice.firstTimes;


import com.geek.algorithm.light.Algorithm.base.TreeNodes;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNodes node) {
        List<Integer> result = new ArrayList<>();
        if (node == null) {
            return result;
        }
        recursion(result, node);
        return result;
    }

    private void recursion(List<Integer> result, TreeNodes node) {
        if (null == node) {
            return;
        }
        recursion(result, node.getLeft());
        result.add(node.getVal());
        recursion(result, node.getRight());
    }


    /**
     * public List<Integer> inorderTraversal(TreeNode root) {
     *         List<Integer> res = new ArrayList<Integer>();
     *         Deque<TreeNode> stk = new LinkedList<TreeNode>();
     *         while (root != null || !stk.isEmpty()) {
     *             while (root != null) {
     *                 stk.push(root);
     *                 root = root.left;
     *             }
     *             root = stk.pop();
     *             res.add(root.val);
     *             root = root.right;
     *         }
     *         return res;
     *     }
     */
}
