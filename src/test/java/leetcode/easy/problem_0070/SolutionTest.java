package leetcode.easy.problem_0070;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testBaseCases() {
        assertEquals(1, solution.climbStairs(1));
        assertEquals(2, solution.climbStairs(2));
    }

    @Test
    public void testSmallInputs() {
        assertEquals(3, solution.climbStairs(3)); // 1+1+1, 1+2, 2+1
        assertEquals(5, solution.climbStairs(4));
        assertEquals(8, solution.climbStairs(5));
    }

    @Test
    public void testLargerInput() {
        assertEquals(21, solution.climbStairs(7)); // Fibonacci pattern
        assertEquals(55, solution.climbStairs(9));
    }
}
