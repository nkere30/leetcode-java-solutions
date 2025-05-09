package leetcode.easy.problem_0144;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testExampleTree() {
        Solution.TreeNode root = solution.new TreeNode(1, null, solution.new TreeNode(2, solution.new TreeNode(3), null));
        List<Integer> result = solution.preorderTraversal(root);
        assertEquals(List.of(1, 2, 3), result);
    }

    @Test
    public void testSingleNode() {
        Solution.TreeNode root = solution.new TreeNode(42);
        List<Integer> result = solution.preorderTraversal(root);
        assertEquals(List.of(42), result);
    }

    @Test
    public void testEmptyTree() {
        List<Integer> result = solution.preorderTraversal(null);
        assertEquals(List.of(), result);
    }

    @Test
    public void testLeftSkewedTree() {
        Solution.TreeNode root = solution.new TreeNode(1,
                solution.new TreeNode(2,
                        solution.new TreeNode(3), null), null);
        List<Integer> result = solution.preorderTraversal(root);
        assertEquals(List.of(1, 2, 3), result);
    }

    @Test
    public void testRightSkewedTree() {
        Solution.TreeNode root = solution.new TreeNode(1,
                null, solution.new TreeNode(2,
                null, solution.new TreeNode(3)));
        List<Integer> result = solution.preorderTraversal(root);
        assertEquals(List.of(1, 2, 3), result);
    }
}
