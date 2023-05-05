/**
 *  322. Coin Change
 *
 *  You are given an integer array coins representing
 *  coins of different denominations and an integer
 *  amount representing a total amount of money.
 *
 *  Return the fewest number of coins that you need to
 *  make up that amount. If that amount of money cannot
 *  be made up by any combination of the coins, return -1.
 *
 *  You may assume that you have an infinite number of each kind of coin.
 *
 */

import java.util.Arrays;

public class Problem332 {

    /* 這是利用Greedy來解，但不一定是最佳解 */
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;

        Arrays.sort(coins);
        int result = 0;

        for (int i=coins.length-1; i>=0; i--) {
            while (amount / coins[i] > 0) {
                amount -= coins[i];
                result++;
            }
        }
        return (amount > 0) ? -1 : result;
    }

    public int coinChange1(int[] coins, int amount) {
        if (amount < 0 || coins.length == 0) { return 0; }

        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            /* 從1~amount來找到最小需幾枚硬幣 */
            for (int coin : coins) {
                if (i - coin >= 0) { dp[i] = Math.min(dp[i], 1 + dp[i - coin]); }
            }
        }
        return dp[amount] != amount + 1 ? dp[amount] : -1;
    }
}
