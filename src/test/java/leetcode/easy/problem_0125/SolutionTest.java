package leetcode.easy.problem_0125;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testExample1() {
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void testExample2() {
        assertFalse(solution.isPalindrome("race a car"));
    }

    @Test
    public void testEmptyString() {
        assertTrue(solution.isPalindrome(""));
    }

    @Test
    public void testSingleCharacter() {
        assertTrue(solution.isPalindrome("z"));
    }

    @Test
    public void testNonAlphanumericOnly() {
        assertTrue(solution.isPalindrome(".,,,"));
    }

    @Test
    public void testWithMixedCaseAndNumbers() {
        assertTrue(solution.isPalindrome("1a2 2A1"));
    }
}
