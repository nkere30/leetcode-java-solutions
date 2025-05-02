package leetcode.easy.problem_0028;

/**
 * Problem 0028: Find the Index of the First Occurrence in a String
 * <a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/">...</a>
 * Return the index of the first occurrence of a substring (needle) in a string (haystack), or -1 if it is not part of the string.
 */

public class Solution {

    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()) return -1;
        for(int i = 0; i < haystack.length(); i++) {
            if(haystack.startsWith(needle, i)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {}
}
