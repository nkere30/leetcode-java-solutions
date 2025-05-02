package leetcode.easy.problem_0067;

/**
 * Problem 0067: Add Binary
 * <a href="https://leetcode.com/problems/add-binary/">...</a>
 * Given two binary strings, return their sum as a binary string.
 */

public class Solution {

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry == 1) {
            int result = carry;
            if(i >=0) result += a.charAt(i--) - '0';
            if(j >=0) result += b.charAt(j--) - '0';
            sb.append(result % 2);
            carry = result/2;
        }
        return sb.reverse().toString();
    }
}
