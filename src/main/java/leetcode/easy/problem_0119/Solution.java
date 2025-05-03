package leetcode.easy.problem_0119;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem 0119: Pascal's Triangle II
 * <a href="https://leetcode.com/problems/pascals-triangle-ii/">...</a>
 * Given an integer rowIndex, return the rowIndex-th (0-indexed) row of the Pascal's triangle.
 */

public class Solution {

    // Combinatorial Formula Cn(k) = Cn(k-1) = (n - k + 1)/k, where n is rowIndex and k is i + 1 - 0ms
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        long num = 1;
        for (int i = 0; i <= rowIndex; i++) {
            result.add((int)num);
            num = num * (rowIndex - i) / (i + 1);
        }
        return result;
    }

    /* Nested Loop Solution - 1ms
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> current = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    current.add(1);
                } else {
                    current.add(result.get(j - 1) + result.get(j));
                }
            }
            result = current;
        }
        return result;
    }
     */
}
