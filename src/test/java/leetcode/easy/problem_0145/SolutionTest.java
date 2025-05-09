package leetcode.easy.problem_0145;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testFullTree() {
        Solution.TreeNode node1 = new Solution.TreeNode(1);
        Solution.TreeNode node2 = new Solution.TreeNode(2);
        Solution.TreeNode node3 = new Solution.TreeNode(3);

        node1.left = node2;
        node1.right = node3;

        List<Integer> expected = Arrays.asList(2, 3, 1);
        assertEquals(expected, solution.postorderTraversal(node1));
    }

    @Test
    public void testSingleElement() {
        Solution.TreeNode node = new Solution.TreeNode(7);
        List<Integer> expected = Arrays.asList(7);
        assertEquals(expected, solution.postorderTraversal(node));
    }

    @Test
    public void testEmptyTree() {
        assertEquals(List.of(), solution.postorderTraversal(null));
    }

    @Test
    public void testLeftSkewed() {
        Solution.TreeNode node1 = new Solution.TreeNode(1);
        Solution.TreeNode node2 = new Solution.TreeNode(2);
        Solution.TreeNode node3 = new Solution.TreeNode(3);
        node1.left = node2;
        node2.left = node3;

        List<Integer> expected = Arrays.asList(3, 2, 1);
        assertEquals(expected, solution.postorderTraversal(node1));
    }

    @Test
    public void testRightSkewed() {
        Solution.TreeNode node1 = new Solution.TreeNode(1);
        Solution.TreeNode node2 = new Solution.TreeNode(2);
        Solution.TreeNode node3 = new Solution.TreeNode(3);
        node1.right = node2;
        node2.right = node3;

        List<Integer> expected = Arrays.asList(3, 2, 1);
        assertEquals(expected, solution.postorderTraversal(node1));
    }
}
