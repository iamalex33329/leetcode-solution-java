/**
 *  477. Total Hamming Distance
 *
 *  The Hamming distance between two integers is the number of positions
 *  at which the corresponding bits are different.
 *
 *  Given an integer array nums, return the sum of Hamming distances between
 *  all the pairs of the integers in nums.
 *
 */

public class Problem477 {

    public int totalHammingDistance(int[] nums) {
        int totalDist = 0;
        int n = nums.length;

        int count1, count0;

        for (int i=0; i<32; i++) {
            count1 = 0;
            for (int num : nums) { count1 += (num >> i) & 1; }

            count0 = n - count1;
            totalDist += count1 * count0;
        }

        return totalDist;
    }
}
