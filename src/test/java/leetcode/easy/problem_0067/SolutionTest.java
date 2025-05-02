package leetcode.easy.problem_0067;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testSimpleAddition() {
        String a = "11";
        String b = "1";
        String expected = "100";
        assertEquals(expected, solution.addBinary(a, b));
    }

    @Test
    public void testEqualLengthNoCarry() {
        String a = "1010";
        String b = "0101";
        String expected = "1111";
        assertEquals(expected, solution.addBinary(a, b));
    }

    @Test
    public void testAllOnesCarry() {
        String a = "1111";
        String b = "1111";
        String expected = "11110";
        assertEquals(expected, solution.addBinary(a, b));
    }

    @Test
    public void testDifferentLengths() {
        String a = "1";
        String b = "1011";
        String expected = "1100";
        assertEquals(expected, solution.addBinary(a, b));
    }

    @Test
    public void testZeroAddition() {
        String a = "0";
        String b = "0";
        String expected = "0";
        assertEquals(expected, solution.addBinary(a, b));
    }

    @Test
    public void testOneZero() {
        String a = "0";
        String b = "101";
        String expected = "101";
        assertEquals(expected, solution.addBinary(a, b));
    }
}
