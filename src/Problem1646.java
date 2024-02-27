/**
 *  1646. Get Maximum in Generated Array
 *
 *  You are given an integer n. A 0-indexed integer array nums of length
 *  n + 1 is generated in the following way:
 *
 *  nums[0] = 0
 *  nums[1] = 1
 *  nums[2 * i] = nums[i] when 2 <= 2 * i <= n
 *  nums[2 * i + 1] = nums[i] + nums[i + 1] when 2 <= 2 * i + 1 <= n
 *  Return the maximum integer in the array nums.
 *
 */

public class Problem1646 {

    public int getMaximumGenerated(int n) {
        if (n < 2) return n;

        int[] dp = new int[n+1];
        dp[0] = 0; dp[1] = 1;

        for (int i=1; (2*i)+1<=n; i++){
            dp[2*i] = dp[i];
            dp[2*i + 1] = dp[i] + dp[i+1];
        }

        int max = Integer.MIN_VALUE;
        for (int i: dp) max = Math.max(i, max);

        return max;
    }
}
