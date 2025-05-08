package leetcode.easy.problem_0141;

/**
 * Problem 0141: Linked List Cycle
 * <a href="https://leetcode.com/problems/linked-list-cycle/">...</a>
 * Given the head of a linked list, determine if it contains a cycle.
 * Use constant memory if possible.
 */

public class Solution {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            head = head.next;
            fast = fast.next.next;
            if(head == fast) return true;
        }
        return false;
    }
}
