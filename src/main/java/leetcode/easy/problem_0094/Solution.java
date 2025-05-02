package leetcode.easy.problem_0094;

import com.sun.source.tree.Tree;

import java.util.*;

/**
 * Problem 0094: Binary Tree Inorder Traversal
 * <a href="https://leetcode.com/problems/binary-tree-inorder-traversal/">...</a>
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 */


public class Solution {

    // Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.empty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                list.add(stack.peek().val);
                root = stack.pop().right;
            }
        }
        return list;
    }

    /* Recursion method
    List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        list.addAll(inorderTraversal(root.left));
        list.add(root.val);
        list.addAll(inorderTraversal(root.right));
        return list;
     */
}
