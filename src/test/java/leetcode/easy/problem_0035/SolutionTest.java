package leetcode.easy.problem_0035;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testTargetFound() {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int index = solution.searchInsert(nums, target);
        assertEquals(2, index);
    }

    @Test
    public void testTargetNotFoundInsertMiddle() {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int index = solution.searchInsert(nums, target);
        assertEquals(1, index);
    }

    @Test
    public void testTargetInsertAtEnd() {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int index = solution.searchInsert(nums, target);
        assertEquals(4, index);
    }

    @Test
    public void testTargetInsertAtStart() {
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        int index = solution.searchInsert(nums, target);
        assertEquals(0, index);
    }

    @Test
    public void testSingleElementArrayInsertBefore() {
        int[] nums = {3};
        int target = 2;
        int index = solution.searchInsert(nums, target);
        assertEquals(0, index);
    }

    @Test
    public void testSingleElementArrayInsertAfter() {
        int[] nums = {3};
        int target = 4;
        int index = solution.searchInsert(nums, target);
        assertEquals(1, index);
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int target = 3;
        int index = solution.searchInsert(nums, target);
        assertEquals(0, index); // by definition
    }
}
