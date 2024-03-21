/**
 *  69. Sqrt(x)
 *
 *  Given a non-negative integer x, return the square root of
 *  x rounded down to the nearest integer. The returned integer
 *  should be non-negative as well.
 *
 *  You must not use any built-in exponent function or operator.
 *
 */

public class Problem69 {

    public int mySqrt(int x) {
        if (x == 1) return 1;

        int i = 1;

        while (i <= (x/i)) { i++; }
        return i - 1;
    }
}
