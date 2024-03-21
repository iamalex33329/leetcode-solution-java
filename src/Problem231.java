/**
 *  231. Power of Two
 *
 *  Given an integer n, return true if it is a power of two.
 *  Otherwise, return false.
 *
 *  An integer n is a power of two, if there exists an integer
 *  x such that n == 2x.
 *
 */

public class Problem231 {

    public boolean isPowerOfTwo(int n) {

        int count_1 = 0;
        while (n > 0) {
            if ((n & 1) == 1) { count_1++; }
            n >>= 1;
        }

        return count_1 == 1;
    }

    public boolean isPowerOfTwo1(int n) {
        return n > 0 && (n & n - 1) == 0;
    }
}
