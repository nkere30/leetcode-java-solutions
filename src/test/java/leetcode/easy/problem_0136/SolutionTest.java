package leetcode.easy.problem_0136;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testExample1() {
        int[] nums = {2, 2, 1};
        assertEquals(1, solution.singleNumber(nums));
    }

    @Test
    public void testExample2() {
        int[] nums = {4, 1, 2, 1, 2};
        assertEquals(4, solution.singleNumber(nums));
    }

    @Test
    public void testSingleElement() {
        int[] nums = {9};
        assertEquals(9, solution.singleNumber(nums));
    }

    @Test
    public void testNegativeNumbers() {
        int[] nums = {-1, -1, -2};
        assertEquals(-2, solution.singleNumber(nums));
    }
}
