package leetcode.easy.problem_0118;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem 0118: Pascal's Triangle
 * <a href="https://leetcode.com/problems/pascals-triangle/">...</a>
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 */

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    List<Integer> prevList = result.get(i - 1);
                    list.add(prevList.get(j - 1) + prevList.get(j));
                }
            }
            result.add(list);
        }
        return result;
    }
}
