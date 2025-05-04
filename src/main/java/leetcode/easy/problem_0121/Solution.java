package leetcode.easy.problem_0121;

/**
 * Problem 0121: Best Time to Buy and Sell Stock
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">...</a>
 * You are given an array prices where prices[i] is the price of a given stock on the i-th day.
 * Return the maximum profit you can achieve from one buy and one sell.
 */

public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }

    /* Nested Loop Solution - High Time Complexity
        public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                profit = prices[j] - prices[i];
                if(profit > maxProfit) maxProfit = profit;
            }

        }
        return maxProfit;
    }
     */
}
