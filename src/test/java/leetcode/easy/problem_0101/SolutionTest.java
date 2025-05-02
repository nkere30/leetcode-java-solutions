package leetcode.easy.problem_0101;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testSymmetricTree() {
        Solution.TreeNode root = new Solution.TreeNode(1,
                new Solution.TreeNode(2, new Solution.TreeNode(3), new Solution.TreeNode(4)),
                new Solution.TreeNode(2, new Solution.TreeNode(4), new Solution.TreeNode(3))
        );
        assertTrue(solution.isSymmetric(root));
    }

    @Test
    public void testAsymmetricTree() {
        Solution.TreeNode root = new Solution.TreeNode(1,
                new Solution.TreeNode(2, null, new Solution.TreeNode(3)),
                new Solution.TreeNode(2, null, new Solution.TreeNode(3))
        );
        assertFalse(solution.isSymmetric(root));
    }

    @Test
    public void testSingleElementTree() {
        Solution.TreeNode root = new Solution.TreeNode(1);
        assertTrue(solution.isSymmetric(root));
    }

    @Test
    public void testEmptyTree() {
        Solution.TreeNode root = null;
        assertTrue(solution.isSymmetric(root));
    }

    @Test
    public void testOnlyLeftSubtree() {
        Solution.TreeNode root = new Solution.TreeNode(1,
                new Solution.TreeNode(2),
                null
        );
        assertFalse(solution.isSymmetric(root));
    }
}
