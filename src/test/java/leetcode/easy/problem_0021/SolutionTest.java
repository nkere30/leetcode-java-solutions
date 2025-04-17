package leetcode.easy.problem_0021;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Solution solution = new Solution();

    // Helper to create linked list from array
    private Solution.ListNode buildList(int... values) {
        Solution.ListNode dummy = new Solution.ListNode(0);
        Solution.ListNode current = dummy;
        for (int val : values) {
            current.next = new Solution.ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper to convert list to string for easy assert
    private String listToString(Solution.ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val).append(" ");
            head = head.next;
        }
        return sb.toString().trim();
    }

    @Test
    void testExampleCase() {
        Solution.ListNode l1 = buildList(1, 2, 4);
        Solution.ListNode l2 = buildList(1, 3, 4);
        Solution.ListNode result = solution.mergeTwoLists(l1, l2);
        assertEquals("1 1 2 3 4 4", listToString(result));
    }

    @Test
    void testEmptyLists() {
        Solution.ListNode l1 = null;
        Solution.ListNode l2 = null;
        Solution.ListNode result = solution.mergeTwoLists(l1, l2);
        assertNull(result);
    }

    @Test
    void testOneListEmpty() {
        Solution.ListNode l1 = buildList(0);
        Solution.ListNode l2 = null;
        Solution.ListNode result = solution.mergeTwoLists(l1, l2);
        assertEquals("0", listToString(result));
    }
}
