/**
 *  26. Remove Duplicates from Sorted Array
 *
 *  Given an integer array nums sorted in non-decreasing order,
 *  remove the duplicates in-place such that each unique element
 *  appears only once. The relative order of the elements should
 *  be kept the same. Then return the number of unique elements
 *  in nums.
 *
 *  Consider the number of unique elements of nums to be k, to get
 *  accepted, you need to do the following things:
 *
 */

public class Problem26 {

    public int removeDuplicates(int[] nums) {

        int idx = 1;

        for (int i=1; i<nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[idx++] = nums[i];
            }
        }
        return idx;
    }
}
