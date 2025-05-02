package leetcode.easy.problem_0101;

import com.sun.source.tree.Tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

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

    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        Stack<TreeNode> stack = new Stack<>();

        stack.push(root.left);
        stack.push(root.right);

        while (!stack.isEmpty()) {
            TreeNode firstNode = stack.pop();
            TreeNode secondNode = stack.pop();

            if(firstNode == null && secondNode == null) continue;
            if(firstNode == null || secondNode == null) return false;
            if(firstNode.val != secondNode.val) return false;

            stack.push(firstNode.left);
            stack.push(secondNode.right);
            stack.push(firstNode.right);
            stack.push(secondNode.left);
        }

        return true;
    }

    /* Recursive Solution
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return helper(root.left, root.right);
    }

    boolean helper(TreeNode left, TreeNode right) {
        if(left == null || right == null) return left == right;
        return (left.val == right.val) && helper(left.left, right.right) && helper(left.right, right.left);
    }
     */

}
