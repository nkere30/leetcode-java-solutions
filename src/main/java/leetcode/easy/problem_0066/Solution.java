package leetcode.easy.problem_0066;

/**
 * Problem 0066: Plus One
 * <a href="https://leetcode.com/problems/plus-one/">...</a>
 * Given an array of digits representing a non-negative integer,
 * increment the integer by one and return the resulting digits array.
 */

public class Solution {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] temp = new int[digits.length + 1];
        temp[0] = 1;
        return temp;
    }

}
