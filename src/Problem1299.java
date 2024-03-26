/**
 *  1299. Replace Elements with Greatest Element on Right Side
 *
 *  Given an array arr, replace every element in that array with the
 *  greatest element among the elements to its right, and replace the
 *  last element with -1.
 *
 *  After doing so, return the array.
 *
 */

public class Problem1299 {

    public int[] replaceElements(int[] arr) {

        int prev_max = arr[arr.length-1];
        int curr = -1;

        arr[arr.length-1] = curr;

        for (int i=arr.length-2; i>=0; i--) {
            curr = arr[i];
            arr[i] = prev_max;
            prev_max = Math.max(curr, prev_max);
        }

        return arr;
    }
}
