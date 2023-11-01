/**
 *  1492. The kth Factor of n
 *
 *  You are given two positive integers n and k. A factor of an integer
 *  n is defined as an integer i where n % i == 0.
 *
 *  Consider a list of all factors of n sorted in ascending order, return
 *  the kth factor in this list or return -1 if n has less than k factors.
 *
 */

import java.util.ArrayList;

public class Problem1492 {

    public int kthFactor(int n, int k) {
        ArrayList<Integer> factor = new ArrayList<>();

        for (int i=1; i<=n; i++) {
            if (n%i == 0) factor.add(i);
        }
        return (k <= factor.size()) ? factor.get(k-1) : -1;
    }

    public int kthFactor2(int n, int k) {
        for (int f=1; f<=(n/2); f++) {
            if (n%f == 0 && --k == 0) return f;
        }
        return k == 1 ? n : -1;
    }
}
