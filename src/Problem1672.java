/**
 *  1672. Richest Customer Wealth
 *
 *  You are given an m x n integer grid accounts where accounts[i][j] is
 *  the amount of money the ith customer has in the jth bank. Return the
 *  wealth that the richest customer has.
 *
 *  A customer's wealth is the amount of money they have in all their bank
 *  accounts. The richest customer is the customer that has the maximum
 *  wealth.
 *
 */

public class Problem1672 {

    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] acc : accounts) {
            int tmp = 0;
            for (int j : acc) { tmp += j; }
            max = Math.max(tmp, max);
        }
        return max;
    }
}
