package leetcode.easy.problem_0058;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testExample1() {
        String s = "Hello World";
        int result = solution.lengthOfLastWord(s);
        assertEquals(5, result);
    }

    @Test
    public void testTrailingSpaces() {
        String s = "   fly me   to   the moon  ";
        int result = solution.lengthOfLastWord(s);
        assertEquals(4, result); // "moon"
    }

    @Test
    public void testSingleWord() {
        String s = "Today";
        int result = solution.lengthOfLastWord(s);
        assertEquals(5, result);
    }

    @Test
    public void testMultipleSpacesBetweenWords() {
        String s = "a   b   ";
        int result = solution.lengthOfLastWord(s);
        assertEquals(1, result);
    }

    @Test
    public void testOnlySpaces() {
        String s = "      ";
        int result = solution.lengthOfLastWord(s);
        assertEquals(0, result);
    }

    @Test
    public void testEmptyString() {
        String s = "";
        int result = solution.lengthOfLastWord(s);
        assertEquals(0, result);
    }
}
