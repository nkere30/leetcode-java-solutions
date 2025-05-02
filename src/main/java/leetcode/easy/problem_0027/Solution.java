package leetcode.easy.problem_0027;

/**
 * Problem 0027: Remove Element
 * <a href="https://leetcode.com/problems/remove-element/">...</a>
 * Remove all instances of a given value in-place from an array and return the new length.
 */

public class Solution {
    public static void main(String[] args) {}

    public int removeElement(int[] nums, int val) {
        int curr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[curr] = nums[i];
                curr++;
            }
        }
        return curr;
    }
}
