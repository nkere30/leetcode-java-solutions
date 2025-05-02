package leetcode.easy.problem_0058;

/**
 * Problem 0058: Length of Last Word
 * <a href="https://leetcode.com/problems/length-of-last-word/">...</a>
 * Return the length of the last word in a given string consisting of words and spaces.
 * A word is defined as a maximal substring of non-space characters.
 */

public class Solution {
    public static int lengthOfLastWord(String s) {
        String trimmedStr = s.trim();
        for (int i = trimmedStr.length() - 1; i >= 0 ; i--) {
            if(trimmedStr.charAt(i) == ' ') return trimmedStr.length() - i - 1;
        }
        return trimmedStr.length();
    }

}
