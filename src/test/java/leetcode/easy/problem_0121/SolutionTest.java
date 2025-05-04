package leetcode.easy.problem_0121;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testExample1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expected = 5;
        assertEquals(expected, solution.maxProfit(prices));
    }

    @Test
    public void testExample2() {
        int[] prices = {7, 6, 4, 3, 1};
        int expected = 0;
        assertEquals(expected, solution.maxProfit(prices));
    }

    @Test
    public void testSingleDay() {
        int[] prices = {5};
        int expected = 0;
        assertEquals(expected, solution.maxProfit(prices));
    }

    @Test
    public void testTwoDaysProfit() {
        int[] prices = {1, 2};
        int expected = 1;
        assertEquals(expected, solution.maxProfit(prices));
    }

    @Test
    public void testPeakBeforeDip() {
        int[] prices = {5, 10, 1, 3, 8};
        int expected = 7;
        assertEquals(expected, solution.maxProfit(prices));
    }
}
