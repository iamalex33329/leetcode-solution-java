/**
 *  704. Binary Search
 *
 *  Given an array of integers nums which is sorted in ascending
 *  order, and an integer target, write a function to search target
 *  in nums. If target exists, then return its index. Otherwise, return -1.
 *
 */

public class Problem704 {

    public int search(int[] nums, int target) {
        int l = 0, r = nums.length-1, m;

        while (l <= r) {
            m = (l + r) / 2;
            if (nums[m] > target) {
                r = m-1;
            } else if (nums[m] < target) {
                l = m+1;
            } else {
                return m;
            }
        }
        return -1;

    }
}
