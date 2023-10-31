/**
 *  342. Power of Four
 *
 *  Given an integer n, return true if it is a power of
 *  four. Otherwise, return false.
 *
 *  An integer n is a power of four, if there exists an
 *  integer x such that n == 4x.
 *
 */

public class Problem342 {

    public boolean isPowerOfFour(int n) {
        for (int i=0; i<30; i++) {
            if (n == 1 << i) return true;
        }

        return false;
    }
}
