package leetcode.easy.problem_0112;

import com.sun.source.tree.Tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Problem 0112: Path Sum
 * <a href="https://leetcode.com/problems/path-sum/">...</a>
 * Given the root of a binary tree and an integer targetSum,
 * return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
 * A leaf is a node with no children.
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

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }
        targetSum -= root.val;
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }


    /* Iterative Solution - 1ms
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode currNode = stack.pop();
            if(currNode.val == targetSum && currNode.left == null && currNode.right == null) return true;
            pushNodes(currNode.left, currNode.val, stack);
            pushNodes(currNode.right, currNode.val, stack);
        }
        return false;
    }

    public static void pushNodes(TreeNode child, int parentVal, Deque<TreeNode> stack) {
        if (child != null) {
            child.val += parentVal;
            stack.push(child);
        }
    }
    */
}