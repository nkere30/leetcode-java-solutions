package leetcode.easy.problem_0066;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testSimpleIncrement() {
        int[] digits = {1, 2, 3};
        int[] expected = {1, 2, 4};
        assertArrayEquals(expected, solution.plusOne(digits));
    }

    @Test
    public void testCarryOver() {
        int[] digits = {4, 3, 9};
        int[] expected = {4, 4, 0};
        assertArrayEquals(expected, solution.plusOne(digits));
    }

    @Test
    public void testAllNines() {
        int[] digits = {9, 9, 9};
        int[] expected = {1, 0, 0, 0};
        assertArrayEquals(expected, solution.plusOne(digits));
    }

    @Test
    public void testSingleDigitNine() {
        int[] digits = {9};
        int[] expected = {1, 0};
        assertArrayEquals(expected, solution.plusOne(digits));
    }

    @Test
    public void testSingleDigitNoCarry() {
        int[] digits = {5};
        int[] expected = {6};
        assertArrayEquals(expected, solution.plusOne(digits));
    }

    @Test
    public void testZerosAndNineAtEnd() {
        int[] digits = {0, 0, 9};
        int[] expected = {0, 1, 0};
        assertArrayEquals(expected, solution.plusOne(digits));
    }
}
