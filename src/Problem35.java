/**
 *  35. Search Insert Position
 *
 *  Given a sorted array of distinct integers and a target
 *  value, return the index if the target is found. If not,
 *  return the index where it would be if it were inserted
 *  in order.
 *
 *  You must write an algorithm with O(log n) runtime complexity.
 *
 */

public class Problem35 {

    public int searchInsert(int[] nums, int target) {

        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int m = (l + r) / 2;

            if (nums[m] == target) { return m; }
            else if (nums[m] > target) { r = m - 1; }
            else { l = m + 1; }
        }

        return l;
    }
}
