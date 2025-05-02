package leetcode.easy.problem_0028;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void testExample1() {
        String haystack = "sadbutsad";
        String needle = "sad";
        int index = solution.strStr(haystack, needle);
        assertEquals(0, index);
    }

    @Test
    public void testExample2() {
        String haystack = "leetcode";
        String needle = "leeto";
        int index = solution.strStr(haystack, needle);
        assertEquals(-1, index);
    }

    @Test
    public void testNeedleAtMiddle() {
        String haystack = "hellojavaworld";
        String needle = "java";
        int index = solution.strStr(haystack, needle);
        assertEquals(5, index);
    }

    @Test
    public void testNeedleAtEnd() {
        String haystack = "codinginjava";
        String needle = "java";
        int index = solution.strStr(haystack, needle);
        assertEquals(8, index);
    }

    @Test
    public void testExactMatch() {
        String haystack = "abc";
        String needle = "abc";
        int index = solution.strStr(haystack, needle);
        assertEquals(0, index);
    }

    @Test
    public void testEmptyNeedle() {
        String haystack = "abc";
        String needle = "";
        int index = solution.strStr(haystack, needle);
        assertEquals(0, index); // LeetCode specifies this behavior
    }

    @Test
    public void testEmptyHaystack() {
        String haystack = "";
        String needle = "a";
        int index = solution.strStr(haystack, needle);
        assertEquals(-1, index);
    }
}
