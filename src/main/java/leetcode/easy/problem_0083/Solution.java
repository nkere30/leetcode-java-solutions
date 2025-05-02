package leetcode.easy.problem_0083;

import java.util.List;

/**
 * Problem 0083: Remove Duplicates from Sorted List
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-list/">...</a>
 * Given the head of a sorted linked list, remove all duplicates so that each element appears only once.
 * Return the modified list in sorted order.
 */

public class Solution {

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}
