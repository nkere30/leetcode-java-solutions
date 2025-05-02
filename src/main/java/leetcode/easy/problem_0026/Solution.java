package leetcode.easy.problem_0026;

import java.util.*;

/**
 * Problem 0026: Remove Duplicates from Sorted Array
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">...</a>
 * Remove duplicates in-place from a sorted array and return the number of unique elements.
 */

public class Solution {

    public int removeDuplicates(int[] nums) {
        int curr = 1;
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[curr] = nums[i];
                curr++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return curr;
    }

    public static void main(String[] args) {}
}
