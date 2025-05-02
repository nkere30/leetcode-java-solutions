package leetcode.easy.problem_0110;

/**
 * Problem 0110: Balanced Binary Tree
 * <a href="https://leetcode.com/problems/balanced-binary-tree/">...</a>
 * Given a binary tree, determine if it is height-balanced.
 * A height-balanced binary tree is defined as:
 * a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
 */

public class Solution {

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


    public boolean isBalanced(TreeNode root) {
        return helper(root) != -1;
    }

    private int helper(TreeNode root) {
        if(root == null) return 0;

        int right = helper(root.right);
        if(right == -1) return -1;
        int left = helper(root.left);
        if(left == -1) return -1;

        if(Math.abs(left - right) > 1) return -1;

        return Math.max(left, right) + 1;
    }
}
