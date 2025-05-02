package leetcode.easy.problem_0083;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testWithDuplicates() {
        Solution.ListNode input = createList(1, 1, 2);
        Solution.ListNode expected = createList(1, 2);
        assertTrue(compareLists(expected, solution.deleteDuplicates(input)));
    }

    @Test
    public void testLongDuplicates() {
        Solution.ListNode input = createList(1, 1, 2, 3, 3);
        Solution.ListNode expected = createList(1, 2, 3);
        assertTrue(compareLists(expected, solution.deleteDuplicates(input)));
    }

    @Test
    public void testNoDuplicates() {
        Solution.ListNode input = createList(1, 2, 3);
        Solution.ListNode expected = createList(1, 2, 3);
        assertTrue(compareLists(expected, solution.deleteDuplicates(input)));
    }

    @Test
    public void testAllDuplicates() {
        Solution.ListNode input = createList(4, 4, 4, 4);
        Solution.ListNode expected = createList(4);
        assertTrue(compareLists(expected, solution.deleteDuplicates(input)));
    }

    @Test
    public void testSingleNode() {
        Solution.ListNode input = createList(7);
        Solution.ListNode expected = createList(7);
        assertTrue(compareLists(expected, solution.deleteDuplicates(input)));
    }

    @Test
    public void testEmptyList() {
        assertNull(solution.deleteDuplicates(null));
    }

    // Helper methods
    private Solution.ListNode createList(int... values) {
        if (values.length == 0) return null;
        Solution.ListNode head = new Solution.ListNode(values[0]);
        Solution.ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new Solution.ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    private boolean compareLists(Solution.ListNode a, Solution.ListNode b) {
        while (a != null && b != null) {
            if (a.val != b.val) return false;
            a = a.next;
            b = b.next;
        }
        return a == null && b == null;
    }
}
