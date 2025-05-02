package leetcode.easy.problem_0070;

/**
 * Problem 0070: Climbing Stairs
 * <a href="https://leetcode.com/problems/climbing-stairs/">...</a>
 * Given n steps, return the number of distinct ways to climb to the top,
 * where each move allows climbing either 1 or 2 steps.
 */

public class Solution {
    public int climbStairs(int n) {
        if(n == 1) return 1;
        int prev = 1;
        int curr = 1;
        for (int i = 2; i <= n; i++) {
            int temp = curr;
            curr += prev;
            prev = temp;
        }
        return curr;
    }

    /*  Solution with fibonacci:
        if(n == 0 || n == 1) return 1;
        return climbStairs(n - 1) + climbStairs(n - 2);
    */
}
