package leetcode.easy.problem_0104;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Problem 0104: Maximum Depth of Binary Tree
 * <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/">...</a>
 * Given the root of a binary tree, return its maximum depth.
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
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

    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        // Variables for nodes, count of depth and max depth
        Deque<TreeNode> nodes = new LinkedList<>();
        Deque<Integer> count = new LinkedList<>();
        int max = 0;

        // Push root and first count
        nodes.push(root);
        count.push(1);

        while (!nodes.isEmpty()) {
            TreeNode curr = nodes.pop();
            int currNodeCount = count.pop();

            max = Math.max(max, currNodeCount);

            pushNodes(curr.left, nodes, count, currNodeCount);

            pushNodes(curr.right, nodes, count, currNodeCount);
        }
        return max;
    }

    // Helper for pushing nodes in stack
    private static void pushNodes(TreeNode curr, Deque<TreeNode> nodes, Deque<Integer> count, int currNodeCount) {
        if (curr != null) {
            nodes.push(curr);
            count.push(currNodeCount + 1);
        }
    }
    

    /* Recursive Solution
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
     */
}
