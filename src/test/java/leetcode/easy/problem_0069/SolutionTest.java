package leetcode.easy.problem_0069;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testPerfectSquare() {
        assertEquals(4, solution.mySqrt(16));
        assertEquals(9, solution.mySqrt(81));
        assertEquals(10, solution.mySqrt(100));
    }

    @Test
    public void testNonPerfectSquare() {
        assertEquals(2, solution.mySqrt(8));  // √8 ≈ 2.828
        assertEquals(3, solution.mySqrt(10)); // √10 ≈ 3.16
        assertEquals(6, solution.mySqrt(39)); // √39 ≈ 6.24
    }

    @Test
    public void testSmallNumbers() {
        assertEquals(0, solution.mySqrt(0));
        assertEquals(1, solution.mySqrt(1));
        assertEquals(1, solution.mySqrt(2));
    }

    @Test
    public void testLargeNumber() {
        assertEquals(46339, solution.mySqrt(2147395599)); // close to Integer.MAX_VALUE
    }

    @Test
    public void testEdgeCaseMaxInt() {
        assertEquals(46340, solution.mySqrt(Integer.MAX_VALUE)); // √2,147,483,647 ≈ 46340.95
    }
}
