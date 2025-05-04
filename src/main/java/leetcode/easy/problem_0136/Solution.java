package leetcode.easy.problem_0136;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Problem 0136: Single Number
 * <a href="https://leetcode.com/problems/single-number/">...</a>
 * Given an array where every element appears twice except for one, find the single one.
 * Must run in linear time and use constant extra space.
 */

public class Solution {
    public int singleNumber(int[] nums) {
        int singleNum = 0;
        for (int num : nums) {
            singleNum = singleNum ^ num;
        }
        return singleNum;
    }

    /* Solution with set - 12ms
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        set.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        return set.iterator().next();
    }
     */
}
