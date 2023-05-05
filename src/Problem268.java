/**
 *  268. Missing Number
 *
 *  Given an array nums containing n distinct numbers
 *  in the range [0, n], return the only number in the
 *  range that is missing from the array.
 *
 */

public class Problem268 {

    public int missingNumber(int[] nums) {
        int result = ( 1 + nums.length ) * nums.length / 2;

        for (int i=0; i<nums.length; i++) { result -= nums[i]; }

        return result;
    }

    /* 用bit operation來做 XOR，XOR同一個數字兩次會抵銷掉，所以對陣列裡的元素
    *  XOR一次之後，再對index做一次(1~n)，最後剩下的數字就是沒被抵銷掉的 */
    public int missingNumber1(int[] nums) {
        int result = 0;

        for (int i=0; i<nums.length; i++) {
            result ^= nums[i];
            result ^= i+1;
        }
        return result;
    }
}
