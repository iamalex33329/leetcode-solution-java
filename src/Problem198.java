/**
 *  198. House Robber
 *
 *  You are a professional robber planning to rob houses along
 *  a street. Each house has a certain amount of money stashed,
 *  the only constraint stopping you from robbing each of them
 *  is that adjacent houses have security systems connected and
 *  it will automatically contact the police if two adjacent
 *  houses were broken into on the same night.
 *
 *  Given an integer array nums representing the amount of money
 *  of each house, return the maximum amount of money you can rob
 *  tonight without alerting the police.
 *
 */

public class Problem198 {

    public int rob(int[] nums) {

        int rob = 0;
        int norob = 0;

        for (int num : nums) {
            int newRob = norob + num;               // 這輪搶 + 前一間不搶
            int newNoRob = Math.max(norob, rob);    // 這輪不搶 = max(前一輪有搶, 前一輪沒搶)
            rob = newRob;                           // 更新這輪搶的分數
            norob = newNoRob;                       // 更新這輪不搶的分數
        }
        return Math.max(rob, norob);
    }
}
