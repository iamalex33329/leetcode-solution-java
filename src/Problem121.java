/**
 *  121. Best Time to Buy and Sell Stock
 *
 *  You are given an array prices where prices[i]
 *  is the price of a given stock on the ith day.
 *
 *  You want to maximize your profit by choosing a
 *  single day to buy one stock and choosing a
 *  different day in the future to sell that stock.
 *
 *  Return the maximum profit you can achieve from
 *  this transaction. If you cannot achieve any profit, return 0.
 *
 */

public class Problem121 {

    public int maxProfit(int[] prices) {
        int profit=0, i=0, j=1;

        while (i < prices.length && j < prices.length) {
            int tmpProfit = prices[j] - prices[i];
            if (tmpProfit < 0) { i = j; }
            else { profit = tmpProfit > profit ? tmpProfit : profit; }
            j++;
        }
        return profit;
    }
}
