/**
 *  1929. Concatenation of Array
 *
 *  Given an integer array nums of length n, you want to create an array ans of length 2n
 *  where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 *
 *  Specifically, ans is the concatenation of two nums arrays.
 *
 *  Return the array ans.
 *
 */

public class Problem1929 {

    public int[] getConcatenation(int[] nums) {
        int[] newNums = new int[nums.length * 2];

        for (int i=0; i<nums.length; i++) {
            newNums[i] = nums[i];
            newNums[i+nums.length] = nums[i];
        }

        return newNums;
    }

    public int[] getConcatenation1(int[] nums) {
        int[] newNums = new int[nums.length * 2];

        System.arraycopy(nums, 0, newNums, 0, nums.length);
        System.arraycopy(nums, nums.length, newNums, 0, nums.length);

        return newNums;
    }
}
