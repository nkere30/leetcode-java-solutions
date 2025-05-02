package leetcode.easy.problem_0111;

import com.sun.source.tree.Tree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Problem 0111: Minimum Depth of Binary Tree
 * <a href="https://leetcode.com/problems/minimum-depth-of-binary-tree/">...</a>
 * Given a binary tree, return its minimum depth.
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
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

    public int minDepth(TreeNode root) {
        int depth = 0;
        if(root == null) return depth;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            depth++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(node.left == null && node.right == null) return depth;
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
        }
        return depth;
    }

    /* Recursive Solution
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if(root.left == null && root.right == null) return 1;

        if(root.left == null) return right + 1;
        if(root.right == null) return left + 1;
        return Math.min(left, right) + 1;
    }
     */

}
