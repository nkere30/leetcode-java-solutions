package leetcode.easy.problem_0119;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testExample0() {
        List<Integer> result = solution.getRow(0);
        assertEquals(List.of(1), result);
    }

    @Test
    public void testExample1() {
        List<Integer> result = solution.getRow(1);
        assertEquals(List.of(1, 1), result);
    }

    @Test
    public void testExample3() {
        List<Integer> result = solution.getRow(3);
        assertEquals(List.of(1, 3, 3, 1), result);
    }

    @Test
    public void testEdgeCase() {
        List<Integer> result = solution.getRow(10);
        assertEquals(List.of(1, 10, 45, 120, 210, 252, 210, 120, 45, 10, 1), result);
    }
}
