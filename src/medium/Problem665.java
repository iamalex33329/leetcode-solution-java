package medium;

public class Problem665 {

    public boolean checkPossibility(int[] nums) {

        int count = 0;
        for (int i=1; i<nums.length; i++) {
            if (nums[i-1] > nums[i]) {
                if (count > 0) { return false; }
                if (i-2 >= 0 && nums[i-2] > nums[i]) { nums[i] = nums[i-1]; }
                count++;
            }
        }
        return true;
    }
}
