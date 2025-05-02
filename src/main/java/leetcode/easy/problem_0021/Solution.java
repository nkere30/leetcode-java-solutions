package leetcode.easy.problem_0021;

/**
 * Problem 0021: Merge Two Sorted Lists
 * <a href="https://leetcode.com/problems/merge-two-sorted-lists/">...</a>
 * Merge two sorted linked lists and return the head of the merged list.
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

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode curr1 = l1, curr2 = l2;
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;
        while (curr1 != null && curr2 != null) {
            if (curr1.val < curr2.val) {
                temp.next = curr1;
                curr1 = curr1.next;
            } else {
                temp.next = curr2;
                curr2 = curr2.next;
            }
            temp = temp.next;
        }
        // Attach remaining nodes
        if (curr1 != null) temp.next = curr1;
        if (curr2 != null) temp.next = curr2;
        return dummyNode.next;
    }

    public static void main(String[] args) {}
}