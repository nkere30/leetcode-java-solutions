package leetcode.easy.problem_0026;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testExample1() {
        int[] nums = {1, 1, 2};
        int k = solution.removeDuplicates(nums);
        assertEquals(2, k);
        assertArrayEquals(new int[]{1, 2}, extract(nums, k));
    }

    @Test
    public void testExample2() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k = solution.removeDuplicates(nums);
        assertEquals(5, k);
        assertArrayEquals(new int[]{0,1,2,3,4}, extract(nums, k));
    }

    @Test
    public void testSingleElement() {
        int[] nums = {1};
        int k = solution.removeDuplicates(nums);
        assertEquals(1, k);
        assertArrayEquals(new int[]{1}, extract(nums, k));
    }

    @Test
    public void testAllDuplicates() {
        int[] nums = {5,5,5,5};
        int k = solution.removeDuplicates(nums);
        assertEquals(1, k);
        assertArrayEquals(new int[]{5}, extract(nums, k));
    }

    @Test
    public void testNoDuplicates() {
        int[] nums = {1,2,3,4,5};
        int k = solution.removeDuplicates(nums);
        assertEquals(5, k);
        assertArrayEquals(new int[]{1,2,3,4,5}, extract(nums, k));
    }

    // Helper to extract first k elements
    private int[] extract(int[] nums, int k) {
        int[] result = new int[k];
        System.arraycopy(nums, 0, result, 0, k);
        return result;
    }
}
