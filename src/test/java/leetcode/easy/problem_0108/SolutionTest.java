package leetcode.easy.problem_0108;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class SolutionTest {

    Solution solution = new Solution();

    // Helper to check if tree is balanced
    private boolean isBalanced(Solution.TreeNode root) {
        return checkHeight(root) != -1;
    }

    private int checkHeight(Solution.TreeNode node) {
        if (node == null) return 0;
        int left = checkHeight(node.left);
        int right = checkHeight(node.right);
        if (left == -1 || right == -1 || Math.abs(left - right) > 1) return -1;
        return Math.max(left, right) + 1;
    }

    // Helper to get inorder traversal
    private List<Integer> inorder(Solution.TreeNode node) {
        List<Integer> result = new ArrayList<>();
        dfsInorder(node, result);
        return result;
    }

    private void dfsInorder(Solution.TreeNode node, List<Integer> result) {
        if (node == null) return;
        dfsInorder(node.left, result);
        result.add(node.val);
        dfsInorder(node.right, result);
    }

    // Helper to validate BST property
    private boolean isValidBST(Solution.TreeNode node, Integer min, Integer max) {
        if (node == null) return true;
        if ((min != null && node.val <= min) || (max != null && node.val >= max)) return false;
        return isValidBST(node.left, min, node.val) && isValidBST(node.right, node.val, max);
    }

    @Test
    public void testExample1() {
        int[] nums = {-10, -3, 0, 5, 9};
        Solution.TreeNode root = solution.sortedArrayToBST(nums);

        assertTrue(isBalanced(root));
        assertTrue(isValidBST(root, null, null));
        assertEquals(Arrays.stream(nums).boxed().toList(), inorder(root));
    }

    @Test
    public void testExample2() {
        int[] nums = {1, 3};
        Solution.TreeNode root = solution.sortedArrayToBST(nums);

        assertTrue(isBalanced(root));
        assertTrue(isValidBST(root, null, null));
        assertEquals(Arrays.stream(nums).boxed().toList(), inorder(root));
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        Solution.TreeNode root = solution.sortedArrayToBST(nums);
        assertNull(root);
    }

    @Test
    public void testSingleElement() {
        int[] nums = {42};
        Solution.TreeNode root = solution.sortedArrayToBST(nums);

        assertNotNull(root);
        assertEquals(42, root.val);
        assertNull(root.left);
        assertNull(root.right);
        assertEquals(List.of(42), inorder(root));
    }
}
