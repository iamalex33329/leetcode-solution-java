/**
 *  1822. Sign of the Product of an Array
 *
 *  There is a function signFunc(x) that returns:
 *
 *  -  1 if x is positive.
 *
 *  - -1 if x is negative.
 *
 *  -  0 if x is equal to 0.
 *
 *  You are given an integer array nums. Let product be the product
 *  of all values in the array nums.
 *
 */

public class Problem1822 {

    public int arraySign(int[] nums) {
        int neg = 0;

        for (int i : nums) {
            if (i == 0) return 0;
            if (i < 0) neg++;
        }

        return (neg % 2 == 0) ? 1 : -1;
    }
}
