/**
 *  213. House Robber II
 *
 *  You are a professional robber planning to rob houses along a street.
 *  Each house has a certain amount of money stashed. All houses at this
 *  place are arranged in a circle. That means the first house is the
 *  neighbor of the last one. Meanwhile, adjacent houses have a security
 *  system connected, and it will automatically contact the police if two
 *  adjacent houses were broken into on the same night.
 *
 *  Given an integer array nums representing the amount of money of each
 *  house, return the maximum amount of money you can rob tonight without
 *  alerting the police.
 *
 */

public class Problem213 {

    public int rob(int[] nums) {
        if (nums.length == 1) { return nums[0]; }

        int max1 = robHelper(nums, 0, nums.length - 2);  // 不看最後一間
        int max2 = robHelper(nums, 1, nums.length - 1);  // 不看第一間

        return Math.max(max1, max2);
    }

    private int robHelper(int[] nums, int start, int end) {
        int rob = 0;
        int norob = 0;

        for (int i = start; i <= end; i++) {
            int current = nums[i];
            int newRob = norob + current;
            int newNoRob = Math.max(norob, rob);
            rob = newRob;
            norob = newNoRob;
        }

        return Math.max(rob, norob);
    }
}
