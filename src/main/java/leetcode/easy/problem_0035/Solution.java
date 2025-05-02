package leetcode.easy.problem_0035;

/**
 * Problem 0035: Search Insert Position
 * <a href="https://leetcode.com/problems/search-insert-position/">...</a>
 * Given a sorted array and a target value, return the index if found.
 * Otherwise, return the index where it would be inserted to maintain the order.
 */

public class Solution {

    public int searchInsert(int[] nums, int target) {
        int low = 0; int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] == target) return mid;
            if(nums[mid] < target ) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}
