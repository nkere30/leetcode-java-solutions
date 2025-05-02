package leetcode.easy.problem_0104;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testExampleTree() {
        Solution.TreeNode root = new Solution.TreeNode(3,
                new Solution.TreeNode(9),
                new Solution.TreeNode(20, new Solution.TreeNode(15), new Solution.TreeNode(7))
        );
        assertEquals(3, solution.maxDepth(root));
    }

    @Test
    public void testSingleElement() {
        Solution.TreeNode root = new Solution.TreeNode(1);
        assertEquals(1, solution.maxDepth(root));
    }

    @Test
    public void testEmptyTree() {
        Solution.TreeNode root = null;
        assertEquals(0, solution.maxDepth(root));
    }

    @Test
    public void testLeftSkewedTree() {
        Solution.TreeNode root = new Solution.TreeNode(1,
                new Solution.TreeNode(2,
                        new Solution.TreeNode(3,
                                new Solution.TreeNode(4),
                                null
                        ),
                        null
                ),
                null
        );
        assertEquals(4, solution.maxDepth(root));
    }

    @Test
    public void testRightSkewedTree() {
        Solution.TreeNode root = new Solution.TreeNode(1,
                null,
                new Solution.TreeNode(2,
                        null,
                        new Solution.TreeNode(3,
                                null,
                                new Solution.TreeNode(4)
                        )
                )
        );
        assertEquals(4, solution.maxDepth(root));
    }
}
