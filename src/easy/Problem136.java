package easy;

public class Problem136 {

    public int singleNumber(int[] nums) {
        int result = nums[0];

        for (int i=1; i<nums.length; i++) {
            result ^= nums[i];
        }

        return result;
    }
}
