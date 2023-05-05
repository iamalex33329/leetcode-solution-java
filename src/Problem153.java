/**
 *  153. Find Minimum in Rotated Sorted Array
 *
 *  Suppose an array of length n sorted in ascending
 *  order is rotated between 1 and n times. For example,
 *  the array nums = [0,1,2,4,5,6,7] might become:
 *
 *  [4,5,6,7,0,1,2] if it was rotated 4 times.
 *  [0,1,2,4,5,6,7] if it was rotated 7 times.
 *
 *  Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]]
 *  1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
 *
 *  Given the sorted rotated array nums of unique elements,
 *  return the minimum element of this array.
 *
 *  You must write an algorithm that runs in O(log n) time.
 *
 */

public class Problem153 {

    /* O(n) */
    public int findMin(int[] nums) {
        int l = 0, r = nums.length-1;

        while (l < r) {
            if (nums[l] > nums[r]) {
                r--;
            } else if (nums[l] < nums[r]) {
                break;
            }
        }
        return nums[(r + 1) % nums.length];
    }

    /* 有用到Binary Search O(log(n)) */
    public int findMin1(int[] nums) {
        int l = 0, r = nums.length-1;

        while (l < r) {
            int m = (l + r) / 2;
            if (nums[m] > nums[r]) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return nums[l];
    }
}
