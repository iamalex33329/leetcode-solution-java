/**
 *  322. Coin Change
 *
 *  You are given an integer array coins representing coins of
 *  different denominations and an integer amount representing
 *  a total amount of money.
 *
 *  Return the fewest number of coins that you need to make up
 *  that amount. If that amount of money cannot be made up by
 *  any combination of the coins, return -1.
 *
 *  You may assume that you have an infinite number of each kind
 *  of coin.
 *
 */

import java.util.Arrays;

public class Problem322 {

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[++amount];
        dp[0] = 0;

        Arrays.sort(coins);
        for (int i=1; i<amount; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int c : coins) {
                if (i-c < 0) break;
                if (dp[i-c] != Integer.MAX_VALUE) dp[i] = Integer.min(dp[i], 1 + dp[i-c]);
            }
        }
        return dp[--amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}
