/**
 *  2829. Determine the Minimum Sum of a k-avoiding Array
 *
 *  You are given two integers, n and k.
 *
 *  An array of distinct positive integers is called a k-avoiding array
 *  if there does not exist any pair of distinct elements that sum to k.
 *
 *  Return the minimum possible sum of a k-avoiding array of length n.
 *
 */

import java.util.HashSet;
import java.util.Set;

public class Problem2829 {

    public int minimumSum(int n, int k) {
        Set<Integer> disableNum = new HashSet<>();
        int sum = 0, a = 1;

        for (int i=0; i<n; i++) {
            while (disableNum.contains(a)) a += 1;
            disableNum.add(k - a);
            sum += a++;
        }
        return sum;
    }

    public int minimumSum2(int n, int k) {
        int a = k/2, sum = 0;

        if (a > n) {
            for (int i=0; i<n; i++) sum += i+1;
        } else {
            for (int i=0; i<a; i++) sum += i+1;
            for (int i=a; i<n; i++) sum += k++;
        }
        return sum;
    }
}
