/**
 *  191. Number of 1 Bits
 *
 *  Write a function that takes the binary representation
 *  of an unsigned integer and returns the number of '1'
 *  bits it has (also known as the Hamming weight).
 *
 */

public class Problem191 {

    public int hammingWeight(int n) {
        int weight = 0;

        boolean isNegative = false;
        if (n < 0) {
            n = ~n;
            isNegative = true;
        }

        while (n > 0) {
            if ((n & 1) == 1) {
                weight++;
            }
            n >>= 1;
        }

        return (isNegative) ? 32 - weight : weight;
    }

}
