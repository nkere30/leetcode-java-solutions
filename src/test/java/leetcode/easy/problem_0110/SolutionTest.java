package leetcode.easy.problem_0110;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testBalancedTree() {
        Solution.TreeNode root = new Solution.TreeNode(3,
                new Solution.TreeNode(9),
                new Solution.TreeNode(20,
                        new Solution.TreeNode(15),
                        new Solution.TreeNode(7))
        );
        assertTrue(solution.isBalanced(root));
    }

    @Test
    public void testUnbalancedTree() {
        Solution.TreeNode root = new Solution.TreeNode(1,
                new Solution.TreeNode(2,
                        new Solution.TreeNode(3,
                                new Solution.TreeNode(4),
                                new Solution.TreeNode(4)),
                        new Solution.TreeNode(3)),
                new Solution.TreeNode(2)
        );
        assertFalse(solution.isBalanced(root));
    }

    @Test
    public void testEmptyTree() {
        assertTrue(solution.isBalanced(null));
    }

    @Test
    public void testSingleNode() {
        assertTrue(solution.isBalanced(new Solution.TreeNode(1)));
    }
}
