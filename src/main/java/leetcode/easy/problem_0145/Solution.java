package leetcode.easy.problem_0145;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Problem 0145: Binary Tree Postorder Traversal
 * <a href="https://leetcode.com/problems/binary-tree-postorder-traversal/">...</a>
 * Given the root of a binary tree, return its postorder traversal as a list of integers.
 * Visit nodes in the order: left, right, root.
 */

public class Solution {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Deque<TreeNode> stack = new LinkedList<>();
        Deque<TreeNode> stackReverse = new LinkedList<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            stackReverse.push(curr);

            if (curr.left != null) {
                stack.push(curr.left);
            }

            if (curr.right != null) {
                stack.push(curr.right);
            }
        }
        while (!stackReverse.isEmpty()) {
            list.add(stackReverse.pop().val);
        }
        return list;
    }

    /* Recursive Solution - 0 ms
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        list.addAll(postorderTraversal(root.left));
        list.addAll(postorderTraversal(root.right));
        list.add(root.val);
        return list;
    }
     */
}
