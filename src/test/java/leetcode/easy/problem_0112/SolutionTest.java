package leetcode.easy.problem_0112;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testExample1() {
        Solution.TreeNode root = new Solution.TreeNode(5,
                new Solution.TreeNode(4,
                        new Solution.TreeNode(11,
                                new Solution.TreeNode(7),
                                new Solution.TreeNode(2)
                        ),
                        null),
                new Solution.TreeNode(8,
                        new Solution.TreeNode(13),
                        new Solution.TreeNode(4,
                                null,
                                new Solution.TreeNode(1))
                )
        );
        assertTrue(solution.hasPathSum(root, 22));
    }

    @Test
    public void testNoValidPath() {
        Solution.TreeNode root = new Solution.TreeNode(1,
                new Solution.TreeNode(2),
                new Solution.TreeNode(3));
        assertFalse(solution.hasPathSum(root, 5));
    }

    @Test
    public void testEmptyTree() {
        assertFalse(solution.hasPathSum(null, 0));
    }

    @Test
    public void testSingleNodeMatchingTarget() {
        Solution.TreeNode root = new Solution.TreeNode(7);
        assertTrue(solution.hasPathSum(root, 7));
    }

    @Test
    public void testSingleNodeNonMatchingTarget() {
        Solution.TreeNode root = new Solution.TreeNode(1);
        assertFalse(solution.hasPathSum(root, 2));
    }
}
