/**
 *  217. Contains Duplicate
 *
 *  Given an integer array nums, return true if any
 *  value appears at least twice in the array, and
 *  return false if every element is distinct.
 *
 */

import java.util.HashSet;

public class Problem217 {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i=0; i<nums.length; i++) {
            if (hashSet.contains(nums[i])) return true;
            hashSet.add(nums[i]);
        }
        return false;
    }
}