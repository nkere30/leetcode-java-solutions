package leetcode.easy.problem_0094;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testExample1() {
        Solution.TreeNode root = new Solution.TreeNode(1, null, new Solution.TreeNode(2, new Solution.TreeNode(3), null));
        List<Integer> expected = Arrays.asList(1, 3, 2);
        assertEquals(expected, solution.inorderTraversal(root));
    }

    @Test
    public void testSingleElement() {
        Solution.TreeNode root = new Solution.TreeNode(1);
        List<Integer> expected = Collections.singletonList(1);
        assertEquals(expected, solution.inorderTraversal(root));
    }

    @Test
    public void testEmptyTree() {
        Solution.TreeNode root = null;
        List<Integer> expected = Collections.emptyList();
        assertEquals(expected, solution.inorderTraversal(root));
    }

    @Test
    public void testLeftSkewedTree() {
        Solution.TreeNode root = new Solution.TreeNode(3, new Solution.TreeNode(2, new Solution.TreeNode(1), null), null);
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, solution.inorderTraversal(root));
    }

    @Test
    public void testRightSkewedTree() {
        Solution.TreeNode root = new Solution.TreeNode(1, null, new Solution.TreeNode(2, null, new Solution.TreeNode(3)));
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, solution.inorderTraversal(root));
    }

    @Test
    public void testFullBinaryTree() {
        Solution.TreeNode root = new Solution.TreeNode(2, new Solution.TreeNode(1), new Solution.TreeNode(3));
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, solution.inorderTraversal(root));
    }
}
