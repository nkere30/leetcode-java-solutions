package leetcode.easy.problem_0141;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testHasCycleTrue() {
        Solution.ListNode node1 = new Solution.ListNode(3);
        Solution.ListNode node2 = new Solution.ListNode(2);
        Solution.ListNode node3 = new Solution.ListNode(0);
        Solution.ListNode node4 = new Solution.ListNode(-4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // creates cycle

        assertTrue(solution.hasCycle(node1));
    }

    @Test
    public void testHasCycleFalse() {
        Solution.ListNode node1 = new Solution.ListNode(1);
        Solution.ListNode node2 = new Solution.ListNode(2);
        node1.next = node2;

        assertFalse(solution.hasCycle(node1));
    }

    @Test
    public void testSingleNodeNoCycle() {
        Solution.ListNode node = new Solution.ListNode(1);
        assertFalse(solution.hasCycle(node));
    }

    @Test
    public void testEmptyList() {
        assertFalse(solution.hasCycle(null));
    }
}
