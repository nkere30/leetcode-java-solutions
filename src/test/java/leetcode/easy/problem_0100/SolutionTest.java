package leetcode.easy.problem_0100;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testIdenticalTrees() {
        Solution.TreeNode p = new Solution.TreeNode(1, new Solution.TreeNode(2), new Solution.TreeNode(3));
        Solution.TreeNode q = new Solution.TreeNode(1, new Solution.TreeNode(2), new Solution.TreeNode(3));

        assertTrue(solution.isSameTree(p, q));
    }

    @Test
    public void testDifferentStructure() {
        Solution.TreeNode p = new Solution.TreeNode(1, new Solution.TreeNode(2), null);
        Solution.TreeNode q = new Solution.TreeNode(1, null, new Solution.TreeNode(2));

        assertFalse(solution.isSameTree(p, q));
    }

    @Test
    public void testDifferentValues() {
        Solution.TreeNode p = new Solution.TreeNode(1, new Solution.TreeNode(2), new Solution.TreeNode(1));
        Solution.TreeNode q = new Solution.TreeNode(1, new Solution.TreeNode(1), new Solution.TreeNode(2));

        assertFalse(solution.isSameTree(p, q));
    }

    @Test
    public void testBothEmptyTrees() {
        Solution.TreeNode p = null;
        Solution.TreeNode q = null;

        assertTrue(solution.isSameTree(p, q));
    }

    @Test
    public void testOneEmptyTree() {
        Solution.TreeNode p = new Solution.TreeNode(0);
        Solution.TreeNode q = null;

        assertFalse(solution.isSameTree(p, q));
    }
}
