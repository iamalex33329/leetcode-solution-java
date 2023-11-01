/**
 *  941. Valid Mountain Array
 *
 *  Given an array of integers arr, return true if and only if it is a
 *  valid mountain array.
 *
 *  Recall that arr is a mountain array if and only if:
 *
 *  1. arr.length >= 3
 *  2. There exists some i with 0 < i < arr.length - 1 such that:
 *     a. arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 *     b. arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 *
 */

public class Problem941 {

    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;

        int uphill=0, downhill=0;

        // 從右邊上山需要的步數
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i] < arr[i+1]) { uphill++; }
            else { break; }
        }

        // 從左邊上山需要的步數
        for (int i=arr.length-1; i>1; i--) {
            if (arr[i] < arr[i-1]) { downhill++; }
            else { break; }
        }

        // 若符合 Mountain Array，那右邊上山+左邊上山的長度會等於arr.length-1
        return uphill + downhill == arr.length - 1 && uphill != 0 && downhill != 0;
    }
}
