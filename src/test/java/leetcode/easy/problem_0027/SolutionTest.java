package leetcode.easy.problem_0027;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testExample1() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int k = solution.removeElement(nums, val);
        assertEquals(2, k);
        assertTrue(containsOnly(nums, k, new int[]{2, 2}));
    }

    @Test
    public void testExample2() {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int k = solution.removeElement(nums, val);
        assertEquals(5, k);
        assertTrue(containsOnly(nums, k, new int[]{0,1,3,0,4}));
    }

    @Test
    public void testAllValuesMatch() {
        int[] nums = {1, 1, 1};
        int val = 1;
        int k = solution.removeElement(nums, val);
        assertEquals(0, k);
    }

    @Test
    public void testNoValuesMatch() {
        int[] nums = {1, 2, 3};
        int val = 4;
        int k = solution.removeElement(nums, val);
        assertEquals(3, k);
        assertTrue(containsOnly(nums, k, new int[]{1, 2, 3}));
    }

    // Helper method to validate contents regardless of order
    private boolean containsOnly(int[] actual, int length, int[] expected) {
        int[] trimmed = new int[length];
        System.arraycopy(actual, 0, trimmed, 0, length);
        java.util.Arrays.sort(trimmed);
        java.util.Arrays.sort(expected);
        return java.util.Arrays.equals(trimmed, expected);
    }
}
