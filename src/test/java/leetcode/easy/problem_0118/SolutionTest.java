package leetcode.easy.problem_0118;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testOneRow() {
        List<List<Integer>> expected = List.of(List.of(1));
        assertEquals(expected, solution.generate(1));
    }

    @Test
    public void testTwoRows() {
        List<List<Integer>> expected = List.of(
                List.of(1),
                List.of(1, 1)
        );
        assertEquals(expected, solution.generate(2));
    }

    @Test
    public void testFiveRows() {
        List<List<Integer>> expected = List.of(
                List.of(1),
                List.of(1, 1),
                List.of(1, 2, 1),
                List.of(1, 3, 3, 1),
                List.of(1, 4, 6, 4, 1)
        );
        assertEquals(expected, solution.generate(5));
    }

    @Test
    public void testZeroRows() {
        List<List<Integer>> expected = List.of();
        assertEquals(expected, solution.generate(0));
    }
}
