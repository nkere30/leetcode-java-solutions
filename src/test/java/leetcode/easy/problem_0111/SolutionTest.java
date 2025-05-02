package leetcode.easy.problem_0111;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testExample1() {
        Solution.TreeNode root = new Solution.TreeNode(3,
                new Solution.TreeNode(9),
                new Solution.TreeNode(20,
                        new Solution.TreeNode(15),
                        new Solution.TreeNode(7))
        );
        assertEquals(2, solution.minDepth(root));
    }

    @Test
    public void testExample2() {
        Solution.TreeNode root = new Solution.TreeNode(3,
                new Solution.TreeNode(20, new Solution.TreeNode(15),
                        new Solution.TreeNode(7)),
                new Solution.TreeNode(9)
        );
        assertEquals(2, solution.minDepth(root));
    }

    @Test
    public void testOnlyLeftSubtree() {
        Solution.TreeNode root = new Solution.TreeNode(2,
                new Solution.TreeNode(3,
                        new Solution.TreeNode(4,
                                new Solution.TreeNode(5,
                                        new Solution.TreeNode(6),
                                        null),
                                null),
                        null),
                null
        );
        assertEquals(5, solution.minDepth(root));
    }

    @Test
    public void testOnlyRightSubtree() {
        Solution.TreeNode root = new Solution.TreeNode(1,
                null,
                new Solution.TreeNode(2)
        );
        assertEquals(2, solution.minDepth(root));
    }

    @Test
    public void testSingleNode() {
        Solution.TreeNode root = new Solution.TreeNode(1);
        assertEquals(1, solution.minDepth(root));
    }

    @Test
    public void testEmptyTree() {
        assertEquals(0, solution.minDepth(null));
    }
}
