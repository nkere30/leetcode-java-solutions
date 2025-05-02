package leetcode.easy.problem_0100;

import com.sun.source.tree.Tree;

import java.util.Stack;

/**
 * Problem 0100: Same Tree
 * <a href="https://leetcode.com/problems/same-tree/">...</a>
 * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
 * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
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

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> pStack = new Stack<>();
        Stack<TreeNode> qStack = new Stack<>();

        pStack.push(p);
        qStack.push(q);

        while (!pStack.empty() && !qStack.empty()) {
            TreeNode pCurr = pStack.pop();
            TreeNode qCurr = qStack.pop();

            if(pCurr == null && qCurr == null) continue;
            if(pCurr == null || qCurr == null || pCurr.val != qCurr.val) return false;
            pStack.push(pCurr.left);
            qStack.push(qCurr.left);

            pStack.push(pCurr.right);
            qStack.push(qCurr.right);


        }
        return pStack.empty() && qStack.empty();
    }

    /* Recursive Method
    // Base cases
       if(p == null && q == null) return true;
       if(p == null || q == null) return false;

       // Value checking
       if(p.val != q.val) return false;

       return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
     */
}
