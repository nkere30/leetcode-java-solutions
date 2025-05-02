package leetcode.easy.problem_0088;

/**
 * Problem 0088: Merge Sorted Array
 * <a href="https://leetcode.com/problems/merge-sorted-array/">...</a>
 * Given two sorted arrays nums1 and nums2, and their element counts m and n,
 * merge nums2 into nums1 as one sorted array in-place.
 */

public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Index = m - 1;
        int nums2Index = n - 1;
        int mergeIndex = m + n - 1;
        while (nums2Index >= 0) {
            if (nums1Index >= 0 && nums1[nums1Index] > nums2[nums2Index]) {
                nums1[mergeIndex] = nums1[nums1Index];
                nums1Index--;
            } else {
                nums1[mergeIndex] = nums2[nums2Index];
                nums2Index--;
            }
            mergeIndex--;
        }
    }

    /* Built-in Solution
    public static void mergeByBuiltInFunction(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            if (m < n) {
                nums1[0] = nums2[0];
                i = n;
            } else {
                nums1[n + i] = nums2[i];
            }
        }
        Arrays.sort(nums1);
    }
     */

}
