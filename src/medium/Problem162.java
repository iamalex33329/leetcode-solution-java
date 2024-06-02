package medium;

public class Problem162 {

    public int findPeakElement(int[] nums) {

        if (nums.length == 1) return 0;

        if (nums[0] > nums[1]) return 0;
        if (nums[nums.length-1] > nums[nums.length-2]) return nums.length-1;

        for (int i=1; i<nums.length-1; i++) {
            if (nums[i] > nums[i-1] && nums[i] > nums[i+1]) { return i; }
        }
        return 0;
    }

    public int findPeakElement1(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (right + left) / 2;

            if (nums[mid] > nums[mid + 1]) { right = mid; }
            else { left = mid + 1; }
        }
        return left;
    }
}
