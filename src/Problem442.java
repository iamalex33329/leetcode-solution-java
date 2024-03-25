/**
 *  442. Find All Duplicates in an Array
 *
 *  Given an integer array nums of length n where all the integers
 *  of nums are in the range [1, n] and each integer appears once
 *  or twice, return an array of all the integers that appears twice.
 *
 *  You must write an algorithm that runs in O(n) time and uses only
 *  constant extra space.
 *
 */

import java.util.ArrayList;
import java.util.List;

public class Problem442 {

    public List<Integer> findDuplicates(int[] nums) {
        int[] allNums = new int[nums.length+1];
        List<Integer> list = new ArrayList<>();

        for (int i : nums) { allNums[i] += 1; }

        for (int i=1; i<allNums.length; i++) {
            if (allNums[i] > 1) { list.add(i); }
        }

        return list;
    }
}
