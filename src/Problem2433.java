/**
 *  2433. Find The Original Array of Prefix Xor
 *
 *  You are given an integer array pref of size n. Find and return the array
 *  arr of size n that satisfies:
 *
 *  pref[i] = arr[0] ^ arr[1] ^ ... ^ arr[i].
 *  Note that ^ denotes the bitwise-xor operation.
 *
 *  It can be proven that the answer is unique.
 *
 */

public class Problem2433 {
    public int[] findArray(int[] pref) {

        int[] results = new int[pref.length];

        results[0] = pref[0];
        for (int i=1; i<pref.length; i++) { results[i] = pref[i-1] ^ pref[i]; }

        return results;
    }
}
