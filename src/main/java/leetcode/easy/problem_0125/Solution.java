package leetcode.easy.problem_0125;

/**
 * Problem 0125: Valid Palindrome
 * <a href="https://leetcode.com/problems/valid-palindrome/">...</a>
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * Ignore non-alphanumeric characters and case differences.
 */

public class Solution {
    public static boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;
        while (low < high) {
            if (!Character.isLetterOrDigit(s.charAt(low))) {
                low++;
                continue;
            } else if (!Character.isLetterOrDigit(s.charAt(high))) {
                high--;
                continue;
            } else {
                if(Character.toLowerCase(s.charAt(low)) != Character.toLowerCase(s.charAt(high))) return false;
            }
            low++;
            high--;
        }
        return true;
    }

    /* Replace Solution - O(nm) time complexity
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[\\p{Punct}\\s]+", "").toLowerCase();;
        int low = 0;
        int high = s.length() - 1;
        while (low < high) {
            if(s.charAt(low) != s.charAt(high)) return false;
            low++;
            high--;
        }
        return true;
    }
     */
}
